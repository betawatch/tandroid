// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
