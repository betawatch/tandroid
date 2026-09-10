package w7;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.GestureDetector;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public abstract class n {
    public static lg.i a;

    public static void a(LaunchActivity launchActivity, boolean z10, boolean z11) {
        lg.i iVar = a;
        if (z10 == (iVar != null)) {
            return;
        }
        if (z10) {
            lg.i iVar2 = new lg.i(launchActivity);
            iVar2.r = new lg.c(iVar2, 3);
            iVar2.E = new ArrayList();
            lg.f fVar = new lg.f(iVar2);
            iVar2.e = launchActivity.getSharedPreferences("floating_debug", 0);
            iVar2.F = ViewConfiguration.get(launchActivity).getScaledTouchSlop();
            l2.h hVar = new l2.h(launchActivity, fVar);
            ((GestureDetector) hVar.b).setIsLongpressEnabled(false);
            bi.n7 n7Var = new bi.n7(iVar2, launchActivity, hVar, 2);
            iVar2.a = n7Var;
            ImageView imageView = new ImageView(launchActivity);
            imageView.setImageResource(R.drawable.device_phone_android);
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.O9, false), PorterDuff.Mode.SRC_IN));
            n7Var.addView(imageView);
            n7Var.setVisibility(8);
            iVar2.addView(n7Var, a6.c(56.0f, 56));
            LinearLayout linearLayout = new LinearLayout(launchActivity);
            iVar2.w = linearLayout;
            linearLayout.setOrientation(1);
            linearLayout.setVisibility(8);
            TextView textView = new TextView(launchActivity);
            iVar2.x = textView;
            textView.setTextSize(1, 20.0f);
            textView.setText(LocaleController.getString(R.string.DebugMenu));
            textView.setTypeface(AndroidUtilities.bold());
            textView.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(19.0f));
            linearLayout.addView(textView, a6.n(-1, -2));
            vl0 vl0Var = new vl0(launchActivity, null);
            iVar2.y = vl0Var;
            vl0Var.setLayoutManager(new s4.c0());
            vl0Var.setAdapter(new lg.g(iVar2, launchActivity));
            vl0Var.setOnItemClickListener(new ai.g(iVar2, 12));
            linearLayout.addView(vl0Var, a6.l(1.0f, -1, 0));
            iVar2.addView(linearLayout, a6.d(-1, -1.0f, 0, 8.0f, 8.0f, 8.0f, 8.0f));
            iVar2.d();
            iVar2.setFitsSystemWindows(true);
            iVar2.setWillNotDraw(false);
            a = iVar2;
            launchActivity.w0.addView(iVar2, new FrameLayout.LayoutParams(-1, -1));
            lg.i iVar3 = a;
            iVar3.a.setVisibility(0);
            o1.k kVar = new o1.k(new o1.j(0.0f));
            kVar.u = org.telegram.ui.Cells.r6.l(1000.0f, 750.0f, 0.75f);
            kVar.b(new bi.i6(1, iVar3));
            kVar.f();
        } else {
            iVar.getClass();
            launchActivity.w0.removeView(a);
            a = null;
        }
        if (z11) {
            SharedConfig.isFloatingDebugActive = z10;
            SharedConfig.saveConfig();
        }
    }
}
