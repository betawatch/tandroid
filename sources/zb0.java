// default package

import android.content.Intent;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class zb0 implements fn7 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zb0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ac0 ac0Var = (ac0) obj;
                if (ac0Var.g && i == ac0Var.e) {
                    ac0Var.b(objArr);
                    break;
                }
                break;
            case 1:
                df6 df6Var = (df6) obj;
                int intValue = ((Integer) objArr[0]).intValue();
                ((Integer) objArr[1]).getClass();
                Intent intent = (Intent) objArr[2];
                jn7.e().n(this, jn7.f5);
                if (intValue == 200) {
                    try {
                        df6Var.G = (GoogleSignInAccount) sne.b(intent).getResult(ao.class);
                        df6Var.h(null);
                        break;
                    } catch (ao e) {
                        cc4.g(e, true);
                        return;
                    }
                }
                break;
            default:
                fg6 fg6Var = (fg6) obj;
                int intValue2 = ((Integer) objArr[0]).intValue();
                ((Integer) objArr[1]).getClass();
                Intent intent2 = (Intent) objArr[2];
                jn7.e().n(this, jn7.f5);
                if (intValue2 == 200) {
                    try {
                        fg6Var.E = (GoogleSignInAccount) sne.b(intent2).getResult(ao.class);
                        fg6Var.h(null);
                        break;
                    } catch (ao e2) {
                        cc4.g(e2, true);
                    }
                }
                break;
        }
    }
}
