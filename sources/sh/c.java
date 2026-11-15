package sh;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
