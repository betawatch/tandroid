// default package

import android.os.Bundle;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class y00 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ i20 b;
    public final /* synthetic */ k27 c;

    public /* synthetic */ y00(i20 i20Var, k27 k27Var, byte b) {
        this.a = b;
        this.b = i20Var;
        this.c = k27Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        k27 k27Var = this.c;
        i20 i20Var = this.b;
        switch (b) {
            case 0:
                ia7 ia7Var = i20Var.p2;
                if (ia7Var != null) {
                    TLRPC.Document a = ia7Var.a();
                    ia7Var.c.remove(k27Var);
                    if (ia7Var.a() != a) {
                        ia7Var.e();
                    }
                    if (!i20Var.p2.c.isEmpty()) {
                        kk7.f(i20Var.a).k(kk7.V3, i20Var.p2);
                        break;
                    } else {
                        MediaController.w().j();
                        i20Var.dismiss();
                        break;
                    }
                }
                break;
            default:
                LaunchActivity launchActivity = i20Var.z2;
                int i = y6c.t0;
                int i2 = i20Var.a;
                if (i != i2) {
                    launchActivity.N0(i2);
                }
                Bundle bundle = new Bundle();
                long B0 = k27.B0(k27Var.k);
                if (cf3.B(B0)) {
                    bundle.putInt("enc_id", (int) (B0 & 4294967295L));
                } else if (cf3.D(B0)) {
                    bundle.putLong("user_id", B0);
                } else {
                    TLRPC.Chat K0 = na7.q1(i20Var.a).K0(Long.valueOf(-B0));
                    if (K0 != null && K0.migrated_to != null) {
                        bundle.putLong("migrated_to", B0);
                        B0 = -K0.migrated_to.channel_id;
                    }
                    bundle.putLong("chat_id", -B0);
                }
                bundle.putInt("message_id", k27Var.e1());
                kk7.f(i20Var.a).k(4, new Object[0]);
                launchActivity.u0(new mu1(bundle), false, false);
                i20Var.dismiss();
                break;
        }
    }
}
