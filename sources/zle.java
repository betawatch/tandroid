// default package

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class zle extends b4 {
    public static final Parcelable.Creator<zle> CREATOR = new qyd((byte) 4);
    public final String a;
    public final int b;
    public final int c;

    public zle(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        Object obj2;
        String str;
        if (this == obj) {
            return true;
        }
        if (obj != null && zle.class == obj.getClass()) {
            zle zleVar = (zle) obj;
            if (this.b == zleVar.b && this.c == zleVar.c && ((str = this.a) == (obj2 = zleVar.a) || (str != null && str.equals(obj2)))) {
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
        return b00.j(ir2.p("WebIconParcelable{", this.b, "x", this.c, " - "), this.a, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.l(parcel, 1, this.a);
        jte.q(parcel, 2, 4);
        parcel.writeInt(this.b);
        jte.q(parcel, 3, 4);
        parcel.writeInt(this.c);
        jte.s(parcel, r);
    }
}
