package tg;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.d3;
import org.telegram.ui.u90;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class a2 extends FrameLayout implements l0, NotificationCenter.NotificationCenterDelegate {
    public static final float[] U = {0.02f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.02f};
    public boolean E;
    public boolean F;
    public float G;
    public fi.c0 H;
    public final y1 I;
    public final TextureView J;
    public final j0.a K;
    public final org.telegram.ui.Components.voip.g L;
    public float M;
    public final w1 N;
    public final u1 O;
    public org.telegram.ui.Cells.t0 P;
    public final s4.b Q;
    public final TLRPC.Document R;
    public int S;
    public long T;
    public final SvgHelper.SvgDrawable a;
    public final Paint b;
    public final Paint c;
    public final boolean d;
    public File e;
    public float f;
    public final String h;
    public final ImageReceiver n;
    public org.telegram.ui.web.h1 r;
    public final int s;
    public final int v;
    public boolean w;
    public boolean x;
    public boolean y;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0189  */
    /* JADX WARN: Type inference failed for: r9v16, types: [android.graphics.Bitmap[], java.io.Serializable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a2(Context context, SvgHelper.SvgDrawable svgDrawable, int i10, int i11, u6 u6Var) {
        super(context);
        boolean[] zArr;
        Paint paint = new Paint(1);
        this.b = paint;
        Paint paint2 = new Paint(1);
        this.c = paint2;
        this.d = false;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.n = imageReceiver;
        this.s = i10;
        this.v = i11;
        this.a = svgDrawable;
        paint.setColor(-16777216);
        paint2.setColor(i0.a.f(0.5f, y6.w0(y6.Mj, u6Var), -16777216));
        imageReceiver.setLayerNum(ConnectionsManager.DEFAULT_DATACENTER_ID);
        TLRPC.TL_help_premiumPromo premiumPromo = MediaDataController.getInstance(i10).getPremiumPromo();
        String m0 = PremiumPreviewFragment.m0(i11);
        if (premiumPromo != null) {
            int i12 = 0;
            while (true) {
                if (i12 >= premiumPromo.video_sections.size()) {
                    i12 = -1;
                    break;
                } else if (premiumPromo.video_sections.get(i12).equals(m0)) {
                    break;
                } else {
                    i12++;
                }
            }
            if (i12 >= 0) {
                TLRPC.Document document = premiumPromo.videos.get(i12);
                z1 z1Var = null;
                for (int i13 = 0; i13 < document.thumbs.size(); i13++) {
                    if (document.thumbs.get(i13) instanceof TLRPC.TL_photoStrippedSize) {
                        this.K = new j0.a(getResources(), ImageLoader.getStrippedPhotoBitmap(document.thumbs.get(i13).bytes, "b"));
                        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
                        hVar.m = 4.0f;
                        hVar.g = 3.5f;
                        hVar.l = true;
                        SvgHelper.SvgDrawable svgDrawable2 = this.a;
                        hVar.o = this;
                        this.L = new org.telegram.ui.Components.voip.g(hVar, svgDrawable2);
                        z1Var = new z1(this, this.K, this.L);
                        z1Var.w = true;
                    }
                }
                this.h = FileLoader.getAttachFileName(document);
                zArr = null;
                this.n.setImage(null, null, z1Var, null, premiumPromo, 1);
                FileLoader.getInstance(this.s).loadFile(document, premiumPromo, 3, 0);
                this.R = document;
                Utilities.globalQueue.postRunnable(new sg.u(7, this, document));
                if (i11 != 1) {
                    s4.b bVar = new s4.b(2);
                    bVar.c = new RectF();
                    ?? r92 = new Bitmap[16];
                    bVar.d = r92;
                    bVar.e = new Rect();
                    bVar.h = new Paint();
                    this.Q = bVar;
                    bVar.b = AndroidUtilities.dp(16.0f);
                    TextPaint textPaint = new TextPaint(65);
                    textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
                    textPaint.setTextSize(bVar.b);
                    textPaint.setColor(i0.a.o(y6.x0(zArr, y6.Zj, false), 30));
                    textPaint.setTextAlign(Paint.Align.CENTER);
                    int i14 = 0;
                    while (i14 < 16) {
                        int i15 = i14 < 10 ? i14 + 48 : i14 + 55;
                        int i16 = bVar.b;
                        r92[i14] = Bitmap.createBitmap(i16, i16, Bitmap.Config.ARGB_8888);
                        new Canvas(r92[i14]).drawText(Character.toString((char) i15), r13 >> 1, bVar.b, textPaint);
                        i14++;
                    }
                } else if (i11 == 6 || i11 == 9 || i11 == 3 || i11 == 7 || i11 == 11 || i11 == 4 || i11 == 24 || i11 == 43) {
                    w1 w1Var = new w1(40);
                    this.N = w1Var;
                    w1Var.o = 3.0f;
                    w1Var.O = i11;
                    if (i11 == 3 || i11 == 24 || i11 == 43) {
                        w1Var.r = 14;
                        w1Var.s = 18;
                        w1Var.t = 18;
                    } else {
                        w1Var.r = 14;
                        w1Var.s = 16;
                        w1Var.t = 15;
                    }
                    if (i11 == 43) {
                        w1Var.G = true;
                    }
                    w1Var.w = 0.98f;
                    w1Var.v = 0.98f;
                    w1Var.u = 0.98f;
                    w1Var.o = 4.0f;
                    w1Var.P = u6Var;
                    w1Var.Q = y6.Zj;
                    w1Var.c();
                } else if (i11 == 2) {
                    u1 u1Var = new u1();
                    this.O = u1Var;
                    ArrayList arrayList = u1Var.e;
                    if (arrayList.isEmpty()) {
                        for (int i17 = 0; i17 < u1Var.g; i17++) {
                            arrayList.add(new t1(u1Var));
                        }
                    }
                    int o10 = i0.a.o(y6.x0(zArr, y6.Zj, false), 80);
                    if (u1Var.i != o10) {
                        u1Var.i = o10;
                        u1Var.c.setColor(o10);
                    }
                } else if (i11 == 13) {
                    org.telegram.ui.Cells.t0 t0Var = new org.telegram.ui.Cells.t0();
                    this.P = t0Var;
                    ArrayList arrayList2 = t0Var.c;
                    if (arrayList2.isEmpty()) {
                        for (int i18 = 0; i18 < t0Var.d; i18++) {
                            arrayList2.add(new l(t0Var));
                        }
                    }
                } else {
                    w1 w1Var2 = new w1(SharedConfig.getDevicePerformanceClass() == 2 ? 800 : SharedConfig.getDevicePerformanceClass() == 1 ? 400 : 100);
                    this.N = w1Var2;
                    w1Var2.P = u6Var;
                    w1Var2.Q = y6.Zj;
                    w1Var2.r = 4;
                    w1Var2.w = 0.98f;
                    w1Var2.v = 0.98f;
                    w1Var2.u = 0.98f;
                    w1Var2.G = true;
                    w1Var2.o = 4.0f;
                    w1Var2.H = true;
                    w1Var2.I = true;
                    w1Var2.K = true;
                    w1Var2.M = false;
                    w1Var2.c();
                }
                if (i11 != 1 || i11 == 3 || i11 == 11) {
                    this.d = true;
                }
                y1 y1Var = new y1(this, context);
                this.I = y1Var;
                y1Var.setResizeMode(0);
                TextureView textureView = new TextureView(context);
                this.J = textureView;
                y1Var.addView(textureView);
                setWillNotDraw(false);
                addView(y1Var);
            }
        }
        zArr = null;
        if (i11 != 1) {
        }
        if (i11 != 1) {
        }
        this.d = true;
        y1 y1Var2 = new y1(this, context);
        this.I = y1Var2;
        y1Var2.setResizeMode(0);
        TextureView textureView2 = new TextureView(context);
        this.J = textureView2;
        y1Var2.addView(textureView2);
        setWillNotDraw(false);
        addView(y1Var2);
    }

    public final void a() {
        File file = this.e;
        if ((file != null && file.exists()) || SharedConfig.streamMedia) {
            File file2 = this.e;
            if (file2 == null || !file2.exists()) {
                this.f = 0.671f;
            } else {
                if ((NotificationCenter.getGlobalInstance().getCurrentHeavyOperationFlags() & 512) != 0) {
                    org.telegram.ui.web.h1 h1Var = this.r;
                    if (h1Var != null) {
                        AndroidUtilities.cancelRunOnUIThread(h1Var);
                    }
                    org.telegram.ui.web.h1 h1Var2 = new org.telegram.ui.web.h1(this, 29);
                    this.r = h1Var2;
                    AndroidUtilities.runOnUIThread(h1Var2, 300L);
                    return;
                }
                try {
                    MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                    mediaMetadataRetriever.setDataSource(ApplicationLoader.applicationContext, Uri.fromFile(this.e));
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
        int i10 = this.s;
        if ((this.e != null || SharedConfig.streamMedia) && this.H == null) {
            this.I.a(this.f, 0);
            fi.c0 c0Var = new fi.c0(this, 1);
            this.H = c0Var;
            TextureView textureView = this.J;
            c0Var.with(textureView);
            File file = this.e;
            if (file == null || !file.exists()) {
                try {
                    StringBuilder sb2 = new StringBuilder("?account=");
                    sb2.append(i10);
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
                    sb2.append(FileLoader.getInstance(i10).getFileReference(MediaDataController.getInstance(i10).getPremiumPromo()));
                    sb2.append("&name=");
                    sb2.append(URLEncoder.encode(FileLoader.getDocumentFileName(this.R), "UTF-8"));
                    sb2.append("&reference=");
                    byte[] bArr = this.R.file_reference;
                    if (bArr == null) {
                        bArr = new byte[0];
                    }
                    sb2.append(Utilities.bytesToHex(bArr));
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
                this.n.stopAnimation();
                textureView.setAlpha(0.0f);
            }
            this.H.seekTo(this.T + 60);
            this.H.play();
        }
    }

    public final void c() {
        boolean z10 = this.w && this.x;
        if (this.y != z10) {
            this.y = z10;
            ImageReceiver imageReceiver = this.n;
            if (z10) {
                imageReceiver.onAttachedToWindow();
            } else {
                imageReceiver.onDetachedFromWindow();
            }
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.fileLoaded) {
            String str = (String) objArr[0];
            String str2 = this.h;
            if (str2 == null || !str2.equals(str)) {
                return;
            }
            this.e = (File) objArr[1];
            a();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0078, code lost:
    
        if (r5.length != (r3 + 1)) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0535  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0562  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0585  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x058d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x05a0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x05b7  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0595  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x04cf  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        float f10;
        float f11;
        float f12;
        int i10;
        int i11;
        s4.b bVar;
        int i12;
        int i13;
        ArrayList arrayList;
        boolean z10;
        j0.a aVar;
        org.telegram.ui.Components.voip.g gVar;
        s4.b bVar2 = this.Q;
        u1 u1Var = this.O;
        int i14 = 0;
        w1 w1Var = this.N;
        if (w1Var != null || u1Var != null || this.P != null || bVar2 != null) {
            if (this.G < 0.5f) {
                float f13 = 1.0f;
                float pow = (float) Math.pow(1.0f - r10, 2.0d);
                canvas.save();
                f7 = 2.0f;
                canvas.scale(pow, pow, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
                if (bVar2 != null) {
                    Rect rect = (Rect) bVar2.e;
                    int width = rect.width() / bVar2.b;
                    int height = rect.height() / bVar2.b;
                    if (width == 0 || height == 0) {
                        f10 = 0.9f;
                    } else {
                        long currentTimeMillis = System.currentTimeMillis();
                        ArrayList[] arrayListArr = (ArrayList[]) bVar2.f;
                        int i15 = 4;
                        if (arrayListArr != null) {
                            f12 = 150.0f;
                        } else {
                            f12 = 150.0f;
                        }
                        bVar2.f = new ArrayList[width + 1];
                        for (int i16 = 0; i16 <= width; i16++) {
                            ((ArrayList[]) bVar2.f)[i16] = new ArrayList();
                            k0 k0Var = new k0();
                            k0Var.a = d3.j(Utilities.fastRandom, height);
                            k0Var.c = currentTimeMillis;
                            k0Var.b = Math.abs(Utilities.fastRandom.nextInt() % 6) + 4;
                            ((ArrayList[]) bVar2.f)[i16].add(k0Var);
                        }
                        com.google.android.gms.internal.play_billing.h1[][] h1VarArr = (com.google.android.gms.internal.play_billing.h1[][]) bVar2.g;
                        char c10 = 300;
                        int i17 = 16;
                        f10 = 0.9f;
                        if (h1VarArr == null || h1VarArr.length != width + 1 || h1VarArr[0].length != height + 1) {
                            bVar2.g = new com.google.android.gms.internal.play_billing.h1[width + 1][];
                            int i18 = 0;
                            while (i18 <= width) {
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
                                    h1Var2.a = d3.j(Utilities.fastRandom, i17);
                                    h1Var2.b = d3.j(Utilities.fastRandom, i17);
                                    h1Var2.c = d3.j(Utilities.fastRandom, 300) + currentTimeMillis + 150;
                                    i19++;
                                    i17 = 16;
                                }
                                i18++;
                                i17 = 16;
                            }
                        }
                        int i20 = 0;
                        while (i20 <= width) {
                            ArrayList arrayList2 = ((ArrayList[]) bVar2.f)[i20];
                            int i21 = i14;
                            while (i21 < arrayList2.size()) {
                                k0 k0Var2 = (k0) arrayList2.get(i21);
                                float f14 = f13;
                                int i22 = i21;
                                boolean z11 = true;
                                if (currentTimeMillis - k0Var2.c > 50) {
                                    int i23 = k0Var2.a + 1;
                                    k0Var2.a = i23;
                                    k0Var2.c = currentTimeMillis;
                                    if (i23 - k0Var2.b >= height) {
                                        if (arrayList2.size() == 1) {
                                            k0Var2.a = i14;
                                            k0Var2.c = currentTimeMillis;
                                            k0Var2.b = Math.abs(Utilities.fastRandom.nextInt() % 6) + i15;
                                        } else {
                                            arrayList2.remove(k0Var2);
                                            i22--;
                                        }
                                    }
                                    if (k0Var2.a > k0Var2.b && i22 == arrayList2.size() - 1 && Math.abs(Utilities.fastRandom.nextInt(i15)) == 0) {
                                        k0 k0Var3 = new k0();
                                        k0Var3.a = i14;
                                        k0Var3.c = currentTimeMillis;
                                        k0Var3.b = Math.abs(Utilities.fastRandom.nextInt() % 6) + i15;
                                        arrayList2.add(k0Var3);
                                    }
                                }
                                int min = Math.min(k0Var2.a, height + 1);
                                int max = Math.max(i14, k0Var2.a - k0Var2.b);
                                while (max < min) {
                                    int i24 = bVar2.b;
                                    boolean z12 = z11;
                                    float f15 = i24 * i20;
                                    float f16 = i24 * max;
                                    if (((RectF) bVar2.c).contains(f15, f16)) {
                                        i10 = height;
                                        i11 = width;
                                        bVar = bVar2;
                                        i12 = i20;
                                        i13 = min;
                                        arrayList = arrayList2;
                                    } else {
                                        i10 = height;
                                        i11 = width;
                                        float clamp = Utilities.clamp(((f14 - ((k0Var2.a - max) / (k0Var2.b - 1))) * 0.8f) + 0.2f, f14, 0.0f);
                                        com.google.android.gms.internal.play_billing.h1 h1Var3 = ((com.google.android.gms.internal.play_billing.h1[][]) bVar2.g)[i20][max];
                                        s4.b bVar3 = (s4.b) h1Var3.d;
                                        bVar = bVar2;
                                        i12 = i20;
                                        long j10 = h1Var3.c - currentTimeMillis;
                                        i13 = min;
                                        if (j10 < 150) {
                                            float clamp2 = Utilities.clamp(1.0f - (j10 / f12), 1.0f, 0.0f);
                                            Paint paint = (Paint) bVar3.h;
                                            Bitmap[] bitmapArr = (Bitmap[]) bVar3.d;
                                            arrayList = arrayList2;
                                            paint.setAlpha((int) org.telegram.messenger.t.A(1.0f, clamp2, clamp, 255.0f));
                                            canvas.drawBitmap(bitmapArr[h1Var3.a], f15, f16, paint);
                                            paint.setAlpha((int) (clamp * clamp2 * 255.0f));
                                            canvas.drawBitmap(bitmapArr[h1Var3.b], f15, f16, paint);
                                            paint.setAlpha(255);
                                            if (clamp2 >= 1.0f) {
                                                h1Var3.a = h1Var3.b;
                                                h1Var3.b = d3.j(Utilities.fastRandom, 16);
                                                h1Var3.c = d3.j(Utilities.fastRandom, 300) + currentTimeMillis + 150;
                                            }
                                        } else {
                                            arrayList = arrayList2;
                                            ((Paint) bVar3.h).setAlpha((int) (clamp * 255.0f));
                                            canvas.drawBitmap(((Bitmap[]) bVar3.d)[h1Var3.a], f15, f16, (Paint) bVar3.h);
                                        }
                                        max++;
                                        z11 = z12;
                                        height = i10;
                                        width = i11;
                                        bVar2 = bVar;
                                        i20 = i12;
                                        min = i13;
                                        arrayList2 = arrayList;
                                        f14 = 1.0f;
                                    }
                                    max++;
                                    z11 = z12;
                                    height = i10;
                                    width = i11;
                                    bVar2 = bVar;
                                    i20 = i12;
                                    min = i13;
                                    arrayList2 = arrayList;
                                    f14 = 1.0f;
                                }
                                i21 = i22 + 1;
                                c10 = 300;
                                bVar2 = bVar2;
                                i20 = i20;
                                i14 = 0;
                                i15 = 4;
                                f13 = 1.0f;
                            }
                            bVar2 = bVar2;
                            i14 = 0;
                            i15 = 4;
                            f13 = 1.0f;
                            i20++;
                            height = height;
                        }
                    }
                } else {
                    f10 = 0.9f;
                    if (w1Var != null) {
                        w1Var.d(canvas);
                    } else if (u1Var != null) {
                        Paint paint2 = u1Var.c;
                        if (this.H != null) {
                            float clamp3 = Utilities.clamp(r3.getCurrentPosition() / this.H.getDuration(), 1.0f, 0.0f);
                            float f17 = 1.0f / 9;
                            int i25 = (int) (clamp3 / f17);
                            int i26 = i25 + 1;
                            float f18 = c3.h0.f(i25, f17, clamp3, f17);
                            float[] fArr = U;
                            f11 = i26 < 10 ? (fArr[i26] * f18) + ((1.0f - f18) * fArr[i25]) : fArr[i25];
                        } else {
                            f11 = 0.2f;
                        }
                        u1Var.f = (((1.0f - Utilities.clamp(this.G / 0.1f, 1.0f, 0.0f)) * 0.9f) + 0.1f) * 150.0f * f11;
                        ArrayList arrayList3 = u1Var.e;
                        int o10 = i0.a.o(y6.x0(null, y6.Zj, false), 80);
                        if (u1Var.i != o10) {
                            u1Var.i = o10;
                            paint2.setColor(o10);
                        }
                        long currentTimeMillis2 = System.currentTimeMillis();
                        for (int i27 = 0; i27 < arrayList3.size(); i27++) {
                            t1 t1Var = (t1) arrayList3.get(i27);
                            u1 u1Var2 = t1Var.g;
                            float[] fArr2 = u1Var2.d;
                            int i28 = i27 * 4;
                            float f19 = t1Var.a;
                            fArr2[i28] = f19;
                            fArr2[i28 + 1] = t1Var.b;
                            fArr2[i28 + 2] = (AndroidUtilities.dp(30.0f) * t1Var.c) + f19;
                            fArr2[i28 + 3] = (AndroidUtilities.dp(30.0f) * t1Var.d) + t1Var.b;
                            float dp = AndroidUtilities.dp(4.0f);
                            float f20 = u1Var2.j;
                            float f21 = (f20 / 660.0f) * dp * u1Var2.f;
                            float f22 = (t1Var.c * f21) + t1Var.a;
                            t1Var.a = f22;
                            float f23 = (t1Var.d * f21) + t1Var.b;
                            t1Var.b = f23;
                            float f24 = t1Var.f;
                            if (f24 != 1.0f) {
                                float f25 = (f20 / 200.0f) + f24;
                                t1Var.f = f25;
                                if (f25 > 1.0f) {
                                    t1Var.f = 1.0f;
                                }
                            }
                            if (currentTimeMillis2 > t1Var.e || !u1Var.b.contains(f22, f23)) {
                                t1Var.a(currentTimeMillis2, false);
                            }
                        }
                        canvas.drawLines(u1Var.d, paint2);
                    } else {
                        org.telegram.ui.Cells.t0 t0Var = this.P;
                        if (t0Var != null) {
                            ArrayList arrayList4 = t0Var.c;
                            System.currentTimeMillis();
                            for (int i29 = 0; i29 < arrayList4.size(); i29++) {
                                l lVar = (l) arrayList4.get(i29);
                                org.telegram.ui.Cells.t0 t0Var2 = lVar.m;
                                Paint paint3 = (Paint) t0Var2.i;
                                float f26 = lVar.l;
                                if (f26 != 1.0f) {
                                    float f27 = (t0Var2.e / lVar.j) + f26;
                                    lVar.l = f27;
                                    if (f27 > 1.0f) {
                                        lVar.l = 1.0f;
                                    }
                                }
                                if (lVar.f != null) {
                                    canvas.save();
                                    float pow2 = 1.0f - (((float) Math.pow(lVar.l - 0.5f, 2.0d)) * 4.0f);
                                    float C = c3.h0.C(pow2, 0.4f, 0.7f, lVar.k / t0Var2.b);
                                    canvas.translate(lVar.b - (lVar.h / 2.0f), lVar.c - (lVar.i / 2.0f));
                                    canvas.scale(C, C, lVar.h / 2.0f, lVar.i / 2.0f);
                                    paint3.setAlpha((int) (lVar.d * pow2));
                                    canvas.drawBitmap(lVar.f, 0.0f, 0.0f, paint3);
                                    canvas.restore();
                                }
                                if (lVar.l >= 1.0f) {
                                    lVar.a(i29, false);
                                }
                            }
                        }
                    }
                }
                canvas.restore();
                invalidate();
                float min2 = (int) (Math.min(getMeasuredWidth(), getMeasuredHeight()) * f10);
                float measuredWidth = (getMeasuredWidth() - (0.671f * min2)) / f7;
                float f28 = 0.0671f * min2;
                this.M = f28;
                z10 = this.d;
                if (z10) {
                    AndroidUtilities.rectTmp.set(measuredWidth, getMeasuredHeight() - min2, getMeasuredWidth() - measuredWidth, getMeasuredHeight() + this.M);
                } else {
                    AndroidUtilities.rectTmp.set(measuredWidth, -f28, getMeasuredWidth() - measuredWidth, min2);
                }
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.inset(-AndroidUtilities.dp(3.0f), -AndroidUtilities.dp(3.0f));
                rectF.inset(-AndroidUtilities.dp(3.0f), -AndroidUtilities.dp(3.0f));
                canvas.drawRoundRect(rectF, this.M + AndroidUtilities.dp(3.0f), this.M + AndroidUtilities.dp(3.0f), this.c);
                rectF.inset(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
                float f29 = this.M;
                Paint paint4 = this.b;
                canvas.drawRoundRect(rectF, f29, f29, paint4);
                if (z10) {
                    rectF.set(measuredWidth, getMeasuredHeight() - min2, getMeasuredWidth() - measuredWidth, getMeasuredHeight());
                } else {
                    rectF.set(measuredWidth, 0.0f, getMeasuredWidth() - measuredWidth, min2);
                }
                float dp2 = this.M - AndroidUtilities.dp(3.0f);
                this.M = dp2;
                aVar = this.K;
                if (aVar != null) {
                    Paint paint5 = aVar.d;
                    if (aVar.g != dp2) {
                        if (dp2 > 0.05f) {
                            paint5.setShader(aVar.e);
                        } else {
                            paint5.setShader(null);
                        }
                        aVar.g = dp2;
                        aVar.invalidateSelf();
                    }
                }
                gVar = this.L;
                if (gVar != null) {
                    gVar.a = this.M;
                }
                ImageReceiver imageReceiver = this.n;
                if (z10) {
                    int i30 = (int) this.M;
                    imageReceiver.setRoundRadius(i30, i30, 0, 0);
                } else {
                    int i31 = (int) this.M;
                    imageReceiver.setRoundRadius(0, 0, i31, i31);
                }
                if (!this.F) {
                    imageReceiver.setImageCoords(rectF.left, rectF.top, rectF.width(), rectF.height());
                    imageReceiver.draw(canvas);
                }
                super.dispatchDraw(canvas);
                if (z10) {
                    canvas.drawCircle(imageReceiver.getCenterX(), imageReceiver.getImageY() + AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), paint4);
                    return;
                }
                return;
            }
        }
        f7 = 2.0f;
        f10 = 0.9f;
        float min22 = (int) (Math.min(getMeasuredWidth(), getMeasuredHeight()) * f10);
        float measuredWidth2 = (getMeasuredWidth() - (0.671f * min22)) / f7;
        float f282 = 0.0671f * min22;
        this.M = f282;
        z10 = this.d;
        if (z10) {
        }
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.inset(-AndroidUtilities.dp(3.0f), -AndroidUtilities.dp(3.0f));
        rectF2.inset(-AndroidUtilities.dp(3.0f), -AndroidUtilities.dp(3.0f));
        canvas.drawRoundRect(rectF2, this.M + AndroidUtilities.dp(3.0f), this.M + AndroidUtilities.dp(3.0f), this.c);
        rectF2.inset(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        float f292 = this.M;
        Paint paint42 = this.b;
        canvas.drawRoundRect(rectF2, f292, f292, paint42);
        if (z10) {
        }
        float dp22 = this.M - AndroidUtilities.dp(3.0f);
        this.M = dp22;
        aVar = this.K;
        if (aVar != null) {
        }
        gVar = this.L;
        if (gVar != null) {
        }
        ImageReceiver imageReceiver2 = this.n;
        if (z10) {
        }
        if (!this.F) {
        }
        super.dispatchDraw(canvas);
        if (z10) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.x = true;
        c();
        if (!this.F) {
            a();
        }
        NotificationCenter.getInstance(this.s).addObserver(this, NotificationCenter.fileLoaded);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.x = false;
        c();
        NotificationCenter.getInstance(this.s).removeObserver(this, NotificationCenter.fileLoaded);
        org.telegram.ui.Cells.t0 t0Var = this.P;
        if (t0Var != null) {
            HashMap hashMap = (HashMap) t0Var.f;
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
            this.H.release(new u90(24));
            this.H = null;
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int measuredWidth = getMeasuredWidth() << (getMeasuredHeight() + 16);
        float min = (int) (Math.min(getMeasuredWidth(), getMeasuredHeight()) * 0.9f);
        float measuredWidth2 = (getMeasuredWidth() - (0.671f * min)) / 2.0f;
        if (this.d) {
            AndroidUtilities.rectTmp.set(measuredWidth2, -this.M, getMeasuredWidth() - measuredWidth2, min);
        } else {
            AndroidUtilities.rectTmp.set(measuredWidth2, getMeasuredHeight() - min, getMeasuredWidth() - measuredWidth2, getMeasuredHeight() + this.M);
        }
        if (this.S != measuredWidth) {
            this.S = measuredWidth;
            s4.b bVar = this.Q;
            if (bVar != null) {
                RectF rectF = (RectF) bVar.c;
                ((Rect) bVar.e).set(0, 0, getMeasuredWidth(), getMeasuredHeight());
                rectF.set(AndroidUtilities.rectTmp);
                rectF.inset(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
            }
            w1 w1Var = this.N;
            if (w1Var != null) {
                RectF rectF2 = w1Var.c;
                RectF rectF3 = w1Var.a;
                int i14 = this.v;
                if (i14 == 6 || i14 == 9 || i14 == 3 || i14 == 7 || i14 == 24 || i14 == 43 || i14 == 11 || i14 == 4) {
                    rectF3.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    rectF3.inset(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f));
                } else {
                    RectF rectF4 = AndroidUtilities.rectTmp;
                    float width = (int) (rectF4.width() * 0.4f);
                    rectF3.set(rectF4.centerX() - width, rectF4.centerY() - width, rectF4.centerX() + width, rectF4.centerY() + width);
                    w1Var.b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                }
                w1Var.f();
                rectF2.set(AndroidUtilities.rectTmp);
                rectF2.inset(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
            }
            u1 u1Var = this.O;
            if (u1Var != null) {
                RectF rectF5 = u1Var.a;
                rectF5.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                u1Var.b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                rectF5.inset(AndroidUtilities.dp(100.0f), AndroidUtilities.dp(100.0f));
                rectF5.offset(0.0f, getMeasuredHeight() * 0.1f);
                ArrayList arrayList = u1Var.e;
                long currentTimeMillis = System.currentTimeMillis();
                for (int i15 = 0; i15 < arrayList.size(); i15++) {
                    ((t1) arrayList.get(i15)).a(currentTimeMillis, true);
                }
            }
            org.telegram.ui.Cells.t0 t0Var = this.P;
            if (t0Var != null) {
                ((RectF) t0Var.g).set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((RectF) this.P.h).set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((RectF) this.P.g).inset(AndroidUtilities.dp(0.0f), getMeasuredHeight() * 0.1f);
                ArrayList arrayList2 = this.P.c;
                System.currentTimeMillis();
                for (int i16 = 0; i16 < arrayList2.size(); i16++) {
                    ((l) arrayList2.get(i16)).a(i16, true);
                }
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        float min = (int) (Math.min(size2, size) * 0.9f);
        float f7 = size;
        float f10 = (f7 - (0.671f * min)) / 2.0f;
        this.M = 0.0671f * min;
        y1 y1Var = this.I;
        y1Var.invalidateOutline();
        if (this.d) {
            AndroidUtilities.rectTmp.set(f10, 0.0f, f7 - f10, min);
        } else {
            float f11 = size2;
            AndroidUtilities.rectTmp.set(f10, f11 - min, f7 - f10, f11);
        }
        ViewGroup.LayoutParams layoutParams = y1Var.getLayoutParams();
        RectF rectF = AndroidUtilities.rectTmp;
        layoutParams.width = (int) rectF.width();
        y1Var.getLayoutParams().height = (int) rectF.height();
        ((ViewGroup.MarginLayoutParams) y1Var.getLayoutParams()).leftMargin = (int) rectF.left;
        ((ViewGroup.MarginLayoutParams) y1Var.getLayoutParams()).topMargin = (int) rectF.top;
        super.onMeasure(i10, i11);
    }

    @Override // tg.l0
    public void setOffset(float f7) {
        boolean z10;
        boolean z11 = this.d;
        if (f7 < 0.0f) {
            float measuredWidth = (-f7) / getMeasuredWidth();
            setAlpha((Utilities.clamp(1.0f - measuredWidth, 1.0f, 0.0f) * 0.5f) + 0.5f);
            setRotationY(50.0f * measuredWidth);
            invalidate();
            if (z11) {
                setTranslationY((-getMeasuredHeight()) * 0.3f * measuredWidth);
            } else {
                setTranslationY(getMeasuredHeight() * 0.3f * measuredWidth);
            }
            this.G = Math.abs(measuredWidth);
            z10 = measuredWidth < 1.0f;
            if (measuredWidth < 0.1f) {
                r4 = true;
            }
        } else {
            float measuredWidth2 = (-f7) / getMeasuredWidth();
            invalidate();
            setRotationY(50.0f * measuredWidth2);
            if (z11) {
                setTranslationY(getMeasuredHeight() * 0.3f * measuredWidth2);
            } else {
                setTranslationY((-getMeasuredHeight()) * 0.3f * measuredWidth2);
            }
            z10 = measuredWidth2 > -1.0f;
            r4 = measuredWidth2 > -0.1f;
            this.G = Math.abs(measuredWidth2);
        }
        if (z10 != this.w) {
            this.w = z10;
            c();
        }
        if (r4 != this.E) {
            this.E = r4;
            ImageReceiver imageReceiver = this.n;
            imageReceiver.setAllowStartAnimation(r4);
            if (this.E) {
                imageReceiver.startAnimation();
                b();
                return;
            }
            fi.c0 c0Var = this.H;
            if (c0Var != null) {
                this.T = c0Var.getCurrentPosition();
                this.H.release(new u90(24));
                this.H = null;
            }
            imageReceiver.stopAnimation();
        }
    }
}
