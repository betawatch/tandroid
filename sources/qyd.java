// default package

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.BinderWrapper;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class qyd implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    public /* synthetic */ qyd(byte b) {
        this.a = b;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        long j = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        boolean z = false;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        boolean z2 = false;
        int i13 = 0;
        int i14 = 0;
        String str = null;
        String str2 = null;
        ArrayList arrayList = null;
        byte[] bArr = null;
        String str3 = null;
        String str4 = null;
        Status status = null;
        fse[] fseVarArr = null;
        kpd kpdVar = null;
        String str5 = null;
        String str6 = null;
        oed oedVar = null;
        String str7 = null;
        ArrayList arrayList2 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        switch (this.a) {
            case 0:
                int z3 = gte.z(parcel);
                while (parcel.dataPosition() < z3) {
                    gte.y(parcel, parcel.readInt());
                }
                gte.m(parcel, z3);
                return new mn5();
            case 1:
                int z4 = gte.z(parcel);
                String str13 = null;
                String str14 = null;
                String str15 = null;
                String str16 = null;
                me0 me0Var = null;
                me0 me0Var2 = null;
                while (parcel.dataPosition() < z4) {
                    int readInt = parcel.readInt();
                    switch ((char) readInt) {
                        case 2:
                            str = gte.h(parcel, readInt);
                            break;
                        case 3:
                            str13 = gte.h(parcel, readInt);
                            break;
                        case 4:
                            str14 = gte.h(parcel, readInt);
                            break;
                        case 5:
                            str15 = gte.h(parcel, readInt);
                            break;
                        case 6:
                            str16 = gte.h(parcel, readInt);
                            break;
                        case 7:
                            me0Var = (me0) gte.g(parcel, readInt, me0.CREATOR);
                            break;
                        case '\b':
                            me0Var2 = (me0) gte.g(parcel, readInt, me0.CREATOR);
                            break;
                        default:
                            gte.y(parcel, readInt);
                            break;
                    }
                }
                gte.m(parcel, z4);
                ne0 ne0Var = new ne0();
                ne0Var.a = str;
                ne0Var.b = str13;
                ne0Var.c = str14;
                ne0Var.d = str15;
                ne0Var.e = str16;
                ne0Var.f = me0Var;
                ne0Var.h = me0Var2;
                return ne0Var;
            case 2:
                int z5 = gte.z(parcel);
                boolean z6 = true;
                fbf fbfVar = null;
                byte[] bArr2 = null;
                int[] iArr = null;
                String[] strArr = null;
                int[] iArr2 = null;
                byte[][] bArr3 = null;
                m64[] m64VarArr = null;
                while (parcel.dataPosition() < z5) {
                    int readInt2 = parcel.readInt();
                    switch ((char) readInt2) {
                        case 2:
                            fbfVar = (fbf) gte.g(parcel, readInt2, fbf.CREATOR);
                            break;
                        case 3:
                            bArr2 = gte.b(parcel, readInt2);
                            break;
                        case 4:
                            iArr = gte.d(parcel, readInt2);
                            break;
                        case 5:
                            strArr = gte.i(parcel, readInt2);
                            break;
                        case 6:
                            iArr2 = gte.d(parcel, readInt2);
                            break;
                        case 7:
                            bArr3 = gte.c(parcel, readInt2);
                            break;
                        case '\b':
                            z6 = gte.n(parcel, readInt2);
                            break;
                        case '\t':
                            m64VarArr = (m64[]) gte.k(parcel, readInt2, m64.CREATOR);
                            break;
                        default:
                            gte.y(parcel, readInt2);
                            break;
                    }
                }
                gte.m(parcel, z5);
                return new mtd(fbfVar, bArr2, iArr, strArr, iArr2, bArr3, z6, m64VarArr);
            case 3:
                int z7 = gte.z(parcel);
                ArrayList arrayList3 = new ArrayList();
                String str17 = null;
                while (parcel.dataPosition() < z7) {
                    int readInt3 = parcel.readInt();
                    char c = (char) readInt3;
                    if (c == 2) {
                        str12 = gte.h(parcel, readInt3);
                    } else if (c == 3) {
                        str17 = gte.h(parcel, readInt3);
                    } else if (c != 4) {
                        gte.y(parcel, readInt3);
                    } else {
                        arrayList3 = gte.l(parcel, readInt3, tw5.CREATOR);
                    }
                }
                gte.m(parcel, z7);
                uw5 uw5Var = new uw5();
                uw5Var.a = str12;
                uw5Var.b = str17;
                uw5Var.c = arrayList3;
                return uw5Var;
            case 4:
                int z8 = gte.z(parcel);
                int i15 = 0;
                while (parcel.dataPosition() < z8) {
                    int readInt4 = parcel.readInt();
                    char c2 = (char) readInt4;
                    if (c2 == 1) {
                        str11 = gte.h(parcel, readInt4);
                    } else if (c2 == 2) {
                        i = gte.u(parcel, readInt4);
                    } else if (c2 != 3) {
                        gte.y(parcel, readInt4);
                    } else {
                        i15 = gte.u(parcel, readInt4);
                    }
                }
                gte.m(parcel, z8);
                return new zle(str11, i, i15);
            case 5:
                int z9 = gte.z(parcel);
                byte[] bArr4 = null;
                String str18 = null;
                while (parcel.dataPosition() < z9) {
                    int readInt5 = parcel.readInt();
                    char c3 = (char) readInt5;
                    if (c3 == 2) {
                        i14 = gte.u(parcel, readInt5);
                    } else if (c3 == 3) {
                        str10 = gte.h(parcel, readInt5);
                    } else if (c3 == 4) {
                        bArr4 = gte.b(parcel, readInt5);
                    } else if (c3 != 5) {
                        gte.y(parcel, readInt5);
                    } else {
                        str18 = gte.h(parcel, readInt5);
                    }
                }
                gte.m(parcel, z9);
                return new h5e(i14, str10, str18, bArr4);
            case 6:
                int z10 = gte.z(parcel);
                double d = 0.0d;
                double d2 = 0.0d;
                while (parcel.dataPosition() < z10) {
                    int readInt6 = parcel.readInt();
                    char c4 = (char) readInt6;
                    if (c4 == 2) {
                        d = gte.q(parcel, readInt6);
                    } else if (c4 != 3) {
                        gte.y(parcel, readInt6);
                    } else {
                        d2 = gte.q(parcel, readInt6);
                    }
                }
                gte.m(parcel, z10);
                return new LatLng(d, d2);
            case 7:
                int z11 = gte.z(parcel);
                while (parcel.dataPosition() < z11) {
                    gte.y(parcel, parcel.readInt());
                }
                gte.m(parcel, z11);
                return new nn5();
            case 8:
                int z12 = gte.z(parcel);
                while (parcel.dataPosition() < z12) {
                    int readInt7 = parcel.readInt();
                    if (((char) readInt7) != 2) {
                        gte.y(parcel, readInt7);
                    } else {
                        str9 = gte.h(parcel, readInt7);
                    }
                }
                gte.m(parcel, z12);
                return new ryd(str9);
            case 9:
                int z13 = gte.z(parcel);
                String str19 = null;
                String str20 = null;
                while (parcel.dataPosition() < z13) {
                    int readInt8 = parcel.readInt();
                    char c5 = (char) readInt8;
                    if (c5 == 2) {
                        i13 = gte.u(parcel, readInt8);
                    } else if (c5 == 3) {
                        str8 = gte.h(parcel, readInt8);
                    } else if (c5 == 4) {
                        str19 = gte.h(parcel, readInt8);
                    } else if (c5 != 5) {
                        gte.y(parcel, readInt8);
                    } else {
                        str20 = gte.h(parcel, readInt8);
                    }
                }
                gte.m(parcel, z13);
                qe0 qe0Var = new qe0();
                qe0Var.a = i13;
                qe0Var.b = str8;
                qe0Var.c = str19;
                qe0Var.d = str20;
                return qe0Var;
            case 10:
                int z14 = gte.z(parcel);
                boolean z15 = true;
                int i16 = 0;
                while (parcel.dataPosition() < z14) {
                    int readInt9 = parcel.readInt();
                    char c6 = (char) readInt9;
                    if (c6 == 1) {
                        arrayList2 = gte.e(parcel, readInt9);
                    } else if (c6 == 2) {
                        z15 = gte.n(parcel, readInt9);
                    } else if (c6 == 3) {
                        z2 = gte.n(parcel, readInt9);
                    } else if (c6 != 4) {
                        gte.y(parcel, readInt9);
                    } else {
                        i16 = gte.u(parcel, readInt9);
                    }
                }
                gte.m(parcel, z14);
                uc1 uc1Var = new uc1();
                uc1Var.a = arrayList2;
                uc1Var.b = z15;
                uc1Var.c = z2;
                uc1Var.d = i16;
                return uc1Var;
            case 11:
                int z16 = gte.z(parcel);
                while (parcel.dataPosition() < z16) {
                    int readInt10 = parcel.readInt();
                    if (((char) readInt10) != 2) {
                        gte.y(parcel, readInt10);
                    } else {
                        i12 = gte.u(parcel, readInt10);
                    }
                }
                gte.m(parcel, z16);
                return new tyd(i12);
            case 12:
                int z17 = gte.z(parcel);
                byte[] bArr5 = null;
                byte[] bArr6 = null;
                while (parcel.dataPosition() < z17) {
                    int readInt11 = parcel.readInt();
                    char c7 = (char) readInt11;
                    if (c7 == 1) {
                        bArr5 = gte.b(parcel, readInt11);
                    } else if (c7 != 2) {
                        gte.y(parcel, readInt11);
                    } else {
                        bArr6 = gte.b(parcel, readInt11);
                    }
                }
                gte.m(parcel, z17);
                return new wyd(bArr5 == null ? null : qae.o(bArr5.length, bArr5), bArr6 != null ? qae.o(bArr6.length, bArr6) : null);
            case 13:
                int z18 = gte.z(parcel);
                boolean z19 = false;
                String str21 = null;
                while (parcel.dataPosition() < z18) {
                    int readInt12 = parcel.readInt();
                    char c8 = (char) readInt12;
                    if (c8 == 2) {
                        str7 = gte.h(parcel, readInt12);
                    } else if (c8 == 3) {
                        str21 = gte.h(parcel, readInt12);
                    } else if (c8 == 4) {
                        i11 = gte.u(parcel, readInt12);
                    } else if (c8 != 5) {
                        gte.y(parcel, readInt12);
                    } else {
                        z19 = gte.n(parcel, readInt12);
                    }
                }
                gte.m(parcel, z18);
                return new a9e(i11, str7, str21, z19);
            case 14:
                int z20 = gte.z(parcel);
                while (parcel.dataPosition() < z20) {
                    int readInt13 = parcel.readInt();
                    char c9 = (char) readInt13;
                    if (c9 == 2) {
                        i10 = gte.u(parcel, readInt13);
                    } else if (c9 != 3) {
                        gte.y(parcel, readInt13);
                    } else {
                        oedVar = (oed) gte.g(parcel, readInt13, oed.CREATOR);
                    }
                }
                gte.m(parcel, z20);
                return new m9e(i10, oedVar);
            case 15:
                int z21 = gte.z(parcel);
                String str22 = null;
                while (parcel.dataPosition() < z21) {
                    int readInt14 = parcel.readInt();
                    char c10 = (char) readInt14;
                    if (c10 == 2) {
                        str6 = gte.h(parcel, readInt14);
                    } else if (c10 == 3) {
                        str22 = gte.h(parcel, readInt14);
                    } else if (c10 != 4) {
                        gte.y(parcel, readInt14);
                    } else {
                        j = gte.w(parcel, readInt14);
                    }
                }
                gte.m(parcel, z21);
                return new w9e(j, str6, str22);
            case 16:
                int z22 = gte.z(parcel);
                while (parcel.dataPosition() < z22) {
                    int readInt15 = parcel.readInt();
                    char c11 = (char) readInt15;
                    if (c11 == 2) {
                        i9 = gte.u(parcel, readInt15);
                    } else if (c11 != 3) {
                        gte.y(parcel, readInt15);
                    } else {
                        str5 = gte.h(parcel, readInt15);
                    }
                }
                gte.m(parcel, z22);
                return new kae(i9, str5);
            case 17:
                int z23 = gte.z(parcel);
                while (parcel.dataPosition() < z23) {
                    int readInt16 = parcel.readInt();
                    char c12 = (char) readInt16;
                    if (c12 == 2) {
                        i8 = gte.u(parcel, readInt16);
                    } else if (c12 != 3) {
                        gte.y(parcel, readInt16);
                    } else {
                        kpdVar = (kpd) gte.g(parcel, readInt16, kpd.CREATOR);
                    }
                }
                gte.m(parcel, z23);
                return new wae(i8, kpdVar);
            case 18:
                int z24 = gte.z(parcel);
                while (parcel.dataPosition() < z24) {
                    int readInt17 = parcel.readInt();
                    if (((char) readInt17) != 2) {
                        gte.y(parcel, readInt17);
                    } else {
                        i7 = gte.u(parcel, readInt17);
                    }
                }
                gte.m(parcel, z24);
                return new ube(i7);
            case 19:
                int z25 = gte.z(parcel);
                String str23 = null;
                Account account = null;
                while (parcel.dataPosition() < z25) {
                    int readInt18 = parcel.readInt();
                    char c13 = (char) readInt18;
                    if (c13 == 1) {
                        fseVarArr = (fse[]) gte.k(parcel, readInt18, fse.CREATOR);
                    } else if (c13 == 2) {
                        str23 = gte.h(parcel, readInt18);
                    } else if (c13 == 3) {
                        z = gte.n(parcel, readInt18);
                    } else if (c13 != 4) {
                        gte.y(parcel, readInt18);
                    } else {
                        account = (Account) gte.g(parcel, readInt18, Account.CREATOR);
                    }
                }
                gte.m(parcel, z25);
                return new v5e(fseVarArr, str23, z, account);
            case 20:
                int z26 = gte.z(parcel);
                while (parcel.dataPosition() < z26) {
                    int readInt19 = parcel.readInt();
                    if (((char) readInt19) != 1) {
                        gte.y(parcel, readInt19);
                    } else {
                        status = (Status) gte.g(parcel, readInt19, Status.CREATOR);
                    }
                }
                gte.m(parcel, z26);
                return new w5e(status);
            case 21:
                int z27 = gte.z(parcel);
                int i17 = 0;
                int i18 = 0;
                while (parcel.dataPosition() < z27) {
                    int readInt20 = parcel.readInt();
                    char c14 = (char) readInt20;
                    if (c14 == 2) {
                        i6 = gte.u(parcel, readInt20);
                    } else if (c14 == 3) {
                        i17 = gte.u(parcel, readInt20);
                    } else if (c14 != 4) {
                        gte.y(parcel, readInt20);
                    } else {
                        i18 = gte.u(parcel, readInt20);
                    }
                }
                gte.m(parcel, z27);
                return new ek5(i6, i17, i18);
            case 22:
                int z28 = gte.z(parcel);
                while (parcel.dataPosition() < z28) {
                    int readInt21 = parcel.readInt();
                    if (((char) readInt21) != 2) {
                        gte.y(parcel, readInt21);
                    } else {
                        str4 = gte.h(parcel, readInt21);
                    }
                }
                gte.m(parcel, z28);
                return new gi6(str4);
            case 23:
                int z29 = gte.z(parcel);
                String str24 = null;
                byte[] bArr7 = null;
                byte[][] bArr8 = null;
                byte[][] bArr9 = null;
                byte[][] bArr10 = null;
                byte[][] bArr11 = null;
                int[] iArr3 = null;
                byte[][] bArr12 = null;
                while (parcel.dataPosition() < z29) {
                    int readInt22 = parcel.readInt();
                    switch ((char) readInt22) {
                        case 2:
                            str24 = gte.h(parcel, readInt22);
                            break;
                        case 3:
                            bArr7 = gte.b(parcel, readInt22);
                            break;
                        case 4:
                            bArr8 = gte.c(parcel, readInt22);
                            break;
                        case 5:
                            bArr9 = gte.c(parcel, readInt22);
                            break;
                        case 6:
                            bArr10 = gte.c(parcel, readInt22);
                            break;
                        case 7:
                            bArr11 = gte.c(parcel, readInt22);
                            break;
                        case '\b':
                            iArr3 = gte.d(parcel, readInt22);
                            break;
                        case '\t':
                            bArr12 = gte.c(parcel, readInt22);
                            break;
                        default:
                            gte.y(parcel, readInt22);
                            break;
                    }
                }
                gte.m(parcel, z29);
                return new m64(str24, bArr7, bArr8, bArr9, bArr10, bArr11, iArr3, bArr12);
            case 24:
                int z30 = gte.z(parcel);
                String str25 = null;
                String str26 = null;
                String str27 = null;
                String str28 = null;
                String str29 = null;
                String str30 = null;
                String str31 = null;
                String str32 = null;
                String str33 = null;
                String str34 = null;
                String str35 = null;
                String str36 = null;
                String str37 = null;
                while (parcel.dataPosition() < z30) {
                    int readInt23 = parcel.readInt();
                    String str38 = str37;
                    switch ((char) readInt23) {
                        case 2:
                            str3 = gte.h(parcel, readInt23);
                            break;
                        case 3:
                            str26 = gte.h(parcel, readInt23);
                            break;
                        case 4:
                            str27 = gte.h(parcel, readInt23);
                            break;
                        case 5:
                            str28 = gte.h(parcel, readInt23);
                            break;
                        case 6:
                            str29 = gte.h(parcel, readInt23);
                            break;
                        case 7:
                            str30 = gte.h(parcel, readInt23);
                            break;
                        case '\b':
                            str31 = gte.h(parcel, readInt23);
                            break;
                        case '\t':
                            str32 = gte.h(parcel, readInt23);
                            break;
                        case '\n':
                            str33 = gte.h(parcel, readInt23);
                            break;
                        case 11:
                            str34 = gte.h(parcel, readInt23);
                            break;
                        case '\f':
                            str35 = gte.h(parcel, readInt23);
                            break;
                        case '\r':
                            str36 = gte.h(parcel, readInt23);
                            break;
                        case 14:
                            str37 = gte.h(parcel, readInt23);
                            continue;
                        case 15:
                            str25 = gte.h(parcel, readInt23);
                            break;
                        default:
                            gte.y(parcel, readInt23);
                            break;
                    }
                    str37 = str38;
                }
                gte.m(parcel, z30);
                pe0 pe0Var = new pe0();
                pe0Var.a = str3;
                pe0Var.b = str26;
                pe0Var.c = str27;
                pe0Var.d = str28;
                pe0Var.e = str29;
                pe0Var.f = str30;
                pe0Var.h = str31;
                pe0Var.n = str32;
                pe0Var.r = str33;
                pe0Var.s = str34;
                pe0Var.w = str35;
                pe0Var.x = str36;
                pe0Var.y = str37;
                pe0Var.E = str25;
                return pe0Var;
            case 25:
                return new BinderWrapper(parcel);
            case 26:
                int z31 = gte.z(parcel);
                int i19 = 0;
                while (parcel.dataPosition() < z31) {
                    int readInt24 = parcel.readInt();
                    char c15 = (char) readInt24;
                    if (c15 == 1) {
                        i5 = gte.u(parcel, readInt24);
                    } else if (c15 == 2) {
                        i19 = gte.u(parcel, readInt24);
                    } else if (c15 != 3) {
                        gte.y(parcel, readInt24);
                    } else {
                        bArr = gte.b(parcel, readInt24);
                    }
                }
                gte.m(parcel, z31);
                return new sce(i5, i19, bArr);
            case 27:
                int z32 = gte.z(parcel);
                int i20 = 0;
                while (parcel.dataPosition() < z32) {
                    int readInt25 = parcel.readInt();
                    char c16 = (char) readInt25;
                    if (c16 == 2) {
                        i4 = gte.u(parcel, readInt25);
                    } else if (c16 != 3) {
                        gte.y(parcel, readInt25);
                    } else {
                        i20 = gte.u(parcel, readInt25);
                    }
                }
                gte.m(parcel, z32);
                return new ede(i4, i20);
            case 28:
                int z33 = gte.z(parcel);
                while (parcel.dataPosition() < z33) {
                    int readInt26 = parcel.readInt();
                    char c17 = (char) readInt26;
                    if (c17 == 2) {
                        i3 = gte.u(parcel, readInt26);
                    } else if (c17 == 3) {
                        j = gte.w(parcel, readInt26);
                    } else if (c17 != 4) {
                        gte.y(parcel, readInt26);
                    } else {
                        arrayList = gte.l(parcel, readInt26, w9e.CREATOR);
                    }
                }
                gte.m(parcel, z33);
                return new wde(i3, j, arrayList);
            default:
                int z34 = gte.z(parcel);
                float f = 0.0f;
                String str39 = null;
                while (parcel.dataPosition() < z34) {
                    int readInt27 = parcel.readInt();
                    char c18 = (char) readInt27;
                    if (c18 == 2) {
                        str39 = gte.h(parcel, readInt27);
                    } else if (c18 == 3) {
                        f = gte.r(parcel, readInt27);
                    } else if (c18 == 4) {
                        str2 = gte.h(parcel, readInt27);
                    } else if (c18 != 5) {
                        gte.y(parcel, readInt27);
                    } else {
                        i2 = gte.u(parcel, readInt27);
                    }
                }
                gte.m(parcel, z34);
                return new dce(f, i2, str2, str39);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new mn5[i];
            case 1:
                return new ne0[i];
            case 2:
                return new mtd[i];
            case 3:
                return new uw5[i];
            case 4:
                return new zle[i];
            case 5:
                return new h5e[i];
            case 6:
                return new LatLng[i];
            case 7:
                return new nn5[i];
            case 8:
                return new ryd[i];
            case 9:
                return new qe0[i];
            case 10:
                return new uc1[i];
            case 11:
                return new tyd[i];
            case 12:
                return new wyd[i];
            case 13:
                return new a9e[i];
            case 14:
                return new m9e[i];
            case 15:
                return new w9e[i];
            case 16:
                return new kae[i];
            case 17:
                return new wae[i];
            case 18:
                return new ube[i];
            case 19:
                return new v5e[i];
            case 20:
                return new w5e[i];
            case 21:
                return new ek5[i];
            case 22:
                return new gi6[i];
            case 23:
                return new m64[i];
            case 24:
                return new pe0[i];
            case 25:
                return new BinderWrapper[i];
            case 26:
                return new sce[i];
            case 27:
                return new ede[i];
            case 28:
                return new wde[i];
            default:
                return new dce[i];
        }
    }
}
