package ug;

import ai.g3;
import ai.m3;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import b8.cg;
import b8.kg;
import b8.mf;
import com.google.mlkit.vision.label.internal.ImageLabelerImpl;
import com.google.mlkit.vision.segmentation.subject.internal.zzd;
import gi.f7;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.Executor;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.az;
import org.telegram.messenger.b20;
import org.telegram.messenger.bd;
import org.telegram.messenger.cs;
import org.telegram.messenger.h10;
import org.telegram.messenger.hs;
import org.telegram.messenger.i6;
import org.telegram.messenger.li;
import org.telegram.messenger.n10;
import org.telegram.messenger.n6;
import org.telegram.messenger.u10;
import org.telegram.messenger.w7;
import org.telegram.messenger.yy;
import org.telegram.messenger.zi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.cz0;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.nh;
import org.telegram.ui.Components.u5;
import org.telegram.ui.Components.xq;
import org.telegram.ui.en0;
import org.telegram.ui.hb1;
import org.telegram.ui.m21;
import x7.q5;
import z7.da;
import z7.l7;
import z7.n7;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class c2 extends FrameLayout implements cs {
    public static final /* synthetic */ int s0 = 0;
    public volatile boolean E;
    public z1 F;
    public float G;
    public boolean H;
    public z1[] I;
    public volatile Bitmap J;
    public int K;
    public Bitmap L;
    public boolean M;
    public final TextView N;
    public ValueAnimator O;
    public float P;
    public float Q;
    public float R;
    public float S;
    public cz0 T;
    public int U;
    public int V;
    public boolean W;
    public int a;
    public a2 a0;
    public final u5 b;
    public final e6 b0;
    public final u5 c;
    public s1 c0;
    public final Paint d;
    public String d0;
    public final Paint e;
    public gi.s0 e0;
    public final Paint f;
    public final Matrix f0;
    public float g0;
    public final Paint h;
    public float h0;
    public final l1 i0;
    public boolean j0;
    public final Matrix k0;
    public Path l0;
    public Path m0;
    public final PathMeasure n;
    public final RectF n0;
    public float o0;
    public float p0;
    public final ArrayList q0;
    public final Path r;
    public final Rect r0;
    public final Path s;
    public final Path w;
    public final Path x;
    public volatile boolean y;

    public c2(ContextThemeWrapper contextThemeWrapper, e6 e6Var) {
        super(contextThemeWrapper);
        this.a = -1;
        xq xqVar = xq.h;
        this.b = new u5(0.0f, (View) null, 0L, 420L, xqVar);
        this.c = new u5(0.0f, (View) null, 0L, 420L, xqVar);
        Paint paint = new Paint(1);
        this.d = paint;
        Paint paint2 = new Paint(1);
        this.e = paint2;
        Paint paint3 = new Paint(1);
        this.f = paint3;
        Paint paint4 = new Paint(1);
        this.h = paint4;
        this.n = new PathMeasure();
        this.r = new Path();
        this.s = new Path();
        this.w = new Path();
        this.x = new Path();
        this.G = 2.0f;
        this.f0 = new Matrix();
        this.k0 = new Matrix();
        this.n0 = new RectF();
        this.q0 = new ArrayList();
        this.r0 = new Rect();
        this.b0 = e6Var;
        paint.setColor(-1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint.setPathEffect(new DashPathEffect(new float[]{org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(10.0f)}, 0.5f));
        paint.setShadowLayer(org.telegram.messenger.g0.N(0.75f), 0.0f, 0.0f, 1342177280);
        paint.setAlpha(hs.W1);
        TextView textView = new TextView(contextThemeWrapper);
        this.N = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(-1);
        textView.setAlpha(0.0f);
        textView.setScaleX(0.3f);
        textView.setScaleY(0.3f);
        addView(textView, mf.e(-2, -2, 17));
        paint3.setColor(-1);
        paint3.setStrokeWidth(org.telegram.messenger.g0.L(3.0f));
        paint3.setStyle(style);
        paint3.setStrokeCap(cap);
        paint3.setPathEffect(new CornerPathEffect(org.telegram.messenger.g0.L(20.0f)));
        float L = org.telegram.messenger.g0.L(4.0f);
        BlurMaskFilter.Blur blur = BlurMaskFilter.Blur.NORMAL;
        paint3.setMaskFilter(new BlurMaskFilter(L, blur));
        paint4.setColor(-1);
        paint4.setStrokeWidth(org.telegram.messenger.g0.L(3.0f));
        paint4.setStyle(style);
        paint4.setStrokeCap(cap);
        paint4.setPathEffect(new CornerPathEffect(org.telegram.messenger.g0.L(20.0f)));
        paint4.setMaskFilter(new BlurMaskFilter(org.telegram.messenger.g0.L(4.0f), blur));
        paint2.setColor(1711276032);
        setLayerType(2, null);
        l1 l1Var = new l1(contextThemeWrapper);
        this.i0 = l1Var;
        l1Var.setAlpha(0.0f);
        l1Var.setTranslationX(-org.telegram.messenger.g0.L(18.0f));
        l1Var.b(0.33f, 10.0f);
        l1Var.setBrushWeight(this.G);
        l1Var.setValueOverride(new nh(this, 26));
        l1Var.setTranslationX(-org.telegram.messenger.g0.L(18.0f));
        l1Var.setAlpha(0.0f);
        addView(l1Var, mf.c(-1.0f, -1));
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0240  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void c(z1 z1Var, int i3, int i10) {
        Bitmap bitmap;
        y1 y1Var;
        boolean z10;
        float f10;
        int i11;
        Bitmap b10 = z1Var.b();
        Path path = z1Var.l;
        int width = b10.getWidth();
        int height = z1Var.b().getHeight();
        int i12 = 2;
        float max = Math.max(width, height) / (az.o() == 2 ? 512.0f : 384.0f);
        if ((z1Var.c / 90) % 2 != 0) {
            width = z1Var.b().getHeight();
            height = z1Var.b().getWidth();
        }
        float f11 = width;
        float f12 = height;
        Bitmap createBitmap = Bitmap.createBitmap((int) (f11 / max), (int) (f12 / max), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        RectF rectF = new RectF();
        rectF.set(0.0f, 0.0f, createBitmap.getWidth(), createBitmap.getHeight());
        if (z1Var.c != 0) {
            Matrix matrix = new Matrix();
            matrix.postRotate(z1Var.c, z1Var.b().getWidth() / 2.0f, z1Var.d.getHeight() / 2.0f);
            if ((z1Var.c / 90) % 2 != 0) {
                float height2 = (z1Var.b().getHeight() - z1Var.b().getWidth()) / 2.0f;
                matrix.postTranslate(height2, -height2);
            }
            matrix.postScale(rectF.width() / f11, rectF.height() / f12);
            canvas.drawBitmap(z1Var.b(), matrix, new Paint(3));
        } else {
            canvas.drawBitmap(z1Var.b(), (Rect) null, rectF, new Paint(3));
        }
        int height3 = createBitmap.getHeight() * createBitmap.getWidth();
        int[] iArr = new int[height3];
        createBitmap.getPixels(iArr, 0, createBitmap.getWidth(), 0, 0, createBitmap.getWidth(), createBitmap.getHeight());
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        float f13 = i3;
        float f14 = i10;
        float min = Math.min(f13 / createBitmap.getWidth(), f14 / createBitmap.getHeight());
        y1 y1Var2 = null;
        y1 y1Var3 = null;
        int i13 = 0;
        while (i13 < height3) {
            int i14 = i12;
            int width2 = i13 / createBitmap.getWidth();
            int width3 = i13 - (createBitmap.getWidth() * width2);
            int i15 = iArr[i13];
            boolean z11 = i15 != 0;
            if (i15 == 0) {
                int i16 = i13 - 1;
                boolean z12 = i16 >= 0;
                f10 = f11;
                int i17 = i13 + 1;
                boolean z13 = i17 < height3;
                if (!z12 || iArr[i16] == 0) {
                    i11 = i17;
                } else {
                    i11 = i17;
                    y1Var3 = new y1(min, width3, width2);
                }
                if (y1Var2 == null && z13 && iArr[i11] != 0) {
                    y1Var2 = new y1(min, width3, width2);
                }
            } else {
                f10 = f11;
            }
            boolean z14 = width3 == createBitmap.getWidth() + (-1);
            boolean z15 = width3 == 0;
            if (z14) {
                y1 y1Var4 = z11 ? new y1(min, width3, width2) : y1Var3;
                if (y1Var2 != null) {
                    arrayList.add(y1Var2);
                }
                if (y1Var4 != null) {
                    arrayList2.add(y1Var4);
                }
                y1Var2 = null;
                y1Var3 = null;
            }
            if (z15 && z11) {
                y1Var2 = new y1(min, width3, width2);
            }
            i13++;
            i12 = i14;
            f11 = f10;
        }
        float f15 = f11;
        int i18 = i12;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        int i19 = 0;
        y1 y1Var5 = null;
        y1 y1Var6 = null;
        while (i19 < height3) {
            float f16 = f12;
            int height4 = i19 / createBitmap.getHeight();
            y1 y1Var7 = y1Var5;
            int height5 = i19 - (createBitmap.getHeight() * height4);
            boolean z16 = iArr[(createBitmap.getWidth() * height5) + height4] != 0;
            if (z16) {
                bitmap = createBitmap;
            } else {
                int width4 = (createBitmap.getWidth() * (height5 - 1)) + height4;
                bitmap = createBitmap;
                int width5 = (createBitmap.getWidth() * (height5 + 1)) + height4;
                boolean z17 = width4 >= 0;
                boolean z18 = width5 < height3;
                if (z17 && iArr[width4] != 0) {
                    y1Var6 = new y1(min, height4, height5);
                }
                if (y1Var7 == null && z18 && iArr[width5] != 0) {
                    y1Var = new y1(min, height4, height5);
                    int i20 = height3;
                    z10 = height5 != bitmap.getHeight() + (-1);
                    boolean z19 = height5 != 0;
                    if (z10) {
                        if (z16) {
                            y1Var6 = new y1(min, height4, height5);
                        }
                        if (y1Var != null) {
                            arrayList3.add(y1Var);
                        }
                        if (y1Var6 != null) {
                            arrayList4.add(y1Var6);
                        }
                        y1Var = null;
                        y1Var6 = null;
                    }
                    y1Var5 = (z19 || !z16) ? y1Var : new y1(min, height4, height5);
                    i19++;
                    f12 = f16;
                    createBitmap = bitmap;
                    height3 = i20;
                }
            }
            y1Var = y1Var7;
            int i202 = height3;
            if (height5 != bitmap.getHeight() + (-1)) {
            }
            if (height5 != 0) {
            }
            if (z10) {
            }
            if (z19) {
            }
            i19++;
            f12 = f16;
            createBitmap = bitmap;
            height3 = i202;
        }
        float f17 = f12;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Collections.reverse(arrayList2);
        Collections.reverse(arrayList3);
        linkedHashSet2.addAll(arrayList);
        linkedHashSet2.addAll(arrayList2);
        linkedHashSet.addAll(arrayList4);
        linkedHashSet.addAll(arrayList3);
        List k10 = k(new ArrayList(linkedHashSet));
        List k11 = k(new ArrayList(linkedHashSet2));
        Path path2 = new Path();
        int i21 = 0;
        while (true) {
            ArrayList arrayList5 = (ArrayList) k11;
            if (i21 >= arrayList5.size()) {
                break;
            }
            y1 y1Var8 = (y1) arrayList5.get(i21);
            if (path2.isEmpty()) {
                path2.moveTo(((Point) y1Var8).x, ((Point) y1Var8).y);
            } else {
                path2.lineTo(((Point) y1Var8).x, ((Point) y1Var8).y);
            }
            i21 += 2;
        }
        Path path3 = new Path();
        int i22 = 0;
        while (true) {
            ArrayList arrayList6 = (ArrayList) k10;
            if (i22 >= arrayList6.size()) {
                break;
            }
            y1 y1Var9 = (y1) arrayList6.get(i22);
            if (path3.isEmpty()) {
                path3.moveTo(((Point) y1Var9).x, ((Point) y1Var9).y);
            } else {
                path3.lineTo(((Point) y1Var9).x, ((Point) y1Var9).y);
            }
            i22 += 2;
        }
        path.reset();
        path.op(path2, path3, Path.Op.INTERSECT);
        float min2 = Math.min(f13 / f15, f14 / f17);
        float f18 = f15 * min2;
        z1Var.j = f18;
        float f19 = min2 * f17;
        z1Var.k = f19;
        path.offset((-f18) / 2.0f, (-f19) / 2.0f);
        Paint paint = z1Var.r;
        Paint paint2 = z1Var.q;
        Paint paint3 = z1Var.p;
        Paint paint4 = z1Var.s;
        PathMeasure pathMeasure = new PathMeasure();
        pathMeasure.setPath(path, true);
        float length = pathMeasure.getLength();
        int ceil = (int) Math.ceil(length / org.telegram.messenger.g0.L(2.0f));
        z1Var.n = ceil;
        z1Var.o = new float[ceil * 2];
        float[] fArr = new float[i18];
        int i23 = 0;
        while (true) {
            int i24 = z1Var.n;
            if (i23 >= i24) {
                paint3.setStyle(Paint.Style.FILL);
                paint3.setColor(-1);
                Paint.Join join = Paint.Join.ROUND;
                paint3.setStrokeJoin(join);
                Paint.Cap cap = Paint.Cap.ROUND;
                paint3.setStrokeCap(cap);
                paint3.setPathEffect(new CornerPathEffect(org.telegram.messenger.g0.L(10.0f)));
                Paint.Style style = Paint.Style.STROKE;
                paint2.setStyle(style);
                paint2.setColor(-1);
                paint2.setStrokeJoin(join);
                paint2.setStrokeCap(cap);
                paint2.setPathEffect(new CornerPathEffect(org.telegram.messenger.g0.L(10.0f)));
                paint.setStyle(style);
                paint.setStrokeWidth(org.telegram.messenger.g0.L(4.0f));
                paint.setColor(-1);
                paint.setStrokeCap(cap);
                float L = org.telegram.messenger.g0.L(0.33f);
                BlurMaskFilter.Blur blur = BlurMaskFilter.Blur.NORMAL;
                paint.setMaskFilter(new BlurMaskFilter(L, blur));
                paint4.setStyle(style);
                paint4.setColor(k6.r1(0.04f, -1));
                paint4.setStrokeCap(cap);
                paint4.setStrokeWidth(org.telegram.messenger.g0.L(20.0f));
                paint4.setColor(k6.r1(0.04f, -1));
                paint4.setMaskFilter(new BlurMaskFilter(org.telegram.messenger.g0.L(60.0f), blur));
                return;
            }
            pathMeasure.getPosTan(((i23 / i24) * length) % length, fArr, null);
            float[] fArr2 = z1Var.o;
            int i25 = i23 * 2;
            fArr2[i25] = fArr[0];
            fArr2[i25 + 1] = fArr[1];
            i23++;
        }
    }

    public static List k(ArrayList arrayList) {
        if (arrayList.size() < 3) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add((y1) arrayList.get(0));
        int i3 = 1;
        while (i3 < arrayList.size() - 1) {
            y1 y1Var = (y1) arrayList.get(i3 - 1);
            y1 y1Var2 = (y1) arrayList.get(i3);
            i3++;
            y1 y1Var3 = (y1) arrayList.get(i3);
            int i10 = ((Point) y1Var2).x;
            int i11 = ((Point) y1Var).x;
            int i12 = ((Point) y1Var3).y;
            int i13 = ((Point) y1Var).y;
            if (Math.abs((((i12 - i13) * (i10 - i11)) - ((((Point) y1Var3).x - i11) * (((Point) y1Var2).y - i13))) - (-1.0f)) >= 0.15f) {
                arrayList2.add(y1Var2);
            }
        }
        arrayList2.add((y1) k2.p1.h(1, arrayList));
        return arrayList2;
    }

    public final void a() {
        final a2 a2Var = this.a0;
        if (a2Var == null) {
            return;
        }
        final int i3 = h10.t0;
        final int i10 = 1;
        a2Var.o = true;
        if (a2Var.m != null) {
            h();
            a2Var.m.a(a2Var.b, a2Var.e.document);
            org.telegram.messenger.g0.i3(new hb1(17), 250L);
            return;
        }
        final int i11 = 0;
        if (a2Var.k != null) {
            TLRPC.TL_stickers_replaceSticker tL_stickers_replaceSticker = new TLRPC.TL_stickers_replaceSticker();
            tL_stickers_replaceSticker.sticker = li.a0(a2Var.k, a2Var.c).document;
            tL_stickers_replaceSticker.new_sticker = a2Var.e;
            ConnectionsManager.getInstance(i3).sendRequest(tL_stickers_replaceSticker, new RequestDelegate(this) { // from class: ug.u1
                public final /* synthetic */ c2 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (i11) {
                        case 0:
                            final int i12 = 0;
                            final c2 c2Var = this.b;
                            final int i13 = i3;
                            final a2 a2Var2 = a2Var;
                            org.telegram.messenger.g0.h3(new Runnable() { // from class: ug.v1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean z10;
                                    boolean z11;
                                    boolean z12;
                                    switch (i12) {
                                        case 0:
                                            final TLObject tLObject2 = tLObject;
                                            boolean z13 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                            final c2 c2Var2 = c2Var;
                                            final a2 a2Var3 = a2Var2;
                                            if (z13) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                int i14 = i13;
                                                z10 = true;
                                                li.b0(i14).I1(tL_messages_stickerSet, true);
                                                if (!li.b0(i14).B0(tL_messages_stickerSet.set.id, true)) {
                                                    li.b0(i14).f2(null, tLObject2, 2, null, false, false);
                                                }
                                                gi.s0 s0Var = c2Var2.e0;
                                                if (s0Var != null) {
                                                    s0Var.setProgress(1.0f);
                                                }
                                                final int i15 = 1;
                                                org.telegram.messenger.g0.i3(new Runnable() { // from class: ug.w1
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i16 = i15;
                                                        a2 a2Var4 = a2Var3;
                                                        TLObject tLObject3 = tLObject2;
                                                        c2 c2Var3 = c2Var2;
                                                        switch (i16) {
                                                            case 0:
                                                                hs f10 = hs.f(h10.t0);
                                                                TLRPC.Document document = a2Var4.f.document;
                                                                String str = a2Var4.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                f10.m(hs.s3, bool, tLObject3, document, str, bool);
                                                                c2Var3.h();
                                                                break;
                                                            case 1:
                                                                hs.f(h10.t0).m(hs.s3, Boolean.FALSE, tLObject3, a2Var4.f.document, a2Var4.l, Boolean.TRUE);
                                                                c2Var3.h();
                                                                break;
                                                            default:
                                                                hs f11 = hs.f(h10.t0);
                                                                TLRPC.Document document2 = a2Var4.f.document;
                                                                String str2 = a2Var4.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                f11.m(hs.s3, bool2, tLObject3, document2, str2, bool2);
                                                                c2Var3.h();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                            } else {
                                                c2Var2.n(tL_error);
                                                c2Var2.h();
                                                z10 = false;
                                            }
                                            u10 u10Var = a2Var3.n;
                                            if (u10Var != null) {
                                                u10Var.a(Boolean.valueOf(z10));
                                                a2Var3.n = null;
                                                break;
                                            }
                                            break;
                                        case 1:
                                            final TLObject tLObject3 = tLObject;
                                            boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                            final c2 c2Var3 = c2Var;
                                            final a2 a2Var4 = a2Var2;
                                            if (z14) {
                                                int i16 = i13;
                                                z11 = true;
                                                li.b0(i16).I1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                li.b0(i16).f2(null, tLObject3, 2, null, false, false);
                                                gi.s0 s0Var2 = c2Var3.e0;
                                                if (s0Var2 != null) {
                                                    s0Var2.setProgress(1.0f);
                                                }
                                                final int i17 = 0;
                                                org.telegram.messenger.g0.i3(new Runnable() { // from class: ug.w1
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i162 = i17;
                                                        a2 a2Var42 = a2Var4;
                                                        TLObject tLObject32 = tLObject3;
                                                        c2 c2Var32 = c2Var3;
                                                        switch (i162) {
                                                            case 0:
                                                                hs f10 = hs.f(h10.t0);
                                                                TLRPC.Document document = a2Var42.f.document;
                                                                String str = a2Var42.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                f10.m(hs.s3, bool, tLObject32, document, str, bool);
                                                                c2Var32.h();
                                                                break;
                                                            case 1:
                                                                hs.f(h10.t0).m(hs.s3, Boolean.FALSE, tLObject32, a2Var42.f.document, a2Var42.l, Boolean.TRUE);
                                                                c2Var32.h();
                                                                break;
                                                            default:
                                                                hs f11 = hs.f(h10.t0);
                                                                TLRPC.Document document2 = a2Var42.f.document;
                                                                String str2 = a2Var42.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                f11.m(hs.s3, bool2, tLObject32, document2, str2, bool2);
                                                                c2Var32.h();
                                                                break;
                                                        }
                                                    }
                                                }, 250L);
                                            } else {
                                                c2Var3.n(tL_error);
                                                c2Var3.h();
                                                z11 = false;
                                            }
                                            u10 u10Var2 = a2Var4.n;
                                            if (u10Var2 != null) {
                                                u10Var2.a(Boolean.valueOf(z11));
                                                a2Var4.n = null;
                                                break;
                                            }
                                            break;
                                        default:
                                            final TLObject tLObject4 = tLObject;
                                            boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                            final c2 c2Var4 = c2Var;
                                            final a2 a2Var5 = a2Var2;
                                            if (z15) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                int i18 = i13;
                                                z12 = true;
                                                li.b0(i18).I1(tL_messages_stickerSet2, true);
                                                if (!li.b0(i18).B0(tL_messages_stickerSet2.set.id, true)) {
                                                    li.b0(i18).f2(null, tLObject4, 2, null, false, false);
                                                }
                                                gi.s0 s0Var3 = c2Var4.e0;
                                                if (s0Var3 != null) {
                                                    s0Var3.setProgress(1.0f);
                                                }
                                                final int i19 = 2;
                                                org.telegram.messenger.g0.i3(new Runnable() { // from class: ug.w1
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i162 = i19;
                                                        a2 a2Var42 = a2Var5;
                                                        TLObject tLObject32 = tLObject4;
                                                        c2 c2Var32 = c2Var4;
                                                        switch (i162) {
                                                            case 0:
                                                                hs f10 = hs.f(h10.t0);
                                                                TLRPC.Document document = a2Var42.f.document;
                                                                String str = a2Var42.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                f10.m(hs.s3, bool, tLObject32, document, str, bool);
                                                                c2Var32.h();
                                                                break;
                                                            case 1:
                                                                hs.f(h10.t0).m(hs.s3, Boolean.FALSE, tLObject32, a2Var42.f.document, a2Var42.l, Boolean.TRUE);
                                                                c2Var32.h();
                                                                break;
                                                            default:
                                                                hs f11 = hs.f(h10.t0);
                                                                TLRPC.Document document2 = a2Var42.f.document;
                                                                String str2 = a2Var42.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                f11.m(hs.s3, bool2, tLObject32, document2, str2, bool2);
                                                                c2Var32.h();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                            } else {
                                                c2Var4.n(tL_error);
                                                c2Var4.h();
                                                z12 = false;
                                            }
                                            u10 u10Var3 = a2Var5.n;
                                            if (u10Var3 != null) {
                                                u10Var3.a(Boolean.valueOf(z12));
                                                a2Var5.n = null;
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                        case 1:
                            final int i14 = 1;
                            final c2 c2Var2 = this.b;
                            final int i15 = i3;
                            final a2 a2Var3 = a2Var;
                            org.telegram.messenger.g0.h3(new Runnable() { // from class: ug.v1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean z10;
                                    boolean z11;
                                    boolean z12;
                                    switch (i14) {
                                        case 0:
                                            final TLObject tLObject2 = tLObject;
                                            boolean z13 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                            final c2 c2Var22 = c2Var2;
                                            final a2 a2Var32 = a2Var3;
                                            if (z13) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                int i142 = i15;
                                                z10 = true;
                                                li.b0(i142).I1(tL_messages_stickerSet, true);
                                                if (!li.b0(i142).B0(tL_messages_stickerSet.set.id, true)) {
                                                    li.b0(i142).f2(null, tLObject2, 2, null, false, false);
                                                }
                                                gi.s0 s0Var = c2Var22.e0;
                                                if (s0Var != null) {
                                                    s0Var.setProgress(1.0f);
                                                }
                                                final int i152 = 1;
                                                org.telegram.messenger.g0.i3(new Runnable() { // from class: ug.w1
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i162 = i152;
                                                        a2 a2Var42 = a2Var32;
                                                        TLObject tLObject32 = tLObject2;
                                                        c2 c2Var32 = c2Var22;
                                                        switch (i162) {
                                                            case 0:
                                                                hs f10 = hs.f(h10.t0);
                                                                TLRPC.Document document = a2Var42.f.document;
                                                                String str = a2Var42.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                f10.m(hs.s3, bool, tLObject32, document, str, bool);
                                                                c2Var32.h();
                                                                break;
                                                            case 1:
                                                                hs.f(h10.t0).m(hs.s3, Boolean.FALSE, tLObject32, a2Var42.f.document, a2Var42.l, Boolean.TRUE);
                                                                c2Var32.h();
                                                                break;
                                                            default:
                                                                hs f11 = hs.f(h10.t0);
                                                                TLRPC.Document document2 = a2Var42.f.document;
                                                                String str2 = a2Var42.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                f11.m(hs.s3, bool2, tLObject32, document2, str2, bool2);
                                                                c2Var32.h();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                            } else {
                                                c2Var22.n(tL_error);
                                                c2Var22.h();
                                                z10 = false;
                                            }
                                            u10 u10Var = a2Var32.n;
                                            if (u10Var != null) {
                                                u10Var.a(Boolean.valueOf(z10));
                                                a2Var32.n = null;
                                                break;
                                            }
                                            break;
                                        case 1:
                                            final TLObject tLObject3 = tLObject;
                                            boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                            final c2 c2Var3 = c2Var2;
                                            final a2 a2Var4 = a2Var3;
                                            if (z14) {
                                                int i16 = i15;
                                                z11 = true;
                                                li.b0(i16).I1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                li.b0(i16).f2(null, tLObject3, 2, null, false, false);
                                                gi.s0 s0Var2 = c2Var3.e0;
                                                if (s0Var2 != null) {
                                                    s0Var2.setProgress(1.0f);
                                                }
                                                final int i17 = 0;
                                                org.telegram.messenger.g0.i3(new Runnable() { // from class: ug.w1
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i162 = i17;
                                                        a2 a2Var42 = a2Var4;
                                                        TLObject tLObject32 = tLObject3;
                                                        c2 c2Var32 = c2Var3;
                                                        switch (i162) {
                                                            case 0:
                                                                hs f10 = hs.f(h10.t0);
                                                                TLRPC.Document document = a2Var42.f.document;
                                                                String str = a2Var42.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                f10.m(hs.s3, bool, tLObject32, document, str, bool);
                                                                c2Var32.h();
                                                                break;
                                                            case 1:
                                                                hs.f(h10.t0).m(hs.s3, Boolean.FALSE, tLObject32, a2Var42.f.document, a2Var42.l, Boolean.TRUE);
                                                                c2Var32.h();
                                                                break;
                                                            default:
                                                                hs f11 = hs.f(h10.t0);
                                                                TLRPC.Document document2 = a2Var42.f.document;
                                                                String str2 = a2Var42.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                f11.m(hs.s3, bool2, tLObject32, document2, str2, bool2);
                                                                c2Var32.h();
                                                                break;
                                                        }
                                                    }
                                                }, 250L);
                                            } else {
                                                c2Var3.n(tL_error);
                                                c2Var3.h();
                                                z11 = false;
                                            }
                                            u10 u10Var2 = a2Var4.n;
                                            if (u10Var2 != null) {
                                                u10Var2.a(Boolean.valueOf(z11));
                                                a2Var4.n = null;
                                                break;
                                            }
                                            break;
                                        default:
                                            final TLObject tLObject4 = tLObject;
                                            boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                            final c2 c2Var4 = c2Var2;
                                            final a2 a2Var5 = a2Var3;
                                            if (z15) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                int i18 = i15;
                                                z12 = true;
                                                li.b0(i18).I1(tL_messages_stickerSet2, true);
                                                if (!li.b0(i18).B0(tL_messages_stickerSet2.set.id, true)) {
                                                    li.b0(i18).f2(null, tLObject4, 2, null, false, false);
                                                }
                                                gi.s0 s0Var3 = c2Var4.e0;
                                                if (s0Var3 != null) {
                                                    s0Var3.setProgress(1.0f);
                                                }
                                                final int i19 = 2;
                                                org.telegram.messenger.g0.i3(new Runnable() { // from class: ug.w1
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i162 = i19;
                                                        a2 a2Var42 = a2Var5;
                                                        TLObject tLObject32 = tLObject4;
                                                        c2 c2Var32 = c2Var4;
                                                        switch (i162) {
                                                            case 0:
                                                                hs f10 = hs.f(h10.t0);
                                                                TLRPC.Document document = a2Var42.f.document;
                                                                String str = a2Var42.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                f10.m(hs.s3, bool, tLObject32, document, str, bool);
                                                                c2Var32.h();
                                                                break;
                                                            case 1:
                                                                hs.f(h10.t0).m(hs.s3, Boolean.FALSE, tLObject32, a2Var42.f.document, a2Var42.l, Boolean.TRUE);
                                                                c2Var32.h();
                                                                break;
                                                            default:
                                                                hs f11 = hs.f(h10.t0);
                                                                TLRPC.Document document2 = a2Var42.f.document;
                                                                String str2 = a2Var42.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                f11.m(hs.s3, bool2, tLObject32, document2, str2, bool2);
                                                                c2Var32.h();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                            } else {
                                                c2Var4.n(tL_error);
                                                c2Var4.h();
                                                z12 = false;
                                            }
                                            u10 u10Var3 = a2Var5.n;
                                            if (u10Var3 != null) {
                                                u10Var3.a(Boolean.valueOf(z12));
                                                a2Var5.n = null;
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                        default:
                            final int i16 = 2;
                            final c2 c2Var3 = this.b;
                            final int i17 = i3;
                            final a2 a2Var4 = a2Var;
                            org.telegram.messenger.g0.h3(new Runnable() { // from class: ug.v1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean z10;
                                    boolean z11;
                                    boolean z12;
                                    switch (i16) {
                                        case 0:
                                            final TLObject tLObject2 = tLObject;
                                            boolean z13 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                            final c2 c2Var22 = c2Var3;
                                            final a2 a2Var32 = a2Var4;
                                            if (z13) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                int i142 = i17;
                                                z10 = true;
                                                li.b0(i142).I1(tL_messages_stickerSet, true);
                                                if (!li.b0(i142).B0(tL_messages_stickerSet.set.id, true)) {
                                                    li.b0(i142).f2(null, tLObject2, 2, null, false, false);
                                                }
                                                gi.s0 s0Var = c2Var22.e0;
                                                if (s0Var != null) {
                                                    s0Var.setProgress(1.0f);
                                                }
                                                final int i152 = 1;
                                                org.telegram.messenger.g0.i3(new Runnable() { // from class: ug.w1
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i162 = i152;
                                                        a2 a2Var42 = a2Var32;
                                                        TLObject tLObject32 = tLObject2;
                                                        c2 c2Var32 = c2Var22;
                                                        switch (i162) {
                                                            case 0:
                                                                hs f10 = hs.f(h10.t0);
                                                                TLRPC.Document document = a2Var42.f.document;
                                                                String str = a2Var42.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                f10.m(hs.s3, bool, tLObject32, document, str, bool);
                                                                c2Var32.h();
                                                                break;
                                                            case 1:
                                                                hs.f(h10.t0).m(hs.s3, Boolean.FALSE, tLObject32, a2Var42.f.document, a2Var42.l, Boolean.TRUE);
                                                                c2Var32.h();
                                                                break;
                                                            default:
                                                                hs f11 = hs.f(h10.t0);
                                                                TLRPC.Document document2 = a2Var42.f.document;
                                                                String str2 = a2Var42.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                f11.m(hs.s3, bool2, tLObject32, document2, str2, bool2);
                                                                c2Var32.h();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                            } else {
                                                c2Var22.n(tL_error);
                                                c2Var22.h();
                                                z10 = false;
                                            }
                                            u10 u10Var = a2Var32.n;
                                            if (u10Var != null) {
                                                u10Var.a(Boolean.valueOf(z10));
                                                a2Var32.n = null;
                                                break;
                                            }
                                            break;
                                        case 1:
                                            final TLObject tLObject3 = tLObject;
                                            boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                            final c2 c2Var32 = c2Var3;
                                            final a2 a2Var42 = a2Var4;
                                            if (z14) {
                                                int i162 = i17;
                                                z11 = true;
                                                li.b0(i162).I1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                li.b0(i162).f2(null, tLObject3, 2, null, false, false);
                                                gi.s0 s0Var2 = c2Var32.e0;
                                                if (s0Var2 != null) {
                                                    s0Var2.setProgress(1.0f);
                                                }
                                                final int i172 = 0;
                                                org.telegram.messenger.g0.i3(new Runnable() { // from class: ug.w1
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i1622 = i172;
                                                        a2 a2Var422 = a2Var42;
                                                        TLObject tLObject32 = tLObject3;
                                                        c2 c2Var322 = c2Var32;
                                                        switch (i1622) {
                                                            case 0:
                                                                hs f10 = hs.f(h10.t0);
                                                                TLRPC.Document document = a2Var422.f.document;
                                                                String str = a2Var422.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                f10.m(hs.s3, bool, tLObject32, document, str, bool);
                                                                c2Var322.h();
                                                                break;
                                                            case 1:
                                                                hs.f(h10.t0).m(hs.s3, Boolean.FALSE, tLObject32, a2Var422.f.document, a2Var422.l, Boolean.TRUE);
                                                                c2Var322.h();
                                                                break;
                                                            default:
                                                                hs f11 = hs.f(h10.t0);
                                                                TLRPC.Document document2 = a2Var422.f.document;
                                                                String str2 = a2Var422.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                f11.m(hs.s3, bool2, tLObject32, document2, str2, bool2);
                                                                c2Var322.h();
                                                                break;
                                                        }
                                                    }
                                                }, 250L);
                                            } else {
                                                c2Var32.n(tL_error);
                                                c2Var32.h();
                                                z11 = false;
                                            }
                                            u10 u10Var2 = a2Var42.n;
                                            if (u10Var2 != null) {
                                                u10Var2.a(Boolean.valueOf(z11));
                                                a2Var42.n = null;
                                                break;
                                            }
                                            break;
                                        default:
                                            final TLObject tLObject4 = tLObject;
                                            boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                            final c2 c2Var4 = c2Var3;
                                            final a2 a2Var5 = a2Var4;
                                            if (z15) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                int i18 = i17;
                                                z12 = true;
                                                li.b0(i18).I1(tL_messages_stickerSet2, true);
                                                if (!li.b0(i18).B0(tL_messages_stickerSet2.set.id, true)) {
                                                    li.b0(i18).f2(null, tLObject4, 2, null, false, false);
                                                }
                                                gi.s0 s0Var3 = c2Var4.e0;
                                                if (s0Var3 != null) {
                                                    s0Var3.setProgress(1.0f);
                                                }
                                                final int i19 = 2;
                                                org.telegram.messenger.g0.i3(new Runnable() { // from class: ug.w1
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i1622 = i19;
                                                        a2 a2Var422 = a2Var5;
                                                        TLObject tLObject32 = tLObject4;
                                                        c2 c2Var322 = c2Var4;
                                                        switch (i1622) {
                                                            case 0:
                                                                hs f10 = hs.f(h10.t0);
                                                                TLRPC.Document document = a2Var422.f.document;
                                                                String str = a2Var422.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                f10.m(hs.s3, bool, tLObject32, document, str, bool);
                                                                c2Var322.h();
                                                                break;
                                                            case 1:
                                                                hs.f(h10.t0).m(hs.s3, Boolean.FALSE, tLObject32, a2Var422.f.document, a2Var422.l, Boolean.TRUE);
                                                                c2Var322.h();
                                                                break;
                                                            default:
                                                                hs f11 = hs.f(h10.t0);
                                                                TLRPC.Document document2 = a2Var422.f.document;
                                                                String str2 = a2Var422.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                f11.m(hs.s3, bool2, tLObject32, document2, str2, bool2);
                                                                c2Var322.h();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                            } else {
                                                c2Var4.n(tL_error);
                                                c2Var4.h();
                                                z12 = false;
                                            }
                                            u10 u10Var3 = a2Var5.n;
                                            if (u10Var3 != null) {
                                                u10Var3.a(Boolean.valueOf(z12));
                                                a2Var5.n = null;
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                    }
                }
            });
            return;
        }
        if (a2Var.d != null) {
            TLRPC.TL_stickers_createStickerSet tL_stickers_createStickerSet = new TLRPC.TL_stickers_createStickerSet();
            tL_stickers_createStickerSet.user_id = new TLRPC.TL_inputUserSelf();
            tL_stickers_createStickerSet.title = a2Var.d.toString();
            tL_stickers_createStickerSet.short_name = "";
            tL_stickers_createStickerSet.stickers.add(a2Var.e);
            ConnectionsManager.getInstance(i3).sendRequest(tL_stickers_createStickerSet, new RequestDelegate(this) { // from class: ug.u1
                public final /* synthetic */ c2 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (i10) {
                        case 0:
                            final int i12 = 0;
                            final c2 c2Var = this.b;
                            final int i13 = i3;
                            final a2 a2Var2 = a2Var;
                            org.telegram.messenger.g0.h3(new Runnable() { // from class: ug.v1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean z10;
                                    boolean z11;
                                    boolean z12;
                                    switch (i12) {
                                        case 0:
                                            final TLObject tLObject2 = tLObject;
                                            boolean z13 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                            final c2 c2Var22 = c2Var;
                                            final a2 a2Var32 = a2Var2;
                                            if (z13) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                int i142 = i13;
                                                z10 = true;
                                                li.b0(i142).I1(tL_messages_stickerSet, true);
                                                if (!li.b0(i142).B0(tL_messages_stickerSet.set.id, true)) {
                                                    li.b0(i142).f2(null, tLObject2, 2, null, false, false);
                                                }
                                                gi.s0 s0Var = c2Var22.e0;
                                                if (s0Var != null) {
                                                    s0Var.setProgress(1.0f);
                                                }
                                                final int i152 = 1;
                                                org.telegram.messenger.g0.i3(new Runnable() { // from class: ug.w1
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i1622 = i152;
                                                        a2 a2Var422 = a2Var32;
                                                        TLObject tLObject32 = tLObject2;
                                                        c2 c2Var322 = c2Var22;
                                                        switch (i1622) {
                                                            case 0:
                                                                hs f10 = hs.f(h10.t0);
                                                                TLRPC.Document document = a2Var422.f.document;
                                                                String str = a2Var422.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                f10.m(hs.s3, bool, tLObject32, document, str, bool);
                                                                c2Var322.h();
                                                                break;
                                                            case 1:
                                                                hs.f(h10.t0).m(hs.s3, Boolean.FALSE, tLObject32, a2Var422.f.document, a2Var422.l, Boolean.TRUE);
                                                                c2Var322.h();
                                                                break;
                                                            default:
                                                                hs f11 = hs.f(h10.t0);
                                                                TLRPC.Document document2 = a2Var422.f.document;
                                                                String str2 = a2Var422.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                f11.m(hs.s3, bool2, tLObject32, document2, str2, bool2);
                                                                c2Var322.h();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                            } else {
                                                c2Var22.n(tL_error);
                                                c2Var22.h();
                                                z10 = false;
                                            }
                                            u10 u10Var = a2Var32.n;
                                            if (u10Var != null) {
                                                u10Var.a(Boolean.valueOf(z10));
                                                a2Var32.n = null;
                                                break;
                                            }
                                            break;
                                        case 1:
                                            final TLObject tLObject3 = tLObject;
                                            boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                            final c2 c2Var32 = c2Var;
                                            final a2 a2Var42 = a2Var2;
                                            if (z14) {
                                                int i162 = i13;
                                                z11 = true;
                                                li.b0(i162).I1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                li.b0(i162).f2(null, tLObject3, 2, null, false, false);
                                                gi.s0 s0Var2 = c2Var32.e0;
                                                if (s0Var2 != null) {
                                                    s0Var2.setProgress(1.0f);
                                                }
                                                final int i172 = 0;
                                                org.telegram.messenger.g0.i3(new Runnable() { // from class: ug.w1
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i1622 = i172;
                                                        a2 a2Var422 = a2Var42;
                                                        TLObject tLObject32 = tLObject3;
                                                        c2 c2Var322 = c2Var32;
                                                        switch (i1622) {
                                                            case 0:
                                                                hs f10 = hs.f(h10.t0);
                                                                TLRPC.Document document = a2Var422.f.document;
                                                                String str = a2Var422.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                f10.m(hs.s3, bool, tLObject32, document, str, bool);
                                                                c2Var322.h();
                                                                break;
                                                            case 1:
                                                                hs.f(h10.t0).m(hs.s3, Boolean.FALSE, tLObject32, a2Var422.f.document, a2Var422.l, Boolean.TRUE);
                                                                c2Var322.h();
                                                                break;
                                                            default:
                                                                hs f11 = hs.f(h10.t0);
                                                                TLRPC.Document document2 = a2Var422.f.document;
                                                                String str2 = a2Var422.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                f11.m(hs.s3, bool2, tLObject32, document2, str2, bool2);
                                                                c2Var322.h();
                                                                break;
                                                        }
                                                    }
                                                }, 250L);
                                            } else {
                                                c2Var32.n(tL_error);
                                                c2Var32.h();
                                                z11 = false;
                                            }
                                            u10 u10Var2 = a2Var42.n;
                                            if (u10Var2 != null) {
                                                u10Var2.a(Boolean.valueOf(z11));
                                                a2Var42.n = null;
                                                break;
                                            }
                                            break;
                                        default:
                                            final TLObject tLObject4 = tLObject;
                                            boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                            final c2 c2Var4 = c2Var;
                                            final a2 a2Var5 = a2Var2;
                                            if (z15) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                int i18 = i13;
                                                z12 = true;
                                                li.b0(i18).I1(tL_messages_stickerSet2, true);
                                                if (!li.b0(i18).B0(tL_messages_stickerSet2.set.id, true)) {
                                                    li.b0(i18).f2(null, tLObject4, 2, null, false, false);
                                                }
                                                gi.s0 s0Var3 = c2Var4.e0;
                                                if (s0Var3 != null) {
                                                    s0Var3.setProgress(1.0f);
                                                }
                                                final int i19 = 2;
                                                org.telegram.messenger.g0.i3(new Runnable() { // from class: ug.w1
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i1622 = i19;
                                                        a2 a2Var422 = a2Var5;
                                                        TLObject tLObject32 = tLObject4;
                                                        c2 c2Var322 = c2Var4;
                                                        switch (i1622) {
                                                            case 0:
                                                                hs f10 = hs.f(h10.t0);
                                                                TLRPC.Document document = a2Var422.f.document;
                                                                String str = a2Var422.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                f10.m(hs.s3, bool, tLObject32, document, str, bool);
                                                                c2Var322.h();
                                                                break;
                                                            case 1:
                                                                hs.f(h10.t0).m(hs.s3, Boolean.FALSE, tLObject32, a2Var422.f.document, a2Var422.l, Boolean.TRUE);
                                                                c2Var322.h();
                                                                break;
                                                            default:
                                                                hs f11 = hs.f(h10.t0);
                                                                TLRPC.Document document2 = a2Var422.f.document;
                                                                String str2 = a2Var422.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                f11.m(hs.s3, bool2, tLObject32, document2, str2, bool2);
                                                                c2Var322.h();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                            } else {
                                                c2Var4.n(tL_error);
                                                c2Var4.h();
                                                z12 = false;
                                            }
                                            u10 u10Var3 = a2Var5.n;
                                            if (u10Var3 != null) {
                                                u10Var3.a(Boolean.valueOf(z12));
                                                a2Var5.n = null;
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                        case 1:
                            final int i14 = 1;
                            final c2 c2Var2 = this.b;
                            final int i15 = i3;
                            final a2 a2Var3 = a2Var;
                            org.telegram.messenger.g0.h3(new Runnable() { // from class: ug.v1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean z10;
                                    boolean z11;
                                    boolean z12;
                                    switch (i14) {
                                        case 0:
                                            final TLObject tLObject2 = tLObject;
                                            boolean z13 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                            final c2 c2Var22 = c2Var2;
                                            final a2 a2Var32 = a2Var3;
                                            if (z13) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                int i142 = i15;
                                                z10 = true;
                                                li.b0(i142).I1(tL_messages_stickerSet, true);
                                                if (!li.b0(i142).B0(tL_messages_stickerSet.set.id, true)) {
                                                    li.b0(i142).f2(null, tLObject2, 2, null, false, false);
                                                }
                                                gi.s0 s0Var = c2Var22.e0;
                                                if (s0Var != null) {
                                                    s0Var.setProgress(1.0f);
                                                }
                                                final int i152 = 1;
                                                org.telegram.messenger.g0.i3(new Runnable() { // from class: ug.w1
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i1622 = i152;
                                                        a2 a2Var422 = a2Var32;
                                                        TLObject tLObject32 = tLObject2;
                                                        c2 c2Var322 = c2Var22;
                                                        switch (i1622) {
                                                            case 0:
                                                                hs f10 = hs.f(h10.t0);
                                                                TLRPC.Document document = a2Var422.f.document;
                                                                String str = a2Var422.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                f10.m(hs.s3, bool, tLObject32, document, str, bool);
                                                                c2Var322.h();
                                                                break;
                                                            case 1:
                                                                hs.f(h10.t0).m(hs.s3, Boolean.FALSE, tLObject32, a2Var422.f.document, a2Var422.l, Boolean.TRUE);
                                                                c2Var322.h();
                                                                break;
                                                            default:
                                                                hs f11 = hs.f(h10.t0);
                                                                TLRPC.Document document2 = a2Var422.f.document;
                                                                String str2 = a2Var422.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                f11.m(hs.s3, bool2, tLObject32, document2, str2, bool2);
                                                                c2Var322.h();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                            } else {
                                                c2Var22.n(tL_error);
                                                c2Var22.h();
                                                z10 = false;
                                            }
                                            u10 u10Var = a2Var32.n;
                                            if (u10Var != null) {
                                                u10Var.a(Boolean.valueOf(z10));
                                                a2Var32.n = null;
                                                break;
                                            }
                                            break;
                                        case 1:
                                            final TLObject tLObject3 = tLObject;
                                            boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                            final c2 c2Var32 = c2Var2;
                                            final a2 a2Var42 = a2Var3;
                                            if (z14) {
                                                int i162 = i15;
                                                z11 = true;
                                                li.b0(i162).I1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                li.b0(i162).f2(null, tLObject3, 2, null, false, false);
                                                gi.s0 s0Var2 = c2Var32.e0;
                                                if (s0Var2 != null) {
                                                    s0Var2.setProgress(1.0f);
                                                }
                                                final int i172 = 0;
                                                org.telegram.messenger.g0.i3(new Runnable() { // from class: ug.w1
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i1622 = i172;
                                                        a2 a2Var422 = a2Var42;
                                                        TLObject tLObject32 = tLObject3;
                                                        c2 c2Var322 = c2Var32;
                                                        switch (i1622) {
                                                            case 0:
                                                                hs f10 = hs.f(h10.t0);
                                                                TLRPC.Document document = a2Var422.f.document;
                                                                String str = a2Var422.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                f10.m(hs.s3, bool, tLObject32, document, str, bool);
                                                                c2Var322.h();
                                                                break;
                                                            case 1:
                                                                hs.f(h10.t0).m(hs.s3, Boolean.FALSE, tLObject32, a2Var422.f.document, a2Var422.l, Boolean.TRUE);
                                                                c2Var322.h();
                                                                break;
                                                            default:
                                                                hs f11 = hs.f(h10.t0);
                                                                TLRPC.Document document2 = a2Var422.f.document;
                                                                String str2 = a2Var422.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                f11.m(hs.s3, bool2, tLObject32, document2, str2, bool2);
                                                                c2Var322.h();
                                                                break;
                                                        }
                                                    }
                                                }, 250L);
                                            } else {
                                                c2Var32.n(tL_error);
                                                c2Var32.h();
                                                z11 = false;
                                            }
                                            u10 u10Var2 = a2Var42.n;
                                            if (u10Var2 != null) {
                                                u10Var2.a(Boolean.valueOf(z11));
                                                a2Var42.n = null;
                                                break;
                                            }
                                            break;
                                        default:
                                            final TLObject tLObject4 = tLObject;
                                            boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                            final c2 c2Var4 = c2Var2;
                                            final a2 a2Var5 = a2Var3;
                                            if (z15) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                int i18 = i15;
                                                z12 = true;
                                                li.b0(i18).I1(tL_messages_stickerSet2, true);
                                                if (!li.b0(i18).B0(tL_messages_stickerSet2.set.id, true)) {
                                                    li.b0(i18).f2(null, tLObject4, 2, null, false, false);
                                                }
                                                gi.s0 s0Var3 = c2Var4.e0;
                                                if (s0Var3 != null) {
                                                    s0Var3.setProgress(1.0f);
                                                }
                                                final int i19 = 2;
                                                org.telegram.messenger.g0.i3(new Runnable() { // from class: ug.w1
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i1622 = i19;
                                                        a2 a2Var422 = a2Var5;
                                                        TLObject tLObject32 = tLObject4;
                                                        c2 c2Var322 = c2Var4;
                                                        switch (i1622) {
                                                            case 0:
                                                                hs f10 = hs.f(h10.t0);
                                                                TLRPC.Document document = a2Var422.f.document;
                                                                String str = a2Var422.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                f10.m(hs.s3, bool, tLObject32, document, str, bool);
                                                                c2Var322.h();
                                                                break;
                                                            case 1:
                                                                hs.f(h10.t0).m(hs.s3, Boolean.FALSE, tLObject32, a2Var422.f.document, a2Var422.l, Boolean.TRUE);
                                                                c2Var322.h();
                                                                break;
                                                            default:
                                                                hs f11 = hs.f(h10.t0);
                                                                TLRPC.Document document2 = a2Var422.f.document;
                                                                String str2 = a2Var422.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                f11.m(hs.s3, bool2, tLObject32, document2, str2, bool2);
                                                                c2Var322.h();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                            } else {
                                                c2Var4.n(tL_error);
                                                c2Var4.h();
                                                z12 = false;
                                            }
                                            u10 u10Var3 = a2Var5.n;
                                            if (u10Var3 != null) {
                                                u10Var3.a(Boolean.valueOf(z12));
                                                a2Var5.n = null;
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                        default:
                            final int i16 = 2;
                            final c2 c2Var3 = this.b;
                            final int i17 = i3;
                            final a2 a2Var4 = a2Var;
                            org.telegram.messenger.g0.h3(new Runnable() { // from class: ug.v1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean z10;
                                    boolean z11;
                                    boolean z12;
                                    switch (i16) {
                                        case 0:
                                            final TLObject tLObject2 = tLObject;
                                            boolean z13 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                            final c2 c2Var22 = c2Var3;
                                            final a2 a2Var32 = a2Var4;
                                            if (z13) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                int i142 = i17;
                                                z10 = true;
                                                li.b0(i142).I1(tL_messages_stickerSet, true);
                                                if (!li.b0(i142).B0(tL_messages_stickerSet.set.id, true)) {
                                                    li.b0(i142).f2(null, tLObject2, 2, null, false, false);
                                                }
                                                gi.s0 s0Var = c2Var22.e0;
                                                if (s0Var != null) {
                                                    s0Var.setProgress(1.0f);
                                                }
                                                final int i152 = 1;
                                                org.telegram.messenger.g0.i3(new Runnable() { // from class: ug.w1
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i1622 = i152;
                                                        a2 a2Var422 = a2Var32;
                                                        TLObject tLObject32 = tLObject2;
                                                        c2 c2Var322 = c2Var22;
                                                        switch (i1622) {
                                                            case 0:
                                                                hs f10 = hs.f(h10.t0);
                                                                TLRPC.Document document = a2Var422.f.document;
                                                                String str = a2Var422.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                f10.m(hs.s3, bool, tLObject32, document, str, bool);
                                                                c2Var322.h();
                                                                break;
                                                            case 1:
                                                                hs.f(h10.t0).m(hs.s3, Boolean.FALSE, tLObject32, a2Var422.f.document, a2Var422.l, Boolean.TRUE);
                                                                c2Var322.h();
                                                                break;
                                                            default:
                                                                hs f11 = hs.f(h10.t0);
                                                                TLRPC.Document document2 = a2Var422.f.document;
                                                                String str2 = a2Var422.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                f11.m(hs.s3, bool2, tLObject32, document2, str2, bool2);
                                                                c2Var322.h();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                            } else {
                                                c2Var22.n(tL_error);
                                                c2Var22.h();
                                                z10 = false;
                                            }
                                            u10 u10Var = a2Var32.n;
                                            if (u10Var != null) {
                                                u10Var.a(Boolean.valueOf(z10));
                                                a2Var32.n = null;
                                                break;
                                            }
                                            break;
                                        case 1:
                                            final TLObject tLObject3 = tLObject;
                                            boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                            final c2 c2Var32 = c2Var3;
                                            final a2 a2Var42 = a2Var4;
                                            if (z14) {
                                                int i162 = i17;
                                                z11 = true;
                                                li.b0(i162).I1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                li.b0(i162).f2(null, tLObject3, 2, null, false, false);
                                                gi.s0 s0Var2 = c2Var32.e0;
                                                if (s0Var2 != null) {
                                                    s0Var2.setProgress(1.0f);
                                                }
                                                final int i172 = 0;
                                                org.telegram.messenger.g0.i3(new Runnable() { // from class: ug.w1
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i1622 = i172;
                                                        a2 a2Var422 = a2Var42;
                                                        TLObject tLObject32 = tLObject3;
                                                        c2 c2Var322 = c2Var32;
                                                        switch (i1622) {
                                                            case 0:
                                                                hs f10 = hs.f(h10.t0);
                                                                TLRPC.Document document = a2Var422.f.document;
                                                                String str = a2Var422.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                f10.m(hs.s3, bool, tLObject32, document, str, bool);
                                                                c2Var322.h();
                                                                break;
                                                            case 1:
                                                                hs.f(h10.t0).m(hs.s3, Boolean.FALSE, tLObject32, a2Var422.f.document, a2Var422.l, Boolean.TRUE);
                                                                c2Var322.h();
                                                                break;
                                                            default:
                                                                hs f11 = hs.f(h10.t0);
                                                                TLRPC.Document document2 = a2Var422.f.document;
                                                                String str2 = a2Var422.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                f11.m(hs.s3, bool2, tLObject32, document2, str2, bool2);
                                                                c2Var322.h();
                                                                break;
                                                        }
                                                    }
                                                }, 250L);
                                            } else {
                                                c2Var32.n(tL_error);
                                                c2Var32.h();
                                                z11 = false;
                                            }
                                            u10 u10Var2 = a2Var42.n;
                                            if (u10Var2 != null) {
                                                u10Var2.a(Boolean.valueOf(z11));
                                                a2Var42.n = null;
                                                break;
                                            }
                                            break;
                                        default:
                                            final TLObject tLObject4 = tLObject;
                                            boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                            final c2 c2Var4 = c2Var3;
                                            final a2 a2Var5 = a2Var4;
                                            if (z15) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                int i18 = i17;
                                                z12 = true;
                                                li.b0(i18).I1(tL_messages_stickerSet2, true);
                                                if (!li.b0(i18).B0(tL_messages_stickerSet2.set.id, true)) {
                                                    li.b0(i18).f2(null, tLObject4, 2, null, false, false);
                                                }
                                                gi.s0 s0Var3 = c2Var4.e0;
                                                if (s0Var3 != null) {
                                                    s0Var3.setProgress(1.0f);
                                                }
                                                final int i19 = 2;
                                                org.telegram.messenger.g0.i3(new Runnable() { // from class: ug.w1
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i1622 = i19;
                                                        a2 a2Var422 = a2Var5;
                                                        TLObject tLObject32 = tLObject4;
                                                        c2 c2Var322 = c2Var4;
                                                        switch (i1622) {
                                                            case 0:
                                                                hs f10 = hs.f(h10.t0);
                                                                TLRPC.Document document = a2Var422.f.document;
                                                                String str = a2Var422.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                f10.m(hs.s3, bool, tLObject32, document, str, bool);
                                                                c2Var322.h();
                                                                break;
                                                            case 1:
                                                                hs.f(h10.t0).m(hs.s3, Boolean.FALSE, tLObject32, a2Var422.f.document, a2Var422.l, Boolean.TRUE);
                                                                c2Var322.h();
                                                                break;
                                                            default:
                                                                hs f11 = hs.f(h10.t0);
                                                                TLRPC.Document document2 = a2Var422.f.document;
                                                                String str2 = a2Var422.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                f11.m(hs.s3, bool2, tLObject32, document2, str2, bool2);
                                                                c2Var322.h();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                            } else {
                                                c2Var4.n(tL_error);
                                                c2Var4.h();
                                                z12 = false;
                                            }
                                            u10 u10Var3 = a2Var5.n;
                                            if (u10Var3 != null) {
                                                u10Var3.a(Boolean.valueOf(z12));
                                                a2Var5.n = null;
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                    }
                }
            });
            return;
        }
        if (a2Var.h) {
            h();
            hs.f(i3).m(hs.s3, Boolean.FALSE);
            org.telegram.messenger.g0.i3(new r4.u(a2Var, 15), 350L);
            u10 u10Var = a2Var.n;
            if (u10Var != null) {
                u10Var.a(Boolean.TRUE);
                return;
            }
            return;
        }
        if (a2Var.i == 0) {
            if (a2Var.j != null) {
                TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet = new TLRPC.TL_stickers_addStickerToSet();
                tL_stickers_addStickerToSet.stickerset = li.Z(a2Var.j);
                tL_stickers_addStickerToSet.sticker = a2Var.e;
                final int i12 = 2;
                ConnectionsManager.getInstance(i3).sendRequest(tL_stickers_addStickerToSet, new RequestDelegate(this) { // from class: ug.u1
                    public final /* synthetic */ c2 b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (i12) {
                            case 0:
                                final int i122 = 0;
                                final c2 c2Var = this.b;
                                final int i13 = i3;
                                final a2 a2Var2 = a2Var;
                                org.telegram.messenger.g0.h3(new Runnable() { // from class: ug.v1
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        boolean z10;
                                        boolean z11;
                                        boolean z12;
                                        switch (i122) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                boolean z13 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                                final c2 c2Var22 = c2Var;
                                                final a2 a2Var32 = a2Var2;
                                                if (z13) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i142 = i13;
                                                    z10 = true;
                                                    li.b0(i142).I1(tL_messages_stickerSet, true);
                                                    if (!li.b0(i142).B0(tL_messages_stickerSet.set.id, true)) {
                                                        li.b0(i142).f2(null, tLObject2, 2, null, false, false);
                                                    }
                                                    gi.s0 s0Var = c2Var22.e0;
                                                    if (s0Var != null) {
                                                        s0Var.setProgress(1.0f);
                                                    }
                                                    final int i152 = 1;
                                                    org.telegram.messenger.g0.i3(new Runnable() { // from class: ug.w1
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            int i1622 = i152;
                                                            a2 a2Var422 = a2Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            c2 c2Var322 = c2Var22;
                                                            switch (i1622) {
                                                                case 0:
                                                                    hs f10 = hs.f(h10.t0);
                                                                    TLRPC.Document document = a2Var422.f.document;
                                                                    String str = a2Var422.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(hs.s3, bool, tLObject32, document, str, bool);
                                                                    c2Var322.h();
                                                                    break;
                                                                case 1:
                                                                    hs.f(h10.t0).m(hs.s3, Boolean.FALSE, tLObject32, a2Var422.f.document, a2Var422.l, Boolean.TRUE);
                                                                    c2Var322.h();
                                                                    break;
                                                                default:
                                                                    hs f11 = hs.f(h10.t0);
                                                                    TLRPC.Document document2 = a2Var422.f.document;
                                                                    String str2 = a2Var422.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(hs.s3, bool2, tLObject32, document2, str2, bool2);
                                                                    c2Var322.h();
                                                                    break;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    c2Var22.n(tL_error);
                                                    c2Var22.h();
                                                    z10 = false;
                                                }
                                                u10 u10Var2 = a2Var32.n;
                                                if (u10Var2 != null) {
                                                    u10Var2.a(Boolean.valueOf(z10));
                                                    a2Var32.n = null;
                                                    break;
                                                }
                                                break;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final c2 c2Var32 = c2Var;
                                                final a2 a2Var42 = a2Var2;
                                                if (z14) {
                                                    int i162 = i13;
                                                    z11 = true;
                                                    li.b0(i162).I1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                    li.b0(i162).f2(null, tLObject3, 2, null, false, false);
                                                    gi.s0 s0Var2 = c2Var32.e0;
                                                    if (s0Var2 != null) {
                                                        s0Var2.setProgress(1.0f);
                                                    }
                                                    final int i172 = 0;
                                                    org.telegram.messenger.g0.i3(new Runnable() { // from class: ug.w1
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            int i1622 = i172;
                                                            a2 a2Var422 = a2Var42;
                                                            TLObject tLObject32 = tLObject3;
                                                            c2 c2Var322 = c2Var32;
                                                            switch (i1622) {
                                                                case 0:
                                                                    hs f10 = hs.f(h10.t0);
                                                                    TLRPC.Document document = a2Var422.f.document;
                                                                    String str = a2Var422.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(hs.s3, bool, tLObject32, document, str, bool);
                                                                    c2Var322.h();
                                                                    break;
                                                                case 1:
                                                                    hs.f(h10.t0).m(hs.s3, Boolean.FALSE, tLObject32, a2Var422.f.document, a2Var422.l, Boolean.TRUE);
                                                                    c2Var322.h();
                                                                    break;
                                                                default:
                                                                    hs f11 = hs.f(h10.t0);
                                                                    TLRPC.Document document2 = a2Var422.f.document;
                                                                    String str2 = a2Var422.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(hs.s3, bool2, tLObject32, document2, str2, bool2);
                                                                    c2Var322.h();
                                                                    break;
                                                            }
                                                        }
                                                    }, 250L);
                                                } else {
                                                    c2Var32.n(tL_error);
                                                    c2Var32.h();
                                                    z11 = false;
                                                }
                                                u10 u10Var22 = a2Var42.n;
                                                if (u10Var22 != null) {
                                                    u10Var22.a(Boolean.valueOf(z11));
                                                    a2Var42.n = null;
                                                    break;
                                                }
                                                break;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final c2 c2Var4 = c2Var;
                                                final a2 a2Var5 = a2Var2;
                                                if (z15) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i18 = i13;
                                                    z12 = true;
                                                    li.b0(i18).I1(tL_messages_stickerSet2, true);
                                                    if (!li.b0(i18).B0(tL_messages_stickerSet2.set.id, true)) {
                                                        li.b0(i18).f2(null, tLObject4, 2, null, false, false);
                                                    }
                                                    gi.s0 s0Var3 = c2Var4.e0;
                                                    if (s0Var3 != null) {
                                                        s0Var3.setProgress(1.0f);
                                                    }
                                                    final int i19 = 2;
                                                    org.telegram.messenger.g0.i3(new Runnable() { // from class: ug.w1
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            int i1622 = i19;
                                                            a2 a2Var422 = a2Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            c2 c2Var322 = c2Var4;
                                                            switch (i1622) {
                                                                case 0:
                                                                    hs f10 = hs.f(h10.t0);
                                                                    TLRPC.Document document = a2Var422.f.document;
                                                                    String str = a2Var422.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(hs.s3, bool, tLObject32, document, str, bool);
                                                                    c2Var322.h();
                                                                    break;
                                                                case 1:
                                                                    hs.f(h10.t0).m(hs.s3, Boolean.FALSE, tLObject32, a2Var422.f.document, a2Var422.l, Boolean.TRUE);
                                                                    c2Var322.h();
                                                                    break;
                                                                default:
                                                                    hs f11 = hs.f(h10.t0);
                                                                    TLRPC.Document document2 = a2Var422.f.document;
                                                                    String str2 = a2Var422.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(hs.s3, bool2, tLObject32, document2, str2, bool2);
                                                                    c2Var322.h();
                                                                    break;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    c2Var4.n(tL_error);
                                                    c2Var4.h();
                                                    z12 = false;
                                                }
                                                u10 u10Var3 = a2Var5.n;
                                                if (u10Var3 != null) {
                                                    u10Var3.a(Boolean.valueOf(z12));
                                                    a2Var5.n = null;
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                                break;
                            case 1:
                                final int i14 = 1;
                                final c2 c2Var2 = this.b;
                                final int i15 = i3;
                                final a2 a2Var3 = a2Var;
                                org.telegram.messenger.g0.h3(new Runnable() { // from class: ug.v1
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        boolean z10;
                                        boolean z11;
                                        boolean z12;
                                        switch (i14) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                boolean z13 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                                final c2 c2Var22 = c2Var2;
                                                final a2 a2Var32 = a2Var3;
                                                if (z13) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i142 = i15;
                                                    z10 = true;
                                                    li.b0(i142).I1(tL_messages_stickerSet, true);
                                                    if (!li.b0(i142).B0(tL_messages_stickerSet.set.id, true)) {
                                                        li.b0(i142).f2(null, tLObject2, 2, null, false, false);
                                                    }
                                                    gi.s0 s0Var = c2Var22.e0;
                                                    if (s0Var != null) {
                                                        s0Var.setProgress(1.0f);
                                                    }
                                                    final int i152 = 1;
                                                    org.telegram.messenger.g0.i3(new Runnable() { // from class: ug.w1
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            int i1622 = i152;
                                                            a2 a2Var422 = a2Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            c2 c2Var322 = c2Var22;
                                                            switch (i1622) {
                                                                case 0:
                                                                    hs f10 = hs.f(h10.t0);
                                                                    TLRPC.Document document = a2Var422.f.document;
                                                                    String str = a2Var422.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(hs.s3, bool, tLObject32, document, str, bool);
                                                                    c2Var322.h();
                                                                    break;
                                                                case 1:
                                                                    hs.f(h10.t0).m(hs.s3, Boolean.FALSE, tLObject32, a2Var422.f.document, a2Var422.l, Boolean.TRUE);
                                                                    c2Var322.h();
                                                                    break;
                                                                default:
                                                                    hs f11 = hs.f(h10.t0);
                                                                    TLRPC.Document document2 = a2Var422.f.document;
                                                                    String str2 = a2Var422.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(hs.s3, bool2, tLObject32, document2, str2, bool2);
                                                                    c2Var322.h();
                                                                    break;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    c2Var22.n(tL_error);
                                                    c2Var22.h();
                                                    z10 = false;
                                                }
                                                u10 u10Var2 = a2Var32.n;
                                                if (u10Var2 != null) {
                                                    u10Var2.a(Boolean.valueOf(z10));
                                                    a2Var32.n = null;
                                                    break;
                                                }
                                                break;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final c2 c2Var32 = c2Var2;
                                                final a2 a2Var42 = a2Var3;
                                                if (z14) {
                                                    int i162 = i15;
                                                    z11 = true;
                                                    li.b0(i162).I1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                    li.b0(i162).f2(null, tLObject3, 2, null, false, false);
                                                    gi.s0 s0Var2 = c2Var32.e0;
                                                    if (s0Var2 != null) {
                                                        s0Var2.setProgress(1.0f);
                                                    }
                                                    final int i172 = 0;
                                                    org.telegram.messenger.g0.i3(new Runnable() { // from class: ug.w1
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            int i1622 = i172;
                                                            a2 a2Var422 = a2Var42;
                                                            TLObject tLObject32 = tLObject3;
                                                            c2 c2Var322 = c2Var32;
                                                            switch (i1622) {
                                                                case 0:
                                                                    hs f10 = hs.f(h10.t0);
                                                                    TLRPC.Document document = a2Var422.f.document;
                                                                    String str = a2Var422.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(hs.s3, bool, tLObject32, document, str, bool);
                                                                    c2Var322.h();
                                                                    break;
                                                                case 1:
                                                                    hs.f(h10.t0).m(hs.s3, Boolean.FALSE, tLObject32, a2Var422.f.document, a2Var422.l, Boolean.TRUE);
                                                                    c2Var322.h();
                                                                    break;
                                                                default:
                                                                    hs f11 = hs.f(h10.t0);
                                                                    TLRPC.Document document2 = a2Var422.f.document;
                                                                    String str2 = a2Var422.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(hs.s3, bool2, tLObject32, document2, str2, bool2);
                                                                    c2Var322.h();
                                                                    break;
                                                            }
                                                        }
                                                    }, 250L);
                                                } else {
                                                    c2Var32.n(tL_error);
                                                    c2Var32.h();
                                                    z11 = false;
                                                }
                                                u10 u10Var22 = a2Var42.n;
                                                if (u10Var22 != null) {
                                                    u10Var22.a(Boolean.valueOf(z11));
                                                    a2Var42.n = null;
                                                    break;
                                                }
                                                break;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final c2 c2Var4 = c2Var2;
                                                final a2 a2Var5 = a2Var3;
                                                if (z15) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i18 = i15;
                                                    z12 = true;
                                                    li.b0(i18).I1(tL_messages_stickerSet2, true);
                                                    if (!li.b0(i18).B0(tL_messages_stickerSet2.set.id, true)) {
                                                        li.b0(i18).f2(null, tLObject4, 2, null, false, false);
                                                    }
                                                    gi.s0 s0Var3 = c2Var4.e0;
                                                    if (s0Var3 != null) {
                                                        s0Var3.setProgress(1.0f);
                                                    }
                                                    final int i19 = 2;
                                                    org.telegram.messenger.g0.i3(new Runnable() { // from class: ug.w1
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            int i1622 = i19;
                                                            a2 a2Var422 = a2Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            c2 c2Var322 = c2Var4;
                                                            switch (i1622) {
                                                                case 0:
                                                                    hs f10 = hs.f(h10.t0);
                                                                    TLRPC.Document document = a2Var422.f.document;
                                                                    String str = a2Var422.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(hs.s3, bool, tLObject32, document, str, bool);
                                                                    c2Var322.h();
                                                                    break;
                                                                case 1:
                                                                    hs.f(h10.t0).m(hs.s3, Boolean.FALSE, tLObject32, a2Var422.f.document, a2Var422.l, Boolean.TRUE);
                                                                    c2Var322.h();
                                                                    break;
                                                                default:
                                                                    hs f11 = hs.f(h10.t0);
                                                                    TLRPC.Document document2 = a2Var422.f.document;
                                                                    String str2 = a2Var422.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(hs.s3, bool2, tLObject32, document2, str2, bool2);
                                                                    c2Var322.h();
                                                                    break;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    c2Var4.n(tL_error);
                                                    c2Var4.h();
                                                    z12 = false;
                                                }
                                                u10 u10Var3 = a2Var5.n;
                                                if (u10Var3 != null) {
                                                    u10Var3.a(Boolean.valueOf(z12));
                                                    a2Var5.n = null;
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                                break;
                            default:
                                final int i16 = 2;
                                final c2 c2Var3 = this.b;
                                final int i17 = i3;
                                final a2 a2Var4 = a2Var;
                                org.telegram.messenger.g0.h3(new Runnable() { // from class: ug.v1
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        boolean z10;
                                        boolean z11;
                                        boolean z12;
                                        switch (i16) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                boolean z13 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                                final c2 c2Var22 = c2Var3;
                                                final a2 a2Var32 = a2Var4;
                                                if (z13) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i142 = i17;
                                                    z10 = true;
                                                    li.b0(i142).I1(tL_messages_stickerSet, true);
                                                    if (!li.b0(i142).B0(tL_messages_stickerSet.set.id, true)) {
                                                        li.b0(i142).f2(null, tLObject2, 2, null, false, false);
                                                    }
                                                    gi.s0 s0Var = c2Var22.e0;
                                                    if (s0Var != null) {
                                                        s0Var.setProgress(1.0f);
                                                    }
                                                    final int i152 = 1;
                                                    org.telegram.messenger.g0.i3(new Runnable() { // from class: ug.w1
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            int i1622 = i152;
                                                            a2 a2Var422 = a2Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            c2 c2Var322 = c2Var22;
                                                            switch (i1622) {
                                                                case 0:
                                                                    hs f10 = hs.f(h10.t0);
                                                                    TLRPC.Document document = a2Var422.f.document;
                                                                    String str = a2Var422.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(hs.s3, bool, tLObject32, document, str, bool);
                                                                    c2Var322.h();
                                                                    break;
                                                                case 1:
                                                                    hs.f(h10.t0).m(hs.s3, Boolean.FALSE, tLObject32, a2Var422.f.document, a2Var422.l, Boolean.TRUE);
                                                                    c2Var322.h();
                                                                    break;
                                                                default:
                                                                    hs f11 = hs.f(h10.t0);
                                                                    TLRPC.Document document2 = a2Var422.f.document;
                                                                    String str2 = a2Var422.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(hs.s3, bool2, tLObject32, document2, str2, bool2);
                                                                    c2Var322.h();
                                                                    break;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    c2Var22.n(tL_error);
                                                    c2Var22.h();
                                                    z10 = false;
                                                }
                                                u10 u10Var2 = a2Var32.n;
                                                if (u10Var2 != null) {
                                                    u10Var2.a(Boolean.valueOf(z10));
                                                    a2Var32.n = null;
                                                    break;
                                                }
                                                break;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final c2 c2Var32 = c2Var3;
                                                final a2 a2Var42 = a2Var4;
                                                if (z14) {
                                                    int i162 = i17;
                                                    z11 = true;
                                                    li.b0(i162).I1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                    li.b0(i162).f2(null, tLObject3, 2, null, false, false);
                                                    gi.s0 s0Var2 = c2Var32.e0;
                                                    if (s0Var2 != null) {
                                                        s0Var2.setProgress(1.0f);
                                                    }
                                                    final int i172 = 0;
                                                    org.telegram.messenger.g0.i3(new Runnable() { // from class: ug.w1
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            int i1622 = i172;
                                                            a2 a2Var422 = a2Var42;
                                                            TLObject tLObject32 = tLObject3;
                                                            c2 c2Var322 = c2Var32;
                                                            switch (i1622) {
                                                                case 0:
                                                                    hs f10 = hs.f(h10.t0);
                                                                    TLRPC.Document document = a2Var422.f.document;
                                                                    String str = a2Var422.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(hs.s3, bool, tLObject32, document, str, bool);
                                                                    c2Var322.h();
                                                                    break;
                                                                case 1:
                                                                    hs.f(h10.t0).m(hs.s3, Boolean.FALSE, tLObject32, a2Var422.f.document, a2Var422.l, Boolean.TRUE);
                                                                    c2Var322.h();
                                                                    break;
                                                                default:
                                                                    hs f11 = hs.f(h10.t0);
                                                                    TLRPC.Document document2 = a2Var422.f.document;
                                                                    String str2 = a2Var422.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(hs.s3, bool2, tLObject32, document2, str2, bool2);
                                                                    c2Var322.h();
                                                                    break;
                                                            }
                                                        }
                                                    }, 250L);
                                                } else {
                                                    c2Var32.n(tL_error);
                                                    c2Var32.h();
                                                    z11 = false;
                                                }
                                                u10 u10Var22 = a2Var42.n;
                                                if (u10Var22 != null) {
                                                    u10Var22.a(Boolean.valueOf(z11));
                                                    a2Var42.n = null;
                                                    break;
                                                }
                                                break;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final c2 c2Var4 = c2Var3;
                                                final a2 a2Var5 = a2Var4;
                                                if (z15) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i18 = i17;
                                                    z12 = true;
                                                    li.b0(i18).I1(tL_messages_stickerSet2, true);
                                                    if (!li.b0(i18).B0(tL_messages_stickerSet2.set.id, true)) {
                                                        li.b0(i18).f2(null, tLObject4, 2, null, false, false);
                                                    }
                                                    gi.s0 s0Var3 = c2Var4.e0;
                                                    if (s0Var3 != null) {
                                                        s0Var3.setProgress(1.0f);
                                                    }
                                                    final int i19 = 2;
                                                    org.telegram.messenger.g0.i3(new Runnable() { // from class: ug.w1
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            int i1622 = i19;
                                                            a2 a2Var422 = a2Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            c2 c2Var322 = c2Var4;
                                                            switch (i1622) {
                                                                case 0:
                                                                    hs f10 = hs.f(h10.t0);
                                                                    TLRPC.Document document = a2Var422.f.document;
                                                                    String str = a2Var422.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(hs.s3, bool, tLObject32, document, str, bool);
                                                                    c2Var322.h();
                                                                    break;
                                                                case 1:
                                                                    hs.f(h10.t0).m(hs.s3, Boolean.FALSE, tLObject32, a2Var422.f.document, a2Var422.l, Boolean.TRUE);
                                                                    c2Var322.h();
                                                                    break;
                                                                default:
                                                                    hs f11 = hs.f(h10.t0);
                                                                    TLRPC.Document document2 = a2Var422.f.document;
                                                                    String str2 = a2Var422.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(hs.s3, bool2, tLObject32, document2, str2, bool2);
                                                                    c2Var322.h();
                                                                    break;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    c2Var4.n(tL_error);
                                                    c2Var4.h();
                                                    z12 = false;
                                                }
                                                u10 u10Var3 = a2Var5.n;
                                                if (u10Var3 != null) {
                                                    u10Var3.a(Boolean.valueOf(z12));
                                                    a2Var5.n = null;
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                                break;
                        }
                    }
                });
                return;
            }
            return;
        }
        yy.C(i3).v0(a2Var.f.document, null, a2Var.i, null, null, null, null, null, true, 0, 0, false, null, null, 0L, 0L, null);
        gi.s0 s0Var = this.e0;
        if (s0Var != null) {
            s0Var.setProgress(1.0f);
        }
        org.telegram.messenger.g0.i3(new org.telegram.ui.Wallet.f2(this, i3, 10), 450L);
        u10 u10Var2 = a2Var.n;
        if (u10Var2 != null) {
            u10Var2.a(Boolean.TRUE);
            a2Var.n = null;
        }
    }

    public final void b() {
        ValueAnimator valueAnimator = this.O;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.O = null;
        }
        this.J = null;
        if (this.I != null) {
            int i3 = 0;
            while (true) {
                z1[] z1VarArr = this.I;
                if (i3 >= z1VarArr.length) {
                    break;
                }
                z1 z1Var = z1VarArr[i3];
                if (z1Var != null) {
                    z1Var.l.reset();
                    Bitmap bitmap = z1Var.e;
                    if (bitmap != null) {
                        bitmap.recycle();
                        z1Var.e = null;
                    }
                    Bitmap bitmap2 = z1Var.d;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                        z1Var.d = null;
                    }
                    Bitmap bitmap3 = z1Var.g;
                    if (bitmap3 != null) {
                        bitmap3.recycle();
                        z1Var.g = null;
                    }
                    Bitmap bitmap4 = z1Var.f;
                    if (bitmap4 != null) {
                        bitmap4.recycle();
                        z1Var.f = null;
                    }
                }
                i3++;
            }
            this.I = null;
        }
        this.E = false;
        this.y = false;
        this.M = false;
        this.N.setAlpha(0.0f);
        this.N.setScaleX(0.3f);
        this.N.setScaleY(0.3f);
        a2 a2Var = this.a0;
        if (a2Var != null) {
            if (!a2Var.o) {
                a2Var.a();
            }
            this.a0 = null;
        }
        h();
        this.W = false;
    }

    public final Bitmap d(int i3, int i10, Bitmap bitmap, boolean z10) {
        Bitmap sourceBitmap = getSourceBitmap();
        if (bitmap == null || bitmap.isRecycled() || sourceBitmap == null) {
            return null;
        }
        Paint paint = new Paint(3);
        int width = sourceBitmap.getWidth();
        int height = sourceBitmap.getHeight();
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap createBitmap = Bitmap.createBitmap(width, height, config);
        Canvas canvas = new Canvas(createBitmap);
        if (z10) {
            canvas.scale(createBitmap.getWidth() / bitmap.getWidth(), createBitmap.getHeight() / bitmap.getHeight());
            canvas.drawBitmap(bitmap, i3, i10, paint);
        } else {
            canvas.drawBitmap(bitmap, i3, i10, paint);
        }
        Utilities.stackBlurBitmap(createBitmap, 5);
        Bitmap createBitmap2 = Bitmap.createBitmap(sourceBitmap.getWidth(), sourceBitmap.getHeight(), config);
        Canvas canvas2 = new Canvas(createBitmap2);
        canvas2.drawBitmap(sourceBitmap, 0.0f, 0.0f, paint);
        Paint paint2 = new Paint(3);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        canvas2.drawBitmap(createBitmap, 0.0f, 0.0f, paint2);
        createBitmap.recycle();
        return createBitmap2;
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        a2 a2Var;
        if (i3 == hs.U1) {
            String str = (String) objArr[0];
            TLRPC.InputFile inputFile = (TLRPC.InputFile) objArr[1];
            a2 a2Var2 = this.a0;
            if (a2Var2 == null || !str.equalsIgnoreCase(a2Var2.b)) {
                return;
            }
            a2 a2Var3 = this.a0;
            a2Var3.g = inputFile;
            TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia = new TLRPC.TL_messages_uploadMedia();
            tL_messages_uploadMedia.peer = new TLRPC.TL_inputPeerSelf();
            TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument = new TLRPC.TL_inputMediaUploadedDocument();
            tL_messages_uploadMedia.media = tL_inputMediaUploadedDocument;
            tL_inputMediaUploadedDocument.file = a2Var3.g;
            if (a2Var3.s != null) {
                tL_inputMediaUploadedDocument.mime_type = "video/webm";
            } else {
                tL_inputMediaUploadedDocument.mime_type = "image/webp";
            }
            TLRPC.TL_documentAttributeSticker tL_documentAttributeSticker = new TLRPC.TL_documentAttributeSticker();
            tL_documentAttributeSticker.alt = a2Var3.c;
            tL_documentAttributeSticker.stickerset = new TLRPC.TL_inputStickerSetEmpty();
            tL_messages_uploadMedia.media.attributes.add(tL_documentAttributeSticker);
            ConnectionsManager.getInstance(h10.t0).sendRequest(tL_messages_uploadMedia, new m21(10, this, a2Var3), 2);
            return;
        }
        if (i3 == hs.W1) {
            String str2 = (String) objArr[0];
            a2 a2Var4 = this.a0;
            if (a2Var4 == null || !str2.equalsIgnoreCase(a2Var4.b)) {
                return;
            }
            long longValue = ((Long) objArr[1]).longValue();
            long longValue2 = ((Long) objArr[2]).longValue();
            if (longValue2 > 0) {
                a2 a2Var5 = this.a0;
                a2Var5.u = Utilities.i(longValue / longValue2, 1.0f, a2Var5.u);
                gi.s0 s0Var = this.e0;
                if (s0Var != null) {
                    s0Var.setProgress(this.a0.b());
                    return;
                }
                return;
            }
            return;
        }
        if (i3 == hs.V1) {
            String str3 = (String) objArr[0];
            a2 a2Var6 = this.a0;
            if (a2Var6 == null || !str3.equalsIgnoreCase(a2Var6.b)) {
                return;
            }
            h();
            return;
        }
        if (i3 == hs.a2) {
            a2 a2Var7 = this.a0;
            if (a2Var7 != null && objArr[0] == a2Var7.r) {
                w7.G(h10.t0).i0(false, 67108864, this.a0.b, true);
                return;
            }
            return;
        }
        if (i3 != hs.b2) {
            if (i3 == hs.c2 && (a2Var = this.a0) != null && objArr[0] == a2Var.r) {
                h();
                return;
            }
            return;
        }
        a2 a2Var8 = this.a0;
        if (a2Var8 != null && objArr[0] == a2Var8.r) {
            String str4 = (String) objArr[1];
            long longValue3 = ((Long) objArr[2]).longValue();
            long longValue4 = ((Long) objArr[3]).longValue();
            Float f10 = (Float) objArr[4];
            float floatValue = f10.floatValue();
            this.a0.r.p0.Y = true;
            w7.G(this.a).n(str4, false, Math.max(1L, longValue3), longValue4, f10);
            a2 a2Var9 = this.a0;
            a2Var9.t = Math.max(a2Var9.t, floatValue);
            gi.s0 s0Var2 = this.e0;
            if (s0Var2 != null) {
                s0Var2.setProgress(this.a0.b());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        canvas.drawPath(this.w, this.e);
        canvas.drawPath(this.x, this.d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        if (r6.getAction() != 1) goto L17;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        this.o0 = motionEvent.getX();
        float y9 = motionEvent.getY();
        this.p0 = y9;
        if (this.I != null && this.O != null) {
            z1 j10 = j(this.o0, y9);
            int i3 = 0;
            while (true) {
                z1[] z1VarArr = this.I;
                if (i3 >= z1VarArr.length) {
                    break;
                }
                if (z1VarArr[i3] == j10 && motionEvent.getAction() != 3) {
                    z10 = true;
                }
                z10 = false;
                if (z10 && !this.I[i3].b) {
                    org.telegram.messenger.g0.c4(this);
                }
                this.I[i3].b = z10;
                i3++;
            }
            if (getParent() instanceof View) {
                ((View) getParent()).invalidate();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final Bitmap e(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        z1 z1Var = this.F;
        if (z1Var != null) {
            this.L = bitmap;
            if (z1Var.f != null && this.M) {
                Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                Paint paint = new Paint(3);
                Paint paint2 = new Paint(3);
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint2);
                Rect rect = new Rect();
                rect.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
                z1 z1Var2 = this.F;
                if (z1Var2.c == 0) {
                    canvas.drawBitmap(z1Var2.a(), (Rect) null, rect, paint);
                    return createBitmap;
                }
                Matrix matrix = new Matrix();
                z1 z1Var3 = this.F;
                matrix.postRotate(z1Var3.c, z1Var3.a().getWidth() / 2.0f, this.F.a().getHeight() / 2.0f);
                if ((this.F.c / 90) % 2 != 0) {
                    float height = (r4.b().getHeight() - this.F.b().getWidth()) / 2.0f;
                    matrix.postTranslate(height, -height);
                }
                matrix.postScale(bitmap.getWidth() / this.F.a().getHeight(), bitmap.getHeight() / this.F.a().getWidth());
                canvas.drawBitmap(this.F.a(), matrix, paint);
                return createBitmap;
            }
        }
        return bitmap;
    }

    public final void f() {
        this.b.e(false, 0.0f);
        ValueAnimator valueAnimator = this.O;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.O = null;
        }
        setOnClickListener(null);
        setClickable(false);
        TextView textView = this.N;
        textView.animate().cancel();
        textView.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(240L).setInterpolator(xq.h).start();
    }

    public final void g(Canvas canvas, boolean z10, ViewGroup viewGroup, boolean z11) {
        u5 u5Var = this.c;
        u5Var.a = viewGroup;
        boolean z12 = this.j0;
        if (z12 || u5Var.c > 0.0f) {
            float d = viewGroup == null ? 1.0f : u5Var.d(z12 && !z11);
            z1[] z1VarArr = this.I;
            if (z1VarArr != null) {
                for (z1 z1Var : z1VarArr) {
                    if (z1Var != null && z1Var == this.F) {
                        if (this.G > 0.0f) {
                            if (z1Var.t.l0 == null) {
                                return;
                            }
                            canvas.save();
                            canvas.clipPath(z1Var.t.l0);
                            if (z1Var.t.J != null) {
                                Paint paint = z10 ? z1Var.q : z1Var.p;
                                paint.setAlpha((int) (d * 255.0f));
                                paint.setStrokeWidth(org.telegram.messenger.g0.L(r4));
                                canvas.drawPath(z1Var.l, paint);
                                if (z1Var.t.l0 != null && z10) {
                                    canvas.clipPath(z1Var.l);
                                    paint.setStrokeWidth(org.telegram.messenger.g0.L(r4 * 2.0f));
                                    canvas.drawPath(z1Var.t.l0, paint);
                                }
                            }
                            canvas.restore();
                            return;
                        }
                    }
                }
            }
        }
    }

    public float getSegmentBorderImageHeight() {
        return this.Q;
    }

    public float getSegmentBorderImageWidth() {
        return this.P;
    }

    public Bitmap getSegmentedDarkMaskImage() {
        z1 z1Var;
        if (!this.M || (z1Var = this.F) == null) {
            return null;
        }
        return z1Var.a();
    }

    public Bitmap getSourceBitmap() {
        return this.J;
    }

    public cz0 getThanosEffect() {
        if (!cz0.c()) {
            return null;
        }
        if (this.T == null) {
            cz0 cz0Var = new cz0(getContext(), new t1(this, 1));
            this.T = cz0Var;
            addView(cz0Var, mf.c(-1.0f, -1));
        }
        return this.T;
    }

    public final void h() {
        gi.s0 s0Var = this.e0;
        if (s0Var != null) {
            s0Var.a();
            this.e0 = null;
        }
    }

    public final boolean i() {
        return this.M;
    }

    public final z1 j(float f10, float f11) {
        int width;
        int height;
        if (this.J == null) {
            return null;
        }
        int i3 = 0;
        while (true) {
            z1[] z1VarArr = this.I;
            if (i3 >= z1VarArr.length) {
                return null;
            }
            z1 z1Var = z1VarArr[i3];
            if (z1Var != null) {
                if ((z1Var.c / 90) % 2 != 0) {
                    width = this.J.getHeight();
                    height = this.J.getWidth();
                } else {
                    width = this.J.getWidth();
                    height = this.J.getHeight();
                }
                RectF rectF = org.telegram.messenger.g0.P;
                RectF rectF2 = this.I[i3].i;
                float f12 = width;
                float f13 = rectF2.left / f12;
                float f14 = this.g0;
                float f15 = height;
                float f16 = rectF2.top / f15;
                float f17 = this.h0;
                rectF.set(f13 * f14, f16 * f17, (rectF2.right / f12) * f14, (rectF2.bottom / f15) * f17);
                this.f0.mapRect(rectF);
                if (rectF.contains(f10, f11)) {
                    return z1Var;
                }
            }
            i3++;
        }
    }

    public final void l() {
        Bitmap bitmap;
        z1[] z1VarArr = this.I;
        if (z1VarArr != null) {
            for (z1 z1Var : z1VarArr) {
                if (z1Var != null && (bitmap = z1Var.e) != null) {
                    bitmap.recycle();
                    z1Var.e = null;
                    Bitmap bitmap2 = z1Var.g;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                        z1Var.g = null;
                    }
                    c(z1Var, this.U, this.V);
                }
            }
        }
    }

    public final void m(Bitmap bitmap, int i3, int i10, int i11, en0 en0Var) {
        sb.c cVar;
        int i12 = i10 <= 0 ? org.telegram.messenger.g0.q.x : i10;
        int i13 = i11 <= 0 ? org.telegram.messenger.g0.q.y : i11;
        this.U = i12;
        this.V = i13;
        if (this.E || this.y || bitmap == null || Build.VERSION.SDK_INT < 24) {
            return;
        }
        this.J = bitmap;
        this.K = i3;
        this.d0 = null;
        g3 g3Var = new g3(this, i3, en0Var, 6);
        this.y = true;
        ha.a aVar = new ha.a();
        aVar.b = true;
        aVar.c = true;
        zzd a10 = q5.a(new wb.d(aVar));
        if (n6.h(getContext()).f()) {
            ArrayList arrayList = new ArrayList();
            Bitmap bitmap2 = this.J;
            b2 b2Var = new b2();
            int min = (int) (Math.min(bitmap2.getWidth(), bitmap2.getHeight()) * 0.4f);
            b2Var.e = min;
            b2Var.d = min;
            b2Var.a = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
            new Canvas(b2Var.a).drawRect(0.0f, 0.0f, b2Var.d, b2Var.e, k6.Dm);
            b2Var.b = (bitmap2.getWidth() - b2Var.d) / 2;
            b2Var.c = (bitmap2.getHeight() - b2Var.e) / 2;
            arrayList.add(b2Var);
            g3Var.a(arrayList);
            return;
        }
        rb.a a11 = rb.a.a(bitmap, i3);
        a10.g(a11).addOnSuccessListener(new e3(g3Var, 22)).addOnFailureListener(new m3(this, bitmap, i3, en0Var, g3Var, 6));
        if (this.d0 == null) {
            ub.a aVar2 = ub.a.b;
            p6.m.h(aVar2, "options cannot be null");
            synchronized (sb.c.class) {
                cVar = (sb.c) mb.g.c().a(sb.c.class);
            }
            ta.b bVar = (ta.b) cVar.a.get(ub.a.class);
            p6.m.g(bVar);
            vb.c cVar2 = (vb.c) bVar.get();
            cVar2.getClass();
            da daVar = cVar2.c;
            l2.e eVar = new l2.e();
            eVar.c = l7.b;
            mb.m.a.execute(new cg(daVar, new kg(eVar, 1), n7.c, daVar.b(), 8));
            new ImageLabelerImpl((mb.e) cVar2.a.R0(aVar2), (Executor) cVar2.b.a.get(), new m6.c("vision.ica", 1L)).g(a11).addOnSuccessListener(new e3(this, 23)).addOnFailureListener(new u9.j(2));
        }
        ArrayList arrayList2 = li.b0(this.a).n;
        for (int i14 = 0; i14 < Math.min(arrayList2.size(), 9); i14++) {
            i6.g(((TLRPC.TL_availableReaction) arrayList2.get(i14)).reaction);
        }
    }

    public final void n(TLRPC.TL_error tL_error) {
        if (tL_error == null || "PACK_TITLE_INVALID".equals(tL_error.text)) {
            return;
        }
        new fc((FrameLayout) getParent(), this.b0).t(tL_error.text, null).j();
    }

    public final void o() {
        Path path = this.l0;
        if (path == null) {
            this.l0 = new Path();
        } else {
            path.rewind();
        }
        if (this.m0 == null) {
            this.m0 = new Path();
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(0.0f, 0.0f, 1.0f, 1.0f);
            this.m0.addRoundRect(rectF, rectF.width() * 0.12f, rectF.height() * 0.12f, Path.Direction.CW);
        }
        this.l0.addPath(this.m0, this.k0);
        this.l0.computeBounds(this.n0, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        hs.f(this.a).c(this, hs.U1);
        hs.f(this.a).c(this, hs.W1);
        hs.f(this.a).c(this, hs.V1);
        hs.f(this.a).c(this, hs.c2);
        hs.f(this.a).c(this, hs.a2);
        hs.f(this.a).c(this, hs.b2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i3 = this.a;
        if (i3 >= 0) {
            hs.f(i3).n(this, hs.U1);
            hs.f(this.a).n(this, hs.W1);
            hs.f(this.a).n(this, hs.V1);
            hs.f(this.a).n(this, hs.c2);
            hs.f(this.a).n(this, hs.a2);
            hs.f(this.a).n(this, hs.b2);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        float L = org.telegram.messenger.g0.L(10.0f);
        float f10 = L * 2.0f;
        float measuredWidth = getMeasuredWidth() - f10;
        float measuredHeight = getMeasuredHeight() - f10;
        float f11 = measuredWidth / 8.0f;
        RectF rectF = org.telegram.messenger.g0.P;
        float f12 = measuredWidth + L;
        rectF.set(L, L, f12, f12);
        rectF.offset(0.0f, (measuredHeight - rectF.height()) / 2.0f);
        Path path = this.s;
        path.rewind();
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, f11, f11, direction);
        Path path2 = this.r;
        path2.rewind();
        path2.addRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), direction);
        Path path3 = this.w;
        path3.reset();
        path3.op(path2, path, Path.Op.DIFFERENCE);
        Path path4 = this.x;
        path4.rewind();
        rectF.inset(org.telegram.messenger.g0.L(-1.0f), org.telegram.messenger.g0.L(-1.0f));
        path4.addRoundRect(rectF, f11, f11, direction);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        this.N.setTranslationY(-((getMeasuredWidth() / 2.0f) + org.telegram.messenger.g0.L(10.0f)));
        if (Build.VERSION.SDK_INT >= 29) {
            ArrayList arrayList = this.q0;
            arrayList.clear();
            if (this.j0) {
                Rect rect = this.r0;
                arrayList.add(rect);
                int measuredHeight = (int) (getMeasuredHeight() * 0.3f);
                rect.set(0, (getMeasuredHeight() - measuredHeight) / 2, org.telegram.messenger.g0.L(20.0f), (getMeasuredHeight() + measuredHeight) / 2);
            }
            setSystemGestureExclusionRects(arrayList);
        }
    }

    public final void p(final String str, final b20 b20Var, final String str2, final CharSequence charSequence, final boolean z10, final long j10, final TLRPC.StickerSet stickerSet, final TLRPC.Document document, final TLRPC.Document document2, final String str3, final u10 u10Var, final n10 n10Var) {
        org.telegram.messenger.g0.i3(new Runnable() { // from class: ug.x1
            @Override // java.lang.Runnable
            public final void run() {
                a2 a2Var;
                c2 c2Var = c2.this;
                u10 u10Var2 = u10Var;
                int i3 = 0;
                boolean z11 = u10Var2 == null || (a2Var = c2Var.a0) == null || !a2Var.o;
                if (z11) {
                    a2 a2Var2 = c2Var.a0;
                    if (a2Var2 != null) {
                        a2Var2.a();
                    }
                    a2 a2Var3 = new a2();
                    a2Var3.p = new ArrayList();
                    a2Var3.q = new ArrayList();
                    a2Var3.t = 0.0f;
                    a2Var3.u = 0.0f;
                    c2Var.a0 = a2Var3;
                }
                a2 a2Var4 = c2Var.a0;
                a2Var4.c = str2;
                String str4 = str;
                a2Var4.b = str4;
                a2Var4.a = str4;
                a2Var4.d = charSequence;
                a2Var4.h = z10;
                a2Var4.i = j10;
                a2Var4.j = stickerSet;
                a2Var4.k = document;
                b20 b20Var2 = b20Var;
                a2Var4.s = b20Var2;
                a2Var4.l = str3;
                a2Var4.n = u10Var2;
                a2Var4.m = n10Var;
                ArrayList arrayList = a2Var4.q;
                if (!TextUtils.isEmpty(str4)) {
                    a2Var4.p.add(new File(a2Var4.b));
                }
                if (!TextUtils.isEmpty(a2Var4.a) && !TextUtils.equals(a2Var4.a, a2Var4.b)) {
                    arrayList.add(new File(a2Var4.a));
                }
                if (!TextUtils.isEmpty(a2Var4.l)) {
                    arrayList.add(new File(a2Var4.l));
                }
                if (z11) {
                    TLRPC.Document document3 = document2;
                    if (document3 != null) {
                        a2 a2Var5 = c2Var.a0;
                        a2Var5.e = li.a0(document3, a2Var5.c);
                        c2Var.a0.f = new TLRPC.TL_messageMediaDocument();
                        TLRPC.TL_messageMediaDocument tL_messageMediaDocument = c2Var.a0.f;
                        tL_messageMediaDocument.flags |= 1;
                        tL_messageMediaDocument.document = document3;
                        c2Var.a();
                    } else if (b20Var2 != null) {
                        TLRPC.TL_message tL_message = new TLRPC.TL_message();
                        tL_message.id = 1;
                        a2 a2Var6 = c2Var.a0;
                        String absolutePath = f7.w(h10.t0, "webm").getAbsolutePath();
                        tL_message.attachPath = absolutePath;
                        a2Var6.b = absolutePath;
                        c2Var.a0.r = new zi(h10.t0, tL_message, null, false, false);
                        c2Var.a0.r.p0 = b20Var2;
                        MediaController.B().h0(c2Var.a0.r, false, false, false);
                    } else {
                        w7.G(c2Var.a).i0(false, 67108864, str4, true);
                    }
                } else {
                    c2Var.a();
                }
                if (u10Var2 == null) {
                    if (c2Var.e0 == null) {
                        c2Var.e0 = new gi.s0(c2Var.getContext(), bd.M0(2131746927, null));
                    }
                    c2Var.e0.setOnCancelListener(new t1(c2Var, i3));
                    if (c2Var.e0.getParent() == null) {
                        c2Var.addView(c2Var.e0, mf.e(-1, -1, 17));
                    }
                    gi.s0 s0Var = c2Var.e0;
                    s0Var.F = true;
                    s0Var.invalidate();
                }
            }
        }, 300L);
    }

    public void setCurrentAccount(int i3) {
        int i10 = this.a;
        if (i10 != i3) {
            int i11 = hs.b2;
            int i12 = hs.a2;
            int i13 = hs.c2;
            int i14 = hs.V1;
            int i15 = hs.W1;
            int i16 = hs.U1;
            if (i10 >= 0 && isAttachedToWindow()) {
                hs.f(this.a).n(this, i16);
                hs.f(this.a).n(this, i15);
                hs.f(this.a).n(this, i14);
                hs.f(this.a).n(this, i13);
                hs.f(this.a).n(this, i12);
                hs.f(this.a).n(this, i11);
            }
            this.a = i3;
            if (i3 < 0 || !isAttachedToWindow()) {
                return;
            }
            hs.f(this.a).c(this, i16);
            hs.f(this.a).c(this, i15);
            hs.f(this.a).c(this, i14);
            hs.f(this.a).c(this, i13);
            hs.f(this.a).c(this, i12);
            hs.f(this.a).c(this, i11);
        }
    }

    public void setOutlineVisible(boolean z10) {
        if (this.j0 == z10) {
            return;
        }
        this.j0 = z10;
        this.i0.animate().alpha(z10 ? 1.0f : 0.0f).translationX(z10 ? 0.0f : org.telegram.messenger.g0.L(-18.0f)).setInterpolator(xq.h).setDuration(320L).start();
        if (getParent() instanceof View) {
            ((View) getParent()).invalidate();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            ArrayList arrayList = this.q0;
            arrayList.clear();
            if (this.j0) {
                Rect rect = this.r0;
                arrayList.add(rect);
                int measuredHeight = (int) (getMeasuredHeight() * 0.3f);
                rect.set(0, (getMeasuredHeight() - measuredHeight) / 2, org.telegram.messenger.g0.L(20.0f), (getMeasuredHeight() + measuredHeight) / 2);
            }
            setSystemGestureExclusionRects(arrayList);
        }
    }

    public void setOutlineWidth(float f10) {
        this.G = f10;
        if (getParent() instanceof View) {
            ((View) getParent()).invalidate();
        }
    }

    public void setStickerCutOutBtn(s1 s1Var) {
        this.c0 = s1Var;
    }
}
