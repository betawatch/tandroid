package xh;

import android.os.Bundle;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.fb1;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class k1 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ org.telegram.ui.ActionBar.p2 b;
    public final /* synthetic */ long c;

    public /* synthetic */ k1(long j3, org.telegram.ui.ActionBar.p2 p2Var) {
        this.c = j3;
        this.b = p2Var;
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
                org.telegram.ui.ActionBar.p2 p2Var = this.b;
                p2Var.presentFragment(fb1.d0(p2Var.getMessagesController().getChat(Long.valueOf(-this.c)), true));
                break;
        }
    }

    public /* synthetic */ k1(org.telegram.ui.ActionBar.p2 p2Var, long j3) {
        this.b = p2Var;
        this.c = j3;
    }
}
