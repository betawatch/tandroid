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
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.ky;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.ma;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.na;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class n3 extends na implements ls {
    public final int P1;
    public final v9 Q1;
    public final HashSet R1;
    public final ky S1;
    public final FrameLayout T1;
    public final fi.d U1;
    public k60 V1;
    public final ri.c W1;
    public final ri.c X1;
    public l41 Y1;
    public i0.b Z1;
    public boolean a2;
    public int b2;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public n3(org.telegram.ui.ActionBar.f2 f2Var, long j3, int i7, d4 d4Var) {
        super(r3, f2Var, new ma(r4));
        Activity parentActivity = f2Var.getParentActivity();
        ma maVar = new ma();
        maVar.f = 2;
        maVar.b = 3;
        maVar.g = f2Var.getResourceProvider();
        this.R1 = new HashSet();
        this.Z1 = i0.b.e;
        Context context = getContext();
        ri.c cVar = new ri.c();
        this.W1 = cVar;
        cVar.a(k6.w0(k6.d6, this.I0));
        dh.c cVar2 = new dh.c(cVar, cVar, cVar);
        ri.c cVar3 = new ri.c();
        this.X1 = cVar3;
        int i10 = k6.a7;
        cVar3.a(k6.w0(i10, this.I0));
        dh.c cVar4 = new dh.c(cVar3, cVar3, cVar3);
        this.C1 = false;
        this.B1 = org.telegram.messenger.g0.L(12.0f);
        v0(k6.w0(i10, this.I0));
        Y0();
        this.P1 = i7;
        this.Q1 = new v9(this.a, j3, true);
        this.l1.setActionBarMenuOnItemClick(new m3(this, this.l1.q().a(1, R.drawable.ic_ab_other), j3));
        fi.d dVar = new fi.d(getContext(), this.I0, true);
        this.U1 = dVar;
        dVar.i(id.M0(2131750251, null), false, true);
        dVar.setEnabled(false);
        dVar.setStateListAnimator(null);
        dVar.f();
        FrameLayout frameLayout = new FrameLayout(context);
        this.T1 = frameLayout;
        int i11 = this.t0;
        frameLayout.setPadding(i11, 0, i11, 0);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        frameLayout2.addView(dVar, ha.c(-1.0f, -1));
        frameLayout2.setOnClickListener(new wg.z0(9, this, d4Var));
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
        ky kyVar = new ky(3, false);
        this.S1 = kyVar;
        kyVar.O = new ai.l(this, 18);
        this.k1.setPadding(org.telegram.messenger.g0.L(9.0f) + this.t0, 0, org.telegram.messenger.g0.L(9.0f) + this.t0, 0);
        this.k1.setClipToPadding(false);
        this.k1.setSelectorType(9);
        this.k1.setSelectorDrawableColor(0);
        this.k1.setLayoutManager(kyVar);
        this.k1.setOnItemClickListener(new ai.k(this, 25));
        this.k1.j(new yh.f(this, 3));
        v4.k kVar = new v4.k();
        kVar.m = false;
        kVar.C = false;
        kVar.o(xq.h);
        kVar.n(350L);
        this.k1.setItemAnimator(kVar);
        this.Y1.O(true);
        qs.f(this.a).c(this, qs.G3);
        d1();
    }

    @Override // org.telegram.ui.Components.na
    public final oj0 L0(pj0 pj0Var) {
        l41 l41Var = new l41(pj0Var, getContext(), this.a, 0, false, new p0(this, 4), this.I0);
        this.Y1 = l41Var;
        l41Var.r = false;
        return l41Var;
    }

    @Override // org.telegram.ui.Components.na
    public final CharSequence O0() {
        return id.M0(2131750250, null);
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final r0.k1 b0(r0.k1 k1Var) {
        this.Z1 = org.telegram.messenger.g0.I0(k1Var, false);
        d1();
        return r0.k1.b;
    }

    public final void d1() {
        this.k1.setPadding(org.telegram.messenger.g0.L(9.0f) + this.Z1.a + this.t0, 0, org.telegram.messenger.g0.L(9.0f) + this.Z1.c + this.t0, this.Z1.d);
        i0.b bVar = this.Z1;
        int i7 = bVar.a;
        int i10 = this.t0;
        this.T1.setPadding(i7 + i10, 0, bVar.c + i10, bVar.d);
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        l41 l41Var;
        if (i7 != qs.G3 || (l41Var = this.Y1) == null) {
            return;
        }
        l41Var.O(true);
        if (e1()) {
            this.Q1.a();
        }
    }

    @Override // org.telegram.ui.ActionBar.v2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.b2
    public final void dismiss() {
        qs.f(this.a).n(this, qs.G3);
        super.dismiss();
    }

    public final boolean e1() {
        pj0 pj0Var = this.k1;
        if (pj0Var != null && pj0Var.G) {
            for (int i7 = 0; i7 < pj0Var.getChildCount(); i7++) {
                if (pj0Var.getChildAt(i7) instanceof mz) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final void s0() {
        super.s0();
        try {
            ri.c cVar = this.W1;
            if (cVar != null) {
                cVar.a(k6.w0(k6.d6, this.I0));
            }
            ri.c cVar2 = this.X1;
            if (cVar2 != null) {
                cVar2.a(k6.w0(k6.a7, this.I0));
            }
            int w02 = k6.w0(k6.a7, this.I0);
            if (this.a2 && w02 == this.b2) {
                return;
            }
            this.a2 = true;
            this.b2 = w02;
            v0(w02);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
