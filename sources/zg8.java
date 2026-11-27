// default package

import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public abstract class zg8 {
    public final ImageReceiver a = new ImageReceiver(null);

    public void a(View view) {
        ImageReceiver imageReceiver = this.a;
        imageReceiver.p0(view);
        imageReceiver.I();
    }

    public void b() {
        this.a.K();
    }

    public void c(Canvas canvas, int i, int i2) {
        ImageReceiver imageReceiver = this.a;
        imageReceiver.i0(0.0f, 0.0f, i, i2);
        imageReceiver.h(canvas, null);
    }
}
