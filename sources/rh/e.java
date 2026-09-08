package rh;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
