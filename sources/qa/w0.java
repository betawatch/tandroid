package qa;

import j7.l1;
import java.util.BitSet;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public class w0 extends na.u {
    @Override // na.u
    public final Object read(va.a aVar) {
        boolean z10;
        BitSet bitSet = new BitSet();
        aVar.a();
        int x4 = aVar.x();
        int i10 = 0;
        while (x4 != 2) {
            int b10 = m1.j.b(x4);
            if (b10 == 5 || b10 == 6) {
                int p10 = aVar.p();
                if (p10 == 0) {
                    z10 = false;
                } else {
                    if (p10 != 1) {
                        StringBuilder o10 = l1.o(p10, "Invalid bitset value ", ", expected 0 or 1; at path ");
                        o10.append(aVar.j());
                        throw new na.j(o10.toString());
                    }
                    z10 = true;
                }
            } else {
                if (b10 != 7) {
                    throw new na.j("Invalid bitset value type: " + u3.c.m(x4) + "; at path " + aVar.h());
                }
                z10 = aVar.n();
            }
            if (z10) {
                bitSet.set(i10);
            }
            i10++;
            x4 = aVar.x();
        }
        aVar.e();
        return bitSet;
    }

    @Override // na.u
    public final void write(va.b bVar, Object obj) {
        BitSet bitSet = (BitSet) obj;
        bVar.b();
        int length = bitSet.length();
        for (int i10 = 0; i10 < length; i10++) {
            bVar.o(bitSet.get(i10) ? 1L : 0L);
        }
        bVar.e();
    }
}
