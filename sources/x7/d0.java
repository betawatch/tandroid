package x7;

import java.util.Map;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes.dex */
public final /* synthetic */ class d0 implements ia.d {
    public static final /* synthetic */ d0 b = new d0(0);
    public static final /* synthetic */ d0 c = new d0(1);
    public final /* synthetic */ int a;

    public /* synthetic */ d0(int i10) {
        this.a = i10;
    }

    @Override // ia.a
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                ia.e eVar = (ia.e) obj2;
                eVar.a(e0.g, entry.getKey());
                eVar.a(e0.h, entry.getValue());
                return;
            default:
                throw new ia.b("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    }
}
