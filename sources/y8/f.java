package y8;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class f extends o6.a implements Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new c(2);
    public final String a;
    public final String b;
    public final String c;

    public f(String str, String str2, String str3) {
        n6.l.g(str);
        this.a = str;
        n6.l.g(str2);
        this.b = str2;
        n6.l.g(str3);
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.a.equals(fVar.a) && n6.l.k(fVar.b, this.b) && n6.l.k(fVar.c, this.c);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String str = this.a;
        int i10 = 0;
        for (char c10 : str.toCharArray()) {
            i10 += c10;
        }
        String trim = str.trim();
        int length = trim.length();
        if (length > 25) {
            trim = trim.substring(0, 10) + "..." + trim.substring(length - 10, length) + "::" + i10;
        }
        return a1.g.r(a1.g.v("Channel{token=", trim, ", nodeId=", this.b, ", path="), this.c, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.h0.q(parcel, 20293);
        w7.h0.l(parcel, 2, this.a);
        w7.h0.l(parcel, 3, this.b);
        w7.h0.l(parcel, 4, this.c);
        w7.h0.r(parcel, q6);
    }
}
