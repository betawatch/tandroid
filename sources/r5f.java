// default package

import sun.misc.Unsafe;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public abstract class r5f {
    public static /* synthetic */ boolean a(Unsafe unsafe, rod rodVar, long j, Object obj, Object obj2) {
        while (!unsafe.compareAndSwapObject(rodVar, j, obj, obj2)) {
            if (unsafe.getObject(rodVar, j) != obj && unsafe.getObject(rodVar, j) != obj) {
                return false;
            }
        }
        return true;
    }
}
