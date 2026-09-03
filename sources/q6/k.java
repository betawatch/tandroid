package q6;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import java.util.Arrays;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
        } catch (q e6) {
            throw new IllegalArgumentException(e6);
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
        androidx.biometric.e eVar = new androidx.biometric.e(getClass().getSimpleName(), 7);
        String valueOf = String.valueOf(this.a.a);
        b7.e eVar2 = new b7.e(6, false);
        ((androidx.biometric.e) eVar.d).d = eVar2;
        eVar.d = eVar2;
        eVar2.c = valueOf;
        eVar2.b = "errorCode";
        String str = this.b;
        if (str != null) {
            eVar.D(str, "errorMessage");
        }
        return eVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        int i11 = this.a.a;
        g5.s(parcel, 2, 4);
        parcel.writeInt(i11);
        g5.l(parcel, 3, this.b);
        g5.s(parcel, 4, 4);
        parcel.writeInt(this.c);
        g5.r(parcel, q10);
    }
}
