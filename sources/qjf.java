// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public abstract class qjf {
    public static o3f a;

    public static synchronized ijf a(wif wifVar) {
        ijf ijfVar;
        synchronized (qjf.class) {
            o3f o3fVar = a;
            if (o3fVar == null) {
                o3fVar = new o3f((byte) 4);
                a = o3fVar;
            }
            ijfVar = (ijf) o3fVar.c(wifVar);
        }
        return ijfVar;
    }

    public static synchronized ijf b() {
        ijf a2;
        synchronized (qjf.class) {
            a2 = a(new wif());
        }
        return a2;
    }
}
