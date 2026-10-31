package rh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class c3 extends View implements org.telegram.ui.ActionBar.k6 {
    public final p3 a;
    public final ImageReceiver b;
    public final Path c;
    public final Paint d;

    public c3(Context context, TL_stars.StarGift starGift, TLObject tLObject) {
        super(context);
        Path path = new Path();
        this.c = path;
        Paint paint = new Paint(1);
        this.d = paint;
        org.telegram.ui.ActionBar.z6 z6Var = org.telegram.ui.ActionBar.a7.a;
        p3 p3Var = new p3(this, starGift, 60, 0.27f);
        this.a = p3Var;
        p3Var.K = 3;
        org.telegram.ui.Components.r8 r8Var = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
        r8Var.l(tLObject);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.b = imageReceiver;
        imageReceiver.J0(org.telegram.messenger.i0.L(30.0f));
        imageReceiver.i0(tLObject, r8Var, null);
        paint.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.E6, false));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
        path.rewind();
        path.moveTo(0.0f, -org.telegram.messenger.i0.L(8.0f));
        path.lineTo(org.telegram.messenger.i0.L(6.166f), 0.0f);
        path.lineTo(0.0f, org.telegram.messenger.i0.L(8.0f));
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.b.P();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.b.R();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int width = (getWidth() / 2) - (org.telegram.messenger.i0.L(156.0f) / 2);
        int height = (getHeight() / 2) - org.telegram.messenger.i0.L(30.0f);
        int L = org.telegram.messenger.i0.L(60.0f) + width;
        int L2 = org.telegram.messenger.i0.L(60.0f) + height;
        p3 p3Var = this.a;
        p3Var.setBounds(width, height, L, L2);
        p3Var.draw(canvas);
        canvas.save();
        canvas.translate((getWidth() / 2.0f) - (org.telegram.messenger.i0.L(6.166f) / 2.0f), getHeight() / 2.0f);
        canvas.drawPath(this.c, this.d);
        canvas.restore();
        float L3 = org.telegram.messenger.i0.L(60.0f);
        float L4 = org.telegram.messenger.i0.L(60.0f);
        ImageReceiver imageReceiver = this.b;
        imageReceiver.y0(org.telegram.messenger.i0.L(96.0f) + width, height, L3, L4);
        imageReceiver.h(canvas, null);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(100.0f), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        Paint paint = this.d;
        try {
            int i10 = org.telegram.ui.ActionBar.t6.E6;
            paint.setColor(org.telegram.ui.ActionBar.t6.x0(null, i10, false));
            paint.setColor(org.telegram.ui.ActionBar.t6.x0(null, i10, false));
            invalidate();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public c3(Context context, TL_stars.StarGift starGift) {
        super(context);
        Path path = new Path();
        this.c = path;
        Paint paint = new Paint(1);
        this.d = paint;
        org.telegram.ui.ActionBar.z6 z6Var = org.telegram.ui.ActionBar.a7.a;
        p3 p3Var = new p3(this, starGift, 60, 0.27f);
        this.a = p3Var;
        p3Var.K = 3;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.b = imageReceiver;
        imageReceiver.J0(org.telegram.messenger.i0.L(30.0f));
        imageReceiver.w0(org.telegram.ui.Cells.w6.a(60, "fragment"));
        paint.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.E6, false));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeWidth(org.telegram.messenger.i0.L(2.33f));
        path.rewind();
        path.moveTo(0.0f, -org.telegram.messenger.i0.L(8.0f));
        path.lineTo(org.telegram.messenger.i0.L(6.166f), 0.0f);
        path.lineTo(0.0f, org.telegram.messenger.i0.L(8.0f));
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
