// default package

import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class pi1 implements qac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ti1 b;

    public /* synthetic */ pi1(ti1 ti1Var, byte b) {
        this.a = b;
        this.b = ti1Var;
    }

    @Override // qac
    public final void a(Object obj) {
        byte b = this.a;
        ti1 ti1Var = this.b;
        View view = (View) obj;
        switch (b) {
            case 0:
                if (view instanceof bpb) {
                    view.setBackgroundColor(cmb.v0(cmb.h5, ti1Var.b));
                    break;
                }
                break;
            default:
                if (view instanceof bpb) {
                    bpb bpbVar = (bpb) view;
                    bpbVar.setFallbackWallpaper(bpbVar.H.a.b ? null : ti1Var.w);
                    break;
                }
                break;
        }
    }
}
