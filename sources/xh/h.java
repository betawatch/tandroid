package xh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.z20;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class h extends FrameLayout {
    public final ImageView a;
    public final TextView b;
    public final TextView c;

    public h(Context context, p6 p6Var, boolean z10) {
        super(context);
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i10 = t6.G6;
        a7.t(imageView, i10, p6Var, PorterDuff.Mode.SRC_IN);
        addView(imageView, b6.d(24, 24.0f, 51, 20.0f, 11.46f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, b6.d(-1, -2.0f, 23, 64.0f, z10 ? 2.0f : 9.8f, 24.0f, z10 ? 4.0f : 9.8f));
        TextView textView = new TextView(context);
        this.b = textView;
        a7.V(textView, i10, p6Var);
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setTextSize(1, 14.0f);
        TextView f7 = z20.f(linearLayout, textView, b6.t(-1, -2, 55, 0, 0, 0, 1), context);
        this.c = f7;
        a7.V(f7, t6.z6, p6Var);
        f7.setTextSize(1, 14.0f);
        linearLayout.addView(f7, b6.t(-1, -2, 55, 0, 0, 0, 0));
    }

    public final void a(int i10, CharSequence charSequence, CharSequence charSequence2) {
        this.a.setImageResource(i10);
        this.b.setText(charSequence);
        this.c.setText(charSequence2);
    }

    public void setText(CharSequence charSequence) {
        this.c.setText(charSequence);
    }
}
