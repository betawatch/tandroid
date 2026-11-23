package x2;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final /* synthetic */ class z0 implements h2.j, g9.k, ua.a, t3.g {
    public final /* synthetic */ int a;

    public /* synthetic */ z0(int i7) {
        this.a = i7;
    }

    @Override // h2.j
    public void accept(Object obj) {
        ((a1) obj).b.release();
    }

    @Override // g9.k, l5.e
    public Object apply(Object obj) {
        switch (this.a) {
            case 1:
                return Integer.valueOf(((e2.m1) obj).c);
            case 2:
            case 3:
            default:
                return (z3.q) obj;
            case 4:
                return Long.valueOf(((c4.a) obj).b);
            case 5:
                return Long.valueOf(((c4.a) obj).c);
        }
    }

    @Override // ua.a
    public void b(ua.b bVar) {
        bVar.get().getClass();
        throw new ClassCastException();
    }

    @Override // t3.g
    public boolean c(int i7, int i10, int i11, int i12, int i13) {
        if (i10 == 67 && i11 == 79 && i12 == 77 && (i13 == 77 || i7 == 2)) {
            return true;
        }
        if (i10 == 77 && i11 == 76 && i12 == 76) {
            return i13 == 84 || i7 == 2;
        }
        return false;
    }
}
