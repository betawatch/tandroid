package pa;

import java.util.BitSet;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public class w0 extends ma.u {
    @Override // ma.u
    public final Object read(ua.a aVar) {
        boolean z10;
        BitSet bitSet = new BitSet();
        aVar.a();
        int x8 = aVar.x();
        int i10 = 0;
        while (x8 != 2) {
            int b10 = m1.j.b(x8);
            if (b10 == 5 || b10 == 6) {
                int p6 = aVar.p();
                if (p6 == 0) {
                    z10 = false;
                } else {
                    if (p6 != 1) {
                        StringBuilder o10 = i0.a.o(p6, "Invalid bitset value ", ", expected 0 or 1; at path ");
                        o10.append(aVar.j());
                        throw new ma.j(o10.toString());
                    }
                    z10 = true;
                }
            } else {
                if (b10 != 7) {
                    throw new ma.j("Invalid bitset value type: " + s3.c.n(x8) + "; at path " + aVar.h());
                }
                z10 = aVar.n();
            }
            if (z10) {
                bitSet.set(i10);
            }
            i10++;
            x8 = aVar.x();
        }
        aVar.e();
        return bitSet;
    }

    @Override // ma.u
    public final void write(ua.b bVar, Object obj) {
        BitSet bitSet = (BitSet) obj;
        bVar.b();
        int length = bitSet.length();
        for (int i10 = 0; i10 < length; i10++) {
            bVar.o(bitSet.get(i10) ? 1L : 0L);
        }
        bVar.e();
    }
}
