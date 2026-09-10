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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class tm implements org.telegram.ui.Components.qg {
    public int a;
    public boolean b;
    public final /* synthetic */ eo c;

    public tm(eo eoVar) {
        this.c = eoVar;
    }

    @Override // org.telegram.ui.Components.qg
    public final void B(boolean z10) {
        int i10;
        int i11;
        eo eoVar = this.c;
        if (!z10) {
            Activity parentActivity = eoVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.p2) eoVar).classGuid;
            AndroidUtilities.requestAdjustResize(parentActivity, i10);
        } else {
            Activity parentActivity2 = eoVar.getParentActivity();
            i11 = ((org.telegram.ui.ActionBar.p2) eoVar).classGuid;
            AndroidUtilities.setAdjustResizeToNothing(parentActivity2, i11);
            eoVar.fragmentView.requestLayout();
        }
    }

    @Override // org.telegram.ui.Components.qg
    public final boolean D0() {
        int i10;
        eo eoVar = this.c;
        if ((eoVar.getMessagesController().isForum(eoVar.a()) && !eoVar.h4) || (i10 = eoVar.R3) == 9 || eoVar.S3 <= 0) {
            return false;
        }
        if (i10 != 0) {
            return i10 == 3 && eoVar.I8() == eoVar.getUserConfig().getClientUserId();
        }
        return true;
    }

    @Override // org.telegram.ui.Components.qg
    public final void D1() {
        int i10;
        int i11;
        eo eoVar = this.c;
        if (eoVar.z9() || (i10 = eoVar.R3) == 6 || i10 == 8) {
            return;
        }
        MessagesController messagesController = eoVar.getMessagesController();
        long j3 = eoVar.T5;
        long j10 = eoVar.d4;
        i11 = ((org.telegram.ui.ActionBar.p2) eoVar).classGuid;
        messagesController.sendTyping(j3, j10, 0, i11);
    }

    @Override // org.telegram.ui.Components.qg
    public final void F0(int i10, int i11) {
        org.telegram.ui.ActionBar.l lVar;
        eo eoVar = this.c;
        if (eoVar.i0 == null) {
            return;
        }
        lVar = ((org.telegram.ui.ActionBar.p2) eoVar).actionBar;
        final org.telegram.ui.ActionBar.z n10 = lVar.n();
        org.telegram.ui.Components.zy0 zy0Var = eoVar.d1;
        if (zy0Var != null) {
            zy0Var.e();
        }
        final int i12 = 1;
        final int i13 = 0;
        if (i11 - i10 > 0) {
            org.telegram.ui.ActionBar.y yVar = eoVar.i0;
            if (yVar.o == null) {
                yVar.o = 1;
                if (eoVar.i0.l != 0) {
                    if (!(eoVar.R3 == 3 && eoVar.I8() == eoVar.getUserConfig().getClientUserId()) && (eoVar.R3 != 0 || (!(eoVar.d4 == 0 || eoVar.h4) || UserObject.isReplyUser(eoVar.f) || eoVar.A9()))) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(AndroidUtilities.dp(48.0f), 0.0f);
                        ofFloat.setDuration(220L);
                        ofFloat.setInterpolator(org.telegram.ui.Components.wr.f);
                        ofFloat.addListener(new sm(this, n10, 0));
                        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.rm
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
                        eoVar.i0.f(0);
                        eo.J3(eoVar);
                        org.telegram.ui.ActionBar.w0 w0Var = eoVar.h0;
                        if (w0Var != null) {
                            w0Var.setVisibility(8);
                        }
                        org.telegram.ui.ActionBar.y yVar2 = eoVar.e0;
                        if (yVar2 != null) {
                            yVar2.f(8);
                        }
                        is isVar = eoVar.d0;
                        if (isVar != null) {
                            isVar.b(false);
                        }
                    }
                }
            }
            eoVar.A4 = i10;
            eoVar.B4 = i11;
            return;
        }
        org.telegram.ui.ActionBar.y yVar3 = eoVar.i0;
        if (yVar3.o != null) {
            yVar3.o = null;
            if (yVar3.l != 8) {
                if (!(eoVar.R3 == 3 && eoVar.I8() == eoVar.getUserConfig().getClientUserId()) && (eoVar.R3 != 0 || (!(eoVar.d4 == 0 || eoVar.h4) || UserObject.isReplyUser(eoVar.f) || eoVar.A9()))) {
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, AndroidUtilities.dp(48.0f));
                    ofFloat2.setDuration(220L);
                    ofFloat2.setInterpolator(org.telegram.ui.Components.wr.f);
                    ofFloat2.addListener(new sm(this, n10, 1));
                    ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.rm
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
                eoVar.i0.f(8);
                if (eoVar.Y.k0() && TextUtils.isEmpty(eoVar.Y.getSlowModeTimer())) {
                    org.telegram.ui.ActionBar.w0 w0Var2 = eoVar.h0;
                    if (w0Var2 != null) {
                        w0Var2.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.y yVar4 = eoVar.e0;
                    if (yVar4 != null) {
                        yVar4.f(0);
                    }
                    is isVar2 = eoVar.d0;
                    if (isVar2 != null) {
                        isVar2.b(true);
                        return;
                    }
                    return;
                }
                org.telegram.ui.ActionBar.w0 w0Var3 = eoVar.h0;
                if (w0Var3 != null) {
                    w0Var3.setVisibility(0);
                }
                org.telegram.ui.ActionBar.y yVar5 = eoVar.e0;
                if (yVar5 != null) {
                    yVar5.f(8);
                }
                is isVar3 = eoVar.d0;
                if (isVar3 != null) {
                    isVar3.b(false);
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.qg
    public final void G() {
        this.c.Vb(true, false);
    }

    @Override // org.telegram.ui.Components.qg
    public final void H0() {
        eo eoVar = this.c;
        eoVar.o9 = true;
        pm pmVar = eoVar.A0;
        if (pmVar != null) {
            pmVar.K(true);
        }
    }

    @Override // org.telegram.ui.Components.qg
    public final void I(CharSequence charSequence, boolean z10, int i10, int i11, long j3) {
        fg.h1 h1Var;
        MessageObject messageObject;
        int i12;
        long topicId;
        MessagePreviewParams messagePreviewParams;
        MessagePreviewParams.Messages messages;
        TLRPC.Message message;
        MessagePreviewParams.Messages messages2;
        eo eoVar = this.c;
        ArrayList arrayList = eoVar.u6;
        if (eoVar.y0 != null) {
            eoVar.b0 = eoVar.Y.getBackgroundTop();
        }
        hk hkVar = eoVar.I1;
        if (hkVar != null && hkVar.getAdapter() != null) {
            eoVar.I1.getAdapter().w.a(charSequence);
        }
        boolean z11 = false;
        if (i10 != 0) {
            if (eoVar.S3 == -1) {
                eoVar.S3 = 0;
            }
            if (charSequence != null) {
                eoVar.S3++;
            }
            MessagePreviewParams messagePreviewParams2 = eoVar.f5;
            if (messagePreviewParams2 != null && (messages2 = messagePreviewParams2.forwardMessages) != null && !messages2.messages.isEmpty()) {
                eoVar.S3 += eoVar.f5.forwardMessages.messages.size();
            }
            eoVar.Ec(false);
        }
        if (!TextUtils.isEmpty(charSequence) && (messagePreviewParams = eoVar.f5) != null && (messages = messagePreviewParams.forwardMessages) != null && !messages.messages.isEmpty() && eoVar.f5.quote == null && j3 <= 0) {
            ArrayList<MessageObject> arrayList2 = new ArrayList<>();
            eoVar.f5.forwardMessages.getSelectedMessages(arrayList2);
            boolean z12 = arrayList2.size() > 0;
            TLRPC.Peer peer = eoVar.getMessagesController().getPeer(eoVar.T5);
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
                org.telegram.ui.Components.pc M = org.telegram.ui.Components.wc.a0(eoVar).M(LocaleController.getString(R.string.SwipeToReplyHint), LocaleController.getString(R.string.SwipeToReplyHintMessage), R.raw.hint_swipe_reply);
                org.telegram.ui.Components.kj0 kj0Var = ((org.telegram.ui.Components.mc) M.e).a;
                kj0Var.setScaleX(1.8f);
                kj0Var.setScaleY(1.8f);
                M.k(true);
            }
        }
        if (ChatObject.isForum(eoVar.e) && !eoVar.h4 && (messageObject = eoVar.n5) != null) {
            TLRPC.TL_forumTopic tL_forumTopic = messageObject.replyToForumTopic;
            if (tL_forumTopic != null) {
                topicId = tL_forumTopic.id;
            } else {
                i12 = ((org.telegram.ui.ActionBar.p2) eoVar).currentAccount;
                topicId = MessageObject.getTopicId(i12, eoVar.n5.messageOwner, true);
            }
            long j10 = topicId;
            if (j10 != 0) {
                eoVar.getMediaDataController().cleanDraft(eoVar.T5, j10, false);
            }
        }
        eoVar.zb(false, null, null, null, null, z10, i10, null, false, j3, null, true);
        ok okVar = eoVar.Y;
        if (okVar != null && okVar.getEmojiView() != null && (h1Var = eoVar.Y.getEmojiView().T0) != null) {
            if (h1Var.e) {
                MessagesController.getInstance(h1Var.a).sendTyping(h1Var.b, h1Var.c, 2, 0);
            }
            h1Var.f = -1L;
        }
        if (eoVar.getMessagesController().premiumFeaturesBlocked() || eoVar.getMessagesController().transcribeAudioTrialWeeklyNumber > 0 || eoVar.getMessagesController().didPressTranscribeButtonEnough() || eoVar.getUserConfig().isPremium() || TextUtils.isEmpty(charSequence) || arrayList == null) {
            return;
        }
        for (int i14 = 1; i14 < Math.min(5, arrayList.size()); i14++) {
            MessageObject messageObject3 = (MessageObject) arrayList.get(i14);
            if (messageObject3 != null && !messageObject3.isOutOwner() && ((messageObject3.isVoice() || messageObject3.isRoundVideo()) && messageObject3.isContentUnread())) {
                org.telegram.ui.Components.r31.u(messageObject3, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.qg
    public final TLRPC.TL_channels_sendAsPeers J() {
        return this.c.ha;
    }

    @Override // org.telegram.ui.Components.qg
    public final void J0() {
        this.c.ja(0, false);
    }

    @Override // org.telegram.ui.Components.qg
    public final void T(float f7, int i10) {
        il ilVar = this.c.b3;
        if (ilVar != null) {
            ilVar.e(f7, i10);
        }
    }

    @Override // org.telegram.ui.Components.qg
    public final void T0() {
        eo eoVar = this.c;
        int sendingMessageId = eoVar.getSendMessagesHelper().getSendingMessageId(eoVar.T5);
        if (sendingMessageId != 0) {
            this.c.E(sendingMessageId, 0, 0, 0, true, true);
        }
    }

    @Override // org.telegram.ui.Components.qg
    public final void W() {
        eo eoVar = this.c;
        ok okVar = eoVar.Y;
        boolean z10 = okVar.y3;
        org.telegram.ui.Components.fg fgVar = okVar.U0;
        boolean z11 = false;
        boolean z12 = fgVar != null && fgVar.getCurrentPage() == 0;
        le.b bVar = eoVar.xc;
        if (z10 && !z12) {
            z11 = true;
        }
        bVar.a(z11, true);
    }

    @Override // org.telegram.ui.Components.qg
    public final void Z(boolean z10) {
        this.c.Vb(false, z10);
    }

    @Override // org.telegram.ui.Components.qg
    public final void a1(int i10) {
        int i11 = i10 == 0 ? 8 : 0;
        eo eoVar = this.c;
        if (eoVar.c3.getVisibility() != i11) {
            eoVar.c3.setVisibility(i11);
        }
    }

    @Override // org.telegram.ui.Components.qg
    public final int b1() {
        return this.c.X0.getHeight();
    }

    @Override // org.telegram.ui.Components.qg
    public final void b2() {
        org.telegram.ui.Components.zy0 zy0Var = this.c.d1;
        if (zy0Var != null) {
            zy0Var.e();
        }
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ TL_stories.StoryItem d1() {
        return null;
    }

    @Override // org.telegram.ui.Components.qg
    public final void d2(int i10) {
        int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + AndroidUtilities.dp(72.0f);
        eo eoVar = this.c;
        if (i10 < currentActionBarHeight) {
            eoVar.Z4 = false;
            if (eoVar.d1.getVisibility() == 0) {
                eoVar.d1.setVisibility(4);
            }
        } else {
            eoVar.Z4 = true;
            if (eoVar.d1.getVisibility() == 4 && !eoVar.isInPreviewMode()) {
                eoVar.d1.setVisibility(0);
            }
        }
        eoVar.a5 = true ^ eoVar.Y.t0();
        int i11 = i10 + (eoVar.Y.t0() ? 65536 : 0);
        if (this.a != i11) {
            eoVar.b0 = 0;
        }
        this.a = i11;
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ boolean e1(long j3) {
        return false;
    }

    @Override // org.telegram.ui.Components.qg
    public final void g2() {
        vm vmVar;
        int indexOfChild;
        eo eoVar = this.c;
        if (eoVar.getParentActivity() != null) {
            if ((eoVar.e == null && eoVar.a8 == null) || eoVar.fragmentView == null) {
                return;
            }
            org.telegram.ui.Components.s40 s40Var = eoVar.f2;
            if ((s40Var == null || s40Var.getVisibility() != 0) && (indexOfChild = (vmVar = eoVar.X0).indexOfChild(eoVar.S)) != -1) {
                try {
                    eoVar.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception e) {
                    FileLog.e(e);
                }
                if (eoVar.f2 == null) {
                    org.telegram.ui.Components.s40 s40Var2 = new org.telegram.ui.Components.s40(9, eoVar.getParentActivity(), eoVar.ea, false);
                    eoVar.f2 = s40Var2;
                    s40Var2.setVisibility(8);
                    vmVar.addView(eoVar.f2, indexOfChild + 1, w7.a6.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                }
                TLRPC.UserFull userFull = eoVar.a8;
                if (userFull != null && userFull.voice_messages_forbidden) {
                    eoVar.f2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(eoVar.Y.c1 ? R.string.VideoMessagesRestrictedByPrivacy : R.string.VoiceMessagesRestrictedByPrivacy, eoVar.f.first_name)));
                } else if (ChatObject.canSendVoice(eoVar.e) || ChatObject.canSendRoundVideo(eoVar.e)) {
                    if (ChatObject.isActionBannedByDefault(eoVar.e, 20)) {
                        eoVar.f2.setText(LocaleController.getString(R.string.GlobalAttachVoiceRestricted));
                    } else if (ChatObject.isActionBannedByDefault(eoVar.e, 21)) {
                        eoVar.f2.setText(LocaleController.getString(R.string.GlobalAttachRoundRestricted));
                    } else if (ChatObject.isActionBannedByDefault(eoVar.e, 7)) {
                        eoVar.f2.setText(LocaleController.getString(R.string.GlobalAttachMediaRestricted));
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = eoVar.e.banned_rights;
                        if (tL_chatBannedRights == null) {
                            return;
                        }
                        if (AndroidUtilities.isBannedForever(tL_chatBannedRights)) {
                            eoVar.f2.setText(LocaleController.getString(R.string.AttachMediaRestrictedForever));
                        } else {
                            eoVar.f2.setText(LocaleController.formatString("AttachMediaRestricted", R.string.AttachMediaRestricted, LocaleController.formatDateForBan(eoVar.e.banned_rights.until_date)));
                        }
                    }
                } else {
                    if (eoVar.K6()) {
                        return;
                    }
                    if (eoVar.Y.c1) {
                        eoVar.f2.setText(ChatObject.getRestrictedErrorText(eoVar.e, 21));
                    } else {
                        eoVar.f2.setText(ChatObject.getRestrictedErrorText(eoVar.e, 20));
                    }
                }
                View sendButton = eoVar.Y.getSendButton();
                View audioVideoButtonContainer = eoVar.Y.getAudioVideoButtonContainer();
                if (sendButton.getAlpha() < audioVideoButtonContainer.getAlpha()) {
                    sendButton = audioVideoButtonContainer;
                }
                eoVar.f2.f(sendButton, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.qg
    public final void h() {
        this.c.vc();
    }

    @Override // org.telegram.ui.Components.qg
    public final boolean h1() {
        il ilVar = this.c.b3;
        return (ilVar == null || ilVar.e0) ? false : true;
    }

    @Override // org.telegram.ui.Components.qg
    public final void h2(boolean z10) {
        eo eoVar = this.c;
        View view = eoVar.w2;
        if (view != null) {
            view.setVisibility(8);
        }
        eoVar.b5 = !z10;
    }

    @Override // org.telegram.ui.Components.qg
    public final void i2(int i10, int i11, int i12, long j3, long j10, boolean z10) {
        eo eoVar = this.c;
        if (eoVar.b3 == null && CameraView.isCameraAllowed() && eoVar.getParentActivity() != null) {
            il ilVar = new il(eoVar, eoVar.getParentActivity(), eoVar, eoVar.ea);
            eoVar.b3 = ilVar;
            ilVar.setClipToPadding(false);
            il ilVar2 = eoVar.b3;
            zg.a aVar = eoVar.J;
            lj ljVar = eoVar.w;
            LinearLayout linearLayout = ilVar2.R0;
            bh.d c10 = aVar.c(linearLayout, ljVar, false);
            c10.o(AndroidUtilities.dp(6.0f));
            c10.p(AndroidUtilities.dp(21.0f));
            linearLayout.setBackground(c10);
            int indexOfChild = eoVar.X0.indexOfChild(eoVar.S);
            if (indexOfChild < 0) {
                indexOfChild = eoVar.X0.getChildCount();
            }
            eoVar.X0.addView(eoVar.b3, Math.min(indexOfChild + 1, eoVar.X0.getChildCount()), w7.a6.e(-1, -1, 51));
        }
        il ilVar3 = eoVar.b3;
        if (ilVar3 != null) {
            if (i10 == 0) {
                ilVar3.l(false);
                eoVar.x0.B0();
                eoVar.A0.T();
            } else if (i10 == 1 || i10 == 3 || i10 == 4) {
                ilVar3.k(i10, i11, i12, j3, j10, z10);
            } else if (i10 == 2 || i10 == 5) {
                ilVar3.d(i10 == 2);
            }
        }
    }

    @Override // org.telegram.ui.Components.qg
    public final void k() {
        org.telegram.ui.Components.zy0 zy0Var = this.c.d1;
        if (zy0Var != null) {
            zy0Var.f();
        }
    }

    @Override // org.telegram.ui.Components.qg
    public final void k1(CharSequence charSequence, boolean z10, boolean z11) {
        CharSequence charSequence2;
        org.telegram.ui.Components.s40 s40Var;
        TLRPC.ChatFull chatFull;
        MediaController mediaController = MediaController.getInstance();
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        boolean z12 = false;
        eo eoVar = this.c;
        mediaController.setInputFieldHasText(!isEmpty || eoVar.Y.r0());
        hk hkVar = eoVar.I1;
        if (hkVar == null || hkVar.getAdapter() == null) {
            charSequence2 = charSequence;
        } else {
            charSequence2 = charSequence;
            eoVar.I1.getAdapter().U(charSequence2, eoVar.Y.getCursorPosition(), eoVar.u6, false, false);
        }
        i9.s sVar = eoVar.J5;
        if (sVar != null) {
            AndroidUtilities.cancelRunOnUIThread(sVar);
            eoVar.J5 = null;
        }
        TLRPC.Chat chat = eoVar.e;
        if (chat == null || ChatObject.canSendEmbed(chat)) {
            ok okVar = eoVar.Y;
            if (okVar.X2 && (!okVar.r0() || !eoVar.Y.Z1)) {
                if (z10) {
                    eoVar.Ya(charSequence2, true);
                } else {
                    eoVar.M6(charSequence2);
                    i9.s sVar2 = new i9.s(this, charSequence2, false, 21);
                    eoVar.J5 = sVar2;
                    AndroidUtilities.runOnUIThread(sVar2, AndroidUtilities.WEB_URL == null ? 3000L : 1000L);
                }
            }
        }
        zk zkVar = eoVar.xa;
        if (zkVar != null) {
            ArrayList arrayList = zkVar.F;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((hz) arrayList.get(i10)).n = true;
            }
        }
        yg.l0 l0Var = yg.l0.B;
        if (l0Var != null) {
            l0Var.l = true;
        }
        yg.l0 l0Var2 = yg.l0.C;
        if (l0Var2 != null) {
            l0Var2.l = true;
        }
        if (z11) {
            return;
        }
        kj kjVar = eoVar.g2;
        if ((kjVar != null && kjVar.getVisibility() == 0) || ((s40Var = eoVar.i2) != null && s40Var.getVisibility() == 0)) {
            kj kjVar2 = eoVar.g2;
            if (kjVar2 != null) {
                kjVar2.b(true);
            }
            org.telegram.ui.Components.s40 s40Var2 = eoVar.i2;
            if (s40Var2 != null) {
                s40Var2.b(true);
                return;
            }
            return;
        }
        sf sfVar = eoVar.Na;
        if (UserObject.isUserSelf(eoVar.f) || ((chatFull = eoVar.Z7) != null && chatFull.slowmode_next_send_date > 0 && eoVar.R3 == 0)) {
            z12 = true;
        }
        if (eoVar.j2 || eoVar.h2 || z12 || SharedConfig.scheduledHintShows >= 3 || eoVar.Y.r0()) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(sfVar);
        AndroidUtilities.runOnUIThread(sfVar, 4000L);
    }

    @Override // org.telegram.ui.Components.qg
    public final boolean l() {
        return this.c.K6();
    }

    @Override // org.telegram.ui.Components.qg
    public final void m0() {
        org.telegram.ui.Components.zy0 zy0Var = this.c.d1;
        if (zy0Var != null) {
            zy0Var.f();
        }
    }

    @Override // org.telegram.ui.Components.qg
    public final void m1() {
        il ilVar = this.c.b3;
        if (ilVar != null) {
            ilVar.q();
        }
    }

    @Override // org.telegram.ui.Components.qg
    public final void m2() {
        eo eoVar = this.c;
        kj kjVar = eoVar.g2;
        if (kjVar != null) {
            kjVar.b(true);
        }
        org.telegram.ui.Components.s40 s40Var = eoVar.i2;
        if (s40Var != null) {
            s40Var.b(true);
        }
    }

    @Override // org.telegram.ui.Components.qg
    public final boolean n1() {
        eo eoVar = this.c;
        TLRPC.User user = eoVar.f;
        return (user == null || UserObject.isUserSelf(user) || eoVar.f.bot || eoVar.h != null || eoVar.R3 != 0) ? false : true;
    }

    @Override // org.telegram.ui.Components.qg
    public final tn p0() {
        return this.c.l5;
    }

    @Override // org.telegram.ui.Components.qg
    public final void p1() {
        int i10;
        eo eoVar = this.c;
        Activity parentActivity = eoVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.p2) eoVar).currentAccount;
        long j3 = eoVar.T5;
        MessageSuggestionParams messageSuggestionParams = eoVar.g5;
        if (messageSuggestionParams == null) {
            messageSuggestionParams = MessageSuggestionParams.empty();
        }
        new xh.e0(parentActivity, i10, j3, messageSuggestionParams, eoVar, eoVar.getResourceProvider(), 0, new df(eoVar, 3)).show();
    }

    @Override // org.telegram.ui.Components.qg
    public final void q1() {
        this.c.H6();
    }

    @Override // org.telegram.ui.Components.qg
    public final void r1() {
        int i10;
        int i11;
        eo eoVar = this.c;
        eoVar.W6();
        ok okVar = eoVar.Y;
        boolean z10 = okVar.y3;
        org.telegram.ui.Components.fg fgVar = okVar.U0;
        eoVar.xc.a(z10 && !(fgVar != null && fgVar.getCurrentPage() == 0), true);
        if (z10) {
            Activity parentActivity = eoVar.getParentActivity();
            i11 = ((org.telegram.ui.ActionBar.p2) eoVar).classGuid;
            AndroidUtilities.setAdjustResizeToNothing(parentActivity, i11);
            org.telegram.ui.Components.pc pcVar = org.telegram.ui.Components.pc.w;
            if (pcVar != null && pcVar.l) {
                pcVar.b();
            }
        } else {
            Activity parentActivity2 = eoVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.p2) eoVar).classGuid;
            AndroidUtilities.requestAdjustResize(parentActivity2, i10);
        }
        hk hkVar = eoVar.I1;
        float f7 = 0.0f;
        if (hkVar != null) {
            hkVar.animate().alpha((z10 || eoVar.isInPreviewMode()) ? 0.0f : 1.0f).setInterpolator(org.telegram.ui.Components.wr.f).start();
        }
        org.telegram.ui.Components.zy0 zy0Var = eoVar.d1;
        if (zy0Var != null) {
            zy0Var.setVisibility(0);
            ViewPropertyAnimator animate = eoVar.d1.animate();
            if (!z10 && !eoVar.isInPreviewMode()) {
                f7 = 1.0f;
            }
            animate.alpha(f7).setInterpolator(org.telegram.ui.Components.wr.f).withEndAction(new ai.j(19, this, z10)).start();
        }
    }

    @Override // org.telegram.ui.Components.qg
    public final void s1(View view, CharSequence charSequence, boolean z10) {
        eo eoVar = this.c;
        eoVar.Sb(view, charSequence, z10);
        org.telegram.ui.ActionBar.w0 w0Var = eoVar.h0;
        if (w0Var == null || w0Var.getVisibility() == 0) {
            return;
        }
        eoVar.h0.setVisibility(0);
        org.telegram.ui.ActionBar.y yVar = eoVar.e0;
        if (yVar != null) {
            yVar.f(8);
        }
        is isVar = eoVar.d0;
        if (isVar != null) {
            isVar.b(false);
        }
    }

    @Override // org.telegram.ui.Components.qg
    public final void t0() {
        org.telegram.ui.ActionBar.l lVar;
        eo eoVar = this.c;
        lVar = ((org.telegram.ui.ActionBar.p2) eoVar).actionBar;
        if (lVar.n0) {
            return;
        }
        org.telegram.ui.ActionBar.y yVar = eoVar.i0;
        if (yVar != null && !this.b) {
            yVar.f(8);
        }
        if (TextUtils.isEmpty(eoVar.Y.getSlowModeTimer())) {
            org.telegram.ui.ActionBar.w0 w0Var = eoVar.h0;
            if (w0Var != null) {
                w0Var.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar2 = eoVar.e0;
            if (yVar2 != null) {
                yVar2.f(0);
            }
            is isVar = eoVar.d0;
            if (isVar != null) {
                isVar.b(true);
            }
        }
    }

    @Override // org.telegram.ui.Components.qg
    public final int u() {
        return this.c.X0.R();
    }

    @Override // org.telegram.ui.Components.qg
    public final void u1(CharSequence charSequence) {
        this.c.Ya(charSequence, true);
    }

    @Override // org.telegram.ui.Components.qg
    public final void u2() {
        org.telegram.ui.ActionBar.l lVar;
        eo eoVar = this.c;
        lVar = ((org.telegram.ui.ActionBar.p2) eoVar).actionBar;
        if (lVar.n0) {
            return;
        }
        org.telegram.ui.ActionBar.w0 w0Var = eoVar.h0;
        if (w0Var != null) {
            w0Var.setVisibility(0);
        }
        org.telegram.ui.ActionBar.y yVar = eoVar.i0;
        if (yVar != null && !this.b) {
            yVar.f(8);
        }
        org.telegram.ui.ActionBar.y yVar2 = eoVar.e0;
        if (yVar2 != null) {
            yVar2.f(8);
        }
        is isVar = eoVar.d0;
        if (isVar != null) {
            isVar.b(false);
        }
    }

    @Override // org.telegram.ui.Components.qg
    public final boolean v1() {
        MessagePreviewParams.Messages messages;
        MessagePreviewParams messagePreviewParams = this.c.f5;
        return (messagePreviewParams == null || (messages = messagePreviewParams.forwardMessages) == null || messages.messages.isEmpty()) ? false : true;
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ TLRPC.Peer w() {
        return null;
    }

    @Override // org.telegram.ui.Components.qg
    public final void x() {
        boolean z10;
        eo eoVar = this.c;
        if (eoVar.y0 != null) {
            eoVar.b0 = eoVar.Y.getBackgroundTop();
        }
        hk hkVar = eoVar.I1;
        if (hkVar != null) {
            hkVar.getAdapter().f0 = true;
        }
        if (eoVar.p5 != null) {
            AndroidUtilities.runOnUIThread(new fj(this, 6), 30L);
        }
        if (eoVar.Y.t0()) {
            eoVar.Y.e1();
            z10 = true;
        } else {
            z10 = false;
        }
        eoVar.Y.V0(true, true, z10);
        if (eoVar.o5 != 0) {
            eoVar.getConnectionsManager().cancelRequest(eoVar.o5, true);
            eoVar.o5 = 0;
        }
        eoVar.yc(0, true);
        eoVar.hc(false);
        eoVar.Wc(false);
    }

    @Override // org.telegram.ui.Components.qg
    public final void y(float f7) {
        eo eoVar = this.c;
        if (f7 != 0.0f) {
            eoVar.D4 = true;
        }
        eoVar.o9();
        eoVar.r9();
        eoVar.Mc(false, false);
        eoVar.X0.invalidate();
        org.telegram.ui.Components.pc pcVar = org.telegram.ui.Components.pc.w;
        if (pcVar == null || eoVar.Zb == null) {
            return;
        }
        pcVar.l();
    }

    @Override // org.telegram.ui.Components.qg
    public final void y1() {
        int i10;
        eo eoVar = this.c;
        i10 = ((org.telegram.ui.ActionBar.p2) eoVar).currentAccount;
        BotForumHelper.getInstance(i10).stopStreaming(eoVar.T5, (int) eoVar.d());
        eoVar.c7(true);
    }

    @Override // org.telegram.ui.Components.qg
    public final void y2() {
        eo eoVar = this.c;
        gg.m mVar = eoVar.J1;
        if (mVar != null) {
            mVar.I1(null, 0);
        }
        eoVar.X9();
    }
}
