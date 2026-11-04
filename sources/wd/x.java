package wd;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class x extends fd.a implements fd.e {
    public static final w b = new w(fd.d.a, new db.o(2));

    public x() {
        super(fd.d.a);
    }

    public abstract void c(fd.h hVar, Runnable runnable);

    public boolean e(fd.h hVar) {
        return !(this instanceof z1);
    }

    public x f(int i3) {
        be.a.a(i3);
        return new be.g(this, i3);
    }

    @Override // fd.a, fd.h
    public final fd.f get(fd.g key) {
        fd.f fVar;
        kotlin.jvm.internal.j.e(key, "key");
        if (!(key instanceof w)) {
            if (fd.d.a == key) {
                return this;
            }
            return null;
        }
        w wVar = (w) key;
        fd.g gVar = this.a;
        if ((gVar == wVar || wVar.b == gVar) && (fVar = (fd.f) wVar.a.invoke(this)) != null) {
            return fVar;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
    
        if (((fd.f) r3.a.invoke(r2)) != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        return fd.i.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0022, code lost:
    
        if (fd.d.a == r3) goto L15;
     */
    @Override // fd.a, fd.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final fd.h minusKey(fd.g key) {
        kotlin.jvm.internal.j.e(key, "key");
        if (key instanceof w) {
            w wVar = (w) key;
            fd.g gVar = this.a;
            if (gVar != wVar && wVar.b != gVar) {
                return this;
            }
        }
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + b0.j(this);
    }
}
