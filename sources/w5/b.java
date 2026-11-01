package w5;

import java.util.Arrays;
import n6.l;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class b implements com.google.android.gms.common.api.b {
    public static final b c;
    public final boolean a;
    public final String b;

    static {
        u9.b bVar = new u9.b(3);
        bVar.b = Boolean.FALSE;
        c = new b(bVar);
    }

    public b(u9.b bVar) {
        this.a = ((Boolean) bVar.b).booleanValue();
        this.b = (String) bVar.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.k(null, null) && this.a == bVar.a && l.k(this.b, bVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.a), this.b});
    }
}
