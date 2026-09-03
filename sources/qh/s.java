package qh;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.el0;
import org.telegram.ui.Components.lc0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class s extends f2.p0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ c2 d;
    public final /* synthetic */ u e;

    public s(u uVar, Context context, c2 c2Var) {
        this.e = uVar;
        this.c = context;
        this.d = c2Var;
    }

    @Override // f2.p0
    public final int h() {
        return r.a().size();
    }

    @Override // f2.p0
    public final void v(f2.m1 m1Var, int i10) {
        t tVar = (t) m1Var.a;
        r rVar = (r) r.a().get(i10);
        boolean z4 = i10 == tVar.s;
        tVar.setDrawable(new lc0(rVar, false));
        tVar.b(rVar.equals(this.e.b), z4);
        tVar.s = i10;
    }

    @Override // f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        t tVar = new t(this.c);
        tVar.setLayoutParams(new f2.x0(AndroidUtilities.dp(46.0f), AndroidUtilities.dp(56.0f)));
        tVar.setBackground(org.telegram.ui.ActionBar.k6.f0(553648127, 1, -1));
        return new el0(tVar);
    }

    @Override // f2.p0
    public final void y(f2.m1 m1Var) {
        t tVar = (t) m1Var.a;
        this.d.a(tVar);
        int i10 = tVar.s;
        if (i10 < 0 || i10 >= r.a().size()) {
            return;
        }
        r rVar = (r) r.a().get(tVar.s);
        tVar.setDrawable(new lc0(rVar, false));
        tVar.b(rVar.equals(this.e.b), false);
    }

    @Override // f2.p0
    public final void z(f2.m1 m1Var) {
        this.d.d.remove((t) m1Var.a);
    }
}
