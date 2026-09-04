package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class z8 implements org.telegram.ui.Components.ob {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z8(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.ob
    public final boolean a() {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Components.ob
    public final void b(org.telegram.ui.Components.qc qcVar) {
        switch (this.a) {
            case 2:
                org.telegram.ui.Components.ub ubVar = qcVar.e;
                co coVar = (co) this.b;
                dh.d c10 = coVar.J.c(ubVar, null, true);
                eh.e eVar = new eh.e(coVar.ea);
                eVar.e = new di.w9(5);
                float dpf2 = AndroidUtilities.dpf2(0.5f);
                float dpf22 = AndroidUtilities.dpf2(0.5f);
                eVar.f = dpf2;
                eVar.h = dpf22;
                c10.n(eVar);
                c10.p(AndroidUtilities.dp(16.0f));
                ubVar.setCustomBackground(c10);
                break;
            case 4:
                uy uyVar = (uy) this.b;
                UndoView undoView = uyVar.y0[0];
                if (undoView != null && undoView.getVisibility() == 0) {
                    uyVar.y0[0].e(2, true);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.ob
    public final void c(float f7) {
        switch (this.a) {
            case 0:
                k9 k9Var = (k9) this.b;
                k9Var.V = Math.max(0.0f, (f7 - k9Var.W) - k9Var.U);
                k9Var.g0();
                break;
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.b;
                contactsActivity.p0 = Math.max(0.0f, (f7 - contactsActivity.q0) - contactsActivity.o0);
                contactsActivity.i0();
                break;
            case 4:
                uy uyVar = (uy) this.b;
                UndoView undoView = uyVar.y0[0];
                if (undoView == null || undoView.getVisibility() != 0) {
                    uyVar.u1 = Math.max(0.0f, (f7 - uyVar.g4) - uyVar.j4);
                    uyVar.X4();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.ob
    public final /* synthetic */ void d(org.telegram.ui.Components.qc qcVar) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.ob
    public final boolean e() {
        switch (this.a) {
            case 8:
                if (((ProfileActivity) this.b).s5 == null) {
                }
                break;
        }
        return true;
    }

    @Override // org.telegram.ui.Components.ob
    public final int f(int i10) {
        int i11;
        int i12;
        av0 av0Var;
        switch (this.a) {
            case 0:
                k9 k9Var = (k9) this.b;
                i11 = k9Var.W;
                i12 = k9Var.U;
                break;
            case 1:
                return ((bd) this.b).O.getMeasuredHeight();
            case 2:
                co coVar = (co) this.b;
                if (i10 == 1) {
                    return 0;
                }
                return Math.round(coVar.S.getInputBubbleHeight() + AndroidUtilities.dp(16.0f) + coVar.W8(org.telegram.ui.Components.s21.c) + coVar.v.c());
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.b;
                i11 = contactsActivity.q0;
                i12 = contactsActivity.o0;
                break;
            case 4:
                uy uyVar = (uy) this.b;
                return uyVar.X2 != 0 ? AndroidUtilities.dp(60.0f) + uyVar.g4 : uyVar.n3();
            case 5:
                i12 = ((eh0) this.b).L;
                i11 = AndroidUtilities.dp(64.0f);
                break;
            case 6:
                PhotoViewer photoViewer = ((uu0) this.b).E0;
                int i13 = 0;
                if (!photoViewer.R4) {
                    bi.g5 g5Var = photoViewer.i0;
                    if (g5Var != null && g5Var.getVisibility() == 0) {
                        i13 = (int) ((photoViewer.i0.getAlpha() * photoViewer.i0.getHeight()) + 0);
                    }
                    org.telegram.ui.Components.v30 v30Var = photoViewer.l1;
                    return (v30Var == null || !v30Var.c()) ? i13 : (AndroidUtilities.isTablet() || photoViewer.e0.getMeasuredHeight() > photoViewer.e0.getMeasuredWidth()) ? (int) ((photoViewer.l1.getAlpha() * photoViewer.l1.getHeight()) + i13) : i13;
                }
                at0 at0Var = photoViewer.U1;
                if (at0Var != null) {
                    i13 = at0Var.L.l;
                    if (at0Var.getVisibility() == 0 && ((av0Var = photoViewer.d) == null || !av0Var.A())) {
                        i13 = org.telegram.messenger.w1.C(12.0f, photoViewer.U1.getEditTextHeight(), i13);
                    }
                }
                t5 t5Var = photoViewer.P0;
                if (t5Var == null || t5Var.getVisibility() != 0) {
                    return i13;
                }
                at0 at0Var2 = photoViewer.U1;
                return (at0Var2 == null || !at0Var2.L.c()) ? i13 + photoViewer.P0.getHeight() : i13;
            case 7:
                return ((PremiumPreviewFragment) this.b).o0.d;
            case 8:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                if (profileActivity.s5 == null) {
                    return profileActivity.l6 + profileActivity.k6;
                }
                return profileActivity.l6 + profileActivity.k6 + ((int) (((AndroidUtilities.dp(52.0f) - profileActivity.s5.getTranslationY()) - (profileActivity.t5[1].getTranslationY() * profileActivity.O.g0(9, false))) - (profileActivity.t5[0].getTranslationY() * profileActivity.O.g0(8, true))));
            default:
                eg1 eg1Var = (eg1) this.b;
                v51 v51Var = eg1Var.o0;
                if (v51Var == null || v51Var.getVisibility() != 0) {
                    return 0;
                }
                return eg1Var.o0.getMeasuredHeight();
        }
        return i11 + i12;
    }

    @Override // org.telegram.ui.Components.ob
    public final /* synthetic */ boolean g(int i10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Components.ob
    public final int h(int i10) {
        org.telegram.ui.ActionBar.k kVar;
        int i11;
        int max;
        int max2;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        int i12;
        org.telegram.ui.ActionBar.k kVar5;
        switch (this.a) {
            case 0:
                return 0;
            case 1:
                return 0;
            case 2:
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
                co coVar = (co) this.b;
                kVar = ((org.telegram.ui.ActionBar.n2) coVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.n2) coVar).actionBar;
                    int measuredHeight = kVar2.getMeasuredHeight();
                    kVar3 = ((org.telegram.ui.ActionBar.n2) coVar).actionBar;
                    i11 = kVar3.getTop() + measuredHeight;
                } else {
                    i11 = 0;
                }
                max = Math.max(currentActionBarHeight, i11);
                max2 = (int) Math.max(0.0f, coVar.t9);
                break;
            case 3:
                return 0;
            case 4:
                uy uyVar = (uy) this.b;
                kVar4 = ((org.telegram.ui.ActionBar.n2) uyVar).actionBar;
                int i13 = 0;
                if (kVar4 != null) {
                    kVar5 = ((org.telegram.ui.ActionBar.n2) uyVar).actionBar;
                    i12 = kVar5.getMeasuredHeight();
                } else {
                    i12 = 0;
                }
                sw swVar = uyVar.z0;
                int measuredHeight2 = i12 + ((swVar == null || swVar.getVisibility() != 0) ? 0 : uyVar.z0.getMeasuredHeight());
                org.telegram.ui.Components.js jsVar = uyVar.J1;
                int height = measuredHeight2 + (jsVar != null ? jsVar.getHeight() : 0);
                lx lxVar = uyVar.E0;
                if (lxVar != null && uyVar.G0) {
                    i13 = (int) ((1.0f - lxVar.getCollapsedProgress()) * AndroidUtilities.dp(81.0f));
                }
                return AndroidUtilities.dp(48.0f) + height + i13;
            case 5:
                return 0;
            case 6:
                return org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight + ((int) (((uu0) this.b).E0.V1.getAlpha() * r4.V1.getEditTextHeight()));
            case 7:
                return 0;
            case 8:
                max2 = AndroidUtilities.statusBarHeight;
                max = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                break;
            default:
                return 0;
        }
        return max + max2;
    }

    private final /* synthetic */ void A(org.telegram.ui.Components.qc qcVar) {
    }

    private final /* synthetic */ void B(org.telegram.ui.Components.qc qcVar) {
    }

    private final /* synthetic */ void C(org.telegram.ui.Components.qc qcVar) {
    }

    private final /* synthetic */ void D(org.telegram.ui.Components.qc qcVar) {
    }

    private final /* synthetic */ void E(org.telegram.ui.Components.qc qcVar) {
    }

    private final /* synthetic */ void F(org.telegram.ui.Components.qc qcVar) {
    }

    private final /* synthetic */ void G(org.telegram.ui.Components.qc qcVar) {
    }

    private final /* synthetic */ void i(float f7) {
    }

    private final /* synthetic */ void j(float f7) {
    }

    private final /* synthetic */ void k(float f7) {
    }

    private final /* synthetic */ void l(float f7) {
    }

    private final /* synthetic */ void m(float f7) {
    }

    private final /* synthetic */ void n(float f7) {
    }

    private final /* synthetic */ void o(float f7) {
    }

    private final /* synthetic */ void p(org.telegram.ui.Components.qc qcVar) {
    }

    private final /* synthetic */ void q(org.telegram.ui.Components.qc qcVar) {
    }

    private final /* synthetic */ void r(org.telegram.ui.Components.qc qcVar) {
    }

    private final /* synthetic */ void s(org.telegram.ui.Components.qc qcVar) {
    }

    private final /* synthetic */ void t(org.telegram.ui.Components.qc qcVar) {
    }

    private final /* synthetic */ void u(org.telegram.ui.Components.qc qcVar) {
    }

    private final /* synthetic */ void v(org.telegram.ui.Components.qc qcVar) {
    }

    private final /* synthetic */ void w(org.telegram.ui.Components.qc qcVar) {
    }

    private final /* synthetic */ void x(org.telegram.ui.Components.qc qcVar) {
    }

    private final /* synthetic */ void y(org.telegram.ui.Components.qc qcVar) {
    }

    private final /* synthetic */ void z(org.telegram.ui.Components.qc qcVar) {
    }
}
