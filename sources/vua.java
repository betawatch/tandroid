// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class vua extends View implements snb {
    public final ImageReceiver a;
    public final ImageReceiver b;
    public final Path c;
    public final Paint d;

    public vua(Context context, TLObject tLObject, TLObject tLObject2) {
        super(context);
        Path path = new Path();
        this.c = path;
        Paint paint = new Paint(1);
        this.d = paint;
        xob xobVar = yob.a;
        rb0 rb0Var = new rb0((vnb) null);
        rb0Var.k(tLObject);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.a = imageReceiver;
        imageReceiver.q0(hl.L(30.0f));
        imageReceiver.U(tLObject, rb0Var, null);
        rb0 rb0Var2 = new rb0((vnb) null);
        rb0Var2.k(tLObject2);
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.b = imageReceiver2;
        imageReceiver2.q0(hl.L(30.0f));
        imageReceiver2.U(tLObject2, rb0Var2, null);
        paint.setColor(aob.w0(null, aob.E6, false));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeWidth(hl.L(2.0f));
        path.rewind();
        path.moveTo(0.0f, -hl.L(8.0f));
        path.lineTo(hl.L(6.166f), 0.0f);
        path.lineTo(0.0f, hl.L(8.0f));
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
        int width = (getWidth() / 2) - (hl.L(156.0f) / 2);
        float height = (getHeight() / 2) - hl.L(30.0f);
        float L = hl.L(60.0f);
        float L2 = hl.L(60.0f);
        ImageReceiver imageReceiver = this.a;
        imageReceiver.i0(width, height, L, L2);
        imageReceiver.h(canvas, null);
        canvas.save();
        canvas.translate((getWidth() / 2.0f) - (hl.L(6.166f) / 2.0f), getHeight() / 2.0f);
        canvas.drawPath(this.c, this.d);
        canvas.restore();
        float L3 = hl.L(96.0f) + width;
        float L4 = hl.L(60.0f);
        float L5 = hl.L(60.0f);
        ImageReceiver imageReceiver2 = this.b;
        imageReceiver2.i0(L3, height, L4, L5);
        imageReceiver2.h(canvas, null);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(100.0f), TLObject.FLAG_30));
    }

    @Override // snb
    public final void updateColors() {
        try {
            this.d.setColor(aob.w0(null, aob.E6, false));
            invalidate();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
    }
}
