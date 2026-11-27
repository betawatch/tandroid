// default package

import java.util.Map;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
