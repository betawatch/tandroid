package p8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class a extends r6.a {
    public static final Parcelable.Creator<a> CREATOR = new m6.e(19);
    public final String a;
    public final byte[] b;
    public final int c;

    public a(int i7, String str, byte[] bArr) {
        this.a = str;
        this.b = bArr;
        this.c = i7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.l(parcel, 2, this.a);
        bc.c(parcel, 3, this.b);
        bc.q(parcel, 4, 4);
        parcel.writeInt(this.c);
        bc.s(parcel, r10);
    }
}
