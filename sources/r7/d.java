package r7;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.StrictMode;
import android.widget.FrameLayout;
import x5.l;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class d extends FrameLayout {
    private final j zza;

    public d(Context context) {
        super(context);
        this.zza = new j(this, context);
        setClickable(true);
    }

    public void getMapAsync(f fVar) {
        l.e("getMapAsync() must be called on the main thread");
        l.i(fVar, "callback must not be null.");
        j jVar = this.zza;
        j4.c cVar = jVar.a;
        if (cVar != null) {
            cVar.z(fVar);
        } else {
            jVar.h.add(fVar);
        }
    }

    public void onCreate(Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            j jVar = this.zza;
            jVar.getClass();
            jVar.c(bundle, new h6.c(jVar, bundle));
            if (this.zza.a == null) {
                j.a(this);
            }
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public void onDestroy() {
        j jVar = this.zza;
        j4.c cVar = jVar.a;
        if (cVar == null) {
            jVar.b(1);
            return;
        }
        try {
            s7.g gVar = (s7.g) cVar.c;
            gVar.Q0(gVar.M0(), 5);
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }

    public void onEnterAmbient(Bundle bundle) {
        l.e("onEnterAmbient() must be called on the main thread");
        j4.c cVar = this.zza.a;
        if (cVar != null) {
            cVar.getClass();
            try {
                Bundle bundle2 = new Bundle();
                s7.d.b(bundle, bundle2);
                s7.g gVar = (s7.g) cVar.c;
                Parcel M0 = gVar.M0();
                c7.b.b(M0, bundle2);
                gVar.Q0(M0, 10);
                s7.d.b(bundle2, bundle);
            } catch (RemoteException e10) {
                throw new androidx.car.app.j(e10);
            }
        }
    }

    public void onExitAmbient() {
        l.e("onExitAmbient() must be called on the main thread");
        j4.c cVar = this.zza.a;
        if (cVar != null) {
            cVar.getClass();
            try {
                s7.g gVar = (s7.g) cVar.c;
                gVar.Q0(gVar.M0(), 11);
            } catch (RemoteException e10) {
                throw new androidx.car.app.j(e10);
            }
        }
    }

    public void onLowMemory() {
        j4.c cVar = this.zza.a;
        if (cVar != null) {
            try {
                s7.g gVar = (s7.g) cVar.c;
                gVar.Q0(gVar.M0(), 6);
            } catch (RemoteException e10) {
                throw new androidx.car.app.j(e10);
            }
        }
    }

    public void onPause() {
        j jVar = this.zza;
        j4.c cVar = jVar.a;
        if (cVar == null) {
            jVar.b(5);
            return;
        }
        try {
            s7.g gVar = (s7.g) cVar.c;
            gVar.Q0(gVar.M0(), 4);
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }

    public void onResume() {
        j jVar = this.zza;
        jVar.getClass();
        jVar.c(null, new h6.d(jVar, 1));
    }

    public void onSaveInstanceState(Bundle bundle) {
        j jVar = this.zza;
        j4.c cVar = jVar.a;
        if (cVar == null) {
            Bundle bundle2 = jVar.b;
            if (bundle2 != null) {
                bundle.putAll(bundle2);
                return;
            }
            return;
        }
        try {
            Bundle bundle3 = new Bundle();
            s7.d.b(bundle, bundle3);
            s7.g gVar = (s7.g) cVar.c;
            Parcel M0 = gVar.M0();
            c7.b.b(M0, bundle3);
            Parcel L0 = gVar.L0(M0, 7);
            if (L0.readInt() != 0) {
                bundle3.readFromParcel(L0);
            }
            L0.recycle();
            s7.d.b(bundle3, bundle);
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }

    public void onStart() {
        j jVar = this.zza;
        jVar.getClass();
        jVar.c(null, new h6.d(jVar, 0));
    }

    public void onStop() {
        j jVar = this.zza;
        j4.c cVar = jVar.a;
        if (cVar == null) {
            jVar.b(4);
            return;
        }
        try {
            s7.g gVar = (s7.g) cVar.c;
            gVar.Q0(gVar.M0(), 13);
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }
}
