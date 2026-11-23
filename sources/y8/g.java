package y8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import com.google.android.gms.wallet.wobs.CommonWalletObject;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class g extends r6.a {
    public static final Parcelable.Creator<g> CREATOR = new v(5);
    public final int a;
    public final String b;
    public final CommonWalletObject c;

    public g(int i7, String str, String str2, CommonWalletObject commonWalletObject) {
        this.a = i7;
        this.b = str2;
        if (i7 >= 3) {
            this.c = commonWalletObject;
            return;
        }
        CommonWalletObject commonWalletObject2 = new CommonWalletObject();
        commonWalletObject2.a = str;
        this.c = commonWalletObject2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        cc.l(parcel, 3, this.b);
        cc.k(parcel, 4, this.c, i7);
        cc.s(parcel, r10);
    }
}
