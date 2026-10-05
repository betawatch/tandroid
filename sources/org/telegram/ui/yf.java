package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yn b;

    public /* synthetic */ yf(yn ynVar, int i10) {
        this.a = i10;
        this.b = ynVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.ActionBar.f1 f1Var;
        jk jkVar;
        View sendButton;
        View sendButton2;
        int i10 = this.a;
        int i11 = 0;
        int i12 = 1;
        yn ynVar = this.b;
        switch (i10) {
            case 0:
                ynVar.A7(false);
                rg.y0 y0Var = new rg.y0((org.telegram.ui.ActionBar.n2) ynVar, 24, true);
                y0Var.setDimBehind(false);
                y0Var.setOnHideListener(new ig(ynVar, i12));
                y0Var.show();
                break;
            case 1:
                yn.M0(ynVar);
                break;
            case 2:
                yn.o0(ynVar);
                break;
            case 3:
                if (ynVar.getUserConfig().isPremium()) {
                    ynVar.Jb = null;
                    ynVar.Pc(true);
                    org.telegram.ui.Components.yc.a0(ynVar).c(LocaleController.getString(R.string.AdHidden)).j();
                    ynVar.getMessagesController().disableAds(true);
                    break;
                } else {
                    ynVar.showDialog(new rg.y0((org.telegram.ui.ActionBar.n2) ynVar, 3, true));
                    break;
                }
            case 4:
                jk jkVar2 = ynVar.W;
                if (jkVar2 != null) {
                    jkVar2.q0(true);
                    break;
                }
                break;
            case 5:
                AndroidUtilities.removeFromParent(ynVar.I0);
                break;
            case 6:
                ynVar.oa = null;
                ynVar.na = -1;
                View view = ynVar.fragmentView;
                if (view != null) {
                    view.requestLayout();
                    break;
                }
                break;
            case 7:
                ArrayList arrayList = ynVar.s6;
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    MessageObject messageObject = (MessageObject) arrayList.get(i13);
                    if (messageObject.messageOwner.mentioned && !messageObject.isContentUnread()) {
                        messageObject.setContentIsRead();
                    }
                }
                ynVar.j6 = 0;
                ynVar.getMessagesController().markMentionsAsRead(ynVar.R5, ynVar.d());
                ynVar.k6 = true;
                ynVar.Jb(false);
                org.telegram.ui.ActionBar.n1 n1Var = ynVar.O8;
                if (n1Var != null) {
                    n1Var.dismiss();
                    break;
                }
                break;
            case 8:
                ArrayList arrayList2 = ynVar.s6;
                for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                    ((MessageObject) arrayList2.get(i14)).markReactionsAsRead();
                }
                ynVar.j1 = 0;
                ynVar.Ac(true);
                ynVar.getMessagesController().markReactionsAsRead(ynVar.R5, ynVar.d());
                org.telegram.ui.ActionBar.n1 n1Var2 = ynVar.O8;
                if (n1Var2 != null) {
                    n1Var2.dismiss();
                    break;
                }
                break;
            case 9:
                ynVar.W.H0();
                break;
            case 10:
                ArrayList arrayList3 = ynVar.s6;
                for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                    ((MessageObject) arrayList3.get(i15)).markPollVotesAsRead();
                }
                ynVar.k1 = 0;
                ynVar.zc(true);
                ynVar.getMessagesController().markPollVotesAsRead(ynVar.R5, ynVar.d());
                org.telegram.ui.ActionBar.n1 n1Var3 = ynVar.O8;
                if (n1Var3 != null) {
                    n1Var3.dismiss();
                    break;
                }
                break;
            case 11:
                yn.m1(ynVar);
                break;
            case 12:
                org.telegram.ui.Components.yc.a0(ynVar).M(LocaleController.getString(R.string.BoostingRemoveRestrictionsSuccessTitle), LocaleController.getString(R.string.BoostingRemoveRestrictionsSuccessSubTitle), R.raw.chats_infotip).j();
                break;
            case 13:
                org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(ynVar.getParentActivity(), 3, ynVar.ca);
                ynVar.mb = b2Var;
                b2Var.setOnShowListener(new of(ynVar, 1));
                ynVar.mb.setOnCancelListener(ynVar.ka);
                ynVar.mb.q(500L);
                break;
            case 14:
                ynVar.gc(false);
                break;
            case 15:
                ynVar.E5 = null;
                ynVar.j8();
                break;
            case 16:
                ynVar.E5 = null;
                ynVar.j8();
                break;
            case 17:
                ynVar.g8(false, true, 0.0f);
                break;
            case 18:
                ynVar.S6();
                break;
            case 19:
                ynVar.finishFragment();
                break;
            case 20:
                ynVar.A4 = null;
                ynVar.o9();
                ynVar.q9();
                break;
            case 21:
                nk nkVar = ynVar.r8;
                if (nkVar != null && nkVar.getParent() != null) {
                    ynVar.v0.g1();
                    ynVar.t8.setDrawingReady(false);
                    ynVar.r8.setTag(null);
                    ynVar.V0.removeView(ynVar.r8);
                    break;
                }
                break;
            case 22:
                ynVar.m9 = false;
                ynVar.f9(true);
                break;
            case 23:
                org.telegram.ui.ActionBar.f1[] f1VarArr = ynVar.Q8;
                if (f1VarArr != null && f1VarArr.length > 0 && (f1Var = f1VarArr[0]) != null) {
                    f1Var.requestFocus();
                    ynVar.Q8[0].performAccessibilityAction(64, null);
                    ynVar.Q8[0].sendAccessibilityEvent(8);
                    break;
                }
                break;
            case 24:
                ynVar.o7 = null;
                org.telegram.ui.Components.k60 k60Var = ynVar.Z2;
                if (k60Var != null) {
                    org.telegram.ui.Components.h60 cameraContainer = k60Var.getCameraContainer();
                    AnimatorSet animatorSet = new AnimatorSet();
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cameraContainer, (Property<org.telegram.ui.Components.h60, Float>) View.SCALE_X, 0.5f);
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(cameraContainer, (Property<org.telegram.ui.Components.h60, Float>) View.SCALE_Y, 0.5f);
                    Property property = View.ALPHA;
                    animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(cameraContainer, (Property<org.telegram.ui.Components.h60, Float>) property, 0.0f), ObjectAnimator.ofFloat(ynVar.Z2.getButtonsLayout(), (Property<View, Float>) property, 0.0f), ObjectAnimator.ofInt(ynVar.Z2.getPaint(), org.telegram.ui.Components.s6.b, 0), ObjectAnimator.ofFloat(ynVar.Z2.getMuteImageView(), (Property<View, Float>) property, 0.0f));
                    animatorSet.addListener(new vi(ynVar, i11));
                    animatorSet.start();
                    break;
                }
                break;
            case 25:
                if (ynVar.getParentActivity() != null && ynVar.fragmentView != null && (jkVar = ynVar.W) != null && (sendButton = jkVar.getSendButton()) != null && ynVar.W.getEditField() != null && ynVar.W.getEditField().getText().length() >= 5) {
                    SharedConfig.increaseScheduledOrNoSoundHintShowed();
                    if (ynVar.e2 == null) {
                        gj gjVar = new gj(4, 0, ynVar.getParentActivity(), ynVar.ca, false);
                        ynVar.e2 = gjVar;
                        gjVar.a();
                        ynVar.e2.setAlpha(0.0f);
                        ynVar.e2.setVisibility(4);
                        ynVar.e2.setText(LocaleController.getString(R.string.ScheduledOrNoSoundHint));
                        ynVar.V0.addView(ynVar.e2, w7.z5.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                    }
                    ynVar.e2.f(sendButton, true);
                    ynVar.f2 = true;
                    break;
                }
                break;
            case 26:
                ynVar.g8(false, true, 0.0f);
                break;
            case 27:
                ynVar.y0.M.clear();
                jm jmVar = ynVar.y0;
                jmVar.L = false;
                jmVar.O(true);
                ynVar.Ob(false);
                break;
            case 28:
                if (ynVar.getParentActivity() != null && ynVar.fragmentView != null && ynVar.W != null && ynVar.Ca == null && ynVar.getMessagesController().getSendPaidMessagesStars(ynVar.a()) <= 0 && (sendButton2 = ynVar.W.getSendButton()) != null && ynVar.W.getEditField() != null && ynVar.W.getEditField().getText().length() != 0) {
                    SharedConfig.increaseScheduledHintShowed();
                    if (ynVar.g2 == null) {
                        org.telegram.ui.Components.m40 m40Var = new org.telegram.ui.Components.m40(4, ynVar.getParentActivity(), ynVar.ca, false);
                        ynVar.g2 = m40Var;
                        m40Var.a();
                        ynVar.g2.setAlpha(0.0f);
                        ynVar.g2.setVisibility(4);
                        ynVar.g2.setText(LocaleController.getString(R.string.ScheduledHint));
                        ynVar.V0.addView(ynVar.g2, w7.z5.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                    }
                    ynVar.g2.f(sendButton2, true);
                    ynVar.h2 = true;
                    break;
                }
                break;
            default:
                AndroidUtilities.removeFromParent(ynVar.H0);
                break;
        }
    }
}
