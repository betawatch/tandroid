package x7;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class m5 {
    public static final long a(long j10) {
        long j11 = (j10 << 1) + 1;
        int i3 = vd.a.d;
        int i10 = vd.b.a;
        return j11;
    }

    public static final long b(long j10) {
        long j11 = j10 << 1;
        int i3 = vd.a.d;
        int i10 = vd.b.a;
        return j11;
    }

    public static final long c(int i3, vd.c unit) {
        kotlin.jvm.internal.j.e(unit, "unit");
        return unit.compareTo(vd.c.d) <= 0 ? b(n5.a(i3, unit, vd.c.b)) : d(i3, unit);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
    
        if (r5 > 4611686018427387903L) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long d(long j10, vd.c unit) {
        kotlin.jvm.internal.j.e(unit, "unit");
        vd.c cVar = vd.c.b;
        long a10 = n5.a(4611686018426999999L, cVar, unit);
        if ((-a10) <= j10 && j10 <= a10) {
            return b(n5.a(j10, unit, cVar));
        }
        vd.c targetUnit = vd.c.c;
        kotlin.jvm.internal.j.e(targetUnit, "targetUnit");
        long convert = targetUnit.a.convert(j10, unit.a);
        long j11 = convert >= -4611686018427387903L ? 4611686018427387903L : -4611686018427387903L;
        convert = j11;
        return a(convert);
    }
}
