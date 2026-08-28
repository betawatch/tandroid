package w7;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.BinderWrapper;
import g7.o8;
import g7.p8;
import java.util.ArrayList;
import x5.f0;
import x5.j;
import x5.n;
import x5.o;
import x5.u;
import x5.v;
import z6.k;
import z6.l;
import z6.m;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class i implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ i(int i9) {
        this.a = i9;
    }

    public static void a(x5.f fVar, Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        int i10 = fVar.a;
        p8.s(parcel, 1, 4);
        parcel.writeInt(i10);
        int i11 = fVar.b;
        p8.s(parcel, 2, 4);
        parcel.writeInt(i11);
        int i12 = fVar.c;
        p8.s(parcel, 3, 4);
        parcel.writeInt(i12);
        p8.l(parcel, 4, fVar.d);
        p8.f(parcel, 5, fVar.e);
        p8.o(parcel, 6, fVar.f, i9);
        p8.b(parcel, 7, fVar.h);
        p8.k(parcel, 8, fVar.n, i9);
        p8.o(parcel, 10, fVar.r, i9);
        p8.o(parcel, 11, fVar.s, i9);
        boolean z10 = fVar.v;
        p8.s(parcel, 12, 4);
        parcel.writeInt(z10 ? 1 : 0);
        int i13 = fVar.w;
        p8.s(parcel, 13, 4);
        parcel.writeInt(i13);
        boolean z11 = fVar.x;
        p8.s(parcel, 14, 4);
        parcel.writeInt(z11 ? 1 : 0);
        p8.l(parcel, 15, fVar.y);
        p8.r(parcel, q10);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                int z10 = o8.z(parcel);
                int i9 = 0;
                boolean z11 = false;
                while (parcel.dataPosition() < z10) {
                    int readInt = parcel.readInt();
                    char c10 = (char) readInt;
                    if (c10 == 2) {
                        i9 = o8.u(parcel, readInt);
                    } else if (c10 != 3) {
                        o8.y(parcel, readInt);
                    } else {
                        z11 = o8.n(parcel, readInt);
                    }
                }
                o8.m(parcel, z10);
                return new h(i9, z11);
            case 1:
                int z12 = o8.z(parcel);
                String str = null;
                byte[] bArr = null;
                long j10 = 0;
                DataHolder dataHolder = null;
                ParcelFileDescriptor parcelFileDescriptor = null;
                while (parcel.dataPosition() < z12) {
                    int readInt2 = parcel.readInt();
                    char c11 = (char) readInt2;
                    if (c11 == 2) {
                        str = o8.h(parcel, readInt2);
                    } else if (c11 == 3) {
                        dataHolder = (DataHolder) o8.g(parcel, readInt2, DataHolder.CREATOR);
                    } else if (c11 == 4) {
                        parcelFileDescriptor = (ParcelFileDescriptor) o8.g(parcel, readInt2, ParcelFileDescriptor.CREATOR);
                    } else if (c11 == 5) {
                        j10 = o8.w(parcel, readInt2);
                    } else if (c11 != 6) {
                        o8.y(parcel, readInt2);
                    } else {
                        bArr = o8.b(parcel, readInt2);
                    }
                }
                o8.m(parcel, z12);
                b bVar = new b();
                bVar.a = str;
                bVar.b = dataHolder;
                bVar.c = parcelFileDescriptor;
                bVar.d = j10;
                bVar.e = bArr;
                return bVar;
            case 2:
                int z13 = o8.z(parcel);
                String str2 = null;
                int i10 = 0;
                while (parcel.dataPosition() < z13) {
                    int readInt3 = parcel.readInt();
                    char c12 = (char) readInt3;
                    if (c12 == 1) {
                        i10 = o8.u(parcel, readInt3);
                    } else if (c12 != 2) {
                        o8.y(parcel, readInt3);
                    } else {
                        str2 = o8.h(parcel, readInt3);
                    }
                }
                o8.m(parcel, z13);
                return new x5.d(i10, str2);
            case 3:
                int z14 = o8.z(parcel);
                ArrayList arrayList = null;
                int i11 = 0;
                while (parcel.dataPosition() < z14) {
                    int readInt4 = parcel.readInt();
                    char c13 = (char) readInt4;
                    if (c13 == 1) {
                        i11 = o8.u(parcel, readInt4);
                    } else if (c13 != 2) {
                        o8.y(parcel, readInt4);
                    } else {
                        arrayList = o8.l(parcel, readInt4, j.CREATOR);
                    }
                }
                o8.m(parcel, z14);
                return new o(i11, arrayList);
            case 4:
                int z15 = o8.z(parcel);
                String str3 = null;
                String str4 = null;
                long j11 = 0;
                long j12 = 0;
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                int i16 = -1;
                while (parcel.dataPosition() < z15) {
                    int readInt5 = parcel.readInt();
                    switch ((char) readInt5) {
                        case 1:
                            i12 = o8.u(parcel, readInt5);
                            break;
                        case 2:
                            i13 = o8.u(parcel, readInt5);
                            break;
                        case 3:
                            i14 = o8.u(parcel, readInt5);
                            break;
                        case 4:
                            j11 = o8.w(parcel, readInt5);
                            break;
                        case 5:
                            j12 = o8.w(parcel, readInt5);
                            break;
                        case 6:
                            str3 = o8.h(parcel, readInt5);
                            break;
                        case 7:
                            str4 = o8.h(parcel, readInt5);
                            break;
                        case '\b':
                            i15 = o8.u(parcel, readInt5);
                            break;
                        case '\t':
                            i16 = o8.u(parcel, readInt5);
                            break;
                        default:
                            o8.y(parcel, readInt5);
                            break;
                    }
                }
                o8.m(parcel, z15);
                return new j(i12, i13, i14, j11, j12, str3, str4, i15, i16);
            case 5:
                int z16 = o8.z(parcel);
                Account account = null;
                GoogleSignInAccount googleSignInAccount = null;
                int i17 = 0;
                int i18 = 0;
                while (parcel.dataPosition() < z16) {
                    int readInt6 = parcel.readInt();
                    char c14 = (char) readInt6;
                    if (c14 == 1) {
                        i17 = o8.u(parcel, readInt6);
                    } else if (c14 == 2) {
                        account = (Account) o8.g(parcel, readInt6, Account.CREATOR);
                    } else if (c14 == 3) {
                        i18 = o8.u(parcel, readInt6);
                    } else if (c14 != 4) {
                        o8.y(parcel, readInt6);
                    } else {
                        googleSignInAccount = (GoogleSignInAccount) o8.g(parcel, readInt6, GoogleSignInAccount.CREATOR);
                    }
                }
                o8.m(parcel, z16);
                return new u(i17, account, i18, googleSignInAccount);
            case 6:
                int z17 = o8.z(parcel);
                IBinder iBinder = null;
                u5.a aVar = null;
                int i19 = 0;
                boolean z18 = false;
                boolean z19 = false;
                while (parcel.dataPosition() < z17) {
                    int readInt7 = parcel.readInt();
                    char c15 = (char) readInt7;
                    if (c15 == 1) {
                        i19 = o8.u(parcel, readInt7);
                    } else if (c15 == 2) {
                        iBinder = o8.t(parcel, readInt7);
                    } else if (c15 == 3) {
                        aVar = (u5.a) o8.g(parcel, readInt7, u5.a.CREATOR);
                    } else if (c15 == 4) {
                        z18 = o8.n(parcel, readInt7);
                    } else if (c15 != 5) {
                        o8.y(parcel, readInt7);
                    } else {
                        z19 = o8.n(parcel, readInt7);
                    }
                }
                o8.m(parcel, z17);
                return new v(i19, iBinder, aVar, z18, z19);
            case 7:
                int z20 = o8.z(parcel);
                int i20 = 0;
                int i21 = 0;
                int i22 = 0;
                boolean z21 = false;
                boolean z22 = false;
                while (parcel.dataPosition() < z20) {
                    int readInt8 = parcel.readInt();
                    char c16 = (char) readInt8;
                    if (c16 == 1) {
                        i20 = o8.u(parcel, readInt8);
                    } else if (c16 == 2) {
                        z21 = o8.n(parcel, readInt8);
                    } else if (c16 == 3) {
                        z22 = o8.n(parcel, readInt8);
                    } else if (c16 == 4) {
                        i21 = o8.u(parcel, readInt8);
                    } else if (c16 != 5) {
                        o8.y(parcel, readInt8);
                    } else {
                        i22 = o8.u(parcel, readInt8);
                    }
                }
                o8.m(parcel, z20);
                return new n(i20, i21, i22, z21, z22);
            case 8:
                return new BinderWrapper(parcel);
            case 9:
                int z23 = o8.z(parcel);
                Bundle bundle = null;
                u5.c[] cVarArr = null;
                x5.e eVar = null;
                int i23 = 0;
                while (parcel.dataPosition() < z23) {
                    int readInt9 = parcel.readInt();
                    char c17 = (char) readInt9;
                    if (c17 == 1) {
                        bundle = o8.a(parcel, readInt9);
                    } else if (c17 == 2) {
                        cVarArr = (u5.c[]) o8.k(parcel, readInt9, u5.c.CREATOR);
                    } else if (c17 == 3) {
                        i23 = o8.u(parcel, readInt9);
                    } else if (c17 != 4) {
                        o8.y(parcel, readInt9);
                    } else {
                        eVar = (x5.e) o8.g(parcel, readInt9, x5.e.CREATOR);
                    }
                }
                o8.m(parcel, z23);
                f0 f0Var = new f0();
                f0Var.a = bundle;
                f0Var.b = cVarArr;
                f0Var.c = i23;
                f0Var.d = eVar;
                return f0Var;
            case 10:
                int z24 = o8.z(parcel);
                n nVar = null;
                int[] iArr = null;
                int[] iArr2 = null;
                boolean z25 = false;
                boolean z26 = false;
                int i24 = 0;
                while (parcel.dataPosition() < z24) {
                    int readInt10 = parcel.readInt();
                    switch ((char) readInt10) {
                        case 1:
                            nVar = (n) o8.g(parcel, readInt10, n.CREATOR);
                            break;
                        case 2:
                            z25 = o8.n(parcel, readInt10);
                            break;
                        case 3:
                            z26 = o8.n(parcel, readInt10);
                            break;
                        case 4:
                            iArr = o8.d(parcel, readInt10);
                            break;
                        case 5:
                            i24 = o8.u(parcel, readInt10);
                            break;
                        case 6:
                            iArr2 = o8.d(parcel, readInt10);
                            break;
                        default:
                            o8.y(parcel, readInt10);
                            break;
                    }
                }
                o8.m(parcel, z24);
                return new x5.e(nVar, z25, z26, iArr, i24, iArr2);
            case 11:
                int z27 = o8.z(parcel);
                Bundle bundle2 = new Bundle();
                Scope[] scopeArr = x5.f.A;
                String str5 = null;
                IBinder iBinder2 = null;
                Account account2 = null;
                String str6 = null;
                u5.c[] cVarArr2 = x5.f.B;
                u5.c[] cVarArr3 = cVarArr2;
                int i25 = 0;
                int i26 = 0;
                int i27 = 0;
                boolean z28 = false;
                int i28 = 0;
                boolean z29 = false;
                while (parcel.dataPosition() < z27) {
                    int readInt11 = parcel.readInt();
                    switch ((char) readInt11) {
                        case 1:
                            i25 = o8.u(parcel, readInt11);
                            break;
                        case 2:
                            i26 = o8.u(parcel, readInt11);
                            break;
                        case 3:
                            i27 = o8.u(parcel, readInt11);
                            break;
                        case 4:
                            str5 = o8.h(parcel, readInt11);
                            break;
                        case 5:
                            iBinder2 = o8.t(parcel, readInt11);
                            break;
                        case 6:
                            scopeArr = (Scope[]) o8.k(parcel, readInt11, Scope.CREATOR);
                            break;
                        case 7:
                            bundle2 = o8.a(parcel, readInt11);
                            break;
                        case '\b':
                            account2 = (Account) o8.g(parcel, readInt11, Account.CREATOR);
                            break;
                        case '\t':
                        default:
                            o8.y(parcel, readInt11);
                            break;
                        case '\n':
                            cVarArr2 = (u5.c[]) o8.k(parcel, readInt11, u5.c.CREATOR);
                            break;
                        case 11:
                            cVarArr3 = (u5.c[]) o8.k(parcel, readInt11, u5.c.CREATOR);
                            break;
                        case '\f':
                            z28 = o8.n(parcel, readInt11);
                            break;
                        case '\r':
                            i28 = o8.u(parcel, readInt11);
                            break;
                        case 14:
                            z29 = o8.n(parcel, readInt11);
                            break;
                        case 15:
                            str6 = o8.h(parcel, readInt11);
                            break;
                    }
                }
                o8.m(parcel, z27);
                return new x5.f(i25, i26, i27, str5, iBinder2, scopeArr, bundle2, account2, cVarArr2, cVarArr3, z28, i28, z29, str6);
            case 12:
                int z30 = o8.z(parcel);
                String str7 = null;
                String str8 = null;
                String str9 = null;
                String str10 = null;
                x8.a aVar2 = null;
                String str11 = null;
                Bundle bundle3 = null;
                while (parcel.dataPosition() < z30) {
                    int readInt12 = parcel.readInt();
                    switch ((char) readInt12) {
                        case 1:
                            str7 = o8.h(parcel, readInt12);
                            break;
                        case 2:
                            str8 = o8.h(parcel, readInt12);
                            break;
                        case 3:
                            str9 = o8.h(parcel, readInt12);
                            break;
                        case 4:
                            str10 = o8.h(parcel, readInt12);
                            break;
                        case 5:
                            aVar2 = (x8.a) o8.g(parcel, readInt12, x8.a.CREATOR);
                            break;
                        case 6:
                            str11 = o8.h(parcel, readInt12);
                            break;
                        case 7:
                            bundle3 = o8.a(parcel, readInt12);
                            break;
                        default:
                            o8.y(parcel, readInt12);
                            break;
                    }
                }
                o8.m(parcel, z30);
                return new x8.b(str7, str8, str9, str10, aVar2, str11, bundle3);
            case 13:
                int z31 = o8.z(parcel);
                String str12 = null;
                String str13 = null;
                byte[] bArr2 = null;
                int i29 = 0;
                boolean z32 = false;
                boolean z33 = false;
                while (parcel.dataPosition() < z31) {
                    int readInt13 = parcel.readInt();
                    switch ((char) readInt13) {
                        case 1:
                            i29 = o8.u(parcel, readInt13);
                            break;
                        case 2:
                            z32 = o8.n(parcel, readInt13);
                            break;
                        case 3:
                            str12 = o8.h(parcel, readInt13);
                            break;
                        case 4:
                            str13 = o8.h(parcel, readInt13);
                            break;
                        case 5:
                            bArr2 = o8.b(parcel, readInt13);
                            break;
                        case 6:
                            z33 = o8.n(parcel, readInt13);
                            break;
                        default:
                            o8.y(parcel, readInt13);
                            break;
                    }
                }
                o8.m(parcel, z31);
                return new x8.a(i29, z32, str12, str13, bArr2, z33);
            case 14:
                int z34 = o8.z(parcel);
                Intent intent = null;
                int i30 = 0;
                int i31 = 0;
                while (parcel.dataPosition() < z34) {
                    int readInt14 = parcel.readInt();
                    char c18 = (char) readInt14;
                    if (c18 == 1) {
                        i30 = o8.u(parcel, readInt14);
                    } else if (c18 == 2) {
                        i31 = o8.u(parcel, readInt14);
                    } else if (c18 != 3) {
                        o8.y(parcel, readInt14);
                    } else {
                        intent = (Intent) o8.g(parcel, readInt14, Intent.CREATOR);
                    }
                }
                o8.m(parcel, z34);
                return new y7.b(i30, i31, intent);
            case 15:
                int z35 = o8.z(parcel);
                ArrayList arrayList2 = null;
                String str14 = null;
                while (parcel.dataPosition() < z35) {
                    int readInt15 = parcel.readInt();
                    char c19 = (char) readInt15;
                    if (c19 == 1) {
                        arrayList2 = o8.j(parcel, readInt15);
                    } else if (c19 != 2) {
                        o8.y(parcel, readInt15);
                    } else {
                        str14 = o8.h(parcel, readInt15);
                    }
                }
                o8.m(parcel, z35);
                return new y7.f(str14, arrayList2);
            case 16:
                int z36 = o8.z(parcel);
                u uVar = null;
                int i32 = 0;
                while (parcel.dataPosition() < z36) {
                    int readInt16 = parcel.readInt();
                    char c20 = (char) readInt16;
                    if (c20 == 1) {
                        i32 = o8.u(parcel, readInt16);
                    } else if (c20 != 2) {
                        o8.y(parcel, readInt16);
                    } else {
                        uVar = (u) o8.g(parcel, readInt16, u.CREATOR);
                    }
                }
                o8.m(parcel, z36);
                return new y7.g(i32, uVar);
            case 17:
                int z37 = o8.z(parcel);
                u5.a aVar3 = null;
                v vVar = null;
                int i33 = 0;
                while (parcel.dataPosition() < z37) {
                    int readInt17 = parcel.readInt();
                    char c21 = (char) readInt17;
                    if (c21 == 1) {
                        i33 = o8.u(parcel, readInt17);
                    } else if (c21 == 2) {
                        aVar3 = (u5.a) o8.g(parcel, readInt17, u5.a.CREATOR);
                    } else if (c21 != 3) {
                        o8.y(parcel, readInt17);
                    } else {
                        vVar = (v) o8.g(parcel, readInt17, v.CREATOR);
                    }
                }
                o8.m(parcel, z37);
                return new y7.h(i33, aVar3, vVar);
            case 18:
                int z38 = o8.z(parcel);
                z6.g[] gVarArr = null;
                String str15 = null;
                Account account3 = null;
                boolean z39 = false;
                while (parcel.dataPosition() < z38) {
                    int readInt18 = parcel.readInt();
                    char c22 = (char) readInt18;
                    if (c22 == 1) {
                        gVarArr = (z6.g[]) o8.k(parcel, readInt18, z6.g.CREATOR);
                    } else if (c22 == 2) {
                        str15 = o8.h(parcel, readInt18);
                    } else if (c22 == 3) {
                        z39 = o8.n(parcel, readInt18);
                    } else if (c22 != 4) {
                        o8.y(parcel, readInt18);
                    } else {
                        account3 = (Account) o8.g(parcel, readInt18, Account.CREATOR);
                    }
                }
                o8.m(parcel, z38);
                return new z6.e(gVarArr, str15, z39, account3);
            case 19:
                int z40 = o8.z(parcel);
                String str16 = null;
                String str17 = null;
                String str18 = null;
                while (parcel.dataPosition() < z40) {
                    int readInt19 = parcel.readInt();
                    char c23 = (char) readInt19;
                    if (c23 == 1) {
                        str16 = o8.h(parcel, readInt19);
                    } else if (c23 == 2) {
                        str17 = o8.h(parcel, readInt19);
                    } else if (c23 != 3) {
                        o8.y(parcel, readInt19);
                    } else {
                        str18 = o8.h(parcel, readInt19);
                    }
                }
                o8.m(parcel, z40);
                return new z6.f(str16, str17, str18);
            case 20:
                int z41 = o8.z(parcel);
                String str19 = null;
                k kVar = null;
                byte[] bArr3 = null;
                int i34 = -1;
                while (parcel.dataPosition() < z41) {
                    int readInt20 = parcel.readInt();
                    char c24 = (char) readInt20;
                    if (c24 == 1) {
                        str19 = o8.h(parcel, readInt20);
                    } else if (c24 == 3) {
                        kVar = (k) o8.g(parcel, readInt20, k.CREATOR);
                    } else if (c24 == 4) {
                        i34 = o8.u(parcel, readInt20);
                    } else if (c24 != 5) {
                        o8.y(parcel, readInt20);
                    } else {
                        bArr3 = o8.b(parcel, readInt20);
                    }
                }
                o8.m(parcel, z41);
                return new z6.g(str19, kVar, i34, bArr3);
            case 21:
                int z42 = o8.z(parcel);
                int i35 = 0;
                Bundle bundle4 = null;
                while (parcel.dataPosition() < z42) {
                    int readInt21 = parcel.readInt();
                    char c25 = (char) readInt21;
                    if (c25 == 1) {
                        i35 = o8.u(parcel, readInt21);
                    } else if (c25 != 2) {
                        o8.y(parcel, readInt21);
                    } else {
                        bundle4 = o8.a(parcel, readInt21);
                    }
                }
                o8.m(parcel, z42);
                return new z6.h(i35, bundle4);
            case 22:
                int z43 = o8.z(parcel);
                Status status = null;
                ArrayList arrayList3 = null;
                String[] strArr = null;
                while (parcel.dataPosition() < z43) {
                    int readInt22 = parcel.readInt();
                    char c26 = (char) readInt22;
                    if (c26 == 1) {
                        status = (Status) o8.g(parcel, readInt22, Status.CREATOR);
                    } else if (c26 == 2) {
                        arrayList3 = o8.l(parcel, readInt22, m.CREATOR);
                    } else if (c26 != 3) {
                        o8.y(parcel, readInt22);
                    } else {
                        strArr = o8.i(parcel, readInt22);
                    }
                }
                o8.m(parcel, z43);
                z6.i iVar = new z6.i();
                iVar.a = status;
                iVar.b = arrayList3;
                iVar.c = strArr;
                return iVar;
            case 23:
                int z44 = o8.z(parcel);
                String str20 = null;
                String str21 = null;
                String str22 = null;
                z6.h[] hVarArr = null;
                String str23 = null;
                l lVar = null;
                boolean z45 = false;
                int i36 = 1;
                boolean z46 = false;
                while (parcel.dataPosition() < z44) {
                    int readInt23 = parcel.readInt();
                    char c27 = (char) readInt23;
                    if (c27 == 11) {
                        str23 = o8.h(parcel, readInt23);
                    } else if (c27 != '\f') {
                        switch (c27) {
                            case 1:
                                str20 = o8.h(parcel, readInt23);
                                break;
                            case 2:
                                str21 = o8.h(parcel, readInt23);
                                break;
                            case 3:
                                z45 = o8.n(parcel, readInt23);
                                break;
                            case 4:
                                i36 = o8.u(parcel, readInt23);
                                break;
                            case 5:
                                z46 = o8.n(parcel, readInt23);
                                break;
                            case 6:
                                str22 = o8.h(parcel, readInt23);
                                break;
                            case 7:
                                hVarArr = (z6.h[]) o8.k(parcel, readInt23, z6.h.CREATOR);
                                break;
                            default:
                                o8.y(parcel, readInt23);
                                break;
                        }
                    } else {
                        lVar = (l) o8.g(parcel, readInt23, l.CREATOR);
                    }
                }
                o8.m(parcel, z44);
                return new k(str20, str21, z45, i36, z46, str22, hVarArr, str23, lVar);
            case 24:
                int z47 = o8.z(parcel);
                boolean z48 = false;
                while (parcel.dataPosition() < z47) {
                    int readInt24 = parcel.readInt();
                    if (((char) readInt24) != 1) {
                        o8.y(parcel, readInt24);
                    } else {
                        z48 = o8.n(parcel, readInt24);
                    }
                }
                o8.m(parcel, z47);
                return new l(z48);
            default:
                int z49 = o8.z(parcel);
                z6.f fVar = null;
                String str24 = null;
                z6.e eVar2 = null;
                String str25 = null;
                long j13 = 0;
                int i37 = 0;
                boolean z50 = false;
                int i38 = -1;
                int i39 = 0;
                while (parcel.dataPosition() < z49) {
                    int readInt25 = parcel.readInt();
                    switch ((char) readInt25) {
                        case 1:
                            fVar = (z6.f) o8.g(parcel, readInt25, z6.f.CREATOR);
                            break;
                        case 2:
                            j13 = o8.w(parcel, readInt25);
                            break;
                        case 3:
                            i37 = o8.u(parcel, readInt25);
                            break;
                        case 4:
                            str24 = o8.h(parcel, readInt25);
                            break;
                        case 5:
                            eVar2 = (z6.e) o8.g(parcel, readInt25, z6.e.CREATOR);
                            break;
                        case 6:
                            z50 = o8.n(parcel, readInt25);
                            break;
                        case 7:
                            i38 = o8.u(parcel, readInt25);
                            break;
                        case '\b':
                            i39 = o8.u(parcel, readInt25);
                            break;
                        case '\t':
                            str25 = o8.h(parcel, readInt25);
                            break;
                        default:
                            o8.y(parcel, readInt25);
                            break;
                    }
                }
                o8.m(parcel, z49);
                return new m(fVar, j13, i37, str24, eVar2, z50, i38, i39, str25);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i9) {
        switch (this.a) {
            case 0:
                return new h[i9];
            case 1:
                return new b[i9];
            case 2:
                return new x5.d[i9];
            case 3:
                return new o[i9];
            case 4:
                return new j[i9];
            case 5:
                return new u[i9];
            case 6:
                return new v[i9];
            case 7:
                return new n[i9];
            case 8:
                return new BinderWrapper[i9];
            case 9:
                return new f0[i9];
            case 10:
                return new x5.e[i9];
            case 11:
                return new x5.f[i9];
            case 12:
                return new x8.b[i9];
            case 13:
                return new x8.a[i9];
            case 14:
                return new y7.b[i9];
            case 15:
                return new y7.f[i9];
            case 16:
                return new y7.g[i9];
            case 17:
                return new y7.h[i9];
            case 18:
                return new z6.e[i9];
            case 19:
                return new z6.f[i9];
            case 20:
                return new z6.g[i9];
            case 21:
                return new z6.h[i9];
            case 22:
                return new z6.i[i9];
            case 23:
                return new k[i9];
            case 24:
                return new l[i9];
            default:
                return new m[i9];
        }
    }
}
