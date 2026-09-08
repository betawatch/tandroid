package zh;

import android.os.Bundle;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.co;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final /* synthetic */ class v5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.f3[] b;
    public final /* synthetic */ TL_stars.StarsTransaction c;
    public final /* synthetic */ long d;

    public /* synthetic */ v5(org.telegram.ui.ActionBar.f3[] f3VarArr, long j3, TL_stars.StarsTransaction starsTransaction) {
        this.a = 2;
        this.b = f3VarArr;
        this.d = j3;
        this.c = starsTransaction;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b[0].dismiss();
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    TL_stars.StarsTransaction starsTransaction = this.c;
                    int i10 = starsTransaction.flags & 8192;
                    long j3 = this.d;
                    if (i10 == 0) {
                        U.presentFragment(co.R9(j3));
                        break;
                    } else {
                        U.presentFragment(co.Q9(starsTransaction.giveaway_post_id, j3));
                        break;
                    }
                }
                break;
            case 1:
                this.b[0].dismiss();
                org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    TL_stars.StarsTransaction starsTransaction2 = this.c;
                    int i11 = starsTransaction2.flags & 8192;
                    long j10 = this.d;
                    if (i11 == 0) {
                        U2.presentFragment(co.R9(j10));
                        break;
                    } else {
                        U2.presentFragment(co.Q9(starsTransaction2.giveaway_post_id, j10));
                        break;
                    }
                }
                break;
            case 2:
                this.b[0].dismiss();
                org.telegram.ui.ActionBar.n2 U3 = LaunchActivity.U();
                if (U3 != null) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", -this.d);
                    bundle.putInt("message_id", this.c.msg_id);
                    U3.presentFragment(new co(bundle));
                    break;
                }
                break;
            case 3:
                this.b[0].dismiss();
                org.telegram.ui.ActionBar.n2 U4 = LaunchActivity.U();
                if (U4 != null) {
                    TL_stars.StarsTransaction starsTransaction3 = this.c;
                    int i12 = starsTransaction3.flags & 8192;
                    long j11 = this.d;
                    if (i12 == 0) {
                        U4.presentFragment(co.R9(j11));
                        break;
                    } else {
                        U4.presentFragment(co.Q9(starsTransaction3.giveaway_post_id, j11));
                        break;
                    }
                }
                break;
            default:
                this.b[0].dismiss();
                org.telegram.ui.ActionBar.n2 U5 = LaunchActivity.U();
                if (U5 != null) {
                    TL_stars.StarsTransaction starsTransaction4 = this.c;
                    int i13 = starsTransaction4.flags & 8192;
                    long j12 = this.d;
                    if (i13 == 0) {
                        U5.presentFragment(co.R9(j12));
                        break;
                    } else {
                        U5.presentFragment(co.Q9(starsTransaction4.giveaway_post_id, j12));
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ v5(org.telegram.ui.ActionBar.f3[] f3VarArr, TL_stars.StarsTransaction starsTransaction, long j3, int i10) {
        this.a = i10;
        this.b = f3VarArr;
        this.c = starsTransaction;
        this.d = j3;
    }
}
