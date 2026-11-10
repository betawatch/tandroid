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
import org.telegram.messenger.id;
import org.telegram.messenger.yr;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f0(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0275  */
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
        v0 v0Var;
        f2 T;
        ck0 ck0Var;
        v0 v0Var2;
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
                ((g0) this.b).a(null, (TLRPC.TL_error) this.c);
                return;
            case 2:
                yr yrVar = (yr) this.c;
                k0 k0Var2 = (k0) this.b;
                long j3 = k0Var2.c;
                int i10 = k0Var2.d;
                ArrayList arrayList2 = new ArrayList();
                try {
                    SQLiteDatabase sQLiteDatabase = yrVar.b;
                    Locale locale = Locale.US;
                    SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT local FROM widget_state WHERE uid = " + j3 + " AND mid = " + i10, new Object[0]);
                    try {
                        try {
                            str2 = (!queryFinalized.next() || queryFinalized.isNull(0)) ? null : queryFinalized.stringValue(0);
                            try {
                                queryFinalized.dispose();
                                queryFinalized = yrVar.b.queryFinalized("SELECT width, height, anchor FROM widget_heights WHERE uid = " + j3 + " AND mid = " + i10 + " ORDER BY date DESC", new Object[0]);
                                while (queryFinalized.next()) {
                                    arrayList2.add(new int[]{queryFinalized.intValue(0), queryFinalized.intValue(1), queryFinalized.intValue(2)});
                                }
                                queryFinalized.dispose();
                            } catch (Exception e10) {
                                e = e10;
                                str = str2;
                                sQLiteCursor = queryFinalized;
                                try {
                                    yrVar.o(e, true);
                                    if (sQLiteCursor != null) {
                                        sQLiteCursor.dispose();
                                    }
                                    str2 = str;
                                    Object[] objArr = {str2, arrayList2};
                                    arrayList = (ArrayList) objArr[1];
                                    if (!arrayList.isEmpty()) {
                                    }
                                    org.telegram.messenger.g0.h3(new f0(3, k0Var2, objArr));
                                    return;
                                } catch (Throwable th2) {
                                    th = th2;
                                    if (sQLiteCursor != null) {
                                        sQLiteCursor.dispose();
                                    }
                                    throw th;
                                }
                            }
                        } catch (Exception e11) {
                            e = e11;
                            sQLiteCursor = queryFinalized;
                            str = null;
                            yrVar.o(e, true);
                            if (sQLiteCursor != null) {
                            }
                            str2 = str;
                            Object[] objArr2 = {str2, arrayList2};
                            arrayList = (ArrayList) objArr2[1];
                            if (!arrayList.isEmpty()) {
                            }
                            org.telegram.messenger.g0.h3(new f0(3, k0Var2, objArr2));
                            return;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        sQLiteCursor = queryFinalized;
                        if (sQLiteCursor != null) {
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
                org.telegram.messenger.g0.h3(new f0(3, k0Var2, objArr22));
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
                v0 v0Var3 = k0Var3.t;
                if (v0Var3 != null) {
                    JSONObject jSONObject2 = (JSONObject) hashMap.get(a10);
                    try {
                        str3 = id.E0().y.toLanguageTag();
                    } catch (Exception unused) {
                        str3 = null;
                    }
                    String jSONObject3 = jSONObject2 != null ? jSONObject2.toString() : null;
                    v0Var3.t = str3;
                    v0Var3.u = jSONObject3;
                }
                ck0 ck0Var2 = k0Var3.u;
                if (ck0Var2 != null && (v0Var3 == null || v0Var3.i <= 0)) {
                    ck0Var2.p0("cached heights read");
                }
                if (k0Var3.A) {
                    k0Var3.A = false;
                    if (k0Var3.x > 0 && v0Var3 != null) {
                        n0.A(k0Var3);
                    }
                }
                n0.p();
                return;
            case 4:
                i1 i1Var = (i1) this.b;
                JSONObject jSONObject4 = (JSONObject) this.c;
                if (i1Var.w || (v0Var = i1Var.L) == null || v0Var.e == null) {
                    return;
                }
                k0 h = n0.h(v0Var);
                String optString = jSONObject4.optString("kind");
                if (!"openLink".equals(optString) && !"openTelegramLink".equals(optString)) {
                    if ("haptic".equals(optString)) {
                        if (h != null && h.x > 0 && (ck0Var = h.w) != null) {
                            view = ck0Var.V;
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
                alertDialog$Builder.a.R = id.M0(2131742872, null);
                alertDialog$Builder.a.T = id.a0(null, null, 2131742873, optString3);
                alertDialog$Builder.k(id.M0(2131747817, null), new t(i7, optString3, parentActivity));
                alertDialog$Builder.h(id.M0(2131752589, null), null);
                u1 u1Var = alertDialog$Builder.a;
                u1Var.setOnDismissListener(new fi.d1(7));
                if (T.showDialog(u1Var) == null) {
                    n0.i = false;
                    return;
                }
                return;
            default:
                i1 i1Var2 = (i1) this.b;
                Exception exc = (Exception) this.c;
                i1Var2.getClass();
                i1Var2.N = exc.toString();
                if (i1Var2.w || (v0Var2 = i1Var2.L) == null) {
                    return;
                }
                v0Var2.g(i1Var2.N);
                return;
        }
    }

    public /* synthetic */ f0(yr yrVar, k0 k0Var) {
        this.a = 2;
        this.c = yrVar;
        this.b = k0Var;
    }
}
