// default package

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class t53 extends vz9 {
    public final /* synthetic */ v29 f2;
    public final /* synthetic */ d g2;
    public final /* synthetic */ x53 h2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t53(x53 x53Var, d dVar, Context context, int i, boolean z, ylb ylbVar, v29 v29Var, d dVar2) {
        super(dVar, context, false, null, i, z, ylbVar, 16);
        this.h2 = x53Var;
        this.f2 = v29Var;
        this.g2 = dVar2;
    }

    @Override // vz9
    public final void l() {
        this.h2.a.invalidate();
    }

    @Override // vz9
    public final void o(View view, Long l, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        su suVar = this.h2.c;
        v29 v29Var = this.f2;
        d dVar = this.g2;
        if (dVar != null && !v29Var.B0 && v29Var.getWindowType() != 13 && !z8c.h(dVar.getCurrentAccount()).p()) {
            try {
                suVar.performHapticFeedback(3);
            } catch (Exception unused) {
            }
            new c41(suVar, null).r(document, gm.S2(jb6.M0(2131743548, null)), jb6.M0(2131746768, null), new xf2(this, (byte) 22)).j();
            return;
        }
        if (l == null && document == null) {
            return;
        }
        if (document != null) {
            vm.g(z8c.t0).e(document);
        }
        long longValue = l == null ? document.id : l.longValue();
        k39 k39Var = new k39();
        k39Var.g = longValue;
        k39Var.h = longValue;
        v29Var.i(view, k39Var, false);
        gm.t1(suVar);
    }

    @Override // vz9
    public final void p() {
        x53 x53Var = this.h2;
        if (x53Var.v) {
            return;
        }
        x53Var.v = true;
        if (!x53Var.d) {
            x53Var.b.updateViewLayout(x53Var.c, x53Var.b(true));
        }
        d dVar = this.g2;
        if (dVar instanceof yv1) {
            ((yv1) dVar).ea();
        }
        v29 v29Var = this.f2;
        if (v29Var.getDelegate() != null) {
            v29Var.getDelegate().l();
        }
    }

    @Override // vz9
    public final void q(fz9 fz9Var, k39 k39Var) {
        this.f2.i(fz9Var, k39Var, false);
        gm.t1(this.h2.c);
    }

    @Override // vz9
    public final boolean t() {
        v29 v29Var = this.f2;
        if (v29Var.getDelegate() != null) {
            return v29Var.getDelegate().l();
        }
        return false;
    }
}
