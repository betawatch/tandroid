package x5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import v8.s;
import w7.h0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class d extends o6.a {
    public static final Parcelable.Creator<d> CREATOR = new s(27);
    public final boolean a;

    public d(boolean z10) {
        this.a = z10;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof d) && this.a == ((d) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.s(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        h0.r(parcel, q6);
    }
}
