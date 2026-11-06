package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class y8 implements org.telegram.ui.Components.ab {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y8(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.ab
    public final boolean a() {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Components.ab
    public final void b(org.telegram.ui.Components.cc ccVar) {
        switch (this.a) {
            case 2:
                org.telegram.ui.Components.gb gbVar = ccVar.e;
                an anVar = (an) this.b;
                fh.g c10 = anVar.K.c(gbVar, null, true);
                gh.e eVar = new gh.e(anVar.xa);
                eVar.e = new g2.c(9);
                float N = org.telegram.messenger.g0.N(0.5f);
                float N2 = org.telegram.messenger.g0.N(0.5f);
                eVar.f = N;
                eVar.h = N2;
                c10.p(eVar);
                c10.r(org.telegram.messenger.g0.L(16.0f));
                gbVar.setCustomBackground(c10);
                break;
            case 4:
                ww wwVar = (ww) this.b;
                UndoView undoView = wwVar.y0[0];
                if (undoView != null && undoView.getVisibility() == 0) {
                    wwVar.y0[0].d(2, true);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.ab
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
                ww wwVar = (ww) this.b;
                UndoView undoView = wwVar.y0[0];
                if (undoView == null || undoView.getVisibility() != 0) {
                    wwVar.u1 = Math.max(0.0f, (f10 - wwVar.f4) - wwVar.i4);
                    wwVar.k5();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.ab
    public final /* synthetic */ void d(org.telegram.ui.Components.cc ccVar) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Components.ab
    public final boolean e() {
        switch (this.a) {
            case 8:
                if (((ProfileActivity) this.b).s5 == null) {
                }
                break;
        }
        return true;
    }

    @Override // org.telegram.ui.Components.ab
    public final int f(int i7) {
        int i10;
        int i11;
        tq0 tq0Var;
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
                an anVar = (an) this.b;
                if (i7 == 1) {
                    return 0;
                }
                return Math.round(anVar.T.getInputBubbleHeight() + org.telegram.messenger.g0.L(16.0f) + anVar.r9(org.telegram.ui.Components.c11.c) + anVar.w.d());
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.b;
                i10 = contactsActivity.k0;
                i11 = contactsActivity.i0;
                break;
            case 4:
                ww wwVar = (ww) this.b;
                return wwVar.Y2 != 0 ? org.telegram.messenger.g0.L(60.0f) + wwVar.f4 : wwVar.w3();
            case 5:
                i11 = ((je0) this.b).L;
                i10 = org.telegram.messenger.g0.L(64.0f);
                break;
            case 6:
                PhotoViewer photoViewer = ((oq0) this.b).n0;
                int i12 = 0;
                if (!photoViewer.Q4) {
                    di.a4 a4Var = photoViewer.i0;
                    if (a4Var != null && a4Var.getVisibility() == 0) {
                        i12 = (int) ((photoViewer.i0.getAlpha() * photoViewer.i0.getHeight()) + 0);
                    }
                    org.telegram.ui.Components.l20 l20Var = photoViewer.l1;
                    return (l20Var == null || !l20Var.c()) ? i12 : (org.telegram.messenger.g0.Q1() || photoViewer.e0.getMeasuredHeight() > photoViewer.e0.getMeasuredWidth()) ? (int) ((photoViewer.l1.getAlpha() * photoViewer.l1.getHeight()) + i12) : i12;
                }
                yo0 yo0Var = photoViewer.U1;
                if (yo0Var != null) {
                    i12 = yo0Var.L.l;
                    if (yo0Var.getVisibility() == 0 && ((tq0Var = photoViewer.d) == null || !tq0Var.A())) {
                        i12 = org.telegram.messenger.k5.C(12.0f, photoViewer.U1.getEditTextHeight(), i12);
                    }
                }
                bi.m5 m5Var = photoViewer.P0;
                if (m5Var == null || m5Var.getVisibility() != 0) {
                    return i12;
                }
                yo0 yo0Var2 = photoViewer.U1;
                return (yo0Var2 == null || !yo0Var2.L.c()) ? i12 + photoViewer.P0.getHeight() : i12;
            case 7:
                return ((PremiumPreviewFragment) this.b).o0.d;
            case 8:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                int i13 = 0;
                if (profileActivity.s5 == null) {
                    L = profileActivity.I6 + profileActivity.H6;
                } else {
                    L = ((int) (((org.telegram.messenger.g0.L(52.0f) - profileActivity.s5.getTranslationY()) - (((1.0f - profileActivity.t5[1].getAlpha()) * org.telegram.messenger.g0.L(72.0f)) * profileActivity.N.r0(9, false))) - (((1.0f - profileActivity.t5[0].getAlpha()) * org.telegram.messenger.g0.L(72.0f)) * profileActivity.N.r0(8, true)))) + profileActivity.I6 + profileActivity.H6;
                }
                vv0 vv0Var = profileActivity.N;
                float r02 = (vv0Var == null || vv0Var.a0 == null) ? 0.0f : vv0Var.r0(14, false);
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
                v91 v91Var = (v91) this.b;
                rq0 rq0Var = v91Var.o0;
                if (rq0Var == null || rq0Var.getVisibility() != 0) {
                    return 0;
                }
                return v91Var.o0.getMeasuredHeight();
        }
        return i10 + i11;
    }

    @Override // org.telegram.ui.Components.ab
    public final /* synthetic */ boolean g(int i7) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Components.ab
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
                kVar = ((org.telegram.ui.ActionBar.f2) anVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.f2) anVar).actionBar;
                    int measuredHeight = kVar2.getMeasuredHeight();
                    kVar3 = ((org.telegram.ui.ActionBar.f2) anVar).actionBar;
                    i10 = kVar3.getTop() + measuredHeight;
                } else {
                    i10 = 0;
                }
                max = Math.max(currentActionBarHeight, i10);
                max2 = (int) Math.max(0.0f, anVar.M9);
                break;
            case 3:
                return 0;
            case 4:
                ww wwVar = (ww) this.b;
                kVar4 = ((org.telegram.ui.ActionBar.f2) wwVar).actionBar;
                int i12 = 0;
                if (kVar4 != null) {
                    kVar5 = ((org.telegram.ui.ActionBar.f2) wwVar).actionBar;
                    i11 = kVar5.getMeasuredHeight();
                } else {
                    i11 = 0;
                }
                mw mwVar = wwVar.z0;
                int measuredHeight2 = i11 + ((mwVar == null || mwVar.getVisibility() != 0) ? 0 : wwVar.z0.getMeasuredHeight());
                org.telegram.ui.Components.pr prVar = wwVar.J1;
                int height = measuredHeight2 + (prVar != null ? prVar.getHeight() : 0);
                pv pvVar = wwVar.E0;
                if (pvVar != null && wwVar.G0) {
                    i12 = (int) ((1.0f - pvVar.getCollapsedProgress()) * org.telegram.messenger.g0.L(81.0f));
                }
                return org.telegram.messenger.g0.L(48.0f) + height + i12;
            case 5:
                return 0;
            case 6:
                return org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.m + ((int) (((oq0) this.b).n0.V1.getAlpha() * r4.V1.getEditTextHeight()));
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

    private final /* synthetic */ void A(org.telegram.ui.Components.cc ccVar) {
    }

    private final /* synthetic */ void B(org.telegram.ui.Components.cc ccVar) {
    }

    private final /* synthetic */ void C(org.telegram.ui.Components.cc ccVar) {
    }

    private final /* synthetic */ void D(org.telegram.ui.Components.cc ccVar) {
    }

    private final /* synthetic */ void E(org.telegram.ui.Components.cc ccVar) {
    }

    private final /* synthetic */ void F(org.telegram.ui.Components.cc ccVar) {
    }

    private final /* synthetic */ void G(org.telegram.ui.Components.cc ccVar) {
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

    private final /* synthetic */ void p(org.telegram.ui.Components.cc ccVar) {
    }

    private final /* synthetic */ void q(org.telegram.ui.Components.cc ccVar) {
    }

    private final /* synthetic */ void r(org.telegram.ui.Components.cc ccVar) {
    }

    private final /* synthetic */ void s(org.telegram.ui.Components.cc ccVar) {
    }

    private final /* synthetic */ void t(org.telegram.ui.Components.cc ccVar) {
    }

    private final /* synthetic */ void u(org.telegram.ui.Components.cc ccVar) {
    }

    private final /* synthetic */ void v(org.telegram.ui.Components.cc ccVar) {
    }

    private final /* synthetic */ void w(org.telegram.ui.Components.cc ccVar) {
    }

    private final /* synthetic */ void x(org.telegram.ui.Components.cc ccVar) {
    }

    private final /* synthetic */ void y(org.telegram.ui.Components.cc ccVar) {
    }

    private final /* synthetic */ void z(org.telegram.ui.Components.cc ccVar) {
    }
}
