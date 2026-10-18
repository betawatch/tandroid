package r4;

import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public abstract class h {
    public static Handler a(Looper looper) {
        return Handler.createAsync(looper);
    }
}
