package w7;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public abstract class n9 {
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005d, code lost:
    
        if (r8 > 4611686018427387903L) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long a(int i10, zd.c unit) {
        kotlin.jvm.internal.i.e(unit, "unit");
        if (unit.compareTo(zd.c.d) <= 0) {
            long a2 = o9.a(i10, unit, zd.c.b) << 1;
            int i11 = zd.a.d;
            int i12 = zd.b.a;
            return a2;
        }
        long j3 = i10;
        zd.c cVar = zd.c.b;
        long a10 = o9.a(4611686018426999999L, cVar, unit);
        if ((-a10) <= j3 && j3 <= a10) {
            long a11 = o9.a(j3, unit, cVar) << 1;
            int i13 = zd.a.d;
            int i14 = zd.b.a;
            return a11;
        }
        zd.c targetUnit = zd.c.c;
        kotlin.jvm.internal.i.e(targetUnit, "targetUnit");
        long convert = targetUnit.a.convert(j3, unit.a);
        long j10 = convert >= -4611686018427387903L ? 4611686018427387903L : -4611686018427387903L;
        convert = j10;
        long j11 = (convert << 1) + 1;
        int i15 = zd.a.d;
        int i16 = zd.b.a;
        return j11;
    }
}
