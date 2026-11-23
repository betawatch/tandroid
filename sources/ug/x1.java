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
import com.google.android.gms.internal.vision.e2;
import java.io.File;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bz;
import org.telegram.messenger.ec;
import org.telegram.messenger.f3;
import org.telegram.messenger.fs;
import org.telegram.messenger.ks;
import org.telegram.messenger.kz;
import org.telegram.messenger.m10;
import org.telegram.messenger.ri;
import org.telegram.messenger.w7;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.cd0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class x1 extends FrameLayout implements n0, fs {
    public static final float[] V = {0.02f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.02f};
    public boolean E;
    public boolean F;
    public boolean G;
    public float H;
    public hi.l0 I;
    public final v1 J;
    public final TextureView K;
    public final j0.a L;
    public final fi.i0 M;
    public float N;
    public final s1 O;
    public final q1 P;
    public org.telegram.ui.Cells.t0 Q;
    public final m0 R;
    public final TLRPC.Document S;
    public int T;
    public long U;
    public final kz a;
    public final Paint b;
    public final Paint c;
    public final boolean d;
    public File e;
    public float f;
    public final String h;
    public final ImageReceiver n;
    public u1 r;
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
    public x1(Context context, kz kzVar, int i7, int i10, i6 i6Var) {
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
        this.a = kzVar;
        paint.setColor(-16777216);
        paint2.setColor(i0.a.f(0.5f, n6.w0(n6.Dk, i6Var), -16777216));
        imageReceiver.F0(ConnectionsManager.DEFAULT_DATACENTER_ID);
        TLRPC.TL_help_premiumPromo tL_help_premiumPromo = ri.d0(i7).E;
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
                w1 w1Var = null;
                for (int i12 = 0; i12 < document.thumbs.size(); i12++) {
                    if (document.thumbs.get(i12) instanceof TLRPC.TL_photoStrippedSize) {
                        this.L = new j0.a(getResources(), ec.F("b", document.thumbs.get(i12).bytes));
                        org.telegram.ui.Components.voip.n nVar = new org.telegram.ui.Components.voip.n();
                        nVar.m = 4.0f;
                        nVar.g = 3.5f;
                        nVar.l = true;
                        kz kzVar2 = this.a;
                        nVar.o = this;
                        this.M = new fi.i0(nVar, kzVar2);
                        w1Var = new w1(this, this.L, this.M);
                        w1Var.x = true;
                    }
                }
                this.h = w7.r(null, document);
                zArr = null;
                this.n.r0(null, null, w1Var, null, tL_help_premiumPromo, 1);
                w7.G(this.s).W(document, tL_help_premiumPromo, 3, 0);
                this.S = document;
                Utilities.e.c(new org.telegram.ui.web.t1(27, this, document));
                if (i10 != 1) {
                    m0 m0Var = new m0(0);
                    m0Var.c = new RectF();
                    ?? r92 = new Bitmap[16];
                    m0Var.d = r92;
                    m0Var.e = new Rect();
                    m0Var.h = new Paint();
                    this.R = m0Var;
                    m0Var.b = org.telegram.messenger.g0.L(16.0f);
                    TextPaint textPaint = new TextPaint(65);
                    textPaint.setTypeface(org.telegram.messenger.g0.o1("fonts/rcondensedbold.ttf"));
                    textPaint.setTextSize(m0Var.b);
                    textPaint.setColor(i0.a.o(n6.x0(zArr, n6.Qk, false), 30));
                    textPaint.setTextAlign(Paint.Align.CENTER);
                    int i13 = 0;
                    while (i13 < 16) {
                        int i14 = i13 < 10 ? i13 + 48 : i13 + 55;
                        int i15 = m0Var.b;
                        r92[i13] = Bitmap.createBitmap(i15, i15, Bitmap.Config.ARGB_8888);
                        new Canvas(r92[i13]).drawText(Character.toString((char) i14), r13 >> 1, m0Var.b, textPaint);
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
                    s1Var.P = i6Var;
                    s1Var.Q = n6.Qk;
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
                    int o4 = i0.a.o(n6.x0(zArr, n6.Qk, false), 80);
                    if (q1Var.i != o4) {
                        q1Var.i = o4;
                        q1Var.c.setColor(o4);
                    }
                } else if (i10 == 13) {
                    org.telegram.ui.Cells.t0 t0Var = new org.telegram.ui.Cells.t0();
                    this.Q = t0Var;
                    ArrayList arrayList2 = t0Var.c;
                    if (arrayList2.isEmpty()) {
                        for (int i17 = 0; i17 < t0Var.d; i17++) {
                            arrayList2.add(new k(t0Var));
                        }
                    }
                } else {
                    s1 s1Var2 = new s1(bz.o() == 2 ? 800 : bz.o() == 1 ? 400 : 100);
                    this.O = s1Var2;
                    s1Var2.P = i6Var;
                    s1Var2.Q = n6.Qk;
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
                v1 v1Var = new v1(this, context);
                this.J = v1Var;
                v1Var.setResizeMode(0);
                TextureView textureView = new TextureView(context);
                this.K = textureView;
                v1Var.addView(textureView);
                setWillNotDraw(false);
                addView(v1Var);
            }
        }
        zArr = null;
        if (i10 != 1) {
        }
        if (i10 != 1) {
        }
        this.d = true;
        v1 v1Var2 = new v1(this, context);
        this.J = v1Var2;
        v1Var2.setResizeMode(0);
        TextureView textureView2 = new TextureView(context);
        this.K = textureView2;
        v1Var2.addView(textureView2);
        setWillNotDraw(false);
        addView(v1Var2);
    }

    public final void a() {
        File file = this.e;
        if ((file != null && file.exists()) || bz.B0) {
            File file2 = this.e;
            if (file2 == null || !file2.exists()) {
                this.f = 0.671f;
            } else {
                if ((ks.e().p & 512) != 0) {
                    u1 u1Var = this.r;
                    if (u1Var != null) {
                        org.telegram.messenger.g0.r(u1Var);
                    }
                    u1 u1Var2 = new u1(this, 0);
                    this.r = u1Var2;
                    org.telegram.messenger.g0.h3(u1Var2, 300L);
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
        int i7 = this.s;
        if ((this.e != null || bz.B0) && this.I == null) {
            this.J.a(this.f, 0);
            hi.l0 l0Var = new hi.l0(this, 1);
            this.I = l0Var;
            TextureView textureView = this.K;
            l0Var.with(textureView);
            File file = this.e;
            if (file == null || !file.exists()) {
                try {
                    StringBuilder sb2 = new StringBuilder("?account=");
                    sb2.append(i7);
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
                    sb2.append(w7.G(i7).F(ri.d0(i7).E));
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
                this.n.R0();
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
                imageReceiver.Q();
            } else {
                imageReceiver.S();
            }
        }
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ks.Y1) {
            String str = (String) objArr[0];
            String str2 = this.h;
            if (str2 == null || !str2.equals(str)) {
                return;
            }
            this.e = (File) objArr[1];
            a();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0073, code lost:
    
        if (r9.length != (r5 + 1)) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00d4, code lost:
    
        if (r2[0].length == (r4 + 1)) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0560  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x058d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x05b0  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x05b8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x05cb  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x05e3  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x05c0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x056b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x04fa  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        long j3;
        float f13;
        int i7;
        int i10;
        m0 m0Var;
        int i11;
        int i12;
        ArrayList arrayList;
        int i13;
        int i14;
        long j10;
        boolean z10;
        j0.a aVar;
        fi.i0 i0Var;
        m0 m0Var2 = this.R;
        q1 q1Var = this.P;
        char c10 = 0;
        int i15 = 0;
        s1 s1Var = this.O;
        if (s1Var != null || q1Var != null || this.Q != null || m0Var2 != null) {
            if (this.H < 0.5f) {
                float f14 = 1.0f;
                float pow = (float) Math.pow(1.0f - r10, 2.0d);
                canvas.save();
                f10 = 0.9f;
                canvas.scale(pow, pow, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
                if (m0Var2 != null) {
                    Rect rect = (Rect) m0Var2.e;
                    int width = rect.width() / m0Var2.b;
                    int height = rect.height() / m0Var2.b;
                    if (width != 0 && height != 0) {
                        long currentTimeMillis = System.currentTimeMillis();
                        ArrayList[] arrayListArr = (ArrayList[]) m0Var2.f;
                        int i16 = 4;
                        if (arrayListArr != null) {
                            f12 = 150.0f;
                        } else {
                            f12 = 150.0f;
                        }
                        m0Var2.f = new ArrayList[width + 1];
                        int i17 = 0;
                        while (i17 <= width) {
                            ((ArrayList[]) m0Var2.f)[i17] = new ArrayList();
                            l0 l0Var = new l0();
                            g5.a aVar2 = Utilities.c;
                            l0Var.a = Math.abs(((int) aVar2.nextLong()) % height);
                            l0Var.c = currentTimeMillis;
                            l0Var.b = Math.abs(((int) aVar2.nextLong()) % 6) + 4;
                            ((ArrayList[]) m0Var2.f)[i17].add(l0Var);
                            i17++;
                            c10 = c10;
                        }
                        com.google.android.gms.internal.play_billing.h1[][] h1VarArr = (com.google.android.gms.internal.play_billing.h1[][]) m0Var2.g;
                        if (h1VarArr != null) {
                            j3 = 150;
                            if (h1VarArr.length == width + 1) {
                            }
                        } else {
                            j3 = 150;
                        }
                        m0Var2.g = new com.google.android.gms.internal.play_billing.h1[width + 1][];
                        for (int i18 = 0; i18 <= width; i18++) {
                            ((com.google.android.gms.internal.play_billing.h1[][]) m0Var2.g)[i18] = new com.google.android.gms.internal.play_billing.h1[height + 1];
                            int i19 = 0;
                            while (i19 <= height) {
                                com.google.android.gms.internal.play_billing.h1[][] h1VarArr2 = (com.google.android.gms.internal.play_billing.h1[][]) m0Var2.g;
                                com.google.android.gms.internal.play_billing.h1[] h1VarArr3 = h1VarArr2[i18];
                                com.google.android.gms.internal.play_billing.h1 h1Var = new com.google.android.gms.internal.play_billing.h1();
                                h1Var.d = m0Var2;
                                h1VarArr3[i19] = h1Var;
                                com.google.android.gms.internal.play_billing.h1 h1Var2 = h1VarArr2[i18][i19];
                                h1Var2.getClass();
                                g5.a aVar3 = Utilities.c;
                                h1Var2.a = Math.abs(((int) aVar3.nextLong()) % 16);
                                h1Var2.b = Math.abs(((int) aVar3.nextLong()) % 16);
                                h1Var2.c = Math.abs(((int) aVar3.nextLong()) % ks.X4) + currentTimeMillis + j3;
                                i19++;
                                f14 = f14;
                            }
                        }
                        float f15 = f14;
                        float f16 = 0.2f;
                        int i20 = 0;
                        while (i20 <= width) {
                            ArrayList arrayList2 = ((ArrayList[]) m0Var2.f)[i20];
                            int i21 = i15;
                            while (i21 < arrayList2.size()) {
                                l0 l0Var2 = (l0) arrayList2.get(i21);
                                if (currentTimeMillis - l0Var2.c > 50) {
                                    int i22 = l0Var2.a + 1;
                                    l0Var2.a = i22;
                                    l0Var2.c = currentTimeMillis;
                                    f13 = f16;
                                    if (i22 - l0Var2.b < height) {
                                        i14 = 1;
                                        j10 = currentTimeMillis;
                                    } else if (arrayList2.size() == 1) {
                                        l0Var2.a = i15;
                                        l0Var2.c = currentTimeMillis;
                                        i14 = 1;
                                        j10 = currentTimeMillis;
                                        l0Var2.b = Math.abs(((int) Utilities.c.nextLong()) % 6) + i16;
                                    } else {
                                        i14 = 1;
                                        j10 = currentTimeMillis;
                                        arrayList2.remove(l0Var2);
                                        i21--;
                                    }
                                    if (l0Var2.a > l0Var2.b && i21 == arrayList2.size() - i14) {
                                        g5.a aVar4 = Utilities.c;
                                        if (Math.abs(aVar4.nextInt(i16)) == 0) {
                                            l0 l0Var3 = new l0();
                                            l0Var3.a = i15;
                                            currentTimeMillis = j10;
                                            l0Var3.c = currentTimeMillis;
                                            i7 = i16;
                                            l0Var3.b = Math.abs(((int) aVar4.nextLong()) % 6) + 4;
                                            arrayList2.add(l0Var3);
                                        }
                                    }
                                    currentTimeMillis = j10;
                                    i7 = i16;
                                } else {
                                    f13 = f16;
                                    i7 = i16;
                                }
                                int min = Math.min(l0Var2.a, height + 1);
                                int max = Math.max(i15, l0Var2.a - l0Var2.b);
                                while (max < min) {
                                    int i23 = m0Var2.b;
                                    float f17 = i23 * i20;
                                    float f18 = i23 * max;
                                    if (((RectF) m0Var2.c).contains(f17, f18)) {
                                        i10 = i20;
                                        m0Var = m0Var2;
                                        i11 = height;
                                        i12 = width;
                                        arrayList = arrayList2;
                                        i13 = i21;
                                    } else {
                                        i10 = i20;
                                        i11 = height;
                                        float i24 = Utilities.i(((f15 - ((l0Var2.a - max) / (l0Var2.b - 1))) * 0.8f) + f13, f15, 0.0f);
                                        com.google.android.gms.internal.play_billing.h1 h1Var3 = ((com.google.android.gms.internal.play_billing.h1[][]) m0Var2.g)[i10][max];
                                        m0 m0Var3 = (m0) h1Var3.d;
                                        i12 = width;
                                        arrayList = arrayList2;
                                        long j11 = h1Var3.c - currentTimeMillis;
                                        m0Var = m0Var2;
                                        if (j11 < j3) {
                                            float i25 = Utilities.i(1.0f - (j11 / f12), 1.0f, 0.0f);
                                            Paint paint = (Paint) m0Var3.h;
                                            Bitmap[] bitmapArr = (Bitmap[]) m0Var3.d;
                                            i13 = i21;
                                            paint.setAlpha((int) f3.A(1.0f, i25, i24, 255.0f));
                                            canvas.drawBitmap(bitmapArr[h1Var3.a], f17, f18, paint);
                                            paint.setAlpha((int) (i24 * i25 * 255.0f));
                                            canvas.drawBitmap(bitmapArr[h1Var3.b], f17, f18, paint);
                                            paint.setAlpha(ks.e4);
                                            if (i25 >= 1.0f) {
                                                h1Var3.a = h1Var3.b;
                                                h1Var3.b = Math.abs(((int) Utilities.c.nextLong()) % 16);
                                                h1Var3.c = Math.abs(((int) r2.nextLong()) % ks.X4) + currentTimeMillis + j3;
                                            }
                                        } else {
                                            i13 = i21;
                                            ((Paint) m0Var3.h).setAlpha((int) (i24 * 255.0f));
                                            canvas.drawBitmap(((Bitmap[]) m0Var3.d)[h1Var3.a], f17, f18, (Paint) m0Var3.h);
                                        }
                                    }
                                    max++;
                                    i20 = i10;
                                    height = i11;
                                    width = i12;
                                    arrayList2 = arrayList;
                                    m0Var2 = m0Var;
                                    i21 = i13;
                                    f15 = 1.0f;
                                }
                                i21++;
                                f16 = f13;
                                i16 = i7;
                                i15 = 0;
                                f15 = 1.0f;
                            }
                            i20++;
                            i15 = 0;
                            f15 = 1.0f;
                        }
                    }
                } else {
                    float f19 = 2.0f;
                    if (s1Var != null) {
                        s1Var.d(canvas);
                    } else if (q1Var != null) {
                        Paint paint2 = q1Var.c;
                        if (this.I != null) {
                            float i26 = Utilities.i(r4.getCurrentPosition() / this.I.getDuration(), 1.0f, 0.0f);
                            float f20 = 1.0f / 9;
                            int i27 = (int) (i26 / f20);
                            int i28 = i27 + 1;
                            float w10 = e2.w(i27, f20, i26, f20);
                            float[] fArr = V;
                            f11 = i28 < 10 ? (fArr[i28] * w10) + ((1.0f - w10) * fArr[i27]) : fArr[i27];
                        } else {
                            f11 = 0.2f;
                        }
                        q1Var.f = (((1.0f - Utilities.i(this.H / 0.1f, 1.0f, 0.0f)) * 0.9f) + 0.1f) * 150.0f * f11;
                        ArrayList arrayList3 = q1Var.e;
                        int o4 = i0.a.o(n6.x0(null, n6.Qk, false), 80);
                        if (q1Var.i != o4) {
                            q1Var.i = o4;
                            paint2.setColor(o4);
                        }
                        long currentTimeMillis2 = System.currentTimeMillis();
                        for (int i29 = 0; i29 < arrayList3.size(); i29++) {
                            p1 p1Var = (p1) arrayList3.get(i29);
                            q1 q1Var2 = p1Var.g;
                            float[] fArr2 = q1Var2.d;
                            int i30 = i29 * 4;
                            float f21 = p1Var.a;
                            fArr2[i30] = f21;
                            fArr2[i30 + 1] = p1Var.b;
                            fArr2[i30 + 2] = (org.telegram.messenger.g0.L(30.0f) * p1Var.c) + f21;
                            fArr2[i30 + 3] = (org.telegram.messenger.g0.L(30.0f) * p1Var.d) + p1Var.b;
                            float L = org.telegram.messenger.g0.L(4.0f);
                            float f22 = q1Var2.j;
                            float f23 = (f22 / 660.0f) * L * q1Var2.f;
                            float f24 = (p1Var.c * f23) + p1Var.a;
                            p1Var.a = f24;
                            float f25 = (p1Var.d * f23) + p1Var.b;
                            p1Var.b = f25;
                            float f26 = p1Var.f;
                            if (f26 != 1.0f) {
                                float f27 = (f22 / 200.0f) + f26;
                                p1Var.f = f27;
                                if (f27 > 1.0f) {
                                    p1Var.f = 1.0f;
                                }
                            }
                            if (currentTimeMillis2 > p1Var.e || !q1Var.b.contains(f24, f25)) {
                                p1Var.a(currentTimeMillis2, false);
                            }
                        }
                        canvas.drawLines(q1Var.d, paint2);
                    } else {
                        org.telegram.ui.Cells.t0 t0Var = this.Q;
                        if (t0Var != null) {
                            ArrayList arrayList4 = t0Var.c;
                            System.currentTimeMillis();
                            int i31 = 0;
                            while (i31 < arrayList4.size()) {
                                k kVar = (k) arrayList4.get(i31);
                                org.telegram.ui.Cells.t0 t0Var2 = kVar.m;
                                Paint paint3 = (Paint) t0Var2.i;
                                float f28 = kVar.l;
                                if (f28 != 1.0f) {
                                    float f29 = (t0Var2.e / kVar.j) + f28;
                                    kVar.l = f29;
                                    if (f29 > 1.0f) {
                                        kVar.l = 1.0f;
                                    }
                                }
                                if (kVar.f != null) {
                                    canvas.save();
                                    float pow2 = 1.0f - (((float) Math.pow(kVar.l - 0.5f, 2.0d)) * 4.0f);
                                    float B = e2.B(pow2, 0.4f, 0.7f, kVar.k / t0Var2.b);
                                    float f30 = f19;
                                    m10.k(kVar.i, f30, kVar.c, kVar.b - (kVar.h / f19), canvas);
                                    canvas.scale(B, B, kVar.h / f30, kVar.i / f30);
                                    paint3.setAlpha((int) (kVar.d * pow2));
                                    canvas.drawBitmap(kVar.f, 0.0f, 0.0f, paint3);
                                    canvas.restore();
                                }
                                if (kVar.l >= 1.0f) {
                                    kVar.a(i31, false);
                                }
                                i31++;
                                f19 = 2.0f;
                            }
                        }
                    }
                }
                canvas.restore();
                invalidate();
                float min2 = (int) (Math.min(getMeasuredWidth(), getMeasuredHeight()) * f10);
                float measuredWidth = (getMeasuredWidth() - (0.671f * min2)) / 2.0f;
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
                i0Var = this.M;
                if (i0Var != null) {
                    i0Var.c = this.N;
                }
                ImageReceiver imageReceiver = this.n;
                if (z10) {
                    int i32 = (int) this.N;
                    imageReceiver.L0(i32, i32, 0, 0);
                } else {
                    int i33 = (int) this.N;
                    imageReceiver.L0(0, 0, i33, i33);
                }
                if (!this.G) {
                    imageReceiver.z0(rectF.left, rectF.top, rectF.width(), rectF.height());
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
        f10 = 0.9f;
        float min22 = (int) (Math.min(getMeasuredWidth(), getMeasuredHeight()) * f10);
        float measuredWidth2 = (getMeasuredWidth() - (0.671f * min22)) / 2.0f;
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
        i0Var = this.M;
        if (i0Var != null) {
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
        ks.f(this.s).c(this, ks.Y1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.y = false;
        c();
        ks.f(this.s).n(this, ks.Y1);
        org.telegram.ui.Cells.t0 t0Var = this.Q;
        if (t0Var != null) {
            HashMap hashMap = (HashMap) t0Var.f;
            Iterator it = hashMap.values().iterator();
            while (it.hasNext()) {
                ((Bitmap) it.next()).recycle();
            }
            hashMap.clear();
            this.Q = null;
        }
        hi.l0 l0Var = this.I;
        if (l0Var != null) {
            this.U = l0Var.getCurrentPosition();
            this.I.release(new cd0(27));
            this.I = null;
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
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
            m0 m0Var = this.R;
            if (m0Var != null) {
                RectF rectF = (RectF) m0Var.c;
                ((Rect) m0Var.e).set(0, 0, getMeasuredWidth(), getMeasuredHeight());
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
            org.telegram.ui.Cells.t0 t0Var = this.Q;
            if (t0Var != null) {
                ((RectF) t0Var.g).set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
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
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        float min = (int) (Math.min(size2, size) * 0.9f);
        float f10 = size;
        float f11 = (f10 - (0.671f * min)) / 2.0f;
        this.N = 0.0671f * min;
        v1 v1Var = this.J;
        v1Var.invalidateOutline();
        if (this.d) {
            org.telegram.messenger.g0.P.set(f11, 0.0f, f10 - f11, min);
        } else {
            float f12 = size2;
            org.telegram.messenger.g0.P.set(f11, f12 - min, f10 - f11, f12);
        }
        ViewGroup.LayoutParams layoutParams = v1Var.getLayoutParams();
        RectF rectF = org.telegram.messenger.g0.P;
        layoutParams.width = (int) rectF.width();
        v1Var.getLayoutParams().height = (int) rectF.height();
        ((ViewGroup.MarginLayoutParams) v1Var.getLayoutParams()).leftMargin = (int) rectF.left;
        ((ViewGroup.MarginLayoutParams) v1Var.getLayoutParams()).topMargin = (int) rectF.top;
        super.onMeasure(i7, i10);
    }

    @Override // ug.n0
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
                imageReceiver.Q0(false);
                b();
                return;
            }
            hi.l0 l0Var = this.I;
            if (l0Var != null) {
                this.U = l0Var.getCurrentPosition();
                this.I.release(new cd0(27));
                this.I = null;
            }
            imageReceiver.R0();
        }
    }
}
