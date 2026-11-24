// default package

import j$.util.Collection;
import java.util.Arrays;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class wo5 extends go5 implements Collection, java.util.Collection {
    public static final /* synthetic */ int d = 0;
    public transient y79 b;
    public transient yo5 c;

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof wo5)) {
            return false;
        }
        wo5 wo5Var = (wo5) obj;
        e89 e89Var = (e89) this;
        if (e89Var.size() != wo5Var.size() || o().size() != wo5Var.o().size()) {
            return false;
        }
        for (yp7 yp7Var : wo5Var.o()) {
            if (e89Var.e.b(yp7Var.a) != yp7Var.a()) {
                return false;
            }
        }
        return true;
    }

    @Override // go5
    public final mo5 h() {
        y79 y79Var = this.b;
        if (y79Var != null) {
            return y79Var;
        }
        mo5 h = super.h();
        this.b = (y79) h;
        return h;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return bwe.c(o());
    }

    @Override // go5
    public final int i(int i, Object[] objArr) {
        v7c it = o().iterator();
        while (it.hasNext()) {
            yp7 yp7Var = (yp7) it.next();
            Arrays.fill(objArr, i, yp7Var.a() + i, yp7Var.a);
            i += yp7Var.a();
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: n */
    public final v7c iterator() {
        return new to5(o().iterator());
    }

    public final yo5 o() {
        yo5 yo5Var = this.c;
        if (yo5Var == null) {
            yo5Var = isEmpty() ? f89.s : new vo5(this, (byte) 0);
            this.c = yo5Var;
        }
        return yo5Var;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return o().toString();
    }
}
