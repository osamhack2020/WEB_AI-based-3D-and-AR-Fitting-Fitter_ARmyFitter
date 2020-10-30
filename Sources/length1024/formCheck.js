/**
 * 
 */

function checkValidate(obj) {
		if (obj.headRound.value == '') {
			alert("머리둘레를 입력하세요.");
			obj.headRound.focus();
			return false;
		} 
		if (obj.topSize.value == '') {
			alert("일반복 상의 사이즈를 입력하세요.");
			obj.topSize.focus();
			return false;
		} 
		if (obj.keyLength.value == '') {
			alert("키를 입력하세요.");
			document.userInfo.keyLength.focus();
			return false;
		} 
		if (obj.armLength.value == '') {
			alert("팔길이를 입력하세요.");
			document.userInfo.armLength.focus();
			return false;
		} 
		if (obj.bottomSize.value == '') {
			alert("하의 사이즈를 입력하세요.");
			obj.bottomSize.focus();
			return false;
		} 
		if (obj.heapRound.value == '') {
			alert("엉덩이둘레를 입력하세요.");
			obj.heapRound.focus();
			return false;
		} 
		if (obj.footLength.value == '') {
			alert("발길이를 입력하세요.");
			obj.footLength.focus();
			return false;
		}
		return true;
	}