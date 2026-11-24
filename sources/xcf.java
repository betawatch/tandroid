// default package

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class xcf extends b4 {
    public static final Parcelable.Creator<xcf> CREATOR = new c0f((byte) 24);
    public final boolean a;
    public final ArrayList b;

    public xcf(ArrayList arrayList, boolean z) {
        this.a = z;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || xcf.class != obj.getClass()) {
            return false;
        }
        xcf xcfVar = (xcf) obj;
        if (this.a != xcfVar.a) {
            return false;
        }
        Object obj2 = xcfVar.b;
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
        int r = jte.r(parcel, 20293);
        jte.q(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        jte.n(parcel, 2, this.b);
        jte.s(parcel, r);
    }
}
