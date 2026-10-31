package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class vj0 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public boolean a;
    public int b;
    public final int c;
    public final org.telegram.ui.ActionBar.p6 d;
    public final FrameLayout e;
    public final org.telegram.ui.Components.g9 f;
    public final TextView h;
    public final TextView n;
    public final ImageView r;
    public boolean s;
    public String w;

    public vj0(int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.c = i10;
        this.d = p6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        addView(frameLayout, w7.b6.d(36, 36.0f, 19, 18.5f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(context);
        this.f = g9Var;
        g9Var.setImageResource(R.drawable.msg2_permissions);
        a();
        frameLayout.addView(g9Var, w7.b6.e(36, 36, 17));
        TextView b10 = w7.g6.b(context, 15.0f, org.telegram.ui.ActionBar.t6.G6, true, null);
        this.h = b10;
        b10.setSingleLine();
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        b10.setEllipsize(truncateAt);
        addView(b10, w7.b6.d(-1, -2.0f, 55, 72.0f, 8.0f, 46.0f, 0.0f));
        int i11 = org.telegram.ui.ActionBar.t6.y6;
        TextView b11 = w7.g6.b(context, 13.0f, i11, false, null);
        this.n = b11;
        b11.setSingleLine();
        b11.setEllipsize(truncateAt);
        addView(b11, w7.b6.d(-1, -2.0f, 55, 72.0f, 31.0f, 46.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.r = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_ab_other);
        org.telegram.ui.ActionBar.a7.t(imageView, i11, null, PorterDuff.Mode.SRC_IN);
        int i12 = org.telegram.ui.ActionBar.t6.i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i12, p6Var), 1, -1);
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i12);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.a7.k(imageView, h02, null, N, p6Var);
        addView(imageView, w7.b6.d(32, 32.0f, 21, 0.0f, 0.0f, 13.0f, 0.0f));
    }

    public final void a() {
        this.b = org.telegram.ui.ActionBar.t6.r1(0.3f, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G6, this.d));
        this.a = true;
        this.f.setColorFilter(new PorterDuffColorFilter(this.b, PorterDuff.Mode.SRC_IN));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.s) {
            Paint W0 = org.telegram.ui.ActionBar.t6.W0("paintDivider", this.d);
            if (W0 == null) {
                W0 = org.telegram.ui.ActionBar.t6.k0;
            }
            canvas.drawRect(org.telegram.messenger.i0.L(org.telegram.messenger.cd.X ? 0.0f : 72.0f), getMeasuredHeight() - 1, getWidth() - org.telegram.messenger.i0.L(org.telegram.messenger.cd.X ? 72.0f : 0.0f), getMeasuredHeight(), W0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(56.0f), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        org.telegram.ui.Components.g9 g9Var;
        int r12;
        try {
            if (!this.a || (g9Var = this.f) == null || (r12 = org.telegram.ui.ActionBar.t6.r1(0.3f, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G6, this.d))) == this.b) {
                return;
            }
            this.b = r12;
            g9Var.setColorFilter(new PorterDuffColorFilter(r12, PorterDuff.Mode.SRC_IN));
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
