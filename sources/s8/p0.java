package s8;

import java.io.Serializable;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class p0 extends h0 implements Serializable {
    public final h0 a;

    public p0(h0 h0Var) {
        this.a = h0Var;
    }

    @Override // s8.h0
    public final h0 a() {
        return this.a;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.a.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p0) {
            return this.a.equals(((p0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return -this.a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(valueOf.length() + 10);
        sb.append(valueOf);
        sb.append(".reverse()");
        return sb.toString();
    }
}
