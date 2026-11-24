// default package

import android.content.res.Configuration;
import android.os.Build;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class rtd {
    public static m96 a(Configuration configuration) {
        return Build.VERSION.SDK_INT >= 24 ? new m96(new p96(kh0.i(configuration))) : m96.a(configuration.locale);
    }
}
