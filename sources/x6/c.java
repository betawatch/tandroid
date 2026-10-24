package x6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import h8.j;
import i8.g;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class c implements e {
    public final /* synthetic */ Bundle a;
    public final /* synthetic */ j b;

    public c(j jVar, Bundle bundle) {
        this.b = jVar;
        this.a = bundle;
    }

    @Override // x6.e
    public final int a() {
        return 1;
    }

    @Override // x6.e
    public final void b() {
        androidx.biometric.e eVar = this.b.a;
        Bundle bundle = this.a;
        ViewGroup viewGroup = (ViewGroup) eVar.b;
        g gVar = (g) eVar.c;
        try {
            Bundle bundle2 = new Bundle();
            i8.d.c(bundle, bundle2);
            Parcel N0 = gVar.N0();
            s7.b.b(N0, bundle2);
            gVar.R0(N0, 2);
            i8.d.c(bundle2, bundle);
            Parcel M0 = gVar.M0(gVar.N0(), 8);
            a K0 = b.K0(M0.readStrongBinder());
            M0.recycle();
            eVar.d = (View) b.L0(K0);
            viewGroup.removeAllViews();
            viewGroup.addView((View) eVar.d);
        } catch (RemoteException e) {
            throw new androidx.car.app.j(e);
        }
    }
}
