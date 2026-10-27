package y6;

import a8.h0;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import i8.j;
import j8.g;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class c implements e {
    public final /* synthetic */ Bundle a;
    public final /* synthetic */ j b;

    public c(j jVar, Bundle bundle) {
        this.b = jVar;
        this.a = bundle;
    }

    @Override // y6.e
    public final int a() {
        return 1;
    }

    @Override // y6.e
    public final void b() {
        h0 h0Var = this.b.a;
        Bundle bundle = this.a;
        ViewGroup viewGroup = (ViewGroup) h0Var.b;
        g gVar = (g) h0Var.c;
        try {
            Bundle bundle2 = new Bundle();
            j8.d.c(bundle, bundle2);
            Parcel N0 = gVar.N0();
            t7.b.b(N0, bundle2);
            gVar.R0(N0, 2);
            j8.d.c(bundle2, bundle);
            Parcel M0 = gVar.M0(gVar.N0(), 8);
            a K0 = b.K0(M0.readStrongBinder());
            M0.recycle();
            h0Var.d = (View) b.L0(K0);
            viewGroup.removeAllViews();
            viewGroup.addView((View) h0Var.d);
        } catch (RemoteException e) {
            throw new androidx.car.app.j(e);
        }
    }
}
