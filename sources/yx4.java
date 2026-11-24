// default package

import android.app.Activity;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class yx4 extends my0 {
    public static final /* synthetic */ int l1 = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yx4(Activity activity, d dVar) {
        super(activity, true);
        byte b = 1;
        this.w0 = false;
        this.v0 = false;
        LinearLayout l = td4.l(activity, 1);
        this.O = l;
        s09 s09Var = new s09(activity);
        s09Var.setAutoRepeat(true);
        s09Var.f(R.raw.utyan_gigagroup, nm7.E1, nm7.E1, null);
        s09Var.d();
        l.addView(s09Var, qoe.t(nm7.p2, nm7.p2, 49, 17, 30, 17, 0));
        TextView textView = new TextView(activity);
        wi8.v(textView, 1, 24.0f);
        wi8.x(textView, cmb.i5, null, null, 2131749328);
        l.addView(textView, qoe.t(-2, -2, 49, 17, 18, 17, 0));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        l.addView(linearLayout, qoe.t(-2, -2, 1, 0, 12, 0, 0));
        int i = 0;
        while (true) {
            if (i >= 3) {
                xx4 xx4Var = new xx4(activity);
                View view = new View(activity);
                xx4Var.a = view;
                view.setBackground(ulb.f(cmb.Ei, 4.0f));
                xx4Var.addView(view, qoe.d(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
                TextView textView2 = new TextView(activity);
                xx4Var.b = textView2;
                textView2.setLines(1);
                textView2.setSingleLine(true);
                textView2.setGravity(1);
                textView2.setEllipsize(TextUtils.TruncateAt.END);
                textView2.setGravity(17);
                td4.x(textView2, cmb.Ii, null, 1, 14.0f);
                xx4Var.addView(textView2, qoe.e(-2, -2, 17));
                xx4Var.setBackground(null);
                xx4Var.setText(jb6.M0(2131749329, null));
                view.setOnClickListener(new jw4(this, activity, dVar, b));
                l.addView(xx4Var, qoe.t(-1, 50, 51, 0, 29, 0, 0));
                TextView textView3 = new TextView(activity);
                textView3.setTextSize(1, 14.0f);
                wi8.x(textView3, cmb.m5, null, null, 2131749334);
                textView3.setGravity(17);
                l.addView(textView3, qoe.t(-2, 48, 49, 17, 0, 17, 16));
                textView3.setOnClickListener(new sf3(this, (byte) 28));
                return;
            }
            LinearLayout l2 = td4.l(activity, 0);
            linearLayout.addView(l2, qoe.t(-2, -2, jb6.a0 ? 5 : 3, 0, 8, 0, 0));
            ImageView imageView = new ImageView(activity);
            int i2 = cmb.q5;
            anb.s(imageView, i2, null, PorterDuff.Mode.MULTIPLY);
            imageView.setImageResource(R.drawable.list_circle);
            TextView textView4 = new TextView(activity);
            textView4.setTextSize(1, 15.0f);
            anb.X(textView4, i2, null);
            textView4.setGravity((jb6.a0 ? 5 : 3) | 16);
            textView4.setMaxWidth(gm.L(260.0f));
            if (i == 0) {
                textView4.setText(jb6.M0(2131749332, null));
            } else if (i == 1) {
                textView4.setText(jb6.M0(2131749331, null));
            } else if (i == 2) {
                textView4.setText(jb6.M0(2131749330, null));
            }
            if (jb6.a0) {
                l2.addView(textView4, qoe.o(-2, -2));
                l2.addView(imageView, qoe.k(8.0f, 7.0f, 0.0f, 0.0f, -2, -2));
            } else {
                l2.addView(imageView, qoe.k(0.0f, 8.0f, 8.0f, 0.0f, -2, -2));
                l2.addView(textView4, qoe.o(-2, -2));
            }
            i++;
        }
    }

    public abstract void E0();

    public void D0() {
    }
}
