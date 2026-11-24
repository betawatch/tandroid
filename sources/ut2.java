// default package

import android.app.Activity;
import java.util.HashMap;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class ut2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ut2(cj3 cj3Var, boolean z, boolean z2, boolean z3, Activity activity) {
        this.a = (byte) 1;
        this.e = cj3Var;
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
                qu2 qu2Var = (qu2) obj2;
                HashMap hashMap = (HashMap) obj;
                if (w01.a) {
                    fa4.b("sync contacts by alert");
                }
                qu2Var.F(hashMap, true, this.b, this.c, false, false, this.d);
                break;
            case 1:
                cj3 cj3Var = (cj3) obj2;
                Activity activity = (Activity) obj;
                if (cj3Var.getParentActivity() != null) {
                    cj3Var.v2 = false;
                    boolean z2 = this.c;
                    boolean z3 = this.d;
                    if (z || z2 || z3) {
                        byte b2 = 1;
                        cj3Var.B0 = true;
                        if (!z || !tl7.E0(activity)) {
                            if (!z2 || !cj3Var.W1 || !cj3Var.getUserConfig().V || !activity.shouldShowRequestPermissionRationale("android.permission.READ_CONTACTS")) {
                                if (!z3 || !activity.shouldShowRequestPermissionRationale("android.permission.WRITE_EXTERNAL_STORAGE")) {
                                    cj3Var.A2(true);
                                    break;
                                } else if (activity instanceof tg0) {
                                    hd x = ((tg0) activity).x(R.raw.permission_request_folder, k96.M0(2131747106, null));
                                    cj3Var.V1 = x;
                                    cj3Var.showDialog(x);
                                    break;
                                }
                            } else {
                                hd hdVar = ij.v(activity, new qg3(cj3Var, b2)).a;
                                cj3Var.V1 = hdVar;
                                cj3Var.showDialog(hdVar);
                                break;
                            }
                        } else {
                            rqe.e(new String[]{"android.permission.POST_NOTIFICATIONS"}, new w52(new pz1((Object) cj3Var, (Object) activity, (byte) 12), (byte) 3));
                            break;
                        }
                    }
                }
                break;
            default:
                c cVar = (c) obj2;
                i8c i8cVar = (i8c) obj;
                c.O("getSecretPhrase: ready!");
                TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) cVar.e;
                byte b3 = 2;
                if (!cVar.c.f(tL_walletState.public_key)) {
                    if (!tL_walletState.backup_enabled) {
                        c.m("getSecretPhrase: no server backup!");
                        i8cVar.a(null, "NO_LOCAL_BACKUP");
                        break;
                    } else {
                        c.O("getSecretPhrase: exportSecretPhrase through password request");
                        cy7.a(cVar.a, new pb((byte) 5), null, null, null, new qo0(cVar, i8cVar, b3), this.c, this.d, new h24((iu4) null, !z ? null : new c05(cVar, i8cVar)));
                        break;
                    }
                } else {
                    c.O("getSecretPhrase: device has secured phrase, requesting");
                    g15 g15Var = cVar.c;
                    byte[] bArr = tL_walletState.public_key;
                    o42 o42Var = new o42(cVar, i8cVar, z, b3);
                    if (bArr == null) {
                        p = "";
                    } else {
                        g15Var.getClass();
                        p = g15.p(bArr);
                    }
                    g15.i.execute(new fe2(g15Var, g15Var.l(), p, true, (p8c) o42Var));
                    break;
                }
        }
    }

    public /* synthetic */ ut2(Object obj, Object obj2, boolean z, boolean z2, boolean z3, byte b) {
        this.a = b;
        this.e = obj;
        this.f = obj2;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }
}
