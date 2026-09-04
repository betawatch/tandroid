package r4;

import android.content.Context;
import java.io.File;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public abstract class a {
    public static File a(Context context) {
        return context.createDeviceProtectedStorageContext().getCodeCacheDir();
    }
}
