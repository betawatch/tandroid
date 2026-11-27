// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class tl1 implements Runnable {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ zu1 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ r47 d;

    public /* synthetic */ tl1(zu1 zu1Var, int i, r47 r47Var) {
        this.b = zu1Var;
        this.c = i;
        this.d = r47Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        r47 r47Var = this.d;
        int i = this.c;
        zu1 zu1Var = this.b;
        switch (b) {
            case 0:
                zu1Var.D4 = null;
                r47Var.k.replies.read_max_id = i;
                break;
            default:
                d31.b0(zu1Var).c(ob6.M0(2131754481, null)).j();
                uc7.s1(i).n0(false);
                zu1Var.ab(r47Var);
                zu1Var.cb(r47Var);
                break;
        }
    }

    public /* synthetic */ tl1(zu1 zu1Var, r47 r47Var, int i) {
        this.b = zu1Var;
        this.d = r47Var;
        this.c = i;
    }
}
