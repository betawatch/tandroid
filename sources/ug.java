// default package

import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ug implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kg5 b;

    public /* synthetic */ ug(kg5 kg5Var, byte b) {
        this.a = b;
        this.b = kg5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        kg5 kg5Var = this.b;
        switch (b) {
            case 0:
                hl.B2(kg5Var);
                break;
            case 1:
                hl.B2(kg5Var);
                break;
            case 2:
                hl.B2(kg5Var);
                break;
            case 3:
                float[] fArr = FragmentContextView.W0;
                hl.B2(kg5Var);
                break;
            case 4:
            case 7:
                kg5Var.f(true);
                break;
            case 5:
                kg5Var.y();
                break;
            case 6:
                Drawable[] drawableArr = PhotoViewer.d9;
                hl.B2(kg5Var);
                break;
            case 8:
                hl.B2(kg5Var);
                break;
            case 9:
                hl.B2(kg5Var);
                break;
            default:
                hl.B2(kg5Var);
                break;
        }
    }
}
