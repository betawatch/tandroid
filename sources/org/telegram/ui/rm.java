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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class rm implements org.telegram.ui.Components.mg {
    public int a;
    public boolean b;
    public final /* synthetic */ bo c;

    public rm(bo boVar) {
        this.c = boVar;
    }

    @Override // org.telegram.ui.Components.mg
    public final void A2() {
        bo boVar = this.c;
        ai.g4 g4Var = boVar.J1;
        if (g4Var != null) {
            g4Var.I1(null, 0);
        }
        boVar.X9();
    }

    @Override // org.telegram.ui.Components.mg
    public final void B(boolean z10) {
        int i10;
        int i11;
        bo boVar = this.c;
        if (!z10) {
            Activity parentActivity = boVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.o2) boVar).classGuid;
            AndroidUtilities.requestAdjustResize(parentActivity, i10);
        } else {
            Activity parentActivity2 = boVar.getParentActivity();
            i11 = ((org.telegram.ui.ActionBar.o2) boVar).classGuid;
            AndroidUtilities.setAdjustResizeToNothing(parentActivity2, i11);
            boVar.fragmentView.requestLayout();
        }
    }

    @Override // org.telegram.ui.Components.mg
    public final boolean C0() {
        int i10;
        bo boVar = this.c;
        if ((boVar.getMessagesController().isForum(boVar.a()) && !boVar.h4) || (i10 = boVar.R3) == 9 || boVar.S3 <= 0) {
            return false;
        }
        if (i10 != 0) {
            return i10 == 3 && boVar.I8() == boVar.getUserConfig().getClientUserId();
        }
        return true;
    }

    @Override // org.telegram.ui.Components.mg
    public final void D() {
        this.c.Vb(true, false);
    }

    @Override // org.telegram.ui.Components.mg
    public final void E0(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        bo boVar = this.c;
        if (boVar.i0 == null) {
            return;
        }
        kVar = ((org.telegram.ui.ActionBar.o2) boVar).actionBar;
        final org.telegram.ui.ActionBar.a0 n10 = kVar.n();
        org.telegram.ui.Components.oy0 oy0Var = boVar.d1;
        if (oy0Var != null) {
            oy0Var.e();
        }
        final int i12 = 1;
        final int i13 = 0;
        if (i11 - i10 > 0) {
            org.telegram.ui.ActionBar.z zVar = boVar.i0;
            if (zVar.o == null) {
                zVar.o = 1;
                if (boVar.i0.l != 0) {
                    if (!(boVar.R3 == 3 && boVar.I8() == boVar.getUserConfig().getClientUserId()) && (boVar.R3 != 0 || (!(boVar.d4 == 0 || boVar.h4) || UserObject.isReplyUser(boVar.f) || boVar.A9()))) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(AndroidUtilities.dp(48.0f), 0.0f);
                        ofFloat.setDuration(220L);
                        ofFloat.setInterpolator(org.telegram.ui.Components.qr.f);
                        ofFloat.addListener(new qm(this, n10, 0));
                        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.pm
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
                        boVar.i0.f(0);
                        bo.J3(boVar);
                        org.telegram.ui.ActionBar.w0 w0Var = boVar.h0;
                        if (w0Var != null) {
                            w0Var.setVisibility(8);
                        }
                        org.telegram.ui.ActionBar.z zVar2 = boVar.e0;
                        if (zVar2 != null) {
                            zVar2.f(8);
                        }
                        js jsVar = boVar.d0;
                        if (jsVar != null) {
                            jsVar.b(false);
                        }
                    }
                }
            }
            boVar.A4 = i10;
            boVar.B4 = i11;
            return;
        }
        org.telegram.ui.ActionBar.z zVar3 = boVar.i0;
        if (zVar3.o != null) {
            zVar3.o = null;
            if (zVar3.l != 8) {
                if (!(boVar.R3 == 3 && boVar.I8() == boVar.getUserConfig().getClientUserId()) && (boVar.R3 != 0 || (!(boVar.d4 == 0 || boVar.h4) || UserObject.isReplyUser(boVar.f) || boVar.A9()))) {
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, AndroidUtilities.dp(48.0f));
                    ofFloat2.setDuration(220L);
                    ofFloat2.setInterpolator(org.telegram.ui.Components.qr.f);
                    ofFloat2.addListener(new qm(this, n10, 1));
                    ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.pm
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
                boVar.i0.f(8);
                if (boVar.Y.l0() && TextUtils.isEmpty(boVar.Y.getSlowModeTimer())) {
                    org.telegram.ui.ActionBar.w0 w0Var2 = boVar.h0;
                    if (w0Var2 != null) {
                        w0Var2.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.z zVar4 = boVar.e0;
                    if (zVar4 != null) {
                        zVar4.f(0);
                    }
                    js jsVar2 = boVar.d0;
                    if (jsVar2 != null) {
                        jsVar2.b(true);
                        return;
                    }
                    return;
                }
                org.telegram.ui.ActionBar.w0 w0Var3 = boVar.h0;
                if (w0Var3 != null) {
                    w0Var3.setVisibility(0);
                }
                org.telegram.ui.ActionBar.z zVar5 = boVar.e0;
                if (zVar5 != null) {
                    zVar5.f(8);
                }
                js jsVar3 = boVar.d0;
                if (jsVar3 != null) {
                    jsVar3.b(false);
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.mg
    public final void E1() {
        int i10;
        int i11;
        bo boVar = this.c;
        if (boVar.z9() || (i10 = boVar.R3) == 6 || i10 == 8) {
            return;
        }
        MessagesController messagesController = boVar.getMessagesController();
        long j3 = boVar.T5;
        long j10 = boVar.d4;
        i11 = ((org.telegram.ui.ActionBar.o2) boVar).classGuid;
        messagesController.sendTyping(j3, j10, 0, i11);
    }

    @Override // org.telegram.ui.Components.mg
    public final void G0() {
        bo boVar = this.c;
        boVar.o9 = true;
        nm nmVar = boVar.A0;
        if (nmVar != null) {
            nmVar.K(true);
        }
    }

    @Override // org.telegram.ui.Components.mg
    public final void H(CharSequence charSequence, boolean z10, int i10, int i11, long j3) {
        gg.g1 g1Var;
        MessageObject messageObject;
        int i12;
        long topicId;
        MessagePreviewParams messagePreviewParams;
        MessagePreviewParams.Messages messages;
        TLRPC.Message message;
        MessagePreviewParams.Messages messages2;
        bo boVar = this.c;
        ArrayList arrayList = boVar.u6;
        if (boVar.y0 != null) {
            boVar.b0 = boVar.Y.getBackgroundTop();
        }
        gk gkVar = boVar.I1;
        if (gkVar != null && gkVar.getAdapter() != null) {
            boVar.I1.getAdapter().w.a(charSequence);
        }
        boolean z11 = false;
        if (i10 != 0) {
            if (boVar.S3 == -1) {
                boVar.S3 = 0;
            }
            if (charSequence != null) {
                boVar.S3++;
            }
            MessagePreviewParams messagePreviewParams2 = boVar.f5;
            if (messagePreviewParams2 != null && (messages2 = messagePreviewParams2.forwardMessages) != null && !messages2.messages.isEmpty()) {
                boVar.S3 += boVar.f5.forwardMessages.messages.size();
            }
            boVar.Ec(false);
        }
        if (!TextUtils.isEmpty(charSequence) && (messagePreviewParams = boVar.f5) != null && (messages = messagePreviewParams.forwardMessages) != null && !messages.messages.isEmpty() && boVar.f5.quote == null && j3 <= 0) {
            ArrayList<MessageObject> arrayList2 = new ArrayList<>();
            boVar.f5.forwardMessages.getSelectedMessages(arrayList2);
            boolean z12 = arrayList2.size() > 0;
            TLRPC.Peer peer = boVar.getMessagesController().getPeer(boVar.T5);
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
                org.telegram.ui.Components.oc M = org.telegram.ui.Components.vc.a0(boVar).M(LocaleController.getString(R.string.SwipeToReplyHint), LocaleController.getString(R.string.SwipeToReplyHintMessage), R.raw.hint_swipe_reply);
                org.telegram.ui.Components.bj0 bj0Var = ((org.telegram.ui.Components.lc) M.e).a;
                bj0Var.setScaleX(1.8f);
                bj0Var.setScaleY(1.8f);
                M.k(true);
            }
        }
        if (ChatObject.isForum(boVar.e) && !boVar.h4 && (messageObject = boVar.n5) != null) {
            TLRPC.TL_forumTopic tL_forumTopic = messageObject.replyToForumTopic;
            if (tL_forumTopic != null) {
                topicId = tL_forumTopic.id;
            } else {
                i12 = ((org.telegram.ui.ActionBar.o2) boVar).currentAccount;
                topicId = MessageObject.getTopicId(i12, boVar.n5.messageOwner, true);
            }
            long j10 = topicId;
            if (j10 != 0) {
                boVar.getMediaDataController().cleanDraft(boVar.T5, j10, false);
            }
        }
        boVar.yb(false, null, null, null, null, z10, i10, null, false, j3, null, true);
        nk nkVar = boVar.Y;
        if (nkVar != null && nkVar.getEmojiView() != null && (g1Var = boVar.Y.getEmojiView().T0) != null) {
            if (g1Var.e) {
                MessagesController.getInstance(g1Var.a).sendTyping(g1Var.b, g1Var.c, 2, 0);
            }
            g1Var.f = -1L;
        }
        if (boVar.getMessagesController().premiumFeaturesBlocked() || boVar.getMessagesController().transcribeAudioTrialWeeklyNumber > 0 || boVar.getMessagesController().didPressTranscribeButtonEnough() || boVar.getUserConfig().isPremium() || TextUtils.isEmpty(charSequence) || arrayList == null) {
            return;
        }
        for (int i14 = 1; i14 < Math.min(5, arrayList.size()); i14++) {
            MessageObject messageObject3 = (MessageObject) arrayList.get(i14);
            if (messageObject3 != null && !messageObject3.isOutOwner() && ((messageObject3.isVoice() || messageObject3.isRoundVideo()) && messageObject3.isContentUnread())) {
                org.telegram.ui.Components.f31.u(messageObject3, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.mg
    public final TLRPC.TL_channels_sendAsPeers J() {
        return this.c.ha;
    }

    @Override // org.telegram.ui.Components.mg
    public final void J0() {
        this.c.ja(0, false);
    }

    @Override // org.telegram.ui.Components.mg
    public final void K(float f7, int i10) {
        gl glVar = this.c.b3;
        if (glVar != null) {
            glVar.e(f7, i10);
        }
    }

    @Override // org.telegram.ui.Components.mg
    public final void T0() {
        bo boVar = this.c;
        int sendingMessageId = boVar.getSendMessagesHelper().getSendingMessageId(boVar.T5);
        if (sendingMessageId != 0) {
            this.c.F(sendingMessageId, 0, 0, 0, true, true);
        }
    }

    @Override // org.telegram.ui.Components.mg
    public final void W() {
        bo boVar = this.c;
        nk nkVar = boVar.Y;
        boolean z10 = nkVar.y3;
        org.telegram.ui.Components.cg cgVar = nkVar.U0;
        boolean z11 = false;
        boolean z12 = cgVar != null && cgVar.getCurrentPage() == 0;
        le.b bVar = boVar.wc;
        if (z10 && !z12) {
            z11 = true;
        }
        bVar.a(z11, true);
    }

    @Override // org.telegram.ui.Components.mg
    public final void X(boolean z10) {
        this.c.Vb(false, z10);
    }

    @Override // org.telegram.ui.Components.mg
    public final void a1(int i10) {
        int i11 = i10 == 0 ? 8 : 0;
        bo boVar = this.c;
        if (boVar.c3.getVisibility() != i11) {
            boVar.c3.setVisibility(i11);
        }
    }

    @Override // org.telegram.ui.Components.mg
    public final int b1() {
        return this.c.X0.getHeight();
    }

    @Override // org.telegram.ui.Components.mg
    public final /* synthetic */ TL_stories.StoryItem d1() {
        return null;
    }

    @Override // org.telegram.ui.Components.mg
    public final void d2() {
        org.telegram.ui.Components.oy0 oy0Var = this.c.d1;
        if (oy0Var != null) {
            oy0Var.e();
        }
    }

    @Override // org.telegram.ui.Components.mg
    public final /* synthetic */ boolean f1(long j3) {
        return false;
    }

    @Override // org.telegram.ui.Components.mg
    public final void f2(int i10) {
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.dp(72.0f);
        bo boVar = this.c;
        if (i10 < currentActionBarHeight) {
            boVar.Z4 = false;
            if (boVar.d1.getVisibility() == 0) {
                boVar.d1.setVisibility(4);
            }
        } else {
            boVar.Z4 = true;
            if (boVar.d1.getVisibility() == 4 && !boVar.isInPreviewMode()) {
                boVar.d1.setVisibility(0);
            }
        }
        boVar.a5 = true ^ boVar.Y.u0();
        int i11 = i10 + (boVar.Y.u0() ? 65536 : 0);
        if (this.a != i11) {
            boVar.b0 = 0;
        }
        this.a = i11;
    }

    @Override // org.telegram.ui.Components.mg
    public final void g() {
        this.c.vc();
    }

    @Override // org.telegram.ui.Components.mg
    public final boolean i1() {
        gl glVar = this.c.b3;
        return (glVar == null || glVar.e0) ? false : true;
    }

    @Override // org.telegram.ui.Components.mg
    public final void i2() {
        tm tmVar;
        int indexOfChild;
        bo boVar = this.c;
        if (boVar.getParentActivity() != null) {
            if ((boVar.e == null && boVar.a8 == null) || boVar.fragmentView == null) {
                return;
            }
            org.telegram.ui.Components.i40 i40Var = boVar.f2;
            if ((i40Var == null || i40Var.getVisibility() != 0) && (indexOfChild = (tmVar = boVar.X0).indexOfChild(boVar.S)) != -1) {
                try {
                    boVar.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception e) {
                    FileLog.e(e);
                }
                if (boVar.f2 == null) {
                    org.telegram.ui.Components.i40 i40Var2 = new org.telegram.ui.Components.i40(9, boVar.getParentActivity(), boVar.ea, false);
                    boVar.f2 = i40Var2;
                    i40Var2.setVisibility(8);
                    tmVar.addView(boVar.f2, indexOfChild + 1, w7.x5.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                }
                TLRPC.UserFull userFull = boVar.a8;
                if (userFull != null && userFull.voice_messages_forbidden) {
                    boVar.f2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(boVar.Y.c1 ? R.string.VideoMessagesRestrictedByPrivacy : R.string.VoiceMessagesRestrictedByPrivacy, boVar.f.first_name)));
                } else if (ChatObject.canSendVoice(boVar.e) || ChatObject.canSendRoundVideo(boVar.e)) {
                    if (ChatObject.isActionBannedByDefault(boVar.e, 20)) {
                        boVar.f2.setText(LocaleController.getString(R.string.GlobalAttachVoiceRestricted));
                    } else if (ChatObject.isActionBannedByDefault(boVar.e, 21)) {
                        boVar.f2.setText(LocaleController.getString(R.string.GlobalAttachRoundRestricted));
                    } else if (ChatObject.isActionBannedByDefault(boVar.e, 7)) {
                        boVar.f2.setText(LocaleController.getString(R.string.GlobalAttachMediaRestricted));
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = boVar.e.banned_rights;
                        if (tL_chatBannedRights == null) {
                            return;
                        }
                        if (AndroidUtilities.isBannedForever(tL_chatBannedRights)) {
                            boVar.f2.setText(LocaleController.getString(R.string.AttachMediaRestrictedForever));
                        } else {
                            boVar.f2.setText(LocaleController.formatString("AttachMediaRestricted", R.string.AttachMediaRestricted, LocaleController.formatDateForBan(boVar.e.banned_rights.until_date)));
                        }
                    }
                } else {
                    if (boVar.K6()) {
                        return;
                    }
                    if (boVar.Y.c1) {
                        boVar.f2.setText(ChatObject.getRestrictedErrorText(boVar.e, 21));
                    } else {
                        boVar.f2.setText(ChatObject.getRestrictedErrorText(boVar.e, 20));
                    }
                }
                View sendButton = boVar.Y.getSendButton();
                View audioVideoButtonContainer = boVar.Y.getAudioVideoButtonContainer();
                if (sendButton.getAlpha() < audioVideoButtonContainer.getAlpha()) {
                    sendButton = audioVideoButtonContainer;
                }
                boVar.f2.f(sendButton, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.mg
    public final void j2(boolean z10) {
        bo boVar = this.c;
        View view = boVar.w2;
        if (view != null) {
            view.setVisibility(8);
        }
        boVar.b5 = !z10;
    }

    @Override // org.telegram.ui.Components.mg
    public final void k2(int i10, int i11, int i12, long j3, long j10, boolean z10) {
        bo boVar = this.c;
        if (boVar.b3 == null && CameraView.isCameraAllowed() && boVar.getParentActivity() != null) {
            gl glVar = new gl(boVar, boVar.getParentActivity(), boVar, boVar.ea);
            boVar.b3 = glVar;
            glVar.setClipToPadding(false);
            gl glVar2 = boVar.b3;
            ah.c cVar = boVar.J;
            kj kjVar = boVar.w;
            LinearLayout linearLayout = glVar2.R0;
            ch.d c10 = cVar.c(linearLayout, kjVar, false);
            c10.p(AndroidUtilities.dp(6.0f));
            c10.q(AndroidUtilities.dp(21.0f));
            linearLayout.setBackground(c10);
            int indexOfChild = boVar.X0.indexOfChild(boVar.S);
            if (indexOfChild < 0) {
                indexOfChild = boVar.X0.getChildCount();
            }
            boVar.X0.addView(boVar.b3, Math.min(indexOfChild + 1, boVar.X0.getChildCount()), w7.x5.e(-1, -1, 51));
        }
        gl glVar3 = boVar.b3;
        if (glVar3 != null) {
            if (i10 == 0) {
                glVar3.l(false);
                boVar.x0.C0();
                boVar.A0.T();
            } else if (i10 == 1 || i10 == 3 || i10 == 4) {
                glVar3.k(i10, i11, i12, j3, j10, z10);
            } else if (i10 == 2 || i10 == 5) {
                glVar3.d(i10 == 2);
            }
        }
    }

    @Override // org.telegram.ui.Components.mg
    public final void l() {
        org.telegram.ui.Components.oy0 oy0Var = this.c.d1;
        if (oy0Var != null) {
            oy0Var.f();
        }
    }

    @Override // org.telegram.ui.Components.mg
    public final void l1(CharSequence charSequence, boolean z10, boolean z11) {
        CharSequence charSequence2;
        org.telegram.ui.Components.i40 i40Var;
        TLRPC.ChatFull chatFull;
        MediaController mediaController = MediaController.getInstance();
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        boolean z12 = false;
        bo boVar = this.c;
        mediaController.setInputFieldHasText(!isEmpty || boVar.Y.s0());
        gk gkVar = boVar.I1;
        if (gkVar == null || gkVar.getAdapter() == null) {
            charSequence2 = charSequence;
        } else {
            charSequence2 = charSequence;
            boVar.I1.getAdapter().U(charSequence2, boVar.Y.getCursorPosition(), boVar.u6, false, false);
        }
        i9.s sVar = boVar.J5;
        if (sVar != null) {
            AndroidUtilities.cancelRunOnUIThread(sVar);
            boVar.J5 = null;
        }
        TLRPC.Chat chat = boVar.e;
        if (chat == null || ChatObject.canSendEmbed(chat)) {
            nk nkVar = boVar.Y;
            if (nkVar.X2 && (!nkVar.s0() || !boVar.Y.Z1)) {
                if (z10) {
                    boVar.Ya(charSequence2, true);
                } else {
                    boVar.M6(charSequence2);
                    i9.s sVar2 = new i9.s(this, charSequence2, false, 21);
                    boVar.J5 = sVar2;
                    AndroidUtilities.runOnUIThread(sVar2, AndroidUtilities.WEB_URL == null ? 3000L : 1000L);
                }
            }
        }
        yk ykVar = boVar.xa;
        if (ykVar != null) {
            ArrayList arrayList = ykVar.F;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((hz) arrayList.get(i10)).n = true;
            }
        }
        zg.l0 l0Var = zg.l0.B;
        if (l0Var != null) {
            l0Var.l = true;
        }
        zg.l0 l0Var2 = zg.l0.C;
        if (l0Var2 != null) {
            l0Var2.l = true;
        }
        if (z11) {
            return;
        }
        jj jjVar = boVar.g2;
        if ((jjVar != null && jjVar.getVisibility() == 0) || ((i40Var = boVar.i2) != null && i40Var.getVisibility() == 0)) {
            jj jjVar2 = boVar.g2;
            if (jjVar2 != null) {
                jjVar2.b(true);
            }
            org.telegram.ui.Components.i40 i40Var2 = boVar.i2;
            if (i40Var2 != null) {
                i40Var2.b(true);
                return;
            }
            return;
        }
        sf sfVar = boVar.Na;
        if (UserObject.isUserSelf(boVar.f) || ((chatFull = boVar.Z7) != null && chatFull.slowmode_next_send_date > 0 && boVar.R3 == 0)) {
            z12 = true;
        }
        if (boVar.j2 || boVar.h2 || z12 || SharedConfig.scheduledHintShows >= 3 || boVar.Y.s0()) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(sfVar);
        AndroidUtilities.runOnUIThread(sfVar, 4000L);
    }

    @Override // org.telegram.ui.Components.mg
    public final boolean m() {
        return this.c.K6();
    }

    @Override // org.telegram.ui.Components.mg
    public final void m0() {
        org.telegram.ui.Components.oy0 oy0Var = this.c.d1;
        if (oy0Var != null) {
            oy0Var.f();
        }
    }

    @Override // org.telegram.ui.Components.mg
    public final void n1() {
        gl glVar = this.c.b3;
        if (glVar != null) {
            glVar.q();
        }
    }

    @Override // org.telegram.ui.Components.mg
    public final boolean o1() {
        bo boVar = this.c;
        TLRPC.User user = boVar.f;
        return (user == null || UserObject.isUserSelf(user) || boVar.f.bot || boVar.h != null || boVar.R3 != 0) ? false : true;
    }

    @Override // org.telegram.ui.Components.mg
    public final void o2() {
        bo boVar = this.c;
        jj jjVar = boVar.g2;
        if (jjVar != null) {
            jjVar.b(true);
        }
        org.telegram.ui.Components.i40 i40Var = boVar.i2;
        if (i40Var != null) {
            i40Var.b(true);
        }
    }

    @Override // org.telegram.ui.Components.mg
    public final rn p0() {
        return this.c.l5;
    }

    @Override // org.telegram.ui.Components.mg
    public final int q() {
        return this.c.X0.R();
    }

    @Override // org.telegram.ui.Components.mg
    public final void q1() {
        int i10;
        bo boVar = this.c;
        Activity parentActivity = boVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.o2) boVar).currentAccount;
        long j3 = boVar.T5;
        MessageSuggestionParams messageSuggestionParams = boVar.g5;
        if (messageSuggestionParams == null) {
            messageSuggestionParams = MessageSuggestionParams.empty();
        }
        new yh.e0(parentActivity, i10, j3, messageSuggestionParams, boVar, boVar.getResourceProvider(), 0, new cf(boVar, 3)).show();
    }

    @Override // org.telegram.ui.Components.mg
    public final void r1() {
        this.c.H6();
    }

    @Override // org.telegram.ui.Components.mg
    public final void s0() {
        org.telegram.ui.ActionBar.k kVar;
        bo boVar = this.c;
        kVar = ((org.telegram.ui.ActionBar.o2) boVar).actionBar;
        if (kVar.n0) {
            return;
        }
        org.telegram.ui.ActionBar.z zVar = boVar.i0;
        if (zVar != null && !this.b) {
            zVar.f(8);
        }
        if (TextUtils.isEmpty(boVar.Y.getSlowModeTimer())) {
            org.telegram.ui.ActionBar.w0 w0Var = boVar.h0;
            if (w0Var != null) {
                w0Var.setVisibility(8);
            }
            org.telegram.ui.ActionBar.z zVar2 = boVar.e0;
            if (zVar2 != null) {
                zVar2.f(0);
            }
            js jsVar = boVar.d0;
            if (jsVar != null) {
                jsVar.b(true);
            }
        }
    }

    @Override // org.telegram.ui.Components.mg
    public final void s1() {
        int i10;
        int i11;
        bo boVar = this.c;
        boVar.W6();
        nk nkVar = boVar.Y;
        boolean z10 = nkVar.y3;
        org.telegram.ui.Components.cg cgVar = nkVar.U0;
        boVar.wc.a(z10 && !(cgVar != null && cgVar.getCurrentPage() == 0), true);
        if (z10) {
            Activity parentActivity = boVar.getParentActivity();
            i11 = ((org.telegram.ui.ActionBar.o2) boVar).classGuid;
            AndroidUtilities.setAdjustResizeToNothing(parentActivity, i11);
            org.telegram.ui.Components.oc ocVar = org.telegram.ui.Components.oc.w;
            if (ocVar != null && ocVar.l) {
                ocVar.b();
            }
        } else {
            Activity parentActivity2 = boVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.o2) boVar).classGuid;
            AndroidUtilities.requestAdjustResize(parentActivity2, i10);
        }
        gk gkVar = boVar.I1;
        float f7 = 0.0f;
        if (gkVar != null) {
            gkVar.animate().alpha((z10 || boVar.isInPreviewMode()) ? 0.0f : 1.0f).setInterpolator(org.telegram.ui.Components.qr.f).start();
        }
        org.telegram.ui.Components.oy0 oy0Var = boVar.d1;
        if (oy0Var != null) {
            oy0Var.setVisibility(0);
            ViewPropertyAnimator animate = boVar.d1.animate();
            if (!z10 && !boVar.isInPreviewMode()) {
                f7 = 1.0f;
            }
            animate.alpha(f7).setInterpolator(org.telegram.ui.Components.qr.f).withEndAction(new bi.f(19, this, z10)).start();
        }
    }

    @Override // org.telegram.ui.Components.mg
    public final void t1(View view, CharSequence charSequence, boolean z10) {
        bo boVar = this.c;
        boVar.Sb(view, charSequence, z10);
        org.telegram.ui.ActionBar.w0 w0Var = boVar.h0;
        if (w0Var == null || w0Var.getVisibility() == 0) {
            return;
        }
        boVar.h0.setVisibility(0);
        org.telegram.ui.ActionBar.z zVar = boVar.e0;
        if (zVar != null) {
            zVar.f(8);
        }
        js jsVar = boVar.d0;
        if (jsVar != null) {
            jsVar.b(false);
        }
    }

    @Override // org.telegram.ui.Components.mg
    public final /* synthetic */ TLRPC.Peer v() {
        return null;
    }

    @Override // org.telegram.ui.Components.mg
    public final void v1(CharSequence charSequence) {
        this.c.Ya(charSequence, true);
    }

    @Override // org.telegram.ui.Components.mg
    public final boolean w1() {
        MessagePreviewParams.Messages messages;
        MessagePreviewParams messagePreviewParams = this.c.f5;
        return (messagePreviewParams == null || (messages = messagePreviewParams.forwardMessages) == null || messages.messages.isEmpty()) ? false : true;
    }

    @Override // org.telegram.ui.Components.mg
    public final void w2() {
        org.telegram.ui.ActionBar.k kVar;
        bo boVar = this.c;
        kVar = ((org.telegram.ui.ActionBar.o2) boVar).actionBar;
        if (kVar.n0) {
            return;
        }
        org.telegram.ui.ActionBar.w0 w0Var = boVar.h0;
        if (w0Var != null) {
            w0Var.setVisibility(0);
        }
        org.telegram.ui.ActionBar.z zVar = boVar.i0;
        if (zVar != null && !this.b) {
            zVar.f(8);
        }
        org.telegram.ui.ActionBar.z zVar2 = boVar.e0;
        if (zVar2 != null) {
            zVar2.f(8);
        }
        js jsVar = boVar.d0;
        if (jsVar != null) {
            jsVar.b(false);
        }
    }

    @Override // org.telegram.ui.Components.mg
    public final void x() {
        boolean z10;
        bo boVar = this.c;
        if (boVar.y0 != null) {
            boVar.b0 = boVar.Y.getBackgroundTop();
        }
        gk gkVar = boVar.I1;
        if (gkVar != null) {
            gkVar.getAdapter().f0 = true;
        }
        if (boVar.p5 != null) {
            AndroidUtilities.runOnUIThread(new ej(this, 6), 30L);
        }
        if (boVar.Y.u0()) {
            boVar.Y.e1();
            z10 = true;
        } else {
            z10 = false;
        }
        boVar.Y.V0(true, true, z10);
        if (boVar.o5 != 0) {
            boVar.getConnectionsManager().cancelRequest(boVar.o5, true);
            boVar.o5 = 0;
        }
        boVar.yc(0, true);
        boVar.hc(false);
        boVar.Wc(false);
    }

    @Override // org.telegram.ui.Components.mg
    public final void y(float f7) {
        bo boVar = this.c;
        if (f7 != 0.0f) {
            boVar.D4 = true;
        }
        boVar.o9();
        boVar.r9();
        boVar.Mc(false, false);
        boVar.X0.invalidate();
        org.telegram.ui.Components.oc ocVar = org.telegram.ui.Components.oc.w;
        if (ocVar == null || boVar.Yb == null) {
            return;
        }
        ocVar.l();
    }

    @Override // org.telegram.ui.Components.mg
    public final void z1() {
        int i10;
        bo boVar = this.c;
        i10 = ((org.telegram.ui.ActionBar.o2) boVar).currentAccount;
        BotForumHelper.getInstance(i10).stopStreaming(boVar.T5, (int) boVar.d());
        boVar.c7(true);
    }
}
