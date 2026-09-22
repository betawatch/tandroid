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

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class rf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zn b;

    public /* synthetic */ rf(zn znVar, int i10) {
        this.a = i10;
        this.b = znVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        mk mkVar;
        View sendButton;
        org.telegram.ui.ActionBar.f1 f1Var;
        int i10 = this.a;
        int i11 = 0;
        int i12 = 1;
        zn znVar = this.b;
        switch (i10) {
            case 0:
                znVar.A7(true);
                break;
            case 1:
                znVar.A7(true);
                break;
            case 2:
                znVar.A7(false);
                rg.x0 x0Var = new rg.x0((org.telegram.ui.ActionBar.n2) znVar, 24, true);
                x0Var.setDimBehind(false);
                x0Var.setOnHideListener(new jg(znVar, i12));
                x0Var.show();
                break;
            case 3:
                zn.M0(znVar);
                break;
            case 4:
                zn.U0(znVar);
                break;
            case 5:
                if (znVar.getUserConfig().isPremium()) {
                    znVar.Lb = null;
                    znVar.Qc(true);
                    org.telegram.ui.Components.xc.a0(znVar).c(LocaleController.getString(R.string.AdHidden)).j();
                    znVar.getMessagesController().disableAds(true);
                    break;
                } else {
                    znVar.showDialog(new rg.x0((org.telegram.ui.ActionBar.n2) znVar, 3, true));
                    break;
                }
            case 6:
                mk mkVar2 = znVar.Y;
                if (mkVar2 != null) {
                    mkVar2.q0(true);
                    break;
                }
                break;
            case 7:
                znVar.Y.H0();
                break;
            case 8:
                znVar.qa = null;
                znVar.pa = -1;
                View view = znVar.fragmentView;
                if (view != null) {
                    view.requestLayout();
                    break;
                }
                break;
            case 9:
                ArrayList arrayList = znVar.u6;
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    MessageObject messageObject = (MessageObject) arrayList.get(i13);
                    if (messageObject.messageOwner.mentioned && !messageObject.isContentUnread()) {
                        messageObject.setContentIsRead();
                    }
                }
                znVar.l6 = 0;
                znVar.getMessagesController().markMentionsAsRead(znVar.T5, znVar.d());
                znVar.m6 = true;
                znVar.Kb(false);
                org.telegram.ui.ActionBar.n1 n1Var = znVar.Q8;
                if (n1Var != null) {
                    n1Var.dismiss();
                    break;
                }
                break;
            case 10:
                ArrayList arrayList2 = znVar.u6;
                for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                    ((MessageObject) arrayList2.get(i14)).markReactionsAsRead();
                }
                znVar.l1 = 0;
                znVar.Bc(true);
                znVar.getMessagesController().markReactionsAsRead(znVar.T5, znVar.d());
                org.telegram.ui.ActionBar.n1 n1Var2 = znVar.Q8;
                if (n1Var2 != null) {
                    n1Var2.dismiss();
                    break;
                }
                break;
            case 11:
                ArrayList arrayList3 = znVar.u6;
                for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                    ((MessageObject) arrayList3.get(i15)).markPollVotesAsRead();
                }
                znVar.m1 = 0;
                znVar.Ac(true);
                znVar.getMessagesController().markPollVotesAsRead(znVar.T5, znVar.d());
                org.telegram.ui.ActionBar.n1 n1Var3 = znVar.Q8;
                if (n1Var3 != null) {
                    n1Var3.dismiss();
                    break;
                }
                break;
            case 12:
                zn.r0(znVar);
                break;
            case 13:
                org.telegram.ui.Components.xc.a0(znVar).M(LocaleController.getString(R.string.BoostingRemoveRestrictionsSuccessTitle), LocaleController.getString(R.string.BoostingRemoveRestrictionsSuccessSubTitle), R.raw.chats_infotip).j();
                break;
            case 14:
                znVar.g8(false, true, 0.0f);
                break;
            case 15:
                znVar.hc(false);
                break;
            case 16:
                AndroidUtilities.removeFromParent(znVar.L0);
                break;
            case 17:
                znVar.C4 = null;
                znVar.o9();
                znVar.r9();
                break;
            case 18:
                znVar.S6();
                break;
            case 19:
                znVar.finishFragment();
                break;
            case 20:
                znVar.o9 = false;
                znVar.e9(true);
                break;
            case 21:
                qk qkVar = znVar.t8;
                if (qkVar != null && qkVar.getParent() != null) {
                    znVar.x0.g1();
                    znVar.v8.setDrawingReady(false);
                    znVar.t8.setTag(null);
                    znVar.X0.removeView(znVar.t8);
                    break;
                }
                break;
            case 22:
                znVar.q7 = null;
                org.telegram.ui.Components.h60 h60Var = znVar.b3;
                if (h60Var != null) {
                    org.telegram.ui.Components.e60 cameraContainer = h60Var.getCameraContainer();
                    AnimatorSet animatorSet = new AnimatorSet();
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cameraContainer, (Property<org.telegram.ui.Components.e60, Float>) View.SCALE_X, 0.5f);
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(cameraContainer, (Property<org.telegram.ui.Components.e60, Float>) View.SCALE_Y, 0.5f);
                    Property property = View.ALPHA;
                    animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(cameraContainer, (Property<org.telegram.ui.Components.e60, Float>) property, 0.0f), ObjectAnimator.ofFloat(znVar.b3.getButtonsLayout(), (Property<View, Float>) property, 0.0f), ObjectAnimator.ofInt(znVar.b3.getPaint(), org.telegram.ui.Components.r6.b, 0), ObjectAnimator.ofFloat(znVar.b3.getMuteImageView(), (Property<View, Float>) property, 0.0f));
                    animatorSet.addListener(new xi(znVar, i11));
                    animatorSet.start();
                    break;
                }
                break;
            case 23:
                znVar.G5 = null;
                znVar.j8();
                break;
            case 24:
                znVar.G5 = null;
                znVar.j8();
                break;
            case 25:
                if (znVar.getParentActivity() != null && znVar.fragmentView != null && (mkVar = znVar.Y) != null && (sendButton = mkVar.getSendButton()) != null && znVar.Y.getEditField() != null && znVar.Y.getEditField().getText().length() >= 5) {
                    SharedConfig.increaseScheduledOrNoSoundHintShowed();
                    if (znVar.g2 == null) {
                        ij ijVar = new ij(4, 0, znVar.getParentActivity(), znVar.ea, false);
                        znVar.g2 = ijVar;
                        ijVar.a();
                        znVar.g2.setAlpha(0.0f);
                        znVar.g2.setVisibility(4);
                        znVar.g2.setText(LocaleController.getString(R.string.ScheduledOrNoSoundHint));
                        znVar.X0.addView(znVar.g2, w7.y5.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                    }
                    znVar.g2.f(sendButton, true);
                    znVar.h2 = true;
                    break;
                }
                break;
            case 26:
                org.telegram.ui.ActionBar.f1[] f1VarArr = znVar.S8;
                if (f1VarArr != null && f1VarArr.length > 0 && (f1Var = f1VarArr[0]) != null) {
                    f1Var.requestFocus();
                    znVar.S8[0].performAccessibilityAction(64, null);
                    znVar.S8[0].sendAccessibilityEvent(8);
                    break;
                }
                break;
            case 27:
                znVar.g8(false, true, 0.0f);
                break;
            case 28:
                znVar.A0.M.clear();
                lm lmVar = znVar.A0;
                lmVar.L = false;
                lmVar.O(true);
                znVar.Pb(false);
                break;
            default:
                AndroidUtilities.removeFromParent(znVar.J0);
                break;
        }
    }
}
