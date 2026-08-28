package s9;

import java.util.Map;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements q9.d {
    public final /* synthetic */ int a;

    @Override // q9.a
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                throw new q9.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                q9.e eVar = (q9.e) obj2;
                eVar.g(t9.e.g, entry.getKey());
                eVar.g(t9.e.h, entry.getValue());
                return;
            default:
                throw new q9.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
