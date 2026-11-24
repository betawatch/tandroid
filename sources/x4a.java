// default package

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class x4a implements w4a, p71 {
    public final w4a a;
    public final String b;
    public final Set c;

    public x4a(w4a w4aVar) {
        Set set;
        w4aVar.getClass();
        this.a = w4aVar;
        this.b = w4aVar.a() + '?';
        if (w4aVar instanceof p71) {
            set = ((p71) w4aVar).b();
        } else {
            HashSet hashSet = new HashSet(w4aVar.f());
            int f = w4aVar.f();
            for (int i = 0; i < f; i++) {
                hashSet.add(w4aVar.g(i));
            }
            set = hashSet;
        }
        this.c = set;
    }

    @Override // w4a
    public final String a() {
        return this.b;
    }

    @Override // p71
    public final Set b() {
        return this.c;
    }

    @Override // w4a
    public final boolean c() {
        return true;
    }

    @Override // w4a
    public final int d(String str) {
        str.getClass();
        return this.a.d(str);
    }

    @Override // w4a
    public final vte e() {
        return this.a.e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof x4a) {
            return rp5.a(this.a, ((x4a) obj).a);
        }
        return false;
    }

    @Override // w4a
    public final int f() {
        return this.a.f();
    }

    @Override // w4a
    public final String g(int i) {
        return this.a.g(i);
    }

    @Override // w4a
    public final List getAnnotations() {
        return this.a.getAnnotations();
    }

    @Override // w4a
    public final List h(int i) {
        return this.a.h(i);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    @Override // w4a
    public final w4a i(int i) {
        return this.a.i(i);
    }

    @Override // w4a
    public final boolean isInline() {
        return this.a.isInline();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append('?');
        return sb.toString();
    }
}
