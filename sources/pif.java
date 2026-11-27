// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
