package yg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.messenger.n10;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n5;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.mq;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class b extends FrameLayout {
    public final n5 a;
    public final ImageView b;

    public b(Context context, i6 i6Var) {
        super(context);
        n5 n5Var = new n5(context);
        this.a = n5Var;
        n5Var.setTextSize(16);
        n5Var.setGravity(gd.a0 ? 5 : 3);
        int i7 = n6.L6;
        u6.X(n5Var, i7, i6Var);
        n5Var.setTag(Integer.valueOf(i7));
        addView(n5Var);
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView);
        n5Var.k(gd.M0(2131753601, null));
        Drawable drawable = getResources().getDrawable(R.drawable.poll_add_circle);
        Drawable drawable2 = getResources().getDrawable(R.drawable.poll_add_plus);
        int i10 = n6.N6;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        u6.x(this, drawable, i10, i6Var, mode);
        u6.x(this, drawable2, n6.k7, i6Var, mode);
        imageView.setImageDrawable(new mq(drawable, drawable2));
        u6.h(n6.h5, this, i6Var);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int L;
        int i13 = i11 - i7;
        n5 n5Var = this.a;
        int textHeight = ((i12 - i10) - n5Var.getTextHeight()) / 2;
        boolean z11 = gd.a0;
        ImageView imageView = this.b;
        if (z11) {
            L = (getMeasuredWidth() - n5Var.getMeasuredWidth()) - g0.L(imageView.getVisibility() == 0 ? 68.0f : 23.0f);
        } else {
            L = g0.L(imageView.getVisibility() == 0 ? 68.0f : 23.0f);
        }
        n5Var.layout(L, textHeight, n5Var.getMeasuredWidth() + L, n5Var.getMeasuredHeight() + textHeight);
        int L2 = !gd.a0 ? g0.L(24.0f) : (i13 - imageView.getMeasuredWidth()) - g0.L(24.0f);
        imageView.layout(L2, 0, imageView.getMeasuredWidth() + L2, imageView.getMeasuredHeight());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        this.a.measure(n10.c(94.0f, size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(g0.L(20.0f), TLObject.FLAG_30));
        this.b.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(g0.L(50.0f), TLObject.FLAG_30));
        setMeasuredDimension(size, g0.L(50.0f));
    }
}
