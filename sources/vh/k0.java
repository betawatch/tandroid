package vh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class k0 extends LinearLayout implements org.telegram.ui.ActionBar.a6 {
    public final f6 a;
    public final ImageView b;
    public final TextView c;
    public final TextView d;

    public k0(Context context, l0 l0Var, f6 f6Var) {
        super(context);
        this.a = f6Var;
        setOrientation(0);
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, b6.t(42, 42, 19, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 16.0f);
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 16.0f);
        textView2.setGravity(5);
        addView(textView, b6.t(-2, -2, 19, 8, 0, 0, 0));
        addView(new Space(context), b6.o(0, -2, 1.0f, 119));
        addView(textView2, b6.t(-2, -2, 21, 8, 0, 0, 0));
        imageView.setImageResource(l0Var.a);
        textView.setText(l0Var.b);
        textView2.setText((CharSequence) l0Var.c.get(0));
        e();
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void e() {
        int i10 = j6.G6;
        f6 f6Var = this.a;
        this.b.setColorFilter(new PorterDuffColorFilter(j6.v0(i10, f6Var), PorterDuff.Mode.SRC_IN));
        this.c.setTextColor(j6.v0(i10, f6Var));
        this.d.setTextColor(j6.l1(0.75f, j6.v0(i10, f6Var)));
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
    }
}
