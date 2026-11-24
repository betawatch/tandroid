// default package

import sun.misc.Unsafe;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class y0f {
    public static /* synthetic */ boolean a(Unsafe unsafe, akd akdVar, long j, Object obj, Object obj2) {
        while (!unsafe.compareAndSwapObject(akdVar, j, obj, obj2)) {
            if (unsafe.getObject(akdVar, j) != obj && unsafe.getObject(akdVar, j) != obj) {
                return false;
            }
        }
        return true;
    }
}
