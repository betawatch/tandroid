package yg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.xp;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class b extends FrameLayout {
    public final k5 a;
    public final ImageView b;

    public b(Context context, f6 f6Var) {
        super(context);
        k5 k5Var = new k5(context);
        this.a = k5Var;
        k5Var.setTextSize(16);
        k5Var.setGravity(hd.a0 ? 5 : 3);
        int i7 = k6.L6;
        r6.Y(k5Var, i7, f6Var);
        k5Var.setTag(Integer.valueOf(i7));
        addView(k5Var);
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView);
        k5Var.k(hd.M0(2131753603, null));
        Drawable drawable = getResources().getDrawable(R.drawable.poll_add_circle);
        Drawable drawable2 = getResources().getDrawable(R.drawable.poll_add_plus);
        int i10 = k6.N6;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        r6.y(this, drawable, i10, f6Var, mode);
        r6.y(this, drawable2, k6.k7, f6Var, mode);
        imageView.setImageDrawable(new xp(drawable, drawable2));
        r6.i(k6.h5, this, f6Var);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int L;
        int i13 = i11 - i7;
        k5 k5Var = this.a;
        int textHeight = ((i12 - i10) - k5Var.getTextHeight()) / 2;
        boolean z10 = hd.a0;
        ImageView imageView = this.b;
        if (z10) {
            L = (getMeasuredWidth() - k5Var.getMeasuredWidth()) - g0.L(imageView.getVisibility() == 0 ? 68.0f : 23.0f);
        } else {
            L = g0.L(imageView.getVisibility() == 0 ? 68.0f : 23.0f);
        }
        k5Var.layout(L, textHeight, k5Var.getMeasuredWidth() + L, k5Var.getMeasuredHeight() + textHeight);
        int L2 = !hd.a0 ? g0.L(24.0f) : (i13 - imageView.getMeasuredWidth()) - g0.L(24.0f);
        imageView.layout(L2, 0, imageView.getMeasuredWidth() + L2, imageView.getMeasuredHeight());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        this.a.measure(org.telegram.messenger.camera.q.c(94.0f, size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(g0.L(20.0f), TLObject.FLAG_30));
        this.b.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(g0.L(50.0f), TLObject.FLAG_30));
        setMeasuredDimension(size, g0.L(50.0f));
    }
}
