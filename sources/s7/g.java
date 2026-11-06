package s7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import java.util.ArrayList;
import q4.x;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class g extends r6.a {
    public final String a;
    public final k b;
    public final int c;
    public final byte[] d;
    public static final int e = Integer.parseInt("-1");
    public static final Parcelable.Creator<g> CREATOR = new x(18);

    static {
        ArrayList arrayList = new ArrayList();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g(String str, k kVar, int i7, byte[] bArr) {
        String str2;
        String str3;
        String str4 = null;
        boolean z9 = true;
        int i10 = e;
        if (i7 != i10) {
            if (i7 >= 0) {
                String[] strArr = j.a;
                if (i7 < 10) {
                    str3 = strArr[i7];
                    if (str3 == null) {
                        z9 = false;
                    }
                }
            } else {
                String[] strArr2 = j.a;
            }
            str3 = null;
            if (str3 == null) {
            }
        }
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append("Invalid section type ");
        sb2.append(i7);
        q6.m.a(sb2.toString(), z9);
        this.a = str;
        this.b = kVar;
        this.c = i7;
        this.d = bArr;
        if (i7 != i10) {
            if (i7 >= 0) {
                String[] strArr3 = j.a;
                if (i7 < 10) {
                    str2 = strArr3[i7];
                    if (str2 == null) {
                        StringBuilder sb3 = new StringBuilder(32);
                        sb3.append("Invalid section type ");
                        sb3.append(i7);
                        str4 = sb3.toString();
                        if (str4 == null) {
                            throw new IllegalArgumentException(str4);
                        }
                        return;
                    }
                }
            } else {
                String[] strArr4 = j.a;
            }
            str2 = null;
            if (str2 == null) {
            }
        }
        if (str != null && bArr != null) {
            str4 = "Both content and blobContent set";
        }
        if (str4 == null) {
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.l(parcel, 1, this.a);
        wb.k(parcel, 3, this.b, i7);
        wb.q(parcel, 4, 4);
        parcel.writeInt(this.c);
        wb.c(parcel, 5, this.d);
        wb.s(parcel, r10);
    }
}
