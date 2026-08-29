package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class w8 implements org.telegram.ui.Components.kb {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w8(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.kb
    public final boolean a() {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Components.kb
    public final void b(org.telegram.ui.Components.mc mcVar) {
        switch (this.a) {
            case 2:
                org.telegram.ui.Components.rb rbVar = mcVar.e;
                tn tnVar = (tn) this.b;
                ng.d c3 = tnVar.F.c(rbVar, null, true);
                og.d dVar = new og.d(tnVar.aa);
                dVar.e = new xx0(11);
                float dpf2 = AndroidUtilities.dpf2(0.5f);
                float dpf22 = AndroidUtilities.dpf2(0.5f);
                dVar.f = dpf2;
                dVar.h = dpf22;
                c3.n(dVar);
                c3.p(AndroidUtilities.dp(16.0f));
                rbVar.setCustomBackground(c3);
                break;
            case 4:
                fy fyVar = (fy) this.b;
                UndoView undoView = fyVar.u0[0];
                if (undoView != null && undoView.getVisibility() == 0) {
                    fyVar.u0[0].e(2, true);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.kb
    public final void c(float f9) {
        switch (this.a) {
            case 0:
                h9 h9Var = (h9) this.b;
                h9Var.R = Math.max(0.0f, (f9 - h9Var.S) - h9Var.Q);
                h9Var.g0();
                break;
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.b;
                contactsActivity.l0 = Math.max(0.0f, (f9 - contactsActivity.m0) - contactsActivity.k0);
                contactsActivity.i0();
                break;
            case 4:
                fy fyVar = (fy) this.b;
                UndoView undoView = fyVar.u0[0];
                if (undoView == null || undoView.getVisibility() != 0) {
                    fyVar.q1 = Math.max(0.0f, (f9 - fyVar.c4) - fyVar.f4);
                    fyVar.X4();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.kb
    public final /* synthetic */ void d(org.telegram.ui.Components.mc mcVar) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.kb
    public final boolean e() {
        switch (this.a) {
            case 8:
                if (((ProfileActivity) this.b).o5 == null) {
                }
                break;
        }
        return true;
    }

    @Override // org.telegram.ui.Components.kb
    public final int f(int i10) {
        int i11;
        int i12;
        xt0 xt0Var;
        switch (this.a) {
            case 0:
                h9 h9Var = (h9) this.b;
                i11 = h9Var.S;
                i12 = h9Var.Q;
                break;
            case 1:
                return ((vc) this.b).K.getMeasuredHeight();
            case 2:
                tn tnVar = (tn) this.b;
                if (i10 == 1) {
                    return 0;
                }
                return Math.round(tnVar.O.getInputBubbleHeight() + AndroidUtilities.dp(16.0f) + tnVar.W8(org.telegram.ui.Components.i21.c) + tnVar.v.c());
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.b;
                i11 = contactsActivity.m0;
                i12 = contactsActivity.k0;
                break;
            case 4:
                fy fyVar = (fy) this.b;
                return fyVar.T2 != 0 ? AndroidUtilities.dp(60.0f) + fyVar.c4 : fyVar.n3();
            case 5:
                i12 = ((ng0) this.b).H;
                i11 = AndroidUtilities.dp(64.0f);
                break;
            case 6:
                PhotoViewer photoViewer = ((rt0) this.b).A0;
                int i13 = 0;
                if (!photoViewer.N4) {
                    bh.d dVar = photoViewer.e0;
                    if (dVar != null && dVar.getVisibility() == 0) {
                        i13 = (int) ((photoViewer.e0.getAlpha() * photoViewer.e0.getHeight()) + 0);
                    }
                    org.telegram.ui.Components.t30 t30Var = photoViewer.h1;
                    return (t30Var == null || !t30Var.c()) ? i13 : (AndroidUtilities.isTablet() || photoViewer.a0.getMeasuredHeight() > photoViewer.a0.getMeasuredWidth()) ? (int) ((photoViewer.h1.getAlpha() * photoViewer.h1.getHeight()) + i13) : i13;
                }
                xr0 xr0Var = photoViewer.Q1;
                if (xr0Var != null) {
                    i13 = xr0Var.H.l;
                    if (xr0Var.getVisibility() == 0 && ((xt0Var = photoViewer.d) == null || !xt0Var.A())) {
                        i13 = org.telegram.messenger.x3.C(12.0f, photoViewer.Q1.getEditTextHeight(), i13);
                    }
                }
                bg.u1 u1Var = photoViewer.L0;
                if (u1Var == null || u1Var.getVisibility() != 0) {
                    return i13;
                }
                xr0 xr0Var2 = photoViewer.Q1;
                return (xr0Var2 == null || !xr0Var2.H.c()) ? i13 + photoViewer.L0.getHeight() : i13;
            case 7:
                return ((PremiumPreviewFragment) this.b).k0.d;
            case 8:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                if (profileActivity.o5 == null) {
                    return profileActivity.h6 + profileActivity.g6;
                }
                return profileActivity.h6 + profileActivity.g6 + ((int) (((AndroidUtilities.dp(52.0f) - profileActivity.o5.getTranslationY()) - (profileActivity.p5[1].getTranslationY() * profileActivity.K.g0(9, false))) - (profileActivity.p5[0].getTranslationY() * profileActivity.K.g0(8, true))));
            default:
                ze1 ze1Var = (ze1) this.b;
                n31 n31Var = ze1Var.k0;
                if (n31Var == null || n31Var.getVisibility() != 0) {
                    return 0;
                }
                return ze1Var.k0.getMeasuredHeight();
        }
        return i11 + i12;
    }

    @Override // org.telegram.ui.Components.kb
    public final /* synthetic */ boolean g(int i10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Components.kb
    public final int h(int i10) {
        org.telegram.ui.ActionBar.l lVar;
        int i11;
        int max;
        int max2;
        org.telegram.ui.ActionBar.l lVar2;
        org.telegram.ui.ActionBar.l lVar3;
        org.telegram.ui.ActionBar.l lVar4;
        int i12;
        org.telegram.ui.ActionBar.l lVar5;
        switch (this.a) {
            case 0:
                return 0;
            case 1:
                return 0;
            case 2:
                int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
                tn tnVar = (tn) this.b;
                lVar = ((org.telegram.ui.ActionBar.o2) tnVar).actionBar;
                if (lVar != null) {
                    lVar2 = ((org.telegram.ui.ActionBar.o2) tnVar).actionBar;
                    int measuredHeight = lVar2.getMeasuredHeight();
                    lVar3 = ((org.telegram.ui.ActionBar.o2) tnVar).actionBar;
                    i11 = lVar3.getTop() + measuredHeight;
                } else {
                    i11 = 0;
                }
                max = Math.max(currentActionBarHeight, i11);
                max2 = (int) Math.max(0.0f, tnVar.p9);
                break;
            case 3:
                return 0;
            case 4:
                fy fyVar = (fy) this.b;
                lVar4 = ((org.telegram.ui.ActionBar.o2) fyVar).actionBar;
                int i13 = 0;
                if (lVar4 != null) {
                    lVar5 = ((org.telegram.ui.ActionBar.o2) fyVar).actionBar;
                    i12 = lVar5.getMeasuredHeight();
                } else {
                    i12 = 0;
                }
                ew ewVar = fyVar.v0;
                int measuredHeight2 = i12 + ((ewVar == null || ewVar.getVisibility() != 0) ? 0 : fyVar.v0.getMeasuredHeight());
                org.telegram.ui.Components.fs fsVar = fyVar.F1;
                int height = measuredHeight2 + (fsVar != null ? fsVar.getHeight() : 0);
                xw xwVar = fyVar.A0;
                if (xwVar != null && fyVar.C0) {
                    i13 = (int) ((1.0f - xwVar.getCollapsedProgress()) * AndroidUtilities.dp(81.0f));
                }
                return AndroidUtilities.dp(48.0f) + height + i13;
            case 5:
                return 0;
            case 6:
                return org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight + ((int) (((rt0) this.b).A0.R1.getAlpha() * r4.R1.getEditTextHeight()));
            case 7:
                return 0;
            case 8:
                max2 = AndroidUtilities.statusBarHeight;
                max = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                break;
            default:
                return 0;
        }
        return max + max2;
    }

    private final /* synthetic */ void A(org.telegram.ui.Components.mc mcVar) {
    }

    private final /* synthetic */ void B(org.telegram.ui.Components.mc mcVar) {
    }

    private final /* synthetic */ void C(org.telegram.ui.Components.mc mcVar) {
    }

    private final /* synthetic */ void D(org.telegram.ui.Components.mc mcVar) {
    }

    private final /* synthetic */ void E(org.telegram.ui.Components.mc mcVar) {
    }

    private final /* synthetic */ void F(org.telegram.ui.Components.mc mcVar) {
    }

    private final /* synthetic */ void G(org.telegram.ui.Components.mc mcVar) {
    }

    private final /* synthetic */ void i(float f9) {
    }

    private final /* synthetic */ void j(float f9) {
    }

    private final /* synthetic */ void k(float f9) {
    }

    private final /* synthetic */ void l(float f9) {
    }

    private final /* synthetic */ void m(float f9) {
    }

    private final /* synthetic */ void n(float f9) {
    }

    private final /* synthetic */ void o(float f9) {
    }

    private final /* synthetic */ void p(org.telegram.ui.Components.mc mcVar) {
    }

    private final /* synthetic */ void q(org.telegram.ui.Components.mc mcVar) {
    }

    private final /* synthetic */ void r(org.telegram.ui.Components.mc mcVar) {
    }

    private final /* synthetic */ void s(org.telegram.ui.Components.mc mcVar) {
    }

    private final /* synthetic */ void t(org.telegram.ui.Components.mc mcVar) {
    }

    private final /* synthetic */ void u(org.telegram.ui.Components.mc mcVar) {
    }

    private final /* synthetic */ void v(org.telegram.ui.Components.mc mcVar) {
    }

    private final /* synthetic */ void w(org.telegram.ui.Components.mc mcVar) {
    }

    private final /* synthetic */ void x(org.telegram.ui.Components.mc mcVar) {
    }

    private final /* synthetic */ void y(org.telegram.ui.Components.mc mcVar) {
    }

    private final /* synthetic */ void z(org.telegram.ui.Components.mc mcVar) {
    }
}
