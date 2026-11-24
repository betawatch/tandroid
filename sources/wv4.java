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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public abstract class wv4 extends fx0 {
    public static final /* synthetic */ int l1 = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wv4(Activity activity, d dVar) {
        super(activity, true);
        byte b = 1;
        this.w0 = false;
        this.v0 = false;
        LinearLayout m = ir2.m(activity, 1);
        this.O = m;
        ry8 ry8Var = new ry8(activity);
        ry8Var.setAutoRepeat(true);
        ry8Var.f(R.raw.utyan_gigagroup, 120, 120, null);
        ry8Var.d();
        m.addView(ry8Var, nme.t(kk7.p2, kk7.p2, 49, 17, 30, 17, 0));
        TextView textView = new TextView(activity);
        ug8.v(textView, 1, 24.0f);
        ug8.x(textView, bkb.i5, null, null, 2131749379);
        m.addView(textView, nme.t(-2, -2, 49, 17, 18, 17, 0));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        m.addView(linearLayout, nme.t(-2, -2, 1, 0, 12, 0, 0));
        int i = 0;
        while (true) {
            if (i >= 3) {
                vv4 vv4Var = new vv4(activity);
                View view = new View(activity);
                vv4Var.a = view;
                view.setBackground(sjb.f(bkb.Ei, 4.0f));
                vv4Var.addView(view, nme.d(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
                TextView textView2 = new TextView(activity);
                vv4Var.b = textView2;
                textView2.setLines(1);
                textView2.setSingleLine(true);
                textView2.setGravity(1);
                textView2.setEllipsize(TextUtils.TruncateAt.END);
                textView2.setGravity(17);
                tb4.w(textView2, bkb.Ii, null, 1, 14.0f);
                vv4Var.addView(textView2, nme.e(-2, -2, 17));
                vv4Var.setBackground(null);
                vv4Var.setText(k96.M0(2131749380, null));
                view.setOnClickListener(new hu4(this, activity, dVar, b));
                m.addView(vv4Var, nme.t(-1, 50, 51, 0, 29, 0, 0));
                TextView textView3 = new TextView(activity);
                textView3.setTextSize(1, 14.0f);
                ug8.x(textView3, bkb.m5, null, null, 2131749385);
                textView3.setGravity(17);
                m.addView(textView3, nme.t(-2, 48, 49, 17, 0, 17, 16));
                textView3.setOnClickListener(new yj3(this, (byte) 25));
                return;
            }
            LinearLayout m2 = ir2.m(activity, 0);
            linearLayout.addView(m2, nme.t(-2, -2, k96.a0 ? 5 : 3, 0, 8, 0, 0));
            ImageView imageView = new ImageView(activity);
            int i2 = bkb.q5;
            zkb.s(imageView, i2, null, PorterDuff.Mode.MULTIPLY);
            imageView.setImageResource(R.drawable.list_circle);
            TextView textView4 = new TextView(activity);
            textView4.setTextSize(1, 15.0f);
            zkb.X(textView4, i2, null);
            textView4.setGravity((k96.a0 ? 5 : 3) | 16);
            textView4.setMaxWidth(gl.L(260.0f));
            if (i == 0) {
                textView4.setText(k96.M0(2131749383, null));
            } else if (i == 1) {
                textView4.setText(k96.M0(2131749382, null));
            } else if (i == 2) {
                textView4.setText(k96.M0(2131749381, null));
            }
            if (k96.a0) {
                m2.addView(textView4, nme.o(-2, -2));
                m2.addView(imageView, nme.k(8.0f, 7.0f, 0.0f, 0.0f, -2, -2));
            } else {
                m2.addView(imageView, nme.k(0.0f, 8.0f, 8.0f, 0.0f, -2, -2));
                m2.addView(textView4, nme.o(-2, -2));
            }
            i++;
        }
    }

    public abstract void E0();

    public void D0() {
    }
}
