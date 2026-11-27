// default package

import java.util.Map;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final /* synthetic */ class sw5 implements zq7 {
    public final /* synthetic */ byte a;

    @Override // l34
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                throw new o34("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                ar7 ar7Var = (ar7) obj2;
                ar7Var.a(qw8.f, entry.getKey());
                ar7Var.a(qw8.g, entry.getValue());
                return;
            default:
                throw new o34("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
