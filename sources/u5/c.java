package u5;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import java.util.Arrays;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class c extends y5.a {
    public static final Parcelable.Creator<c> CREATOR = new q7.j(18);
    public final String a;
    public final int b;
    public final long c;

    public c(int i9, String str, long j10) {
        this.a = str;
        this.b = i9;
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
        w4.e eVar = new w4.e(this);
        eVar.c(this.a, "name");
        eVar.c(Long.valueOf(b()), "version");
        return eVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.l(parcel, 1, this.a);
        p8.s(parcel, 2, 4);
        parcel.writeInt(this.b);
        long b10 = b();
        p8.s(parcel, 3, 8);
        parcel.writeLong(b10);
        p8.r(parcel, q10);
    }

    public c(String str, long j10) {
        this.a = str;
        this.c = j10;
        this.b = -1;
    }
}
