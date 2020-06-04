<?php
$server="localhost";	
$username="id13953776_root";
$password="xeso<Eu1tT8by=o0";
$dbname="id13953776_json";

//koneksi
$conn = new mysqli($server,$username,$password,$dbname);

//check koneksi
if($conn -> connect_error){
	die("koneksi gagal/failed ".$conn -> connect_error);
}
$sql="SELECT * FROM tabel_menu";
$result=$conn->query($sql);
$data=array();

if($result->num_rows>0){
	while($row = $result-> fetch_assoc()){
		$data[]=$row;
	}
}
	else{
		echo"data kosong";
	}
	echo json_encode($data);
	$conn -> close();
?>