// default package

import j$.util.Collection;
import java.util.Arrays;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public abstract class zo5 extends jo5 implements Collection, java.util.Collection {
    public static final /* synthetic */ int d = 0;
    public transient j99 b;
    public transient bp5 c;

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zo5)) {
            return false;
        }
        zo5 zo5Var = (zo5) obj;
        p99 p99Var = (p99) this;
        if (p99Var.size() != zo5Var.size() || o().size() != zo5Var.o().size()) {
            return false;
        }
        for (vq7 vq7Var : zo5Var.o()) {
            if (p99Var.e.b(vq7Var.a) != vq7Var.a()) {
                return false;
            }
        }
        return true;
    }

    @Override // jo5
    public final po5 h() {
        j99 j99Var = this.b;
        if (j99Var != null) {
            return j99Var;
        }
        po5 h = super.h();
        this.b = (j99) h;
        return h;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return qye.c(o());
    }

    @Override // jo5
    public final int i(int i, Object[] objArr) {
        v9c it = o().iterator();
        while (it.hasNext()) {
            vq7 vq7Var = (vq7) it.next();
            Arrays.fill(objArr, i, vq7Var.a() + i, vq7Var.a);
            i += vq7Var.a();
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: n */
    public final v9c iterator() {
        return new wo5(o().iterator());
    }

    public final bp5 o() {
        bp5 bp5Var = this.c;
        if (bp5Var == null) {
            bp5Var = isEmpty() ? q99.s : new yo5(this, (byte) 0);
            this.c = bp5Var;
        }
        return bp5Var;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return o().toString();
    }
}
