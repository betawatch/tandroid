package q8;

import j7.xa;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class k {
    public transient c a;
    public transient j7.m b;
    public transient xa c;

    public abstract xa a();

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k) {
            return ((h0) this).a().equals(((h0) ((k) obj)).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().b.hashCode();
    }

    public final String toString() {
        return a().b.toString();
    }
}
