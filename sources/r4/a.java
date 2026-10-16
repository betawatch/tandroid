package r4;

import android.content.Context;
import java.io.File;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public abstract class a {
    public static File a(Context context) {
        return context.createDeviceProtectedStorageContext().getCodeCacheDir();
    }
}
