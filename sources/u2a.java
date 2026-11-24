// default package

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class u2a implements Runnable {
    public final /* synthetic */ j1a E;
    public final /* synthetic */ long F;
    public final /* synthetic */ long G;
    public final /* synthetic */ long H;
    public final /* synthetic */ u47 I;
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
    public final /* synthetic */ k27 f;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ k27 n;
    public final /* synthetic */ k27 r;
    public final /* synthetic */ boolean s;
    public final /* synthetic */ int w;
    public final /* synthetic */ TL_stories.StoryItem x;
    public final /* synthetic */ bu1 y;

    public /* synthetic */ u2a(int i, int i2, long j, long j2, long j3, long j4, j5 j5Var, bu1 bu1Var, k27 k27Var, k27 k27Var2, k27 k27Var3, u47 u47Var, j1a j1aVar, oac oacVar, CharSequence charSequence, String str, String str2, ArrayList arrayList, TLRPC.Photo photo, TL_stories.StoryItem storyItem, boolean z, boolean z2, boolean z3) {
        this.K = oacVar;
        this.b = str;
        this.c = j;
        this.d = i;
        this.e = j5Var;
        this.L = str2;
        this.M = photo;
        this.N = charSequence;
        this.f = k27Var;
        this.h = z;
        this.n = k27Var2;
        this.r = k27Var3;
        this.O = arrayList;
        this.s = z2;
        this.w = i2;
        this.x = storyItem;
        this.y = bu1Var;
        this.E = j1aVar;
        this.F = j2;
        this.G = j3;
        this.H = j4;
        this.I = u47Var;
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
        final oac oacVar;
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
                y3a y3aVar = (y3a) obj2;
                we8 we8Var = (we8) obj;
                k27 k27Var = this.f;
                j5 j5Var2 = this.e;
                String str6 = this.b;
                if (k27Var != null || tL_inputPollAnswer != null) {
                    z3a.B(j5Var2.a).s(k27Var, tL_inputPollAnswer, null, null, tL_document3, str6, null, hashMap, false, y3aVar.u, null);
                    break;
                } else {
                    x3a e = x3a.e(tL_document3, null, str6, this.c, this.n, this.r, y3aVar.d, y3aVar.i, hashMap, this.h, this.d, this.w, 0, null, y3aVar.u);
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
                    e.k = y3aVar.B;
                    e.j = we8Var;
                    z3a.B(j5Var2.a).q0(e);
                    break;
                }
            default:
                oac oacVar2 = (oac) obj5;
                String str7 = (String) obj4;
                TLRPC.Photo photo = (TLRPC.Photo) obj3;
                CharSequence charSequence = (CharSequence) obj2;
                final ArrayList arrayList = (ArrayList) obj;
                String str8 = this.b;
                if (oacVar2 == null) {
                    oacVar2 = z3a.n(0L, str8);
                }
                final long j = this.c;
                boolean B = cf3.B(j);
                if (oacVar2 == null || !oacVar2.s) {
                    z = false;
                    objArr = false;
                } else {
                    objArr = false;
                    z = true;
                }
                j5 j5Var3 = this.e;
                final k27 k27Var2 = this.f;
                final k27 k27Var3 = this.n;
                long j2 = 0;
                final k27 k27Var4 = this.r;
                final boolean z5 = this.s;
                Object[] objArr2 = objArr;
                final int i5 = this.w;
                final TL_stories.StoryItem storyItem = this.x;
                final bu1 bu1Var = this.y;
                final j1a j1aVar = this.E;
                final long j3 = this.G;
                final long j4 = this.H;
                final u47 u47Var = this.I;
                if (oacVar2 == null && !str8.endsWith("mp4") && !z) {
                    z3a.T(j5Var3, str8, str8, null, null, j, k27Var3, k27Var4, storyItem, bu1Var, arrayList, k27Var2, null, false, charSequence, z5, i5, null, this.J, j1aVar, 0L, false, j3, j4, u47Var, null, -1);
                    break;
                } else {
                    File file2 = new File(str8);
                    StringBuilder r = tb4.r(str8);
                    r.append(file2.length());
                    r.append("_");
                    r.append(file2.lastModified());
                    String sb = r.toString();
                    if (oacVar2 != null) {
                        if (!z) {
                            StringBuilder sb2 = new StringBuilder(sb);
                            sb2.append(oacVar2.r);
                            sb2.append("_");
                            sb2.append(oacVar2.a);
                            sb2.append("_");
                            sb2.append(oacVar2.b);
                            sb2.append(oacVar2.t ? "_m" : "");
                            sb = sb2.toString();
                            if (oacVar2.k != oacVar2.h) {
                                StringBuilder k = b00.k(sb, "_");
                                k.append(oacVar2.k);
                                sb = k.toString();
                            }
                        }
                        long j5 = oacVar2.a;
                        if (j5 >= 0) {
                            j2 = j5;
                        }
                    }
                    long j6 = j2;
                    int i6 = this.d;
                    if (!B && i6 == 0 && (oacVar2 == null || (oacVar2.A == null && oacVar2.B == null && oacVar2.G == null && oacVar2.H == null))) {
                        ad7 Y = ad7.Y(j5Var3.a);
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
                                z3a.v(j5Var3, B, tL_document4, str8, null, j6, false);
                                j5Var = j5Var3;
                                z3 = B;
                                str8 = str8;
                                tL_document = tL_document4;
                                str2 = str9;
                                if (tL_document != null) {
                                    bitmap = z3a.r(str8, j6, null, false);
                                    if (bitmap == null) {
                                        bitmap = z3a.q(1, str8);
                                    }
                                    int i7 = (z3 || i != 0) ? 90 : 320;
                                    float f = i7;
                                    TLRPC.PhotoSize U = fl5.U(bitmap, f, f, i7 > 90 ? 80 : 55, z3);
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
                                            str5 = String.format(de9.l(sb3, U.location.local_id, "@%d_%d_b2"), Integer.valueOf((int) (gl.u / gl.p)), Integer.valueOf((int) (gl.u / gl.p)));
                                        } else {
                                            Utilities.blurBitmap(bitmap, 3);
                                            StringBuilder sb4 = new StringBuilder();
                                            sb4.append(U.location.volume_id);
                                            sb4.append(str);
                                            str5 = String.format(de9.l(sb4, U.location.local_id, "@%d_%d_b"), Integer.valueOf((int) (gl.u / gl.p)), Integer.valueOf((int) (gl.u / gl.p)));
                                        }
                                    }
                                    TLRPC.TL_document tL_document5 = new TLRPC.TL_document();
                                    if (U != null) {
                                        tL_document5.thumbs.add(U);
                                        tL_document5.flags |= 1;
                                    }
                                    tL_document5.file_reference = new byte[0];
                                    tL_document5.mime_type = "video/mp4";
                                    y6c.h(j5Var.a).u(false);
                                    if (!z3) {
                                        tL_documentAttributeVideo = new TLRPC.TL_documentAttributeVideo();
                                        tL_documentAttributeVideo.supports_streaming = true;
                                    } else if (na7.q1(j5Var.a).Y0(Integer.valueOf((int) (j & 4294967295L))) != null) {
                                        tL_documentAttributeVideo = new TLRPC.TL_documentAttributeVideo_layer159();
                                    }
                                    tL_documentAttributeVideo.round_message = z4;
                                    tL_document5.attributes.add(tL_documentAttributeVideo);
                                    if (oacVar2 != null) {
                                        if (oacVar2.O) {
                                            tL_documentAttributeVideo.w = oacVar2.k;
                                            tL_documentAttributeVideo.h = oacVar2.l;
                                            tL_documentAttributeVideo.duration = oacVar2.r / 1000.0d;
                                            tL_document5.size = oacVar2.q;
                                        } else if (oacVar2.b()) {
                                            if (oacVar2.t) {
                                                tL_document5.attributes.add(new TLRPC.TL_documentAttributeAnimated());
                                                z3a.w(str8, tL_documentAttributeVideo, oacVar2);
                                                oacVar2.h = tL_documentAttributeVideo.w;
                                                oacVar2.i = tL_documentAttributeVideo.h;
                                            } else {
                                                tL_documentAttributeVideo.duration = oacVar2.r / 1000.0d;
                                            }
                                            int i8 = oacVar2.g;
                                            zl6 zl6Var = oacVar2.H;
                                            if (zl6Var != null) {
                                                i2 = zl6Var.i;
                                                i3 = zl6Var.j;
                                            } else {
                                                i2 = oacVar2.k;
                                                i3 = oacVar2.l;
                                            }
                                            if (i8 == 90 || i8 == 270) {
                                                tL_documentAttributeVideo.w = i3;
                                                tL_documentAttributeVideo.h = i2;
                                            } else {
                                                tL_documentAttributeVideo.w = i2;
                                                tL_documentAttributeVideo.h = i3;
                                            }
                                            tL_document5.size = oacVar2.q;
                                        }
                                        str3 = str5;
                                        tL_document2 = tL_document5;
                                        oacVar = oacVar2;
                                    }
                                    if (file.exists()) {
                                        tL_document5.size = (int) file.length();
                                    }
                                    z3a.w(str8, tL_documentAttributeVideo, null);
                                    str3 = str5;
                                    tL_document2 = tL_document5;
                                    oacVar = oacVar2;
                                } else {
                                    boolean z6 = z2;
                                    String str10 = str;
                                    if (tL_document.thumbs.isEmpty()) {
                                        Bitmap r2 = z3a.r(str8, j6, null, false);
                                        Bitmap q = r2 == null ? z3a.q(1, str8) : r2;
                                        int i9 = (z3 || i != 0) ? 90 : 320;
                                        float f2 = i9;
                                        TLRPC.PhotoSize U2 = fl5.U(q, f2, f2, i9 > 90 ? 80 : 55, z3);
                                        if (q == null || U2 == null) {
                                            oacVar = oacVar2;
                                        } else if (z6) {
                                            if (z3) {
                                                q = Bitmap.createScaledBitmap(q, 90, 90, true);
                                                Utilities.blurBitmap(q, 7);
                                                Utilities.blurBitmap(q, 7);
                                                Utilities.blurBitmap(q, 7);
                                                StringBuilder sb5 = new StringBuilder();
                                                sb5.append(U2.location.volume_id);
                                                sb5.append(str10);
                                                str4 = String.format(de9.l(sb5, U2.location.local_id, "@%d_%d_b2"), Integer.valueOf((int) (gl.u / gl.p)), Integer.valueOf((int) (gl.u / gl.p)));
                                                oacVar = oacVar2;
                                            } else {
                                                Utilities.blurBitmap(q, 3);
                                                StringBuilder sb6 = new StringBuilder();
                                                oacVar = oacVar2;
                                                sb6.append(U2.location.volume_id);
                                                sb6.append(str10);
                                                str4 = String.format(de9.l(sb6, U2.location.local_id, "@%d_%d_b"), Integer.valueOf((int) (gl.u / gl.p)), Integer.valueOf((int) (gl.u / gl.p)));
                                            }
                                            if (U2 != null) {
                                                tL_document.thumbs.add(U2);
                                                tL_document.flags |= 1;
                                            }
                                            str3 = str4;
                                            tL_document2 = tL_document;
                                            bitmap = q;
                                        } else {
                                            oacVar = oacVar2;
                                            q = null;
                                        }
                                        str4 = null;
                                        if (U2 != null) {
                                        }
                                        str3 = str4;
                                        tL_document2 = tL_document;
                                        bitmap = q;
                                    } else {
                                        oacVar = oacVar2;
                                        tL_document2 = tL_document;
                                        bitmap = null;
                                        str3 = null;
                                    }
                                }
                                m = fl5.m(str7);
                                if (m == null && photo != null) {
                                    m = new cl5(photo);
                                }
                                if (oacVar != null && oacVar.b()) {
                                    File file3 = new File(ba4.z(4), "-2147483648_" + gba.p() + ".mp4");
                                    gba.x();
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
                                gl.c3(new Runnable() { // from class: y2a
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        String str13;
                                        Bitmap bitmap3 = bitmap2;
                                        if (bitmap3 != null && (str13 = str3) != null) {
                                            fl5.z().K(new BitmapDrawable(bitmap3), str13, false);
                                        }
                                        k27 k27Var5 = k27Var2;
                                        j5 j5Var5 = j5Var4;
                                        oac oacVar3 = oacVar;
                                        TLRPC.TL_document tL_document6 = tL_document2;
                                        String str14 = str11;
                                        TLRPC.PhotoSize photoSize2 = photoSize;
                                        HashMap hashMap3 = hashMap2;
                                        boolean z8 = z7;
                                        String str15 = str12;
                                        if (k27Var5 != null) {
                                            z3a.B(j5Var5.a).s(k27Var5, null, null, oacVar3, tL_document6, str14, photoSize2, hashMap3, false, z8, str15);
                                            return;
                                        }
                                        x3a e2 = x3a.e(tL_document6, oacVar3, str14, j, k27Var3, k27Var4, charSequence2, arrayList, hashMap3, z5, i5, 0, i, str15, z8);
                                        e2.H = storyItem;
                                        e2.J = bu1Var;
                                        e2.K = j1aVar;
                                        e2.O = j7;
                                        e2.o = photoSize2;
                                        e2.Q = j3;
                                        e2.R = j4;
                                        e2.T = u47Var;
                                        e2.L = false;
                                        z3a.B(j5Var5.a).q0(e2);
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
                    m = fl5.m(str7);
                    if (m == null) {
                        m = new cl5(photo);
                    }
                    if (oacVar != null) {
                        File file32 = new File(ba4.z(4), "-2147483648_" + gba.p() + ".mp4");
                        gba.x();
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
                    gl.c3(new Runnable() { // from class: y2a
                        @Override // java.lang.Runnable
                        public final void run() {
                            String str13;
                            Bitmap bitmap3 = bitmap22;
                            if (bitmap3 != null && (str13 = str3) != null) {
                                fl5.z().K(new BitmapDrawable(bitmap3), str13, false);
                            }
                            k27 k27Var5 = k27Var2;
                            j5 j5Var5 = j5Var42;
                            oac oacVar3 = oacVar;
                            TLRPC.TL_document tL_document6 = tL_document2;
                            String str14 = str112;
                            TLRPC.PhotoSize photoSize22 = photoSize2;
                            HashMap hashMap3 = hashMap22;
                            boolean z8 = z72;
                            String str15 = str122;
                            if (k27Var5 != null) {
                                z3a.B(j5Var5.a).s(k27Var5, null, null, oacVar3, tL_document6, str14, photoSize22, hashMap3, false, z8, str15);
                                return;
                            }
                            x3a e2 = x3a.e(tL_document6, oacVar3, str14, j, k27Var3, k27Var4, charSequence22, arrayList, hashMap3, z5, i5, 0, i, str15, z8);
                            e2.H = storyItem;
                            e2.J = bu1Var;
                            e2.K = j1aVar;
                            e2.O = j72;
                            e2.o = photoSize22;
                            e2.Q = j3;
                            e2.R = j4;
                            e2.T = u47Var;
                            e2.L = false;
                            z3a.B(j5Var5.a).q0(e2);
                        }
                    });
                }
                break;
        }
    }

    public /* synthetic */ u2a(k27 k27Var, TLRPC.TL_inputPollAnswer tL_inputPollAnswer, j5 j5Var, TLRPC.TL_document tL_document, String str, HashMap hashMap, y3a y3aVar, long j, k27 k27Var2, k27 k27Var3, boolean z, int i, int i2, TL_stories.StoryItem storyItem, bu1 bu1Var, j1a j1aVar, boolean z2, long j2, boolean z3, long j3, long j4, u47 u47Var, we8 we8Var) {
        this.f = k27Var;
        this.K = tL_inputPollAnswer;
        this.e = j5Var;
        this.L = tL_document;
        this.b = str;
        this.M = hashMap;
        this.N = y3aVar;
        this.c = j;
        this.n = k27Var2;
        this.r = k27Var3;
        this.h = z;
        this.d = i;
        this.w = i2;
        this.x = storyItem;
        this.y = bu1Var;
        this.E = j1aVar;
        this.s = z2;
        this.F = j2;
        this.J = z3;
        this.G = j3;
        this.H = j4;
        this.I = u47Var;
        this.O = we8Var;
    }
}
