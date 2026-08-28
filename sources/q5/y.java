package q5;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import java.util.Arrays;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class y extends y5.a {
    public static final Parcelable.Creator<y> CREATOR = new o5.p(8);
    public final int a;
    public final boolean b;
    public final boolean c;

    public y(int i9, boolean z10, boolean z11) {
        this.a = i9;
        this.b = z10;
        this.c = z11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.a == yVar.a && this.b == yVar.b && this.c == yVar.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Boolean.valueOf(this.b), Boolean.valueOf(this.c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 2, 4);
        parcel.writeInt(this.a);
        p8.s(parcel, 3, 4);
        parcel.writeInt(this.b ? 1 : 0);
        p8.s(parcel, 4, 4);
        parcel.writeInt(this.c ? 1 : 0);
        p8.r(parcel, q10);
    }
}
