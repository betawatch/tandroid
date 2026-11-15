package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class yd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ an b;

    public /* synthetic */ yd(an anVar, int i7) {
        this.a = i7;
        this.b = anVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qj qjVar;
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.messenger.gj messageObject;
        int i7 = this.a;
        int i10 = 5;
        an anVar = this.b;
        switch (i7) {
            case 0:
                anVar.c6 = null;
                if (anVar.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, anVar.getParentActivity(), anVar.Aa);
                    boolean T = org.telegram.messenger.t3.T(anVar.e);
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                    if (!T || anVar.e.megagroup) {
                        t1Var.U = org.telegram.messenger.hd.M0(2131749083, null);
                        t1Var.S = org.telegram.messenger.hd.M0(2131749082, null);
                    } else {
                        t1Var.U = org.telegram.messenger.hd.M0(2131749085, null);
                        t1Var.S = org.telegram.messenger.hd.M0(2131749084, null);
                    }
                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131749081, null), new ce(anVar, 2));
                    alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), new ce(anVar, 3));
                    anVar.showDialog(t1Var);
                    break;
                }
                break;
            case 1:
                anVar.n7();
                break;
            case 2:
                FrameLayout.LayoutParams e10 = c8.ja.e(-1, -2, 87);
                e10.bottomMargin = anVar.a0.getMeasuredHeight();
                anVar.m1.addView(anVar.N1, e10);
                anVar.N1.setTranslationY(-org.telegram.messenger.g0.n);
                anVar.N1.p(0.0f, anVar.a0.getEmojiButton().getX() + org.telegram.messenger.g0.L(22.0f));
                anVar.N1.w();
                break;
            case 3:
                an.m0(anVar);
                break;
            case 4:
                org.telegram.messenger.g0.E2(anVar.Z0);
                break;
            case 5:
                if (!org.telegram.ui.ActionBar.e2.hasSheets(anVar) && (qjVar = anVar.a0) != null) {
                    qjVar.setFieldFocused(true);
                    anVar.a0.W0();
                    break;
                }
                break;
            case 6:
                anVar.Dd();
                anVar.M9();
                org.telegram.messenger.g0.d0(anVar.A0, new ke(anVar, i10));
                anVar.J7();
                ij ijVar = anVar.m3;
                if (ijVar != null) {
                    ijVar.setTranslationX(anVar.n9() / 2.0f);
                }
                gj gjVar = anVar.n3;
                if (gjVar != null) {
                    gjVar.setTranslationX(anVar.n9() / 2.0f);
                }
                FrameLayout frameLayout = anVar.f1;
                if (frameLayout != null) {
                    frameLayout.setTranslationX(anVar.n9() / 2.0f);
                }
                anVar.h7();
                anVar.I7();
                break;
            case 7:
                anVar.Ra(null, anVar.H8);
                anVar.H8 = null;
                break;
            case 8:
                s81 f02 = s81.f0(-anVar.k6, 0L);
                f02.E = anVar;
                anVar.presentFragment(f02);
                break;
            case 9:
                anVar.Ic(true);
                break;
            case 10:
                anVar.y1.d(true);
                break;
            case 11:
                anVar.resumeDelayedFragmentAnimation();
                xj xjVar = anVar.sa;
                org.telegram.messenger.g0.r(xjVar);
                xjVar.run();
                anVar.getNotificationCenter().o();
                break;
            case 12:
                int childCount = anVar.A0.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = anVar.A0.getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.q1) {
                        org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) childAt;
                        if (q1Var2.getMessageObject().D == 4) {
                            q1Var2.H1();
                        }
                    }
                }
                break;
            case 13:
                anVar.ec = true;
                anVar.fd(true);
                break;
            case 14:
                hk hkVar = anVar.Ab;
                if (hkVar != null) {
                    hkVar.requestLayout();
                    break;
                }
                break;
            case 15:
                anVar.getNotificationCenter().j(anVar.ba);
                break;
            case 16:
                TLRPC.UserFull userFull = anVar.r8;
                anVar.Ob(userFull != null ? userFull.theme : null);
                break;
            case 17:
                an.r0(anVar);
                break;
            case 18:
                anVar.c8 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                anVar.e8 = false;
                anVar.f8 = 0L;
                anVar.g8 = null;
                anVar.h8 = null;
                anVar.i8 = null;
                anVar.j8 = -1;
                anVar.d8 = false;
                anVar.Gd(false);
                anVar.l8 = null;
                break;
            case 19:
                an.U0(anVar);
                break;
            case 20:
                anVar.cc(false, true);
                break;
            case 21:
                yd ydVar = new yd(anVar, 11);
                if (org.telegram.utils.twidget.n0.z()) {
                    ydVar.run();
                    break;
                } else {
                    org.telegram.ui.Components.zj zjVar = new org.telegram.ui.Components.zj(ydVar, 29);
                    org.telegram.utils.twidget.n0.h.add(zjVar);
                    org.telegram.messenger.g0.i3(zjVar, 150L);
                    break;
                }
            case 22:
                an.e0(anVar);
                break;
            case 23:
                anVar.o7();
                break;
            case 24:
                anVar.a0.W0();
                break;
            case 25:
                an anVar2 = this.b;
                int i12 = anVar2.Tb;
                if (i12 != 0) {
                    anVar2.l(i12, anVar2.Ub, anVar2.Vb, anVar2.Wb, anVar2.Xb, anVar2.Yb);
                    anVar2.Tb = 0;
                    break;
                }
                break;
            case 26:
                if (!anVar.A3 && anVar.A0 != null && anVar.getParentActivity() != null && anVar.fragmentView != null) {
                    org.telegram.ui.Components.ip ipVar = anVar.K2;
                    if (ipVar == null || !ipVar.W) {
                        if (ipVar == null) {
                            ol olVar = anVar.m1;
                            int indexOfChild = olVar.indexOfChild(anVar.U);
                            if (indexOfChild != -1) {
                                org.telegram.ui.Components.ip ipVar2 = new org.telegram.ui.Components.ip(anVar.getParentActivity());
                                anVar.K2 = ipVar2;
                                ipVar2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                                anVar.K2.l(anVar.L);
                                olVar.addView(anVar.K2, indexOfChild + 1, c8.ja.e(-1, org.telegram.messenger.ns.g2, 55));
                            }
                        }
                        int childCount2 = anVar.A0.getChildCount();
                        for (int i13 = 0; i13 < childCount2; i13++) {
                            View childAt2 = anVar.A0.getChildAt(i13);
                            if ((childAt2 instanceof org.telegram.ui.Cells.q1) && (messageObject = (q1Var = (org.telegram.ui.Cells.q1) childAt2).getMessageObject()) != null && messageObject.P3() && messageObject.q4()) {
                                org.telegram.ui.Components.ip ipVar3 = anVar.K2;
                                int[] iArr = (int[]) ipVar3.Z0;
                                if (ipVar3.getParent() instanceof View) {
                                    q1Var.getLocationInWindow(iArr);
                                    int i14 = iArr[0];
                                    int i15 = iArr[1];
                                    ((View) ipVar3.getParent()).getLocationInWindow(iArr);
                                    float f10 = i15 - iArr[1];
                                    if (f10 > org.telegram.messenger.g0.L(80.0f)) {
                                        for (org.telegram.ui.Components.ch0 ch0Var : (org.telegram.ui.Components.ch0[]) ipVar3.Y0) {
                                            ch0Var.N(0, false, false);
                                            ch0Var.start();
                                        }
                                        ipVar3.x(org.telegram.messenger.g0.L(5.0f) + q1Var.getChecksX() + (i14 - iArr[0]), f10 + q1Var.getChecksY() + org.telegram.messenger.g0.L(6.0f), true);
                                        anVar.getMessagesController().k4(0L, "NEWCOMER_TICKS");
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
            case 27:
                an.G0(anVar);
                break;
            case 28:
                qj qjVar2 = anVar.a0;
                if (qjVar2 != null && anVar.Rb != 5) {
                    qjVar2.W0();
                    break;
                }
                break;
            default:
                org.telegram.ui.Components.jo joVar = ((org.telegram.ui.Components.jo[]) anVar.c0.b)[0];
                org.telegram.ui.ActionBar.j5 j5Var = joVar.d;
                org.telegram.ui.ActionBar.j5 j5Var2 = joVar.e;
                anVar.U1 = !anVar.U1;
                j5Var.setPivotX(0.0f);
                j5Var2.setPivotX(0.0f);
                if (anVar.U1) {
                    j5Var.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                    j5Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                } else {
                    j5Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                    j5Var2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                }
                org.telegram.messenger.g0.i3(anVar.V1, 6000L);
                break;
        }
    }
}
