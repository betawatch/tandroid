package q7;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import java.util.Arrays;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class k extends y5.a {
    public static final Parcelable.Creator<k> CREATOR = new j(1);
    public final int a;
    public final int b;
    public final long c;
    public final long d;

    public k(long j10, int i9, int i10, long j11) {
        this.a = i9;
        this.b = i10;
        this.c = j10;
        this.d = j11;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (this.a == kVar.a && this.b == kVar.b && this.c == kVar.c && this.d == kVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.a), Long.valueOf(this.d), Long.valueOf(this.c)});
    }

    public final String toString() {
        StringBuilder o6 = e2.c.o("NetworkLocationStatus: Wifi status: ", this.a, " Cell status: ", this.b, " elapsed time NS: ");
        o6.append(this.d);
        o6.append(" system time ms: ");
        o6.append(this.c);
        return o6.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        p8.s(parcel, 2, 4);
        parcel.writeInt(this.b);
        p8.s(parcel, 3, 8);
        parcel.writeLong(this.c);
        p8.s(parcel, 4, 8);
        parcel.writeLong(this.d);
        p8.r(parcel, q10);
    }
}
