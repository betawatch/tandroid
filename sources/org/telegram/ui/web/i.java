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
import i7.f6;
import i7.h6;
import nh.h3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.x5;
import org.telegram.ui.Components.t9;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class i extends FrameLayout implements x5 {
    public final c6 a;
    public final t9 b;
    public final LinearLayout c;
    public final FrameLayout.LayoutParams d;
    public final TextView e;
    public final TextView f;
    public final TextView h;
    public final ImageView n;
    public final h3 r;
    public int s;
    public final Paint v;
    public boolean w;

    public i(Context context, c6 c6Var) {
        super(context);
        this.v = new Paint(1);
        this.a = c6Var;
        h6.b(this, 0.03f, 1.25f);
        t9 t9Var = new t9(context);
        this.b = t9Var;
        t9Var.setRoundRadius(AndroidUtilities.dp(6.0f));
        addView(t9Var, f6.d(32, 32.0f, 19, 10.0f, 8.0f, 8.0f, 8.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.c = linearLayout;
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTextSize(1, 16.0f);
        textView.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        linearLayout.addView(textView, f6.q(-1, -2, 51));
        TextView textView2 = new TextView(context);
        this.f = textView2;
        textView2.setTextSize(1, 13.0f);
        textView2.setMaxLines(1);
        textView2.setEllipsize(truncateAt);
        linearLayout.addView(textView2, f6.t(-1, -2, 51, 0, 3, 0, 0));
        FrameLayout.LayoutParams d = f6.d(-1, -2.0f, 19, 64.0f, 0.0f, 70.0f, 0.0f);
        this.d = d;
        addView(linearLayout, d);
        TextView textView3 = new TextView(context);
        this.h = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setMaxLines(1);
        textView3.setEllipsize(truncateAt);
        textView3.setGravity(5);
        textView3.setTextAlignment(6);
        addView(textView3, f6.d(-2, -2.0f, 21, 64.0f, -10.0f, 12.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.n = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.attach_arrow_right);
        addView(imageView, f6.d(32, 32.0f, 21, 8.0f, 8.0f, 8.0f, 8.0f));
        h3 h3Var = new h3(this, getContext(), c6Var, 2);
        this.r = h3Var;
        h3Var.b(-1, g6.d6, g6.k7);
        h3Var.setDrawUnchecked(false);
        h3Var.setDrawBackgroundAsArc(3);
        addView(h3Var, f6.d(24, 24.0f, 19, 26.0f, 12.0f, 0.0f, 0.0f));
    }

    @Override // org.telegram.ui.ActionBar.x5
    public final void e() {
        int i10 = g6.d6;
        c6 c6Var = this.a;
        int v02 = g6.v0(i10, c6Var);
        int v03 = g6.v0(g6.G6, c6Var);
        this.s = v03;
        this.e.setTextColor(v03);
        this.f.setTextColor(g6.v(v02, g6.l1(0.55f, v03)));
        this.h.setTextColor(g6.l1(0.55f, v03));
        this.n.setColorFilter(new PorterDuffColorFilter(g6.l1(0.6f, v03), PorterDuff.Mode.SRC_IN));
        this.v.setColor(g6.l1(0.1f, v03));
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
