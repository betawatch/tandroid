package r5;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import java.util.Arrays;
import java.util.Locale;
import n6.w0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class d extends z5.a {
    public static final Parcelable.Creator<d> CREATOR = new w0(17);
    public double a;
    public boolean b;
    public int c;
    public m5.d d;
    public int e;
    public m5.y f;
    public double h;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.a == dVar.a && this.b == dVar.b && this.c == dVar.c && a.d(this.d, dVar.d) && this.e == dVar.e) {
            m5.y yVar = this.f;
            if (a.d(yVar, yVar) && this.h == dVar.h) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Double.valueOf(this.a), Boolean.valueOf(this.b), Integer.valueOf(this.c), this.d, Integer.valueOf(this.e), this.f, Double.valueOf(this.h)});
    }

    public final String toString() {
        return String.format(Locale.ROOT, "volume=%f", Double.valueOf(this.a));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = r8.q(parcel, 20293);
        double d = this.a;
        r8.s(parcel, 2, 8);
        parcel.writeDouble(d);
        boolean z10 = this.b;
        r8.s(parcel, 3, 4);
        parcel.writeInt(z10 ? 1 : 0);
        int i11 = this.c;
        r8.s(parcel, 4, 4);
        parcel.writeInt(i11);
        r8.k(parcel, 5, this.d, i10);
        int i12 = this.e;
        r8.s(parcel, 6, 4);
        parcel.writeInt(i12);
        r8.k(parcel, 7, this.f, i10);
        double d10 = this.h;
        r8.s(parcel, 8, 8);
        parcel.writeDouble(d10);
        r8.r(parcel, q6);
    }
}
