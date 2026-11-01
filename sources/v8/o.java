package v8;

import java.util.Arrays;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class o implements com.google.android.gms.common.api.b {
    public final int a;

    public o(ae.j jVar) {
        this.a = jVar.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o) || !n6.l.k(Integer.valueOf(this.a), Integer.valueOf(((o) obj).a)) || !n6.l.k(1, 1) || !n6.l.k(null, null)) {
            return false;
        }
        Boolean bool = Boolean.TRUE;
        return n6.l.k(bool, bool);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), 1, null, Boolean.TRUE});
    }
}
