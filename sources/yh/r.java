package yh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.p90;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes4.dex */
public final class r extends LinearLayout {
    public final ImageView a;
    public final p90 b;
    public final p90 c;

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
        p90 p90Var = new p90(context, null);
        this.b = p90Var;
        p90Var.setTypeface(AndroidUtilities.bold());
        p90Var.setTextSize(1, 14.0f);
        p90Var.setTextColor(org.telegram.ui.ActionBar.h6.v0(i11, d6Var));
        int i12 = org.telegram.ui.ActionBar.h6.gc;
        p90Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.v0(i12, d6Var));
        linearLayout.addView(p90Var, w7.y5.t(-1, -2, 7, 0, 0, 0, 3));
        p90 p90Var2 = new p90(context, null);
        this.c = p90Var2;
        p90Var2.setTextSize(1, 14.0f);
        p90Var2.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.z6, d6Var));
        p90Var2.setLinkTextColor(org.telegram.ui.ActionBar.h6.v0(i12, d6Var));
        linearLayout.addView(p90Var2, w7.y5.q(-1, -2, 7));
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
