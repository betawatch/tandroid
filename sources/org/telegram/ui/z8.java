package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class z8 implements org.telegram.ui.Components.ua {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z8(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.ua
    public final boolean a() {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Components.ua
    public final void b(org.telegram.ui.Components.wb wbVar) {
        switch (this.a) {
            case 2:
                org.telegram.ui.Components.bb bbVar = wbVar.e;
                un unVar = (un) this.b;
                vg.f c10 = unVar.K.c(bbVar, null, true);
                wg.d dVar = new wg.d(unVar.xa);
                dVar.e = new xg.a(0);
                float N = org.telegram.messenger.i0.N(0.5f);
                float N2 = org.telegram.messenger.i0.N(0.5f);
                dVar.f = N;
                dVar.h = N2;
                c10.o(dVar);
                c10.q(org.telegram.messenger.i0.L(16.0f));
                bbVar.setCustomBackground(c10);
                break;
            case 4:
                ay ayVar = (ay) this.b;
                UndoView undoView = ayVar.y0[0];
                if (undoView != null && undoView.getVisibility() == 0) {
                    ayVar.y0[0].d(2, true);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.ua
    public final void c(float f7) {
        switch (this.a) {
            case 0:
                j9 j9Var = (j9) this.b;
                j9Var.S = Math.max(0.0f, (f7 - j9Var.T) - j9Var.R);
                j9Var.f0();
                break;
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.b;
                contactsActivity.j0 = Math.max(0.0f, (f7 - contactsActivity.k0) - contactsActivity.i0);
                contactsActivity.i0();
                break;
            case 4:
                ay ayVar = (ay) this.b;
                UndoView undoView = ayVar.y0[0];
                if (undoView == null || undoView.getVisibility() != 0) {
                    ayVar.u1 = Math.max(0.0f, (f7 - ayVar.f4) - ayVar.i4);
                    ayVar.j5();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.ua
    public final /* synthetic */ void d(org.telegram.ui.Components.wb wbVar) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.ua
    public final boolean e() {
        switch (this.a) {
            case 8:
                if (((ProfileActivity) this.b).s5 == null) {
                }
                break;
        }
        return true;
    }

    @Override // org.telegram.ui.Components.ua
    public final int f(int i10) {
        int i11;
        int i12;
        es0 es0Var;
        int L;
        switch (this.a) {
            case 0:
                j9 j9Var = (j9) this.b;
                i11 = j9Var.T;
                i12 = j9Var.R;
                break;
            case 1:
                return ((zc) this.b).O.getMeasuredHeight();
            case 2:
                un unVar = (un) this.b;
                if (i10 == 1) {
                    return 0;
                }
                return Math.round(unVar.T.getInputBubbleHeight() + org.telegram.messenger.i0.L(16.0f) + unVar.j9(org.telegram.ui.Components.k21.c) + unVar.w.d());
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.b;
                i11 = contactsActivity.k0;
                i12 = contactsActivity.i0;
                break;
            case 4:
                ay ayVar = (ay) this.b;
                return ayVar.Y2 != 0 ? org.telegram.messenger.i0.L(60.0f) + ayVar.f4 : ayVar.v3();
            case 5:
                i12 = ((pf0) this.b).L;
                i11 = org.telegram.messenger.i0.L(64.0f);
                break;
            case 6:
                PhotoViewer photoViewer = ((as0) this.b).n0;
                int i13 = 0;
                if (!photoViewer.R4) {
                    dg0 dg0Var = photoViewer.i0;
                    if (dg0Var != null && dg0Var.getVisibility() == 0) {
                        i13 = (int) ((photoViewer.i0.getAlpha() * photoViewer.i0.getHeight()) + 0);
                    }
                    org.telegram.ui.Components.d30 d30Var = photoViewer.l1;
                    return (d30Var == null || !d30Var.c()) ? i13 : (org.telegram.messenger.i0.Q1() || photoViewer.e0.getMeasuredHeight() > photoViewer.e0.getMeasuredWidth()) ? (int) ((photoViewer.l1.getAlpha() * photoViewer.l1.getHeight()) + i13) : i13;
                }
                jq0 jq0Var = photoViewer.U1;
                if (jq0Var != null) {
                    i13 = jq0Var.L.l;
                    if (jq0Var.getVisibility() == 0 && ((es0Var = photoViewer.d) == null || !es0Var.A())) {
                        i13 = org.telegram.messenger.m5.C(12.0f, photoViewer.U1.getEditTextHeight(), i13);
                    }
                }
                jg.b1 b1Var = photoViewer.P0;
                if (b1Var == null || b1Var.getVisibility() != 0) {
                    return i13;
                }
                jq0 jq0Var2 = photoViewer.U1;
                return (jq0Var2 == null || !jq0Var2.L.c()) ? i13 + photoViewer.P0.getHeight() : i13;
            case 7:
                return ((PremiumPreviewFragment) this.b).o0.d;
            case 8:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                int i14 = 0;
                if (profileActivity.s5 == null) {
                    L = profileActivity.H6 + profileActivity.G6;
                } else {
                    L = ((int) (((org.telegram.messenger.i0.L(52.0f) - profileActivity.s5.getTranslationY()) - (((1.0f - profileActivity.t5[1].getAlpha()) * org.telegram.messenger.i0.L(72.0f)) * profileActivity.N.p0(9, false))) - (((1.0f - profileActivity.t5[0].getAlpha()) * org.telegram.messenger.i0.L(72.0f)) * profileActivity.N.p0(8, true)))) + profileActivity.H6 + profileActivity.G6;
                }
                ix0 ix0Var = profileActivity.N;
                float p02 = (ix0Var == null || ix0Var.a0 == null) ? 0.0f : ix0Var.p0(14, false);
                if (p02 <= 0.0f) {
                    return L;
                }
                org.telegram.ui.Components.vq0 vq0Var = profileActivity.N.a0;
                View view = profileActivity.fragmentView;
                FrameLayout frameLayout = vq0Var.r;
                if (view != null && frameLayout != null && frameLayout.getVisibility() == 0 && frameLayout.getAlpha() > 0.0f) {
                    view.getLocationInWindow(new int[2]);
                    frameLayout.getLocationInWindow(new int[2]);
                    i14 = Math.max(0, (int) (frameLayout.getAlpha() * ((view.getHeight() + r7[1]) - r5[1])));
                }
                return org.telegram.messenger.i0.W1(Math.min(1.0f, p02), L, Math.max(L, i14));
            default:
                pb1 pb1Var = (pb1) this.b;
                dg0 dg0Var2 = pb1Var.o0;
                if (dg0Var2 == null || dg0Var2.getVisibility() != 0) {
                    return 0;
                }
                return pb1Var.o0.getMeasuredHeight();
        }
        return i11 + i12;
    }

    @Override // org.telegram.ui.Components.ua
    public final /* synthetic */ boolean g(int i10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Components.ua
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
                int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + org.telegram.messenger.i0.m;
                un unVar = (un) this.b;
                lVar = ((org.telegram.ui.ActionBar.k2) unVar).actionBar;
                if (lVar != null) {
                    lVar2 = ((org.telegram.ui.ActionBar.k2) unVar).actionBar;
                    int measuredHeight = lVar2.getMeasuredHeight();
                    lVar3 = ((org.telegram.ui.ActionBar.k2) unVar).actionBar;
                    i11 = lVar3.getTop() + measuredHeight;
                } else {
                    i11 = 0;
                }
                max = Math.max(currentActionBarHeight, i11);
                max2 = (int) Math.max(0.0f, unVar.M9);
                break;
            case 3:
                return 0;
            case 4:
                ay ayVar = (ay) this.b;
                lVar4 = ((org.telegram.ui.ActionBar.k2) ayVar).actionBar;
                int i13 = 0;
                if (lVar4 != null) {
                    lVar5 = ((org.telegram.ui.ActionBar.k2) ayVar).actionBar;
                    i12 = lVar5.getMeasuredHeight();
                } else {
                    i12 = 0;
                }
                qx qxVar = ayVar.z0;
                int measuredHeight2 = i12 + ((qxVar == null || qxVar.getVisibility() != 0) ? 0 : ayVar.z0.getMeasuredHeight());
                org.telegram.ui.Components.zr zrVar = ayVar.J1;
                int height = measuredHeight2 + (zrVar != null ? zrVar.getHeight() : 0);
                uw uwVar = ayVar.E0;
                if (uwVar != null && ayVar.G0) {
                    i13 = (int) ((1.0f - uwVar.getCollapsedProgress()) * org.telegram.messenger.i0.L(81.0f));
                }
                return org.telegram.messenger.i0.L(48.0f) + height + i13;
            case 5:
                return 0;
            case 6:
                return org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + org.telegram.messenger.i0.m + ((int) (((as0) this.b).n0.V1.getAlpha() * r4.V1.getEditTextHeight()));
            case 7:
                return 0;
            case 8:
                max2 = org.telegram.messenger.i0.m;
                max = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                break;
            default:
                return 0;
        }
        return max + max2;
    }

    private final /* synthetic */ void A(org.telegram.ui.Components.wb wbVar) {
    }

    private final /* synthetic */ void B(org.telegram.ui.Components.wb wbVar) {
    }

    private final /* synthetic */ void C(org.telegram.ui.Components.wb wbVar) {
    }

    private final /* synthetic */ void D(org.telegram.ui.Components.wb wbVar) {
    }

    private final /* synthetic */ void E(org.telegram.ui.Components.wb wbVar) {
    }

    private final /* synthetic */ void F(org.telegram.ui.Components.wb wbVar) {
    }

    private final /* synthetic */ void G(org.telegram.ui.Components.wb wbVar) {
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

    private final /* synthetic */ void p(org.telegram.ui.Components.wb wbVar) {
    }

    private final /* synthetic */ void q(org.telegram.ui.Components.wb wbVar) {
    }

    private final /* synthetic */ void r(org.telegram.ui.Components.wb wbVar) {
    }

    private final /* synthetic */ void s(org.telegram.ui.Components.wb wbVar) {
    }

    private final /* synthetic */ void t(org.telegram.ui.Components.wb wbVar) {
    }

    private final /* synthetic */ void u(org.telegram.ui.Components.wb wbVar) {
    }

    private final /* synthetic */ void v(org.telegram.ui.Components.wb wbVar) {
    }

    private final /* synthetic */ void w(org.telegram.ui.Components.wb wbVar) {
    }

    private final /* synthetic */ void x(org.telegram.ui.Components.wb wbVar) {
    }

    private final /* synthetic */ void y(org.telegram.ui.Components.wb wbVar) {
    }

    private final /* synthetic */ void z(org.telegram.ui.Components.wb wbVar) {
    }
}
