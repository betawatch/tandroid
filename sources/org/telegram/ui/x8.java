package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class x8 implements org.telegram.ui.Components.za {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x8(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.za
    public final boolean a() {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Components.za
    public final void b(org.telegram.ui.Components.ac acVar) {
        switch (this.a) {
            case 2:
                org.telegram.ui.Components.fb fbVar = acVar.e;
                wm wmVar = (wm) this.b;
                gh.g c2 = wmVar.L.c(fbVar, null, true);
                hh.e eVar = new hh.e(wmVar.ya);
                eVar.e = new gi.i8(9);
                float N = org.telegram.messenger.g0.N(0.5f);
                float N2 = org.telegram.messenger.g0.N(0.5f);
                eVar.f = N;
                eVar.h = N2;
                c2.p(eVar);
                c2.r(org.telegram.messenger.g0.L(16.0f));
                fbVar.setCustomBackground(c2);
                break;
            case 4:
                uw uwVar = (uw) this.b;
                UndoView undoView = uwVar.z0[0];
                if (undoView != null && undoView.getVisibility() == 0) {
                    uwVar.z0[0].d(2, true);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.za
    public final void c(float f10) {
        switch (this.a) {
            case 0:
                h9 h9Var = (h9) this.b;
                h9Var.T = Math.max(0.0f, (f10 - h9Var.U) - h9Var.S);
                h9Var.g0();
                break;
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.b;
                contactsActivity.k0 = Math.max(0.0f, (f10 - contactsActivity.l0) - contactsActivity.j0);
                contactsActivity.j0();
                break;
            case 4:
                uw uwVar = (uw) this.b;
                UndoView undoView = uwVar.z0[0];
                if (undoView == null || undoView.getVisibility() != 0) {
                    uwVar.v1 = Math.max(0.0f, (f10 - uwVar.g4) - uwVar.j4);
                    uwVar.k5();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.za
    public final /* synthetic */ void d(org.telegram.ui.Components.ac acVar) {
        int i3 = this.a;
    }

    @Override // org.telegram.ui.Components.za
    public final boolean e() {
        switch (this.a) {
            case 8:
                if (((ProfileActivity) this.b).t5 == null) {
                }
                break;
        }
        return true;
    }

    @Override // org.telegram.ui.Components.za
    public final int f(int i3) {
        int i10;
        int i11;
        kq0 kq0Var;
        int L;
        switch (this.a) {
            case 0:
                h9 h9Var = (h9) this.b;
                i10 = h9Var.U;
                i11 = h9Var.S;
                break;
            case 1:
                return ((pc) this.b).P.getMeasuredHeight();
            case 2:
                wm wmVar = (wm) this.b;
                if (i3 == 1) {
                    return 0;
                }
                return Math.round(wmVar.U.getInputBubbleHeight() + org.telegram.messenger.g0.L(16.0f) + wmVar.r9(org.telegram.ui.Components.c11.c) + wmVar.w.d());
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.b;
                i10 = contactsActivity.l0;
                i11 = contactsActivity.j0;
                break;
            case 4:
                uw uwVar = (uw) this.b;
                return uwVar.Z2 != 0 ? org.telegram.messenger.g0.L(60.0f) + uwVar.g4 : uwVar.w3();
            case 5:
                i11 = ((ee0) this.b).M;
                i10 = org.telegram.messenger.g0.L(64.0f);
                break;
            case 6:
                PhotoViewer photoViewer = ((gq0) this.b).o0;
                int i12 = 0;
                if (!photoViewer.S4) {
                    yg0 yg0Var = photoViewer.j0;
                    if (yg0Var != null && yg0Var.getVisibility() == 0) {
                        i12 = (int) ((photoViewer.j0.getAlpha() * photoViewer.j0.getHeight()) + 0);
                    }
                    org.telegram.ui.Components.h20 h20Var = photoViewer.m1;
                    return (h20Var == null || !h20Var.c()) ? i12 : (org.telegram.messenger.g0.Q1() || photoViewer.f0.getMeasuredHeight() > photoViewer.f0.getMeasuredWidth()) ? (int) ((photoViewer.m1.getAlpha() * photoViewer.m1.getHeight()) + i12) : i12;
                }
                qo0 qo0Var = photoViewer.V1;
                if (qo0Var != null) {
                    i12 = qo0Var.M.l;
                    if (qo0Var.getVisibility() == 0 && ((kq0Var = photoViewer.d) == null || !kq0Var.A())) {
                        i12 = org.telegram.messenger.k5.C(12.0f, photoViewer.V1.getEditTextHeight(), i12);
                    }
                }
                ci.t4 t4Var = photoViewer.Q0;
                if (t4Var == null || t4Var.getVisibility() != 0) {
                    return i12;
                }
                qo0 qo0Var2 = photoViewer.V1;
                return (qo0Var2 == null || !qo0Var2.M.c()) ? i12 + photoViewer.Q0.getHeight() : i12;
            case 7:
                return ((PremiumPreviewFragment) this.b).p0.d;
            case 8:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                int i13 = 0;
                if (profileActivity.t5 == null) {
                    L = profileActivity.J6 + profileActivity.I6;
                } else {
                    L = ((int) (((org.telegram.messenger.g0.L(52.0f) - profileActivity.t5.getTranslationY()) - (((1.0f - profileActivity.u5[1].getAlpha()) * org.telegram.messenger.g0.L(72.0f)) * profileActivity.O.r0(9, false))) - (((1.0f - profileActivity.u5[0].getAlpha()) * org.telegram.messenger.g0.L(72.0f)) * profileActivity.O.r0(8, true)))) + profileActivity.J6 + profileActivity.I6;
                }
                mv0 mv0Var = profileActivity.O;
                float r02 = (mv0Var == null || mv0Var.b0 == null) ? 0.0f : mv0Var.r0(14, false);
                if (r02 <= 0.0f) {
                    return L;
                }
                org.telegram.ui.Components.vp0 vp0Var = profileActivity.O.b0;
                View view = profileActivity.fragmentView;
                FrameLayout frameLayout = vp0Var.r;
                if (view != null && frameLayout != null && frameLayout.getVisibility() == 0 && frameLayout.getAlpha() > 0.0f) {
                    view.getLocationInWindow(new int[2]);
                    frameLayout.getLocationInWindow(new int[2]);
                    i13 = Math.max(0, (int) (frameLayout.getAlpha() * ((view.getHeight() + r7[1]) - r5[1])));
                }
                return org.telegram.messenger.g0.W1(Math.min(1.0f, r02), L, Math.max(L, i13));
            default:
                m91 m91Var = (m91) this.b;
                yg0 yg0Var2 = m91Var.p0;
                if (yg0Var2 == null || yg0Var2.getVisibility() != 0) {
                    return 0;
                }
                return m91Var.p0.getMeasuredHeight();
        }
        return i10 + i11;
    }

    @Override // org.telegram.ui.Components.za
    public final /* synthetic */ boolean g(int i3) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Components.za
    public final int h(int i3) {
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
                wm wmVar = (wm) this.b;
                kVar = ((org.telegram.ui.ActionBar.d2) wmVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.d2) wmVar).actionBar;
                    int measuredHeight = kVar2.getMeasuredHeight();
                    kVar3 = ((org.telegram.ui.ActionBar.d2) wmVar).actionBar;
                    i10 = kVar3.getTop() + measuredHeight;
                } else {
                    i10 = 0;
                }
                max = Math.max(currentActionBarHeight, i10);
                max2 = (int) Math.max(0.0f, wmVar.N9);
                break;
            case 3:
                return 0;
            case 4:
                uw uwVar = (uw) this.b;
                kVar4 = ((org.telegram.ui.ActionBar.d2) uwVar).actionBar;
                int i12 = 0;
                if (kVar4 != null) {
                    kVar5 = ((org.telegram.ui.ActionBar.d2) uwVar).actionBar;
                    i11 = kVar5.getMeasuredHeight();
                } else {
                    i11 = 0;
                }
                jw jwVar = uwVar.A0;
                int measuredHeight2 = i11 + ((jwVar == null || jwVar.getVisibility() != 0) ? 0 : uwVar.A0.getMeasuredHeight());
                org.telegram.ui.Components.pr prVar = uwVar.K1;
                int height = measuredHeight2 + (prVar != null ? prVar.getHeight() : 0);
                mv mvVar = uwVar.F0;
                if (mvVar != null && uwVar.H0) {
                    i12 = (int) ((1.0f - mvVar.getCollapsedProgress()) * org.telegram.messenger.g0.L(81.0f));
                }
                return org.telegram.messenger.g0.L(48.0f) + height + i12;
            case 5:
                return 0;
            case 6:
                return org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.m + ((int) (((gq0) this.b).o0.W1.getAlpha() * r4.W1.getEditTextHeight()));
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

    private final /* synthetic */ void A(org.telegram.ui.Components.ac acVar) {
    }

    private final /* synthetic */ void B(org.telegram.ui.Components.ac acVar) {
    }

    private final /* synthetic */ void C(org.telegram.ui.Components.ac acVar) {
    }

    private final /* synthetic */ void D(org.telegram.ui.Components.ac acVar) {
    }

    private final /* synthetic */ void E(org.telegram.ui.Components.ac acVar) {
    }

    private final /* synthetic */ void F(org.telegram.ui.Components.ac acVar) {
    }

    private final /* synthetic */ void G(org.telegram.ui.Components.ac acVar) {
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

    private final /* synthetic */ void p(org.telegram.ui.Components.ac acVar) {
    }

    private final /* synthetic */ void q(org.telegram.ui.Components.ac acVar) {
    }

    private final /* synthetic */ void r(org.telegram.ui.Components.ac acVar) {
    }

    private final /* synthetic */ void s(org.telegram.ui.Components.ac acVar) {
    }

    private final /* synthetic */ void t(org.telegram.ui.Components.ac acVar) {
    }

    private final /* synthetic */ void u(org.telegram.ui.Components.ac acVar) {
    }

    private final /* synthetic */ void v(org.telegram.ui.Components.ac acVar) {
    }

    private final /* synthetic */ void w(org.telegram.ui.Components.ac acVar) {
    }

    private final /* synthetic */ void x(org.telegram.ui.Components.ac acVar) {
    }

    private final /* synthetic */ void y(org.telegram.ui.Components.ac acVar) {
    }

    private final /* synthetic */ void z(org.telegram.ui.Components.ac acVar) {
    }
}
