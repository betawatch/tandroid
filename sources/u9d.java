// default package

import java.util.Map;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class u9d implements cq7 {
    public static final /* synthetic */ u9d b = new u9d(0);
    public static final /* synthetic */ u9d c = new u9d(1);
    public static final /* synthetic */ u9d d = new u9d(2);
    public static final /* synthetic */ u9d e = new u9d(3);
    public static final /* synthetic */ u9d f = new u9d(4);
    public static final /* synthetic */ u9d g = new u9d(5);
    public static final /* synthetic */ u9d h = new u9d(6);
    public static final /* synthetic */ u9d i = new u9d(7);
    public final /* synthetic */ byte a;

    public /* synthetic */ u9d(byte b2) {
        this.a = b2;
    }

    @Override // b44
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                dq7 dq7Var = (dq7) obj2;
                dq7Var.a(aad.f, entry.getKey());
                dq7Var.a(aad.g, entry.getValue());
                return;
            case 1:
                throw new e44("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
            case 2:
                Map.Entry entry2 = (Map.Entry) obj;
                dq7 dq7Var2 = (dq7) obj2;
                dq7Var2.a(qad.f, entry2.getKey());
                dq7Var2.a(qad.g, entry2.getValue());
                return;
            case 3:
                throw new e44("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
            case 4:
                Map.Entry entry3 = (Map.Entry) obj;
                dq7 dq7Var3 = (dq7) obj2;
                dq7Var3.a(rkd.f, entry3.getKey());
                dq7Var3.a(rkd.g, entry3.getValue());
                return;
            case 5:
                throw new e44("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
            case 6:
                Map.Entry entry4 = (Map.Entry) obj;
                dq7 dq7Var4 = (dq7) obj2;
                dq7Var4.a(vmd.f, entry4.getKey());
                dq7Var4.a(vmd.g, entry4.getValue());
                return;
            default:
                throw new e44("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    }
}
