package w9;

import java.util.Map;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements u9.d {
    public final /* synthetic */ int a;

    @Override // u9.a
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                throw new u9.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                u9.e eVar = (u9.e) obj2;
                eVar.e(x9.e.g, entry.getKey());
                eVar.e(x9.e.h, entry.getValue());
                return;
            default:
                throw new u9.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
