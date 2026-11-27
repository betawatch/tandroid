// default package

import sun.misc.Unsafe;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
