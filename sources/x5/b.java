package x5;

import java.util.Arrays;
import m4.w1;
import o6.l;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
