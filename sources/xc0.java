// default package

import android.content.Intent;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class xc0 implements jm7 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xc0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                yc0 yc0Var = (yc0) obj;
                if (yc0Var.g && i == yc0Var.e) {
                    yc0Var.b(objArr);
                    break;
                }
                break;
            case 1:
                ze6 ze6Var = (ze6) obj;
                int intValue = ((Integer) objArr[0]).intValue();
                ((Integer) objArr[1]).getClass();
                Intent intent = (Intent) objArr[2];
                nm7.e().n(this, nm7.g5);
                if (intValue == 200) {
                    try {
                        ze6Var.G = (GoogleSignInAccount) ble.b(intent).getResult(ap.class);
                        ze6Var.h(null);
                        break;
                    } catch (ap e) {
                        fc4.g(e, true);
                        return;
                    }
                }
                break;
            default:
                cg6 cg6Var = (cg6) obj;
                int intValue2 = ((Integer) objArr[0]).intValue();
                ((Integer) objArr[1]).getClass();
                Intent intent2 = (Intent) objArr[2];
                nm7.e().n(this, nm7.g5);
                if (intValue2 == 200) {
                    try {
                        cg6Var.E = (GoogleSignInAccount) ble.b(intent2).getResult(ap.class);
                        cg6Var.h(null);
                        break;
                    } catch (ap e2) {
                        fc4.g(e2, true);
                    }
                }
                break;
        }
    }
}
