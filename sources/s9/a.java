package s9;

import android.os.Parcel;
import android.os.Parcelable;
import q8.i;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class a extends q6.a {
    public static final Parcelable.Creator<a> CREATOR = new i(10);
    public int a;
    public final boolean b;
    public final String c;
    public final String d;
    public final byte[] e;
    public final boolean f;

    public a() {
        this.a = 0;
        this.b = true;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = false;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MetadataImpl { { eventStatus: '");
        sb2.append(this.a);
        sb2.append("' } { uploadable: '");
        sb2.append(this.b);
        sb2.append("' } ");
        String str = this.c;
        if (str != null) {
            sb2.append("{ completionToken: '");
            sb2.append(str);
            sb2.append("' } ");
        }
        String str2 = this.d;
        if (str2 != null) {
            sb2.append("{ accountName: '");
            sb2.append(str2);
            sb2.append("' } ");
        }
        byte[] bArr = this.e;
        if (bArr != null) {
            sb2.append("{ ssbContext: [ ");
            for (byte b10 : bArr) {
                sb2.append("0x");
                sb2.append(Integer.toHexString(b10));
                sb2.append(" ");
            }
            sb2.append("] } ");
        }
        sb2.append("{ contextOnly: '");
        sb2.append(this.f);
        sb2.append("' } }");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        int i10 = this.a;
        j8.a.r(parcel, 1, 4);
        parcel.writeInt(i10);
        j8.a.r(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        j8.a.m(parcel, 3, this.c);
        j8.a.m(parcel, 4, this.d);
        j8.a.d(parcel, 5, this.e);
        j8.a.r(parcel, 6, 4);
        parcel.writeInt(this.f ? 1 : 0);
        j8.a.t(parcel, s6);
    }

    public a(int i3, boolean z10, String str, String str2, byte[] bArr, boolean z11) {
        this.a = i3;
        this.b = z10;
        this.c = str;
        this.d = str2;
        this.e = bArr;
        this.f = z11;
    }
}
