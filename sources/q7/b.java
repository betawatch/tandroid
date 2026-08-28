package q7;

import android.os.Parcel;
import android.os.Parcelable;
import b7.r;
import g7.p8;
import java.util.Arrays;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class b extends y5.a {
    public static final Parcelable.Creator<b> CREATOR = new j(2);
    public final long a;
    public final int b;
    public final boolean c;
    public final String d;
    public final b7.l e;

    public b(long j10, int i9, boolean z10, String str, b7.l lVar) {
        this.a = j10;
        this.b = i9;
        this.c = z10;
        this.d = str;
        this.e = lVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a == bVar.a && this.b == bVar.b && this.c == bVar.c && x5.l.l(this.d, bVar.d) && x5.l.l(this.e, bVar.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Integer.valueOf(this.b), Boolean.valueOf(this.c)});
    }

    public final String toString() {
        String str;
        StringBuilder n10 = e2.c.n("LastLocationRequest[");
        long j10 = this.a;
        if (j10 != Long.MAX_VALUE) {
            n10.append("maxAge=");
            r.a(n10, j10);
        }
        int i9 = this.b;
        if (i9 != 0) {
            n10.append(", ");
            if (i9 == 0) {
                str = "GRANULARITY_PERMISSION_LEVEL";
            } else if (i9 == 1) {
                str = "GRANULARITY_COARSE";
            } else {
                if (i9 != 2) {
                    throw new IllegalArgumentException();
                }
                str = "GRANULARITY_FINE";
            }
            n10.append(str);
        }
        if (this.c) {
            n10.append(", bypass");
        }
        String str2 = this.d;
        if (str2 != null) {
            n10.append(", moduleId=");
            n10.append(str2);
        }
        b7.l lVar = this.e;
        if (lVar != null) {
            n10.append(", impersonation=");
            n10.append(lVar);
        }
        n10.append(']');
        return n10.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 1, 8);
        parcel.writeLong(this.a);
        p8.s(parcel, 2, 4);
        parcel.writeInt(this.b);
        p8.s(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        p8.l(parcel, 4, this.d);
        p8.k(parcel, 5, this.e, i9);
        p8.r(parcel, q10);
    }
}
