// default package

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class yc9 implements Parcelable {
    public static final Parcelable.Creator<yc9> CREATOR = new hx6(18);
    public zk5 a;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            zk5 zk5Var = this.a;
            if (zk5Var == null) {
                zk5Var = new xc9(this);
                this.a = zk5Var;
            }
            parcel.writeStrongBinder(zk5Var.asBinder());
        }
    }

    public void a(int i, Bundle bundle) {
    }
}
