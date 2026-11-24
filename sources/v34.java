// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class v34 extends b6c {
    public static final /* synthetic */ int b = 0;

    static {
        b6c.h(new v34());
    }

    @Override // b6c
    public final void b(View view, c6c c6cVar, boolean z, l7c l7cVar, q7c q7cVar) {
        w34 w34Var = (w34) view;
        w34Var.n = (qac) c6cVar.H;
        w34Var.r = c6cVar;
        w34Var.b(c6cVar.A, false);
    }

    @Override // b6c
    public final View d(Context context, r59 r59Var, int i, ylb ylbVar) {
        return new w34(context, ylbVar);
    }
}
