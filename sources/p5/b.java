package p5;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import i7.x6;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import o6.w0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class b extends a6.a {
    public static final Parcelable.Creator<b> CREATOR;
    public static final q5.a E;
    public final a0 A;
    public b0 B;
    public final String a;
    public final ArrayList b;
    public final boolean c;
    public final o5.i d;
    public final boolean e;
    public final q5.a f;
    public final boolean h;
    public final double n;
    public final boolean r;
    public final boolean s;
    public final boolean v;
    public final List w;
    public final boolean x;
    public final boolean y;
    public static final a0 C = new a0(false);
    public static final b0 D = new b0(0);

    static {
        new q5.f(q5.f.U, q5.f.V, 10000L, null, x6.a("smallIconDrawableResId"), x6.a("stopLiveStreamDrawableResId"), x6.a("pauseDrawableResId"), x6.a("playDrawableResId"), x6.a("skipNextDrawableResId"), x6.a("skipPrevDrawableResId"), x6.a("forwardDrawableResId"), x6.a("forward10DrawableResId"), x6.a("forward30DrawableResId"), x6.a("rewindDrawableResId"), x6.a("rewind10DrawableResId"), x6.a("rewind30DrawableResId"), x6.a("disconnectDrawableResId"), x6.a("notificationImageSizeDimenResId"), x6.a("castingToDeviceStringResId"), x6.a("stopLiveStreamStringResId"), x6.a("pauseStringResId"), x6.a("playStringResId"), x6.a("skipNextStringResId"), x6.a("skipPrevStringResId"), x6.a("forwardStringResId"), x6.a("forward10StringResId"), x6.a("forward30StringResId"), x6.a("rewindStringResId"), x6.a("rewind10StringResId"), x6.a("rewind30StringResId"), x6.a("disconnectStringResId"), null, false, false);
        E = new q5.a("com.google.android.gms.cast.framework.media.MediaIntentReceiver", null, null, null, false, false);
        CREATOR = new w0(9);
    }

    public b(String str, ArrayList arrayList, boolean z10, o5.i iVar, boolean z11, q5.a aVar, boolean z12, double d, boolean z13, boolean z14, boolean z15, ArrayList arrayList2, boolean z16, boolean z17, a0 a0Var, b0 b0Var) {
        this.a = true == TextUtils.isEmpty(str) ? "" : str;
        int size = arrayList == null ? 0 : arrayList.size();
        ArrayList arrayList3 = new ArrayList(size);
        this.b = arrayList3;
        if (size > 0) {
            arrayList3.addAll(arrayList);
        }
        this.c = z10;
        this.d = iVar == null ? new o5.i() : iVar;
        this.e = z11;
        this.f = aVar;
        this.h = z12;
        this.n = d;
        this.r = z13;
        this.s = z14;
        this.v = z15;
        this.w = arrayList2;
        this.x = z16;
        this.y = z17;
        this.A = a0Var;
        this.B = b0Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.l(parcel, 2, this.a);
        com.google.android.gms.internal.cast.o.n(parcel, 3, DesugarCollections.unmodifiableList(this.b));
        com.google.android.gms.internal.cast.o.s(parcel, 4, 4);
        parcel.writeInt(this.c ? 1 : 0);
        com.google.android.gms.internal.cast.o.k(parcel, 5, this.d, i10);
        com.google.android.gms.internal.cast.o.s(parcel, 6, 4);
        parcel.writeInt(this.e ? 1 : 0);
        com.google.android.gms.internal.cast.o.k(parcel, 7, this.f, i10);
        com.google.android.gms.internal.cast.o.s(parcel, 8, 4);
        parcel.writeInt(this.h ? 1 : 0);
        com.google.android.gms.internal.cast.o.s(parcel, 9, 8);
        parcel.writeDouble(this.n);
        com.google.android.gms.internal.cast.o.s(parcel, 10, 4);
        parcel.writeInt(this.r ? 1 : 0);
        com.google.android.gms.internal.cast.o.s(parcel, 11, 4);
        parcel.writeInt(this.s ? 1 : 0);
        com.google.android.gms.internal.cast.o.s(parcel, 12, 4);
        parcel.writeInt(this.v ? 1 : 0);
        com.google.android.gms.internal.cast.o.n(parcel, 13, DesugarCollections.unmodifiableList(this.w));
        com.google.android.gms.internal.cast.o.s(parcel, 14, 4);
        parcel.writeInt(this.x ? 1 : 0);
        com.google.android.gms.internal.cast.o.s(parcel, 15, 4);
        parcel.writeInt(0);
        com.google.android.gms.internal.cast.o.s(parcel, 16, 4);
        parcel.writeInt(this.y ? 1 : 0);
        com.google.android.gms.internal.cast.o.k(parcel, 17, this.A, i10);
        com.google.android.gms.internal.cast.o.k(parcel, 18, this.B, i10);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
