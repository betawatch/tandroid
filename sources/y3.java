// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class y3 implements Runnable {
    public final sd9 a;
    public final x76 b;

    public y3(sd9 sd9Var, x76 x76Var) {
        this.a = sd9Var;
        this.b = x76Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.a == this) {
            if (b4.f.b(this.a, this, b4.h(this.b))) {
                b4.e(this.a);
            }
        }
    }
}
