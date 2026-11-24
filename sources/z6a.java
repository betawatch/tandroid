// default package

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class z6a implements y6a, x81 {
    public final y6a a;
    public final String b;
    public final Set c;

    public z6a(y6a y6aVar) {
        Set set;
        y6aVar.getClass();
        this.a = y6aVar;
        this.b = y6aVar.a() + '?';
        if (y6aVar instanceof x81) {
            set = ((x81) y6aVar).b();
        } else {
            HashSet hashSet = new HashSet(y6aVar.f());
            int f = y6aVar.f();
            for (int i = 0; i < f; i++) {
                hashSet.add(y6aVar.g(i));
            }
            set = hashSet;
        }
        this.c = set;
    }

    @Override // y6a
    public final String a() {
        return this.b;
    }

    @Override // x81
    public final Set b() {
        return this.c;
    }

    @Override // y6a
    public final boolean c() {
        return true;
    }

    @Override // y6a
    public final int d(String str) {
        str.getClass();
        return this.a.d(str);
    }

    @Override // y6a
    public final yve e() {
        return this.a.e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof z6a) {
            return rr5.a(this.a, ((z6a) obj).a);
        }
        return false;
    }

    @Override // y6a
    public final int f() {
        return this.a.f();
    }

    @Override // y6a
    public final String g(int i) {
        return this.a.g(i);
    }

    @Override // y6a
    public final List getAnnotations() {
        return this.a.getAnnotations();
    }

    @Override // y6a
    public final List h(int i) {
        return this.a.h(i);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    @Override // y6a
    public final y6a i(int i) {
        return this.a.i(i);
    }

    @Override // y6a
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
