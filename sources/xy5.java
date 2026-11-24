// default package

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.RadioButton;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class xy5 extends FrameLayout {
    public final RadioButton a;
    public final TextView b;
    public final TextView c;
    public boolean d;
    public hb6 e;
    public final byte f;

    public xy5(Context context) {
        super(context);
        this.f = (byte) 62;
        if (cmb.j0 == null) {
            cmb.Q(context);
        }
        setWillNotDraw(false);
        RadioButton radioButton = new RadioButton(context);
        this.a = radioButton;
        radioButton.setSize(gm.L(20.0f));
        anb.O(radioButton, cmb.C5, cmb.D5, null);
        boolean z = jb6.a0;
        addView(radioButton, qoe.d(22, 22.0f, (z ? 5 : 3) | 16, z ? 0 : 20, 0.0f, z ? 20 : 0, 0.0f));
        TextView textView = new TextView(context);
        this.b = textView;
        anb.X(textView, cmb.i5, null);
        textView.setTextSize(1, 16.0f);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setGravity((jb6.a0 ? 5 : 3) | 16);
        boolean z2 = jb6.a0;
        addView(textView, qoe.d(-1, -1.0f, (z2 ? 5 : 3) | 48, z2 ? 23.0f : 62.0f, 0.0f, z2 ? 62.0f : 23.0f, 17.0f));
        TextView textView2 = new TextView(context);
        this.c = textView2;
        anb.X(textView2, cmb.q5, null);
        textView2.setTextSize(1, 13.0f);
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        textView2.setGravity((jb6.a0 ? 5 : 3) | 16);
        boolean z3 = jb6.a0;
        addView(textView2, qoe.d(-1, -1.0f, (z3 ? 5 : 3) | 48, z3 ? 23.0f : 62.0f, 20.0f, z3 ? 62.0f : 23.0f, 0.0f));
    }

    public hb6 getCurrentLocale() {
        return this.e;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.d) {
            boolean z = jb6.a0;
            byte b = this.f;
            canvas.drawLine(z ? 0.0f : gm.L(b - 3), getMeasuredHeight() - 1, getMeasuredWidth() - (jb6.a0 ? gm.L(b - 3) : 0), getMeasuredHeight() - 1, cmb.j0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(60.0f) + (this.d ? 1 : 0), TLObject.FLAG_30));
    }
}
