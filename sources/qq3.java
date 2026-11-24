// default package

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class qq3 implements Comparator, Parcelable {
    public static final Parcelable.Creator<qq3> CREATOR = new x21(15);
    public final pq3[] a;
    public int b;
    public final String c;
    public final int d;

    public qq3(Parcel parcel) {
        this.c = parcel.readString();
        pq3[] pq3VarArr = (pq3[]) parcel.createTypedArray(pq3.CREATOR);
        String str = g8c.a;
        this.a = pq3VarArr;
        this.d = pq3VarArr.length;
    }

    public final qq3 a(String str) {
        return Objects.equals(this.c, str) ? this : new qq3(str, false, this.a);
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        pq3 pq3Var = (pq3) obj;
        pq3 pq3Var2 = (pq3) obj2;
        UUID uuid = g51.b;
        return uuid.equals(pq3Var.b) ? uuid.equals(pq3Var2.b) ? 0 : 1 : pq3Var.b.compareTo(pq3Var2.b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && qq3.class == obj.getClass()) {
            qq3 qq3Var = (qq3) obj;
            if (Objects.equals(this.c, qq3Var.c) && Arrays.equals(this.a, qq3Var.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.b;
        if (i != 0) {
            return i;
        }
        String str = this.c;
        int hashCode = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.a);
        this.b = hashCode;
        return hashCode;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.c);
        parcel.writeTypedArray(this.a, 0);
    }

    public qq3(String str, boolean z, pq3... pq3VarArr) {
        this.c = str;
        pq3VarArr = z ? (pq3[]) pq3VarArr.clone() : pq3VarArr;
        this.a = pq3VarArr;
        this.d = pq3VarArr.length;
        Arrays.sort(pq3VarArr, this);
    }

    public qq3(String str, ArrayList arrayList) {
        this(str, false, (pq3[]) arrayList.toArray(new pq3[0]));
    }
}
