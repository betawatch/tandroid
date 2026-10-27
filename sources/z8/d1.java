package z8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.o5;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class d1 extends p6.a {
    public static final Parcelable.Creator<d1> CREATOR = new o0(10);
    public final String a;
    public final String b;
    public final b1 c;
    public final String d;
    public final String e;
    public final Float f;
    public final f1 h;

    public d1(String str, String str2, b1 b1Var, String str3, String str4, Float f7, f1 f1Var) {
        this.a = str;
        this.b = str2;
        this.c = b1Var;
        this.d = str3;
        this.e = str4;
        this.f = f7;
        this.h = f1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d1.class == obj.getClass()) {
            d1 d1Var = (d1) obj;
            if (o5.a(this.a, d1Var.a) && o5.a(this.b, d1Var.b) && o5.a(this.c, d1Var.c) && o5.a(this.d, d1Var.d) && o5.a(this.e, d1Var.e) && o5.a(this.f, d1Var.f) && o5.a(this.h, d1Var.h)) {
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
        StringBuilder w10 = a1.g.w("AppParcelable{title='", this.b, "', developerName='", this.d, "', formattedPrice='");
        w10.append(this.e);
        w10.append("', starRating=");
        w10.append(this.f);
        w10.append(", wearDetails=");
        c3.h0.r(w10, valueOf, ", deepLinkUri='", this.a, "', icon=");
        return a1.g.s(w10, valueOf2, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.l(parcel, 1, this.a);
        df.l(parcel, 2, this.b);
        df.k(parcel, 3, this.c, i10);
        df.l(parcel, 4, this.d);
        df.l(parcel, 5, this.e);
        df.e(parcel, 6, this.f);
        df.k(parcel, 7, this.h, i10);
        df.r(parcel, q5);
    }
}
