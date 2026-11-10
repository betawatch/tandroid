package yg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.messenger.id;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m5;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.xp;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class b extends FrameLayout {
    public final m5 a;
    public final ImageView b;

    public b(Context context, h6 h6Var) {
        super(context);
        m5 m5Var = new m5(context);
        this.a = m5Var;
        m5Var.setTextSize(16);
        m5Var.setGravity(id.a0 ? 5 : 3);
        int i7 = m6.L6;
        t6.X(m5Var, i7, h6Var);
        m5Var.setTag(Integer.valueOf(i7));
        addView(m5Var);
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView);
        m5Var.k(id.M0(2131753603, null));
        Drawable drawable = getResources().getDrawable(R.drawable.poll_add_circle);
        Drawable drawable2 = getResources().getDrawable(R.drawable.poll_add_plus);
        int i10 = m6.N6;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        t6.x(this, drawable, i10, h6Var, mode);
        t6.x(this, drawable2, m6.k7, h6Var, mode);
        imageView.setImageDrawable(new xp(drawable, drawable2));
        t6.h(m6.h5, this, h6Var);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int L;
        int i13 = i11 - i7;
        m5 m5Var = this.a;
        int textHeight = ((i12 - i10) - m5Var.getTextHeight()) / 2;
        boolean z10 = id.a0;
        ImageView imageView = this.b;
        if (z10) {
            L = (getMeasuredWidth() - m5Var.getMeasuredWidth()) - g0.L(imageView.getVisibility() == 0 ? 68.0f : 23.0f);
        } else {
            L = g0.L(imageView.getVisibility() == 0 ? 68.0f : 23.0f);
        }
        m5Var.layout(L, textHeight, m5Var.getMeasuredWidth() + L, m5Var.getMeasuredHeight() + textHeight);
        int L2 = !id.a0 ? g0.L(24.0f) : (i13 - imageView.getMeasuredWidth()) - g0.L(24.0f);
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
