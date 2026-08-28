package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class x8 implements org.telegram.ui.Components.fb {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x8(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.fb
    public final boolean a() {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Components.fb
    public final void b(org.telegram.ui.Components.gc gcVar) {
        switch (this.a) {
            case 2:
                org.telegram.ui.Components.lb lbVar = gcVar.e;
                qn qnVar = (qn) this.b;
                kg.d c10 = qnVar.F.c(lbVar, null, true);
                lg.d dVar = new lg.d(qnVar.aa);
                dVar.e = new i3.i(25);
                float dpf2 = AndroidUtilities.dpf2(0.5f);
                float dpf22 = AndroidUtilities.dpf2(0.5f);
                dVar.f = dpf2;
                dVar.h = dpf22;
                c10.n(dVar);
                c10.p(AndroidUtilities.dp(16.0f));
                lbVar.setCustomBackground(c10);
                break;
            case 4:
                dy dyVar = (dy) this.b;
                UndoView undoView = dyVar.u0[0];
                if (undoView != null && undoView.getVisibility() == 0) {
                    dyVar.u0[0].e(2, true);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.fb
    public final void c(float f10) {
        switch (this.a) {
            case 0:
                i9 i9Var = (i9) this.b;
                i9Var.R = Math.max(0.0f, (f10 - i9Var.S) - i9Var.Q);
                i9Var.f0();
                break;
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.b;
                contactsActivity.l0 = Math.max(0.0f, (f10 - contactsActivity.m0) - contactsActivity.k0);
                contactsActivity.h0();
                break;
            case 4:
                dy dyVar = (dy) this.b;
                UndoView undoView = dyVar.u0[0];
                if (undoView == null || undoView.getVisibility() != 0) {
                    dyVar.q1 = Math.max(0.0f, (f10 - dyVar.c4) - dyVar.f4);
                    dyVar.X4();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.fb
    public final /* synthetic */ void d(org.telegram.ui.Components.gc gcVar) {
        int i9 = this.a;
    }

    @Override // org.telegram.ui.Components.fb
    public final boolean e() {
        switch (this.a) {
            case 8:
                if (((ProfileActivity) this.b).o5 == null) {
                }
                break;
        }
        return true;
    }

    @Override // org.telegram.ui.Components.fb
    public final int f(int i9) {
        int i10;
        int i11;
        zt0 zt0Var;
        switch (this.a) {
            case 0:
                i9 i9Var = (i9) this.b;
                i10 = i9Var.S;
                i11 = i9Var.Q;
                break;
            case 1:
                return ((xc) this.b).K.getMeasuredHeight();
            case 2:
                qn qnVar = (qn) this.b;
                if (i9 == 1) {
                    return 0;
                }
                return Math.round(qnVar.O.getInputBubbleHeight() + AndroidUtilities.dp(16.0f) + qnVar.W8(org.telegram.ui.Components.w11.c) + qnVar.v.c());
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.b;
                i10 = contactsActivity.m0;
                i11 = contactsActivity.k0;
                break;
            case 4:
                dy dyVar = (dy) this.b;
                return dyVar.T2 != 0 ? AndroidUtilities.dp(60.0f) + dyVar.c4 : dyVar.n3();
            case 5:
                i11 = ((ng0) this.b).H;
                i10 = AndroidUtilities.dp(64.0f);
                break;
            case 6:
                PhotoViewer photoViewer = ((tt0) this.b).A0;
                int i12 = 0;
                if (!photoViewer.N4) {
                    dh.g gVar = photoViewer.e0;
                    if (gVar != null && gVar.getVisibility() == 0) {
                        i12 = (int) ((photoViewer.e0.getAlpha() * photoViewer.e0.getHeight()) + 0);
                    }
                    org.telegram.ui.Components.f30 f30Var = photoViewer.h1;
                    return (f30Var == null || !f30Var.c()) ? i12 : (AndroidUtilities.isTablet() || photoViewer.a0.getMeasuredHeight() > photoViewer.a0.getMeasuredWidth()) ? (int) ((photoViewer.h1.getAlpha() * photoViewer.h1.getHeight()) + i12) : i12;
                }
                yr0 yr0Var = photoViewer.Q1;
                if (yr0Var != null) {
                    i12 = yr0Var.H.l;
                    if (yr0Var.getVisibility() == 0 && ((zt0Var = photoViewer.d) == null || !zt0Var.A())) {
                        i12 = org.telegram.messenger.l0.C(12.0f, photoViewer.Q1.getEditTextHeight(), i12);
                    }
                }
                bh.g gVar2 = photoViewer.L0;
                if (gVar2 == null || gVar2.getVisibility() != 0) {
                    return i12;
                }
                yr0 yr0Var2 = photoViewer.Q1;
                return (yr0Var2 == null || !yr0Var2.H.c()) ? i12 + photoViewer.L0.getHeight() : i12;
            case 7:
                return ((PremiumPreviewFragment) this.b).k0.d;
            case 8:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                if (profileActivity.o5 == null) {
                    return profileActivity.h6 + profileActivity.g6;
                }
                return profileActivity.h6 + profileActivity.g6 + ((int) (((AndroidUtilities.dp(52.0f) - profileActivity.o5.getTranslationY()) - (profileActivity.p5[1].getTranslationY() * profileActivity.K.g0(9, false))) - (profileActivity.p5[0].getTranslationY() * profileActivity.K.g0(8, true))));
            default:
                we1 we1Var = (we1) this.b;
                b81 b81Var = we1Var.k0;
                if (b81Var == null || b81Var.getVisibility() != 0) {
                    return 0;
                }
                return we1Var.k0.getMeasuredHeight();
        }
        return i10 + i11;
    }

    @Override // org.telegram.ui.Components.fb
    public final /* synthetic */ boolean g(int i9) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Components.fb
    public final int h(int i9) {
        org.telegram.ui.ActionBar.k kVar;
        int i10;
        int max;
        int max2;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        int i11;
        org.telegram.ui.ActionBar.k kVar5;
        switch (this.a) {
            case 0:
                return 0;
            case 1:
                return 0;
            case 2:
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
                qn qnVar = (qn) this.b;
                kVar = ((org.telegram.ui.ActionBar.o2) qnVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.o2) qnVar).actionBar;
                    int measuredHeight = kVar2.getMeasuredHeight();
                    kVar3 = ((org.telegram.ui.ActionBar.o2) qnVar).actionBar;
                    i10 = kVar3.getTop() + measuredHeight;
                } else {
                    i10 = 0;
                }
                max = Math.max(currentActionBarHeight, i10);
                max2 = (int) Math.max(0.0f, qnVar.p9);
                break;
            case 3:
                return 0;
            case 4:
                dy dyVar = (dy) this.b;
                kVar4 = ((org.telegram.ui.ActionBar.o2) dyVar).actionBar;
                int i12 = 0;
                if (kVar4 != null) {
                    kVar5 = ((org.telegram.ui.ActionBar.o2) dyVar).actionBar;
                    i11 = kVar5.getMeasuredHeight();
                } else {
                    i11 = 0;
                }
                cw cwVar = dyVar.v0;
                int measuredHeight2 = i11 + ((cwVar == null || cwVar.getVisibility() != 0) ? 0 : dyVar.v0.getMeasuredHeight());
                org.telegram.ui.Components.bs bsVar = dyVar.F1;
                int height = measuredHeight2 + (bsVar != null ? bsVar.getHeight() : 0);
                vw vwVar = dyVar.A0;
                if (vwVar != null && dyVar.C0) {
                    i12 = (int) ((1.0f - vwVar.getCollapsedProgress()) * AndroidUtilities.dp(81.0f));
                }
                return AndroidUtilities.dp(48.0f) + height + i12;
            case 5:
                return 0;
            case 6:
                return org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight + ((int) (((tt0) this.b).A0.R1.getAlpha() * r4.R1.getEditTextHeight()));
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

    private final /* synthetic */ void A(org.telegram.ui.Components.gc gcVar) {
    }

    private final /* synthetic */ void B(org.telegram.ui.Components.gc gcVar) {
    }

    private final /* synthetic */ void C(org.telegram.ui.Components.gc gcVar) {
    }

    private final /* synthetic */ void D(org.telegram.ui.Components.gc gcVar) {
    }

    private final /* synthetic */ void E(org.telegram.ui.Components.gc gcVar) {
    }

    private final /* synthetic */ void F(org.telegram.ui.Components.gc gcVar) {
    }

    private final /* synthetic */ void G(org.telegram.ui.Components.gc gcVar) {
    }

    private final /* synthetic */ void i(float f10) {
    }

    private final /* synthetic */ void j(float f10) {
    }

    private final /* synthetic */ void k(float f10) {
    }

    private final /* synthetic */ void l(float f10) {
    }

    private final /* synthetic */ void m(float f10) {
    }

    private final /* synthetic */ void n(float f10) {
    }

    private final /* synthetic */ void o(float f10) {
    }

    private final /* synthetic */ void p(org.telegram.ui.Components.gc gcVar) {
    }

    private final /* synthetic */ void q(org.telegram.ui.Components.gc gcVar) {
    }

    private final /* synthetic */ void r(org.telegram.ui.Components.gc gcVar) {
    }

    private final /* synthetic */ void s(org.telegram.ui.Components.gc gcVar) {
    }

    private final /* synthetic */ void t(org.telegram.ui.Components.gc gcVar) {
    }

    private final /* synthetic */ void u(org.telegram.ui.Components.gc gcVar) {
    }

    private final /* synthetic */ void v(org.telegram.ui.Components.gc gcVar) {
    }

    private final /* synthetic */ void w(org.telegram.ui.Components.gc gcVar) {
    }

    private final /* synthetic */ void x(org.telegram.ui.Components.gc gcVar) {
    }

    private final /* synthetic */ void y(org.telegram.ui.Components.gc gcVar) {
    }

    private final /* synthetic */ void z(org.telegram.ui.Components.gc gcVar) {
    }
}
