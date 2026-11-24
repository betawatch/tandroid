// default package

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class v9c extends b4 {
    public static final Parcelable.Creator<v9c> CREATOR = new hv6((byte) 23);
    public final int a;
    public final String b;
    public final int c;

    public v9c(int i, int i2, String str) {
        str.getClass();
        this.a = i;
        this.b = str;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v9c)) {
            return false;
        }
        v9c v9cVar = (v9c) obj;
        return this.a == v9cVar.a && rp5.a(this.b, v9cVar.b) && this.c == v9cVar.c;
    }

    public final int hashCode() {
        return ir2.j(this.a * 31, 31, this.b) + this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        int r = jte.r(parcel, 20293);
        jte.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        jte.l(parcel, 2, this.b);
        jte.q(parcel, 3, 4);
        parcel.writeInt(this.c);
        jte.s(parcel, r);
    }
}
