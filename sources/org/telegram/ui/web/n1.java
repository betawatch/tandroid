package org.telegram.ui.web;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import c8.ha;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.a6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.i5;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final class n1 extends FrameLayout implements a6 {
    public final ImageView a;
    public final TextView b;
    public final m2 c;
    public i5 d;
    public String e;
    public boolean f;
    public ShapeDrawable h;

    public n1(Context context) {
        super(context);
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        addView(imageView, ha.d(32, 32.0f, 19, 16.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.b = textView;
        r6.V(textView, k6.G6, null);
        textView.setTextSize(1, 16.0f);
        textView.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        addView(textView, ha.d(-1, -2.0f, 55, 68.0f, 7.0f, 54.0f, 0.0f));
        m2 m2Var = new m2(11, context, this);
        this.c = m2Var;
        r6.V(m2Var, k6.y6, null);
        m2Var.setTextSize(1, 13.0f);
        m2Var.setMaxLines(1);
        m2Var.setEllipsize(truncateAt);
        m2Var.setPivotX(0.0f);
        addView(m2Var, ha.d(-1, -2.0f, 55, 68.0f, 30.0f, 54.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setImageResource(R.drawable.ic_ab_other);
        r6.t(imageView2, k6.A6, null, PorterDuff.Mode.SRC_IN);
        addView(imageView2, ha.d(32, 32.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f) {
            canvas.drawRect(org.telegram.messenger.g0.L(64.0f), getHeight() - 1, getWidth(), getHeight(), k6.k0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(56.0f), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        try {
            ShapeDrawable shapeDrawable = this.h;
            if (shapeDrawable != null) {
                k6.C1(k6.r1(0.1f, k6.x0(null, k6.G6, false)), shapeDrawable);
                ImageView imageView = this.a;
                if (imageView != null) {
                    imageView.invalidate();
                }
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
