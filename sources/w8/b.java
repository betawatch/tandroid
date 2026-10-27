package w8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class b extends p6.a {
    public static final Parcelable.Creator<b> CREATOR = new s(5);
    public String a;
    public String b;
    public String c;
    public int d;
    public UserAddress e;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.l(parcel, 1, this.a);
        df.l(parcel, 2, this.b);
        df.l(parcel, 3, this.c);
        int i11 = this.d;
        df.s(parcel, 4, 4);
        parcel.writeInt(i11);
        df.k(parcel, 5, this.e, i10);
        df.r(parcel, q5);
    }
}
