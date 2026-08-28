package x6;

import java.util.Arrays;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class y0 extends c1 {
    public final long a;

    public y0(long j10) {
        this.a = j10;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        c1 c1Var = (c1) obj;
        if (zza() != c1Var.zza()) {
            return zza() - c1Var.zza();
        }
        long abs = Math.abs(this.a);
        long abs2 = Math.abs(((y0) c1Var).a);
        if (abs < abs2) {
            return -1;
        }
        return abs > abs2 ? 1 : 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && y0.class == obj.getClass() && this.a == ((y0) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(zza()), Long.valueOf(this.a)});
    }

    public final String toString() {
        return Long.toString(this.a);
    }

    @Override // x6.c1
    public final int zza() {
        return c1.c(this.a >= 0 ? (byte) 0 : (byte) 32);
    }
}
