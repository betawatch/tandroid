// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class wlb extends FrameLayout {
    public final ImageView a;
    public final ema b;
    public final vnb c;
    public boolean d;

    public wlb(Context context, vnb vnbVar) {
        super(context);
        this.c = vnbVar;
        ema emaVar = new ema(context);
        this.b = emaVar;
        yob.W(emaVar, aob.j5, vnbVar);
        emaVar.setTextSize(16);
        emaVar.setGravity(19);
        addView(emaVar, tre.d(-1, 48.0f, 16, 22.0f, 0.0f, 56.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        yob.s(imageView, aob.C6, vnbVar, PorterDuff.Mode.SRC_IN);
        addView(imageView, tre.d(24, 24.0f, 8388629, 0.0f, 0.0f, 16.0f, 0.0f));
        int i = aob.h5;
        int i2 = rnb.a;
        int w0 = aob.w0(null, i, false);
        setBackground(rnb.d(w0, rnb.b(w0), new float[0]));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.d) {
            vnb vnbVar = this.c;
            Paint d = vnbVar != null ? vnbVar.d("paintDivider") : null;
            if (d == null) {
                d = aob.j0;
            }
            canvas.drawLine(hl.L(22.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, d);
        }
    }

    public void setDivider(boolean z) {
        this.d = z;
    }
}
