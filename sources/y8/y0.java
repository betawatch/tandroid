package y8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class y0 extends o6.a {
    public static final Parcelable.Creator<y0> CREATOR = new c(26);
    public final String a;
    public final int b;
    public final int c;

    public y0(String str, int i10, int i11) {
        this.a = str;
        this.b = i10;
        this.c = i11;
    }

    public final boolean equals(Object obj) {
        Object obj2;
        String str;
        if (this == obj) {
            return true;
        }
        if (obj != null && y0.class == obj.getClass()) {
            y0 y0Var = (y0) obj;
            if (this.b == y0Var.b && this.c == y0Var.c && ((str = this.a) == (obj2 = y0Var.a) || (str != null && str.equals(obj2)))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), Integer.valueOf(this.c)});
    }

    public final String toString() {
        Locale locale = Locale.US;
        return a1.g.r(i0.a.m("WebIconParcelable{", this.b, "x", this.c, " - "), this.a, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.h0.q(parcel, 20293);
        w7.h0.l(parcel, 1, this.a);
        w7.h0.s(parcel, 2, 4);
        parcel.writeInt(this.b);
        w7.h0.s(parcel, 3, 4);
        parcel.writeInt(this.c);
        w7.h0.r(parcel, q6);
    }
}
