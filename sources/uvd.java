// default package

import android.content.res.Configuration;
import android.os.Build;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class uvd {
    public static lb6 a(Configuration configuration) {
        return Build.VERSION.SDK_INT >= 24 ? new lb6(new ob6(ki0.i(configuration))) : lb6.a(configuration.locale);
    }
}
