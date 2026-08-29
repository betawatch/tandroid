package z6;

import java.util.Arrays;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class v0 extends c1 {
    public final boolean a;

    public v0(boolean z10) {
        this.a = z10;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        c1 c1Var = (c1) obj;
        int zza = c1Var.zza();
        int c3 = c1.c((byte) -32);
        if (c3 != zza) {
            return c3 - c1Var.zza();
        }
        return (true != this.a ? 20 : 21) - (true != ((v0) c1Var).a ? 20 : 21);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && v0.class == obj.getClass() && this.a == ((v0) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(c1.c((byte) -32)), Boolean.valueOf(this.a)});
    }

    public final String toString() {
        return Boolean.toString(this.a);
    }

    @Override // z6.c1
    public final int zza() {
        return c1.c((byte) -32);
    }
}
