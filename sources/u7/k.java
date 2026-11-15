package u7;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import c8.pc;
import c8.yb;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class k extends r6.a {
    public static final Parcelable.Creator<k> CREATOR = new n(1);
    public final int a;
    public final int b;
    public final String c;
    public final String d;
    public final int e;
    public final String f;
    public final k h;
    public final s n;

    static {
        Process.myUid();
        Process.myPid();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k(int i7, int i10, String str, String str2, String str3, int i11, List list, k kVar) {
        t tVar;
        t tVar2;
        s sVar;
        this.a = i7;
        this.b = i10;
        this.c = str;
        this.d = str2;
        this.f = str3;
        this.e = i11;
        q qVar = s.b;
        if (list instanceof p) {
            sVar = (s) ((p) list);
            if (sVar.k()) {
                Object[] array = sVar.toArray(p.a);
                int length = array.length;
                if (length == 0) {
                    tVar2 = t.e;
                    sVar = tVar2;
                } else {
                    tVar = new t(length, array);
                    sVar = tVar;
                }
            }
        } else {
            Object[] array2 = list.toArray();
            int length2 = array2.length;
            for (int i12 = 0; i12 < length2; i12++) {
                if (array2[i12] == null) {
                    throw new NullPointerException(i5.c.i(i12, "at index "));
                }
            }
            if (length2 == 0) {
                tVar2 = t.e;
                sVar = tVar2;
            } else {
                tVar = new t(length2, array2);
                sVar = tVar;
            }
        }
        this.n = sVar;
        this.h = kVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.a == kVar.a && this.b == kVar.b && this.e == kVar.e && this.c.equals(kVar.c) && pc.a(this.d, kVar.d) && pc.a(this.f, kVar.f) && pc.a(this.h, kVar.h) && this.n.equals(kVar.n);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.c, this.d, this.f});
    }

    public final String toString() {
        String str = this.c;
        int length = str.length() + 18;
        String str2 = this.d;
        if (str2 != null) {
            length += str2.length();
        }
        StringBuilder sb2 = new StringBuilder(length);
        sb2.append(this.a);
        sb2.append("/");
        sb2.append(str);
        if (str2 != null) {
            sb2.append("[");
            if (str2.startsWith(str)) {
                sb2.append((CharSequence) str2, str.length(), str2.length());
            } else {
                sb2.append(str2);
            }
            sb2.append("]");
        }
        String str3 = this.f;
        if (str3 != null) {
            sb2.append("/");
            sb2.append(Integer.toHexString(str3.hashCode()));
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        yb.q(parcel, 2, 4);
        parcel.writeInt(this.b);
        yb.l(parcel, 3, this.c);
        yb.l(parcel, 4, this.d);
        yb.q(parcel, 5, 4);
        parcel.writeInt(this.e);
        yb.l(parcel, 6, this.f);
        yb.k(parcel, 7, this.h, i7);
        yb.p(parcel, 8, this.n);
        yb.s(parcel, r10);
    }
}
