package p7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import w7.e0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class g extends o6.a {
    public final String a;
    public final l b;
    public final int c;
    public final byte[] d;
    public static final int e = Integer.parseInt("-1");
    public static final Parcelable.Creator<g> CREATOR = new m8.h(28);

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
    public g(String str, l lVar, int i10, byte[] bArr) {
        String str2;
        String str3;
        String str4 = null;
        boolean z10 = true;
        int i11 = e;
        if (i10 != i11) {
            if (i10 >= 0) {
                String[] strArr = k.a;
                if (i10 < 10) {
                    str3 = strArr[i10];
                    if (str3 == null) {
                        z10 = false;
                    }
                }
            } else {
                String[] strArr2 = k.a;
            }
            str3 = null;
            if (str3 == null) {
            }
        }
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append("Invalid section type ");
        sb2.append(i10);
        n6.l.a(sb2.toString(), z10);
        this.a = str;
        this.b = lVar;
        this.c = i10;
        this.d = bArr;
        if (i10 != i11) {
            if (i10 >= 0) {
                String[] strArr3 = k.a;
                if (i10 < 10) {
                    str2 = strArr3[i10];
                    if (str2 == null) {
                        StringBuilder sb3 = new StringBuilder(32);
                        sb3.append("Invalid section type ");
                        sb3.append(i10);
                        str4 = sb3.toString();
                        if (str4 == null) {
                            throw new IllegalArgumentException(str4);
                        }
                        return;
                    }
                }
            } else {
                String[] strArr4 = k.a;
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
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.l(parcel, 1, this.a);
        e0.k(parcel, 3, this.b, i10);
        e0.s(parcel, 4, 4);
        parcel.writeInt(this.c);
        e0.c(parcel, 5, this.d);
        e0.r(parcel, q6);
    }
}
