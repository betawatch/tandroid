package r5;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import j$.util.DesugarCollections;
import j7.f5;
import java.util.ArrayList;
import java.util.List;
import k7.l7;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class b extends c6.a {
    public static final Parcelable.Creator<b> CREATOR;
    public static final a0 D = new a0(false);
    public static final b0 E = new b0(0);
    public static final s5.a F;
    public final a0 B;
    public b0 C;
    public final String a;
    public final ArrayList b;
    public final boolean c;
    public final q5.i d;
    public final boolean e;
    public final s5.a f;
    public final boolean h;
    public final double n;
    public final boolean r;
    public final boolean s;
    public final boolean v;
    public final List w;
    public final boolean x;
    public final boolean y;

    static {
        new s5.f(s5.f.V, s5.f.W, 10000L, null, l7.a("smallIconDrawableResId"), l7.a("stopLiveStreamDrawableResId"), l7.a("pauseDrawableResId"), l7.a("playDrawableResId"), l7.a("skipNextDrawableResId"), l7.a("skipPrevDrawableResId"), l7.a("forwardDrawableResId"), l7.a("forward10DrawableResId"), l7.a("forward30DrawableResId"), l7.a("rewindDrawableResId"), l7.a("rewind10DrawableResId"), l7.a("rewind30DrawableResId"), l7.a("disconnectDrawableResId"), l7.a("notificationImageSizeDimenResId"), l7.a("castingToDeviceStringResId"), l7.a("stopLiveStreamStringResId"), l7.a("pauseStringResId"), l7.a("playStringResId"), l7.a("skipNextStringResId"), l7.a("skipPrevStringResId"), l7.a("forwardStringResId"), l7.a("forward10StringResId"), l7.a("forward30StringResId"), l7.a("rewindStringResId"), l7.a("rewind10StringResId"), l7.a("rewind30StringResId"), l7.a("disconnectStringResId"), null, false, false);
        F = new s5.a("com.google.android.gms.cast.framework.media.MediaIntentReceiver", null, null, null, false, false);
        CREATOR = new c0(0);
    }

    public b(String str, ArrayList arrayList, boolean z4, q5.i iVar, boolean z10, s5.a aVar, boolean z11, double d, boolean z12, boolean z13, boolean z14, ArrayList arrayList2, boolean z15, boolean z16, a0 a0Var, b0 b0Var) {
        this.a = true == TextUtils.isEmpty(str) ? "" : str;
        int size = arrayList == null ? 0 : arrayList.size();
        ArrayList arrayList3 = new ArrayList(size);
        this.b = arrayList3;
        if (size > 0) {
            arrayList3.addAll(arrayList);
        }
        this.c = z4;
        this.d = iVar == null ? new q5.i() : iVar;
        this.e = z10;
        this.f = aVar;
        this.h = z11;
        this.n = d;
        this.r = z12;
        this.s = z13;
        this.v = z14;
        this.w = arrayList2;
        this.x = z15;
        this.y = z16;
        this.B = a0Var;
        this.C = b0Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.l(parcel, 2, this.a);
        f5.n(parcel, 3, DesugarCollections.unmodifiableList(this.b));
        f5.s(parcel, 4, 4);
        parcel.writeInt(this.c ? 1 : 0);
        f5.k(parcel, 5, this.d, i10);
        f5.s(parcel, 6, 4);
        parcel.writeInt(this.e ? 1 : 0);
        f5.k(parcel, 7, this.f, i10);
        f5.s(parcel, 8, 4);
        parcel.writeInt(this.h ? 1 : 0);
        f5.s(parcel, 9, 8);
        parcel.writeDouble(this.n);
        f5.s(parcel, 10, 4);
        parcel.writeInt(this.r ? 1 : 0);
        f5.s(parcel, 11, 4);
        parcel.writeInt(this.s ? 1 : 0);
        f5.s(parcel, 12, 4);
        parcel.writeInt(this.v ? 1 : 0);
        f5.n(parcel, 13, DesugarCollections.unmodifiableList(this.w));
        f5.s(parcel, 14, 4);
        parcel.writeInt(this.x ? 1 : 0);
        f5.s(parcel, 15, 4);
        parcel.writeInt(0);
        f5.s(parcel, 16, 4);
        parcel.writeInt(this.y ? 1 : 0);
        f5.k(parcel, 17, this.B, i10);
        f5.k(parcel, 18, this.C, i10);
        f5.r(parcel, q10);
    }
}
