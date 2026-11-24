// default package

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class yef extends b4 {
    public static final Parcelable.Creator<yef> CREATOR = new e2f((byte) 24);
    public final boolean a;
    public final ArrayList b;

    public yef(ArrayList arrayList, boolean z) {
        this.a = z;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || yef.class != obj.getClass()) {
            return false;
        }
        yef yefVar = (yef) obj;
        if (this.a != yefVar.a) {
            return false;
        }
        Object obj2 = yefVar.b;
        ArrayList arrayList = this.b;
        if (arrayList != obj2) {
            return arrayList != null && arrayList.equals(obj2);
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), this.b});
    }

    public final String toString() {
        return "AppWearDetailsParcelable{isWatchface=" + this.a + ", watchfaceCategories=" + String.valueOf(this.b) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.q(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        mve.n(parcel, 2, this.b);
        mve.s(parcel, r);
    }
}
