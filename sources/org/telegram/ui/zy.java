package org.telegram.ui;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class zy implements ImageReceiver.ImageReceiverDelegate {
    public final /* synthetic */ az a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ MessageObject c;
    public final /* synthetic */ bz d;

    public zy(bz bzVar, az azVar, boolean z4, MessageObject messageObject) {
        this.d = bzVar;
        this.a = azVar;
        this.b = z4;
        this.c = messageObject;
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public final void didSetImage(ImageReceiver imageReceiver, boolean z4, boolean z10, boolean z11) {
        az azVar = this.a;
        if (azVar.r.getLottieAnimation() != null) {
            azVar.r.getLottieAnimation().L(0, false, true);
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public final /* synthetic */ void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.j5.a(this, i10, str, drawable);
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public final void onAnimationReady(ImageReceiver imageReceiver) {
        MessageObject messageObject;
        if (this.b && (messageObject = this.c) != null && messageObject.isAnimatedAnimatedEmoji() && imageReceiver.getLottieAnimation() != null && imageReceiver.getLottieAnimation().x == null) {
            try {
                this.d.D.performHapticFeedback(3, 1);
            } catch (Exception unused) {
            }
        }
    }
}
