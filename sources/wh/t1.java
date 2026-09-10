package wh;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class t1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m2 b;
    public final /* synthetic */ int c;

    public /* synthetic */ t1(m2 m2Var, int i10, int i11) {
        this.a = i11;
        this.b = m2Var;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.f.scrollBy(0, this.c);
                break;
            default:
                h2 h2Var = this.b.f;
                if (h2Var != null) {
                    h2Var.setSpanCount(this.c);
                    break;
                }
                break;
        }
    }
}
