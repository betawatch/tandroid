// default package

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import java.util.HashMap;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class s05 {
    public wm4 a;
    public HashMap b;
    public HashMap c;

    public final r05 a(ai4 ai4Var) {
        k7d sjfVar;
        wm4 wm4Var = this.a;
        cl6 cl6Var = (cl6) ai4Var.b;
        wm4Var.getClass();
        try {
            ite.i(cl6Var, "MarkerOptions must not be null.");
            d8e d8eVar = (d8e) wm4Var.b;
            Parcel R = d8eVar.R();
            tid.b(R, cl6Var);
            Parcel Q = d8eVar.Q(R, 11);
            IBinder readStrongBinder = Q.readStrongBinder();
            int i = zjf.b;
            if (readStrongBinder == null) {
                sjfVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                sjfVar = queryLocalInterface instanceof k7d ? (k7d) queryLocalInterface : new sjf(readStrongBinder, "com.google.android.gms.maps.model.internal.IMarkerDelegate", (byte) 6);
            }
            Q.recycle();
            bl6 bl6Var = sjfVar != null ? new bl6(sjfVar) : null;
            r05 r05Var = new r05(bl6Var);
            this.b.put(bl6Var, r05Var);
            return r05Var;
        } catch (RemoteException e) {
            i2d.h(e);
            return null;
        }
    }

    public final void b(pj5 pj5Var) {
        wm4 wm4Var = this.a;
        sz4 sz4Var = ((p05) pj5Var).a;
        wm4Var.getClass();
        try {
            ite.i(sz4Var, "CameraUpdate must not be null.");
            d8e d8eVar = (d8e) wm4Var.b;
            xk5 xk5Var = (xk5) sz4Var.a;
            Parcel R = d8eVar.R();
            tid.c(R, xk5Var);
            d8eVar.V(R, 5);
        } catch (RemoteException e) {
            i2d.h(e);
        }
    }

    public final void c(pj5 pj5Var) {
        wm4 wm4Var = this.a;
        sz4 sz4Var = ((p05) pj5Var).a;
        wm4Var.getClass();
        try {
            ite.i(sz4Var, "CameraUpdate must not be null.");
            d8e d8eVar = (d8e) wm4Var.b;
            xk5 xk5Var = (xk5) sz4Var.a;
            Parcel R = d8eVar.R();
            tid.c(R, xk5Var);
            R.writeInt(500);
            tid.c(R, null);
            d8eVar.V(R, 7);
        } catch (RemoteException e) {
            i2d.h(e);
        }
    }

    public final fy5 d() {
        wm4 wm4Var = this.a;
        wm4Var.getClass();
        try {
            d8e d8eVar = (d8e) wm4Var.b;
            Parcel Q = d8eVar.Q(d8eVar.R(), 1);
            Parcelable.Creator<CameraPosition> creator = CameraPosition.CREATOR;
            int i = tid.a;
            CameraPosition createFromParcel = Q.readInt() == 0 ? null : creator.createFromParcel(Q);
            Q.recycle();
            LatLng latLng = createFromParcel.a;
            return new fy5(new xj5(latLng.a, latLng.b), createFromParcel.b, (byte) 2);
        } catch (RemoteException e) {
            i2d.h(e);
            return null;
        }
    }

    public final float e() {
        wm4 wm4Var = this.a;
        wm4Var.getClass();
        try {
            d8e d8eVar = (d8e) wm4Var.b;
            Parcel Q = d8eVar.Q(d8eVar.R(), 2);
            float readFloat = Q.readFloat();
            Q.recycle();
            return readFloat;
        } catch (RemoteException e) {
            i2d.h(e);
            return 0.0f;
        }
    }

    public final float f() {
        wm4 wm4Var = this.a;
        wm4Var.getClass();
        try {
            d8e d8eVar = (d8e) wm4Var.b;
            Parcel Q = d8eVar.Q(d8eVar.R(), 3);
            float readFloat = Q.readFloat();
            Q.recycle();
            return readFloat;
        } catch (RemoteException e) {
            i2d.h(e);
            return 0.0f;
        }
    }

    public final fk3 g() {
        iid iidVar;
        wm4 wm4Var = this.a;
        wm4Var.getClass();
        try {
            cf9 cf9Var = (cf9) wm4Var.c;
            if (cf9Var == null) {
                d8e d8eVar = (d8e) wm4Var.b;
                Parcel Q = d8eVar.Q(d8eVar.R(), 25);
                IBinder readStrongBinder = Q.readStrongBinder();
                if (readStrongBinder == null) {
                    iidVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    iidVar = queryLocalInterface instanceof iid ? (iid) queryLocalInterface : new iid(readStrongBinder, "com.google.android.gms.maps.internal.IUiSettingsDelegate", (byte) 6);
                }
                Q.recycle();
                cf9Var = new cf9((Object) iidVar, (byte) 16);
                wm4Var.c = cf9Var;
            }
            fk3 fk3Var = new fk3();
            fk3Var.a = cf9Var;
            return fk3Var;
        } catch (RemoteException e) {
            i2d.h(e);
            return null;
        }
    }

    public final void h(pj5 pj5Var) {
        wm4 wm4Var = this.a;
        sz4 sz4Var = ((p05) pj5Var).a;
        wm4Var.getClass();
        try {
            ite.i(sz4Var, "CameraUpdate must not be null.");
            d8e d8eVar = (d8e) wm4Var.b;
            xk5 xk5Var = (xk5) sz4Var.a;
            Parcel R = d8eVar.R();
            tid.c(R, xk5Var);
            d8eVar.V(R, 4);
        } catch (RemoteException e) {
            i2d.h(e);
        }
    }

    public final void i(tj5 tj5Var) {
        wm4 wm4Var = this.a;
        ik6 ik6Var = tj5Var == null ? null : ((t05) tj5Var).a;
        wm4Var.getClass();
        try {
            d8e d8eVar = (d8e) wm4Var.b;
            Parcel R = d8eVar.R();
            tid.b(R, ik6Var);
            Parcel Q = d8eVar.Q(R, 91);
            Q.readInt();
            Q.recycle();
        } catch (RemoteException e) {
            i2d.h(e);
        }
    }

    public final void j(int i) {
        wm4 wm4Var = this.a;
        if (i == 0) {
            wm4Var.e0(1);
        } else if (i == 1) {
            wm4Var.e0(2);
        } else {
            if (i != 2) {
                return;
            }
            wm4Var.e0(4);
        }
    }

    public final void k(boolean z) {
        wm4 wm4Var = this.a;
        wm4Var.getClass();
        try {
            d8e d8eVar = (d8e) wm4Var.b;
            Parcel R = d8eVar.R();
            int i = tid.a;
            R.writeInt(z ? 1 : 0);
            d8eVar.V(R, 22);
        } catch (RemoteException e) {
            i2d.h(e);
        }
    }

    public final void l(yj5 yj5Var) {
        wm4 wm4Var = this.a;
        wx4 wx4Var = new wx4((Object) yj5Var, (byte) 7);
        wm4Var.getClass();
        try {
            d8e d8eVar = (d8e) wm4Var.b;
            t6d t6dVar = new t6d(wx4Var, 0);
            Parcel R = d8eVar.R();
            tid.c(R, t6dVar);
            d8eVar.V(R, 96);
        } catch (RemoteException e) {
            i2d.h(e);
        }
    }

    public final void m(a32 a32Var) {
        wm4 wm4Var = this.a;
        wx4 wx4Var = new wx4(this, a32Var);
        wm4Var.getClass();
        try {
            d8e d8eVar = (d8e) wm4Var.b;
            t6d t6dVar = new t6d(wx4Var);
            Parcel R = d8eVar.R();
            tid.c(R, t6dVar);
            d8eVar.V(R, 30);
        } catch (RemoteException e) {
            i2d.h(e);
        }
    }

    public final void n(int i, int i2, int i3, int i4) {
        wm4 wm4Var = this.a;
        wm4Var.getClass();
        try {
            d8e d8eVar = (d8e) wm4Var.b;
            Parcel R = d8eVar.R();
            R.writeInt(i);
            R.writeInt(i2);
            R.writeInt(i3);
            R.writeInt(i4);
            d8eVar.V(R, 39);
        } catch (RemoteException e) {
            i2d.h(e);
        }
    }
}
