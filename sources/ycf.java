// default package

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class ycf extends b4 {
    public static final Parcelable.Creator<ycf> CREATOR = new c0f((byte) 25);
    public final ArrayList a;

    public ycf(ArrayList arrayList) {
        fre.h(arrayList);
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ycf)) {
            return false;
        }
        ArrayList arrayList = ((ycf) obj).a;
        ArrayList arrayList2 = this.a;
        return arrayList2.containsAll(arrayList) && arrayList.containsAll(arrayList2);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{new HashSet(this.a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.p(parcel, 1, this.a);
        jte.s(parcel, r);
    }
}
