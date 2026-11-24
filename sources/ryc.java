// default package

import android.content.Context;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
