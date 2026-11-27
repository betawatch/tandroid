// default package

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class oz5 extends c4 {
    public static final Parcelable.Creator<oz5> CREATOR = new nkf((byte) 2);
    public final long a;
    public final int b;
    public final boolean c;
    public final String d;
    public final srd e;

    public oz5(long j, int i, boolean z, String str, srd srdVar) {
        this.a = j;
        this.b = i;
        this.c = z;
        this.d = str;
        this.e = srdVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof oz5)) {
            return false;
        }
        oz5 oz5Var = (oz5) obj;
        return this.a == oz5Var.a && this.b == oz5Var.b && this.c == oz5Var.c && vue.a(this.d, oz5Var.d) && vue.a(this.e, oz5Var.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Integer.valueOf(this.b), Boolean.valueOf(this.c)});
    }

    public final String toString() {
        String str;
        StringBuilder r = qd4.r("LastLocationRequest[");
        long j = this.a;
        if (j != Long.MAX_VALUE) {
            r.append("maxAge=");
            iud.a(j, r);
        }
        int i = this.b;
        if (i != 0) {
            r.append(", ");
            if (i == 0) {
                str = "GRANULARITY_PERMISSION_LEVEL";
            } else if (i == 1) {
                str = "GRANULARITY_COARSE";
            } else {
                if (i != 2) {
                    iy8.d();
                    return null;
                }
                str = "GRANULARITY_FINE";
            }
            r.append(str);
        }
        if (this.c) {
            r.append(", bypass");
        }
        String str2 = this.d;
        if (str2 != null) {
            r.append(", moduleId=");
            r.append(str2);
        }
        srd srdVar = this.e;
        if (srdVar != null) {
            r.append(", impersonation=");
            r.append(srdVar);
        }
        r.append(']');
        return r.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.q(parcel, 1, 8);
        parcel.writeLong(this.a);
        bye.q(parcel, 2, 4);
        parcel.writeInt(this.b);
        bye.q(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        bye.l(parcel, 4, this.d);
        bye.k(parcel, 5, this.e, i);
        bye.s(parcel, r);
    }
}
