package ph;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import i7.f6;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import nh.t4;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.w41;
import org.telegram.ui.al0;
import org.telegram.ui.g5;
import org.telegram.ui.th;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class r extends org.telegram.ui.ActionBar.o2 {
    public u51 a;
    public final ArrayList b;
    public final HashMap c;

    public r() {
        super(null);
        this.b = new ArrayList();
        this.c = new HashMap();
    }

    public static void U(r rVar, ArrayList arrayList) {
        HashMap hashMap = rVar.c;
        ArrayList arrayList2 = rVar.b;
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            o oVar = (o) arrayList2.get(i10);
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) hashMap.get(oVar);
            if (spannableStringBuilder == null) {
                spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) "a   ");
                g5 g5Var = new g5(null, 24.0f, rVar.currentAccount);
                g5Var.e(oVar.a);
                spannableStringBuilder.setSpan(g5Var, 0, 1, 33);
                spannableStringBuilder.append((CharSequence) UserObject.getUserName(oVar.a));
                hashMap.put(oVar, spannableStringBuilder);
            }
            w41 i11 = w41.i(i10, spannableStringBuilder);
            i11.K(!oVar.b);
            arrayList.add(i11);
        }
        th.A(R.string.PrivacyBiometryBotsInfo, arrayList);
    }

    public static void V(r rVar, w41 w41Var) {
        int i10;
        k51 k51Var;
        ArrayList arrayList = rVar.b;
        if (w41Var.a != 4 || (i10 = w41Var.d) < 0 || i10 >= arrayList.size()) {
            return;
        }
        o oVar = (o) arrayList.get(w41Var.d);
        oVar.b = !oVar.b;
        Activity parentActivity = rVar.getParentActivity();
        int i11 = rVar.currentAccount;
        long j10 = oVar.a.id;
        boolean z10 = oVar.b;
        WeakHashMap weakHashMap = p.k;
        SharedPreferences sharedPreferences = parentActivity.getSharedPreferences("2botbiometry_" + i11, 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putBoolean(j10 + "_disabled", z10);
        if (!z10 && sharedPreferences.getString(String.valueOf(j10), null) == null) {
            edit.putString(String.valueOf(j10), "");
        }
        edit.apply();
        u51 u51Var = rVar.a;
        if (u51Var == null || (k51Var = u51Var.U2) == null) {
            return;
        }
        k51Var.N(true);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        th.y(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.PrivacyBiometryBots));
        this.actionBar.setActionBarMenuOnItemClick(new al0(this, 27));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(g6.v0(g6.a7, this.resourceProvider));
        u51 u51Var = new u51(this, new t4(this, 8), new q(this), new q(this));
        this.a = u51Var;
        frameLayout.addView(u51Var, f6.e(-1, -1, 119));
        p.d(getParentActivity(), this.currentAccount, new nh.b0(this, 13));
        this.fragmentView = frameLayout;
        return frameLayout;
    }
}
