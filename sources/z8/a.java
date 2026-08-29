package z8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.cast.o;
import w5.k;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class a extends a6.a {
    public static final Parcelable.Creator<a> CREATOR = new k(25);
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
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = o.q(parcel, 20293);
        int i11 = this.a;
        o.s(parcel, 1, 4);
        parcel.writeInt(i11);
        o.s(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        o.l(parcel, 3, this.c);
        o.l(parcel, 4, this.d);
        o.c(parcel, 5, this.e);
        o.s(parcel, 6, 4);
        parcel.writeInt(this.f ? 1 : 0);
        o.r(parcel, q6);
    }

    public a(int i10, boolean z10, String str, String str2, byte[] bArr, boolean z11) {
        this.a = i10;
        this.b = z10;
        this.c = str;
        this.d = str2;
        this.e = bArr;
        this.f = z11;
    }
}
