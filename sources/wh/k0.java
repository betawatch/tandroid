package wh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class k0 extends LinearLayout implements b6 {
    public final g6 a;
    public final ImageView b;
    public final TextView c;
    public final TextView d;

    public k0(Context context, l0 l0Var, g6 g6Var) {
        super(context);
        this.a = g6Var;
        setOrientation(0);
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, c6.t(42, 42, 19, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 16.0f);
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 16.0f);
        textView2.setGravity(5);
        addView(textView, c6.t(-2, -2, 19, 8, 0, 0, 0));
        addView(new Space(context), c6.o(0, -2, 1.0f, 119));
        addView(textView2, c6.t(-2, -2, 21, 8, 0, 0, 0));
        imageView.setImageResource(l0Var.a);
        textView.setText(l0Var.b);
        textView2.setText((CharSequence) l0Var.c.get(0));
        e();
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void e() {
        int i10 = k6.G6;
        g6 g6Var = this.a;
        this.b.setColorFilter(new PorterDuffColorFilter(k6.v0(i10, g6Var), PorterDuff.Mode.SRC_IN));
        this.c.setTextColor(k6.v0(i10, g6Var));
        this.d.setTextColor(k6.l1(0.75f, k6.v0(i10, g6Var)));
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
    }
}
