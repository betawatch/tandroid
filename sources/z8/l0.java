package z8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import org.telegram.messenger.BuildConfig;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class l0 extends p6.a implements y8.g {
    public static final Parcelable.Creator<l0> CREATOR = new d(27);
    public final int a;
    public final String b;
    public final byte[] c;
    public final String d;

    public l0(int i10, String str, String str2, byte[] bArr) {
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
        return a1.g.s(sb2, obj, "]");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 2, 4);
        parcel.writeInt(this.a);
        df.l(parcel, 3, this.b);
        df.c(parcel, 4, this.c);
        df.l(parcel, 5, this.d);
        df.r(parcel, q5);
    }
}
