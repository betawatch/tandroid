// default package

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class w4a implements Runnable {
    public final /* synthetic */ l3a E;
    public final /* synthetic */ long F;
    public final /* synthetic */ long G;
    public final /* synthetic */ long H;
    public final /* synthetic */ v67 I;
    public final /* synthetic */ boolean J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;
    public final /* synthetic */ Object N;
    public final /* synthetic */ Object O;
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ j5 e;
    public final /* synthetic */ k47 f;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ k47 n;
    public final /* synthetic */ k47 r;
    public final /* synthetic */ boolean s;
    public final /* synthetic */ int w;
    public final /* synthetic */ TL_stories.StoryItem x;
    public final /* synthetic */ nv1 y;

    public /* synthetic */ w4a(int i, int i2, long j, long j2, long j3, long j4, j5 j5Var, nv1 nv1Var, k47 k47Var, k47 k47Var2, k47 k47Var3, v67 v67Var, l3a l3aVar, rcc rccVar, CharSequence charSequence, String str, String str2, ArrayList arrayList, TLRPC.Photo photo, TL_stories.StoryItem storyItem, boolean z, boolean z2, boolean z3) {
        this.K = rccVar;
        this.b = str;
        this.c = j;
        this.d = i;
        this.e = j5Var;
        this.L = str2;
        this.M = photo;
        this.N = charSequence;
        this.f = k47Var;
        this.h = z;
        this.n = k47Var2;
        this.r = k47Var3;
        this.O = arrayList;
        this.s = z2;
        this.w = i2;
        this.x = storyItem;
        this.y = nv1Var;
        this.E = l3aVar;
        this.F = j2;
        this.G = j3;
        this.H = j4;
        this.I = v67Var;
        this.J = z3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:128:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0475  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z;
        Object[] objArr;
        File file;
        boolean z2;
        String str;
        final int i;
        j5 j5Var;
        boolean z3;
        String str2;
        TLRPC.TL_document tL_document;
        final rcc rccVar;
        final TLRPC.TL_document tL_document2;
        Bitmap bitmap;
        final String str3;
        String str4;
        TLRPC.PhotoSize m;
        boolean z4;
        String str5;
        TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo;
        int i2;
        int i3;
        int i4;
        byte b = this.a;
        Object obj = this.O;
        Object obj2 = this.N;
        Object obj3 = this.M;
        Object obj4 = this.L;
        Object obj5 = this.K;
        switch (b) {
            case 0:
                TLRPC.TL_inputPollAnswer tL_inputPollAnswer = (TLRPC.TL_inputPollAnswer) obj5;
                TLRPC.TL_document tL_document3 = (TLRPC.TL_document) obj4;
                HashMap hashMap = (HashMap) obj3;
                z5a z5aVar = (z5a) obj2;
                yg8 yg8Var = (yg8) obj;
                k47 k47Var = this.f;
                j5 j5Var2 = this.e;
                String str6 = this.b;
                if (k47Var != null || tL_inputPollAnswer != null) {
                    a6a.B(j5Var2.a).s(k47Var, tL_inputPollAnswer, null, null, tL_document3, str6, null, hashMap, false, z5aVar.u, null);
                    break;
                } else {
                    y5a e = y5a.e(tL_document3, null, str6, this.c, this.n, this.r, z5aVar.d, z5aVar.i, hashMap, this.h, this.d, this.w, 0, null, z5aVar.u);
                    e.H = this.x;
                    e.J = this.y;
                    e.K = this.E;
                    if (this.s) {
                        e.O = this.F;
                    }
                    e.L = this.J;
                    e.Q = this.G;
                    e.R = this.H;
                    e.T = this.I;
                    e.k = z5aVar.B;
                    e.j = yg8Var;
                    a6a.B(j5Var2.a).q0(e);
                    break;
                }
            default:
                rcc rccVar2 = (rcc) obj5;
                String str7 = (String) obj4;
                TLRPC.Photo photo = (TLRPC.Photo) obj3;
                CharSequence charSequence = (CharSequence) obj2;
                final ArrayList arrayList = (ArrayList) obj;
                String str8 = this.b;
                if (rccVar2 == null) {
                    rccVar2 = a6a.n(0L, str8);
                }
                final long j = this.c;
                boolean B = pg3.B(j);
                if (rccVar2 == null || !rccVar2.s) {
                    z = false;
                    objArr = false;
                } else {
                    objArr = false;
                    z = true;
                }
                j5 j5Var3 = this.e;
                final k47 k47Var2 = this.f;
                final k47 k47Var3 = this.n;
                long j2 = 0;
                final k47 k47Var4 = this.r;
                final boolean z5 = this.s;
                Object[] objArr2 = objArr;
                final int i5 = this.w;
                final TL_stories.StoryItem storyItem = this.x;
                final nv1 nv1Var = this.y;
                final l3a l3aVar = this.E;
                final long j3 = this.G;
                final long j4 = this.H;
                final v67 v67Var = this.I;
                if (rccVar2 == null && !str8.endsWith("mp4") && !z) {
                    a6a.T(j5Var3, str8, str8, null, null, j, k47Var3, k47Var4, storyItem, nv1Var, arrayList, k47Var2, null, false, charSequence, z5, i5, null, this.J, l3aVar, 0L, false, j3, j4, v67Var, null, -1);
                    break;
                } else {
                    File file2 = new File(str8);
                    StringBuilder s = td4.s(str8);
                    s.append(file2.length());
                    s.append("_");
                    s.append(file2.lastModified());
                    String sb = s.toString();
                    if (rccVar2 != null) {
                        if (!z) {
                            StringBuilder sb2 = new StringBuilder(sb);
                            sb2.append(rccVar2.r);
                            sb2.append("_");
                            sb2.append(rccVar2.a);
                            sb2.append("_");
                            sb2.append(rccVar2.b);
                            sb2.append(rccVar2.t ? "_m" : "");
                            sb = sb2.toString();
                            if (rccVar2.k != rccVar2.h) {
                                StringBuilder k = b10.k(sb, "_");
                                k.append(rccVar2.k);
                                sb = k.toString();
                            }
                        }
                        long j5 = rccVar2.a;
                        if (j5 >= 0) {
                            j2 = j5;
                        }
                    }
                    long j6 = j2;
                    int i6 = this.d;
                    if (!B && i6 == 0 && (rccVar2 == null || (rccVar2.A == null && rccVar2.B == null && rccVar2.G == null && rccVar2.H == null))) {
                        cf7 Y = cf7.Y(j5Var3.a);
                        if (B) {
                            file = file2;
                            i4 = 5;
                        } else {
                            file = file2;
                            i4 = 2;
                        }
                        Object[] e0 = Y.e0(i4, sb);
                        if (e0 != null) {
                            Object obj6 = e0[objArr2 == true ? 1 : 0];
                            if (obj6 instanceof TLRPC.TL_document) {
                                TLRPC.TL_document tL_document4 = (TLRPC.TL_document) obj6;
                                String str9 = (String) e0[1];
                                i = i6;
                                str = "_";
                                z2 = z;
                                a6a.v(j5Var3, B, tL_document4, str8, null, j6, false);
                                j5Var = j5Var3;
                                z3 = B;
                                str8 = str8;
                                tL_document = tL_document4;
                                str2 = str9;
                                if (tL_document != null) {
                                    bitmap = a6a.r(str8, j6, null, false);
                                    if (bitmap == null) {
                                        bitmap = a6a.q(1, str8);
                                    }
                                    int i7 = (z3 || i != 0) ? 90 : 320;
                                    float f = i7;
                                    TLRPC.PhotoSize U = fn5.U(bitmap, f, f, i7 > 90 ? 80 : 55, z3);
                                    if (bitmap == null || U == null) {
                                        z4 = z2;
                                        str5 = null;
                                    } else {
                                        z4 = z2;
                                        if (!z4) {
                                            str5 = null;
                                            bitmap = null;
                                        } else if (z3) {
                                            bitmap = Bitmap.createScaledBitmap(bitmap, 90, 90, true);
                                            Utilities.blurBitmap(bitmap, 7);
                                            Utilities.blurBitmap(bitmap, 7);
                                            Utilities.blurBitmap(bitmap, 7);
                                            StringBuilder sb3 = new StringBuilder();
                                            sb3.append(U.location.volume_id);
                                            sb3.append(str);
                                            str5 = String.format(hg9.k(sb3, U.location.local_id, "@%d_%d_b2"), Integer.valueOf((int) (gm.u / gm.p)), Integer.valueOf((int) (gm.u / gm.p)));
                                        } else {
                                            Utilities.blurBitmap(bitmap, 3);
                                            StringBuilder sb4 = new StringBuilder();
                                            sb4.append(U.location.volume_id);
                                            sb4.append(str);
                                            str5 = String.format(hg9.k(sb4, U.location.local_id, "@%d_%d_b"), Integer.valueOf((int) (gm.u / gm.p)), Integer.valueOf((int) (gm.u / gm.p)));
                                        }
                                    }
                                    TLRPC.TL_document tL_document5 = new TLRPC.TL_document();
                                    if (U != null) {
                                        tL_document5.thumbs.add(U);
                                        tL_document5.flags |= 1;
                                    }
                                    tL_document5.file_reference = new byte[0];
                                    tL_document5.mime_type = "video/mp4";
                                    z8c.h(j5Var.a).u(false);
                                    if (!z3) {
                                        tL_documentAttributeVideo = new TLRPC.TL_documentAttributeVideo();
                                        tL_documentAttributeVideo.supports_streaming = true;
                                    } else if (oc7.r1(j5Var.a).Z0(Integer.valueOf((int) (j & 4294967295L))) != null) {
                                        tL_documentAttributeVideo = new TLRPC.TL_documentAttributeVideo_layer159();
                                    }
                                    tL_documentAttributeVideo.round_message = z4;
                                    tL_document5.attributes.add(tL_documentAttributeVideo);
                                    if (rccVar2 != null) {
                                        if (rccVar2.O) {
                                            tL_documentAttributeVideo.w = rccVar2.k;
                                            tL_documentAttributeVideo.h = rccVar2.l;
                                            tL_documentAttributeVideo.duration = rccVar2.r / 1000.0d;
                                            tL_document5.size = rccVar2.q;
                                        } else if (rccVar2.b()) {
                                            if (rccVar2.t) {
                                                tL_document5.attributes.add(new TLRPC.TL_documentAttributeAnimated());
                                                a6a.w(str8, tL_documentAttributeVideo, rccVar2);
                                                rccVar2.h = tL_documentAttributeVideo.w;
                                                rccVar2.i = tL_documentAttributeVideo.h;
                                            } else {
                                                tL_documentAttributeVideo.duration = rccVar2.r / 1000.0d;
                                            }
                                            int i8 = rccVar2.g;
                                            ao6 ao6Var = rccVar2.H;
                                            if (ao6Var != null) {
                                                i2 = ao6Var.i;
                                                i3 = ao6Var.j;
                                            } else {
                                                i2 = rccVar2.k;
                                                i3 = rccVar2.l;
                                            }
                                            if (i8 == 90 || i8 == 270) {
                                                tL_documentAttributeVideo.w = i3;
                                                tL_documentAttributeVideo.h = i2;
                                            } else {
                                                tL_documentAttributeVideo.w = i2;
                                                tL_documentAttributeVideo.h = i3;
                                            }
                                            tL_document5.size = rccVar2.q;
                                        }
                                        str3 = str5;
                                        tL_document2 = tL_document5;
                                        rccVar = rccVar2;
                                    }
                                    if (file.exists()) {
                                        tL_document5.size = (int) file.length();
                                    }
                                    a6a.w(str8, tL_documentAttributeVideo, null);
                                    str3 = str5;
                                    tL_document2 = tL_document5;
                                    rccVar = rccVar2;
                                } else {
                                    boolean z6 = z2;
                                    String str10 = str;
                                    if (tL_document.thumbs.isEmpty()) {
                                        Bitmap r = a6a.r(str8, j6, null, false);
                                        Bitmap q = r == null ? a6a.q(1, str8) : r;
                                        int i9 = (z3 || i != 0) ? 90 : 320;
                                        float f2 = i9;
                                        TLRPC.PhotoSize U2 = fn5.U(q, f2, f2, i9 > 90 ? 80 : 55, z3);
                                        if (q == null || U2 == null) {
                                            rccVar = rccVar2;
                                        } else if (z6) {
                                            if (z3) {
                                                q = Bitmap.createScaledBitmap(q, 90, 90, true);
                                                Utilities.blurBitmap(q, 7);
                                                Utilities.blurBitmap(q, 7);
                                                Utilities.blurBitmap(q, 7);
                                                StringBuilder sb5 = new StringBuilder();
                                                sb5.append(U2.location.volume_id);
                                                sb5.append(str10);
                                                str4 = String.format(hg9.k(sb5, U2.location.local_id, "@%d_%d_b2"), Integer.valueOf((int) (gm.u / gm.p)), Integer.valueOf((int) (gm.u / gm.p)));
                                                rccVar = rccVar2;
                                            } else {
                                                Utilities.blurBitmap(q, 3);
                                                StringBuilder sb6 = new StringBuilder();
                                                rccVar = rccVar2;
                                                sb6.append(U2.location.volume_id);
                                                sb6.append(str10);
                                                str4 = String.format(hg9.k(sb6, U2.location.local_id, "@%d_%d_b"), Integer.valueOf((int) (gm.u / gm.p)), Integer.valueOf((int) (gm.u / gm.p)));
                                            }
                                            if (U2 != null) {
                                                tL_document.thumbs.add(U2);
                                                tL_document.flags |= 1;
                                            }
                                            str3 = str4;
                                            tL_document2 = tL_document;
                                            bitmap = q;
                                        } else {
                                            rccVar = rccVar2;
                                            q = null;
                                        }
                                        str4 = null;
                                        if (U2 != null) {
                                        }
                                        str3 = str4;
                                        tL_document2 = tL_document;
                                        bitmap = q;
                                    } else {
                                        rccVar = rccVar2;
                                        tL_document2 = tL_document;
                                        bitmap = null;
                                        str3 = null;
                                    }
                                }
                                m = fn5.m(str7);
                                if (m == null && photo != null) {
                                    m = new cn5(photo);
                                }
                                if (rccVar != null && rccVar.b()) {
                                    File file3 = new File(bc4.z(4), "-2147483648_" + gda.p() + ".mp4");
                                    gda.x();
                                    str8 = file3.getAbsolutePath();
                                }
                                final String str11 = str8;
                                final HashMap hashMap2 = new HashMap();
                                final String charSequence2 = charSequence != null ? charSequence.toString() : "";
                                hashMap2.put("originalPath", sb);
                                if (str2 != null) {
                                    hashMap2.put("parentObject", str2);
                                }
                                final boolean z7 = this.h;
                                final long j7 = this.F;
                                final TLRPC.PhotoSize photoSize = m;
                                final String str12 = str2;
                                final j5 j5Var4 = j5Var;
                                final Bitmap bitmap2 = bitmap;
                                gm.c3(new Runnable() { // from class: a5a
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        String str13;
                                        Bitmap bitmap3 = bitmap2;
                                        if (bitmap3 != null && (str13 = str3) != null) {
                                            fn5.z().K(new BitmapDrawable(bitmap3), str13, false);
                                        }
                                        k47 k47Var5 = k47Var2;
                                        j5 j5Var5 = j5Var4;
                                        rcc rccVar3 = rccVar;
                                        TLRPC.TL_document tL_document6 = tL_document2;
                                        String str14 = str11;
                                        TLRPC.PhotoSize photoSize2 = photoSize;
                                        HashMap hashMap3 = hashMap2;
                                        boolean z8 = z7;
                                        String str15 = str12;
                                        if (k47Var5 != null) {
                                            a6a.B(j5Var5.a).s(k47Var5, null, null, rccVar3, tL_document6, str14, photoSize2, hashMap3, false, z8, str15);
                                            return;
                                        }
                                        y5a e2 = y5a.e(tL_document6, rccVar3, str14, j, k47Var3, k47Var4, charSequence2, arrayList, hashMap3, z5, i5, 0, i, str15, z8);
                                        e2.H = storyItem;
                                        e2.J = nv1Var;
                                        e2.K = l3aVar;
                                        e2.O = j7;
                                        e2.o = photoSize2;
                                        e2.Q = j3;
                                        e2.R = j4;
                                        e2.T = v67Var;
                                        e2.L = false;
                                        a6a.B(j5Var5.a).q0(e2);
                                    }
                                });
                                break;
                            }
                        }
                    } else {
                        file = file2;
                    }
                    z2 = z;
                    str = "_";
                    i = i6;
                    j5Var = j5Var3;
                    z3 = B;
                    str2 = null;
                    tL_document = null;
                    if (tL_document != null) {
                    }
                    m = fn5.m(str7);
                    if (m == null) {
                        m = new cn5(photo);
                    }
                    if (rccVar != null) {
                        File file32 = new File(bc4.z(4), "-2147483648_" + gda.p() + ".mp4");
                        gda.x();
                        str8 = file32.getAbsolutePath();
                    }
                    final String str112 = str8;
                    final HashMap hashMap22 = new HashMap();
                    final String charSequence22 = charSequence != null ? charSequence.toString() : "";
                    hashMap22.put("originalPath", sb);
                    if (str2 != null) {
                    }
                    final boolean z72 = this.h;
                    final long j72 = this.F;
                    final TLRPC.PhotoSize photoSize2 = m;
                    final String str122 = str2;
                    final j5 j5Var42 = j5Var;
                    final Bitmap bitmap22 = bitmap;
                    gm.c3(new Runnable() { // from class: a5a
                        @Override // java.lang.Runnable
                        public final void run() {
                            String str13;
                            Bitmap bitmap3 = bitmap22;
                            if (bitmap3 != null && (str13 = str3) != null) {
                                fn5.z().K(new BitmapDrawable(bitmap3), str13, false);
                            }
                            k47 k47Var5 = k47Var2;
                            j5 j5Var5 = j5Var42;
                            rcc rccVar3 = rccVar;
                            TLRPC.TL_document tL_document6 = tL_document2;
                            String str14 = str112;
                            TLRPC.PhotoSize photoSize22 = photoSize2;
                            HashMap hashMap3 = hashMap22;
                            boolean z8 = z72;
                            String str15 = str122;
                            if (k47Var5 != null) {
                                a6a.B(j5Var5.a).s(k47Var5, null, null, rccVar3, tL_document6, str14, photoSize22, hashMap3, false, z8, str15);
                                return;
                            }
                            y5a e2 = y5a.e(tL_document6, rccVar3, str14, j, k47Var3, k47Var4, charSequence22, arrayList, hashMap3, z5, i5, 0, i, str15, z8);
                            e2.H = storyItem;
                            e2.J = nv1Var;
                            e2.K = l3aVar;
                            e2.O = j72;
                            e2.o = photoSize22;
                            e2.Q = j3;
                            e2.R = j4;
                            e2.T = v67Var;
                            e2.L = false;
                            a6a.B(j5Var5.a).q0(e2);
                        }
                    });
                }
                break;
        }
    }

    public /* synthetic */ w4a(k47 k47Var, TLRPC.TL_inputPollAnswer tL_inputPollAnswer, j5 j5Var, TLRPC.TL_document tL_document, String str, HashMap hashMap, z5a z5aVar, long j, k47 k47Var2, k47 k47Var3, boolean z, int i, int i2, TL_stories.StoryItem storyItem, nv1 nv1Var, l3a l3aVar, boolean z2, long j2, boolean z3, long j3, long j4, v67 v67Var, yg8 yg8Var) {
        this.f = k47Var;
        this.K = tL_inputPollAnswer;
        this.e = j5Var;
        this.L = tL_document;
        this.b = str;
        this.M = hashMap;
        this.N = z5aVar;
        this.c = j;
        this.n = k47Var2;
        this.r = k47Var3;
        this.h = z;
        this.d = i;
        this.w = i2;
        this.x = storyItem;
        this.y = nv1Var;
        this.E = l3aVar;
        this.s = z2;
        this.F = j2;
        this.J = z3;
        this.G = j3;
        this.H = j4;
        this.I = v67Var;
        this.O = yg8Var;
    }
}
