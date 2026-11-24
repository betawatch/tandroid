// default package

import android.os.Bundle;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class y10 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ i30 b;
    public final /* synthetic */ k47 c;

    public /* synthetic */ y10(i30 i30Var, k47 k47Var, byte b) {
        this.a = b;
        this.b = i30Var;
        this.c = k47Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        k47 k47Var = this.c;
        i30 i30Var = this.b;
        switch (b) {
            case 0:
                jc7 jc7Var = i30Var.p2;
                if (jc7Var != null) {
                    TLRPC.Document a = jc7Var.a();
                    jc7Var.c.remove(k47Var);
                    if (jc7Var.a() != a) {
                        jc7Var.e();
                    }
                    if (!i30Var.p2.c.isEmpty()) {
                        nm7.f(i30Var.a).k(nm7.W3, i30Var.p2);
                        break;
                    } else {
                        MediaController.w().j();
                        i30Var.dismiss();
                        break;
                    }
                }
                break;
            default:
                LaunchActivity launchActivity = i30Var.z2;
                int i = z8c.t0;
                int i2 = i30Var.a;
                if (i != i2) {
                    launchActivity.N0(i2);
                }
                Bundle bundle = new Bundle();
                long B0 = k47.B0(k47Var.k);
                if (pg3.B(B0)) {
                    bundle.putInt("enc_id", (int) (B0 & 4294967295L));
                } else if (pg3.D(B0)) {
                    bundle.putLong("user_id", B0);
                } else {
                    TLRPC.Chat L0 = oc7.r1(i30Var.a).L0(Long.valueOf(-B0));
                    if (L0 != null && L0.migrated_to != null) {
                        bundle.putLong("migrated_to", B0);
                        B0 = -L0.migrated_to.channel_id;
                    }
                    bundle.putLong("chat_id", -B0);
                }
                bundle.putInt("message_id", k47Var.e1());
                nm7.f(i30Var.a).k(4, new Object[0]);
                launchActivity.u0(new yv1(bundle), false, false);
                i30Var.dismiss();
                break;
        }
    }
}
