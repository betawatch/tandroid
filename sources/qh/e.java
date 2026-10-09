package qh;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
