package w5;

import java.util.Arrays;
import n6.l;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final class b implements com.google.android.gms.common.api.b {
    public static final b c;
    public final boolean a;
    public final String b;

    static {
        o0.a aVar = new o0.a(21, (byte) 0);
        aVar.b = Boolean.FALSE;
        c = new b(aVar);
    }

    public b(o0.a aVar) {
        this.a = ((Boolean) aVar.b).booleanValue();
        this.b = (String) aVar.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.l(null, null) && this.a == bVar.a && l.l(this.b, bVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.a), this.b});
    }
}
