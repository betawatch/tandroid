// default package

import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class wz7 extends FrameLayout {
    public TextView a;
    public TextView b;
    public ImageView c;
    public boolean d;

    public final void a(String str, boolean z) {
        this.a.setText(str);
        this.b.setText("");
        this.d = z;
        setWillNotDraw(!z);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.d) {
            canvas.drawLine(jb6.a0 ? 0.0f : gm.L(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (jb6.a0 ? gm.L(20.0f) : 0), getMeasuredHeight() - 1, cmb.j0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(64.0f) + (this.d ? 1 : 0), TLObject.FLAG_30));
    }

    public void setChecked(boolean z) {
        this.c.setVisibility(z ? 0 : 4);
    }

    public void setNeedDivider(boolean z) {
        this.d = z;
        setWillNotDraw(!z);
        invalidate();
    }

    public void setValue(CharSequence charSequence) {
        this.b.setText(charSequence);
    }
}
