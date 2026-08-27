package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class y8 implements org.telegram.ui.Components.db {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y8(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.db
    public final boolean a() {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Components.db
    public final void b(org.telegram.ui.Components.ec ecVar) {
        switch (this.a) {
            case 2:
                org.telegram.ui.Components.jb jbVar = ecVar.e;
                rn rnVar = (rn) this.b;
                lg.d c10 = rnVar.F.c(jbVar, null, true);
                mg.d dVar = new mg.d(rnVar.aa);
                dVar.e = new ng.a(2);
                float dpf2 = AndroidUtilities.dpf2(0.5f);
                float dpf22 = AndroidUtilities.dpf2(0.5f);
                dVar.f = dpf2;
                dVar.h = dpf22;
                c10.n(dVar);
                c10.p(AndroidUtilities.dp(16.0f));
                jbVar.setCustomBackground(c10);
                break;
            case 4:
                gy gyVar = (gy) this.b;
                UndoView undoView = gyVar.u0[0];
                if (undoView != null && undoView.getVisibility() == 0) {
                    gyVar.u0[0].e(2, true);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.db
    public final void c(float f10) {
        switch (this.a) {
            case 0:
                j9 j9Var = (j9) this.b;
                j9Var.R = Math.max(0.0f, (f10 - j9Var.S) - j9Var.Q);
                j9Var.g0();
                break;
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.b;
                contactsActivity.l0 = Math.max(0.0f, (f10 - contactsActivity.m0) - contactsActivity.k0);
                contactsActivity.i0();
                break;
            case 4:
                gy gyVar = (gy) this.b;
                UndoView undoView = gyVar.u0[0];
                if (undoView == null || undoView.getVisibility() != 0) {
                    gyVar.q1 = Math.max(0.0f, (f10 - gyVar.c4) - gyVar.f4);
                    gyVar.X4();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.db
    public final /* synthetic */ void d(org.telegram.ui.Components.ec ecVar) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.db
    public final boolean e() {
        switch (this.a) {
            case 8:
                if (((ProfileActivity) this.b).o5 == null) {
                }
                break;
        }
        return true;
    }

    @Override // org.telegram.ui.Components.db
    public final int f(int i10) {
        int i11;
        int i12;
        au0 au0Var;
        switch (this.a) {
            case 0:
                j9 j9Var = (j9) this.b;
                i11 = j9Var.S;
                i12 = j9Var.Q;
                break;
            case 1:
                return ((xc) this.b).K.getMeasuredHeight();
            case 2:
                rn rnVar = (rn) this.b;
                if (i10 == 1) {
                    return 0;
                }
                return Math.round(rnVar.O.getInputBubbleHeight() + AndroidUtilities.dp(16.0f) + rnVar.W8(org.telegram.ui.Components.z11.c) + rnVar.v.c());
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.b;
                i11 = contactsActivity.m0;
                i12 = contactsActivity.k0;
                break;
            case 4:
                gy gyVar = (gy) this.b;
                return gyVar.T2 != 0 ? AndroidUtilities.dp(60.0f) + gyVar.c4 : gyVar.n3();
            case 5:
                i12 = ((qg0) this.b).H;
                i11 = AndroidUtilities.dp(64.0f);
                break;
            case 6:
                PhotoViewer photoViewer = ((ut0) this.b).A0;
                int i13 = 0;
                if (!photoViewer.N4) {
                    ag.d dVar = photoViewer.e0;
                    if (dVar != null && dVar.getVisibility() == 0) {
                        i13 = (int) ((photoViewer.e0.getAlpha() * photoViewer.e0.getHeight()) + 0);
                    }
                    org.telegram.ui.Components.k30 k30Var = photoViewer.h1;
                    return (k30Var == null || !k30Var.c()) ? i13 : (AndroidUtilities.isTablet() || photoViewer.a0.getMeasuredHeight() > photoViewer.a0.getMeasuredWidth()) ? (int) ((photoViewer.h1.getAlpha() * photoViewer.h1.getHeight()) + i13) : i13;
                }
                zr0 zr0Var = photoViewer.Q1;
                if (zr0Var != null) {
                    i13 = zr0Var.H.l;
                    if (zr0Var.getVisibility() == 0 && ((au0Var = photoViewer.d) == null || !au0Var.A())) {
                        i13 = org.telegram.messenger.y1.C(12.0f, photoViewer.Q1.getEditTextHeight(), i13);
                    }
                }
                ag.w wVar = photoViewer.L0;
                if (wVar == null || wVar.getVisibility() != 0) {
                    return i13;
                }
                zr0 zr0Var2 = photoViewer.Q1;
                return (zr0Var2 == null || !zr0Var2.H.c()) ? i13 + photoViewer.L0.getHeight() : i13;
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
                z71 z71Var = we1Var.k0;
                if (z71Var == null || z71Var.getVisibility() != 0) {
                    return 0;
                }
                return we1Var.k0.getMeasuredHeight();
        }
        return i11 + i12;
    }

    @Override // org.telegram.ui.Components.db
    public final /* synthetic */ boolean g(int i10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Components.db
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
                rn rnVar = (rn) this.b;
                kVar = ((org.telegram.ui.ActionBar.n2) rnVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.n2) rnVar).actionBar;
                    int measuredHeight = kVar2.getMeasuredHeight();
                    kVar3 = ((org.telegram.ui.ActionBar.n2) rnVar).actionBar;
                    i11 = kVar3.getTop() + measuredHeight;
                } else {
                    i11 = 0;
                }
                max = Math.max(currentActionBarHeight, i11);
                max2 = (int) Math.max(0.0f, rnVar.p9);
                break;
            case 3:
                return 0;
            case 4:
                gy gyVar = (gy) this.b;
                kVar4 = ((org.telegram.ui.ActionBar.n2) gyVar).actionBar;
                int i13 = 0;
                if (kVar4 != null) {
                    kVar5 = ((org.telegram.ui.ActionBar.n2) gyVar).actionBar;
                    i12 = kVar5.getMeasuredHeight();
                } else {
                    i12 = 0;
                }
                fw fwVar = gyVar.v0;
                int measuredHeight2 = i12 + ((fwVar == null || fwVar.getVisibility() != 0) ? 0 : gyVar.v0.getMeasuredHeight());
                org.telegram.ui.Components.zr zrVar = gyVar.F1;
                int height = measuredHeight2 + (zrVar != null ? zrVar.getHeight() : 0);
                yw ywVar = gyVar.A0;
                if (ywVar != null && gyVar.C0) {
                    i13 = (int) ((1.0f - ywVar.getCollapsedProgress()) * AndroidUtilities.dp(81.0f));
                }
                return AndroidUtilities.dp(48.0f) + height + i13;
            case 5:
                return 0;
            case 6:
                return org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight + ((int) (((ut0) this.b).A0.R1.getAlpha() * r4.R1.getEditTextHeight()));
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

    private final /* synthetic */ void A(org.telegram.ui.Components.ec ecVar) {
    }

    private final /* synthetic */ void B(org.telegram.ui.Components.ec ecVar) {
    }

    private final /* synthetic */ void C(org.telegram.ui.Components.ec ecVar) {
    }

    private final /* synthetic */ void D(org.telegram.ui.Components.ec ecVar) {
    }

    private final /* synthetic */ void E(org.telegram.ui.Components.ec ecVar) {
    }

    private final /* synthetic */ void F(org.telegram.ui.Components.ec ecVar) {
    }

    private final /* synthetic */ void G(org.telegram.ui.Components.ec ecVar) {
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

    private final /* synthetic */ void p(org.telegram.ui.Components.ec ecVar) {
    }

    private final /* synthetic */ void q(org.telegram.ui.Components.ec ecVar) {
    }

    private final /* synthetic */ void r(org.telegram.ui.Components.ec ecVar) {
    }

    private final /* synthetic */ void s(org.telegram.ui.Components.ec ecVar) {
    }

    private final /* synthetic */ void t(org.telegram.ui.Components.ec ecVar) {
    }

    private final /* synthetic */ void u(org.telegram.ui.Components.ec ecVar) {
    }

    private final /* synthetic */ void v(org.telegram.ui.Components.ec ecVar) {
    }

    private final /* synthetic */ void w(org.telegram.ui.Components.ec ecVar) {
    }

    private final /* synthetic */ void x(org.telegram.ui.Components.ec ecVar) {
    }

    private final /* synthetic */ void y(org.telegram.ui.Components.ec ecVar) {
    }

    private final /* synthetic */ void z(org.telegram.ui.Components.ec ecVar) {
    }
}
