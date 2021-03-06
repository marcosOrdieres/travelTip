package com.marcos.travelTip;

import android.app.Application;

import com.facebook.CallbackManager;
import com.facebook.react.ReactApplication;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.shell.MainReactPackage;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.soloader.SoLoader;
import com.horcrux.svg.SvgPackage;
import com.AlexanderZaytsev.RNI18n.RNI18nPackage;
import com.sbugert.rnadmob.RNAdMobPackage;

import java.util.Arrays;
import java.util.List;

public class MainApplication extends Application implements ReactApplication {
  private static CallbackManager mCallbackManager = CallbackManager.Factory.create();

  protected static CallbackManager getCallbackManager() {
    return mCallbackManager;
  }

  private final ReactNativeHost mReactNativeHost = new ReactNativeHost(this) {
    @Override
    public boolean getUseDeveloperSupport() {
      return BuildConfig.DEBUG;
    }

    @Override
    protected List<ReactPackage> getPackages() {
      return Arrays.<ReactPackage>asList(
          new MainReactPackage(),
          new SvgPackage(),
          new RNI18nPackage(),
          new RNAdMobPackage()
      );
    }

    @Override
    protected String getJSMainModuleName() {
      return "index";
    }
  };

  @Override
  public ReactNativeHost getReactNativeHost() {
    return mReactNativeHost;
  }

  @Override
    public void onCreate() {
    super.onCreate();
    AppEventsLogger.activateApp(this);
  }
}
