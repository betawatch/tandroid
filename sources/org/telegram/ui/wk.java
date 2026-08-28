package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class wk extends org.telegram.ui.Components.cb0 {
    public final /* synthetic */ qn D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wk(qn qnVar, Context context, qn qnVar2, ig.a aVar, MessagePreviewParams messagePreviewParams, TLRPC.User user, TLRPC.Chat chat, int i9, org.telegram.ui.Components.ya0 ya0Var, int i10, boolean z10) {
        super(context, qnVar2, aVar, messagePreviewParams, user, chat, i9, ya0Var, i10, z10);
        this.D = qnVar;
    }

    @Override // org.telegram.ui.Components.cb0
    public final void b() {
        MessageObject messageObject;
        gn gnVar;
        qn qnVar = this.D;
        gn gnVar2 = qnVar.h5;
        if (gnVar2 == null || (messageObject = gnVar2.a) == null || !((gnVar = qnVar.b5.quote) == null || gnVar.a == null || messageObject.getId() == qnVar.b5.quote.a.getId())) {
            qnVar.h5 = qnVar.b5.quote;
        }
    }

    @Override // org.telegram.ui.Components.cb0
    public final void c(boolean z10) {
        int i9;
        boolean z11;
        MessagePreviewParams.Messages messages;
        a(false);
        qn qnVar = this.D;
        MessagePreviewParams messagePreviewParams = qnVar.b5;
        if (messagePreviewParams != null) {
            if (!z10) {
                qnVar.i5 = true;
            }
            MessagePreviewParams.Messages messages2 = messagePreviewParams.forwardMessages;
            if (messages2 != null) {
                int size = messages2.messages.size();
                i9 = 0;
                z11 = false;
                for (int i10 = 0; i10 < size; i10++) {
                    MessageObject messageObject = qnVar.b5.forwardMessages.messages.get(i10);
                    if (messageObject.isTodo()) {
                        i9 = 3;
                    } else if (messageObject.isPoll()) {
                        if (i9 != 2) {
                            i9 = messageObject.isPublicPoll() ? 2 : 1;
                        }
                    } else if (messageObject.isInvoice()) {
                        z11 = true;
                    }
                    qnVar.S5[0].put(messageObject.getId(), messageObject);
                }
            } else {
                i9 = 0;
                z11 = false;
            }
            Bundle e10 = org.telegram.messenger.l0.e(3, "onlySelect", "dialogsType", true);
            e10.putBoolean("quote", !z10);
            boolean z12 = (z10 || (messages = qnVar.b5.replyMessage) == null || messages.messages.isEmpty() || qnVar.b5.quote != null) ? false : true;
            e10.putBoolean("reply_to", z12);
            if (z12) {
                long peerDialogId = DialogObject.getPeerDialogId(qnVar.b5.replyMessage.messages.get(0).getFromPeer());
                if (peerDialogId != 0 && peerDialogId != qnVar.a() && peerDialogId != qnVar.getUserConfig().getClientUserId() && peerDialogId > 0) {
                    e10.putLong("reply_to_author", peerDialogId);
                }
            }
            e10.putInt("hasPoll", i9);
            e10.putBoolean("hasInvoice", z11);
            MessagePreviewParams.Messages messages3 = qnVar.b5.forwardMessages;
            e10.putInt("messagesCount", messages3 != null ? messages3.messages.size() : 0);
            e10.putBoolean("canSelectTopics", true);
            dy dyVar = new dy(e10);
            dyVar.y2 = qnVar;
            qnVar.presentFragment(dyVar);
        }
    }
}
