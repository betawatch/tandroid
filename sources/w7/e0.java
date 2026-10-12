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
import org.telegram.ui.Components.mm0;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public abstract class e0 {
    public static ng.i a;

    public static void a(LaunchActivity launchActivity, boolean z10, boolean z11) {
        ng.i iVar = a;
        if (z10 == (iVar != null)) {
            return;
        }
        if (z10) {
            ng.i iVar2 = new ng.i(launchActivity);
            iVar2.r = new ng.c(iVar2, 3);
            iVar2.E = new ArrayList();
            ng.f fVar = new ng.f(iVar2);
            iVar2.e = launchActivity.getSharedPreferences("floating_debug", 0);
            iVar2.F = ViewConfiguration.get(launchActivity).getScaledTouchSlop();
            ji.d4 d4Var = new ji.d4(launchActivity, fVar);
            ((GestureDetector) d4Var.b).setIsLongpressEnabled(false);
            ah.v vVar = new ah.v(iVar2, launchActivity, d4Var, 4);
            iVar2.a = vVar;
            ImageView imageView = new ImageView(launchActivity);
            imageView.setImageResource(R.drawable.device_phone_android);
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.O9, false), PorterDuff.Mode.SRC_IN));
            vVar.addView(imageView);
            vVar.setVisibility(8);
            iVar2.addView(vVar, a6.d(56.0f, 56));
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
            mm0 mm0Var = new mm0(launchActivity, null);
            iVar2.y = mm0Var;
            mm0Var.setLayoutManager(new s4.b0());
            mm0Var.setAdapter(new ng.g(iVar2, launchActivity));
            mm0Var.setOnItemClickListener(new bi.d(iVar2, 13));
            linearLayout.addView(mm0Var, a6.l(1.0f, -1, 0));
            iVar2.addView(linearLayout, a6.a(-1.0f, 8.0f, 8.0f, 8.0f, 8.0f, -1, 0));
            iVar2.d();
            iVar2.setFitsSystemWindows(true);
            iVar2.setWillNotDraw(false);
            a = iVar2;
            launchActivity.w0.addView(iVar2, new FrameLayout.LayoutParams(-1, -1));
            ng.i iVar3 = a;
            iVar3.a.setVisibility(0);
            o1.k kVar = new o1.k(new o1.j(0.0f));
            kVar.u = org.telegram.ui.Cells.d0.k(1000.0f, 750.0f, 0.75f);
            kVar.b(new bi.aa(2, iVar3));
            kVar.h();
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
