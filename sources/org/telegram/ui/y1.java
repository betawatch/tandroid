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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class y1 extends HorizontalScrollView implements org.telegram.ui.ActionBar.z5, d3 {
    public final i50 a;
    public final FrameLayout b;
    public final ImageView c;
    public int d;

    public y1(Context context, i50 i50Var) {
        super(context);
        this.a = i50Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        addView(frameLayout, b8.mf.c(-2.0f, -2));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        frameLayout.addView(imageView, b8.mf.c(-2.0f, -2));
        updateColors();
    }

    @Override // org.telegram.ui.d3
    public int getBoundLeft() {
        if (this.d > getMeasuredWidth()) {
            return 0;
        }
        return (getMeasuredWidth() - this.d) / 2;
    }

    @Override // org.telegram.ui.d3
    public int getBoundRight() {
        return this.d > getMeasuredWidth() ? getMeasuredWidth() : (getMeasuredWidth() + this.d) / 2;
    }

    @Override // org.telegram.ui.d3
    public int getLastLineBoundRight() {
        return getBoundRight();
    }

    public int getMinWidth() {
        return this.d;
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        int i13 = i11 - i3;
        int i14 = this.d;
        if (i14 > i13) {
            super.onLayout(z10, i3, i10, i11, i12);
        } else {
            FrameLayout frameLayout = this.b;
            frameLayout.layout((i13 - i14) / 2, 0, (i13 + i14) / 2, frameLayout.getMeasuredHeight());
        }
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), TLObject.FLAG_30), i10);
    }

    public void setBlock(TL_iv.pageBlockMath pageblockmath) {
        mi.q a10;
        ImageView imageView = this.c;
        imageView.setImageBitmap(null);
        i50 i50Var = this.a;
        i50Var.getClass();
        float f10 = 18;
        int L = org.telegram.messenger.g0.L(f10);
        i50Var.getClass();
        imageView.setPadding(L, 0, org.telegram.messenger.g0.L(f10), 0);
        imageView.setLayoutParams(new FrameLayout.LayoutParams(0, 0));
        i50Var.getClass();
        float f11 = 36;
        this.d = org.telegram.messenger.g0.L(f11);
        if (pageblockmath == null || (a10 = mi.q.a(pageblockmath.source, org.telegram.messenger.g0.L(20.0f), false)) == null) {
            return;
        }
        imageView.setImageBitmap(a10.a);
        int i3 = a10.b;
        i50Var.getClass();
        int L2 = org.telegram.messenger.g0.L(f11) + i3;
        this.d = L2;
        imageView.setLayoutParams(new FrameLayout.LayoutParams(L2, a10.c));
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        ((i4) this.a).getClass();
        this.c.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.G6), PorterDuff.Mode.SRC_IN));
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
