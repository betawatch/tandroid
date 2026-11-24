// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class q45 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ s45 c;
    public final /* synthetic */ mk7 d;

    public /* synthetic */ q45(boolean[] zArr, s45 s45Var, mk7 mk7Var, byte b) {
        this.a = b;
        this.b = zArr;
        this.c = s45Var;
        this.d = mk7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        mk7 mk7Var = this.d;
        s45 s45Var = this.c;
        boolean[] zArr = this.b;
        switch (b) {
            case 0:
                if (!zArr[0]) {
                    if (!s45Var.m) {
                        mk7Var.dismiss();
                        break;
                    } else {
                        gm.d3(this, 1000L);
                        break;
                    }
                }
                break;
            default:
                if (!zArr[0]) {
                    if (!s45Var.m) {
                        mk7Var.dismiss();
                        break;
                    } else {
                        gm.d3(this, 1000L);
                        break;
                    }
                }
                break;
        }
    }
}
