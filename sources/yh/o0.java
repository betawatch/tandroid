package yh;

import android.os.Bundle;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.bb;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.co;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
                p1 p1Var = (p1) this.c;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                p1Var.getClass();
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    p1Var.dismiss();
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
                zh.w3 w3Var = (zh.w3) this.c;
                Runnable runnable = (Runnable) this.d;
                w3Var.p2((int) this.b, w3Var.getContext(), true);
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 2:
                zh.w3 w3Var2 = (zh.w3) this.c;
                of.e eVar = (of.e) this.d;
                w3Var2.getClass();
                eVar.b();
                w3Var2.p2((int) this.b, w3Var2.getContext(), true);
                break;
            default:
                org.telegram.ui.ActionBar.f3[] f3VarArr = (org.telegram.ui.ActionBar.f3[]) this.c;
                TL_stories.Boost boost = (TL_stories.Boost) this.d;
                org.telegram.ui.ActionBar.f3 f3Var = f3VarArr[0];
                if (f3Var != null) {
                    f3Var.dismiss();
                }
                org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    U2.presentFragment(co.Q9(boost.giveaway_msg_id, this.b));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ o0(bb bbVar, Object obj, long j3, int i10) {
        this.a = i10;
        this.c = bbVar;
        this.d = obj;
        this.b = j3;
    }
}
