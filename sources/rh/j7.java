package rh;

import org.telegram.messenger.us;
import org.telegram.messenger.zs;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class j7 implements us {
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ org.telegram.ui.ActionBar.z2[] b;

    public j7(boolean[] zArr, org.telegram.ui.ActionBar.z2[] z2VarArr) {
        this.a = zArr;
        this.b = z2VarArr;
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.ActionBar.z2 z2Var;
        if (i10 == zs.A3 && this.a[0] && (z2Var = this.b[0]) != null) {
            z2Var.dismiss();
        }
    }
}
