package w6;

import android.content.Context;
import androidx.biometric.s;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class b {
    public static final b b;
    public s a;

    static {
        b bVar = new b();
        bVar.a = null;
        b = bVar;
    }

    public static s a(Context context) {
        s sVar;
        b bVar = b;
        synchronized (bVar) {
            try {
                if (bVar.a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    bVar.a = new s(context, 2);
                }
                sVar = bVar.a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return sVar;
    }
}
