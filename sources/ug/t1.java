package ug;

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
import org.telegram.messenger.gc;
import org.telegram.messenger.iz;
import org.telegram.messenger.k5;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
import org.telegram.messenger.rz;
import org.telegram.messenger.ui;
import org.telegram.messenger.w7;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.o61;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class t1 extends FrameLayout implements l0, ls {
    public static final float[] U = {0.02f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.02f};
    public boolean D;
    public boolean E;
    public boolean F;
    public float G;
    public fi.c0 H;
    public final r1 I;
    public final TextureView J;
    public final j0.a K;
    public final di.j0 L;
    public float M;
    public final p1 N;
    public final n1 O;
    public org.telegram.ui.Cells.r0 P;
    public final k0 Q;
    public final TLRPC.Document R;
    public int S;
    public long T;
    public final rz a;
    public final Paint b;
    public final Paint c;
    public final boolean d;
    public File e;
    public float f;
    public final String h;
    public final ImageReceiver n;
    public sg.t0 r;
    public final int s;
    public final int w;
    public boolean x;
    public boolean y;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0187  */
    /* JADX WARN: Type inference failed for: r9v16, types: [android.graphics.Bitmap[], java.io.Serializable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public t1(Context context, rz rzVar, int i7, int i10, f6 f6Var) {
        super(context);
        boolean[] zArr;
        Paint paint = new Paint(1);
        this.b = paint;
        Paint paint2 = new Paint(1);
        this.c = paint2;
        this.d = false;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.n = imageReceiver;
        this.s = i7;
        this.w = i10;
        this.a = rzVar;
        paint.setColor(-16777216);
        paint2.setColor(i0.a.f(0.5f, k6.w0(k6.Ak, f6Var), -16777216));
        imageReceiver.E0(ConnectionsManager.DEFAULT_DATACENTER_ID);
        TLRPC.TL_help_premiumPromo tL_help_premiumPromo = ui.b0(i7).D;
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
                s1 s1Var = null;
                for (int i12 = 0; i12 < document.thumbs.size(); i12++) {
                    if (document.thumbs.get(i12) instanceof TLRPC.TL_photoStrippedSize) {
                        this.K = new j0.a(getResources(), gc.F("b", document.thumbs.get(i12).bytes));
                        org.telegram.ui.Components.voip.n nVar = new org.telegram.ui.Components.voip.n();
                        nVar.m = 4.0f;
                        nVar.g = 3.5f;
                        nVar.l = true;
                        rz rzVar2 = this.a;
                        nVar.o = this;
                        this.L = new di.j0(nVar, rzVar2);
                        s1Var = new s1(this, this.K, this.L);
                        s1Var.x = true;
                    }
                }
                this.h = w7.r(null, document);
                zArr = null;
                this.n.q0(null, null, s1Var, null, tL_help_premiumPromo, 1);
                w7.G(this.s).W(document, tL_help_premiumPromo, 3, 0);
                this.R = document;
                Utilities.e.c(new u9.f(4, this, document));
                if (i10 != 1) {
                    k0 k0Var = new k0(0);
                    k0Var.c = new RectF();
                    ?? r92 = new Bitmap[16];
                    k0Var.d = r92;
                    k0Var.e = new Rect();
                    k0Var.h = new Paint();
                    this.Q = k0Var;
                    k0Var.b = org.telegram.messenger.g0.L(16.0f);
                    TextPaint textPaint = new TextPaint(65);
                    textPaint.setTypeface(org.telegram.messenger.g0.o1("fonts/rcondensedbold.ttf"));
                    textPaint.setTextSize(k0Var.b);
                    textPaint.setColor(i0.a.o(k6.x0(zArr, k6.Nk, false), 30));
                    textPaint.setTextAlign(Paint.Align.CENTER);
                    int i13 = 0;
                    while (i13 < 16) {
                        int i14 = i13 < 10 ? i13 + 48 : i13 + 55;
                        int i15 = k0Var.b;
                        r92[i13] = Bitmap.createBitmap(i15, i15, Bitmap.Config.ARGB_8888);
                        new Canvas(r92[i13]).drawText(Character.toString((char) i14), r13 >> 1, k0Var.b, textPaint);
                        i13++;
                    }
                } else if (i10 == 6 || i10 == 9 || i10 == 3 || i10 == 7 || i10 == 11 || i10 == 4 || i10 == 24 || i10 == 43) {
                    p1 p1Var = new p1(40);
                    this.N = p1Var;
                    p1Var.o = 3.0f;
                    p1Var.O = i10;
                    if (i10 == 3 || i10 == 24 || i10 == 43) {
                        p1Var.r = 14;
                        p1Var.s = 18;
                        p1Var.t = 18;
                    } else {
                        p1Var.r = 14;
                        p1Var.s = 16;
                        p1Var.t = 15;
                    }
                    if (i10 == 43) {
                        p1Var.G = true;
                    }
                    p1Var.w = 0.98f;
                    p1Var.v = 0.98f;
                    p1Var.u = 0.98f;
                    p1Var.o = 4.0f;
                    p1Var.P = f6Var;
                    p1Var.Q = k6.Nk;
                    p1Var.c();
                } else if (i10 == 2) {
                    n1 n1Var = new n1();
                    this.O = n1Var;
                    ArrayList arrayList = n1Var.e;
                    if (arrayList.isEmpty()) {
                        for (int i16 = 0; i16 < n1Var.g; i16++) {
                            arrayList.add(new m1(n1Var));
                        }
                    }
                    int o4 = i0.a.o(k6.x0(zArr, k6.Nk, false), 80);
                    if (n1Var.i != o4) {
                        n1Var.i = o4;
                        n1Var.c.setColor(o4);
                    }
                } else if (i10 == 13) {
                    org.telegram.ui.Cells.r0 r0Var = new org.telegram.ui.Cells.r0();
                    this.P = r0Var;
                    ArrayList arrayList2 = r0Var.c;
                    if (arrayList2.isEmpty()) {
                        for (int i17 = 0; i17 < r0Var.d; i17++) {
                            arrayList2.add(new k(r0Var));
                        }
                    }
                } else {
                    p1 p1Var2 = new p1(iz.o() == 2 ? 800 : iz.o() == 1 ? 400 : 100);
                    this.N = p1Var2;
                    p1Var2.P = f6Var;
                    p1Var2.Q = k6.Nk;
                    p1Var2.r = 4;
                    p1Var2.w = 0.98f;
                    p1Var2.v = 0.98f;
                    p1Var2.u = 0.98f;
                    p1Var2.G = true;
                    p1Var2.o = 4.0f;
                    p1Var2.H = true;
                    p1Var2.I = true;
                    p1Var2.K = true;
                    p1Var2.M = false;
                    p1Var2.c();
                }
                if (i10 != 1 || i10 == 3 || i10 == 11) {
                    this.d = true;
                }
                r1 r1Var = new r1(this, context);
                this.I = r1Var;
                r1Var.setResizeMode(0);
                TextureView textureView = new TextureView(context);
                this.J = textureView;
                r1Var.addView(textureView);
                setWillNotDraw(false);
                addView(r1Var);
            }
        }
        zArr = null;
        if (i10 != 1) {
        }
        if (i10 != 1) {
        }
        this.d = true;
        r1 r1Var2 = new r1(this, context);
        this.I = r1Var2;
        r1Var2.setResizeMode(0);
        TextureView textureView2 = new TextureView(context);
        this.J = textureView2;
        r1Var2.addView(textureView2);
        setWillNotDraw(false);
        addView(r1Var2);
    }

    public final void a() {
        File file = this.e;
        if ((file != null && file.exists()) || iz.B0) {
            File file2 = this.e;
            if (file2 == null || !file2.exists()) {
                this.f = 0.671f;
            } else {
                if ((qs.e().p & 512) != 0) {
                    sg.t0 t0Var = this.r;
                    if (t0Var != null) {
                        org.telegram.messenger.g0.r(t0Var);
                    }
                    sg.t0 t0Var2 = new sg.t0(this, 21);
                    this.r = t0Var2;
                    org.telegram.messenger.g0.i3(t0Var2, 300L);
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
            if (this.E) {
                b();
            }
        }
        this.r = null;
    }

    public final void b() {
        Uri uri;
        int i7 = this.s;
        if ((this.e != null || iz.B0) && this.H == null) {
            this.I.a(this.f, 0);
            fi.c0 c0Var = new fi.c0(this, 1);
            this.H = c0Var;
            TextureView textureView = this.J;
            c0Var.with(textureView);
            File file = this.e;
            if (file == null || !file.exists()) {
                try {
                    StringBuilder sb2 = new StringBuilder("?account=");
                    sb2.append(i7);
                    sb2.append("&id=");
                    sb2.append(this.R.id);
                    sb2.append("&hash=");
                    sb2.append(this.R.access_hash);
                    sb2.append("&dc=");
                    sb2.append(this.R.dc_id);
                    sb2.append("&size=");
                    sb2.append(this.R.size);
                    sb2.append("&mime=");
                    sb2.append(URLEncoder.encode(this.R.mime_type, "UTF-8"));
                    sb2.append("&rid=");
                    sb2.append(w7.G(i7).F(ui.b0(i7).D));
                    sb2.append("&name=");
                    sb2.append(URLEncoder.encode(w7.B(this.R), "UTF-8"));
                    sb2.append("&reference=");
                    byte[] bArr = this.R.file_reference;
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
            this.H.preparePlayer(uri, false, 1.0f);
            if (!this.F) {
                this.n.Q0();
                textureView.setAlpha(0.0f);
            }
            this.H.seekTo(this.T + 60);
            this.H.play();
        }
    }

    public final void c() {
        boolean z9 = this.x && this.y;
        if (this.D != z9) {
            this.D = z9;
            ImageReceiver imageReceiver = this.n;
            if (z9) {
                imageReceiver.P();
            } else {
                imageReceiver.R();
            }
        }
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == qs.Y1) {
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
        long j3;
        float f14;
        int i7;
        int i10;
        k0 k0Var;
        int i11;
        int i12;
        ArrayList arrayList;
        int i13;
        int i14;
        long j10;
        boolean z9;
        j0.a aVar;
        di.j0 j0Var;
        k0 k0Var2 = this.Q;
        n1 n1Var = this.O;
        float f15 = 2.0f;
        int i15 = 0;
        p1 p1Var = this.N;
        if (p1Var != null || n1Var != null || this.P != null || k0Var2 != null) {
            if (this.G < 0.5f) {
                float f16 = 1.0f;
                float pow = (float) Math.pow(1.0f - r10, 2.0d);
                canvas.save();
                f10 = 0.9f;
                canvas.scale(pow, pow, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
                if (k0Var2 != null) {
                    Rect rect = (Rect) k0Var2.e;
                    int width = rect.width() / k0Var2.b;
                    int height = rect.height() / k0Var2.b;
                    if (width == 0 || height == 0) {
                        f11 = 2.0f;
                    } else {
                        long currentTimeMillis = System.currentTimeMillis();
                        ArrayList[] arrayListArr = (ArrayList[]) k0Var2.f;
                        int i16 = 4;
                        if (arrayListArr != null) {
                            f13 = 150.0f;
                        } else {
                            f13 = 150.0f;
                        }
                        k0Var2.f = new ArrayList[width + 1];
                        int i17 = 0;
                        while (i17 <= width) {
                            ((ArrayList[]) k0Var2.f)[i17] = new ArrayList();
                            j0 j0Var2 = new j0();
                            g5.a aVar2 = Utilities.c;
                            j0Var2.a = Math.abs(((int) aVar2.nextLong()) % height);
                            j0Var2.c = currentTimeMillis;
                            j0Var2.b = Math.abs(((int) aVar2.nextLong()) % 6) + 4;
                            ((ArrayList[]) k0Var2.f)[i17].add(j0Var2);
                            i17++;
                            f15 = f15;
                        }
                        f11 = f15;
                        com.google.android.gms.internal.play_billing.h1[][] h1VarArr = (com.google.android.gms.internal.play_billing.h1[][]) k0Var2.g;
                        if (h1VarArr != null) {
                            j3 = 150;
                            if (h1VarArr.length == width + 1) {
                            }
                        } else {
                            j3 = 150;
                        }
                        k0Var2.g = new com.google.android.gms.internal.play_billing.h1[width + 1][];
                        for (int i18 = 0; i18 <= width; i18++) {
                            ((com.google.android.gms.internal.play_billing.h1[][]) k0Var2.g)[i18] = new com.google.android.gms.internal.play_billing.h1[height + 1];
                            int i19 = 0;
                            while (i19 <= height) {
                                com.google.android.gms.internal.play_billing.h1[][] h1VarArr2 = (com.google.android.gms.internal.play_billing.h1[][]) k0Var2.g;
                                com.google.android.gms.internal.play_billing.h1[] h1VarArr3 = h1VarArr2[i18];
                                com.google.android.gms.internal.play_billing.h1 h1Var = new com.google.android.gms.internal.play_billing.h1();
                                h1Var.d = k0Var2;
                                h1VarArr3[i19] = h1Var;
                                com.google.android.gms.internal.play_billing.h1 h1Var2 = h1VarArr2[i18][i19];
                                h1Var2.getClass();
                                g5.a aVar3 = Utilities.c;
                                h1Var2.a = Math.abs(((int) aVar3.nextLong()) % 16);
                                h1Var2.b = Math.abs(((int) aVar3.nextLong()) % 16);
                                h1Var2.c = Math.abs(((int) aVar3.nextLong()) % qs.X4) + currentTimeMillis + j3;
                                i19++;
                                f16 = f16;
                            }
                        }
                        float f17 = f16;
                        float f18 = 0.2f;
                        int i20 = 0;
                        while (i20 <= width) {
                            ArrayList arrayList2 = ((ArrayList[]) k0Var2.f)[i20];
                            int i21 = i15;
                            while (i21 < arrayList2.size()) {
                                j0 j0Var3 = (j0) arrayList2.get(i21);
                                if (currentTimeMillis - j0Var3.c > 50) {
                                    int i22 = j0Var3.a + 1;
                                    j0Var3.a = i22;
                                    j0Var3.c = currentTimeMillis;
                                    f14 = f18;
                                    if (i22 - j0Var3.b < height) {
                                        i14 = 1;
                                        j10 = currentTimeMillis;
                                    } else if (arrayList2.size() == 1) {
                                        j0Var3.a = i15;
                                        j0Var3.c = currentTimeMillis;
                                        i14 = 1;
                                        j10 = currentTimeMillis;
                                        j0Var3.b = Math.abs(((int) Utilities.c.nextLong()) % 6) + i16;
                                    } else {
                                        i14 = 1;
                                        j10 = currentTimeMillis;
                                        arrayList2.remove(j0Var3);
                                        i21--;
                                    }
                                    if (j0Var3.a > j0Var3.b && i21 == arrayList2.size() - i14) {
                                        g5.a aVar4 = Utilities.c;
                                        if (Math.abs(aVar4.nextInt(i16)) == 0) {
                                            j0 j0Var4 = new j0();
                                            j0Var4.a = i15;
                                            currentTimeMillis = j10;
                                            j0Var4.c = currentTimeMillis;
                                            i7 = i16;
                                            j0Var4.b = Math.abs(((int) aVar4.nextLong()) % 6) + 4;
                                            arrayList2.add(j0Var4);
                                        }
                                    }
                                    currentTimeMillis = j10;
                                    i7 = i16;
                                } else {
                                    f14 = f18;
                                    i7 = i16;
                                }
                                int min = Math.min(j0Var3.a, height + 1);
                                int max = Math.max(i15, j0Var3.a - j0Var3.b);
                                while (max < min) {
                                    int i23 = k0Var2.b;
                                    float f19 = i23 * i20;
                                    float f20 = i23 * max;
                                    if (((RectF) k0Var2.c).contains(f19, f20)) {
                                        i10 = i20;
                                        k0Var = k0Var2;
                                        i11 = height;
                                        i12 = width;
                                        arrayList = arrayList2;
                                        i13 = i21;
                                    } else {
                                        i10 = i20;
                                        i11 = height;
                                        float i24 = Utilities.i(((f17 - ((j0Var3.a - max) / (j0Var3.b - 1))) * 0.8f) + f14, f17, 0.0f);
                                        com.google.android.gms.internal.play_billing.h1 h1Var3 = ((com.google.android.gms.internal.play_billing.h1[][]) k0Var2.g)[i10][max];
                                        k0 k0Var3 = (k0) h1Var3.d;
                                        i12 = width;
                                        arrayList = arrayList2;
                                        long j11 = h1Var3.c - currentTimeMillis;
                                        k0Var = k0Var2;
                                        if (j11 < j3) {
                                            float i25 = Utilities.i(1.0f - (j11 / f13), 1.0f, 0.0f);
                                            Paint paint = (Paint) k0Var3.h;
                                            Bitmap[] bitmapArr = (Bitmap[]) k0Var3.d;
                                            i13 = i21;
                                            paint.setAlpha((int) k5.A(1.0f, i25, i24, 255.0f));
                                            canvas.drawBitmap(bitmapArr[h1Var3.a], f19, f20, paint);
                                            paint.setAlpha((int) (i24 * i25 * 255.0f));
                                            canvas.drawBitmap(bitmapArr[h1Var3.b], f19, f20, paint);
                                            paint.setAlpha(qs.e4);
                                            if (i25 >= 1.0f) {
                                                h1Var3.a = h1Var3.b;
                                                h1Var3.b = Math.abs(((int) Utilities.c.nextLong()) % 16);
                                                h1Var3.c = Math.abs(((int) r2.nextLong()) % qs.X4) + currentTimeMillis + j3;
                                            }
                                        } else {
                                            i13 = i21;
                                            ((Paint) k0Var3.h).setAlpha((int) (i24 * 255.0f));
                                            canvas.drawBitmap(((Bitmap[]) k0Var3.d)[h1Var3.a], f19, f20, (Paint) k0Var3.h);
                                        }
                                    }
                                    max++;
                                    i20 = i10;
                                    height = i11;
                                    width = i12;
                                    arrayList2 = arrayList;
                                    k0Var2 = k0Var;
                                    i21 = i13;
                                    f17 = 1.0f;
                                }
                                i21++;
                                f18 = f14;
                                i16 = i7;
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
                    if (p1Var != null) {
                        p1Var.d(canvas);
                    } else if (n1Var != null) {
                        Paint paint2 = n1Var.c;
                        if (this.H != null) {
                            float i26 = Utilities.i(r4.getCurrentPosition() / this.H.getDuration(), 1.0f, 0.0f);
                            float f21 = 1.0f / 9;
                            int i27 = (int) (i26 / f21);
                            int i28 = i27 + 1;
                            float w10 = com.google.android.recaptcha.internal.a.w(i27, f21, i26, f21);
                            float[] fArr = U;
                            f12 = i28 < 10 ? (fArr[i28] * w10) + ((1.0f - w10) * fArr[i27]) : fArr[i27];
                        } else {
                            f12 = 0.2f;
                        }
                        n1Var.f = (((1.0f - Utilities.i(this.G / 0.1f, 1.0f, 0.0f)) * 0.9f) + 0.1f) * 150.0f * f12;
                        ArrayList arrayList3 = n1Var.e;
                        int o4 = i0.a.o(k6.x0(null, k6.Nk, false), 80);
                        if (n1Var.i != o4) {
                            n1Var.i = o4;
                            paint2.setColor(o4);
                        }
                        long currentTimeMillis2 = System.currentTimeMillis();
                        for (int i29 = 0; i29 < arrayList3.size(); i29++) {
                            m1 m1Var = (m1) arrayList3.get(i29);
                            n1 n1Var2 = m1Var.g;
                            float[] fArr2 = n1Var2.d;
                            int i30 = i29 * 4;
                            float f22 = m1Var.a;
                            fArr2[i30] = f22;
                            fArr2[i30 + 1] = m1Var.b;
                            fArr2[i30 + 2] = (org.telegram.messenger.g0.L(30.0f) * m1Var.c) + f22;
                            fArr2[i30 + 3] = (org.telegram.messenger.g0.L(30.0f) * m1Var.d) + m1Var.b;
                            float L = org.telegram.messenger.g0.L(4.0f);
                            float f23 = n1Var2.j;
                            float f24 = (f23 / 660.0f) * L * n1Var2.f;
                            float f25 = (m1Var.c * f24) + m1Var.a;
                            m1Var.a = f25;
                            float f26 = (m1Var.d * f24) + m1Var.b;
                            m1Var.b = f26;
                            float f27 = m1Var.f;
                            if (f27 != 1.0f) {
                                float f28 = (f23 / 200.0f) + f27;
                                m1Var.f = f28;
                                if (f28 > 1.0f) {
                                    m1Var.f = 1.0f;
                                }
                            }
                            if (currentTimeMillis2 > m1Var.e || !n1Var.b.contains(f25, f26)) {
                                m1Var.a(currentTimeMillis2, false);
                            }
                        }
                        canvas.drawLines(n1Var.d, paint2);
                    } else {
                        org.telegram.ui.Cells.r0 r0Var = this.P;
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
                                    float B = com.google.android.recaptcha.internal.a.B(pow2, 0.4f, 0.7f, kVar.k / r0Var2.b);
                                    canvas.translate(kVar.b - (kVar.h / 2.0f), kVar.c - (kVar.i / 2.0f));
                                    canvas.scale(B, B, kVar.h / 2.0f, kVar.i / 2.0f);
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
                this.M = f31;
                z9 = this.d;
                if (z9) {
                    org.telegram.messenger.g0.P.set(measuredWidth, getMeasuredHeight() - min2, getMeasuredWidth() - measuredWidth, getMeasuredHeight() + this.M);
                } else {
                    org.telegram.messenger.g0.P.set(measuredWidth, -f31, getMeasuredWidth() - measuredWidth, min2);
                }
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.inset(-org.telegram.messenger.g0.L(3.0f), -org.telegram.messenger.g0.L(3.0f));
                rectF.inset(-org.telegram.messenger.g0.L(3.0f), -org.telegram.messenger.g0.L(3.0f));
                canvas.drawRoundRect(rectF, this.M + org.telegram.messenger.g0.L(3.0f), this.M + org.telegram.messenger.g0.L(3.0f), this.c);
                rectF.inset(org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f));
                float f32 = this.M;
                Paint paint4 = this.b;
                canvas.drawRoundRect(rectF, f32, f32, paint4);
                if (z9) {
                    rectF.set(measuredWidth, getMeasuredHeight() - min2, getMeasuredWidth() - measuredWidth, getMeasuredHeight());
                } else {
                    rectF.set(measuredWidth, 0.0f, getMeasuredWidth() - measuredWidth, min2);
                }
                float L2 = this.M - org.telegram.messenger.g0.L(3.0f);
                this.M = L2;
                aVar = this.K;
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
                j0Var = this.L;
                if (j0Var != null) {
                    j0Var.c = this.M;
                }
                ImageReceiver imageReceiver = this.n;
                if (z9) {
                    int i32 = (int) this.M;
                    imageReceiver.K0(i32, i32, 0, 0);
                } else {
                    int i33 = (int) this.M;
                    imageReceiver.K0(0, 0, i33, i33);
                }
                if (!this.F) {
                    imageReceiver.y0(rectF.left, rectF.top, rectF.width(), rectF.height());
                    imageReceiver.h(canvas, null);
                }
                super.dispatchDraw(canvas);
                if (z9) {
                    canvas.drawCircle(imageReceiver.r(), imageReceiver.L0 + org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(6.0f), paint4);
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
        this.M = f312;
        z9 = this.d;
        if (z9) {
        }
        RectF rectF2 = org.telegram.messenger.g0.P;
        rectF2.inset(-org.telegram.messenger.g0.L(3.0f), -org.telegram.messenger.g0.L(3.0f));
        rectF2.inset(-org.telegram.messenger.g0.L(3.0f), -org.telegram.messenger.g0.L(3.0f));
        canvas.drawRoundRect(rectF2, this.M + org.telegram.messenger.g0.L(3.0f), this.M + org.telegram.messenger.g0.L(3.0f), this.c);
        rectF2.inset(org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f));
        float f322 = this.M;
        Paint paint42 = this.b;
        canvas.drawRoundRect(rectF2, f322, f322, paint42);
        if (z9) {
        }
        float L22 = this.M - org.telegram.messenger.g0.L(3.0f);
        this.M = L22;
        aVar = this.K;
        if (aVar != null) {
        }
        j0Var = this.L;
        if (j0Var != null) {
        }
        ImageReceiver imageReceiver2 = this.n;
        if (z9) {
        }
        if (!this.F) {
        }
        super.dispatchDraw(canvas);
        if (z9) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.y = true;
        c();
        if (!this.F) {
            a();
        }
        qs.f(this.s).c(this, qs.Y1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.y = false;
        c();
        qs.f(this.s).n(this, qs.Y1);
        org.telegram.ui.Cells.r0 r0Var = this.P;
        if (r0Var != null) {
            HashMap hashMap = (HashMap) r0Var.f;
            Iterator it = hashMap.values().iterator();
            while (it.hasNext()) {
                ((Bitmap) it.next()).recycle();
            }
            hashMap.clear();
            this.P = null;
        }
        fi.c0 c0Var = this.H;
        if (c0Var != null) {
            this.T = c0Var.getCurrentPosition();
            this.H.release(new o61(20));
            this.H = null;
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        int measuredWidth = getMeasuredWidth() << (getMeasuredHeight() + 16);
        float min = (int) (Math.min(getMeasuredWidth(), getMeasuredHeight()) * 0.9f);
        float measuredWidth2 = (getMeasuredWidth() - (0.671f * min)) / 2.0f;
        if (this.d) {
            org.telegram.messenger.g0.P.set(measuredWidth2, -this.M, getMeasuredWidth() - measuredWidth2, min);
        } else {
            org.telegram.messenger.g0.P.set(measuredWidth2, getMeasuredHeight() - min, getMeasuredWidth() - measuredWidth2, getMeasuredHeight() + this.M);
        }
        if (this.S != measuredWidth) {
            this.S = measuredWidth;
            k0 k0Var = this.Q;
            if (k0Var != null) {
                RectF rectF = (RectF) k0Var.c;
                ((Rect) k0Var.e).set(0, 0, getMeasuredWidth(), getMeasuredHeight());
                rectF.set(org.telegram.messenger.g0.P);
                rectF.inset(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
            }
            p1 p1Var = this.N;
            if (p1Var != null) {
                RectF rectF2 = p1Var.c;
                RectF rectF3 = p1Var.a;
                int i13 = this.w;
                if (i13 == 6 || i13 == 9 || i13 == 3 || i13 == 7 || i13 == 24 || i13 == 43 || i13 == 11 || i13 == 4) {
                    rectF3.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    rectF3.inset(org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(30.0f));
                } else {
                    RectF rectF4 = org.telegram.messenger.g0.P;
                    float width = (int) (rectF4.width() * 0.4f);
                    rectF3.set(rectF4.centerX() - width, rectF4.centerY() - width, rectF4.centerX() + width, rectF4.centerY() + width);
                    p1Var.b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                }
                p1Var.f();
                rectF2.set(org.telegram.messenger.g0.P);
                rectF2.inset(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f));
            }
            n1 n1Var = this.O;
            if (n1Var != null) {
                RectF rectF5 = n1Var.a;
                rectF5.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                n1Var.b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                rectF5.inset(org.telegram.messenger.g0.L(100.0f), org.telegram.messenger.g0.L(100.0f));
                rectF5.offset(0.0f, getMeasuredHeight() * 0.1f);
                ArrayList arrayList = n1Var.e;
                long currentTimeMillis = System.currentTimeMillis();
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    ((m1) arrayList.get(i14)).a(currentTimeMillis, true);
                }
            }
            org.telegram.ui.Cells.r0 r0Var = this.P;
            if (r0Var != null) {
                ((RectF) r0Var.g).set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((RectF) this.P.h).set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((RectF) this.P.g).inset(org.telegram.messenger.g0.L(0.0f), getMeasuredHeight() * 0.1f);
                ArrayList arrayList2 = this.P.c;
                System.currentTimeMillis();
                for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                    ((k) arrayList2.get(i15)).a(i15, true);
                }
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        float min = (int) (Math.min(size2, size) * 0.9f);
        float f10 = size;
        float f11 = (f10 - (0.671f * min)) / 2.0f;
        this.M = 0.0671f * min;
        r1 r1Var = this.I;
        r1Var.invalidateOutline();
        if (this.d) {
            org.telegram.messenger.g0.P.set(f11, 0.0f, f10 - f11, min);
        } else {
            float f12 = size2;
            org.telegram.messenger.g0.P.set(f11, f12 - min, f10 - f11, f12);
        }
        ViewGroup.LayoutParams layoutParams = r1Var.getLayoutParams();
        RectF rectF = org.telegram.messenger.g0.P;
        layoutParams.width = (int) rectF.width();
        r1Var.getLayoutParams().height = (int) rectF.height();
        ((ViewGroup.MarginLayoutParams) r1Var.getLayoutParams()).leftMargin = (int) rectF.left;
        ((ViewGroup.MarginLayoutParams) r1Var.getLayoutParams()).topMargin = (int) rectF.top;
        super.onMeasure(i7, i10);
    }

    @Override // ug.l0
    public void setOffset(float f10) {
        boolean z9;
        boolean z10 = this.d;
        if (f10 < 0.0f) {
            float measuredWidth = (-f10) / getMeasuredWidth();
            setAlpha((Utilities.i(1.0f - measuredWidth, 1.0f, 0.0f) * 0.5f) + 0.5f);
            setRotationY(50.0f * measuredWidth);
            invalidate();
            if (z10) {
                setTranslationY((-getMeasuredHeight()) * 0.3f * measuredWidth);
            } else {
                setTranslationY(getMeasuredHeight() * 0.3f * measuredWidth);
            }
            this.G = Math.abs(measuredWidth);
            z9 = measuredWidth < 1.0f;
            if (measuredWidth >= 0.1f) {
                r4 = false;
            }
        } else {
            float measuredWidth2 = (-f10) / getMeasuredWidth();
            invalidate();
            setRotationY(50.0f * measuredWidth2);
            if (z10) {
                setTranslationY(getMeasuredHeight() * 0.3f * measuredWidth2);
            } else {
                setTranslationY((-getMeasuredHeight()) * 0.3f * measuredWidth2);
            }
            z9 = measuredWidth2 > -1.0f;
            r4 = measuredWidth2 > -0.1f;
            this.G = Math.abs(measuredWidth2);
        }
        if (z9 != this.x) {
            this.x = z9;
            c();
        }
        if (r4 != this.E) {
            this.E = r4;
            ImageReceiver imageReceiver = this.n;
            imageReceiver.t0 = r4;
            if (r4) {
                imageReceiver.P0(false);
                b();
                return;
            }
            fi.c0 c0Var = this.H;
            if (c0Var != null) {
                this.T = c0Var.getCurrentPosition();
                this.H.release(new o61(20));
                this.H = null;
            }
            imageReceiver.Q0();
        }
    }
}
