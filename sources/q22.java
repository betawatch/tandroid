// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class q22 extends b6c {
    static {
        b6c.h(new q22());
    }

    public static c6c i(CharSequence charSequence, String str) {
        c6c K = c6c.K(q22.class);
        K.m = str;
        K.n = charSequence;
        return K;
    }

    @Override // b6c
    public final void b(View view, c6c c6cVar, boolean z, l7c l7cVar, q7c q7cVar) {
        r22 r22Var = (r22) view;
        CharSequence charSequence = c6cVar.m;
        CharSequence charSequence2 = c6cVar.n;
        r22Var.b.setText(charSequence);
        r22Var.c.setText(charSequence2);
    }

    @Override // b6c
    public final View d(Context context, r59 r59Var, int i, ylb ylbVar) {
        return new r22(context, ylbVar);
    }

    @Override // b6c
    public final boolean f() {
        return false;
    }
}
