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
import k7.c6;
import k7.e6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.p9;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class h extends FrameLayout implements b6 {
    public final g6 a;
    public final p9 b;
    public final LinearLayout c;
    public final FrameLayout.LayoutParams d;
    public final TextView e;
    public final TextView f;
    public final TextView h;
    public final ImageView n;
    public final org.telegram.ui.Cells.k2 r;
    public int s;
    public final Paint v;
    public boolean w;

    public h(Context context, g6 g6Var) {
        super(context);
        this.v = new Paint(1);
        this.a = g6Var;
        e6.b(this, 0.03f, 1.25f);
        p9 p9Var = new p9(context);
        this.b = p9Var;
        p9Var.setRoundRadius(AndroidUtilities.dp(6.0f));
        addView(p9Var, c6.d(32, 32.0f, 19, 10.0f, 8.0f, 8.0f, 8.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.c = linearLayout;
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTextSize(1, 16.0f);
        textView.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        linearLayout.addView(textView, c6.q(-1, -2, 51));
        TextView textView2 = new TextView(context);
        this.f = textView2;
        textView2.setTextSize(1, 13.0f);
        textView2.setMaxLines(1);
        textView2.setEllipsize(truncateAt);
        linearLayout.addView(textView2, c6.t(-1, -2, 51, 0, 3, 0, 0));
        FrameLayout.LayoutParams d = c6.d(-1, -2.0f, 19, 64.0f, 0.0f, 70.0f, 0.0f);
        this.d = d;
        addView(linearLayout, d);
        TextView textView3 = new TextView(context);
        this.h = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setMaxLines(1);
        textView3.setEllipsize(truncateAt);
        textView3.setGravity(5);
        textView3.setTextAlignment(6);
        addView(textView3, c6.d(-2, -2.0f, 21, 64.0f, -10.0f, 12.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.n = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.attach_arrow_right);
        addView(imageView, c6.d(32, 32.0f, 21, 8.0f, 8.0f, 8.0f, 8.0f));
        org.telegram.ui.Cells.k2 k2Var = new org.telegram.ui.Cells.k2(this, getContext(), g6Var, 1);
        this.r = k2Var;
        k2Var.b(-1, k6.d6, k6.k7);
        k2Var.setDrawUnchecked(false);
        k2Var.setDrawBackgroundAsArc(3);
        addView(k2Var, c6.d(24, 24.0f, 19, 26.0f, 12.0f, 0.0f, 0.0f));
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void e() {
        int i10 = k6.d6;
        g6 g6Var = this.a;
        int v02 = k6.v0(i10, g6Var);
        int v03 = k6.v0(k6.G6, g6Var);
        this.s = v03;
        this.e.setTextColor(v03);
        this.f.setTextColor(k6.v(v02, k6.l1(0.55f, v03)));
        this.h.setTextColor(k6.l1(0.55f, v03));
        this.n.setColorFilter(new PorterDuffColorFilter(k6.l1(0.6f, v03), PorterDuff.Mode.SRC_IN));
        this.v.setColor(k6.l1(0.1f, v03));
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

    public void setChecked(boolean z4) {
        this.r.a(z4, true);
    }
}
