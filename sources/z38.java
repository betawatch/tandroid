// default package

import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.ui.Components.Switch;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class z38 extends FrameLayout {
    public TextView a;
    public TextView b;
    public ImageView c;
    public Switch d;
    public boolean e;

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        Switch r0 = this.d;
        if (r0 != null) {
            r0.invalidate();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.e) {
            canvas.drawLine(k96.a0 ? 0.0f : gl.L(70.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (k96.a0 ? gl.L(70.0f) : 0), getMeasuredHeight() - 1, bkb.j0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int L = gl.L(13.0f) + this.a.getMeasuredHeight();
        TextView textView = this.b;
        textView.layout(textView.getLeft(), L, textView.getRight(), textView.getMeasuredHeight() + L);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        TextView textView = this.a;
        measureChildWithMargins(textView, i, 0, i2, 0);
        TextView textView2 = this.b;
        measureChildWithMargins(textView2, i, 0, i2, 0);
        measureChildWithMargins(this.c, i, 0, i2, 0);
        Switch r7 = this.d;
        if (r7 != null) {
            measureChildWithMargins(r7, i, 0, i2, 0);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), ls6.e(20.0f, textView2.getMeasuredHeight() + textView.getMeasuredHeight(), gl.L(64.0f)) + (this.e ? 1 : 0));
    }

    public void setChecked(boolean z) {
        Switch r1 = this.d;
        if (r1 != null) {
            r1.c(z, true);
        }
    }
}
