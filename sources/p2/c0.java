package p2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import com.android.billingclient.api.Purchase;
import com.google.android.gms.internal.play_billing.g3;
import com.google.android.gms.internal.play_billing.h3;
import com.google.android.gms.internal.play_billing.i3;
import com.google.android.gms.internal.play_billing.m3;
import com.google.android.gms.internal.play_billing.o1;
import com.google.android.gms.internal.play_billing.o3;
import com.google.android.gms.internal.play_billing.p3;
import com.google.android.gms.internal.play_billing.q2;
import com.google.android.gms.internal.play_billing.s1;
import com.google.android.gms.internal.play_billing.t3;
import com.google.android.gms.internal.play_billing.v3;
import java.util.ArrayList;
import n7.qa;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class c0 extends BroadcastReceiver {
    public boolean a;
    public final boolean b;
    public final /* synthetic */ f c;

    public c0(f fVar, boolean z4) {
        this.c = fVar;
        this.b = z4;
    }

    public final synchronized void a(Context context, IntentFilter intentFilter) {
        try {
            if (this.a) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                context.registerReceiver(this, intentFilter, true != this.b ? 4 : 2);
            } else {
                context.registerReceiver(this, intentFilter);
            }
            this.a = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b(Context context, IntentFilter intentFilter) {
        c0 c0Var;
        try {
            try {
                if (this.a) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    c0Var = this;
                    context.registerReceiver(c0Var, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null, true != this.b ? 4 : 2);
                } else {
                    c0Var = this;
                    context.registerReceiver(this, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null);
                }
                c0Var.a = true;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    public final void c(Bundle bundle, h hVar, int i10, m3 m3Var, long j10, boolean z4) {
        o1 d;
        try {
            if (bundle.getByteArray("FAILURE_LOGGING_PAYLOAD") == null) {
                ((qa) ((a0) this.c.d)).p1(z.b(23, i10, hVar, null, m3Var), j10, z4);
                return;
            }
            a0 a0Var = (a0) this.c.d;
            byte[] byteArray = bundle.getByteArray("FAILURE_LOGGING_PAYLOAD");
            int i11 = o1.a;
            synchronized (o1.class) {
                int i12 = o1.a;
                q2 q2Var = q2.c;
                d = s1.d();
                int i13 = o1.a;
            }
            ((qa) a0Var).p1(g3.n(byteArray, d), j10, z4);
        } catch (Throwable unused) {
            com.google.android.gms.internal.play_billing.u.h("BillingBroadcastManager", "Failed parsing Api failure.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0237  */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onReceive(Context context, Intent intent) {
        m3 m3Var;
        h e;
        long j10;
        ArrayList arrayList;
        h hVar;
        p3 p3Var;
        int intValue;
        String action = intent.getAction();
        int hashCode = action.hashCode();
        m3 m3Var2 = m3.d;
        m3 m3Var3 = m3.c;
        m3 m3Var4 = m3.e;
        if (hashCode == -1484087650) {
            if (action.equals("com.android.vending.billing.PURCHASES_UPDATED")) {
                m3Var = m3Var3;
            }
            m3Var = m3.b;
        } else if (hashCode != -337612916) {
            if (hashCode == 345207161 && action.equals("com.android.vending.billing.ALTERNATIVE_BILLING")) {
                m3Var = m3Var4;
            }
            m3Var = m3.b;
        } else {
            if (action.equals("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED")) {
                m3Var = m3Var2;
            }
            m3Var = m3.b;
        }
        int i10 = (m3Var.equals(m3Var2) || m3Var.equals(m3Var4)) ? 2 : m3Var.equals(m3Var3) ? 32 : 1;
        Bundle extras = intent.getExtras();
        f fVar = this.c;
        if (extras == null) {
            com.google.android.gms.internal.play_billing.u.h("BillingBroadcastManager", "Bundle is null.");
            a0 a0Var = (a0) fVar.d;
            h hVar2 = b0.f;
            ((qa) a0Var).m1(z.b(11, i10, hVar2, null, m3Var));
            p pVar = (p) fVar.c;
            if (pVar != null) {
                pVar.onPurchasesUpdated(hVar2, null);
                return;
            }
            return;
        }
        if (i10 == 2) {
            int i11 = com.google.android.gms.internal.play_billing.u.a;
            g a2 = h.a();
            a2.a = com.google.android.gms.internal.play_billing.u.a("BillingBroadcastManager", intent.getExtras());
            Bundle extras2 = intent.getExtras();
            if (extras2 == null) {
                com.google.android.gms.internal.play_billing.u.h("BillingBroadcastManager", "Unexpected null bundle received!");
            } else {
                Object obj = extras2.get("SUB_RESPONSE_CODE");
                if (obj == null) {
                    com.google.android.gms.internal.play_billing.u.g("BillingBroadcastManager", "getLaunchBillingFlowSubResponseCodeFromBundle() got null response code, assuming OK");
                } else if (obj instanceof Integer) {
                    intValue = ((Integer) obj).intValue();
                    a2.b = intValue;
                    a2.c = com.google.android.gms.internal.play_billing.u.f("BillingBroadcastManager", intent.getExtras());
                    e = a2.e();
                } else {
                    com.google.android.gms.internal.play_billing.u.h("BillingBroadcastManager", "Unexpected type for bundle sub response code: ".concat(obj.getClass().getName()));
                }
            }
            intValue = 0;
            a2.b = intValue;
            a2.c = com.google.android.gms.internal.play_billing.u.f("BillingBroadcastManager", intent.getExtras());
            e = a2.e();
        } else {
            e = com.google.android.gms.internal.play_billing.u.e("BillingBroadcastManager", intent);
        }
        long j11 = extras.getLong("billingClientTransactionId", 0L);
        boolean z4 = extras.getBoolean("wasServiceAutoReconnected", false);
        if (!m3Var.equals(m3Var3) && !m3Var.equals(m3Var2)) {
            if (m3Var.equals(m3Var4)) {
                if (e.a != 0) {
                    c(extras, e, i10, m3Var, j11, z4);
                    p pVar2 = (p) fVar.c;
                    com.google.android.gms.internal.play_billing.p pVar3 = com.google.android.gms.internal.play_billing.r.b;
                    pVar2.onPurchasesUpdated(e, com.google.android.gms.internal.play_billing.v.e);
                    return;
                }
                fVar.getClass();
                com.google.android.gms.internal.play_billing.u.h("BillingBroadcastManager", "AlternativeBillingListener and UserChoiceBillingListener is null.");
                a0 a0Var2 = (a0) fVar.d;
                h hVar3 = b0.f;
                ((qa) a0Var2).p1(z.b(77, i10, hVar3, null, m3Var), j11, z4);
                p pVar4 = (p) fVar.c;
                com.google.android.gms.internal.play_billing.p pVar5 = com.google.android.gms.internal.play_billing.r.b;
                pVar4.onPurchasesUpdated(hVar3, com.google.android.gms.internal.play_billing.v.e);
                return;
            }
            return;
        }
        ArrayList<String> stringArrayList = extras.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList<String> stringArrayList2 = extras.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        ArrayList arrayList2 = new ArrayList();
        if (stringArrayList == null || stringArrayList2 == null) {
            j10 = 0;
            Purchase j12 = com.google.android.gms.internal.play_billing.u.j(extras.getString("INAPP_PURCHASE_DATA"), extras.getString("INAPP_DATA_SIGNATURE"));
            if (j12 == null) {
                com.google.android.gms.internal.play_billing.u.g("BillingHelper", "Couldn't find single purchase data as well.");
                arrayList = null;
                if (e.a != 0) {
                    a0 a0Var3 = (a0) fVar.d;
                    i3 c3 = z.c(i10, m3Var);
                    qa qaVar = (qa) a0Var3;
                    qaVar.getClass();
                    try {
                        h3 h3Var = (h3) c3.g();
                        t3 t3Var = (t3) c3.n().g();
                        t3Var.c();
                        v3.n((v3) t3Var.b, z4);
                        h3Var.c();
                        i3.p((i3) h3Var.b, (v3) t3Var.a());
                        i3 i3Var = (i3) h3Var.a();
                        if (j11 == j10) {
                            p3Var = (p3) qaVar.b;
                        } else {
                            o3 o3Var = (o3) ((p3) qaVar.b).g();
                            o3Var.c();
                            p3.r((p3) o3Var.b, j11);
                            p3Var = (p3) o3Var.a();
                        }
                        qaVar.w1(i3Var, p3Var);
                    } catch (Throwable th2) {
                        com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
                    }
                    hVar = e;
                } else {
                    hVar = e;
                    c(extras, hVar, i10, m3Var, j11, z4);
                }
                ((p) fVar.c).onPurchasesUpdated(hVar, arrayList);
            }
            arrayList2.add(j12);
        } else {
            j10 = 0;
            com.google.android.gms.internal.play_billing.u.g("BillingHelper", "Found purchase list of " + stringArrayList.size() + " items");
            for (int i12 = 0; i12 < stringArrayList.size() && i12 < stringArrayList2.size(); i12++) {
                Purchase j13 = com.google.android.gms.internal.play_billing.u.j(stringArrayList.get(i12), stringArrayList2.get(i12));
                if (j13 != null) {
                    arrayList2.add(j13);
                }
            }
        }
        arrayList = arrayList2;
        if (e.a != 0) {
        }
        ((p) fVar.c).onPurchasesUpdated(hVar, arrayList);
    }
}
