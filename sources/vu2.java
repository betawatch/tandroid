// default package

import android.app.Activity;
import java.util.HashMap;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class vu2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ vu2(uj3 uj3Var, boolean z, boolean z2, boolean z3, Activity activity) {
        this.a = (byte) 1;
        this.e = uj3Var;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.f = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String p;
        byte b = this.a;
        boolean z = this.b;
        Object obj = this.f;
        Object obj2 = this.e;
        switch (b) {
            case 0:
                lv2 lv2Var = (lv2) obj2;
                HashMap hashMap = (HashMap) obj;
                if (f11.a) {
                    cc4.b("sync contacts by alert");
                }
                lv2Var.F(hashMap, true, this.b, this.c, false, false, this.d);
                break;
            case 1:
                uj3 uj3Var = (uj3) obj2;
                Activity activity = (Activity) obj;
                if (uj3Var.getParentActivity() != null) {
                    byte b2 = 0;
                    uj3Var.v2 = false;
                    boolean z2 = this.c;
                    boolean z3 = this.d;
                    if (z || z2 || z3) {
                        uj3Var.B0 = true;
                        if (!z || !so7.F0(activity)) {
                            if (!z2 || !uj3Var.W1 || !uj3Var.getUserConfig().V || !activity.shouldShowRequestPermissionRationale("android.permission.READ_CONTACTS")) {
                                if (!z3 || !activity.shouldShowRequestPermissionRationale("android.permission.WRITE_EXTERNAL_STORAGE")) {
                                    uj3Var.C2(true);
                                    break;
                                } else if (activity instanceof ug0) {
                                    id x = ((ug0) activity).x(R.raw.permission_request_folder, ob6.M0(2131747026, null));
                                    uj3Var.V1 = x;
                                    uj3Var.showDialog(x);
                                    break;
                                }
                            } else {
                                id idVar = jj.v(activity, new qg3(uj3Var, b2)).a;
                                uj3Var.V1 = idVar;
                                uj3Var.showDialog(idVar);
                                break;
                            }
                        } else {
                            jve.e(new String[]{"android.permission.POST_NOTIFICATIONS"}, new m62(new rx1((Object) uj3Var, (Object) activity, (byte) 13), (byte) 3));
                            break;
                        }
                    }
                }
                break;
            default:
                c cVar = (c) obj2;
                icc iccVar = (icc) obj;
                c.P("getSecretPhrase: ready!");
                TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) cVar.e;
                byte b3 = 2;
                if (!cVar.c.f(tL_walletState.public_key)) {
                    if (!tL_walletState.backup_enabled) {
                        c.m("getSecretPhrase: no server backup!");
                        iccVar.a(null, "NO_LOCAL_BACKUP");
                        break;
                    } else {
                        c.P("getSecretPhrase: exportSecretPhrase through password request");
                        i18.a(cVar.a, new sb((byte) 5), null, null, null, new qo0(cVar, iccVar, b3), this.c, this.d, new c34((rj4) null, !z ? null : new g25(cVar, iccVar)));
                        break;
                    }
                } else {
                    c.P("getSecretPhrase: device has secured phrase, requesting");
                    k35 k35Var = cVar.c;
                    byte[] bArr = tL_walletState.public_key;
                    e52 e52Var = new e52(cVar, iccVar, z, b3);
                    if (bArr == null) {
                        p = "";
                    } else {
                        k35Var.getClass();
                        p = k35.p(bArr);
                    }
                    k35.i.execute(new re2(k35Var, k35Var.l(), p, true, (pcc) e52Var));
                    break;
                }
        }
    }

    public /* synthetic */ vu2(Object obj, Object obj2, boolean z, boolean z2, boolean z3, byte b) {
        this.a = b;
        this.e = obj;
        this.f = obj2;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }
}
