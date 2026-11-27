// default package

import android.graphics.PointF;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaTrack;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.vision.face.internal.client.FaceParcel;
import com.google.android.gms.vision.face.internal.client.LandmarkParcel;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
import com.google.android.gms.wearable.ConnectionConfiguration;
import com.google.android.gms.wearable.internal.DataItemAssetParcelable;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class zkd implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    public /* synthetic */ zkd(byte b) {
        this.a = b;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        float f = 0.0f;
        double d = 0.0d;
        long j = 0;
        int i = 0;
        LatLng latLng = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        ArrayList arrayList = null;
        String str8 = null;
        PointF[] pointFArr = null;
        String str9 = null;
        switch (this.a) {
            case 0:
                int z = aye.z(parcel);
                while (parcel.dataPosition() < z) {
                    int readInt = parcel.readInt();
                    if (((char) readInt) != 2) {
                        aye.y(parcel, readInt);
                    } else {
                        i = aye.u(parcel, readInt);
                    }
                }
                aye.m(parcel, z);
                return new tkd(i);
            case 1:
                int z2 = aye.z(parcel);
                long j2 = 0;
                long j3 = 0;
                boolean z3 = false;
                boolean z4 = false;
                while (parcel.dataPosition() < z2) {
                    int readInt2 = parcel.readInt();
                    char c = (char) readInt2;
                    if (c == 2) {
                        j2 = aye.w(parcel, readInt2);
                    } else if (c == 3) {
                        j3 = aye.w(parcel, readInt2);
                    } else if (c == 4) {
                        z3 = aye.n(parcel, readInt2);
                    } else if (c != 5) {
                        aye.y(parcel, readInt2);
                    } else {
                        z4 = aye.n(parcel, readInt2);
                    }
                }
                aye.m(parcel, z2);
                return new it6(j2, j3, z3, z4);
            case 2:
                int z5 = aye.z(parcel);
                float f2 = 0.0f;
                int i2 = 0;
                boolean z6 = false;
                boolean z7 = false;
                ArrayList arrayList2 = null;
                while (parcel.dataPosition() < z5) {
                    int readInt3 = parcel.readInt();
                    switch ((char) readInt3) {
                        case 2:
                            latLng = (LatLng) aye.g(parcel, readInt3, LatLng.CREATOR);
                            break;
                        case 3:
                            d = aye.q(parcel, readInt3);
                            break;
                        case 4:
                            f = aye.r(parcel, readInt3);
                            break;
                        case 5:
                            i = aye.u(parcel, readInt3);
                            break;
                        case 6:
                            i2 = aye.u(parcel, readInt3);
                            break;
                        case 7:
                            f2 = aye.r(parcel, readInt3);
                            break;
                        case '\b':
                            z6 = aye.n(parcel, readInt3);
                            break;
                        case '\t':
                            z7 = aye.n(parcel, readInt3);
                            break;
                        case '\n':
                            arrayList2 = aye.l(parcel, readInt3, s18.CREATOR);
                            break;
                        default:
                            aye.y(parcel, readInt3);
                            break;
                    }
                }
                aye.m(parcel, z5);
                zh2 zh2Var = new zh2();
                zh2Var.a = latLng;
                zh2Var.b = d;
                zh2Var.c = f;
                zh2Var.d = i;
                zh2Var.e = i2;
                zh2Var.f = f2;
                zh2Var.h = z6;
                zh2Var.n = z7;
                zh2Var.r = arrayList2;
                return zh2Var;
            case 3:
                int z8 = aye.z(parcel);
                byte[] bArr = null;
                while (parcel.dataPosition() < z8) {
                    int readInt4 = parcel.readInt();
                    char c2 = (char) readInt4;
                    if (c2 == 2) {
                        str9 = aye.h(parcel, readInt4);
                    } else if (c2 == 3) {
                        bArr = aye.b(parcel, readInt4);
                    } else if (c2 != 4) {
                        aye.y(parcel, readInt4);
                    } else {
                        i = aye.u(parcel, readInt4);
                    }
                }
                aye.m(parcel, z8);
                return new oe5(i, str9, bArr);
            case 4:
                int z9 = aye.z(parcel);
                while (parcel.dataPosition() < z9) {
                    int readInt5 = parcel.readInt();
                    char c3 = (char) readInt5;
                    if (c3 == 2) {
                        pointFArr = (PointF[]) aye.k(parcel, readInt5, PointF.CREATOR);
                    } else if (c3 != 3) {
                        aye.y(parcel, readInt5);
                    } else {
                        i = aye.u(parcel, readInt5);
                    }
                }
                aye.m(parcel, z9);
                return new n9d(pointFArr, i);
            case 5:
                int z10 = aye.z(parcel);
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = arrayList5;
                ArrayList arrayList7 = new ArrayList();
                ArrayList arrayList8 = new ArrayList();
                ArrayList arrayList9 = new ArrayList();
                boolean z11 = false;
                prb prbVar = null;
                String str10 = null;
                String str11 = null;
                String str12 = null;
                String str13 = null;
                String str14 = null;
                String str15 = null;
                String str16 = null;
                String str17 = null;
                String str18 = null;
                while (parcel.dataPosition() < z10) {
                    int readInt6 = parcel.readInt();
                    String str19 = str12;
                    switch ((char) readInt6) {
                        case 2:
                            str8 = aye.h(parcel, readInt6);
                            break;
                        case 3:
                            str13 = aye.h(parcel, readInt6);
                            break;
                        case 4:
                            str14 = aye.h(parcel, readInt6);
                            break;
                        case 5:
                            str15 = aye.h(parcel, readInt6);
                            break;
                        case 6:
                            str16 = aye.h(parcel, readInt6);
                            break;
                        case 7:
                            str17 = aye.h(parcel, readInt6);
                            break;
                        case '\b':
                            str11 = aye.h(parcel, readInt6);
                            break;
                        case '\t':
                            str10 = aye.h(parcel, readInt6);
                            break;
                        case '\n':
                            i = aye.u(parcel, readInt6);
                            break;
                        case 11:
                            arrayList3 = aye.l(parcel, readInt6, htc.CREATOR);
                            break;
                        case '\f':
                            prbVar = (prb) aye.g(parcel, readInt6, prb.CREATOR);
                            break;
                        case '\r':
                            arrayList4 = aye.l(parcel, readInt6, LatLng.CREATOR);
                            break;
                        case 14:
                            str12 = aye.h(parcel, readInt6);
                            continue;
                        case 15:
                            str18 = aye.h(parcel, readInt6);
                            break;
                        case 16:
                            arrayList6 = aye.l(parcel, readInt6, zy5.CREATOR);
                            break;
                        case 17:
                            z11 = aye.n(parcel, readInt6);
                            break;
                        case 18:
                            arrayList7 = aye.l(parcel, readInt6, rac.CREATOR);
                            break;
                        case 19:
                            arrayList8 = aye.l(parcel, readInt6, llb.CREATOR);
                            break;
                        case 20:
                            arrayList9 = aye.l(parcel, readInt6, rac.CREATOR);
                            break;
                        default:
                            aye.y(parcel, readInt6);
                            break;
                    }
                    str12 = str19;
                }
                aye.m(parcel, z10);
                CommonWalletObject commonWalletObject = new CommonWalletObject();
                commonWalletObject.a = str8;
                commonWalletObject.b = str13;
                commonWalletObject.c = str14;
                commonWalletObject.d = str15;
                commonWalletObject.e = str16;
                commonWalletObject.f = str17;
                commonWalletObject.h = str11;
                commonWalletObject.n = str10;
                commonWalletObject.r = i;
                commonWalletObject.s = arrayList3;
                commonWalletObject.w = prbVar;
                commonWalletObject.x = arrayList4;
                commonWalletObject.y = str12;
                commonWalletObject.E = str18;
                commonWalletObject.F = arrayList6;
                commonWalletObject.G = z11;
                commonWalletObject.H = arrayList7;
                commonWalletObject.I = arrayList8;
                commonWalletObject.J = arrayList9;
                return commonWalletObject;
            case 6:
                int z12 = aye.z(parcel);
                boolean z13 = true;
                int i3 = 0;
                int i4 = 0;
                while (parcel.dataPosition() < z12) {
                    int readInt7 = parcel.readInt();
                    char c4 = (char) readInt7;
                    if (c4 == 1) {
                        i = aye.u(parcel, readInt7);
                    } else if (c4 == 2) {
                        i3 = aye.u(parcel, readInt7);
                    } else if (c4 == 3) {
                        i4 = aye.u(parcel, readInt7);
                    } else if (c4 != 4) {
                        aye.y(parcel, readInt7);
                    } else {
                        z13 = aye.n(parcel, readInt7);
                    }
                }
                aye.m(parcel, z12);
                return new cq2(i, i3, i4, z13);
            case 7:
                int z14 = aye.z(parcel);
                wcc wccVar = null;
                m3e m3eVar = null;
                a50 a50Var = null;
                bhe bheVar = null;
                String str20 = null;
                while (parcel.dataPosition() < z14) {
                    int readInt8 = parcel.readInt();
                    char c5 = (char) readInt8;
                    if (c5 == 1) {
                        wccVar = (wcc) aye.g(parcel, readInt8, wcc.CREATOR);
                    } else if (c5 == 2) {
                        m3eVar = (m3e) aye.g(parcel, readInt8, m3e.CREATOR);
                    } else if (c5 == 3) {
                        a50Var = (a50) aye.g(parcel, readInt8, a50.CREATOR);
                    } else if (c5 == 4) {
                        bheVar = (bhe) aye.g(parcel, readInt8, bhe.CREATOR);
                    } else if (c5 != 5) {
                        aye.y(parcel, readInt8);
                    } else {
                        str20 = aye.h(parcel, readInt8);
                    }
                }
                aye.m(parcel, z14);
                return new z40(wccVar, m3eVar, a50Var, bheVar, str20);
            case 8:
                int z15 = aye.z(parcel);
                long j4 = 0;
                long j5 = 0;
                long j6 = 0;
                String str21 = null;
                String str22 = null;
                while (parcel.dataPosition() < z15) {
                    int readInt9 = parcel.readInt();
                    char c6 = (char) readInt9;
                    if (c6 == 2) {
                        j4 = aye.w(parcel, readInt9);
                    } else if (c6 == 3) {
                        j5 = aye.w(parcel, readInt9);
                    } else if (c6 == 4) {
                        str21 = aye.h(parcel, readInt9);
                    } else if (c6 == 5) {
                        str22 = aye.h(parcel, readInt9);
                    } else if (c6 != 6) {
                        aye.y(parcel, readInt9);
                    } else {
                        j6 = aye.w(parcel, readInt9);
                    }
                }
                aye.m(parcel, z15);
                return new ba(j4, j5, str21, str22, j6);
            case 9:
                int z16 = aye.z(parcel);
                double d2 = 0.0d;
                long j7 = 0;
                long j8 = 0;
                String str23 = null;
                MediaInfo mediaInfo = null;
                du6 du6Var = null;
                Boolean bool = null;
                long[] jArr = null;
                String str24 = null;
                String str25 = null;
                String str26 = null;
                String str27 = null;
                while (parcel.dataPosition() < z16) {
                    int readInt10 = parcel.readInt();
                    switch ((char) readInt10) {
                        case 2:
                            mediaInfo = (MediaInfo) aye.g(parcel, readInt10, MediaInfo.CREATOR);
                            break;
                        case 3:
                            du6Var = (du6) aye.g(parcel, readInt10, du6.CREATOR);
                            break;
                        case 4:
                            bool = aye.o(parcel, readInt10);
                            break;
                        case 5:
                            j7 = aye.w(parcel, readInt10);
                            break;
                        case 6:
                            d2 = aye.q(parcel, readInt10);
                            break;
                        case 7:
                            jArr = aye.f(parcel, readInt10);
                            break;
                        case '\b':
                            str23 = aye.h(parcel, readInt10);
                            break;
                        case '\t':
                            str24 = aye.h(parcel, readInt10);
                            break;
                        case '\n':
                            str25 = aye.h(parcel, readInt10);
                            break;
                        case 11:
                            str26 = aye.h(parcel, readInt10);
                            break;
                        case '\f':
                            str27 = aye.h(parcel, readInt10);
                            break;
                        case '\r':
                            j8 = aye.w(parcel, readInt10);
                            break;
                        default:
                            aye.y(parcel, readInt10);
                            break;
                    }
                }
                aye.m(parcel, z16);
                Pattern pattern = qd1.a;
                if (str23 != null) {
                    try {
                        jSONObject = new JSONObject(str23);
                    } catch (JSONException unused) {
                    }
                    return new kt6(mediaInfo, du6Var, bool, j7, d2, jArr, jSONObject, str24, str25, str26, str27, j8);
                }
                jSONObject = null;
                return new kt6(mediaInfo, du6Var, bool, j7, d2, jArr, jSONObject, str24, str25, str26, str27, j8);
            case 10:
                int z17 = aye.z(parcel);
                while (parcel.dataPosition() < z17) {
                    int readInt11 = parcel.readInt();
                    if (((char) readInt11) != 2) {
                        aye.y(parcel, readInt11);
                    } else {
                        i = aye.u(parcel, readInt11);
                    }
                }
                aye.m(parcel, z17);
                return new tmd(i);
            case 11:
                int z18 = aye.z(parcel);
                Bundle bundle = null;
                while (parcel.dataPosition() < z18) {
                    int readInt12 = parcel.readInt();
                    char c7 = (char) readInt12;
                    if (c7 == 2) {
                        arrayList = aye.l(parcel, readInt12, kxc.CREATOR);
                    } else if (c7 == 3) {
                        bundle = aye.a(parcel, readInt12);
                    } else if (c7 != 4) {
                        aye.y(parcel, readInt12);
                    } else {
                        i = aye.u(parcel, readInt12);
                    }
                }
                aye.m(parcel, z18);
                return new mt6(arrayList, bundle, i);
            case 12:
                int z19 = aye.z(parcel);
                ArrayList arrayList10 = null;
                ArrayList arrayList11 = null;
                while (parcel.dataPosition() < z19) {
                    int readInt13 = parcel.readInt();
                    char c8 = (char) readInt13;
                    if (c8 == 2) {
                        i = aye.u(parcel, readInt13);
                    } else if (c8 == 3) {
                        str7 = aye.h(parcel, readInt13);
                    } else if (c8 == 4) {
                        arrayList10 = aye.l(parcel, readInt13, mt6.CREATOR);
                    } else if (c8 == 5) {
                        arrayList11 = aye.l(parcel, readInt13, kxc.CREATOR);
                    } else if (c8 != 6) {
                        aye.y(parcel, readInt13);
                    } else {
                        d = aye.q(parcel, readInt13);
                    }
                }
                aye.m(parcel, z19);
                cu6 cu6Var = new cu6();
                cu6Var.a = i;
                cu6Var.b = str7;
                cu6Var.c = arrayList10;
                cu6Var.d = arrayList11;
                cu6Var.e = d;
                return cu6Var;
            case 13:
                int z20 = aye.z(parcel);
                int i5 = 0;
                boolean z21 = false;
                boolean z22 = false;
                boolean z23 = false;
                boolean z24 = false;
                while (parcel.dataPosition() < z20) {
                    int readInt14 = parcel.readInt();
                    char c9 = (char) readInt14;
                    if (c9 == 1) {
                        i5 = aye.u(parcel, readInt14);
                    } else if (c9 == 2) {
                        z21 = aye.n(parcel, readInt14);
                    } else if (c9 == 3) {
                        z22 = aye.n(parcel, readInt14);
                    } else if (c9 == 4) {
                        z23 = aye.n(parcel, readInt14);
                    } else if (c9 != 5) {
                        aye.y(parcel, readInt14);
                    } else {
                        z24 = aye.n(parcel, readInt14);
                    }
                }
                aye.m(parcel, z20);
                return new ind(i5, z21, z22, z23, z24);
            case 14:
                int z25 = aye.z(parcel);
                int i6 = 0;
                int i7 = 0;
                boolean z26 = false;
                String str28 = null;
                String str29 = null;
                cu6 cu6Var2 = null;
                ArrayList arrayList12 = null;
                while (parcel.dataPosition() < z25) {
                    int readInt15 = parcel.readInt();
                    switch ((char) readInt15) {
                        case 2:
                            str6 = aye.h(parcel, readInt15);
                            break;
                        case 3:
                            str28 = aye.h(parcel, readInt15);
                            break;
                        case 4:
                            i = aye.u(parcel, readInt15);
                            break;
                        case 5:
                            str29 = aye.h(parcel, readInt15);
                            break;
                        case 6:
                            cu6Var2 = (cu6) aye.g(parcel, readInt15, cu6.CREATOR);
                            break;
                        case 7:
                            i6 = aye.u(parcel, readInt15);
                            break;
                        case '\b':
                            arrayList12 = aye.l(parcel, readInt15, eu6.CREATOR);
                            break;
                        case '\t':
                            i7 = aye.u(parcel, readInt15);
                            break;
                        case '\n':
                            j = aye.w(parcel, readInt15);
                            break;
                        case 11:
                            z26 = aye.n(parcel, readInt15);
                            break;
                        default:
                            aye.y(parcel, readInt15);
                            break;
                    }
                }
                aye.m(parcel, z25);
                du6 du6Var2 = new du6();
                du6Var2.a = str6;
                du6Var2.b = str28;
                du6Var2.c = i;
                du6Var2.d = str29;
                du6Var2.e = cu6Var2;
                du6Var2.f = i6;
                du6Var2.h = arrayList12;
                du6Var2.n = i7;
                du6Var2.r = j;
                du6Var2.s = z26;
                return du6Var2;
            case 15:
                int z27 = aye.z(parcel);
                double d3 = 0.0d;
                double d4 = 0.0d;
                double d5 = 0.0d;
                int i8 = 0;
                boolean z28 = false;
                MediaInfo mediaInfo2 = null;
                long[] jArr2 = null;
                String str30 = null;
                while (parcel.dataPosition() < z27) {
                    int readInt16 = parcel.readInt();
                    switch ((char) readInt16) {
                        case 2:
                            mediaInfo2 = (MediaInfo) aye.g(parcel, readInt16, MediaInfo.CREATOR);
                            break;
                        case 3:
                            i8 = aye.u(parcel, readInt16);
                            break;
                        case 4:
                            z28 = aye.n(parcel, readInt16);
                            break;
                        case 5:
                            d3 = aye.q(parcel, readInt16);
                            break;
                        case 6:
                            d4 = aye.q(parcel, readInt16);
                            break;
                        case 7:
                            d5 = aye.q(parcel, readInt16);
                            break;
                        case '\b':
                            jArr2 = aye.f(parcel, readInt16);
                            break;
                        case '\t':
                            str30 = aye.h(parcel, readInt16);
                            break;
                        default:
                            aye.y(parcel, readInt16);
                            break;
                    }
                }
                aye.m(parcel, z27);
                return new eu6(mediaInfo2, i8, z28, d3, d4, d5, jArr2, str30);
            case 16:
                int z29 = aye.z(parcel);
                double d6 = 0.0d;
                double d7 = 0.0d;
                long j9 = 0;
                long j10 = 0;
                long j11 = 0;
                int i9 = 0;
                int i10 = 0;
                int i11 = 0;
                boolean z30 = false;
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                boolean z31 = false;
                MediaInfo mediaInfo3 = null;
                long[] jArr3 = null;
                String str31 = null;
                ArrayList arrayList13 = null;
                ba baVar = null;
                bfc bfcVar = null;
                it6 it6Var = null;
                du6 du6Var3 = null;
                while (parcel.dataPosition() < z29) {
                    int readInt17 = parcel.readInt();
                    switch ((char) readInt17) {
                        case 2:
                            mediaInfo3 = (MediaInfo) aye.g(parcel, readInt17, MediaInfo.CREATOR);
                            break;
                        case 3:
                            j9 = aye.w(parcel, readInt17);
                            break;
                        case 4:
                            i9 = aye.u(parcel, readInt17);
                            break;
                        case 5:
                            d6 = aye.q(parcel, readInt17);
                            break;
                        case 6:
                            i10 = aye.u(parcel, readInt17);
                            break;
                        case 7:
                            i11 = aye.u(parcel, readInt17);
                            break;
                        case '\b':
                            j10 = aye.w(parcel, readInt17);
                            break;
                        case '\t':
                            j11 = aye.w(parcel, readInt17);
                            break;
                        case '\n':
                            d7 = aye.q(parcel, readInt17);
                            break;
                        case 11:
                            z30 = aye.n(parcel, readInt17);
                            break;
                        case '\f':
                            jArr3 = aye.f(parcel, readInt17);
                            break;
                        case '\r':
                            i12 = aye.u(parcel, readInt17);
                            break;
                        case 14:
                            i13 = aye.u(parcel, readInt17);
                            break;
                        case 15:
                            str31 = aye.h(parcel, readInt17);
                            break;
                        case 16:
                            i14 = aye.u(parcel, readInt17);
                            break;
                        case 17:
                            arrayList13 = aye.l(parcel, readInt17, eu6.CREATOR);
                            break;
                        case 18:
                            z31 = aye.n(parcel, readInt17);
                            break;
                        case 19:
                            baVar = (ba) aye.g(parcel, readInt17, ba.CREATOR);
                            break;
                        case 20:
                            bfcVar = (bfc) aye.g(parcel, readInt17, bfc.CREATOR);
                            break;
                        case 21:
                            it6Var = (it6) aye.g(parcel, readInt17, it6.CREATOR);
                            break;
                        case 22:
                            du6Var3 = (du6) aye.g(parcel, readInt17, du6.CREATOR);
                            break;
                        default:
                            aye.y(parcel, readInt17);
                            break;
                    }
                }
                aye.m(parcel, z29);
                return new j07(mediaInfo3, j9, i9, d6, i10, i11, j10, j11, d7, z30, jArr3, i12, i13, str31, i14, arrayList13, z31, baVar, bfcVar, it6Var, du6Var3);
            case 17:
                int z32 = aye.z(parcel);
                long j12 = 0;
                int i15 = 0;
                int i16 = 0;
                String str32 = null;
                String str33 = null;
                String str34 = null;
                String str35 = null;
                String str36 = null;
                ArrayList arrayList14 = null;
                while (parcel.dataPosition() < z32) {
                    int readInt18 = parcel.readInt();
                    switch ((char) readInt18) {
                        case 2:
                            j12 = aye.w(parcel, readInt18);
                            break;
                        case 3:
                            i15 = aye.u(parcel, readInt18);
                            break;
                        case 4:
                            str33 = aye.h(parcel, readInt18);
                            break;
                        case 5:
                            str34 = aye.h(parcel, readInt18);
                            break;
                        case 6:
                            str35 = aye.h(parcel, readInt18);
                            break;
                        case 7:
                            str36 = aye.h(parcel, readInt18);
                            break;
                        case '\b':
                            i16 = aye.u(parcel, readInt18);
                            break;
                        case '\t':
                            arrayList14 = aye.j(parcel, readInt18);
                            break;
                        case '\n':
                            str32 = aye.h(parcel, readInt18);
                            break;
                        default:
                            aye.y(parcel, readInt18);
                            break;
                    }
                }
                aye.m(parcel, z32);
                Pattern pattern2 = qd1.a;
                if (str32 != null) {
                    try {
                        jSONObject2 = new JSONObject(str32);
                    } catch (JSONException unused2) {
                    }
                    return new MediaTrack(j12, i15, str33, str34, str35, str36, i16, arrayList14, jSONObject2);
                }
                jSONObject2 = null;
                return new MediaTrack(j12, i15, str33, str34, str35, str36, i16, arrayList14, jSONObject2);
            case 18:
                int z33 = aye.z(parcel);
                long j13 = 0;
                long j14 = 0;
                boolean z34 = false;
                while (parcel.dataPosition() < z33) {
                    int readInt19 = parcel.readInt();
                    char c10 = (char) readInt19;
                    if (c10 == 1) {
                        z34 = aye.n(parcel, readInt19);
                    } else if (c10 == 2) {
                        j14 = aye.w(parcel, readInt19);
                    } else if (c10 != 3) {
                        aye.y(parcel, readInt19);
                    } else {
                        j13 = aye.w(parcel, readInt19);
                    }
                }
                aye.m(parcel, z33);
                return new kld(j13, j14, z34);
            case 19:
                int z35 = aye.z(parcel);
                while (parcel.dataPosition() < z35) {
                    int readInt20 = parcel.readInt();
                    if (((char) readInt20) != 1) {
                        aye.y(parcel, readInt20);
                    } else {
                        str5 = aye.h(parcel, readInt20);
                    }
                }
                aye.m(parcel, z35);
                n54 n54Var = new n54();
                n54Var.a = str5;
                return n54Var;
            case 20:
                int z36 = aye.z(parcel);
                int i17 = 0;
                int i18 = 0;
                int i19 = 0;
                int i20 = 0;
                int i21 = 0;
                boolean z37 = false;
                while (parcel.dataPosition() < z36) {
                    int readInt21 = parcel.readInt();
                    switch ((char) readInt21) {
                        case 2:
                            i = aye.u(parcel, readInt21);
                            break;
                        case 3:
                            i17 = aye.u(parcel, readInt21);
                            break;
                        case 4:
                            i18 = aye.u(parcel, readInt21);
                            break;
                        case 5:
                            i19 = aye.u(parcel, readInt21);
                            break;
                        case 6:
                            i20 = aye.u(parcel, readInt21);
                            break;
                        case 7:
                            i21 = aye.u(parcel, readInt21);
                            break;
                        case '\b':
                            z37 = aye.n(parcel, readInt21);
                            break;
                        case '\t':
                            str4 = aye.h(parcel, readInt21);
                            break;
                        default:
                            aye.y(parcel, readInt21);
                            break;
                    }
                }
                aye.m(parcel, z36);
                oe0 oe0Var = new oe0();
                oe0Var.a = i;
                oe0Var.b = i17;
                oe0Var.c = i18;
                oe0Var.d = i19;
                oe0Var.e = i20;
                oe0Var.f = i21;
                oe0Var.h = z37;
                oe0Var.n = str4;
                return oe0Var;
            case 21:
                int z38 = aye.z(parcel);
                float f3 = Float.MAX_VALUE;
                float f4 = Float.MAX_VALUE;
                float f5 = Float.MAX_VALUE;
                float f6 = 0.0f;
                float f7 = 0.0f;
                float f8 = 0.0f;
                float f9 = 0.0f;
                float f10 = 0.0f;
                float f11 = 0.0f;
                float f12 = 0.0f;
                float f13 = -1.0f;
                int i22 = 0;
                int i23 = 0;
                LandmarkParcel[] landmarkParcelArr = null;
                n9d[] n9dVarArr = null;
                while (parcel.dataPosition() < z38) {
                    int readInt22 = parcel.readInt();
                    switch ((char) readInt22) {
                        case 1:
                            i22 = aye.u(parcel, readInt22);
                            break;
                        case 2:
                            i23 = aye.u(parcel, readInt22);
                            break;
                        case 3:
                            f6 = aye.r(parcel, readInt22);
                            break;
                        case 4:
                            f7 = aye.r(parcel, readInt22);
                            break;
                        case 5:
                            f8 = aye.r(parcel, readInt22);
                            break;
                        case 6:
                            f9 = aye.r(parcel, readInt22);
                            break;
                        case 7:
                            f3 = aye.r(parcel, readInt22);
                            break;
                        case '\b':
                            f4 = aye.r(parcel, readInt22);
                            break;
                        case '\t':
                            landmarkParcelArr = (LandmarkParcel[]) aye.k(parcel, readInt22, LandmarkParcel.CREATOR);
                            break;
                        case '\n':
                            f10 = aye.r(parcel, readInt22);
                            break;
                        case 11:
                            f11 = aye.r(parcel, readInt22);
                            break;
                        case '\f':
                            f12 = aye.r(parcel, readInt22);
                            break;
                        case '\r':
                            n9dVarArr = (n9d[]) aye.k(parcel, readInt22, n9d.CREATOR);
                            break;
                        case 14:
                            f5 = aye.r(parcel, readInt22);
                            break;
                        case 15:
                            f13 = aye.r(parcel, readInt22);
                            break;
                        default:
                            aye.y(parcel, readInt22);
                            break;
                    }
                }
                aye.m(parcel, z38);
                return new FaceParcel(i22, i23, f6, f7, f8, f9, f3, f4, f5, landmarkParcelArr, f10, f11, f12, n9dVarArr, f13);
            case 22:
                int z39 = aye.z(parcel);
                String str37 = null;
                while (parcel.dataPosition() < z39) {
                    int readInt23 = parcel.readInt();
                    char c11 = (char) readInt23;
                    if (c11 == 2) {
                        str3 = aye.h(parcel, readInt23);
                    } else if (c11 != 3) {
                        aye.y(parcel, readInt23);
                    } else {
                        str37 = aye.h(parcel, readInt23);
                    }
                }
                aye.m(parcel, z39);
                yy5 yy5Var = new yy5();
                yy5Var.a = str3;
                yy5Var.b = str37;
                return yy5Var;
            case 23:
                int z40 = aye.z(parcel);
                int i24 = 0;
                int i25 = 0;
                boolean z41 = false;
                boolean z42 = false;
                boolean z43 = false;
                int i26 = 0;
                String str38 = null;
                String str39 = null;
                String str40 = null;
                String str41 = null;
                String str42 = null;
                ArrayList arrayList15 = null;
                while (parcel.dataPosition() < z40) {
                    int readInt24 = parcel.readInt();
                    switch ((char) readInt24) {
                        case 2:
                            str38 = aye.h(parcel, readInt24);
                            break;
                        case 3:
                            str39 = aye.h(parcel, readInt24);
                            break;
                        case 4:
                            i24 = aye.u(parcel, readInt24);
                            break;
                        case 5:
                            i25 = aye.u(parcel, readInt24);
                            break;
                        case 6:
                            z41 = aye.n(parcel, readInt24);
                            break;
                        case 7:
                            z42 = aye.n(parcel, readInt24);
                            break;
                        case '\b':
                            str40 = aye.h(parcel, readInt24);
                            break;
                        case '\t':
                            z43 = aye.n(parcel, readInt24);
                            break;
                        case '\n':
                            str41 = aye.h(parcel, readInt24);
                            break;
                        case 11:
                            str42 = aye.h(parcel, readInt24);
                            break;
                        case '\f':
                            i26 = aye.u(parcel, readInt24);
                            break;
                        case '\r':
                            arrayList15 = aye.j(parcel, readInt24);
                            break;
                        default:
                            aye.y(parcel, readInt24);
                            break;
                    }
                }
                aye.m(parcel, z40);
                return new ConnectionConfiguration(str38, str39, i24, i25, z41, z42, str40, z43, str41, str42, i26, arrayList15);
            case 24:
                int z44 = aye.z(parcel);
                String str43 = null;
                String str44 = null;
                String str45 = null;
                String str46 = null;
                dgd dgdVar = null;
                String str47 = null;
                Bundle bundle2 = null;
                while (parcel.dataPosition() < z44) {
                    int readInt25 = parcel.readInt();
                    switch ((char) readInt25) {
                        case 1:
                            str43 = aye.h(parcel, readInt25);
                            break;
                        case 2:
                            str44 = aye.h(parcel, readInt25);
                            break;
                        case 3:
                            str45 = aye.h(parcel, readInt25);
                            break;
                        case 4:
                            str46 = aye.h(parcel, readInt25);
                            break;
                        case 5:
                            dgdVar = (dgd) aye.g(parcel, readInt25, dgd.CREATOR);
                            break;
                        case 6:
                            str47 = aye.h(parcel, readInt25);
                            break;
                        case 7:
                            bundle2 = aye.a(parcel, readInt25);
                            break;
                        default:
                            aye.y(parcel, readInt25);
                            break;
                    }
                }
                aye.m(parcel, z44);
                return new wld(str43, str44, str45, str46, dgdVar, str47, bundle2);
            case 25:
                int z45 = aye.z(parcel);
                while (parcel.dataPosition() < z45) {
                    int readInt26 = parcel.readInt();
                    char c12 = (char) readInt26;
                    if (c12 == 1) {
                        i = aye.u(parcel, readInt26);
                    } else if (c12 != 2) {
                        aye.y(parcel, readInt26);
                    } else {
                        str2 = aye.h(parcel, readInt26);
                    }
                }
                aye.m(parcel, z45);
                return new Scope(i, str2);
            case 26:
                int z46 = aye.z(parcel);
                ra4 ra4Var = null;
                ohf ohfVar = null;
                tbc tbcVar = null;
                mmf mmfVar = null;
                gad gadVar = null;
                sad sadVar = null;
                xjf xjfVar = null;
                lbd lbdVar = null;
                h15 h15Var = null;
                pcd pcdVar = null;
                afd afdVar = null;
                wbd wbdVar = null;
                while (parcel.dataPosition() < z46) {
                    int readInt27 = parcel.readInt();
                    switch ((char) readInt27) {
                        case 2:
                            ra4Var = (ra4) aye.g(parcel, readInt27, ra4.CREATOR);
                            break;
                        case 3:
                            ohfVar = (ohf) aye.g(parcel, readInt27, ohf.CREATOR);
                            break;
                        case 4:
                            tbcVar = (tbc) aye.g(parcel, readInt27, tbc.CREATOR);
                            break;
                        case 5:
                            mmfVar = (mmf) aye.g(parcel, readInt27, mmf.CREATOR);
                            break;
                        case 6:
                            gadVar = (gad) aye.g(parcel, readInt27, gad.CREATOR);
                            break;
                        case 7:
                            sadVar = (sad) aye.g(parcel, readInt27, sad.CREATOR);
                            break;
                        case '\b':
                            xjfVar = (xjf) aye.g(parcel, readInt27, xjf.CREATOR);
                            break;
                        case '\t':
                            lbdVar = (lbd) aye.g(parcel, readInt27, lbd.CREATOR);
                            break;
                        case '\n':
                            h15Var = (h15) aye.g(parcel, readInt27, h15.CREATOR);
                            break;
                        case 11:
                            pcdVar = (pcd) aye.g(parcel, readInt27, pcd.CREATOR);
                            break;
                        case '\f':
                            afdVar = (afd) aye.g(parcel, readInt27, afd.CREATOR);
                            break;
                        case '\r':
                            wbdVar = (wbd) aye.g(parcel, readInt27, wbd.CREATOR);
                            break;
                        default:
                            aye.y(parcel, readInt27);
                            break;
                    }
                }
                aye.m(parcel, z46);
                return new y40(ra4Var, ohfVar, tbcVar, mmfVar, gadVar, sadVar, xjfVar, lbdVar, h15Var, pcdVar, afdVar, wbdVar);
            case 27:
                int z47 = aye.z(parcel);
                String str48 = null;
                String str49 = null;
                ArrayList arrayList16 = null;
                String str50 = null;
                Uri uri = null;
                String str51 = null;
                String str52 = null;
                Boolean bool2 = null;
                Boolean bool3 = null;
                while (parcel.dataPosition() < z47) {
                    int readInt28 = parcel.readInt();
                    switch ((char) readInt28) {
                        case 2:
                            str48 = aye.h(parcel, readInt28);
                            break;
                        case 3:
                            str49 = aye.h(parcel, readInt28);
                            break;
                        case 4:
                            aye.l(parcel, readInt28, kxc.CREATOR);
                            break;
                        case 5:
                            arrayList16 = aye.j(parcel, readInt28);
                            break;
                        case 6:
                            str50 = aye.h(parcel, readInt28);
                            break;
                        case 7:
                            uri = (Uri) aye.g(parcel, readInt28, Uri.CREATOR);
                            break;
                        case '\b':
                            str51 = aye.h(parcel, readInt28);
                            break;
                        case '\t':
                            str52 = aye.h(parcel, readInt28);
                            break;
                        case '\n':
                            bool2 = aye.o(parcel, readInt28);
                            break;
                        case 11:
                            bool3 = aye.o(parcel, readInt28);
                            break;
                        default:
                            aye.y(parcel, readInt28);
                            break;
                    }
                }
                aye.m(parcel, z47);
                return new xr(str48, str49, arrayList16, str50, uri, str51, str52, bool2, bool3);
            case 28:
                int z48 = aye.z(parcel);
                long j15 = Long.MAX_VALUE;
                boolean z49 = false;
                boolean z50 = false;
                boolean z51 = false;
                boolean z52 = false;
                LocationRequest locationRequest = null;
                ArrayList arrayList17 = null;
                String str53 = null;
                String str54 = null;
                while (parcel.dataPosition() < z48) {
                    int readInt29 = parcel.readInt();
                    char c13 = (char) readInt29;
                    if (c13 == 1) {
                        locationRequest = (LocationRequest) aye.g(parcel, readInt29, LocationRequest.CREATOR);
                    } else if (c13 != 5) {
                        switch (c13) {
                            case '\b':
                                z49 = aye.n(parcel, readInt29);
                                break;
                            case '\t':
                                z50 = aye.n(parcel, readInt29);
                                break;
                            case '\n':
                                str53 = aye.h(parcel, readInt29);
                                break;
                            case 11:
                                z51 = aye.n(parcel, readInt29);
                                break;
                            case '\f':
                                z52 = aye.n(parcel, readInt29);
                                break;
                            case '\r':
                                str54 = aye.h(parcel, readInt29);
                                break;
                            case 14:
                                j15 = aye.w(parcel, readInt29);
                                break;
                            default:
                                aye.y(parcel, readInt29);
                                break;
                        }
                    } else {
                        arrayList17 = aye.l(parcel, readInt29, fj2.CREATOR);
                    }
                }
                aye.m(parcel, z48);
                return new zsd(locationRequest, arrayList17, z49, z50, str53, z51, z52, str54, j15);
            default:
                int z53 = aye.z(parcel);
                String str55 = null;
                while (parcel.dataPosition() < z53) {
                    int readInt30 = parcel.readInt();
                    char c14 = (char) readInt30;
                    if (c14 == 2) {
                        str = aye.h(parcel, readInt30);
                    } else if (c14 != 3) {
                        aye.y(parcel, readInt30);
                    } else {
                        str55 = aye.h(parcel, readInt30);
                    }
                }
                aye.m(parcel, z53);
                return new DataItemAssetParcelable(str, str55);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new tkd[i];
            case 1:
                return new it6[i];
            case 2:
                return new zh2[i];
            case 3:
                return new oe5[i];
            case 4:
                return new n9d[i];
            case 5:
                return new CommonWalletObject[i];
            case 6:
                return new cq2[i];
            case 7:
                return new z40[i];
            case 8:
                return new ba[i];
            case 9:
                return new kt6[i];
            case 10:
                return new tmd[i];
            case 11:
                return new mt6[i];
            case 12:
                return new cu6[i];
            case 13:
                return new ind[i];
            case 14:
                return new du6[i];
            case 15:
                return new eu6[i];
            case 16:
                return new j07[i];
            case 17:
                return new MediaTrack[i];
            case 18:
                return new kld[i];
            case 19:
                return new n54[i];
            case 20:
                return new oe0[i];
            case 21:
                return new FaceParcel[i];
            case 22:
                return new yy5[i];
            case 23:
                return new ConnectionConfiguration[i];
            case 24:
                return new wld[i];
            case 25:
                return new Scope[i];
            case 26:
                return new y40[i];
            case 27:
                return new xr[i];
            case 28:
                return new zsd[i];
            default:
                return new DataItemAssetParcelable[i];
        }
    }
}
