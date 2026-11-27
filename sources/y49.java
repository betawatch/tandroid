// default package

import android.os.Bundle;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class y49 implements Runnable {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ e c;

    public /* synthetic */ y49(long j, e eVar) {
        this.b = j;
        this.c = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        e eVar = this.c;
        long j = this.b;
        switch (b) {
            case 0:
                eVar.presentFragment(w1b.d0(eVar.getMessagesController().M0(Long.valueOf(-j)), true));
                break;
            default:
                Bundle bundle = new Bundle();
                if (j >= 0) {
                    bundle.putLong("user_id", j);
                } else {
                    bundle.putLong("chat_id", -j);
                }
                bundle.putBoolean("my_profile", true);
                bundle.putBoolean("open_gifts", true);
                eVar.presentFragment(new ProfileActivity(bundle, null));
                break;
        }
    }

    public /* synthetic */ y49(e eVar, long j) {
        this.c = eVar;
        this.b = j;
    }
}
