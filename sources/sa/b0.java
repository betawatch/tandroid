package sa;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public class b0 extends pa.u {
    @Override // pa.u
    public final Object read(xa.a aVar) {
        ArrayList arrayList = new ArrayList();
        aVar.a();
        while (aVar.k()) {
            try {
                arrayList.add(Integer.valueOf(aVar.p()));
            } catch (NumberFormatException e) {
                throw new pa.j(e);
            }
        }
        aVar.e();
        int size = arrayList.size();
        AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
        for (int i10 = 0; i10 < size; i10++) {
            atomicIntegerArray.set(i10, ((Integer) arrayList.get(i10)).intValue());
        }
        return atomicIntegerArray;
    }

    @Override // pa.u
    public final void write(xa.b bVar, Object obj) {
        bVar.b();
        int length = ((AtomicIntegerArray) obj).length();
        for (int i10 = 0; i10 < length; i10++) {
            bVar.o(r6.get(i10));
        }
        bVar.e();
    }
}
