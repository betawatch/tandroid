package yh;

import j$.util.Objects;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class o5 {
    public final long a;
    public final int b;

    public o5(long j3, int i10) {
        this.a = j3;
        this.b = i10;
    }

    public static o5 a(int i10, long j3) {
        return new o5(j3, i10);
    }

    public static o5 b(MessageObject messageObject) {
        if (messageObject == null) {
            return null;
        }
        TLRPC.Message message = messageObject.messageOwner;
        return (message == null || !(message.isThreadMessage || messageObject.isForwardedChannelPost()) || messageObject.messageOwner.fwd_from == null) ? new o5(messageObject.getDialogId(), messageObject.getId()) : new o5(messageObject.getFromChatId(), messageObject.messageOwner.fwd_from.saved_from_msg_id);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o5) {
            o5 o5Var = (o5) obj;
            if (o5Var.a == this.a && o5Var.b == this.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Integer.valueOf(this.b));
    }
}
