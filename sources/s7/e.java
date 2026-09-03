package s7;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import r5.c0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class e extends c6.a {
    public static final Parcelable.Creator<e> CREATOR = new c0(6);
    public final byte[] a;

    public e(byte[] bArr) {
        this.a = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.c(parcel, 2, this.a);
        g5.r(parcel, q10);
    }
}
