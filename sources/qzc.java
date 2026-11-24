// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class qzc implements uzc {
    public static final Object c = new Object();
    public volatile rzc a;
    public volatile Object b;

    /* JADX WARN: Multi-variable type inference failed */
    public static qzc b(rzc rzcVar) {
        if (rzcVar instanceof qzc) {
            return (qzc) rzcVar;
        }
        qzc qzcVar = new qzc();
        qzcVar.b = c;
        qzcVar.a = rzcVar;
        return qzcVar;
    }

    @Override // vzc
    public final Object a() {
        Object obj;
        Object obj2 = this.b;
        Object obj3 = c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            obj = this.b;
            if (obj == obj3) {
                obj = this.a.a();
                Object obj4 = this.b;
                if (obj4 != obj3 && obj4 != obj) {
                    throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                }
                this.b = obj;
                this.a = null;
            }
        }
        return obj;
    }
}
