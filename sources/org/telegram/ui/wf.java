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

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fo b;

    public /* synthetic */ wf(fo foVar, int i10) {
        this.a = i10;
        this.b = foVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.ActionBar.e1 e1Var;
        sk skVar;
        View sendButton;
        View sendButton2;
        int i10 = this.a;
        int i11 = 2;
        int i12 = 0;
        fo foVar = this.b;
        switch (i10) {
            case 0:
                foVar.D7(true);
                break;
            case 1:
                foVar.D7(true);
                break;
            case 2:
                foVar.D7(false);
                sg.y0 y0Var = new sg.y0((org.telegram.ui.ActionBar.m2) foVar, 24, true);
                y0Var.setDimBehind(false);
                y0Var.setOnHideListener(new we(foVar, i11));
                y0Var.show();
                break;
            case 3:
                fo.U(foVar);
                break;
            case 4:
                fo.f0(foVar);
                break;
            case 5:
                if (foVar.getUserConfig().isPremium()) {
                    foVar.Mb = null;
                    foVar.Uc(true);
                    org.telegram.ui.Components.zc.a0(foVar).c(LocaleController.getString(R.string.AdHidden)).j();
                    foVar.getMessagesController().disableAds(true);
                    break;
                } else {
                    foVar.showDialog(new sg.y0((org.telegram.ui.ActionBar.m2) foVar, 3, true));
                    break;
                }
            case 6:
                sk skVar2 = foVar.Y;
                if (skVar2 != null) {
                    skVar2.o0(true);
                    break;
                }
                break;
            case 7:
                foVar.qa = null;
                foVar.pa = -1;
                View view = foVar.fragmentView;
                if (view != null) {
                    view.requestLayout();
                    break;
                }
                break;
            case 8:
                ArrayList arrayList = foVar.u6;
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    MessageObject messageObject = (MessageObject) arrayList.get(i13);
                    if (messageObject.messageOwner.mentioned && !messageObject.isContentUnread()) {
                        messageObject.setContentIsRead();
                    }
                }
                foVar.l6 = 0;
                foVar.getMessagesController().markMentionsAsRead(foVar.T5, foVar.d());
                foVar.m6 = true;
                foVar.Ob(false);
                org.telegram.ui.ActionBar.m1 m1Var = foVar.Q8;
                if (m1Var != null) {
                    m1Var.dismiss();
                    break;
                }
                break;
            case 9:
                ArrayList arrayList2 = foVar.u6;
                for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                    ((MessageObject) arrayList2.get(i14)).markReactionsAsRead();
                }
                foVar.l1 = 0;
                foVar.Fc(true);
                foVar.getMessagesController().markReactionsAsRead(foVar.T5, foVar.d());
                org.telegram.ui.ActionBar.m1 m1Var2 = foVar.Q8;
                if (m1Var2 != null) {
                    m1Var2.dismiss();
                    break;
                }
                break;
            case 10:
                ArrayList arrayList3 = foVar.u6;
                for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                    ((MessageObject) arrayList3.get(i15)).markPollVotesAsRead();
                }
                foVar.m1 = 0;
                foVar.Ec(true);
                foVar.getMessagesController().markPollVotesAsRead(foVar.T5, foVar.d());
                org.telegram.ui.ActionBar.m1 m1Var3 = foVar.Q8;
                if (m1Var3 != null) {
                    m1Var3.dismiss();
                    break;
                }
                break;
            case 11:
                foVar.Y.F0();
                break;
            case 12:
                fo.g0(foVar);
                break;
            case 13:
                foVar.j8(false, true, 0.0f);
                break;
            case 14:
                org.telegram.ui.Components.zc.a0(foVar).M(LocaleController.getString(R.string.BoostingRemoveRestrictionsSuccessTitle), LocaleController.getString(R.string.BoostingRemoveRestrictionsSuccessSubTitle), R.raw.chats_infotip).j();
                break;
            case 15:
                foVar.j8(false, true, 0.0f);
                break;
            case 16:
                foVar.G5 = null;
                foVar.m8();
                break;
            case 17:
                foVar.G5 = null;
                foVar.m8();
                break;
            case 18:
                foVar.finishFragment();
                break;
            case 19:
                foVar.j8(false, true, 0.0f);
                break;
            case 20:
                foVar.C4 = null;
                foVar.t9();
                foVar.w9();
                break;
            case 21:
                foVar.V6();
                break;
            case 22:
                org.telegram.ui.ActionBar.e1[] e1VarArr = foVar.S8;
                if (e1VarArr != null && e1VarArr.length > 0 && (e1Var = e1VarArr[0]) != null) {
                    e1Var.requestFocus();
                    foVar.S8[0].performAccessibilityAction(64, null);
                    foVar.S8[0].sendAccessibilityEvent(8);
                    break;
                }
                break;
            case 23:
                org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(foVar.getParentActivity(), 3, foVar.ea);
                foVar.pb = a2Var;
                a2Var.setOnShowListener(new uf(foVar, 1));
                foVar.pb.setOnCancelListener(foVar.ma);
                foVar.pb.q(500L);
                break;
            case 24:
                vk vkVar = foVar.t8;
                if (vkVar != null && vkVar.getParent() != null) {
                    foVar.x0.f1();
                    foVar.v8.setDrawingReady(false);
                    foVar.t8.setTag(null);
                    foVar.X0.removeView(foVar.t8);
                    break;
                }
                break;
            case 25:
                foVar.o9 = false;
                foVar.j9(true);
                break;
            case 26:
                foVar.q7 = null;
                org.telegram.ui.Components.u60 u60Var = foVar.b3;
                if (u60Var != null) {
                    org.telegram.ui.Components.r60 cameraContainer = u60Var.getCameraContainer();
                    AnimatorSet animatorSet = new AnimatorSet();
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cameraContainer, (Property<org.telegram.ui.Components.r60, Float>) View.SCALE_X, 0.5f);
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(cameraContainer, (Property<org.telegram.ui.Components.r60, Float>) View.SCALE_Y, 0.5f);
                    Property property = View.ALPHA;
                    animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(cameraContainer, (Property<org.telegram.ui.Components.r60, Float>) property, 0.0f), ObjectAnimator.ofFloat(foVar.b3.getButtonsLayout(), (Property<View, Float>) property, 0.0f), ObjectAnimator.ofInt(foVar.b3.getPaint(), org.telegram.ui.Components.v6.b, 0), ObjectAnimator.ofFloat(foVar.b3.getMuteImageView(), (Property<View, Float>) property, 0.0f));
                    animatorSet.addListener(new bj(foVar, i12));
                    animatorSet.start();
                    break;
                }
                break;
            case 27:
                if (foVar.getParentActivity() != null && foVar.fragmentView != null && (skVar = foVar.Y) != null && (sendButton = skVar.getSendButton()) != null && foVar.Y.getEditField() != null && foVar.Y.getEditField().getText().length() >= 5) {
                    SharedConfig.increaseScheduledOrNoSoundHintShowed();
                    if (foVar.g2 == null) {
                        nj njVar = new nj(4, 0, foVar.getParentActivity(), foVar.ea, false);
                        foVar.g2 = njVar;
                        njVar.a();
                        foVar.g2.setAlpha(0.0f);
                        foVar.g2.setVisibility(4);
                        foVar.g2.setText(LocaleController.getString(R.string.ScheduledOrNoSoundHint));
                        foVar.X0.addView(foVar.g2, w7.z5.a(-2.0f, 10.0f, 0.0f, 10.0f, 0.0f, -2, 51));
                    }
                    foVar.g2.f(sendButton, true);
                    foVar.h2 = true;
                    break;
                }
                break;
            case 28:
                foVar.A0.M.clear();
                rm rmVar = foVar.A0;
                rmVar.L = false;
                rmVar.O(true);
                foVar.Tb(false);
                break;
            default:
                if (foVar.getParentActivity() != null && foVar.fragmentView != null && foVar.Y != null && foVar.Fa == null && foVar.getMessagesController().getSendPaidMessagesStars(foVar.a()) <= 0 && (sendButton2 = foVar.Y.getSendButton()) != null && foVar.Y.getEditField() != null && foVar.Y.getEditField().getText().length() != 0) {
                    SharedConfig.increaseScheduledHintShowed();
                    if (foVar.i2 == null) {
                        org.telegram.ui.Components.v40 v40Var = new org.telegram.ui.Components.v40(4, foVar.getParentActivity(), foVar.ea, false);
                        foVar.i2 = v40Var;
                        v40Var.a();
                        foVar.i2.setAlpha(0.0f);
                        foVar.i2.setVisibility(4);
                        foVar.i2.setText(LocaleController.getString(R.string.ScheduledHint));
                        foVar.X0.addView(foVar.i2, w7.z5.a(-2.0f, 10.0f, 0.0f, 10.0f, 0.0f, -2, 51));
                    }
                    foVar.i2.f(sendButton2, true);
                    foVar.j2 = true;
                    break;
                }
                break;
        }
    }
}
