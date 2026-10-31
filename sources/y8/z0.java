package y8;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class z0 extends o6.a {
    public static final Parcelable.Creator<z0> CREATOR = new l0(9);
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String h;
    public final byte n;
    public final byte r;
    public final byte s;
    public final byte w;
    public final String x;

    public z0(int i10, String str, String str2, String str3, String str4, String str5, String str6, byte b10, byte b11, byte b12, byte b13, String str7) {
        this.a = i10;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.h = str6;
        this.n = b10;
        this.r = b11;
        this.s = b12;
        this.w = b13;
        this.x = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || z0.class != obj.getClass()) {
            return false;
        }
        z0 z0Var = (z0) obj;
        String str = z0Var.x;
        String str2 = z0Var.h;
        String str3 = z0Var.c;
        if (this.a != z0Var.a || this.n != z0Var.n || this.r != z0Var.r || this.s != z0Var.s || this.w != z0Var.w || !this.b.equals(z0Var.b)) {
            return false;
        }
        String str4 = this.c;
        if (str4 == null ? str3 != null : !str4.equals(str3)) {
            return false;
        }
        if (!this.d.equals(z0Var.d) || !this.e.equals(z0Var.e) || !this.f.equals(z0Var.f)) {
            return false;
        }
        String str5 = this.h;
        if (str5 == null ? str2 != null : !str5.equals(str2)) {
            return false;
        }
        String str6 = this.x;
        return str6 != null ? str6.equals(str) : str == null;
    }

    public final int hashCode() {
        int f7 = a1.g.f((this.a + 31) * 31, 31, this.b);
        String str = this.c;
        int f10 = a1.g.f(a1.g.f(a1.g.f((f7 + (str != null ? str.hashCode() : 0)) * 31, 31, this.d), 31, this.e), 31, this.f);
        String str2 = this.h;
        int hashCode = (((((((((f10 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.n) * 31) + this.r) * 31) + this.s) * 31) + this.w) * 31;
        String str3 = this.x;
        return hashCode + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AncsNotificationParcelable{, id=");
        sb2.append(this.a);
        sb2.append(", appId='");
        sb2.append(this.b);
        sb2.append("', dateTime='");
        sb2.append(this.c);
        sb2.append("', eventId=");
        sb2.append((int) this.n);
        sb2.append(", eventFlags=");
        i0.a.t(sb2, this.r, ", categoryId=", this.s, ", categoryCount=");
        sb2.append((int) this.w);
        sb2.append(", packageName='");
        sb2.append(this.x);
        sb2.append("'}");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.h0.q(parcel, 20293);
        w7.h0.s(parcel, 2, 4);
        parcel.writeInt(this.a);
        String str = this.b;
        w7.h0.l(parcel, 3, str);
        w7.h0.l(parcel, 4, this.c);
        w7.h0.l(parcel, 5, this.d);
        w7.h0.l(parcel, 6, this.e);
        w7.h0.l(parcel, 7, this.f);
        String str2 = this.h;
        if (str2 != null) {
            str = str2;
        }
        w7.h0.l(parcel, 8, str);
        w7.h0.s(parcel, 9, 4);
        parcel.writeInt(this.n);
        w7.h0.s(parcel, 10, 4);
        parcel.writeInt(this.r);
        w7.h0.s(parcel, 11, 4);
        parcel.writeInt(this.s);
        w7.h0.s(parcel, 12, 4);
        parcel.writeInt(this.w);
        w7.h0.l(parcel, 13, this.x);
        w7.h0.r(parcel, q6);
    }
}
