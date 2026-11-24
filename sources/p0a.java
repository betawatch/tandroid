// default package

import android.app.Activity;
import android.content.Context;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class p0a extends mz0 implements jm7 {
    public final int S1;
    public final ava T1;
    public final HashSet U1;
    public final f84 V1;
    public final FrameLayout W1;
    public final b61 X1;
    public bu5 Y1;
    public final kz4 Z1;
    public final kz4 a2;
    public l7c b2;
    public iq5 c2;
    public boolean d2;
    public int e2;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public p0a(d dVar, long j, int i, h71 h71Var) {
        super(r3, dVar, new lz0(r4));
        Activity parentActivity = dVar.getParentActivity();
        lz0 lz0Var = new lz0();
        lz0Var.f = 2;
        lz0Var.b = 3;
        lz0Var.g = dVar.getResourceProvider();
        this.U1 = new HashSet();
        this.c2 = iq5.e;
        Context context = getContext();
        kz4 kz4Var = new kz4();
        this.Z1 = kz4Var;
        kz4Var.a(cmb.v0(cmb.c6, this.J0));
        km0 km0Var = new km0(kz4Var, kz4Var, kz4Var);
        kz4 kz4Var2 = new kz4();
        this.a2 = kz4Var2;
        int i2 = cmb.Z6;
        kz4Var2.a(cmb.v0(i2, this.J0));
        km0 km0Var2 = new km0(kz4Var2, kz4Var2, kz4Var2);
        this.F1 = false;
        this.E1 = gm.L(12.0f);
        s0(cmb.v0(i2, this.J0));
        T0();
        this.S1 = i;
        this.T1 = new ava(this.a, j, true);
        this.o1.setActionBarMenuOnItemClick(new o0a(this, this.o1.t().a(1, R.drawable.ic_ab_other), j));
        b61 b61Var = new b61(this.J0, getContext(), true);
        this.X1 = b61Var;
        b61Var.i(jb6.M0(2131750183, null), false, true);
        b61Var.setEnabled(false);
        b61Var.setStateListAnimator(null);
        b61Var.f();
        FrameLayout frameLayout = new FrameLayout(context);
        this.W1 = frameLayout;
        int i3 = this.u0;
        frameLayout.setPadding(i3, 0, i3, 0);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setPadding(gm.L(8.0f), gm.L(8.0f), gm.L(8.0f), gm.L(8.0f));
        frameLayout2.addView(b61Var, qoe.c(-1.0f, -1));
        frameLayout2.setOnClickListener(new r39(this, h71Var, (byte) 5));
        im0 c = km0Var.c(frameLayout2, null, false);
        c.p(qqd.j(this.J0));
        c.r(gm.L(28.0f));
        c.q(gm.L(5.0f));
        frameLayout2.setBackground(c);
        rve.b(frameLayout2, 0.02f, 1.5f);
        frameLayout.addView(frameLayout2, qoe.d(-1, 64.0f, 80, 4.0f, 0.0f, 4.0f, 0.0f));
        qm0 qm0Var = new qm0(km0Var2.c(frameLayout, null, false));
        qm0Var.b(gm.L(40.0f), true);
        qm0Var.H = nm7.w3;
        frameLayout.setBackground(qm0Var);
        this.b.addView(frameLayout, qoe.e(-1, -2, 80));
        getContext();
        f84 f84Var = new f84(3, false);
        this.V1 = f84Var;
        f84Var.O = new zr1(this, (byte) 15);
        this.n1.setPadding(gm.L(9.0f) + this.u0, 0, gm.L(9.0f) + this.u0, 0);
        this.n1.setClipToPadding(false);
        this.n1.setSelectorType(9);
        this.n1.setSelectorDrawableColor(0);
        this.n1.setLayoutManager(f84Var);
        this.n1.setOnItemClickListener(new s19(this, (byte) 6));
        this.n1.j(new so7(this, (byte) 17));
        sc3 sc3Var = new sc3();
        sc3Var.m = false;
        sc3Var.C = false;
        sc3Var.o(d53.h);
        sc3Var.n(350L);
        this.n1.setItemAnimator(sc3Var);
        this.b2.O(true);
        nm7.f(this.a).b(this, nm7.I3);
        Y0();
    }

    @Override // mz0
    public final q59 G0(r59 r59Var) {
        l7c l7cVar = new l7c(r59Var, getContext(), this.a, 0, false, new vh8(this, (byte) 18), this.J0);
        this.b2 = l7cVar;
        l7cVar.r = false;
        return l7cVar;
    }

    @Override // mz0
    public final CharSequence J0() {
        return jb6.M0(2131750182, null);
    }

    @Override // my0
    public final wzc Y(wzc wzcVar) {
        this.c2 = gm.H0(wzcVar, false);
        Y0();
        return wzc.b;
    }

    public final void Y0() {
        this.n1.setPadding(gm.L(9.0f) + this.c2.a + this.u0, 0, gm.L(9.0f) + this.c2.c + this.u0, this.c2.d);
        iq5 iq5Var = this.c2;
        int i = iq5Var.a;
        int i2 = this.u0;
        int i3 = iq5Var.c + i2;
        int i4 = iq5Var.d;
        this.W1.setPadding(i + i2, 0, i3, i4);
    }

    public final boolean Z0() {
        r59 r59Var = this.n1;
        if (r59Var != null && r59Var.H) {
            for (int i = 0; i < r59Var.getChildCount(); i++) {
                if (r59Var.getChildAt(i) instanceof tk4) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        l7c l7cVar;
        if (i != nm7.I3 || (l7cVar = this.b2) == null) {
            return;
        }
        l7cVar.O(true);
        if (Z0()) {
            this.T1.a();
        }
    }

    @Override // my0, android.app.Dialog, android.content.DialogInterface, ah0
    public final void dismiss() {
        nm7.f(this.a).n(this, nm7.I3);
        super.dismiss();
    }

    @Override // my0
    public final void p0() {
        super.p0();
        try {
            kz4 kz4Var = this.Z1;
            if (kz4Var != null) {
                kz4Var.a(cmb.v0(cmb.c6, this.J0));
            }
            kz4 kz4Var2 = this.a2;
            if (kz4Var2 != null) {
                kz4Var2.a(cmb.v0(cmb.Z6, this.J0));
            }
            int v0 = cmb.v0(cmb.Z6, this.J0);
            if (this.d2 && v0 == this.e2) {
                return;
            }
            this.d2 = true;
            this.e2 = v0;
            s0(v0);
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }
}
