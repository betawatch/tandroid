package pa;

import java.util.Date;
import java.util.HashMap;
import na.g;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class d implements oa.a {
    public static final b f;
    public static final b h;
    public final HashMap a;
    public final HashMap b;
    public final a c;
    public boolean d;
    public static final a e = new a(0);
    public static final c n = new c();

    /* JADX WARN: Type inference failed for: r0v1, types: [pa.b] */
    /* JADX WARN: Type inference failed for: r0v2, types: [pa.b] */
    static {
        final int i7 = 0;
        f = new na.f() { // from class: pa.b
            @Override // na.a
            public final void a(Object obj, Object obj2) {
                switch (i7) {
                    case 0:
                        ((g) obj2).f((String) obj);
                        break;
                    default:
                        ((g) obj2).g(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
        final int i10 = 1;
        h = new na.f() { // from class: pa.b
            @Override // na.a
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

    @Override // oa.a
    public final oa.a b(Class cls, na.d dVar) {
        this.a.put(cls, dVar);
        this.b.remove(cls);
        return this;
    }
}
