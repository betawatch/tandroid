package zd;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public abstract class x extends id.a implements id.e {
    public static final w b = new w(id.d.a, new gb.p(2));

    public x() {
        super(id.d.a);
    }

    public abstract void c(id.h hVar, Runnable runnable);

    public boolean d(id.h hVar) {
        return !(this instanceof z1);
    }

    public x f(int i7) {
        ee.a.a(i7);
        return new ee.g(this, i7);
    }

    @Override // id.a, id.h
    public final id.f get(id.g key) {
        id.f fVar;
        kotlin.jvm.internal.j.e(key, "key");
        if (!(key instanceof w)) {
            if (id.d.a == key) {
                return this;
            }
            return null;
        }
        w wVar = (w) key;
        id.g gVar = this.a;
        if ((gVar == wVar || wVar.b == gVar) && (fVar = (id.f) wVar.a.invoke(this)) != null) {
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
    @Override // id.a, id.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final id.h minusKey(id.g key) {
        kotlin.jvm.internal.j.e(key, "key");
        if (key instanceof w) {
            w wVar = (w) key;
            id.g gVar = this.a;
            if (gVar != wVar && wVar.b != gVar) {
                return this;
            }
        }
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + b0.j(this);
    }
}
