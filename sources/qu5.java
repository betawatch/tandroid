// default package

import java.util.Date;
import java.util.HashMap;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class qu5 implements r24 {
    public static final ou5 f;
    public static final ou5 h;
    public final HashMap a;
    public final HashMap b;
    public final nu5 c;
    public boolean d;
    public static final nu5 e = new nu5((byte) 0);
    public static final pu5 n = new pu5();

    /* JADX WARN: Type inference failed for: r0v1, types: [ou5] */
    /* JADX WARN: Type inference failed for: r0v2, types: [ou5] */
    static {
        final byte b = 0;
        f = new y8c() { // from class: ou5
            @Override // q24
            public final void a(Object obj, Object obj2) {
                switch (b) {
                    case 0:
                        ((z8c) obj2).b((String) obj);
                        break;
                    default:
                        ((z8c) obj2).c(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
        final byte b2 = 1;
        h = new y8c() { // from class: ou5
            @Override // q24
            public final void a(Object obj, Object obj2) {
                switch (b2) {
                    case 0:
                        ((z8c) obj2).b((String) obj);
                        break;
                    default:
                        ((z8c) obj2).c(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
    }

    public qu5() {
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

    @Override // r24
    public final r24 a(Class cls, zn7 zn7Var) {
        this.a.put(cls, zn7Var);
        this.b.remove(cls);
        return this;
    }
}
