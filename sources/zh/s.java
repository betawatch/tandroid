package zh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.da0;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class s extends LinearLayout {
    public final ImageView a;
    public final da0 b;
    public final da0 c;

    public s(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        setOrientation(0);
        setPadding(AndroidUtilities.dp(i10 == 1 ? 11.0f : 32.0f), 0, AndroidUtilities.dp(i10 == 1 ? 11.0f : 32.0f), AndroidUtilities.dp(i10 == 1 ? 8.0f : 12.0f));
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.x0(null, i11, false), PorterDuff.Mode.SRC_IN));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, w7.a6.t(24, 24, 51, 0, 6, 16, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        da0 da0Var = new da0(context, null);
        this.b = da0Var;
        da0Var.setTypeface(AndroidUtilities.bold());
        da0Var.setTextSize(1, 14.0f);
        da0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(i11, c6Var));
        int i12 = org.telegram.ui.ActionBar.g6.gc;
        da0Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(i12, c6Var));
        linearLayout.addView(da0Var, w7.a6.t(-1, -2, 7, 0, 0, 0, 3));
        da0 da0Var2 = new da0(context, null);
        this.c = da0Var2;
        da0Var2.setTextSize(1, 14.0f);
        da0Var2.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.z6, c6Var));
        da0Var2.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(i12, c6Var));
        linearLayout.addView(da0Var2, w7.a6.q(-1, -2, 7));
        addView(linearLayout, w7.a6.p(-1, -2, 1.0f, 55, 0, 0, 0, 0));
    }

    public final void a(CharSequence charSequence, CharSequence charSequence2, int i10) {
        this.a.setImageResource(i10);
        this.b.setText(charSequence);
        this.c.setText(charSequence2);
    }

    public void setSubtitle(CharSequence charSequence) {
        this.c.setText(charSequence);
    }

    public void setTitle(CharSequence charSequence) {
        this.b.setText(charSequence);
    }
}
