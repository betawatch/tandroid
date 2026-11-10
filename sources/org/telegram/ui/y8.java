package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class y8 implements org.telegram.ui.Components.za {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y8(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.za
    public final boolean a() {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Components.za
    public final void b(org.telegram.ui.Components.bc bcVar) {
        switch (this.a) {
            case 2:
                org.telegram.ui.Components.fb fbVar = bcVar.e;
                cn cnVar = (cn) this.b;
                fh.g c10 = cnVar.K.c(fbVar, null, true);
                gh.e eVar = new gh.e(cnVar.za);
                eVar.e = new g2.c(9);
                float N = org.telegram.messenger.g0.N(0.5f);
                float N2 = org.telegram.messenger.g0.N(0.5f);
                eVar.f = N;
                eVar.h = N2;
                c10.p(eVar);
                c10.r(org.telegram.messenger.g0.L(16.0f));
                fbVar.setCustomBackground(c10);
                break;
            case 4:
                zw zwVar = (zw) this.b;
                UndoView undoView = zwVar.y0[0];
                if (undoView != null && undoView.getVisibility() == 0) {
                    zwVar.y0[0].d(2, true);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.za
    public final void c(float f10) {
        switch (this.a) {
            case 0:
                i9 i9Var = (i9) this.b;
                i9Var.S = Math.max(0.0f, (f10 - i9Var.T) - i9Var.R);
                i9Var.g0();
                break;
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.b;
                contactsActivity.j0 = Math.max(0.0f, (f10 - contactsActivity.k0) - contactsActivity.i0);
                contactsActivity.j0();
                break;
            case 4:
                zw zwVar = (zw) this.b;
                UndoView undoView = zwVar.y0[0];
                if (undoView == null || undoView.getVisibility() != 0) {
                    zwVar.v1 = Math.max(0.0f, (f10 - zwVar.g4) - zwVar.j4);
                    zwVar.k5();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.za
    public final /* synthetic */ void d(org.telegram.ui.Components.bc bcVar) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Components.za
    public final boolean e() {
        switch (this.a) {
            case 8:
                if (((ProfileActivity) this.b).u5 == null) {
                }
                break;
        }
        return true;
    }

    @Override // org.telegram.ui.Components.za
    public final int f(int i7) {
        int i10;
        int i11;
        xq0 xq0Var;
        int L;
        switch (this.a) {
            case 0:
                i9 i9Var = (i9) this.b;
                i10 = i9Var.T;
                i11 = i9Var.R;
                break;
            case 1:
                return ((rc) this.b).O.getMeasuredHeight();
            case 2:
                cn cnVar = (cn) this.b;
                if (i7 == 1) {
                    return 0;
                }
                return Math.round(cnVar.T.getInputBubbleHeight() + org.telegram.messenger.g0.L(16.0f) + cnVar.s9(org.telegram.ui.Components.i11.c) + cnVar.w.d());
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.b;
                i10 = contactsActivity.k0;
                i11 = contactsActivity.i0;
                break;
            case 4:
                zw zwVar = (zw) this.b;
                return zwVar.Z2 != 0 ? org.telegram.messenger.g0.L(60.0f) + zwVar.g4 : zwVar.w3();
            case 5:
                i11 = ((me0) this.b).L;
                i10 = org.telegram.messenger.g0.L(64.0f);
                break;
            case 6:
                PhotoViewer photoViewer = ((sq0) this.b).n0;
                int i12 = 0;
                if (!photoViewer.Q4) {
                    di.b4 b4Var = photoViewer.i0;
                    if (b4Var != null && b4Var.getVisibility() == 0) {
                        i12 = (int) ((photoViewer.i0.getAlpha() * photoViewer.i0.getHeight()) + 0);
                    }
                    org.telegram.ui.Components.l20 l20Var = photoViewer.l1;
                    return (l20Var == null || !l20Var.c()) ? i12 : (org.telegram.messenger.g0.Q1() || photoViewer.e0.getMeasuredHeight() > photoViewer.e0.getMeasuredWidth()) ? (int) ((photoViewer.l1.getAlpha() * photoViewer.l1.getHeight()) + i12) : i12;
                }
                cp0 cp0Var = photoViewer.U1;
                if (cp0Var != null) {
                    i12 = cp0Var.L.l;
                    if (cp0Var.getVisibility() == 0 && ((xq0Var = photoViewer.d) == null || !xq0Var.A())) {
                        i12 = org.telegram.messenger.k5.C(12.0f, photoViewer.U1.getEditTextHeight(), i12);
                    }
                }
                bi.m5 m5Var = photoViewer.P0;
                if (m5Var == null || m5Var.getVisibility() != 0) {
                    return i12;
                }
                cp0 cp0Var2 = photoViewer.U1;
                return (cp0Var2 == null || !cp0Var2.L.c()) ? i12 + photoViewer.P0.getHeight() : i12;
            case 7:
                return ((PremiumPreviewFragment) this.b).o0.d;
            case 8:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                int i13 = 0;
                if (profileActivity.u5 == null) {
                    L = profileActivity.L6 + profileActivity.K6;
                } else {
                    L = ((int) (((org.telegram.messenger.g0.L(52.0f) - profileActivity.u5.getTranslationY()) - (((1.0f - profileActivity.v5[1].getAlpha()) * org.telegram.messenger.g0.L(72.0f)) * profileActivity.N.r0(9, false))) - (((1.0f - profileActivity.v5[0].getAlpha()) * org.telegram.messenger.g0.L(72.0f)) * profileActivity.N.r0(8, true)))) + profileActivity.L6 + profileActivity.K6;
                }
                yv0 yv0Var = profileActivity.N;
                float r02 = (yv0Var == null || yv0Var.a0 == null) ? 0.0f : yv0Var.r0(14, false);
                if (r02 <= 0.0f) {
                    return L;
                }
                org.telegram.ui.Components.up0 up0Var = profileActivity.N.a0;
                View view = profileActivity.fragmentView;
                FrameLayout frameLayout = up0Var.r;
                if (view != null && frameLayout != null && frameLayout.getVisibility() == 0 && frameLayout.getAlpha() > 0.0f) {
                    view.getLocationInWindow(new int[2]);
                    frameLayout.getLocationInWindow(new int[2]);
                    i13 = Math.max(0, (int) (frameLayout.getAlpha() * ((view.getHeight() + r7[1]) - r5[1])));
                }
                return org.telegram.messenger.g0.W1(Math.min(1.0f, r02), L, Math.max(L, i13));
            default:
                z91 z91Var = (z91) this.b;
                vq0 vq0Var = z91Var.o0;
                if (vq0Var == null || vq0Var.getVisibility() != 0) {
                    return 0;
                }
                return z91Var.o0.getMeasuredHeight();
        }
        return i10 + i11;
    }

    @Override // org.telegram.ui.Components.za
    public final /* synthetic */ boolean g(int i7) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Components.za
    public final int h(int i7) {
        org.telegram.ui.ActionBar.l lVar;
        int i10;
        int max;
        int max2;
        org.telegram.ui.ActionBar.l lVar2;
        org.telegram.ui.ActionBar.l lVar3;
        org.telegram.ui.ActionBar.l lVar4;
        int i11;
        org.telegram.ui.ActionBar.l lVar5;
        switch (this.a) {
            case 0:
                return 0;
            case 1:
                return 0;
            case 2:
                int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + org.telegram.messenger.g0.m;
                cn cnVar = (cn) this.b;
                lVar = ((org.telegram.ui.ActionBar.f2) cnVar).actionBar;
                if (lVar != null) {
                    lVar2 = ((org.telegram.ui.ActionBar.f2) cnVar).actionBar;
                    int measuredHeight = lVar2.getMeasuredHeight();
                    lVar3 = ((org.telegram.ui.ActionBar.f2) cnVar).actionBar;
                    i10 = lVar3.getTop() + measuredHeight;
                } else {
                    i10 = 0;
                }
                max = Math.max(currentActionBarHeight, i10);
                max2 = (int) Math.max(0.0f, cnVar.O9);
                break;
            case 3:
                return 0;
            case 4:
                zw zwVar = (zw) this.b;
                lVar4 = ((org.telegram.ui.ActionBar.f2) zwVar).actionBar;
                int i12 = 0;
                if (lVar4 != null) {
                    lVar5 = ((org.telegram.ui.ActionBar.f2) zwVar).actionBar;
                    i11 = lVar5.getMeasuredHeight();
                } else {
                    i11 = 0;
                }
                pw pwVar = zwVar.z0;
                int measuredHeight2 = i11 + ((pwVar == null || pwVar.getVisibility() != 0) ? 0 : zwVar.z0.getMeasuredHeight());
                org.telegram.ui.Components.or orVar = zwVar.K1;
                int height = measuredHeight2 + (orVar != null ? orVar.getHeight() : 0);
                sv svVar = zwVar.E0;
                if (svVar != null && zwVar.G0) {
                    i12 = (int) ((1.0f - svVar.getCollapsedProgress()) * org.telegram.messenger.g0.L(81.0f));
                }
                return org.telegram.messenger.g0.L(48.0f) + height + i12;
            case 5:
                return 0;
            case 6:
                return org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + org.telegram.messenger.g0.m + ((int) (((sq0) this.b).n0.V1.getAlpha() * r4.V1.getEditTextHeight()));
            case 7:
                return 0;
            case 8:
                max2 = org.telegram.messenger.g0.m;
                max = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                break;
            default:
                return 0;
        }
        return max + max2;
    }

    private final /* synthetic */ void A(org.telegram.ui.Components.bc bcVar) {
    }

    private final /* synthetic */ void B(org.telegram.ui.Components.bc bcVar) {
    }

    private final /* synthetic */ void C(org.telegram.ui.Components.bc bcVar) {
    }

    private final /* synthetic */ void D(org.telegram.ui.Components.bc bcVar) {
    }

    private final /* synthetic */ void E(org.telegram.ui.Components.bc bcVar) {
    }

    private final /* synthetic */ void F(org.telegram.ui.Components.bc bcVar) {
    }

    private final /* synthetic */ void G(org.telegram.ui.Components.bc bcVar) {
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

    private final /* synthetic */ void p(org.telegram.ui.Components.bc bcVar) {
    }

    private final /* synthetic */ void q(org.telegram.ui.Components.bc bcVar) {
    }

    private final /* synthetic */ void r(org.telegram.ui.Components.bc bcVar) {
    }

    private final /* synthetic */ void s(org.telegram.ui.Components.bc bcVar) {
    }

    private final /* synthetic */ void t(org.telegram.ui.Components.bc bcVar) {
    }

    private final /* synthetic */ void u(org.telegram.ui.Components.bc bcVar) {
    }

    private final /* synthetic */ void v(org.telegram.ui.Components.bc bcVar) {
    }

    private final /* synthetic */ void w(org.telegram.ui.Components.bc bcVar) {
    }

    private final /* synthetic */ void x(org.telegram.ui.Components.bc bcVar) {
    }

    private final /* synthetic */ void y(org.telegram.ui.Components.bc bcVar) {
    }

    private final /* synthetic */ void z(org.telegram.ui.Components.bc bcVar) {
    }
}
