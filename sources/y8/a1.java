package y8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.g9;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class a1 extends o6.a {
    public static final Parcelable.Creator<a1> CREATOR = new l0(10);
    public final String a;
    public final String b;
    public final y0 c;
    public final String d;
    public final String e;
    public final Float f;
    public final c1 h;

    public a1(String str, String str2, y0 y0Var, String str3, String str4, Float f7, c1 c1Var) {
        this.a = str;
        this.b = str2;
        this.c = y0Var;
        this.d = str3;
        this.e = str4;
        this.f = f7;
        this.h = c1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a1.class == obj.getClass()) {
            a1 a1Var = (a1) obj;
            if (g9.a(this.a, a1Var.a) && g9.a(this.b, a1Var.b) && g9.a(this.c, a1Var.c) && g9.a(this.d, a1Var.d) && g9.a(this.e, a1Var.e) && g9.a(this.f, a1Var.f) && g9.a(this.h, a1Var.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.h});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.h);
        String valueOf2 = String.valueOf(this.c);
        StringBuilder v = a1.g.v("AppParcelable{title='", this.b, "', developerName='", this.d, "', formattedPrice='");
        v.append(this.e);
        v.append("', starRating=");
        v.append(this.f);
        v.append(", wearDetails=");
        c3.i0.r(v, valueOf, ", deepLinkUri='", this.a, "', icon=");
        return a1.g.r(v, valueOf2, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.h0.q(parcel, 20293);
        w7.h0.l(parcel, 1, this.a);
        w7.h0.l(parcel, 2, this.b);
        w7.h0.k(parcel, 3, this.c, i10);
        w7.h0.l(parcel, 4, this.d);
        w7.h0.l(parcel, 5, this.e);
        w7.h0.e(parcel, 6, this.f);
        w7.h0.k(parcel, 7, this.h, i10);
        w7.h0.r(parcel, q6);
    }
}
