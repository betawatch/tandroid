package yh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.l90;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes4.dex */
public final class r extends LinearLayout {
    public final ImageView a;
    public final l90 b;
    public final l90 c;

    public r(Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        setOrientation(0);
        setPadding(AndroidUtilities.dp(i10 == 1 ? 11.0f : 32.0f), 0, AndroidUtilities.dp(i10 == 1 ? 11.0f : 32.0f), AndroidUtilities.dp(i10 == 1 ? 8.0f : 12.0f));
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i11, false), PorterDuff.Mode.SRC_IN));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, w7.y5.t(24, 24, 51, 0, 6, 16, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        l90 l90Var = new l90(context, null);
        this.b = l90Var;
        l90Var.setTypeface(AndroidUtilities.bold());
        l90Var.setTextSize(1, 14.0f);
        l90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, e6Var));
        int i12 = org.telegram.ui.ActionBar.j6.gc;
        l90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i12, e6Var));
        linearLayout.addView(l90Var, w7.y5.t(-1, -2, 7, 0, 0, 0, 3));
        l90 l90Var2 = new l90(context, null);
        this.c = l90Var2;
        l90Var2.setTextSize(1, 14.0f);
        l90Var2.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.z6, e6Var));
        l90Var2.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i12, e6Var));
        linearLayout.addView(l90Var2, w7.y5.q(-1, -2, 7));
        addView(linearLayout, w7.y5.p(-1, -2, 1.0f, 55, 0, 0, 0, 0));
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
