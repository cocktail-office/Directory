

function toggleDivVisibility(blockID,titleID) {
	
	var blockID = document.getElementById(blockID);
	var titleID = document.getElementById(titleID);
	
	if(blockID.style.display == 'block') {
		blockID.style.display = 'none';
		titleID.className= "show";
	} else {
		blockID.style.display = 'block';
		new Rico.Effect.FadeTo( blockID, 
						.2, 
						600, 
						12, // 12 steps
						{complete:function() {fadeBack(blockID);}} 
						);
							
		titleID.className= "hide";
	}		
}

function fadeBack(element) {
		new Rico.Effect.FadeTo( element, 
						1, // 20% opacity 
						600, // 500ms (1/2 second) 
						12, // 10 steps
						null );		
}


function decryptText(xtext) {
  var key = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz1029384756><#].@";
  var wTG;
  var mcH =  key.length / 2;
  var _newString = "";
  var dv;
  for (var x = 0; x < xtext.length; x++) {
    wTG = key.indexOf(xtext.charAt(x));
      if (wTG > mcH) {
        dv = wTG - mcH;
        _newString += key.charAt(33 - dv);
      } else {
      	if (key.indexOf(xtext.charAt(x)) < 0) {
          _newString += xtext.charAt(x);
        } else {
          dv = mcH - wTG;
          _newString += key.charAt(33 + dv);
        }
      }
    }
  return (_newString);
}


function checkEnter(e){ //e is event object passed from function invocation
	var characterCode // literal character code will be stored in this variable
	
	if(!e)
		return false;
	
	if(e && e.which){ //if which property of event object is supported (NN4)
		e = e
		characterCode = e.which //character code is contained in NN4's which property
	}
	else{
		e = event
		characterCode = e.keyCode //character code is contained in IE's keyCode property
	}

	if(characterCode == 13){ //if generated character code is equal to ascii 13 (if enter key)
		document.formsearch.submit() //submit the form
		return false
	}
	else{
		return true
	}
}


function submitAdvSearch(e) {
	var characterCode
	if(!e)
		return false;
	
	if(e && e.which) {
		e = e
		characterCode = e.which 
	}
	else {
		e = event
		characterCode = e.keyCode
	}

	if(characterCode == 13) {
		document.formadvsearch.submit()
		return false
	}
	else {
		return true
	}
}







