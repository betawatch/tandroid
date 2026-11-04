package vg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.text.TextPaint;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.io.File;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.az;
import org.telegram.messenger.cs;
import org.telegram.messenger.hs;
import org.telegram.messenger.jz;
import org.telegram.messenger.k5;
import org.telegram.messenger.li;
import org.telegram.messenger.w7;
import org.telegram.messenger.zb;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.hb1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class w1 extends FrameLayout implements k0, cs {
    public static final float[] V = {0.02f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.02f};
    public boolean E;
    public boolean F;
    public boolean G;
    public float H;
    public gi.c0 I;
    public final u1 J;
    public final TextureView K;
    public final j0.a L;
    public final ei.l0 M;
    public float N;
    public final s1 O;
    public final q1 P;
    public org.telegram.ui.Cells.r0 Q;
    public final u4.b R;
    public final TLRPC.Document S;
    public int T;
    public long U;
    public final jz a;
    public final Paint b;
    public final Paint c;
    public final boolean d;
    public File e;
    public float f;
    public final String h;
    public final ImageReceiver n;
    public r4.u r;
    public final int s;
    public final int w;
    public boolean x;
    public boolean y;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0188  */
    /* JADX WARN: Type inference failed for: r9v16, types: [android.graphics.Bitmap[], java.io.Serializable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public w1(Context context, jz jzVar, int i3, int i10, e6 e6Var) {
        super(context);
        boolean[] zArr;
        Paint paint = new Paint(1);
        this.b = paint;
        Paint paint2 = new Paint(1);
        this.c = paint2;
        this.d = false;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.n = imageReceiver;
        this.s = i3;
        this.w = i10;
        this.a = jzVar;
        paint.setColor(-16777216);
        paint2.setColor(i0.a.f(0.5f, k6.w0(k6.Ak, e6Var), -16777216));
        imageReceiver.E0(ConnectionsManager.DEFAULT_DATACENTER_ID);
        TLRPC.TL_help_premiumPromo tL_help_premiumPromo = li.b0(i3).E;
        String q02 = PremiumPreviewFragment.q0(i10);
        if (tL_help_premiumPromo != null) {
            int i11 = 0;
            while (true) {
                if (i11 >= tL_help_premiumPromo.video_sections.size()) {
                    i11 = -1;
                    break;
                } else if (tL_help_premiumPromo.video_sections.get(i11).equals(q02)) {
                    break;
                } else {
                    i11++;
                }
            }
            if (i11 >= 0) {
                TLRPC.Document document = tL_help_premiumPromo.videos.get(i11);
                v1 v1Var = null;
                for (int i12 = 0; i12 < document.thumbs.size(); i12++) {
                    if (document.thumbs.get(i12) instanceof TLRPC.TL_photoStrippedSize) {
                        this.L = new j0.a(getResources(), zb.F("b", document.thumbs.get(i12).bytes));
                        org.telegram.ui.Components.voip.g gVar = new org.telegram.ui.Components.voip.g();
                        gVar.m = 4.0f;
                        gVar.g = 3.5f;
                        gVar.l = true;
                        jz jzVar2 = this.a;
                        gVar.o = this;
                        this.M = new ei.l0(gVar, jzVar2);
                        v1Var = new v1(this, this.L, this.M);
                        v1Var.x = true;
                    }
                }
                this.h = w7.r(null, document);
                zArr = null;
                this.n.q0(null, null, v1Var, null, tL_help_premiumPromo, 1);
                w7.G(this.s).X(document, tL_help_premiumPromo, 3, 0);
                this.S = document;
                Utilities.e.c(new u9.a(10, this, document));
                if (i10 != 1) {
                    u4.b bVar = new u4.b(1);
                    bVar.c = new RectF();
                    ?? r9 = new Bitmap[16];
                    bVar.d = r9;
                    bVar.e = new Rect();
                    bVar.h = new Paint();
                    this.R = bVar;
                    bVar.b = org.telegram.messenger.g0.L(16.0f);
                    TextPaint textPaint = new TextPaint(65);
                    textPaint.setTypeface(org.telegram.messenger.g0.o1("fonts/rcondensedbold.ttf"));
                    textPaint.setTextSize(bVar.b);
                    textPaint.setColor(i0.a.o(k6.x0(zArr, k6.Nk, false), 30));
                    textPaint.setTextAlign(Paint.Align.CENTER);
                    int i13 = 0;
                    while (i13 < 16) {
                        int i14 = i13 < 10 ? i13 + 48 : i13 + 55;
                        int i15 = bVar.b;
                        r9[i13] = Bitmap.createBitmap(i15, i15, Bitmap.Config.ARGB_8888);
                        new Canvas(r9[i13]).drawText(Character.toString((char) i14), r13 >> 1, bVar.b, textPaint);
                        i13++;
                    }
                } else if (i10 == 6 || i10 == 9 || i10 == 3 || i10 == 7 || i10 == 11 || i10 == 4 || i10 == 24 || i10 == 43) {
                    s1 s1Var = new s1(40);
                    this.O = s1Var;
                    s1Var.o = 3.0f;
                    s1Var.O = i10;
                    if (i10 == 3 || i10 == 24 || i10 == 43) {
                        s1Var.r = 14;
                        s1Var.s = 18;
                        s1Var.t = 18;
                    } else {
                        s1Var.r = 14;
                        s1Var.s = 16;
                        s1Var.t = 15;
                    }
                    if (i10 == 43) {
                        s1Var.G = true;
                    }
                    s1Var.w = 0.98f;
                    s1Var.v = 0.98f;
                    s1Var.u = 0.98f;
                    s1Var.o = 4.0f;
                    s1Var.P = e6Var;
                    s1Var.Q = k6.Nk;
                    s1Var.c();
                } else if (i10 == 2) {
                    q1 q1Var = new q1();
                    this.P = q1Var;
                    ArrayList arrayList = q1Var.e;
                    if (arrayList.isEmpty()) {
                        for (int i16 = 0; i16 < q1Var.g; i16++) {
                            arrayList.add(new p1(q1Var));
                        }
                    }
                    int o10 = i0.a.o(k6.x0(zArr, k6.Nk, false), 80);
                    if (q1Var.i != o10) {
                        q1Var.i = o10;
                        q1Var.c.setColor(o10);
                    }
                } else if (i10 == 13) {
                    org.telegram.ui.Cells.r0 r0Var = new org.telegram.ui.Cells.r0();
                    this.Q = r0Var;
                    ArrayList arrayList2 = r0Var.c;
                    if (arrayList2.isEmpty()) {
                        for (int i17 = 0; i17 < r0Var.d; i17++) {
                            arrayList2.add(new k(r0Var));
                        }
                    }
                } else {
                    s1 s1Var2 = new s1(az.o() == 2 ? 800 : az.o() == 1 ? 400 : 100);
                    this.O = s1Var2;
                    s1Var2.P = e6Var;
                    s1Var2.Q = k6.Nk;
                    s1Var2.r = 4;
                    s1Var2.w = 0.98f;
                    s1Var2.v = 0.98f;
                    s1Var2.u = 0.98f;
                    s1Var2.G = true;
                    s1Var2.o = 4.0f;
                    s1Var2.H = true;
                    s1Var2.I = true;
                    s1Var2.K = true;
                    s1Var2.M = false;
                    s1Var2.c();
                }
                if (i10 != 1 || i10 == 3 || i10 == 11) {
                    this.d = true;
                }
                u1 u1Var = new u1(this, context);
                this.J = u1Var;
                u1Var.setResizeMode(0);
                TextureView textureView = new TextureView(context);
                this.K = textureView;
                u1Var.addView(textureView);
                setWillNotDraw(false);
                addView(u1Var);
            }
        }
        zArr = null;
        if (i10 != 1) {
        }
        if (i10 != 1) {
        }
        this.d = true;
        u1 u1Var2 = new u1(this, context);
        this.J = u1Var2;
        u1Var2.setResizeMode(0);
        TextureView textureView2 = new TextureView(context);
        this.K = textureView2;
        u1Var2.addView(textureView2);
        setWillNotDraw(false);
        addView(u1Var2);
    }

    public final void a() {
        File file = this.e;
        if ((file != null && file.exists()) || az.B0) {
            File file2 = this.e;
            if (file2 == null || !file2.exists()) {
                this.f = 0.671f;
            } else {
                if ((hs.e().p & 512) != 0) {
                    r4.u uVar = this.r;
                    if (uVar != null) {
                        org.telegram.messenger.g0.r(uVar);
                    }
                    r4.u uVar2 = new r4.u(this, 23);
                    this.r = uVar2;
                    org.telegram.messenger.g0.i3(uVar2, 300L);
                    return;
                }
                try {
                    MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                    mediaMetadataRetriever.setDataSource(org.telegram.messenger.t0.b, Uri.fromFile(this.e));
                    int parseInt = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
                    int parseInt2 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
                    mediaMetadataRetriever.release();
                    this.f = parseInt / parseInt2;
                } catch (Exception unused) {
                    this.f = 0.671f;
                }
            }
            if (this.F) {
                b();
            }
        }
        this.r = null;
    }

    public final void b() {
        Uri uri;
        int i3 = this.s;
        if ((this.e != null || az.B0) && this.I == null) {
            this.J.a(this.f, 0);
            gi.c0 c0Var = new gi.c0(this, 1);
            this.I = c0Var;
            TextureView textureView = this.K;
            c0Var.with(textureView);
            File file = this.e;
            if (file == null || !file.exists()) {
                try {
                    StringBuilder sb2 = new StringBuilder("?account=");
                    sb2.append(i3);
                    sb2.append("&id=");
                    sb2.append(this.S.id);
                    sb2.append("&hash=");
                    sb2.append(this.S.access_hash);
                    sb2.append("&dc=");
                    sb2.append(this.S.dc_id);
                    sb2.append("&size=");
                    sb2.append(this.S.size);
                    sb2.append("&mime=");
                    sb2.append(URLEncoder.encode(this.S.mime_type, "UTF-8"));
                    sb2.append("&rid=");
                    sb2.append(w7.G(i3).F(li.b0(i3).E));
                    sb2.append("&name=");
                    sb2.append(URLEncoder.encode(w7.B(this.S), "UTF-8"));
                    sb2.append("&reference=");
                    byte[] bArr = this.S.file_reference;
                    if (bArr == null) {
                        bArr = new byte[0];
                    }
                    sb2.append(Utilities.f(bArr));
                    uri = Uri.parse("tg://" + this.h + sb2.toString());
                } catch (Exception unused) {
                    uri = null;
                }
            } else {
                uri = Uri.fromFile(this.e);
            }
            if (uri == null) {
                return;
            }
            this.I.preparePlayer(uri, false, 1.0f);
            if (!this.G) {
                this.n.Q0();
                textureView.setAlpha(0.0f);
            }
            this.I.seekTo(this.U + 60);
            this.I.play();
        }
    }

    public final void c() {
        boolean z10 = this.x && this.y;
        if (this.E != z10) {
            this.E = z10;
            ImageReceiver imageReceiver = this.n;
            if (z10) {
                imageReceiver.P();
            } else {
                imageReceiver.R();
            }
        }
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == hs.Y1) {
            String str = (String) objArr[0];
            String str2 = this.h;
            if (str2 == null || !str2.equals(str)) {
                return;
            }
            this.e = (File) objArr[1];
            a();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0075, code lost:
    
        if (r9.length != (r5 + 1)) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00d6, code lost:
    
        if (r2[0].length == (r4 + 1)) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0561  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x058e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x05b9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x05cc  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x05e4  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x05c1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x056c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x04fb  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        float f13;
        long j10;
        float f14;
        int i3;
        int i10;
        u4.b bVar;
        int i11;
        int i12;
        ArrayList arrayList;
        int i13;
        int i14;
        long j11;
        boolean z10;
        j0.a aVar;
        ei.l0 l0Var;
        u4.b bVar2 = this.R;
        q1 q1Var = this.P;
        float f15 = 2.0f;
        int i15 = 0;
        s1 s1Var = this.O;
        if (s1Var != null || q1Var != null || this.Q != null || bVar2 != null) {
            if (this.H < 0.5f) {
                float f16 = 1.0f;
                float pow = (float) Math.pow(1.0f - r10, 2.0d);
                canvas.save();
                f10 = 0.9f;
                canvas.scale(pow, pow, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
                if (bVar2 != null) {
                    Rect rect = (Rect) bVar2.e;
                    int width = rect.width() / bVar2.b;
                    int height = rect.height() / bVar2.b;
                    if (width == 0 || height == 0) {
                        f11 = 2.0f;
                    } else {
                        long currentTimeMillis = System.currentTimeMillis();
                        ArrayList[] arrayListArr = (ArrayList[]) bVar2.f;
                        int i16 = 4;
                        if (arrayListArr != null) {
                            f13 = 150.0f;
                        } else {
                            f13 = 150.0f;
                        }
                        bVar2.f = new ArrayList[width + 1];
                        int i17 = 0;
                        while (i17 <= width) {
                            ((ArrayList[]) bVar2.f)[i17] = new ArrayList();
                            j0 j0Var = new j0();
                            f5.a aVar2 = Utilities.c;
                            j0Var.a = Math.abs(((int) aVar2.nextLong()) % height);
                            j0Var.c = currentTimeMillis;
                            j0Var.b = Math.abs(((int) aVar2.nextLong()) % 6) + 4;
                            ((ArrayList[]) bVar2.f)[i17].add(j0Var);
                            i17++;
                            f15 = f15;
                        }
                        f11 = f15;
                        com.google.android.gms.internal.play_billing.h1[][] h1VarArr = (com.google.android.gms.internal.play_billing.h1[][]) bVar2.g;
                        if (h1VarArr != null) {
                            j10 = 150;
                            if (h1VarArr.length == width + 1) {
                            }
                        } else {
                            j10 = 150;
                        }
                        bVar2.g = new com.google.android.gms.internal.play_billing.h1[width + 1][];
                        for (int i18 = 0; i18 <= width; i18++) {
                            ((com.google.android.gms.internal.play_billing.h1[][]) bVar2.g)[i18] = new com.google.android.gms.internal.play_billing.h1[height + 1];
                            int i19 = 0;
                            while (i19 <= height) {
                                com.google.android.gms.internal.play_billing.h1[][] h1VarArr2 = (com.google.android.gms.internal.play_billing.h1[][]) bVar2.g;
                                com.google.android.gms.internal.play_billing.h1[] h1VarArr3 = h1VarArr2[i18];
                                com.google.android.gms.internal.play_billing.h1 h1Var = new com.google.android.gms.internal.play_billing.h1();
                                h1Var.d = bVar2;
                                h1VarArr3[i19] = h1Var;
                                com.google.android.gms.internal.play_billing.h1 h1Var2 = h1VarArr2[i18][i19];
                                h1Var2.getClass();
                                f5.a aVar3 = Utilities.c;
                                h1Var2.a = Math.abs(((int) aVar3.nextLong()) % 16);
                                h1Var2.b = Math.abs(((int) aVar3.nextLong()) % 16);
                                h1Var2.c = Math.abs(((int) aVar3.nextLong()) % hs.X4) + currentTimeMillis + j10;
                                i19++;
                                f16 = f16;
                            }
                        }
                        float f17 = f16;
                        float f18 = 0.2f;
                        int i20 = 0;
                        while (i20 <= width) {
                            ArrayList arrayList2 = ((ArrayList[]) bVar2.f)[i20];
                            int i21 = i15;
                            while (i21 < arrayList2.size()) {
                                j0 j0Var2 = (j0) arrayList2.get(i21);
                                if (currentTimeMillis - j0Var2.c > 50) {
                                    int i22 = j0Var2.a + 1;
                                    j0Var2.a = i22;
                                    j0Var2.c = currentTimeMillis;
                                    f14 = f18;
                                    if (i22 - j0Var2.b < height) {
                                        i14 = 1;
                                        j11 = currentTimeMillis;
                                    } else if (arrayList2.size() == 1) {
                                        j0Var2.a = i15;
                                        j0Var2.c = currentTimeMillis;
                                        i14 = 1;
                                        j11 = currentTimeMillis;
                                        j0Var2.b = Math.abs(((int) Utilities.c.nextLong()) % 6) + i16;
                                    } else {
                                        i14 = 1;
                                        j11 = currentTimeMillis;
                                        arrayList2.remove(j0Var2);
                                        i21--;
                                    }
                                    if (j0Var2.a > j0Var2.b && i21 == arrayList2.size() - i14) {
                                        f5.a aVar4 = Utilities.c;
                                        if (Math.abs(aVar4.nextInt(i16)) == 0) {
                                            j0 j0Var3 = new j0();
                                            j0Var3.a = i15;
                                            currentTimeMillis = j11;
                                            j0Var3.c = currentTimeMillis;
                                            i3 = i16;
                                            j0Var3.b = Math.abs(((int) aVar4.nextLong()) % 6) + 4;
                                            arrayList2.add(j0Var3);
                                        }
                                    }
                                    currentTimeMillis = j11;
                                    i3 = i16;
                                } else {
                                    f14 = f18;
                                    i3 = i16;
                                }
                                int min = Math.min(j0Var2.a, height + 1);
                                int max = Math.max(i15, j0Var2.a - j0Var2.b);
                                while (max < min) {
                                    int i23 = bVar2.b;
                                    float f19 = i23 * i20;
                                    float f20 = i23 * max;
                                    if (((RectF) bVar2.c).contains(f19, f20)) {
                                        i10 = i20;
                                        bVar = bVar2;
                                        i11 = height;
                                        i12 = width;
                                        arrayList = arrayList2;
                                        i13 = i21;
                                    } else {
                                        i10 = i20;
                                        i11 = height;
                                        float i24 = Utilities.i(((f17 - ((j0Var2.a - max) / (j0Var2.b - 1))) * 0.8f) + f14, f17, 0.0f);
                                        com.google.android.gms.internal.play_billing.h1 h1Var3 = ((com.google.android.gms.internal.play_billing.h1[][]) bVar2.g)[i10][max];
                                        u4.b bVar3 = (u4.b) h1Var3.d;
                                        i12 = width;
                                        arrayList = arrayList2;
                                        long j12 = h1Var3.c - currentTimeMillis;
                                        bVar = bVar2;
                                        if (j12 < j10) {
                                            float i25 = Utilities.i(1.0f - (j12 / f13), 1.0f, 0.0f);
                                            Paint paint = (Paint) bVar3.h;
                                            Bitmap[] bitmapArr = (Bitmap[]) bVar3.d;
                                            i13 = i21;
                                            paint.setAlpha((int) k5.A(1.0f, i25, i24, 255.0f));
                                            canvas.drawBitmap(bitmapArr[h1Var3.a], f19, f20, paint);
                                            paint.setAlpha((int) (i24 * i25 * 255.0f));
                                            canvas.drawBitmap(bitmapArr[h1Var3.b], f19, f20, paint);
                                            paint.setAlpha(hs.e4);
                                            if (i25 >= 1.0f) {
                                                h1Var3.a = h1Var3.b;
                                                h1Var3.b = Math.abs(((int) Utilities.c.nextLong()) % 16);
                                                h1Var3.c = Math.abs(((int) r2.nextLong()) % hs.X4) + currentTimeMillis + j10;
                                            }
                                        } else {
                                            i13 = i21;
                                            ((Paint) bVar3.h).setAlpha((int) (i24 * 255.0f));
                                            canvas.drawBitmap(((Bitmap[]) bVar3.d)[h1Var3.a], f19, f20, (Paint) bVar3.h);
                                        }
                                    }
                                    max++;
                                    i20 = i10;
                                    height = i11;
                                    width = i12;
                                    arrayList2 = arrayList;
                                    bVar2 = bVar;
                                    i21 = i13;
                                    f17 = 1.0f;
                                }
                                i21++;
                                f18 = f14;
                                i16 = i3;
                                i15 = 0;
                                f17 = 1.0f;
                            }
                            i20++;
                            i15 = 0;
                            f17 = 1.0f;
                        }
                    }
                } else {
                    f11 = 2.0f;
                    if (s1Var != null) {
                        s1Var.d(canvas);
                    } else if (q1Var != null) {
                        Paint paint2 = q1Var.c;
                        if (this.I != null) {
                            float i26 = Utilities.i(r4.getCurrentPosition() / this.I.getDuration(), 1.0f, 0.0f);
                            float f21 = 1.0f / 9;
                            int i27 = (int) (i26 / f21);
                            int i28 = i27 + 1;
                            float c2 = com.google.android.recaptcha.internal.a.c(i27, f21, i26, f21);
                            float[] fArr = V;
                            f12 = i28 < 10 ? (fArr[i28] * c2) + ((1.0f - c2) * fArr[i27]) : fArr[i27];
                        } else {
                            f12 = 0.2f;
                        }
                        q1Var.f = (((1.0f - Utilities.i(this.H / 0.1f, 1.0f, 0.0f)) * 0.9f) + 0.1f) * 150.0f * f12;
                        ArrayList arrayList3 = q1Var.e;
                        int o10 = i0.a.o(k6.x0(null, k6.Nk, false), 80);
                        if (q1Var.i != o10) {
                            q1Var.i = o10;
                            paint2.setColor(o10);
                        }
                        long currentTimeMillis2 = System.currentTimeMillis();
                        for (int i29 = 0; i29 < arrayList3.size(); i29++) {
                            p1 p1Var = (p1) arrayList3.get(i29);
                            q1 q1Var2 = p1Var.g;
                            float[] fArr2 = q1Var2.d;
                            int i30 = i29 * 4;
                            float f22 = p1Var.a;
                            fArr2[i30] = f22;
                            fArr2[i30 + 1] = p1Var.b;
                            fArr2[i30 + 2] = (org.telegram.messenger.g0.L(30.0f) * p1Var.c) + f22;
                            fArr2[i30 + 3] = (org.telegram.messenger.g0.L(30.0f) * p1Var.d) + p1Var.b;
                            float L = org.telegram.messenger.g0.L(4.0f);
                            float f23 = q1Var2.j;
                            float f24 = (f23 / 660.0f) * L * q1Var2.f;
                            float f25 = (p1Var.c * f24) + p1Var.a;
                            p1Var.a = f25;
                            float f26 = (p1Var.d * f24) + p1Var.b;
                            p1Var.b = f26;
                            float f27 = p1Var.f;
                            if (f27 != 1.0f) {
                                float f28 = (f23 / 200.0f) + f27;
                                p1Var.f = f28;
                                if (f28 > 1.0f) {
                                    p1Var.f = 1.0f;
                                }
                            }
                            if (currentTimeMillis2 > p1Var.e || !q1Var.b.contains(f25, f26)) {
                                p1Var.a(currentTimeMillis2, false);
                            }
                        }
                        canvas.drawLines(q1Var.d, paint2);
                    } else {
                        org.telegram.ui.Cells.r0 r0Var = this.Q;
                        if (r0Var != null) {
                            ArrayList arrayList4 = r0Var.c;
                            System.currentTimeMillis();
                            for (int i31 = 0; i31 < arrayList4.size(); i31++) {
                                k kVar = (k) arrayList4.get(i31);
                                org.telegram.ui.Cells.r0 r0Var2 = kVar.m;
                                Paint paint3 = (Paint) r0Var2.i;
                                float f29 = kVar.l;
                                if (f29 != 1.0f) {
                                    float f30 = (r0Var2.e / kVar.j) + f29;
                                    kVar.l = f30;
                                    if (f30 > 1.0f) {
                                        kVar.l = 1.0f;
                                    }
                                }
                                if (kVar.f != null) {
                                    canvas.save();
                                    float pow2 = 1.0f - (((float) Math.pow(kVar.l - 0.5f, 2.0d)) * 4.0f);
                                    float A = com.google.android.recaptcha.internal.a.A(pow2, 0.4f, 0.7f, kVar.k / r0Var2.b);
                                    canvas.translate(kVar.b - (kVar.h / 2.0f), kVar.c - (kVar.i / 2.0f));
                                    canvas.scale(A, A, kVar.h / 2.0f, kVar.i / 2.0f);
                                    paint3.setAlpha((int) (kVar.d * pow2));
                                    canvas.drawBitmap(kVar.f, 0.0f, 0.0f, paint3);
                                    canvas.restore();
                                }
                                if (kVar.l >= 1.0f) {
                                    kVar.a(i31, false);
                                }
                            }
                        }
                    }
                }
                canvas.restore();
                invalidate();
                float min2 = (int) (Math.min(getMeasuredWidth(), getMeasuredHeight()) * f10);
                float measuredWidth = (getMeasuredWidth() - (0.671f * min2)) / f11;
                float f31 = 0.0671f * min2;
                this.N = f31;
                z10 = this.d;
                if (z10) {
                    org.telegram.messenger.g0.P.set(measuredWidth, getMeasuredHeight() - min2, getMeasuredWidth() - measuredWidth, getMeasuredHeight() + this.N);
                } else {
                    org.telegram.messenger.g0.P.set(measuredWidth, -f31, getMeasuredWidth() - measuredWidth, min2);
                }
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.inset(-org.telegram.messenger.g0.L(3.0f), -org.telegram.messenger.g0.L(3.0f));
                rectF.inset(-org.telegram.messenger.g0.L(3.0f), -org.telegram.messenger.g0.L(3.0f));
                canvas.drawRoundRect(rectF, this.N + org.telegram.messenger.g0.L(3.0f), this.N + org.telegram.messenger.g0.L(3.0f), this.c);
                rectF.inset(org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f));
                float f32 = this.N;
                Paint paint4 = this.b;
                canvas.drawRoundRect(rectF, f32, f32, paint4);
                if (z10) {
                    rectF.set(measuredWidth, getMeasuredHeight() - min2, getMeasuredWidth() - measuredWidth, getMeasuredHeight());
                } else {
                    rectF.set(measuredWidth, 0.0f, getMeasuredWidth() - measuredWidth, min2);
                }
                float L2 = this.N - org.telegram.messenger.g0.L(3.0f);
                this.N = L2;
                aVar = this.L;
                if (aVar != null) {
                    Paint paint5 = aVar.d;
                    if (aVar.g != L2) {
                        if (L2 > 0.05f) {
                            paint5.setShader(aVar.e);
                        } else {
                            paint5.setShader(null);
                        }
                        aVar.g = L2;
                        aVar.invalidateSelf();
                    }
                }
                l0Var = this.M;
                if (l0Var != null) {
                    l0Var.c = this.N;
                }
                ImageReceiver imageReceiver = this.n;
                if (z10) {
                    int i32 = (int) this.N;
                    imageReceiver.K0(i32, i32, 0, 0);
                } else {
                    int i33 = (int) this.N;
                    imageReceiver.K0(0, 0, i33, i33);
                }
                if (!this.G) {
                    imageReceiver.y0(rectF.left, rectF.top, rectF.width(), rectF.height());
                    imageReceiver.h(canvas, null);
                }
                super.dispatchDraw(canvas);
                if (z10) {
                    canvas.drawCircle(imageReceiver.r(), imageReceiver.M0 + org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(6.0f), paint4);
                    return;
                }
                return;
            }
        }
        f11 = 2.0f;
        f10 = 0.9f;
        float min22 = (int) (Math.min(getMeasuredWidth(), getMeasuredHeight()) * f10);
        float measuredWidth2 = (getMeasuredWidth() - (0.671f * min22)) / f11;
        float f312 = 0.0671f * min22;
        this.N = f312;
        z10 = this.d;
        if (z10) {
        }
        RectF rectF2 = org.telegram.messenger.g0.P;
        rectF2.inset(-org.telegram.messenger.g0.L(3.0f), -org.telegram.messenger.g0.L(3.0f));
        rectF2.inset(-org.telegram.messenger.g0.L(3.0f), -org.telegram.messenger.g0.L(3.0f));
        canvas.drawRoundRect(rectF2, this.N + org.telegram.messenger.g0.L(3.0f), this.N + org.telegram.messenger.g0.L(3.0f), this.c);
        rectF2.inset(org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f));
        float f322 = this.N;
        Paint paint42 = this.b;
        canvas.drawRoundRect(rectF2, f322, f322, paint42);
        if (z10) {
        }
        float L22 = this.N - org.telegram.messenger.g0.L(3.0f);
        this.N = L22;
        aVar = this.L;
        if (aVar != null) {
        }
        l0Var = this.M;
        if (l0Var != null) {
        }
        ImageReceiver imageReceiver2 = this.n;
        if (z10) {
        }
        if (!this.G) {
        }
        super.dispatchDraw(canvas);
        if (z10) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.y = true;
        c();
        if (!this.G) {
            a();
        }
        hs.f(this.s).c(this, hs.Y1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.y = false;
        c();
        hs.f(this.s).n(this, hs.Y1);
        org.telegram.ui.Cells.r0 r0Var = this.Q;
        if (r0Var != null) {
            HashMap hashMap = (HashMap) r0Var.f;
            Iterator it = hashMap.values().iterator();
            while (it.hasNext()) {
                ((Bitmap) it.next()).recycle();
            }
            hashMap.clear();
            this.Q = null;
        }
        gi.c0 c0Var = this.I;
        if (c0Var != null) {
            this.U = c0Var.getCurrentPosition();
            this.I.release(new hb1(18));
            this.I = null;
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        int measuredWidth = getMeasuredWidth() << (getMeasuredHeight() + 16);
        float min = (int) (Math.min(getMeasuredWidth(), getMeasuredHeight()) * 0.9f);
        float measuredWidth2 = (getMeasuredWidth() - (0.671f * min)) / 2.0f;
        if (this.d) {
            org.telegram.messenger.g0.P.set(measuredWidth2, -this.N, getMeasuredWidth() - measuredWidth2, min);
        } else {
            org.telegram.messenger.g0.P.set(measuredWidth2, getMeasuredHeight() - min, getMeasuredWidth() - measuredWidth2, getMeasuredHeight() + this.N);
        }
        if (this.T != measuredWidth) {
            this.T = measuredWidth;
            u4.b bVar = this.R;
            if (bVar != null) {
                RectF rectF = (RectF) bVar.c;
                ((Rect) bVar.e).set(0, 0, getMeasuredWidth(), getMeasuredHeight());
                rectF.set(org.telegram.messenger.g0.P);
                rectF.inset(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
            }
            s1 s1Var = this.O;
            if (s1Var != null) {
                RectF rectF2 = s1Var.c;
                RectF rectF3 = s1Var.a;
                int i13 = this.w;
                if (i13 == 6 || i13 == 9 || i13 == 3 || i13 == 7 || i13 == 24 || i13 == 43 || i13 == 11 || i13 == 4) {
                    rectF3.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    rectF3.inset(org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(30.0f));
                } else {
                    RectF rectF4 = org.telegram.messenger.g0.P;
                    float width = (int) (rectF4.width() * 0.4f);
                    rectF3.set(rectF4.centerX() - width, rectF4.centerY() - width, rectF4.centerX() + width, rectF4.centerY() + width);
                    s1Var.b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                }
                s1Var.f();
                rectF2.set(org.telegram.messenger.g0.P);
                rectF2.inset(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f));
            }
            q1 q1Var = this.P;
            if (q1Var != null) {
                RectF rectF5 = q1Var.a;
                rectF5.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                q1Var.b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                rectF5.inset(org.telegram.messenger.g0.L(100.0f), org.telegram.messenger.g0.L(100.0f));
                rectF5.offset(0.0f, getMeasuredHeight() * 0.1f);
                ArrayList arrayList = q1Var.e;
                long currentTimeMillis = System.currentTimeMillis();
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    ((p1) arrayList.get(i14)).a(currentTimeMillis, true);
                }
            }
            org.telegram.ui.Cells.r0 r0Var = this.Q;
            if (r0Var != null) {
                ((RectF) r0Var.g).set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((RectF) this.Q.h).set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((RectF) this.Q.g).inset(org.telegram.messenger.g0.L(0.0f), getMeasuredHeight() * 0.1f);
                ArrayList arrayList2 = this.Q.c;
                System.currentTimeMillis();
                for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                    ((k) arrayList2.get(i15)).a(i15, true);
                }
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        int size = View.MeasureSpec.getSize(i3);
        int size2 = View.MeasureSpec.getSize(i10);
        float min = (int) (Math.min(size2, size) * 0.9f);
        float f10 = size;
        float f11 = (f10 - (0.671f * min)) / 2.0f;
        this.N = 0.0671f * min;
        u1 u1Var = this.J;
        u1Var.invalidateOutline();
        if (this.d) {
            org.telegram.messenger.g0.P.set(f11, 0.0f, f10 - f11, min);
        } else {
            float f12 = size2;
            org.telegram.messenger.g0.P.set(f11, f12 - min, f10 - f11, f12);
        }
        ViewGroup.LayoutParams layoutParams = u1Var.getLayoutParams();
        RectF rectF = org.telegram.messenger.g0.P;
        layoutParams.width = (int) rectF.width();
        u1Var.getLayoutParams().height = (int) rectF.height();
        ((ViewGroup.MarginLayoutParams) u1Var.getLayoutParams()).leftMargin = (int) rectF.left;
        ((ViewGroup.MarginLayoutParams) u1Var.getLayoutParams()).topMargin = (int) rectF.top;
        super.onMeasure(i3, i10);
    }

    @Override // vg.k0
    public void setOffset(float f10) {
        boolean z10;
        boolean z11 = this.d;
        if (f10 < 0.0f) {
            float measuredWidth = (-f10) / getMeasuredWidth();
            setAlpha((Utilities.i(1.0f - measuredWidth, 1.0f, 0.0f) * 0.5f) + 0.5f);
            setRotationY(50.0f * measuredWidth);
            invalidate();
            if (z11) {
                setTranslationY((-getMeasuredHeight()) * 0.3f * measuredWidth);
            } else {
                setTranslationY(getMeasuredHeight() * 0.3f * measuredWidth);
            }
            this.H = Math.abs(measuredWidth);
            z10 = measuredWidth < 1.0f;
            if (measuredWidth >= 0.1f) {
                r4 = false;
            }
        } else {
            float measuredWidth2 = (-f10) / getMeasuredWidth();
            invalidate();
            setRotationY(50.0f * measuredWidth2);
            if (z11) {
                setTranslationY(getMeasuredHeight() * 0.3f * measuredWidth2);
            } else {
                setTranslationY((-getMeasuredHeight()) * 0.3f * measuredWidth2);
            }
            z10 = measuredWidth2 > -1.0f;
            r4 = measuredWidth2 > -0.1f;
            this.H = Math.abs(measuredWidth2);
        }
        if (z10 != this.x) {
            this.x = z10;
            c();
        }
        if (r4 != this.F) {
            this.F = r4;
            ImageReceiver imageReceiver = this.n;
            imageReceiver.u0 = r4;
            if (r4) {
                imageReceiver.P0(false);
                b();
                return;
            }
            gi.c0 c0Var = this.I;
            if (c0Var != null) {
                this.U = c0Var.getCurrentPosition();
                this.I.release(new hb1(18));
                this.I = null;
            }
            imageReceiver.Q0();
        }
    }
}
