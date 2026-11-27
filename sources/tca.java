// default package

import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class tca {
    public final vc a;
    public final long b;
    public final float c;
    public final float d;
    public final float e;

    public tca(View view) {
        vc vcVar = new vc(view, (byte) 6);
        this.b = System.currentTimeMillis();
        this.a = vcVar;
        o3d o3dVar = Utilities.c;
        this.c = hl.R1(5.0f, 9.0f, Utilities.l(o3dVar.nextFloat()));
        this.d = hl.R1(2.5f, 5.0f, Utilities.l(o3dVar.nextFloat()));
        this.e = hl.R1(2.5f, 5.2f, Utilities.l(o3dVar.nextFloat()));
    }

    public final void a(Canvas canvas, float f) {
        float currentTimeMillis = (System.currentTimeMillis() - this.b) / 1000.0f;
        canvas.translate(0.0f, 0.0f);
        canvas.rotate(((float) Math.sin(this.c * currentTimeMillis * 3.141592653589793d)) * 1.0f * f);
        canvas.translate(((float) Math.cos(this.d * currentTimeMillis * 3.141592653589793d)) * hl.L(0.5f) * f, ((float) Math.sin(currentTimeMillis * this.e * 3.141592653589793d)) * hl.L(0.5f) * f);
        canvas.translate(-0.0f, -0.0f);
        if (f > 0.0f) {
            this.a.run();
        }
    }
}
