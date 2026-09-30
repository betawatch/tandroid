package qh;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
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
