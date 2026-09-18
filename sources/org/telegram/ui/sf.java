package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bo b;

    public /* synthetic */ sf(bo boVar, int i10) {
        this.a = i10;
        this.b = boVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.ActionBar.g1 g1Var;
        nk nkVar;
        View sendButton;
        View sendButton2;
        switch (this.a) {
            case 0:
                this.b.A7(true);
                break;
            case 1:
                this.b.A7(true);
                break;
            case 2:
                bo boVar = this.b;
                boVar.A7(false);
                rg.x0 x0Var = new rg.x0((org.telegram.ui.ActionBar.o2) boVar, 24, true);
                x0Var.setDimBehind(false);
                x0Var.setOnHideListener(new lg(boVar, 1));
                x0Var.show();
                break;
            case 3:
                bo.P0(this.b);
                break;
            case 4:
                bo.m0(this.b);
                break;
            case 5:
                bo boVar2 = this.b;
                if (boVar2.getUserConfig().isPremium()) {
                    boVar2.Lb = null;
                    boVar2.Qc(true);
                    org.telegram.ui.Components.vc.a0(boVar2).c(LocaleController.getString(R.string.AdHidden)).j();
                    boVar2.getMessagesController().disableAds(true);
                    break;
                } else {
                    boVar2.showDialog(new rg.x0((org.telegram.ui.ActionBar.o2) boVar2, 3, true));
                    break;
                }
            case 6:
                nk nkVar2 = this.b.Y;
                if (nkVar2 != null) {
                    nkVar2.r0(true);
                    break;
                }
                break;
            case 7:
                AndroidUtilities.removeFromParent(this.b.K0);
                break;
            case 8:
                this.b.Y.I0();
                break;
            case 9:
                bo boVar3 = this.b;
                boVar3.qa = null;
                boVar3.pa = -1;
                View view = boVar3.fragmentView;
                if (view != null) {
                    view.requestLayout();
                    break;
                }
                break;
            case 10:
                bo boVar4 = this.b;
                ArrayList arrayList = boVar4.u6;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    MessageObject messageObject = (MessageObject) arrayList.get(i10);
                    if (messageObject.messageOwner.mentioned && !messageObject.isContentUnread()) {
                        messageObject.setContentIsRead();
                    }
                }
                boVar4.l6 = 0;
                boVar4.getMessagesController().markMentionsAsRead(boVar4.T5, boVar4.d());
                boVar4.m6 = true;
                boVar4.Kb(false);
                org.telegram.ui.ActionBar.o1 o1Var = boVar4.Q8;
                if (o1Var != null) {
                    o1Var.dismiss();
                    break;
                }
                break;
            case 11:
                bo boVar5 = this.b;
                ArrayList arrayList2 = boVar5.u6;
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    ((MessageObject) arrayList2.get(i11)).markReactionsAsRead();
                }
                boVar5.l1 = 0;
                boVar5.Bc(true);
                boVar5.getMessagesController().markReactionsAsRead(boVar5.T5, boVar5.d());
                org.telegram.ui.ActionBar.o1 o1Var2 = boVar5.Q8;
                if (o1Var2 != null) {
                    o1Var2.dismiss();
                    break;
                }
                break;
            case 12:
                bo boVar6 = this.b;
                ArrayList arrayList3 = boVar6.u6;
                for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                    ((MessageObject) arrayList3.get(i12)).markPollVotesAsRead();
                }
                boVar6.m1 = 0;
                boVar6.Ac(true);
                boVar6.getMessagesController().markPollVotesAsRead(boVar6.T5, boVar6.d());
                org.telegram.ui.ActionBar.o1 o1Var3 = boVar6.Q8;
                if (o1Var3 != null) {
                    o1Var3.dismiss();
                    break;
                }
                break;
            case 13:
                bo.n1(this.b);
                break;
            case 14:
                org.telegram.ui.Components.vc.a0(this.b).M(LocaleController.getString(R.string.BoostingRemoveRestrictionsSuccessTitle), LocaleController.getString(R.string.BoostingRemoveRestrictionsSuccessSubTitle), R.raw.chats_infotip).j();
                break;
            case 15:
                this.b.hc(false);
                break;
            case 16:
                bo boVar7 = this.b;
                boVar7.G5 = null;
                boVar7.j8();
                break;
            case 17:
                bo boVar8 = this.b;
                boVar8.G5 = null;
                boVar8.j8();
                break;
            case 18:
                this.b.S6();
                break;
            case 19:
                this.b.finishFragment();
                break;
            case 20:
                this.b.g8(false, true, 0.0f);
                break;
            case 21:
                AndroidUtilities.removeFromParent(this.b.L0);
                break;
            case 22:
                bo boVar9 = this.b;
                boVar9.C4 = null;
                boVar9.o9();
                boVar9.r9();
                break;
            case 23:
                bo boVar10 = this.b;
                rk rkVar = boVar10.t8;
                if (rkVar != null && rkVar.getParent() != null) {
                    boVar10.x0.g1();
                    boVar10.v8.setDrawingReady(false);
                    boVar10.t8.setTag(null);
                    boVar10.X0.removeView(boVar10.t8);
                    break;
                }
                break;
            case 24:
                bo boVar11 = this.b;
                boVar11.o9 = false;
                boVar11.e9(true);
                break;
            case 25:
                bo boVar12 = this.b;
                org.telegram.ui.ActionBar.g1[] g1VarArr = boVar12.S8;
                if (g1VarArr != null && g1VarArr.length > 0 && (g1Var = g1VarArr[0]) != null) {
                    g1Var.requestFocus();
                    boVar12.S8[0].performAccessibilityAction(64, null);
                    boVar12.S8[0].sendAccessibilityEvent(8);
                    break;
                }
                break;
            case 26:
                bo boVar13 = this.b;
                if (boVar13.getParentActivity() != null && boVar13.fragmentView != null && (nkVar = boVar13.Y) != null && (sendButton = nkVar.getSendButton()) != null && boVar13.Y.getEditField() != null && boVar13.Y.getEditField().getText().length() >= 5) {
                    SharedConfig.increaseScheduledOrNoSoundHintShowed();
                    if (boVar13.g2 == null) {
                        jj jjVar = new jj(4, 0, boVar13.getParentActivity(), boVar13.ea, false);
                        boVar13.g2 = jjVar;
                        jjVar.a();
                        boVar13.g2.setAlpha(0.0f);
                        boVar13.g2.setVisibility(4);
                        boVar13.g2.setText(LocaleController.getString(R.string.ScheduledOrNoSoundHint));
                        boVar13.X0.addView(boVar13.g2, w7.x5.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                    }
                    boVar13.g2.f(sendButton, true);
                    boVar13.h2 = true;
                    break;
                }
                break;
            case 27:
                bo boVar14 = this.b;
                if (boVar14.getParentActivity() != null && boVar14.fragmentView != null && boVar14.Y != null && boVar14.Ea == null && boVar14.getMessagesController().getSendPaidMessagesStars(boVar14.a()) <= 0 && (sendButton2 = boVar14.Y.getSendButton()) != null && boVar14.Y.getEditField() != null && boVar14.Y.getEditField().getText().length() != 0) {
                    SharedConfig.increaseScheduledHintShowed();
                    if (boVar14.i2 == null) {
                        org.telegram.ui.Components.i40 i40Var = new org.telegram.ui.Components.i40(4, boVar14.getParentActivity(), boVar14.ea, false);
                        boVar14.i2 = i40Var;
                        i40Var.a();
                        boVar14.i2.setAlpha(0.0f);
                        boVar14.i2.setVisibility(4);
                        boVar14.i2.setText(LocaleController.getString(R.string.ScheduledHint));
                        boVar14.X0.addView(boVar14.i2, w7.x5.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                    }
                    boVar14.i2.f(sendButton2, true);
                    boVar14.j2 = true;
                    break;
                }
                break;
            case 28:
                this.b.g8(false, true, 0.0f);
                break;
            default:
                bo boVar15 = this.b;
                boVar15.A0.M.clear();
                nm nmVar = boVar15.A0;
                nmVar.L = false;
                nmVar.O(true);
                boVar15.Pb(false);
                break;
        }
    }
}
