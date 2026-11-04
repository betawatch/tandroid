package z5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p6.m;
import y8.i;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class b extends q6.a {
    public static final Parcelable.Creator<b> CREATOR = new i(4);
    public final boolean a;
    public final String b;

    public b(String str, boolean z10) {
        if (z10) {
            m.g(str);
        }
        this.a = z10;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a == bVar.a && m.k(this.b, bVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.r(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        j8.a.m(parcel, 2, this.b);
        j8.a.t(parcel, s6);
    }
}
