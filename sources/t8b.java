// default package

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class t8b implements Comparable, Parcelable {
    public static final Parcelable.Creator<t8b> CREATOR = new hv6((byte) 20);
    public static final String d;
    public static final String e;
    public static final String f;
    public final int a;
    public final int b;
    public final int c;

    static {
        String str = g8c.a;
        d = "0";
        e = "1";
        f = "2";
    }

    public t8b(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        this.c = parcel.readInt();
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        t8b t8bVar = (t8b) obj;
        int i = this.a - t8bVar.a;
        return (i == 0 && (i = this.b - t8bVar.b) == 0) ? this.c - t8bVar.c : i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && t8b.class == obj.getClass()) {
            t8b t8bVar = (t8b) obj;
            if (this.a == t8bVar.a && this.b == t8bVar.b && this.c == t8bVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.c;
    }

    public final String toString() {
        return this.a + "." + this.b + "." + this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
    }

    public t8b(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }
}
