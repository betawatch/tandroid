package sg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.x5;
import w7.z5;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class f0 extends FrameLayout {
    public final ImageView a;
    public final h5 b;
    public final x5 c;
    public final h5 d;
    public e0 e;
    public d0 f;

    public f0(j0 j0Var, Context context, c6 c6Var) {
        super(context);
        int i10;
        int i11;
        i10 = ((e3) j0Var).backgroundPaddingLeft;
        i11 = ((e3) j0Var).backgroundPaddingLeft;
        setPadding(i10, 0, i11, 0);
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(g6.w0(g6.Lj, c6Var), PorterDuff.Mode.SRC_IN));
        addView(imageView, z5.a(24.0f, 24.0f, 0.0f, 24.0f, 0.0f, 24, (LocaleController.isRTL ? 5 : 3) | 16));
        h5 h5Var = new h5(context);
        this.b = h5Var;
        h5Var.setWidthWrapContent(true);
        h5Var.setTextColor(g6.w0(g6.j5, c6Var));
        h5Var.setTextSize(14);
        boolean z10 = LocaleController.isRTL;
        addView(h5Var, z5.a(-2.0f, z10 ? 30.0f : 60.0f, 0.0f, z10 ? 60.0f : 30.0f, 0.0f, -2, (z10 ? 5 : 3) | 16));
        h5 h5Var2 = new h5(context);
        this.d = h5Var2;
        h5Var2.setTextColor(-1);
        h5Var2.setWidthWrapContent(true);
        h5Var2.setTypeface(AndroidUtilities.bold());
        h5Var2.setTextSize(14);
        x5 x5Var = new x5(this, context, c6Var);
        this.c = x5Var;
        x5Var.setWillNotDraw(false);
        x5Var.addView(h5Var2, z5.e(-2, -2, 17));
        addView(x5Var, z5.d(-1.0f, -1));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.f != null ? 49.0f : 36.0f), TLObject.FLAG_30));
    }
}
