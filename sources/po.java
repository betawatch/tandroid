// default package

import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class po {
    public static final int a = -100;
    public static final rs b = new rs(0);
    public static final Object c = new Object();

    public static void b(bp bpVar) {
        synchronized (c) {
            rs rsVar = b;
            rsVar.getClass();
            ms msVar = new ms(rsVar);
            while (msVar.hasNext()) {
                po poVar = (po) ((WeakReference) msVar.next()).get();
                if (poVar == bpVar || poVar == null) {
                    msVar.remove();
                }
            }
        }
    }

    public abstract void a();

    public abstract boolean c(int i);
}
