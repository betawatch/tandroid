// default package

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class to1 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bu5 b;

    public /* synthetic */ to1(bu5 bu5Var, jd jdVar) {
        this.a = (byte) 1;
        this.b = bu5Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        bu5 bu5Var = this.b;
        switch (b) {
            case 0:
                bu5Var.r();
                break;
            case 1:
                if (bu5Var.J) {
                    bu5Var.u();
                    break;
                }
                break;
            case 2:
                Drawable[] drawableArr = PhotoViewer.d9;
                bu5Var.r();
                break;
            default:
                bu5Var.r();
                break;
        }
    }

    public /* synthetic */ to1(bu5 bu5Var, byte b) {
        this.a = b;
        this.b = bu5Var;
    }
}
