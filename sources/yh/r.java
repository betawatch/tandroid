package yh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ea0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class r extends LinearLayout {
    public final ImageView a;
    public final ea0 b;
    public final ea0 c;

    public r(Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        setOrientation(0);
        setPadding(AndroidUtilities.dp(i10 == 1 ? 11.0f : 32.0f), 0, AndroidUtilities.dp(i10 == 1 ? 11.0f : 32.0f), AndroidUtilities.dp(i10 == 1 ? 8.0f : 12.0f));
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        int i11 = org.telegram.ui.ActionBar.i6.G6;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.x0(null, i11, false), PorterDuff.Mode.SRC_IN));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, w7.x5.t(24, 24, 51, 0, 6, 16, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        ea0 ea0Var = new ea0(context, null);
        this.b = ea0Var;
        ea0Var.setTypeface(AndroidUtilities.bold());
        ea0Var.setTextSize(1, 14.0f);
        ea0Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(i11, e6Var));
        int i12 = org.telegram.ui.ActionBar.i6.gc;
        ea0Var.setLinkTextColor(org.telegram.ui.ActionBar.i6.w0(i12, e6Var));
        linearLayout.addView(ea0Var, w7.x5.t(-1, -2, 7, 0, 0, 0, 3));
        ea0 ea0Var2 = new ea0(context, null);
        this.c = ea0Var2;
        ea0Var2.setTextSize(1, 14.0f);
        ea0Var2.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.z6, e6Var));
        ea0Var2.setLinkTextColor(org.telegram.ui.ActionBar.i6.w0(i12, e6Var));
        linearLayout.addView(ea0Var2, w7.x5.q(-1, -2, 7));
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
