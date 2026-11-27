// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
