package v8;

import java.util.Arrays;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes.dex */
public final class o implements com.google.android.gms.common.api.b {
    public final int a;

    public o(com.google.android.gms.internal.cast.a aVar) {
        this.a = aVar.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o) || !n6.l.l(Integer.valueOf(this.a), Integer.valueOf(((o) obj).a)) || !n6.l.l(1, 1) || !n6.l.l(null, null)) {
            return false;
        }
        Boolean bool = Boolean.TRUE;
        return n6.l.l(bool, bool);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), 1, null, Boolean.TRUE});
    }
}
