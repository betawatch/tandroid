// default package

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class ykb extends FrameLayout {
    public static Paint d;
    public static final int[] e = {-1031100, -29183, -12769, -8792480, -12521994, -12140801, -2984711, -45162, -4473925};
    public static final int[] f = {-65536, -29183, -256, -16711936, -16711681, -16776961, -2984711, -65281, -1};
    public final TextView a;
    public boolean b;
    public int c;

    public ykb(Context context, vnb vnbVar) {
        super(context);
        if (d == null) {
            d = new Paint(1);
        }
        TextView textView = new TextView(context);
        this.a = textView;
        yob.X(textView, aob.G6, vnbVar);
        ik8.w(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        textView.setGravity((ob6.a0 ? 5 : 3) | 16);
        addView(textView, tre.d(-1, -1.0f, (ob6.a0 ? 5 : 3) | 48, 21.0f, 0.0f, 21.0f, 0.0f));
    }

    public final void a(ArrayList arrayList, boolean z) {
        setEnabled(z);
        TextView textView = this.a;
        if (arrayList == null) {
            textView.setAlpha(z ? 1.0f : 0.5f);
            setAlpha(z ? 1.0f : 0.5f);
        } else {
            float[] fArr = {z ? 1.0f : 0.5f};
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, fArr));
            arrayList.add(ObjectAnimator.ofFloat(this, (Property<ykb, Float>) property, z ? 1.0f : 0.5f));
        }
    }

    public final void b(int i, String str, boolean z) {
        this.a.setText(str);
        this.b = z;
        this.c = i;
        setWillNotDraw(!z && i == 0);
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.b) {
            canvas2 = canvas;
            canvas2.drawLine(ob6.a0 ? 0.0f : hl.L(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (ob6.a0 ? hl.L(20.0f) : 0), getMeasuredHeight() - 1, aob.j0);
        } else {
            canvas2 = canvas;
        }
        int i = this.c;
        if (i != 0) {
            d.setColor(i);
            canvas2.drawCircle(ob6.a0 ? hl.L(33.0f) : getMeasuredWidth() - hl.L(33.0f), getMeasuredHeight() / 2, hl.L(10.0f), d);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(50.0f) + (this.b ? 1 : 0), TLObject.FLAG_30));
    }
}
