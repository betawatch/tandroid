package y7;

import java.util.Map;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class c0 implements ka.d {
    public static final /* synthetic */ c0 b = new c0(0);
    public static final /* synthetic */ c0 c = new c0(1);
    public final /* synthetic */ int a;

    public /* synthetic */ c0(int i10) {
        this.a = i10;
    }

    @Override // ka.a
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                ka.e eVar = (ka.e) obj2;
                eVar.a(d0.g, entry.getKey());
                eVar.a(d0.h, entry.getValue());
                return;
            default:
                throw new ka.b("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    }
}
