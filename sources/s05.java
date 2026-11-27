// default package

import android.os.Bundle;
import org.telegram.messenger.a;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
