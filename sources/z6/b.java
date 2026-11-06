package z6;

import android.content.Context;
import androidx.biometric.t;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
