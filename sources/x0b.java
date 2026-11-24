// default package

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class x0b extends ImageReceiver {
    public final /* synthetic */ ylb K1;
    public final /* synthetic */ y0b L1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0b(y0b y0bVar, ylb ylbVar) {
        super(null);
        this.L1 = y0bVar;
        this.K1 = ylbVar;
    }

    @Override // org.telegram.messenger.ImageReceiver
    public final boolean h0(Drawable drawable, String str, int i, boolean z, int i2) {
        y0b y0bVar = this.L1;
        ImageView imageView = y0bVar.K;
        if ((drawable instanceof BitmapDrawable) && y0bVar.L == 0) {
            int I0 = gm.I0(((BitmapDrawable) drawable).getBitmap());
            y0bVar.L = I0;
            if (I0 == -1 || I0 == 0) {
                int i3 = cmb.p5;
                ylb ylbVar = this.K1;
                y0bVar.L = cmb.v0(i3, ylbVar);
                anb.B(imageView, cmb.b0(gm.L(12.0f), y0bVar.L), anb.M(i3), ylbVar);
            } else {
                imageView.setBackground(cmb.b0(gm.L(12.0f), y0bVar.L));
            }
            invalidate();
        }
        return super.h0(drawable, str, i, z, i2);
    }
}
