// default package

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class y50 extends b4 {
    public static final Parcelable.Creator<y50> CREATOR = new urd((byte) 13);
    public final boolean a;

    public y50(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof y50) && this.a == ((y50) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.q(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        mve.s(parcel, r);
    }
}
