package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bn b;

    public /* synthetic */ zd(bn bnVar, int i7) {
        this.a = i7;
        this.b = bnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rj rjVar;
        org.telegram.ui.Cells.r1 r1Var;
        org.telegram.messenger.fj messageObject;
        int i7 = this.a;
        int i10 = 5;
        bn bnVar = this.b;
        switch (i7) {
            case 0:
                bnVar.d6 = null;
                if (bnVar.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, bnVar.getParentActivity(), bnVar.Ba);
                    boolean T = org.telegram.messenger.v3.T(bnVar.e);
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                    if (!T || bnVar.e.megagroup) {
                        t1Var.U = org.telegram.messenger.gd.N0(2131748890, null);
                        t1Var.S = org.telegram.messenger.gd.N0(2131748889, null);
                    } else {
                        t1Var.U = org.telegram.messenger.gd.N0(2131748892, null);
                        t1Var.S = org.telegram.messenger.gd.N0(2131748891, null);
                    }
                    alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131748888, null), new ee(bnVar, 2));
                    alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), new ee(bnVar, 3));
                    bnVar.showDialog(t1Var);
                    break;
                }
                break;
            case 1:
                bnVar.n7();
                break;
            case 2:
                bn.m0(bnVar);
                break;
            case 3:
                org.telegram.messenger.g0.E2(bnVar.Z0);
                break;
            case 4:
                FrameLayout.LayoutParams e10 = c8.ma.e(-1, -2, 87);
                e10.bottomMargin = bnVar.a0.getMeasuredHeight();
                bnVar.m1.addView(bnVar.N1, e10);
                bnVar.N1.setTranslationY(-org.telegram.messenger.g0.n);
                bnVar.N1.p(0.0f, bnVar.a0.getEmojiButton().getX() + org.telegram.messenger.g0.L(22.0f));
                bnVar.N1.x();
                break;
            case 5:
                if (!org.telegram.ui.ActionBar.g2.hasSheets(bnVar) && (rjVar = bnVar.a0) != null) {
                    rjVar.setFieldFocused(true);
                    bnVar.a0.i1();
                    break;
                }
                break;
            case 6:
                bnVar.Dd();
                bnVar.M9();
                org.telegram.messenger.g0.d0(bnVar.A0, new me(bnVar, i10));
                bnVar.J7();
                jj jjVar = bnVar.m3;
                if (jjVar != null) {
                    jjVar.setTranslationX(bnVar.n9() / 2.0f);
                }
                hj hjVar = bnVar.n3;
                if (hjVar != null) {
                    hjVar.setTranslationX(bnVar.n9() / 2.0f);
                }
                FrameLayout frameLayout = bnVar.f1;
                if (frameLayout != null) {
                    frameLayout.setTranslationX(bnVar.n9() / 2.0f);
                }
                bnVar.h7();
                bnVar.I7();
                break;
            case 7:
                w81 f02 = w81.f0(-bnVar.l6, 0L);
                f02.E = bnVar;
                bnVar.presentFragment(f02);
                break;
            case 8:
                bnVar.Ic(true);
                break;
            case 9:
                bnVar.y1.d(true);
                break;
            case 10:
                bnVar.Ra(null, bnVar.I8);
                bnVar.I8 = null;
                break;
            case 11:
                bnVar.resumeDelayedFragmentAnimation();
                yj yjVar = bnVar.ta;
                org.telegram.messenger.g0.r(yjVar);
                yjVar.run();
                bnVar.getNotificationCenter().o();
                break;
            case 12:
                int childCount = bnVar.A0.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = bnVar.A0.getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.r1) {
                        org.telegram.ui.Cells.r1 r1Var2 = (org.telegram.ui.Cells.r1) childAt;
                        if (r1Var2.getMessageObject().D == 4) {
                            r1Var2.H1();
                        }
                    }
                }
                break;
            case 13:
                bnVar.fc = true;
                bnVar.fd(true);
                break;
            case 14:
                ik ikVar = bnVar.Bb;
                if (ikVar != null) {
                    ikVar.requestLayout();
                    break;
                }
                break;
            case 15:
                TLRPC.UserFull userFull = bnVar.s8;
                bnVar.Ob(userFull != null ? userFull.theme : null);
                break;
            case 16:
                bn.r0(bnVar);
                break;
            case 17:
                bnVar.d8 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                bnVar.f8 = false;
                bnVar.g8 = 0L;
                bnVar.h8 = null;
                bnVar.i8 = null;
                bnVar.j8 = null;
                bnVar.k8 = -1;
                bnVar.e8 = false;
                bnVar.Gd(false);
                bnVar.m8 = null;
                break;
            case 18:
                bnVar.getNotificationCenter().j(bnVar.ca);
                break;
            case 19:
                bnVar.cc(false, true);
                break;
            case 20:
                bn.U0(bnVar);
                break;
            case 21:
                zd zdVar = new zd(bnVar, 11);
                if (org.telegram.utils.twidget.n0.z()) {
                    zdVar.run();
                    break;
                } else {
                    org.telegram.ui.Components.ik ikVar2 = new org.telegram.ui.Components.ik(zdVar, 29);
                    org.telegram.utils.twidget.n0.h.add(ikVar2);
                    org.telegram.messenger.g0.h3(ikVar2, 150L);
                    break;
                }
            case 22:
                bnVar.o7();
                break;
            case 23:
                bnVar.a0.i1();
                break;
            case 24:
                bn.e0(bnVar);
                break;
            case 25:
                bn bnVar2 = this.b;
                int i12 = bnVar2.Ub;
                if (i12 != 0) {
                    bnVar2.l(i12, bnVar2.Vb, bnVar2.Wb, bnVar2.Xb, bnVar2.Yb, bnVar2.Zb);
                    bnVar2.Ub = 0;
                    break;
                }
                break;
            case 26:
                if (!bnVar.A3 && bnVar.A0 != null && bnVar.getParentActivity() != null && bnVar.fragmentView != null) {
                    org.telegram.ui.Components.rp rpVar = bnVar.K2;
                    if (rpVar == null || !rpVar.W) {
                        if (rpVar == null) {
                            pl plVar = bnVar.m1;
                            int indexOfChild = plVar.indexOfChild(bnVar.U);
                            if (indexOfChild != -1) {
                                org.telegram.ui.Components.rp rpVar2 = new org.telegram.ui.Components.rp(bnVar.getParentActivity());
                                bnVar.K2 = rpVar2;
                                rpVar2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                                bnVar.K2.l(bnVar.L);
                                plVar.addView(bnVar.K2, indexOfChild + 1, c8.ma.e(-1, org.telegram.messenger.ks.g2, 55));
                            }
                        }
                        int childCount2 = bnVar.A0.getChildCount();
                        for (int i13 = 0; i13 < childCount2; i13++) {
                            View childAt2 = bnVar.A0.getChildAt(i13);
                            if ((childAt2 instanceof org.telegram.ui.Cells.r1) && (messageObject = (r1Var = (org.telegram.ui.Cells.r1) childAt2).getMessageObject()) != null && messageObject.P3() && messageObject.q4()) {
                                org.telegram.ui.Components.rp rpVar3 = bnVar.K2;
                                int[] iArr = (int[]) rpVar3.Z0;
                                if (rpVar3.getParent() instanceof View) {
                                    r1Var.getLocationInWindow(iArr);
                                    int i14 = iArr[0];
                                    int i15 = iArr[1];
                                    ((View) rpVar3.getParent()).getLocationInWindow(iArr);
                                    float f10 = i15 - iArr[1];
                                    if (f10 > org.telegram.messenger.g0.L(80.0f)) {
                                        for (org.telegram.ui.Components.oh0 oh0Var : (org.telegram.ui.Components.oh0[]) rpVar3.Y0) {
                                            oh0Var.N(0, false, false);
                                            oh0Var.start();
                                        }
                                        rpVar3.y(org.telegram.messenger.g0.L(5.0f) + r1Var.getChecksX() + (i14 - iArr[0]), f10 + r1Var.getChecksY() + org.telegram.messenger.g0.L(6.0f), true);
                                        bnVar.getMessagesController().s4(0L, "NEWCOMER_TICKS");
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
                bn.G0(bnVar);
                break;
            case 28:
                rj rjVar2 = bnVar.a0;
                if (rjVar2 != null && bnVar.Sb != 5) {
                    rjVar2.i1();
                    break;
                }
                break;
            default:
                org.telegram.ui.Components.so soVar = ((org.telegram.ui.Components.so[]) bnVar.c0.b)[0];
                org.telegram.ui.ActionBar.m5 m5Var = soVar.d;
                org.telegram.ui.ActionBar.m5 m5Var2 = soVar.e;
                bnVar.U1 = !bnVar.U1;
                m5Var.setPivotX(0.0f);
                m5Var2.setPivotX(0.0f);
                if (bnVar.U1) {
                    m5Var.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                    m5Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                } else {
                    m5Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                    m5Var2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                }
                org.telegram.messenger.g0.h3(bnVar.V1, 6000L);
                break;
        }
    }
}
