// default package

import java.util.Arrays;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class uee extends sfe {
    public final long a;

    public uee(long j) {
        this.a = j;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        sfe sfeVar = (sfe) obj;
        if (zza() != sfeVar.zza()) {
            return zza() - sfeVar.zza();
        }
        long abs = Math.abs(this.a);
        long abs2 = Math.abs(((uee) sfeVar).a);
        if (abs < abs2) {
            return -1;
        }
        return abs > abs2 ? 1 : 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && uee.class == obj.getClass() && this.a == ((uee) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(zza()), Long.valueOf(this.a)});
    }

    public final String toString() {
        return Long.toString(this.a);
    }

    @Override // sfe
    public final int zza() {
        return sfe.c(this.a >= 0 ? (byte) 0 : (byte) 32);
    }
}
