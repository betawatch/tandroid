// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class y74 extends b6c {
    static {
        b6c.h(new y74());
    }

    public static c6c i(String str, CharSequence charSequence, int i) {
        c6c K = c6c.K(y74.class);
        K.b = false;
        K.A = i;
        K.m = str;
        K.n = charSequence;
        return K;
    }

    @Override // b6c
    public final void b(View view, c6c c6cVar, boolean z, l7c l7cVar, q7c q7cVar) {
        ((z74) view).a(c6cVar.A, c6cVar.m, c6cVar.n);
    }

    @Override // b6c
    public final View d(Context context, r59 r59Var, int i, ylb ylbVar) {
        return new z74(0, ylbVar, context);
    }
}
