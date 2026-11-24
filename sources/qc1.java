// default package

import android.graphics.drawable.Drawable;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class qc1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tc1 b;

    public /* synthetic */ qc1(tc1 tc1Var, byte b) {
        this.a = b;
        this.b = tc1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        tc1 tc1Var = this.b;
        switch (b) {
            case 0:
                if (tc1Var.o1) {
                    tc1Var.o1 = false;
                    tc1Var.invalidate();
                    break;
                }
                break;
            default:
                Drawable[] drawableArr = PhotoViewer.d9;
                tc1Var.setVisibility(8);
                break;
        }
    }
}
