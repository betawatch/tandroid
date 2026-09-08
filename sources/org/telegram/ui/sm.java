package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotForumHelper;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.camera.CameraView;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class sm implements org.telegram.ui.Components.og {
    public int a;
    public boolean b;
    public final /* synthetic */ co c;

    public sm(co coVar) {
        this.c = coVar;
    }

    @Override // org.telegram.ui.Components.og
    public final void B0(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        co coVar = this.c;
        if (coVar.i0 == null) {
            return;
        }
        kVar = ((org.telegram.ui.ActionBar.n2) coVar).actionBar;
        final org.telegram.ui.ActionBar.z n10 = kVar.n();
        org.telegram.ui.Components.my0 my0Var = coVar.d1;
        if (my0Var != null) {
            my0Var.e();
        }
        final int i12 = 1;
        final int i13 = 0;
        if (i11 - i10 > 0) {
            org.telegram.ui.ActionBar.y yVar = coVar.i0;
            if (yVar.o == null) {
                yVar.o = 1;
                if (coVar.i0.l != 0) {
                    if (!(coVar.R3 == 3 && coVar.I8() == coVar.getUserConfig().getClientUserId()) && (coVar.R3 != 0 || (!(coVar.d4 == 0 || coVar.h4) || UserObject.isReplyUser(coVar.f) || coVar.A9()))) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(AndroidUtilities.dp(48.0f), 0.0f);
                        ofFloat.setDuration(220L);
                        ofFloat.setInterpolator(org.telegram.ui.Components.pr.f);
                        ofFloat.addListener(new rm(this, n10, 0));
                        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.qm
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (i13) {
                                    case 0:
                                        n10.r(((Float) valueAnimator.getAnimatedValue()).floatValue());
                                        break;
                                    default:
                                        n10.r(((Float) valueAnimator.getAnimatedValue()).floatValue());
                                        break;
                                }
                            }
                        });
                        ofFloat.start();
                    } else {
                        coVar.i0.f(0);
                        co.J3(coVar);
                        org.telegram.ui.ActionBar.v0 v0Var = coVar.h0;
                        if (v0Var != null) {
                            v0Var.setVisibility(8);
                        }
                        org.telegram.ui.ActionBar.y yVar2 = coVar.e0;
                        if (yVar2 != null) {
                            yVar2.f(8);
                        }
                        hs hsVar = coVar.d0;
                        if (hsVar != null) {
                            hsVar.b(false);
                        }
                    }
                }
            }
            coVar.A4 = i10;
            coVar.B4 = i11;
            return;
        }
        org.telegram.ui.ActionBar.y yVar3 = coVar.i0;
        if (yVar3.o != null) {
            yVar3.o = null;
            if (yVar3.l != 8) {
                if (!(coVar.R3 == 3 && coVar.I8() == coVar.getUserConfig().getClientUserId()) && (coVar.R3 != 0 || (!(coVar.d4 == 0 || coVar.h4) || UserObject.isReplyUser(coVar.f) || coVar.A9()))) {
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, AndroidUtilities.dp(48.0f));
                    ofFloat2.setDuration(220L);
                    ofFloat2.setInterpolator(org.telegram.ui.Components.pr.f);
                    ofFloat2.addListener(new rm(this, n10, 1));
                    ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.qm
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (i12) {
                                case 0:
                                    n10.r(((Float) valueAnimator.getAnimatedValue()).floatValue());
                                    break;
                                default:
                                    n10.r(((Float) valueAnimator.getAnimatedValue()).floatValue());
                                    break;
                            }
                        }
                    });
                    ofFloat2.start();
                    return;
                }
                coVar.i0.f(8);
                if (coVar.Y.k0() && TextUtils.isEmpty(coVar.Y.getSlowModeTimer())) {
                    org.telegram.ui.ActionBar.v0 v0Var2 = coVar.h0;
                    if (v0Var2 != null) {
                        v0Var2.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.y yVar4 = coVar.e0;
                    if (yVar4 != null) {
                        yVar4.f(0);
                    }
                    hs hsVar2 = coVar.d0;
                    if (hsVar2 != null) {
                        hsVar2.b(true);
                        return;
                    }
                    return;
                }
                org.telegram.ui.ActionBar.v0 v0Var3 = coVar.h0;
                if (v0Var3 != null) {
                    v0Var3.setVisibility(0);
                }
                org.telegram.ui.ActionBar.y yVar5 = coVar.e0;
                if (yVar5 != null) {
                    yVar5.f(8);
                }
                hs hsVar3 = coVar.d0;
                if (hsVar3 != null) {
                    hsVar3.b(false);
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.og
    public final void C() {
        this.c.Vb(true, false);
    }

    @Override // org.telegram.ui.Components.og
    public final void D0() {
        co coVar = this.c;
        coVar.o9 = true;
        om omVar = coVar.A0;
        if (omVar != null) {
            omVar.K(true);
        }
    }

    @Override // org.telegram.ui.Components.og
    public final void G(CharSequence charSequence, boolean z10, int i10, int i11, long j3) {
        hg.g1 g1Var;
        MessageObject messageObject;
        int i12;
        long topicId;
        MessagePreviewParams messagePreviewParams;
        MessagePreviewParams.Messages messages;
        TLRPC.Message message;
        MessagePreviewParams.Messages messages2;
        co coVar = this.c;
        ArrayList arrayList = coVar.u6;
        if (coVar.y0 != null) {
            coVar.b0 = coVar.Y.getBackgroundTop();
        }
        fk fkVar = coVar.I1;
        if (fkVar != null && fkVar.getAdapter() != null) {
            coVar.I1.getAdapter().w.a(charSequence);
        }
        boolean z11 = false;
        if (i10 != 0) {
            if (coVar.S3 == -1) {
                coVar.S3 = 0;
            }
            if (charSequence != null) {
                coVar.S3++;
            }
            MessagePreviewParams messagePreviewParams2 = coVar.f5;
            if (messagePreviewParams2 != null && (messages2 = messagePreviewParams2.forwardMessages) != null && !messages2.messages.isEmpty()) {
                coVar.S3 += coVar.f5.forwardMessages.messages.size();
            }
            coVar.Ec(false);
        }
        if (!TextUtils.isEmpty(charSequence) && (messagePreviewParams = coVar.f5) != null && (messages = messagePreviewParams.forwardMessages) != null && !messages.messages.isEmpty() && coVar.f5.quote == null && j3 <= 0) {
            ArrayList<MessageObject> arrayList2 = new ArrayList<>();
            coVar.f5.forwardMessages.getSelectedMessages(arrayList2);
            boolean z12 = arrayList2.size() > 0;
            TLRPC.Peer peer = coVar.getMessagesController().getPeer(coVar.T5);
            int i13 = 0;
            while (true) {
                if (i13 >= arrayList2.size()) {
                    z11 = z12;
                    break;
                }
                MessageObject messageObject2 = arrayList2.get(i13);
                if (messageObject2 != null && (message = messageObject2.messageOwner) != null && !MessageObject.peersEqual(message.peer_id, peer)) {
                    break;
                } else {
                    i13++;
                }
            }
            if (z11) {
                org.telegram.ui.Components.qc M = org.telegram.ui.Components.yc.a0(coVar).M(LocaleController.getString(R.string.SwipeToReplyHint), LocaleController.getString(R.string.SwipeToReplyHintMessage), R.raw.hint_swipe_reply);
                org.telegram.ui.Components.aj0 aj0Var = ((org.telegram.ui.Components.nc) M.e).a;
                aj0Var.setScaleX(1.8f);
                aj0Var.setScaleY(1.8f);
                M.k(true);
            }
        }
        if (ChatObject.isForum(coVar.e) && !coVar.h4 && (messageObject = coVar.n5) != null) {
            TLRPC.TL_forumTopic tL_forumTopic = messageObject.replyToForumTopic;
            if (tL_forumTopic != null) {
                topicId = tL_forumTopic.id;
            } else {
                i12 = ((org.telegram.ui.ActionBar.n2) coVar).currentAccount;
                topicId = MessageObject.getTopicId(i12, coVar.n5.messageOwner, true);
            }
            long j10 = topicId;
            if (j10 != 0) {
                coVar.getMediaDataController().cleanDraft(coVar.T5, j10, false);
            }
        }
        coVar.zb(false, null, null, null, null, z10, i10, null, false, j3, null, true);
        mk mkVar = coVar.Y;
        if (mkVar != null && mkVar.getEmojiView() != null && (g1Var = coVar.Y.getEmojiView().T0) != null) {
            if (g1Var.e) {
                MessagesController.getInstance(g1Var.a).sendTyping(g1Var.b, g1Var.c, 2, 0);
            }
            g1Var.f = -1L;
        }
        if (coVar.getMessagesController().premiumFeaturesBlocked() || coVar.getMessagesController().transcribeAudioTrialWeeklyNumber > 0 || coVar.getMessagesController().didPressTranscribeButtonEnough() || coVar.getUserConfig().isPremium() || TextUtils.isEmpty(charSequence) || arrayList == null) {
            return;
        }
        for (int i14 = 1; i14 < Math.min(5, arrayList.size()); i14++) {
            MessageObject messageObject3 = (MessageObject) arrayList.get(i14);
            if (messageObject3 != null && !messageObject3.isOutOwner() && ((messageObject3.isVoice() || messageObject3.isRoundVideo()) && messageObject3.isContentUnread())) {
                org.telegram.ui.Components.d31.u(messageObject3, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.og
    public final void G0() {
        this.c.ja(0, false);
    }

    @Override // org.telegram.ui.Components.og
    public final TLRPC.TL_channels_sendAsPeers H() {
        return this.c.ha;
    }

    @Override // org.telegram.ui.Components.og
    public final void J(float f7, int i10) {
        gl glVar = this.c.b3;
        if (glVar != null) {
            glVar.e(f7, i10);
        }
    }

    @Override // org.telegram.ui.Components.og
    public final void P0() {
        co coVar = this.c;
        int sendingMessageId = coVar.getSendMessagesHelper().getSendingMessageId(coVar.T5);
        if (sendingMessageId != 0) {
            this.c.F(sendingMessageId, 0, 0, 0, true, true);
        }
    }

    @Override // org.telegram.ui.Components.og
    public final void U() {
        co coVar = this.c;
        mk mkVar = coVar.Y;
        boolean z10 = mkVar.y3;
        org.telegram.ui.Components.eg egVar = mkVar.U0;
        boolean z11 = false;
        boolean z12 = egVar != null && egVar.getCurrentPage() == 0;
        le.b bVar = coVar.xc;
        if (z10 && !z12) {
            z11 = true;
        }
        bVar.a(z11, true);
    }

    @Override // org.telegram.ui.Components.og
    public final void V0(int i10) {
        int i11 = i10 == 0 ? 8 : 0;
        co coVar = this.c;
        if (coVar.c3.getVisibility() != i11) {
            coVar.c3.setVisibility(i11);
        }
    }

    @Override // org.telegram.ui.Components.og
    public final void V1() {
        org.telegram.ui.Components.my0 my0Var = this.c.d1;
        if (my0Var != null) {
            my0Var.e();
        }
    }

    @Override // org.telegram.ui.Components.og
    public final void W(boolean z10) {
        this.c.Vb(false, z10);
    }

    @Override // org.telegram.ui.Components.og
    public final int W0() {
        return this.c.X0.getHeight();
    }

    @Override // org.telegram.ui.Components.og
    public final void X1(int i10) {
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.dp(72.0f);
        co coVar = this.c;
        if (i10 < currentActionBarHeight) {
            coVar.Z4 = false;
            if (coVar.d1.getVisibility() == 0) {
                coVar.d1.setVisibility(4);
            }
        } else {
            coVar.Z4 = true;
            if (coVar.d1.getVisibility() == 4 && !coVar.isInPreviewMode()) {
                coVar.d1.setVisibility(0);
            }
        }
        coVar.a5 = true ^ coVar.Y.t0();
        int i11 = i10 + (coVar.Y.t0() ? 65536 : 0);
        if (this.a != i11) {
            coVar.b0 = 0;
        }
        this.a = i11;
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ TL_stories.StoryItem Y0() {
        return null;
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ boolean a1(long j3) {
        return false;
    }

    @Override // org.telegram.ui.Components.og
    public final void a2() {
        um umVar;
        int indexOfChild;
        co coVar = this.c;
        if (coVar.getParentActivity() != null) {
            if ((coVar.e == null && coVar.a8 == null) || coVar.fragmentView == null) {
                return;
            }
            org.telegram.ui.Components.i40 i40Var = coVar.f2;
            if ((i40Var == null || i40Var.getVisibility() != 0) && (indexOfChild = (umVar = coVar.X0).indexOfChild(coVar.S)) != -1) {
                try {
                    coVar.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                if (coVar.f2 == null) {
                    org.telegram.ui.Components.i40 i40Var2 = new org.telegram.ui.Components.i40(9, coVar.getParentActivity(), coVar.ea, false);
                    coVar.f2 = i40Var2;
                    i40Var2.setVisibility(8);
                    umVar.addView(coVar.f2, indexOfChild + 1, w7.x5.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                }
                TLRPC.UserFull userFull = coVar.a8;
                if (userFull != null && userFull.voice_messages_forbidden) {
                    coVar.f2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(coVar.Y.c1 ? R.string.VideoMessagesRestrictedByPrivacy : R.string.VoiceMessagesRestrictedByPrivacy, coVar.f.first_name)));
                } else if (ChatObject.canSendVoice(coVar.e) || ChatObject.canSendRoundVideo(coVar.e)) {
                    if (ChatObject.isActionBannedByDefault(coVar.e, 20)) {
                        coVar.f2.setText(LocaleController.getString(R.string.GlobalAttachVoiceRestricted));
                    } else if (ChatObject.isActionBannedByDefault(coVar.e, 21)) {
                        coVar.f2.setText(LocaleController.getString(R.string.GlobalAttachRoundRestricted));
                    } else if (ChatObject.isActionBannedByDefault(coVar.e, 7)) {
                        coVar.f2.setText(LocaleController.getString(R.string.GlobalAttachMediaRestricted));
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = coVar.e.banned_rights;
                        if (tL_chatBannedRights == null) {
                            return;
                        }
                        if (AndroidUtilities.isBannedForever(tL_chatBannedRights)) {
                            coVar.f2.setText(LocaleController.getString(R.string.AttachMediaRestrictedForever));
                        } else {
                            coVar.f2.setText(LocaleController.formatString("AttachMediaRestricted", R.string.AttachMediaRestricted, LocaleController.formatDateForBan(coVar.e.banned_rights.until_date)));
                        }
                    }
                } else {
                    if (coVar.K6()) {
                        return;
                    }
                    if (coVar.Y.c1) {
                        coVar.f2.setText(ChatObject.getRestrictedErrorText(coVar.e, 21));
                    } else {
                        coVar.f2.setText(ChatObject.getRestrictedErrorText(coVar.e, 20));
                    }
                }
                View sendButton = coVar.Y.getSendButton();
                View audioVideoButtonContainer = coVar.Y.getAudioVideoButtonContainer();
                if (sendButton.getAlpha() < audioVideoButtonContainer.getAlpha()) {
                    sendButton = audioVideoButtonContainer;
                }
                coVar.f2.f(sendButton, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.og
    public final void b2(boolean z10) {
        co coVar = this.c;
        View view = coVar.w2;
        if (view != null) {
            view.setVisibility(8);
        }
        coVar.b5 = !z10;
    }

    @Override // org.telegram.ui.Components.og
    public final void c2(int i10, int i11, int i12, long j3, long j10, boolean z10) {
        co coVar = this.c;
        if (coVar.b3 == null && CameraView.isCameraAllowed() && coVar.getParentActivity() != null) {
            gl glVar = new gl(coVar, coVar.getParentActivity(), coVar, coVar.ea);
            coVar.b3 = glVar;
            glVar.setClipToPadding(false);
            gl glVar2 = coVar.b3;
            bh.b bVar = coVar.J;
            jj jjVar = coVar.w;
            LinearLayout linearLayout = glVar2.R0;
            dh.d c10 = bVar.c(linearLayout, jjVar, false);
            c10.o(AndroidUtilities.dp(6.0f));
            c10.p(AndroidUtilities.dp(21.0f));
            linearLayout.setBackground(c10);
            int indexOfChild = coVar.X0.indexOfChild(coVar.S);
            if (indexOfChild < 0) {
                indexOfChild = coVar.X0.getChildCount();
            }
            coVar.X0.addView(coVar.b3, Math.min(indexOfChild + 1, coVar.X0.getChildCount()), w7.x5.e(-1, -1, 51));
        }
        gl glVar3 = coVar.b3;
        if (glVar3 != null) {
            if (i10 == 0) {
                glVar3.l(false);
                coVar.x0.B0();
                coVar.A0.T();
            } else if (i10 == 1 || i10 == 3 || i10 == 4) {
                glVar3.k(i10, i11, i12, j3, j10, z10);
            } else if (i10 == 2 || i10 == 5) {
                glVar3.d(i10 == 2);
            }
        }
    }

    @Override // org.telegram.ui.Components.og
    public final boolean d1() {
        gl glVar = this.c.b3;
        return (glVar == null || glVar.e0) ? false : true;
    }

    @Override // org.telegram.ui.Components.og
    public final void f1(CharSequence charSequence, boolean z10, boolean z11) {
        CharSequence charSequence2;
        org.telegram.ui.Components.i40 i40Var;
        TLRPC.ChatFull chatFull;
        MediaController mediaController = MediaController.getInstance();
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        boolean z12 = false;
        co coVar = this.c;
        mediaController.setInputFieldHasText(!isEmpty || coVar.Y.r0());
        fk fkVar = coVar.I1;
        if (fkVar == null || fkVar.getAdapter() == null) {
            charSequence2 = charSequence;
        } else {
            charSequence2 = charSequence;
            coVar.I1.getAdapter().U(charSequence2, coVar.Y.getCursorPosition(), coVar.u6, false, false);
        }
        i9.s sVar = coVar.J5;
        if (sVar != null) {
            AndroidUtilities.cancelRunOnUIThread(sVar);
            coVar.J5 = null;
        }
        TLRPC.Chat chat = coVar.e;
        if (chat == null || ChatObject.canSendEmbed(chat)) {
            mk mkVar = coVar.Y;
            if (mkVar.X2 && (!mkVar.r0() || !coVar.Y.Z1)) {
                if (z10) {
                    coVar.Ya(charSequence2, true);
                } else {
                    coVar.M6(charSequence2);
                    i9.s sVar2 = new i9.s(this, charSequence2, false, 21);
                    coVar.J5 = sVar2;
                    AndroidUtilities.runOnUIThread(sVar2, AndroidUtilities.WEB_URL == null ? 3000L : 1000L);
                }
            }
        }
        xk xkVar = coVar.xa;
        if (xkVar != null) {
            ArrayList arrayList = xkVar.F;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((fz) arrayList.get(i10)).n = true;
            }
        }
        ah.e1 e1Var = ah.e1.B;
        if (e1Var != null) {
            e1Var.l = true;
        }
        ah.e1 e1Var2 = ah.e1.C;
        if (e1Var2 != null) {
            e1Var2.l = true;
        }
        if (z11) {
            return;
        }
        ij ijVar = coVar.g2;
        if ((ijVar != null && ijVar.getVisibility() == 0) || ((i40Var = coVar.i2) != null && i40Var.getVisibility() == 0)) {
            ij ijVar2 = coVar.g2;
            if (ijVar2 != null) {
                ijVar2.b(true);
            }
            org.telegram.ui.Components.i40 i40Var2 = coVar.i2;
            if (i40Var2 != null) {
                i40Var2.b(true);
                return;
            }
            return;
        }
        qf qfVar = coVar.Na;
        if (UserObject.isUserSelf(coVar.f) || ((chatFull = coVar.Z7) != null && chatFull.slowmode_next_send_date > 0 && coVar.R3 == 0)) {
            z12 = true;
        }
        if (coVar.j2 || coVar.h2 || z12 || SharedConfig.scheduledHintShows >= 3 || coVar.Y.r0()) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(qfVar);
        AndroidUtilities.runOnUIThread(qfVar, 4000L);
    }

    @Override // org.telegram.ui.Components.og
    public final void g2() {
        co coVar = this.c;
        ij ijVar = coVar.g2;
        if (ijVar != null) {
            ijVar.b(true);
        }
        org.telegram.ui.Components.i40 i40Var = coVar.i2;
        if (i40Var != null) {
            i40Var.b(true);
        }
    }

    @Override // org.telegram.ui.Components.og
    public final void h() {
        this.c.vc();
    }

    @Override // org.telegram.ui.Components.og
    public final void h1() {
        gl glVar = this.c.b3;
        if (glVar != null) {
            glVar.q();
        }
    }

    @Override // org.telegram.ui.Components.og
    public final boolean i1() {
        co coVar = this.c;
        TLRPC.User user = coVar.f;
        return (user == null || UserObject.isUserSelf(user) || coVar.f.bot || coVar.h != null || coVar.R3 != 0) ? false : true;
    }

    @Override // org.telegram.ui.Components.og
    public final void k() {
        org.telegram.ui.Components.my0 my0Var = this.c.d1;
        if (my0Var != null) {
            my0Var.f();
        }
    }

    @Override // org.telegram.ui.Components.og
    public final void k1() {
        int i10;
        co coVar = this.c;
        Activity parentActivity = coVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.n2) coVar).currentAccount;
        long j3 = coVar.T5;
        MessageSuggestionParams messageSuggestionParams = coVar.g5;
        if (messageSuggestionParams == null) {
            messageSuggestionParams = MessageSuggestionParams.empty();
        }
        new zh.e0(parentActivity, i10, j3, messageSuggestionParams, coVar, coVar.getResourceProvider(), 0, new bf(coVar, 3)).show();
    }

    @Override // org.telegram.ui.Components.og
    public final boolean l() {
        return this.c.K6();
    }

    @Override // org.telegram.ui.Components.og
    public final void l0() {
        org.telegram.ui.Components.my0 my0Var = this.c.d1;
        if (my0Var != null) {
            my0Var.f();
        }
    }

    @Override // org.telegram.ui.Components.og
    public final void l1() {
        this.c.H6();
    }

    @Override // org.telegram.ui.Components.og
    public final void m1() {
        int i10;
        int i11;
        co coVar = this.c;
        coVar.W6();
        mk mkVar = coVar.Y;
        boolean z10 = mkVar.y3;
        org.telegram.ui.Components.eg egVar = mkVar.U0;
        coVar.xc.a(z10 && !(egVar != null && egVar.getCurrentPage() == 0), true);
        if (z10) {
            Activity parentActivity = coVar.getParentActivity();
            i11 = ((org.telegram.ui.ActionBar.n2) coVar).classGuid;
            AndroidUtilities.setAdjustResizeToNothing(parentActivity, i11);
            org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.w;
            if (qcVar != null && qcVar.l) {
                qcVar.b();
            }
        } else {
            Activity parentActivity2 = coVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.n2) coVar).classGuid;
            AndroidUtilities.requestAdjustResize(parentActivity2, i10);
        }
        fk fkVar = coVar.I1;
        float f7 = 0.0f;
        if (fkVar != null) {
            fkVar.animate().alpha((z10 || coVar.isInPreviewMode()) ? 0.0f : 1.0f).setInterpolator(org.telegram.ui.Components.pr.f).start();
        }
        org.telegram.ui.Components.my0 my0Var = coVar.d1;
        if (my0Var != null) {
            my0Var.setVisibility(0);
            ViewPropertyAnimator animate = coVar.d1.animate();
            if (!z10 && !coVar.isInPreviewMode()) {
                f7 = 1.0f;
            }
            animate.alpha(f7).setInterpolator(org.telegram.ui.Components.pr.f).withEndAction(new ah.u(20, this, z10)).start();
        }
    }

    @Override // org.telegram.ui.Components.og
    public final void n1(View view, CharSequence charSequence, boolean z10) {
        co coVar = this.c;
        coVar.Sb(view, charSequence, z10);
        org.telegram.ui.ActionBar.v0 v0Var = coVar.h0;
        if (v0Var == null || v0Var.getVisibility() == 0) {
            return;
        }
        coVar.h0.setVisibility(0);
        org.telegram.ui.ActionBar.y yVar = coVar.e0;
        if (yVar != null) {
            yVar.f(8);
        }
        hs hsVar = coVar.d0;
        if (hsVar != null) {
            hsVar.b(false);
        }
    }

    @Override // org.telegram.ui.Components.og
    public final void n2() {
        org.telegram.ui.ActionBar.k kVar;
        co coVar = this.c;
        kVar = ((org.telegram.ui.ActionBar.n2) coVar).actionBar;
        if (kVar.n0) {
            return;
        }
        org.telegram.ui.ActionBar.v0 v0Var = coVar.h0;
        if (v0Var != null) {
            v0Var.setVisibility(0);
        }
        org.telegram.ui.ActionBar.y yVar = coVar.i0;
        if (yVar != null && !this.b) {
            yVar.f(8);
        }
        org.telegram.ui.ActionBar.y yVar2 = coVar.e0;
        if (yVar2 != null) {
            yVar2.f(8);
        }
        hs hsVar = coVar.d0;
        if (hsVar != null) {
            hsVar.b(false);
        }
    }

    @Override // org.telegram.ui.Components.og
    public final sn o0() {
        return this.c.l5;
    }

    @Override // org.telegram.ui.Components.og
    public final int p() {
        return this.c.X0.R();
    }

    @Override // org.telegram.ui.Components.og
    public final void p1(CharSequence charSequence) {
        this.c.Ya(charSequence, true);
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ TLRPC.Peer q() {
        return null;
    }

    @Override // org.telegram.ui.Components.og
    public final boolean q1() {
        MessagePreviewParams.Messages messages;
        MessagePreviewParams messagePreviewParams = this.c.f5;
        return (messagePreviewParams == null || (messages = messagePreviewParams.forwardMessages) == null || messages.messages.isEmpty()) ? false : true;
    }

    @Override // org.telegram.ui.Components.og
    public final void r0() {
        org.telegram.ui.ActionBar.k kVar;
        co coVar = this.c;
        kVar = ((org.telegram.ui.ActionBar.n2) coVar).actionBar;
        if (kVar.n0) {
            return;
        }
        org.telegram.ui.ActionBar.y yVar = coVar.i0;
        if (yVar != null && !this.b) {
            yVar.f(8);
        }
        if (TextUtils.isEmpty(coVar.Y.getSlowModeTimer())) {
            org.telegram.ui.ActionBar.v0 v0Var = coVar.h0;
            if (v0Var != null) {
                v0Var.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar2 = coVar.e0;
            if (yVar2 != null) {
                yVar2.f(0);
            }
            hs hsVar = coVar.d0;
            if (hsVar != null) {
                hsVar.b(true);
            }
        }
    }

    @Override // org.telegram.ui.Components.og
    public final void r2() {
        co coVar = this.c;
        bi.t3 t3Var = coVar.J1;
        if (t3Var != null) {
            t3Var.I1(null, 0);
        }
        coVar.X9();
    }

    @Override // org.telegram.ui.Components.og
    public final void t1() {
        int i10;
        co coVar = this.c;
        i10 = ((org.telegram.ui.ActionBar.n2) coVar).currentAccount;
        BotForumHelper.getInstance(i10).stopStreaming(coVar.T5, (int) coVar.d());
        coVar.c7(true);
    }

    @Override // org.telegram.ui.Components.og
    public final void v() {
        boolean z10;
        co coVar = this.c;
        if (coVar.y0 != null) {
            coVar.b0 = coVar.Y.getBackgroundTop();
        }
        fk fkVar = coVar.I1;
        if (fkVar != null) {
            fkVar.getAdapter().f0 = true;
        }
        if (coVar.p5 != null) {
            AndroidUtilities.runOnUIThread(new dj(this, 6), 30L);
        }
        if (coVar.Y.t0()) {
            coVar.Y.e1();
            z10 = true;
        } else {
            z10 = false;
        }
        coVar.Y.V0(true, true, z10);
        if (coVar.o5 != 0) {
            coVar.getConnectionsManager().cancelRequest(coVar.o5, true);
            coVar.o5 = 0;
        }
        coVar.yc(0, true);
        coVar.hc(false);
        coVar.Wc(false);
    }

    @Override // org.telegram.ui.Components.og
    public final void x(float f7) {
        co coVar = this.c;
        if (f7 != 0.0f) {
            coVar.D4 = true;
        }
        coVar.o9();
        coVar.r9();
        coVar.Mc(false, false);
        coVar.X0.invalidate();
        org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.w;
        if (qcVar == null || coVar.Zb == null) {
            return;
        }
        qcVar.l();
    }

    @Override // org.telegram.ui.Components.og
    public final void x1() {
        int i10;
        int i11;
        co coVar = this.c;
        if (coVar.z9() || (i10 = coVar.R3) == 6 || i10 == 8) {
            return;
        }
        MessagesController messagesController = coVar.getMessagesController();
        long j3 = coVar.T5;
        long j10 = coVar.d4;
        i11 = ((org.telegram.ui.ActionBar.n2) coVar).classGuid;
        messagesController.sendTyping(j3, j10, 0, i11);
    }

    @Override // org.telegram.ui.Components.og
    public final void z(boolean z10) {
        int i10;
        int i11;
        co coVar = this.c;
        if (!z10) {
            Activity parentActivity = coVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.n2) coVar).classGuid;
            AndroidUtilities.requestAdjustResize(parentActivity, i10);
        } else {
            Activity parentActivity2 = coVar.getParentActivity();
            i11 = ((org.telegram.ui.ActionBar.n2) coVar).classGuid;
            AndroidUtilities.setAdjustResizeToNothing(parentActivity2, i11);
            coVar.fragmentView.requestLayout();
        }
    }

    @Override // org.telegram.ui.Components.og
    public final boolean z0() {
        int i10;
        co coVar = this.c;
        if ((coVar.getMessagesController().isForum(coVar.a()) && !coVar.h4) || (i10 = coVar.R3) == 9 || coVar.S3 <= 0) {
            return false;
        }
        if (i10 != 0) {
            return i10 == 3 && coVar.I8() == coVar.getUserConfig().getClientUserId();
        }
        return true;
    }
}
