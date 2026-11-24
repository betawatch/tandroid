// default package

import j$.util.Objects;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class zsa {
    public final long a;
    public final int b;

    public zsa(long j, int i) {
        this.a = j;
        this.b = i;
    }

    public static zsa a(int i, long j) {
        return new zsa(j, i);
    }

    public static zsa b(k27 k27Var) {
        if (k27Var == null) {
            return null;
        }
        TLRPC.Message message = k27Var.k;
        return (message == null || !(message.isThreadMessage || k27Var.k3()) || k27Var.k.fwd_from == null) ? new zsa(k27.B0(k27Var.k), k27Var.e1()) : new zsa(k27Var.Z0(), k27Var.k.fwd_from.saved_from_msg_id);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zsa) {
            zsa zsaVar = (zsa) obj;
            if (zsaVar.a == this.a && zsaVar.b == this.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Integer.valueOf(this.b));
    }
}
