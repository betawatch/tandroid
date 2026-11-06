package y8;

import java.util.Arrays;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
