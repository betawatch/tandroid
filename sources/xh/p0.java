package xh;

import android.os.Bundle;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.bb;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.wn;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final /* synthetic */ class p0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ p0(Object obj, long j3, Object obj2, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = j3;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                r1 r1Var = (r1) this.c;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                r1Var.getClass();
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (U != null) {
                    r1Var.dismiss();
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
                yh.x3 x3Var = (yh.x3) this.c;
                Runnable runnable = (Runnable) this.d;
                x3Var.p2((int) this.b, x3Var.getContext(), true);
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 2:
                yh.x3 x3Var2 = (yh.x3) this.c;
                nf.e eVar = (nf.e) this.d;
                x3Var2.getClass();
                eVar.b();
                x3Var2.p2((int) this.b, x3Var2.getContext(), true);
                break;
            default:
                org.telegram.ui.ActionBar.e3[] e3VarArr = (org.telegram.ui.ActionBar.e3[]) this.c;
                TL_stories.Boost boost = (TL_stories.Boost) this.d;
                org.telegram.ui.ActionBar.e3 e3Var = e3VarArr[0];
                if (e3Var != null) {
                    e3Var.dismiss();
                }
                org.telegram.ui.ActionBar.m2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    U2.presentFragment(wn.Q9(boost.giveaway_msg_id, this.b));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ p0(bb bbVar, Object obj, long j3, int i10) {
        this.a = i10;
        this.c = bbVar;
        this.d = obj;
        this.b = j3;
    }
}
