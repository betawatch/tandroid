package yh;

import android.os.Bundle;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ta1;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m1 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 b;
    public final /* synthetic */ long c;

    public /* synthetic */ m1(long j3, org.telegram.ui.ActionBar.n2 n2Var) {
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
                n2Var.presentFragment(ta1.b0(n2Var.getMessagesController().getChat(Long.valueOf(-this.c)), true));
                break;
        }
    }

    public /* synthetic */ m1(org.telegram.ui.ActionBar.n2 n2Var, long j3) {
        this.b = n2Var;
        this.c = j3;
    }
}
