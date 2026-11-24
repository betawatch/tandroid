// default package

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.BinderWrapper;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class t0e implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    public /* synthetic */ t0e(byte b) {
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
        iue[] iueVarArr = null;
        nrd nrdVar = null;
        String str5 = null;
        String str6 = null;
        pgd pgdVar = null;
        String str7 = null;
        ArrayList arrayList2 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        switch (this.a) {
            case 0:
                int z3 = jve.z(parcel);
                while (parcel.dataPosition() < z3) {
                    jve.y(parcel, parcel.readInt());
                }
                jve.m(parcel, z3);
                return new mp5();
            case 1:
                int z4 = jve.z(parcel);
                String str13 = null;
                String str14 = null;
                String str15 = null;
                String str16 = null;
                mf0 mf0Var = null;
                mf0 mf0Var2 = null;
                while (parcel.dataPosition() < z4) {
                    int readInt = parcel.readInt();
                    switch ((char) readInt) {
                        case 2:
                            str = jve.h(parcel, readInt);
                            break;
                        case 3:
                            str13 = jve.h(parcel, readInt);
                            break;
                        case 4:
                            str14 = jve.h(parcel, readInt);
                            break;
                        case 5:
                            str15 = jve.h(parcel, readInt);
                            break;
                        case 6:
                            str16 = jve.h(parcel, readInt);
                            break;
                        case 7:
                            mf0Var = (mf0) jve.g(parcel, readInt, mf0.CREATOR);
                            break;
                        case '\b':
                            mf0Var2 = (mf0) jve.g(parcel, readInt, mf0.CREATOR);
                            break;
                        default:
                            jve.y(parcel, readInt);
                            break;
                    }
                }
                jve.m(parcel, z4);
                nf0 nf0Var = new nf0();
                nf0Var.a = str;
                nf0Var.b = str13;
                nf0Var.c = str14;
                nf0Var.d = str15;
                nf0Var.e = str16;
                nf0Var.f = mf0Var;
                nf0Var.h = mf0Var2;
                return nf0Var;
            case 2:
                int z5 = jve.z(parcel);
                boolean z6 = true;
                gdf gdfVar = null;
                byte[] bArr2 = null;
                int[] iArr = null;
                String[] strArr = null;
                int[] iArr2 = null;
                byte[][] bArr3 = null;
                v74[] v74VarArr = null;
                while (parcel.dataPosition() < z5) {
                    int readInt2 = parcel.readInt();
                    switch ((char) readInt2) {
                        case 2:
                            gdfVar = (gdf) jve.g(parcel, readInt2, gdf.CREATOR);
                            break;
                        case 3:
                            bArr2 = jve.b(parcel, readInt2);
                            break;
                        case 4:
                            iArr = jve.d(parcel, readInt2);
                            break;
                        case 5:
                            strArr = jve.i(parcel, readInt2);
                            break;
                        case 6:
                            iArr2 = jve.d(parcel, readInt2);
                            break;
                        case 7:
                            bArr3 = jve.c(parcel, readInt2);
                            break;
                        case '\b':
                            z6 = jve.n(parcel, readInt2);
                            break;
                        case '\t':
                            v74VarArr = (v74[]) jve.k(parcel, readInt2, v74.CREATOR);
                            break;
                        default:
                            jve.y(parcel, readInt2);
                            break;
                    }
                }
                jve.m(parcel, z5);
                return new pvd(gdfVar, bArr2, iArr, strArr, iArr2, bArr3, z6, v74VarArr);
            case 3:
                int z7 = jve.z(parcel);
                ArrayList arrayList3 = new ArrayList();
                String str17 = null;
                while (parcel.dataPosition() < z7) {
                    int readInt3 = parcel.readInt();
                    char c = (char) readInt3;
                    if (c == 2) {
                        str12 = jve.h(parcel, readInt3);
                    } else if (c == 3) {
                        str17 = jve.h(parcel, readInt3);
                    } else if (c != 4) {
                        jve.y(parcel, readInt3);
                    } else {
                        arrayList3 = jve.l(parcel, readInt3, ty5.CREATOR);
                    }
                }
                jve.m(parcel, z7);
                uy5 uy5Var = new uy5();
                uy5Var.a = str12;
                uy5Var.b = str17;
                uy5Var.c = arrayList3;
                return uy5Var;
            case 4:
                int z8 = jve.z(parcel);
                int i15 = 0;
                while (parcel.dataPosition() < z8) {
                    int readInt4 = parcel.readInt();
                    char c2 = (char) readInt4;
                    if (c2 == 1) {
                        str11 = jve.h(parcel, readInt4);
                    } else if (c2 == 2) {
                        i = jve.u(parcel, readInt4);
                    } else if (c2 != 3) {
                        jve.y(parcel, readInt4);
                    } else {
                        i15 = jve.u(parcel, readInt4);
                    }
                }
                jve.m(parcel, z8);
                return new boe(str11, i, i15);
            case 5:
                int z9 = jve.z(parcel);
                byte[] bArr4 = null;
                String str18 = null;
                while (parcel.dataPosition() < z9) {
                    int readInt5 = parcel.readInt();
                    char c3 = (char) readInt5;
                    if (c3 == 2) {
                        i14 = jve.u(parcel, readInt5);
                    } else if (c3 == 3) {
                        str10 = jve.h(parcel, readInt5);
                    } else if (c3 == 4) {
                        bArr4 = jve.b(parcel, readInt5);
                    } else if (c3 != 5) {
                        jve.y(parcel, readInt5);
                    } else {
                        str18 = jve.h(parcel, readInt5);
                    }
                }
                jve.m(parcel, z9);
                return new k7e(i14, str10, str18, bArr4);
            case 6:
                int z10 = jve.z(parcel);
                double d = 0.0d;
                double d2 = 0.0d;
                while (parcel.dataPosition() < z10) {
                    int readInt6 = parcel.readInt();
                    char c4 = (char) readInt6;
                    if (c4 == 2) {
                        d = jve.q(parcel, readInt6);
                    } else if (c4 != 3) {
                        jve.y(parcel, readInt6);
                    } else {
                        d2 = jve.q(parcel, readInt6);
                    }
                }
                jve.m(parcel, z10);
                return new LatLng(d, d2);
            case 7:
                int z11 = jve.z(parcel);
                while (parcel.dataPosition() < z11) {
                    jve.y(parcel, parcel.readInt());
                }
                jve.m(parcel, z11);
                return new np5();
            case 8:
                int z12 = jve.z(parcel);
                while (parcel.dataPosition() < z12) {
                    int readInt7 = parcel.readInt();
                    if (((char) readInt7) != 2) {
                        jve.y(parcel, readInt7);
                    } else {
                        str9 = jve.h(parcel, readInt7);
                    }
                }
                jve.m(parcel, z12);
                return new u0e(str9);
            case 9:
                int z13 = jve.z(parcel);
                String str19 = null;
                String str20 = null;
                while (parcel.dataPosition() < z13) {
                    int readInt8 = parcel.readInt();
                    char c5 = (char) readInt8;
                    if (c5 == 2) {
                        i13 = jve.u(parcel, readInt8);
                    } else if (c5 == 3) {
                        str8 = jve.h(parcel, readInt8);
                    } else if (c5 == 4) {
                        str19 = jve.h(parcel, readInt8);
                    } else if (c5 != 5) {
                        jve.y(parcel, readInt8);
                    } else {
                        str20 = jve.h(parcel, readInt8);
                    }
                }
                jve.m(parcel, z13);
                qf0 qf0Var = new qf0();
                qf0Var.a = i13;
                qf0Var.b = str8;
                qf0Var.c = str19;
                qf0Var.d = str20;
                return qf0Var;
            case 10:
                int z14 = jve.z(parcel);
                boolean z15 = true;
                int i16 = 0;
                while (parcel.dataPosition() < z14) {
                    int readInt9 = parcel.readInt();
                    char c6 = (char) readInt9;
                    if (c6 == 1) {
                        arrayList2 = jve.e(parcel, readInt9);
                    } else if (c6 == 2) {
                        z15 = jve.n(parcel, readInt9);
                    } else if (c6 == 3) {
                        z2 = jve.n(parcel, readInt9);
                    } else if (c6 != 4) {
                        jve.y(parcel, readInt9);
                    } else {
                        i16 = jve.u(parcel, readInt9);
                    }
                }
                jve.m(parcel, z14);
                ce1 ce1Var = new ce1();
                ce1Var.a = arrayList2;
                ce1Var.b = z15;
                ce1Var.c = z2;
                ce1Var.d = i16;
                return ce1Var;
            case 11:
                int z16 = jve.z(parcel);
                while (parcel.dataPosition() < z16) {
                    int readInt10 = parcel.readInt();
                    if (((char) readInt10) != 2) {
                        jve.y(parcel, readInt10);
                    } else {
                        i12 = jve.u(parcel, readInt10);
                    }
                }
                jve.m(parcel, z16);
                return new w0e(i12);
            case 12:
                int z17 = jve.z(parcel);
                byte[] bArr5 = null;
                byte[] bArr6 = null;
                while (parcel.dataPosition() < z17) {
                    int readInt11 = parcel.readInt();
                    char c7 = (char) readInt11;
                    if (c7 == 1) {
                        bArr5 = jve.b(parcel, readInt11);
                    } else if (c7 != 2) {
                        jve.y(parcel, readInt11);
                    } else {
                        bArr6 = jve.b(parcel, readInt11);
                    }
                }
                jve.m(parcel, z17);
                return new z0e(bArr5 == null ? null : rce.o(bArr5.length, bArr5), bArr6 != null ? rce.o(bArr6.length, bArr6) : null);
            case 13:
                int z18 = jve.z(parcel);
                boolean z19 = false;
                String str21 = null;
                while (parcel.dataPosition() < z18) {
                    int readInt12 = parcel.readInt();
                    char c8 = (char) readInt12;
                    if (c8 == 2) {
                        str7 = jve.h(parcel, readInt12);
                    } else if (c8 == 3) {
                        str21 = jve.h(parcel, readInt12);
                    } else if (c8 == 4) {
                        i11 = jve.u(parcel, readInt12);
                    } else if (c8 != 5) {
                        jve.y(parcel, readInt12);
                    } else {
                        z19 = jve.n(parcel, readInt12);
                    }
                }
                jve.m(parcel, z18);
                return new bbe(i11, str7, str21, z19);
            case 14:
                int z20 = jve.z(parcel);
                while (parcel.dataPosition() < z20) {
                    int readInt13 = parcel.readInt();
                    char c9 = (char) readInt13;
                    if (c9 == 2) {
                        i10 = jve.u(parcel, readInt13);
                    } else if (c9 != 3) {
                        jve.y(parcel, readInt13);
                    } else {
                        pgdVar = (pgd) jve.g(parcel, readInt13, pgd.CREATOR);
                    }
                }
                jve.m(parcel, z20);
                return new nbe(i10, pgdVar);
            case 15:
                int z21 = jve.z(parcel);
                String str22 = null;
                while (parcel.dataPosition() < z21) {
                    int readInt14 = parcel.readInt();
                    char c10 = (char) readInt14;
                    if (c10 == 2) {
                        str6 = jve.h(parcel, readInt14);
                    } else if (c10 == 3) {
                        str22 = jve.h(parcel, readInt14);
                    } else if (c10 != 4) {
                        jve.y(parcel, readInt14);
                    } else {
                        j = jve.w(parcel, readInt14);
                    }
                }
                jve.m(parcel, z21);
                return new xbe(j, str6, str22);
            case 16:
                int z22 = jve.z(parcel);
                while (parcel.dataPosition() < z22) {
                    int readInt15 = parcel.readInt();
                    char c11 = (char) readInt15;
                    if (c11 == 2) {
                        i9 = jve.u(parcel, readInt15);
                    } else if (c11 != 3) {
                        jve.y(parcel, readInt15);
                    } else {
                        str5 = jve.h(parcel, readInt15);
                    }
                }
                jve.m(parcel, z22);
                return new lce(i9, str5);
            case 17:
                int z23 = jve.z(parcel);
                while (parcel.dataPosition() < z23) {
                    int readInt16 = parcel.readInt();
                    char c12 = (char) readInt16;
                    if (c12 == 2) {
                        i8 = jve.u(parcel, readInt16);
                    } else if (c12 != 3) {
                        jve.y(parcel, readInt16);
                    } else {
                        nrdVar = (nrd) jve.g(parcel, readInt16, nrd.CREATOR);
                    }
                }
                jve.m(parcel, z23);
                return new xce(i8, nrdVar);
            case 18:
                int z24 = jve.z(parcel);
                while (parcel.dataPosition() < z24) {
                    int readInt17 = parcel.readInt();
                    if (((char) readInt17) != 2) {
                        jve.y(parcel, readInt17);
                    } else {
                        i7 = jve.u(parcel, readInt17);
                    }
                }
                jve.m(parcel, z24);
                return new vde(i7);
            case 19:
                int z25 = jve.z(parcel);
                String str23 = null;
                Account account = null;
                while (parcel.dataPosition() < z25) {
                    int readInt18 = parcel.readInt();
                    char c13 = (char) readInt18;
                    if (c13 == 1) {
                        iueVarArr = (iue[]) jve.k(parcel, readInt18, iue.CREATOR);
                    } else if (c13 == 2) {
                        str23 = jve.h(parcel, readInt18);
                    } else if (c13 == 3) {
                        z = jve.n(parcel, readInt18);
                    } else if (c13 != 4) {
                        jve.y(parcel, readInt18);
                    } else {
                        account = (Account) jve.g(parcel, readInt18, Account.CREATOR);
                    }
                }
                jve.m(parcel, z25);
                return new y7e(iueVarArr, str23, z, account);
            case 20:
                int z26 = jve.z(parcel);
                while (parcel.dataPosition() < z26) {
                    int readInt19 = parcel.readInt();
                    if (((char) readInt19) != 1) {
                        jve.y(parcel, readInt19);
                    } else {
                        status = (Status) jve.g(parcel, readInt19, Status.CREATOR);
                    }
                }
                jve.m(parcel, z26);
                return new z7e(status);
            case 21:
                int z27 = jve.z(parcel);
                int i17 = 0;
                int i18 = 0;
                while (parcel.dataPosition() < z27) {
                    int readInt20 = parcel.readInt();
                    char c14 = (char) readInt20;
                    if (c14 == 2) {
                        i6 = jve.u(parcel, readInt20);
                    } else if (c14 == 3) {
                        i17 = jve.u(parcel, readInt20);
                    } else if (c14 != 4) {
                        jve.y(parcel, readInt20);
                    } else {
                        i18 = jve.u(parcel, readInt20);
                    }
                }
                jve.m(parcel, z27);
                return new em5(i6, i17, i18);
            case 22:
                int z28 = jve.z(parcel);
                while (parcel.dataPosition() < z28) {
                    int readInt21 = parcel.readInt();
                    if (((char) readInt21) != 2) {
                        jve.y(parcel, readInt21);
                    } else {
                        str4 = jve.h(parcel, readInt21);
                    }
                }
                jve.m(parcel, z28);
                return new ik6(str4);
            case 23:
                int z29 = jve.z(parcel);
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
                            str24 = jve.h(parcel, readInt22);
                            break;
                        case 3:
                            bArr7 = jve.b(parcel, readInt22);
                            break;
                        case 4:
                            bArr8 = jve.c(parcel, readInt22);
                            break;
                        case 5:
                            bArr9 = jve.c(parcel, readInt22);
                            break;
                        case 6:
                            bArr10 = jve.c(parcel, readInt22);
                            break;
                        case 7:
                            bArr11 = jve.c(parcel, readInt22);
                            break;
                        case '\b':
                            iArr3 = jve.d(parcel, readInt22);
                            break;
                        case '\t':
                            bArr12 = jve.c(parcel, readInt22);
                            break;
                        default:
                            jve.y(parcel, readInt22);
                            break;
                    }
                }
                jve.m(parcel, z29);
                return new v74(str24, bArr7, bArr8, bArr9, bArr10, bArr11, iArr3, bArr12);
            case 24:
                int z30 = jve.z(parcel);
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
                            str3 = jve.h(parcel, readInt23);
                            break;
                        case 3:
                            str26 = jve.h(parcel, readInt23);
                            break;
                        case 4:
                            str27 = jve.h(parcel, readInt23);
                            break;
                        case 5:
                            str28 = jve.h(parcel, readInt23);
                            break;
                        case 6:
                            str29 = jve.h(parcel, readInt23);
                            break;
                        case 7:
                            str30 = jve.h(parcel, readInt23);
                            break;
                        case '\b':
                            str31 = jve.h(parcel, readInt23);
                            break;
                        case '\t':
                            str32 = jve.h(parcel, readInt23);
                            break;
                        case '\n':
                            str33 = jve.h(parcel, readInt23);
                            break;
                        case 11:
                            str34 = jve.h(parcel, readInt23);
                            break;
                        case '\f':
                            str35 = jve.h(parcel, readInt23);
                            break;
                        case '\r':
                            str36 = jve.h(parcel, readInt23);
                            break;
                        case 14:
                            str37 = jve.h(parcel, readInt23);
                            continue;
                        case 15:
                            str25 = jve.h(parcel, readInt23);
                            break;
                        default:
                            jve.y(parcel, readInt23);
                            break;
                    }
                    str37 = str38;
                }
                jve.m(parcel, z30);
                pf0 pf0Var = new pf0();
                pf0Var.a = str3;
                pf0Var.b = str26;
                pf0Var.c = str27;
                pf0Var.d = str28;
                pf0Var.e = str29;
                pf0Var.f = str30;
                pf0Var.h = str31;
                pf0Var.n = str32;
                pf0Var.r = str33;
                pf0Var.s = str34;
                pf0Var.w = str35;
                pf0Var.x = str36;
                pf0Var.y = str37;
                pf0Var.E = str25;
                return pf0Var;
            case 25:
                return new BinderWrapper(parcel);
            case 26:
                int z31 = jve.z(parcel);
                int i19 = 0;
                while (parcel.dataPosition() < z31) {
                    int readInt24 = parcel.readInt();
                    char c15 = (char) readInt24;
                    if (c15 == 1) {
                        i5 = jve.u(parcel, readInt24);
                    } else if (c15 == 2) {
                        i19 = jve.u(parcel, readInt24);
                    } else if (c15 != 3) {
                        jve.y(parcel, readInt24);
                    } else {
                        bArr = jve.b(parcel, readInt24);
                    }
                }
                jve.m(parcel, z31);
                return new tee(i5, i19, bArr);
            case 27:
                int z32 = jve.z(parcel);
                int i20 = 0;
                while (parcel.dataPosition() < z32) {
                    int readInt25 = parcel.readInt();
                    char c16 = (char) readInt25;
                    if (c16 == 2) {
                        i4 = jve.u(parcel, readInt25);
                    } else if (c16 != 3) {
                        jve.y(parcel, readInt25);
                    } else {
                        i20 = jve.u(parcel, readInt25);
                    }
                }
                jve.m(parcel, z32);
                return new ffe(i4, i20);
            case 28:
                int z33 = jve.z(parcel);
                while (parcel.dataPosition() < z33) {
                    int readInt26 = parcel.readInt();
                    char c17 = (char) readInt26;
                    if (c17 == 2) {
                        i3 = jve.u(parcel, readInt26);
                    } else if (c17 == 3) {
                        j = jve.w(parcel, readInt26);
                    } else if (c17 != 4) {
                        jve.y(parcel, readInt26);
                    } else {
                        arrayList = jve.l(parcel, readInt26, xbe.CREATOR);
                    }
                }
                jve.m(parcel, z33);
                return new xfe(i3, j, arrayList);
            default:
                int z34 = jve.z(parcel);
                float f = 0.0f;
                String str39 = null;
                while (parcel.dataPosition() < z34) {
                    int readInt27 = parcel.readInt();
                    char c18 = (char) readInt27;
                    if (c18 == 2) {
                        str39 = jve.h(parcel, readInt27);
                    } else if (c18 == 3) {
                        f = jve.r(parcel, readInt27);
                    } else if (c18 == 4) {
                        str2 = jve.h(parcel, readInt27);
                    } else if (c18 != 5) {
                        jve.y(parcel, readInt27);
                    } else {
                        i2 = jve.u(parcel, readInt27);
                    }
                }
                jve.m(parcel, z34);
                return new eee(f, i2, str2, str39);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new mp5[i];
            case 1:
                return new nf0[i];
            case 2:
                return new pvd[i];
            case 3:
                return new uy5[i];
            case 4:
                return new boe[i];
            case 5:
                return new k7e[i];
            case 6:
                return new LatLng[i];
            case 7:
                return new np5[i];
            case 8:
                return new u0e[i];
            case 9:
                return new qf0[i];
            case 10:
                return new ce1[i];
            case 11:
                return new w0e[i];
            case 12:
                return new z0e[i];
            case 13:
                return new bbe[i];
            case 14:
                return new nbe[i];
            case 15:
                return new xbe[i];
            case 16:
                return new lce[i];
            case 17:
                return new xce[i];
            case 18:
                return new vde[i];
            case 19:
                return new y7e[i];
            case 20:
                return new z7e[i];
            case 21:
                return new em5[i];
            case 22:
                return new ik6[i];
            case 23:
                return new v74[i];
            case 24:
                return new pf0[i];
            case 25:
                return new BinderWrapper[i];
            case 26:
                return new tee[i];
            case 27:
                return new ffe[i];
            case 28:
                return new xfe[i];
            default:
                return new eee[i];
        }
    }
}
