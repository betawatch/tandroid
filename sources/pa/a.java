package pa;

import java.util.Map;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
