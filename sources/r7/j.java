package r7;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import java.util.Arrays;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class j extends z5.a {
    public static final Parcelable.Creator<j> CREATOR = new r6.l(9);
    public final int a;
    public final int b;
    public final long c;
    public final long d;

    public j(long j10, int i10, int i11, long j11) {
        this.a = i10;
        this.b = i11;
        this.c = j10;
        this.d = j11;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.a == jVar.a && this.b == jVar.b && this.c == jVar.c && this.d == jVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.a), Long.valueOf(this.d), Long.valueOf(this.c)});
    }

    public final String toString() {
        StringBuilder p6 = com.google.android.recaptcha.internal.a.p("NetworkLocationStatus: Wifi status: ", this.a, " Cell status: ", this.b, " elapsed time NS: ");
        p6.append(this.d);
        p6.append(" system time ms: ");
        p6.append(this.c);
        return p6.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = r8.q(parcel, 20293);
        r8.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        r8.s(parcel, 2, 4);
        parcel.writeInt(this.b);
        r8.s(parcel, 3, 8);
        parcel.writeLong(this.c);
        r8.s(parcel, 4, 8);
        parcel.writeLong(this.d);
        r8.r(parcel, q6);
    }
}
