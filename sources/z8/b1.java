package z8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class b1 extends p6.a {
    public static final Parcelable.Creator<b1> CREATOR = new d(26);
    public final String a;
    public final int b;
    public final int c;

    public b1(String str, int i10, int i11) {
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
        if (obj != null && b1.class == obj.getClass()) {
            b1 b1Var = (b1) obj;
            if (this.b == b1Var.b && this.c == b1Var.c && ((str = this.a) == (obj2 = b1Var.a) || (str != null && str.equals(obj2)))) {
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
        return a1.g.s(c3.h0.n("WebIconParcelable{", this.b, "x", this.c, " - "), this.a, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.l(parcel, 1, this.a);
        df.s(parcel, 2, 4);
        parcel.writeInt(this.b);
        df.s(parcel, 3, 4);
        parcel.writeInt(this.c);
        df.r(parcel, q5);
    }
}
