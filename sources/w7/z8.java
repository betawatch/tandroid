package w7;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public abstract class z8 {
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005d, code lost:
    
        if (r8 > 4611686018427387903L) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long a(int i10, yd.c unit) {
        kotlin.jvm.internal.i.e(unit, "unit");
        if (unit.compareTo(yd.c.d) <= 0) {
            long a2 = a9.a(i10, unit, yd.c.b) << 1;
            int i11 = yd.a.d;
            int i12 = yd.b.a;
            return a2;
        }
        long j3 = i10;
        yd.c cVar = yd.c.b;
        long a10 = a9.a(4611686018426999999L, cVar, unit);
        if ((-a10) <= j3 && j3 <= a10) {
            long a11 = a9.a(j3, unit, cVar) << 1;
            int i13 = yd.a.d;
            int i14 = yd.b.a;
            return a11;
        }
        yd.c targetUnit = yd.c.c;
        kotlin.jvm.internal.i.e(targetUnit, "targetUnit");
        long convert = targetUnit.a.convert(j3, unit.a);
        long j10 = convert >= -4611686018427387903L ? 4611686018427387903L : -4611686018427387903L;
        convert = j10;
        long j11 = (convert << 1) + 1;
        int i15 = yd.a.d;
        int i16 = yd.b.a;
        return j11;
    }
}
