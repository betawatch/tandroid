package w8;

import a8.df;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class i extends p6.a {
    public static final Parcelable.Creator<i> CREATOR = new q7.m(26);
    public String a;
    public b b;
    public UserAddress c;
    public k d;
    public String e;
    public Bundle f;
    public String h;
    public Bundle n;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.l(parcel, 1, this.a);
        df.k(parcel, 2, this.b, i10);
        df.k(parcel, 3, this.c, i10);
        df.k(parcel, 4, this.d, i10);
        df.l(parcel, 5, this.e);
        df.b(parcel, 6, this.f);
        df.l(parcel, 7, this.h);
        df.b(parcel, 8, this.n);
        df.r(parcel, q5);
    }
}
