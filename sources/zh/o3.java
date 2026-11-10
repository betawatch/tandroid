package zh;

import android.app.Activity;
import android.content.Context;
import android.widget.FrameLayout;
import bi.v9;
import c8.ha;
import c8.ka;
import hi.d4;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.id;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.jy;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.la;
import org.telegram.ui.Components.lz;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.ma;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.wq;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class o3 extends ma implements ls {
    public final int S1;
    public final v9 T1;
    public final HashSet U1;
    public final jy V1;
    public final FrameLayout W1;
    public final fi.d X1;
    public k60 Y1;
    public final ri.c Z1;
    public final ri.c a2;
    public m41 b2;
    public i0.b c2;
    public boolean d2;
    public int e2;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public o3(org.telegram.ui.ActionBar.f2 f2Var, long j3, int i7, d4 d4Var) {
        super(r3, f2Var, new la(r4));
        Activity parentActivity = f2Var.getParentActivity();
        la laVar = new la();
        laVar.f = 2;
        laVar.b = 3;
        laVar.g = f2Var.getResourceProvider();
        this.U1 = new HashSet();
        this.c2 = i0.b.e;
        Context context = getContext();
        ri.c cVar = new ri.c();
        this.Z1 = cVar;
        cVar.a(m6.w0(m6.d6, this.I0));
        dh.c cVar2 = new dh.c(cVar, cVar, cVar);
        ri.c cVar3 = new ri.c();
        this.a2 = cVar3;
        int i10 = m6.a7;
        cVar3.a(m6.w0(i10, this.I0));
        dh.c cVar4 = new dh.c(cVar3, cVar3, cVar3);
        this.F1 = false;
        this.E1 = org.telegram.messenger.g0.L(12.0f);
        v0(m6.w0(i10, this.I0));
        Y0();
        this.S1 = i7;
        this.T1 = new v9(this.a, j3, true);
        this.o1.setActionBarMenuOnItemClick(new n3(this, this.o1.s().a(1, R.drawable.ic_ab_other), j3));
        fi.d dVar = new fi.d(getContext(), this.I0, true);
        this.X1 = dVar;
        dVar.i(id.M0(2131750250, null), false, true);
        dVar.setEnabled(false);
        dVar.setStateListAnimator(null);
        dVar.f();
        FrameLayout frameLayout = new FrameLayout(context);
        this.W1 = frameLayout;
        int i11 = this.t0;
        frameLayout.setPadding(i11, 0, i11, 0);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        frameLayout2.addView(dVar, ha.c(-1.0f, -1));
        frameLayout2.setOnClickListener(new wg.a1(8, this, d4Var));
        fh.g c10 = cVar2.c(frameLayout2, null, false);
        c10.p(c8.g0.j(this.I0));
        c10.r(org.telegram.messenger.g0.L(28.0f));
        c10.q(org.telegram.messenger.g0.L(5.0f));
        frameLayout2.setBackground(c10);
        ka.b(frameLayout2, 0.02f, 1.5f);
        frameLayout.addView(frameLayout2, ha.d(-1, 64.0f, 80, 4.0f, 0.0f, 4.0f, 0.0f));
        dh.d dVar2 = new dh.d(cVar4.c(frameLayout, null, false));
        dVar2.b(org.telegram.messenger.g0.L(40.0f), true);
        dVar2.G = qs.x3;
        frameLayout.setBackground(dVar2);
        this.b.addView(frameLayout, ha.e(-1, -2, 80));
        getContext();
        jy jyVar = new jy(3, false);
        this.V1 = jyVar;
        jyVar.O = new ai.l(this, 18);
        this.n1.setPadding(org.telegram.messenger.g0.L(9.0f) + this.t0, 0, org.telegram.messenger.g0.L(9.0f) + this.t0, 0);
        this.n1.setClipToPadding(false);
        this.n1.setSelectorType(9);
        this.n1.setSelectorDrawableColor(0);
        this.n1.setLayoutManager(jyVar);
        this.n1.setOnItemClickListener(new ai.k(this, 25));
        this.n1.j(new yh.f(this, 3));
        v4.k kVar = new v4.k();
        kVar.m = false;
        kVar.C = false;
        kVar.o(wq.h);
        kVar.n(350L);
        this.n1.setItemAnimator(kVar);
        this.b2.O(true);
        qs.f(this.a).c(this, qs.G3);
        d1();
    }

    @Override // org.telegram.ui.Components.ma
    public final oj0 L0(pj0 pj0Var) {
        m41 m41Var = new m41(pj0Var, getContext(), this.a, 0, false, new p0(this, 4), this.I0);
        this.b2 = m41Var;
        m41Var.r = false;
        return m41Var;
    }

    @Override // org.telegram.ui.Components.ma
    public final CharSequence O0() {
        return id.M0(2131750249, null);
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final r0.k1 b0(r0.k1 k1Var) {
        this.c2 = org.telegram.messenger.g0.I0(k1Var, false);
        d1();
        return r0.k1.b;
    }

    public final void d1() {
        this.n1.setPadding(org.telegram.messenger.g0.L(9.0f) + this.c2.a + this.t0, 0, org.telegram.messenger.g0.L(9.0f) + this.c2.c + this.t0, this.c2.d);
        i0.b bVar = this.c2;
        int i7 = bVar.a;
        int i10 = this.t0;
        this.W1.setPadding(i7 + i10, 0, bVar.c + i10, bVar.d);
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        m41 m41Var;
        if (i7 != qs.G3 || (m41Var = this.b2) == null) {
            return;
        }
        m41Var.O(true);
        if (e1()) {
            this.T1.a();
        }
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.b2
    public final void dismiss() {
        qs.f(this.a).n(this, qs.G3);
        super.dismiss();
    }

    public final boolean e1() {
        pj0 pj0Var = this.n1;
        if (pj0Var != null && pj0Var.G) {
            for (int i7 = 0; i7 < pj0Var.getChildCount(); i7++) {
                if (pj0Var.getChildAt(i7) instanceof lz) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void s0() {
        super.s0();
        try {
            ri.c cVar = this.Z1;
            if (cVar != null) {
                cVar.a(m6.w0(m6.d6, this.I0));
            }
            ri.c cVar2 = this.a2;
            if (cVar2 != null) {
                cVar2.a(m6.w0(m6.a7, this.I0));
            }
            int w02 = m6.w0(m6.a7, this.I0);
            if (this.d2 && w02 == this.e2) {
                return;
            }
            this.d2 = true;
            this.e2 = w02;
            v0(w02);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
