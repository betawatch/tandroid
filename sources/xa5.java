// default package

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class xa5 extends FrameLayout {
    public Drawable a;
    public TextView b;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable drawable = this.a;
        drawable.setBounds(0, getMeasuredHeight() - gl.L(3.0f), getMeasuredWidth(), getMeasuredHeight());
        drawable.draw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(40.0f), TLObject.FLAG_30));
    }

    public void setText(String str) {
        this.b.setText(str);
    }
}
