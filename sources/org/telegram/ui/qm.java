package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AppGlobalConfig;
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
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.camera.CameraView;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class qm implements org.telegram.ui.Components.qg {
    public int a;
    public boolean b;
    public final /* synthetic */ zn c;

    public qm(zn znVar) {
        this.c = znVar;
    }

    @Override // org.telegram.ui.Components.qg
    public final void B1(CharSequence charSequence) {
        this.c.cb(charSequence, true);
    }

    @Override // org.telegram.ui.Components.qg
    public final void B2() {
        org.telegram.ui.ActionBar.k kVar;
        zn znVar = this.c;
        kVar = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
        if (kVar.n0) {
            return;
        }
        org.telegram.ui.ActionBar.v0 v0Var = znVar.h0;
        if (v0Var != null) {
            v0Var.setVisibility(0);
        }
        org.telegram.ui.ActionBar.y yVar = znVar.i0;
        if (yVar != null && !this.b) {
            yVar.f(8);
        }
        org.telegram.ui.ActionBar.y yVar2 = znVar.e0;
        if (yVar2 != null) {
            yVar2.f(8);
        }
        fs fsVar = znVar.d0;
        if (fsVar != null) {
            fsVar.b(false);
        }
    }

    @Override // org.telegram.ui.Components.qg
    public final void C(boolean z10) {
        int i10;
        int i11;
        zn znVar = this.c;
        if (!z10) {
            Activity parentActivity = znVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.n2) znVar).classGuid;
            AndroidUtilities.requestAdjustResize(parentActivity, i10);
        } else {
            Activity parentActivity2 = znVar.getParentActivity();
            i11 = ((org.telegram.ui.ActionBar.n2) znVar).classGuid;
            AndroidUtilities.setAdjustResizeToNothing(parentActivity2, i11);
            znVar.fragmentView.requestLayout();
        }
    }

    @Override // org.telegram.ui.Components.qg
    public final boolean C1() {
        MessagePreviewParams.Messages messages;
        MessagePreviewParams messagePreviewParams = this.c.f5;
        return (messagePreviewParams == null || (messages = messagePreviewParams.forwardMessages) == null || messages.messages.isEmpty()) ? false : true;
    }

    @Override // org.telegram.ui.Components.qg
    public final void F2() {
        zn znVar = this.c;
        ai.h4 h4Var = znVar.J1;
        if (h4Var != null) {
            h4Var.L1(null, 0);
        }
        znVar.ca();
    }

    @Override // org.telegram.ui.Components.qg
    public final void G1() {
        int i10;
        zn znVar = this.c;
        i10 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
        BotForumHelper.getInstance(i10).stopStreaming(znVar.T5, (int) znVar.d());
        znVar.f7(true);
    }

    @Override // org.telegram.ui.Components.qg
    public final boolean I0() {
        int i10;
        zn znVar = this.c;
        if ((znVar.getMessagesController().isForum(znVar.a()) && !znVar.h4) || (i10 = znVar.R3) == 9 || znVar.S3 <= 0) {
            return false;
        }
        if (i10 != 0) {
            return i10 == 3 && znVar.N8() == znVar.getUserConfig().getClientUserId();
        }
        return true;
    }

    @Override // org.telegram.ui.Components.qg
    public final void J() {
        this.c.Zb(true, false);
    }

    @Override // org.telegram.ui.Components.qg
    public final void K(CharSequence charSequence, boolean z10, int i10, int i11, long j3) {
        gg.f1 f1Var;
        MessageObject messageObject;
        int i12;
        long topicId;
        MessagePreviewParams messagePreviewParams;
        MessagePreviewParams.Messages messages;
        TLRPC.Message message;
        MessagePreviewParams.Messages messages2;
        zn znVar = this.c;
        ArrayList arrayList = znVar.u6;
        if (znVar.y0 != null) {
            znVar.b0 = znVar.Y.getBackgroundTop();
        }
        gk gkVar = znVar.I1;
        if (gkVar != null && gkVar.getAdapter() != null) {
            znVar.I1.getAdapter().w.a(charSequence);
        }
        boolean z11 = false;
        if (i10 != 0) {
            if (znVar.S3 == -1) {
                znVar.S3 = 0;
            }
            if (charSequence != null) {
                znVar.S3++;
            }
            MessagePreviewParams messagePreviewParams2 = znVar.f5;
            if (messagePreviewParams2 != null && (messages2 = messagePreviewParams2.forwardMessages) != null && !messages2.messages.isEmpty()) {
                znVar.S3 += znVar.f5.forwardMessages.messages.size();
            }
            znVar.Ic(false);
        }
        if (!TextUtils.isEmpty(charSequence) && (messagePreviewParams = znVar.f5) != null && (messages = messagePreviewParams.forwardMessages) != null && !messages.messages.isEmpty() && znVar.f5.quote == null && j3 <= 0) {
            ArrayList<MessageObject> arrayList2 = new ArrayList<>();
            znVar.f5.forwardMessages.getSelectedMessages(arrayList2);
            boolean z12 = arrayList2.size() > 0;
            TLRPC.Peer peer = znVar.getMessagesController().getPeer(znVar.T5);
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
                org.telegram.ui.Components.tc M = org.telegram.ui.Components.ad.a0(znVar).M(LocaleController.getString(R.string.SwipeToReplyHint), LocaleController.getString(R.string.SwipeToReplyHintMessage), R.raw.hint_swipe_reply);
                org.telegram.ui.Components.fk0 fk0Var = ((org.telegram.ui.Components.qc) M.e).a;
                fk0Var.setScaleX(1.8f);
                fk0Var.setScaleY(1.8f);
                M.k(true);
            }
        }
        if (ChatObject.isForum(znVar.e) && !znVar.h4 && (messageObject = znVar.n5) != null) {
            TLRPC.TL_forumTopic tL_forumTopic = messageObject.replyToForumTopic;
            if (tL_forumTopic != null) {
                topicId = tL_forumTopic.id;
            } else {
                i12 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
                topicId = MessageObject.getTopicId(i12, znVar.n5.messageOwner, true);
            }
            long j10 = topicId;
            if (j10 != 0) {
                znVar.getMediaDataController().cleanDraft(znVar.T5, j10, false);
            }
        }
        znVar.Cb(false, null, null, null, null, z10, i10, null, false, j3, null, true);
        ok okVar = znVar.Y;
        if (okVar != null && okVar.getEmojiView() != null && (f1Var = znVar.Y.getEmojiView().T0) != null) {
            if (f1Var.e) {
                MessagesController.getInstance(f1Var.a).sendTyping(f1Var.b, f1Var.c, 2, 0);
            }
            f1Var.f = -1L;
        }
        if (znVar.getMessagesController().premiumFeaturesBlocked() || znVar.getMessagesController().transcribeAudioTrialWeeklyNumber > 0 || znVar.getMessagesController().didPressTranscribeButtonEnough() || znVar.getUserConfig().isPremium() || TextUtils.isEmpty(charSequence) || arrayList == null) {
            return;
        }
        for (int i14 = 1; i14 < Math.min(5, arrayList.size()); i14++) {
            MessageObject messageObject3 = (MessageObject) arrayList.get(i14);
            if (messageObject3 != null && !messageObject3.isOutOwner() && ((messageObject3.isVoice() || messageObject3.isRoundVideo()) && messageObject3.isContentUnread())) {
                org.telegram.ui.Components.j41.u(messageObject3, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.qg
    public final void K0(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        zn znVar = this.c;
        if (znVar.i0 == null) {
            return;
        }
        kVar = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
        final org.telegram.ui.ActionBar.z o9 = kVar.o();
        org.telegram.ui.Components.oz0 oz0Var = znVar.d1;
        if (oz0Var != null) {
            oz0Var.e();
        }
        final int i12 = 1;
        final int i13 = 0;
        if (i11 - i10 > 0) {
            org.telegram.ui.ActionBar.y yVar = znVar.i0;
            if (yVar.o == null) {
                yVar.o = 1;
                if (znVar.i0.l != 0) {
                    if (!(znVar.R3 == 3 && znVar.N8() == znVar.getUserConfig().getClientUserId()) && (znVar.R3 != 0 || (!(znVar.d4 == 0 || znVar.h4) || UserObject.isReplyUser(znVar.f) || znVar.F9()))) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(AndroidUtilities.dp(48.0f), 0.0f);
                        ofFloat.setDuration(220L);
                        ofFloat.setInterpolator(org.telegram.ui.Components.hs.f);
                        ofFloat.addListener(new pm(this, o9, 0));
                        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.om
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (i13) {
                                    case 0:
                                        o9.r(((Float) valueAnimator.getAnimatedValue()).floatValue());
                                        break;
                                    default:
                                        o9.r(((Float) valueAnimator.getAnimatedValue()).floatValue());
                                        break;
                                }
                            }
                        });
                        ofFloat.start();
                    } else {
                        znVar.i0.f(0);
                        zn.S3(znVar);
                        org.telegram.ui.ActionBar.v0 v0Var = znVar.h0;
                        if (v0Var != null) {
                            v0Var.setVisibility(8);
                        }
                        org.telegram.ui.ActionBar.y yVar2 = znVar.e0;
                        if (yVar2 != null) {
                            yVar2.f(8);
                        }
                        fs fsVar = znVar.d0;
                        if (fsVar != null) {
                            fsVar.b(false);
                        }
                    }
                }
            }
            znVar.A4 = i10;
            znVar.B4 = i11;
            return;
        }
        org.telegram.ui.ActionBar.y yVar3 = znVar.i0;
        if (yVar3.o != null) {
            yVar3.o = null;
            if (yVar3.l != 8) {
                if (!(znVar.R3 == 3 && znVar.N8() == znVar.getUserConfig().getClientUserId()) && (znVar.R3 != 0 || (!(znVar.d4 == 0 || znVar.h4) || UserObject.isReplyUser(znVar.f) || znVar.F9()))) {
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, AndroidUtilities.dp(48.0f));
                    ofFloat2.setDuration(220L);
                    ofFloat2.setInterpolator(org.telegram.ui.Components.hs.f);
                    ofFloat2.addListener(new pm(this, o9, 1));
                    ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.om
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (i12) {
                                case 0:
                                    o9.r(((Float) valueAnimator.getAnimatedValue()).floatValue());
                                    break;
                                default:
                                    o9.r(((Float) valueAnimator.getAnimatedValue()).floatValue());
                                    break;
                            }
                        }
                    });
                    ofFloat2.start();
                    return;
                }
                znVar.i0.f(8);
                if (znVar.Y.i0() && TextUtils.isEmpty(znVar.Y.getSlowModeTimer())) {
                    org.telegram.ui.ActionBar.v0 v0Var2 = znVar.h0;
                    if (v0Var2 != null) {
                        v0Var2.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.y yVar4 = znVar.e0;
                    if (yVar4 != null) {
                        yVar4.f(0);
                    }
                    fs fsVar2 = znVar.d0;
                    if (fsVar2 != null) {
                        fsVar2.b(true);
                        return;
                    }
                    return;
                }
                org.telegram.ui.ActionBar.v0 v0Var3 = znVar.h0;
                if (v0Var3 != null) {
                    v0Var3.setVisibility(0);
                }
                org.telegram.ui.ActionBar.y yVar5 = znVar.e0;
                if (yVar5 != null) {
                    yVar5.f(8);
                }
                fs fsVar3 = znVar.d0;
                if (fsVar3 != null) {
                    fsVar3.b(false);
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.qg
    public final void L1() {
        int i10;
        int i11;
        zn znVar = this.c;
        if (znVar.E9() || (i10 = znVar.R3) == 6 || i10 == 8) {
            return;
        }
        MessagesController messagesController = znVar.getMessagesController();
        long j3 = znVar.T5;
        long j10 = znVar.d4;
        i11 = ((org.telegram.ui.ActionBar.n2) znVar).classGuid;
        messagesController.sendTyping(j3, j10, 0, i11);
    }

    @Override // org.telegram.ui.Components.qg
    public final void M0() {
        zn znVar = this.c;
        znVar.o9 = true;
        mm mmVar = znVar.A0;
        if (mmVar != null) {
            mmVar.K(true);
        }
    }

    @Override // org.telegram.ui.Components.qg
    public final void O0() {
        this.c.oa(0, false);
    }

    @Override // org.telegram.ui.Components.qg
    public final TLRPC.TL_channels_sendAsPeers P() {
        return this.c.ha;
    }

    @Override // org.telegram.ui.Components.qg
    public final void V(float f7, int i10) {
        org.telegram.ui.Components.y60 y60Var = this.c.b3;
        if (y60Var != null) {
            y60Var.b(f7, i10);
        }
    }

    @Override // org.telegram.ui.Components.qg
    public final void Z0() {
        zn znVar = this.c;
        int sendingMessageId = znVar.getSendMessagesHelper().getSendingMessageId(znVar.T5);
        if (sendingMessageId != 0) {
            this.c.F(sendingMessageId, 0, 0, 0, true, true);
        }
    }

    @Override // org.telegram.ui.Components.qg
    public final void a0() {
        zn znVar = this.c;
        ok okVar = znVar.Y;
        boolean z10 = okVar.z3;
        org.telegram.ui.Components.gg ggVar = okVar.U0;
        boolean z11 = false;
        boolean z12 = ggVar != null && ggVar.getCurrentPage() == 0;
        me.b bVar = znVar.xc;
        if (z10 && !z12) {
            z11 = true;
        }
        bVar.a(z11, true);
    }

    @Override // org.telegram.ui.Components.qg
    public final void c0(boolean z10) {
        this.c.Zb(false, z10);
    }

    @Override // org.telegram.ui.Components.qg
    public final void g1(int i10) {
        int i11 = i10 == 0 ? 8 : 0;
        zn znVar = this.c;
        if (znVar.c3.getVisibility() != i11) {
            znVar.c3.setVisibility(i11);
        }
    }

    @Override // org.telegram.ui.Components.qg
    public final void h() {
        this.c.zc();
    }

    @Override // org.telegram.ui.Components.qg
    public final int h1() {
        return this.c.X0.getHeight();
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ TL_stories.StoryItem j1() {
        return null;
    }

    @Override // org.telegram.ui.Components.qg
    public final void j2() {
        org.telegram.ui.Components.oz0 oz0Var = this.c.d1;
        if (oz0Var != null) {
            oz0Var.e();
        }
    }

    @Override // org.telegram.ui.Components.qg
    public final void l() {
        org.telegram.ui.Components.oz0 oz0Var = this.c.d1;
        if (oz0Var != null) {
            oz0Var.f();
        }
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ boolean l1(long j3) {
        return false;
    }

    @Override // org.telegram.ui.Components.qg
    public final void l2(int i10) {
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.dp(72.0f);
        zn znVar = this.c;
        if (i10 < currentActionBarHeight) {
            znVar.Z4 = false;
            if (znVar.d1.getVisibility() == 0) {
                znVar.d1.setVisibility(4);
            }
        } else {
            znVar.Z4 = true;
            if (znVar.d1.getVisibility() == 4 && !znVar.isInPreviewMode()) {
                znVar.d1.setVisibility(0);
            }
        }
        znVar.a5 = true ^ znVar.Y.r0();
        int i11 = i10 + (znVar.Y.r0() ? 65536 : 0);
        if (this.a != i11) {
            znVar.b0 = 0;
        }
        this.a = i11;
    }

    @Override // org.telegram.ui.Components.qg
    public final boolean m() {
        return this.c.N6();
    }

    @Override // org.telegram.ui.Components.qg
    public final boolean o1() {
        org.telegram.ui.Components.y60 y60Var = this.c.b3;
        return y60Var != null && y60Var.d();
    }

    @Override // org.telegram.ui.Components.qg
    public final void o2() {
        sm smVar;
        int indexOfChild;
        zn znVar = this.c;
        if (znVar.getParentActivity() != null) {
            if ((znVar.e == null && znVar.a8 == null) || znVar.fragmentView == null) {
                return;
            }
            org.telegram.ui.Components.z40 z40Var = znVar.f2;
            if ((z40Var == null || z40Var.getVisibility() != 0) && (indexOfChild = (smVar = znVar.X0).indexOfChild(znVar.S)) != -1) {
                try {
                    znVar.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                if (znVar.f2 == null) {
                    org.telegram.ui.Components.z40 z40Var2 = new org.telegram.ui.Components.z40(9, znVar.getParentActivity(), znVar.ea, false);
                    znVar.f2 = z40Var2;
                    z40Var2.setVisibility(8);
                    smVar.addView(znVar.f2, indexOfChild + 1, w7.x5.a(-2.0f, 10.0f, 0.0f, 10.0f, 0.0f, -2, 51));
                }
                TLRPC.UserFull userFull = znVar.a8;
                if (userFull != null && userFull.voice_messages_forbidden) {
                    znVar.f2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(znVar.Y.c1 ? R.string.VideoMessagesRestrictedByPrivacy : R.string.VoiceMessagesRestrictedByPrivacy, znVar.f.first_name)));
                } else if (ChatObject.canSendVoice(znVar.e) || ChatObject.canSendRoundVideo(znVar.e)) {
                    if (ChatObject.isActionBannedByDefault(znVar.e, 20)) {
                        znVar.f2.setText(LocaleController.getString(R.string.GlobalAttachVoiceRestricted));
                    } else if (ChatObject.isActionBannedByDefault(znVar.e, 21)) {
                        znVar.f2.setText(LocaleController.getString(R.string.GlobalAttachRoundRestricted));
                    } else if (ChatObject.isActionBannedByDefault(znVar.e, 7)) {
                        znVar.f2.setText(LocaleController.getString(R.string.GlobalAttachMediaRestricted));
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = znVar.e.banned_rights;
                        if (tL_chatBannedRights == null) {
                            return;
                        }
                        if (AndroidUtilities.isBannedForever(tL_chatBannedRights)) {
                            znVar.f2.setText(LocaleController.getString(R.string.AttachMediaRestrictedForever));
                        } else {
                            znVar.f2.setText(LocaleController.formatString("AttachMediaRestricted", R.string.AttachMediaRestricted, LocaleController.formatDateForBan(znVar.e.banned_rights.until_date)));
                        }
                    }
                } else {
                    if (znVar.N6()) {
                        return;
                    }
                    if (znVar.Y.c1) {
                        znVar.f2.setText(ChatObject.getRestrictedErrorText(znVar.e, 21));
                    } else {
                        znVar.f2.setText(ChatObject.getRestrictedErrorText(znVar.e, 20));
                    }
                }
                View sendButton = znVar.Y.getSendButton();
                View audioVideoButtonContainer = znVar.Y.getAudioVideoButtonContainer();
                if (sendButton.getAlpha() < audioVideoButtonContainer.getAlpha()) {
                    sendButton = audioVideoButtonContainer;
                }
                znVar.f2.f(sendButton, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.qg
    public final void p2(boolean z10) {
        zn znVar = this.c;
        View view = znVar.w2;
        if (view != null) {
            view.setVisibility(8);
        }
        znVar.b5 = !z10;
    }

    @Override // org.telegram.ui.Components.qg
    public final void q0() {
        org.telegram.ui.Components.oz0 oz0Var = this.c.d1;
        if (oz0Var != null) {
            oz0Var.f();
        }
    }

    @Override // org.telegram.ui.Components.qg
    public final void q2(int i10, int i11, int i12, long j3, long j10, boolean z10) {
        boolean z11;
        zn znVar = this.c;
        if (znVar.b3 == null && CameraView.isCameraAllowed() && znVar.getParentActivity() != null) {
            Activity parentActivity = znVar.getParentActivity();
            xn xnVar = znVar.ea;
            int i13 = org.telegram.ui.Components.y60.e;
            pi.a aVar = pi.e.b;
            aVar.a();
            if (aVar.c) {
                aVar.a();
                z11 = aVar.d;
            } else {
                z11 = AppGlobalConfig.getInstance(UserConfig.selectedAccount).roundVideoRecorder2Allowed.get();
            }
            org.telegram.ui.Components.y60 s60Var = z11 ? new org.telegram.ui.Components.s60(parentActivity, znVar, xnVar) : new org.telegram.ui.Components.t60(parentActivity, znVar, xnVar, true);
            znVar.b3 = s60Var;
            s60Var.setAnimationCallback(new re(znVar, 0));
            znVar.b3.setTrimCallback(new re(znVar, 1));
            znVar.b3.setRecordingUiFrameCallback(new sj(znVar));
            znVar.b3.setClipToPadding(false);
            znVar.b3.g(znVar.J, znVar.w);
            int indexOfChild = znVar.X0.indexOfChild(znVar.S);
            if (indexOfChild < 0) {
                indexOfChild = znVar.X0.getChildCount();
            }
            znVar.X0.addView(znVar.b3, Math.min(indexOfChild + 1, znVar.X0.getChildCount()), w7.x5.e(-1, -1, 51));
        }
        org.telegram.ui.Components.y60 y60Var = this.c.b3;
        if (y60Var != null) {
            if (i10 == 0) {
                y60Var.h(false);
                this.c.x0.B0();
                this.c.A0.T();
            } else if (i10 == 1 || i10 == 3 || i10 == 4) {
                y60Var.f(i10, i11, i12, j3, j10, z10);
            } else if (i10 == 2 || i10 == 5) {
                y60Var.a(i10 == 2);
            }
        }
    }

    @Override // org.telegram.ui.Components.qg
    public final void r1(CharSequence charSequence, boolean z10, boolean z11) {
        CharSequence charSequence2;
        org.telegram.ui.Components.z40 z40Var;
        TLRPC.ChatFull chatFull;
        MediaController mediaController = MediaController.getInstance();
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        boolean z12 = false;
        zn znVar = this.c;
        mediaController.setInputFieldHasText(!isEmpty || znVar.Y.p0());
        gk gkVar = znVar.I1;
        if (gkVar == null || gkVar.getAdapter() == null) {
            charSequence2 = charSequence;
        } else {
            charSequence2 = charSequence;
            znVar.I1.getAdapter().U(charSequence2, znVar.Y.getCursorPosition(), znVar.u6, false, false);
        }
        i9.s sVar = znVar.J5;
        if (sVar != null) {
            AndroidUtilities.cancelRunOnUIThread(sVar);
            znVar.J5 = null;
        }
        TLRPC.Chat chat = znVar.e;
        if (chat == null || ChatObject.canSendEmbed(chat)) {
            ok okVar = znVar.Y;
            if (okVar.Y2 && (!okVar.p0() || !znVar.Y.a2)) {
                if (z10) {
                    znVar.cb(charSequence2, true);
                } else {
                    znVar.P6(charSequence2);
                    i9.s sVar2 = new i9.s(this, charSequence2, false, 22);
                    znVar.J5 = sVar2;
                    AndroidUtilities.runOnUIThread(sVar2, AndroidUtilities.WEB_URL == null ? 3000L : 1000L);
                }
            }
        }
        yk ykVar = znVar.xa;
        if (ykVar != null) {
            ArrayList arrayList = ykVar.F;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((ez) arrayList.get(i10)).n = true;
            }
        }
        zg.j0 j0Var = zg.j0.B;
        if (j0Var != null) {
            j0Var.l = true;
        }
        zg.j0 j0Var2 = zg.j0.C;
        if (j0Var2 != null) {
            j0Var2.l = true;
        }
        if (z11) {
            return;
        }
        jj jjVar = znVar.g2;
        if ((jjVar != null && jjVar.getVisibility() == 0) || ((z40Var = znVar.i2) != null && z40Var.getVisibility() == 0)) {
            jj jjVar2 = znVar.g2;
            if (jjVar2 != null) {
                jjVar2.b(true);
            }
            org.telegram.ui.Components.z40 z40Var2 = znVar.i2;
            if (z40Var2 != null) {
                z40Var2.b(true);
                return;
            }
            return;
        }
        rf rfVar = znVar.Oa;
        if (UserObject.isUserSelf(znVar.f) || ((chatFull = znVar.Z7) != null && chatFull.slowmode_next_send_date > 0 && znVar.R3 == 0)) {
            z12 = true;
        }
        if (znVar.j2 || znVar.h2 || z12 || SharedConfig.scheduledHintShows >= 3 || znVar.Y.p0()) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(rfVar);
        AndroidUtilities.runOnUIThread(rfVar, 4000L);
    }

    @Override // org.telegram.ui.Components.qg
    public final void t1() {
        org.telegram.ui.Components.y60 y60Var = this.c.b3;
        if (y60Var != null) {
            y60Var.i();
        }
    }

    @Override // org.telegram.ui.Components.qg
    public final pn u0() {
        return this.c.l5;
    }

    @Override // org.telegram.ui.Components.qg
    public final boolean u1() {
        zn znVar = this.c;
        TLRPC.User user = znVar.f;
        return (user == null || UserObject.isUserSelf(user) || znVar.f.bot || znVar.h != null || znVar.R3 != 0) ? false : true;
    }

    @Override // org.telegram.ui.Components.qg
    public final void u2() {
        zn znVar = this.c;
        jj jjVar = znVar.g2;
        if (jjVar != null) {
            jjVar.b(true);
        }
        org.telegram.ui.Components.z40 z40Var = znVar.i2;
        if (z40Var != null) {
            z40Var.b(true);
        }
    }

    @Override // org.telegram.ui.Components.qg
    public final int v() {
        return this.c.X0.R();
    }

    @Override // org.telegram.ui.Components.qg
    public final void w1() {
        int i10;
        zn znVar = this.c;
        Activity parentActivity = znVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
        long j3 = znVar.T5;
        MessageSuggestionParams messageSuggestionParams = znVar.g5;
        if (messageSuggestionParams == null) {
            messageSuggestionParams = MessageSuggestionParams.empty();
        }
        new yh.c0(parentActivity, i10, j3, messageSuggestionParams, znVar, znVar.getResourceProvider(), 0, new cf(znVar, 4)).show();
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ TLRPC.Peer x() {
        return null;
    }

    @Override // org.telegram.ui.Components.qg
    public final void x1() {
        this.c.K6();
    }

    @Override // org.telegram.ui.Components.qg
    public final void y() {
        boolean z10;
        zn znVar = this.c;
        if (znVar.y0 != null) {
            znVar.b0 = znVar.Y.getBackgroundTop();
        }
        gk gkVar = znVar.I1;
        if (gkVar != null) {
            gkVar.getAdapter().f0 = true;
        }
        if (znVar.p5 != null) {
            AndroidUtilities.runOnUIThread(new cj(this, 7), 30L);
        }
        if (znVar.Y.r0()) {
            znVar.Y.c1();
            z10 = true;
        } else {
            z10 = false;
        }
        znVar.Y.T0(true, true, z10);
        if (znVar.o5 != 0) {
            znVar.getConnectionsManager().cancelRequest(znVar.o5, true);
            znVar.o5 = 0;
        }
        znVar.Cc(0, true);
        znVar.lc(false);
        znVar.ad(false);
    }

    @Override // org.telegram.ui.Components.qg
    public final void y1() {
        int i10;
        int i11;
        zn znVar = this.c;
        znVar.Z6();
        ok okVar = znVar.Y;
        boolean z10 = okVar.z3;
        org.telegram.ui.Components.gg ggVar = okVar.U0;
        znVar.xc.a(z10 && !(ggVar != null && ggVar.getCurrentPage() == 0), true);
        if (z10) {
            Activity parentActivity = znVar.getParentActivity();
            i11 = ((org.telegram.ui.ActionBar.n2) znVar).classGuid;
            AndroidUtilities.setAdjustResizeToNothing(parentActivity, i11);
            org.telegram.ui.Components.tc tcVar = org.telegram.ui.Components.tc.w;
            if (tcVar != null && tcVar.l) {
                tcVar.b();
            }
        } else {
            Activity parentActivity2 = znVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.n2) znVar).classGuid;
            AndroidUtilities.requestAdjustResize(parentActivity2, i10);
        }
        gk gkVar = znVar.I1;
        float f7 = 0.0f;
        if (gkVar != null) {
            gkVar.animate().alpha((z10 || znVar.isInPreviewMode()) ? 0.0f : 1.0f).setInterpolator(org.telegram.ui.Components.hs.f).start();
        }
        org.telegram.ui.Components.oz0 oz0Var = znVar.d1;
        if (oz0Var != null) {
            oz0Var.setVisibility(0);
            ViewPropertyAnimator animate = znVar.d1.animate();
            if (!z10 && !znVar.isInPreviewMode()) {
                f7 = 1.0f;
            }
            animate.alpha(f7).setInterpolator(org.telegram.ui.Components.hs.f).withEndAction(new bi.f(21, this, z10)).start();
        }
    }

    @Override // org.telegram.ui.Components.qg
    public final void z(float f7) {
        zn znVar = this.c;
        if (f7 != 0.0f) {
            znVar.D4 = true;
        }
        znVar.t9();
        znVar.w9();
        znVar.Qc(false, false);
        znVar.X0.invalidate();
        org.telegram.ui.Components.tc tcVar = org.telegram.ui.Components.tc.w;
        if (tcVar == null || znVar.Zb == null) {
            return;
        }
        tcVar.l();
    }

    @Override // org.telegram.ui.Components.qg
    public final void z0() {
        org.telegram.ui.ActionBar.k kVar;
        zn znVar = this.c;
        kVar = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
        if (kVar.n0) {
            return;
        }
        org.telegram.ui.ActionBar.y yVar = znVar.i0;
        if (yVar != null && !this.b) {
            yVar.f(8);
        }
        if (TextUtils.isEmpty(znVar.Y.getSlowModeTimer())) {
            org.telegram.ui.ActionBar.v0 v0Var = znVar.h0;
            if (v0Var != null) {
                v0Var.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar2 = znVar.e0;
            if (yVar2 != null) {
                yVar2.f(0);
            }
            fs fsVar = znVar.d0;
            if (fsVar != null) {
                fsVar.b(true);
            }
        }
    }

    @Override // org.telegram.ui.Components.qg
    public final void z1(View view, CharSequence charSequence, boolean z10) {
        zn znVar = this.c;
        znVar.Wb(view, charSequence, z10);
        org.telegram.ui.ActionBar.v0 v0Var = znVar.h0;
        if (v0Var == null || v0Var.getVisibility() == 0) {
            return;
        }
        znVar.h0.setVisibility(0);
        org.telegram.ui.ActionBar.y yVar = znVar.e0;
        if (yVar != null) {
            yVar.f(8);
        }
        fs fsVar = znVar.d0;
        if (fsVar != null) {
            fsVar.b(false);
        }
    }
}
