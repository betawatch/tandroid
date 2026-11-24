// default package

import java.util.Arrays;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class vge extends the {
    public final long a;

    public vge(long j) {
        this.a = j;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        the theVar = (the) obj;
        if (zza() != theVar.zza()) {
            return zza() - theVar.zza();
        }
        long abs = Math.abs(this.a);
        long abs2 = Math.abs(((vge) theVar).a);
        if (abs < abs2) {
            return -1;
        }
        return abs > abs2 ? 1 : 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && vge.class == obj.getClass() && this.a == ((vge) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(zza()), Long.valueOf(this.a)});
    }

    public final String toString() {
        return Long.toString(this.a);
    }

    @Override // the
    public final int zza() {
        return the.c(this.a >= 0 ? (byte) 0 : (byte) 32);
    }
}
