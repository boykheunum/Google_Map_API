
function initMap(data) {
	var y = 0;
	var x = 0;
	$.each(data.myArrayList, function(i, o) {
		x = o.map.lat
		y = o.map.log;
	});

	const uluru = { lat: x, lng: y };
	// The map, centered at Uluru
	const map = new google.maps.Map(document.getElementById("map"), {
		zoom: 9,
		center: uluru,
	});
	//Create an info window to share between markers.
	const infoWindow = new google.maps.InfoWindow();
	//Create the markers.
	// Add a click list ner fr each marker, and set up the info window.
	$.each(data.myArrayList, function(i, o) {

		const marker = new google.maps.Marker({
			position: new google.maps.LatLng(o.map.lat, o.map.log),
			map: map,
			title: 'Địa chỉ:' + o.map.diachi + "\n"
				+ 'Mô Tả:' + o.map.mota + "\n"
				+ "Số điện thoại:" + o.map.sdt,
			icon: "./static/img/gas-station.png",
		});
		marker.addListener("click", () => {
			nfoWindow.close();
			infoWindow.setContent(marker.getTitle());
			infoWindow.open(marker.getMap(), marker);
		});
	})}
/*$.ajax({
	method: "GET",
	url: "./admin/getAjax",
	dataType: 'json',
	success: function(data) {
		initMap(data);
	}
})*/



