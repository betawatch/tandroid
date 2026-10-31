package x6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.v4.media.session.a0;
import android.view.View;
import android.view.ViewGroup;
import i8.g;
import m.p3;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class c {
    public final /* synthetic */ int a;
    public final /* synthetic */ p3 b;

    public /* synthetic */ c(p3 p3Var, int i10) {
        this.a = i10;
        this.b = p3Var;
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
                g gVar = (g) a0Var.c;
                try {
                    Bundle bundle = new Bundle();
                    Parcel P0 = gVar.P0();
                    s7.b.b(P0, bundle);
                    gVar.T0(P0, 2);
                    i8.d.c(bundle, null);
                    Parcel O0 = gVar.O0(gVar.P0(), 8);
                    a M0 = b.M0(O0.readStrongBinder());
                    O0.recycle();
                    a0Var.d = (View) b.N0(M0);
                    viewGroup.removeAllViews();
                    viewGroup.addView((View) a0Var.d);
                    return;
                } catch (RemoteException e) {
                    throw new ad.d(e);
                }
            default:
                a0 a0Var2 = (a0) this.b.b;
                a0Var2.getClass();
                try {
                    g gVar2 = (g) a0Var2.c;
                    gVar2.T0(gVar2.P0(), 3);
                    return;
                } catch (RemoteException e7) {
                    throw new ad.d(e7);
                }
        }
    }
}
