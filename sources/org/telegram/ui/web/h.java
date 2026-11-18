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
import c8.ma;
import c8.ra;
import hi.z2;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.q9;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class h extends FrameLayout implements c6 {
    public final i6 a;
    public final q9 b;
    public final LinearLayout c;
    public final FrameLayout.LayoutParams d;
    public final TextView e;
    public final TextView f;
    public final TextView h;
    public final ImageView n;
    public final z2 r;
    public int s;
    public final Paint w;
    public boolean x;

    public h(Context context, i6 i6Var) {
        super(context);
        this.w = new Paint(1);
        this.a = i6Var;
        ra.b(this, 0.03f, 1.25f);
        q9 q9Var = new q9(context);
        this.b = q9Var;
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(6.0f));
        addView(q9Var, ma.d(32, 32.0f, 19, 10.0f, 8.0f, 8.0f, 8.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.c = linearLayout;
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTextSize(1, 16.0f);
        textView.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        linearLayout.addView(textView, ma.r(-1, -2, 51));
        TextView textView2 = new TextView(context);
        this.f = textView2;
        textView2.setTextSize(1, 13.0f);
        textView2.setMaxLines(1);
        textView2.setEllipsize(truncateAt);
        linearLayout.addView(textView2, ma.t(-1, -2, 51, 0, 3, 0, 0));
        FrameLayout.LayoutParams d = ma.d(-1, -2.0f, 19, 64.0f, 0.0f, 70.0f, 0.0f);
        this.d = d;
        addView(linearLayout, d);
        TextView textView3 = new TextView(context);
        this.h = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setMaxLines(1);
        textView3.setEllipsize(truncateAt);
        textView3.setGravity(5);
        textView3.setTextAlignment(6);
        addView(textView3, ma.d(-2, -2.0f, 21, 64.0f, -10.0f, 12.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.n = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.attach_arrow_right);
        addView(imageView, ma.d(32, 32.0f, 21, 8.0f, 8.0f, 8.0f, 8.0f));
        z2 z2Var = new z2(this, getContext(), i6Var, 2);
        this.r = z2Var;
        z2Var.b(-1, n6.d6, n6.k7);
        z2Var.setDrawUnchecked(false);
        z2Var.setDrawBackgroundAsArc(3);
        addView(z2Var, ma.d(24, 24.0f, 19, 26.0f, 12.0f, 0.0f, 0.0f));
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(n6.d6));
        hashSet.add(Integer.valueOf(n6.G6));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.x) {
            canvas.drawRect(org.telegram.messenger.g0.L(59.0f), getHeight() - Math.max(org.telegram.messenger.g0.L(0.66f), 1), getWidth(), getHeight(), this.w);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(56.0f), TLObject.FLAG_30));
    }

    public void setChecked(boolean z10) {
        this.r.a(z10, true);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        int i7 = n6.d6;
        i6 i6Var = this.a;
        int w02 = n6.w0(i7, i6Var);
        int w03 = n6.w0(n6.G6, i6Var);
        this.s = w03;
        this.e.setTextColor(w03);
        this.f.setTextColor(n6.w(w02, n6.r1(0.55f, w03)));
        this.h.setTextColor(n6.r1(0.55f, w03));
        this.n.setColorFilter(new PorterDuffColorFilter(n6.r1(0.6f, w03), PorterDuff.Mode.SRC_IN));
        this.w.setColor(n6.r1(0.1f, w03));
        this.b.invalidate();
    }
}
