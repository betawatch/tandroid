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
import di.o3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.x5;
import org.telegram.ui.Components.z9;
import w7.a6;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class h extends FrameLayout implements x5 {
    public final c6 a;
    public final z9 b;
    public final LinearLayout c;
    public final FrameLayout.LayoutParams d;
    public final TextView e;
    public final TextView f;
    public final TextView h;
    public final ImageView n;
    public final o3 r;
    public int s;
    public final Paint v;
    public boolean w;

    public h(Context context, c6 c6Var) {
        super(context);
        this.v = new Paint(1);
        this.a = c6Var;
        w7.c6.b(this, 0.03f, 1.25f);
        z9 z9Var = new z9(context);
        this.b = z9Var;
        z9Var.setRoundRadius(AndroidUtilities.dp(6.0f));
        addView(z9Var, a6.a(32.0f, 10.0f, 8.0f, 8.0f, 8.0f, 32, 19));
        LinearLayout linearLayout = new LinearLayout(context);
        this.c = linearLayout;
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTextSize(1, 16.0f);
        textView.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        linearLayout.addView(textView, a6.q(-1, -2, 51));
        TextView textView2 = new TextView(context);
        this.f = textView2;
        textView2.setTextSize(1, 13.0f);
        textView2.setMaxLines(1);
        textView2.setEllipsize(truncateAt);
        linearLayout.addView(textView2, a6.t(-1, -2, 51, 0, 3, 0, 0));
        FrameLayout.LayoutParams a2 = a6.a(-2.0f, 64.0f, 0.0f, 70.0f, 0.0f, -1, 19);
        this.d = a2;
        addView(linearLayout, a2);
        TextView textView3 = new TextView(context);
        this.h = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setMaxLines(1);
        textView3.setEllipsize(truncateAt);
        textView3.setGravity(5);
        textView3.setTextAlignment(6);
        addView(textView3, a6.a(-2.0f, 64.0f, -10.0f, 12.0f, 0.0f, -2, 21));
        ImageView imageView = new ImageView(context);
        this.n = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.attach_arrow_right);
        addView(imageView, a6.a(32.0f, 8.0f, 8.0f, 8.0f, 8.0f, 32, 21));
        o3 o3Var = new o3(this, getContext(), c6Var, 2);
        this.r = o3Var;
        o3Var.b(-1, g6.d6, g6.k7);
        o3Var.setDrawUnchecked(false);
        o3Var.setDrawBackgroundAsArc(3);
        addView(o3Var, a6.a(24.0f, 26.0f, 12.0f, 0.0f, 0.0f, 24, 19));
    }

    @Override // org.telegram.ui.ActionBar.x5
    public final void d() {
        int i10 = g6.d6;
        c6 c6Var = this.a;
        int w02 = g6.w0(i10, c6Var);
        int w03 = g6.w0(g6.G6, c6Var);
        this.s = w03;
        this.e.setTextColor(w03);
        this.f.setTextColor(g6.v(w02, g6.m1(0.55f, w03)));
        this.h.setTextColor(g6.m1(0.55f, w03));
        this.n.setColorFilter(new PorterDuffColorFilter(g6.m1(0.6f, w03), PorterDuff.Mode.SRC_IN));
        this.v.setColor(g6.m1(0.1f, w03));
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
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), TLObject.FLAG_30));
    }

    public void setChecked(boolean z10) {
        this.r.a(z10, true);
    }
}
