package rh;

import j$.util.Objects;
import org.telegram.messenger.jj;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class x5 {
    public final long a;
    public final int b;

    public x5(long j10, int i10) {
        this.a = j10;
        this.b = i10;
    }

    public static x5 a(int i10, long j10) {
        return new x5(j10, i10);
    }

    public static x5 b(jj jjVar) {
        if (jjVar == null) {
            return null;
        }
        TLRPC.Message message = jjVar.k;
        return (message == null || !(message.isThreadMessage || jjVar.k3()) || jjVar.k.fwd_from == null) ? new x5(jj.B0(jjVar.k), jjVar.f1()) : new x5(jjVar.Z0(), jjVar.k.fwd_from.saved_from_msg_id);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof x5) {
            x5 x5Var = (x5) obj;
            if (x5Var.a == this.a && x5Var.b == this.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Integer.valueOf(this.b));
    }
}
