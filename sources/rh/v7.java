package rh;

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
import org.telegram.messenger.cd;
import org.telegram.messenger.z20;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class v7 extends FrameLayout {
    public final org.telegram.ui.ActionBar.p6 a;
    public final Drawable b;
    public final Drawable c;
    public final TextView d;
    public final org.telegram.ui.Components.f6 e;
    public SpannableString f;
    public boolean h;
    public int n;
    public final org.telegram.ui.Components.t5 r;

    public v7(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.r = new org.telegram.ui.Components.t5(this, 0L, 500L, gr.h);
        this.a = p6Var;
        Drawable f7 = i0.a.f(context, R.drawable.star_small_outline);
        this.b = f7;
        org.telegram.ui.ActionBar.a7.y(this, f7, org.telegram.ui.ActionBar.t6.h5, p6Var, PorterDuff.Mode.SRC_IN);
        this.c = i0.a.f(context, R.drawable.star_small_inner);
        setWillNotDraw(false);
        TextView textView = new TextView(context);
        this.d = textView;
        z20.n(textView, 1, 15.0f);
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.G6, p6Var);
        addView(textView, w7.b6.i(-2.0f, -2.0f, 8388627, 48.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.f6 f6Var = new org.telegram.ui.Components.f6(context, false, false, false);
        this.e = f6Var;
        f6Var.setTextSize(org.telegram.messenger.i0.L(15.0f));
        org.telegram.ui.ActionBar.a7.Z(f6Var, org.telegram.ui.ActionBar.t6.z6, p6Var);
        f6Var.setGravity(cd.X ? 3 : 5);
        addView(f6Var, w7.b6.i(-2.0f, 21.0f, 8388629, 0.0f, 0.0f, 19.0f, 0.0f));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float e = this.r.e(false, this.n);
        float f7 = cd.X ? -1.0f : 1.0f;
        float L = org.telegram.messenger.i0.L(24.0f);
        float L2 = org.telegram.messenger.i0.L(24.0f);
        float L3 = org.telegram.messenger.i0.L(2.5f);
        float width = cd.X ? (getWidth() - org.telegram.messenger.i0.L(19.0f)) - L : org.telegram.messenger.i0.L(19.0f);
        int ceil = ((int) Math.ceil(e)) - 1;
        while (true) {
            if (ceil < 0) {
                break;
            }
            float i10 = Utilities.i(e - ceil, 1.0f, 0.0f);
            float f10 = (((ceil - 1) - (1.0f - i10)) * L3 * f7) + width;
            float measuredHeight = (getMeasuredHeight() - L2) / 2.0f;
            int i11 = (int) f10;
            int i12 = (int) measuredHeight;
            int i13 = (int) (f10 + L);
            int i14 = (int) (measuredHeight + L2);
            Drawable drawable = this.b;
            drawable.setBounds(i11, i12, i13, i14);
            int i15 = (int) (i10 * 255.0f);
            drawable.setAlpha(i15);
            drawable.draw(canvas);
            Drawable drawable2 = this.c;
            drawable2.setBounds(i11, i12, i13, i14);
            drawable2.setAlpha(i15);
            drawable2.draw(canvas);
            ceil--;
        }
        if (this.h) {
            org.telegram.ui.ActionBar.p6 p6Var = this.a;
            Paint d = p6Var != null ? p6Var.d("paintDivider") : null;
            if (d == null) {
                d = org.telegram.ui.ActionBar.t6.k0;
            }
            canvas.drawRect(cd.X ? 0.0f : org.telegram.messenger.i0.L(22.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (cd.X ? org.telegram.messenger.i0.L(22.0f) : 0), getMeasuredHeight(), d);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(48.0f), TLObject.FLAG_30));
    }
}
