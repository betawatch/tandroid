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

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class x1 extends HorizontalScrollView implements org.telegram.ui.ActionBar.a6, c3 {
    public final o50 a;
    public final FrameLayout b;
    public final ImageView c;
    public int d;

    public x1(Context context, o50 o50Var) {
        super(context);
        this.a = o50Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        addView(frameLayout, c8.ha.c(-2.0f, -2));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        frameLayout.addView(imageView, c8.ha.c(-2.0f, -2));
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
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int i13 = i11 - i7;
        int i14 = this.d;
        if (i14 > i13) {
            super.onLayout(z9, i7, i10, i11, i12);
        } else {
            FrameLayout frameLayout = this.b;
            frameLayout.layout((i13 - i14) / 2, 0, (i13 + i14) / 2, frameLayout.getMeasuredHeight());
        }
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), i10);
    }

    public void setBlock(TL_iv.pageBlockMath pageblockmath) {
        li.q a10;
        ImageView imageView = this.c;
        imageView.setImageBitmap(null);
        o50 o50Var = this.a;
        o50Var.getClass();
        float f10 = 18;
        int L = org.telegram.messenger.g0.L(f10);
        o50Var.getClass();
        imageView.setPadding(L, 0, org.telegram.messenger.g0.L(f10), 0);
        imageView.setLayoutParams(new FrameLayout.LayoutParams(0, 0));
        o50Var.getClass();
        float f11 = 36;
        this.d = org.telegram.messenger.g0.L(f11);
        if (pageblockmath == null || (a10 = li.q.a(pageblockmath.source, org.telegram.messenger.g0.L(20.0f), false)) == null) {
            return;
        }
        imageView.setImageBitmap(a10.a);
        int i7 = a10.b;
        o50Var.getClass();
        int L2 = org.telegram.messenger.g0.L(f11) + i7;
        this.d = L2;
        imageView.setLayoutParams(new FrameLayout.LayoutParams(L2, a10.c));
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        ((g4) this.a).getClass();
        this.c.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.G6), PorterDuff.Mode.SRC_IN));
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
