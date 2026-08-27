package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class yk extends org.telegram.ui.Components.gb0 {
    public final /* synthetic */ rn D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yk(rn rnVar, Context context, rn rnVar2, jg.a aVar, MessagePreviewParams messagePreviewParams, TLRPC.User user, TLRPC.Chat chat, int i10, org.telegram.ui.Components.cb0 cb0Var, int i11, boolean z10) {
        super(context, rnVar2, aVar, messagePreviewParams, user, chat, i10, cb0Var, i11, z10);
        this.D = rnVar;
    }

    @Override // org.telegram.ui.Components.gb0
    public final void b() {
        MessageObject messageObject;
        hn hnVar;
        rn rnVar = this.D;
        hn hnVar2 = rnVar.h5;
        if (hnVar2 == null || (messageObject = hnVar2.a) == null || !((hnVar = rnVar.b5.quote) == null || hnVar.a == null || messageObject.getId() == rnVar.b5.quote.a.getId())) {
            rnVar.h5 = rnVar.b5.quote;
        }
    }

    @Override // org.telegram.ui.Components.gb0
    public final void c(boolean z10) {
        int i10;
        boolean z11;
        MessagePreviewParams.Messages messages;
        a(false);
        rn rnVar = this.D;
        MessagePreviewParams messagePreviewParams = rnVar.b5;
        if (messagePreviewParams != null) {
            if (!z10) {
                rnVar.i5 = true;
            }
            MessagePreviewParams.Messages messages2 = messagePreviewParams.forwardMessages;
            if (messages2 != null) {
                int size = messages2.messages.size();
                i10 = 0;
                z11 = false;
                for (int i11 = 0; i11 < size; i11++) {
                    MessageObject messageObject = rnVar.b5.forwardMessages.messages.get(i11);
                    if (messageObject.isTodo()) {
                        i10 = 3;
                    } else if (messageObject.isPoll()) {
                        if (i10 != 2) {
                            i10 = messageObject.isPublicPoll() ? 2 : 1;
                        }
                    } else if (messageObject.isInvoice()) {
                        z11 = true;
                    }
                    rnVar.S5[0].put(messageObject.getId(), messageObject);
                }
            } else {
                i10 = 0;
                z11 = false;
            }
            Bundle e9 = org.telegram.messenger.y1.e(3, "onlySelect", "dialogsType", true);
            e9.putBoolean("quote", !z10);
            boolean z12 = (z10 || (messages = rnVar.b5.replyMessage) == null || messages.messages.isEmpty() || rnVar.b5.quote != null) ? false : true;
            e9.putBoolean("reply_to", z12);
            if (z12) {
                long peerDialogId = DialogObject.getPeerDialogId(rnVar.b5.replyMessage.messages.get(0).getFromPeer());
                if (peerDialogId != 0 && peerDialogId != rnVar.a() && peerDialogId != rnVar.getUserConfig().getClientUserId() && peerDialogId > 0) {
                    e9.putLong("reply_to_author", peerDialogId);
                }
            }
            e9.putInt("hasPoll", i10);
            e9.putBoolean("hasInvoice", z11);
            MessagePreviewParams.Messages messages3 = rnVar.b5.forwardMessages;
            e9.putInt("messagesCount", messages3 != null ? messages3.messages.size() : 0);
            e9.putBoolean("canSelectTopics", true);
            gy gyVar = new gy(e9);
            gyVar.y2 = rnVar;
            rnVar.presentFragment(gyVar);
        }
    }
}
