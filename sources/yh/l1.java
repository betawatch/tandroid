package yh;

import android.os.Bundle;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ab1;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final /* synthetic */ class l1 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ org.telegram.ui.ActionBar.o2 b;
    public final /* synthetic */ long c;

    public /* synthetic */ l1(long j3, org.telegram.ui.ActionBar.o2 o2Var) {
        this.c = j3;
        this.b = o2Var;
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
                org.telegram.ui.ActionBar.o2 o2Var = this.b;
                o2Var.presentFragment(ab1.d0(o2Var.getMessagesController().getChat(Long.valueOf(-this.c)), true));
                break;
        }
    }

    public /* synthetic */ l1(org.telegram.ui.ActionBar.o2 o2Var, long j3) {
        this.b = o2Var;
        this.c = j3;
    }
}
