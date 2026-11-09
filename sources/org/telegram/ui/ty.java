package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class ty extends FrameLayout {
    public final TextView a;
    public final ImageView b;
    public boolean c;

    public ty(Context context) {
        super(context);
        TextView textView = new TextView(context);
        this.a = textView;
        org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.q6, null);
        jg.g.v(textView, 1, 16.0f, null, 2131751713);
        textView.setGravity(org.telegram.messenger.id.a0 ? 5 : 3);
        boolean z9 = org.telegram.messenger.id.a0;
        textView.setPadding(z9 ? 16 : 0, 0, z9 ? 0 : 16, 0);
        boolean z10 = org.telegram.messenger.id.a0;
        addView(textView, c8.ha.d(-1, -2.0f, 23, z10 ? 0.0f : 64.0f, 0.0f, z10 ? 64.0f : 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
        Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
        int i7 = org.telegram.ui.ActionBar.l6.Ci;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.s6.x(this, drawable, i7, null, mode);
        org.telegram.ui.ActionBar.s6.x(this, drawable2, org.telegram.ui.ActionBar.l6.k7, null, mode);
        imageView.setImageDrawable(new org.telegram.ui.Components.xp(drawable, drawable2));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        boolean z11 = org.telegram.messenger.id.a0;
        addView(imageView, c8.ha.d(32, 32.0f, (z11 ? 5 : 3) | 16, z11 ? 0.0f : 16.0f, 0.0f, z11 ? 16.0f : 0.0f, 0.0f));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.c) {
            TextView textView = this.a;
            canvas.drawRect(textView.getLeft(), getMeasuredHeight() - 1, textView.getRight(), getMeasuredHeight(), org.telegram.ui.ActionBar.l6.k0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(45.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final void setEnabled(boolean z9) {
        super.setEnabled(z9);
        this.a.setAlpha(z9 ? 1.0f : 0.5f);
        this.b.setAlpha(z9 ? 1.0f : 0.5f);
    }
}
