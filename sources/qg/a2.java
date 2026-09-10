package qg;

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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.r6;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class a2 extends FrameLayout implements n0, NotificationCenter.NotificationCenterDelegate {
    public static final float[] U = {0.02f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.02f};
    public boolean E;
    public boolean F;
    public float G;
    public bi.h0 H;
    public final y1 I;
    public final TextureView J;
    public final j0.a K;
    public final org.telegram.ui.Components.voip.g L;
    public float M;
    public final w1 N;
    public final u1 O;
    public org.telegram.ui.Cells.u0 P;
    public final m0 Q;
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
    public q0 r;
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
    public a2(Context context, SvgHelper.SvgDrawable svgDrawable, int i10, int i11, f6 f6Var) {
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
        paint2.setColor(i0.a.d(0.5f, j6.v0(j6.Mj, f6Var), -16777216));
        imageReceiver.setLayerNum(ConnectionsManager.DEFAULT_DATACENTER_ID);
        TLRPC.TL_help_premiumPromo premiumPromo = MediaDataController.getInstance(i10).getPremiumPromo();
        String l02 = PremiumPreviewFragment.l0(i11);
        if (premiumPromo != null) {
            int i12 = 0;
            while (true) {
                if (i12 >= premiumPromo.video_sections.size()) {
                    i12 = -1;
                    break;
                } else if (premiumPromo.video_sections.get(i12).equals(l02)) {
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
                Utilities.globalQueue.postRunnable(new org.telegram.ui.web.x1(11, this, document));
                if (i11 != 1) {
                    m0 m0Var = new m0(0);
                    m0Var.c = new RectF();
                    ?? r92 = new Bitmap[16];
                    m0Var.d = r92;
                    m0Var.e = new Rect();
                    m0Var.h = new Paint();
                    this.Q = m0Var;
                    m0Var.b = AndroidUtilities.dp(16.0f);
                    TextPaint textPaint = new TextPaint(65);
                    textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
                    textPaint.setTextSize(m0Var.b);
                    textPaint.setColor(i0.a.k(j6.w0(zArr, j6.Zj, false), 30));
                    textPaint.setTextAlign(Paint.Align.CENTER);
                    int i14 = 0;
                    while (i14 < 16) {
                        int i15 = i14 < 10 ? i14 + 48 : i14 + 55;
                        int i16 = m0Var.b;
                        r92[i14] = Bitmap.createBitmap(i16, i16, Bitmap.Config.ARGB_8888);
                        new Canvas(r92[i14]).drawText(Character.toString((char) i15), r13 >> 1, m0Var.b, textPaint);
                        i14++;
                    }
                } else if (i11 == 6 || i11 == 9 || i11 == 3 || i11 == 7 || i11 == 11 || i11 == 4 || i11 == 24 || i11 == 43) {
                    w1 w1Var = new w1(40);
                    this.N = w1Var;
                    w1Var.o = 3.0f;
                    w1Var.N = i11;
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
                    w1Var.O = f6Var;
                    w1Var.P = j6.Zj;
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
                    int k10 = i0.a.k(j6.w0(zArr, j6.Zj, false), 80);
                    if (u1Var.i != k10) {
                        u1Var.i = k10;
                        u1Var.c.setColor(k10);
                    }
                } else if (i11 == 13) {
                    org.telegram.ui.Cells.u0 u0Var = new org.telegram.ui.Cells.u0();
                    this.P = u0Var;
                    ArrayList arrayList2 = u0Var.c;
                    if (arrayList2.isEmpty()) {
                        for (int i18 = 0; i18 < u0Var.d; i18++) {
                            arrayList2.add(new l(u0Var));
                        }
                    }
                } else {
                    w1 w1Var2 = new w1(SharedConfig.getDevicePerformanceClass() == 2 ? 800 : SharedConfig.getDevicePerformanceClass() == 1 ? 400 : 100);
                    this.N = w1Var2;
                    w1Var2.O = f6Var;
                    w1Var2.P = j6.Zj;
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
                    q0 q0Var = this.r;
                    if (q0Var != null) {
                        AndroidUtilities.cancelRunOnUIThread(q0Var);
                    }
                    q0 q0Var2 = new q0(this, 4);
                    this.r = q0Var2;
                    AndroidUtilities.runOnUIThread(q0Var2, 300L);
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
            bi.h0 h0Var = new bi.h0(this, 1);
            this.H = h0Var;
            TextureView textureView = this.J;
            h0Var.with(textureView);
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
        float f7;
        float f10;
        float f11;
        float f12;
        int i10;
        m0 m0Var;
        int i11;
        int i12;
        ArrayList arrayList;
        int i13;
        boolean z10;
        j0.a aVar;
        org.telegram.ui.Components.voip.g gVar;
        m0 m0Var2 = this.Q;
        u1 u1Var = this.O;
        int i14 = 0;
        w1 w1Var = this.N;
        if (w1Var != null || u1Var != null || this.P != null || m0Var2 != null) {
            if (this.G < 0.5f) {
                float pow = (float) Math.pow(1.0f - r9, 2.0d);
                canvas.save();
                canvas.scale(pow, pow, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
                if (m0Var2 != null) {
                    Rect rect = (Rect) m0Var2.e;
                    int width = rect.width() / m0Var2.b;
                    int height = rect.height() / m0Var2.b;
                    if (width == 0 || height == 0) {
                        f7 = 0.9f;
                        f10 = 2.0f;
                    } else {
                        long currentTimeMillis = System.currentTimeMillis();
                        ArrayList[] arrayListArr = (ArrayList[]) m0Var2.f;
                        int i15 = 4;
                        if (arrayListArr != null) {
                            f7 = 0.9f;
                        } else {
                            f7 = 0.9f;
                        }
                        m0Var2.f = new ArrayList[width + 1];
                        for (int i16 = 0; i16 <= width; i16++) {
                            ((ArrayList[]) m0Var2.f)[i16] = new ArrayList();
                            l0 l0Var = new l0();
                            l0Var.a = r6.c(Utilities.fastRandom, height);
                            l0Var.c = currentTimeMillis;
                            l0Var.b = Math.abs(Utilities.fastRandom.nextInt() % 6) + 4;
                            ((ArrayList[]) m0Var2.f)[i16].add(l0Var);
                        }
                        f10 = 2.0f;
                        com.google.android.gms.internal.play_billing.h1[][] h1VarArr = (com.google.android.gms.internal.play_billing.h1[][]) m0Var2.g;
                        int i17 = 16;
                        if (h1VarArr != null) {
                            f12 = 0.2f;
                            if (h1VarArr.length == width + 1) {
                            }
                        } else {
                            f12 = 0.2f;
                        }
                        m0Var2.g = new com.google.android.gms.internal.play_billing.h1[width + 1][];
                        int i18 = 0;
                        while (i18 <= width) {
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
                                h1Var2.a = r6.c(Utilities.fastRandom, i17);
                                h1Var2.b = r6.c(Utilities.fastRandom, i17);
                                h1Var2.c = r6.c(Utilities.fastRandom, 300) + currentTimeMillis + 150;
                                i19++;
                                i17 = 16;
                            }
                            i18++;
                            i17 = 16;
                        }
                        float f13 = 1.0f;
                        int i20 = 0;
                        while (i20 <= width) {
                            ArrayList arrayList2 = ((ArrayList[]) m0Var2.f)[i20];
                            int i21 = 0;
                            while (i21 < arrayList2.size()) {
                                l0 l0Var2 = (l0) arrayList2.get(i21);
                                if (currentTimeMillis - l0Var2.c > 50) {
                                    int i22 = l0Var2.a + 1;
                                    l0Var2.a = i22;
                                    l0Var2.c = currentTimeMillis;
                                    if (i22 - l0Var2.b >= height) {
                                        if (arrayList2.size() == 1) {
                                            l0Var2.a = i14;
                                            l0Var2.c = currentTimeMillis;
                                            l0Var2.b = Math.abs(Utilities.fastRandom.nextInt() % 6) + i15;
                                        } else {
                                            arrayList2.remove(l0Var2);
                                            i21--;
                                        }
                                    }
                                    if (l0Var2.a > l0Var2.b && i21 == arrayList2.size() - 1 && Math.abs(Utilities.fastRandom.nextInt(i15)) == 0) {
                                        l0 l0Var3 = new l0();
                                        l0Var3.a = i14;
                                        l0Var3.c = currentTimeMillis;
                                        l0Var3.b = Math.abs(Utilities.fastRandom.nextInt() % 6) + i15;
                                        arrayList2.add(l0Var3);
                                    }
                                }
                                int min = Math.min(l0Var2.a, height + 1);
                                int max = Math.max(i14, l0Var2.a - l0Var2.b);
                                while (max < min) {
                                    int i23 = m0Var2.b;
                                    float f14 = i23 * i20;
                                    float f15 = i23 * max;
                                    if (((RectF) m0Var2.c).contains(f14, f15)) {
                                        i10 = i20;
                                        m0Var = m0Var2;
                                        i11 = height;
                                        i12 = max;
                                        arrayList = arrayList2;
                                        i13 = width;
                                    } else {
                                        i10 = i20;
                                        i11 = height;
                                        float clamp = Utilities.clamp(((f13 - ((l0Var2.a - max) / (l0Var2.b - 1))) * 0.8f) + f12, 1.0f, 0.0f);
                                        com.google.android.gms.internal.play_billing.h1 h1Var3 = ((com.google.android.gms.internal.play_billing.h1[][]) m0Var2.g)[i10][max];
                                        m0 m0Var3 = (m0) h1Var3.d;
                                        i12 = max;
                                        arrayList = arrayList2;
                                        long j3 = h1Var3.c - currentTimeMillis;
                                        m0Var = m0Var2;
                                        if (j3 < 150) {
                                            float clamp2 = Utilities.clamp(1.0f - (j3 / 150.0f), 1.0f, 0.0f);
                                            Paint paint = (Paint) m0Var3.h;
                                            Bitmap[] bitmapArr = (Bitmap[]) m0Var3.d;
                                            i13 = width;
                                            paint.setAlpha((int) org.telegram.messenger.a2.A(1.0f, clamp2, clamp, 255.0f));
                                            canvas.drawBitmap(bitmapArr[h1Var3.a], f14, f15, paint);
                                            paint.setAlpha((int) (clamp * clamp2 * 255.0f));
                                            canvas.drawBitmap(bitmapArr[h1Var3.b], f14, f15, paint);
                                            paint.setAlpha(255);
                                            if (clamp2 >= 1.0f) {
                                                h1Var3.a = h1Var3.b;
                                                h1Var3.b = r6.c(Utilities.fastRandom, 16);
                                                h1Var3.c = r6.c(Utilities.fastRandom, 300) + currentTimeMillis + 150;
                                            }
                                        } else {
                                            i13 = width;
                                            ((Paint) m0Var3.h).setAlpha((int) (clamp * 255.0f));
                                            canvas.drawBitmap(((Bitmap[]) m0Var3.d)[h1Var3.a], f14, f15, (Paint) m0Var3.h);
                                        }
                                        max = i12 + 1;
                                        i20 = i10;
                                        height = i11;
                                        arrayList2 = arrayList;
                                        m0Var2 = m0Var;
                                        width = i13;
                                        f13 = 1.0f;
                                    }
                                    max = i12 + 1;
                                    i20 = i10;
                                    height = i11;
                                    arrayList2 = arrayList;
                                    m0Var2 = m0Var;
                                    width = i13;
                                    f13 = 1.0f;
                                }
                                i21++;
                                m0Var2 = m0Var2;
                                i14 = 0;
                                i15 = 4;
                                f13 = 1.0f;
                            }
                            i20++;
                            m0Var2 = m0Var2;
                            i14 = 0;
                            i15 = 4;
                            f13 = 1.0f;
                        }
                    }
                } else {
                    f7 = 0.9f;
                    f10 = 2.0f;
                    if (w1Var != null) {
                        w1Var.d(canvas);
                    } else if (u1Var != null) {
                        if (this.H != null) {
                            float clamp3 = Utilities.clamp(r3.getCurrentPosition() / this.H.getDuration(), 1.0f, 0.0f);
                            float f16 = 1.0f / 9;
                            int i24 = (int) (clamp3 / f16);
                            int i25 = i24 + 1;
                            float v = e2.v(i24, f16, clamp3, f16);
                            float[] fArr = U;
                            f11 = i25 < 10 ? (fArr[i25] * v) + ((1.0f - v) * fArr[i24]) : fArr[i24];
                        } else {
                            f11 = 0.2f;
                        }
                        u1Var.f = (((1.0f - Utilities.clamp(this.G / 0.1f, 1.0f, 0.0f)) * 0.9f) + 0.1f) * 150.0f * f11;
                        ArrayList arrayList3 = u1Var.e;
                        long currentTimeMillis2 = System.currentTimeMillis();
                        for (int i26 = 0; i26 < arrayList3.size(); i26++) {
                            t1 t1Var = (t1) arrayList3.get(i26);
                            u1 u1Var2 = t1Var.g;
                            float[] fArr2 = u1Var2.d;
                            int i27 = i26 * 4;
                            float f17 = t1Var.a;
                            fArr2[i27] = f17;
                            fArr2[i27 + 1] = t1Var.b;
                            fArr2[i27 + 2] = (AndroidUtilities.dp(30.0f) * t1Var.c) + f17;
                            fArr2[i27 + 3] = (AndroidUtilities.dp(30.0f) * t1Var.d) + t1Var.b;
                            float dp = AndroidUtilities.dp(4.0f);
                            float f18 = u1Var2.j;
                            float f19 = (f18 / 660.0f) * dp * u1Var2.f;
                            float f20 = (t1Var.c * f19) + t1Var.a;
                            t1Var.a = f20;
                            float f21 = (t1Var.d * f19) + t1Var.b;
                            t1Var.b = f21;
                            float f22 = t1Var.f;
                            if (f22 != 1.0f) {
                                float f23 = (f18 / 200.0f) + f22;
                                t1Var.f = f23;
                                if (f23 > 1.0f) {
                                    t1Var.f = 1.0f;
                                }
                            }
                            if (currentTimeMillis2 > t1Var.e || !u1Var.b.contains(f20, f21)) {
                                t1Var.a(currentTimeMillis2, false);
                            }
                        }
                        canvas.drawLines(u1Var.d, u1Var.c);
                    } else {
                        org.telegram.ui.Cells.u0 u0Var = this.P;
                        if (u0Var != null) {
                            ArrayList arrayList4 = u0Var.c;
                            System.currentTimeMillis();
                            for (int i28 = 0; i28 < arrayList4.size(); i28++) {
                                l lVar = (l) arrayList4.get(i28);
                                org.telegram.ui.Cells.u0 u0Var2 = lVar.m;
                                Paint paint2 = (Paint) u0Var2.i;
                                float f24 = lVar.l;
                                if (f24 != 1.0f) {
                                    float f25 = (u0Var2.e / lVar.j) + f24;
                                    lVar.l = f25;
                                    if (f25 > 1.0f) {
                                        lVar.l = 1.0f;
                                    }
                                }
                                if (lVar.f != null) {
                                    canvas.save();
                                    float pow2 = 1.0f - (((float) Math.pow(lVar.l - 0.5f, 2.0d)) * 4.0f);
                                    float B = e2.B(pow2, 0.4f, 0.7f, lVar.k / u0Var2.b);
                                    canvas.translate(lVar.b - (lVar.h / 2.0f), lVar.c - (lVar.i / 2.0f));
                                    canvas.scale(B, B, lVar.h / 2.0f, lVar.i / 2.0f);
                                    paint2.setAlpha((int) (lVar.d * pow2));
                                    canvas.drawBitmap(lVar.f, 0.0f, 0.0f, paint2);
                                    canvas.restore();
                                }
                                if (lVar.l >= 1.0f) {
                                    lVar.a(i28, false);
                                }
                            }
                        }
                    }
                }
                canvas.restore();
                invalidate();
                float min2 = (int) (Math.min(getMeasuredWidth(), getMeasuredHeight()) * f7);
                float measuredWidth = (getMeasuredWidth() - (0.671f * min2)) / f10;
                float f26 = 0.0671f * min2;
                this.M = f26;
                z10 = this.d;
                if (z10) {
                    AndroidUtilities.rectTmp.set(measuredWidth, getMeasuredHeight() - min2, getMeasuredWidth() - measuredWidth, getMeasuredHeight() + this.M);
                } else {
                    AndroidUtilities.rectTmp.set(measuredWidth, -f26, getMeasuredWidth() - measuredWidth, min2);
                }
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.inset(-AndroidUtilities.dp(3.0f), -AndroidUtilities.dp(3.0f));
                rectF.inset(-AndroidUtilities.dp(3.0f), -AndroidUtilities.dp(3.0f));
                canvas.drawRoundRect(rectF, this.M + AndroidUtilities.dp(3.0f), this.M + AndroidUtilities.dp(3.0f), this.c);
                rectF.inset(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
                float f27 = this.M;
                Paint paint3 = this.b;
                canvas.drawRoundRect(rectF, f27, f27, paint3);
                if (z10) {
                    rectF.set(measuredWidth, getMeasuredHeight() - min2, getMeasuredWidth() - measuredWidth, getMeasuredHeight());
                } else {
                    rectF.set(measuredWidth, 0.0f, getMeasuredWidth() - measuredWidth, min2);
                }
                float dp2 = this.M - AndroidUtilities.dp(3.0f);
                this.M = dp2;
                aVar = this.K;
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
                gVar = this.L;
                if (gVar != null) {
                    gVar.a = this.M;
                }
                ImageReceiver imageReceiver = this.n;
                if (z10) {
                    int i29 = (int) this.M;
                    imageReceiver.setRoundRadius(i29, i29, 0, 0);
                } else {
                    int i30 = (int) this.M;
                    imageReceiver.setRoundRadius(0, 0, i30, i30);
                }
                if (!this.F) {
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
        f7 = 0.9f;
        f10 = 2.0f;
        float min22 = (int) (Math.min(getMeasuredWidth(), getMeasuredHeight()) * f7);
        float measuredWidth2 = (getMeasuredWidth() - (0.671f * min22)) / f10;
        float f262 = 0.0671f * min22;
        this.M = f262;
        z10 = this.d;
        if (z10) {
        }
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.inset(-AndroidUtilities.dp(3.0f), -AndroidUtilities.dp(3.0f));
        rectF2.inset(-AndroidUtilities.dp(3.0f), -AndroidUtilities.dp(3.0f));
        canvas.drawRoundRect(rectF2, this.M + AndroidUtilities.dp(3.0f), this.M + AndroidUtilities.dp(3.0f), this.c);
        rectF2.inset(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        float f272 = this.M;
        Paint paint32 = this.b;
        canvas.drawRoundRect(rectF2, f272, f272, paint32);
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
        org.telegram.ui.Cells.u0 u0Var = this.P;
        if (u0Var != null) {
            HashMap hashMap = (HashMap) u0Var.f;
            Iterator it = hashMap.values().iterator();
            while (it.hasNext()) {
                ((Bitmap) it.next()).recycle();
            }
            hashMap.clear();
            this.P = null;
        }
        bi.h0 h0Var = this.H;
        if (h0Var != null) {
            this.T = h0Var.getCurrentPosition();
            this.H.release(new org.telegram.ui.web.d1(6));
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
            m0 m0Var = this.Q;
            if (m0Var != null) {
                RectF rectF = (RectF) m0Var.c;
                ((Rect) m0Var.e).set(0, 0, getMeasuredWidth(), getMeasuredHeight());
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
            org.telegram.ui.Cells.u0 u0Var = this.P;
            if (u0Var != null) {
                ((RectF) u0Var.g).set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
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

    @Override // qg.n0
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
                r2 = true;
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
            r2 = measuredWidth2 > -0.1f;
            this.G = Math.abs(measuredWidth2);
        }
        if (z10 != this.w) {
            this.w = z10;
            c();
        }
        if (r2 != this.E) {
            this.E = r2;
            ImageReceiver imageReceiver = this.n;
            imageReceiver.setAllowStartAnimation(r2);
            if (this.E) {
                imageReceiver.startAnimation();
                b();
                return;
            }
            bi.h0 h0Var = this.H;
            if (h0Var != null) {
                this.T = h0Var.getCurrentPosition();
                this.H.release(new org.telegram.ui.web.d1(6));
                this.H = null;
            }
            imageReceiver.stopAnimation();
        }
    }
}
