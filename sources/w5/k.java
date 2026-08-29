package w5;

import android.accounts.Account;
import android.database.CursorWindow;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.BinderWrapper;
import java.util.ArrayList;
import z5.f0;
import z5.u;
import z5.v;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class k implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ k(int i10) {
        this.a = i10;
    }

    public static void a(z5.f fVar, Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        int i11 = fVar.a;
        com.google.android.gms.internal.cast.o.s(parcel, 1, 4);
        parcel.writeInt(i11);
        int i12 = fVar.b;
        com.google.android.gms.internal.cast.o.s(parcel, 2, 4);
        parcel.writeInt(i12);
        int i13 = fVar.c;
        com.google.android.gms.internal.cast.o.s(parcel, 3, 4);
        parcel.writeInt(i13);
        com.google.android.gms.internal.cast.o.l(parcel, 4, fVar.d);
        com.google.android.gms.internal.cast.o.f(parcel, 5, fVar.e);
        com.google.android.gms.internal.cast.o.o(parcel, 6, fVar.f, i10);
        com.google.android.gms.internal.cast.o.b(parcel, 7, fVar.h);
        com.google.android.gms.internal.cast.o.k(parcel, 8, fVar.n, i10);
        com.google.android.gms.internal.cast.o.o(parcel, 10, fVar.r, i10);
        com.google.android.gms.internal.cast.o.o(parcel, 11, fVar.s, i10);
        boolean z10 = fVar.v;
        com.google.android.gms.internal.cast.o.s(parcel, 12, 4);
        parcel.writeInt(z10 ? 1 : 0);
        int i14 = fVar.w;
        com.google.android.gms.internal.cast.o.s(parcel, 13, 4);
        parcel.writeInt(i14);
        boolean z11 = fVar.x;
        com.google.android.gms.internal.cast.o.s(parcel, 14, 4);
        parcel.writeInt(z11 ? 1 : 0);
        com.google.android.gms.internal.cast.o.l(parcel, 15, fVar.y);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                int A = ce.b.A(parcel);
                long j10 = -1;
                int i10 = 0;
                String str = null;
                while (parcel.dataPosition() < A) {
                    int readInt = parcel.readInt();
                    char c3 = (char) readInt;
                    if (c3 == 1) {
                        str = ce.b.i(parcel, readInt);
                    } else if (c3 == 2) {
                        i10 = ce.b.v(parcel, readInt);
                    } else if (c3 != 3) {
                        ce.b.z(parcel, readInt);
                    } else {
                        j10 = ce.b.x(parcel, readInt);
                    }
                }
                ce.b.n(parcel, A);
                return new c(i10, str, j10);
            case 1:
                int A2 = ce.b.A(parcel);
                String str2 = null;
                byte[] bArr = null;
                byte[][] bArr2 = null;
                byte[][] bArr3 = null;
                byte[][] bArr4 = null;
                byte[][] bArr5 = null;
                int[] iArr = null;
                byte[][] bArr6 = null;
                while (parcel.dataPosition() < A2) {
                    int readInt2 = parcel.readInt();
                    switch ((char) readInt2) {
                        case 2:
                            str2 = ce.b.i(parcel, readInt2);
                            break;
                        case 3:
                            bArr = ce.b.c(parcel, readInt2);
                            break;
                        case 4:
                            bArr2 = ce.b.d(parcel, readInt2);
                            break;
                        case 5:
                            bArr3 = ce.b.d(parcel, readInt2);
                            break;
                        case 6:
                            bArr4 = ce.b.d(parcel, readInt2);
                            break;
                        case 7:
                            bArr5 = ce.b.d(parcel, readInt2);
                            break;
                        case '\b':
                            iArr = ce.b.e(parcel, readInt2);
                            break;
                        case '\t':
                            bArr6 = ce.b.d(parcel, readInt2);
                            break;
                        default:
                            ce.b.z(parcel, readInt2);
                            break;
                    }
                }
                ce.b.n(parcel, A2);
                return new w7.a(str2, bArr, bArr2, bArr3, bArr4, bArr5, iArr, bArr6);
            case 2:
                int A3 = ce.b.A(parcel);
                String[] strArr = null;
                CursorWindow[] cursorWindowArr = null;
                Bundle bundle = null;
                int i11 = 0;
                int i12 = 0;
                while (parcel.dataPosition() < A3) {
                    int readInt3 = parcel.readInt();
                    char c6 = (char) readInt3;
                    if (c6 == 1) {
                        strArr = ce.b.j(parcel, readInt3);
                    } else if (c6 == 2) {
                        cursorWindowArr = (CursorWindow[]) ce.b.l(parcel, readInt3, CursorWindow.CREATOR);
                    } else if (c6 == 3) {
                        i12 = ce.b.v(parcel, readInt3);
                    } else if (c6 == 4) {
                        bundle = ce.b.b(parcel, readInt3);
                    } else if (c6 != 1000) {
                        ce.b.z(parcel, readInt3);
                    } else {
                        i11 = ce.b.v(parcel, readInt3);
                    }
                }
                ce.b.n(parcel, A3);
                DataHolder dataHolder = new DataHolder(i11, strArr, cursorWindowArr, i12, bundle);
                dataHolder.c = new Bundle();
                int i13 = 0;
                while (true) {
                    String[] strArr2 = dataHolder.b;
                    if (i13 >= strArr2.length) {
                        CursorWindow[] cursorWindowArr2 = dataHolder.d;
                        dataHolder.h = new int[cursorWindowArr2.length];
                        int i14 = 0;
                        for (int i15 = 0; i15 < cursorWindowArr2.length; i15++) {
                            dataHolder.h[i15] = i14;
                            i14 += cursorWindowArr2[i15].getNumRows() - (i14 - cursorWindowArr2[i15].getStartPosition());
                        }
                        dataHolder.n = i14;
                        return dataHolder;
                    }
                    dataHolder.c.putInt(strArr2[i13], i13);
                    i13++;
                }
            case 3:
                int A4 = ce.b.A(parcel);
                String str3 = null;
                String str4 = null;
                while (parcel.dataPosition() < A4) {
                    int readInt4 = parcel.readInt();
                    char c10 = (char) readInt4;
                    if (c10 == 1) {
                        str3 = ce.b.i(parcel, readInt4);
                    } else if (c10 != 2) {
                        ce.b.z(parcel, readInt4);
                    } else {
                        str4 = ce.b.i(parcel, readInt4);
                    }
                }
                ce.b.n(parcel, A4);
                x7.a aVar = new x7.a();
                aVar.a = str3;
                aVar.b = str4;
                return aVar;
            case 4:
                int A5 = ce.b.A(parcel);
                String str5 = null;
                while (parcel.dataPosition() < A5) {
                    int readInt5 = parcel.readInt();
                    if (((char) readInt5) != 1) {
                        ce.b.z(parcel, readInt5);
                    } else {
                        str5 = ce.b.i(parcel, readInt5);
                    }
                }
                ce.b.n(parcel, A5);
                x7.b bVar = new x7.b();
                bVar.a = str5;
                return bVar;
            case 5:
                int A6 = ce.b.A(parcel);
                while (parcel.dataPosition() < A6) {
                    ce.b.z(parcel, parcel.readInt());
                }
                ce.b.n(parcel, A6);
                return new x7.c();
            case 6:
                int A7 = ce.b.A(parcel);
                while (parcel.dataPosition() < A7) {
                    ce.b.z(parcel, parcel.readInt());
                }
                ce.b.n(parcel, A7);
                return new x7.d();
            case 7:
                int A8 = ce.b.A(parcel);
                int i16 = 0;
                Uri uri = null;
                int i17 = 0;
                int i18 = 0;
                while (parcel.dataPosition() < A8) {
                    int readInt6 = parcel.readInt();
                    char c11 = (char) readInt6;
                    if (c11 == 1) {
                        i16 = ce.b.v(parcel, readInt6);
                    } else if (c11 == 2) {
                        uri = (Uri) ce.b.h(parcel, readInt6, Uri.CREATOR);
                    } else if (c11 == 3) {
                        i17 = ce.b.v(parcel, readInt6);
                    } else if (c11 != 4) {
                        ce.b.z(parcel, readInt6);
                    } else {
                        i18 = ce.b.v(parcel, readInt6);
                    }
                }
                ce.b.n(parcel, A8);
                return new y5.a(i16, uri, i17, i18);
            case 8:
                int A9 = ce.b.A(parcel);
                String str6 = null;
                while (parcel.dataPosition() < A9) {
                    int readInt7 = parcel.readInt();
                    if (((char) readInt7) != 2) {
                        ce.b.z(parcel, readInt7);
                    } else {
                        str6 = ce.b.i(parcel, readInt7);
                    }
                }
                ce.b.n(parcel, A9);
                return new y7.e(str6);
            case 9:
                int A10 = ce.b.A(parcel);
                String str7 = null;
                byte[] bArr7 = null;
                int i19 = 0;
                while (parcel.dataPosition() < A10) {
                    int readInt8 = parcel.readInt();
                    char c12 = (char) readInt8;
                    if (c12 == 2) {
                        str7 = ce.b.i(parcel, readInt8);
                    } else if (c12 == 3) {
                        bArr7 = ce.b.c(parcel, readInt8);
                    } else if (c12 != 4) {
                        ce.b.z(parcel, readInt8);
                    } else {
                        i19 = ce.b.v(parcel, readInt8);
                    }
                }
                ce.b.n(parcel, A10);
                return new y7.a(str7, bArr7, i19);
            case 10:
                int A11 = ce.b.A(parcel);
                long j11 = 0;
                y7.a[] aVarArr = null;
                int i20 = 0;
                boolean z10 = false;
                while (parcel.dataPosition() < A11) {
                    int readInt9 = parcel.readInt();
                    char c13 = (char) readInt9;
                    if (c13 == 2) {
                        j11 = ce.b.x(parcel, readInt9);
                    } else if (c13 == 3) {
                        aVarArr = (y7.a[]) ce.b.l(parcel, readInt9, y7.a.CREATOR);
                    } else if (c13 == 4) {
                        i20 = ce.b.v(parcel, readInt9);
                    } else if (c13 != 5) {
                        ce.b.z(parcel, readInt9);
                    } else {
                        z10 = ce.b.o(parcel, readInt9);
                    }
                }
                ce.b.n(parcel, A11);
                return new y7.f(j11, aVarArr, i20, z10);
            case 11:
                int A12 = ce.b.A(parcel);
                String str8 = null;
                while (parcel.dataPosition() < A12) {
                    int readInt10 = parcel.readInt();
                    if (((char) readInt10) != 2) {
                        ce.b.z(parcel, readInt10);
                    } else {
                        str8 = ce.b.i(parcel, readInt10);
                    }
                }
                ce.b.n(parcel, A12);
                return new y7.g(str8);
            case 12:
                int A13 = ce.b.A(parcel);
                int i21 = 0;
                boolean z11 = false;
                while (parcel.dataPosition() < A13) {
                    int readInt11 = parcel.readInt();
                    char c14 = (char) readInt11;
                    if (c14 == 2) {
                        i21 = ce.b.v(parcel, readInt11);
                    } else if (c14 != 3) {
                        ce.b.z(parcel, readInt11);
                    } else {
                        z11 = ce.b.o(parcel, readInt11);
                    }
                }
                ce.b.n(parcel, A13);
                return new y7.h(i21, z11);
            case 13:
                int A14 = ce.b.A(parcel);
                String str9 = null;
                byte[] bArr8 = null;
                long j12 = 0;
                DataHolder dataHolder2 = null;
                ParcelFileDescriptor parcelFileDescriptor = null;
                while (parcel.dataPosition() < A14) {
                    int readInt12 = parcel.readInt();
                    char c15 = (char) readInt12;
                    if (c15 == 2) {
                        str9 = ce.b.i(parcel, readInt12);
                    } else if (c15 == 3) {
                        dataHolder2 = (DataHolder) ce.b.h(parcel, readInt12, DataHolder.CREATOR);
                    } else if (c15 == 4) {
                        parcelFileDescriptor = (ParcelFileDescriptor) ce.b.h(parcel, readInt12, ParcelFileDescriptor.CREATOR);
                    } else if (c15 == 5) {
                        j12 = ce.b.x(parcel, readInt12);
                    } else if (c15 != 6) {
                        ce.b.z(parcel, readInt12);
                    } else {
                        bArr8 = ce.b.c(parcel, readInt12);
                    }
                }
                ce.b.n(parcel, A14);
                y7.b bVar2 = new y7.b();
                bVar2.a = str9;
                bVar2.b = dataHolder2;
                bVar2.c = parcelFileDescriptor;
                bVar2.d = j12;
                bVar2.e = bArr8;
                return bVar2;
            case 14:
                int A15 = ce.b.A(parcel);
                String str10 = null;
                int i22 = 0;
                while (parcel.dataPosition() < A15) {
                    int readInt13 = parcel.readInt();
                    char c16 = (char) readInt13;
                    if (c16 == 1) {
                        i22 = ce.b.v(parcel, readInt13);
                    } else if (c16 != 2) {
                        ce.b.z(parcel, readInt13);
                    } else {
                        str10 = ce.b.i(parcel, readInt13);
                    }
                }
                ce.b.n(parcel, A15);
                return new z5.d(i22, str10);
            case 15:
                int A16 = ce.b.A(parcel);
                ArrayList arrayList = null;
                int i23 = 0;
                while (parcel.dataPosition() < A16) {
                    int readInt14 = parcel.readInt();
                    char c17 = (char) readInt14;
                    if (c17 == 1) {
                        i23 = ce.b.v(parcel, readInt14);
                    } else if (c17 != 2) {
                        ce.b.z(parcel, readInt14);
                    } else {
                        arrayList = ce.b.m(parcel, readInt14, z5.j.CREATOR);
                    }
                }
                ce.b.n(parcel, A16);
                return new z5.o(i23, arrayList);
            case 16:
                int A17 = ce.b.A(parcel);
                String str11 = null;
                String str12 = null;
                long j13 = 0;
                long j14 = 0;
                int i24 = 0;
                int i25 = 0;
                int i26 = 0;
                int i27 = 0;
                int i28 = -1;
                while (parcel.dataPosition() < A17) {
                    int readInt15 = parcel.readInt();
                    switch ((char) readInt15) {
                        case 1:
                            i24 = ce.b.v(parcel, readInt15);
                            break;
                        case 2:
                            i25 = ce.b.v(parcel, readInt15);
                            break;
                        case 3:
                            i26 = ce.b.v(parcel, readInt15);
                            break;
                        case 4:
                            j13 = ce.b.x(parcel, readInt15);
                            break;
                        case 5:
                            j14 = ce.b.x(parcel, readInt15);
                            break;
                        case 6:
                            str11 = ce.b.i(parcel, readInt15);
                            break;
                        case 7:
                            str12 = ce.b.i(parcel, readInt15);
                            break;
                        case '\b':
                            i27 = ce.b.v(parcel, readInt15);
                            break;
                        case '\t':
                            i28 = ce.b.v(parcel, readInt15);
                            break;
                        default:
                            ce.b.z(parcel, readInt15);
                            break;
                    }
                }
                ce.b.n(parcel, A17);
                return new z5.j(i24, i25, i26, j13, j14, str11, str12, i27, i28);
            case 17:
                int A18 = ce.b.A(parcel);
                Account account = null;
                GoogleSignInAccount googleSignInAccount = null;
                int i29 = 0;
                int i30 = 0;
                while (parcel.dataPosition() < A18) {
                    int readInt16 = parcel.readInt();
                    char c18 = (char) readInt16;
                    if (c18 == 1) {
                        i29 = ce.b.v(parcel, readInt16);
                    } else if (c18 == 2) {
                        account = (Account) ce.b.h(parcel, readInt16, Account.CREATOR);
                    } else if (c18 == 3) {
                        i30 = ce.b.v(parcel, readInt16);
                    } else if (c18 != 4) {
                        ce.b.z(parcel, readInt16);
                    } else {
                        googleSignInAccount = (GoogleSignInAccount) ce.b.h(parcel, readInt16, GoogleSignInAccount.CREATOR);
                    }
                }
                ce.b.n(parcel, A18);
                return new u(i29, account, i30, googleSignInAccount);
            case 18:
                int A19 = ce.b.A(parcel);
                IBinder iBinder = null;
                a aVar2 = null;
                int i31 = 0;
                boolean z12 = false;
                boolean z13 = false;
                while (parcel.dataPosition() < A19) {
                    int readInt17 = parcel.readInt();
                    char c19 = (char) readInt17;
                    if (c19 == 1) {
                        i31 = ce.b.v(parcel, readInt17);
                    } else if (c19 == 2) {
                        iBinder = ce.b.u(parcel, readInt17);
                    } else if (c19 == 3) {
                        aVar2 = (a) ce.b.h(parcel, readInt17, a.CREATOR);
                    } else if (c19 == 4) {
                        z12 = ce.b.o(parcel, readInt17);
                    } else if (c19 != 5) {
                        ce.b.z(parcel, readInt17);
                    } else {
                        z13 = ce.b.o(parcel, readInt17);
                    }
                }
                ce.b.n(parcel, A19);
                return new v(i31, iBinder, aVar2, z12, z13);
            case 19:
                int A20 = ce.b.A(parcel);
                int i32 = 0;
                int i33 = 0;
                int i34 = 0;
                boolean z14 = false;
                boolean z15 = false;
                while (parcel.dataPosition() < A20) {
                    int readInt18 = parcel.readInt();
                    char c20 = (char) readInt18;
                    if (c20 == 1) {
                        i32 = ce.b.v(parcel, readInt18);
                    } else if (c20 == 2) {
                        z14 = ce.b.o(parcel, readInt18);
                    } else if (c20 == 3) {
                        z15 = ce.b.o(parcel, readInt18);
                    } else if (c20 == 4) {
                        i33 = ce.b.v(parcel, readInt18);
                    } else if (c20 != 5) {
                        ce.b.z(parcel, readInt18);
                    } else {
                        i34 = ce.b.v(parcel, readInt18);
                    }
                }
                ce.b.n(parcel, A20);
                return new z5.n(i32, i33, i34, z14, z15);
            case 20:
                return new BinderWrapper(parcel);
            case 21:
                int A21 = ce.b.A(parcel);
                Bundle bundle2 = null;
                c[] cVarArr = null;
                z5.e eVar = null;
                int i35 = 0;
                while (parcel.dataPosition() < A21) {
                    int readInt19 = parcel.readInt();
                    char c21 = (char) readInt19;
                    if (c21 == 1) {
                        bundle2 = ce.b.b(parcel, readInt19);
                    } else if (c21 == 2) {
                        cVarArr = (c[]) ce.b.l(parcel, readInt19, c.CREATOR);
                    } else if (c21 == 3) {
                        i35 = ce.b.v(parcel, readInt19);
                    } else if (c21 != 4) {
                        ce.b.z(parcel, readInt19);
                    } else {
                        eVar = (z5.e) ce.b.h(parcel, readInt19, z5.e.CREATOR);
                    }
                }
                ce.b.n(parcel, A21);
                f0 f0Var = new f0();
                f0Var.a = bundle2;
                f0Var.b = cVarArr;
                f0Var.c = i35;
                f0Var.d = eVar;
                return f0Var;
            case 22:
                int A22 = ce.b.A(parcel);
                z5.n nVar = null;
                int[] iArr2 = null;
                int[] iArr3 = null;
                boolean z16 = false;
                boolean z17 = false;
                int i36 = 0;
                while (parcel.dataPosition() < A22) {
                    int readInt20 = parcel.readInt();
                    switch ((char) readInt20) {
                        case 1:
                            nVar = (z5.n) ce.b.h(parcel, readInt20, z5.n.CREATOR);
                            break;
                        case 2:
                            z16 = ce.b.o(parcel, readInt20);
                            break;
                        case 3:
                            z17 = ce.b.o(parcel, readInt20);
                            break;
                        case 4:
                            iArr2 = ce.b.e(parcel, readInt20);
                            break;
                        case 5:
                            i36 = ce.b.v(parcel, readInt20);
                            break;
                        case 6:
                            iArr3 = ce.b.e(parcel, readInt20);
                            break;
                        default:
                            ce.b.z(parcel, readInt20);
                            break;
                    }
                }
                ce.b.n(parcel, A22);
                return new z5.e(nVar, z16, z17, iArr2, i36, iArr3);
            case 23:
                int A23 = ce.b.A(parcel);
                Bundle bundle3 = new Bundle();
                Scope[] scopeArr = z5.f.A;
                String str13 = null;
                IBinder iBinder2 = null;
                Account account2 = null;
                String str14 = null;
                c[] cVarArr2 = z5.f.B;
                c[] cVarArr3 = cVarArr2;
                int i37 = 0;
                int i38 = 0;
                int i39 = 0;
                boolean z18 = false;
                int i40 = 0;
                boolean z19 = false;
                while (parcel.dataPosition() < A23) {
                    int readInt21 = parcel.readInt();
                    switch ((char) readInt21) {
                        case 1:
                            i37 = ce.b.v(parcel, readInt21);
                            break;
                        case 2:
                            i38 = ce.b.v(parcel, readInt21);
                            break;
                        case 3:
                            i39 = ce.b.v(parcel, readInt21);
                            break;
                        case 4:
                            str13 = ce.b.i(parcel, readInt21);
                            break;
                        case 5:
                            iBinder2 = ce.b.u(parcel, readInt21);
                            break;
                        case 6:
                            scopeArr = (Scope[]) ce.b.l(parcel, readInt21, Scope.CREATOR);
                            break;
                        case 7:
                            bundle3 = ce.b.b(parcel, readInt21);
                            break;
                        case '\b':
                            account2 = (Account) ce.b.h(parcel, readInt21, Account.CREATOR);
                            break;
                        case '\t':
                        default:
                            ce.b.z(parcel, readInt21);
                            break;
                        case '\n':
                            cVarArr2 = (c[]) ce.b.l(parcel, readInt21, c.CREATOR);
                            break;
                        case 11:
                            cVarArr3 = (c[]) ce.b.l(parcel, readInt21, c.CREATOR);
                            break;
                        case '\f':
                            z18 = ce.b.o(parcel, readInt21);
                            break;
                        case '\r':
                            i40 = ce.b.v(parcel, readInt21);
                            break;
                        case 14:
                            z19 = ce.b.o(parcel, readInt21);
                            break;
                        case 15:
                            str14 = ce.b.i(parcel, readInt21);
                            break;
                    }
                }
                ce.b.n(parcel, A23);
                return new z5.f(i37, i38, i39, str13, iBinder2, scopeArr, bundle3, account2, cVarArr2, cVarArr3, z18, i40, z19, str14);
            case 24:
                int A24 = ce.b.A(parcel);
                String str15 = null;
                String str16 = null;
                String str17 = null;
                String str18 = null;
                z8.a aVar3 = null;
                String str19 = null;
                Bundle bundle4 = null;
                while (parcel.dataPosition() < A24) {
                    int readInt22 = parcel.readInt();
                    switch ((char) readInt22) {
                        case 1:
                            str15 = ce.b.i(parcel, readInt22);
                            break;
                        case 2:
                            str16 = ce.b.i(parcel, readInt22);
                            break;
                        case 3:
                            str17 = ce.b.i(parcel, readInt22);
                            break;
                        case 4:
                            str18 = ce.b.i(parcel, readInt22);
                            break;
                        case 5:
                            aVar3 = (z8.a) ce.b.h(parcel, readInt22, z8.a.CREATOR);
                            break;
                        case 6:
                            str19 = ce.b.i(parcel, readInt22);
                            break;
                        case 7:
                            bundle4 = ce.b.b(parcel, readInt22);
                            break;
                        default:
                            ce.b.z(parcel, readInt22);
                            break;
                    }
                }
                ce.b.n(parcel, A24);
                return new z8.b(str15, str16, str17, str18, aVar3, str19, bundle4);
            default:
                int A25 = ce.b.A(parcel);
                String str20 = null;
                String str21 = null;
                byte[] bArr9 = null;
                int i41 = 0;
                boolean z20 = false;
                boolean z21 = false;
                while (parcel.dataPosition() < A25) {
                    int readInt23 = parcel.readInt();
                    switch ((char) readInt23) {
                        case 1:
                            i41 = ce.b.v(parcel, readInt23);
                            break;
                        case 2:
                            z20 = ce.b.o(parcel, readInt23);
                            break;
                        case 3:
                            str20 = ce.b.i(parcel, readInt23);
                            break;
                        case 4:
                            str21 = ce.b.i(parcel, readInt23);
                            break;
                        case 5:
                            bArr9 = ce.b.c(parcel, readInt23);
                            break;
                        case 6:
                            z21 = ce.b.o(parcel, readInt23);
                            break;
                        default:
                            ce.b.z(parcel, readInt23);
                            break;
                    }
                }
                ce.b.n(parcel, A25);
                return new z8.a(i41, z20, str20, str21, bArr9, z21);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        switch (this.a) {
            case 0:
                return new c[i10];
            case 1:
                return new w7.a[i10];
            case 2:
                return new DataHolder[i10];
            case 3:
                return new x7.a[i10];
            case 4:
                return new x7.b[i10];
            case 5:
                return new x7.c[i10];
            case 6:
                return new x7.d[i10];
            case 7:
                return new y5.a[i10];
            case 8:
                return new y7.e[i10];
            case 9:
                return new y7.a[i10];
            case 10:
                return new y7.f[i10];
            case 11:
                return new y7.g[i10];
            case 12:
                return new y7.h[i10];
            case 13:
                return new y7.b[i10];
            case 14:
                return new z5.d[i10];
            case 15:
                return new z5.o[i10];
            case 16:
                return new z5.j[i10];
            case 17:
                return new u[i10];
            case 18:
                return new v[i10];
            case 19:
                return new z5.n[i10];
            case 20:
                return new BinderWrapper[i10];
            case 21:
                return new f0[i10];
            case 22:
                return new z5.e[i10];
            case 23:
                return new z5.f[i10];
            case 24:
                return new z8.b[i10];
            default:
                return new z8.a[i10];
        }
    }
}
