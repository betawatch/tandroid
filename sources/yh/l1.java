package yh;

import android.os.Bundle;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.sa1;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final /* synthetic */ class l1 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ org.telegram.ui.ActionBar.m2 b;
    public final /* synthetic */ long c;

    public /* synthetic */ l1(long j3, org.telegram.ui.ActionBar.m2 m2Var) {
        this.c = j3;
        this.b = m2Var;
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
                org.telegram.ui.ActionBar.m2 m2Var = this.b;
                m2Var.presentFragment(sa1.d0(m2Var.getMessagesController().getChat(Long.valueOf(-this.c)), true));
                break;
        }
    }

    public /* synthetic */ l1(org.telegram.ui.ActionBar.m2 m2Var, long j3) {
        this.b = m2Var;
        this.c = j3;
    }
}
