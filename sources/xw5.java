// default package

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.RadioButton;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class xw5 extends FrameLayout {
    public final RadioButton a;
    public final TextView b;
    public final TextView c;
    public boolean d;
    public i96 e;
    public final byte f;

    public xw5(Context context) {
        super(context);
        this.f = (byte) 62;
        if (bkb.j0 == null) {
            bkb.Q(context);
        }
        setWillNotDraw(false);
        RadioButton radioButton = new RadioButton(context);
        this.a = radioButton;
        radioButton.setSize(gl.L(20.0f));
        zkb.O(radioButton, bkb.C5, bkb.D5, null);
        boolean z = k96.a0;
        addView(radioButton, nme.d(22, 22.0f, (z ? 5 : 3) | 16, z ? 0 : 20, 0.0f, z ? 20 : 0, 0.0f));
        TextView textView = new TextView(context);
        this.b = textView;
        zkb.X(textView, bkb.i5, null);
        textView.setTextSize(1, 16.0f);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setGravity((k96.a0 ? 5 : 3) | 16);
        boolean z2 = k96.a0;
        addView(textView, nme.d(-1, -1.0f, (z2 ? 5 : 3) | 48, z2 ? 23.0f : 62.0f, 0.0f, z2 ? 62.0f : 23.0f, 17.0f));
        TextView textView2 = new TextView(context);
        this.c = textView2;
        zkb.X(textView2, bkb.q5, null);
        textView2.setTextSize(1, 13.0f);
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        textView2.setGravity((k96.a0 ? 5 : 3) | 16);
        boolean z3 = k96.a0;
        addView(textView2, nme.d(-1, -1.0f, (z3 ? 5 : 3) | 48, z3 ? 23.0f : 62.0f, 20.0f, z3 ? 62.0f : 23.0f, 0.0f));
    }

    public i96 getCurrentLocale() {
        return this.e;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.d) {
            boolean z = k96.a0;
            byte b = this.f;
            canvas.drawLine(z ? 0.0f : gl.L(b - 3), getMeasuredHeight() - 1, getMeasuredWidth() - (k96.a0 ? gl.L(b - 3) : 0), getMeasuredHeight() - 1, bkb.j0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(60.0f) + (this.d ? 1 : 0), TLObject.FLAG_30));
    }
}
