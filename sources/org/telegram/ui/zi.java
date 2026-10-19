package org.telegram.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class zi implements org.telegram.ui.Components.xl0 {
    public final /* synthetic */ qn a;

    public zi(qn qnVar) {
        this.a = qnVar;
    }

    @Override // org.telegram.ui.Components.xl0
    public final boolean P0(View view) {
        String doubleTapReaction;
        TLRPC.TL_availableReaction tL_availableReaction;
        MessageObject messageObject;
        org.telegram.ui.ActionBar.k kVar;
        TLRPC.ChatFull chatFull;
        qn qnVar = this.a;
        if (!qnVar.E9() && ((tL_availableReaction = qnVar.getMediaDataController().getReactionsMap().get((doubleTapReaction = qnVar.getMediaDataController().getDoubleTapReaction()))) != null || (doubleTapReaction != null && doubleTapReaction.startsWith("animated_")))) {
            boolean z10 = qnVar.T5 >= 0;
            if (!z10 && (chatFull = qnVar.Z7) != null) {
                if (tL_availableReaction != null) {
                    doubleTapReaction = tL_availableReaction.reaction;
                }
                z10 = ChatObject.reactionIsAvailable(chatFull, doubleTapReaction);
            }
            if (z10) {
                if (view instanceof org.telegram.ui.Cells.u1) {
                    messageObject = ((org.telegram.ui.Cells.u1) view).getPrimaryMessageObject();
                } else if (view instanceof org.telegram.ui.Cells.w0) {
                    messageObject = ((org.telegram.ui.Cells.w0) view).getMessageObject();
                }
                if (messageObject != null && !messageObject.isDateObject && !messageObject.isSending() && messageObject.canSetReaction() && !messageObject.isEditing()) {
                    kVar = ((org.telegram.ui.ActionBar.n2) qnVar).actionBar;
                    if (!kVar.t() && !qnVar.x() && !qnVar.c() && !messageObject.isSponsored()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.xl0
    public final void a0(View view, float f7, float f10) {
        MessageObject messageObject;
        boolean z10;
        TLRPC.ChatFull chatFull;
        TLRPC.ChatFull chatFull2;
        qn qnVar = this.a;
        if (qnVar.getParentActivity() == null || qnVar.x() || qnVar.c() || qnVar.isInPreviewMode() || qnVar.E9()) {
            return;
        }
        if (view instanceof org.telegram.ui.Cells.u1) {
            messageObject = ((org.telegram.ui.Cells.u1) view).getPrimaryMessageObject();
        } else {
            if (!(view instanceof org.telegram.ui.Cells.w0)) {
                return;
            }
            messageObject = ((org.telegram.ui.Cells.w0) view).getMessageObject();
            if (messageObject.isDateObject) {
                return;
            }
        }
        MessageObject messageObject2 = messageObject;
        if (messageObject2.isSecret() || !messageObject2.canSetReaction() || messageObject2.isExpiredStory() || messageObject2.type == 27) {
            return;
        }
        TLRPC.Chat chat = qnVar.e;
        if (chat == null || ChatObject.isChannelAndNotMegaGroup(chat) || ChatObject.canUserDoAction(qnVar.e, 26)) {
            ah.d1.b(false);
            String doubleTapReaction = qnVar.getMediaDataController().getDoubleTapReaction();
            if (doubleTapReaction.startsWith("animated_")) {
                z10 = qnVar.T5 >= 0;
                if (!z10 && (chatFull2 = qnVar.Z7) != null) {
                    z10 = ChatObject.reactionIsAvailable(chatFull2, doubleTapReaction);
                }
                if (z10) {
                    qnVar.eb(view, messageObject2, null, null, f7, f10, ah.i1.b(doubleTapReaction), true, false, false, false);
                    return;
                }
                return;
            }
            TLRPC.TL_availableReaction tL_availableReaction = qnVar.getMediaDataController().getReactionsMap().get(doubleTapReaction);
            if (tL_availableReaction == null || messageObject2.isSponsored()) {
                return;
            }
            z10 = qnVar.T5 >= 0;
            if (!z10 && (chatFull = qnVar.Z7) != null) {
                z10 = ChatObject.reactionIsAvailable(chatFull, tL_availableReaction.reaction);
            }
            if (z10) {
                qnVar.eb(view, messageObject2, null, null, f7, f10, ah.i1.c(tL_availableReaction), true, false, false, false);
            }
        }
    }

    @Override // org.telegram.ui.Components.xl0
    public final void d(float f7, float f10, int i10, View view) {
        boolean z10;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.Cells.u1 u1Var;
        MessageObject messageObject;
        MessageObject messageObject2;
        int i11;
        org.telegram.ui.ActionBar.d6 d6Var;
        qn qnVar = this.a;
        z10 = ((org.telegram.ui.ActionBar.n2) qnVar).inPreviewMode;
        if (z10) {
            return;
        }
        qnVar.D4 = true;
        boolean z11 = view instanceof org.telegram.ui.Cells.w0;
        if (z11 && (messageObject2 = ((org.telegram.ui.Cells.w0) view).getMessageObject()) != null) {
            TLRPC.MessageAction messageAction = messageObject2.messageOwner.action;
            if (messageAction instanceof TLRPC.TL_messageActionWalletTonConnectRequest) {
                TLRPC.TL_messageActionWalletTonConnectRequest tL_messageActionWalletTonConnectRequest = (TLRPC.TL_messageActionWalletTonConnectRequest) messageAction;
                if (tL_messageActionWalletTonConnectRequest.expires <= qnVar.getConnectionsManager().getCurrentTime() || messageObject2.isOut() || messageObject2.getDialogId() != 777000) {
                    return;
                }
                Activity parentActivity = qnVar.getParentActivity();
                i11 = ((org.telegram.ui.ActionBar.n2) qnVar).currentAccount;
                long j10 = tL_messageActionWalletTonConnectRequest.session_id;
                int id2 = messageObject2.getId();
                d6Var = ((org.telegram.ui.ActionBar.n2) qnVar).resourceProvider;
                org.telegram.ui.Wallet.f2.o(parentActivity, i11, j10, id2, d6Var, null);
                return;
            }
        }
        boolean z12 = false;
        if (z11) {
            org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) view;
            if (w0Var.getMessageObject().isDateObject) {
                if (qnVar.Pa) {
                    return;
                }
                Bundle bundle = new Bundle();
                int i12 = w0Var.getMessageObject().messageOwner.date;
                bundle.putLong("dialog_id", qnVar.T5);
                bundle.putLong("topic_id", qnVar.d());
                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 0);
                k8 k8Var = new k8(0, i12, bundle);
                k8Var.N = qnVar;
                qnVar.presentFragment(k8Var);
                return;
            }
        }
        if (z11) {
            org.telegram.ui.Cells.w0 w0Var2 = (org.telegram.ui.Cells.w0) view;
            if (w0Var2.getMessageObject() != null && (w0Var2.getMessageObject().messageOwner.action instanceof TLRPC.TL_messageActionBoostApply)) {
                qnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(qnVar.T5));
                return;
            }
        }
        if (z11) {
            org.telegram.ui.Cells.w0 w0Var3 = (org.telegram.ui.Cells.w0) view;
            if (w0Var3.getMessageObject() != null && (w0Var3.getMessageObject().messageOwner.action instanceof TLRPC.TL_messageActionSetSameChatWallPaper)) {
                AndroidUtilities.runOnUIThread(new ah.g(this, w0Var3.getMessageObject().getReplyMsgId(), 24), 16L);
                return;
            }
        }
        kVar = ((org.telegram.ui.ActionBar.n2) qnVar).actionBar;
        if (kVar.t() || qnVar.F9()) {
            if (view instanceof org.telegram.ui.Cells.u1) {
                org.telegram.ui.Cells.u1 u1Var2 = (org.telegram.ui.Cells.u1) view;
                if (qnVar.c9.z(u1Var2.getMessageObject())) {
                    return;
                } else {
                    z12 = !u1Var2.i3(f7);
                }
            }
            qn.c2(qnVar, view, z12, f7, f10);
            return;
        }
        if (!(view instanceof org.telegram.ui.Cells.u1) || (messageObject = (u1Var = (org.telegram.ui.Cells.u1) view).getMessageObject()) == null || messageObject.type != 27) {
            qnVar.L7(view, true, false, f7, f10, true, false, false);
            return;
        }
        messageObject.toggleChannelRecommendations();
        messageObject.forceUpdate = true;
        u1Var.t2();
        view.requestLayout();
        if (i10 >= 0) {
            qnVar.A0.m(i10);
        }
    }
}
