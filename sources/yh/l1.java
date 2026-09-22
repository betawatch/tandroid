package yh;

import android.os.Bundle;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.za1;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final /* synthetic */ class l1 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 b;
    public final /* synthetic */ long c;

    public /* synthetic */ l1(long j3, org.telegram.ui.ActionBar.n2 n2Var) {
        this.c = j3;
        this.b = n2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Bundle bundle = new Bundle();
                long j3 = this.c;
                if (j3 >= 0) {
                    bundle.putLong("user_id", j3);
                } else {
                    bundle.putLong("chat_id", -j3);
                }
                bundle.putBoolean("my_profile", true);
                bundle.putBoolean("open_gifts", true);
                this.b.presentFragment(new ProfileActivity(bundle, null));
                break;
            default:
                org.telegram.ui.ActionBar.n2 n2Var = this.b;
                n2Var.presentFragment(za1.d0(n2Var.getMessagesController().getChat(Long.valueOf(-this.c)), true));
                break;
        }
    }

    public /* synthetic */ l1(org.telegram.ui.ActionBar.n2 n2Var, long j3) {
        this.b = n2Var;
        this.c = j3;
    }
}
