package qh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import g7.e6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class j0 extends LinearLayout implements org.telegram.ui.ActionBar.w5 {
    public final b6 a;
    public final ImageView b;
    public final TextView c;
    public final TextView d;

    public j0(Context context, k0 k0Var, b6 b6Var) {
        super(context);
        this.a = b6Var;
        setOrientation(0);
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, e6.t(42, 42, 19, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 16.0f);
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 16.0f);
        textView2.setGravity(5);
        addView(textView, e6.t(-2, -2, 19, 8, 0, 0, 0));
        addView(new Space(context), e6.o(0, -2, 1.0f, 119));
        addView(textView2, e6.t(-2, -2, 21, 8, 0, 0, 0));
        imageView.setImageResource(k0Var.a);
        textView.setText(k0Var.b);
        textView2.setText((CharSequence) k0Var.c.get(0));
        d();
    }

    @Override // org.telegram.ui.ActionBar.w5
    public final void d() {
        int i9 = f6.G6;
        b6 b6Var = this.a;
        this.b.setColorFilter(new PorterDuffColorFilter(f6.v0(i9, b6Var), PorterDuff.Mode.SRC_IN));
        this.c.setTextColor(f6.v0(i9, b6Var));
        this.d.setTextColor(f6.l1(0.75f, f6.v0(i9, b6Var)));
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
    }
}
