package w;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.graphics.Point;
import android.media.MediaDescription;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import androidx.fragment.app.f0;
import androidx.fragment.app.l0;
import androidx.fragment.app.o0;
import b8.h;
import b8.j;
import b8.k;
import b8.l;
import b8.m;
import g7.o8;
import j$.util.Objects;
import java.util.ArrayList;
import kotlin.jvm.internal.i;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class a implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i9) {
        this.a = i9;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(final Parcel inParcel) {
        switch (this.a) {
            case 0:
                Bundle readBundle = inParcel.readBundle(a.class.getClassLoader());
                Objects.requireNonNull(readBundle);
                return new b(readBundle);
            case 1:
                String readString = inParcel.readString();
                readString.getClass();
                return new a4.a(inParcel.readInt(), readString);
            case 2:
                return new Parcelable(inParcel) { // from class: android.support.v4.media.MediaBrowserCompat$MediaItem
                    public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new w.a(2);
                    public final int a;
                    public final MediaDescriptionCompat b;

                    {
                        this.a = inParcel.readInt();
                        this.b = MediaDescriptionCompat.CREATOR.createFromParcel(inParcel);
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final String toString() {
                        return "MediaItem{mFlags=" + this.a + ", mDescription=" + this.b + '}';
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel, int i9) {
                        parcel.writeInt(this.a);
                        this.b.writeToParcel(parcel, i9);
                    }
                };
            case 3:
                return MediaDescriptionCompat.a(MediaDescription.CREATOR.createFromParcel(inParcel));
            case 4:
                return new MediaMetadataCompat(inParcel);
            case 5:
                return new RatingCompat(inParcel.readInt(), inParcel.readFloat());
            case 6:
                return new androidx.activity.result.a(inParcel);
            case 7:
                i.e(inParcel, "inParcel");
                Parcelable readParcelable = inParcel.readParcelable(IntentSender.class.getClassLoader());
                i.b(readParcelable);
                return new androidx.activity.result.g((IntentSender) readParcelable, (Intent) inParcel.readParcelable(Intent.class.getClassLoader()), inParcel.readInt(), inParcel.readInt());
            case 8:
                return new androidx.fragment.app.b(inParcel);
            case 9:
                return new androidx.fragment.app.c(inParcel);
            case 10:
                f0 f0Var = new f0();
                f0Var.a = inParcel.readString();
                f0Var.b = inParcel.readInt();
                return f0Var;
            case 11:
                l0 l0Var = new l0();
                l0Var.e = null;
                l0Var.f = new ArrayList();
                l0Var.h = new ArrayList();
                l0Var.a = inParcel.createStringArrayList();
                l0Var.b = inParcel.createStringArrayList();
                l0Var.c = (androidx.fragment.app.b[]) inParcel.createTypedArray(androidx.fragment.app.b.CREATOR);
                l0Var.d = inParcel.readInt();
                l0Var.e = inParcel.readString();
                l0Var.f = inParcel.createStringArrayList();
                l0Var.h = inParcel.createTypedArrayList(androidx.fragment.app.c.CREATOR);
                l0Var.n = inParcel.createTypedArrayList(f0.CREATOR);
                return l0Var;
            case 12:
                return new o0(inParcel);
            case 13:
                return new b4.a(inParcel);
            case 14:
                int z10 = o8.z(inParcel);
                boolean z11 = false;
                int i9 = 0;
                while (inParcel.dataPosition() < z10) {
                    int readInt = inParcel.readInt();
                    char c10 = (char) readInt;
                    if (c10 == 1) {
                        z11 = o8.n(inParcel, readInt);
                    } else if (c10 != 2) {
                        o8.y(inParcel, readInt);
                    } else {
                        i9 = o8.u(inParcel, readInt);
                    }
                }
                o8.m(inParcel, z10);
                return new b6.a(i9, z11);
            case 15:
                int z12 = o8.z(inParcel);
                PendingIntent pendingIntent = null;
                while (inParcel.dataPosition() < z12) {
                    int readInt2 = inParcel.readInt();
                    if (((char) readInt2) != 1) {
                        o8.y(inParcel, readInt2);
                    } else {
                        pendingIntent = (PendingIntent) o8.g(inParcel, readInt2, PendingIntent.CREATOR);
                    }
                }
                o8.m(inParcel, z12);
                return new b6.b(pendingIntent);
            case 16:
                int z13 = o8.z(inParcel);
                int i10 = 0;
                boolean z14 = false;
                while (inParcel.dataPosition() < z13) {
                    int readInt3 = inParcel.readInt();
                    char c11 = (char) readInt3;
                    if (c11 == 1) {
                        i10 = o8.u(inParcel, readInt3);
                    } else if (c11 != 2) {
                        o8.y(inParcel, readInt3);
                    } else {
                        z14 = o8.n(inParcel, readInt3);
                    }
                }
                o8.m(inParcel, z13);
                return new b6.c(i10, z14);
            case 17:
                int z15 = o8.z(inParcel);
                int i11 = 0;
                String[] strArr = null;
                while (inParcel.dataPosition() < z15) {
                    int readInt4 = inParcel.readInt();
                    char c12 = (char) readInt4;
                    if (c12 == 2) {
                        i11 = o8.u(inParcel, readInt4);
                    } else if (c12 != 3) {
                        o8.y(inParcel, readInt4);
                    } else {
                        strArr = o8.i(inParcel, readInt4);
                    }
                }
                o8.m(inParcel, z15);
                b8.a aVar = new b8.a();
                aVar.a = i11;
                aVar.b = strArr;
                return aVar;
            case 18:
                int z16 = o8.z(inParcel);
                int i12 = 0;
                String str = null;
                String str2 = null;
                Point[] pointArr = null;
                b8.f fVar = null;
                b8.i iVar = null;
                j jVar = null;
                l lVar = null;
                k kVar = null;
                b8.g gVar = null;
                byte[] bArr = null;
                b8.d dVar = null;
                b8.c cVar = null;
                b8.e eVar = null;
                int i13 = 0;
                boolean z17 = false;
                while (inParcel.dataPosition() < z16) {
                    int readInt5 = inParcel.readInt();
                    b8.g gVar2 = gVar;
                    switch ((char) readInt5) {
                        case 2:
                            i12 = o8.u(inParcel, readInt5);
                            break;
                        case 3:
                            str = o8.h(inParcel, readInt5);
                            break;
                        case 4:
                            str2 = o8.h(inParcel, readInt5);
                            break;
                        case 5:
                            i13 = o8.u(inParcel, readInt5);
                            break;
                        case 6:
                            pointArr = (Point[]) o8.k(inParcel, readInt5, Point.CREATOR);
                            break;
                        case 7:
                            fVar = (b8.f) o8.g(inParcel, readInt5, b8.f.CREATOR);
                            break;
                        case '\b':
                            iVar = (b8.i) o8.g(inParcel, readInt5, b8.i.CREATOR);
                            break;
                        case '\t':
                            jVar = (j) o8.g(inParcel, readInt5, j.CREATOR);
                            break;
                        case '\n':
                            lVar = (l) o8.g(inParcel, readInt5, l.CREATOR);
                            break;
                        case 11:
                            kVar = (k) o8.g(inParcel, readInt5, k.CREATOR);
                            break;
                        case '\f':
                            gVar = (b8.g) o8.g(inParcel, readInt5, b8.g.CREATOR);
                            continue;
                        case '\r':
                            cVar = (b8.c) o8.g(inParcel, readInt5, b8.c.CREATOR);
                            break;
                        case 14:
                            dVar = (b8.d) o8.g(inParcel, readInt5, b8.d.CREATOR);
                            break;
                        case 15:
                            eVar = (b8.e) o8.g(inParcel, readInt5, b8.e.CREATOR);
                            break;
                        case 16:
                            bArr = o8.b(inParcel, readInt5);
                            break;
                        case 17:
                            z17 = o8.n(inParcel, readInt5);
                            break;
                        default:
                            o8.y(inParcel, readInt5);
                            break;
                    }
                    gVar = gVar2;
                }
                o8.m(inParcel, z16);
                m mVar = new m();
                mVar.a = i12;
                mVar.b = str;
                mVar.A = bArr;
                mVar.c = str2;
                mVar.d = i13;
                mVar.e = pointArr;
                mVar.B = z17;
                mVar.f = fVar;
                mVar.h = iVar;
                mVar.n = jVar;
                mVar.r = lVar;
                mVar.s = kVar;
                mVar.v = gVar;
                mVar.w = cVar;
                mVar.x = dVar;
                mVar.y = eVar;
                return mVar;
            case 19:
                int z18 = o8.z(inParcel);
                int i14 = 0;
                String str3 = null;
                int i15 = 0;
                int i16 = 0;
                int i17 = 0;
                int i18 = 0;
                int i19 = 0;
                boolean z19 = false;
                while (inParcel.dataPosition() < z18) {
                    int readInt6 = inParcel.readInt();
                    switch ((char) readInt6) {
                        case 2:
                            i14 = o8.u(inParcel, readInt6);
                            break;
                        case 3:
                            i15 = o8.u(inParcel, readInt6);
                            break;
                        case 4:
                            i16 = o8.u(inParcel, readInt6);
                            break;
                        case 5:
                            i17 = o8.u(inParcel, readInt6);
                            break;
                        case 6:
                            i18 = o8.u(inParcel, readInt6);
                            break;
                        case 7:
                            i19 = o8.u(inParcel, readInt6);
                            break;
                        case '\b':
                            z19 = o8.n(inParcel, readInt6);
                            break;
                        case '\t':
                            str3 = o8.h(inParcel, readInt6);
                            break;
                        default:
                            o8.y(inParcel, readInt6);
                            break;
                    }
                }
                o8.m(inParcel, z18);
                b8.b bVar = new b8.b();
                bVar.a = i14;
                bVar.b = i15;
                bVar.c = i16;
                bVar.d = i17;
                bVar.e = i18;
                bVar.f = i19;
                bVar.h = z19;
                bVar.n = str3;
                return bVar;
            case 20:
                int z20 = o8.z(inParcel);
                h hVar = null;
                String str4 = null;
                String str5 = null;
                b8.i[] iVarArr = null;
                b8.f[] fVarArr = null;
                String[] strArr2 = null;
                b8.a[] aVarArr = null;
                while (inParcel.dataPosition() < z20) {
                    int readInt7 = inParcel.readInt();
                    switch ((char) readInt7) {
                        case 2:
                            hVar = (h) o8.g(inParcel, readInt7, h.CREATOR);
                            break;
                        case 3:
                            str4 = o8.h(inParcel, readInt7);
                            break;
                        case 4:
                            str5 = o8.h(inParcel, readInt7);
                            break;
                        case 5:
                            iVarArr = (b8.i[]) o8.k(inParcel, readInt7, b8.i.CREATOR);
                            break;
                        case 6:
                            fVarArr = (b8.f[]) o8.k(inParcel, readInt7, b8.f.CREATOR);
                            break;
                        case 7:
                            strArr2 = o8.i(inParcel, readInt7);
                            break;
                        case '\b':
                            aVarArr = (b8.a[]) o8.k(inParcel, readInt7, b8.a.CREATOR);
                            break;
                        default:
                            o8.y(inParcel, readInt7);
                            break;
                    }
                }
                o8.m(inParcel, z20);
                b8.d dVar2 = new b8.d();
                dVar2.a = hVar;
                dVar2.b = str4;
                dVar2.c = str5;
                dVar2.d = iVarArr;
                dVar2.e = fVarArr;
                dVar2.f = strArr2;
                dVar2.h = aVarArr;
                return dVar2;
            case 21:
                int z21 = o8.z(inParcel);
                String str6 = null;
                String str7 = null;
                String str8 = null;
                String str9 = null;
                String str10 = null;
                b8.b bVar2 = null;
                b8.b bVar3 = null;
                while (inParcel.dataPosition() < z21) {
                    int readInt8 = inParcel.readInt();
                    switch ((char) readInt8) {
                        case 2:
                            str6 = o8.h(inParcel, readInt8);
                            break;
                        case 3:
                            str7 = o8.h(inParcel, readInt8);
                            break;
                        case 4:
                            str8 = o8.h(inParcel, readInt8);
                            break;
                        case 5:
                            str9 = o8.h(inParcel, readInt8);
                            break;
                        case 6:
                            str10 = o8.h(inParcel, readInt8);
                            break;
                        case 7:
                            bVar2 = (b8.b) o8.g(inParcel, readInt8, b8.b.CREATOR);
                            break;
                        case '\b':
                            bVar3 = (b8.b) o8.g(inParcel, readInt8, b8.b.CREATOR);
                            break;
                        default:
                            o8.y(inParcel, readInt8);
                            break;
                    }
                }
                o8.m(inParcel, z21);
                b8.c cVar2 = new b8.c();
                cVar2.a = str6;
                cVar2.b = str7;
                cVar2.c = str8;
                cVar2.d = str9;
                cVar2.e = str10;
                cVar2.f = bVar2;
                cVar2.h = bVar3;
                return cVar2;
            case 22:
                int z22 = o8.z(inParcel);
                int i20 = 0;
                String str11 = null;
                String str12 = null;
                String str13 = null;
                while (inParcel.dataPosition() < z22) {
                    int readInt9 = inParcel.readInt();
                    char c13 = (char) readInt9;
                    if (c13 == 2) {
                        i20 = o8.u(inParcel, readInt9);
                    } else if (c13 == 3) {
                        str11 = o8.h(inParcel, readInt9);
                    } else if (c13 == 4) {
                        str12 = o8.h(inParcel, readInt9);
                    } else if (c13 != 5) {
                        o8.y(inParcel, readInt9);
                    } else {
                        str13 = o8.h(inParcel, readInt9);
                    }
                }
                o8.m(inParcel, z22);
                b8.f fVar2 = new b8.f();
                fVar2.a = i20;
                fVar2.b = str11;
                fVar2.c = str12;
                fVar2.d = str13;
                return fVar2;
            case 23:
                int z23 = o8.z(inParcel);
                String str14 = null;
                String str15 = null;
                String str16 = null;
                String str17 = null;
                String str18 = null;
                String str19 = null;
                String str20 = null;
                String str21 = null;
                String str22 = null;
                String str23 = null;
                String str24 = null;
                String str25 = null;
                String str26 = null;
                String str27 = null;
                while (inParcel.dataPosition() < z23) {
                    int readInt10 = inParcel.readInt();
                    String str28 = str26;
                    switch ((char) readInt10) {
                        case 2:
                            str14 = o8.h(inParcel, readInt10);
                            break;
                        case 3:
                            str15 = o8.h(inParcel, readInt10);
                            break;
                        case 4:
                            str16 = o8.h(inParcel, readInt10);
                            break;
                        case 5:
                            str17 = o8.h(inParcel, readInt10);
                            break;
                        case 6:
                            str18 = o8.h(inParcel, readInt10);
                            break;
                        case 7:
                            str19 = o8.h(inParcel, readInt10);
                            break;
                        case '\b':
                            str20 = o8.h(inParcel, readInt10);
                            break;
                        case '\t':
                            str21 = o8.h(inParcel, readInt10);
                            break;
                        case '\n':
                            str22 = o8.h(inParcel, readInt10);
                            break;
                        case 11:
                            str23 = o8.h(inParcel, readInt10);
                            break;
                        case '\f':
                            str24 = o8.h(inParcel, readInt10);
                            break;
                        case '\r':
                            str25 = o8.h(inParcel, readInt10);
                            break;
                        case 14:
                            str26 = o8.h(inParcel, readInt10);
                            continue;
                        case 15:
                            str27 = o8.h(inParcel, readInt10);
                            break;
                        default:
                            o8.y(inParcel, readInt10);
                            break;
                    }
                    str26 = str28;
                }
                o8.m(inParcel, z23);
                b8.e eVar2 = new b8.e();
                eVar2.a = str14;
                eVar2.b = str15;
                eVar2.c = str16;
                eVar2.d = str17;
                eVar2.e = str18;
                eVar2.f = str19;
                eVar2.h = str20;
                eVar2.n = str21;
                eVar2.r = str22;
                eVar2.s = str23;
                eVar2.v = str24;
                eVar2.w = str25;
                eVar2.x = str26;
                eVar2.y = str27;
                return eVar2;
            case 24:
                int z24 = o8.z(inParcel);
                String str29 = null;
                String str30 = null;
                String str31 = null;
                String str32 = null;
                String str33 = null;
                String str34 = null;
                String str35 = null;
                while (inParcel.dataPosition() < z24) {
                    int readInt11 = inParcel.readInt();
                    switch ((char) readInt11) {
                        case 2:
                            str29 = o8.h(inParcel, readInt11);
                            break;
                        case 3:
                            str30 = o8.h(inParcel, readInt11);
                            break;
                        case 4:
                            str31 = o8.h(inParcel, readInt11);
                            break;
                        case 5:
                            str32 = o8.h(inParcel, readInt11);
                            break;
                        case 6:
                            str33 = o8.h(inParcel, readInt11);
                            break;
                        case 7:
                            str34 = o8.h(inParcel, readInt11);
                            break;
                        case '\b':
                            str35 = o8.h(inParcel, readInt11);
                            break;
                        default:
                            o8.y(inParcel, readInt11);
                            break;
                    }
                }
                o8.m(inParcel, z24);
                h hVar2 = new h();
                hVar2.a = str29;
                hVar2.b = str30;
                hVar2.c = str31;
                hVar2.d = str32;
                hVar2.e = str33;
                hVar2.f = str34;
                hVar2.h = str35;
                return hVar2;
            case 25:
                int z25 = o8.z(inParcel);
                double d = 0.0d;
                double d9 = 0.0d;
                while (inParcel.dataPosition() < z25) {
                    int readInt12 = inParcel.readInt();
                    char c14 = (char) readInt12;
                    if (c14 == 2) {
                        d = o8.q(inParcel, readInt12);
                    } else if (c14 != 3) {
                        o8.y(inParcel, readInt12);
                    } else {
                        d9 = o8.q(inParcel, readInt12);
                    }
                }
                o8.m(inParcel, z25);
                b8.g gVar3 = new b8.g();
                gVar3.a = d;
                gVar3.b = d9;
                return gVar3;
            case 26:
                int z26 = o8.z(inParcel);
                String str36 = null;
                String str37 = null;
                while (inParcel.dataPosition() < z26) {
                    int readInt13 = inParcel.readInt();
                    char c15 = (char) readInt13;
                    if (c15 == 2) {
                        str36 = o8.h(inParcel, readInt13);
                    } else if (c15 != 3) {
                        o8.y(inParcel, readInt13);
                    } else {
                        str37 = o8.h(inParcel, readInt13);
                    }
                }
                o8.m(inParcel, z26);
                j jVar2 = new j();
                jVar2.a = str36;
                jVar2.b = str37;
                return jVar2;
            case 27:
                int z27 = o8.z(inParcel);
                int i21 = 0;
                String str38 = null;
                while (inParcel.dataPosition() < z27) {
                    int readInt14 = inParcel.readInt();
                    char c16 = (char) readInt14;
                    if (c16 == 2) {
                        i21 = o8.u(inParcel, readInt14);
                    } else if (c16 != 3) {
                        o8.y(inParcel, readInt14);
                    } else {
                        str38 = o8.h(inParcel, readInt14);
                    }
                }
                o8.m(inParcel, z27);
                b8.i iVar2 = new b8.i();
                iVar2.a = i21;
                iVar2.b = str38;
                return iVar2;
            case 28:
                int z28 = o8.z(inParcel);
                String str39 = null;
                String str40 = null;
                int i22 = 0;
                while (inParcel.dataPosition() < z28) {
                    int readInt15 = inParcel.readInt();
                    char c17 = (char) readInt15;
                    if (c17 == 2) {
                        str39 = o8.h(inParcel, readInt15);
                    } else if (c17 == 3) {
                        str40 = o8.h(inParcel, readInt15);
                    } else if (c17 != 4) {
                        o8.y(inParcel, readInt15);
                    } else {
                        i22 = o8.u(inParcel, readInt15);
                    }
                }
                o8.m(inParcel, z28);
                l lVar2 = new l();
                lVar2.a = str39;
                lVar2.b = str40;
                lVar2.c = i22;
                return lVar2;
            default:
                int z29 = o8.z(inParcel);
                String str41 = null;
                String str42 = null;
                while (inParcel.dataPosition() < z29) {
                    int readInt16 = inParcel.readInt();
                    char c18 = (char) readInt16;
                    if (c18 == 2) {
                        str41 = o8.h(inParcel, readInt16);
                    } else if (c18 != 3) {
                        o8.y(inParcel, readInt16);
                    } else {
                        str42 = o8.h(inParcel, readInt16);
                    }
                }
                o8.m(inParcel, z29);
                k kVar2 = new k();
                kVar2.a = str41;
                kVar2.b = str42;
                return kVar2;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i9) {
        switch (this.a) {
            case 0:
                return new b[i9];
            case 1:
                return new a4.a[i9];
            case 2:
                return new MediaBrowserCompat$MediaItem[i9];
            case 3:
                return new MediaDescriptionCompat[i9];
            case 4:
                return new MediaMetadataCompat[i9];
            case 5:
                return new RatingCompat[i9];
            case 6:
                return new androidx.activity.result.a[i9];
            case 7:
                return new androidx.activity.result.g[i9];
            case 8:
                return new androidx.fragment.app.b[i9];
            case 9:
                return new androidx.fragment.app.c[i9];
            case 10:
                return new f0[i9];
            case 11:
                return new l0[i9];
            case 12:
                return new o0[i9];
            case 13:
                return new b4.a[i9];
            case 14:
                return new b6.a[i9];
            case 15:
                return new b6.b[i9];
            case 16:
                return new b6.c[i9];
            case 17:
                return new b8.a[i9];
            case 18:
                return new m[i9];
            case 19:
                return new b8.b[i9];
            case 20:
                return new b8.d[i9];
            case 21:
                return new b8.c[i9];
            case 22:
                return new b8.f[i9];
            case 23:
                return new b8.e[i9];
            case 24:
                return new h[i9];
            case 25:
                return new b8.g[i9];
            case 26:
                return new j[i9];
            case 27:
                return new b8.i[i9];
            case 28:
                return new l[i9];
            default:
                return new k[i9];
        }
    }
}
