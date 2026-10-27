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
import fi.i3;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.y9;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class i extends FrameLayout implements p6 {
    public final u6 a;
    public final y9 b;
    public final LinearLayout c;
    public final FrameLayout.LayoutParams d;
    public final TextView e;
    public final TextView f;
    public final TextView h;
    public final ImageView n;
    public final i3 r;
    public int s;
    public final Paint v;
    public boolean w;

    public i(Context context, u6 u6Var) {
        super(context);
        this.v = new Paint(1);
        this.a = u6Var;
        kb1.c(this, 0.03f, 1.25f);
        y9 y9Var = new y9(context);
        this.b = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(6.0f));
        addView(y9Var, kb1.h(32, 32.0f, 19, 10.0f, 8.0f, 8.0f, 8.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.c = linearLayout;
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTextSize(1, 16.0f);
        textView.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        linearLayout.addView(textView, kb1.u(-1, -2, 51));
        TextView textView2 = new TextView(context);
        this.f = textView2;
        textView2.setTextSize(1, 13.0f);
        textView2.setMaxLines(1);
        textView2.setEllipsize(truncateAt);
        linearLayout.addView(textView2, kb1.x(-1, -2, 51, 0, 3, 0, 0));
        FrameLayout.LayoutParams h = kb1.h(-1, -2.0f, 19, 64.0f, 0.0f, 70.0f, 0.0f);
        this.d = h;
        addView(linearLayout, h);
        TextView textView3 = new TextView(context);
        this.h = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setMaxLines(1);
        textView3.setEllipsize(truncateAt);
        textView3.setGravity(5);
        textView3.setTextAlignment(6);
        addView(textView3, kb1.h(-2, -2.0f, 21, 64.0f, -10.0f, 12.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.n = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.attach_arrow_right);
        addView(imageView, kb1.h(32, 32.0f, 21, 8.0f, 8.0f, 8.0f, 8.0f));
        i3 i3Var = new i3(this, getContext(), u6Var, 2);
        this.r = i3Var;
        i3Var.b(-1, y6.d6, y6.k7);
        i3Var.setDrawUnchecked(false);
        i3Var.setDrawBackgroundAsArc(3);
        addView(i3Var, kb1.h(24, 24.0f, 19, 26.0f, 12.0f, 0.0f, 0.0f));
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(y6.d6));
        hashSet.add(Integer.valueOf(y6.G6));
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

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        int i10 = y6.d6;
        u6 u6Var = this.a;
        int w02 = y6.w0(i10, u6Var);
        int w03 = y6.w0(y6.G6, u6Var);
        this.s = w03;
        this.e.setTextColor(w03);
        this.f.setTextColor(y6.v(w02, y6.o1(0.55f, w03)));
        this.h.setTextColor(y6.o1(0.55f, w03));
        this.n.setColorFilter(new PorterDuffColorFilter(y6.o1(0.6f, w03), PorterDuff.Mode.SRC_IN));
        this.v.setColor(y6.o1(0.1f, w03));
        this.b.invalidate();
    }
}
