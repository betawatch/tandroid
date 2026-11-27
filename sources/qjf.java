// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
