package z6;

import android.content.Context;
import androidx.biometric.t;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
                    bVar.a = new t(context, 4);
                }
                tVar = bVar.a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return tVar;
    }
}
