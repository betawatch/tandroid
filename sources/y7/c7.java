package y7;

import java.util.Arrays;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class c7 {
    public final b7 a;
    public final Integer b;

    public /* synthetic */ c7(m4.c cVar) {
        this.a = (b7) cVar.b;
        this.b = (Integer) cVar.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c7)) {
            return false;
        }
        c7 c7Var = (c7) obj;
        return o6.l.l(this.a, c7Var.a) && o6.l.l(this.b, c7Var.b) && o6.l.l(null, null) && o6.l.l(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, null, null});
    }
}
