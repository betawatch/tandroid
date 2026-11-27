// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Region;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class rh extends de0 {
    public final Path H;

    public rh(Context context) {
        super(context);
        this.H = new Path();
    }

    @Override // de0, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.save();
        Path path = this.H;
        path.rewind();
        path.addCircle(hl.L(54.0f), hl.L(53.0f), hl.L(14.0f), Path.Direction.CW);
        canvas.clipPath(path, Region.Op.DIFFERENCE);
        super.onDraw(canvas);
        canvas.restore();
    }
}
