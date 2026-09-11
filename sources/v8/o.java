package v8;

import java.util.Arrays;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
