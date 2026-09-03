package sh;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import k7.c6;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.w51;
import org.telegram.ui.i5;
import org.telegram.ui.ll0;
import org.telegram.ui.yh;
import qh.c4;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class r extends org.telegram.ui.ActionBar.p2 {
    public h61 a;
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
                i5 i5Var = new i5(null, 24.0f, rVar.currentAccount);
                i5Var.e(oVar.a);
                spannableStringBuilder.setSpan(i5Var, 0, 1, 33);
                spannableStringBuilder.append((CharSequence) UserObject.getUserName(oVar.a));
                hashMap.put(oVar, spannableStringBuilder);
            }
            h51 i11 = h51.i(i10, spannableStringBuilder);
            i11.K(!oVar.b);
            arrayList.add(i11);
        }
        yh.A(R.string.PrivacyBiometryBotsInfo, arrayList);
    }

    public static void V(r rVar, h51 h51Var) {
        int i10;
        w51 w51Var;
        ArrayList arrayList = rVar.b;
        if (h51Var.a != 4 || (i10 = h51Var.d) < 0 || i10 >= arrayList.size()) {
            return;
        }
        o oVar = (o) arrayList.get(h51Var.d);
        oVar.b = !oVar.b;
        Activity parentActivity = rVar.getParentActivity();
        int i11 = rVar.currentAccount;
        long j10 = oVar.a.id;
        boolean z4 = oVar.b;
        WeakHashMap weakHashMap = p.k;
        SharedPreferences sharedPreferences = parentActivity.getSharedPreferences("2botbiometry_" + i11, 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putBoolean(j10 + "_disabled", z4);
        if (!z4 && sharedPreferences.getString(String.valueOf(j10), null) == null) {
            edit.putString(String.valueOf(j10), "");
        }
        edit.apply();
        h61 h61Var = rVar.a;
        if (h61Var == null || (w51Var = h61Var.V2) == null) {
            return;
        }
        w51Var.N(true);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final View createView(Context context) {
        yh.z(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.PrivacyBiometryBots));
        this.actionBar.setActionBarMenuOnItemClick(new ll0(this, 27));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(k6.v0(k6.a7, this.resourceProvider));
        h61 h61Var = new h61(this, new c4(this, 8), new q(this), new q(this));
        this.a = h61Var;
        frameLayout.addView(h61Var, c6.e(-1, -1, 119));
        p.d(getParentActivity(), this.currentAccount, new org.telegram.ui.web.d1(this, 13));
        this.fragmentView = frameLayout;
        return frameLayout;
    }
}
