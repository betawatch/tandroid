// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class vm5 extends ym5 {
    public final /* synthetic */ byte d;
    public final /* synthetic */ wm5 e;

    public /* synthetic */ vm5(wm5 wm5Var, byte b) {
        this.d = b;
        this.e = wm5Var;
    }

    @Override // gm5, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        byte b = this.d;
        wm5 wm5Var = this.e;
        switch (b) {
            case 0:
                if (obj instanceof vn7) {
                    vn7 vn7Var = (vn7) obj;
                    if (vn7Var.a() > 0) {
                        if (((c69) wm5Var).e.b(vn7Var.a) == vn7Var.a()) {
                            return true;
                        }
                    }
                }
                return false;
            default:
                return ((c69) wm5Var).contains(obj);
        }
    }

    @Override // ym5, java.util.Collection, java.util.Set
    public final int hashCode() {
        switch (this.d) {
            case 0:
                return this.e.hashCode();
            default:
                return super.hashCode();
        }
    }

    @Override // gm5
    public final int i(int i, Object[] objArr) {
        return h().i(i, objArr);
    }

    @Override // gm5
    public final boolean m() {
        switch (this.d) {
            case 0:
                return false;
            default:
                return true;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final v5c iterator() {
        return h().listIterator(0);
    }

    @Override // ym5
    public final mm5 r() {
        return new kn5(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        byte b = this.d;
        wm5 wm5Var = this.e;
        switch (b) {
            case 0:
                c69 c69Var = (c69) wm5Var;
                vm5 vm5Var = c69Var.h;
                if (vm5Var == null) {
                    vm5Var = new vm5(c69Var, (byte) 1);
                    c69Var.h = vm5Var;
                }
                return vm5Var.size();
            default:
                return ((c69) wm5Var).e.c;
        }
    }
}
