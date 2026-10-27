package z8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class g extends p6.a implements y8.b, y8.d {
    public static final Parcelable.Creator<g> CREATOR = new d(2);
    public final String a;
    public final String b;
    public final String c;

    public g(String str, String str2, String str3) {
        o6.l.h(str);
        this.a = str;
        o6.l.h(str2);
        this.b = str2;
        o6.l.h(str3);
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.a.equals(gVar.a) && o6.l.l(gVar.b, this.b) && o6.l.l(gVar.c, this.c);
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
        return a1.g.s(a1.g.w("Channel{token=", trim, ", nodeId=", this.b, ", path="), this.c, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.l(parcel, 2, this.a);
        df.l(parcel, 3, this.b);
        df.l(parcel, 4, this.c);
        df.r(parcel, q5);
    }
}
