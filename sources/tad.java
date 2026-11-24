// default package

import android.content.Context;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class tad implements lr2, mt3 {
    @Override // lr2
    public final Object X(sm2 sm2Var) {
        return new f64(sm2Var.d(eg7.class));
    }

    @Override // mt3
    public final pd0 a(Context context, String str, lt3 lt3Var) {
        pd0 pd0Var = new pd0();
        int a = lt3Var.a(context, str, true);
        pd0Var.b = a;
        if (a != 0) {
            pd0Var.c = 1;
            return pd0Var;
        }
        int b = lt3Var.b(context, str);
        pd0Var.a = b;
        if (b != 0) {
            pd0Var.c = -1;
        }
        return pd0Var;
    }
}
