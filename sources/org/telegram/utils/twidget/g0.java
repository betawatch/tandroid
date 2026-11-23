package org.telegram.utils.twidget;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import org.json.JSONObject;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.a8;
import org.telegram.messenger.hd;
import org.telegram.messenger.ur;
import org.telegram.messenger.y10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.Components.d81;
import org.telegram.ui.Components.rk0;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g0(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:140:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02b2  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        SQLiteCursor sQLiteCursor;
        String str;
        String str2;
        ArrayList arrayList;
        String str3;
        d1 d1Var;
        d81 d81Var;
        d1 d1Var2;
        g2 T;
        rk0 rk0Var;
        d1 d1Var3;
        int i7 = 2;
        r5 = null;
        r5 = null;
        View view = null;
        switch (this.a) {
            case 0:
                k0 k0Var = (k0) this.b;
                TLRPC.TL_messageMediaWidget tL_messageMediaWidget = (TLRPC.TL_messageMediaWidget) this.c;
                k0Var.r = tL_messageMediaWidget;
                k0Var.q = tL_messageMediaWidget.public_data_hash;
                n0.c(k0Var, n0.C(tL_messageMediaWidget.chat_data), n0.C(tL_messageMediaWidget.public_data));
                return;
            case 1:
                ((ai.e) this.b).a(null, (TLRPC.TL_error) this.c);
                return;
            case 2:
                ur urVar = (ur) this.c;
                k0 k0Var2 = (k0) this.b;
                long j3 = k0Var2.c;
                int i10 = k0Var2.d;
                ArrayList arrayList2 = new ArrayList();
                try {
                    SQLiteDatabase sQLiteDatabase = urVar.b;
                    Locale locale = Locale.US;
                    SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT local FROM widget_state WHERE uid = " + j3 + " AND mid = " + i10, new Object[0]);
                    try {
                        try {
                            str2 = (!queryFinalized.next() || queryFinalized.isNull(0)) ? null : queryFinalized.stringValue(0);
                            try {
                                queryFinalized.dispose();
                                queryFinalized = urVar.b.queryFinalized("SELECT width, height, anchor FROM widget_heights WHERE uid = " + j3 + " AND mid = " + i10 + " ORDER BY date DESC", new Object[0]);
                                while (queryFinalized.next()) {
                                    arrayList2.add(new int[]{queryFinalized.intValue(0), queryFinalized.intValue(1), queryFinalized.intValue(2)});
                                }
                                queryFinalized.dispose();
                            } catch (Exception e10) {
                                e = e10;
                                str = str2;
                                sQLiteCursor = queryFinalized;
                                try {
                                    urVar.o(e, true);
                                    if (sQLiteCursor != null) {
                                        sQLiteCursor.dispose();
                                    }
                                    str2 = str;
                                    Object[] objArr = {str2, arrayList2};
                                    arrayList = (ArrayList) objArr[1];
                                    if (!arrayList.isEmpty()) {
                                    }
                                    org.telegram.messenger.g0.g3(new g0(3, k0Var2, objArr));
                                    return;
                                } catch (Throwable th2) {
                                    th = th2;
                                    if (sQLiteCursor != null) {
                                    }
                                    throw th;
                                }
                            }
                        } catch (Exception e11) {
                            e = e11;
                            sQLiteCursor = queryFinalized;
                            str = null;
                            urVar.o(e, true);
                            if (sQLiteCursor != null) {
                            }
                            str2 = str;
                            Object[] objArr2 = {str2, arrayList2};
                            arrayList = (ArrayList) objArr2[1];
                            if (!arrayList.isEmpty()) {
                            }
                            org.telegram.messenger.g0.g3(new g0(3, k0Var2, objArr2));
                            return;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        sQLiteCursor = queryFinalized;
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                        }
                        throw th;
                    }
                } catch (Exception e12) {
                    e = e12;
                    sQLiteCursor = null;
                } catch (Throwable th4) {
                    th = th4;
                    sQLiteCursor = null;
                }
                Object[] objArr22 = {str2, arrayList2};
                arrayList = (ArrayList) objArr22[1];
                if (!arrayList.isEmpty()) {
                    l0 l10 = n0.l(k0Var2.a());
                    synchronized (l10) {
                        if (l10.a.isEmpty()) {
                            for (int i11 = 0; i11 < arrayList.size() && i11 < 4; i11++) {
                                l10.a.add((int[]) arrayList.get(i11));
                            }
                        }
                    }
                }
                org.telegram.messenger.g0.g3(new g0(3, k0Var2, objArr22));
                return;
            case 3:
                k0 k0Var3 = (k0) this.b;
                String str4 = (String) ((Object[]) this.c)[0];
                HashMap hashMap = n0.c;
                k0Var3.z = true;
                String a10 = k0Var3.a();
                if (str4 != null && !hashMap.containsKey(a10)) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("local", new JSONObject(str4));
                        hashMap.put(a10, jSONObject);
                    } catch (Exception e13) {
                        a8.g(e13, true);
                    }
                }
                d1 d1Var4 = k0Var3.t;
                if (d1Var4 != null) {
                    JSONObject jSONObject2 = (JSONObject) hashMap.get(a10);
                    try {
                        str3 = hd.E0().y.toLanguageTag();
                    } catch (Exception unused) {
                        str3 = null;
                    }
                    String jSONObject3 = jSONObject2 != null ? jSONObject2.toString() : null;
                    d1Var4.t = str3;
                    d1Var4.u = jSONObject3;
                }
                rk0 rk0Var2 = k0Var3.u;
                if (rk0Var2 != null && (d1Var4 == null || d1Var4.i <= 0)) {
                    rk0Var2.p0("cached heights read");
                }
                if (k0Var3.A) {
                    k0Var3.A = false;
                    if (k0Var3.x > 0 && d1Var4 != null) {
                        n0.A(k0Var3);
                    }
                }
                n0.p();
                return;
            case 4:
                ((z0) this.b).u((y0) this.c, "did not make a session in 15000 ms");
                return;
            case 5:
                p1 p1Var = (p1) this.b;
                String str5 = (String) this.c;
                if (p1Var.A || (d1Var = p1Var.R) == null || (d81Var = d1Var.h) == null) {
                    return;
                }
                if (d81Var.F || (d81Var.w && d81Var.E)) {
                    d81Var.a.f(str5);
                    return;
                }
                return;
            case 6:
                ((y10) this.b).a((String) this.c);
                return;
            case 7:
                p1 p1Var2 = (p1) this.b;
                JSONObject jSONObject4 = (JSONObject) this.c;
                if (p1Var2.A || (d1Var2 = p1Var2.R) == null || d1Var2.e == null) {
                    return;
                }
                k0 h = n0.h(d1Var2);
                String optString = jSONObject4.optString("kind");
                if (!"openLink".equals(optString) && !"openTelegramLink".equals(optString)) {
                    if ("haptic".equals(optString)) {
                        if (h != null && h.x > 0 && (rk0Var = h.w) != null) {
                            view = rk0Var.W;
                        }
                        if (view != null) {
                            String optString2 = jSONObject4.optString("haptic");
                            view.performHapticFeedback("selection".equals(optString2) ? 4 : "notification".equals(optString2) ? 16 : 3);
                            return;
                        }
                        return;
                    }
                    return;
                }
                String optString3 = jSONObject4.optString("url");
                boolean equals = "openTelegramLink".equals(optString);
                if (TextUtils.isEmpty(optString3) || n0.i || (T = LaunchActivity.T()) == null || T.getParentActivity() == null) {
                    return;
                }
                Activity parentActivity = T.getParentActivity();
                if (equals) {
                    vf.c.t(parentActivity, optString3);
                    return;
                }
                n0.i = true;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, parentActivity, T.getResourceProvider());
                alertDialog$Builder.a.S = hd.N0(2131742606, null);
                alertDialog$Builder.a.U = hd.a0(null, null, 2131742607, optString3);
                alertDialog$Builder.k(hd.N0(2131747623, null), new v(i7, optString3, parentActivity));
                alertDialog$Builder.h(hd.N0(2131752577, null), null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                t1Var.setOnDismissListener(new hi.f1(7));
                if (T.showDialog(t1Var) == null) {
                    n0.i = false;
                    return;
                }
                return;
            default:
                p1 p1Var3 = (p1) this.b;
                p1Var3.U = ((Exception) this.c).toString();
                if (p1Var3.A || (d1Var3 = p1Var3.R) == null) {
                    return;
                }
                d1Var3.f(p1Var3.U);
                return;
        }
    }

    public /* synthetic */ g0(ur urVar, k0 k0Var) {
        this.a = 2;
        this.c = urVar;
        this.b = k0Var;
    }
}
