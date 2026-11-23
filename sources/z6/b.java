package z6;

import android.content.Context;
import androidx.biometric.t;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final class b {
    public static final b b;
    public t a;

    static {
        b bVar = new b();
        bVar.a = null;
        b = bVar;
    }

    public static t a(Context context) {
        t tVar;
        b bVar = b;
        synchronized (bVar) {
            try {
                if (bVar.a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    bVar.a = new t(context, 2);
                }
                tVar = bVar.a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return tVar;
    }
}
