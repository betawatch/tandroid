// default package

import java.util.Map;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class s7d implements zn7 {
    public static final /* synthetic */ s7d b = new s7d(0);
    public static final /* synthetic */ s7d c = new s7d(1);
    public static final /* synthetic */ s7d d = new s7d(2);
    public static final /* synthetic */ s7d e = new s7d(3);
    public static final /* synthetic */ s7d f = new s7d(4);
    public static final /* synthetic */ s7d g = new s7d(5);
    public static final /* synthetic */ s7d h = new s7d(6);
    public static final /* synthetic */ s7d i = new s7d(7);
    public final /* synthetic */ byte a;

    public /* synthetic */ s7d(byte b2) {
        this.a = b2;
    }

    @Override // q24
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                ao7 ao7Var = (ao7) obj2;
                ao7Var.a(y7d.f, entry.getKey());
                ao7Var.a(y7d.g, entry.getValue());
                return;
            case 1:
                throw new t24("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
            case 2:
                Map.Entry entry2 = (Map.Entry) obj;
                ao7 ao7Var2 = (ao7) obj2;
                ao7Var2.a(o8d.f, entry2.getKey());
                ao7Var2.a(o8d.g, entry2.getValue());
                return;
            case 3:
                throw new t24("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
            case 4:
                Map.Entry entry3 = (Map.Entry) obj;
                ao7 ao7Var3 = (ao7) obj2;
                ao7Var3.a(pid.f, entry3.getKey());
                ao7Var3.a(pid.g, entry3.getValue());
                return;
            case 5:
                throw new t24("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
            case 6:
                Map.Entry entry4 = (Map.Entry) obj;
                ao7 ao7Var4 = (ao7) obj2;
                ao7Var4.a(tkd.f, entry4.getKey());
                ao7Var4.a(tkd.g, entry4.getValue());
                return;
            default:
                throw new t24("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    }
}
