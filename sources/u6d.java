// default package

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import j$.util.Objects;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class u6d {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xq2 b;

    public u6d(xq2 xq2Var, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                Objects.requireNonNull(xq2Var);
                this.b = xq2Var;
                break;
            default:
                Objects.requireNonNull(xq2Var);
                this.b = xq2Var;
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
        byte b = this.a;
        xq2 xq2Var = this.b;
        switch (b) {
            case 0:
                ko9 ko9Var = (ko9) xq2Var.a;
                tt ttVar = (tt) ko9Var.b;
                b1f b1fVar = (b1f) ko9Var.c;
                try {
                    Bundle bundle = new Bundle();
                    Parcel R = b1fVar.R();
                    jld.b(R, bundle);
                    b1fVar.V(R, 2);
                    fmd.b(bundle, null);
                    Parcel Q = b1fVar.Q(b1fVar.R(), 8);
                    al5 T = br7.T(Q.readStrongBinder());
                    Q.recycle();
                    ko9Var.d = (View) br7.U(T);
                    ttVar.removeAllViews();
                    ttVar.addView((View) ko9Var.d);
                    break;
                } catch (RemoteException e) {
                    p3d.i(e);
                    return;
                }
            default:
                ko9 ko9Var2 = (ko9) xq2Var.a;
                ko9Var2.getClass();
                try {
                    b1f b1fVar2 = (b1f) ko9Var2.c;
                    b1fVar2.V(b1fVar2.R(), 3);
                    break;
                } catch (RemoteException e2) {
                    p3d.i(e2);
                }
        }
    }
}
