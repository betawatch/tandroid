// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Region;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class qi extends bf0 {
    public final Path H;

    public qi(Context context) {
        super(context);
        this.H = new Path();
    }

    @Override // bf0, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.save();
        Path path = this.H;
        path.rewind();
        path.addCircle(gm.L(54.0f), gm.L(53.0f), gm.L(14.0f), Path.Direction.CW);
        canvas.clipPath(path, Region.Op.DIFFERENCE);
        super.onDraw(canvas);
        canvas.restore();
    }
}
