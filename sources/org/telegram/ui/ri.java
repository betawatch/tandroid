package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ri implements org.telegram.ui.Components.qk0 {
    public final /* synthetic */ rn a;

    public ri(rn rnVar) {
        this.a = rnVar;
    }

    @Override // org.telegram.ui.Components.qk0
    public final void c(float f10, float f11, int i10, View view) {
        boolean z10;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.Cells.s1 s1Var;
        MessageObject messageObject;
        rn rnVar = this.a;
        z10 = ((org.telegram.ui.ActionBar.n2) rnVar).inPreviewMode;
        if (z10) {
            return;
        }
        rnVar.z4 = true;
        boolean z11 = view instanceof org.telegram.ui.Cells.v0;
        boolean z12 = false;
        if (z11) {
            org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) view;
            if (v0Var.getMessageObject().isDateObject) {
                if (rnVar.Ka) {
                    return;
                }
                Bundle bundle = new Bundle();
                int i11 = v0Var.getMessageObject().messageOwner.date;
                bundle.putLong("dialog_id", rnVar.P5);
                bundle.putLong("topic_id", rnVar.b());
                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 0);
                h8 h8Var = new h8(0, i11, bundle);
                h8Var.J = rnVar;
                rnVar.presentFragment(h8Var);
                return;
            }
        }
        if (z11) {
            org.telegram.ui.Cells.v0 v0Var2 = (org.telegram.ui.Cells.v0) view;
            if (v0Var2.getMessageObject() != null && (v0Var2.getMessageObject().messageOwner.action instanceof TLRPC.TL_messageActionBoostApply)) {
                rnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(rnVar.P5));
                return;
            }
        }
        if (z11) {
            org.telegram.ui.Cells.v0 v0Var3 = (org.telegram.ui.Cells.v0) view;
            if (v0Var3.getMessageObject() != null && (v0Var3.getMessageObject().messageOwner.action instanceof TLRPC.TL_messageActionSetSameChatWallPaper)) {
                AndroidUtilities.runOnUIThread(new cg.w1(this, v0Var3.getMessageObject().getReplyMsgId(), 17), 16L);
                return;
            }
        }
        kVar = ((org.telegram.ui.ActionBar.n2) rnVar).actionBar;
        if (kVar.t() || rnVar.A9()) {
            if (view instanceof org.telegram.ui.Cells.s1) {
                org.telegram.ui.Cells.s1 s1Var2 = (org.telegram.ui.Cells.s1) view;
                if (rnVar.Y8.A(s1Var2.getMessageObject())) {
                    return;
                } else {
                    z12 = !s1Var2.h3(f10);
                }
            }
            rn.b2(rnVar, view, z12, f10, f11);
            return;
        }
        if (!(view instanceof org.telegram.ui.Cells.s1) || (messageObject = (s1Var = (org.telegram.ui.Cells.s1) view).getMessageObject()) == null || messageObject.type != 27) {
            rnVar.I7(view, true, false, f10, f11, true, false, false);
            return;
        }
        messageObject.toggleChannelRecommendations();
        messageObject.forceUpdate = true;
        s1Var.s2();
        view.requestLayout();
        if (i10 >= 0) {
            rnVar.w0.m(i10);
        }
    }

    @Override // org.telegram.ui.Components.qk0
    public final void c0(View view, float f10, float f11) {
        MessageObject messageObject;
        boolean z10;
        TLRPC.ChatFull chatFull;
        TLRPC.ChatFull chatFull2;
        rn rnVar = this.a;
        if (rnVar.getParentActivity() == null || rnVar.x() || rnVar.c() || rnVar.isInPreviewMode() || rnVar.z9()) {
            return;
        }
        if (view instanceof org.telegram.ui.Cells.s1) {
            messageObject = ((org.telegram.ui.Cells.s1) view).getPrimaryMessageObject();
        } else {
            if (!(view instanceof org.telegram.ui.Cells.v0)) {
                return;
            }
            messageObject = ((org.telegram.ui.Cells.v0) view).getMessageObject();
            if (messageObject.isDateObject) {
                return;
            }
        }
        MessageObject messageObject2 = messageObject;
        if (messageObject2.isSecret() || !messageObject2.canSetReaction() || messageObject2.isExpiredStory() || messageObject2.type == 27) {
            return;
        }
        TLRPC.Chat chat = rnVar.e;
        if (chat == null || ChatObject.isChannelAndNotMegaGroup(chat) || ChatObject.canUserDoAction(rnVar.e, 26)) {
            ig.m0.b(false);
            String doubleTapReaction = rnVar.getMediaDataController().getDoubleTapReaction();
            if (doubleTapReaction.startsWith("animated_")) {
                z10 = rnVar.P5 >= 0;
                if (!z10 && (chatFull2 = rnVar.V7) != null) {
                    z10 = ChatObject.reactionIsAvailable(chatFull2, doubleTapReaction);
                }
                if (z10) {
                    rnVar.ab(view, messageObject2, null, null, f10, f11, ig.q0.b(doubleTapReaction), true, false, false, false);
                    return;
                }
                return;
            }
            TLRPC.TL_availableReaction tL_availableReaction = rnVar.getMediaDataController().getReactionsMap().get(doubleTapReaction);
            if (tL_availableReaction == null || messageObject2.isSponsored()) {
                return;
            }
            z10 = rnVar.P5 >= 0;
            if (!z10 && (chatFull = rnVar.V7) != null) {
                z10 = ChatObject.reactionIsAvailable(chatFull, tL_availableReaction.reaction);
            }
            if (z10) {
                rnVar.ab(view, messageObject2, null, null, f10, f11, ig.q0.c(tL_availableReaction), true, false, false, false);
            }
        }
    }

    @Override // org.telegram.ui.Components.qk0
    public final boolean f1(View view) {
        String doubleTapReaction;
        TLRPC.TL_availableReaction tL_availableReaction;
        MessageObject messageObject;
        org.telegram.ui.ActionBar.k kVar;
        TLRPC.ChatFull chatFull;
        rn rnVar = this.a;
        if (!rnVar.z9() && ((tL_availableReaction = rnVar.getMediaDataController().getReactionsMap().get((doubleTapReaction = rnVar.getMediaDataController().getDoubleTapReaction()))) != null || (doubleTapReaction != null && doubleTapReaction.startsWith("animated_")))) {
            boolean z10 = rnVar.P5 >= 0;
            if (!z10 && (chatFull = rnVar.V7) != null) {
                if (tL_availableReaction != null) {
                    doubleTapReaction = tL_availableReaction.reaction;
                }
                z10 = ChatObject.reactionIsAvailable(chatFull, doubleTapReaction);
            }
            if (z10) {
                if (view instanceof org.telegram.ui.Cells.s1) {
                    messageObject = ((org.telegram.ui.Cells.s1) view).getPrimaryMessageObject();
                } else if (view instanceof org.telegram.ui.Cells.v0) {
                    messageObject = ((org.telegram.ui.Cells.v0) view).getMessageObject();
                }
                if (messageObject != null && !messageObject.isDateObject && !messageObject.isSending() && messageObject.canSetReaction() && !messageObject.isEditing()) {
                    kVar = ((org.telegram.ui.ActionBar.n2) rnVar).actionBar;
                    if (!kVar.t() && !rnVar.x() && !rnVar.c() && !messageObject.isSponsored()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
