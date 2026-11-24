// default package

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public class ya9 implements Parcelable {
    public static final Parcelable.Creator<ya9> CREATOR = new hv6(18);
    public aj5 a;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            aj5 aj5Var = this.a;
            if (aj5Var == null) {
                aj5Var = new xa9(this);
                this.a = aj5Var;
            }
            parcel.writeStrongBinder(aj5Var.asBinder());
        }
    }

    public void a(int i, Bundle bundle) {
    }
}
