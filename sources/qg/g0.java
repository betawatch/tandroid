package qg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.l5;
import org.telegram.ui.u5;
import w7.a6;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class g0 extends FrameLayout {
    public final ImageView a;
    public final l5 b;
    public final u5 c;
    public final l5 d;
    public f0 e;
    public e0 f;

    public g0(k0 k0Var, Context context, f6 f6Var) {
        super(context);
        int i10;
        int i11;
        i10 = ((h3) k0Var).backgroundPaddingLeft;
        i11 = ((h3) k0Var).backgroundPaddingLeft;
        setPadding(i10, 0, i11, 0);
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(j6.v0(j6.Lj, f6Var), PorterDuff.Mode.SRC_IN));
        addView(imageView, a6.d(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 16, 24.0f, 0.0f, 24.0f, 0.0f));
        l5 l5Var = new l5(context);
        this.b = l5Var;
        l5Var.setWidthWrapContent(true);
        l5Var.setTextColor(j6.v0(j6.j5, f6Var));
        l5Var.setTextSize(14);
        boolean z10 = LocaleController.isRTL;
        addView(l5Var, a6.d(-2, -2.0f, (z10 ? 5 : 3) | 16, z10 ? 30.0f : 60.0f, 0.0f, z10 ? 60.0f : 30.0f, 0.0f));
        l5 l5Var2 = new l5(context);
        this.d = l5Var2;
        l5Var2.setTextColor(-1);
        l5Var2.setWidthWrapContent(true);
        l5Var2.setTypeface(AndroidUtilities.bold());
        l5Var2.setTextSize(14);
        u5 u5Var = new u5(this, context, f6Var);
        this.c = u5Var;
        u5Var.setWillNotDraw(false);
        u5Var.addView(l5Var2, a6.e(-2, -2, 17));
        addView(u5Var, a6.c(-1.0f, -1));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.f != null ? 49.0f : 36.0f), TLObject.FLAG_30));
    }
}
