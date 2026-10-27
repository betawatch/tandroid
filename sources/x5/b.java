package x5;

import java.util.Arrays;
import m4.w1;
import o6.l;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class b implements com.google.android.gms.common.api.b {
    public static final b c;
    public final boolean a;
    public final String b;

    static {
        w1 w1Var = new w1(26, (byte) 0);
        w1Var.b = Boolean.FALSE;
        c = new b(w1Var);
    }

    public b(w1 w1Var) {
        this.a = ((Boolean) w1Var.b).booleanValue();
        this.b = (String) w1Var.c;
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
