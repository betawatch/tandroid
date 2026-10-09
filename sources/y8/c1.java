package y8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.v8;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class c1 extends o6.a {
    public static final Parcelable.Creator<c1> CREATOR = new n0(10);
    public final String a;
    public final String b;
    public final a1 c;
    public final String d;
    public final String e;
    public final Float f;
    public final e1 h;

    public c1(String str, String str2, a1 a1Var, String str3, String str4, Float f7, e1 e1Var) {
        this.a = str;
        this.b = str2;
        this.c = a1Var;
        this.d = str3;
        this.e = str4;
        this.f = f7;
        this.h = e1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c1.class == obj.getClass()) {
            c1 c1Var = (c1) obj;
            if (v8.a(this.a, c1Var.a) && v8.a(this.b, c1Var.b) && v8.a(this.c, c1Var.c) && v8.a(this.d, c1Var.d) && v8.a(this.e, c1Var.e) && v8.a(this.f, c1Var.f) && v8.a(this.h, c1Var.h)) {
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
        StringBuilder x10 = a1.g.x("AppParcelable{title='", this.b, "', developerName='", this.d, "', formattedPrice='");
        x10.append(this.e);
        x10.append("', starRating=");
        x10.append(this.f);
        x10.append(", wearDetails=");
        a1.g.A(x10, valueOf, ", deepLinkUri='", this.a, "', icon=");
        return a1.g.t(x10, valueOf2, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.d0.q(parcel, 20293);
        w7.d0.l(parcel, 1, this.a);
        w7.d0.l(parcel, 2, this.b);
        w7.d0.k(parcel, 3, this.c, i10);
        w7.d0.l(parcel, 4, this.d);
        w7.d0.l(parcel, 5, this.e);
        w7.d0.e(parcel, 6, this.f);
        w7.d0.k(parcel, 7, this.h, i10);
        w7.d0.r(parcel, q6);
    }
}
