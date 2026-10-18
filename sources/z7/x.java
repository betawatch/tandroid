package z7;

import java.util.Map;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public final /* synthetic */ class x implements ja.d {
    public static final /* synthetic */ x b = new x(0);
    public static final /* synthetic */ x c = new x(1);
    public final /* synthetic */ int a;

    public /* synthetic */ x(int i10) {
        this.a = i10;
    }

    @Override // ja.a
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                ja.e eVar = (ja.e) obj2;
                eVar.d(y.g, entry.getKey());
                eVar.d(y.h, entry.getValue());
                return;
            default:
                throw new ja.b("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    }
}
