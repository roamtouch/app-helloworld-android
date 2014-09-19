<img src="http://www.gesturekit.com/wp-content/uploads/2014/05/colash_largo.png" alt="GestureKit Technology">

# GestureKit Hello World for Android.

> A sample application for Android developer with gestureKit technoloty. 

You can down load this application from the [PLAY STORE](https://play.google.com/store/apps/details?id=com.roamtouch.gesturekit.gesturekithelloworld).

## Usage  

Draw the h gesture or press the button. 

## Setup

### Import GestureKit jar file into the project. 

* Download the last version of GestureKit jar file from [Download Page](http://www.gesturekit.com/learn/downloads/)

* Import the jar file into your project.  

### To enable the Helper, add the dependency GestureKitHelper plugin.

Helper plugin is disabled. You should download the [GestureKitHelper](https://github.com/RoamTouch/gesturekit-helper-android) plugin.

* Import the library into your workspace.

* Edit the properties of the GKPlayer and add the imported library. 

Make sure you uncomment this line on your code to load the plugin. 

```html
this.gesturekit.setPlugin((PluginInterface) new GestureKitHelper(this, this.gesturekit));
```

## Maintained by
- Jose Vigil
[Facebook](https://www.facebook.com/jose.vigil.1973) | [Twitter](https://twitter.com/JoseVigil) | [About](http://about.me/josevigil) | [LinkedIn](https://www.linkedin.com/in/josemanuelvigil) 

## Credits

<img src="http://www.roamtouch.com/wp-content/uploads/2014/06/logo.png" width="200" alt="RoamTouch logo">

## License
Licensed under Apache v2 License.

Copyright (c) 2014 [RoamTouch](http://github.com/RoamTouch). 

