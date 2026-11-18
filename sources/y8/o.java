package y8;

import java.util.Arrays;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class o implements com.google.android.gms.common.api.b {
    public final int a;

    public o(b7.l lVar) {
        this.a = lVar.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o) || !q6.m.l(Integer.valueOf(this.a), Integer.valueOf(((o) obj).a)) || !q6.m.l(1, 1) || !q6.m.l(null, null)) {
            return false;
        }
        Boolean bool = Boolean.TRUE;
        return q6.m.l(bool, bool);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), 1, null, Boolean.TRUE});
    }
}
