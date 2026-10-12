package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class se implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fo b;

    public /* synthetic */ se(fo foVar, int i10) {
        this.a = i10;
        this.b = foVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sk skVar;
        int i10;
        org.telegram.ui.Cells.u1 u1Var;
        MessageObject messageObject;
        int i11 = this.a;
        int i12 = 2;
        int i13 = 0;
        fo foVar = this.b;
        switch (i11) {
            case 0:
                foVar.L5 = null;
                if (foVar.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(foVar.getParentActivity(), 0, foVar.ea);
                    boolean isChannel = ChatObject.isChannel(foVar.e);
                    org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
                    if (!isChannel || foVar.e.megagroup) {
                        a2Var.T = LocaleController.getString(R.string.JoinByPeekGroupText);
                        a2Var.R = LocaleController.getString(R.string.JoinByPeekGroupTitle);
                    } else {
                        a2Var.T = LocaleController.getString(R.string.JoinByPeekChannelText);
                        a2Var.R = LocaleController.getString(R.string.JoinByPeekChannelTitle);
                    }
                    alertDialog$Builder.k(LocaleController.getString(R.string.JoinByPeekJoin), new xe(foVar, i12));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new xe(foVar, 3));
                    foVar.showDialog(a2Var);
                    break;
                }
                break;
            case 1:
                foVar.b7();
                break;
            case 2:
                fo.n0(foVar);
                break;
            case 3:
                foVar.ta(null, foVar.s8);
                foVar.s8 = null;
                break;
            case 4:
                if (!org.telegram.ui.ActionBar.m2.hasSheets(foVar) && (skVar = foVar.Y) != null) {
                    skVar.setFieldFocused(true);
                    foVar.Y.F0();
                    break;
                }
                break;
            case 5:
                foVar.t9();
                AndroidUtilities.forEachViews((RecyclerView) foVar.x0, (Utilities.Callback<View>) new jf(foVar, 6));
                foVar.x7();
                jk jkVar = foVar.X2;
                if (jkVar != null) {
                    jkVar.setTranslationX(foVar.W8() / 2.0f);
                }
                ik ikVar = foVar.Y2;
                if (ikVar != null) {
                    ikVar.setTranslationX(foVar.W8() / 2.0f);
                }
                FrameLayout frameLayout = foVar.Q0;
                if (frameLayout != null) {
                    frameLayout.setTranslationX(foVar.W8() / 2.0f);
                }
                foVar.V6();
                foVar.w7();
                break;
            case 6:
                hf1 a02 = hf1.a0(-foVar.T5, 0L);
                a02.y = foVar;
                foVar.presentFragment(a02);
                break;
            case 7:
                foVar.fc(true);
                break;
            case 8:
                foVar.j1.d(true);
                break;
            case 9:
                foVar.getNotificationCenter().onAnimationFinish(foVar.F9);
                break;
            case 10:
                int childCount = foVar.x0.getChildCount();
                while (i13 < childCount) {
                    View childAt = foVar.x0.getChildAt(i13);
                    if (childAt instanceof org.telegram.ui.Cells.u1) {
                        org.telegram.ui.Cells.u1 u1Var2 = (org.telegram.ui.Cells.u1) childAt;
                        if (u1Var2.getMessageObject().type == 4) {
                            u1Var2.t2();
                        }
                    }
                    i13++;
                }
                break;
            case 11:
                foVar.Bb = true;
                foVar.Bc(true);
                break;
            case 12:
                il ilVar = foVar.bb;
                if (ilVar != null) {
                    ilVar.requestLayout();
                    break;
                }
                break;
            case 13:
                fo.J0(foVar);
                break;
            case 14:
                foVar.zb(false, true);
                break;
            case 15:
                foVar.resumeDelayedFragmentAnimation();
                al alVar = foVar.W9;
                AndroidUtilities.cancelRunOnUIThread(alVar);
                alVar.run();
                foVar.getNotificationCenter().runDelayedNotifications();
                break;
            case 16:
                TLRPC.UserFull userFull = foVar.a8;
                foVar.mb(userFull != null ? userFull.theme : null);
                break;
            case 17:
                fo.u0(foVar);
                break;
            case 18:
                foVar.L7 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                foVar.N7 = false;
                foVar.O7 = 0L;
                foVar.P7 = null;
                foVar.Q7 = null;
                foVar.R7 = null;
                foVar.S7 = -1;
                foVar.M7 = false;
                foVar.ad(false);
                foVar.U7 = null;
                break;
            case 19:
                foVar.c7();
                break;
            case 20:
                foVar.Y.F0();
                break;
            case 21:
                AndroidUtilities.forEachViews((RecyclerView) foVar.x0, (Utilities.Callback<View>) new bi.f(11));
                rm rmVar = foVar.A0;
                if (rmVar != null) {
                    rmVar.O(true);
                    break;
                }
                break;
            case 22:
                fo foVar2 = this.b;
                int i14 = foVar2.qb;
                if (i14 != 0) {
                    foVar2.j(i14, foVar2.rb, foVar2.sb, foVar2.tb, foVar2.ub, foVar2.vb);
                    foVar2.qb = 0;
                    break;
                }
                break;
            case 23:
                if (!foVar.l3 && foVar.x0 != null && foVar.getParentActivity() != null && foVar.fragmentView != null) {
                    org.telegram.ui.Components.dq dqVar = foVar.v2;
                    if (dqVar == null || dqVar.getTag() == null) {
                        if (foVar.v2 == null) {
                            xm xmVar = foVar.X0;
                            int indexOfChild = xmVar.indexOfChild(foVar.S);
                            if (indexOfChild != -1) {
                                i10 = 1;
                                org.telegram.ui.Components.dq dqVar2 = new org.telegram.ui.Components.dq(foVar.getParentActivity(), foVar.ea);
                                foVar.v2 = dqVar2;
                                xmVar.addView(dqVar2, indexOfChild + 1, w7.a6.a(-2.0f, 10.0f, 0.0f, 10.0f, 0.0f, -2, 51));
                                foVar.v2.setAlpha(0.0f);
                                foVar.v2.setVisibility(4);
                            }
                        } else {
                            i10 = 1;
                        }
                        int childCount2 = foVar.x0.getChildCount();
                        for (int i15 = 0; i15 < childCount2; i15++) {
                            View childAt2 = foVar.x0.getChildAt(i15);
                            if ((childAt2 instanceof org.telegram.ui.Cells.u1) && (messageObject = (u1Var = (org.telegram.ui.Cells.u1) childAt2).getMessageObject()) != null && messageObject.isOutOwner() && messageObject.isSent()) {
                                org.telegram.ui.Components.dq dqVar3 = foVar.v2;
                                ImageView imageView = dqVar3.c;
                                org.telegram.ui.Components.qg qgVar = dqVar3.e;
                                if (qgVar != null) {
                                    AndroidUtilities.cancelRunOnUIThread(qgVar);
                                    dqVar3.e = null;
                                }
                                int[] iArr = new int[2];
                                u1Var.getLocationInWindow(iArr);
                                int i16 = iArr[i10];
                                ((View) dqVar3.getParent()).getLocationInWindow(iArr);
                                int i17 = i16 - iArr[i10];
                                View view = (View) u1Var.getParent();
                                dqVar3.measure(View.MeasureSpec.makeMeasureSpec(MediaDataController.MAX_STYLE_RUNS_COUNT, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(MediaDataController.MAX_STYLE_RUNS_COUNT, TLObject.FLAG_31));
                                if (i17 > AndroidUtilities.dp(10.0f) + dqVar3.getMeasuredHeight()) {
                                    int c10 = org.telegram.messenger.yh.c(6.0f, u1Var.getChecksY(), i17);
                                    int dp = AndroidUtilities.dp(5.0f) + u1Var.getChecksX();
                                    int measuredWidth = view.getMeasuredWidth();
                                    float measuredHeight = c10 - dqVar3.getMeasuredHeight();
                                    dqVar3.f = measuredHeight;
                                    dqVar3.setTranslationY(measuredHeight);
                                    int left = u1Var.getLeft() + dp;
                                    int dp2 = AndroidUtilities.dp(15.0f);
                                    if (left > view.getMeasuredWidth() / 2) {
                                        int measuredWidth2 = (measuredWidth - dqVar3.getMeasuredWidth()) - AndroidUtilities.dp(20.0f);
                                        dqVar3.setTranslationX(measuredWidth2);
                                        dp2 += measuredWidth2;
                                    } else {
                                        dqVar3.setTranslationX(0.0f);
                                    }
                                    float left2 = ((u1Var.getLeft() + dp) - dp2) - (imageView.getMeasuredWidth() / 2);
                                    imageView.setTranslationX(left2);
                                    if (left > view.getMeasuredWidth() / 2) {
                                        if (left2 < AndroidUtilities.dp(10.0f)) {
                                            float dp3 = left2 - AndroidUtilities.dp(10.0f);
                                            dqVar3.setTranslationX(dqVar3.getTranslationX() + dp3);
                                            imageView.setTranslationX(left2 - dp3);
                                        }
                                    } else if (left2 > dqVar3.getMeasuredWidth() - AndroidUtilities.dp(24.0f)) {
                                        float measuredWidth3 = (left2 - dqVar3.getMeasuredWidth()) + AndroidUtilities.dp(24.0f);
                                        dqVar3.setTranslationX(measuredWidth3);
                                        imageView.setTranslationX(left2 - measuredWidth3);
                                    } else if (left2 < AndroidUtilities.dp(10.0f)) {
                                        float dp4 = left2 - AndroidUtilities.dp(10.0f);
                                        dqVar3.setTranslationX(dqVar3.getTranslationX() + dp4);
                                        imageView.setTranslationX(left2 - dp4);
                                    }
                                    dqVar3.setPivotX(left2);
                                    dqVar3.setPivotY(dqVar3.getMeasuredHeight());
                                    AnimatorSet animatorSet = dqVar3.d;
                                    if (animatorSet != null) {
                                        animatorSet.cancel();
                                        dqVar3.d = null;
                                    }
                                    dqVar3.setTag(Integer.valueOf(i10));
                                    dqVar3.setVisibility(0);
                                    AnimatorSet animatorSet2 = new AnimatorSet();
                                    dqVar3.d = animatorSet2;
                                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(dqVar3, (Property<org.telegram.ui.Components.dq, Float>) View.ALPHA, 0.0f, 1.0f);
                                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(dqVar3, (Property<org.telegram.ui.Components.dq, Float>) View.SCALE_X, 0.0f, 1.0f);
                                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(dqVar3, (Property<org.telegram.ui.Components.dq, Float>) View.SCALE_Y, 0.0f, 1.0f);
                                    Animator[] animatorArr = new Animator[3];
                                    animatorArr[0] = ofFloat;
                                    animatorArr[i10] = ofFloat2;
                                    animatorArr[2] = ofFloat3;
                                    animatorSet2.playTogether(animatorArr);
                                    dqVar3.d.addListener(new org.telegram.ui.Components.cq(dqVar3, i13));
                                    dqVar3.d.setDuration(180L);
                                    dqVar3.d.start();
                                    while (i13 < 2) {
                                        dqVar3.a[i13].animate().scaleX(1.04f).scaleY(1.04f).setInterpolator(org.telegram.ui.Components.es.i).setStartDelay((i13 == 0 ? 132 : 500) + 140).setDuration(100L).setListener(new fi.v2(dqVar3, i13, 6)).start();
                                        i13++;
                                    }
                                    foVar.getMessagesController().removeSuggestion(0L, "NEWCOMER_TICKS");
                                    break;
                                }
                            }
                        }
                        break;
                    }
                }
                break;
            case 24:
                fo.G0(foVar);
                break;
            case 25:
                AndroidUtilities.forEachViews((RecyclerView) foVar.x0, (Utilities.Callback<View>) new bi.f(10));
                rm rmVar2 = foVar.A0;
                if (rmVar2 != null) {
                    rmVar2.O(false);
                    break;
                }
                break;
            case 26:
                AndroidUtilities.removeFromParent(foVar.K0);
                break;
            case 27:
                sk skVar2 = foVar.Y;
                if (skVar2 != null && foVar.ob != 5) {
                    skVar2.F0();
                    break;
                }
                break;
            case 28:
                org.telegram.ui.Components.dp dpVar = ((org.telegram.ui.Components.dp[]) foVar.a0.b)[0];
                org.telegram.ui.ActionBar.h5 h5Var = dpVar.d;
                org.telegram.ui.ActionBar.h5 h5Var2 = dpVar.e;
                foVar.F1 = !foVar.F1;
                h5Var.setPivotX(0.0f);
                h5Var2.setPivotX(0.0f);
                if (foVar.F1) {
                    h5Var.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                    h5Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                } else {
                    h5Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                    h5Var2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                }
                AndroidUtilities.runOnUIThread(foVar.G1, 6000L);
                break;
            default:
                foVar.yc();
                break;
        }
    }
}
