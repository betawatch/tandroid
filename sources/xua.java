// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class xua extends FrameLayout {
    public final wjb a;
    public final Drawable b;
    public final Drawable c;
    public final TextView d;
    public final hn e;
    public SpannableString f;
    public boolean h;
    public int n;
    public final lm r;

    public xua(Context context, wjb wjbVar) {
        super(context);
        this.r = new lm(this, 0L, 500L, s33.h);
        this.a = wjbVar;
        Drawable d = b00.d(context, R.drawable.star_small_outline);
        this.b = d;
        zkb.x(this, d, bkb.g5, wjbVar, PorterDuff.Mode.SRC_IN);
        this.c = b00.d(context, R.drawable.star_small_inner);
        setWillNotDraw(false);
        TextView textView = new TextView(context);
        this.d = textView;
        ug8.v(textView, 1, 15.0f);
        zkb.X(textView, bkb.F6, wjbVar);
        addView(textView, nme.i(-2.0f, -2.0f, 8388627, 48.0f, 0.0f, 0.0f, 0.0f));
        hn hnVar = new hn(context, false, false, false);
        this.e = hnVar;
        hnVar.setTextSize(gl.L(15.0f));
        zkb.U(hnVar, bkb.y6, wjbVar);
        hnVar.setGravity(k96.a0 ? 3 : 5);
        addView(hnVar, nme.i(-2.0f, 21.0f, 8388629, 0.0f, 0.0f, 19.0f, 0.0f));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float e = this.r.e(false, this.n);
        float f = k96.a0 ? -1.0f : 1.0f;
        float L = gl.L(24.0f);
        float L2 = gl.L(24.0f);
        float L3 = gl.L(2.5f);
        float width = k96.a0 ? (getWidth() - gl.L(19.0f)) - L : gl.L(19.0f);
        int ceil = (int) Math.ceil(e);
        while (true) {
            ceil--;
            if (ceil < 0) {
                break;
            }
            float i = Utilities.i(e - ceil, 1.0f, 0.0f);
            float f2 = (((ceil - 1) - (1.0f - i)) * L3 * f) + width;
            float measuredHeight = (getMeasuredHeight() - L2) / 2.0f;
            int i2 = (int) f2;
            int i3 = (int) measuredHeight;
            int i4 = (int) (f2 + L);
            int i5 = (int) (measuredHeight + L2);
            Drawable drawable = this.b;
            drawable.setBounds(i2, i3, i4, i5);
            int i6 = (int) (i * 255.0f);
            drawable.setAlpha(i6);
            drawable.draw(canvas);
            Drawable drawable2 = this.c;
            drawable2.setBounds(i2, i3, i4, i5);
            drawable2.setAlpha(i6);
            drawable2.draw(canvas);
        }
        if (this.h) {
            wjb wjbVar = this.a;
            Paint d = wjbVar != null ? wjbVar.d("paintDivider") : null;
            if (d == null) {
                d = bkb.j0;
            }
            canvas.drawRect(k96.a0 ? 0.0f : gl.L(22.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (k96.a0 ? gl.L(22.0f) : 0), getMeasuredHeight(), d);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(48.0f), TLObject.FLAG_30));
    }
}
