// default package

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class z0e extends b4 {
    public static final Parcelable.Creator<z0e> CREATOR = new t0e((byte) 12);
    public final rce a;
    public final rce b;

    public z0e(rce rceVar, rce rceVar2) {
        this.a = rceVar;
        this.b = rceVar2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof z0e)) {
            return false;
        }
        z0e z0eVar = (z0e) obj;
        return fse.a(this.a, z0eVar.a) && fse.a(this.b, z0eVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        rce rceVar = this.a;
        mve.c(parcel, 1, rceVar == null ? null : rceVar.p());
        rce rceVar2 = this.b;
        mve.c(parcel, 2, rceVar2 != null ? rceVar2.p() : null);
        mve.s(parcel, r);
    }
}
