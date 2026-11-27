// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class v09 extends FrameLayout implements snb {
    public final rb0 a;
    public final ImageReceiver b;
    public final TextView c;
    public final TextView d;
    public final og2 e;
    public final Path f;
    public final Paint h;
    public final vnb n;
    public final int[] r;
    public boolean s;

    public v09(Context context, vnb vnbVar) {
        super(context);
        this.a = new rb0((vnb) null);
        this.b = new ImageReceiver(this);
        this.f = new Path();
        this.h = new Paint(1);
        this.r = new int[1];
        this.n = vnbVar;
        setWillNotDraw(false);
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setSingleLine();
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        yob.X(textView, aob.G6, vnbVar);
        textView.setTypeface(hl.o());
        textView.setTextSize(1, 16.0f);
        boolean z = ob6.a0;
        addView(textView, tre.d(-1, -2.0f, 7, z ? 40.0f : 78.0f, 10.33f, z ? 78.0f : 40.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setLines(2);
        textView2.setEllipsize(truncateAt);
        yob.X(textView2, aob.z6, vnbVar);
        textView2.setTextSize(1, 15.0f);
        boolean z2 = ob6.a0;
        addView(textView2, tre.d(-1, -2.0f, 7, z2 ? 40.0f : 78.0f, 32.0f, z2 ? 78.0f : 40.0f, 0.0f));
        og2 og2Var = new og2(21, vnbVar, getContext());
        this.e = og2Var;
        og2Var.b(-1, aob.d6, aob.k7);
        og2Var.setDrawUnchecked(false);
        og2Var.setDrawBackgroundAsArc(3);
        addView(og2Var, tre.i(24.0f, 24.0f, 8388659, 33.0f, 25.0f, 0.0f, 0.0f));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float measuredWidth = ob6.a0 ? getMeasuredWidth() - hl.L(65.0f) : hl.L(9.0f);
        float L = hl.L(11.33f);
        float L2 = hl.L(56.0f);
        float L3 = hl.L(56.0f);
        ImageReceiver imageReceiver = this.b;
        imageReceiver.i0(measuredWidth, L, L2, L3);
        imageReceiver.h(canvas, null);
        super.onDraw(canvas);
        canvas.drawPath(this.f, this.h);
        if (this.s) {
            Paint U0 = aob.U0("paintDivider", this.n);
            if (U0 == null) {
                U0 = aob.j0;
            }
            canvas.drawRect(hl.L(ob6.a0 ? 0.0f : 78.0f), getMeasuredHeight() - 1, getWidth() - hl.L(ob6.a0 ? 78.0f : 0.0f), getMeasuredHeight(), U0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(78.0f) + (this.s ? 1 : 0), TLObject.FLAG_30));
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.h;
        paint.setStyle(style);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeWidth(hl.N(1.66f));
        paint.setColor(aob.p1(0.85f, aob.v0(aob.z6, this.n)));
        Path path = this.f;
        path.rewind();
        float measuredHeight = getMeasuredHeight() / 2.0f;
        float N = ob6.a0 ? hl.N(29.66f) : getMeasuredWidth() - hl.N(24.33f);
        path.moveTo(N, measuredHeight - hl.N(5.66f));
        path.lineTo((hl.N(5.33f) * (ob6.a0 ? -1 : 1)) + N, measuredHeight);
        path.lineTo(N, hl.N(5.66f) + measuredHeight);
    }

    @Override // snb
    public final void updateColors() {
        try {
            this.h.setColor(aob.p1(0.85f, aob.v0(aob.z6, this.n)));
            invalidate();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
    }
}
