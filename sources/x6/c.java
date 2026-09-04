package x6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import h8.j;
import i8.g;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
        aa.a aVar = this.b.a;
        Bundle bundle = this.a;
        ViewGroup viewGroup = (ViewGroup) aVar.b;
        g gVar = (g) aVar.c;
        try {
            Bundle bundle2 = new Bundle();
            i8.d.c(bundle, bundle2);
            Parcel O0 = gVar.O0();
            s7.b.b(O0, bundle2);
            gVar.S0(O0, 2);
            i8.d.c(bundle2, bundle);
            Parcel N0 = gVar.N0(gVar.O0(), 8);
            a L0 = b.L0(N0.readStrongBinder());
            N0.recycle();
            aVar.d = (View) b.M0(L0);
            viewGroup.removeAllViews();
            viewGroup.addView((View) aVar.d);
        } catch (RemoteException e7) {
            throw new androidx.car.app.j(e7);
        }
    }
}
