package w;

import a7.h;
import a7.i;
import a7.j;
import a7.l;
import a7.m;
import a7.n;
import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.graphics.Point;
import android.media.MediaDescription;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import androidx.fragment.app.f0;
import androidx.fragment.app.l0;
import androidx.fragment.app.o0;
import c8.k;
import com.google.android.exoplayer2.metadata.flac.PictureFrame;
import com.google.android.gms.common.api.Status;
import h7.q8;
import j$.util.Objects;
import java.util.ArrayList;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class a implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i10) {
        this.a = i10;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(final Parcel inParcel) {
        int i10 = -1;
        boolean z10 = false;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        boolean z11 = false;
        boolean z12 = false;
        int i14 = 0;
        h[] hVarArr = null;
        String str = null;
        String[] strArr = null;
        PendingIntent pendingIntent = null;
        c.b bVar = null;
        Status status = null;
        Bundle bundle = null;
        String str2 = null;
        String str3 = null;
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
                int z13 = q8.z(inParcel);
                String str4 = null;
                Account account = null;
                while (inParcel.dataPosition() < z13) {
                    int readInt = inParcel.readInt();
                    char c10 = (char) readInt;
                    if (c10 == 1) {
                        hVarArr = (h[]) q8.k(inParcel, readInt, h.CREATOR);
                    } else if (c10 == 2) {
                        str4 = q8.h(inParcel, readInt);
                    } else if (c10 == 3) {
                        z10 = q8.n(inParcel, readInt);
                    } else if (c10 != 4) {
                        q8.y(inParcel, readInt);
                    } else {
                        account = (Account) q8.g(inParcel, readInt, Account.CREATOR);
                    }
                }
                q8.m(inParcel, z13);
                return new a7.f(hVarArr, str4, z10, account);
            case 3:
                int z14 = q8.z(inParcel);
                String str5 = null;
                String str6 = null;
                while (inParcel.dataPosition() < z14) {
                    int readInt2 = inParcel.readInt();
                    char c11 = (char) readInt2;
                    if (c11 == 1) {
                        str3 = q8.h(inParcel, readInt2);
                    } else if (c11 == 2) {
                        str5 = q8.h(inParcel, readInt2);
                    } else if (c11 != 3) {
                        q8.y(inParcel, readInt2);
                    } else {
                        str6 = q8.h(inParcel, readInt2);
                    }
                }
                q8.m(inParcel, z14);
                return new a7.g(str3, str5, str6);
            case 4:
                int z15 = q8.z(inParcel);
                l lVar = null;
                byte[] bArr = null;
                while (inParcel.dataPosition() < z15) {
                    int readInt3 = inParcel.readInt();
                    char c12 = (char) readInt3;
                    if (c12 == 1) {
                        str2 = q8.h(inParcel, readInt3);
                    } else if (c12 == 3) {
                        lVar = (l) q8.g(inParcel, readInt3, l.CREATOR);
                    } else if (c12 == 4) {
                        i10 = q8.u(inParcel, readInt3);
                    } else if (c12 != 5) {
                        q8.y(inParcel, readInt3);
                    } else {
                        bArr = q8.b(inParcel, readInt3);
                    }
                }
                q8.m(inParcel, z15);
                return new h(str2, lVar, i10, bArr);
            case 5:
                int z16 = q8.z(inParcel);
                while (inParcel.dataPosition() < z16) {
                    int readInt4 = inParcel.readInt();
                    char c13 = (char) readInt4;
                    if (c13 == 1) {
                        i14 = q8.u(inParcel, readInt4);
                    } else if (c13 != 2) {
                        q8.y(inParcel, readInt4);
                    } else {
                        bundle = q8.a(inParcel, readInt4);
                    }
                }
                q8.m(inParcel, z16);
                return new i(i14, bundle);
            case 6:
                int z17 = q8.z(inParcel);
                ArrayList arrayList = null;
                String[] strArr2 = null;
                while (inParcel.dataPosition() < z17) {
                    int readInt5 = inParcel.readInt();
                    char c14 = (char) readInt5;
                    if (c14 == 1) {
                        status = (Status) q8.g(inParcel, readInt5, Status.CREATOR);
                    } else if (c14 == 2) {
                        arrayList = q8.l(inParcel, readInt5, n.CREATOR);
                    } else if (c14 != 3) {
                        q8.y(inParcel, readInt5);
                    } else {
                        strArr2 = q8.i(inParcel, readInt5);
                    }
                }
                q8.m(inParcel, z17);
                j jVar = new j();
                jVar.a = status;
                jVar.b = arrayList;
                jVar.c = strArr2;
                return jVar;
            case 7:
                int z18 = q8.z(inParcel);
                String str7 = null;
                String str8 = null;
                String str9 = null;
                i[] iVarArr = null;
                String str10 = null;
                m mVar = null;
                boolean z19 = false;
                int i15 = 1;
                boolean z20 = false;
                while (inParcel.dataPosition() < z18) {
                    int readInt6 = inParcel.readInt();
                    char c15 = (char) readInt6;
                    if (c15 == 11) {
                        str10 = q8.h(inParcel, readInt6);
                    } else if (c15 != '\f') {
                        switch (c15) {
                            case 1:
                                str7 = q8.h(inParcel, readInt6);
                                break;
                            case 2:
                                str8 = q8.h(inParcel, readInt6);
                                break;
                            case 3:
                                z19 = q8.n(inParcel, readInt6);
                                break;
                            case 4:
                                i15 = q8.u(inParcel, readInt6);
                                break;
                            case 5:
                                z20 = q8.n(inParcel, readInt6);
                                break;
                            case 6:
                                str9 = q8.h(inParcel, readInt6);
                                break;
                            case 7:
                                iVarArr = (i[]) q8.k(inParcel, readInt6, i.CREATOR);
                                break;
                            default:
                                q8.y(inParcel, readInt6);
                                break;
                        }
                    } else {
                        mVar = (m) q8.g(inParcel, readInt6, m.CREATOR);
                    }
                }
                q8.m(inParcel, z18);
                return new l(str7, str8, z19, i15, z20, str9, iVarArr, str10, mVar);
            case 8:
                int z21 = q8.z(inParcel);
                while (inParcel.dataPosition() < z21) {
                    int readInt7 = inParcel.readInt();
                    if (((char) readInt7) != 1) {
                        q8.y(inParcel, readInt7);
                    } else {
                        z12 = q8.n(inParcel, readInt7);
                    }
                }
                q8.m(inParcel, z21);
                return new m(z12);
            case 9:
                int z22 = q8.z(inParcel);
                long j10 = 0;
                a7.g gVar = null;
                String str11 = null;
                a7.f fVar = null;
                String str12 = null;
                int i16 = 0;
                boolean z23 = false;
                int i17 = -1;
                int i18 = 0;
                while (inParcel.dataPosition() < z22) {
                    int readInt8 = inParcel.readInt();
                    switch ((char) readInt8) {
                        case 1:
                            gVar = (a7.g) q8.g(inParcel, readInt8, a7.g.CREATOR);
                            break;
                        case 2:
                            j10 = q8.w(inParcel, readInt8);
                            break;
                        case 3:
                            i16 = q8.u(inParcel, readInt8);
                            break;
                        case 4:
                            str11 = q8.h(inParcel, readInt8);
                            break;
                        case 5:
                            fVar = (a7.f) q8.g(inParcel, readInt8, a7.f.CREATOR);
                            break;
                        case 6:
                            z23 = q8.n(inParcel, readInt8);
                            break;
                        case 7:
                            i17 = q8.u(inParcel, readInt8);
                            break;
                        case '\b':
                            i18 = q8.u(inParcel, readInt8);
                            break;
                        case '\t':
                            str12 = q8.h(inParcel, readInt8);
                            break;
                        default:
                            q8.y(inParcel, readInt8);
                            break;
                    }
                }
                q8.m(inParcel, z22);
                return new n(gVar, j10, i16, str11, fVar, z23, i17, i18, str12);
            case 10:
                return new Parcelable(inParcel) { // from class: android.support.v4.media.MediaBrowserCompat$MediaItem
                    public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new w.a(10);
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
                    public final void writeToParcel(Parcel parcel, int i19) {
                        parcel.writeInt(this.a);
                        this.b.writeToParcel(parcel, i19);
                    }
                };
            case 11:
                return MediaDescriptionCompat.a(MediaDescription.CREATOR.createFromParcel(inParcel));
            case 12:
                return new MediaMetadataCompat(inParcel);
            case 13:
                return new RatingCompat(inParcel.readInt(), inParcel.readFloat());
            case 14:
                return new androidx.activity.result.a(inParcel);
            case 15:
                kotlin.jvm.internal.j.e(inParcel, "inParcel");
                Parcelable readParcelable = inParcel.readParcelable(IntentSender.class.getClassLoader());
                kotlin.jvm.internal.j.b(readParcelable);
                return new androidx.activity.result.g((IntentSender) readParcelable, (Intent) inParcel.readParcelable(Intent.class.getClassLoader()), inParcel.readInt(), inParcel.readInt());
            case 16:
                return new androidx.fragment.app.b(inParcel);
            case 17:
                return new androidx.fragment.app.c(inParcel);
            case 18:
                f0 f0Var = new f0();
                f0Var.a = inParcel.readString();
                f0Var.b = inParcel.readInt();
                return f0Var;
            case 19:
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
            case 20:
                return new o0(inParcel);
            case 21:
                return new b4.a(inParcel);
            case 22:
                c.d dVar = new c.d();
                IBinder readStrongBinder = inParcel.readStrongBinder();
                int i19 = c.c.b;
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(c.b.h);
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof c.b)) {
                        c.a aVar = new c.a();
                        aVar.a = readStrongBinder;
                        bVar = aVar;
                    } else {
                        bVar = (c.b) queryLocalInterface;
                    }
                }
                dVar.a = bVar;
                return dVar;
            case 23:
                return new PictureFrame(inParcel);
            case 24:
                return new c4.a(inParcel);
            case 25:
                int z24 = q8.z(inParcel);
                int i20 = 0;
                while (inParcel.dataPosition() < z24) {
                    int readInt9 = inParcel.readInt();
                    char c16 = (char) readInt9;
                    if (c16 == 1) {
                        z11 = q8.n(inParcel, readInt9);
                    } else if (c16 != 2) {
                        q8.y(inParcel, readInt9);
                    } else {
                        i20 = q8.u(inParcel, readInt9);
                    }
                }
                q8.m(inParcel, z24);
                return new c6.a(i20, z11);
            case 26:
                int z25 = q8.z(inParcel);
                while (inParcel.dataPosition() < z25) {
                    int readInt10 = inParcel.readInt();
                    if (((char) readInt10) != 1) {
                        q8.y(inParcel, readInt10);
                    } else {
                        pendingIntent = (PendingIntent) q8.g(inParcel, readInt10, PendingIntent.CREATOR);
                    }
                }
                q8.m(inParcel, z25);
                return new c6.b(pendingIntent);
            case 27:
                int z26 = q8.z(inParcel);
                boolean z27 = false;
                while (inParcel.dataPosition() < z26) {
                    int readInt11 = inParcel.readInt();
                    char c17 = (char) readInt11;
                    if (c17 == 1) {
                        i13 = q8.u(inParcel, readInt11);
                    } else if (c17 != 2) {
                        q8.y(inParcel, readInt11);
                    } else {
                        z27 = q8.n(inParcel, readInt11);
                    }
                }
                q8.m(inParcel, z26);
                return new c6.c(i13, z27);
            case 28:
                int z28 = q8.z(inParcel);
                while (inParcel.dataPosition() < z28) {
                    int readInt12 = inParcel.readInt();
                    char c18 = (char) readInt12;
                    if (c18 == 2) {
                        i12 = q8.u(inParcel, readInt12);
                    } else if (c18 != 3) {
                        q8.y(inParcel, readInt12);
                    } else {
                        strArr = q8.i(inParcel, readInt12);
                    }
                }
                q8.m(inParcel, z28);
                c8.a aVar2 = new c8.a();
                aVar2.a = i12;
                aVar2.b = strArr;
                return aVar2;
            default:
                int z29 = q8.z(inParcel);
                byte[] bArr2 = null;
                String str13 = null;
                Point[] pointArr = null;
                c8.f fVar2 = null;
                c8.i iVar = null;
                c8.j jVar2 = null;
                c8.l lVar2 = null;
                k kVar = null;
                c8.g gVar2 = null;
                c8.e eVar = null;
                c8.d dVar2 = null;
                c8.c cVar = null;
                int i21 = 0;
                boolean z30 = false;
                while (inParcel.dataPosition() < z29) {
                    int readInt13 = inParcel.readInt();
                    c8.g gVar3 = gVar2;
                    switch ((char) readInt13) {
                        case 2:
                            i11 = q8.u(inParcel, readInt13);
                            break;
                        case 3:
                            str = q8.h(inParcel, readInt13);
                            break;
                        case 4:
                            str13 = q8.h(inParcel, readInt13);
                            break;
                        case 5:
                            i21 = q8.u(inParcel, readInt13);
                            break;
                        case 6:
                            pointArr = (Point[]) q8.k(inParcel, readInt13, Point.CREATOR);
                            break;
                        case 7:
                            fVar2 = (c8.f) q8.g(inParcel, readInt13, c8.f.CREATOR);
                            break;
                        case '\b':
                            iVar = (c8.i) q8.g(inParcel, readInt13, c8.i.CREATOR);
                            break;
                        case '\t':
                            jVar2 = (c8.j) q8.g(inParcel, readInt13, c8.j.CREATOR);
                            break;
                        case '\n':
                            lVar2 = (c8.l) q8.g(inParcel, readInt13, c8.l.CREATOR);
                            break;
                        case 11:
                            kVar = (k) q8.g(inParcel, readInt13, k.CREATOR);
                            break;
                        case '\f':
                            gVar2 = (c8.g) q8.g(inParcel, readInt13, c8.g.CREATOR);
                            continue;
                        case '\r':
                            cVar = (c8.c) q8.g(inParcel, readInt13, c8.c.CREATOR);
                            break;
                        case 14:
                            dVar2 = (c8.d) q8.g(inParcel, readInt13, c8.d.CREATOR);
                            break;
                        case 15:
                            eVar = (c8.e) q8.g(inParcel, readInt13, c8.e.CREATOR);
                            break;
                        case 16:
                            bArr2 = q8.b(inParcel, readInt13);
                            break;
                        case 17:
                            z30 = q8.n(inParcel, readInt13);
                            break;
                        default:
                            q8.y(inParcel, readInt13);
                            break;
                    }
                    gVar2 = gVar3;
                }
                q8.m(inParcel, z29);
                c8.m mVar2 = new c8.m();
                mVar2.a = i11;
                mVar2.b = str;
                mVar2.A = bArr2;
                mVar2.c = str13;
                mVar2.d = i21;
                mVar2.e = pointArr;
                mVar2.B = z30;
                mVar2.f = fVar2;
                mVar2.h = iVar;
                mVar2.n = jVar2;
                mVar2.r = lVar2;
                mVar2.s = kVar;
                mVar2.v = gVar2;
                mVar2.w = cVar;
                mVar2.x = dVar2;
                mVar2.y = eVar;
                return mVar2;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.a) {
            case 0:
                return new b[i10];
            case 1:
                return new a4.a[i10];
            case 2:
                return new a7.f[i10];
            case 3:
                return new a7.g[i10];
            case 4:
                return new h[i10];
            case 5:
                return new i[i10];
            case 6:
                return new j[i10];
            case 7:
                return new l[i10];
            case 8:
                return new m[i10];
            case 9:
                return new n[i10];
            case 10:
                return new MediaBrowserCompat$MediaItem[i10];
            case 11:
                return new MediaDescriptionCompat[i10];
            case 12:
                return new MediaMetadataCompat[i10];
            case 13:
                return new RatingCompat[i10];
            case 14:
                return new androidx.activity.result.a[i10];
            case 15:
                return new androidx.activity.result.g[i10];
            case 16:
                return new androidx.fragment.app.b[i10];
            case 17:
                return new androidx.fragment.app.c[i10];
            case 18:
                return new f0[i10];
            case 19:
                return new l0[i10];
            case 20:
                return new o0[i10];
            case 21:
                return new b4.a[i10];
            case 22:
                return new c.d[i10];
            case 23:
                return new PictureFrame[i10];
            case 24:
                return new c4.a[i10];
            case 25:
                return new c6.a[i10];
            case 26:
                return new c6.b[i10];
            case 27:
                return new c6.c[i10];
            case 28:
                return new c8.a[i10];
            default:
                return new c8.m[i10];
        }
    }
}
