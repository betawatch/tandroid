package zh;

import j$.util.Objects;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class l5 {
    public final long a;
    public final int b;

    public l5(long j3, int i10) {
        this.a = j3;
        this.b = i10;
    }

    public static l5 a(int i10, long j3) {
        return new l5(j3, i10);
    }

    public static l5 b(MessageObject messageObject) {
        if (messageObject == null) {
            return null;
        }
        TLRPC.Message message = messageObject.messageOwner;
        return (message == null || !(message.isThreadMessage || messageObject.isForwardedChannelPost()) || messageObject.messageOwner.fwd_from == null) ? new l5(messageObject.getDialogId(), messageObject.getId()) : new l5(messageObject.getFromChatId(), messageObject.messageOwner.fwd_from.saved_from_msg_id);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l5) {
            l5 l5Var = (l5) obj;
            if (l5Var.a == this.a && l5Var.b == this.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Integer.valueOf(this.b));
    }
}
