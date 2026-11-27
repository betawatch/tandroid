// default package

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import com.android.billingclient.api.Purchase;
import java.util.ArrayList;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class xff extends BroadcastReceiver {
    public boolean a;
    public final boolean b;
    public final /* synthetic */ fi0 c;

    public xff(fi0 fi0Var, boolean z) {
        this.c = fi0Var;
        this.b = z;
    }

    public final synchronized void a(Context context, IntentFilter intentFilter) {
        if (!this.a) {
            if (Build.VERSION.SDK_INT >= 33) {
                context.registerReceiver(this, intentFilter, true != this.b ? 4 : 2);
            } else {
                context.registerReceiver(this, intentFilter);
            }
            this.a = true;
        }
    }

    public final synchronized void b(Context context, IntentFilter intentFilter) {
        xff xffVar;
        try {
            try {
                if (this.a) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    xffVar = this;
                    context.registerReceiver(xffVar, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null, true != this.b ? 4 : 2);
                } else {
                    xffVar = this;
                    context.registerReceiver(xffVar, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null);
                }
                xffVar.a = true;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public final void c(Bundle bundle, gi0 gi0Var, int i, uoe uoeVar, long j, boolean z) {
        d2e d;
        try {
            byte[] byteArray = bundle.getByteArray("FAILURE_LOGGING_PAYLOAD");
            fi0 fi0Var = this.c;
            if (byteArray == null) {
                ((zhc) fi0Var.d).k(pnd.b(23, i, gi0Var, null, uoeVar), j, z);
                return;
            }
            zhc zhcVar = (zhc) fi0Var.d;
            byte[] byteArray2 = bundle.getByteArray("FAILURE_LOGGING_PAYLOAD");
            int i2 = d2e.a;
            synchronized (d2e.class) {
                try {
                    int i3 = d2e.a;
                    zee zeeVar = zee.c;
                    d = g4e.d();
                    int i4 = d2e.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            zhcVar.k(wle.n(byteArray2, d), j, z);
        } catch (Throwable unused) {
            old.h("BillingBroadcastManager", "Failed parsing Api failure.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0227  */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onReceive(Context context, Intent intent) {
        uoe uoeVar;
        gi0 e;
        long j;
        ArrayList arrayList;
        gi0 gi0Var;
        int intValue;
        String action = intent.getAction();
        int hashCode = action.hashCode();
        uoe uoeVar2 = uoe.d;
        uoe uoeVar3 = uoe.c;
        uoe uoeVar4 = uoe.e;
        if (hashCode == -1484087650) {
            if (action.equals("com.android.vending.billing.PURCHASES_UPDATED")) {
                uoeVar = uoeVar3;
            }
            uoeVar = uoe.b;
        } else if (hashCode != -337612916) {
            if (hashCode == 345207161 && action.equals("com.android.vending.billing.ALTERNATIVE_BILLING")) {
                uoeVar = uoeVar4;
            }
            uoeVar = uoe.b;
        } else {
            if (action.equals("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED")) {
                uoeVar = uoeVar2;
            }
            uoeVar = uoe.b;
        }
        int i = (uoeVar.equals(uoeVar2) || uoeVar.equals(uoeVar4)) ? 2 : uoeVar.equals(uoeVar3) ? 32 : 1;
        Bundle extras = intent.getExtras();
        fi0 fi0Var = this.c;
        if (extras == null) {
            old.h("BillingBroadcastManager", "Bundle is null.");
            zhc zhcVar = (zhc) fi0Var.d;
            gi0 gi0Var2 = hod.f;
            zhcVar.h(pnd.b(11, i, gi0Var2, null, uoeVar));
            di0 di0Var = (di0) fi0Var.c;
            if (di0Var != null) {
                di0Var.m(gi0Var2, null, null);
                return;
            }
            return;
        }
        if (i == 2) {
            int i2 = old.a;
            h1 a = gi0.a();
            a.a = old.a("BillingBroadcastManager", intent.getExtras());
            Bundle extras2 = intent.getExtras();
            if (extras2 == null) {
                old.h("BillingBroadcastManager", "Unexpected null bundle received!");
            } else {
                Object obj = extras2.get("SUB_RESPONSE_CODE");
                if (obj == null) {
                    old.g("BillingBroadcastManager", "getLaunchBillingFlowSubResponseCodeFromBundle() got null response code, assuming OK");
                } else if (obj instanceof Integer) {
                    intValue = ((Integer) obj).intValue();
                    a.b = intValue;
                    a.c = old.f("BillingBroadcastManager", intent.getExtras());
                    e = a.a();
                } else {
                    old.h("BillingBroadcastManager", "Unexpected type for bundle sub response code: ".concat(obj.getClass().getName()));
                }
            }
            intValue = 0;
            a.b = intValue;
            a.c = old.f("BillingBroadcastManager", intent.getExtras());
            e = a.a();
        } else {
            e = old.e("BillingBroadcastManager", intent);
        }
        long j2 = extras.getLong("billingClientTransactionId", 0L);
        boolean z = extras.getBoolean("wasServiceAutoReconnected", false);
        if (!uoeVar.equals(uoeVar3) && !uoeVar.equals(uoeVar2)) {
            if (uoeVar.equals(uoeVar4)) {
                if (e.a != 0) {
                    c(extras, e, i, uoeVar, j2, z);
                    di0 di0Var2 = (di0) fi0Var.c;
                    jjd jjdVar = vjd.b;
                    di0Var2.m(e, emd.e, null);
                    return;
                }
                fi0Var.getClass();
                old.h("BillingBroadcastManager", "AlternativeBillingListener and UserChoiceBillingListener is null.");
                zhc zhcVar2 = (zhc) fi0Var.d;
                gi0 gi0Var3 = hod.f;
                zhcVar2.k(pnd.b(77, i, gi0Var3, null, uoeVar), j2, z);
                di0 di0Var3 = (di0) fi0Var.c;
                jjd jjdVar2 = vjd.b;
                di0Var3.m(gi0Var3, emd.e, null);
                return;
            }
            return;
        }
        ArrayList<String> stringArrayList = extras.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList<String> stringArrayList2 = extras.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        ArrayList arrayList2 = new ArrayList();
        if (stringArrayList == null || stringArrayList2 == null) {
            j = 0;
            Purchase j3 = old.j(extras.getString("INAPP_PURCHASE_DATA"), extras.getString("INAPP_DATA_SIGNATURE"));
            if (j3 == null) {
                old.g("BillingHelper", "Couldn't find single purchase data as well.");
                arrayList = null;
                if (e.a != 0) {
                    zhc zhcVar3 = (zhc) fi0Var.d;
                    wme c = pnd.c(i, uoeVar);
                    zhcVar3.getClass();
                    try {
                        eme emeVar = (eme) c.g();
                        wre wreVar = (wre) c.n().g();
                        wreVar.b();
                        wse.n((wse) wreVar.b, z);
                        emeVar.b();
                        wme.p((wme) emeVar.b, (wse) wreVar.a());
                        wme wmeVar = (wme) emeVar.a();
                        cqe cqeVar = (cqe) zhcVar3.b;
                        if (j2 != j) {
                            rpe rpeVar = (rpe) cqeVar.g();
                            rpeVar.b();
                            cqe.r((cqe) rpeVar.b, j2);
                            cqeVar = (cqe) rpeVar.a();
                        }
                        zhcVar3.r(wmeVar, cqeVar);
                    } catch (Throwable th) {
                        old.i("BillingLogger", "Unable to log.", th);
                    }
                    gi0Var = e;
                } else {
                    gi0Var = e;
                    c(extras, gi0Var, i, uoeVar, j2, z);
                }
                ((di0) fi0Var.c).m(gi0Var, arrayList, null);
            }
            arrayList2.add(j3);
        } else {
            j = 0;
            old.g("BillingHelper", "Found purchase list of " + stringArrayList.size() + " items");
            for (int i3 = 0; i3 < stringArrayList.size() && i3 < stringArrayList2.size(); i3++) {
                Purchase j4 = old.j(stringArrayList.get(i3), stringArrayList2.get(i3));
                if (j4 != null) {
                    arrayList2.add(j4);
                }
            }
        }
        arrayList = arrayList2;
        if (e.a != 0) {
        }
        ((di0) fi0Var.c).m(gi0Var, arrayList, null);
    }
}
