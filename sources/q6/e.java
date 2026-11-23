package q6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class e extends r6.a {
    public static final Parcelable.Creator<e> CREATOR = new q4.x(1);
    public final int a;
    public final String b;

    public e(int i7, String str) {
        this.a = i7;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return eVar.a == this.a && m.l(eVar.b, this.b);
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        int i7 = this.a;
        int length = String.valueOf(i7).length();
        String str = this.b;
        StringBuilder sb2 = new StringBuilder(length + 1 + String.valueOf(str).length());
        sb2.append(i7);
        sb2.append(":");
        sb2.append(str);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        bc.l(parcel, 2, this.b);
        bc.s(parcel, r10);
    }
}
