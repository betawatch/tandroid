package y7;

import java.util.Arrays;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
