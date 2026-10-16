package qi;

import android.os.Bundle;
import java.io.File;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.db;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.fo;
import yh.p1;
import zh.r3;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ e(Object obj, long j10, Object obj2, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = j10;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                q qVar = (q) this.c;
                File file = (File) this.d;
                if (qVar.m == o.f) {
                    long j10 = this.b;
                    qVar.p = j10;
                    qVar.r = 0L;
                    qVar.s = q.q(j10);
                    qVar.d();
                    qVar.t(file);
                    break;
                }
                break;
            case 1:
                cc.e eVar = (cc.e) this.c;
                Exception exc = (Exception) this.d;
                q qVar2 = (q) eVar.c;
                if (this.b == qVar2.o) {
                    qVar2.n = null;
                    qVar2.g(exc);
                    break;
                }
                break;
            case 2:
                p1 p1Var = (p1) this.c;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                p1Var.getClass();
                m2 U = LaunchActivity.U();
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
            case 3:
                r3 r3Var = (r3) this.c;
                Runnable runnable = (Runnable) this.d;
                r3Var.r2((int) this.b, r3Var.getContext(), true);
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 4:
                r3 r3Var2 = (r3) this.c;
                pf.c cVar = (pf.c) this.d;
                r3Var2.getClass();
                cVar.b();
                r3Var2.r2((int) this.b, r3Var2.getContext(), true);
                break;
            default:
                e3[] e3VarArr = (e3[]) this.c;
                TL_stories.Boost boost = (TL_stories.Boost) this.d;
                e3 e3Var = e3VarArr[0];
                if (e3Var != null) {
                    e3Var.dismiss();
                }
                m2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    U2.presentFragment(fo.V9(boost.giveaway_msg_id, this.b));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ e(db dbVar, Object obj, long j10, int i10) {
        this.a = i10;
        this.c = dbVar;
        this.d = obj;
        this.b = j10;
    }
}
