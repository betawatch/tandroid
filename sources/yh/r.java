package yh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.c90;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class r extends LinearLayout {
    public final ImageView a;
    public final c90 b;
    public final c90 c;

    public r(Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        setOrientation(0);
        setPadding(AndroidUtilities.dp(i10 == 1 ? 11.0f : 32.0f), 0, AndroidUtilities.dp(i10 == 1 ? 11.0f : 32.0f), AndroidUtilities.dp(i10 == 1 ? 8.0f : 12.0f));
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        int i11 = org.telegram.ui.ActionBar.i6.G6;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(null, i11, false), PorterDuff.Mode.SRC_IN));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, w7.x5.t(24, 24, 51, 0, 6, 16, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        c90 c90Var = new c90(context, null);
        this.b = c90Var;
        c90Var.setTypeface(AndroidUtilities.bold());
        c90Var.setTextSize(1, 14.0f);
        c90Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(i11, e6Var));
        int i12 = org.telegram.ui.ActionBar.i6.gc;
        c90Var.setLinkTextColor(org.telegram.ui.ActionBar.i6.v0(i12, e6Var));
        linearLayout.addView(c90Var, w7.x5.t(-1, -2, 7, 0, 0, 0, 3));
        c90 c90Var2 = new c90(context, null);
        this.c = c90Var2;
        c90Var2.setTextSize(1, 14.0f);
        c90Var2.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.z6, e6Var));
        c90Var2.setLinkTextColor(org.telegram.ui.ActionBar.i6.v0(i12, e6Var));
        linearLayout.addView(c90Var2, w7.x5.q(-1, -2, 7));
        addView(linearLayout, w7.x5.p(-1, -2, 1.0f, 55, 0, 0, 0, 0));
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
