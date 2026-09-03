package qh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import org.telegram.messenger.camera.CameraView;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class u5 extends CameraView {
    public final Path a;
    public final /* synthetic */ v5 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u5(v5 v5Var, Context context) {
        super(context, true, false);
        this.b = v5Var;
        this.a = new Path();
    }

    @Override // org.telegram.messenger.camera.CameraView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        Path path = this.a;
        path.rewind();
        path.addCircle(getWidth() / 2.0f, getHeight() / 2.0f, Math.min(getWidth() / 2.0f, getHeight() / 2.0f), Path.Direction.CW);
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // org.telegram.messenger.camera.CameraView
    public final void receivedAmplitude(double d) {
        ((n) this.b).C.setAmplitude(d);
    }

    @Override // org.telegram.messenger.camera.CameraView
    public final boolean square() {
        return true;
    }
}
