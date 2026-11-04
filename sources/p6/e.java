package p6;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class e extends q6.a {
    public static final Parcelable.Creator<e> CREATOR = new n8.g(16);
    public final int a;
    public final String b;

    public e(int i3, String str) {
        this.a = i3;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return eVar.a == this.a && m.k(eVar.b, this.b);
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        int i3 = this.a;
        int length = String.valueOf(i3).length();
        String str = this.b;
        StringBuilder sb2 = new StringBuilder(length + 1 + String.valueOf(str).length());
        sb2.append(i3);
        sb2.append(":");
        sb2.append(str);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.r(parcel, 1, 4);
        parcel.writeInt(this.a);
        j8.a.m(parcel, 2, this.b);
        j8.a.t(parcel, s6);
    }
}
