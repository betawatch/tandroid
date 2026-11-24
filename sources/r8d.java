// default package

import android.content.Context;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class r8d implements aq2, cs3 {
    @Override // aq2
    public final Object K(gl2 gl2Var) {
        return new u44(gl2Var.d(ce7.class));
    }

    @Override // cs3
    public final pc0 a(Context context, String str, bs3 bs3Var) {
        pc0 pc0Var = new pc0();
        int a = bs3Var.a(context, str, true);
        pc0Var.b = a;
        if (a != 0) {
            pc0Var.c = 1;
            return pc0Var;
        }
        int b = bs3Var.b(context, str);
        pc0Var.a = b;
        if (b != 0) {
            pc0Var.c = -1;
        }
        return pc0Var;
    }
}
