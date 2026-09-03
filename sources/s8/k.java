package s8;

import l7.xa;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public abstract class k {
    public transient c a;
    public transient l7.m b;
    public transient xa c;

    public abstract xa a();

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k) {
            return ((e0) this).a().equals(((e0) ((k) obj)).a());
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
