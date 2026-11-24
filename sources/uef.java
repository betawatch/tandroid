// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class uef implements Cloneable {
    public final vef a;
    public vef b;

    public uef(vef vefVar) {
        this.a = vefVar;
        if (vefVar.g()) {
            w26.j("Default instance must be immutable.");
            throw null;
        }
        this.b = (vef) vefVar.h(4, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0029, code lost:
    
        if (r2 != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final vef a() {
        vef b = b();
        byte byteValue = ((Byte) b.h(1, null)).byteValue();
        if (byteValue != 1) {
            if (byteValue != 0) {
                boolean g = qgf.c.a(b.getClass()).g(b);
                b.h(2, true == g ? b : null);
            }
            throw new gp2("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        }
        return b;
    }

    public final vef b() {
        boolean g = this.b.g();
        vef vefVar = this.b;
        if (!g) {
            return vefVar;
        }
        vefVar.getClass();
        qgf.c.a(vefVar.getClass()).a(vefVar);
        vefVar.d();
        return this.b;
    }

    public final void c() {
        if (this.b.g()) {
            return;
        }
        vef vefVar = (vef) this.a.h(4, null);
        qgf.c.a(vefVar.getClass()).d(vefVar, this.b);
        this.b = vefVar;
    }

    public final Object clone() {
        uef uefVar = (uef) this.a.h(5, null);
        uefVar.b = b();
        return uefVar;
    }
}
