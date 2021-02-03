# Madlab Projects Repo.

1.Add the Below code to build.gradle-->Project file

allprojects {
    repositories {
    
        maven { url 'https://jitpack.io' }
    }
}


2.Add the below repository to build.gradle-->app file

implementation 'com.github.prasadthegreat799:Madlab:0.2.0'

3.Sync your project


Usage:

Madmodules.time_picker(textView,button,timePicker);

Madmodules.date_picker(textView,button,datePicker);

Madmodules.url_intent(this,Url,Button);

Madmodules.explict_intent(this,Class,Button);
