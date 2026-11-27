// default package

import android.os.Bundle;
import org.telegram.messenger.a;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class s05 implements k05 {
    public final /* synthetic */ nj5 a;

    public s05(nj5 nj5Var) {
        this.a = nj5Var;
    }

    @Override // k05
    public final void onConnected(Bundle bundle) {
        id6 id6Var = (id6) this.a;
        id6Var.M = true;
        try {
            ((pm3) a.i()).checkLocationSettings(id6Var.O, new bd6(id6Var, (byte) 1));
        } catch (Throwable th) {
            cc4.g(th, true);
        }
    }

    @Override // k05
    public final void onConnectionSuspended(int i) {
        this.a.getClass();
    }
}
