// default package

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class rad extends b4 {
    public static final Parcelable.Creator<rad> CREATOR = new v6d(26);
    public final String a;
    public final ArrayList b;

    public rad(String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
        ite.h(str);
        ite.h(arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || rad.class != obj.getClass()) {
            return false;
        }
        rad radVar = (rad) obj;
        String str = radVar.a;
        String str2 = this.a;
        if (str2 != null) {
            if (!str2.equals(str)) {
                return false;
            }
        } else if (str != null) {
            return false;
        }
        ArrayList arrayList = radVar.b;
        ArrayList arrayList2 = this.b;
        return arrayList2 != null ? arrayList2.equals(arrayList) : arrayList == null;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = ((str != null ? str.hashCode() : 0) + 31) * 31;
        ArrayList arrayList = this.b;
        return hashCode + (arrayList != null ? arrayList.hashCode() : 0);
    }

    public final String toString() {
        return b10.i("CapabilityInfo{", this.a, ", ", String.valueOf(this.b), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.l(parcel, 2, this.a);
        mve.p(parcel, 3, this.b);
        mve.s(parcel, r);
    }
}
