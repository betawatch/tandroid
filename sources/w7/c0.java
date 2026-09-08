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
import org.telegram.ui.Components.ll0;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public abstract class c0 {
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
            l.d dVar = new l.d(launchActivity, fVar);
            ((GestureDetector) dVar.b).setIsLongpressEnabled(false);
            ah.w wVar = new ah.w(iVar2, launchActivity, dVar, 4);
            iVar2.a = wVar;
            ImageView imageView = new ImageView(launchActivity);
            imageView.setImageResource(R.drawable.device_phone_android);
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.O9, false), PorterDuff.Mode.SRC_IN));
            wVar.addView(imageView);
            wVar.setVisibility(8);
            iVar2.addView(wVar, x5.c(56.0f, 56));
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
            linearLayout.addView(textView, x5.n(-1, -2));
            ll0 ll0Var = new ll0(launchActivity, null);
            iVar2.y = ll0Var;
            ll0Var.setLayoutManager(new s4.c0());
            ll0Var.setAdapter(new ng.g(iVar2, launchActivity));
            ll0Var.setOnItemClickListener(new bi.d(iVar2, 13));
            linearLayout.addView(ll0Var, x5.l(1.0f, -1, 0));
            iVar2.addView(linearLayout, x5.d(-1, -1.0f, 0, 8.0f, 8.0f, 8.0f, 8.0f));
            iVar2.d();
            iVar2.setFitsSystemWindows(true);
            iVar2.setWillNotDraw(false);
            a = iVar2;
            launchActivity.w0.addView(iVar2, new FrameLayout.LayoutParams(-1, -1));
            ng.i iVar3 = a;
            iVar3.a.setVisibility(0);
            o1.k kVar = new o1.k(new o1.j(0.0f));
            kVar.u = org.telegram.ui.Cells.p6.l(1000.0f, 750.0f, 0.75f);
            kVar.b(new bi.x9(2, iVar3));
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
