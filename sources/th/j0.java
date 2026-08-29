package th;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import i7.f6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class j0 extends LinearLayout implements org.telegram.ui.ActionBar.x5 {
    public final c6 a;
    public final ImageView b;
    public final TextView c;
    public final TextView d;

    public j0(Context context, k0 k0Var, c6 c6Var) {
        super(context);
        this.a = c6Var;
        setOrientation(0);
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, f6.t(42, 42, 19, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 16.0f);
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 16.0f);
        textView2.setGravity(5);
        addView(textView, f6.t(-2, -2, 19, 8, 0, 0, 0));
        addView(new Space(context), f6.o(0, -2, 1.0f, 119));
        addView(textView2, f6.t(-2, -2, 21, 8, 0, 0, 0));
        imageView.setImageResource(k0Var.a);
        textView.setText(k0Var.b);
        textView2.setText((CharSequence) k0Var.c.get(0));
        e();
    }

    @Override // org.telegram.ui.ActionBar.x5
    public final void e() {
        int i10 = g6.G6;
        c6 c6Var = this.a;
        this.b.setColorFilter(new PorterDuffColorFilter(g6.v0(i10, c6Var), PorterDuff.Mode.SRC_IN));
        this.c.setTextColor(g6.v0(i10, c6Var));
        this.d.setTextColor(g6.l1(0.75f, g6.v0(i10, c6Var)));
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
    }
}
