package rh;

import android.os.Bundle;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.s61;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r1 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ org.telegram.ui.ActionBar.k2 b;
    public final /* synthetic */ long c;

    public /* synthetic */ r1(long j10, org.telegram.ui.ActionBar.k2 k2Var) {
        this.c = j10;
        this.b = k2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Bundle bundle = new Bundle();
                long j10 = this.c;
                if (j10 >= 0) {
                    bundle.putLong("user_id", j10);
                } else {
                    bundle.putLong("chat_id", -j10);
                }
                bundle.putBoolean("my_profile", true);
                bundle.putBoolean("open_gifts", true);
                this.b.presentFragment(new ProfileActivity(bundle, null));
                break;
            default:
                org.telegram.ui.ActionBar.k2 k2Var = this.b;
                k2Var.presentFragment(s61.g0(k2Var.getMessagesController().L0(Long.valueOf(-this.c)), true));
                break;
        }
    }

    public /* synthetic */ r1(org.telegram.ui.ActionBar.k2 k2Var, long j10) {
        this.b = k2Var;
        this.c = j10;
    }
}
