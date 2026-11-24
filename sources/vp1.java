// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class vp1 implements Runnable {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ yv1 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ k47 d;

    public /* synthetic */ vp1(yv1 yv1Var, int i, k47 k47Var) {
        this.b = yv1Var;
        this.c = i;
        this.d = k47Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        k47 k47Var = this.d;
        int i = this.c;
        yv1 yv1Var = this.b;
        switch (b) {
            case 0:
                yv1Var.D4 = null;
                k47Var.k.replies.read_max_id = i;
                break;
            default:
                c41.b0(yv1Var).c(jb6.M0(2131754485, null)).j();
                oc7.r1(i).l0(false);
                yv1Var.Za(k47Var);
                yv1Var.bb(k47Var);
                break;
        }
    }

    public /* synthetic */ vp1(yv1 yv1Var, k47 k47Var, int i) {
        this.b = yv1Var;
        this.d = k47Var;
        this.c = i;
    }
}
