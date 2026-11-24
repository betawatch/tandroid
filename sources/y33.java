// default package

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class y33 extends b4 {
    public static final Parcelable.Creator<y33> CREATOR = new lbd((byte) 0);
    public final String a;
    public final String b;

    public y33(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y33)) {
            return false;
        }
        y33 y33Var = (y33) obj;
        return fse.a(this.a, y33Var.a) && fse.a(this.b, y33Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.l(parcel, 1, this.a);
        mve.l(parcel, 2, this.b);
        mve.s(parcel, r);
    }
}
