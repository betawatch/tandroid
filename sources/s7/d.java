package s7;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.StrictMode;
import android.widget.FrameLayout;
import y5.l;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
        j9.a aVar = jVar.a;
        if (aVar != null) {
            aVar.B(fVar);
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
            jVar.c(bundle, new i6.c(jVar, bundle));
            if (this.zza.a == null) {
                j.a(this);
            }
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public void onDestroy() {
        j jVar = this.zza;
        j9.a aVar = jVar.a;
        if (aVar == null) {
            jVar.b(1);
            return;
        }
        try {
            t7.g gVar = (t7.g) aVar.c;
            gVar.Q0(gVar.M0(), 5);
        } catch (RemoteException e9) {
            throw new a7.c(e9);
        }
    }

    public void onEnterAmbient(Bundle bundle) {
        l.e("onEnterAmbient() must be called on the main thread");
        j9.a aVar = this.zza.a;
        if (aVar != null) {
            aVar.getClass();
            try {
                Bundle bundle2 = new Bundle();
                t7.d.b(bundle, bundle2);
                t7.g gVar = (t7.g) aVar.c;
                Parcel M0 = gVar.M0();
                d7.b.b(M0, bundle2);
                gVar.Q0(M0, 10);
                t7.d.b(bundle2, bundle);
            } catch (RemoteException e9) {
                throw new a7.c(e9);
            }
        }
    }

    public void onExitAmbient() {
        l.e("onExitAmbient() must be called on the main thread");
        j9.a aVar = this.zza.a;
        if (aVar != null) {
            aVar.getClass();
            try {
                t7.g gVar = (t7.g) aVar.c;
                gVar.Q0(gVar.M0(), 11);
            } catch (RemoteException e9) {
                throw new a7.c(e9);
            }
        }
    }

    public void onLowMemory() {
        j9.a aVar = this.zza.a;
        if (aVar != null) {
            try {
                t7.g gVar = (t7.g) aVar.c;
                gVar.Q0(gVar.M0(), 6);
            } catch (RemoteException e9) {
                throw new a7.c(e9);
            }
        }
    }

    public void onPause() {
        j jVar = this.zza;
        j9.a aVar = jVar.a;
        if (aVar == null) {
            jVar.b(5);
            return;
        }
        try {
            t7.g gVar = (t7.g) aVar.c;
            gVar.Q0(gVar.M0(), 4);
        } catch (RemoteException e9) {
            throw new a7.c(e9);
        }
    }

    public void onResume() {
        j jVar = this.zza;
        jVar.getClass();
        jVar.c(null, new i6.d(jVar, 1));
    }

    public void onSaveInstanceState(Bundle bundle) {
        j jVar = this.zza;
        j9.a aVar = jVar.a;
        if (aVar == null) {
            Bundle bundle2 = jVar.b;
            if (bundle2 != null) {
                bundle.putAll(bundle2);
                return;
            }
            return;
        }
        try {
            Bundle bundle3 = new Bundle();
            t7.d.b(bundle, bundle3);
            t7.g gVar = (t7.g) aVar.c;
            Parcel M0 = gVar.M0();
            d7.b.b(M0, bundle3);
            Parcel L0 = gVar.L0(M0, 7);
            if (L0.readInt() != 0) {
                bundle3.readFromParcel(L0);
            }
            L0.recycle();
            t7.d.b(bundle3, bundle);
        } catch (RemoteException e9) {
            throw new a7.c(e9);
        }
    }

    public void onStart() {
        j jVar = this.zza;
        jVar.getClass();
        jVar.c(null, new i6.d(jVar, 0));
    }

    public void onStop() {
        j jVar = this.zza;
        j9.a aVar = jVar.a;
        if (aVar == null) {
            jVar.b(4);
            return;
        }
        try {
            t7.g gVar = (t7.g) aVar.c;
            gVar.Q0(gVar.M0(), 13);
        } catch (RemoteException e9) {
            throw new a7.c(e9);
        }
    }
}
