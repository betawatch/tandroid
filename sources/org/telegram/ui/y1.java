package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class y1 extends HorizontalScrollView implements org.telegram.ui.ActionBar.k6, c3 {
    public final m60 a;
    public final FrameLayout b;
    public final ImageView c;
    public int d;

    public y1(Context context, m60 m60Var) {
        super(context);
        this.a = m60Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        addView(frameLayout, w7.b6.c(-2.0f, -2));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        frameLayout.addView(imageView, w7.b6.c(-2.0f, -2));
        updateColors();
    }

    @Override // org.telegram.ui.c3
    public int getBoundLeft() {
        if (this.d > getMeasuredWidth()) {
            return 0;
        }
        return (getMeasuredWidth() - this.d) / 2;
    }

    @Override // org.telegram.ui.c3
    public int getBoundRight() {
        return this.d > getMeasuredWidth() ? getMeasuredWidth() : (getMeasuredWidth() + this.d) / 2;
    }

    @Override // org.telegram.ui.c3
    public int getLastLineBoundRight() {
        return getBoundRight();
    }

    public int getMinWidth() {
        return this.d;
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = i12 - i10;
        int i15 = this.d;
        if (i15 > i14) {
            super.onLayout(z10, i10, i11, i12, i13);
        } else {
            FrameLayout frameLayout = this.b;
            frameLayout.layout((i14 - i15) / 2, 0, (i14 + i15) / 2, frameLayout.getMeasuredHeight());
        }
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), i11);
    }

    public void setBlock(TL_iv.pageBlockMath pageblockmath) {
        bi.u a2;
        ImageView imageView = this.c;
        imageView.setImageBitmap(null);
        m60 m60Var = this.a;
        m60Var.getClass();
        float f7 = 18;
        int L = org.telegram.messenger.i0.L(f7);
        m60Var.getClass();
        imageView.setPadding(L, 0, org.telegram.messenger.i0.L(f7), 0);
        imageView.setLayoutParams(new FrameLayout.LayoutParams(0, 0));
        m60Var.getClass();
        float f10 = 36;
        this.d = org.telegram.messenger.i0.L(f10);
        if (pageblockmath == null || (a2 = bi.u.a(pageblockmath.source, org.telegram.messenger.i0.L(20.0f), false)) == null) {
            return;
        }
        imageView.setImageBitmap(a2.a);
        int i10 = a2.b;
        m60Var.getClass();
        int L2 = org.telegram.messenger.i0.L(f10) + i10;
        this.d = L2;
        imageView.setLayoutParams(new FrameLayout.LayoutParams(L2, a2.c));
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        ((h4) this.a).getClass();
        this.c.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.t6.v0(org.telegram.ui.ActionBar.t6.G6), PorterDuff.Mode.SRC_IN));
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
