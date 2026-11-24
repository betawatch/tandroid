// default package

import android.view.View;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
