package s5;

import aa.d;
import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import java.util.Arrays;
import q7.j;

/* loaded from: classes.dex */
public final class b extends y5.a {
    public static final Parcelable.Creator<b> CREATOR = new j(7);
    public final boolean a;
    public final long b;
    public final long c;

    public b(long j10, long j11, boolean z10) {
        this.a = z10;
        this.b = j10;
        this.c = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.a == bVar.a && this.b == bVar.b && this.c == bVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), Long.valueOf(this.b), Long.valueOf(this.c)});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CollectForDebugParcelable[skipPersistentStorage: ");
        sb2.append(this.a);
        sb2.append(",collectForDebugStartTimeMillis: ");
        sb2.append(this.b);
        sb2.append(",collectForDebugExpiryTimeMillis: ");
        return d.q(sb2, this.c, "]");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        p8.s(parcel, 2, 8);
        parcel.writeLong(this.c);
        p8.s(parcel, 3, 8);
        parcel.writeLong(this.b);
        p8.r(parcel, q10);
    }
}
