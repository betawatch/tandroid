package v8;

import java.util.Arrays;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
