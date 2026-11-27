// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public abstract class pif {
    public static o3f a;

    public static synchronized xhf a(ahf ahfVar) {
        xhf xhfVar;
        synchronized (pif.class) {
            o3f o3fVar = a;
            if (o3fVar == null) {
                o3fVar = new o3f((byte) 3);
                a = o3fVar;
            }
            xhfVar = (xhf) o3fVar.c(ahfVar);
        }
        return xhfVar;
    }
}
