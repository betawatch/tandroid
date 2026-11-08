package pa;

import java.util.Map;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements na.d {
    public final /* synthetic */ int a;

    @Override // na.a
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                throw new na.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                na.e eVar = (na.e) obj2;
                eVar.a(qa.e.g, entry.getKey());
                eVar.a(qa.e.h, entry.getValue());
                return;
            default:
                throw new na.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
