package y8;

import java.util.Arrays;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class o implements com.google.android.gms.common.api.b {
    public final int a;

    public o(b7.l lVar) {
        this.a = lVar.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o) || !q6.m.k(Integer.valueOf(this.a), Integer.valueOf(((o) obj).a)) || !q6.m.k(1, 1) || !q6.m.k(null, null)) {
            return false;
        }
        Boolean bool = Boolean.TRUE;
        return q6.m.k(bool, bool);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), 1, null, Boolean.TRUE});
    }
}
