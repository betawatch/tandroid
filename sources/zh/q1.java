package zh;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m2 b;
    public final /* synthetic */ int c;

    public /* synthetic */ q1(m2 m2Var, int i10, int i11) {
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
