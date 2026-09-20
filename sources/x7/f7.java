package x7;

import java.util.Arrays;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes.dex */
public final class f7 {
    public final e7 a;
    public final Integer b;

    public /* synthetic */ f7(d7 d7Var) {
        this.a = (e7) d7Var.a;
        this.b = (Integer) d7Var.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f7)) {
            return false;
        }
        f7 f7Var = (f7) obj;
        return n6.l.l(this.a, f7Var.a) && n6.l.l(this.b, f7Var.b) && n6.l.l(null, null) && n6.l.l(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, null, null});
    }
}
