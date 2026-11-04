package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wm b;

    public /* synthetic */ yd(wm wmVar, int i3) {
        this.a = i3;
        this.b = wmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        mj mjVar;
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.messenger.zi messageObject;
        int i3 = this.a;
        int i10 = 5;
        wm wmVar = this.b;
        switch (i3) {
            case 0:
                wmVar.c6 = null;
                if (wmVar.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wmVar.getParentActivity(), wmVar.ya);
                    boolean T = org.telegram.messenger.t3.T(wmVar.e);
                    org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                    if (!T || wmVar.e.megagroup) {
                        s1Var.U = org.telegram.messenger.bd.M0(2131749091, null);
                        s1Var.S = org.telegram.messenger.bd.M0(2131749090, null);
                    } else {
                        s1Var.U = org.telegram.messenger.bd.M0(2131749093, null);
                        s1Var.S = org.telegram.messenger.bd.M0(2131749092, null);
                    }
                    alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131749089, null), new de(wmVar, 2));
                    alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), new de(wmVar, 3));
                    wmVar.showDialog(s1Var);
                    break;
                }
                break;
            case 1:
                wmVar.m7();
                break;
            case 2:
                wm.l0(wmVar);
                break;
            case 3:
                org.telegram.messenger.g0.E2(wmVar.Z0);
                break;
            case 4:
                wmVar.Oa(null, wmVar.H8);
                wmVar.H8 = null;
                break;
            case 5:
                if (!org.telegram.ui.ActionBar.d2.hasSheets(wmVar) && (mjVar = wmVar.a0) != null) {
                    mjVar.setFieldFocused(true);
                    wmVar.a0.G0();
                    break;
                }
                break;
            case 6:
                wmVar.zd();
                wmVar.K9();
                org.telegram.messenger.g0.d0(wmVar.A0, new le(wmVar, i10));
                wmVar.I7();
                ej ejVar = wmVar.m3;
                if (ejVar != null) {
                    ejVar.setTranslationX(wmVar.l9() / 2.0f);
                }
                cj cjVar = wmVar.n3;
                if (cjVar != null) {
                    cjVar.setTranslationX(wmVar.l9() / 2.0f);
                }
                FrameLayout frameLayout = wmVar.f1;
                if (frameLayout != null) {
                    frameLayout.setTranslationX(wmVar.l9() / 2.0f);
                }
                wmVar.g7();
                wmVar.H7();
                break;
            case 7:
                l81 f02 = l81.f0(-wmVar.k6, 0L);
                f02.E = wmVar;
                wmVar.presentFragment(f02);
                break;
            case 8:
                wmVar.Ec(true);
                break;
            case 9:
                wmVar.y1.d(true);
                break;
            case 10:
                wmVar.resumeDelayedFragmentAnimation();
                tj tjVar = wmVar.qa;
                org.telegram.messenger.g0.r(tjVar);
                tjVar.run();
                wmVar.getNotificationCenter().o();
                break;
            case 11:
                wmVar.getNotificationCenter().j(wmVar.Z9);
                break;
            case 12:
                int childCount = wmVar.A0.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = wmVar.A0.getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.q1) {
                        org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) childAt;
                        if (q1Var2.getMessageObject().D == 4) {
                            q1Var2.G1();
                        }
                    }
                }
                break;
            case 13:
                wmVar.cc = true;
                wmVar.bd(true);
                break;
            case 14:
                dk dkVar = wmVar.yb;
                if (dkVar != null) {
                    dkVar.requestLayout();
                    break;
                }
                break;
            case 15:
                wm.S0(wmVar);
                break;
            case 16:
                TLRPC.UserFull userFull = wmVar.r8;
                wmVar.Kb(userFull != null ? userFull.theme : null);
                break;
            case 17:
                wm.p0(wmVar);
                break;
            case 18:
                wmVar.c8 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                wmVar.e8 = false;
                wmVar.f8 = 0L;
                wmVar.g8 = null;
                wmVar.h8 = null;
                wmVar.i8 = null;
                wmVar.j8 = -1;
                wmVar.d8 = false;
                wmVar.Cd(false);
                wmVar.l8 = null;
                break;
            case 19:
                yd ydVar = new yd(wmVar, 10);
                if (org.telegram.utils.twidget.p.x()) {
                    ydVar.run();
                    break;
                } else {
                    org.telegram.ui.Components.lt ltVar = new org.telegram.ui.Components.lt(ydVar, 21);
                    org.telegram.utils.twidget.p.h.add(ltVar);
                    org.telegram.messenger.g0.i3(ltVar, 150L);
                    break;
                }
            case 20:
                wmVar.Yb(false, true);
                break;
            case 21:
                wm.d0(wmVar);
                break;
            case 22:
                wmVar.n7();
                break;
            case 23:
                wmVar.a0.G0();
                break;
            case 24:
                wm wmVar2 = this.b;
                int i12 = wmVar2.Rb;
                if (i12 != 0) {
                    wmVar2.l(i12, wmVar2.Sb, wmVar2.Tb, wmVar2.Ub, wmVar2.Vb, wmVar2.Wb);
                    wmVar2.Rb = 0;
                    break;
                }
                break;
            case 25:
                if (!wmVar.A3 && wmVar.A0 != null && wmVar.getParentActivity() != null && wmVar.fragmentView != null) {
                    org.telegram.ui.Components.zo zoVar = wmVar.K2;
                    if (zoVar == null || !zoVar.W) {
                        if (zoVar == null) {
                            kl klVar = wmVar.m1;
                            int indexOfChild = klVar.indexOfChild(wmVar.U);
                            if (indexOfChild != -1) {
                                org.telegram.ui.Components.zo zoVar2 = new org.telegram.ui.Components.zo(wmVar.getParentActivity());
                                wmVar.K2 = zoVar2;
                                zoVar2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                                wmVar.K2.l(wmVar.L);
                                klVar.addView(wmVar.K2, indexOfChild + 1, b8.mf.e(-1, org.telegram.messenger.hs.g2, 55));
                            }
                        }
                        int childCount2 = wmVar.A0.getChildCount();
                        for (int i13 = 0; i13 < childCount2; i13++) {
                            View childAt2 = wmVar.A0.getChildAt(i13);
                            if ((childAt2 instanceof org.telegram.ui.Cells.q1) && (messageObject = (q1Var = (org.telegram.ui.Cells.q1) childAt2).getMessageObject()) != null && messageObject.Q3() && messageObject.r4()) {
                                org.telegram.ui.Components.zo zoVar3 = wmVar.K2;
                                int[] iArr = (int[]) zoVar3.Z0;
                                if (zoVar3.getParent() instanceof View) {
                                    q1Var.getLocationInWindow(iArr);
                                    int i14 = iArr[0];
                                    int i15 = iArr[1];
                                    ((View) zoVar3.getParent()).getLocationInWindow(iArr);
                                    float f10 = i15 - iArr[1];
                                    if (f10 > org.telegram.messenger.g0.L(80.0f)) {
                                        for (org.telegram.ui.Components.ch0 ch0Var : (org.telegram.ui.Components.ch0[]) zoVar3.Y0) {
                                            ch0Var.N(0, false, false);
                                            ch0Var.start();
                                        }
                                        zoVar3.x(org.telegram.messenger.g0.L(5.0f) + q1Var.getChecksX() + (i14 - iArr[0]), f10 + q1Var.getChecksY() + org.telegram.messenger.g0.L(6.0f), true);
                                        wmVar.getMessagesController().k4(0L, "NEWCOMER_TICKS");
                                        break;
                                    }
                                } else {
                                    continue;
                                }
                            }
                        }
                        break;
                    }
                }
                break;
            case 26:
                wm.C0(wmVar);
                break;
            case 27:
                mj mjVar2 = wmVar.a0;
                if (mjVar2 != null && wmVar.Pb != 5) {
                    mjVar2.G0();
                    break;
                }
                break;
            case 28:
                org.telegram.messenger.g0.d0(wmVar.A0, new ei.e(11));
                fl flVar = wmVar.D0;
                if (flVar != null) {
                    flVar.O(true);
                    break;
                }
                break;
            default:
                org.telegram.ui.Components.yn ynVar = ((org.telegram.ui.Components.yn[]) wmVar.c0.b)[0];
                org.telegram.ui.ActionBar.k5 k5Var = ynVar.d;
                org.telegram.ui.ActionBar.k5 k5Var2 = ynVar.e;
                wmVar.U1 = !wmVar.U1;
                k5Var.setPivotX(0.0f);
                k5Var2.setPivotX(0.0f);
                if (wmVar.U1) {
                    k5Var.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                    k5Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                } else {
                    k5Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                    k5Var2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                }
                org.telegram.messenger.g0.i3(wmVar.V1, 6000L);
                break;
        }
    }
}
