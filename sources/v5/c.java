package v5;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import java.util.Arrays;
import w3.b0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class c extends z5.a {
    public static final Parcelable.Creator<c> CREATOR = new r6.l(26);
    public final String a;
    public final int b;
    public final long c;

    public c(int i10, String str, long j10) {
        this.a = str;
        this.b = i10;
        this.c = j10;
    }

    public final long b() {
        long j10 = this.c;
        return j10 == -1 ? this.b : j10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            String str = cVar.a;
            String str2 = this.a;
            if (((str2 != null && str2.equals(str)) || (str2 == null && str == null)) && b() == cVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Long.valueOf(b())});
    }

    public final String toString() {
        b0 b0Var = new b0(this);
        b0Var.e(this.a, "name");
        b0Var.e(Long.valueOf(b()), "version");
        return b0Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = r8.q(parcel, 20293);
        r8.l(parcel, 1, this.a);
        r8.s(parcel, 2, 4);
        parcel.writeInt(this.b);
        long b10 = b();
        r8.s(parcel, 3, 8);
        parcel.writeLong(b10);
        r8.r(parcel, q6);
    }

    public c(String str, long j10) {
        this.a = str;
        this.c = j10;
        this.b = -1;
    }
}
