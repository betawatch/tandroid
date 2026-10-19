package rh;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
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
