package yh;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.yi0;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final class d7 implements ImageReceiver.ImageReceiverDelegate {
    public final /* synthetic */ boolean[] a;

    public d7(boolean[] zArr) {
        this.a = zArr;
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public final void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        yi0 lottieAnimation;
        if (!z10 || (lottieAnimation = imageReceiver.getLottieAnimation()) == null) {
            return;
        }
        boolean[] zArr = this.a;
        if (zArr[0]) {
            return;
        }
        lottieAnimation.N(0, false, false);
        AndroidUtilities.runOnUIThread(new org.telegram.ui.Cells.q0(lottieAnimation, 0));
        zArr[0] = true;
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public final /* synthetic */ void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.h5.a(this, i10, str, drawable);
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public final /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.h5.b(this, imageReceiver);
    }
}
