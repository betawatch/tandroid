package pa;

import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class x0 implements ma.v {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ ma.u c;

    public /* synthetic */ x0(Object obj, ma.u uVar, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = uVar;
    }

    @Override // ma.v
    public final ma.u create(ma.g gVar, ta.a aVar) {
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
                if (aVar.equals((ta.a) this.b)) {
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
