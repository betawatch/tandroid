package sa;

import java.util.BitSet;
import kh.a2;
import vh.v2;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
            int b10 = m1.j.b(x10);
            if (b10 == 5 || b10 == 6) {
                int p10 = aVar.p();
                if (p10 == 0) {
                    z4 = false;
                } else {
                    if (p10 != 1) {
                        StringBuilder m9 = a2.m(p10, "Invalid bitset value ", ", expected 0 or 1; at path ");
                        m9.append(aVar.j());
                        throw new pa.j(m9.toString());
                    }
                    z4 = true;
                }
            } else {
                if (b10 != 7) {
                    throw new pa.j("Invalid bitset value type: " + v2.m(x10) + "; at path " + aVar.h());
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
