package td;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class a0 extends cd.a implements cd.e {
    public static final z b = new z(cd.d.a, y.b);

    public a0() {
        super(cd.d.a);
    }

    public abstract void c(cd.h hVar, Runnable runnable);

    public boolean d() {
        return !(this instanceof g2);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [kotlin.jvm.internal.j, ld.l] */
    @Override // cd.a, cd.h
    public final cd.f get(cd.g key) {
        cd.f fVar;
        kotlin.jvm.internal.i.e(key, "key");
        if (!(key instanceof z)) {
            if (cd.d.a == key) {
                return this;
            }
            return null;
        }
        z zVar = (z) key;
        cd.g gVar = this.a;
        if ((gVar == zVar || zVar.b == gVar) && (fVar = (cd.f) zVar.a.invoke(this)) != null) {
            return fVar;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
    
        if (((cd.f) r3.a.invoke(r2)) != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        return cd.i.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0022, code lost:
    
        if (cd.d.a == r3) goto L15;
     */
    /* JADX WARN: Type inference failed for: r3v3, types: [kotlin.jvm.internal.j, ld.l] */
    @Override // cd.a, cd.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final cd.h minusKey(cd.g key) {
        kotlin.jvm.internal.i.e(key, "key");
        if (key instanceof z) {
            z zVar = (z) key;
            cd.g gVar = this.a;
            if (gVar != zVar && zVar.b != gVar) {
                return this;
            }
        }
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + e0.k(this);
    }
}
