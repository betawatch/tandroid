// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class vw4 extends b6c {
    public static final /* synthetic */ int b = 0;

    static {
        b6c.h(new vw4());
    }

    @Override // b6c
    public final void b(View view, c6c c6cVar, boolean z, l7c l7cVar, q7c q7cVar) {
        m1a m1aVar = (m1a) view;
        sn2 sn2Var = c6cVar.l;
        CharSequence charSequence = c6cVar.m;
        CharSequence charSequence2 = c6cVar.n;
        m1aVar.x.setVisibility(8);
        m1aVar.I = null;
        m1aVar.J = null;
        bf0 bf0Var = m1aVar.c;
        bf0Var.setRoundRadius(gm.L(20.0f));
        bf0Var.setImageDrawable(sn2Var);
        dg0 dg0Var = m1aVar.d;
        dg0Var.k(charSequence);
        boolean[] zArr = m1aVar.s;
        zArr[0] = false;
        m1aVar.setSubtitle(charSequence2);
        anb.W(m1aVar.e, zArr[0] ? cmb.m5 : cmb.q5, m1aVar.a);
        jh2 jh2Var = m1aVar.w;
        if (jh2Var != null) {
            jh2Var.setAlpha(1.0f);
        }
        dg0Var.i(null);
        m1aVar.setDivider(z);
    }

    @Override // b6c
    public final View d(Context context, r59 r59Var, int i, ylb ylbVar) {
        m1a m1aVar = new m1a(context, false, false, ylbVar, false);
        m1aVar.setCellBackgroundVisible(false);
        return m1aVar;
    }
}
