package t9;

import java.util.Map;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements r9.d {
    public final /* synthetic */ int a;

    @Override // r9.a
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                throw new r9.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                r9.e eVar = (r9.e) obj2;
                eVar.a(u9.e.g, entry.getKey());
                eVar.a(u9.e.h, entry.getValue());
                return;
            default:
                throw new r9.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
