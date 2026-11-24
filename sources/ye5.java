// default package

import j$.util.Objects;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ye5 {
    public final long a;
    public final int b;

    public ye5(TLRPC.Message message) {
        long B0 = k47.B0(message);
        int i = message.id;
        this.a = B0;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ye5.class == obj.getClass()) {
            ye5 ye5Var = (ye5) obj;
            if (this.a == ye5Var.a && this.b == ye5Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Integer.valueOf(this.b));
    }
}
