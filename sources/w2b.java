// default package

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class w2b extends ImageReceiver {
    public final /* synthetic */ vnb K1;
    public final /* synthetic */ x2b L1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2b(x2b x2bVar, vnb vnbVar) {
        super(null);
        this.L1 = x2bVar;
        this.K1 = vnbVar;
    }

    @Override // org.telegram.messenger.ImageReceiver
    public final boolean h0(Drawable drawable, String str, int i, boolean z, int i2) {
        x2b x2bVar = this.L1;
        ImageView imageView = x2bVar.K;
        if ((drawable instanceof BitmapDrawable) && x2bVar.L == 0) {
            int I0 = hl.I0(((BitmapDrawable) drawable).getBitmap());
            x2bVar.L = I0;
            if (I0 == -1 || I0 == 0) {
                int i3 = aob.q5;
                vnb vnbVar = this.K1;
                x2bVar.L = aob.v0(i3, vnbVar);
                yob.B(imageView, aob.b0(hl.L(12.0f), x2bVar.L), yob.M(i3), vnbVar);
            } else {
                imageView.setBackground(aob.b0(hl.L(12.0f), x2bVar.L));
            }
            invalidate();
        }
        return super.h0(drawable, str, i, z, i2);
    }
}
