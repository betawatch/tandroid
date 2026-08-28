package zf;

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
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.j2;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.lj0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class z1 extends FrameLayout implements l0, NotificationCenter.NotificationCenterDelegate {
    public static final float[] Q = {0.02f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.02f};
    public boolean A;
    public boolean B;
    public float C;
    public kh.d0 D;
    public final x1 E;
    public final TextureView F;
    public final j0.a G;
    public final org.telegram.ui.Components.voip.g H;
    public float I;
    public final v1 J;
    public final t1 K;
    public org.telegram.ui.Cells.u0 L;
    public final f2.b M;
    public final TLRPC.Document N;
    public int O;
    public long P;
    public final SvgHelper.SvgDrawable a;
    public final Paint b;
    public final Paint c;
    public final boolean d;
    public File e;
    public float f;
    public final String h;
    public final ImageReceiver n;
    public q1 r;
    public final int s;
    public final int v;
    public boolean w;
    public boolean x;
    public boolean y;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x018a  */
    /* JADX WARN: Type inference failed for: r9v16, types: [android.graphics.Bitmap[], java.io.Serializable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public z1(Context context, SvgHelper.SvgDrawable svgDrawable, int i9, int i10, b6 b6Var) {
        super(context);
        boolean[] zArr;
        Paint paint = new Paint(1);
        this.b = paint;
        Paint paint2 = new Paint(1);
        this.c = paint2;
        this.d = false;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.n = imageReceiver;
        this.s = i9;
        this.v = i10;
        this.a = svgDrawable;
        paint.setColor(-16777216);
        paint2.setColor(i0.a.d(0.5f, f6.v0(f6.Mj, b6Var), -16777216));
        imageReceiver.setLayerNum(ConnectionsManager.DEFAULT_DATACENTER_ID);
        TLRPC.TL_help_premiumPromo premiumPromo = MediaDataController.getInstance(i9).getPremiumPromo();
        String k02 = PremiumPreviewFragment.k0(i10);
        if (premiumPromo != null) {
            int i11 = 0;
            while (true) {
                if (i11 >= premiumPromo.video_sections.size()) {
                    i11 = -1;
                    break;
                } else if (premiumPromo.video_sections.get(i11).equals(k02)) {
                    break;
                } else {
                    i11++;
                }
            }
            if (i11 >= 0) {
                TLRPC.Document document = premiumPromo.videos.get(i11);
                y1 y1Var = null;
                for (int i12 = 0; i12 < document.thumbs.size(); i12++) {
                    if (document.thumbs.get(i12) instanceof TLRPC.TL_photoStrippedSize) {
                        this.G = new j0.a(getResources(), ImageLoader.getStrippedPhotoBitmap(document.thumbs.get(i12).bytes, "b"));
                        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
                        hVar.m = 4.0f;
                        hVar.g = 3.5f;
                        hVar.l = true;
                        SvgHelper.SvgDrawable svgDrawable2 = this.a;
                        hVar.o = this;
                        this.H = new org.telegram.ui.Components.voip.g(hVar, svgDrawable2);
                        y1Var = new y1(this, this.G, this.H);
                        y1Var.w = true;
                    }
                }
                this.h = FileLoader.getAttachFileName(document);
                zArr = null;
                this.n.setImage(null, null, y1Var, null, premiumPromo, 1);
                FileLoader.getInstance(this.s).loadFile(document, premiumPromo, 3, 0);
                this.N = document;
                Utilities.globalQueue.postRunnable(new xf.o0(11, this, document));
                if (i10 != 1) {
                    f2.b bVar = new f2.b(3);
                    bVar.c = new RectF();
                    ?? r92 = new Bitmap[16];
                    bVar.d = r92;
                    bVar.e = new Rect();
                    bVar.h = new Paint();
                    this.M = bVar;
                    bVar.b = AndroidUtilities.dp(16.0f);
                    TextPaint textPaint = new TextPaint(65);
                    textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
                    textPaint.setTextSize(bVar.b);
                    textPaint.setColor(i0.a.k(f6.w0(zArr, f6.Zj, false), 30));
                    textPaint.setTextAlign(Paint.Align.CENTER);
                    int i13 = 0;
                    while (i13 < 16) {
                        int i14 = i13 < 10 ? i13 + 48 : i13 + 55;
                        int i15 = bVar.b;
                        r92[i13] = Bitmap.createBitmap(i15, i15, Bitmap.Config.ARGB_8888);
                        new Canvas(r92[i13]).drawText(Character.toString((char) i14), r13 >> 1, bVar.b, textPaint);
                        i13++;
                    }
                } else if (i10 == 6 || i10 == 9 || i10 == 3 || i10 == 7 || i10 == 11 || i10 == 4 || i10 == 24 || i10 == 43) {
                    v1 v1Var = new v1(40);
                    this.J = v1Var;
                    v1Var.o = 3.0f;
                    v1Var.N = i10;
                    if (i10 == 3 || i10 == 24 || i10 == 43) {
                        v1Var.r = 14;
                        v1Var.s = 18;
                        v1Var.t = 18;
                    } else {
                        v1Var.r = 14;
                        v1Var.s = 16;
                        v1Var.t = 15;
                    }
                    if (i10 == 43) {
                        v1Var.G = true;
                    }
                    v1Var.w = 0.98f;
                    v1Var.v = 0.98f;
                    v1Var.u = 0.98f;
                    v1Var.o = 4.0f;
                    v1Var.O = b6Var;
                    v1Var.P = f6.Zj;
                    v1Var.c();
                } else if (i10 == 2) {
                    t1 t1Var = new t1();
                    this.K = t1Var;
                    ArrayList arrayList = t1Var.e;
                    if (arrayList.isEmpty()) {
                        for (int i16 = 0; i16 < t1Var.g; i16++) {
                            arrayList.add(new s1(t1Var));
                        }
                    }
                    int k10 = i0.a.k(f6.w0(zArr, f6.Zj, false), 80);
                    if (t1Var.i != k10) {
                        t1Var.i = k10;
                        t1Var.c.setColor(k10);
                    }
                } else if (i10 == 13) {
                    org.telegram.ui.Cells.u0 u0Var = new org.telegram.ui.Cells.u0();
                    this.L = u0Var;
                    ArrayList arrayList2 = u0Var.c;
                    if (arrayList2.isEmpty()) {
                        for (int i17 = 0; i17 < u0Var.d; i17++) {
                            arrayList2.add(new l(u0Var));
                        }
                    }
                } else {
                    v1 v1Var2 = new v1(SharedConfig.getDevicePerformanceClass() == 2 ? 800 : SharedConfig.getDevicePerformanceClass() == 1 ? 400 : 100);
                    this.J = v1Var2;
                    v1Var2.O = b6Var;
                    v1Var2.P = f6.Zj;
                    v1Var2.r = 4;
                    v1Var2.w = 0.98f;
                    v1Var2.v = 0.98f;
                    v1Var2.u = 0.98f;
                    v1Var2.G = true;
                    v1Var2.o = 4.0f;
                    v1Var2.H = true;
                    v1Var2.I = true;
                    v1Var2.K = true;
                    v1Var2.M = false;
                    v1Var2.c();
                }
                if (i10 != 1 || i10 == 3 || i10 == 11) {
                    this.d = true;
                }
                x1 x1Var = new x1(this, context);
                this.E = x1Var;
                x1Var.setResizeMode(0);
                TextureView textureView = new TextureView(context);
                this.F = textureView;
                x1Var.addView(textureView);
                setWillNotDraw(false);
                addView(x1Var);
            }
        }
        zArr = null;
        if (i10 != 1) {
        }
        if (i10 != 1) {
        }
        this.d = true;
        x1 x1Var2 = new x1(this, context);
        this.E = x1Var2;
        x1Var2.setResizeMode(0);
        TextureView textureView2 = new TextureView(context);
        this.F = textureView2;
        x1Var2.addView(textureView2);
        setWillNotDraw(false);
        addView(x1Var2);
    }

    public final void a() {
        File file = this.e;
        if ((file != null && file.exists()) || SharedConfig.streamMedia) {
            File file2 = this.e;
            if (file2 == null || !file2.exists()) {
                this.f = 0.671f;
            } else {
                if ((NotificationCenter.getGlobalInstance().getCurrentHeavyOperationFlags() & 512) != 0) {
                    q1 q1Var = this.r;
                    if (q1Var != null) {
                        AndroidUtilities.cancelRunOnUIThread(q1Var);
                    }
                    q1 q1Var2 = new q1(1, this);
                    this.r = q1Var2;
                    AndroidUtilities.runOnUIThread(q1Var2, 300L);
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
            if (this.A) {
                b();
            }
        }
        this.r = null;
    }

    public final void b() {
        Uri uri;
        int i9 = this.s;
        if ((this.e != null || SharedConfig.streamMedia) && this.D == null) {
            this.E.a(this.f, 0);
            kh.d0 d0Var = new kh.d0(this, 1);
            this.D = d0Var;
            TextureView textureView = this.F;
            d0Var.with(textureView);
            File file = this.e;
            if (file == null || !file.exists()) {
                try {
                    StringBuilder sb2 = new StringBuilder("?account=");
                    sb2.append(i9);
                    sb2.append("&id=");
                    sb2.append(this.N.id);
                    sb2.append("&hash=");
                    sb2.append(this.N.access_hash);
                    sb2.append("&dc=");
                    sb2.append(this.N.dc_id);
                    sb2.append("&size=");
                    sb2.append(this.N.size);
                    sb2.append("&mime=");
                    sb2.append(URLEncoder.encode(this.N.mime_type, "UTF-8"));
                    sb2.append("&rid=");
                    sb2.append(FileLoader.getInstance(i9).getFileReference(MediaDataController.getInstance(i9).getPremiumPromo()));
                    sb2.append("&name=");
                    sb2.append(URLEncoder.encode(FileLoader.getDocumentFileName(this.N), "UTF-8"));
                    sb2.append("&reference=");
                    byte[] bArr = this.N.file_reference;
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
            this.D.preparePlayer(uri, false, 1.0f);
            if (!this.B) {
                this.n.stopAnimation();
                textureView.setAlpha(0.0f);
            }
            this.D.seekTo(this.P + 60);
            this.D.play();
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
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.fileLoaded) {
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
    
        if (r10.length != (r8 + 1)) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00db, code lost:
    
        if (r2[0].length == (r4 + 1)) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x04be  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0531  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x055e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0581  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0589  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x059c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x05b3  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0591  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x053c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x04cb  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        float f13;
        int i9;
        f2.b bVar;
        int i10;
        int i11;
        ArrayList arrayList;
        int i12;
        boolean z10;
        j0.a aVar;
        org.telegram.ui.Components.voip.g gVar;
        f2.b bVar2 = this.M;
        t1 t1Var = this.K;
        int i13 = 0;
        v1 v1Var = this.J;
        if (v1Var != null || t1Var != null || this.L != null || bVar2 != null) {
            if (this.C < 0.5f) {
                float pow = (float) Math.pow(1.0f - r9, 2.0d);
                canvas.save();
                canvas.scale(pow, pow, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
                if (bVar2 != null) {
                    Rect rect = (Rect) bVar2.e;
                    int width = rect.width() / bVar2.b;
                    int height = rect.height() / bVar2.b;
                    if (width == 0 || height == 0) {
                        f10 = 0.9f;
                        f11 = 2.0f;
                    } else {
                        long currentTimeMillis = System.currentTimeMillis();
                        ArrayList[] arrayListArr = (ArrayList[]) bVar2.f;
                        int i14 = 4;
                        if (arrayListArr != null) {
                            f10 = 0.9f;
                        } else {
                            f10 = 0.9f;
                        }
                        bVar2.f = new ArrayList[width + 1];
                        for (int i15 = 0; i15 <= width; i15++) {
                            ((ArrayList[]) bVar2.f)[i15] = new ArrayList();
                            k0 k0Var = new k0();
                            k0Var.a = j2.e(Utilities.fastRandom, height);
                            k0Var.c = currentTimeMillis;
                            k0Var.b = Math.abs(Utilities.fastRandom.nextInt() % 6) + 4;
                            ((ArrayList[]) bVar2.f)[i15].add(k0Var);
                        }
                        f11 = 2.0f;
                        com.google.android.gms.internal.play_billing.h1[][] h1VarArr = (com.google.android.gms.internal.play_billing.h1[][]) bVar2.g;
                        int i16 = 16;
                        if (h1VarArr != null) {
                            f13 = 0.2f;
                            if (h1VarArr.length == width + 1) {
                            }
                        } else {
                            f13 = 0.2f;
                        }
                        bVar2.g = new com.google.android.gms.internal.play_billing.h1[width + 1][];
                        int i17 = 0;
                        while (i17 <= width) {
                            ((com.google.android.gms.internal.play_billing.h1[][]) bVar2.g)[i17] = new com.google.android.gms.internal.play_billing.h1[height + 1];
                            int i18 = 0;
                            while (i18 <= height) {
                                com.google.android.gms.internal.play_billing.h1[][] h1VarArr2 = (com.google.android.gms.internal.play_billing.h1[][]) bVar2.g;
                                com.google.android.gms.internal.play_billing.h1[] h1VarArr3 = h1VarArr2[i17];
                                com.google.android.gms.internal.play_billing.h1 h1Var = new com.google.android.gms.internal.play_billing.h1();
                                h1Var.d = bVar2;
                                h1VarArr3[i18] = h1Var;
                                com.google.android.gms.internal.play_billing.h1 h1Var2 = h1VarArr2[i17][i18];
                                h1Var2.getClass();
                                h1Var2.a = j2.e(Utilities.fastRandom, i16);
                                h1Var2.b = j2.e(Utilities.fastRandom, i16);
                                h1Var2.c = j2.e(Utilities.fastRandom, 300) + currentTimeMillis + 150;
                                i18++;
                                i16 = 16;
                            }
                            i17++;
                            i16 = 16;
                        }
                        float f14 = 1.0f;
                        int i19 = 0;
                        while (i19 <= width) {
                            ArrayList arrayList2 = ((ArrayList[]) bVar2.f)[i19];
                            int i20 = 0;
                            while (i20 < arrayList2.size()) {
                                k0 k0Var2 = (k0) arrayList2.get(i20);
                                if (currentTimeMillis - k0Var2.c > 50) {
                                    int i21 = k0Var2.a + 1;
                                    k0Var2.a = i21;
                                    k0Var2.c = currentTimeMillis;
                                    if (i21 - k0Var2.b >= height) {
                                        if (arrayList2.size() == 1) {
                                            k0Var2.a = i13;
                                            k0Var2.c = currentTimeMillis;
                                            k0Var2.b = Math.abs(Utilities.fastRandom.nextInt() % 6) + i14;
                                        } else {
                                            arrayList2.remove(k0Var2);
                                            i20--;
                                        }
                                    }
                                    if (k0Var2.a > k0Var2.b && i20 == arrayList2.size() - 1 && Math.abs(Utilities.fastRandom.nextInt(i14)) == 0) {
                                        k0 k0Var3 = new k0();
                                        k0Var3.a = i13;
                                        k0Var3.c = currentTimeMillis;
                                        k0Var3.b = Math.abs(Utilities.fastRandom.nextInt() % 6) + i14;
                                        arrayList2.add(k0Var3);
                                    }
                                }
                                int min = Math.min(k0Var2.a, height + 1);
                                int max = Math.max(i13, k0Var2.a - k0Var2.b);
                                while (max < min) {
                                    int i22 = bVar2.b;
                                    float f15 = i22 * i19;
                                    float f16 = i22 * max;
                                    if (((RectF) bVar2.c).contains(f15, f16)) {
                                        i9 = i19;
                                        bVar = bVar2;
                                        i10 = height;
                                        i11 = max;
                                        arrayList = arrayList2;
                                        i12 = width;
                                    } else {
                                        i9 = i19;
                                        i10 = height;
                                        float clamp = Utilities.clamp(((f14 - ((k0Var2.a - max) / (k0Var2.b - 1))) * 0.8f) + f13, 1.0f, 0.0f);
                                        com.google.android.gms.internal.play_billing.h1 h1Var3 = ((com.google.android.gms.internal.play_billing.h1[][]) bVar2.g)[i9][max];
                                        f2.b bVar3 = (f2.b) h1Var3.d;
                                        i11 = max;
                                        arrayList = arrayList2;
                                        long j10 = h1Var3.c - currentTimeMillis;
                                        bVar = bVar2;
                                        if (j10 < 150) {
                                            float clamp2 = Utilities.clamp(1.0f - (j10 / 150.0f), 1.0f, 0.0f);
                                            Paint paint = (Paint) bVar3.h;
                                            Bitmap[] bitmapArr = (Bitmap[]) bVar3.d;
                                            i12 = width;
                                            paint.setAlpha((int) org.telegram.messenger.l0.y(1.0f, clamp2, clamp, 255.0f));
                                            canvas.drawBitmap(bitmapArr[h1Var3.a], f15, f16, paint);
                                            paint.setAlpha((int) (clamp * clamp2 * 255.0f));
                                            canvas.drawBitmap(bitmapArr[h1Var3.b], f15, f16, paint);
                                            paint.setAlpha(255);
                                            if (clamp2 >= 1.0f) {
                                                h1Var3.a = h1Var3.b;
                                                h1Var3.b = j2.e(Utilities.fastRandom, 16);
                                                h1Var3.c = j2.e(Utilities.fastRandom, 300) + currentTimeMillis + 150;
                                            }
                                        } else {
                                            i12 = width;
                                            ((Paint) bVar3.h).setAlpha((int) (clamp * 255.0f));
                                            canvas.drawBitmap(((Bitmap[]) bVar3.d)[h1Var3.a], f15, f16, (Paint) bVar3.h);
                                        }
                                        max = i11 + 1;
                                        i19 = i9;
                                        height = i10;
                                        arrayList2 = arrayList;
                                        bVar2 = bVar;
                                        width = i12;
                                        f14 = 1.0f;
                                    }
                                    max = i11 + 1;
                                    i19 = i9;
                                    height = i10;
                                    arrayList2 = arrayList;
                                    bVar2 = bVar;
                                    width = i12;
                                    f14 = 1.0f;
                                }
                                i20++;
                                bVar2 = bVar2;
                                i13 = 0;
                                i14 = 4;
                                f14 = 1.0f;
                            }
                            i19++;
                            bVar2 = bVar2;
                            i13 = 0;
                            i14 = 4;
                            f14 = 1.0f;
                        }
                    }
                } else {
                    f10 = 0.9f;
                    f11 = 2.0f;
                    if (v1Var != null) {
                        v1Var.d(canvas);
                    } else if (t1Var != null) {
                        if (this.D != null) {
                            float clamp3 = Utilities.clamp(r3.getCurrentPosition() / this.D.getDuration(), 1.0f, 0.0f);
                            float f17 = 1.0f / 9;
                            int i23 = (int) (clamp3 / f17);
                            int i24 = i23 + 1;
                            float d = e2.c.d(i23, f17, clamp3, f17);
                            float[] fArr = Q;
                            f12 = i24 < 10 ? (fArr[i24] * d) + ((1.0f - d) * fArr[i23]) : fArr[i23];
                        } else {
                            f12 = 0.2f;
                        }
                        t1Var.f = (((1.0f - Utilities.clamp(this.C / 0.1f, 1.0f, 0.0f)) * 0.9f) + 0.1f) * 150.0f * f12;
                        ArrayList arrayList3 = t1Var.e;
                        long currentTimeMillis2 = System.currentTimeMillis();
                        for (int i25 = 0; i25 < arrayList3.size(); i25++) {
                            s1 s1Var = (s1) arrayList3.get(i25);
                            t1 t1Var2 = s1Var.g;
                            float[] fArr2 = t1Var2.d;
                            int i26 = i25 * 4;
                            float f18 = s1Var.a;
                            fArr2[i26] = f18;
                            fArr2[i26 + 1] = s1Var.b;
                            fArr2[i26 + 2] = (AndroidUtilities.dp(30.0f) * s1Var.c) + f18;
                            fArr2[i26 + 3] = (AndroidUtilities.dp(30.0f) * s1Var.d) + s1Var.b;
                            float dp = AndroidUtilities.dp(4.0f);
                            float f19 = t1Var2.j;
                            float f20 = (f19 / 660.0f) * dp * t1Var2.f;
                            float f21 = (s1Var.c * f20) + s1Var.a;
                            s1Var.a = f21;
                            float f22 = (s1Var.d * f20) + s1Var.b;
                            s1Var.b = f22;
                            float f23 = s1Var.f;
                            if (f23 != 1.0f) {
                                float f24 = (f19 / 200.0f) + f23;
                                s1Var.f = f24;
                                if (f24 > 1.0f) {
                                    s1Var.f = 1.0f;
                                }
                            }
                            if (currentTimeMillis2 > s1Var.e || !t1Var.b.contains(f21, f22)) {
                                s1Var.a(currentTimeMillis2, false);
                            }
                        }
                        canvas.drawLines(t1Var.d, t1Var.c);
                    } else {
                        org.telegram.ui.Cells.u0 u0Var = this.L;
                        if (u0Var != null) {
                            ArrayList arrayList4 = u0Var.c;
                            System.currentTimeMillis();
                            for (int i27 = 0; i27 < arrayList4.size(); i27++) {
                                l lVar = (l) arrayList4.get(i27);
                                org.telegram.ui.Cells.u0 u0Var2 = lVar.m;
                                Paint paint2 = (Paint) u0Var2.i;
                                float f25 = lVar.l;
                                if (f25 != 1.0f) {
                                    float f26 = (u0Var2.e / lVar.j) + f25;
                                    lVar.l = f26;
                                    if (f26 > 1.0f) {
                                        lVar.l = 1.0f;
                                    }
                                }
                                if (lVar.f != null) {
                                    canvas.save();
                                    float pow2 = 1.0f - (((float) Math.pow(lVar.l - 0.5f, 2.0d)) * 4.0f);
                                    float B = e2.c.B(pow2, 0.4f, 0.7f, lVar.k / u0Var2.b);
                                    canvas.translate(lVar.b - (lVar.h / 2.0f), lVar.c - (lVar.i / 2.0f));
                                    canvas.scale(B, B, lVar.h / 2.0f, lVar.i / 2.0f);
                                    paint2.setAlpha((int) (lVar.d * pow2));
                                    canvas.drawBitmap(lVar.f, 0.0f, 0.0f, paint2);
                                    canvas.restore();
                                }
                                if (lVar.l >= 1.0f) {
                                    lVar.a(i27, false);
                                }
                            }
                        }
                    }
                }
                canvas.restore();
                invalidate();
                float min2 = (int) (Math.min(getMeasuredWidth(), getMeasuredHeight()) * f10);
                float measuredWidth = (getMeasuredWidth() - (0.671f * min2)) / f11;
                float f27 = 0.0671f * min2;
                this.I = f27;
                z10 = this.d;
                if (z10) {
                    AndroidUtilities.rectTmp.set(measuredWidth, getMeasuredHeight() - min2, getMeasuredWidth() - measuredWidth, getMeasuredHeight() + this.I);
                } else {
                    AndroidUtilities.rectTmp.set(measuredWidth, -f27, getMeasuredWidth() - measuredWidth, min2);
                }
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.inset(-AndroidUtilities.dp(3.0f), -AndroidUtilities.dp(3.0f));
                rectF.inset(-AndroidUtilities.dp(3.0f), -AndroidUtilities.dp(3.0f));
                canvas.drawRoundRect(rectF, this.I + AndroidUtilities.dp(3.0f), this.I + AndroidUtilities.dp(3.0f), this.c);
                rectF.inset(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
                float f28 = this.I;
                Paint paint3 = this.b;
                canvas.drawRoundRect(rectF, f28, f28, paint3);
                if (z10) {
                    rectF.set(measuredWidth, getMeasuredHeight() - min2, getMeasuredWidth() - measuredWidth, getMeasuredHeight());
                } else {
                    rectF.set(measuredWidth, 0.0f, getMeasuredWidth() - measuredWidth, min2);
                }
                float dp2 = this.I - AndroidUtilities.dp(3.0f);
                this.I = dp2;
                aVar = this.G;
                if (aVar != null) {
                    Paint paint4 = aVar.d;
                    if (aVar.g != dp2) {
                        if (dp2 > 0.05f) {
                            paint4.setShader(aVar.e);
                        } else {
                            paint4.setShader(null);
                        }
                        aVar.g = dp2;
                        aVar.invalidateSelf();
                    }
                }
                gVar = this.H;
                if (gVar != null) {
                    gVar.a = this.I;
                }
                ImageReceiver imageReceiver = this.n;
                if (z10) {
                    int i28 = (int) this.I;
                    imageReceiver.setRoundRadius(i28, i28, 0, 0);
                } else {
                    int i29 = (int) this.I;
                    imageReceiver.setRoundRadius(0, 0, i29, i29);
                }
                if (!this.B) {
                    imageReceiver.setImageCoords(rectF.left, rectF.top, rectF.width(), rectF.height());
                    imageReceiver.draw(canvas);
                }
                super.dispatchDraw(canvas);
                if (z10) {
                    canvas.drawCircle(imageReceiver.getCenterX(), imageReceiver.getImageY() + AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), paint3);
                    return;
                }
                return;
            }
        }
        f10 = 0.9f;
        f11 = 2.0f;
        float min22 = (int) (Math.min(getMeasuredWidth(), getMeasuredHeight()) * f10);
        float measuredWidth2 = (getMeasuredWidth() - (0.671f * min22)) / f11;
        float f272 = 0.0671f * min22;
        this.I = f272;
        z10 = this.d;
        if (z10) {
        }
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.inset(-AndroidUtilities.dp(3.0f), -AndroidUtilities.dp(3.0f));
        rectF2.inset(-AndroidUtilities.dp(3.0f), -AndroidUtilities.dp(3.0f));
        canvas.drawRoundRect(rectF2, this.I + AndroidUtilities.dp(3.0f), this.I + AndroidUtilities.dp(3.0f), this.c);
        rectF2.inset(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        float f282 = this.I;
        Paint paint32 = this.b;
        canvas.drawRoundRect(rectF2, f282, f282, paint32);
        if (z10) {
        }
        float dp22 = this.I - AndroidUtilities.dp(3.0f);
        this.I = dp22;
        aVar = this.G;
        if (aVar != null) {
        }
        gVar = this.H;
        if (gVar != null) {
        }
        ImageReceiver imageReceiver2 = this.n;
        if (z10) {
        }
        if (!this.B) {
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
        if (!this.B) {
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
        org.telegram.ui.Cells.u0 u0Var = this.L;
        if (u0Var != null) {
            HashMap hashMap = (HashMap) u0Var.f;
            Iterator it = hashMap.values().iterator();
            while (it.hasNext()) {
                ((Bitmap) it.next()).recycle();
            }
            hashMap.clear();
            this.L = null;
        }
        kh.d0 d0Var = this.D;
        if (d0Var != null) {
            this.P = d0Var.getCurrentPosition();
            this.D.release(new lj0(20));
            this.D = null;
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        int measuredWidth = getMeasuredWidth() << (getMeasuredHeight() + 16);
        float min = (int) (Math.min(getMeasuredWidth(), getMeasuredHeight()) * 0.9f);
        float measuredWidth2 = (getMeasuredWidth() - (0.671f * min)) / 2.0f;
        if (this.d) {
            AndroidUtilities.rectTmp.set(measuredWidth2, -this.I, getMeasuredWidth() - measuredWidth2, min);
        } else {
            AndroidUtilities.rectTmp.set(measuredWidth2, getMeasuredHeight() - min, getMeasuredWidth() - measuredWidth2, getMeasuredHeight() + this.I);
        }
        if (this.O != measuredWidth) {
            this.O = measuredWidth;
            f2.b bVar = this.M;
            if (bVar != null) {
                RectF rectF = (RectF) bVar.c;
                ((Rect) bVar.e).set(0, 0, getMeasuredWidth(), getMeasuredHeight());
                rectF.set(AndroidUtilities.rectTmp);
                rectF.inset(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
            }
            v1 v1Var = this.J;
            if (v1Var != null) {
                RectF rectF2 = v1Var.c;
                RectF rectF3 = v1Var.a;
                int i13 = this.v;
                if (i13 == 6 || i13 == 9 || i13 == 3 || i13 == 7 || i13 == 24 || i13 == 43 || i13 == 11 || i13 == 4) {
                    rectF3.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    rectF3.inset(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f));
                } else {
                    RectF rectF4 = AndroidUtilities.rectTmp;
                    float width = (int) (rectF4.width() * 0.4f);
                    rectF3.set(rectF4.centerX() - width, rectF4.centerY() - width, rectF4.centerX() + width, rectF4.centerY() + width);
                    v1Var.b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                }
                v1Var.f();
                rectF2.set(AndroidUtilities.rectTmp);
                rectF2.inset(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
            }
            t1 t1Var = this.K;
            if (t1Var != null) {
                RectF rectF5 = t1Var.a;
                rectF5.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                t1Var.b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                rectF5.inset(AndroidUtilities.dp(100.0f), AndroidUtilities.dp(100.0f));
                rectF5.offset(0.0f, getMeasuredHeight() * 0.1f);
                ArrayList arrayList = t1Var.e;
                long currentTimeMillis = System.currentTimeMillis();
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    ((s1) arrayList.get(i14)).a(currentTimeMillis, true);
                }
            }
            org.telegram.ui.Cells.u0 u0Var = this.L;
            if (u0Var != null) {
                ((RectF) u0Var.g).set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((RectF) this.L.h).set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((RectF) this.L.g).inset(AndroidUtilities.dp(0.0f), getMeasuredHeight() * 0.1f);
                ArrayList arrayList2 = this.L.c;
                System.currentTimeMillis();
                for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                    ((l) arrayList2.get(i15)).a(i15, true);
                }
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        int size = View.MeasureSpec.getSize(i9);
        int size2 = View.MeasureSpec.getSize(i10);
        float min = (int) (Math.min(size2, size) * 0.9f);
        float f10 = size;
        float f11 = (f10 - (0.671f * min)) / 2.0f;
        this.I = 0.0671f * min;
        x1 x1Var = this.E;
        x1Var.invalidateOutline();
        if (this.d) {
            AndroidUtilities.rectTmp.set(f11, 0.0f, f10 - f11, min);
        } else {
            float f12 = size2;
            AndroidUtilities.rectTmp.set(f11, f12 - min, f10 - f11, f12);
        }
        ViewGroup.LayoutParams layoutParams = x1Var.getLayoutParams();
        RectF rectF = AndroidUtilities.rectTmp;
        layoutParams.width = (int) rectF.width();
        x1Var.getLayoutParams().height = (int) rectF.height();
        ((ViewGroup.MarginLayoutParams) x1Var.getLayoutParams()).leftMargin = (int) rectF.left;
        ((ViewGroup.MarginLayoutParams) x1Var.getLayoutParams()).topMargin = (int) rectF.top;
        super.onMeasure(i9, i10);
    }

    @Override // zf.l0
    public void setOffset(float f10) {
        boolean z10;
        boolean z11 = this.d;
        if (f10 < 0.0f) {
            float measuredWidth = (-f10) / getMeasuredWidth();
            setAlpha((Utilities.clamp(1.0f - measuredWidth, 1.0f, 0.0f) * 0.5f) + 0.5f);
            setRotationY(50.0f * measuredWidth);
            invalidate();
            if (z11) {
                setTranslationY((-getMeasuredHeight()) * 0.3f * measuredWidth);
            } else {
                setTranslationY(getMeasuredHeight() * 0.3f * measuredWidth);
            }
            this.C = Math.abs(measuredWidth);
            z10 = measuredWidth < 1.0f;
            if (measuredWidth < 0.1f) {
                r2 = true;
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
            r2 = measuredWidth2 > -0.1f;
            this.C = Math.abs(measuredWidth2);
        }
        if (z10 != this.w) {
            this.w = z10;
            c();
        }
        if (r2 != this.A) {
            this.A = r2;
            ImageReceiver imageReceiver = this.n;
            imageReceiver.setAllowStartAnimation(r2);
            if (this.A) {
                imageReceiver.startAnimation();
                b();
                return;
            }
            kh.d0 d0Var = this.D;
            if (d0Var != null) {
                this.P = d0Var.getCurrentPosition();
                this.D.release(new lj0(20));
                this.D = null;
            }
            imageReceiver.stopAnimation();
        }
    }
}
