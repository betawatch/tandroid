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
import b8.mf;
import b8.pf;
import gi.y2;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.z5;
import org.telegram.ui.Components.k9;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final class i extends FrameLayout implements z5 {
    public final e6 a;
    public final k9 b;
    public final LinearLayout c;
    public final FrameLayout.LayoutParams d;
    public final TextView e;
    public final TextView f;
    public final TextView h;
    public final ImageView n;
    public final y2 r;
    public int s;
    public final Paint w;
    public boolean x;

    public i(Context context, e6 e6Var) {
        super(context);
        this.w = new Paint(1);
        this.a = e6Var;
        pf.b(this, 0.03f, 1.25f);
        k9 k9Var = new k9(context);
        this.b = k9Var;
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(6.0f));
        addView(k9Var, mf.d(32, 32.0f, 19, 10.0f, 8.0f, 8.0f, 8.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.c = linearLayout;
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTextSize(1, 16.0f);
        textView.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        linearLayout.addView(textView, mf.r(-1, -2, 51));
        TextView textView2 = new TextView(context);
        this.f = textView2;
        textView2.setTextSize(1, 13.0f);
        textView2.setMaxLines(1);
        textView2.setEllipsize(truncateAt);
        linearLayout.addView(textView2, mf.t(-1, -2, 51, 0, 3, 0, 0));
        FrameLayout.LayoutParams d = mf.d(-1, -2.0f, 19, 64.0f, 0.0f, 70.0f, 0.0f);
        this.d = d;
        addView(linearLayout, d);
        TextView textView3 = new TextView(context);
        this.h = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setMaxLines(1);
        textView3.setEllipsize(truncateAt);
        textView3.setGravity(5);
        textView3.setTextAlignment(6);
        addView(textView3, mf.d(-2, -2.0f, 21, 64.0f, -10.0f, 12.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.n = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.attach_arrow_right);
        addView(imageView, mf.d(32, 32.0f, 21, 8.0f, 8.0f, 8.0f, 8.0f));
        y2 y2Var = new y2(this, getContext(), e6Var, 2);
        this.r = y2Var;
        y2Var.b(-1, k6.d6, k6.k7);
        y2Var.setDrawUnchecked(false);
        y2Var.setDrawBackgroundAsArc(3);
        addView(y2Var, mf.d(24, 24.0f, 19, 26.0f, 12.0f, 0.0f, 0.0f));
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(k6.d6));
        hashSet.add(Integer.valueOf(k6.G6));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.x) {
            canvas.drawRect(org.telegram.messenger.g0.L(59.0f), getHeight() - Math.max(org.telegram.messenger.g0.L(0.66f), 1), getWidth(), getHeight(), this.w);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(56.0f), TLObject.FLAG_30));
    }

    public void setChecked(boolean z10) {
        this.r.a(z10, true);
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        int i3 = k6.d6;
        e6 e6Var = this.a;
        int w02 = k6.w0(i3, e6Var);
        int w03 = k6.w0(k6.G6, e6Var);
        this.s = w03;
        this.e.setTextColor(w03);
        this.f.setTextColor(k6.w(w02, k6.r1(0.55f, w03)));
        this.h.setTextColor(k6.r1(0.55f, w03));
        this.n.setColorFilter(new PorterDuffColorFilter(k6.r1(0.6f, w03), PorterDuff.Mode.SRC_IN));
        this.w.setColor(k6.r1(0.1f, w03));
        this.b.invalidate();
    }
}
