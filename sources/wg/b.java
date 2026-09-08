package wg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.wl;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.oq;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class b extends FrameLayout {
    public final j5 a;
    public final ImageView b;

    public b(Context context, f6 f6Var) {
        super(context);
        j5 j5Var = new j5(context);
        this.a = j5Var;
        j5Var.setTextSize(16);
        j5Var.setGravity(LocaleController.isRTL ? 5 : 3);
        int i10 = j6.L6;
        j5Var.setTextColor(j6.v0(i10, f6Var));
        j5Var.setTag(Integer.valueOf(i10));
        addView(j5Var);
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView);
        j5Var.k(LocaleController.getString(R.string.BoostingAddChannelOrGroup));
        Drawable drawable = getResources().getDrawable(R.drawable.poll_add_circle);
        Drawable drawable2 = getResources().getDrawable(R.drawable.poll_add_plus);
        int v02 = j6.v0(j6.N6, f6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        drawable.setColorFilter(new PorterDuffColorFilter(v02, mode));
        drawable2.setColorFilter(new PorterDuffColorFilter(j6.v0(j6.k7, f6Var), mode));
        imageView.setImageDrawable(new oq(drawable, drawable2));
        setBackgroundColor(j6.v0(j6.h5, f6Var));
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int dp;
        int i14 = i12 - i10;
        j5 j5Var = this.a;
        int textHeight = ((i13 - i11) - j5Var.getTextHeight()) / 2;
        boolean z11 = LocaleController.isRTL;
        ImageView imageView = this.b;
        if (z11) {
            dp = (getMeasuredWidth() - j5Var.getMeasuredWidth()) - AndroidUtilities.dp(imageView.getVisibility() == 0 ? 68.0f : 23.0f);
        } else {
            dp = AndroidUtilities.dp(imageView.getVisibility() == 0 ? 68.0f : 23.0f);
        }
        j5Var.layout(dp, textHeight, j5Var.getMeasuredWidth() + dp, j5Var.getMeasuredHeight() + textHeight);
        int dp2 = !LocaleController.isRTL ? AndroidUtilities.dp(24.0f) : (i14 - imageView.getMeasuredWidth()) - AndroidUtilities.dp(24.0f);
        imageView.layout(dp2, 0, imageView.getMeasuredWidth() + dp2, imageView.getMeasuredHeight());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        this.a.measure(wl.d(94.0f, size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), TLObject.FLAG_30));
        this.b.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), TLObject.FLAG_30));
        setMeasuredDimension(size, AndroidUtilities.dp(50.0f));
    }
}
