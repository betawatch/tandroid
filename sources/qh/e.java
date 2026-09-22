package qh;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public abstract class e {
    public final ImageReceiver a = new ImageReceiver();

    public void a(View view) {
        ImageReceiver imageReceiver = this.a;
        imageReceiver.setParentView(view);
        imageReceiver.onAttachedToWindow();
    }

    public void b() {
        this.a.onDetachedFromWindow();
    }

    public abstract void c(Canvas canvas, int i10, int i11);
}
