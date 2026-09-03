package w9;

import java.util.Map;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
