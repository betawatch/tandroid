// default package

import j$.util.Collection;
import java.util.Arrays;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class wm5 extends gm5 implements Collection, java.util.Collection {
    public static final /* synthetic */ int d = 0;
    public transient w59 b;
    public transient ym5 c;

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof wm5)) {
            return false;
        }
        wm5 wm5Var = (wm5) obj;
        c69 c69Var = (c69) this;
        if (c69Var.size() != wm5Var.size() || o().size() != wm5Var.o().size()) {
            return false;
        }
        for (vn7 vn7Var : wm5Var.o()) {
            if (c69Var.e.b(vn7Var.a) != vn7Var.a()) {
                return false;
            }
        }
        return true;
    }

    @Override // gm5
    public final mm5 h() {
        w59 w59Var = this.b;
        if (w59Var != null) {
            return w59Var;
        }
        mm5 h = super.h();
        this.b = (w59) h;
        return h;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return yte.c(o());
    }

    @Override // gm5
    public final int i(int i, Object[] objArr) {
        v5c it = o().iterator();
        while (it.hasNext()) {
            vn7 vn7Var = (vn7) it.next();
            Arrays.fill(objArr, i, vn7Var.a() + i, vn7Var.a);
            i += vn7Var.a();
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: n */
    public final v5c iterator() {
        return new tm5(o().iterator());
    }

    public final ym5 o() {
        ym5 ym5Var = this.c;
        if (ym5Var == null) {
            ym5Var = isEmpty() ? d69.s : new vm5(this, (byte) 0);
            this.c = ym5Var;
        }
        return ym5Var;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return o().toString();
    }
}
