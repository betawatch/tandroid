package xh;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes.dex */
public final /* synthetic */ class v1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o2 b;
    public final /* synthetic */ int c;

    public /* synthetic */ v1(o2 o2Var, int i10, int i11) {
        this.a = i11;
        this.b = o2Var;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.f.scrollBy(0, this.c);
                break;
            default:
                j2 j2Var = this.b.f;
                if (j2Var != null) {
                    j2Var.setSpanCount(this.c);
                    break;
                }
                break;
        }
    }
}
