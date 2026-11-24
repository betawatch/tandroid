// default package

import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class sq3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yq3 b;

    public /* synthetic */ sq3(yq3 yq3Var, byte b) {
        this.a = b;
        this.b = yq3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        yq3 yq3Var = this.b;
        switch (b) {
            case 0:
                yq3Var.b();
                break;
            case 1:
                yq3Var.e = false;
                vq3 vq3Var = yq3Var.s;
                if (vq3Var != null) {
                    vq3Var.a(true);
                    yq3Var.s = null;
                }
                xq3 xq3Var = yq3Var.n;
                if (xq3Var != null) {
                    xq3Var.a();
                }
                yq3Var.c = false;
                yq3Var.d();
                break;
            default:
                if (yq3Var.c && yq3Var.r != null) {
                    yq3Var.n.b(R.raw.error, 3500, jb6.N0("VideoConvertFail"));
                    yq3Var.c = false;
                    yq3Var.d();
                    break;
                }
                break;
        }
    }
}
