package r7;

import android.os.Parcel;
import android.os.Parcelable;
import c7.q;
import h7.r8;
import java.util.Arrays;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class b extends z5.a {
    public static final Parcelable.Creator<b> CREATOR = new r6.l(10);
    public final long a;
    public final int b;
    public final boolean c;
    public final String d;
    public final c7.k e;

    public b(long j10, int i10, boolean z10, String str, c7.k kVar) {
        this.a = j10;
        this.b = i10;
        this.c = z10;
        this.d = str;
        this.e = kVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a == bVar.a && this.b == bVar.b && this.c == bVar.c && y5.l.l(this.d, bVar.d) && y5.l.l(this.e, bVar.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Integer.valueOf(this.b), Boolean.valueOf(this.c)});
    }

    public final String toString() {
        String str;
        StringBuilder o10 = com.google.android.recaptcha.internal.a.o("LastLocationRequest[");
        long j10 = this.a;
        if (j10 != Long.MAX_VALUE) {
            o10.append("maxAge=");
            q.a(o10, j10);
        }
        int i10 = this.b;
        if (i10 != 0) {
            o10.append(", ");
            if (i10 == 0) {
                str = "GRANULARITY_PERMISSION_LEVEL";
            } else if (i10 == 1) {
                str = "GRANULARITY_COARSE";
            } else {
                if (i10 != 2) {
                    throw new IllegalArgumentException();
                }
                str = "GRANULARITY_FINE";
            }
            o10.append(str);
        }
        if (this.c) {
            o10.append(", bypass");
        }
        String str2 = this.d;
        if (str2 != null) {
            o10.append(", moduleId=");
            o10.append(str2);
        }
        c7.k kVar = this.e;
        if (kVar != null) {
            o10.append(", impersonation=");
            o10.append(kVar);
        }
        o10.append(']');
        return o10.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = r8.q(parcel, 20293);
        r8.s(parcel, 1, 8);
        parcel.writeLong(this.a);
        r8.s(parcel, 2, 4);
        parcel.writeInt(this.b);
        r8.s(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        r8.l(parcel, 4, this.d);
        r8.k(parcel, 5, this.e, i10);
        r8.r(parcel, q6);
    }
}
