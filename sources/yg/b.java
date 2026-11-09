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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l5;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.Components.xp;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class b extends FrameLayout {
    public final l5 a;
    public final ImageView b;

    public b(Context context, g6 g6Var) {
        super(context);
        l5 l5Var = new l5(context);
        this.a = l5Var;
        l5Var.setTextSize(16);
        l5Var.setGravity(id.a0 ? 5 : 3);
        int i7 = l6.L6;
        s6.X(l5Var, i7, g6Var);
        l5Var.setTag(Integer.valueOf(i7));
        addView(l5Var);
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView);
        l5Var.k(id.M0(2131753603, null));
        Drawable drawable = getResources().getDrawable(R.drawable.poll_add_circle);
        Drawable drawable2 = getResources().getDrawable(R.drawable.poll_add_plus);
        int i10 = l6.N6;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        s6.x(this, drawable, i10, g6Var, mode);
        s6.x(this, drawable2, l6.k7, g6Var, mode);
        imageView.setImageDrawable(new xp(drawable, drawable2));
        s6.h(l6.h5, this, g6Var);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int L;
        int i13 = i11 - i7;
        l5 l5Var = this.a;
        int textHeight = ((i12 - i10) - l5Var.getTextHeight()) / 2;
        boolean z10 = id.a0;
        ImageView imageView = this.b;
        if (z10) {
            L = (getMeasuredWidth() - l5Var.getMeasuredWidth()) - g0.L(imageView.getVisibility() == 0 ? 68.0f : 23.0f);
        } else {
            L = g0.L(imageView.getVisibility() == 0 ? 68.0f : 23.0f);
        }
        l5Var.layout(L, textHeight, l5Var.getMeasuredWidth() + L, l5Var.getMeasuredHeight() + textHeight);
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
