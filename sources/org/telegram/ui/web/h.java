package org.telegram.ui.web;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import g7.e6;
import g7.g6;
import kh.k3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.w5;
import org.telegram.ui.Components.o9;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class h extends FrameLayout implements w5 {
    public final b6 a;
    public final o9 b;
    public final LinearLayout c;
    public final FrameLayout.LayoutParams d;
    public final TextView e;
    public final TextView f;
    public final TextView h;
    public final ImageView n;
    public final k3 r;
    public int s;
    public final Paint v;
    public boolean w;

    public h(Context context, b6 b6Var) {
        super(context);
        this.v = new Paint(1);
        this.a = b6Var;
        g6.b(this, 0.03f, 1.25f);
        o9 o9Var = new o9(context);
        this.b = o9Var;
        o9Var.setRoundRadius(AndroidUtilities.dp(6.0f));
        addView(o9Var, e6.d(32, 32.0f, 19, 10.0f, 8.0f, 8.0f, 8.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.c = linearLayout;
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTextSize(1, 16.0f);
        textView.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        linearLayout.addView(textView, e6.q(-1, -2, 51));
        TextView textView2 = new TextView(context);
        this.f = textView2;
        textView2.setTextSize(1, 13.0f);
        textView2.setMaxLines(1);
        textView2.setEllipsize(truncateAt);
        linearLayout.addView(textView2, e6.t(-1, -2, 51, 0, 3, 0, 0));
        FrameLayout.LayoutParams d = e6.d(-1, -2.0f, 19, 64.0f, 0.0f, 70.0f, 0.0f);
        this.d = d;
        addView(linearLayout, d);
        TextView textView3 = new TextView(context);
        this.h = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setMaxLines(1);
        textView3.setEllipsize(truncateAt);
        textView3.setGravity(5);
        textView3.setTextAlignment(6);
        addView(textView3, e6.d(-2, -2.0f, 21, 64.0f, -10.0f, 12.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.n = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.attach_arrow_right);
        addView(imageView, e6.d(32, 32.0f, 21, 8.0f, 8.0f, 8.0f, 8.0f));
        k3 k3Var = new k3(this, getContext(), b6Var, 2);
        this.r = k3Var;
        k3Var.b(-1, f6.d6, f6.k7);
        k3Var.setDrawUnchecked(false);
        k3Var.setDrawBackgroundAsArc(3);
        addView(k3Var, e6.d(24, 24.0f, 19, 26.0f, 12.0f, 0.0f, 0.0f));
    }

    @Override // org.telegram.ui.ActionBar.w5
    public final void d() {
        int i9 = f6.d6;
        b6 b6Var = this.a;
        int v02 = f6.v0(i9, b6Var);
        int v03 = f6.v0(f6.G6, b6Var);
        this.s = v03;
        this.e.setTextColor(v03);
        this.f.setTextColor(f6.v(v02, f6.l1(0.55f, v03)));
        this.h.setTextColor(f6.l1(0.55f, v03));
        this.n.setColorFilter(new PorterDuffColorFilter(f6.l1(0.6f, v03), PorterDuff.Mode.SRC_IN));
        this.v.setColor(f6.l1(0.1f, v03));
        this.b.invalidate();
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.w) {
            canvas.drawRect(AndroidUtilities.dp(59.0f), getHeight() - Math.max(AndroidUtilities.dp(0.66f), 1), getWidth(), getHeight(), this.v);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), TLObject.FLAG_30));
    }

    public void setChecked(boolean z10) {
        this.r.a(z10, true);
    }
}
