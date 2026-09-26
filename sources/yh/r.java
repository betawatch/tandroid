package yh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.n90;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes4.dex */
public final class r extends LinearLayout {
    public final ImageView a;
    public final n90 b;
    public final n90 c;

    public r(Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        setOrientation(0);
        setPadding(AndroidUtilities.dp(i10 == 1 ? 11.0f : 32.0f), 0, AndroidUtilities.dp(i10 == 1 ? 11.0f : 32.0f), AndroidUtilities.dp(i10 == 1 ? 8.0f : 12.0f));
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        int i11 = org.telegram.ui.ActionBar.h6.G6;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(null, i11, false), PorterDuff.Mode.SRC_IN));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, w7.y5.t(24, 24, 51, 0, 6, 16, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        n90 n90Var = new n90(context, null);
        this.b = n90Var;
        n90Var.setTypeface(AndroidUtilities.bold());
        n90Var.setTextSize(1, 14.0f);
        n90Var.setTextColor(org.telegram.ui.ActionBar.h6.v0(i11, d6Var));
        int i12 = org.telegram.ui.ActionBar.h6.gc;
        n90Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.v0(i12, d6Var));
        linearLayout.addView(n90Var, w7.y5.t(-1, -2, 7, 0, 0, 0, 3));
        n90 n90Var2 = new n90(context, null);
        this.c = n90Var2;
        n90Var2.setTextSize(1, 14.0f);
        n90Var2.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.z6, d6Var));
        n90Var2.setLinkTextColor(org.telegram.ui.ActionBar.h6.v0(i12, d6Var));
        linearLayout.addView(n90Var2, w7.y5.q(-1, -2, 7));
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
