package xh;

import android.os.Bundle;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.za;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bo;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final /* synthetic */ class o0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ o0(Object obj, long j3, Object obj2, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = j3;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                q1 q1Var = (q1) this.c;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                q1Var.getClass();
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != null) {
                    q1Var.dismiss();
                    if (callback != null) {
                        callback.run(Boolean.FALSE);
                    }
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", this.b);
                    bundle.putBoolean("open_gifts", true);
                    U.presentFragment(new ProfileActivity(bundle, null));
                    break;
                }
                break;
            case 1:
                yh.a4 a4Var = (yh.a4) this.c;
                Runnable runnable = (Runnable) this.d;
                a4Var.p2((int) this.b, a4Var.getContext(), true);
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 2:
                yh.a4 a4Var2 = (yh.a4) this.c;
                nf.e eVar = (nf.e) this.d;
                a4Var2.getClass();
                eVar.b();
                a4Var2.p2((int) this.b, a4Var2.getContext(), true);
                break;
            default:
                org.telegram.ui.ActionBar.g3[] g3VarArr = (org.telegram.ui.ActionBar.g3[]) this.c;
                TL_stories.Boost boost = (TL_stories.Boost) this.d;
                org.telegram.ui.ActionBar.g3 g3Var = g3VarArr[0];
                if (g3Var != null) {
                    g3Var.dismiss();
                }
                org.telegram.ui.ActionBar.o2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    U2.presentFragment(bo.Q9(boost.giveaway_msg_id, this.b));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ o0(za zaVar, Object obj, long j3, int i10) {
        this.a = i10;
        this.c = zaVar;
        this.d = obj;
        this.b = j3;
    }
}
