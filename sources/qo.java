// default package

import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
