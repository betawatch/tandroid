package z7;

import java.util.Map;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class c0 implements ma.d {
    public static final /* synthetic */ c0 b = new c0(0);
    public static final /* synthetic */ c0 c = new c0(1);
    public final /* synthetic */ int a;

    public /* synthetic */ c0(int i3) {
        this.a = i3;
    }

    @Override // ma.a
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                ma.e eVar = (ma.e) obj2;
                eVar.a(d0.g, entry.getKey());
                eVar.a(d0.h, entry.getValue());
                return;
            default:
                throw new ma.b("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    }
}
