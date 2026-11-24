// default package

import android.content.res.Configuration;
import android.os.Build;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class rtd {
    public static m96 a(Configuration configuration) {
        return Build.VERSION.SDK_INT >= 24 ? new m96(new p96(kh0.i(configuration))) : m96.a(configuration.locale);
    }
}
