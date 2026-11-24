// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Region;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class qh extends be0 {
    public final Path H;

    public qh(Context context) {
        super(context);
        this.H = new Path();
    }

    @Override // be0, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.save();
        Path path = this.H;
        path.rewind();
        path.addCircle(gl.L(54.0f), gl.L(53.0f), gl.L(14.0f), Path.Direction.CW);
        canvas.clipPath(path, Region.Op.DIFFERENCE);
        super.onDraw(canvas);
        canvas.restore();
    }
}
