package z5;

import java.util.Arrays;
import q6.m;
import v6.e;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class b implements com.google.android.gms.common.api.b {
    public static final b c;
    public final boolean a;
    public final String b;

    static {
        e eVar = new e();
        eVar.a = Boolean.FALSE;
        c = new b(eVar);
    }

    public b(e eVar) {
        this.a = ((Boolean) eVar.a).booleanValue();
        this.b = (String) eVar.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return m.k(null, null) && this.a == bVar.a && m.k(this.b, bVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.a), this.b});
    }
}
