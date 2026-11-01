package rh;

import j$.util.Objects;
import org.telegram.messenger.kj;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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

    public static x5 b(kj kjVar) {
        if (kjVar == null) {
            return null;
        }
        TLRPC.Message message = kjVar.k;
        return (message == null || !(message.isThreadMessage || kjVar.k3()) || kjVar.k.fwd_from == null) ? new x5(kj.B0(kjVar.k), kjVar.f1()) : new x5(kjVar.Z0(), kjVar.k.fwd_from.saved_from_msg_id);
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
