package pa;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class e extends u {
    public final /* synthetic */ int a;
    public final /* synthetic */ u b;

    public /* synthetic */ e(u uVar, int i10) {
        this.a = i10;
        this.b = uVar;
    }

    @Override // pa.u
    public final Object read(xa.a aVar) {
        switch (this.a) {
            case 0:
                return new AtomicLong(((Number) this.b.read(aVar)).longValue());
            case 1:
                ArrayList arrayList = new ArrayList();
                aVar.a();
                while (aVar.k()) {
                    arrayList.add(Long.valueOf(((Number) this.b.read(aVar)).longValue()));
                }
                aVar.e();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i10 = 0; i10 < size; i10++) {
                    atomicLongArray.set(i10, ((Long) arrayList.get(i10)).longValue());
                }
                return atomicLongArray;
            default:
                if (aVar.x() != 9) {
                    return this.b.read(aVar);
                }
                aVar.t();
                return null;
        }
    }

    @Override // pa.u
    public final void write(xa.b bVar, Object obj) {
        switch (this.a) {
            case 0:
                this.b.write(bVar, Long.valueOf(((AtomicLong) obj).get()));
                break;
            case 1:
                AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
                bVar.b();
                int length = atomicLongArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    this.b.write(bVar, Long.valueOf(atomicLongArray.get(i10)));
                }
                bVar.e();
                break;
            default:
                if (obj == null) {
                    bVar.i();
                    break;
                } else {
                    this.b.write(bVar, obj);
                    break;
                }
        }
    }
}
