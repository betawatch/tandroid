package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class y8 implements org.telegram.ui.Components.wa {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y8(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.wa
    public final boolean a() {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Components.wa
    public final void b(org.telegram.ui.Components.xb xbVar) {
        switch (this.a) {
            case 2:
                org.telegram.ui.Components.cb cbVar = xbVar.e;
                an anVar = (an) this.b;
                fh.g c10 = anVar.L.c(cbVar, null, true);
                gh.e eVar = new gh.e(anVar.Aa);
                eVar.e = new g0.e(11);
                float N = org.telegram.messenger.g0.N(0.5f);
                float N2 = org.telegram.messenger.g0.N(0.5f);
                eVar.f = N;
                eVar.h = N2;
                c10.p(eVar);
                c10.r(org.telegram.messenger.g0.L(16.0f));
                cbVar.setCustomBackground(c10);
                break;
            case 4:
                yw ywVar = (yw) this.b;
                UndoView undoView = ywVar.z0[0];
                if (undoView != null && undoView.getVisibility() == 0) {
                    ywVar.z0[0].d(2, true);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.wa
    public final void c(float f10) {
        switch (this.a) {
            case 0:
                i9 i9Var = (i9) this.b;
                i9Var.T = Math.max(0.0f, (f10 - i9Var.U) - i9Var.S);
                i9Var.g0();
                break;
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.b;
                contactsActivity.k0 = Math.max(0.0f, (f10 - contactsActivity.l0) - contactsActivity.j0);
                contactsActivity.j0();
                break;
            case 4:
                yw ywVar = (yw) this.b;
                UndoView undoView = ywVar.z0[0];
                if (undoView == null || undoView.getVisibility() != 0) {
                    ywVar.w1 = Math.max(0.0f, (f10 - ywVar.h4) - ywVar.k4);
                    ywVar.k5();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.wa
    public final /* synthetic */ void d(org.telegram.ui.Components.xb xbVar) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Components.wa
    public final boolean e() {
        switch (this.a) {
            case 8:
                if (((ProfileActivity) this.b).w5 == null) {
                }
                break;
        }
        return true;
    }

    @Override // org.telegram.ui.Components.wa
    public final int f(int i7) {
        int i10;
        int i11;
        sq0 sq0Var;
        int L;
        switch (this.a) {
            case 0:
                i9 i9Var = (i9) this.b;
                i10 = i9Var.U;
                i11 = i9Var.S;
                break;
            case 1:
                return ((qc) this.b).P.getMeasuredHeight();
            case 2:
                an anVar = (an) this.b;
                if (i7 == 1) {
                    return 0;
                }
                return Math.round(anVar.U.getInputBubbleHeight() + org.telegram.messenger.g0.L(16.0f) + anVar.t9(org.telegram.ui.Components.l11.c) + anVar.w.d());
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.b;
                i10 = contactsActivity.l0;
                i11 = contactsActivity.j0;
                break;
            case 4:
                yw ywVar = (yw) this.b;
                return ywVar.a3 != 0 ? org.telegram.messenger.g0.L(60.0f) + ywVar.h4 : ywVar.w3();
            case 5:
                i11 = ((je0) this.b).M;
                i10 = org.telegram.messenger.g0.L(64.0f);
                break;
            case 6:
                PhotoViewer photoViewer = ((oq0) this.b).o0;
                int i12 = 0;
                if (!photoViewer.R4) {
                    eh0 eh0Var = photoViewer.j0;
                    if (eh0Var != null && eh0Var.getVisibility() == 0) {
                        i12 = (int) ((photoViewer.j0.getAlpha() * photoViewer.j0.getHeight()) + 0);
                    }
                    org.telegram.ui.Components.o20 o20Var = photoViewer.m1;
                    return (o20Var == null || !o20Var.c()) ? i12 : (org.telegram.messenger.g0.Q1() || photoViewer.f0.getMeasuredHeight() > photoViewer.f0.getMeasuredWidth()) ? (int) ((photoViewer.m1.getAlpha() * photoViewer.m1.getHeight()) + i12) : i12;
                }
                xo0 xo0Var = photoViewer.V1;
                if (xo0Var != null) {
                    i12 = xo0Var.M.l;
                    if (xo0Var.getVisibility() == 0 && ((sq0Var = photoViewer.d) == null || !sq0Var.A())) {
                        i12 = org.telegram.messenger.k5.C(12.0f, photoViewer.V1.getEditTextHeight(), i12);
                    }
                }
                di.k4 k4Var = photoViewer.Q0;
                if (k4Var == null || k4Var.getVisibility() != 0) {
                    return i12;
                }
                xo0 xo0Var2 = photoViewer.V1;
                return (xo0Var2 == null || !xo0Var2.M.c()) ? i12 + photoViewer.Q0.getHeight() : i12;
            case 7:
                return ((PremiumPreviewFragment) this.b).p0.d;
            case 8:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                int i13 = 0;
                if (profileActivity.w5 == null) {
                    L = profileActivity.N6 + profileActivity.M6;
                } else {
                    L = ((int) (((org.telegram.messenger.g0.L(52.0f) - profileActivity.w5.getTranslationY()) - (((1.0f - profileActivity.x5[1].getAlpha()) * org.telegram.messenger.g0.L(72.0f)) * profileActivity.O.r0(9, false))) - (((1.0f - profileActivity.x5[0].getAlpha()) * org.telegram.messenger.g0.L(72.0f)) * profileActivity.O.r0(8, true)))) + profileActivity.N6 + profileActivity.M6;
                }
                uv0 uv0Var = profileActivity.O;
                float r02 = (uv0Var == null || uv0Var.b0 == null) ? 0.0f : uv0Var.r0(14, false);
                if (r02 <= 0.0f) {
                    return L;
                }
                org.telegram.ui.Components.wp0 wp0Var = profileActivity.O.b0;
                View view = profileActivity.fragmentView;
                FrameLayout frameLayout = wp0Var.r;
                if (view != null && frameLayout != null && frameLayout.getVisibility() == 0 && frameLayout.getAlpha() > 0.0f) {
                    view.getLocationInWindow(new int[2]);
                    frameLayout.getLocationInWindow(new int[2]);
                    i13 = Math.max(0, (int) (frameLayout.getAlpha() * ((view.getHeight() + r7[1]) - r5[1])));
                }
                return org.telegram.messenger.g0.W1(Math.min(1.0f, r02), L, Math.max(L, i13));
            default:
                u91 u91Var = (u91) this.b;
                eh0 eh0Var2 = u91Var.p0;
                if (eh0Var2 == null || eh0Var2.getVisibility() != 0) {
                    return 0;
                }
                return u91Var.p0.getMeasuredHeight();
        }
        return i10 + i11;
    }

    @Override // org.telegram.ui.Components.wa
    public final /* synthetic */ boolean g(int i7) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Components.wa
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
                an anVar = (an) this.b;
                kVar = ((org.telegram.ui.ActionBar.e2) anVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.e2) anVar).actionBar;
                    int measuredHeight = kVar2.getMeasuredHeight();
                    kVar3 = ((org.telegram.ui.ActionBar.e2) anVar).actionBar;
                    i10 = kVar3.getTop() + measuredHeight;
                } else {
                    i10 = 0;
                }
                max = Math.max(currentActionBarHeight, i10);
                max2 = (int) Math.max(0.0f, anVar.P9);
                break;
            case 3:
                return 0;
            case 4:
                yw ywVar = (yw) this.b;
                kVar4 = ((org.telegram.ui.ActionBar.e2) ywVar).actionBar;
                int i12 = 0;
                if (kVar4 != null) {
                    kVar5 = ((org.telegram.ui.ActionBar.e2) ywVar).actionBar;
                    i11 = kVar5.getMeasuredHeight();
                } else {
                    i11 = 0;
                }
                ow owVar = ywVar.A0;
                int measuredHeight2 = i11 + ((owVar == null || owVar.getVisibility() != 0) ? 0 : ywVar.A0.getMeasuredHeight());
                org.telegram.ui.Components.vr vrVar = ywVar.L1;
                int height = measuredHeight2 + (vrVar != null ? vrVar.getHeight() : 0);
                qv qvVar = ywVar.F0;
                if (qvVar != null && ywVar.H0) {
                    i12 = (int) ((1.0f - qvVar.getCollapsedProgress()) * org.telegram.messenger.g0.L(81.0f));
                }
                return org.telegram.messenger.g0.L(48.0f) + height + i12;
            case 5:
                return 0;
            case 6:
                return org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.m + ((int) (((oq0) this.b).o0.W1.getAlpha() * r4.W1.getEditTextHeight()));
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

    private final /* synthetic */ void A(org.telegram.ui.Components.xb xbVar) {
    }

    private final /* synthetic */ void B(org.telegram.ui.Components.xb xbVar) {
    }

    private final /* synthetic */ void C(org.telegram.ui.Components.xb xbVar) {
    }

    private final /* synthetic */ void D(org.telegram.ui.Components.xb xbVar) {
    }

    private final /* synthetic */ void E(org.telegram.ui.Components.xb xbVar) {
    }

    private final /* synthetic */ void F(org.telegram.ui.Components.xb xbVar) {
    }

    private final /* synthetic */ void G(org.telegram.ui.Components.xb xbVar) {
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

    private final /* synthetic */ void p(org.telegram.ui.Components.xb xbVar) {
    }

    private final /* synthetic */ void q(org.telegram.ui.Components.xb xbVar) {
    }

    private final /* synthetic */ void r(org.telegram.ui.Components.xb xbVar) {
    }

    private final /* synthetic */ void s(org.telegram.ui.Components.xb xbVar) {
    }

    private final /* synthetic */ void t(org.telegram.ui.Components.xb xbVar) {
    }

    private final /* synthetic */ void u(org.telegram.ui.Components.xb xbVar) {
    }

    private final /* synthetic */ void v(org.telegram.ui.Components.xb xbVar) {
    }

    private final /* synthetic */ void w(org.telegram.ui.Components.xb xbVar) {
    }

    private final /* synthetic */ void x(org.telegram.ui.Components.xb xbVar) {
    }

    private final /* synthetic */ void y(org.telegram.ui.Components.xb xbVar) {
    }

    private final /* synthetic */ void z(org.telegram.ui.Components.xb xbVar) {
    }
}
