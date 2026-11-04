package x8;

import java.util.Arrays;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class o implements com.google.android.gms.common.api.b {
    public final int a;

    public o(a7.l lVar) {
        this.a = lVar.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o) || !p6.m.k(Integer.valueOf(this.a), Integer.valueOf(((o) obj).a)) || !p6.m.k(1, 1) || !p6.m.k(null, null)) {
            return false;
        }
        Boolean bool = Boolean.TRUE;
        return p6.m.k(bool, bool);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), 1, null, Boolean.TRUE});
    }
}
