package p8;

import i7.wa;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public abstract class k {
    public transient c a;
    public transient i7.m b;
    public transient wa c;

    public abstract wa a();

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
