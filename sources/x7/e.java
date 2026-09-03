package x7;

import android.os.Parcel;
import android.os.Parcelable;
import b6.m;
import j7.g5;
import u6.p;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class e extends c6.a {
    public static final Parcelable.Creator<e> CREATOR = new p(17);
    public final String a;

    public e(String str) {
        m.i(str, "json must not be null");
        this.a = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.l(parcel, 2, this.a);
        g5.r(parcel, q10);
    }
}
