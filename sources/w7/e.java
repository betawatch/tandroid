package w7;

import java.util.Map;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements ia.d {
    public static final /* synthetic */ e b = new e(0);
    public static final /* synthetic */ e c = new e(1);
    public final /* synthetic */ int a;

    public /* synthetic */ e(int i10) {
        this.a = i10;
    }

    @Override // ia.a
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                ia.e eVar = (ia.e) obj2;
                eVar.a(f.g, entry.getKey());
                eVar.a(f.h, entry.getValue());
                return;
            default:
                throw new ia.b("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    }
}
