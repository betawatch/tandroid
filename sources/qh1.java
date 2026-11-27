// default package

import android.view.View;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class qh1 implements pcc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uh1 b;

    public /* synthetic */ qh1(uh1 uh1Var, byte b) {
        this.a = b;
        this.b = uh1Var;
    }

    @Override // pcc
    public final void a(Object obj) {
        byte b = this.a;
        uh1 uh1Var = this.b;
        View view = (View) obj;
        switch (b) {
            case 0:
                if (view instanceof zqb) {
                    view.setBackgroundColor(aob.v0(aob.i5, uh1Var.b));
                    break;
                }
                break;
            default:
                if (view instanceof zqb) {
                    zqb zqbVar = (zqb) view;
                    zqbVar.setFallbackWallpaper(zqbVar.H.a.b ? null : uh1Var.w);
                    break;
                }
                break;
        }
    }
}
