package v8;

import java.util.Arrays;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
