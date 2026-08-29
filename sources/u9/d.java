package u9;

import java.util.Date;
import java.util.HashMap;
import s9.g;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class d implements t9.a {
    public static final b f;
    public static final b h;
    public final HashMap a;
    public final HashMap b;
    public final a c;
    public boolean d;
    public static final a e = new a(0);
    public static final c n = new c();

    /* JADX WARN: Type inference failed for: r0v1, types: [u9.b] */
    /* JADX WARN: Type inference failed for: r0v2, types: [u9.b] */
    static {
        final int i10 = 0;
        f = new s9.f() { // from class: u9.b
            @Override // s9.a
            public final void a(Object obj, Object obj2) {
                switch (i10) {
                    case 0:
                        ((g) obj2).f((String) obj);
                        break;
                    default:
                        ((g) obj2).g(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
        final int i11 = 1;
        h = new s9.f() { // from class: u9.b
            @Override // s9.a
            public final void a(Object obj, Object obj2) {
                switch (i11) {
                    case 0:
                        ((g) obj2).f((String) obj);
                        break;
                    default:
                        ((g) obj2).g(((Boolean) obj).booleanValue());
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

    @Override // t9.a
    public final t9.a i(Class cls, s9.d dVar) {
        this.a.put(cls, dVar);
        this.b.remove(cls);
        return this;
    }
}
