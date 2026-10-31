package v7;

import android.graphics.PorterDuff;
import android.view.GestureDetector;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.tz;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class h7 {
    public static fg.l a;

    public static void a(LaunchActivity launchActivity, boolean z10, boolean z11) {
        fg.l lVar = a;
        if (z10 == (lVar != null)) {
            return;
        }
        if (z10) {
            fg.l lVar2 = new fg.l(launchActivity);
            lVar2.r = new fg.e(lVar2, 3);
            lVar2.E = new ArrayList();
            fg.h hVar = new fg.h(lVar2);
            lVar2.e = launchActivity.getSharedPreferences("floating_debug", 0);
            lVar2.F = ViewConfiguration.get(launchActivity).getScaledTouchSlop();
            m2.t tVar = new m2.t(launchActivity, hVar);
            ((GestureDetector) tVar.b).setIsLongpressEnabled(false);
            fg.i iVar = new fg.i(lVar2, launchActivity, tVar, 0);
            lVar2.a = iVar;
            ImageView imageView = new ImageView(launchActivity);
            imageView.setImageResource(R.drawable.device_phone_android);
            org.telegram.ui.ActionBar.a7.t(imageView, org.telegram.ui.ActionBar.t6.O9, null, PorterDuff.Mode.SRC_IN);
            iVar.addView(imageView);
            iVar.setVisibility(8);
            lVar2.addView(iVar, w7.b6.c(56.0f, 56));
            LinearLayout linearLayout = new LinearLayout(launchActivity);
            lVar2.x = linearLayout;
            linearLayout.setOrientation(1);
            linearLayout.setVisibility(8);
            TextView textView = new TextView(launchActivity);
            lVar2.y = textView;
            textView.setTextSize(1, 20.0f);
            textView.setText(cd.L0(2131751647, null));
            textView.setTypeface(org.telegram.messenger.i0.o());
            textView.setPadding(org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(19.0f), org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(19.0f));
            linearLayout.addView(textView, w7.b6.o(-1, -2));
            tk0 tk0Var = new tk0(launchActivity, null);
            lVar2.D = tk0Var;
            tk0Var.setLayoutManager(new s4.a0());
            tk0Var.setAdapter(new fg.j(lVar2, launchActivity));
            tk0Var.setOnItemClickListener(new ag.y0(lVar2, 3));
            linearLayout.addView(tk0Var, w7.b6.l(1.0f, -1, 0));
            lVar2.addView(linearLayout, w7.b6.d(-1, -1.0f, 0, 8.0f, 8.0f, 8.0f, 8.0f));
            lVar2.d();
            lVar2.setFitsSystemWindows(true);
            lVar2.setWillNotDraw(false);
            a = lVar2;
            launchActivity.w0.addView(lVar2, new FrameLayout.LayoutParams(-1, -1));
            fg.l lVar3 = a;
            lVar3.a.setVisibility(0);
            o1.j jVar = new o1.j(new o1.i(0.0f));
            jVar.m = org.telegram.ui.Cells.f1.p(1000.0f, 750.0f, 0.75f);
            jVar.b(new fg.c(0, lVar3));
            jVar.h();
        } else {
            lVar.getClass();
            launchActivity.w0.removeView(a);
            a = null;
        }
        if (z11) {
            tz.x1 = z10;
            tz.y();
        }
    }
}
