// default package

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class pd6 extends c4 implements ie9 {
    public static final Parcelable.Creator<pd6> CREATOR = new m9d((byte) 3);
    public final Status a;
    public final qd6 b;

    public pd6(Status status, qd6 qd6Var) {
        this.a = status;
        this.b = qd6Var;
    }

    @Override // ie9
    public final Status a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.k(parcel, 1, this.a, i);
        bye.k(parcel, 2, this.b, i);
        bye.s(parcel, r);
    }
}
