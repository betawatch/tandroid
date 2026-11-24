// default package

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class p8d extends b4 {
    public static final Parcelable.Creator<p8d> CREATOR = new t4d((byte) 26);
    public final String a;
    public final ArrayList b;

    public p8d(String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
        fre.h(str);
        fre.h(arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p8d.class != obj.getClass()) {
            return false;
        }
        p8d p8dVar = (p8d) obj;
        String str = p8dVar.a;
        String str2 = this.a;
        if (str2 != null) {
            if (!str2.equals(str)) {
                return false;
            }
        } else if (str != null) {
            return false;
        }
        ArrayList arrayList = p8dVar.b;
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
        return b00.i("CapabilityInfo{", this.a, ", ", String.valueOf(this.b), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.l(parcel, 2, this.a);
        jte.p(parcel, 3, this.b);
        jte.s(parcel, r);
    }
}
