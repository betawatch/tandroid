// default package

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class pgd extends b4 implements Parcelable {
    public static final Parcelable.Creator<pgd> CREATOR = new lbd(25);
    public final String a;
    public final String b;
    public final String c;

    public pgd(String str, String str2, String str3) {
        ite.h(str);
        this.a = str;
        ite.h(str2);
        this.b = str2;
        ite.h(str3);
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof pgd)) {
            return false;
        }
        pgd pgdVar = (pgd) obj;
        return this.a.equals(pgdVar.a) && fse.a(pgdVar.b, this.b) && fse.a(pgdVar.c, this.c);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String str = this.a;
        int i = 0;
        for (char c : str.toCharArray()) {
            i += c;
        }
        String trim = str.trim();
        int length = trim.length();
        if (length > 25) {
            trim = trim.substring(0, 10) + "..." + trim.substring(length - 10, length) + "::" + i;
        }
        return b10.j(mlb.m("Channel{token=", trim, ", nodeId=", this.b, ", path="), this.c, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.l(parcel, 2, this.a);
        mve.l(parcel, 3, this.b);
        mve.l(parcel, 4, this.c);
        mve.s(parcel, r);
    }
}
