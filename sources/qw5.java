// default package

import java.util.Date;
import java.util.HashMap;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class qw5 implements c44 {
    public static final ow5 f;
    public static final ow5 h;
    public final HashMap a;
    public final HashMap b;
    public final nw5 c;
    public boolean d;
    public static final nw5 e = new nw5((byte) 0);
    public static final pw5 n = new pw5();

    /* JADX WARN: Type inference failed for: r0v1, types: [ow5] */
    /* JADX WARN: Type inference failed for: r0v2, types: [ow5] */
    static {
        final byte b = 0;
        f = new zac() { // from class: ow5
            @Override // b44
            public final void a(Object obj, Object obj2) {
                switch (b) {
                    case 0:
                        ((abc) obj2).b((String) obj);
                        break;
                    default:
                        ((abc) obj2).c(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
        final byte b2 = 1;
        h = new zac() { // from class: ow5
            @Override // b44
            public final void a(Object obj, Object obj2) {
                switch (b2) {
                    case 0:
                        ((abc) obj2).b((String) obj);
                        break;
                    default:
                        ((abc) obj2).c(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
    }

    public qw5() {
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

    @Override // c44
    public final c44 a(Class cls, cq7 cq7Var) {
        this.a.put(cls, cq7Var);
        this.b.remove(cls);
        return this;
    }
}
