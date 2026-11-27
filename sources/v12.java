// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class v12 extends a8c {
    static {
        a8c.h(new v12());
    }

    public static b8c i(CharSequence charSequence, String str) {
        b8c K = b8c.K(v12.class);
        K.m = str;
        K.n = charSequence;
        return K;
    }

    @Override // a8c
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        w12 w12Var = (w12) view;
        CharSequence charSequence = b8cVar.m;
        CharSequence charSequence2 = b8cVar.n;
        w12Var.b.setText(charSequence);
        w12Var.c.setText(charSequence2);
    }

    @Override // a8c
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        return new w12(context, vnbVar);
    }

    @Override // a8c
    public final boolean f() {
        return false;
    }
}
