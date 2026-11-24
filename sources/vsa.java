// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class vsa extends View implements vlb {
    public final ImageReceiver a;
    public final ImageReceiver b;
    public final Path c;
    public final Paint d;

    public vsa(Context context, TLObject tLObject, TLObject tLObject2) {
        super(context);
        Path path = new Path();
        this.c = path;
        Paint paint = new Paint(1);
        this.d = paint;
        zmb zmbVar = anb.a;
        pc0 pc0Var = new pc0((ylb) null);
        pc0Var.k(tLObject);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.a = imageReceiver;
        imageReceiver.q0(gm.L(30.0f));
        imageReceiver.U(tLObject, pc0Var, null);
        pc0 pc0Var2 = new pc0((ylb) null);
        pc0Var2.k(tLObject2);
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.b = imageReceiver2;
        imageReceiver2.q0(gm.L(30.0f));
        imageReceiver2.U(tLObject2, pc0Var2, null);
        paint.setColor(cmb.w0(null, cmb.D6, false));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeWidth(gm.L(2.0f));
        path.rewind();
        path.moveTo(0.0f, -gm.L(8.0f));
        path.lineTo(gm.L(6.166f), 0.0f);
        path.lineTo(0.0f, gm.L(8.0f));
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.I();
        this.b.I();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a.K();
        this.b.K();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int width = (getWidth() / 2) - (gm.L(156.0f) / 2);
        float height = (getHeight() / 2) - gm.L(30.0f);
        float L = gm.L(60.0f);
        float L2 = gm.L(60.0f);
        ImageReceiver imageReceiver = this.a;
        imageReceiver.i0(width, height, L, L2);
        imageReceiver.h(canvas, null);
        canvas.save();
        canvas.translate((getWidth() / 2.0f) - (gm.L(6.166f) / 2.0f), getHeight() / 2.0f);
        canvas.drawPath(this.c, this.d);
        canvas.restore();
        float L3 = gm.L(96.0f) + width;
        float L4 = gm.L(60.0f);
        float L5 = gm.L(60.0f);
        ImageReceiver imageReceiver2 = this.b;
        imageReceiver2.i0(L3, height, L4, L5);
        imageReceiver2.h(canvas, null);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(100.0f), TLObject.FLAG_30));
    }

    @Override // vlb
    public final void updateColors() {
        try {
            this.d.setColor(cmb.w0(null, cmb.D6, false));
            invalidate();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
    }
}
