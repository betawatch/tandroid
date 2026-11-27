// default package

import sun.misc.Unsafe;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public abstract class z8f {
    public static /* synthetic */ boolean a(Unsafe unsafe, lgf lgfVar, long j, Object obj, Object obj2) {
        while (!unsafe.compareAndSwapObject(lgfVar, j, obj, obj2)) {
            if (unsafe.getObject(lgfVar, j) != obj && unsafe.getObject(lgfVar, j) != obj) {
                return false;
            }
        }
        return true;
    }
}
