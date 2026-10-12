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

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class vm implements org.telegram.ui.Components.pg {
    public int a;
    public boolean b;
    public final /* synthetic */ fo c;

    public vm(fo foVar) {
        this.c = foVar;
    }

    @Override // org.telegram.ui.Components.pg
    public final boolean B0() {
        int i10;
        fo foVar = this.c;
        if ((foVar.getMessagesController().isForum(foVar.a()) && !foVar.h4) || (i10 = foVar.R3) == 9 || foVar.S3 <= 0) {
            return false;
        }
        if (i10 != 0) {
            return i10 == 3 && foVar.N8() == foVar.getUserConfig().getClientUserId();
        }
        return true;
    }

    @Override // org.telegram.ui.Components.pg
    public final void C(boolean z10) {
        int i10;
        int i11;
        fo foVar = this.c;
        if (!z10) {
            Activity parentActivity = foVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.m2) foVar).classGuid;
            AndroidUtilities.requestAdjustResize(parentActivity, i10);
        } else {
            Activity parentActivity2 = foVar.getParentActivity();
            i11 = ((org.telegram.ui.ActionBar.m2) foVar).classGuid;
            AndroidUtilities.setAdjustResizeToNothing(parentActivity2, i11);
            foVar.fragmentView.requestLayout();
        }
    }

    @Override // org.telegram.ui.Components.pg
    public final void D0(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        fo foVar = this.c;
        if (foVar.i0 == null) {
            return;
        }
        kVar = ((org.telegram.ui.ActionBar.m2) foVar).actionBar;
        final org.telegram.ui.ActionBar.y n10 = kVar.n();
        org.telegram.ui.Components.kz0 kz0Var = foVar.d1;
        if (kz0Var != null) {
            kz0Var.e();
        }
        final int i12 = 1;
        final int i13 = 0;
        if (i11 - i10 > 0) {
            org.telegram.ui.ActionBar.x xVar = foVar.i0;
            if (xVar.o == null) {
                xVar.o = 1;
                if (foVar.i0.l != 0) {
                    if (!(foVar.R3 == 3 && foVar.N8() == foVar.getUserConfig().getClientUserId()) && (foVar.R3 != 0 || (!(foVar.d4 == 0 || foVar.h4) || UserObject.isReplyUser(foVar.f) || foVar.F9()))) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(AndroidUtilities.dp(48.0f), 0.0f);
                        ofFloat.setDuration(220L);
                        ofFloat.setInterpolator(org.telegram.ui.Components.es.f);
                        ofFloat.addListener(new um(this, n10, 0));
                        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.tm
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
                        foVar.i0.f(0);
                        fo.S3(foVar);
                        org.telegram.ui.ActionBar.u0 u0Var = foVar.h0;
                        if (u0Var != null) {
                            u0Var.setVisibility(8);
                        }
                        org.telegram.ui.ActionBar.x xVar2 = foVar.e0;
                        if (xVar2 != null) {
                            xVar2.f(8);
                        }
                        ls lsVar = foVar.d0;
                        if (lsVar != null) {
                            lsVar.b(false);
                        }
                    }
                }
            }
            foVar.A4 = i10;
            foVar.B4 = i11;
            return;
        }
        org.telegram.ui.ActionBar.x xVar3 = foVar.i0;
        if (xVar3.o != null) {
            xVar3.o = null;
            if (xVar3.l != 8) {
                if (!(foVar.R3 == 3 && foVar.N8() == foVar.getUserConfig().getClientUserId()) && (foVar.R3 != 0 || (!(foVar.d4 == 0 || foVar.h4) || UserObject.isReplyUser(foVar.f) || foVar.F9()))) {
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, AndroidUtilities.dp(48.0f));
                    ofFloat2.setDuration(220L);
                    ofFloat2.setInterpolator(org.telegram.ui.Components.es.f);
                    ofFloat2.addListener(new um(this, n10, 1));
                    ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.tm
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
                foVar.i0.f(8);
                if (foVar.Y.i0() && TextUtils.isEmpty(foVar.Y.getSlowModeTimer())) {
                    org.telegram.ui.ActionBar.u0 u0Var2 = foVar.h0;
                    if (u0Var2 != null) {
                        u0Var2.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.x xVar4 = foVar.e0;
                    if (xVar4 != null) {
                        xVar4.f(0);
                    }
                    ls lsVar2 = foVar.d0;
                    if (lsVar2 != null) {
                        lsVar2.b(true);
                        return;
                    }
                    return;
                }
                org.telegram.ui.ActionBar.u0 u0Var3 = foVar.h0;
                if (u0Var3 != null) {
                    u0Var3.setVisibility(0);
                }
                org.telegram.ui.ActionBar.x xVar5 = foVar.e0;
                if (xVar5 != null) {
                    xVar5.f(8);
                }
                ls lsVar3 = foVar.d0;
                if (lsVar3 != null) {
                    lsVar3.b(false);
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.pg
    public final void F0() {
        fo foVar = this.c;
        foVar.o9 = true;
        rm rmVar = foVar.A0;
        if (rmVar != null) {
            rmVar.K(true);
        }
    }

    @Override // org.telegram.ui.Components.pg
    public final void G() {
        this.c.Zb(true, false);
    }

    @Override // org.telegram.ui.Components.pg
    public final void H0() {
        this.c.oa(0, false);
    }

    @Override // org.telegram.ui.Components.pg
    public final void J(CharSequence charSequence, boolean z10, int i10, int i11, long j10) {
        hg.f1 f1Var;
        MessageObject messageObject;
        int i12;
        long topicId;
        MessagePreviewParams messagePreviewParams;
        MessagePreviewParams.Messages messages;
        TLRPC.Message message;
        MessagePreviewParams.Messages messages2;
        fo foVar = this.c;
        ArrayList arrayList = foVar.u6;
        if (foVar.y0 != null) {
            foVar.b0 = foVar.Y.getBackgroundTop();
        }
        kk kkVar = foVar.I1;
        if (kkVar != null && kkVar.getAdapter() != null) {
            foVar.I1.getAdapter().w.a(charSequence);
        }
        boolean z11 = false;
        if (i10 != 0) {
            if (foVar.S3 == -1) {
                foVar.S3 = 0;
            }
            if (charSequence != null) {
                foVar.S3++;
            }
            MessagePreviewParams messagePreviewParams2 = foVar.f5;
            if (messagePreviewParams2 != null && (messages2 = messagePreviewParams2.forwardMessages) != null && !messages2.messages.isEmpty()) {
                foVar.S3 += foVar.f5.forwardMessages.messages.size();
            }
            foVar.Ic(false);
        }
        if (!TextUtils.isEmpty(charSequence) && (messagePreviewParams = foVar.f5) != null && (messages = messagePreviewParams.forwardMessages) != null && !messages.messages.isEmpty() && foVar.f5.quote == null && j10 <= 0) {
            ArrayList<MessageObject> arrayList2 = new ArrayList<>();
            foVar.f5.forwardMessages.getSelectedMessages(arrayList2);
            boolean z12 = arrayList2.size() > 0;
            TLRPC.Peer peer = foVar.getMessagesController().getPeer(foVar.T5);
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
                org.telegram.ui.Components.sc M = org.telegram.ui.Components.zc.a0(foVar).M(LocaleController.getString(R.string.SwipeToReplyHint), LocaleController.getString(R.string.SwipeToReplyHintMessage), R.raw.hint_swipe_reply);
                org.telegram.ui.Components.bk0 bk0Var = ((org.telegram.ui.Components.pc) M.e).a;
                bk0Var.setScaleX(1.8f);
                bk0Var.setScaleY(1.8f);
                M.k(true);
            }
        }
        if (ChatObject.isForum(foVar.e) && !foVar.h4 && (messageObject = foVar.n5) != null) {
            TLRPC.TL_forumTopic tL_forumTopic = messageObject.replyToForumTopic;
            if (tL_forumTopic != null) {
                topicId = tL_forumTopic.id;
            } else {
                i12 = ((org.telegram.ui.ActionBar.m2) foVar).currentAccount;
                topicId = MessageObject.getTopicId(i12, foVar.n5.messageOwner, true);
            }
            long j11 = topicId;
            if (j11 != 0) {
                foVar.getMediaDataController().cleanDraft(foVar.T5, j11, false);
            }
        }
        foVar.Cb(false, null, null, null, null, z10, i10, null, false, j10, null, true);
        sk skVar = foVar.Y;
        if (skVar != null && skVar.getEmojiView() != null && (f1Var = foVar.Y.getEmojiView().T0) != null) {
            if (f1Var.e) {
                MessagesController.getInstance(f1Var.a).sendTyping(f1Var.b, f1Var.c, 2, 0);
            }
            f1Var.f = -1L;
        }
        if (foVar.getMessagesController().premiumFeaturesBlocked() || foVar.getMessagesController().transcribeAudioTrialWeeklyNumber > 0 || foVar.getMessagesController().didPressTranscribeButtonEnough() || foVar.getUserConfig().isPremium() || TextUtils.isEmpty(charSequence) || arrayList == null) {
            return;
        }
        for (int i14 = 1; i14 < Math.min(5, arrayList.size()); i14++) {
            MessageObject messageObject3 = (MessageObject) arrayList.get(i14);
            if (messageObject3 != null && !messageObject3.isOutOwner() && ((messageObject3.isVoice() || messageObject3.isRoundVideo()) && messageObject3.isContentUnread())) {
                org.telegram.ui.Components.f41.u(messageObject3, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.pg
    public final TLRPC.TL_channels_sendAsPeers K() {
        return this.c.ha;
    }

    @Override // org.telegram.ui.Components.pg
    public final void Q0() {
        fo foVar = this.c;
        int sendingMessageId = foVar.getSendMessagesHelper().getSendingMessageId(foVar.T5);
        if (sendingMessageId != 0) {
            this.c.j(sendingMessageId, 0, true, 0, true, 0);
        }
    }

    @Override // org.telegram.ui.Components.pg
    public final void T1() {
        org.telegram.ui.Components.kz0 kz0Var = this.c.d1;
        if (kz0Var != null) {
            kz0Var.e();
        }
    }

    @Override // org.telegram.ui.Components.pg
    public final void U(float f7, int i10) {
        org.telegram.ui.Components.u60 u60Var = this.c.b3;
        if (u60Var != null) {
            u60Var.b(f7, i10);
        }
    }

    @Override // org.telegram.ui.Components.pg
    public final void V1(int i10) {
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.dp(72.0f);
        fo foVar = this.c;
        if (i10 < currentActionBarHeight) {
            foVar.Z4 = false;
            if (foVar.d1.getVisibility() == 0) {
                foVar.d1.setVisibility(4);
            }
        } else {
            foVar.Z4 = true;
            if (foVar.d1.getVisibility() == 4 && !foVar.isInPreviewMode()) {
                foVar.d1.setVisibility(0);
            }
        }
        foVar.a5 = true ^ foVar.Y.r0();
        int i11 = i10 + (foVar.Y.r0() ? 65536 : 0);
        if (this.a != i11) {
            foVar.b0 = 0;
        }
        this.a = i11;
    }

    @Override // org.telegram.ui.Components.pg
    public final void X() {
        fo foVar = this.c;
        sk skVar = foVar.Y;
        boolean z10 = skVar.z3;
        org.telegram.ui.Components.fg fgVar = skVar.U0;
        boolean z11 = false;
        boolean z12 = fgVar != null && fgVar.getCurrentPage() == 0;
        ne.b bVar = foVar.xc;
        if (z10 && !z12) {
            z11 = true;
        }
        bVar.a(z11, true);
    }

    @Override // org.telegram.ui.Components.pg
    public final void X0(int i10) {
        int i11 = i10 == 0 ? 8 : 0;
        fo foVar = this.c;
        if (foVar.c3.getVisibility() != i11) {
            foVar.c3.setVisibility(i11);
        }
    }

    @Override // org.telegram.ui.Components.pg
    public final int Y0() {
        return this.c.X0.getHeight();
    }

    @Override // org.telegram.ui.Components.pg
    public final void Y1() {
        xm xmVar;
        int indexOfChild;
        fo foVar = this.c;
        if (foVar.getParentActivity() != null) {
            if ((foVar.e == null && foVar.a8 == null) || foVar.fragmentView == null) {
                return;
            }
            org.telegram.ui.Components.v40 v40Var = foVar.f2;
            if ((v40Var == null || v40Var.getVisibility() != 0) && (indexOfChild = (xmVar = foVar.X0).indexOfChild(foVar.S)) != -1) {
                try {
                    foVar.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception e) {
                    FileLog.e(e);
                }
                if (foVar.f2 == null) {
                    org.telegram.ui.Components.v40 v40Var2 = new org.telegram.ui.Components.v40(9, foVar.getParentActivity(), foVar.ea, false);
                    foVar.f2 = v40Var2;
                    v40Var2.setVisibility(8);
                    xmVar.addView(foVar.f2, indexOfChild + 1, w7.a6.a(-2.0f, 10.0f, 0.0f, 10.0f, 0.0f, -2, 51));
                }
                TLRPC.UserFull userFull = foVar.a8;
                if (userFull != null && userFull.voice_messages_forbidden) {
                    foVar.f2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(foVar.Y.c1 ? R.string.VideoMessagesRestrictedByPrivacy : R.string.VoiceMessagesRestrictedByPrivacy, foVar.f.first_name)));
                } else if (ChatObject.canSendVoice(foVar.e) || ChatObject.canSendRoundVideo(foVar.e)) {
                    if (ChatObject.isActionBannedByDefault(foVar.e, 20)) {
                        foVar.f2.setText(LocaleController.getString(R.string.GlobalAttachVoiceRestricted));
                    } else if (ChatObject.isActionBannedByDefault(foVar.e, 21)) {
                        foVar.f2.setText(LocaleController.getString(R.string.GlobalAttachRoundRestricted));
                    } else if (ChatObject.isActionBannedByDefault(foVar.e, 7)) {
                        foVar.f2.setText(LocaleController.getString(R.string.GlobalAttachMediaRestricted));
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = foVar.e.banned_rights;
                        if (tL_chatBannedRights == null) {
                            return;
                        }
                        if (AndroidUtilities.isBannedForever(tL_chatBannedRights)) {
                            foVar.f2.setText(LocaleController.getString(R.string.AttachMediaRestrictedForever));
                        } else {
                            foVar.f2.setText(LocaleController.formatString("AttachMediaRestricted", R.string.AttachMediaRestricted, LocaleController.formatDateForBan(foVar.e.banned_rights.until_date)));
                        }
                    }
                } else {
                    if (foVar.N6()) {
                        return;
                    }
                    if (foVar.Y.c1) {
                        foVar.f2.setText(ChatObject.getRestrictedErrorText(foVar.e, 21));
                    } else {
                        foVar.f2.setText(ChatObject.getRestrictedErrorText(foVar.e, 20));
                    }
                }
                View sendButton = foVar.Y.getSendButton();
                View audioVideoButtonContainer = foVar.Y.getAudioVideoButtonContainer();
                if (sendButton.getAlpha() < audioVideoButtonContainer.getAlpha()) {
                    sendButton = audioVideoButtonContainer;
                }
                foVar.f2.f(sendButton, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.pg
    public final void Z1(boolean z10) {
        fo foVar = this.c;
        View view = foVar.w2;
        if (view != null) {
            view.setVisibility(8);
        }
        foVar.b5 = !z10;
    }

    @Override // org.telegram.ui.Components.pg
    public final void a0(boolean z10) {
        this.c.Zb(false, z10);
    }

    @Override // org.telegram.ui.Components.pg
    public final /* synthetic */ TL_stories.StoryItem a1() {
        return null;
    }

    @Override // org.telegram.ui.Components.pg
    public final void a2(int i10, int i11, int i12, long j10, long j11, boolean z10) {
        boolean z11;
        fo foVar = this.c;
        if (foVar.b3 == null && CameraView.isCameraAllowed() && foVar.getParentActivity() != null) {
            Activity parentActivity = foVar.getParentActivity();
            co coVar = foVar.ea;
            int i13 = org.telegram.ui.Components.u60.e;
            si.a aVar = si.e.d;
            aVar.a();
            if (aVar.c) {
                aVar.a();
                z11 = aVar.d;
            } else {
                z11 = AppGlobalConfig.getInstance(UserConfig.selectedAccount).roundVideoRecorder2Allowed.get();
            }
            org.telegram.ui.Components.u60 o60Var = z11 ? new org.telegram.ui.Components.o60(parentActivity, foVar, coVar) : new org.telegram.ui.Components.p60(parentActivity, foVar, coVar, true);
            foVar.b3 = o60Var;
            o60Var.setAnimationCallback(new xe(foVar, 0));
            foVar.b3.setTrimCallback(new xe(foVar, 1));
            foVar.b3.setRecordingUiFrameCallback(new wj(foVar));
            foVar.b3.setClipToPadding(false);
            foVar.b3.g(foVar.J, foVar.w);
            int indexOfChild = foVar.X0.indexOfChild(foVar.S);
            if (indexOfChild < 0) {
                indexOfChild = foVar.X0.getChildCount();
            }
            foVar.X0.addView(foVar.b3, Math.min(indexOfChild + 1, foVar.X0.getChildCount()), w7.a6.e(-1, -1, 51));
        }
        org.telegram.ui.Components.u60 u60Var = this.c.b3;
        if (u60Var != null) {
            if (i10 == 0) {
                u60Var.h(false);
                this.c.x0.B0();
                this.c.A0.T();
            } else if (i10 == 1 || i10 == 3 || i10 == 4) {
                u60Var.f(i10, i11, i12, j10, j11, z10);
            } else if (i10 == 2 || i10 == 5) {
                u60Var.a(i10 == 2);
            }
        }
    }

    @Override // org.telegram.ui.Components.pg
    public final /* synthetic */ boolean b1(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Components.pg
    public final boolean e1() {
        org.telegram.ui.Components.u60 u60Var = this.c.b3;
        return u60Var != null && u60Var.d();
    }

    @Override // org.telegram.ui.Components.pg
    public final void e2() {
        fo foVar = this.c;
        nj njVar = foVar.g2;
        if (njVar != null) {
            njVar.b(true);
        }
        org.telegram.ui.Components.v40 v40Var = foVar.i2;
        if (v40Var != null) {
            v40Var.b(true);
        }
    }

    @Override // org.telegram.ui.Components.pg
    public final void g1(CharSequence charSequence, boolean z10, boolean z11) {
        CharSequence charSequence2;
        org.telegram.ui.Components.v40 v40Var;
        TLRPC.ChatFull chatFull;
        MediaController mediaController = MediaController.getInstance();
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        boolean z12 = false;
        fo foVar = this.c;
        mediaController.setInputFieldHasText(!isEmpty || foVar.Y.p0());
        kk kkVar = foVar.I1;
        if (kkVar == null || kkVar.getAdapter() == null) {
            charSequence2 = charSequence;
        } else {
            charSequence2 = charSequence;
            foVar.I1.getAdapter().U(charSequence2, foVar.Y.getCursorPosition(), foVar.u6, false, false);
        }
        j9.u uVar = foVar.J5;
        if (uVar != null) {
            AndroidUtilities.cancelRunOnUIThread(uVar);
            foVar.J5 = null;
        }
        TLRPC.Chat chat = foVar.e;
        if (chat == null || ChatObject.canSendEmbed(chat)) {
            sk skVar = foVar.Y;
            if (skVar.Y2 && (!skVar.p0() || !foVar.Y.a2)) {
                if (z10) {
                    foVar.cb(charSequence2, true);
                } else {
                    foVar.P6(charSequence2);
                    j9.u uVar2 = new j9.u(this, charSequence2, false, 22);
                    foVar.J5 = uVar2;
                    AndroidUtilities.runOnUIThread(uVar2, AndroidUtilities.WEB_URL == null ? 3000L : 1000L);
                }
            }
        }
        cl clVar = foVar.xa;
        if (clVar != null) {
            ArrayList arrayList = clVar.F;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((jz) arrayList.get(i10)).n = true;
            }
        }
        ah.d1 d1Var = ah.d1.B;
        if (d1Var != null) {
            d1Var.l = true;
        }
        ah.d1 d1Var2 = ah.d1.C;
        if (d1Var2 != null) {
            d1Var2.l = true;
        }
        if (z11) {
            return;
        }
        nj njVar = foVar.g2;
        if ((njVar != null && njVar.getVisibility() == 0) || ((v40Var = foVar.i2) != null && v40Var.getVisibility() == 0)) {
            nj njVar2 = foVar.g2;
            if (njVar2 != null) {
                njVar2.b(true);
            }
            org.telegram.ui.Components.v40 v40Var2 = foVar.i2;
            if (v40Var2 != null) {
                v40Var2.b(true);
                return;
            }
            return;
        }
        wf wfVar = foVar.Oa;
        if (UserObject.isUserSelf(foVar.f) || ((chatFull = foVar.Z7) != null && chatFull.slowmode_next_send_date > 0 && foVar.R3 == 0)) {
            z12 = true;
        }
        if (foVar.j2 || foVar.h2 || z12 || SharedConfig.scheduledHintShows >= 3 || foVar.Y.p0()) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(wfVar);
        AndroidUtilities.runOnUIThread(wfVar, 4000L);
    }

    @Override // org.telegram.ui.Components.pg
    public final void h() {
        this.c.zc();
    }

    @Override // org.telegram.ui.Components.pg
    public final void i1() {
        org.telegram.ui.Components.u60 u60Var = this.c.b3;
        if (u60Var != null) {
            u60Var.i();
        }
    }

    @Override // org.telegram.ui.Components.pg
    public final boolean j1() {
        fo foVar = this.c;
        TLRPC.User user = foVar.f;
        return (user == null || UserObject.isUserSelf(user) || foVar.f.bot || foVar.h != null || foVar.R3 != 0) ? false : true;
    }

    @Override // org.telegram.ui.Components.pg
    public final void k() {
        org.telegram.ui.Components.kz0 kz0Var = this.c.d1;
        if (kz0Var != null) {
            kz0Var.f();
        }
    }

    @Override // org.telegram.ui.Components.pg
    public final boolean l() {
        return this.c.N6();
    }

    @Override // org.telegram.ui.Components.pg
    public final void l1() {
        int i10;
        fo foVar = this.c;
        Activity parentActivity = foVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.m2) foVar).currentAccount;
        long j10 = foVar.T5;
        MessageSuggestionParams messageSuggestionParams = foVar.g5;
        if (messageSuggestionParams == null) {
            messageSuggestionParams = MessageSuggestionParams.empty();
        }
        new zh.d0(parentActivity, i10, j10, messageSuggestionParams, foVar, foVar.getResourceProvider(), 0, new jf(foVar, 4)).show();
    }

    @Override // org.telegram.ui.Components.pg
    public final void m0() {
        org.telegram.ui.Components.kz0 kz0Var = this.c.d1;
        if (kz0Var != null) {
            kz0Var.f();
        }
    }

    @Override // org.telegram.ui.Components.pg
    public final void m1() {
        this.c.K6();
    }

    @Override // org.telegram.ui.Components.pg
    public final void m2() {
        org.telegram.ui.ActionBar.k kVar;
        fo foVar = this.c;
        kVar = ((org.telegram.ui.ActionBar.m2) foVar).actionBar;
        if (kVar.n0) {
            return;
        }
        org.telegram.ui.ActionBar.u0 u0Var = foVar.h0;
        if (u0Var != null) {
            u0Var.setVisibility(0);
        }
        org.telegram.ui.ActionBar.x xVar = foVar.i0;
        if (xVar != null && !this.b) {
            xVar.f(8);
        }
        org.telegram.ui.ActionBar.x xVar2 = foVar.e0;
        if (xVar2 != null) {
            xVar2.f(8);
        }
        ls lsVar = foVar.d0;
        if (lsVar != null) {
            lsVar.b(false);
        }
    }

    @Override // org.telegram.ui.Components.pg
    public final void n1() {
        int i10;
        int i11;
        fo foVar = this.c;
        foVar.Z6();
        sk skVar = foVar.Y;
        boolean z10 = skVar.z3;
        org.telegram.ui.Components.fg fgVar = skVar.U0;
        foVar.xc.a(z10 && !(fgVar != null && fgVar.getCurrentPage() == 0), true);
        if (z10) {
            Activity parentActivity = foVar.getParentActivity();
            i11 = ((org.telegram.ui.ActionBar.m2) foVar).classGuid;
            AndroidUtilities.setAdjustResizeToNothing(parentActivity, i11);
            org.telegram.ui.Components.sc scVar = org.telegram.ui.Components.sc.w;
            if (scVar != null && scVar.l) {
                scVar.b();
            }
        } else {
            Activity parentActivity2 = foVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.m2) foVar).classGuid;
            AndroidUtilities.requestAdjustResize(parentActivity2, i10);
        }
        kk kkVar = foVar.I1;
        float f7 = 0.0f;
        if (kkVar != null) {
            kkVar.animate().alpha((z10 || foVar.isInPreviewMode()) ? 0.0f : 1.0f).setInterpolator(org.telegram.ui.Components.es.f).start();
        }
        org.telegram.ui.Components.kz0 kz0Var = foVar.d1;
        if (kz0Var != null) {
            kz0Var.setVisibility(0);
            ViewPropertyAnimator animate = foVar.d1.animate();
            if (!z10 && !foVar.isInPreviewMode()) {
                f7 = 1.0f;
            }
            animate.alpha(f7).setInterpolator(org.telegram.ui.Components.es.f).withEndAction(new ah.t(22, this, z10)).start();
        }
    }

    @Override // org.telegram.ui.Components.pg
    public final void o1(View view, CharSequence charSequence, boolean z10) {
        fo foVar = this.c;
        foVar.Wb(view, charSequence, z10);
        org.telegram.ui.ActionBar.u0 u0Var = foVar.h0;
        if (u0Var == null || u0Var.getVisibility() == 0) {
            return;
        }
        foVar.h0.setVisibility(0);
        org.telegram.ui.ActionBar.x xVar = foVar.e0;
        if (xVar != null) {
            xVar.f(8);
        }
        ls lsVar = foVar.d0;
        if (lsVar != null) {
            lsVar.b(false);
        }
    }

    @Override // org.telegram.ui.Components.pg
    public final un p0() {
        return this.c.l5;
    }

    @Override // org.telegram.ui.Components.pg
    public final int q() {
        return this.c.X0.R();
    }

    @Override // org.telegram.ui.Components.pg
    public final void q1(CharSequence charSequence) {
        this.c.cb(charSequence, true);
    }

    @Override // org.telegram.ui.Components.pg
    public final void q2() {
        fo foVar = this.c;
        bi.w3 w3Var = foVar.J1;
        if (w3Var != null) {
            w3Var.L1(null, 0);
        }
        foVar.ca();
    }

    @Override // org.telegram.ui.Components.pg
    public final boolean r1() {
        MessagePreviewParams.Messages messages;
        MessagePreviewParams messagePreviewParams = this.c.f5;
        return (messagePreviewParams == null || (messages = messagePreviewParams.forwardMessages) == null || messages.messages.isEmpty()) ? false : true;
    }

    @Override // org.telegram.ui.Components.pg
    public final void t0() {
        org.telegram.ui.ActionBar.k kVar;
        fo foVar = this.c;
        kVar = ((org.telegram.ui.ActionBar.m2) foVar).actionBar;
        if (kVar.n0) {
            return;
        }
        org.telegram.ui.ActionBar.x xVar = foVar.i0;
        if (xVar != null && !this.b) {
            xVar.f(8);
        }
        if (TextUtils.isEmpty(foVar.Y.getSlowModeTimer())) {
            org.telegram.ui.ActionBar.u0 u0Var = foVar.h0;
            if (u0Var != null) {
                u0Var.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar2 = foVar.e0;
            if (xVar2 != null) {
                xVar2.f(0);
            }
            ls lsVar = foVar.d0;
            if (lsVar != null) {
                lsVar.b(true);
            }
        }
    }

    @Override // org.telegram.ui.Components.pg
    public final void u1() {
        int i10;
        fo foVar = this.c;
        i10 = ((org.telegram.ui.ActionBar.m2) foVar).currentAccount;
        BotForumHelper.getInstance(i10).stopStreaming(foVar.T5, (int) foVar.d());
        foVar.f7(true);
    }

    @Override // org.telegram.ui.Components.pg
    public final /* synthetic */ TLRPC.Peer x() {
        return null;
    }

    @Override // org.telegram.ui.Components.pg
    public final void y() {
        boolean z10;
        fo foVar = this.c;
        if (foVar.y0 != null) {
            foVar.b0 = foVar.Y.getBackgroundTop();
        }
        kk kkVar = foVar.I1;
        if (kkVar != null) {
            kkVar.getAdapter().f0 = true;
        }
        if (foVar.p5 != null) {
            AndroidUtilities.runOnUIThread(new gj(this, 7), 30L);
        }
        if (foVar.Y.r0()) {
            foVar.Y.c1();
            z10 = true;
        } else {
            z10 = false;
        }
        foVar.Y.T0(true, true, z10);
        if (foVar.o5 != 0) {
            foVar.getConnectionsManager().cancelRequest(foVar.o5, true);
            foVar.o5 = 0;
        }
        foVar.Cc(0, true);
        foVar.lc(false);
        foVar.ad(false);
    }

    @Override // org.telegram.ui.Components.pg
    public final void y1() {
        int i10;
        int i11;
        fo foVar = this.c;
        if (foVar.E9() || (i10 = foVar.R3) == 6 || i10 == 8) {
            return;
        }
        MessagesController messagesController = foVar.getMessagesController();
        long j10 = foVar.T5;
        long j11 = foVar.d4;
        i11 = ((org.telegram.ui.ActionBar.m2) foVar).classGuid;
        messagesController.sendTyping(j10, j11, 0, i11);
    }

    @Override // org.telegram.ui.Components.pg
    public final void z(float f7) {
        fo foVar = this.c;
        if (f7 != 0.0f) {
            foVar.D4 = true;
        }
        foVar.t9();
        foVar.w9();
        foVar.Qc(false, false);
        foVar.X0.invalidate();
        org.telegram.ui.Components.sc scVar = org.telegram.ui.Components.sc.w;
        if (scVar == null || foVar.Zb == null) {
            return;
        }
        scVar.l();
    }
}
