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
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.x51;
import org.telegram.ui.i5;
import org.telegram.ui.ll0;
import org.telegram.ui.yh;
import qh.d4;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class r extends org.telegram.ui.ActionBar.p2 {
    public i61 a;
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
            j51 i11 = j51.i(i10, spannableStringBuilder);
            i11.K(!oVar.b);
            arrayList.add(i11);
        }
        yh.A(R.string.PrivacyBiometryBotsInfo, arrayList);
    }

    public static void V(r rVar, j51 j51Var) {
        int i10;
        x51 x51Var;
        ArrayList arrayList = rVar.b;
        if (j51Var.a != 4 || (i10 = j51Var.d) < 0 || i10 >= arrayList.size()) {
            return;
        }
        o oVar = (o) arrayList.get(j51Var.d);
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
        i61 i61Var = rVar.a;
        if (i61Var == null || (x51Var = i61Var.V2) == null) {
            return;
        }
        x51Var.N(true);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final View createView(Context context) {
        yh.z(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.PrivacyBiometryBots));
        this.actionBar.setActionBarMenuOnItemClick(new ll0(this, 27));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(k6.v0(k6.a7, this.resourceProvider));
        i61 i61Var = new i61(this, new d4(this, 8), new q(this), new q(this));
        this.a = i61Var;
        frameLayout.addView(i61Var, c6.e(-1, -1, 119));
        p.d(getParentActivity(), this.currentAccount, new org.telegram.ui.web.d1(this, 13));
        this.fragmentView = frameLayout;
        return frameLayout;
    }
}
