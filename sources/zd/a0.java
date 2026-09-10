package zd;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public abstract class a0 extends id.a implements id.e {
    public static final z b = new z(id.d.a, y.b);

    public a0() {
        super(id.d.a);
    }

    public abstract void c(id.h hVar, Runnable runnable);

    public boolean e() {
        return !(this instanceof f2);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [kotlin.jvm.internal.j, rd.l] */
    @Override // id.a, id.h
    public final id.f get(id.g key) {
        id.f fVar;
        kotlin.jvm.internal.i.e(key, "key");
        if (!(key instanceof z)) {
            if (id.d.a == key) {
                return this;
            }
            return null;
        }
        z zVar = (z) key;
        id.g gVar = this.a;
        if ((gVar == zVar || zVar.b == gVar) && (fVar = (id.f) zVar.a.invoke(this)) != null) {
            return fVar;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
    
        if (((id.f) r3.a.invoke(r2)) != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        return id.i.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0022, code lost:
    
        if (id.d.a == r3) goto L15;
     */
    /* JADX WARN: Type inference failed for: r3v3, types: [kotlin.jvm.internal.j, rd.l] */
    @Override // id.a, id.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final id.h minusKey(id.g key) {
        kotlin.jvm.internal.i.e(key, "key");
        if (key instanceof z) {
            z zVar = (z) key;
            id.g gVar = this.a;
            if (gVar != zVar && zVar.b != gVar) {
                return this;
            }
        }
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + e0.k(this);
    }
}
