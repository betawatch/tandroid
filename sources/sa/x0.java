package sa;

import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class x0 implements pa.v {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ pa.u c;

    public /* synthetic */ x0(Object obj, pa.u uVar, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = uVar;
    }

    @Override // pa.v
    public final pa.u create(pa.g gVar, wa.a aVar) {
        switch (this.a) {
            case 0:
                if (aVar.a == ((Class) this.b)) {
                    return this.c;
                }
                return null;
            case 1:
                Class<?> cls = aVar.a;
                if (((Class) this.b).isAssignableFrom(cls)) {
                    return new c(this, cls);
                }
                return null;
            default:
                if (aVar.equals((wa.a) this.b)) {
                    return (FileLog.ByteArrayHexAdapter) this.c;
                }
                return null;
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "Factory[type=" + ((Class) this.b).getName() + ",adapter=" + this.c + "]";
            case 1:
                return "Factory[typeHierarchy=" + ((Class) this.b).getName() + ",adapter=" + this.c + "]";
            default:
                return super.toString();
        }
    }
}
