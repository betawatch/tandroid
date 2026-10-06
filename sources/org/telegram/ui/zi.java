package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class zi implements org.telegram.ui.Components.nl0 {
    public final /* synthetic */ yn a;

    public zi(yn ynVar) {
        this.a = ynVar;
    }

    @Override // org.telegram.ui.Components.nl0
    public final void c(float f7, float f10, int i10, View view) {
        boolean z10;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.Cells.u1 u1Var;
        MessageObject messageObject;
        yn ynVar = this.a;
        z10 = ((org.telegram.ui.ActionBar.n2) ynVar).inPreviewMode;
        if (z10) {
            return;
        }
        ynVar.B4 = true;
        boolean z11 = view instanceof org.telegram.ui.Cells.w0;
        boolean z12 = false;
        if (z11) {
            org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) view;
            if (w0Var.getMessageObject().isDateObject) {
                if (ynVar.Ma) {
                    return;
                }
                Bundle bundle = new Bundle();
                int i11 = w0Var.getMessageObject().messageOwner.date;
                bundle.putLong("dialog_id", ynVar.R5);
                bundle.putLong("topic_id", ynVar.d());
                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 0);
                k8 k8Var = new k8(0, i11, bundle);
                k8Var.N = ynVar;
                ynVar.presentFragment(k8Var);
                return;
            }
        }
        if (z11) {
            org.telegram.ui.Cells.w0 w0Var2 = (org.telegram.ui.Cells.w0) view;
            if (w0Var2.getMessageObject() != null && (w0Var2.getMessageObject().messageOwner.action instanceof TLRPC.TL_messageActionBoostApply)) {
                ynVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(ynVar.R5));
                return;
            }
        }
        if (z11) {
            org.telegram.ui.Cells.w0 w0Var3 = (org.telegram.ui.Cells.w0) view;
            if (w0Var3.getMessageObject() != null && (w0Var3.getMessageObject().messageOwner.action instanceof TLRPC.TL_messageActionSetSameChatWallPaper)) {
                AndroidUtilities.runOnUIThread(new ai.o8(this, w0Var3.getMessageObject().getReplyMsgId(), 19), 16L);
                return;
            }
        }
        kVar = ((org.telegram.ui.ActionBar.n2) ynVar).actionBar;
        if (kVar.s() || ynVar.z9()) {
            if (view instanceof org.telegram.ui.Cells.u1) {
                org.telegram.ui.Cells.u1 u1Var2 = (org.telegram.ui.Cells.u1) view;
                if (ynVar.a9.A(u1Var2.getMessageObject())) {
                    return;
                } else {
                    z12 = !u1Var2.i3(f7);
                }
            }
            yn.b2(ynVar, view, z12, f7, f10);
            return;
        }
        if (!(view instanceof org.telegram.ui.Cells.u1) || (messageObject = (u1Var = (org.telegram.ui.Cells.u1) view).getMessageObject()) == null || messageObject.type != 27) {
            ynVar.I7(view, true, false, f7, f10, true, false, false);
            return;
        }
        messageObject.toggleChannelRecommendations();
        messageObject.forceUpdate = true;
        u1Var.t2();
        view.requestLayout();
        if (i10 >= 0) {
            ynVar.y0.m(i10);
        }
    }

    @Override // org.telegram.ui.Components.nl0
    public final boolean f1(View view) {
        String doubleTapReaction;
        TLRPC.TL_availableReaction tL_availableReaction;
        MessageObject messageObject;
        org.telegram.ui.ActionBar.k kVar;
        TLRPC.ChatFull chatFull;
        yn ynVar = this.a;
        if (!ynVar.y9() && ((tL_availableReaction = ynVar.getMediaDataController().getReactionsMap().get((doubleTapReaction = ynVar.getMediaDataController().getDoubleTapReaction()))) != null || (doubleTapReaction != null && doubleTapReaction.startsWith("animated_")))) {
            boolean z10 = ynVar.R5 >= 0;
            if (!z10 && (chatFull = ynVar.X7) != null) {
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
                    kVar = ((org.telegram.ui.ActionBar.n2) ynVar).actionBar;
                    if (!kVar.s() && !ynVar.v() && !ynVar.c() && !messageObject.isSponsored()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.nl0
    public final void s0(View view, float f7, float f10) {
        MessageObject messageObject;
        boolean z10;
        TLRPC.ChatFull chatFull;
        TLRPC.ChatFull chatFull2;
        yn ynVar = this.a;
        if (ynVar.getParentActivity() == null || ynVar.v() || ynVar.c() || ynVar.isInPreviewMode() || ynVar.y9()) {
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
        TLRPC.Chat chat = ynVar.e;
        if (chat == null || ChatObject.isChannelAndNotMegaGroup(chat) || ChatObject.canUserDoAction(ynVar.e, 26)) {
            zg.i0.b(false);
            String doubleTapReaction = ynVar.getMediaDataController().getDoubleTapReaction();
            if (doubleTapReaction.startsWith("animated_")) {
                z10 = ynVar.R5 >= 0;
                if (!z10 && (chatFull2 = ynVar.X7) != null) {
                    z10 = ChatObject.reactionIsAvailable(chatFull2, doubleTapReaction);
                }
                if (z10) {
                    ynVar.Za(view, messageObject2, null, null, f7, f10, zg.m0.b(doubleTapReaction), true, false, false, false);
                    return;
                }
                return;
            }
            TLRPC.TL_availableReaction tL_availableReaction = ynVar.getMediaDataController().getReactionsMap().get(doubleTapReaction);
            if (tL_availableReaction == null || messageObject2.isSponsored()) {
                return;
            }
            z10 = ynVar.R5 >= 0;
            if (!z10 && (chatFull = ynVar.X7) != null) {
                z10 = ChatObject.reactionIsAvailable(chatFull, tL_availableReaction.reaction);
            }
            if (z10) {
                ynVar.Za(view, messageObject2, null, null, f7, f10, zg.m0.c(tL_availableReaction), true, false, false, false);
            }
        }
    }
}
