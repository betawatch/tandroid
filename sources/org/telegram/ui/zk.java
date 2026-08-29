package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class zk extends org.telegram.ui.Components.rb0 {
    public final /* synthetic */ tn D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zk(tn tnVar, Context context, tn tnVar2, lg.a aVar, MessagePreviewParams messagePreviewParams, TLRPC.User user, TLRPC.Chat chat, int i10, org.telegram.ui.Components.nb0 nb0Var, int i11, boolean z10) {
        super(context, tnVar2, aVar, messagePreviewParams, user, chat, i10, nb0Var, i11, z10);
        this.D = tnVar;
    }

    @Override // org.telegram.ui.Components.rb0
    public final void b() {
        MessageObject messageObject;
        jn jnVar;
        tn tnVar = this.D;
        jn jnVar2 = tnVar.h5;
        if (jnVar2 == null || (messageObject = jnVar2.a) == null || !((jnVar = tnVar.b5.quote) == null || jnVar.a == null || messageObject.getId() == tnVar.b5.quote.a.getId())) {
            tnVar.h5 = tnVar.b5.quote;
        }
    }

    @Override // org.telegram.ui.Components.rb0
    public final void c(boolean z10) {
        int i10;
        boolean z11;
        MessagePreviewParams.Messages messages;
        a(false);
        tn tnVar = this.D;
        MessagePreviewParams messagePreviewParams = tnVar.b5;
        if (messagePreviewParams != null) {
            if (!z10) {
                tnVar.i5 = true;
            }
            MessagePreviewParams.Messages messages2 = messagePreviewParams.forwardMessages;
            if (messages2 != null) {
                int size = messages2.messages.size();
                i10 = 0;
                z11 = false;
                for (int i11 = 0; i11 < size; i11++) {
                    MessageObject messageObject = tnVar.b5.forwardMessages.messages.get(i11);
                    if (messageObject.isTodo()) {
                        i10 = 3;
                    } else if (messageObject.isPoll()) {
                        if (i10 != 2) {
                            i10 = messageObject.isPublicPoll() ? 2 : 1;
                        }
                    } else if (messageObject.isInvoice()) {
                        z11 = true;
                    }
                    tnVar.S5[0].put(messageObject.getId(), messageObject);
                }
            } else {
                i10 = 0;
                z11 = false;
            }
            Bundle e10 = org.telegram.messenger.x3.e(3, "onlySelect", "dialogsType", true);
            e10.putBoolean("quote", !z10);
            boolean z12 = (z10 || (messages = tnVar.b5.replyMessage) == null || messages.messages.isEmpty() || tnVar.b5.quote != null) ? false : true;
            e10.putBoolean("reply_to", z12);
            if (z12) {
                long peerDialogId = DialogObject.getPeerDialogId(tnVar.b5.replyMessage.messages.get(0).getFromPeer());
                if (peerDialogId != 0 && peerDialogId != tnVar.a() && peerDialogId != tnVar.getUserConfig().getClientUserId() && peerDialogId > 0) {
                    e10.putLong("reply_to_author", peerDialogId);
                }
            }
            e10.putInt("hasPoll", i10);
            e10.putBoolean("hasInvoice", z11);
            MessagePreviewParams.Messages messages3 = tnVar.b5.forwardMessages;
            e10.putInt("messagesCount", messages3 != null ? messages3.messages.size() : 0);
            e10.putBoolean("canSelectTopics", true);
            fy fyVar = new fy(e10);
            fyVar.y2 = tnVar;
            tnVar.presentFragment(fyVar);
        }
    }
}
