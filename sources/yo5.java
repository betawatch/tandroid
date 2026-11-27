// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class yo5 extends bp5 {
    public final /* synthetic */ byte d;
    public final /* synthetic */ zo5 e;

    public /* synthetic */ yo5(zo5 zo5Var, byte b) {
        this.d = b;
        this.e = zo5Var;
    }

    @Override // jo5, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        byte b = this.d;
        zo5 zo5Var = this.e;
        switch (b) {
            case 0:
                if (obj instanceof vq7) {
                    vq7 vq7Var = (vq7) obj;
                    if (vq7Var.a() > 0) {
                        if (((p99) zo5Var).e.b(vq7Var.a) == vq7Var.a()) {
                            return true;
                        }
                    }
                }
                return false;
            default:
                return ((p99) zo5Var).contains(obj);
        }
    }

    @Override // bp5, java.util.Collection, java.util.Set
    public final int hashCode() {
        switch (this.d) {
            case 0:
                return this.e.hashCode();
            default:
                return super.hashCode();
        }
    }

    @Override // jo5
    public final int i(int i, Object[] objArr) {
        return h().i(i, objArr);
    }

    @Override // jo5
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
    public final v9c iterator() {
        return h().listIterator(0);
    }

    @Override // bp5
    public final po5 r() {
        return new np5(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        byte b = this.d;
        zo5 zo5Var = this.e;
        switch (b) {
            case 0:
                p99 p99Var = (p99) zo5Var;
                yo5 yo5Var = p99Var.h;
                if (yo5Var == null) {
                    yo5Var = new yo5(p99Var, (byte) 1);
                    p99Var.h = yo5Var;
                }
                return yo5Var.size();
            default:
                return ((p99) zo5Var).e.c;
        }
    }
}
