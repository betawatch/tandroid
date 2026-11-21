package y7;

import java.util.Map;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements na.d {
    public static final /* synthetic */ i b = new i(0);
    public static final /* synthetic */ i c = new i(1);
    public final /* synthetic */ int a;

    public /* synthetic */ i(int i7) {
        this.a = i7;
    }

    @Override // na.a
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                na.e eVar = (na.e) obj2;
                eVar.a(j.g, entry.getKey());
                eVar.a(j.h, entry.getValue());
                return;
            default:
                throw new na.b("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    }
}
