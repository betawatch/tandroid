package sh;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public abstract class c {
    public final ImageReceiver a = new ImageReceiver(null);

    public void a(View view) {
        ImageReceiver imageReceiver = this.a;
        imageReceiver.H0(view);
        imageReceiver.P();
    }

    public void b() {
        this.a.R();
    }

    public abstract void c(Canvas canvas, int i7, int i10);
}
