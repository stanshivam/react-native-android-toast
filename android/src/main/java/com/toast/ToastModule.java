package com.toast;
 
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import android.widget.Toast;

public class ToastModule extends ReactContextBaseJavaModule {
  
  public ToastModule(ReactApplicationContext reactContext) {
    super(reactContext);
  }
 
  @Override
  public String getName() {
    return "ToastModule";
  }
 
  @ReactMethod
  public void show(string message, int duration) {
      //send duration from js
    Toast.makeText(getReactApplicationContext(), message, Toast.LENGTH_LONG).show();
  }

}