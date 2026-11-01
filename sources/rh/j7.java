package rh;

import org.telegram.messenger.at;
import org.telegram.messenger.vs;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class j7 implements vs {
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ org.telegram.ui.ActionBar.z2[] b;

    public j7(boolean[] zArr, org.telegram.ui.ActionBar.z2[] z2VarArr) {
        this.a = zArr;
        this.b = z2VarArr;
    }

    @Override // org.telegram.messenger.vs
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.ActionBar.z2 z2Var;
        if (i10 == at.A3 && this.a[0] && (z2Var = this.b[0]) != null) {
            z2Var.dismiss();
        }
    }
}
