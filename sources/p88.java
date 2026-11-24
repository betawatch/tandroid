// default package

import android.graphics.drawable.Drawable;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class p88 implements mcc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lo6 b;

    public /* synthetic */ p88(lo6 lo6Var, byte b) {
        this.a = b;
        this.b = lo6Var;
    }

    @Override // mcc
    public final void a(uf4 uf4Var) {
        byte b = this.a;
        lo6 lo6Var = this.b;
        switch (b) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.d9;
                uf4Var.c(new ni6(lo6Var, (byte) 29));
                break;
            default:
                Drawable[] drawableArr2 = PhotoViewer.d9;
                uf4Var.c(new ni6(lo6Var, (byte) 29));
                break;
        }
    }
}
