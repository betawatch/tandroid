package x2;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class p1 implements g9.k, ua.a, t3.g {
    public final /* synthetic */ int a;

    public /* synthetic */ p1(int i7) {
        this.a = i7;
    }

    @Override // g9.k, l5.e
    public Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return Integer.valueOf(((e2.m1) obj).c);
            case 1:
            case 2:
            default:
                return (z3.q) obj;
            case 3:
                return Long.valueOf(((c4.a) obj).b);
            case 4:
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
