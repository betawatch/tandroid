package u9;

import java.util.Map;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements s9.d {
    public final /* synthetic */ int a;

    @Override // s9.a
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                throw new s9.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                s9.e eVar = (s9.e) obj2;
                eVar.e(v9.e.g, entry.getKey());
                eVar.e(v9.e.h, entry.getValue());
                return;
            default:
                throw new s9.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
