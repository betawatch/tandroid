package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class yi implements org.telegram.ui.Components.ll0 {
    public final /* synthetic */ wn a;

    public yi(wn wnVar) {
        this.a = wnVar;
    }

    @Override // org.telegram.ui.Components.ll0
    public final void c(float f7, float f10, int i10, View view) {
        boolean z10;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.Cells.u1 u1Var;
        MessageObject messageObject;
        wn wnVar = this.a;
        z10 = ((org.telegram.ui.ActionBar.m2) wnVar).inPreviewMode;
        if (z10) {
            return;
        }
        wnVar.D4 = true;
        boolean z11 = view instanceof org.telegram.ui.Cells.w0;
        boolean z12 = false;
        if (z11) {
            org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) view;
            if (w0Var.getMessageObject().isDateObject) {
                if (wnVar.Oa) {
                    return;
                }
                Bundle bundle = new Bundle();
                int i11 = w0Var.getMessageObject().messageOwner.date;
                bundle.putLong("dialog_id", wnVar.T5);
                bundle.putLong("topic_id", wnVar.d());
                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 0);
                h8 h8Var = new h8(0, i11, bundle);
                h8Var.N = wnVar;
                wnVar.presentFragment(h8Var);
                return;
            }
        }
        if (z11) {
            org.telegram.ui.Cells.w0 w0Var2 = (org.telegram.ui.Cells.w0) view;
            if (w0Var2.getMessageObject() != null && (w0Var2.getMessageObject().messageOwner.action instanceof TLRPC.TL_messageActionBoostApply)) {
                wnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(wnVar.T5));
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
        kVar = ((org.telegram.ui.ActionBar.m2) wnVar).actionBar;
        if (kVar.s() || wnVar.A9()) {
            if (view instanceof org.telegram.ui.Cells.u1) {
                org.telegram.ui.Cells.u1 u1Var2 = (org.telegram.ui.Cells.u1) view;
                if (wnVar.c9.A(u1Var2.getMessageObject())) {
                    return;
                } else {
                    z12 = !u1Var2.i3(f7);
                }
            }
            wn.b2(wnVar, view, z12, f7, f10);
            return;
        }
        if (!(view instanceof org.telegram.ui.Cells.u1) || (messageObject = (u1Var = (org.telegram.ui.Cells.u1) view).getMessageObject()) == null || messageObject.type != 27) {
            wnVar.I7(view, true, false, f7, f10, true, false, false);
            return;
        }
        messageObject.toggleChannelRecommendations();
        messageObject.forceUpdate = true;
        u1Var.t2();
        view.requestLayout();
        if (i10 >= 0) {
            wnVar.A0.m(i10);
        }
    }

    @Override // org.telegram.ui.Components.ll0
    public final boolean d1(View view) {
        String doubleTapReaction;
        TLRPC.TL_availableReaction tL_availableReaction;
        MessageObject messageObject;
        org.telegram.ui.ActionBar.k kVar;
        TLRPC.ChatFull chatFull;
        wn wnVar = this.a;
        if (!wnVar.z9() && ((tL_availableReaction = wnVar.getMediaDataController().getReactionsMap().get((doubleTapReaction = wnVar.getMediaDataController().getDoubleTapReaction()))) != null || (doubleTapReaction != null && doubleTapReaction.startsWith("animated_")))) {
            boolean z10 = wnVar.T5 >= 0;
            if (!z10 && (chatFull = wnVar.Z7) != null) {
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
                    kVar = ((org.telegram.ui.ActionBar.m2) wnVar).actionBar;
                    if (!kVar.s() && !wnVar.v() && !wnVar.c() && !messageObject.isSponsored()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.ll0
    public final void r0(View view, float f7, float f10) {
        MessageObject messageObject;
        boolean z10;
        TLRPC.ChatFull chatFull;
        TLRPC.ChatFull chatFull2;
        wn wnVar = this.a;
        if (wnVar.getParentActivity() == null || wnVar.v() || wnVar.c() || wnVar.isInPreviewMode() || wnVar.z9()) {
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
        TLRPC.Chat chat = wnVar.e;
        if (chat == null || ChatObject.isChannelAndNotMegaGroup(chat) || ChatObject.canUserDoAction(wnVar.e, 26)) {
            zg.k0.b(false);
            String doubleTapReaction = wnVar.getMediaDataController().getDoubleTapReaction();
            if (doubleTapReaction.startsWith("animated_")) {
                z10 = wnVar.T5 >= 0;
                if (!z10 && (chatFull2 = wnVar.Z7) != null) {
                    z10 = ChatObject.reactionIsAvailable(chatFull2, doubleTapReaction);
                }
                if (z10) {
                    wnVar.ab(view, messageObject2, null, null, f7, f10, zg.o0.b(doubleTapReaction), true, false, false, false);
                    return;
                }
                return;
            }
            TLRPC.TL_availableReaction tL_availableReaction = wnVar.getMediaDataController().getReactionsMap().get(doubleTapReaction);
            if (tL_availableReaction == null || messageObject2.isSponsored()) {
                return;
            }
            z10 = wnVar.T5 >= 0;
            if (!z10 && (chatFull = wnVar.Z7) != null) {
                z10 = ChatObject.reactionIsAvailable(chatFull, tL_availableReaction.reaction);
            }
            if (z10) {
                wnVar.ab(view, messageObject2, null, null, f7, f10, zg.o0.c(tL_availableReaction), true, false, false, false);
            }
        }
    }
}
