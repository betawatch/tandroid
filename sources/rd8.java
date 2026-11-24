// default package

import android.view.View;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class rd8 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ImageReceiver b;

    public /* synthetic */ rd8(ImageReceiver imageReceiver, byte b) {
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
