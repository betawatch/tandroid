// default package

import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public abstract class qo {
    public static final int a = -100;
    public static final ss b = new ss(0);
    public static final Object c = new Object();

    public static void b(cp cpVar) {
        synchronized (c) {
            ss ssVar = b;
            ssVar.getClass();
            ns nsVar = new ns(ssVar);
            while (nsVar.hasNext()) {
                qo qoVar = (qo) ((WeakReference) nsVar.next()).get();
                if (qoVar == cpVar || qoVar == null) {
                    nsVar.remove();
                }
            }
        }
    }

    public abstract void a();

    public abstract boolean c(int i);
}
