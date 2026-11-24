// default package

import android.view.View;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class tf8 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ImageReceiver b;

    public /* synthetic */ tf8(ImageReceiver imageReceiver, byte b) {
        this.a = b;
        this.b = imageReceiver;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        byte b = this.a;
        ImageReceiver imageReceiver = this.b;
        switch (b) {
            case 0:
                imageReceiver.I();
                break;
            default:
                imageReceiver.I();
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        byte b = this.a;
        ImageReceiver imageReceiver = this.b;
        switch (b) {
            case 0:
                imageReceiver.K();
                break;
            default:
                imageReceiver.K();
                break;
        }
    }
}
