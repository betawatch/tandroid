package yh;

import j$.util.Objects;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final class n5 {
    public final long a;
    public final int b;

    public n5(long j3, int i10) {
        this.a = j3;
        this.b = i10;
    }

    public static n5 a(int i10, long j3) {
        return new n5(j3, i10);
    }

    public static n5 b(MessageObject messageObject) {
        if (messageObject == null) {
            return null;
        }
        TLRPC.Message message = messageObject.messageOwner;
        return (message == null || !(message.isThreadMessage || messageObject.isForwardedChannelPost()) || messageObject.messageOwner.fwd_from == null) ? new n5(messageObject.getDialogId(), messageObject.getId()) : new n5(messageObject.getFromChatId(), messageObject.messageOwner.fwd_from.saved_from_msg_id);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n5) {
            n5 n5Var = (n5) obj;
            if (n5Var.a == this.a && n5Var.b == this.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Integer.valueOf(this.b));
    }
}
