package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class z8 implements org.telegram.ui.Components.nb {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z8(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.nb
    public final boolean a() {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Components.nb
    public final void b(org.telegram.ui.Components.pc pcVar) {
        switch (this.a) {
            case 2:
                org.telegram.ui.Components.tb tbVar = pcVar.e;
                eo eoVar = (eo) this.b;
                bh.d c10 = eoVar.J.c(tbVar, null, true);
                ch.e eVar = new ch.e(eoVar.ea);
                eVar.e = new androidx.emoji2.text.w(27);
                float dpf2 = AndroidUtilities.dpf2(0.5f);
                float dpf22 = AndroidUtilities.dpf2(0.5f);
                eVar.f = dpf2;
                eVar.h = dpf22;
                c10.n(eVar);
                c10.p(AndroidUtilities.dp(16.0f));
                tbVar.setCustomBackground(c10);
                break;
            case 4:
                wy wyVar = (wy) this.b;
                UndoView undoView = wyVar.y0[0];
                if (undoView != null && undoView.getVisibility() == 0) {
                    wyVar.y0[0].e(2, true);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.nb
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
                wy wyVar = (wy) this.b;
                UndoView undoView = wyVar.y0[0];
                if (undoView == null || undoView.getVisibility() != 0) {
                    wyVar.u1 = Math.max(0.0f, (f7 - wyVar.g4) - wyVar.j4);
                    wyVar.X4();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.nb
    public final /* synthetic */ void d(org.telegram.ui.Components.pc pcVar) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.nb
    public final boolean e() {
        switch (this.a) {
            case 8:
                if (((ProfileActivity) this.b).s5 == null) {
                }
                break;
        }
        return true;
    }

    @Override // org.telegram.ui.Components.nb
    public final int f(int i10) {
        int i11;
        int i12;
        cv0 cv0Var;
        switch (this.a) {
            case 0:
                k9 k9Var = (k9) this.b;
                i11 = k9Var.W;
                i12 = k9Var.U;
                break;
            case 1:
                return ((cd) this.b).O.getMeasuredHeight();
            case 2:
                eo eoVar = (eo) this.b;
                if (i10 == 1) {
                    return 0;
                }
                return Math.round(eoVar.S.getInputBubbleHeight() + AndroidUtilities.dp(16.0f) + eoVar.W8(org.telegram.ui.Components.g31.c) + eoVar.v.c());
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.b;
                i11 = contactsActivity.q0;
                i12 = contactsActivity.o0;
                break;
            case 4:
                wy wyVar = (wy) this.b;
                return wyVar.X2 != 0 ? AndroidUtilities.dp(60.0f) + wyVar.g4 : wyVar.n3();
            case 5:
                i12 = ((fh0) this.b).L;
                i11 = AndroidUtilities.dp(64.0f);
                break;
            case 6:
                PhotoViewer photoViewer = ((wu0) this.b).E0;
                int i13 = 0;
                if (!photoViewer.R4) {
                    bi.l4 l4Var = photoViewer.i0;
                    if (l4Var != null && l4Var.getVisibility() == 0) {
                        i13 = (int) ((photoViewer.i0.getAlpha() * photoViewer.i0.getHeight()) + 0);
                    }
                    org.telegram.ui.Components.f40 f40Var = photoViewer.l1;
                    return (f40Var == null || !f40Var.c()) ? i13 : (AndroidUtilities.isTablet() || photoViewer.e0.getMeasuredHeight() > photoViewer.e0.getMeasuredWidth()) ? (int) ((photoViewer.l1.getAlpha() * photoViewer.l1.getHeight()) + i13) : i13;
                }
                at0 at0Var = photoViewer.U1;
                if (at0Var != null) {
                    i13 = at0Var.L.l;
                    if (at0Var.getVisibility() == 0 && ((cv0Var = photoViewer.d) == null || !cv0Var.A())) {
                        i13 = org.telegram.messenger.a2.C(12.0f, photoViewer.U1.getEditTextHeight(), i13);
                    }
                }
                u5 u5Var = photoViewer.P0;
                if (u5Var == null || u5Var.getVisibility() != 0) {
                    return i13;
                }
                at0 at0Var2 = photoViewer.U1;
                return (at0Var2 == null || !at0Var2.L.c()) ? i13 + photoViewer.P0.getHeight() : i13;
            case 7:
                return ((PremiumPreviewFragment) this.b).o0.d;
            case 8:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                if (profileActivity.s5 == null) {
                    return profileActivity.l6 + profileActivity.k6;
                }
                return profileActivity.l6 + profileActivity.k6 + ((int) (((AndroidUtilities.dp(52.0f) - profileActivity.s5.getTranslationY()) - (profileActivity.t5[1].getTranslationY() * profileActivity.O.g0(9, false))) - (profileActivity.t5[0].getTranslationY() * profileActivity.O.g0(8, true))));
            default:
                ig1 ig1Var = (ig1) this.b;
                m91 m91Var = ig1Var.o0;
                if (m91Var == null || m91Var.getVisibility() != 0) {
                    return 0;
                }
                return ig1Var.o0.getMeasuredHeight();
        }
        return i11 + i12;
    }

    @Override // org.telegram.ui.Components.nb
    public final /* synthetic */ boolean g(int i10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Components.nb
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
                eo eoVar = (eo) this.b;
                lVar = ((org.telegram.ui.ActionBar.p2) eoVar).actionBar;
                if (lVar != null) {
                    lVar2 = ((org.telegram.ui.ActionBar.p2) eoVar).actionBar;
                    int measuredHeight = lVar2.getMeasuredHeight();
                    lVar3 = ((org.telegram.ui.ActionBar.p2) eoVar).actionBar;
                    i11 = lVar3.getTop() + measuredHeight;
                } else {
                    i11 = 0;
                }
                max = Math.max(currentActionBarHeight, i11);
                max2 = (int) Math.max(0.0f, eoVar.t9);
                break;
            case 3:
                return 0;
            case 4:
                wy wyVar = (wy) this.b;
                lVar4 = ((org.telegram.ui.ActionBar.p2) wyVar).actionBar;
                int i13 = 0;
                if (lVar4 != null) {
                    lVar5 = ((org.telegram.ui.ActionBar.p2) wyVar).actionBar;
                    i12 = lVar5.getMeasuredHeight();
                } else {
                    i12 = 0;
                }
                uw uwVar = wyVar.z0;
                int measuredHeight2 = i12 + ((uwVar == null || uwVar.getVisibility() != 0) ? 0 : wyVar.z0.getMeasuredHeight());
                org.telegram.ui.Components.qs qsVar = wyVar.J1;
                int height = measuredHeight2 + (qsVar != null ? qsVar.getHeight() : 0);
                nx nxVar = wyVar.E0;
                if (nxVar != null && wyVar.G0) {
                    i13 = (int) ((1.0f - nxVar.getCollapsedProgress()) * AndroidUtilities.dp(81.0f));
                }
                return AndroidUtilities.dp(48.0f) + height + i13;
            case 5:
                return 0;
            case 6:
                return org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight + ((int) (((wu0) this.b).E0.V1.getAlpha() * r4.V1.getEditTextHeight()));
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

    private final /* synthetic */ void A(org.telegram.ui.Components.pc pcVar) {
    }

    private final /* synthetic */ void B(org.telegram.ui.Components.pc pcVar) {
    }

    private final /* synthetic */ void C(org.telegram.ui.Components.pc pcVar) {
    }

    private final /* synthetic */ void D(org.telegram.ui.Components.pc pcVar) {
    }

    private final /* synthetic */ void E(org.telegram.ui.Components.pc pcVar) {
    }

    private final /* synthetic */ void F(org.telegram.ui.Components.pc pcVar) {
    }

    private final /* synthetic */ void G(org.telegram.ui.Components.pc pcVar) {
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

    private final /* synthetic */ void p(org.telegram.ui.Components.pc pcVar) {
    }

    private final /* synthetic */ void q(org.telegram.ui.Components.pc pcVar) {
    }

    private final /* synthetic */ void r(org.telegram.ui.Components.pc pcVar) {
    }

    private final /* synthetic */ void s(org.telegram.ui.Components.pc pcVar) {
    }

    private final /* synthetic */ void t(org.telegram.ui.Components.pc pcVar) {
    }

    private final /* synthetic */ void u(org.telegram.ui.Components.pc pcVar) {
    }

    private final /* synthetic */ void v(org.telegram.ui.Components.pc pcVar) {
    }

    private final /* synthetic */ void w(org.telegram.ui.Components.pc pcVar) {
    }

    private final /* synthetic */ void x(org.telegram.ui.Components.pc pcVar) {
    }

    private final /* synthetic */ void y(org.telegram.ui.Components.pc pcVar) {
    }

    private final /* synthetic */ void z(org.telegram.ui.Components.pc pcVar) {
    }
}
