# Custom Toast
This custom made library helps you to design custom Toasts easily with minimal lines of code.

## Prerequisites
>Step 1. Add the JitPack repository to your settings.gradel file
```
dependencyResolutionManagement {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  ```
  >Step 2. Add the dependency

```
dependencies {
	        implementation 'com.github.ANIKETH232323:Custom_Toast:Tag'
	}
  ```
  ## Use:- 

To display a Toast:-

(This is the syntax)
``````         
Toast_Custom.ImgToast(contex,"text",image,duration,background).show();
````````

### Example :- 

```
Toast_Custom.ImgToast(MainActivity.this,"Task Already Completed",R.drawable.git, 
                          Toast_Custom.LENGTH_LONG,R.color.black).show();
```
You have to create your own custom Toast message outerbody shape as a background according to your need
If you use any colour as a background it will show as a rectangular toast message

## Screenshots:-

<img src ="https://github.com/ANIKETH232323/Custom_Toast/assets/102458123/e45a7c16-a5cf-4de7-a69d-c151c41ccf7a" width ="470" >

# Contributing:-
Any contributions  are welcomed and appreciated .


