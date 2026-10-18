package z7;

import java.util.Arrays;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public final class sa {
    public final ra a;
    public final Integer b;

    public /* synthetic */ sa(qa qaVar) {
        this.a = (ra) qaVar.a;
        this.b = (Integer) qaVar.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof sa)) {
            return false;
        }
        sa saVar = (sa) obj;
        return n6.l.l(this.a, saVar.a) && n6.l.l(this.b, saVar.b) && n6.l.l(null, null) && n6.l.l(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, null, null});
    }
}
