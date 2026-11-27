// default package

import java.util.Date;
import java.util.HashMap;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class vw5 implements m34 {
    public static final tw5 f;
    public static final tw5 h;
    public final HashMap a;
    public final HashMap b;
    public final sw5 c;
    public boolean d;
    public static final sw5 e = new sw5((byte) 0);
    public static final uw5 n = new uw5();

    /* JADX WARN: Type inference failed for: r0v1, types: [tw5] */
    /* JADX WARN: Type inference failed for: r0v2, types: [tw5] */
    static {
        final byte b = 0;
        f = new ycc() { // from class: tw5
            @Override // l34
            public final void a(Object obj, Object obj2) {
                switch (b) {
                    case 0:
                        ((zcc) obj2).b((String) obj);
                        break;
                    default:
                        ((zcc) obj2).c(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
        final byte b2 = 1;
        h = new ycc() { // from class: tw5
            @Override // l34
            public final void a(Object obj, Object obj2) {
                switch (b2) {
                    case 0:
                        ((zcc) obj2).b((String) obj);
                        break;
                    default:
                        ((zcc) obj2).c(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
    }

    public vw5() {
        HashMap hashMap = new HashMap();
        this.a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.b = hashMap2;
        this.c = e;
        this.d = false;
        hashMap2.put(String.class, f);
        hashMap.remove(String.class);
        hashMap2.put(Boolean.class, h);
        hashMap.remove(Boolean.class);
        hashMap2.put(Date.class, n);
        hashMap.remove(Date.class);
    }

    @Override // m34
    public final m34 a(Class cls, zq7 zq7Var) {
        this.a.put(cls, zq7Var);
        this.b.remove(cls);
        return this;
    }
}
