package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class zi implements org.telegram.ui.Components.il0 {
    public final /* synthetic */ zn a;

    public zi(zn znVar) {
        this.a = znVar;
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean Z0(View view) {
        String doubleTapReaction;
        TLRPC.TL_availableReaction tL_availableReaction;
        MessageObject messageObject;
        org.telegram.ui.ActionBar.k kVar;
        TLRPC.ChatFull chatFull;
        zn znVar = this.a;
        if (!znVar.z9() && ((tL_availableReaction = znVar.getMediaDataController().getReactionsMap().get((doubleTapReaction = znVar.getMediaDataController().getDoubleTapReaction()))) != null || (doubleTapReaction != null && doubleTapReaction.startsWith("animated_")))) {
            boolean z4 = znVar.Q5 >= 0;
            if (!z4 && (chatFull = znVar.W7) != null) {
                if (tL_availableReaction != null) {
                    doubleTapReaction = tL_availableReaction.reaction;
                }
                z4 = ChatObject.reactionIsAvailable(chatFull, doubleTapReaction);
            }
            if (z4) {
                if (view instanceof org.telegram.ui.Cells.s1) {
                    messageObject = ((org.telegram.ui.Cells.s1) view).getPrimaryMessageObject();
                } else if (view instanceof org.telegram.ui.Cells.v0) {
                    messageObject = ((org.telegram.ui.Cells.v0) view).getMessageObject();
                }
                if (messageObject != null && !messageObject.isDateObject && !messageObject.isSending() && messageObject.canSetReaction() && !messageObject.isEditing()) {
                    kVar = ((org.telegram.ui.ActionBar.p2) znVar).actionBar;
                    if (!kVar.s() && !znVar.v() && !znVar.c() && !messageObject.isSponsored()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.il0
    public final void c(float f10, float f11, int i10, View view) {
        boolean z4;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.Cells.s1 s1Var;
        MessageObject messageObject;
        zn znVar = this.a;
        z4 = ((org.telegram.ui.ActionBar.p2) znVar).inPreviewMode;
        if (z4) {
            return;
        }
        znVar.A4 = true;
        boolean z10 = view instanceof org.telegram.ui.Cells.v0;
        boolean z11 = false;
        if (z10) {
            org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) view;
            if (v0Var.getMessageObject().isDateObject) {
                if (znVar.La) {
                    return;
                }
                Bundle bundle = new Bundle();
                int i11 = v0Var.getMessageObject().messageOwner.date;
                bundle.putLong("dialog_id", znVar.Q5);
                bundle.putLong("topic_id", znVar.d());
                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 0);
                l8 l8Var = new l8(0, i11, bundle);
                l8Var.K = znVar;
                znVar.presentFragment(l8Var);
                return;
            }
        }
        if (z10) {
            org.telegram.ui.Cells.v0 v0Var2 = (org.telegram.ui.Cells.v0) view;
            if (v0Var2.getMessageObject() != null && (v0Var2.getMessageObject().messageOwner.action instanceof TLRPC.TL_messageActionBoostApply)) {
                znVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(znVar.Q5));
                return;
            }
        }
        if (z10) {
            org.telegram.ui.Cells.v0 v0Var3 = (org.telegram.ui.Cells.v0) view;
            if (v0Var3.getMessageObject() != null && (v0Var3.getMessageObject().messageOwner.action instanceof TLRPC.TL_messageActionSetSameChatWallPaper)) {
                AndroidUtilities.runOnUIThread(new ah.b(this, v0Var3.getMessageObject().getReplyMsgId(), 16), 16L);
                return;
            }
        }
        kVar = ((org.telegram.ui.ActionBar.p2) znVar).actionBar;
        if (kVar.s() || znVar.A9()) {
            if (view instanceof org.telegram.ui.Cells.s1) {
                org.telegram.ui.Cells.s1 s1Var2 = (org.telegram.ui.Cells.s1) view;
                if (znVar.Z8.A(s1Var2.getMessageObject())) {
                    return;
                } else {
                    z11 = !s1Var2.i3(f10);
                }
            }
            zn.b2(znVar, view, z11, f10, f11);
            return;
        }
        if (!(view instanceof org.telegram.ui.Cells.s1) || (messageObject = (s1Var = (org.telegram.ui.Cells.s1) view).getMessageObject()) == null || messageObject.type != 27) {
            znVar.I7(view, true, false, f10, f11, true, false, false);
            return;
        }
        messageObject.toggleChannelRecommendations();
        messageObject.forceUpdate = true;
        s1Var.t2();
        view.requestLayout();
        if (i10 >= 0) {
            znVar.x0.m(i10);
        }
    }

    @Override // org.telegram.ui.Components.il0
    public final void n0(View view, float f10, float f11) {
        MessageObject messageObject;
        boolean z4;
        TLRPC.ChatFull chatFull;
        TLRPC.ChatFull chatFull2;
        zn znVar = this.a;
        if (znVar.getParentActivity() == null || znVar.v() || znVar.c() || znVar.isInPreviewMode() || znVar.z9()) {
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
        TLRPC.Chat chat = znVar.e;
        if (chat == null || ChatObject.isChannelAndNotMegaGroup(chat) || ChatObject.canUserDoAction(znVar.e, 26)) {
            mg.m0.b(false);
            String doubleTapReaction = znVar.getMediaDataController().getDoubleTapReaction();
            if (doubleTapReaction.startsWith("animated_")) {
                z4 = znVar.Q5 >= 0;
                if (!z4 && (chatFull2 = znVar.W7) != null) {
                    z4 = ChatObject.reactionIsAvailable(chatFull2, doubleTapReaction);
                }
                if (z4) {
                    znVar.ab(view, messageObject2, null, null, f10, f11, mg.q0.b(doubleTapReaction), true, false, false, false);
                    return;
                }
                return;
            }
            TLRPC.TL_availableReaction tL_availableReaction = znVar.getMediaDataController().getReactionsMap().get(doubleTapReaction);
            if (tL_availableReaction == null || messageObject2.isSponsored()) {
                return;
            }
            z4 = znVar.Q5 >= 0;
            if (!z4 && (chatFull = znVar.W7) != null) {
                z4 = ChatObject.reactionIsAvailable(chatFull, tL_availableReaction.reaction);
            }
            if (z4) {
                znVar.ab(view, messageObject2, null, null, f10, f11, mg.q0.c(tL_availableReaction), true, false, false, false);
            }
        }
    }
}
