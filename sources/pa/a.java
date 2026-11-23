package pa;

import java.util.Map;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
