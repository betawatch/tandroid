// default package

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
import org.telegram.messenger.a;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class yfc extends FrameLayout implements wu7, fn7 {
    public static final float[] V = {0.02f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.02f};
    public boolean E;
    public boolean F;
    public boolean G;
    public float H;
    public il2 I;
    public final wfc J;
    public final TextureView K;
    public final qp9 L;
    public final ee1 M;
    public float N;
    public final dva O;
    public final bpa P;
    public zf5 Q;
    public final ia R;
    public final TLRPC.Document S;
    public int T;
    public long U;
    public final ggb a;
    public final Paint b;
    public final Paint c;
    public final boolean d;
    public File e;
    public float f;
    public final String h;
    public final ImageReceiver n;
    public azb r;
    public final int s;
    public final byte w;
    public boolean x;
    public boolean y;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0186  */
    /* JADX WARN: Type inference failed for: r9v15, types: [android.graphics.Bitmap[], java.io.Serializable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public yfc(Context context, ggb ggbVar, int i, int i2, vnb vnbVar) {
        super(context);
        boolean[] zArr;
        byte b = 1;
        Paint paint = new Paint(1);
        this.b = paint;
        Paint paint2 = new Paint(1);
        this.c = paint2;
        this.d = false;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.n = imageReceiver;
        this.s = i;
        this.w = i2;
        this.a = ggbVar;
        paint.setColor(-16777216);
        paint2.setColor(vm2.f(0.5f, aob.v0(aob.Dk, vnbVar), -16777216));
        imageReceiver.m0(ConnectionsManager.DEFAULT_DATACENTER_ID);
        TLRPC.TL_help_premiumPromo tL_help_premiumPromo = ls6.d0(i).E;
        String o0 = PremiumPreviewFragment.o0(i2);
        if (tL_help_premiumPromo != null) {
            int i3 = 0;
            while (true) {
                if (i3 >= tL_help_premiumPromo.video_sections.size()) {
                    i3 = -1;
                    break;
                } else if (tL_help_premiumPromo.video_sections.get(i3).equals(o0)) {
                    break;
                } else {
                    i3++;
                }
            }
            if (i3 >= 0) {
                TLRPC.Document document = tL_help_premiumPromo.videos.get(i3);
                xfc xfcVar = null;
                for (int i4 = 0; i4 < document.thumbs.size(); i4++) {
                    if (document.thumbs.get(i4) instanceof TLRPC.TL_photoStrippedSize) {
                        this.L = new qp9(getResources(), in5.B("b", document.thumbs.get(i4).bytes));
                        fe1 fe1Var = new fe1();
                        fe1Var.m = 4.0f;
                        fe1Var.g = 3.5f;
                        fe1Var.l = true;
                        ggb ggbVar2 = this.a;
                        fe1Var.o = this;
                        this.M = new ee1(fe1Var, ggbVar2);
                        xfcVar = new xfc(this, this.L, this.M);
                        xfcVar.x = true;
                    }
                }
                this.h = xb4.r(null, document);
                zArr = null;
                this.n.d0(null, null, xfcVar, null, tL_help_premiumPromo, 1);
                xb4.G(this.s).X(document, tL_help_premiumPromo, 3, 0);
                this.S = document;
                Utilities.e.c(new c9c(this, document, (byte) 21));
                if (i2 != 1) {
                    ia iaVar = new ia(b);
                    iaVar.c = new RectF();
                    ?? r9 = new Bitmap[16];
                    iaVar.d = r9;
                    iaVar.e = new Rect();
                    iaVar.h = new Paint();
                    this.R = iaVar;
                    iaVar.b = hl.L(16.0f);
                    TextPaint textPaint = new TextPaint(65);
                    textPaint.setTypeface(hl.n1("fonts/rcondensedbold.ttf"));
                    textPaint.setTextSize(iaVar.b);
                    textPaint.setColor(vm2.o(aob.w0(zArr, aob.Qk, false), 30));
                    textPaint.setTextAlign(Paint.Align.CENTER);
                    int i5 = 0;
                    while (i5 < 16) {
                        int i6 = i5 < 10 ? i5 + 48 : i5 + 55;
                        int i7 = iaVar.b;
                        r9[i5] = Bitmap.createBitmap(i7, i7, Bitmap.Config.ARGB_8888);
                        new Canvas(r9[i5]).drawText(Character.toString((char) i6), r13 >> 1, iaVar.b, textPaint);
                        i5++;
                    }
                } else if (i2 == 6 || i2 == 9 || i2 == 3 || i2 == 7 || i2 == 11 || i2 == 4 || i2 == 24 || i2 == 43) {
                    dva dvaVar = new dva(40);
                    this.O = dvaVar;
                    dvaVar.o = 3.0f;
                    dvaVar.N = i2;
                    if (i2 == 3 || i2 == 24 || i2 == 43) {
                        dvaVar.r = (byte) 14;
                        dvaVar.s = (byte) 18;
                        dvaVar.t = (byte) 18;
                    } else {
                        dvaVar.r = (byte) 14;
                        dvaVar.s = (byte) 16;
                        dvaVar.t = (byte) 15;
                    }
                    if (i2 == 43) {
                        dvaVar.G = true;
                    }
                    dvaVar.w = 0.98f;
                    dvaVar.v = 0.98f;
                    dvaVar.u = 0.98f;
                    dvaVar.o = 4.0f;
                    dvaVar.O = vnbVar;
                    dvaVar.P = aob.Qk;
                    dvaVar.c();
                } else if (i2 == 2) {
                    bpa bpaVar = new bpa();
                    this.P = bpaVar;
                    ArrayList arrayList = bpaVar.e;
                    if (arrayList.isEmpty()) {
                        for (int i8 = 0; i8 < 200; i8++) {
                            arrayList.add(new apa(bpaVar));
                        }
                    }
                    int o = vm2.o(aob.w0(zArr, aob.Qk, false), 80);
                    if (bpaVar.g != o) {
                        bpaVar.g = o;
                        bpaVar.c.setColor(o);
                    }
                } else if (i2 == 13) {
                    zf5 zf5Var = new zf5();
                    this.Q = zf5Var;
                    ArrayList arrayList2 = zf5Var.g;
                    if (arrayList2.isEmpty()) {
                        for (int i9 = 0; i9 < 25; i9++) {
                            arrayList2.add(new yf5(zf5Var));
                        }
                    }
                } else {
                    dva dvaVar2 = new dva(xea.o() == 2 ? 800 : xea.o() == 1 ? 400 : 100);
                    this.O = dvaVar2;
                    dvaVar2.O = vnbVar;
                    dvaVar2.P = aob.Qk;
                    dvaVar2.r = (byte) 4;
                    dvaVar2.w = 0.98f;
                    dvaVar2.v = 0.98f;
                    dvaVar2.u = 0.98f;
                    dvaVar2.G = true;
                    dvaVar2.o = 4.0f;
                    dvaVar2.H = true;
                    dvaVar2.J = true;
                    dvaVar2.L = false;
                    dvaVar2.c();
                }
                if (i2 != 1 || i2 == 3 || i2 == 11) {
                    this.d = true;
                }
                wfc wfcVar = new wfc(this, context);
                this.J = wfcVar;
                wfcVar.setResizeMode(0);
                TextureView textureView = new TextureView(context);
                this.K = textureView;
                wfcVar.addView(textureView);
                setWillNotDraw(false);
                addView(wfcVar);
            }
        }
        zArr = null;
        if (i2 != 1) {
        }
        if (i2 != 1) {
        }
        this.d = true;
        wfc wfcVar2 = new wfc(this, context);
        this.J = wfcVar2;
        wfcVar2.setResizeMode(0);
        TextureView textureView2 = new TextureView(context);
        this.K = textureView2;
        wfcVar2.addView(textureView2);
        setWillNotDraw(false);
        addView(wfcVar2);
    }

    public final void a() {
        File file = this.e;
        if ((file != null && file.exists()) || xea.x0) {
            File file2 = this.e;
            if (file2 == null || !file2.exists()) {
                this.f = 0.671f;
            } else {
                byte b = 19;
                if ((jn7.e().p & 512) != 0) {
                    azb azbVar = this.r;
                    if (azbVar != null) {
                        hl.r(azbVar);
                    }
                    azb azbVar2 = new azb(this, b);
                    this.r = azbVar2;
                    hl.d3(azbVar2, 300L);
                    return;
                }
                try {
                    MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                    mediaMetadataRetriever.setDataSource(a.b, Uri.fromFile(this.e));
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
        TLRPC.Document document = this.S;
        int i = this.s;
        if ((this.e != null || xea.x0) && this.I == null) {
            this.J.a(this.f, 0);
            il2 il2Var = new il2(this, (byte) 1);
            this.I = il2Var;
            TextureView textureView = this.K;
            il2Var.with(textureView);
            File file = this.e;
            if (file == null || !file.exists()) {
                try {
                    StringBuilder sb = new StringBuilder("?account=");
                    sb.append(i);
                    sb.append("&id=");
                    sb.append(document.id);
                    sb.append("&hash=");
                    sb.append(document.access_hash);
                    sb.append("&dc=");
                    sb.append(document.dc_id);
                    sb.append("&size=");
                    sb.append(document.size);
                    sb.append("&mime=");
                    sb.append(URLEncoder.encode(document.mime_type, "UTF-8"));
                    sb.append("&rid=");
                    sb.append(xb4.G(i).F(ls6.d0(i).E));
                    sb.append("&name=");
                    sb.append(URLEncoder.encode(xb4.B(document), "UTF-8"));
                    sb.append("&reference=");
                    byte[] bArr = document.file_reference;
                    if (bArr == null) {
                        bArr = new byte[0];
                    }
                    sb.append(Utilities.f(bArr));
                    uri = Uri.parse("tg://" + this.h + sb.toString());
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
                this.n.x0();
                textureView.setAlpha(0.0f);
            }
            this.I.seekTo(this.U + 60);
            this.I.play();
        }
    }

    public final void c() {
        boolean z = this.x && this.y;
        if (this.E != z) {
            this.E = z;
            ImageReceiver imageReceiver = this.n;
            if (z) {
                imageReceiver.I();
            } else {
                imageReceiver.K();
            }
        }
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.Y1) {
            String str = (String) objArr[0];
            String str2 = this.h;
            if (str2 == null || !str2.equals(str)) {
                return;
            }
            this.e = (File) objArr[1];
            a();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x006c, code lost:
    
        if (r5.length != (r3 + 1)) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00c7, code lost:
    
        if (r5[0].length == (r2 + 1)) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0533  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x056d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0573  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0579  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0586  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0590  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x059f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x05b7  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0596  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x053e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x04cf  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01e3  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f;
        int i;
        float f2;
        float f3;
        float f4;
        long j;
        long j2;
        int i2;
        int min;
        int max;
        int i3;
        int i4;
        ia iaVar;
        int i5;
        boolean z;
        RectF rectF;
        float L;
        qp9 qp9Var;
        ee1 ee1Var;
        ia iaVar2 = this.R;
        bpa bpaVar = this.P;
        int i6 = 1;
        int i7 = 0;
        dva dvaVar = this.O;
        if (dvaVar != null || bpaVar != null || this.Q != null || iaVar2 != null) {
            float f5 = 0.5f;
            if (this.H < 0.5f) {
                float f6 = 1.0f;
                f = 0.9f;
                double d = 2.0d;
                float pow = (float) Math.pow(1.0f - r11, 2.0d);
                canvas.save();
                canvas.scale(pow, pow, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
                if (iaVar2 != null) {
                    Rect rect = (Rect) iaVar2.e;
                    int width = rect.width() / iaVar2.b;
                    int height = rect.height() / iaVar2.b;
                    if (width != 0 && height != 0) {
                        float f7 = 150.0f;
                        long currentTimeMillis = System.currentTimeMillis();
                        ArrayList[] arrayListArr = (ArrayList[]) iaVar2.f;
                        int i8 = 4;
                        if (arrayListArr != null) {
                            f4 = 0.2f;
                        } else {
                            f4 = 0.2f;
                        }
                        iaVar2.f = new ArrayList[width + 1];
                        for (int i9 = 0; i9 <= width; i9++) {
                            ((ArrayList[]) iaVar2.f)[i9] = new ArrayList();
                            ql6 ql6Var = new ql6();
                            o3d o3dVar = Utilities.c;
                            ql6Var.a = Math.abs(((int) o3dVar.nextLong()) % height);
                            ql6Var.c = currentTimeMillis;
                            ql6Var.b = Math.abs(((int) o3dVar.nextLong()) % 6) + 4;
                            ((ArrayList[]) iaVar2.f)[i9].add(ql6Var);
                        }
                        pl6[][] pl6VarArr = (pl6[][]) iaVar2.g;
                        if (pl6VarArr != null) {
                            j = 150;
                            if (pl6VarArr.length == width + 1) {
                            }
                        } else {
                            j = 150;
                        }
                        iaVar2.g = new pl6[width + 1][];
                        int i10 = 0;
                        while (i10 <= width) {
                            ((pl6[][]) iaVar2.g)[i10] = new pl6[height + 1];
                            int i11 = 0;
                            while (i11 <= height) {
                                pl6[][] pl6VarArr2 = (pl6[][]) iaVar2.g;
                                pl6[] pl6VarArr3 = pl6VarArr2[i10];
                                float f8 = f7;
                                pl6 pl6Var = new pl6();
                                pl6Var.d = iaVar2;
                                pl6VarArr3[i11] = pl6Var;
                                pl6 pl6Var2 = pl6VarArr2[i10][i11];
                                pl6Var2.getClass();
                                o3d o3dVar2 = Utilities.c;
                                pl6Var2.b = Math.abs(((int) o3dVar2.nextLong()) % 16);
                                pl6Var2.c = Math.abs(((int) o3dVar2.nextLong()) % 16);
                                pl6Var2.a = Math.abs(((int) o3dVar2.nextLong()) % jn7.W4) + currentTimeMillis + j;
                                i11++;
                                f6 = f6;
                                f7 = f8;
                            }
                            i10++;
                            f7 = f7;
                        }
                        float f9 = f7;
                        float f10 = f6;
                        int i12 = 0;
                        while (i12 <= width) {
                            ArrayList arrayList = ((ArrayList[]) iaVar2.f)[i12];
                            int i13 = i7;
                            while (i13 < arrayList.size()) {
                                ql6 ql6Var2 = (ql6) arrayList.get(i13);
                                int i14 = i8;
                                if (currentTimeMillis - ql6Var2.c > 50) {
                                    int i15 = ql6Var2.a + i6;
                                    ql6Var2.a = i15;
                                    ql6Var2.c = currentTimeMillis;
                                    if (i15 - ql6Var2.b >= height) {
                                        if (arrayList.size() == i6) {
                                            ql6Var2.a = 0;
                                            ql6Var2.c = currentTimeMillis;
                                            ql6Var2.b = Math.abs(((int) Utilities.c.nextLong()) % 6) + 4;
                                        } else {
                                            arrayList.remove(ql6Var2);
                                            i13--;
                                        }
                                    }
                                    if (ql6Var2.a > ql6Var2.b && i13 == arrayList.size() - i6) {
                                        o3d o3dVar3 = Utilities.c;
                                        if (Math.abs(o3dVar3.nextInt(i14)) == 0) {
                                            i2 = i6;
                                            ql6 ql6Var3 = new ql6();
                                            ql6Var3.a = 0;
                                            ql6Var3.c = currentTimeMillis;
                                            j2 = currentTimeMillis;
                                            ql6Var3.b = Math.abs(((int) o3dVar3.nextLong()) % 6) + i14;
                                            arrayList.add(ql6Var3);
                                        } else {
                                            i2 = i6;
                                            j2 = currentTimeMillis;
                                        }
                                        min = Math.min(ql6Var2.a, height + 1);
                                        max = Math.max(0, ql6Var2.a - ql6Var2.b);
                                        while (max < min) {
                                            int i16 = iaVar2.b;
                                            float f11 = i16 * i12;
                                            float f12 = i16 * max;
                                            if (((RectF) iaVar2.c).contains(f11, f12)) {
                                                i3 = height;
                                                i4 = width;
                                                iaVar = iaVar2;
                                                i5 = i12;
                                            } else {
                                                float i17 = Utilities.i(((f10 - ((ql6Var2.a - max) / (ql6Var2.b - 1))) * 0.8f) + f4, f10, 0.0f);
                                                pl6 pl6Var3 = ((pl6[][]) iaVar2.g)[i12][max];
                                                ia iaVar3 = (ia) pl6Var3.d;
                                                i3 = height;
                                                i4 = width;
                                                long j3 = pl6Var3.a - j2;
                                                iaVar = iaVar2;
                                                if (j3 < j) {
                                                    float i18 = Utilities.i(1.0f - (j3 / f9), 1.0f, 0.0f);
                                                    Paint paint = (Paint) iaVar3.h;
                                                    Bitmap[] bitmapArr = (Bitmap[]) iaVar3.d;
                                                    i5 = i12;
                                                    paint.setAlpha((int) qd4.z(1.0f, i18, i17, 255.0f));
                                                    canvas.drawBitmap(bitmapArr[pl6Var3.b], f11, f12, paint);
                                                    paint.setAlpha((int) (i17 * i18 * 255.0f));
                                                    canvas.drawBitmap(bitmapArr[pl6Var3.c], f11, f12, paint);
                                                    paint.setAlpha(jn7.d4);
                                                    if (i18 >= 1.0f) {
                                                        pl6Var3.b = pl6Var3.c;
                                                        pl6Var3.c = Math.abs(((int) Utilities.c.nextLong()) % 16);
                                                        pl6Var3.a = j2 + Math.abs(((int) r2.nextLong()) % jn7.W4) + j;
                                                    }
                                                } else {
                                                    i5 = i12;
                                                    ((Paint) iaVar3.h).setAlpha((int) (i17 * 255.0f));
                                                    canvas.drawBitmap(((Bitmap[]) iaVar3.d)[pl6Var3.b], f11, f12, (Paint) iaVar3.h);
                                                }
                                            }
                                            max++;
                                            width = i4;
                                            height = i3;
                                            iaVar2 = iaVar;
                                            i12 = i5;
                                            f10 = 1.0f;
                                        }
                                        i13++;
                                        i6 = i2;
                                        currentTimeMillis = j2;
                                        i8 = 4;
                                        f10 = 1.0f;
                                    }
                                }
                                j2 = currentTimeMillis;
                                i2 = i6;
                                min = Math.min(ql6Var2.a, height + 1);
                                max = Math.max(0, ql6Var2.a - ql6Var2.b);
                                while (max < min) {
                                }
                                i13++;
                                i6 = i2;
                                currentTimeMillis = j2;
                                i8 = 4;
                                f10 = 1.0f;
                            }
                            i12++;
                            i7 = 0;
                            i8 = 4;
                            f10 = 1.0f;
                        }
                    }
                    i = i6;
                } else {
                    i = 1;
                    float f13 = 2.0f;
                    if (dvaVar != null) {
                        dvaVar.d(canvas);
                    } else if (bpaVar != null) {
                        Paint paint2 = bpaVar.c;
                        if (this.I != null) {
                            float i19 = Utilities.i(r3.getCurrentPosition() / this.I.getDuration(), 1.0f, 0.0f);
                            int i20 = (int) (i19 / 0.11111111f);
                            int i21 = i20 + 1;
                            float c = c00.c(i20, 0.11111111f, i19, 0.11111111f);
                            float[] fArr = V;
                            f3 = i21 < 10 ? (fArr[i21] * c) + ((1.0f - c) * fArr[i20]) : fArr[i20];
                        } else {
                            f3 = 0.2f;
                        }
                        bpaVar.f = (((1.0f - Utilities.i(this.H / 0.1f, 1.0f, 0.0f)) * 0.9f) + 0.1f) * 150.0f * f3;
                        ArrayList arrayList2 = bpaVar.e;
                        int o = vm2.o(aob.w0(null, aob.Qk, false), 80);
                        if (bpaVar.g != o) {
                            bpaVar.g = o;
                            paint2.setColor(o);
                        }
                        long currentTimeMillis2 = System.currentTimeMillis();
                        for (int i22 = 0; i22 < arrayList2.size(); i22++) {
                            apa apaVar = (apa) arrayList2.get(i22);
                            bpa bpaVar2 = apaVar.g;
                            float[] fArr2 = bpaVar2.d;
                            int i23 = i22 << 2;
                            float f14 = apaVar.a;
                            fArr2[i23] = f14;
                            fArr2[i23 + 1] = apaVar.b;
                            fArr2[i23 + 2] = (hl.L(30.0f) * apaVar.c) + f14;
                            fArr2[i23 + 3] = (hl.L(30.0f) * apaVar.d) + apaVar.b;
                            float L2 = hl.L(4.0f);
                            float f15 = bpaVar2.h;
                            float f16 = (f15 / 660.0f) * L2 * bpaVar2.f;
                            float f17 = (apaVar.c * f16) + apaVar.a;
                            apaVar.a = f17;
                            float f18 = (apaVar.d * f16) + apaVar.b;
                            apaVar.b = f18;
                            float f19 = apaVar.f;
                            if (f19 != 1.0f) {
                                float f20 = (f15 / 200.0f) + f19;
                                apaVar.f = f20;
                                if (f20 > 1.0f) {
                                    apaVar.f = 1.0f;
                                }
                            }
                            if (currentTimeMillis2 > apaVar.e || !bpaVar.b.contains(f17, f18)) {
                                apaVar.a(currentTimeMillis2, false);
                            }
                        }
                        canvas.drawLines(bpaVar.d, paint2);
                    } else {
                        zf5 zf5Var = this.Q;
                        if (zf5Var != null) {
                            ArrayList arrayList3 = zf5Var.g;
                            System.currentTimeMillis();
                            int i24 = 0;
                            while (i24 < arrayList3.size()) {
                                yf5 yf5Var = (yf5) arrayList3.get(i24);
                                zf5 zf5Var2 = yf5Var.m;
                                Paint paint3 = zf5Var2.f;
                                float f21 = yf5Var.l;
                                if (f21 != 1.0f) {
                                    f2 = f5;
                                    float f22 = (zf5Var2.h / yf5Var.j) + f21;
                                    yf5Var.l = f22;
                                    if (f22 > 1.0f) {
                                        yf5Var.l = 1.0f;
                                    }
                                } else {
                                    f2 = f5;
                                }
                                if (yf5Var.f != null) {
                                    canvas.save();
                                    float pow2 = 1.0f - (((float) Math.pow(yf5Var.l - f2, d)) * 4.0f);
                                    float z2 = xnb.z(pow2, 0.4f, 0.7f, yf5Var.k / zf5Var2.b);
                                    float f23 = f13;
                                    uh9.n(yf5Var.i, f23, yf5Var.c, yf5Var.b - (yf5Var.h / f13), canvas);
                                    canvas.scale(z2, z2, yf5Var.h / f23, yf5Var.i / f23);
                                    paint3.setAlpha((int) (yf5Var.d * pow2));
                                    canvas.drawBitmap(yf5Var.f, 0.0f, 0.0f, paint3);
                                    canvas.restore();
                                }
                                if (yf5Var.l >= 1.0f) {
                                    yf5Var.a(i24, false);
                                }
                                i24++;
                                f5 = f2;
                                d = 2.0d;
                                f13 = 2.0f;
                            }
                        }
                    }
                }
                canvas.restore();
                invalidate();
                float min2 = (int) (Math.min(getMeasuredWidth(), getMeasuredHeight()) * f);
                float measuredWidth = (getMeasuredWidth() - (0.671f * min2)) / 2.0f;
                float f24 = 0.0671f * min2;
                this.N = f24;
                z = this.d;
                if (z) {
                    rectF = hl.P;
                    rectF.set(measuredWidth, getMeasuredHeight() - min2, getMeasuredWidth() - measuredWidth, getMeasuredHeight() + this.N);
                } else {
                    rectF = hl.P;
                    rectF.set(measuredWidth, -f24, getMeasuredWidth() - measuredWidth, min2);
                }
                rectF.inset(-hl.L(3.0f), -hl.L(3.0f));
                rectF.inset(-hl.L(3.0f), -hl.L(3.0f));
                canvas.drawRoundRect(rectF, this.N + hl.L(3.0f), this.N + hl.L(3.0f), this.c);
                rectF.inset(hl.L(3.0f), hl.L(3.0f));
                float f25 = this.N;
                Paint paint4 = this.b;
                canvas.drawRoundRect(rectF, f25, f25, paint4);
                if (z) {
                    rectF.set(measuredWidth, getMeasuredHeight() - min2, getMeasuredWidth() - measuredWidth, getMeasuredHeight());
                } else {
                    rectF.set(measuredWidth, 0.0f, getMeasuredWidth() - measuredWidth, min2);
                }
                L = this.N - hl.L(3.0f);
                this.N = L;
                qp9Var = this.L;
                if (qp9Var != null && qp9Var.f != L) {
                    if (L <= 0.05f) {
                        i = 0;
                    }
                    Paint paint5 = qp9Var.c;
                    if (i == 0) {
                        paint5.setShader(qp9Var.d);
                    } else {
                        paint5.setShader(null);
                    }
                    qp9Var.f = L;
                    qp9Var.invalidateSelf();
                }
                ee1Var = this.M;
                if (ee1Var != null) {
                    ee1Var.b = this.N;
                }
                float f26 = this.N;
                ImageReceiver imageReceiver = this.n;
                if (z) {
                    int i25 = (int) f26;
                    imageReceiver.r0(i25, i25, 0, 0);
                } else {
                    int i26 = (int) f26;
                    imageReceiver.r0(0, 0, i26, i26);
                }
                if (!this.G) {
                    imageReceiver.i0(rectF.left, rectF.top, rectF.width(), rectF.height());
                    imageReceiver.h(canvas, null);
                }
                super.dispatchDraw(canvas);
                if (z) {
                    canvas.drawCircle(imageReceiver.r(), imageReceiver.M0 + hl.L(12.0f), hl.L(6.0f), paint4);
                    return;
                }
                return;
            }
        }
        i = 1;
        f = 0.9f;
        float min22 = (int) (Math.min(getMeasuredWidth(), getMeasuredHeight()) * f);
        float measuredWidth2 = (getMeasuredWidth() - (0.671f * min22)) / 2.0f;
        float f242 = 0.0671f * min22;
        this.N = f242;
        z = this.d;
        if (z) {
        }
        rectF.inset(-hl.L(3.0f), -hl.L(3.0f));
        rectF.inset(-hl.L(3.0f), -hl.L(3.0f));
        canvas.drawRoundRect(rectF, this.N + hl.L(3.0f), this.N + hl.L(3.0f), this.c);
        rectF.inset(hl.L(3.0f), hl.L(3.0f));
        float f252 = this.N;
        Paint paint42 = this.b;
        canvas.drawRoundRect(rectF, f252, f252, paint42);
        if (z) {
        }
        L = this.N - hl.L(3.0f);
        this.N = L;
        qp9Var = this.L;
        if (qp9Var != null) {
            if (L <= 0.05f) {
            }
            Paint paint52 = qp9Var.c;
            if (i == 0) {
            }
            qp9Var.f = L;
            qp9Var.invalidateSelf();
        }
        ee1Var = this.M;
        if (ee1Var != null) {
        }
        float f262 = this.N;
        ImageReceiver imageReceiver2 = this.n;
        if (z) {
        }
        if (!this.G) {
        }
        super.dispatchDraw(canvas);
        if (z) {
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
        jn7.f(this.s).b(this, jn7.Y1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.y = false;
        c();
        jn7.f(this.s).n(this, jn7.Y1);
        zf5 zf5Var = this.Q;
        if (zf5Var != null) {
            HashMap hashMap = zf5Var.c;
            Iterator it = hashMap.values().iterator();
            while (it.hasNext()) {
                ((Bitmap) it.next()).recycle();
            }
            hashMap.clear();
            this.Q = null;
        }
        il2 il2Var = this.I;
        if (il2Var != null) {
            this.U = il2Var.getCurrentPosition();
            this.I.release(new kc((byte) 10));
            this.I = null;
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        RectF rectF;
        super.onLayout(z, i, i2, i3, i4);
        int measuredWidth = getMeasuredWidth() << (getMeasuredHeight() + 16);
        float min = (int) (Math.min(getMeasuredWidth(), getMeasuredHeight()) * 0.9f);
        float measuredWidth2 = (getMeasuredWidth() - (0.671f * min)) / 2.0f;
        if (this.d) {
            rectF = hl.P;
            rectF.set(measuredWidth2, -this.N, getMeasuredWidth() - measuredWidth2, min);
        } else {
            rectF = hl.P;
            rectF.set(measuredWidth2, getMeasuredHeight() - min, getMeasuredWidth() - measuredWidth2, getMeasuredHeight() + this.N);
        }
        if (this.T != measuredWidth) {
            this.T = measuredWidth;
            ia iaVar = this.R;
            if (iaVar != null) {
                RectF rectF2 = (RectF) iaVar.c;
                ((Rect) iaVar.e).set(0, 0, getMeasuredWidth(), getMeasuredHeight());
                rectF2.set(rectF);
                rectF2.inset(hl.L(16.0f), hl.L(16.0f));
            }
            dva dvaVar = this.O;
            if (dvaVar != null) {
                RectF rectF3 = dvaVar.c;
                RectF rectF4 = dvaVar.a;
                byte b = this.w;
                if (b == 6 || b == 9 || b == 3 || b == 7 || b == 24 || b == 43 || b == 11 || b == 4) {
                    rectF4.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    rectF4.inset(hl.L(30.0f), hl.L(30.0f));
                } else {
                    float width = (int) (rectF.width() * 0.4f);
                    rectF4.set(rectF.centerX() - width, rectF.centerY() - width, rectF.centerX() + width, rectF.centerY() + width);
                    dvaVar.b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                }
                dvaVar.f();
                rectF3.set(rectF);
                rectF3.inset(hl.L(10.0f), hl.L(10.0f));
            }
            bpa bpaVar = this.P;
            if (bpaVar != null) {
                RectF rectF5 = bpaVar.a;
                rectF5.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                bpaVar.b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                rectF5.inset(hl.L(100.0f), hl.L(100.0f));
                rectF5.offset(0.0f, getMeasuredHeight() * 0.1f);
                ArrayList arrayList = bpaVar.e;
                long currentTimeMillis = System.currentTimeMillis();
                for (int i5 = 0; i5 < arrayList.size(); i5++) {
                    ((apa) arrayList.get(i5)).a(currentTimeMillis, true);
                }
            }
            zf5 zf5Var = this.Q;
            if (zf5Var != null) {
                zf5Var.d.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                this.Q.e.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                this.Q.d.inset(hl.L(0.0f), getMeasuredHeight() * 0.1f);
                ArrayList arrayList2 = this.Q.g;
                System.currentTimeMillis();
                for (int i6 = 0; i6 < arrayList2.size(); i6++) {
                    ((yf5) arrayList2.get(i6)).a(i6, true);
                }
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        RectF rectF;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        float min = (int) (Math.min(size2, size) * 0.9f);
        float f = size;
        float f2 = (f - (0.671f * min)) / 2.0f;
        this.N = 0.0671f * min;
        wfc wfcVar = this.J;
        wfcVar.invalidateOutline();
        if (this.d) {
            rectF = hl.P;
            rectF.set(f2, 0.0f, f - f2, min);
        } else {
            RectF rectF2 = hl.P;
            float f3 = size2;
            rectF2.set(f2, f3 - min, f - f2, f3);
            rectF = rectF2;
        }
        wfcVar.getLayoutParams().width = (int) rectF.width();
        wfcVar.getLayoutParams().height = (int) rectF.height();
        ((ViewGroup.MarginLayoutParams) wfcVar.getLayoutParams()).leftMargin = (int) rectF.left;
        ((ViewGroup.MarginLayoutParams) wfcVar.getLayoutParams()).topMargin = (int) rectF.top;
        super.onMeasure(i, i2);
    }

    @Override // wu7
    public void setOffset(float f) {
        boolean z;
        boolean z2 = this.d;
        float f2 = -f;
        if (f < 0.0f) {
            float measuredWidth = f2 / getMeasuredWidth();
            setAlpha((Utilities.i(1.0f - measuredWidth, 1.0f, 0.0f) * 0.5f) + 0.5f);
            setRotationY(50.0f * measuredWidth);
            invalidate();
            if (z2) {
                setTranslationY((-getMeasuredHeight()) * 0.3f * measuredWidth);
            } else {
                setTranslationY(getMeasuredHeight() * 0.3f * measuredWidth);
            }
            this.H = Math.abs(measuredWidth);
            z = measuredWidth < 1.0f;
            if (measuredWidth >= 0.1f) {
                r4 = false;
            }
        } else {
            float measuredWidth2 = f2 / getMeasuredWidth();
            invalidate();
            setRotationY(50.0f * measuredWidth2);
            if (z2) {
                setTranslationY(getMeasuredHeight() * 0.3f * measuredWidth2);
            } else {
                setTranslationY((-getMeasuredHeight()) * 0.3f * measuredWidth2);
            }
            z = measuredWidth2 > -1.0f;
            r4 = measuredWidth2 > -0.1f;
            this.H = Math.abs(measuredWidth2);
        }
        if (z != this.x) {
            this.x = z;
            c();
        }
        if (r4 != this.F) {
            this.F = r4;
            ImageReceiver imageReceiver = this.n;
            imageReceiver.u0 = r4;
            if (r4) {
                imageReceiver.w0(false);
                b();
                return;
            }
            il2 il2Var = this.I;
            if (il2Var != null) {
                this.U = il2Var.getCurrentPosition();
                this.I.release(new kc((byte) 10));
                this.I = null;
            }
            imageReceiver.x0();
        }
    }
}
