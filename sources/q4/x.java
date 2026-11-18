package q4;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import c8.ac;
import c8.bc;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.BinderWrapper;
import java.util.ArrayList;
import q6.h0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class x implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ x(int i7) {
        this.a = i7;
    }

    public static void a(q6.g gVar, Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        int i10 = gVar.a;
        bc.q(parcel, 1, 4);
        parcel.writeInt(i10);
        int i11 = gVar.b;
        bc.q(parcel, 2, 4);
        parcel.writeInt(i11);
        int i12 = gVar.c;
        bc.q(parcel, 3, 4);
        parcel.writeInt(i12);
        bc.l(parcel, 4, gVar.d);
        bc.f(parcel, 5, gVar.e);
        bc.o(parcel, 6, gVar.f, i7);
        bc.b(parcel, 7, gVar.h);
        bc.k(parcel, 8, gVar.n, i7);
        bc.o(parcel, 10, gVar.r, i7);
        bc.o(parcel, 11, gVar.s, i7);
        boolean z10 = gVar.w;
        bc.q(parcel, 12, 4);
        parcel.writeInt(z10 ? 1 : 0);
        int i13 = gVar.x;
        bc.q(parcel, 13, 4);
        parcel.writeInt(i13);
        boolean z11 = gVar.y;
        bc.q(parcel, 14, 4);
        parcel.writeInt(z11 ? 1 : 0);
        bc.l(parcel, 15, gVar.E);
        bc.s(parcel, r10);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                return new y(parcel.readInt(), parcel.readFloat());
            case 1:
                int z10 = ac.z(parcel);
                String str = null;
                int i7 = 0;
                while (parcel.dataPosition() < z10) {
                    int readInt = parcel.readInt();
                    char c10 = (char) readInt;
                    if (c10 == 1) {
                        i7 = ac.u(parcel, readInt);
                    } else if (c10 != 2) {
                        ac.y(parcel, readInt);
                    } else {
                        str = ac.h(parcel, readInt);
                    }
                }
                ac.m(parcel, z10);
                return new q6.e(i7, str);
            case 2:
                int z11 = ac.z(parcel);
                ArrayList arrayList = null;
                int i10 = 0;
                while (parcel.dataPosition() < z11) {
                    int readInt2 = parcel.readInt();
                    char c11 = (char) readInt2;
                    if (c11 == 1) {
                        i10 = ac.u(parcel, readInt2);
                    } else if (c11 != 2) {
                        ac.y(parcel, readInt2);
                    } else {
                        arrayList = ac.l(parcel, readInt2, q6.k.CREATOR);
                    }
                }
                ac.m(parcel, z11);
                return new q6.p(i10, arrayList);
            case 3:
                int z12 = ac.z(parcel);
                int i11 = 0;
                int i12 = 0;
                boolean z13 = false;
                long j3 = 0;
                String str2 = null;
                while (parcel.dataPosition() < z12) {
                    int readInt3 = parcel.readInt();
                    char c12 = (char) readInt3;
                    if (c12 == 1) {
                        i11 = ac.u(parcel, readInt3);
                    } else if (c12 == 2) {
                        str2 = ac.h(parcel, readInt3);
                    } else if (c12 == 3) {
                        j3 = ac.w(parcel, readInt3);
                    } else if (c12 == 4) {
                        i12 = ac.u(parcel, readInt3);
                    } else if (c12 != 5) {
                        ac.y(parcel, readInt3);
                    } else {
                        z13 = ac.n(parcel, readInt3);
                    }
                }
                ac.m(parcel, z12);
                return new q6.r(i11, i12, j3, str2, z13);
            case 4:
                int z14 = ac.z(parcel);
                int i13 = -1;
                int i14 = 0;
                int i15 = 0;
                int i16 = 0;
                int i17 = 0;
                String str3 = null;
                String str4 = null;
                long j10 = 0;
                long j11 = 0;
                while (parcel.dataPosition() < z14) {
                    int readInt4 = parcel.readInt();
                    switch ((char) readInt4) {
                        case 1:
                            i14 = ac.u(parcel, readInt4);
                            break;
                        case 2:
                            i15 = ac.u(parcel, readInt4);
                            break;
                        case 3:
                            i16 = ac.u(parcel, readInt4);
                            break;
                        case 4:
                            j10 = ac.w(parcel, readInt4);
                            break;
                        case 5:
                            j11 = ac.w(parcel, readInt4);
                            break;
                        case 6:
                            str3 = ac.h(parcel, readInt4);
                            break;
                        case 7:
                            str4 = ac.h(parcel, readInt4);
                            break;
                        case '\b':
                            i17 = ac.u(parcel, readInt4);
                            break;
                        case '\t':
                            i13 = ac.u(parcel, readInt4);
                            break;
                        default:
                            ac.y(parcel, readInt4);
                            break;
                    }
                }
                ac.m(parcel, z14);
                return new q6.k(i14, i15, i16, j10, j11, str3, str4, i17, i13);
            case 5:
                int z15 = ac.z(parcel);
                Account account = null;
                int i18 = 0;
                int i19 = 0;
                GoogleSignInAccount googleSignInAccount = null;
                while (parcel.dataPosition() < z15) {
                    int readInt5 = parcel.readInt();
                    char c13 = (char) readInt5;
                    if (c13 == 1) {
                        i18 = ac.u(parcel, readInt5);
                    } else if (c13 == 2) {
                        account = (Account) ac.g(parcel, readInt5, Account.CREATOR);
                    } else if (c13 == 3) {
                        i19 = ac.u(parcel, readInt5);
                    } else if (c13 != 4) {
                        ac.y(parcel, readInt5);
                    } else {
                        googleSignInAccount = (GoogleSignInAccount) ac.g(parcel, readInt5, GoogleSignInAccount.CREATOR);
                    }
                }
                ac.m(parcel, z15);
                return new q6.w(i18, account, i19, googleSignInAccount);
            case 6:
                int z16 = ac.z(parcel);
                int i20 = 0;
                boolean z17 = false;
                boolean z18 = false;
                IBinder iBinder = null;
                n6.a aVar = null;
                while (parcel.dataPosition() < z16) {
                    int readInt6 = parcel.readInt();
                    char c14 = (char) readInt6;
                    if (c14 == 1) {
                        i20 = ac.u(parcel, readInt6);
                    } else if (c14 == 2) {
                        iBinder = ac.t(parcel, readInt6);
                    } else if (c14 == 3) {
                        aVar = (n6.a) ac.g(parcel, readInt6, n6.a.CREATOR);
                    } else if (c14 == 4) {
                        z17 = ac.n(parcel, readInt6);
                    } else if (c14 != 5) {
                        ac.y(parcel, readInt6);
                    } else {
                        z18 = ac.n(parcel, readInt6);
                    }
                }
                ac.m(parcel, z16);
                return new q6.x(i20, iBinder, aVar, z17, z18);
            case 7:
                int z19 = ac.z(parcel);
                int i21 = 0;
                int i22 = 0;
                int i23 = 0;
                boolean z20 = false;
                boolean z21 = false;
                while (parcel.dataPosition() < z19) {
                    int readInt7 = parcel.readInt();
                    char c15 = (char) readInt7;
                    if (c15 == 1) {
                        i21 = ac.u(parcel, readInt7);
                    } else if (c15 == 2) {
                        z20 = ac.n(parcel, readInt7);
                    } else if (c15 == 3) {
                        z21 = ac.n(parcel, readInt7);
                    } else if (c15 == 4) {
                        i22 = ac.u(parcel, readInt7);
                    } else if (c15 != 5) {
                        ac.y(parcel, readInt7);
                    } else {
                        i23 = ac.u(parcel, readInt7);
                    }
                }
                ac.m(parcel, z19);
                return new q6.o(i21, i22, i23, z20, z21);
            case 8:
                return new BinderWrapper(parcel);
            case 9:
                int z22 = ac.z(parcel);
                Bundle bundle = null;
                q6.f fVar = null;
                int i24 = 0;
                n6.c[] cVarArr = null;
                while (parcel.dataPosition() < z22) {
                    int readInt8 = parcel.readInt();
                    char c16 = (char) readInt8;
                    if (c16 == 1) {
                        bundle = ac.a(parcel, readInt8);
                    } else if (c16 == 2) {
                        cVarArr = (n6.c[]) ac.k(parcel, readInt8, n6.c.CREATOR);
                    } else if (c16 == 3) {
                        i24 = ac.u(parcel, readInt8);
                    } else if (c16 != 4) {
                        ac.y(parcel, readInt8);
                    } else {
                        fVar = (q6.f) ac.g(parcel, readInt8, q6.f.CREATOR);
                    }
                }
                ac.m(parcel, z22);
                h0 h0Var = new h0();
                h0Var.a = bundle;
                h0Var.b = cVarArr;
                h0Var.c = i24;
                h0Var.d = fVar;
                return h0Var;
            case 10:
                int z23 = ac.z(parcel);
                q6.o oVar = null;
                int[] iArr = null;
                int[] iArr2 = null;
                boolean z24 = false;
                boolean z25 = false;
                int i25 = 0;
                while (parcel.dataPosition() < z23) {
                    int readInt9 = parcel.readInt();
                    switch ((char) readInt9) {
                        case 1:
                            oVar = (q6.o) ac.g(parcel, readInt9, q6.o.CREATOR);
                            break;
                        case 2:
                            z24 = ac.n(parcel, readInt9);
                            break;
                        case 3:
                            z25 = ac.n(parcel, readInt9);
                            break;
                        case 4:
                            iArr = ac.d(parcel, readInt9);
                            break;
                        case 5:
                            i25 = ac.u(parcel, readInt9);
                            break;
                        case 6:
                            iArr2 = ac.d(parcel, readInt9);
                            break;
                        default:
                            ac.y(parcel, readInt9);
                            break;
                    }
                }
                ac.m(parcel, z23);
                return new q6.f(oVar, z24, z25, iArr, i25, iArr2);
            case 11:
                int z26 = ac.z(parcel);
                Bundle bundle2 = new Bundle();
                Scope[] scopeArr = q6.g.F;
                String str5 = null;
                IBinder iBinder2 = null;
                Account account2 = null;
                String str6 = null;
                int i26 = 0;
                int i27 = 0;
                int i28 = 0;
                boolean z27 = false;
                int i29 = 0;
                boolean z28 = false;
                n6.c[] cVarArr2 = q6.g.G;
                n6.c[] cVarArr3 = cVarArr2;
                while (parcel.dataPosition() < z26) {
                    int readInt10 = parcel.readInt();
                    switch ((char) readInt10) {
                        case 1:
                            i26 = ac.u(parcel, readInt10);
                            break;
                        case 2:
                            i27 = ac.u(parcel, readInt10);
                            break;
                        case 3:
                            i28 = ac.u(parcel, readInt10);
                            break;
                        case 4:
                            str5 = ac.h(parcel, readInt10);
                            break;
                        case 5:
                            iBinder2 = ac.t(parcel, readInt10);
                            break;
                        case 6:
                            scopeArr = (Scope[]) ac.k(parcel, readInt10, Scope.CREATOR);
                            break;
                        case 7:
                            bundle2 = ac.a(parcel, readInt10);
                            break;
                        case '\b':
                            account2 = (Account) ac.g(parcel, readInt10, Account.CREATOR);
                            break;
                        case '\t':
                        default:
                            ac.y(parcel, readInt10);
                            break;
                        case '\n':
                            cVarArr2 = (n6.c[]) ac.k(parcel, readInt10, n6.c.CREATOR);
                            break;
                        case 11:
                            cVarArr3 = (n6.c[]) ac.k(parcel, readInt10, n6.c.CREATOR);
                            break;
                        case '\f':
                            z27 = ac.n(parcel, readInt10);
                            break;
                        case '\r':
                            i29 = ac.u(parcel, readInt10);
                            break;
                        case 14:
                            z28 = ac.n(parcel, readInt10);
                            break;
                        case 15:
                            str6 = ac.h(parcel, readInt10);
                            break;
                    }
                }
                ac.m(parcel, z26);
                return new q6.g(i26, i27, i28, str5, iBinder2, scopeArr, bundle2, account2, cVarArr2, cVarArr3, z27, i29, z28, str6);
            case 12:
                int z29 = ac.z(parcel);
                Intent intent = null;
                int i30 = 0;
                int i31 = 0;
                while (parcel.dataPosition() < z29) {
                    int readInt11 = parcel.readInt();
                    char c17 = (char) readInt11;
                    if (c17 == 1) {
                        i30 = ac.u(parcel, readInt11);
                    } else if (c17 == 2) {
                        i31 = ac.u(parcel, readInt11);
                    } else if (c17 != 3) {
                        ac.y(parcel, readInt11);
                    } else {
                        intent = (Intent) ac.g(parcel, readInt11, Intent.CREATOR);
                    }
                }
                ac.m(parcel, z29);
                return new r8.b(i30, i31, intent);
            case 13:
                int z30 = ac.z(parcel);
                ArrayList arrayList2 = null;
                String str7 = null;
                while (parcel.dataPosition() < z30) {
                    int readInt12 = parcel.readInt();
                    char c18 = (char) readInt12;
                    if (c18 == 1) {
                        arrayList2 = ac.j(parcel, readInt12);
                    } else if (c18 != 2) {
                        ac.y(parcel, readInt12);
                    } else {
                        str7 = ac.h(parcel, readInt12);
                    }
                }
                ac.m(parcel, z30);
                return new r8.f(str7, arrayList2);
            case 14:
                int z31 = ac.z(parcel);
                q6.w wVar = null;
                int i32 = 0;
                while (parcel.dataPosition() < z31) {
                    int readInt13 = parcel.readInt();
                    char c19 = (char) readInt13;
                    if (c19 == 1) {
                        i32 = ac.u(parcel, readInt13);
                    } else if (c19 != 2) {
                        ac.y(parcel, readInt13);
                    } else {
                        wVar = (q6.w) ac.g(parcel, readInt13, q6.w.CREATOR);
                    }
                }
                ac.m(parcel, z31);
                return new r8.g(i32, wVar);
            case 15:
                int z32 = ac.z(parcel);
                n6.a aVar2 = null;
                int i33 = 0;
                q6.x xVar = null;
                while (parcel.dataPosition() < z32) {
                    int readInt14 = parcel.readInt();
                    char c20 = (char) readInt14;
                    if (c20 == 1) {
                        i33 = ac.u(parcel, readInt14);
                    } else if (c20 == 2) {
                        aVar2 = (n6.a) ac.g(parcel, readInt14, n6.a.CREATOR);
                    } else if (c20 != 3) {
                        ac.y(parcel, readInt14);
                    } else {
                        xVar = (q6.x) ac.g(parcel, readInt14, q6.x.CREATOR);
                    }
                }
                ac.m(parcel, z32);
                return new r8.h(i33, aVar2, xVar);
            case 16:
                int z33 = ac.z(parcel);
                s7.g[] gVarArr = null;
                Account account3 = null;
                boolean z34 = false;
                String str8 = null;
                while (parcel.dataPosition() < z33) {
                    int readInt15 = parcel.readInt();
                    char c21 = (char) readInt15;
                    if (c21 == 1) {
                        gVarArr = (s7.g[]) ac.k(parcel, readInt15, s7.g.CREATOR);
                    } else if (c21 == 2) {
                        str8 = ac.h(parcel, readInt15);
                    } else if (c21 == 3) {
                        z34 = ac.n(parcel, readInt15);
                    } else if (c21 != 4) {
                        ac.y(parcel, readInt15);
                    } else {
                        account3 = (Account) ac.g(parcel, readInt15, Account.CREATOR);
                    }
                }
                ac.m(parcel, z33);
                return new s7.e(gVarArr, str8, z34, account3);
            case 17:
                int z35 = ac.z(parcel);
                String str9 = null;
                String str10 = null;
                String str11 = null;
                while (parcel.dataPosition() < z35) {
                    int readInt16 = parcel.readInt();
                    char c22 = (char) readInt16;
                    if (c22 == 1) {
                        str9 = ac.h(parcel, readInt16);
                    } else if (c22 == 2) {
                        str10 = ac.h(parcel, readInt16);
                    } else if (c22 != 3) {
                        ac.y(parcel, readInt16);
                    } else {
                        str11 = ac.h(parcel, readInt16);
                    }
                }
                ac.m(parcel, z35);
                return new s7.f(str9, str10, str11);
            case 18:
                int z36 = ac.z(parcel);
                String str12 = null;
                byte[] bArr = null;
                int i34 = -1;
                s7.k kVar = null;
                while (parcel.dataPosition() < z36) {
                    int readInt17 = parcel.readInt();
                    char c23 = (char) readInt17;
                    if (c23 == 1) {
                        str12 = ac.h(parcel, readInt17);
                    } else if (c23 == 3) {
                        kVar = (s7.k) ac.g(parcel, readInt17, s7.k.CREATOR);
                    } else if (c23 == 4) {
                        i34 = ac.u(parcel, readInt17);
                    } else if (c23 != 5) {
                        ac.y(parcel, readInt17);
                    } else {
                        bArr = ac.b(parcel, readInt17);
                    }
                }
                ac.m(parcel, z36);
                return new s7.g(str12, kVar, i34, bArr);
            case 19:
                int z37 = ac.z(parcel);
                int i35 = 0;
                Bundle bundle3 = null;
                while (parcel.dataPosition() < z37) {
                    int readInt18 = parcel.readInt();
                    char c24 = (char) readInt18;
                    if (c24 == 1) {
                        i35 = ac.u(parcel, readInt18);
                    } else if (c24 != 2) {
                        ac.y(parcel, readInt18);
                    } else {
                        bundle3 = ac.a(parcel, readInt18);
                    }
                }
                ac.m(parcel, z37);
                return new s7.h(i35, bundle3);
            case 20:
                int z38 = ac.z(parcel);
                Status status = null;
                ArrayList arrayList3 = null;
                String[] strArr = null;
                while (parcel.dataPosition() < z38) {
                    int readInt19 = parcel.readInt();
                    char c25 = (char) readInt19;
                    if (c25 == 1) {
                        status = (Status) ac.g(parcel, readInt19, Status.CREATOR);
                    } else if (c25 == 2) {
                        arrayList3 = ac.l(parcel, readInt19, s7.m.CREATOR);
                    } else if (c25 != 3) {
                        ac.y(parcel, readInt19);
                    } else {
                        strArr = ac.i(parcel, readInt19);
                    }
                }
                ac.m(parcel, z38);
                s7.i iVar = new s7.i();
                iVar.a = status;
                iVar.b = arrayList3;
                iVar.c = strArr;
                return iVar;
            case 21:
                int z39 = ac.z(parcel);
                String str13 = null;
                String str14 = null;
                String str15 = null;
                s7.h[] hVarArr = null;
                String str16 = null;
                s7.l lVar = null;
                boolean z40 = false;
                boolean z41 = false;
                int i36 = 1;
                while (parcel.dataPosition() < z39) {
                    int readInt20 = parcel.readInt();
                    char c26 = (char) readInt20;
                    if (c26 == 11) {
                        str16 = ac.h(parcel, readInt20);
                    } else if (c26 != '\f') {
                        switch (c26) {
                            case 1:
                                str13 = ac.h(parcel, readInt20);
                                break;
                            case 2:
                                str14 = ac.h(parcel, readInt20);
                                break;
                            case 3:
                                z40 = ac.n(parcel, readInt20);
                                break;
                            case 4:
                                i36 = ac.u(parcel, readInt20);
                                break;
                            case 5:
                                z41 = ac.n(parcel, readInt20);
                                break;
                            case 6:
                                str15 = ac.h(parcel, readInt20);
                                break;
                            case 7:
                                hVarArr = (s7.h[]) ac.k(parcel, readInt20, s7.h.CREATOR);
                                break;
                            default:
                                ac.y(parcel, readInt20);
                                break;
                        }
                    } else {
                        lVar = (s7.l) ac.g(parcel, readInt20, s7.l.CREATOR);
                    }
                }
                ac.m(parcel, z39);
                return new s7.k(str13, str14, z40, i36, z41, str15, hVarArr, str16, lVar);
            case 22:
                int z42 = ac.z(parcel);
                boolean z43 = false;
                while (parcel.dataPosition() < z42) {
                    int readInt21 = parcel.readInt();
                    if (((char) readInt21) != 1) {
                        ac.y(parcel, readInt21);
                    } else {
                        z43 = ac.n(parcel, readInt21);
                    }
                }
                ac.m(parcel, z42);
                return new s7.l(z43);
            case 23:
                int z44 = ac.z(parcel);
                s7.f fVar2 = null;
                String str17 = null;
                s7.e eVar = null;
                String str18 = null;
                long j12 = 0;
                int i37 = 0;
                boolean z45 = false;
                int i38 = 0;
                int i39 = -1;
                while (parcel.dataPosition() < z44) {
                    int readInt22 = parcel.readInt();
                    switch ((char) readInt22) {
                        case 1:
                            fVar2 = (s7.f) ac.g(parcel, readInt22, s7.f.CREATOR);
                            break;
                        case 2:
                            j12 = ac.w(parcel, readInt22);
                            break;
                        case 3:
                            i37 = ac.u(parcel, readInt22);
                            break;
                        case 4:
                            str17 = ac.h(parcel, readInt22);
                            break;
                        case 5:
                            eVar = (s7.e) ac.g(parcel, readInt22, s7.e.CREATOR);
                            break;
                        case 6:
                            z45 = ac.n(parcel, readInt22);
                            break;
                        case 7:
                            i39 = ac.u(parcel, readInt22);
                            break;
                        case '\b':
                            i38 = ac.u(parcel, readInt22);
                            break;
                        case '\t':
                            str18 = ac.h(parcel, readInt22);
                            break;
                        default:
                            ac.y(parcel, readInt22);
                            break;
                    }
                }
                ac.m(parcel, z44);
                return new s7.m(fVar2, j12, i37, str17, eVar, z45, i39, i38, str18);
            case 24:
                int z46 = ac.z(parcel);
                String str19 = null;
                String str20 = null;
                String str21 = null;
                String str22 = null;
                t9.a aVar3 = null;
                String str23 = null;
                Bundle bundle4 = null;
                while (parcel.dataPosition() < z46) {
                    int readInt23 = parcel.readInt();
                    switch ((char) readInt23) {
                        case 1:
                            str19 = ac.h(parcel, readInt23);
                            break;
                        case 2:
                            str20 = ac.h(parcel, readInt23);
                            break;
                        case 3:
                            str21 = ac.h(parcel, readInt23);
                            break;
                        case 4:
                            str22 = ac.h(parcel, readInt23);
                            break;
                        case 5:
                            aVar3 = (t9.a) ac.g(parcel, readInt23, t9.a.CREATOR);
                            break;
                        case 6:
                            str23 = ac.h(parcel, readInt23);
                            break;
                        case 7:
                            bundle4 = ac.a(parcel, readInt23);
                            break;
                        default:
                            ac.y(parcel, readInt23);
                            break;
                    }
                }
                ac.m(parcel, z46);
                return new t9.b(str19, str20, str21, str22, aVar3, str23, bundle4);
            case 25:
                int z47 = ac.z(parcel);
                int i40 = 0;
                boolean z48 = false;
                boolean z49 = false;
                String str24 = null;
                String str25 = null;
                byte[] bArr2 = null;
                while (parcel.dataPosition() < z47) {
                    int readInt24 = parcel.readInt();
                    switch ((char) readInt24) {
                        case 1:
                            i40 = ac.u(parcel, readInt24);
                            break;
                        case 2:
                            z48 = ac.n(parcel, readInt24);
                            break;
                        case 3:
                            str24 = ac.h(parcel, readInt24);
                            break;
                        case 4:
                            str25 = ac.h(parcel, readInt24);
                            break;
                        case 5:
                            bArr2 = ac.b(parcel, readInt24);
                            break;
                        case 6:
                            z49 = ac.n(parcel, readInt24);
                            break;
                        default:
                            ac.y(parcel, readInt24);
                            break;
                    }
                }
                ac.m(parcel, z47);
                return new t9.a(i40, z48, str24, str25, bArr2, z49);
            case 26:
                u0.h hVar = new u0.h(parcel);
                hVar.a = parcel.readInt();
                return hVar;
            case 27:
                int z50 = ac.z(parcel);
                boolean z51 = false;
                int i41 = 0;
                while (parcel.dataPosition() < z50) {
                    int readInt25 = parcel.readInt();
                    char c27 = (char) readInt25;
                    if (c27 == 1) {
                        z51 = ac.n(parcel, readInt25);
                    } else if (c27 != 2) {
                        ac.y(parcel, readInt25);
                    } else {
                        i41 = ac.u(parcel, readInt25);
                    }
                }
                ac.m(parcel, z50);
                return new u6.a(i41, z51);
            case 28:
                int z52 = ac.z(parcel);
                PendingIntent pendingIntent = null;
                while (parcel.dataPosition() < z52) {
                    int readInt26 = parcel.readInt();
                    if (((char) readInt26) != 1) {
                        ac.y(parcel, readInt26);
                    } else {
                        pendingIntent = (PendingIntent) ac.g(parcel, readInt26, PendingIntent.CREATOR);
                    }
                }
                ac.m(parcel, z52);
                return new u6.b(pendingIntent);
            default:
                int z53 = ac.z(parcel);
                int i42 = 0;
                boolean z54 = false;
                while (parcel.dataPosition() < z53) {
                    int readInt27 = parcel.readInt();
                    char c28 = (char) readInt27;
                    if (c28 == 1) {
                        i42 = ac.u(parcel, readInt27);
                    } else if (c28 != 2) {
                        ac.y(parcel, readInt27);
                    } else {
                        z54 = ac.n(parcel, readInt27);
                    }
                }
                ac.m(parcel, z53);
                return new u6.c(i42, z54);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i7) {
        switch (this.a) {
            case 0:
                return new y[i7];
            case 1:
                return new q6.e[i7];
            case 2:
                return new q6.p[i7];
            case 3:
                return new q6.r[i7];
            case 4:
                return new q6.k[i7];
            case 5:
                return new q6.w[i7];
            case 6:
                return new q6.x[i7];
            case 7:
                return new q6.o[i7];
            case 8:
                return new BinderWrapper[i7];
            case 9:
                return new h0[i7];
            case 10:
                return new q6.f[i7];
            case 11:
                return new q6.g[i7];
            case 12:
                return new r8.b[i7];
            case 13:
                return new r8.f[i7];
            case 14:
                return new r8.g[i7];
            case 15:
                return new r8.h[i7];
            case 16:
                return new s7.e[i7];
            case 17:
                return new s7.f[i7];
            case 18:
                return new s7.g[i7];
            case 19:
                return new s7.h[i7];
            case 20:
                return new s7.i[i7];
            case 21:
                return new s7.k[i7];
            case 22:
                return new s7.l[i7];
            case 23:
                return new s7.m[i7];
            case 24:
                return new t9.b[i7];
            case 25:
                return new t9.a[i7];
            case 26:
                return new u0.h[i7];
            case 27:
                return new u6.a[i7];
            case 28:
                return new u6.b[i7];
            default:
                return new u6.c[i7];
        }
    }
}
