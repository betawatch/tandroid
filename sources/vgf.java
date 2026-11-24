// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class vgf implements Cloneable {
    public final wgf a;
    public wgf b;

    public vgf(wgf wgfVar) {
        this.a = wgfVar;
        if (wgfVar.g()) {
            u36.j("Default instance must be immutable.");
            throw null;
        }
        this.b = (wgf) wgfVar.h(4, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0029, code lost:
    
        if (r2 != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final wgf a() {
        wgf b = b();
        byte byteValue = ((Byte) b.h(1, null)).byteValue();
        if (byteValue != 1) {
            if (byteValue != 0) {
                boolean g = rif.c.a(b.getClass()).g(b);
                b.h(2, true == g ? b : null);
            }
            throw new rq2("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        }
        return b;
    }

    public final wgf b() {
        boolean g = this.b.g();
        wgf wgfVar = this.b;
        if (!g) {
            return wgfVar;
        }
        wgfVar.getClass();
        rif.c.a(wgfVar.getClass()).a(wgfVar);
        wgfVar.d();
        return this.b;
    }

    public final void c() {
        if (this.b.g()) {
            return;
        }
        wgf wgfVar = (wgf) this.a.h(4, null);
        rif.c.a(wgfVar.getClass()).c(wgfVar, this.b);
        this.b = wgfVar;
    }

    public final Object clone() {
        vgf vgfVar = (vgf) this.a.h(5, null);
        vgfVar.b = b();
        return vgfVar;
    }
}
