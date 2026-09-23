package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
                xn xnVar = (xn) this.b;
                ch.d c10 = xnVar.J.c(ubVar, null, true);
                dh.e eVar = new dh.e(xnVar.ea);
                eVar.e = new d2.c(4);
                float dpf2 = AndroidUtilities.dpf2(0.5f);
                float dpf22 = AndroidUtilities.dpf2(0.5f);
                eVar.f = dpf2;
                eVar.h = dpf22;
                c10.o(eVar);
                c10.q(AndroidUtilities.dp(16.0f));
                ubVar.setCustomBackground(c10);
                break;
            case 4:
                ry ryVar = (ry) this.b;
                UndoView undoView = ryVar.y0[0];
                if (undoView != null && undoView.getVisibility() == 0) {
                    ryVar.y0[0].e(2, true);
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
                ry ryVar = (ry) this.b;
                UndoView undoView = ryVar.y0[0];
                if (undoView == null || undoView.getVisibility() != 0) {
                    ryVar.u1 = Math.max(0.0f, (f7 - ryVar.f4) - ryVar.i4);
                    ryVar.X4();
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
        uu0 uu0Var;
        switch (this.a) {
            case 0:
                k9 k9Var = (k9) this.b;
                i11 = k9Var.W;
                i12 = k9Var.U;
                break;
            case 1:
                return ((ad) this.b).O.getMeasuredHeight();
            case 2:
                xn xnVar = (xn) this.b;
                if (i10 == 1) {
                    return 0;
                }
                return Math.round(xnVar.S.getInputBubbleHeight() + AndroidUtilities.dp(16.0f) + xnVar.W8(org.telegram.ui.Components.s21.c) + xnVar.v.c());
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.b;
                i11 = contactsActivity.q0;
                i12 = contactsActivity.o0;
                break;
            case 4:
                ry ryVar = (ry) this.b;
                return ryVar.X2 != 0 ? AndroidUtilities.dp(60.0f) + ryVar.f4 : ryVar.n3();
            case 5:
                i12 = ((zg0) this.b).L;
                i11 = AndroidUtilities.dp(64.0f);
                break;
            case 6:
                PhotoViewer photoViewer = ((ou0) this.b).E0;
                int i13 = 0;
                if (!photoViewer.R4) {
                    ai.w5 w5Var = photoViewer.i0;
                    if (w5Var != null && w5Var.getVisibility() == 0) {
                        i13 = (int) ((photoViewer.i0.getAlpha() * photoViewer.i0.getHeight()) + 0);
                    }
                    org.telegram.ui.Components.w30 w30Var = photoViewer.l1;
                    return (w30Var == null || !w30Var.c()) ? i13 : (AndroidUtilities.isTablet() || photoViewer.e0.getMeasuredHeight() > photoViewer.e0.getMeasuredWidth()) ? (int) ((photoViewer.l1.getAlpha() * photoViewer.l1.getHeight()) + i13) : i13;
                }
                us0 us0Var = photoViewer.U1;
                if (us0Var != null) {
                    i13 = us0Var.L.l;
                    if (us0Var.getVisibility() == 0 && ((uu0Var = photoViewer.d) == null || !uu0Var.A())) {
                        i13 = org.telegram.messenger.z0.C(12.0f, photoViewer.U1.getEditTextHeight(), i13);
                    }
                }
                u5 u5Var = photoViewer.P0;
                if (u5Var == null || u5Var.getVisibility() != 0) {
                    return i13;
                }
                us0 us0Var2 = photoViewer.U1;
                return (us0Var2 == null || !us0Var2.L.c()) ? i13 + photoViewer.P0.getHeight() : i13;
            case 7:
                return ((PremiumPreviewFragment) this.b).o0.d;
            case 8:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                if (profileActivity.s5 == null) {
                    return profileActivity.l6 + profileActivity.k6;
                }
                return profileActivity.l6 + profileActivity.k6 + ((int) (((AndroidUtilities.dp(52.0f) - profileActivity.s5.getTranslationY()) - (profileActivity.t5[1].getTranslationY() * profileActivity.O.g0(9, false))) - (profileActivity.t5[0].getTranslationY() * profileActivity.O.g0(8, true))));
            default:
                wf1 wf1Var = (wf1) this.b;
                l51 l51Var = wf1Var.o0;
                if (l51Var == null || l51Var.getVisibility() != 0) {
                    return 0;
                }
                return wf1Var.o0.getMeasuredHeight();
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
                xn xnVar = (xn) this.b;
                kVar = ((org.telegram.ui.ActionBar.n2) xnVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.n2) xnVar).actionBar;
                    int measuredHeight = kVar2.getMeasuredHeight();
                    kVar3 = ((org.telegram.ui.ActionBar.n2) xnVar).actionBar;
                    i11 = kVar3.getTop() + measuredHeight;
                } else {
                    i11 = 0;
                }
                max = Math.max(currentActionBarHeight, i11);
                max2 = (int) Math.max(0.0f, xnVar.t9);
                break;
            case 3:
                return 0;
            case 4:
                ry ryVar = (ry) this.b;
                kVar4 = ((org.telegram.ui.ActionBar.n2) ryVar).actionBar;
                int i13 = 0;
                if (kVar4 != null) {
                    kVar5 = ((org.telegram.ui.ActionBar.n2) ryVar).actionBar;
                    i12 = kVar5.getMeasuredHeight();
                } else {
                    i12 = 0;
                }
                pw pwVar = ryVar.z0;
                int measuredHeight2 = i12 + ((pwVar == null || pwVar.getVisibility() != 0) ? 0 : ryVar.z0.getMeasuredHeight());
                org.telegram.ui.Components.ls lsVar = ryVar.J1;
                int height = measuredHeight2 + (lsVar != null ? lsVar.getHeight() : 0);
                ix ixVar = ryVar.E0;
                if (ixVar != null && ryVar.G0) {
                    i13 = (int) ((1.0f - ixVar.getCollapsedProgress()) * AndroidUtilities.dp(81.0f));
                }
                return AndroidUtilities.dp(48.0f) + height + i13;
            case 5:
                return 0;
            case 6:
                return org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight + ((int) (((ou0) this.b).E0.V1.getAlpha() * r4.V1.getEditTextHeight()));
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
