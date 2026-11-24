// default package

import android.content.Context;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class ryc {
    public static final ryc b;
    public p13 a;

    static {
        ryc rycVar = new ryc();
        rycVar.a = null;
        b = rycVar;
    }

    public static p13 a(Context context) {
        p13 p13Var;
        ryc rycVar = b;
        synchronized (rycVar) {
            p13Var = rycVar.a;
            if (p13Var == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                p13Var = new p13(context, (char) 0);
                rycVar.a = p13Var;
            }
        }
        return p13Var;
    }
}
