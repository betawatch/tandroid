package y2;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class g {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public g(int i10, int i11, int i12, int i13) {
        this.a = i10;
        this.b = i11;
        this.c = i12;
        this.d = i13;
    }

    public final boolean a(int i10) {
        if (i10 == 1) {
            if (this.a - this.b <= 1) {
                return false;
            }
        } else if (this.c - this.d <= 1) {
            return false;
        }
        return true;
    }
}
