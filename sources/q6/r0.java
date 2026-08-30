package q6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class r0 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ r0(int i10) {
        this.a = i10;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                int z4 = j7.l0.z(parcel);
                String str = null;
                Integer num = null;
                while (parcel.dataPosition() < z4) {
                    int readInt = parcel.readInt();
                    char c3 = (char) readInt;
                    if (c3 == 2) {
                        str = j7.l0.h(parcel, readInt);
                    } else if (c3 != 3) {
                        j7.l0.y(parcel, readInt);
                    } else {
                        num = j7.l0.v(parcel, readInt);
                    }
                }
                j7.l0.m(parcel, z4);
                return new x(str, num.intValue());
            case 1:
                int z10 = j7.l0.z(parcel);
                String str2 = null;
                String str3 = null;
                String str4 = null;
                while (parcel.dataPosition() < z10) {
                    int readInt2 = parcel.readInt();
                    char c10 = (char) readInt2;
                    if (c10 == 2) {
                        str2 = j7.l0.h(parcel, readInt2);
                    } else if (c10 == 3) {
                        str3 = j7.l0.h(parcel, readInt2);
                    } else if (c10 != 4) {
                        j7.l0.y(parcel, readInt2);
                    } else {
                        str4 = j7.l0.h(parcel, readInt2);
                    }
                }
                j7.l0.m(parcel, z10);
                return new y(str2, str3, str4);
            case 2:
                try {
                    return a0.a(parcel.readString());
                } catch (z e) {
                    throw new RuntimeException(e);
                }
            case 3:
                int z11 = j7.l0.z(parcel);
                byte[] bArr = null;
                String str5 = null;
                String str6 = null;
                String str7 = null;
                while (parcel.dataPosition() < z11) {
                    int readInt3 = parcel.readInt();
                    char c11 = (char) readInt3;
                    if (c11 == 2) {
                        bArr = j7.l0.b(parcel, readInt3);
                    } else if (c11 == 3) {
                        str5 = j7.l0.h(parcel, readInt3);
                    } else if (c11 == 4) {
                        str6 = j7.l0.h(parcel, readInt3);
                    } else if (c11 != 5) {
                        j7.l0.y(parcel, readInt3);
                    } else {
                        str7 = j7.l0.h(parcel, readInt3);
                    }
                }
                j7.l0.m(parcel, z11);
                return new b0(str5, bArr, str6, str7);
            case 4:
                String readString = parcel.readString();
                if (readString == null) {
                    readString = "";
                }
                try {
                    return e0.a(readString);
                } catch (d0 e6) {
                    throw new RuntimeException(e6);
                }
            case 5:
                int z12 = j7.l0.z(parcel);
                String str8 = null;
                while (parcel.dataPosition() < z12) {
                    int readInt4 = parcel.readInt();
                    if (((char) readInt4) != 1) {
                        j7.l0.y(parcel, readInt4);
                    } else {
                        str8 = j7.l0.h(parcel, readInt4);
                    }
                }
                j7.l0.m(parcel, z12);
                return new s0(str8);
            case 6:
                try {
                    return f0.a(parcel.readString());
                } catch (g0 e10) {
                    throw new RuntimeException(e10);
                }
            case 7:
                int z13 = j7.l0.z(parcel);
                String str9 = null;
                String str10 = null;
                while (parcel.dataPosition() < z13) {
                    int readInt5 = parcel.readInt();
                    char c12 = (char) readInt5;
                    if (c12 == 2) {
                        str9 = j7.l0.h(parcel, readInt5);
                    } else if (c12 != 3) {
                        j7.l0.y(parcel, readInt5);
                    } else {
                        str10 = j7.l0.h(parcel, readInt5);
                    }
                }
                j7.l0.m(parcel, z13);
                return new h0(str9, str10);
            case 8:
                try {
                    return e.a(parcel.readString());
                } catch (d e11) {
                    throw new RuntimeException(e11);
                }
            case 9:
                int z14 = j7.l0.z(parcel);
                boolean z15 = false;
                while (parcel.dataPosition() < z14) {
                    int readInt6 = parcel.readInt();
                    if (((char) readInt6) != 1) {
                        j7.l0.y(parcel, readInt6);
                    } else {
                        z15 = j7.l0.n(parcel, readInt6);
                    }
                }
                j7.l0.m(parcel, z14);
                return new i0(z15);
            case 10:
                try {
                    return j0.a(parcel.readString());
                } catch (t0 e12) {
                    throw new RuntimeException(e12);
                }
            case 11:
                int z16 = j7.l0.z(parcel);
                ArrayList arrayList = null;
                while (parcel.dataPosition() < z16) {
                    int readInt7 = parcel.readInt();
                    if (((char) readInt7) != 1) {
                        j7.l0.y(parcel, readInt7);
                    } else {
                        arrayList = j7.l0.l(parcel, readInt7, l0.CREATOR);
                    }
                }
                j7.l0.m(parcel, z16);
                return new k0(arrayList);
            case 12:
                int z17 = j7.l0.z(parcel);
                int i10 = 0;
                short s6 = 0;
                short s9 = 0;
                while (parcel.dataPosition() < z17) {
                    int readInt8 = parcel.readInt();
                    char c13 = (char) readInt8;
                    if (c13 == 1) {
                        i10 = j7.l0.u(parcel, readInt8);
                    } else if (c13 == 2) {
                        j7.l0.B(parcel, readInt8, 4);
                        s6 = (short) parcel.readInt();
                    } else if (c13 != 3) {
                        j7.l0.y(parcel, readInt8);
                    } else {
                        j7.l0.B(parcel, readInt8, 4);
                        s9 = (short) parcel.readInt();
                    }
                }
                j7.l0.m(parcel, z17);
                return new l0(i10, s6, s9);
            case 13:
                int z18 = j7.l0.z(parcel);
                k0 k0Var = null;
                u0 u0Var = null;
                h hVar = null;
                v0 v0Var = null;
                String str11 = null;
                while (parcel.dataPosition() < z18) {
                    int readInt9 = parcel.readInt();
                    char c14 = (char) readInt9;
                    if (c14 == 1) {
                        k0Var = (k0) j7.l0.g(parcel, readInt9, k0.CREATOR);
                    } else if (c14 == 2) {
                        u0Var = (u0) j7.l0.g(parcel, readInt9, u0.CREATOR);
                    } else if (c14 == 3) {
                        hVar = (h) j7.l0.g(parcel, readInt9, h.CREATOR);
                    } else if (c14 == 4) {
                        v0Var = (v0) j7.l0.g(parcel, readInt9, v0.CREATOR);
                    } else if (c14 != 5) {
                        j7.l0.y(parcel, readInt9);
                    } else {
                        str11 = j7.l0.h(parcel, readInt9);
                    }
                }
                j7.l0.m(parcel, z18);
                return new g(k0Var, u0Var, hVar, v0Var, str11);
            case 14:
                int z19 = j7.l0.z(parcel);
                s sVar = null;
                x0 x0Var = null;
                i0 i0Var = null;
                z0 z0Var = null;
                m0 m0Var = null;
                n0 n0Var = null;
                y0 y0Var = null;
                o0 o0Var = null;
                t tVar = null;
                q0 q0Var = null;
                s0 s0Var = null;
                p0 p0Var = null;
                while (parcel.dataPosition() < z19) {
                    int readInt10 = parcel.readInt();
                    switch ((char) readInt10) {
                        case 2:
                            sVar = (s) j7.l0.g(parcel, readInt10, s.CREATOR);
                            break;
                        case 3:
                            x0Var = (x0) j7.l0.g(parcel, readInt10, x0.CREATOR);
                            break;
                        case 4:
                            i0Var = (i0) j7.l0.g(parcel, readInt10, i0.CREATOR);
                            break;
                        case 5:
                            z0Var = (z0) j7.l0.g(parcel, readInt10, z0.CREATOR);
                            break;
                        case 6:
                            m0Var = (m0) j7.l0.g(parcel, readInt10, m0.CREATOR);
                            break;
                        case 7:
                            n0Var = (n0) j7.l0.g(parcel, readInt10, n0.CREATOR);
                            break;
                        case '\b':
                            y0Var = (y0) j7.l0.g(parcel, readInt10, y0.CREATOR);
                            break;
                        case '\t':
                            o0Var = (o0) j7.l0.g(parcel, readInt10, o0.CREATOR);
                            break;
                        case '\n':
                            tVar = (t) j7.l0.g(parcel, readInt10, t.CREATOR);
                            break;
                        case 11:
                            q0Var = (q0) j7.l0.g(parcel, readInt10, q0.CREATOR);
                            break;
                        case '\f':
                            s0Var = (s0) j7.l0.g(parcel, readInt10, s0.CREATOR);
                            break;
                        case '\r':
                            p0Var = (p0) j7.l0.g(parcel, readInt10, p0.CREATOR);
                            break;
                        default:
                            j7.l0.y(parcel, readInt10);
                            break;
                    }
                }
                j7.l0.m(parcel, z19);
                return new f(sVar, x0Var, i0Var, z0Var, m0Var, n0Var, y0Var, o0Var, tVar, q0Var, s0Var, p0Var);
            case 15:
                int z20 = j7.l0.z(parcel);
                boolean z21 = false;
                while (parcel.dataPosition() < z20) {
                    int readInt11 = parcel.readInt();
                    if (((char) readInt11) != 1) {
                        j7.l0.y(parcel, readInt11);
                    } else {
                        z21 = j7.l0.n(parcel, readInt11);
                    }
                }
                j7.l0.m(parcel, z20);
                return new h(z21);
            case 16:
                int z22 = j7.l0.z(parcel);
                byte[] bArr2 = null;
                byte[] bArr3 = null;
                while (parcel.dataPosition() < z22) {
                    int readInt12 = parcel.readInt();
                    char c15 = (char) readInt12;
                    if (c15 == 1) {
                        bArr2 = j7.l0.b(parcel, readInt12);
                    } else if (c15 != 2) {
                        j7.l0.y(parcel, readInt12);
                    } else {
                        bArr3 = j7.l0.b(parcel, readInt12);
                    }
                }
                j7.l0.m(parcel, z22);
                return new u0(bArr2 == null ? null : b7.w0.t(bArr2.length, bArr2), bArr3 != null ? b7.w0.t(bArr3.length, bArr3) : null);
            case 17:
                int z23 = j7.l0.z(parcel);
                boolean z24 = false;
                byte[] bArr4 = null;
                while (parcel.dataPosition() < z23) {
                    int readInt13 = parcel.readInt();
                    char c16 = (char) readInt13;
                    if (c16 == 1) {
                        z24 = j7.l0.n(parcel, readInt13);
                    } else if (c16 != 2) {
                        j7.l0.y(parcel, readInt13);
                    } else {
                        bArr4 = j7.l0.b(parcel, readInt13);
                    }
                }
                j7.l0.m(parcel, z23);
                return new v0(z24, bArr4 != null ? b7.w0.t(bArr4.length, bArr4) : null);
            case 18:
                int z25 = j7.l0.z(parcel);
                byte[] bArr5 = null;
                byte[] bArr6 = null;
                byte[] bArr7 = null;
                byte[] bArr8 = null;
                byte[] bArr9 = null;
                while (parcel.dataPosition() < z25) {
                    int readInt14 = parcel.readInt();
                    char c17 = (char) readInt14;
                    if (c17 == 2) {
                        bArr5 = j7.l0.b(parcel, readInt14);
                    } else if (c17 == 3) {
                        bArr6 = j7.l0.b(parcel, readInt14);
                    } else if (c17 == 4) {
                        bArr7 = j7.l0.b(parcel, readInt14);
                    } else if (c17 == 5) {
                        bArr8 = j7.l0.b(parcel, readInt14);
                    } else if (c17 != 6) {
                        j7.l0.y(parcel, readInt14);
                    } else {
                        bArr9 = j7.l0.b(parcel, readInt14);
                    }
                }
                j7.l0.m(parcel, z25);
                return new i(bArr5, bArr6, bArr7, bArr8, bArr9);
            case 19:
                int z26 = j7.l0.z(parcel);
                byte[] bArr10 = null;
                byte[] bArr11 = null;
                byte[] bArr12 = null;
                String[] strArr = null;
                while (parcel.dataPosition() < z26) {
                    int readInt15 = parcel.readInt();
                    char c18 = (char) readInt15;
                    if (c18 == 2) {
                        bArr10 = j7.l0.b(parcel, readInt15);
                    } else if (c18 == 3) {
                        bArr11 = j7.l0.b(parcel, readInt15);
                    } else if (c18 == 4) {
                        bArr12 = j7.l0.b(parcel, readInt15);
                    } else if (c18 != 5) {
                        j7.l0.y(parcel, readInt15);
                    } else {
                        strArr = j7.l0.i(parcel, readInt15);
                    }
                }
                j7.l0.m(parcel, z26);
                return new j(bArr10, bArr11, bArr12, strArr);
            case 20:
                int z27 = j7.l0.z(parcel);
                int i11 = 0;
                String str12 = null;
                int i12 = 0;
                while (parcel.dataPosition() < z27) {
                    int readInt16 = parcel.readInt();
                    char c19 = (char) readInt16;
                    if (c19 == 2) {
                        i11 = j7.l0.u(parcel, readInt16);
                    } else if (c19 == 3) {
                        str12 = j7.l0.h(parcel, readInt16);
                    } else if (c19 != 4) {
                        j7.l0.y(parcel, readInt16);
                    } else {
                        i12 = j7.l0.u(parcel, readInt16);
                    }
                }
                j7.l0.m(parcel, z27);
                return new k(i11, i12, str12);
            case 21:
                int z28 = j7.l0.z(parcel);
                String str13 = null;
                Boolean bool = null;
                String str14 = null;
                String str15 = null;
                while (parcel.dataPosition() < z28) {
                    int readInt17 = parcel.readInt();
                    char c20 = (char) readInt17;
                    if (c20 == 2) {
                        str13 = j7.l0.h(parcel, readInt17);
                    } else if (c20 == 3) {
                        bool = j7.l0.o(parcel, readInt17);
                    } else if (c20 == 4) {
                        str14 = j7.l0.h(parcel, readInt17);
                    } else if (c20 != 5) {
                        j7.l0.y(parcel, readInt17);
                    } else {
                        str15 = j7.l0.h(parcel, readInt17);
                    }
                }
                j7.l0.m(parcel, z28);
                return new m(str13, bool, str14, str15);
            case 22:
                try {
                    return o.a(parcel.readInt());
                } catch (n e13) {
                    throw new RuntimeException(e13);
                }
            case 23:
                int z29 = j7.l0.z(parcel);
                byte[] bArr13 = null;
                byte[] bArr14 = null;
                byte[] bArr15 = null;
                long j10 = 0;
                while (parcel.dataPosition() < z29) {
                    int readInt18 = parcel.readInt();
                    char c21 = (char) readInt18;
                    if (c21 == 1) {
                        j10 = j7.l0.w(parcel, readInt18);
                    } else if (c21 == 2) {
                        bArr13 = j7.l0.b(parcel, readInt18);
                    } else if (c21 == 3) {
                        bArr14 = j7.l0.b(parcel, readInt18);
                    } else if (c21 != 4) {
                        j7.l0.y(parcel, readInt18);
                    } else {
                        bArr15 = j7.l0.b(parcel, readInt18);
                    }
                }
                j7.l0.m(parcel, z29);
                return new w0(j10, bArr13, bArr14, bArr15);
            case 24:
                int z30 = j7.l0.z(parcel);
                ArrayList arrayList2 = null;
                while (parcel.dataPosition() < z30) {
                    int readInt19 = parcel.readInt();
                    if (((char) readInt19) != 1) {
                        j7.l0.y(parcel, readInt19);
                    } else {
                        arrayList2 = j7.l0.l(parcel, readInt19, w0.CREATOR);
                    }
                }
                j7.l0.m(parcel, z30);
                return new x0(arrayList2);
            case 25:
                int z31 = j7.l0.z(parcel);
                while (parcel.dataPosition() < z31) {
                    int readInt20 = parcel.readInt();
                    if (((char) readInt20) != 1) {
                        j7.l0.y(parcel, readInt20);
                    } else {
                        j7.l0.n(parcel, readInt20);
                    }
                }
                j7.l0.m(parcel, z31);
                return new y0();
            case 26:
                try {
                    return r.a(parcel.readInt());
                } catch (q e14) {
                    throw new IllegalArgumentException(e14);
                }
            case 27:
                int z32 = j7.l0.z(parcel);
                String str16 = null;
                while (parcel.dataPosition() < z32) {
                    int readInt21 = parcel.readInt();
                    if (((char) readInt21) != 2) {
                        j7.l0.y(parcel, readInt21);
                    } else {
                        str16 = j7.l0.h(parcel, readInt21);
                    }
                }
                j7.l0.m(parcel, z32);
                return new s(str16);
            case 28:
                int z33 = j7.l0.z(parcel);
                boolean z34 = false;
                while (parcel.dataPosition() < z33) {
                    int readInt22 = parcel.readInt();
                    if (((char) readInt22) != 2) {
                        j7.l0.y(parcel, readInt22);
                    } else {
                        z34 = j7.l0.n(parcel, readInt22);
                    }
                }
                j7.l0.m(parcel, z33);
                return new r5.a0(z34);
            default:
                int z35 = j7.l0.z(parcel);
                int i13 = 0;
                while (parcel.dataPosition() < z35) {
                    int readInt23 = parcel.readInt();
                    if (((char) readInt23) != 2) {
                        j7.l0.y(parcel, readInt23);
                    } else {
                        i13 = j7.l0.u(parcel, readInt23);
                    }
                }
                j7.l0.m(parcel, z35);
                return new r5.b0(i13);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        switch (this.a) {
            case 0:
                return new x[i10];
            case 1:
                return new y[i10];
            case 2:
                return new a0[i10];
            case 3:
                return new b0[i10];
            case 4:
                return new e0[i10];
            case 5:
                return new s0[i10];
            case 6:
                return new f0[i10];
            case 7:
                return new h0[i10];
            case 8:
                return new e[i10];
            case 9:
                return new i0[i10];
            case 10:
                return new j0[i10];
            case 11:
                return new k0[i10];
            case 12:
                return new l0[i10];
            case 13:
                return new g[i10];
            case 14:
                return new f[i10];
            case 15:
                return new h[i10];
            case 16:
                return new u0[i10];
            case 17:
                return new v0[i10];
            case 18:
                return new i[i10];
            case 19:
                return new j[i10];
            case 20:
                return new k[i10];
            case 21:
                return new m[i10];
            case 22:
                return new o[i10];
            case 23:
                return new w0[i10];
            case 24:
                return new x0[i10];
            case 25:
                return new y0[i10];
            case 26:
                return new r[i10];
            case 27:
                return new s[i10];
            case 28:
                return new r5.a0[i10];
            default:
                return new r5.b0[i10];
        }
    }
}
