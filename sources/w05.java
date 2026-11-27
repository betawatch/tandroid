// default package

import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class w05 {
    public final dl6 a;

    public w05(dl6 dl6Var) {
        this.a = dl6Var;
    }

    public final ak5 a() {
        dl6 dl6Var = this.a;
        dl6Var.getClass();
        try {
            hmf hmfVar = (hmf) dl6Var.a;
            Parcel Q = hmfVar.Q(hmfVar.R(), 4);
            Parcelable.Creator<LatLng> creator = LatLng.CREATOR;
            int i = jld.a;
            LatLng createFromParcel = Q.readInt() == 0 ? null : creator.createFromParcel(Q);
            Q.recycle();
            return new ak5(createFromParcel.a, createFromParcel.b);
        } catch (RemoteException e) {
            p3d.i(e);
            return null;
        }
    }

    public final void b(ak5 ak5Var) {
        LatLng latLng = new LatLng(ak5Var.a, ak5Var.b);
        dl6 dl6Var = this.a;
        dl6Var.getClass();
        try {
            hmf hmfVar = (hmf) dl6Var.a;
            Parcel R = hmfVar.R();
            jld.b(R, latLng);
            hmfVar.V(R, 3);
        } catch (RemoteException e) {
            p3d.i(e);
        }
    }

    public final void c(float f) {
        dl6 dl6Var = this.a;
        dl6Var.getClass();
        try {
            hmf hmfVar = (hmf) dl6Var.a;
            Parcel R = hmfVar.R();
            R.writeFloat(f);
            hmfVar.V(R, 22);
        } catch (RemoteException e) {
            p3d.i(e);
        }
    }
}
