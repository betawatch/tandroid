package xh;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import org.telegram.messenger.at;
import org.telegram.messenger.dd;
import org.telegram.messenger.i20;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.v51;
import org.telegram.ui.e5;
import org.telegram.ui.z01;
import vh.m6;
import w7.b6;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class o extends org.telegram.ui.ActionBar.k2 {
    public v51 a;
    public final ArrayList b;
    public final HashMap c;

    public o() {
        super(null);
        this.b = new ArrayList();
        this.c = new HashMap();
    }

    public static void Z(o oVar, ArrayList arrayList) {
        HashMap hashMap = oVar.c;
        ArrayList arrayList2 = oVar.b;
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            m mVar = (m) arrayList2.get(i10);
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) hashMap.get(mVar);
            if (spannableStringBuilder == null) {
                spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) "a   ");
                e5 e5Var = new e5(24.0f, oVar.currentAccount, null);
                e5Var.e(mVar.a);
                spannableStringBuilder.setSpan(e5Var, 0, 1, 33);
                spannableStringBuilder.append((CharSequence) i20.p(mVar.a));
                hashMap.put(mVar, spannableStringBuilder);
            }
            b51 i11 = b51.i(i10, spannableStringBuilder);
            i11.L(!mVar.b);
            arrayList.add(i11);
        }
        arrayList.add(b51.C(dd.L0(2131746876, null)));
    }

    public static void a0(o oVar, b51 b51Var) {
        int i10;
        q51 q51Var;
        ArrayList arrayList = oVar.b;
        if (b51Var.a != 4 || (i10 = b51Var.d) < 0 || i10 >= arrayList.size()) {
            return;
        }
        m mVar = (m) arrayList.get(b51Var.d);
        mVar.b = !mVar.b;
        Activity parentActivity = oVar.getParentActivity();
        int i11 = oVar.currentAccount;
        long j10 = mVar.a.id;
        boolean z10 = mVar.b;
        WeakHashMap weakHashMap = n.k;
        SharedPreferences sharedPreferences = parentActivity.getSharedPreferences("2botbiometry_" + i11, 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putBoolean(j10 + "_disabled", z10);
        if (!z10 && sharedPreferences.getString(String.valueOf(j10), null) == null) {
            edit.putString(String.valueOf(j10), "");
        }
        edit.apply();
        v51 v51Var = oVar.a;
        if (v51Var == null || (q51Var = v51Var.f3) == null) {
            return;
        }
        q51Var.O(true);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final View createView(Context context) {
        this.actionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.c2(false));
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(dd.L0(2131746878, null));
        this.actionBar.setActionBarMenuOnItemClick(new z01(this, 18));
        FrameLayout frameLayout = new FrameLayout(context);
        a7.i(t6.a7, frameLayout, this.resourceProvider);
        v51 v51Var = new v51(this, new qh.d(this, 27), new wh.b(this, 10), new xg.a(15, this));
        this.a = v51Var;
        frameLayout.addView(v51Var, b6.e(-1, -1, at.E1));
        n.d(getParentActivity(), this.currentAccount, new m6(this, 2));
        this.fragmentView = frameLayout;
        return frameLayout;
    }
}
