package w7;

import android.accounts.Account;
import android.content.Intent;
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
import h7.q8;
import h7.r8;
import java.util.ArrayList;
import x7.h;
import y5.f0;
import y5.j;
import y5.n;
import y5.o;
import y5.u;
import y5.v;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class f implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ f(int i10) {
        this.a = i10;
    }

    public static void a(y5.f fVar, Parcel parcel, int i10) {
        int q6 = r8.q(parcel, 20293);
        int i11 = fVar.a;
        r8.s(parcel, 1, 4);
        parcel.writeInt(i11);
        int i12 = fVar.b;
        r8.s(parcel, 2, 4);
        parcel.writeInt(i12);
        int i13 = fVar.c;
        r8.s(parcel, 3, 4);
        parcel.writeInt(i13);
        r8.l(parcel, 4, fVar.d);
        r8.f(parcel, 5, fVar.e);
        r8.o(parcel, 6, fVar.f, i10);
        r8.b(parcel, 7, fVar.h);
        r8.k(parcel, 8, fVar.n, i10);
        r8.o(parcel, 10, fVar.r, i10);
        r8.o(parcel, 11, fVar.s, i10);
        boolean z10 = fVar.v;
        r8.s(parcel, 12, 4);
        parcel.writeInt(z10 ? 1 : 0);
        int i14 = fVar.w;
        r8.s(parcel, 13, 4);
        parcel.writeInt(i14);
        boolean z11 = fVar.x;
        r8.s(parcel, 14, 4);
        parcel.writeInt(z11 ? 1 : 0);
        r8.l(parcel, 15, fVar.y);
        r8.r(parcel, q6);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                int z10 = q8.z(parcel);
                String str = null;
                while (parcel.dataPosition() < z10) {
                    int readInt = parcel.readInt();
                    if (((char) readInt) != 1) {
                        q8.y(parcel, readInt);
                    } else {
                        str = q8.h(parcel, readInt);
                    }
                }
                q8.m(parcel, z10);
                b bVar = new b();
                bVar.a = str;
                return bVar;
            case 1:
                int z11 = q8.z(parcel);
                while (parcel.dataPosition() < z11) {
                    q8.y(parcel, parcel.readInt());
                }
                q8.m(parcel, z11);
                return new c();
            case 2:
                int z12 = q8.z(parcel);
                while (parcel.dataPosition() < z12) {
                    q8.y(parcel, parcel.readInt());
                }
                q8.m(parcel, z12);
                return new d();
            case 3:
                int z13 = q8.z(parcel);
                int i10 = 0;
                Uri uri = null;
                int i11 = 0;
                int i12 = 0;
                while (parcel.dataPosition() < z13) {
                    int readInt2 = parcel.readInt();
                    char c10 = (char) readInt2;
                    if (c10 == 1) {
                        i10 = q8.u(parcel, readInt2);
                    } else if (c10 == 2) {
                        uri = (Uri) q8.g(parcel, readInt2, Uri.CREATOR);
                    } else if (c10 == 3) {
                        i11 = q8.u(parcel, readInt2);
                    } else if (c10 != 4) {
                        q8.y(parcel, readInt2);
                    } else {
                        i12 = q8.u(parcel, readInt2);
                    }
                }
                q8.m(parcel, z13);
                return new x5.a(i10, uri, i11, i12);
            case 4:
                int z14 = q8.z(parcel);
                String str2 = null;
                while (parcel.dataPosition() < z14) {
                    int readInt3 = parcel.readInt();
                    if (((char) readInt3) != 2) {
                        q8.y(parcel, readInt3);
                    } else {
                        str2 = q8.h(parcel, readInt3);
                    }
                }
                q8.m(parcel, z14);
                return new x7.e(str2);
            case 5:
                int z15 = q8.z(parcel);
                String str3 = null;
                byte[] bArr = null;
                int i13 = 0;
                while (parcel.dataPosition() < z15) {
                    int readInt4 = parcel.readInt();
                    char c11 = (char) readInt4;
                    if (c11 == 2) {
                        str3 = q8.h(parcel, readInt4);
                    } else if (c11 == 3) {
                        bArr = q8.b(parcel, readInt4);
                    } else if (c11 != 4) {
                        q8.y(parcel, readInt4);
                    } else {
                        i13 = q8.u(parcel, readInt4);
                    }
                }
                q8.m(parcel, z15);
                return new x7.a(str3, bArr, i13);
            case 6:
                int z16 = q8.z(parcel);
                long j10 = 0;
                x7.a[] aVarArr = null;
                int i14 = 0;
                boolean z17 = false;
                while (parcel.dataPosition() < z16) {
                    int readInt5 = parcel.readInt();
                    char c12 = (char) readInt5;
                    if (c12 == 2) {
                        j10 = q8.w(parcel, readInt5);
                    } else if (c12 == 3) {
                        aVarArr = (x7.a[]) q8.k(parcel, readInt5, x7.a.CREATOR);
                    } else if (c12 == 4) {
                        i14 = q8.u(parcel, readInt5);
                    } else if (c12 != 5) {
                        q8.y(parcel, readInt5);
                    } else {
                        z17 = q8.n(parcel, readInt5);
                    }
                }
                q8.m(parcel, z16);
                return new x7.f(j10, aVarArr, i14, z17);
            case 7:
                int z18 = q8.z(parcel);
                String str4 = null;
                while (parcel.dataPosition() < z18) {
                    int readInt6 = parcel.readInt();
                    if (((char) readInt6) != 2) {
                        q8.y(parcel, readInt6);
                    } else {
                        str4 = q8.h(parcel, readInt6);
                    }
                }
                q8.m(parcel, z18);
                return new x7.g(str4);
            case 8:
                int z19 = q8.z(parcel);
                int i15 = 0;
                boolean z20 = false;
                while (parcel.dataPosition() < z19) {
                    int readInt7 = parcel.readInt();
                    char c13 = (char) readInt7;
                    if (c13 == 2) {
                        i15 = q8.u(parcel, readInt7);
                    } else if (c13 != 3) {
                        q8.y(parcel, readInt7);
                    } else {
                        z20 = q8.n(parcel, readInt7);
                    }
                }
                q8.m(parcel, z19);
                return new h(i15, z20);
            case 9:
                int z21 = q8.z(parcel);
                String str5 = null;
                byte[] bArr2 = null;
                long j11 = 0;
                DataHolder dataHolder = null;
                ParcelFileDescriptor parcelFileDescriptor = null;
                while (parcel.dataPosition() < z21) {
                    int readInt8 = parcel.readInt();
                    char c14 = (char) readInt8;
                    if (c14 == 2) {
                        str5 = q8.h(parcel, readInt8);
                    } else if (c14 == 3) {
                        dataHolder = (DataHolder) q8.g(parcel, readInt8, DataHolder.CREATOR);
                    } else if (c14 == 4) {
                        parcelFileDescriptor = (ParcelFileDescriptor) q8.g(parcel, readInt8, ParcelFileDescriptor.CREATOR);
                    } else if (c14 == 5) {
                        j11 = q8.w(parcel, readInt8);
                    } else if (c14 != 6) {
                        q8.y(parcel, readInt8);
                    } else {
                        bArr2 = q8.b(parcel, readInt8);
                    }
                }
                q8.m(parcel, z21);
                x7.b bVar2 = new x7.b();
                bVar2.a = str5;
                bVar2.b = dataHolder;
                bVar2.c = parcelFileDescriptor;
                bVar2.d = j11;
                bVar2.e = bArr2;
                return bVar2;
            case 10:
                int z22 = q8.z(parcel);
                String str6 = null;
                int i16 = 0;
                while (parcel.dataPosition() < z22) {
                    int readInt9 = parcel.readInt();
                    char c15 = (char) readInt9;
                    if (c15 == 1) {
                        i16 = q8.u(parcel, readInt9);
                    } else if (c15 != 2) {
                        q8.y(parcel, readInt9);
                    } else {
                        str6 = q8.h(parcel, readInt9);
                    }
                }
                q8.m(parcel, z22);
                return new y5.d(i16, str6);
            case 11:
                int z23 = q8.z(parcel);
                ArrayList arrayList = null;
                int i17 = 0;
                while (parcel.dataPosition() < z23) {
                    int readInt10 = parcel.readInt();
                    char c16 = (char) readInt10;
                    if (c16 == 1) {
                        i17 = q8.u(parcel, readInt10);
                    } else if (c16 != 2) {
                        q8.y(parcel, readInt10);
                    } else {
                        arrayList = q8.l(parcel, readInt10, j.CREATOR);
                    }
                }
                q8.m(parcel, z23);
                return new o(i17, arrayList);
            case 12:
                int z24 = q8.z(parcel);
                String str7 = null;
                String str8 = null;
                long j12 = 0;
                long j13 = 0;
                int i18 = 0;
                int i19 = 0;
                int i20 = 0;
                int i21 = 0;
                int i22 = -1;
                while (parcel.dataPosition() < z24) {
                    int readInt11 = parcel.readInt();
                    switch ((char) readInt11) {
                        case 1:
                            i18 = q8.u(parcel, readInt11);
                            break;
                        case 2:
                            i19 = q8.u(parcel, readInt11);
                            break;
                        case 3:
                            i20 = q8.u(parcel, readInt11);
                            break;
                        case 4:
                            j12 = q8.w(parcel, readInt11);
                            break;
                        case 5:
                            j13 = q8.w(parcel, readInt11);
                            break;
                        case 6:
                            str7 = q8.h(parcel, readInt11);
                            break;
                        case 7:
                            str8 = q8.h(parcel, readInt11);
                            break;
                        case '\b':
                            i21 = q8.u(parcel, readInt11);
                            break;
                        case '\t':
                            i22 = q8.u(parcel, readInt11);
                            break;
                        default:
                            q8.y(parcel, readInt11);
                            break;
                    }
                }
                q8.m(parcel, z24);
                return new j(i18, i19, i20, j12, j13, str7, str8, i21, i22);
            case 13:
                int z25 = q8.z(parcel);
                Account account = null;
                GoogleSignInAccount googleSignInAccount = null;
                int i23 = 0;
                int i24 = 0;
                while (parcel.dataPosition() < z25) {
                    int readInt12 = parcel.readInt();
                    char c17 = (char) readInt12;
                    if (c17 == 1) {
                        i23 = q8.u(parcel, readInt12);
                    } else if (c17 == 2) {
                        account = (Account) q8.g(parcel, readInt12, Account.CREATOR);
                    } else if (c17 == 3) {
                        i24 = q8.u(parcel, readInt12);
                    } else if (c17 != 4) {
                        q8.y(parcel, readInt12);
                    } else {
                        googleSignInAccount = (GoogleSignInAccount) q8.g(parcel, readInt12, GoogleSignInAccount.CREATOR);
                    }
                }
                q8.m(parcel, z25);
                return new u(i23, account, i24, googleSignInAccount);
            case 14:
                int z26 = q8.z(parcel);
                IBinder iBinder = null;
                v5.a aVar = null;
                int i25 = 0;
                boolean z27 = false;
                boolean z28 = false;
                while (parcel.dataPosition() < z26) {
                    int readInt13 = parcel.readInt();
                    char c18 = (char) readInt13;
                    if (c18 == 1) {
                        i25 = q8.u(parcel, readInt13);
                    } else if (c18 == 2) {
                        iBinder = q8.t(parcel, readInt13);
                    } else if (c18 == 3) {
                        aVar = (v5.a) q8.g(parcel, readInt13, v5.a.CREATOR);
                    } else if (c18 == 4) {
                        z27 = q8.n(parcel, readInt13);
                    } else if (c18 != 5) {
                        q8.y(parcel, readInt13);
                    } else {
                        z28 = q8.n(parcel, readInt13);
                    }
                }
                q8.m(parcel, z26);
                return new v(i25, iBinder, aVar, z27, z28);
            case 15:
                int z29 = q8.z(parcel);
                int i26 = 0;
                int i27 = 0;
                int i28 = 0;
                boolean z30 = false;
                boolean z31 = false;
                while (parcel.dataPosition() < z29) {
                    int readInt14 = parcel.readInt();
                    char c19 = (char) readInt14;
                    if (c19 == 1) {
                        i26 = q8.u(parcel, readInt14);
                    } else if (c19 == 2) {
                        z30 = q8.n(parcel, readInt14);
                    } else if (c19 == 3) {
                        z31 = q8.n(parcel, readInt14);
                    } else if (c19 == 4) {
                        i27 = q8.u(parcel, readInt14);
                    } else if (c19 != 5) {
                        q8.y(parcel, readInt14);
                    } else {
                        i28 = q8.u(parcel, readInt14);
                    }
                }
                q8.m(parcel, z29);
                return new n(i26, i27, i28, z30, z31);
            case 16:
                return new BinderWrapper(parcel);
            case 17:
                int z32 = q8.z(parcel);
                Bundle bundle = null;
                v5.c[] cVarArr = null;
                y5.e eVar = null;
                int i29 = 0;
                while (parcel.dataPosition() < z32) {
                    int readInt15 = parcel.readInt();
                    char c20 = (char) readInt15;
                    if (c20 == 1) {
                        bundle = q8.a(parcel, readInt15);
                    } else if (c20 == 2) {
                        cVarArr = (v5.c[]) q8.k(parcel, readInt15, v5.c.CREATOR);
                    } else if (c20 == 3) {
                        i29 = q8.u(parcel, readInt15);
                    } else if (c20 != 4) {
                        q8.y(parcel, readInt15);
                    } else {
                        eVar = (y5.e) q8.g(parcel, readInt15, y5.e.CREATOR);
                    }
                }
                q8.m(parcel, z32);
                f0 f0Var = new f0();
                f0Var.a = bundle;
                f0Var.b = cVarArr;
                f0Var.c = i29;
                f0Var.d = eVar;
                return f0Var;
            case 18:
                int z33 = q8.z(parcel);
                n nVar = null;
                int[] iArr = null;
                int[] iArr2 = null;
                boolean z34 = false;
                boolean z35 = false;
                int i30 = 0;
                while (parcel.dataPosition() < z33) {
                    int readInt16 = parcel.readInt();
                    switch ((char) readInt16) {
                        case 1:
                            nVar = (n) q8.g(parcel, readInt16, n.CREATOR);
                            break;
                        case 2:
                            z34 = q8.n(parcel, readInt16);
                            break;
                        case 3:
                            z35 = q8.n(parcel, readInt16);
                            break;
                        case 4:
                            iArr = q8.d(parcel, readInt16);
                            break;
                        case 5:
                            i30 = q8.u(parcel, readInt16);
                            break;
                        case 6:
                            iArr2 = q8.d(parcel, readInt16);
                            break;
                        default:
                            q8.y(parcel, readInt16);
                            break;
                    }
                }
                q8.m(parcel, z33);
                return new y5.e(nVar, z34, z35, iArr, i30, iArr2);
            case 19:
                int z36 = q8.z(parcel);
                Bundle bundle2 = new Bundle();
                Scope[] scopeArr = y5.f.A;
                String str9 = null;
                IBinder iBinder2 = null;
                Account account2 = null;
                String str10 = null;
                v5.c[] cVarArr2 = y5.f.B;
                v5.c[] cVarArr3 = cVarArr2;
                int i31 = 0;
                int i32 = 0;
                int i33 = 0;
                boolean z37 = false;
                int i34 = 0;
                boolean z38 = false;
                while (parcel.dataPosition() < z36) {
                    int readInt17 = parcel.readInt();
                    switch ((char) readInt17) {
                        case 1:
                            i31 = q8.u(parcel, readInt17);
                            break;
                        case 2:
                            i32 = q8.u(parcel, readInt17);
                            break;
                        case 3:
                            i33 = q8.u(parcel, readInt17);
                            break;
                        case 4:
                            str9 = q8.h(parcel, readInt17);
                            break;
                        case 5:
                            iBinder2 = q8.t(parcel, readInt17);
                            break;
                        case 6:
                            scopeArr = (Scope[]) q8.k(parcel, readInt17, Scope.CREATOR);
                            break;
                        case 7:
                            bundle2 = q8.a(parcel, readInt17);
                            break;
                        case '\b':
                            account2 = (Account) q8.g(parcel, readInt17, Account.CREATOR);
                            break;
                        case '\t':
                        default:
                            q8.y(parcel, readInt17);
                            break;
                        case '\n':
                            cVarArr2 = (v5.c[]) q8.k(parcel, readInt17, v5.c.CREATOR);
                            break;
                        case 11:
                            cVarArr3 = (v5.c[]) q8.k(parcel, readInt17, v5.c.CREATOR);
                            break;
                        case '\f':
                            z37 = q8.n(parcel, readInt17);
                            break;
                        case '\r':
                            i34 = q8.u(parcel, readInt17);
                            break;
                        case 14:
                            z38 = q8.n(parcel, readInt17);
                            break;
                        case 15:
                            str10 = q8.h(parcel, readInt17);
                            break;
                    }
                }
                q8.m(parcel, z36);
                return new y5.f(i31, i32, i33, str9, iBinder2, scopeArr, bundle2, account2, cVarArr2, cVarArr3, z37, i34, z38, str10);
            case 20:
                int z39 = q8.z(parcel);
                String str11 = null;
                String str12 = null;
                String str13 = null;
                String str14 = null;
                y8.a aVar2 = null;
                String str15 = null;
                Bundle bundle3 = null;
                while (parcel.dataPosition() < z39) {
                    int readInt18 = parcel.readInt();
                    switch ((char) readInt18) {
                        case 1:
                            str11 = q8.h(parcel, readInt18);
                            break;
                        case 2:
                            str12 = q8.h(parcel, readInt18);
                            break;
                        case 3:
                            str13 = q8.h(parcel, readInt18);
                            break;
                        case 4:
                            str14 = q8.h(parcel, readInt18);
                            break;
                        case 5:
                            aVar2 = (y8.a) q8.g(parcel, readInt18, y8.a.CREATOR);
                            break;
                        case 6:
                            str15 = q8.h(parcel, readInt18);
                            break;
                        case 7:
                            bundle3 = q8.a(parcel, readInt18);
                            break;
                        default:
                            q8.y(parcel, readInt18);
                            break;
                    }
                }
                q8.m(parcel, z39);
                return new y8.b(str11, str12, str13, str14, aVar2, str15, bundle3);
            case 21:
                int z40 = q8.z(parcel);
                String str16 = null;
                String str17 = null;
                byte[] bArr3 = null;
                int i35 = 0;
                boolean z41 = false;
                boolean z42 = false;
                while (parcel.dataPosition() < z40) {
                    int readInt19 = parcel.readInt();
                    switch ((char) readInt19) {
                        case 1:
                            i35 = q8.u(parcel, readInt19);
                            break;
                        case 2:
                            z41 = q8.n(parcel, readInt19);
                            break;
                        case 3:
                            str16 = q8.h(parcel, readInt19);
                            break;
                        case 4:
                            str17 = q8.h(parcel, readInt19);
                            break;
                        case 5:
                            bArr3 = q8.b(parcel, readInt19);
                            break;
                        case 6:
                            z42 = q8.n(parcel, readInt19);
                            break;
                        default:
                            q8.y(parcel, readInt19);
                            break;
                    }
                }
                q8.m(parcel, z40);
                return new y8.a(i35, z41, str16, str17, bArr3, z42);
            case 22:
                int z43 = q8.z(parcel);
                Intent intent = null;
                int i36 = 0;
                int i37 = 0;
                while (parcel.dataPosition() < z43) {
                    int readInt20 = parcel.readInt();
                    char c21 = (char) readInt20;
                    if (c21 == 1) {
                        i36 = q8.u(parcel, readInt20);
                    } else if (c21 == 2) {
                        i37 = q8.u(parcel, readInt20);
                    } else if (c21 != 3) {
                        q8.y(parcel, readInt20);
                    } else {
                        intent = (Intent) q8.g(parcel, readInt20, Intent.CREATOR);
                    }
                }
                q8.m(parcel, z43);
                return new z7.b(i36, i37, intent);
            case 23:
                int z44 = q8.z(parcel);
                ArrayList arrayList2 = null;
                String str18 = null;
                while (parcel.dataPosition() < z44) {
                    int readInt21 = parcel.readInt();
                    char c22 = (char) readInt21;
                    if (c22 == 1) {
                        arrayList2 = q8.j(parcel, readInt21);
                    } else if (c22 != 2) {
                        q8.y(parcel, readInt21);
                    } else {
                        str18 = q8.h(parcel, readInt21);
                    }
                }
                q8.m(parcel, z44);
                return new z7.f(str18, arrayList2);
            case 24:
                int z45 = q8.z(parcel);
                u uVar = null;
                int i38 = 0;
                while (parcel.dataPosition() < z45) {
                    int readInt22 = parcel.readInt();
                    char c23 = (char) readInt22;
                    if (c23 == 1) {
                        i38 = q8.u(parcel, readInt22);
                    } else if (c23 != 2) {
                        q8.y(parcel, readInt22);
                    } else {
                        uVar = (u) q8.g(parcel, readInt22, u.CREATOR);
                    }
                }
                q8.m(parcel, z45);
                return new z7.g(i38, uVar);
            default:
                int z46 = q8.z(parcel);
                v5.a aVar3 = null;
                v vVar = null;
                int i39 = 0;
                while (parcel.dataPosition() < z46) {
                    int readInt23 = parcel.readInt();
                    char c24 = (char) readInt23;
                    if (c24 == 1) {
                        i39 = q8.u(parcel, readInt23);
                    } else if (c24 == 2) {
                        aVar3 = (v5.a) q8.g(parcel, readInt23, v5.a.CREATOR);
                    } else if (c24 != 3) {
                        q8.y(parcel, readInt23);
                    } else {
                        vVar = (v) q8.g(parcel, readInt23, v.CREATOR);
                    }
                }
                q8.m(parcel, z46);
                return new z7.h(i39, aVar3, vVar);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        switch (this.a) {
            case 0:
                return new b[i10];
            case 1:
                return new c[i10];
            case 2:
                return new d[i10];
            case 3:
                return new x5.a[i10];
            case 4:
                return new x7.e[i10];
            case 5:
                return new x7.a[i10];
            case 6:
                return new x7.f[i10];
            case 7:
                return new x7.g[i10];
            case 8:
                return new h[i10];
            case 9:
                return new x7.b[i10];
            case 10:
                return new y5.d[i10];
            case 11:
                return new o[i10];
            case 12:
                return new j[i10];
            case 13:
                return new u[i10];
            case 14:
                return new v[i10];
            case 15:
                return new n[i10];
            case 16:
                return new BinderWrapper[i10];
            case 17:
                return new f0[i10];
            case 18:
                return new y5.e[i10];
            case 19:
                return new y5.f[i10];
            case 20:
                return new y8.b[i10];
            case 21:
                return new y8.a[i10];
            case 22:
                return new z7.b[i10];
            case 23:
                return new z7.f[i10];
            case 24:
                return new z7.g[i10];
            default:
                return new z7.h[i10];
        }
    }
}
