// default package

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import java.util.HashMap;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class x05 {
    public um4 a;
    public HashMap b;
    public HashMap c;

    public final w05 a(xh4 xh4Var) {
        bad hmfVar;
        um4 um4Var = this.a;
        el6 el6Var = (el6) xh4Var.b;
        um4Var.getClass();
        try {
            xve.i(el6Var, "MarkerOptions must not be null.");
            qae qaeVar = (qae) um4Var.b;
            Parcel R = qaeVar.R();
            jld.b(R, el6Var);
            Parcel Q = qaeVar.Q(R, 11);
            IBinder readStrongBinder = Q.readStrongBinder();
            int i = omf.b;
            if (readStrongBinder == null) {
                hmfVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                hmfVar = queryLocalInterface instanceof bad ? (bad) queryLocalInterface : new hmf(readStrongBinder, "com.google.android.gms.maps.model.internal.IMarkerDelegate", (byte) 6);
            }
            Q.recycle();
            dl6 dl6Var = hmfVar != null ? new dl6(hmfVar) : null;
            w05 w05Var = new w05(dl6Var);
            this.b.put(dl6Var, w05Var);
            return w05Var;
        } catch (RemoteException e) {
            p3d.i(e);
            return null;
        }
    }

    public final void b(sj5 sj5Var) {
        um4 um4Var = this.a;
        wz4 wz4Var = ((u05) sj5Var).a;
        um4Var.getClass();
        try {
            xve.i(wz4Var, "CameraUpdate must not be null.");
            qae qaeVar = (qae) um4Var.b;
            al5 al5Var = (al5) wz4Var.a;
            Parcel R = qaeVar.R();
            jld.c(R, al5Var);
            qaeVar.V(R, 5);
        } catch (RemoteException e) {
            p3d.i(e);
        }
    }

    public final void c(sj5 sj5Var) {
        um4 um4Var = this.a;
        wz4 wz4Var = ((u05) sj5Var).a;
        um4Var.getClass();
        try {
            xve.i(wz4Var, "CameraUpdate must not be null.");
            qae qaeVar = (qae) um4Var.b;
            al5 al5Var = (al5) wz4Var.a;
            Parcel R = qaeVar.R();
            jld.c(R, al5Var);
            R.writeInt(500);
            jld.c(R, null);
            qaeVar.V(R, 7);
        } catch (RemoteException e) {
            p3d.i(e);
        }
    }

    public final ky5 d() {
        um4 um4Var = this.a;
        um4Var.getClass();
        try {
            qae qaeVar = (qae) um4Var.b;
            Parcel Q = qaeVar.Q(qaeVar.R(), 1);
            Parcelable.Creator<CameraPosition> creator = CameraPosition.CREATOR;
            int i = jld.a;
            CameraPosition createFromParcel = Q.readInt() == 0 ? null : creator.createFromParcel(Q);
            Q.recycle();
            LatLng latLng = createFromParcel.a;
            return new ky5(new ak5(latLng.a, latLng.b), createFromParcel.b, (byte) 2);
        } catch (RemoteException e) {
            p3d.i(e);
            return null;
        }
    }

    public final float e() {
        um4 um4Var = this.a;
        um4Var.getClass();
        try {
            qae qaeVar = (qae) um4Var.b;
            Parcel Q = qaeVar.Q(qaeVar.R(), 2);
            float readFloat = Q.readFloat();
            Q.recycle();
            return readFloat;
        } catch (RemoteException e) {
            p3d.i(e);
            return 0.0f;
        }
    }

    public final float f() {
        um4 um4Var = this.a;
        um4Var.getClass();
        try {
            qae qaeVar = (qae) um4Var.b;
            Parcel Q = qaeVar.Q(qaeVar.R(), 3);
            float readFloat = Q.readFloat();
            Q.recycle();
            return readFloat;
        } catch (RemoteException e) {
            p3d.i(e);
            return 0.0f;
        }
    }

    public final aj3 g() {
        ykd ykdVar;
        um4 um4Var = this.a;
        um4Var.getClass();
        try {
            i09 i09Var = (i09) um4Var.c;
            if (i09Var == null) {
                qae qaeVar = (qae) um4Var.b;
                Parcel Q = qaeVar.Q(qaeVar.R(), 25);
                IBinder readStrongBinder = Q.readStrongBinder();
                if (readStrongBinder == null) {
                    ykdVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    ykdVar = queryLocalInterface instanceof ykd ? (ykd) queryLocalInterface : new ykd(readStrongBinder, "com.google.android.gms.maps.internal.IUiSettingsDelegate", (byte) 6);
                }
                Q.recycle();
                i09Var = new i09((Object) ykdVar, (byte) 21);
                um4Var.c = i09Var;
            }
            aj3 aj3Var = new aj3((byte) 10, false);
            aj3Var.b = i09Var;
            return aj3Var;
        } catch (RemoteException e) {
            p3d.i(e);
            return null;
        }
    }

    public final void h(sj5 sj5Var) {
        um4 um4Var = this.a;
        wz4 wz4Var = ((u05) sj5Var).a;
        um4Var.getClass();
        try {
            xve.i(wz4Var, "CameraUpdate must not be null.");
            qae qaeVar = (qae) um4Var.b;
            al5 al5Var = (al5) wz4Var.a;
            Parcel R = qaeVar.R();
            jld.c(R, al5Var);
            qaeVar.V(R, 4);
        } catch (RemoteException e) {
            p3d.i(e);
        }
    }

    public final void i(wj5 wj5Var) {
        um4 um4Var = this.a;
        kk6 kk6Var = wj5Var == null ? null : ((y05) wj5Var).a;
        um4Var.getClass();
        try {
            qae qaeVar = (qae) um4Var.b;
            Parcel R = qaeVar.R();
            jld.b(R, kk6Var);
            Parcel Q = qaeVar.Q(R, 91);
            Q.readInt();
            Q.recycle();
        } catch (RemoteException e) {
            p3d.i(e);
        }
    }

    public final void j(int i) {
        um4 um4Var = this.a;
        if (i == 0) {
            um4Var.c0(1);
        } else if (i == 1) {
            um4Var.c0(2);
        } else {
            if (i != 2) {
                return;
            }
            um4Var.c0(4);
        }
    }

    public final void k(boolean z) {
        um4 um4Var = this.a;
        um4Var.getClass();
        try {
            qae qaeVar = (qae) um4Var.b;
            Parcel R = qaeVar.R();
            int i = jld.a;
            R.writeInt(z ? 1 : 0);
            qaeVar.V(R, 22);
        } catch (RemoteException e) {
            p3d.i(e);
        }
    }

    public final void l(bk5 bk5Var) {
        um4 um4Var = this.a;
        e05 e05Var = new e05((Object) bk5Var, (byte) 6);
        um4Var.getClass();
        try {
            qae qaeVar = (qae) um4Var.b;
            k9d k9dVar = new k9d(e05Var, 0);
            Parcel R = qaeVar.R();
            jld.c(R, k9dVar);
            qaeVar.V(R, 96);
        } catch (RemoteException e) {
            p3d.i(e);
        }
    }

    public final void m(c22 c22Var) {
        um4 um4Var = this.a;
        e05 e05Var = new e05(this, c22Var);
        um4Var.getClass();
        try {
            qae qaeVar = (qae) um4Var.b;
            k9d k9dVar = new k9d(e05Var);
            Parcel R = qaeVar.R();
            jld.c(R, k9dVar);
            qaeVar.V(R, 30);
        } catch (RemoteException e) {
            p3d.i(e);
        }
    }

    public final void n(int i, int i2, int i3, int i4) {
        um4 um4Var = this.a;
        um4Var.getClass();
        try {
            qae qaeVar = (qae) um4Var.b;
            Parcel R = qaeVar.R();
            R.writeInt(i);
            R.writeInt(i2);
            R.writeInt(i3);
            R.writeInt(i4);
            qaeVar.V(R, 39);
        } catch (RemoteException e) {
            p3d.i(e);
        }
    }
}
