package r4;

import android.content.Context;
import java.io.File;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public abstract class a {
    public static File a(Context context) {
        return context.createDeviceProtectedStorageContext().getCodeCacheDir();
    }
}
