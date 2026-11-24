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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class vie {
    public static ll4 a;

    public static void a(LaunchActivity launchActivity, boolean z, boolean z2) {
        ll4 ll4Var = a;
        if (z != (ll4Var != null)) {
            if (z) {
                ll4 ll4Var2 = new ll4(launchActivity);
                ll4Var2.r = new gl4(ll4Var2, (byte) 3);
                ll4Var2.F = new ArrayList();
                jl4 jl4Var = new jl4(ll4Var2);
                ll4Var2.e = launchActivity.getSharedPreferences("floating_debug", 0);
                ll4Var2.G = ViewConfiguration.get(launchActivity).getScaledTouchSlop();
                lj4 lj4Var = new lj4(launchActivity, jl4Var);
                ((GestureDetector) lj4Var.a).setIsLongpressEnabled(false);
                su suVar = new su(ll4Var2, launchActivity, lj4Var, (byte) 15);
                ll4Var2.a = suVar;
                ImageView imageView = new ImageView(launchActivity);
                imageView.setImageResource(R.drawable.device_phone_android);
                anb.s(imageView, cmb.N9, null, PorterDuff.Mode.SRC_IN);
                suVar.addView(imageView);
                suVar.setVisibility(8);
                ll4Var2.addView(suVar, qoe.c(56.0f, 56));
                LinearLayout linearLayout = new LinearLayout(launchActivity);
                ll4Var2.x = linearLayout;
                linearLayout.setOrientation(1);
                linearLayout.setVisibility(8);
                TextView textView = new TextView(launchActivity);
                ll4Var2.y = textView;
                textView.setTextSize(1, 20.0f);
                textView.setText(jb6.M0(2131751583, null));
                textView.setTypeface(gm.o());
                textView.setPadding(gm.L(24.0f), gm.L(19.0f), gm.L(24.0f), gm.L(19.0f));
                linearLayout.addView(textView, qoe.o(-1, -2));
                r59 r59Var = new r59(launchActivity, null);
                ll4Var2.E = r59Var;
                r59Var.setLayoutManager(new u46());
                r59Var.setAdapter(new s30(ll4Var2, launchActivity));
                r59Var.setOnItemClickListener(new kg4(ll4Var2, (byte) 2));
                linearLayout.addView(r59Var, qoe.l(1.0f, -1, 0));
                ll4Var2.addView(linearLayout, qoe.d(-1, -1.0f, 0, 8.0f, 8.0f, 8.0f, 8.0f));
                ll4Var2.d();
                ll4Var2.setFitsSystemWindows(true);
                ll4Var2.setWillNotDraw(false);
                a = ll4Var2;
                launchActivity.v0.addView(ll4Var2, new FrameLayout.LayoutParams(-1, -1));
                ll4 ll4Var3 = a;
                ll4Var3.a.setVisibility(0);
                zna znaVar = new zna(new xk4(0.0f));
                znaVar.m = aq1.j(1000.0f, 750.0f, 0.75f);
                znaVar.b(new h20(ll4Var3, (byte) 5));
                znaVar.h();
            } else {
                ll4Var.getClass();
                launchActivity.v0.removeView(a);
                a = null;
            }
            if (z2) {
                gda.t1 = z;
                gda.x();
            }
        }
    }
}
