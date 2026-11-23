package z5;

import java.util.Arrays;
import q6.m;
import tg.y;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class b implements com.google.android.gms.common.api.b {
    public static final b c;
    public final boolean a;
    public final String b;

    static {
        y yVar = new y(9, (byte) 0);
        yVar.b = Boolean.FALSE;
        c = new b(yVar);
    }

    public b(y yVar) {
        this.a = ((Boolean) yVar.b).booleanValue();
        this.b = (String) yVar.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return m.l(null, null) && this.a == bVar.a && m.l(this.b, bVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.a), this.b});
    }
}
