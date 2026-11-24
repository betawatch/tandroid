// default package

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class px8 extends FrameLayout {
    public final TextView a;
    public final TextView b;
    public final /* synthetic */ gy8 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public px8(gy8 gy8Var, Context context) {
        super(context);
        this.c = gy8Var;
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setTextColor(gy8Var.y);
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(gm.o());
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(16);
        addView(textView, qoe.d(-1, -1.0f, 51, 15.0f, 8.0f, 15.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        textView2.setTextColor(-1);
        textView2.setTextSize(1, 13.0f);
        textView2.setTypeface(gm.o());
        textView2.setGravity(17);
        textView2.setPadding(gm.L(10.0f), 0, gm.L(10.0f), 0);
        textView2.setText(jb6.M0(2131743563, null));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(620756991);
        gradientDrawable.setCornerRadius(gm.L(13.0f));
        textView2.setBackground(gradientDrawable);
        textView2.setOnClickListener(new wk8(this, (byte) 7));
        addView(textView2, qoe.d(-2, 26.0f, 21, 0.0f, 4.0f, 12.0f, 0.0f));
    }
}
