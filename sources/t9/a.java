package t9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import q4.x;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class a extends r6.a {
    public static final Parcelable.Creator<a> CREATOR = new x(25);
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
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        int i10 = this.a;
        xb.q(parcel, 1, 4);
        parcel.writeInt(i10);
        xb.q(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        xb.l(parcel, 3, this.c);
        xb.l(parcel, 4, this.d);
        xb.c(parcel, 5, this.e);
        xb.q(parcel, 6, 4);
        parcel.writeInt(this.f ? 1 : 0);
        xb.s(parcel, r10);
    }

    public a(int i7, boolean z9, String str, String str2, byte[] bArr, boolean z10) {
        this.a = i7;
        this.b = z9;
        this.c = str;
        this.d = str2;
        this.e = bArr;
        this.f = z10;
    }
}
