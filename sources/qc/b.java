package qc;

import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class b implements Comparable {
    public static final b b = new b();
    public final int a = 131348;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        b other = (b) obj;
        j.e(other, "other");
        return this.a - other.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        b bVar = obj instanceof b ? (b) obj : null;
        return bVar != null && this.a == bVar.a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "2.1.20";
    }
}
