package y8;

import android.os.Parcel;
import android.os.Parcelable;
import org.telegram.messenger.BuildConfig;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class k0 extends o6.a implements x8.g {
    public static final Parcelable.Creator<k0> CREATOR = new c(27);
    public final int a;
    public final String b;
    public final byte[] c;
    public final String d;

    public k0(int i10, String str, String str2, byte[] bArr) {
        this.a = i10;
        this.b = str;
        this.c = bArr;
        this.d = str2;
    }

    public final String toString() {
        byte[] bArr = this.c;
        String obj = (bArr == null ? BuildConfig.BETA_URL : Integer.valueOf(bArr.length)).toString();
        StringBuilder sb2 = new StringBuilder("MessageEventParcelable[");
        sb2.append(this.a);
        sb2.append(",");
        sb2.append(this.b);
        sb2.append(", size=");
        return a4.a.s(sb2, obj, "]");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.s(parcel, 2, 4);
        parcel.writeInt(this.a);
        w7.e0.l(parcel, 3, this.b);
        w7.e0.c(parcel, 4, this.c);
        w7.e0.l(parcel, 5, this.d);
        w7.e0.r(parcel, q6);
    }
}
