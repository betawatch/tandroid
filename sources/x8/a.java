package x8;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import w7.i;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class a extends y5.a {
    public static final Parcelable.Creator<a> CREATOR = new i(13);
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
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        int i10 = this.a;
        p8.s(parcel, 1, 4);
        parcel.writeInt(i10);
        p8.s(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        p8.l(parcel, 3, this.c);
        p8.l(parcel, 4, this.d);
        p8.c(parcel, 5, this.e);
        p8.s(parcel, 6, 4);
        parcel.writeInt(this.f ? 1 : 0);
        p8.r(parcel, q10);
    }

    public a(int i9, boolean z10, String str, String str2, byte[] bArr, boolean z11) {
        this.a = i9;
        this.b = z10;
        this.c = str;
        this.d = str2;
        this.e = bArr;
        this.f = z11;
    }
}
