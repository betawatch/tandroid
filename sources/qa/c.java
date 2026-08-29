package qa;

import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class c extends na.u {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public final Object c;

    public c(na.g gVar, Type type, na.u uVar, pa.m mVar) {
        this.b = new o(gVar, uVar, type);
        this.c = mVar;
    }

    @Override // na.u
    public final Object read(va.a aVar) {
        switch (this.a) {
            case 0:
                if (aVar.x() == 9) {
                    aVar.t();
                    return null;
                }
                Collection collection = (Collection) ((pa.m) this.c).p2();
                aVar.a();
                while (aVar.k()) {
                    collection.add(((na.u) ((o) this.b).c).read(aVar));
                }
                aVar.e();
                return collection;
            default:
                Class cls = (Class) this.b;
                Object read = ((x0) this.c).c.read(aVar);
                if (read == null || cls.isInstance(read)) {
                    return read;
                }
                throw new na.j("Expected a " + cls.getName() + " but was " + read.getClass().getName() + "; at path " + aVar.j());
        }
    }

    @Override // na.u
    public final void write(va.b bVar, Object obj) {
        switch (this.a) {
            case 0:
                Collection collection = (Collection) obj;
                if (collection != null) {
                    bVar.b();
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        ((o) this.b).write(bVar, it.next());
                    }
                    bVar.e();
                    break;
                } else {
                    bVar.i();
                    break;
                }
            default:
                ((x0) this.c).c.write(bVar, obj);
                break;
        }
    }

    public c(x0 x0Var, Class cls) {
        this.c = x0Var;
        this.b = cls;
    }
}
