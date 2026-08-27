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
import h7.b6;
import h7.z5;
import lh.j3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.x5;
import org.telegram.ui.Components.n9;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class i extends FrameLayout implements x5 {
    public final c6 a;
    public final n9 b;
    public final LinearLayout c;
    public final FrameLayout.LayoutParams d;
    public final TextView e;
    public final TextView f;
    public final TextView h;
    public final ImageView n;
    public final j3 r;
    public int s;
    public final Paint v;
    public boolean w;

    public i(Context context, c6 c6Var) {
        super(context);
        this.v = new Paint(1);
        this.a = c6Var;
        b6.b(this, 0.03f, 1.25f);
        n9 n9Var = new n9(context);
        this.b = n9Var;
        n9Var.setRoundRadius(AndroidUtilities.dp(6.0f));
        addView(n9Var, z5.d(32, 32.0f, 19, 10.0f, 8.0f, 8.0f, 8.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.c = linearLayout;
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTextSize(1, 16.0f);
        textView.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        linearLayout.addView(textView, z5.q(-1, -2, 51));
        TextView textView2 = new TextView(context);
        this.f = textView2;
        textView2.setTextSize(1, 13.0f);
        textView2.setMaxLines(1);
        textView2.setEllipsize(truncateAt);
        linearLayout.addView(textView2, z5.t(-1, -2, 51, 0, 3, 0, 0));
        FrameLayout.LayoutParams d = z5.d(-1, -2.0f, 19, 64.0f, 0.0f, 70.0f, 0.0f);
        this.d = d;
        addView(linearLayout, d);
        TextView textView3 = new TextView(context);
        this.h = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setMaxLines(1);
        textView3.setEllipsize(truncateAt);
        textView3.setGravity(5);
        textView3.setTextAlignment(6);
        addView(textView3, z5.d(-2, -2.0f, 21, 64.0f, -10.0f, 12.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.n = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.attach_arrow_right);
        addView(imageView, z5.d(32, 32.0f, 21, 8.0f, 8.0f, 8.0f, 8.0f));
        j3 j3Var = new j3(this, getContext(), c6Var, 2);
        this.r = j3Var;
        j3Var.b(-1, g6.d6, g6.k7);
        j3Var.setDrawUnchecked(false);
        j3Var.setDrawBackgroundAsArc(3);
        addView(j3Var, z5.d(24, 24.0f, 19, 26.0f, 12.0f, 0.0f, 0.0f));
    }

    @Override // org.telegram.ui.ActionBar.x5
    public final void d() {
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
