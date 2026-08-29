package t7;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.StrictMode;
import android.widget.FrameLayout;
import l3.g0;
import z5.l;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
        g0 g0Var = jVar.a;
        if (g0Var != null) {
            g0Var.t(fVar);
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
            jVar.c(bundle, new j6.c(jVar, bundle));
            if (this.zza.a == null) {
                j.a(this);
            }
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public void onDestroy() {
        j jVar = this.zza;
        g0 g0Var = jVar.a;
        if (g0Var == null) {
            jVar.b(1);
            return;
        }
        try {
            u7.g gVar = (u7.g) g0Var.c;
            gVar.Q0(gVar.M0(), 5);
        } catch (RemoteException e10) {
            throw new a6.b(e10);
        }
    }

    public void onEnterAmbient(Bundle bundle) {
        l.e("onEnterAmbient() must be called on the main thread");
        g0 g0Var = this.zza.a;
        if (g0Var != null) {
            g0Var.getClass();
            try {
                Bundle bundle2 = new Bundle();
                u7.d.b(bundle, bundle2);
                u7.g gVar = (u7.g) g0Var.c;
                Parcel M0 = gVar.M0();
                e7.b.b(M0, bundle2);
                gVar.Q0(M0, 10);
                u7.d.b(bundle2, bundle);
            } catch (RemoteException e10) {
                throw new a6.b(e10);
            }
        }
    }

    public void onExitAmbient() {
        l.e("onExitAmbient() must be called on the main thread");
        g0 g0Var = this.zza.a;
        if (g0Var != null) {
            g0Var.getClass();
            try {
                u7.g gVar = (u7.g) g0Var.c;
                gVar.Q0(gVar.M0(), 11);
            } catch (RemoteException e10) {
                throw new a6.b(e10);
            }
        }
    }

    public void onLowMemory() {
        g0 g0Var = this.zza.a;
        if (g0Var != null) {
            try {
                u7.g gVar = (u7.g) g0Var.c;
                gVar.Q0(gVar.M0(), 6);
            } catch (RemoteException e10) {
                throw new a6.b(e10);
            }
        }
    }

    public void onPause() {
        j jVar = this.zza;
        g0 g0Var = jVar.a;
        if (g0Var == null) {
            jVar.b(5);
            return;
        }
        try {
            u7.g gVar = (u7.g) g0Var.c;
            gVar.Q0(gVar.M0(), 4);
        } catch (RemoteException e10) {
            throw new a6.b(e10);
        }
    }

    public void onResume() {
        j jVar = this.zza;
        jVar.getClass();
        jVar.c(null, new j6.d(jVar, 1));
    }

    public void onSaveInstanceState(Bundle bundle) {
        j jVar = this.zza;
        g0 g0Var = jVar.a;
        if (g0Var == null) {
            Bundle bundle2 = jVar.b;
            if (bundle2 != null) {
                bundle.putAll(bundle2);
                return;
            }
            return;
        }
        try {
            Bundle bundle3 = new Bundle();
            u7.d.b(bundle, bundle3);
            u7.g gVar = (u7.g) g0Var.c;
            Parcel M0 = gVar.M0();
            e7.b.b(M0, bundle3);
            Parcel L0 = gVar.L0(M0, 7);
            if (L0.readInt() != 0) {
                bundle3.readFromParcel(L0);
            }
            L0.recycle();
            u7.d.b(bundle3, bundle);
        } catch (RemoteException e10) {
            throw new a6.b(e10);
        }
    }

    public void onStart() {
        j jVar = this.zza;
        jVar.getClass();
        jVar.c(null, new j6.d(jVar, 0));
    }

    public void onStop() {
        j jVar = this.zza;
        g0 g0Var = jVar.a;
        if (g0Var == null) {
            jVar.b(4);
            return;
        }
        try {
            u7.g gVar = (u7.g) g0Var.c;
            gVar.Q0(gVar.M0(), 13);
        } catch (RemoteException e10) {
            throw new a6.b(e10);
        }
    }
}
