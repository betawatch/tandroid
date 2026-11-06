package u7;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import c8.oc;
import c8.wb;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class j extends r6.a {
    public static final Parcelable.Creator<j> CREATOR = new m(1);
    public final int a;
    public final int b;
    public final String c;
    public final String d;
    public final int e;
    public final String f;
    public final j h;
    public final r n;

    static {
        Process.myUid();
        Process.myPid();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j(int i7, int i10, String str, String str2, String str3, int i11, List list, j jVar) {
        s sVar;
        s sVar2;
        r rVar;
        this.a = i7;
        this.b = i10;
        this.c = str;
        this.d = str2;
        this.f = str3;
        this.e = i11;
        p pVar = r.b;
        if (list instanceof o) {
            rVar = (r) ((o) list);
            if (rVar.k()) {
                Object[] array = rVar.toArray(o.a);
                int length = array.length;
                if (length == 0) {
                    sVar2 = s.e;
                    rVar = sVar2;
                } else {
                    sVar = new s(length, array);
                    rVar = sVar;
                }
            }
        } else {
            Object[] array2 = list.toArray();
            int length2 = array2.length;
            for (int i12 = 0; i12 < length2; i12++) {
                if (array2[i12] == null) {
                    throw new NullPointerException(jg.g.j(i12, "at index "));
                }
            }
            if (length2 == 0) {
                sVar2 = s.e;
                rVar = sVar2;
            } else {
                sVar = new s(length2, array2);
                rVar = sVar;
            }
        }
        this.n = rVar;
        this.h = jVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.a == jVar.a && this.b == jVar.b && this.e == jVar.e && this.c.equals(jVar.c) && oc.a(this.d, jVar.d) && oc.a(this.f, jVar.f) && oc.a(this.h, jVar.h) && this.n.equals(jVar.n);
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
        int r10 = wb.r(parcel, 20293);
        wb.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        wb.q(parcel, 2, 4);
        parcel.writeInt(this.b);
        wb.l(parcel, 3, this.c);
        wb.l(parcel, 4, this.d);
        wb.q(parcel, 5, 4);
        parcel.writeInt(this.e);
        wb.l(parcel, 6, this.f);
        wb.k(parcel, 7, this.h, i7);
        wb.p(parcel, 8, this.n);
        wb.s(parcel, r10);
    }
}
