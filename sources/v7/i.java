package v7;

import java.util.Map;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements ia.d {
    public static final /* synthetic */ i b = new i(0);
    public static final /* synthetic */ i c = new i(1);
    public final /* synthetic */ int a;

    public /* synthetic */ i(int i10) {
        this.a = i10;
    }

    @Override // ia.a
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                ia.e eVar = (ia.e) obj2;
                eVar.a(j.g, entry.getKey());
                eVar.a(j.h, entry.getValue());
                return;
            default:
                throw new ia.b("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    }
}
