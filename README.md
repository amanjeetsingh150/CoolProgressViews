# CoolProgressViews
Android library with collection of cool progress views.
<br><br>
[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-CoolProgressViews-brightgreen.svg?style=flat)](https://android-arsenal.com/details/1/5397)
<br><br>Also Mention in: <a href="https://android.libhunt.com/project/coolprogressviews">Android Library Hunt</a>
#DEMO
<img src="https://cloud.githubusercontent.com/assets/12881364/23580783/04e3ba40-012e-11e7-9580-f65891f222aa.gif"><br><br>

#DOWNLOAD
<p>Add this to your root <code>build.gradle</code> file</p>

<pre><code>allprojects {
        repositories {
            ...
            maven { url "https://jitpack.io" }
        }
    }
</code></pre>

<p>Add this to your app module's <code>build.gradle</code> file</p>

<pre><code>dependencies {
            compile 'com.github.amanjeetsingh150:CoolProgressViews:1.0'
    }
</code></pre>
<br><br>
According to above DEMO:-
<br><p><strong>Row 1</strong></p>
<ul>
<li><code>CircleWithArcProgress</code></li>
<li><code>SimpleArcProgress</code></li>
</ul>
<br><p><strong>Row 2</strong></p>
<ul>
<li><code>ColorfulProgress</code></li>
<li><code>StaticCircleProgress</code></li>
</ul>
<br><p><strong>Row 3</strong></p>
<ul>
<li><code>DoubleArcProgress</code></li>
</ul>
<br><br>
#USAGE
<p>In your Layout XML add this (all the app:.... attributes are optional and have default values
<p><b>For CircleWithArcProgress</b></p>
<pre><code>    &lt;com.developers.coolprogressviews.CircleWithArcProgress
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        app:radius1="30dp"
        app:circleColor="@android:color/holo_red_dark"
        app:arcColor="@android:color/holo_red_dark"
        /&gt;
</code></pre>
<table>
<tr>
<th>Property</th>
<th>Description</th>
<th>Format</th>
<th>Default</th>
</tr>
<tr>
<td>radius1</td>
<td>Length of the radius of the progress</td>
<td>dimension</td>
<td>50dp</td>
</tr>
<tr>
<td>circleColor</td>
<td>Color of the circle in which arc is moving.</td>
<td>color</td>
<td>#b0dbdb</td>
</tr>
<tr>
<td>arcColor</td>
<td>Color of the moving arc.</td>
<td>color</td>
<td>#097669</td>
</tr>
</table>
<br><br>

<p><b>For SimpleArcProgress</b></p>
<pre><code>    &lt;com.developers.coolprogressviews.SimpleArcProgress
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        app:arcRadius="30dp"
        app:colorofArc="@android:color/holo_red_dark"
        /&gt;
</code></pre>
<table>
<tr>
<th>Property</th>
<th>Description</th>
<th>Format</th>
<th>Default</th>
</tr>
<tr>
<td>arcRadius</td>
<td>Length of the radius of the arc in progress</td>
<td>dimension</td>
<td>50dp</td>
</tr>
<tr>
<td>colorofArc</td>
<td>Color of the arc in progress.</td>
<td>color</td>
<td>#009688</td>
</tr>
</table>
<br><br>

<p><b>For ColorfulProgress</b></p>
<pre><code>    &lt;com.developers.coolprogressviews.ColorfulProgress
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        app:circleColor1="@android:color/holo_red_dark"
        app:circleColor2="@android:color/holo_red_dark"
        app:circleColor3="@android:color/holo_red_dark"
        app:circleColor4="@android:color/holo_red_dark"
        /&gt;
</code></pre>
<table>
<tr>
<th>Property</th>
<th>Description</th>
<th>Format</th>
<th>Default</th>
</tr>
<tr>
<td>circleColor1</td>
<td>Color of circle 1 in progress.</td>
<td>color</td>
<td>#84c6b5</td>
</tr>
<tr>
<td>circleColor2</td>
<td>Color of circle 2 in progress.</td>
<td>color</td>
<td>#efbd63</td>
</tr>
<tr>
<td>circleColor3</td>
<td>Color of circle 3 in progress.</td>
<td>color</td>
<td>#9cd6e7</td>
</tr>
<tr>
<td>circleColor4</td>
<td>Color of circle 4 in progress.</td>
<td>color</td>
<td>#ef5a84</td>
</tr>
</table>
<br><br>


<p><b>For StaticCircleProgress</b></p>
<pre><code>    &lt;com.developers.coolprogressviews.StaticCircleProgress
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        app:innerCircleRadius="30dp"
        app:innerCircleColor="@android:color/holo_red_dark"
        app:movingArcRadius="50dp"
        app:movinArcColor="@android:color/holo_red_dark"
        /&gt;
</code></pre>
<table>
<tr>
<th>Property</th>
<th>Description</th>
<th>Format</th>
<th>Default</th>
</tr>
<tr>
<td>innerCircleRadius</td>
<td>Radius of inner circle in progress.</td>
<td>dimension</td>
<td>5dp</td>
</tr>
<tr>
<td>innerCircleColor</td>
<td>Color of inner circle in progress.</td>
<td>color</td>
<td>#009688</td>
</tr>
<tr>
<td>movingArcRadius</td>
<td>Radius of arc in progress.</td>
<td>dimension</td>
<td>50dp</td>
</tr>
<tr>
<td>movinArcColor</td>
<td>Color of moving arc in progress.</td>
<td>color</td>
<td>#009688</td>
</tr>
</table>
<br><br>


<p><b>For DoubleArcProgress</b></p>
<pre><code>    &lt;com.developers.coolprogressviews.DoubleArcProgress
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        app:insideArcRadius="50dp"
        app:outsideArcRadius="100dp"
        app:insideArcColor="@android:color/holo_red_dark"
        app:outsideArcColor="@android:color/holo_red_dark"
        /&gt;
</code></pre>
<table>
<tr>
<th>Property</th>
<th>Description</th>
<th>Format</th>
<th>Default</th>
</tr>
<tr>
<td>insideArcRadius</td>
<td>Radius of inner arc in progress.</td>
<td>dimension</td>
<td>50dp</td>
</tr>
<tr>
<td>innerArcColor</td>
<td>Color of inner circle in progress.</td>
<td>color</td>
<td>#99009688</td>
</tr>
<tr>
<td>outsideArcRadius</td>
<td>Radius of outer arc in progress.</td>
<td>dimension</td>
<td>100dp</td>
</tr>
<tr>
<td>outsideArcColor</td>
<td>Color of outside arc in progress.</td>
<td>color</td>
<td>#009688</td>
</tr>
</table>

<br><br>
#DEVELOPERS
<a href="https://github.com/amanjeetsingh150">Amanjeet Singh</a>
<br><br>
#LICENSE
<br>
<pre><code>Copyright 2017 Amanjeet Singh

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

</code></pre>
