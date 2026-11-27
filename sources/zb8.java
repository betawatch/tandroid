// default package

import android.content.Context;
import android.graphics.drawable.Drawable;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class zb8 extends cgc {
    public final /* synthetic */ PhotoViewer i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zb8(PhotoViewer photoViewer, Context context, fa8 fa8Var) {
        super(context, fa8Var);
        this.i0 = photoViewer;
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        Drawable[] drawableArr = PhotoViewer.d9;
        this.i0.R2();
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0) {
            Drawable[] drawableArr = PhotoViewer.d9;
            this.i0.R2();
        }
    }
}
