package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
        org.telegram.ui.ActionBar.f1 f1Var;
        ok okVar;
        View sendButton;
        View sendButton2;
        int i10 = this.a;
        int i11 = 2;
        int i12 = 0;
        zn znVar = this.b;
        switch (i10) {
            case 0:
                znVar.D7(true);
                break;
            case 1:
                znVar.D7(true);
                break;
            case 2:
                znVar.D7(false);
                rg.y0 y0Var = new rg.y0((org.telegram.ui.ActionBar.n2) znVar, 24, true);
                y0Var.setDimBehind(false);
                y0Var.setOnHideListener(new qe(znVar, i11));
                y0Var.show();
                break;
            case 3:
                zn.U(znVar);
                break;
            case 4:
                zn.f0(znVar);
                break;
            case 5:
                if (znVar.getUserConfig().isPremium()) {
                    znVar.Mb = null;
                    znVar.Uc(true);
                    org.telegram.ui.Components.ad.a0(znVar).c(LocaleController.getString(R.string.AdHidden)).j();
                    znVar.getMessagesController().disableAds(true);
                    break;
                } else {
                    znVar.showDialog(new rg.y0((org.telegram.ui.ActionBar.n2) znVar, 3, true));
                    break;
                }
            case 6:
                ok okVar2 = znVar.Y;
                if (okVar2 != null) {
                    okVar2.o0(true);
                    break;
                }
                break;
            case 7:
                znVar.qa = null;
                znVar.pa = -1;
                View view = znVar.fragmentView;
                if (view != null) {
                    view.requestLayout();
                    break;
                }
                break;
            case 8:
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
                znVar.Ob(false);
                org.telegram.ui.ActionBar.n1 n1Var = znVar.Q8;
                if (n1Var != null) {
                    n1Var.dismiss();
                    break;
                }
                break;
            case 9:
                ArrayList arrayList2 = znVar.u6;
                for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                    ((MessageObject) arrayList2.get(i14)).markReactionsAsRead();
                }
                znVar.l1 = 0;
                znVar.Fc(true);
                znVar.getMessagesController().markReactionsAsRead(znVar.T5, znVar.d());
                org.telegram.ui.ActionBar.n1 n1Var2 = znVar.Q8;
                if (n1Var2 != null) {
                    n1Var2.dismiss();
                    break;
                }
                break;
            case 10:
                ArrayList arrayList3 = znVar.u6;
                for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                    ((MessageObject) arrayList3.get(i15)).markPollVotesAsRead();
                }
                znVar.m1 = 0;
                znVar.Ec(true);
                znVar.getMessagesController().markPollVotesAsRead(znVar.T5, znVar.d());
                org.telegram.ui.ActionBar.n1 n1Var3 = znVar.Q8;
                if (n1Var3 != null) {
                    n1Var3.dismiss();
                    break;
                }
                break;
            case 11:
                znVar.Y.F0();
                break;
            case 12:
                zn.g0(znVar);
                break;
            case 13:
                znVar.j8(false, true, 0.0f);
                break;
            case 14:
                org.telegram.ui.Components.ad.a0(znVar).M(LocaleController.getString(R.string.BoostingRemoveRestrictionsSuccessTitle), LocaleController.getString(R.string.BoostingRemoveRestrictionsSuccessSubTitle), R.raw.chats_infotip).j();
                break;
            case 15:
                znVar.j8(false, true, 0.0f);
                break;
            case 16:
                znVar.G5 = null;
                znVar.m8();
                break;
            case 17:
                znVar.G5 = null;
                znVar.m8();
                break;
            case 18:
                znVar.finishFragment();
                break;
            case 19:
                znVar.j8(false, true, 0.0f);
                break;
            case 20:
                znVar.C4 = null;
                znVar.t9();
                znVar.w9();
                break;
            case 21:
                znVar.V6();
                break;
            case 22:
                org.telegram.ui.ActionBar.f1[] f1VarArr = znVar.S8;
                if (f1VarArr != null && f1VarArr.length > 0 && (f1Var = f1VarArr[0]) != null) {
                    f1Var.requestFocus();
                    znVar.S8[0].performAccessibilityAction(64, null);
                    znVar.S8[0].sendAccessibilityEvent(8);
                    break;
                }
                break;
            case 23:
                org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(znVar.getParentActivity(), 3, znVar.ea);
                znVar.pb = b2Var;
                b2Var.setOnShowListener(new pf(znVar, 1));
                znVar.pb.setOnCancelListener(znVar.ma);
                znVar.pb.q(500L);
                break;
            case 24:
                rk rkVar = znVar.t8;
                if (rkVar != null && rkVar.getParent() != null) {
                    znVar.x0.f1();
                    znVar.v8.setDrawingReady(false);
                    znVar.t8.setTag(null);
                    znVar.X0.removeView(znVar.t8);
                    break;
                }
                break;
            case 25:
                znVar.o9 = false;
                znVar.j9(true);
                break;
            case 26:
                znVar.q7 = null;
                org.telegram.ui.Components.y60 y60Var = znVar.b3;
                if (y60Var != null) {
                    org.telegram.ui.Components.v60 cameraContainer = y60Var.getCameraContainer();
                    AnimatorSet animatorSet = new AnimatorSet();
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cameraContainer, (Property<org.telegram.ui.Components.v60, Float>) View.SCALE_X, 0.5f);
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(cameraContainer, (Property<org.telegram.ui.Components.v60, Float>) View.SCALE_Y, 0.5f);
                    Property property = View.ALPHA;
                    animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(cameraContainer, (Property<org.telegram.ui.Components.v60, Float>) property, 0.0f), ObjectAnimator.ofFloat(znVar.b3.getButtonsLayout(), (Property<View, Float>) property, 0.0f), ObjectAnimator.ofInt(znVar.b3.getPaint(), org.telegram.ui.Components.u6.b, 0), ObjectAnimator.ofFloat(znVar.b3.getMuteImageView(), (Property<View, Float>) property, 0.0f));
                    animatorSet.addListener(new xi(znVar, i12));
                    animatorSet.start();
                    break;
                }
                break;
            case 27:
                if (znVar.getParentActivity() != null && znVar.fragmentView != null && (okVar = znVar.Y) != null && (sendButton = okVar.getSendButton()) != null && znVar.Y.getEditField() != null && znVar.Y.getEditField().getText().length() >= 5) {
                    SharedConfig.increaseScheduledOrNoSoundHintShowed();
                    if (znVar.g2 == null) {
                        jj jjVar = new jj(4, 0, znVar.getParentActivity(), znVar.ea, false);
                        znVar.g2 = jjVar;
                        jjVar.a();
                        znVar.g2.setAlpha(0.0f);
                        znVar.g2.setVisibility(4);
                        znVar.g2.setText(LocaleController.getString(R.string.ScheduledOrNoSoundHint));
                        znVar.X0.addView(znVar.g2, w7.x5.a(-2.0f, 10.0f, 0.0f, 10.0f, 0.0f, -2, 51));
                    }
                    znVar.g2.f(sendButton, true);
                    znVar.h2 = true;
                    break;
                }
                break;
            case 28:
                znVar.A0.M.clear();
                mm mmVar = znVar.A0;
                mmVar.L = false;
                mmVar.O(true);
                znVar.Tb(false);
                break;
            default:
                if (znVar.getParentActivity() != null && znVar.fragmentView != null && znVar.Y != null && znVar.Fa == null && znVar.getMessagesController().getSendPaidMessagesStars(znVar.a()) <= 0 && (sendButton2 = znVar.Y.getSendButton()) != null && znVar.Y.getEditField() != null && znVar.Y.getEditField().getText().length() != 0) {
                    SharedConfig.increaseScheduledHintShowed();
                    if (znVar.i2 == null) {
                        org.telegram.ui.Components.z40 z40Var = new org.telegram.ui.Components.z40(4, znVar.getParentActivity(), znVar.ea, false);
                        znVar.i2 = z40Var;
                        z40Var.a();
                        znVar.i2.setAlpha(0.0f);
                        znVar.i2.setVisibility(4);
                        znVar.i2.setText(LocaleController.getString(R.string.ScheduledHint));
                        znVar.X0.addView(znVar.i2, w7.x5.a(-2.0f, 10.0f, 0.0f, 10.0f, 0.0f, -2, 51));
                    }
                    znVar.i2.f(sendButton2, true);
                    znVar.j2 = true;
                    break;
                }
                break;
        }
    }
}
