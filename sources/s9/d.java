package s9;

import java.util.Date;
import java.util.HashMap;
import q9.g;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class d implements r9.a {
    public static final b f;
    public static final b h;
    public final HashMap a;
    public final HashMap b;
    public final a c;
    public boolean d;
    public static final a e = new a(0);
    public static final c n = new c();

    /* JADX WARN: Type inference failed for: r0v1, types: [s9.b] */
    /* JADX WARN: Type inference failed for: r0v2, types: [s9.b] */
    static {
        final int i9 = 0;
        f = new q9.f() { // from class: s9.b
            @Override // q9.a
            public final void a(Object obj, Object obj2) {
                switch (i9) {
                    case 0:
                        ((g) obj2).e((String) obj);
                        break;
                    default:
                        ((g) obj2).f(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
        final int i10 = 1;
        h = new q9.f() { // from class: s9.b
            @Override // q9.a
            public final void a(Object obj, Object obj2) {
                switch (i10) {
                    case 0:
                        ((g) obj2).e((String) obj);
                        break;
                    default:
                        ((g) obj2).f(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
    }

    public d() {
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

    @Override // r9.a
    public final r9.a l(Class cls, q9.d dVar) {
        this.a.put(cls, dVar);
        this.b.remove(cls);
        return this;
    }
}
