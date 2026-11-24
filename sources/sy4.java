// default package

import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class sy4 {
    public final yi6 a;

    public sy4(yi6 yi6Var) {
        this.a = yi6Var;
    }

    public final yh5 a() {
        yi6 yi6Var = this.a;
        yi6Var.getClass();
        try {
            rhf rhfVar = (rhf) yi6Var.a;
            Parcel Q = rhfVar.Q(rhfVar.R(), 4);
            Parcelable.Creator<LatLng> creator = LatLng.CREATOR;
            int i = sgd.a;
            LatLng createFromParcel = Q.readInt() == 0 ? null : creator.createFromParcel(Q);
            Q.recycle();
            return new yh5(createFromParcel.a, createFromParcel.b);
        } catch (RemoteException e) {
            fvc.g(e);
            return null;
        }
    }

    public final void b(yh5 yh5Var) {
        LatLng latLng = new LatLng(yh5Var.a, yh5Var.b);
        yi6 yi6Var = this.a;
        yi6Var.getClass();
        try {
            rhf rhfVar = (rhf) yi6Var.a;
            Parcel R = rhfVar.R();
            sgd.b(R, latLng);
            rhfVar.V(R, 3);
        } catch (RemoteException e) {
            fvc.g(e);
        }
    }

    public final void c(float f) {
        yi6 yi6Var = this.a;
        yi6Var.getClass();
        try {
            rhf rhfVar = (rhf) yi6Var.a;
            Parcel R = rhfVar.R();
            R.writeFloat(f);
            rhfVar.V(R, 22);
        } catch (RemoteException e) {
            fvc.g(e);
        }
    }
}
