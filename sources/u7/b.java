package u7;

import android.os.Parcel;
import android.os.Parcelable;
import f7.q;
import j7.g5;
import java.util.Arrays;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class b extends c6.a {
    public static final Parcelable.Creator<b> CREATOR = new u6.p(6);
    public final long a;
    public final int b;
    public final boolean c;
    public final String d;
    public final f7.k e;

    public b(long j10, int i10, boolean z4, String str, f7.k kVar) {
        this.a = j10;
        this.b = i10;
        this.c = z4;
        this.d = str;
        this.e = kVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a == bVar.a && this.b == bVar.b && this.c == bVar.c && b6.m.l(this.d, bVar.d) && b6.m.l(this.e, bVar.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Integer.valueOf(this.b), Boolean.valueOf(this.c)});
    }

    public final String toString() {
        String str;
        StringBuilder l10 = e2.c.l("LastLocationRequest[");
        long j10 = this.a;
        if (j10 != Long.MAX_VALUE) {
            l10.append("maxAge=");
            q.a(l10, j10);
        }
        int i10 = this.b;
        if (i10 != 0) {
            l10.append(", ");
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
            l10.append(str);
        }
        if (this.c) {
            l10.append(", bypass");
        }
        String str2 = this.d;
        if (str2 != null) {
            l10.append(", moduleId=");
            l10.append(str2);
        }
        f7.k kVar = this.e;
        if (kVar != null) {
            l10.append(", impersonation=");
            l10.append(kVar);
        }
        l10.append(']');
        return l10.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.s(parcel, 1, 8);
        parcel.writeLong(this.a);
        g5.s(parcel, 2, 4);
        parcel.writeInt(this.b);
        g5.s(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        g5.l(parcel, 4, this.d);
        g5.k(parcel, 5, this.e, i10);
        g5.r(parcel, q10);
    }
}
