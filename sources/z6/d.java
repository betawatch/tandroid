package z6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.v4.media.session.a0;
import android.view.View;
import android.view.ViewGroup;
import androidx.car.app.j;
import j$.util.Objects;
import k8.f;
import m.o3;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class d {
    public final /* synthetic */ int a;
    public final /* synthetic */ o3 b;

    public d(o3 o3Var, int i3) {
        this.a = i3;
        switch (i3) {
            case 1:
                Objects.requireNonNull(o3Var);
                this.b = o3Var;
                break;
            default:
                Objects.requireNonNull(o3Var);
                this.b = o3Var;
                break;
        }
    }

    public final int a() {
        switch (this.a) {
            case 0:
                return 1;
            default:
                return 5;
        }
    }

    public final void b() {
        switch (this.a) {
            case 0:
                a0 a0Var = (a0) this.b.b;
                ViewGroup viewGroup = (ViewGroup) a0Var.b;
                f fVar = (f) a0Var.c;
                try {
                    Bundle bundle = new Bundle();
                    Parcel P0 = fVar.P0();
                    u7.b.b(P0, bundle);
                    fVar.T0(P0, 2);
                    k8.c.c(bundle, null);
                    Parcel O0 = fVar.O0(fVar.P0(), 8);
                    a M0 = b.M0(O0.readStrongBinder());
                    O0.recycle();
                    a0Var.d = (View) b.N0(M0);
                    viewGroup.removeAllViews();
                    viewGroup.addView((View) a0Var.d);
                    return;
                } catch (RemoteException e10) {
                    throw new j(e10);
                }
            default:
                a0 a0Var2 = (a0) this.b.b;
                a0Var2.getClass();
                try {
                    f fVar2 = (f) a0Var2.c;
                    fVar2.T0(fVar2.P0(), 3);
                    return;
                } catch (RemoteException e11) {
                    throw new j(e11);
                }
        }
    }
}
