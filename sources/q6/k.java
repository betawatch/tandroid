package q6;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import java.util.Arrays;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class k extends l {
    public static final Parcelable.Creator<k> CREATOR = new r0(20);
    public final r a;
    public final String b;
    public final int c;

    public k(int i10, int i11, String str) {
        try {
            this.a = r.a(i10);
            this.b = str;
            this.c = i11;
        } catch (q e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return b6.m.l(this.a, kVar.a) && b6.m.l(this.b, kVar.b) && b6.m.l(Integer.valueOf(this.c), Integer.valueOf(kVar.c));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(this.c)});
    }

    public final String toString() {
        af.d dVar = new af.d(getClass().getSimpleName(), 8);
        String valueOf = String.valueOf(this.a.a);
        b7.e eVar = new b7.e(7, false);
        ((af.d) dVar.d).d = eVar;
        dVar.d = eVar;
        eVar.c = valueOf;
        eVar.b = "errorCode";
        String str = this.b;
        if (str != null) {
            dVar.D(str, "errorMessage");
        }
        return dVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        int i11 = this.a.a;
        f5.s(parcel, 2, 4);
        parcel.writeInt(i11);
        f5.l(parcel, 3, this.b);
        f5.s(parcel, 4, 4);
        parcel.writeInt(this.c);
        f5.r(parcel, q10);
    }
}
