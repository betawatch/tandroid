package x7;

import java.util.Arrays;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class i8 {
    public final Float a;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i8) {
            return n6.l.k(null, null) && n6.l.k(this.a, ((i8) obj).a) && n6.l.k(null, null);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, this.a, null});
    }
}
