package u7;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import java.util.Arrays;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class j extends c6.a {
    public static final Parcelable.Creator<j> CREATOR = new u6.p(5);
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
        StringBuilder m9 = e2.c.m("NetworkLocationStatus: Wifi status: ", this.a, " Cell status: ", this.b, " elapsed time NS: ");
        m9.append(this.d);
        m9.append(" system time ms: ");
        m9.append(this.c);
        return m9.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        f5.s(parcel, 2, 4);
        parcel.writeInt(this.b);
        f5.s(parcel, 3, 8);
        parcel.writeLong(this.c);
        f5.s(parcel, 4, 8);
        parcel.writeLong(this.d);
        f5.r(parcel, q10);
    }
}
