package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class qe implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yn b;

    public /* synthetic */ qe(yn ynVar, int i10) {
        this.a = i10;
        this.b = ynVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jk jkVar;
        org.telegram.ui.Cells.u1 u1Var;
        MessageObject messageObject;
        int i10 = this.a;
        int i11 = 0;
        char c10 = 1;
        yn ynVar = this.b;
        switch (i10) {
            case 0:
                ynVar.Y6();
                break;
            case 1:
                yn.l0(ynVar);
                break;
            case 2:
                ynVar.na(null, ynVar.q8);
                ynVar.q8 = null;
                break;
            case 3:
                ynVar.ub(false, true);
                break;
            case 4:
                if (!org.telegram.ui.ActionBar.n2.hasSheets(ynVar) && (jkVar = ynVar.W) != null) {
                    jkVar.setFieldFocused(true);
                    ynVar.W.H0();
                    break;
                }
                break;
            case 5:
                ynVar.getNotificationCenter().onAnimationFinish(ynVar.D9);
                break;
            case 6:
                ynVar.o9();
                AndroidUtilities.forEachViews((RecyclerView) ynVar.v0, (Utilities.Callback<View>) new xe(ynVar, 6));
                ynVar.u7();
                ak akVar = ynVar.V2;
                if (akVar != null) {
                    akVar.setTranslationX(ynVar.S8() / 2.0f);
                }
                zj zjVar = ynVar.W2;
                if (zjVar != null) {
                    zjVar.setTranslationX(ynVar.S8() / 2.0f);
                }
                FrameLayout frameLayout = ynVar.O0;
                if (frameLayout != null) {
                    frameLayout.setTranslationX(ynVar.S8() / 2.0f);
                }
                ynVar.S6();
                ynVar.t7();
                break;
            case 7:
                ue1 Z = ue1.Z(-ynVar.R5, 0L);
                Z.y = ynVar;
                ynVar.presentFragment(Z);
                break;
            case 8:
                ynVar.h1.d(true);
                break;
            case 9:
                yn.B0(ynVar);
                break;
            case 10:
                int childCount = ynVar.v0.getChildCount();
                while (i11 < childCount) {
                    View childAt = ynVar.v0.getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.u1) {
                        org.telegram.ui.Cells.u1 u1Var2 = (org.telegram.ui.Cells.u1) childAt;
                        if (u1Var2.getMessageObject().type == 4) {
                            u1Var2.t2();
                        }
                    }
                    i11++;
                }
                break;
            case 11:
                ynVar.yb = true;
                ynVar.wc(true);
                break;
            case 12:
                al alVar = ynVar.Ya;
                if (alVar != null) {
                    alVar.requestLayout();
                    break;
                }
                break;
            case 13:
                ynVar.resumeDelayedFragmentAnimation();
                kk kkVar = ynVar.U9;
                AndroidUtilities.cancelRunOnUIThread(kkVar);
                kkVar.run();
                ynVar.getNotificationCenter().runDelayedNotifications();
                break;
            case 14:
                TLRPC.UserFull userFull = ynVar.Y7;
                ynVar.hb(userFull != null ? userFull.theme : null);
                break;
            case 15:
                yn.n1(ynVar);
                break;
            case 16:
                ynVar.J7 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                ynVar.L7 = false;
                ynVar.M7 = 0L;
                ynVar.N7 = null;
                ynVar.O7 = null;
                ynVar.P7 = null;
                ynVar.Q7 = -1;
                ynVar.K7 = false;
                ynVar.Vc(false);
                ynVar.S7 = null;
                break;
            case 17:
                ynVar.ac(true);
                break;
            case 18:
                ynVar.Z6();
                break;
            case 19:
                ynVar.W.H0();
                break;
            case 20:
                AndroidUtilities.forEachViews((RecyclerView) ynVar.v0, (Utilities.Callback<View>) new ai.i(11));
                jm jmVar = ynVar.y0;
                if (jmVar != null) {
                    jmVar.O(true);
                    break;
                }
                break;
            case 21:
                yn ynVar2 = this.b;
                int i12 = ynVar2.nb;
                if (i12 != 0) {
                    ynVar2.D(i12, ynVar2.ob, ynVar2.qb, ynVar2.sb, ynVar2.pb, ynVar2.rb);
                    ynVar2.nb = 0;
                    break;
                }
                break;
            case 22:
                if (!ynVar.j3 && ynVar.v0 != null && ynVar.getParentActivity() != null && ynVar.fragmentView != null) {
                    org.telegram.ui.Components.tp tpVar = ynVar.t2;
                    if (tpVar == null || tpVar.getTag() == null) {
                        if (ynVar.t2 == null) {
                            qm qmVar = ynVar.V0;
                            int indexOfChild = qmVar.indexOfChild(ynVar.Q);
                            if (indexOfChild != -1) {
                                org.telegram.ui.Components.tp tpVar2 = new org.telegram.ui.Components.tp(ynVar.getParentActivity(), ynVar.ca);
                                ynVar.t2 = tpVar2;
                                qmVar.addView(tpVar2, indexOfChild + 1, w7.z5.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                                ynVar.t2.setAlpha(0.0f);
                                ynVar.t2.setVisibility(4);
                            }
                        }
                        int childCount2 = ynVar.v0.getChildCount();
                        int i13 = 0;
                        while (i13 < childCount2) {
                            View childAt2 = ynVar.v0.getChildAt(i13);
                            if ((childAt2 instanceof org.telegram.ui.Cells.u1) && (messageObject = (u1Var = (org.telegram.ui.Cells.u1) childAt2).getMessageObject()) != null && messageObject.isOutOwner() && messageObject.isSent()) {
                                org.telegram.ui.Components.tp tpVar3 = ynVar.t2;
                                ImageView imageView = tpVar3.c;
                                org.telegram.ui.Components.qg qgVar = tpVar3.e;
                                if (qgVar != null) {
                                    AndroidUtilities.cancelRunOnUIThread(qgVar);
                                    tpVar3.e = null;
                                }
                                int[] iArr = new int[2];
                                u1Var.getLocationInWindow(iArr);
                                int i14 = iArr[c10];
                                ((View) tpVar3.getParent()).getLocationInWindow(iArr);
                                int i15 = i14 - iArr[1];
                                View view = (View) u1Var.getParent();
                                tpVar3.measure(View.MeasureSpec.makeMeasureSpec(MediaDataController.MAX_STYLE_RUNS_COUNT, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(MediaDataController.MAX_STYLE_RUNS_COUNT, TLObject.FLAG_31));
                                if (i15 > AndroidUtilities.dp(10.0f) + tpVar3.getMeasuredHeight()) {
                                    int C = org.telegram.messenger.f0.C(6.0f, u1Var.getChecksY(), i15);
                                    int dp = AndroidUtilities.dp(5.0f) + u1Var.getChecksX();
                                    int measuredWidth = view.getMeasuredWidth();
                                    float measuredHeight = C - tpVar3.getMeasuredHeight();
                                    tpVar3.f = measuredHeight;
                                    tpVar3.setTranslationY(measuredHeight);
                                    int left = u1Var.getLeft() + dp;
                                    int dp2 = AndroidUtilities.dp(15.0f);
                                    if (left > view.getMeasuredWidth() / 2) {
                                        int measuredWidth2 = (measuredWidth - tpVar3.getMeasuredWidth()) - AndroidUtilities.dp(20.0f);
                                        tpVar3.setTranslationX(measuredWidth2);
                                        dp2 += measuredWidth2;
                                    } else {
                                        tpVar3.setTranslationX(0.0f);
                                    }
                                    float left2 = ((u1Var.getLeft() + dp) - dp2) - (imageView.getMeasuredWidth() / 2);
                                    imageView.setTranslationX(left2);
                                    if (left > view.getMeasuredWidth() / 2) {
                                        if (left2 < AndroidUtilities.dp(10.0f)) {
                                            float dp3 = left2 - AndroidUtilities.dp(10.0f);
                                            tpVar3.setTranslationX(tpVar3.getTranslationX() + dp3);
                                            imageView.setTranslationX(left2 - dp3);
                                        }
                                    } else if (left2 > tpVar3.getMeasuredWidth() - AndroidUtilities.dp(24.0f)) {
                                        float measuredWidth3 = (left2 - tpVar3.getMeasuredWidth()) + AndroidUtilities.dp(24.0f);
                                        tpVar3.setTranslationX(measuredWidth3);
                                        imageView.setTranslationX(left2 - measuredWidth3);
                                    } else if (left2 < AndroidUtilities.dp(10.0f)) {
                                        float dp4 = left2 - AndroidUtilities.dp(10.0f);
                                        tpVar3.setTranslationX(tpVar3.getTranslationX() + dp4);
                                        imageView.setTranslationX(left2 - dp4);
                                    }
                                    tpVar3.setPivotX(left2);
                                    tpVar3.setPivotY(tpVar3.getMeasuredHeight());
                                    AnimatorSet animatorSet = tpVar3.d;
                                    if (animatorSet != null) {
                                        animatorSet.cancel();
                                        tpVar3.d = null;
                                    }
                                    tpVar3.setTag(1);
                                    tpVar3.setVisibility(0);
                                    AnimatorSet animatorSet2 = new AnimatorSet();
                                    tpVar3.d = animatorSet2;
                                    animatorSet2.playTogether(ObjectAnimator.ofFloat(tpVar3, (Property<org.telegram.ui.Components.tp, Float>) View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(tpVar3, (Property<org.telegram.ui.Components.tp, Float>) View.SCALE_X, 0.0f, 1.0f), ObjectAnimator.ofFloat(tpVar3, (Property<org.telegram.ui.Components.tp, Float>) View.SCALE_Y, 0.0f, 1.0f));
                                    tpVar3.d.addListener(new org.telegram.ui.Components.sp(tpVar3, i11));
                                    tpVar3.d.setDuration(180L);
                                    tpVar3.d.start();
                                    while (i11 < 2) {
                                        tpVar3.a[i11].animate().scaleX(1.04f).scaleY(1.04f).setInterpolator(org.telegram.ui.Components.tr.i).setStartDelay((i11 == 0 ? 132 : 500) + 140).setDuration(100L).setListener(new ei.w2(tpVar3, i11, 6)).start();
                                        i11++;
                                    }
                                    ynVar.getMessagesController().removeSuggestion(0L, "NEWCOMER_TICKS");
                                    break;
                                }
                            }
                            i13++;
                            c10 = 1;
                        }
                        break;
                    }
                }
                break;
            case 23:
                yn.w0(ynVar);
                break;
            case 24:
                AndroidUtilities.forEachViews((RecyclerView) ynVar.v0, (Utilities.Callback<View>) new ai.i(10));
                jm jmVar2 = ynVar.y0;
                if (jmVar2 != null) {
                    jmVar2.O(false);
                    break;
                }
                break;
            case 25:
                jk jkVar2 = ynVar.W;
                if (jkVar2 != null && ynVar.lb != 5) {
                    jkVar2.H0();
                    break;
                }
                break;
            case 26:
                org.telegram.ui.Components.to toVar = ((org.telegram.ui.Components.to[]) ynVar.Y.b)[0];
                org.telegram.ui.ActionBar.i5 i5Var = toVar.d;
                org.telegram.ui.ActionBar.i5 i5Var2 = toVar.e;
                ynVar.D1 = !ynVar.D1;
                i5Var.setPivotX(0.0f);
                i5Var2.setPivotX(0.0f);
                if (ynVar.D1) {
                    i5Var.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                    i5Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                } else {
                    i5Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                    i5Var2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                }
                AndroidUtilities.runOnUIThread(ynVar.E1, 6000L);
                break;
            case 27:
                ynVar.tc();
                break;
            case 28:
                ynVar.A7(true);
                break;
            default:
                ynVar.A7(true);
                break;
        }
    }
}
