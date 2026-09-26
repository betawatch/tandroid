package rg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.t5;
import w7.y5;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class f0 extends FrameLayout {
    public final ImageView a;
    public final h5 b;
    public final t5 c;
    public final h5 d;
    public e0 e;
    public d0 f;

    public f0(j0 j0Var, Context context, d6 d6Var) {
        super(context);
        int i10;
        int i11;
        i10 = ((e3) j0Var).backgroundPaddingLeft;
        i11 = ((e3) j0Var).backgroundPaddingLeft;
        setPadding(i10, 0, i11, 0);
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(h6.v0(h6.Lj, d6Var), PorterDuff.Mode.SRC_IN));
        addView(imageView, y5.d(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 16, 24.0f, 0.0f, 24.0f, 0.0f));
        h5 h5Var = new h5(context);
        this.b = h5Var;
        h5Var.setWidthWrapContent(true);
        h5Var.setTextColor(h6.v0(h6.j5, d6Var));
        h5Var.setTextSize(14);
        boolean z10 = LocaleController.isRTL;
        addView(h5Var, y5.d(-2, -2.0f, (z10 ? 5 : 3) | 16, z10 ? 30.0f : 60.0f, 0.0f, z10 ? 60.0f : 30.0f, 0.0f));
        h5 h5Var2 = new h5(context);
        this.d = h5Var2;
        h5Var2.setTextColor(-1);
        h5Var2.setWidthWrapContent(true);
        h5Var2.setTypeface(AndroidUtilities.bold());
        h5Var2.setTextSize(14);
        t5 t5Var = new t5(this, context, d6Var);
        this.c = t5Var;
        t5Var.setWillNotDraw(false);
        t5Var.addView(h5Var2, y5.e(-2, -2, 17));
        addView(t5Var, y5.c(-1.0f, -1));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.f != null ? 49.0f : 36.0f), TLObject.FLAG_30));
    }
}
