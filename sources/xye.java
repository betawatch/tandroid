// default package

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class xye extends l13 {
    public final /* synthetic */ byte b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xye(byte b) {
        super((byte) 4);
        this.b = b;
    }

    @Override // l13
    public final Object a(Object obj) {
        switch (this.b) {
            case 0:
                hwe hweVar = (hwe) obj;
                ae7 c = ae7.c();
                return new sxe(c.b(), (sfa) c.a(sfa.class), new zwe(ae7.c().b(), hweVar), hweVar.a);
            case 1:
                ae7 c2 = ae7.c();
                return new f1f(c2.b(), (sfa) c2.a(sfa.class), new w0f(ae7.c().b(), (j0f) obj));
            case 2:
                ae7 c3 = ae7.c();
                return new z3f(c3.b(), (sfa) c3.a(sfa.class), new n3f(ae7.c().b(), (g3f) obj));
            case 3:
                ae7 c4 = ae7.c();
                Context b = ae7.c().b();
                ArrayList arrayList = new ArrayList();
                ((kcf) obj).getClass();
                r8d r8dVar = new r8d();
                i51 i51Var = i51.e;
                i1c.b(b);
                i1c.a().c(i51Var);
                i51.d.contains(new s24("json"));
                arrayList.add(r8dVar);
                return new hdf(c4.b(), (sfa) c4.a(sfa.class));
            default:
                ae7 c5 = ae7.c();
                return new sef(c5.b(), (sfa) c5.a(sfa.class), new nef(ae7.c().b(), (gef) obj));
        }
    }
}
