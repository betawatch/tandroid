// default package

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class ued extends c4 {
    public static final Parcelable.Creator<ued> CREATOR = new ced(6);
    public final fed a;
    public final fed b;

    public ued(fed fedVar, fed fedVar2) {
        this.a = fedVar;
        this.b = fedVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ued)) {
            return false;
        }
        ued uedVar = (ued) obj;
        return qd1.d(this.a, uedVar.a) && qd1.d(this.b, uedVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.k(parcel, 2, this.a, i);
        bye.k(parcel, 3, this.b, i);
        bye.s(parcel, r);
    }
}
