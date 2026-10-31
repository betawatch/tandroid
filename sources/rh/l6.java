package rh;

import android.os.Bundle;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.un;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class l6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.z2[] b;
    public final /* synthetic */ TL_stars.StarsTransaction c;
    public final /* synthetic */ long d;

    public /* synthetic */ l6(org.telegram.ui.ActionBar.z2[] z2VarArr, long j10, TL_stars.StarsTransaction starsTransaction) {
        this.a = 3;
        this.b = z2VarArr;
        this.d = j10;
        this.c = starsTransaction;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b[0].dismiss();
                org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                if (T != null) {
                    TL_stars.StarsTransaction starsTransaction = this.c;
                    int i10 = starsTransaction.flags & TLObject.FLAG_13;
                    long j10 = this.d;
                    if (i10 == 0) {
                        T.presentFragment(un.ha(j10));
                        break;
                    } else {
                        T.presentFragment(un.ga(starsTransaction.giveaway_post_id, j10));
                        break;
                    }
                }
                break;
            case 1:
                this.b[0].dismiss();
                org.telegram.ui.ActionBar.k2 T2 = LaunchActivity.T();
                if (T2 != null) {
                    TL_stars.StarsTransaction starsTransaction2 = this.c;
                    int i11 = starsTransaction2.flags & TLObject.FLAG_13;
                    long j11 = this.d;
                    if (i11 == 0) {
                        T2.presentFragment(un.ha(j11));
                        break;
                    } else {
                        T2.presentFragment(un.ga(starsTransaction2.giveaway_post_id, j11));
                        break;
                    }
                }
                break;
            case 2:
                this.b[0].dismiss();
                org.telegram.ui.ActionBar.k2 T3 = LaunchActivity.T();
                if (T3 != null) {
                    TL_stars.StarsTransaction starsTransaction3 = this.c;
                    int i12 = starsTransaction3.flags & TLObject.FLAG_13;
                    long j12 = this.d;
                    if (i12 == 0) {
                        T3.presentFragment(un.ha(j12));
                        break;
                    } else {
                        T3.presentFragment(un.ga(starsTransaction3.giveaway_post_id, j12));
                        break;
                    }
                }
                break;
            case 3:
                this.b[0].dismiss();
                org.telegram.ui.ActionBar.k2 T4 = LaunchActivity.T();
                if (T4 != null) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", -this.d);
                    bundle.putInt("message_id", this.c.msg_id);
                    T4.presentFragment(new un(bundle));
                    break;
                }
                break;
            default:
                this.b[0].dismiss();
                org.telegram.ui.ActionBar.k2 T5 = LaunchActivity.T();
                if (T5 != null) {
                    TL_stars.StarsTransaction starsTransaction4 = this.c;
                    int i13 = starsTransaction4.flags & TLObject.FLAG_13;
                    long j13 = this.d;
                    if (i13 == 0) {
                        T5.presentFragment(un.ha(j13));
                        break;
                    } else {
                        T5.presentFragment(un.ga(starsTransaction4.giveaway_post_id, j13));
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ l6(org.telegram.ui.ActionBar.z2[] z2VarArr, TL_stars.StarsTransaction starsTransaction, long j10, int i10) {
        this.a = i10;
        this.b = z2VarArr;
        this.c = starsTransaction;
        this.d = j10;
    }
}
