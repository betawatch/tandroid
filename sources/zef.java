// default package

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class zef extends b4 {
    public static final Parcelable.Creator<zef> CREATOR = new e2f((byte) 25);
    public final ArrayList a;

    public zef(ArrayList arrayList) {
        ite.h(arrayList);
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zef)) {
            return false;
        }
        ArrayList arrayList = ((zef) obj).a;
        ArrayList arrayList2 = this.a;
        return arrayList2.containsAll(arrayList) && arrayList.containsAll(arrayList2);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{new HashSet(this.a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.p(parcel, 1, this.a);
        mve.s(parcel, r);
    }
}
