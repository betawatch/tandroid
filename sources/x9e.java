// default package

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class x9e extends c4 {
    public static final Parcelable.Creator<x9e> CREATOR = new g3e((byte) 5);
    public final int a;
    public final String b;
    public final byte[] c;
    public final String d;

    public x9e(int i, String str, String str2, byte[] bArr) {
        this.a = i;
        this.b = str;
        this.c = bArr;
        this.d = str2;
    }

    public final String toString() {
        byte[] bArr = this.c;
        String obj = (bArr == null ? "null" : Integer.valueOf(bArr.length)).toString();
        StringBuilder sb = new StringBuilder("MessageEventParcelable[");
        sb.append(this.a);
        sb.append(",");
        sb.append(this.b);
        sb.append(", size=");
        return c00.k(sb, obj, "]");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.q(parcel, 2, 4);
        parcel.writeInt(this.a);
        bye.l(parcel, 3, this.b);
        bye.c(parcel, 4, this.c);
        bye.l(parcel, 5, this.d);
        bye.s(parcel, r);
    }
}
