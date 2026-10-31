package w7;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class q7 {
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
    
        if (r8 > 4611686018427387903L) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long a(int i10, sd.c unit) {
        kotlin.jvm.internal.i.e(unit, "unit");
        if (unit.compareTo(sd.c.d) <= 0) {
            long a2 = r7.a(i10, unit, sd.c.b) << 1;
            int i11 = sd.a.d;
            int i12 = sd.b.a;
            return a2;
        }
        long j10 = i10;
        sd.c cVar = sd.c.b;
        long a10 = r7.a(4611686018426999999L, cVar, unit);
        if ((-a10) <= j10 && j10 <= a10) {
            long a11 = r7.a(j10, unit, cVar) << 1;
            int i13 = sd.a.d;
            int i14 = sd.b.a;
            return a11;
        }
        sd.c targetUnit = sd.c.c;
        kotlin.jvm.internal.i.e(targetUnit, "targetUnit");
        long convert = targetUnit.a.convert(j10, unit.a);
        long j11 = convert >= -4611686018427387903L ? 4611686018427387903L : -4611686018427387903L;
        convert = j11;
        long j12 = (convert << 1) + 1;
        int i15 = sd.a.d;
        int i16 = sd.b.a;
        return j12;
    }
}
