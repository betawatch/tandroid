package sa;

import java.util.BitSet;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public class w0 extends pa.u {
    @Override // pa.u
    public final Object read(xa.a aVar) {
        boolean z4;
        BitSet bitSet = new BitSet();
        aVar.a();
        int x10 = aVar.x();
        int i10 = 0;
        while (x10 != 2) {
            int c3 = m1.j.c(x10);
            if (c3 == 5 || c3 == 6) {
                int p10 = aVar.p();
                if (p10 == 0) {
                    z4 = false;
                } else {
                    if (p10 != 1) {
                        StringBuilder m9 = l.d.m(p10, "Invalid bitset value ", ", expected 0 or 1; at path ");
                        m9.append(aVar.j());
                        throw new pa.j(m9.toString());
                    }
                    z4 = true;
                }
            } else {
                if (c3 != 7) {
                    throw new pa.j("Invalid bitset value type: " + w.c.m(x10) + "; at path " + aVar.h());
                }
                z4 = aVar.n();
            }
            if (z4) {
                bitSet.set(i10);
            }
            i10++;
            x10 = aVar.x();
        }
        aVar.e();
        return bitSet;
    }

    @Override // pa.u
    public final void write(xa.b bVar, Object obj) {
        BitSet bitSet = (BitSet) obj;
        bVar.b();
        int length = bitSet.length();
        for (int i10 = 0; i10 < length; i10++) {
            bVar.o(bitSet.get(i10) ? 1L : 0L);
        }
        bVar.e();
    }
}
