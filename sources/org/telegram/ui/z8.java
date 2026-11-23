package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class z8 implements org.telegram.ui.Components.fb {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z8(Object obj, int i7) {
        this.a = i7;
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
                bn bnVar = (bn) this.b;
                fh.g c10 = bnVar.L.c(lbVar, null, true);
                c10.p(c8.i0.c(bnVar.Ba));
                c10.r(org.telegram.messenger.g0.L(16.0f));
                lbVar.setCustomBackground(c10);
                break;
            case 4:
                cx cxVar = (cx) this.b;
                UndoView undoView = cxVar.z0[0];
                if (undoView != null && undoView.getVisibility() == 0) {
                    cxVar.z0[0].d(2, true);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.fb
    public final void c(float f10) {
        switch (this.a) {
            case 0:
                j9 j9Var = (j9) this.b;
                j9Var.R = Math.max(0.0f, (f10 - j9Var.S) - j9Var.Q);
                j9Var.g0();
                break;
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.b;
                contactsActivity.k0 = Math.max(0.0f, (f10 - contactsActivity.l0) - contactsActivity.j0);
                contactsActivity.j0();
                break;
            case 4:
                cx cxVar = (cx) this.b;
                UndoView undoView = cxVar.z0[0];
                if (undoView == null || undoView.getVisibility() != 0) {
                    cxVar.w1 = Math.max(0.0f, (f10 - cxVar.k4) - cxVar.n4);
                    cxVar.s5();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.fb
    public final /* synthetic */ void d(org.telegram.ui.Components.gc gcVar) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Components.fb
    public final boolean e() {
        switch (this.a) {
            case 8:
                if (((ProfileActivity) this.b).y5 == null) {
                }
                break;
        }
        return true;
    }

    @Override // org.telegram.ui.Components.fb
    public final int f(int i7) {
        int i10;
        int i11;
        uq0 uq0Var;
        int L;
        switch (this.a) {
            case 0:
                j9 j9Var = (j9) this.b;
                i10 = j9Var.S;
                i11 = j9Var.Q;
                break;
            case 1:
                return ((qc) this.b).P.getMeasuredHeight();
            case 2:
                bn bnVar = (bn) this.b;
                if (i7 == 1) {
                    return 0;
                }
                return Math.round(bnVar.U.getInputBubbleHeight() + org.telegram.messenger.g0.L(16.0f) + bnVar.t9(org.telegram.ui.Components.w11.c) + bnVar.w.d());
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.b;
                i10 = contactsActivity.l0;
                i11 = contactsActivity.j0;
                break;
            case 4:
                cx cxVar = (cx) this.b;
                return cxVar.a3 != 0 ? org.telegram.messenger.g0.L(60.0f) + cxVar.k4 : cxVar.w3();
            case 5:
                i11 = ((me0) this.b).M;
                i10 = org.telegram.messenger.g0.L(64.0f);
                break;
            case 6:
                PhotoViewer photoViewer = ((qq0) this.b).o0;
                int i12 = 0;
                if (!photoViewer.R4) {
                    ih0 ih0Var = photoViewer.j0;
                    if (ih0Var != null && ih0Var.getVisibility() == 0) {
                        i12 = (int) ((photoViewer.j0.getAlpha() * photoViewer.j0.getHeight()) + 0);
                    }
                    org.telegram.ui.Components.z20 z20Var = photoViewer.m1;
                    return (z20Var == null || !z20Var.c()) ? i12 : (org.telegram.messenger.g0.Q1() || photoViewer.f0.getMeasuredHeight() > photoViewer.f0.getMeasuredWidth()) ? (int) ((photoViewer.m1.getAlpha() * photoViewer.m1.getHeight()) + i12) : i12;
                }
                ap0 ap0Var = photoViewer.V1;
                if (ap0Var != null) {
                    i12 = ap0Var.M.l;
                    if (ap0Var.getVisibility() == 0 && ((uq0Var = photoViewer.d) == null || !uq0Var.A())) {
                        i12 = org.telegram.messenger.f3.C(12.0f, photoViewer.V1.getEditTextHeight(), i12);
                    }
                }
                di.n4 n4Var = photoViewer.Q0;
                if (n4Var == null || n4Var.getVisibility() != 0) {
                    return i12;
                }
                ap0 ap0Var2 = photoViewer.V1;
                return (ap0Var2 == null || !ap0Var2.M.c()) ? i12 + photoViewer.Q0.getHeight() : i12;
            case 7:
                return ((PremiumPreviewFragment) this.b).p0.d;
            case 8:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                int i13 = 0;
                if (profileActivity.y5 == null) {
                    L = profileActivity.P6 + profileActivity.O6;
                } else {
                    L = ((int) (((org.telegram.messenger.g0.L(52.0f) - profileActivity.y5.getTranslationY()) - (((1.0f - profileActivity.z5[1].getAlpha()) * org.telegram.messenger.g0.L(72.0f)) * profileActivity.O.r0(9, false))) - (((1.0f - profileActivity.z5[0].getAlpha()) * org.telegram.messenger.g0.L(72.0f)) * profileActivity.O.r0(8, true)))) + profileActivity.P6 + profileActivity.O6;
                }
                vv0 vv0Var = profileActivity.O;
                float r02 = (vv0Var == null || vv0Var.b0 == null) ? 0.0f : vv0Var.r0(14, false);
                if (r02 <= 0.0f) {
                    return L;
                }
                org.telegram.ui.Components.gq0 gq0Var = profileActivity.O.b0;
                View view = profileActivity.fragmentView;
                FrameLayout frameLayout = gq0Var.r;
                if (view != null && frameLayout != null && frameLayout.getVisibility() == 0 && frameLayout.getAlpha() > 0.0f) {
                    view.getLocationInWindow(new int[2]);
                    frameLayout.getLocationInWindow(new int[2]);
                    i13 = Math.max(0, (int) (frameLayout.getAlpha() * ((view.getHeight() + r7[1]) - r5[1])));
                }
                return org.telegram.messenger.g0.W1(Math.min(1.0f, r02), L, Math.max(L, i13));
            default:
                y91 y91Var = (y91) this.b;
                ih0 ih0Var2 = y91Var.p0;
                if (ih0Var2 == null || ih0Var2.getVisibility() != 0) {
                    return 0;
                }
                return y91Var.p0.getMeasuredHeight();
        }
        return i10 + i11;
    }

    @Override // org.telegram.ui.Components.fb
    public final /* synthetic */ boolean g(int i7) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Components.fb
    public final int h(int i7) {
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
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.m;
                bn bnVar = (bn) this.b;
                kVar = ((org.telegram.ui.ActionBar.g2) bnVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.g2) bnVar).actionBar;
                    int measuredHeight = kVar2.getMeasuredHeight();
                    kVar3 = ((org.telegram.ui.ActionBar.g2) bnVar).actionBar;
                    i10 = kVar3.getTop() + measuredHeight;
                } else {
                    i10 = 0;
                }
                max = Math.max(currentActionBarHeight, i10);
                max2 = (int) Math.max(0.0f, bnVar.Q9);
                break;
            case 3:
                return 0;
            case 4:
                cx cxVar = (cx) this.b;
                kVar4 = ((org.telegram.ui.ActionBar.g2) cxVar).actionBar;
                int i12 = 0;
                if (kVar4 != null) {
                    kVar5 = ((org.telegram.ui.ActionBar.g2) cxVar).actionBar;
                    i11 = kVar5.getMeasuredHeight();
                } else {
                    i11 = 0;
                }
                rw rwVar = cxVar.A0;
                int measuredHeight2 = i11 + ((rwVar == null || rwVar.getVisibility() != 0) ? 0 : cxVar.A0.getMeasuredHeight());
                org.telegram.ui.Components.es esVar = cxVar.L1;
                int height = measuredHeight2 + (esVar != null ? esVar.getHeight() : 0);
                tv tvVar = cxVar.F0;
                if (tvVar != null && cxVar.H0) {
                    i12 = (int) ((1.0f - tvVar.getCollapsedProgress()) * org.telegram.messenger.g0.L(81.0f));
                }
                return org.telegram.messenger.g0.L(48.0f) + height + i12;
            case 5:
                return 0;
            case 6:
                return org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.m + ((int) (((qq0) this.b).o0.W1.getAlpha() * r4.W1.getEditTextHeight()));
            case 7:
                return 0;
            case 8:
                max2 = org.telegram.messenger.g0.m;
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
