// default package

import android.graphics.PorterDuff;
import android.view.GestureDetector;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public abstract class uge {
    public static hj4 a;

    public static void a(LaunchActivity launchActivity, boolean z, boolean z2) {
        hj4 hj4Var = a;
        byte b = 1;
        if (z != (hj4Var != null)) {
            if (z) {
                hj4 hj4Var2 = new hj4(launchActivity);
                hj4Var2.r = new cj4(hj4Var2, (byte) 3);
                hj4Var2.F = new ArrayList();
                fj4 fj4Var = new fj4(hj4Var2);
                hj4Var2.e = launchActivity.getSharedPreferences("floating_debug", 0);
                hj4Var2.G = ViewConfiguration.get(launchActivity).getScaledTouchSlop();
                gi3 gi3Var = new gi3(launchActivity, fj4Var);
                ((GestureDetector) gi3Var.a).setIsLongpressEnabled(false);
                st stVar = new st(hj4Var2, launchActivity, gi3Var, (byte) 14);
                hj4Var2.a = stVar;
                ImageView imageView = new ImageView(launchActivity);
                imageView.setImageResource(R.drawable.device_phone_android);
                zkb.s(imageView, bkb.N9, null, PorterDuff.Mode.SRC_IN);
                stVar.addView(imageView);
                stVar.setVisibility(8);
                hj4Var2.addView(stVar, nme.c(56.0f, 56));
                LinearLayout linearLayout = new LinearLayout(launchActivity);
                hj4Var2.x = linearLayout;
                linearLayout.setOrientation(1);
                linearLayout.setVisibility(8);
                TextView textView = new TextView(launchActivity);
                hj4Var2.y = textView;
                textView.setTextSize(1, 20.0f);
                textView.setText(k96.M0(2131751634, null));
                textView.setTypeface(gl.o());
                textView.setPadding(gl.L(24.0f), gl.L(19.0f), gl.L(24.0f), gl.L(19.0f));
                linearLayout.addView(textView, nme.o(-1, -2));
                o39 o39Var = new o39(launchActivity, null);
                hj4Var2.E = o39Var;
                o39Var.setLayoutManager(new t26());
                o39Var.setAdapter(new s20(hj4Var2, launchActivity));
                o39Var.setOnItemClickListener(new bf4(hj4Var2, b));
                linearLayout.addView(o39Var, nme.l(1.0f, -1, 0));
                hj4Var2.addView(linearLayout, nme.d(-1, -1.0f, 0, 8.0f, 8.0f, 8.0f, 8.0f));
                hj4Var2.d();
                hj4Var2.setFitsSystemWindows(true);
                hj4Var2.setWillNotDraw(false);
                a = hj4Var2;
                launchActivity.v0.addView(hj4Var2, new FrameLayout.LayoutParams(-1, -1));
                hj4 hj4Var3 = a;
                hj4Var3.a.setVisibility(0);
                yla ylaVar = new yla(new ti4(0.0f));
                ylaVar.m = oo1.j(1000.0f, 750.0f, 0.75f);
                ylaVar.b(new h10(hj4Var3, (byte) 5));
                ylaVar.h();
            } else {
                hj4Var.getClass();
                launchActivity.v0.removeView(a);
                a = null;
            }
            if (z2) {
                gba.u1 = z;
                gba.x();
            }
        }
    }
}
