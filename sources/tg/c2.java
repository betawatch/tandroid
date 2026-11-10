package tg;

import a8.a8;
import a8.b8;
import a8.pa;
import a8.ta;
import a8.wa;
import a8.y7;
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
import bi.i6;
import c8.ha;
import c8.ke;
import com.google.mlkit.vision.label.internal.ImageLabelerImpl;
import com.google.mlkit.vision.segmentation.subject.internal.zzd;
import fi.e7;
import hi.d4;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.Executor;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.c20;
import org.telegram.messenger.gz;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.messenger.iz;
import org.telegram.messenger.j20;
import org.telegram.messenger.ls;
import org.telegram.messenger.n6;
import org.telegram.messenger.p10;
import org.telegram.messenger.qs;
import org.telegram.messenger.ui;
import org.telegram.messenger.v10;
import org.telegram.messenger.w7;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.n3;
import org.telegram.ui.Components.dz0;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.v5;
import org.telegram.ui.Components.wq;
import org.telegram.ui.mn0;
import org.telegram.ui.p41;
import org.telegram.ui.q61;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class c2 extends FrameLayout implements ls {
    public static final /* synthetic */ int r0 = 0;
    public volatile boolean D;
    public z1 E;
    public float F;
    public boolean G;
    public z1[] H;
    public volatile Bitmap I;
    public int J;
    public Bitmap K;
    public boolean L;
    public final TextView M;
    public ValueAnimator N;
    public float O;
    public float P;
    public float Q;
    public float R;
    public dz0 S;
    public int T;
    public int U;
    public boolean V;
    public a2 W;
    public int a;
    public final h6 a0;
    public final v5 b;
    public s1 b0;
    public final v5 c;
    public String c0;
    public final Paint d;
    public fi.s0 d0;
    public final Paint e;
    public final Matrix e0;
    public final Paint f;
    public float f0;
    public float g0;
    public final Paint h;
    public final m1 h0;
    public boolean i0;
    public final Matrix j0;
    public Path k0;
    public Path l0;
    public final RectF m0;
    public final PathMeasure n;
    public float n0;
    public float o0;
    public final ArrayList p0;
    public final Rect q0;
    public final Path r;
    public final Path s;
    public final Path w;
    public final Path x;
    public volatile boolean y;

    public c2(ContextThemeWrapper contextThemeWrapper, h6 h6Var) {
        super(contextThemeWrapper);
        this.a = -1;
        wq wqVar = wq.h;
        this.b = new v5(0.0f, (View) null, 0L, 420L, wqVar);
        this.c = new v5(0.0f, (View) null, 0L, 420L, wqVar);
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
        this.F = 2.0f;
        this.e0 = new Matrix();
        this.j0 = new Matrix();
        this.m0 = new RectF();
        this.p0 = new ArrayList();
        this.q0 = new Rect();
        this.a0 = h6Var;
        paint.setColor(-1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint.setPathEffect(new DashPathEffect(new float[]{org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(10.0f)}, 0.5f));
        paint.setShadowLayer(org.telegram.messenger.g0.N(0.75f), 0.0f, 0.0f, 1342177280);
        paint.setAlpha(qs.W1);
        TextView textView = new TextView(contextThemeWrapper);
        this.M = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(-1);
        textView.setAlpha(0.0f);
        textView.setScaleX(0.3f);
        textView.setScaleY(0.3f);
        addView(textView, ha.e(-2, -2, 17));
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
        m1 m1Var = new m1(contextThemeWrapper);
        this.h0 = m1Var;
        m1Var.setAlpha(0.0f);
        m1Var.setTranslationX(-org.telegram.messenger.g0.L(18.0f));
        m1Var.b(0.33f, 10.0f);
        m1Var.setBrushWeight(this.F);
        m1Var.setValueOverride(new org.telegram.ui.Components.m(this));
        m1Var.setTranslationX(-org.telegram.messenger.g0.L(18.0f));
        m1Var.setAlpha(0.0f);
        addView(m1Var, ha.c(-1.0f, -1));
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0240  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void c(z1 z1Var, int i7, int i10) {
        Bitmap bitmap;
        y1 y1Var;
        boolean z9;
        float f10;
        int i11;
        Bitmap b10 = z1Var.b();
        Path path = z1Var.l;
        int width = b10.getWidth();
        int height = z1Var.b().getHeight();
        int i12 = 2;
        float max = Math.max(width, height) / (iz.o() == 2 ? 512.0f : 384.0f);
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
        float f13 = i7;
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
            boolean z10 = i15 != 0;
            if (i15 == 0) {
                int i16 = i13 - 1;
                boolean z11 = i16 >= 0;
                f10 = f11;
                int i17 = i13 + 1;
                boolean z12 = i17 < height3;
                if (!z11 || iArr[i16] == 0) {
                    i11 = i17;
                } else {
                    i11 = i17;
                    y1Var3 = new y1(min, width3, width2);
                }
                if (y1Var2 == null && z12 && iArr[i11] != 0) {
                    y1Var2 = new y1(min, width3, width2);
                }
            } else {
                f10 = f11;
            }
            boolean z13 = width3 == createBitmap.getWidth() + (-1);
            boolean z14 = width3 == 0;
            if (z13) {
                y1 y1Var4 = z10 ? new y1(min, width3, width2) : y1Var3;
                if (y1Var2 != null) {
                    arrayList.add(y1Var2);
                }
                if (y1Var4 != null) {
                    arrayList2.add(y1Var4);
                }
                y1Var2 = null;
                y1Var3 = null;
            }
            if (z14 && z10) {
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
            boolean z15 = iArr[(createBitmap.getWidth() * height5) + height4] != 0;
            if (z15) {
                bitmap = createBitmap;
            } else {
                int width4 = (createBitmap.getWidth() * (height5 - 1)) + height4;
                bitmap = createBitmap;
                int width5 = (createBitmap.getWidth() * (height5 + 1)) + height4;
                boolean z16 = width4 >= 0;
                boolean z17 = width5 < height3;
                if (z16 && iArr[width4] != 0) {
                    y1Var6 = new y1(min, height4, height5);
                }
                if (y1Var7 == null && z17 && iArr[width5] != 0) {
                    y1Var = new y1(min, height4, height5);
                    int i20 = height3;
                    z9 = height5 != bitmap.getHeight() + (-1);
                    boolean z18 = height5 != 0;
                    if (z9) {
                        if (z15) {
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
                    y1Var5 = (z18 || !z15) ? y1Var : new y1(min, height4, height5);
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
            if (z9) {
            }
            if (z18) {
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
                paint4.setColor(m6.r1(0.04f, -1));
                paint4.setStrokeCap(cap);
                paint4.setStrokeWidth(org.telegram.messenger.g0.L(20.0f));
                paint4.setColor(m6.r1(0.04f, -1));
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
        int i7 = 1;
        while (i7 < arrayList.size() - 1) {
            y1 y1Var = (y1) arrayList.get(i7 - 1);
            y1 y1Var2 = (y1) arrayList.get(i7);
            i7++;
            y1 y1Var3 = (y1) arrayList.get(i7);
            int i10 = ((Point) y1Var2).x;
            int i11 = ((Point) y1Var).x;
            int i12 = ((Point) y1Var3).y;
            int i13 = ((Point) y1Var).y;
            if (Math.abs((((i12 - i13) * (i10 - i11)) - ((((Point) y1Var3).x - i11) * (((Point) y1Var2).y - i13))) - (-1.0f)) >= 0.15f) {
                arrayList2.add(y1Var2);
            }
        }
        arrayList2.add((y1) jg.g.i(1, arrayList));
        return arrayList2;
    }

    public final void a() {
        final a2 a2Var = this.W;
        if (a2Var == null) {
            return;
        }
        final int i7 = p10.s0;
        final int i10 = 1;
        a2Var.o = true;
        if (a2Var.m != null) {
            h();
            a2Var.m.a(a2Var.b, a2Var.e.document);
            org.telegram.messenger.g0.i3(new q61(18), 250L);
            return;
        }
        final int i11 = 0;
        if (a2Var.k != null) {
            TLRPC.TL_stickers_replaceSticker tL_stickers_replaceSticker = new TLRPC.TL_stickers_replaceSticker();
            tL_stickers_replaceSticker.sticker = ui.a0(a2Var.k, a2Var.c).document;
            tL_stickers_replaceSticker.new_sticker = a2Var.e;
            ConnectionsManager.getInstance(i7).sendRequest(tL_stickers_replaceSticker, new RequestDelegate(this) { // from class: tg.u1
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
                            final int i13 = i7;
                            final a2 a2Var2 = a2Var;
                            org.telegram.messenger.g0.h3(new Runnable() { // from class: tg.v1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean z9;
                                    boolean z10;
                                    boolean z11;
                                    switch (i12) {
                                        case 0:
                                            final TLObject tLObject2 = tLObject;
                                            boolean z12 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                            final c2 c2Var2 = c2Var;
                                            final a2 a2Var3 = a2Var2;
                                            if (z12) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                int i14 = i13;
                                                z9 = true;
                                                ui.b0(i14).I1(tL_messages_stickerSet, true);
                                                if (!ui.b0(i14).B0(tL_messages_stickerSet.set.id, true)) {
                                                    ui.b0(i14).f2(null, tLObject2, 2, null, false, false);
                                                }
                                                fi.s0 s0Var = c2Var2.d0;
                                                if (s0Var != null) {
                                                    s0Var.setProgress(1.0f);
                                                }
                                                final int i15 = 1;
                                                org.telegram.messenger.g0.i3(new Runnable() { // from class: tg.w1
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i16 = i15;
                                                        a2 a2Var4 = a2Var3;
                                                        TLObject tLObject3 = tLObject2;
                                                        c2 c2Var3 = c2Var2;
                                                        switch (i16) {
                                                            case 0:
                                                                qs f10 = qs.f(p10.s0);
                                                                TLRPC.Document document = a2Var4.f.document;
                                                                String str = a2Var4.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                f10.m(qs.s3, bool, tLObject3, document, str, bool);
                                                                c2Var3.h();
                                                                break;
                                                            case 1:
                                                                qs.f(p10.s0).m(qs.s3, Boolean.FALSE, tLObject3, a2Var4.f.document, a2Var4.l, Boolean.TRUE);
                                                                c2Var3.h();
                                                                break;
                                                            default:
                                                                qs f11 = qs.f(p10.s0);
                                                                TLRPC.Document document2 = a2Var4.f.document;
                                                                String str2 = a2Var4.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                f11.m(qs.s3, bool2, tLObject3, document2, str2, bool2);
                                                                c2Var3.h();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                            } else {
                                                c2Var2.n(tL_error);
                                                c2Var2.h();
                                                z9 = false;
                                            }
                                            c20 c20Var = a2Var3.n;
                                            if (c20Var != null) {
                                                c20Var.a(Boolean.valueOf(z9));
                                                a2Var3.n = null;
                                                break;
                                            }
                                            break;
                                        case 1:
                                            final TLObject tLObject3 = tLObject;
                                            boolean z13 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                            final c2 c2Var3 = c2Var;
                                            final a2 a2Var4 = a2Var2;
                                            if (z13) {
                                                int i16 = i13;
                                                z10 = true;
                                                ui.b0(i16).I1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                ui.b0(i16).f2(null, tLObject3, 2, null, false, false);
                                                fi.s0 s0Var2 = c2Var3.d0;
                                                if (s0Var2 != null) {
                                                    s0Var2.setProgress(1.0f);
                                                }
                                                final int i17 = 0;
                                                org.telegram.messenger.g0.i3(new Runnable() { // from class: tg.w1
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i162 = i17;
                                                        a2 a2Var42 = a2Var4;
                                                        TLObject tLObject32 = tLObject3;
                                                        c2 c2Var32 = c2Var3;
                                                        switch (i162) {
                                                            case 0:
                                                                qs f10 = qs.f(p10.s0);
                                                                TLRPC.Document document = a2Var42.f.document;
                                                                String str = a2Var42.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                f10.m(qs.s3, bool, tLObject32, document, str, bool);
                                                                c2Var32.h();
                                                                break;
                                                            case 1:
                                                                qs.f(p10.s0).m(qs.s3, Boolean.FALSE, tLObject32, a2Var42.f.document, a2Var42.l, Boolean.TRUE);
                                                                c2Var32.h();
                                                                break;
                                                            default:
                                                                qs f11 = qs.f(p10.s0);
                                                                TLRPC.Document document2 = a2Var42.f.document;
                                                                String str2 = a2Var42.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                f11.m(qs.s3, bool2, tLObject32, document2, str2, bool2);
                                                                c2Var32.h();
                                                                break;
                                                        }
                                                    }
                                                }, 250L);
                                            } else {
                                                c2Var3.n(tL_error);
                                                c2Var3.h();
                                                z10 = false;
                                            }
                                            c20 c20Var2 = a2Var4.n;
                                            if (c20Var2 != null) {
                                                c20Var2.a(Boolean.valueOf(z10));
                                                a2Var4.n = null;
                                                break;
                                            }
                                            break;
                                        default:
                                            final TLObject tLObject4 = tLObject;
                                            boolean z14 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                            final c2 c2Var4 = c2Var;
                                            final a2 a2Var5 = a2Var2;
                                            if (z14) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                int i18 = i13;
                                                z11 = true;
                                                ui.b0(i18).I1(tL_messages_stickerSet2, true);
                                                if (!ui.b0(i18).B0(tL_messages_stickerSet2.set.id, true)) {
                                                    ui.b0(i18).f2(null, tLObject4, 2, null, false, false);
                                                }
                                                fi.s0 s0Var3 = c2Var4.d0;
                                                if (s0Var3 != null) {
                                                    s0Var3.setProgress(1.0f);
                                                }
                                                final int i19 = 2;
                                                org.telegram.messenger.g0.i3(new Runnable() { // from class: tg.w1
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i162 = i19;
                                                        a2 a2Var42 = a2Var5;
                                                        TLObject tLObject32 = tLObject4;
                                                        c2 c2Var32 = c2Var4;
                                                        switch (i162) {
                                                            case 0:
                                                                qs f10 = qs.f(p10.s0);
                                                                TLRPC.Document document = a2Var42.f.document;
                                                                String str = a2Var42.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                f10.m(qs.s3, bool, tLObject32, document, str, bool);
                                                                c2Var32.h();
                                                                break;
                                                            case 1:
                                                                qs.f(p10.s0).m(qs.s3, Boolean.FALSE, tLObject32, a2Var42.f.document, a2Var42.l, Boolean.TRUE);
                                                                c2Var32.h();
                                                                break;
                                                            default:
                                                                qs f11 = qs.f(p10.s0);
                                                                TLRPC.Document document2 = a2Var42.f.document;
                                                                String str2 = a2Var42.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                f11.m(qs.s3, bool2, tLObject32, document2, str2, bool2);
                                                                c2Var32.h();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                            } else {
                                                c2Var4.n(tL_error);
                                                c2Var4.h();
                                                z11 = false;
                                            }
                                            c20 c20Var3 = a2Var5.n;
                                            if (c20Var3 != null) {
                                                c20Var3.a(Boolean.valueOf(z11));
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
                            final int i15 = i7;
                            final a2 a2Var3 = a2Var;
                            org.telegram.messenger.g0.h3(new Runnable() { // from class: tg.v1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean z9;
                                    boolean z10;
                                    boolean z11;
                                    switch (i14) {
                                        case 0:
                                            final TLObject tLObject2 = tLObject;
                                            boolean z12 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                            final c2 c2Var22 = c2Var2;
                                            final a2 a2Var32 = a2Var3;
                                            if (z12) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                int i142 = i15;
                                                z9 = true;
                                                ui.b0(i142).I1(tL_messages_stickerSet, true);
                                                if (!ui.b0(i142).B0(tL_messages_stickerSet.set.id, true)) {
                                                    ui.b0(i142).f2(null, tLObject2, 2, null, false, false);
                                                }
                                                fi.s0 s0Var = c2Var22.d0;
                                                if (s0Var != null) {
                                                    s0Var.setProgress(1.0f);
                                                }
                                                final int i152 = 1;
                                                org.telegram.messenger.g0.i3(new Runnable() { // from class: tg.w1
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i162 = i152;
                                                        a2 a2Var42 = a2Var32;
                                                        TLObject tLObject32 = tLObject2;
                                                        c2 c2Var32 = c2Var22;
                                                        switch (i162) {
                                                            case 0:
                                                                qs f10 = qs.f(p10.s0);
                                                                TLRPC.Document document = a2Var42.f.document;
                                                                String str = a2Var42.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                f10.m(qs.s3, bool, tLObject32, document, str, bool);
                                                                c2Var32.h();
                                                                break;
                                                            case 1:
                                                                qs.f(p10.s0).m(qs.s3, Boolean.FALSE, tLObject32, a2Var42.f.document, a2Var42.l, Boolean.TRUE);
                                                                c2Var32.h();
                                                                break;
                                                            default:
                                                                qs f11 = qs.f(p10.s0);
                                                                TLRPC.Document document2 = a2Var42.f.document;
                                                                String str2 = a2Var42.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                f11.m(qs.s3, bool2, tLObject32, document2, str2, bool2);
                                                                c2Var32.h();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                            } else {
                                                c2Var22.n(tL_error);
                                                c2Var22.h();
                                                z9 = false;
                                            }
                                            c20 c20Var = a2Var32.n;
                                            if (c20Var != null) {
                                                c20Var.a(Boolean.valueOf(z9));
                                                a2Var32.n = null;
                                                break;
                                            }
                                            break;
                                        case 1:
                                            final TLObject tLObject3 = tLObject;
                                            boolean z13 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                            final c2 c2Var3 = c2Var2;
                                            final a2 a2Var4 = a2Var3;
                                            if (z13) {
                                                int i16 = i15;
                                                z10 = true;
                                                ui.b0(i16).I1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                ui.b0(i16).f2(null, tLObject3, 2, null, false, false);
                                                fi.s0 s0Var2 = c2Var3.d0;
                                                if (s0Var2 != null) {
                                                    s0Var2.setProgress(1.0f);
                                                }
                                                final int i17 = 0;
                                                org.telegram.messenger.g0.i3(new Runnable() { // from class: tg.w1
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i162 = i17;
                                                        a2 a2Var42 = a2Var4;
                                                        TLObject tLObject32 = tLObject3;
                                                        c2 c2Var32 = c2Var3;
                                                        switch (i162) {
                                                            case 0:
                                                                qs f10 = qs.f(p10.s0);
                                                                TLRPC.Document document = a2Var42.f.document;
                                                                String str = a2Var42.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                f10.m(qs.s3, bool, tLObject32, document, str, bool);
                                                                c2Var32.h();
                                                                break;
                                                            case 1:
                                                                qs.f(p10.s0).m(qs.s3, Boolean.FALSE, tLObject32, a2Var42.f.document, a2Var42.l, Boolean.TRUE);
                                                                c2Var32.h();
                                                                break;
                                                            default:
                                                                qs f11 = qs.f(p10.s0);
                                                                TLRPC.Document document2 = a2Var42.f.document;
                                                                String str2 = a2Var42.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                f11.m(qs.s3, bool2, tLObject32, document2, str2, bool2);
                                                                c2Var32.h();
                                                                break;
                                                        }
                                                    }
                                                }, 250L);
                                            } else {
                                                c2Var3.n(tL_error);
                                                c2Var3.h();
                                                z10 = false;
                                            }
                                            c20 c20Var2 = a2Var4.n;
                                            if (c20Var2 != null) {
                                                c20Var2.a(Boolean.valueOf(z10));
                                                a2Var4.n = null;
                                                break;
                                            }
                                            break;
                                        default:
                                            final TLObject tLObject4 = tLObject;
                                            boolean z14 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                            final c2 c2Var4 = c2Var2;
                                            final a2 a2Var5 = a2Var3;
                                            if (z14) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                int i18 = i15;
                                                z11 = true;
                                                ui.b0(i18).I1(tL_messages_stickerSet2, true);
                                                if (!ui.b0(i18).B0(tL_messages_stickerSet2.set.id, true)) {
                                                    ui.b0(i18).f2(null, tLObject4, 2, null, false, false);
                                                }
                                                fi.s0 s0Var3 = c2Var4.d0;
                                                if (s0Var3 != null) {
                                                    s0Var3.setProgress(1.0f);
                                                }
                                                final int i19 = 2;
                                                org.telegram.messenger.g0.i3(new Runnable() { // from class: tg.w1
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i162 = i19;
                                                        a2 a2Var42 = a2Var5;
                                                        TLObject tLObject32 = tLObject4;
                                                        c2 c2Var32 = c2Var4;
                                                        switch (i162) {
                                                            case 0:
                                                                qs f10 = qs.f(p10.s0);
                                                                TLRPC.Document document = a2Var42.f.document;
                                                                String str = a2Var42.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                f10.m(qs.s3, bool, tLObject32, document, str, bool);
                                                                c2Var32.h();
                                                                break;
                                                            case 1:
                                                                qs.f(p10.s0).m(qs.s3, Boolean.FALSE, tLObject32, a2Var42.f.document, a2Var42.l, Boolean.TRUE);
                                                                c2Var32.h();
                                                                break;
                                                            default:
                                                                qs f11 = qs.f(p10.s0);
                                                                TLRPC.Document document2 = a2Var42.f.document;
                                                                String str2 = a2Var42.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                f11.m(qs.s3, bool2, tLObject32, document2, str2, bool2);
                                                                c2Var32.h();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                            } else {
                                                c2Var4.n(tL_error);
                                                c2Var4.h();
                                                z11 = false;
                                            }
                                            c20 c20Var3 = a2Var5.n;
                                            if (c20Var3 != null) {
                                                c20Var3.a(Boolean.valueOf(z11));
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
                            final int i17 = i7;
                            final a2 a2Var4 = a2Var;
                            org.telegram.messenger.g0.h3(new Runnable() { // from class: tg.v1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean z9;
                                    boolean z10;
                                    boolean z11;
                                    switch (i16) {
                                        case 0:
                                            final TLObject tLObject2 = tLObject;
                                            boolean z12 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                            final c2 c2Var22 = c2Var3;
                                            final a2 a2Var32 = a2Var4;
                                            if (z12) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                int i142 = i17;
                                                z9 = true;
                                                ui.b0(i142).I1(tL_messages_stickerSet, true);
                                                if (!ui.b0(i142).B0(tL_messages_stickerSet.set.id, true)) {
                                                    ui.b0(i142).f2(null, tLObject2, 2, null, false, false);
                                                }
                                                fi.s0 s0Var = c2Var22.d0;
                                                if (s0Var != null) {
                                                    s0Var.setProgress(1.0f);
                                                }
                                                final int i152 = 1;
                                                org.telegram.messenger.g0.i3(new Runnable() { // from class: tg.w1
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i162 = i152;
                                                        a2 a2Var42 = a2Var32;
                                                        TLObject tLObject32 = tLObject2;
                                                        c2 c2Var32 = c2Var22;
                                                        switch (i162) {
                                                            case 0:
                                                                qs f10 = qs.f(p10.s0);
                                                                TLRPC.Document document = a2Var42.f.document;
                                                                String str = a2Var42.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                f10.m(qs.s3, bool, tLObject32, document, str, bool);
                                                                c2Var32.h();
                                                                break;
                                                            case 1:
                                                                qs.f(p10.s0).m(qs.s3, Boolean.FALSE, tLObject32, a2Var42.f.document, a2Var42.l, Boolean.TRUE);
                                                                c2Var32.h();
                                                                break;
                                                            default:
                                                                qs f11 = qs.f(p10.s0);
                                                                TLRPC.Document document2 = a2Var42.f.document;
                                                                String str2 = a2Var42.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                f11.m(qs.s3, bool2, tLObject32, document2, str2, bool2);
                                                                c2Var32.h();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                            } else {
                                                c2Var22.n(tL_error);
                                                c2Var22.h();
                                                z9 = false;
                                            }
                                            c20 c20Var = a2Var32.n;
                                            if (c20Var != null) {
                                                c20Var.a(Boolean.valueOf(z9));
                                                a2Var32.n = null;
                                                break;
                                            }
                                            break;
                                        case 1:
                                            final TLObject tLObject3 = tLObject;
                                            boolean z13 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                            final c2 c2Var32 = c2Var3;
                                            final a2 a2Var42 = a2Var4;
                                            if (z13) {
                                                int i162 = i17;
                                                z10 = true;
                                                ui.b0(i162).I1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                ui.b0(i162).f2(null, tLObject3, 2, null, false, false);
                                                fi.s0 s0Var2 = c2Var32.d0;
                                                if (s0Var2 != null) {
                                                    s0Var2.setProgress(1.0f);
                                                }
                                                final int i172 = 0;
                                                org.telegram.messenger.g0.i3(new Runnable() { // from class: tg.w1
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i1622 = i172;
                                                        a2 a2Var422 = a2Var42;
                                                        TLObject tLObject32 = tLObject3;
                                                        c2 c2Var322 = c2Var32;
                                                        switch (i1622) {
                                                            case 0:
                                                                qs f10 = qs.f(p10.s0);
                                                                TLRPC.Document document = a2Var422.f.document;
                                                                String str = a2Var422.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                f10.m(qs.s3, bool, tLObject32, document, str, bool);
                                                                c2Var322.h();
                                                                break;
                                                            case 1:
                                                                qs.f(p10.s0).m(qs.s3, Boolean.FALSE, tLObject32, a2Var422.f.document, a2Var422.l, Boolean.TRUE);
                                                                c2Var322.h();
                                                                break;
                                                            default:
                                                                qs f11 = qs.f(p10.s0);
                                                                TLRPC.Document document2 = a2Var422.f.document;
                                                                String str2 = a2Var422.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                f11.m(qs.s3, bool2, tLObject32, document2, str2, bool2);
                                                                c2Var322.h();
                                                                break;
                                                        }
                                                    }
                                                }, 250L);
                                            } else {
                                                c2Var32.n(tL_error);
                                                c2Var32.h();
                                                z10 = false;
                                            }
                                            c20 c20Var2 = a2Var42.n;
                                            if (c20Var2 != null) {
                                                c20Var2.a(Boolean.valueOf(z10));
                                                a2Var42.n = null;
                                                break;
                                            }
                                            break;
                                        default:
                                            final TLObject tLObject4 = tLObject;
                                            boolean z14 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                            final c2 c2Var4 = c2Var3;
                                            final a2 a2Var5 = a2Var4;
                                            if (z14) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                int i18 = i17;
                                                z11 = true;
                                                ui.b0(i18).I1(tL_messages_stickerSet2, true);
                                                if (!ui.b0(i18).B0(tL_messages_stickerSet2.set.id, true)) {
                                                    ui.b0(i18).f2(null, tLObject4, 2, null, false, false);
                                                }
                                                fi.s0 s0Var3 = c2Var4.d0;
                                                if (s0Var3 != null) {
                                                    s0Var3.setProgress(1.0f);
                                                }
                                                final int i19 = 2;
                                                org.telegram.messenger.g0.i3(new Runnable() { // from class: tg.w1
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i1622 = i19;
                                                        a2 a2Var422 = a2Var5;
                                                        TLObject tLObject32 = tLObject4;
                                                        c2 c2Var322 = c2Var4;
                                                        switch (i1622) {
                                                            case 0:
                                                                qs f10 = qs.f(p10.s0);
                                                                TLRPC.Document document = a2Var422.f.document;
                                                                String str = a2Var422.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                f10.m(qs.s3, bool, tLObject32, document, str, bool);
                                                                c2Var322.h();
                                                                break;
                                                            case 1:
                                                                qs.f(p10.s0).m(qs.s3, Boolean.FALSE, tLObject32, a2Var422.f.document, a2Var422.l, Boolean.TRUE);
                                                                c2Var322.h();
                                                                break;
                                                            default:
                                                                qs f11 = qs.f(p10.s0);
                                                                TLRPC.Document document2 = a2Var422.f.document;
                                                                String str2 = a2Var422.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                f11.m(qs.s3, bool2, tLObject32, document2, str2, bool2);
                                                                c2Var322.h();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                            } else {
                                                c2Var4.n(tL_error);
                                                c2Var4.h();
                                                z11 = false;
                                            }
                                            c20 c20Var3 = a2Var5.n;
                                            if (c20Var3 != null) {
                                                c20Var3.a(Boolean.valueOf(z11));
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
            ConnectionsManager.getInstance(i7).sendRequest(tL_stickers_createStickerSet, new RequestDelegate(this) { // from class: tg.u1
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
                            final int i13 = i7;
                            final a2 a2Var2 = a2Var;
                            org.telegram.messenger.g0.h3(new Runnable() { // from class: tg.v1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean z9;
                                    boolean z10;
                                    boolean z11;
                                    switch (i12) {
                                        case 0:
                                            final TLObject tLObject2 = tLObject;
                                            boolean z12 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                            final c2 c2Var22 = c2Var;
                                            final a2 a2Var32 = a2Var2;
                                            if (z12) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                int i142 = i13;
                                                z9 = true;
                                                ui.b0(i142).I1(tL_messages_stickerSet, true);
                                                if (!ui.b0(i142).B0(tL_messages_stickerSet.set.id, true)) {
                                                    ui.b0(i142).f2(null, tLObject2, 2, null, false, false);
                                                }
                                                fi.s0 s0Var = c2Var22.d0;
                                                if (s0Var != null) {
                                                    s0Var.setProgress(1.0f);
                                                }
                                                final int i152 = 1;
                                                org.telegram.messenger.g0.i3(new Runnable() { // from class: tg.w1
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i1622 = i152;
                                                        a2 a2Var422 = a2Var32;
                                                        TLObject tLObject32 = tLObject2;
                                                        c2 c2Var322 = c2Var22;
                                                        switch (i1622) {
                                                            case 0:
                                                                qs f10 = qs.f(p10.s0);
                                                                TLRPC.Document document = a2Var422.f.document;
                                                                String str = a2Var422.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                f10.m(qs.s3, bool, tLObject32, document, str, bool);
                                                                c2Var322.h();
                                                                break;
                                                            case 1:
                                                                qs.f(p10.s0).m(qs.s3, Boolean.FALSE, tLObject32, a2Var422.f.document, a2Var422.l, Boolean.TRUE);
                                                                c2Var322.h();
                                                                break;
                                                            default:
                                                                qs f11 = qs.f(p10.s0);
                                                                TLRPC.Document document2 = a2Var422.f.document;
                                                                String str2 = a2Var422.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                f11.m(qs.s3, bool2, tLObject32, document2, str2, bool2);
                                                                c2Var322.h();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                            } else {
                                                c2Var22.n(tL_error);
                                                c2Var22.h();
                                                z9 = false;
                                            }
                                            c20 c20Var = a2Var32.n;
                                            if (c20Var != null) {
                                                c20Var.a(Boolean.valueOf(z9));
                                                a2Var32.n = null;
                                                break;
                                            }
                                            break;
                                        case 1:
                                            final TLObject tLObject3 = tLObject;
                                            boolean z13 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                            final c2 c2Var32 = c2Var;
                                            final a2 a2Var42 = a2Var2;
                                            if (z13) {
                                                int i162 = i13;
                                                z10 = true;
                                                ui.b0(i162).I1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                ui.b0(i162).f2(null, tLObject3, 2, null, false, false);
                                                fi.s0 s0Var2 = c2Var32.d0;
                                                if (s0Var2 != null) {
                                                    s0Var2.setProgress(1.0f);
                                                }
                                                final int i172 = 0;
                                                org.telegram.messenger.g0.i3(new Runnable() { // from class: tg.w1
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i1622 = i172;
                                                        a2 a2Var422 = a2Var42;
                                                        TLObject tLObject32 = tLObject3;
                                                        c2 c2Var322 = c2Var32;
                                                        switch (i1622) {
                                                            case 0:
                                                                qs f10 = qs.f(p10.s0);
                                                                TLRPC.Document document = a2Var422.f.document;
                                                                String str = a2Var422.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                f10.m(qs.s3, bool, tLObject32, document, str, bool);
                                                                c2Var322.h();
                                                                break;
                                                            case 1:
                                                                qs.f(p10.s0).m(qs.s3, Boolean.FALSE, tLObject32, a2Var422.f.document, a2Var422.l, Boolean.TRUE);
                                                                c2Var322.h();
                                                                break;
                                                            default:
                                                                qs f11 = qs.f(p10.s0);
                                                                TLRPC.Document document2 = a2Var422.f.document;
                                                                String str2 = a2Var422.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                f11.m(qs.s3, bool2, tLObject32, document2, str2, bool2);
                                                                c2Var322.h();
                                                                break;
                                                        }
                                                    }
                                                }, 250L);
                                            } else {
                                                c2Var32.n(tL_error);
                                                c2Var32.h();
                                                z10 = false;
                                            }
                                            c20 c20Var2 = a2Var42.n;
                                            if (c20Var2 != null) {
                                                c20Var2.a(Boolean.valueOf(z10));
                                                a2Var42.n = null;
                                                break;
                                            }
                                            break;
                                        default:
                                            final TLObject tLObject4 = tLObject;
                                            boolean z14 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                            final c2 c2Var4 = c2Var;
                                            final a2 a2Var5 = a2Var2;
                                            if (z14) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                int i18 = i13;
                                                z11 = true;
                                                ui.b0(i18).I1(tL_messages_stickerSet2, true);
                                                if (!ui.b0(i18).B0(tL_messages_stickerSet2.set.id, true)) {
                                                    ui.b0(i18).f2(null, tLObject4, 2, null, false, false);
                                                }
                                                fi.s0 s0Var3 = c2Var4.d0;
                                                if (s0Var3 != null) {
                                                    s0Var3.setProgress(1.0f);
                                                }
                                                final int i19 = 2;
                                                org.telegram.messenger.g0.i3(new Runnable() { // from class: tg.w1
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i1622 = i19;
                                                        a2 a2Var422 = a2Var5;
                                                        TLObject tLObject32 = tLObject4;
                                                        c2 c2Var322 = c2Var4;
                                                        switch (i1622) {
                                                            case 0:
                                                                qs f10 = qs.f(p10.s0);
                                                                TLRPC.Document document = a2Var422.f.document;
                                                                String str = a2Var422.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                f10.m(qs.s3, bool, tLObject32, document, str, bool);
                                                                c2Var322.h();
                                                                break;
                                                            case 1:
                                                                qs.f(p10.s0).m(qs.s3, Boolean.FALSE, tLObject32, a2Var422.f.document, a2Var422.l, Boolean.TRUE);
                                                                c2Var322.h();
                                                                break;
                                                            default:
                                                                qs f11 = qs.f(p10.s0);
                                                                TLRPC.Document document2 = a2Var422.f.document;
                                                                String str2 = a2Var422.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                f11.m(qs.s3, bool2, tLObject32, document2, str2, bool2);
                                                                c2Var322.h();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                            } else {
                                                c2Var4.n(tL_error);
                                                c2Var4.h();
                                                z11 = false;
                                            }
                                            c20 c20Var3 = a2Var5.n;
                                            if (c20Var3 != null) {
                                                c20Var3.a(Boolean.valueOf(z11));
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
                            final int i15 = i7;
                            final a2 a2Var3 = a2Var;
                            org.telegram.messenger.g0.h3(new Runnable() { // from class: tg.v1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean z9;
                                    boolean z10;
                                    boolean z11;
                                    switch (i14) {
                                        case 0:
                                            final TLObject tLObject2 = tLObject;
                                            boolean z12 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                            final c2 c2Var22 = c2Var2;
                                            final a2 a2Var32 = a2Var3;
                                            if (z12) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                int i142 = i15;
                                                z9 = true;
                                                ui.b0(i142).I1(tL_messages_stickerSet, true);
                                                if (!ui.b0(i142).B0(tL_messages_stickerSet.set.id, true)) {
                                                    ui.b0(i142).f2(null, tLObject2, 2, null, false, false);
                                                }
                                                fi.s0 s0Var = c2Var22.d0;
                                                if (s0Var != null) {
                                                    s0Var.setProgress(1.0f);
                                                }
                                                final int i152 = 1;
                                                org.telegram.messenger.g0.i3(new Runnable() { // from class: tg.w1
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i1622 = i152;
                                                        a2 a2Var422 = a2Var32;
                                                        TLObject tLObject32 = tLObject2;
                                                        c2 c2Var322 = c2Var22;
                                                        switch (i1622) {
                                                            case 0:
                                                                qs f10 = qs.f(p10.s0);
                                                                TLRPC.Document document = a2Var422.f.document;
                                                                String str = a2Var422.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                f10.m(qs.s3, bool, tLObject32, document, str, bool);
                                                                c2Var322.h();
                                                                break;
                                                            case 1:
                                                                qs.f(p10.s0).m(qs.s3, Boolean.FALSE, tLObject32, a2Var422.f.document, a2Var422.l, Boolean.TRUE);
                                                                c2Var322.h();
                                                                break;
                                                            default:
                                                                qs f11 = qs.f(p10.s0);
                                                                TLRPC.Document document2 = a2Var422.f.document;
                                                                String str2 = a2Var422.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                f11.m(qs.s3, bool2, tLObject32, document2, str2, bool2);
                                                                c2Var322.h();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                            } else {
                                                c2Var22.n(tL_error);
                                                c2Var22.h();
                                                z9 = false;
                                            }
                                            c20 c20Var = a2Var32.n;
                                            if (c20Var != null) {
                                                c20Var.a(Boolean.valueOf(z9));
                                                a2Var32.n = null;
                                                break;
                                            }
                                            break;
                                        case 1:
                                            final TLObject tLObject3 = tLObject;
                                            boolean z13 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                            final c2 c2Var32 = c2Var2;
                                            final a2 a2Var42 = a2Var3;
                                            if (z13) {
                                                int i162 = i15;
                                                z10 = true;
                                                ui.b0(i162).I1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                ui.b0(i162).f2(null, tLObject3, 2, null, false, false);
                                                fi.s0 s0Var2 = c2Var32.d0;
                                                if (s0Var2 != null) {
                                                    s0Var2.setProgress(1.0f);
                                                }
                                                final int i172 = 0;
                                                org.telegram.messenger.g0.i3(new Runnable() { // from class: tg.w1
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i1622 = i172;
                                                        a2 a2Var422 = a2Var42;
                                                        TLObject tLObject32 = tLObject3;
                                                        c2 c2Var322 = c2Var32;
                                                        switch (i1622) {
                                                            case 0:
                                                                qs f10 = qs.f(p10.s0);
                                                                TLRPC.Document document = a2Var422.f.document;
                                                                String str = a2Var422.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                f10.m(qs.s3, bool, tLObject32, document, str, bool);
                                                                c2Var322.h();
                                                                break;
                                                            case 1:
                                                                qs.f(p10.s0).m(qs.s3, Boolean.FALSE, tLObject32, a2Var422.f.document, a2Var422.l, Boolean.TRUE);
                                                                c2Var322.h();
                                                                break;
                                                            default:
                                                                qs f11 = qs.f(p10.s0);
                                                                TLRPC.Document document2 = a2Var422.f.document;
                                                                String str2 = a2Var422.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                f11.m(qs.s3, bool2, tLObject32, document2, str2, bool2);
                                                                c2Var322.h();
                                                                break;
                                                        }
                                                    }
                                                }, 250L);
                                            } else {
                                                c2Var32.n(tL_error);
                                                c2Var32.h();
                                                z10 = false;
                                            }
                                            c20 c20Var2 = a2Var42.n;
                                            if (c20Var2 != null) {
                                                c20Var2.a(Boolean.valueOf(z10));
                                                a2Var42.n = null;
                                                break;
                                            }
                                            break;
                                        default:
                                            final TLObject tLObject4 = tLObject;
                                            boolean z14 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                            final c2 c2Var4 = c2Var2;
                                            final a2 a2Var5 = a2Var3;
                                            if (z14) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                int i18 = i15;
                                                z11 = true;
                                                ui.b0(i18).I1(tL_messages_stickerSet2, true);
                                                if (!ui.b0(i18).B0(tL_messages_stickerSet2.set.id, true)) {
                                                    ui.b0(i18).f2(null, tLObject4, 2, null, false, false);
                                                }
                                                fi.s0 s0Var3 = c2Var4.d0;
                                                if (s0Var3 != null) {
                                                    s0Var3.setProgress(1.0f);
                                                }
                                                final int i19 = 2;
                                                org.telegram.messenger.g0.i3(new Runnable() { // from class: tg.w1
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i1622 = i19;
                                                        a2 a2Var422 = a2Var5;
                                                        TLObject tLObject32 = tLObject4;
                                                        c2 c2Var322 = c2Var4;
                                                        switch (i1622) {
                                                            case 0:
                                                                qs f10 = qs.f(p10.s0);
                                                                TLRPC.Document document = a2Var422.f.document;
                                                                String str = a2Var422.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                f10.m(qs.s3, bool, tLObject32, document, str, bool);
                                                                c2Var322.h();
                                                                break;
                                                            case 1:
                                                                qs.f(p10.s0).m(qs.s3, Boolean.FALSE, tLObject32, a2Var422.f.document, a2Var422.l, Boolean.TRUE);
                                                                c2Var322.h();
                                                                break;
                                                            default:
                                                                qs f11 = qs.f(p10.s0);
                                                                TLRPC.Document document2 = a2Var422.f.document;
                                                                String str2 = a2Var422.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                f11.m(qs.s3, bool2, tLObject32, document2, str2, bool2);
                                                                c2Var322.h();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                            } else {
                                                c2Var4.n(tL_error);
                                                c2Var4.h();
                                                z11 = false;
                                            }
                                            c20 c20Var3 = a2Var5.n;
                                            if (c20Var3 != null) {
                                                c20Var3.a(Boolean.valueOf(z11));
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
                            final int i17 = i7;
                            final a2 a2Var4 = a2Var;
                            org.telegram.messenger.g0.h3(new Runnable() { // from class: tg.v1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean z9;
                                    boolean z10;
                                    boolean z11;
                                    switch (i16) {
                                        case 0:
                                            final TLObject tLObject2 = tLObject;
                                            boolean z12 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                            final c2 c2Var22 = c2Var3;
                                            final a2 a2Var32 = a2Var4;
                                            if (z12) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                int i142 = i17;
                                                z9 = true;
                                                ui.b0(i142).I1(tL_messages_stickerSet, true);
                                                if (!ui.b0(i142).B0(tL_messages_stickerSet.set.id, true)) {
                                                    ui.b0(i142).f2(null, tLObject2, 2, null, false, false);
                                                }
                                                fi.s0 s0Var = c2Var22.d0;
                                                if (s0Var != null) {
                                                    s0Var.setProgress(1.0f);
                                                }
                                                final int i152 = 1;
                                                org.telegram.messenger.g0.i3(new Runnable() { // from class: tg.w1
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i1622 = i152;
                                                        a2 a2Var422 = a2Var32;
                                                        TLObject tLObject32 = tLObject2;
                                                        c2 c2Var322 = c2Var22;
                                                        switch (i1622) {
                                                            case 0:
                                                                qs f10 = qs.f(p10.s0);
                                                                TLRPC.Document document = a2Var422.f.document;
                                                                String str = a2Var422.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                f10.m(qs.s3, bool, tLObject32, document, str, bool);
                                                                c2Var322.h();
                                                                break;
                                                            case 1:
                                                                qs.f(p10.s0).m(qs.s3, Boolean.FALSE, tLObject32, a2Var422.f.document, a2Var422.l, Boolean.TRUE);
                                                                c2Var322.h();
                                                                break;
                                                            default:
                                                                qs f11 = qs.f(p10.s0);
                                                                TLRPC.Document document2 = a2Var422.f.document;
                                                                String str2 = a2Var422.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                f11.m(qs.s3, bool2, tLObject32, document2, str2, bool2);
                                                                c2Var322.h();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                            } else {
                                                c2Var22.n(tL_error);
                                                c2Var22.h();
                                                z9 = false;
                                            }
                                            c20 c20Var = a2Var32.n;
                                            if (c20Var != null) {
                                                c20Var.a(Boolean.valueOf(z9));
                                                a2Var32.n = null;
                                                break;
                                            }
                                            break;
                                        case 1:
                                            final TLObject tLObject3 = tLObject;
                                            boolean z13 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                            final c2 c2Var32 = c2Var3;
                                            final a2 a2Var42 = a2Var4;
                                            if (z13) {
                                                int i162 = i17;
                                                z10 = true;
                                                ui.b0(i162).I1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                ui.b0(i162).f2(null, tLObject3, 2, null, false, false);
                                                fi.s0 s0Var2 = c2Var32.d0;
                                                if (s0Var2 != null) {
                                                    s0Var2.setProgress(1.0f);
                                                }
                                                final int i172 = 0;
                                                org.telegram.messenger.g0.i3(new Runnable() { // from class: tg.w1
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i1622 = i172;
                                                        a2 a2Var422 = a2Var42;
                                                        TLObject tLObject32 = tLObject3;
                                                        c2 c2Var322 = c2Var32;
                                                        switch (i1622) {
                                                            case 0:
                                                                qs f10 = qs.f(p10.s0);
                                                                TLRPC.Document document = a2Var422.f.document;
                                                                String str = a2Var422.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                f10.m(qs.s3, bool, tLObject32, document, str, bool);
                                                                c2Var322.h();
                                                                break;
                                                            case 1:
                                                                qs.f(p10.s0).m(qs.s3, Boolean.FALSE, tLObject32, a2Var422.f.document, a2Var422.l, Boolean.TRUE);
                                                                c2Var322.h();
                                                                break;
                                                            default:
                                                                qs f11 = qs.f(p10.s0);
                                                                TLRPC.Document document2 = a2Var422.f.document;
                                                                String str2 = a2Var422.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                f11.m(qs.s3, bool2, tLObject32, document2, str2, bool2);
                                                                c2Var322.h();
                                                                break;
                                                        }
                                                    }
                                                }, 250L);
                                            } else {
                                                c2Var32.n(tL_error);
                                                c2Var32.h();
                                                z10 = false;
                                            }
                                            c20 c20Var2 = a2Var42.n;
                                            if (c20Var2 != null) {
                                                c20Var2.a(Boolean.valueOf(z10));
                                                a2Var42.n = null;
                                                break;
                                            }
                                            break;
                                        default:
                                            final TLObject tLObject4 = tLObject;
                                            boolean z14 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                            final c2 c2Var4 = c2Var3;
                                            final a2 a2Var5 = a2Var4;
                                            if (z14) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                int i18 = i17;
                                                z11 = true;
                                                ui.b0(i18).I1(tL_messages_stickerSet2, true);
                                                if (!ui.b0(i18).B0(tL_messages_stickerSet2.set.id, true)) {
                                                    ui.b0(i18).f2(null, tLObject4, 2, null, false, false);
                                                }
                                                fi.s0 s0Var3 = c2Var4.d0;
                                                if (s0Var3 != null) {
                                                    s0Var3.setProgress(1.0f);
                                                }
                                                final int i19 = 2;
                                                org.telegram.messenger.g0.i3(new Runnable() { // from class: tg.w1
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i1622 = i19;
                                                        a2 a2Var422 = a2Var5;
                                                        TLObject tLObject32 = tLObject4;
                                                        c2 c2Var322 = c2Var4;
                                                        switch (i1622) {
                                                            case 0:
                                                                qs f10 = qs.f(p10.s0);
                                                                TLRPC.Document document = a2Var422.f.document;
                                                                String str = a2Var422.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                f10.m(qs.s3, bool, tLObject32, document, str, bool);
                                                                c2Var322.h();
                                                                break;
                                                            case 1:
                                                                qs.f(p10.s0).m(qs.s3, Boolean.FALSE, tLObject32, a2Var422.f.document, a2Var422.l, Boolean.TRUE);
                                                                c2Var322.h();
                                                                break;
                                                            default:
                                                                qs f11 = qs.f(p10.s0);
                                                                TLRPC.Document document2 = a2Var422.f.document;
                                                                String str2 = a2Var422.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                f11.m(qs.s3, bool2, tLObject32, document2, str2, bool2);
                                                                c2Var322.h();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                            } else {
                                                c2Var4.n(tL_error);
                                                c2Var4.h();
                                                z11 = false;
                                            }
                                            c20 c20Var3 = a2Var5.n;
                                            if (c20Var3 != null) {
                                                c20Var3.a(Boolean.valueOf(z11));
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
            qs.f(i7).m(qs.s3, Boolean.FALSE);
            org.telegram.messenger.g0.i3(new sh.b(a2Var, 5), 350L);
            c20 c20Var = a2Var.n;
            if (c20Var != null) {
                c20Var.a(Boolean.TRUE);
                return;
            }
            return;
        }
        if (a2Var.i == 0) {
            if (a2Var.j != null) {
                TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet = new TLRPC.TL_stickers_addStickerToSet();
                tL_stickers_addStickerToSet.stickerset = ui.Z(a2Var.j);
                tL_stickers_addStickerToSet.sticker = a2Var.e;
                final int i12 = 2;
                ConnectionsManager.getInstance(i7).sendRequest(tL_stickers_addStickerToSet, new RequestDelegate(this) { // from class: tg.u1
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
                                final int i13 = i7;
                                final a2 a2Var2 = a2Var;
                                org.telegram.messenger.g0.h3(new Runnable() { // from class: tg.v1
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        boolean z9;
                                        boolean z10;
                                        boolean z11;
                                        switch (i122) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                boolean z12 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                                final c2 c2Var22 = c2Var;
                                                final a2 a2Var32 = a2Var2;
                                                if (z12) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i142 = i13;
                                                    z9 = true;
                                                    ui.b0(i142).I1(tL_messages_stickerSet, true);
                                                    if (!ui.b0(i142).B0(tL_messages_stickerSet.set.id, true)) {
                                                        ui.b0(i142).f2(null, tLObject2, 2, null, false, false);
                                                    }
                                                    fi.s0 s0Var = c2Var22.d0;
                                                    if (s0Var != null) {
                                                        s0Var.setProgress(1.0f);
                                                    }
                                                    final int i152 = 1;
                                                    org.telegram.messenger.g0.i3(new Runnable() { // from class: tg.w1
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            int i1622 = i152;
                                                            a2 a2Var422 = a2Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            c2 c2Var322 = c2Var22;
                                                            switch (i1622) {
                                                                case 0:
                                                                    qs f10 = qs.f(p10.s0);
                                                                    TLRPC.Document document = a2Var422.f.document;
                                                                    String str = a2Var422.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(qs.s3, bool, tLObject32, document, str, bool);
                                                                    c2Var322.h();
                                                                    break;
                                                                case 1:
                                                                    qs.f(p10.s0).m(qs.s3, Boolean.FALSE, tLObject32, a2Var422.f.document, a2Var422.l, Boolean.TRUE);
                                                                    c2Var322.h();
                                                                    break;
                                                                default:
                                                                    qs f11 = qs.f(p10.s0);
                                                                    TLRPC.Document document2 = a2Var422.f.document;
                                                                    String str2 = a2Var422.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(qs.s3, bool2, tLObject32, document2, str2, bool2);
                                                                    c2Var322.h();
                                                                    break;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    c2Var22.n(tL_error);
                                                    c2Var22.h();
                                                    z9 = false;
                                                }
                                                c20 c20Var2 = a2Var32.n;
                                                if (c20Var2 != null) {
                                                    c20Var2.a(Boolean.valueOf(z9));
                                                    a2Var32.n = null;
                                                    break;
                                                }
                                                break;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z13 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final c2 c2Var32 = c2Var;
                                                final a2 a2Var42 = a2Var2;
                                                if (z13) {
                                                    int i162 = i13;
                                                    z10 = true;
                                                    ui.b0(i162).I1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                    ui.b0(i162).f2(null, tLObject3, 2, null, false, false);
                                                    fi.s0 s0Var2 = c2Var32.d0;
                                                    if (s0Var2 != null) {
                                                        s0Var2.setProgress(1.0f);
                                                    }
                                                    final int i172 = 0;
                                                    org.telegram.messenger.g0.i3(new Runnable() { // from class: tg.w1
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            int i1622 = i172;
                                                            a2 a2Var422 = a2Var42;
                                                            TLObject tLObject32 = tLObject3;
                                                            c2 c2Var322 = c2Var32;
                                                            switch (i1622) {
                                                                case 0:
                                                                    qs f10 = qs.f(p10.s0);
                                                                    TLRPC.Document document = a2Var422.f.document;
                                                                    String str = a2Var422.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(qs.s3, bool, tLObject32, document, str, bool);
                                                                    c2Var322.h();
                                                                    break;
                                                                case 1:
                                                                    qs.f(p10.s0).m(qs.s3, Boolean.FALSE, tLObject32, a2Var422.f.document, a2Var422.l, Boolean.TRUE);
                                                                    c2Var322.h();
                                                                    break;
                                                                default:
                                                                    qs f11 = qs.f(p10.s0);
                                                                    TLRPC.Document document2 = a2Var422.f.document;
                                                                    String str2 = a2Var422.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(qs.s3, bool2, tLObject32, document2, str2, bool2);
                                                                    c2Var322.h();
                                                                    break;
                                                            }
                                                        }
                                                    }, 250L);
                                                } else {
                                                    c2Var32.n(tL_error);
                                                    c2Var32.h();
                                                    z10 = false;
                                                }
                                                c20 c20Var22 = a2Var42.n;
                                                if (c20Var22 != null) {
                                                    c20Var22.a(Boolean.valueOf(z10));
                                                    a2Var42.n = null;
                                                    break;
                                                }
                                                break;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z14 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final c2 c2Var4 = c2Var;
                                                final a2 a2Var5 = a2Var2;
                                                if (z14) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i18 = i13;
                                                    z11 = true;
                                                    ui.b0(i18).I1(tL_messages_stickerSet2, true);
                                                    if (!ui.b0(i18).B0(tL_messages_stickerSet2.set.id, true)) {
                                                        ui.b0(i18).f2(null, tLObject4, 2, null, false, false);
                                                    }
                                                    fi.s0 s0Var3 = c2Var4.d0;
                                                    if (s0Var3 != null) {
                                                        s0Var3.setProgress(1.0f);
                                                    }
                                                    final int i19 = 2;
                                                    org.telegram.messenger.g0.i3(new Runnable() { // from class: tg.w1
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            int i1622 = i19;
                                                            a2 a2Var422 = a2Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            c2 c2Var322 = c2Var4;
                                                            switch (i1622) {
                                                                case 0:
                                                                    qs f10 = qs.f(p10.s0);
                                                                    TLRPC.Document document = a2Var422.f.document;
                                                                    String str = a2Var422.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(qs.s3, bool, tLObject32, document, str, bool);
                                                                    c2Var322.h();
                                                                    break;
                                                                case 1:
                                                                    qs.f(p10.s0).m(qs.s3, Boolean.FALSE, tLObject32, a2Var422.f.document, a2Var422.l, Boolean.TRUE);
                                                                    c2Var322.h();
                                                                    break;
                                                                default:
                                                                    qs f11 = qs.f(p10.s0);
                                                                    TLRPC.Document document2 = a2Var422.f.document;
                                                                    String str2 = a2Var422.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(qs.s3, bool2, tLObject32, document2, str2, bool2);
                                                                    c2Var322.h();
                                                                    break;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    c2Var4.n(tL_error);
                                                    c2Var4.h();
                                                    z11 = false;
                                                }
                                                c20 c20Var3 = a2Var5.n;
                                                if (c20Var3 != null) {
                                                    c20Var3.a(Boolean.valueOf(z11));
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
                                final int i15 = i7;
                                final a2 a2Var3 = a2Var;
                                org.telegram.messenger.g0.h3(new Runnable() { // from class: tg.v1
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        boolean z9;
                                        boolean z10;
                                        boolean z11;
                                        switch (i14) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                boolean z12 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                                final c2 c2Var22 = c2Var2;
                                                final a2 a2Var32 = a2Var3;
                                                if (z12) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i142 = i15;
                                                    z9 = true;
                                                    ui.b0(i142).I1(tL_messages_stickerSet, true);
                                                    if (!ui.b0(i142).B0(tL_messages_stickerSet.set.id, true)) {
                                                        ui.b0(i142).f2(null, tLObject2, 2, null, false, false);
                                                    }
                                                    fi.s0 s0Var = c2Var22.d0;
                                                    if (s0Var != null) {
                                                        s0Var.setProgress(1.0f);
                                                    }
                                                    final int i152 = 1;
                                                    org.telegram.messenger.g0.i3(new Runnable() { // from class: tg.w1
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            int i1622 = i152;
                                                            a2 a2Var422 = a2Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            c2 c2Var322 = c2Var22;
                                                            switch (i1622) {
                                                                case 0:
                                                                    qs f10 = qs.f(p10.s0);
                                                                    TLRPC.Document document = a2Var422.f.document;
                                                                    String str = a2Var422.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(qs.s3, bool, tLObject32, document, str, bool);
                                                                    c2Var322.h();
                                                                    break;
                                                                case 1:
                                                                    qs.f(p10.s0).m(qs.s3, Boolean.FALSE, tLObject32, a2Var422.f.document, a2Var422.l, Boolean.TRUE);
                                                                    c2Var322.h();
                                                                    break;
                                                                default:
                                                                    qs f11 = qs.f(p10.s0);
                                                                    TLRPC.Document document2 = a2Var422.f.document;
                                                                    String str2 = a2Var422.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(qs.s3, bool2, tLObject32, document2, str2, bool2);
                                                                    c2Var322.h();
                                                                    break;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    c2Var22.n(tL_error);
                                                    c2Var22.h();
                                                    z9 = false;
                                                }
                                                c20 c20Var2 = a2Var32.n;
                                                if (c20Var2 != null) {
                                                    c20Var2.a(Boolean.valueOf(z9));
                                                    a2Var32.n = null;
                                                    break;
                                                }
                                                break;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z13 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final c2 c2Var32 = c2Var2;
                                                final a2 a2Var42 = a2Var3;
                                                if (z13) {
                                                    int i162 = i15;
                                                    z10 = true;
                                                    ui.b0(i162).I1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                    ui.b0(i162).f2(null, tLObject3, 2, null, false, false);
                                                    fi.s0 s0Var2 = c2Var32.d0;
                                                    if (s0Var2 != null) {
                                                        s0Var2.setProgress(1.0f);
                                                    }
                                                    final int i172 = 0;
                                                    org.telegram.messenger.g0.i3(new Runnable() { // from class: tg.w1
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            int i1622 = i172;
                                                            a2 a2Var422 = a2Var42;
                                                            TLObject tLObject32 = tLObject3;
                                                            c2 c2Var322 = c2Var32;
                                                            switch (i1622) {
                                                                case 0:
                                                                    qs f10 = qs.f(p10.s0);
                                                                    TLRPC.Document document = a2Var422.f.document;
                                                                    String str = a2Var422.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(qs.s3, bool, tLObject32, document, str, bool);
                                                                    c2Var322.h();
                                                                    break;
                                                                case 1:
                                                                    qs.f(p10.s0).m(qs.s3, Boolean.FALSE, tLObject32, a2Var422.f.document, a2Var422.l, Boolean.TRUE);
                                                                    c2Var322.h();
                                                                    break;
                                                                default:
                                                                    qs f11 = qs.f(p10.s0);
                                                                    TLRPC.Document document2 = a2Var422.f.document;
                                                                    String str2 = a2Var422.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(qs.s3, bool2, tLObject32, document2, str2, bool2);
                                                                    c2Var322.h();
                                                                    break;
                                                            }
                                                        }
                                                    }, 250L);
                                                } else {
                                                    c2Var32.n(tL_error);
                                                    c2Var32.h();
                                                    z10 = false;
                                                }
                                                c20 c20Var22 = a2Var42.n;
                                                if (c20Var22 != null) {
                                                    c20Var22.a(Boolean.valueOf(z10));
                                                    a2Var42.n = null;
                                                    break;
                                                }
                                                break;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z14 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final c2 c2Var4 = c2Var2;
                                                final a2 a2Var5 = a2Var3;
                                                if (z14) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i18 = i15;
                                                    z11 = true;
                                                    ui.b0(i18).I1(tL_messages_stickerSet2, true);
                                                    if (!ui.b0(i18).B0(tL_messages_stickerSet2.set.id, true)) {
                                                        ui.b0(i18).f2(null, tLObject4, 2, null, false, false);
                                                    }
                                                    fi.s0 s0Var3 = c2Var4.d0;
                                                    if (s0Var3 != null) {
                                                        s0Var3.setProgress(1.0f);
                                                    }
                                                    final int i19 = 2;
                                                    org.telegram.messenger.g0.i3(new Runnable() { // from class: tg.w1
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            int i1622 = i19;
                                                            a2 a2Var422 = a2Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            c2 c2Var322 = c2Var4;
                                                            switch (i1622) {
                                                                case 0:
                                                                    qs f10 = qs.f(p10.s0);
                                                                    TLRPC.Document document = a2Var422.f.document;
                                                                    String str = a2Var422.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(qs.s3, bool, tLObject32, document, str, bool);
                                                                    c2Var322.h();
                                                                    break;
                                                                case 1:
                                                                    qs.f(p10.s0).m(qs.s3, Boolean.FALSE, tLObject32, a2Var422.f.document, a2Var422.l, Boolean.TRUE);
                                                                    c2Var322.h();
                                                                    break;
                                                                default:
                                                                    qs f11 = qs.f(p10.s0);
                                                                    TLRPC.Document document2 = a2Var422.f.document;
                                                                    String str2 = a2Var422.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(qs.s3, bool2, tLObject32, document2, str2, bool2);
                                                                    c2Var322.h();
                                                                    break;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    c2Var4.n(tL_error);
                                                    c2Var4.h();
                                                    z11 = false;
                                                }
                                                c20 c20Var3 = a2Var5.n;
                                                if (c20Var3 != null) {
                                                    c20Var3.a(Boolean.valueOf(z11));
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
                                final int i17 = i7;
                                final a2 a2Var4 = a2Var;
                                org.telegram.messenger.g0.h3(new Runnable() { // from class: tg.v1
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        boolean z9;
                                        boolean z10;
                                        boolean z11;
                                        switch (i16) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                boolean z12 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                                final c2 c2Var22 = c2Var3;
                                                final a2 a2Var32 = a2Var4;
                                                if (z12) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i142 = i17;
                                                    z9 = true;
                                                    ui.b0(i142).I1(tL_messages_stickerSet, true);
                                                    if (!ui.b0(i142).B0(tL_messages_stickerSet.set.id, true)) {
                                                        ui.b0(i142).f2(null, tLObject2, 2, null, false, false);
                                                    }
                                                    fi.s0 s0Var = c2Var22.d0;
                                                    if (s0Var != null) {
                                                        s0Var.setProgress(1.0f);
                                                    }
                                                    final int i152 = 1;
                                                    org.telegram.messenger.g0.i3(new Runnable() { // from class: tg.w1
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            int i1622 = i152;
                                                            a2 a2Var422 = a2Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            c2 c2Var322 = c2Var22;
                                                            switch (i1622) {
                                                                case 0:
                                                                    qs f10 = qs.f(p10.s0);
                                                                    TLRPC.Document document = a2Var422.f.document;
                                                                    String str = a2Var422.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(qs.s3, bool, tLObject32, document, str, bool);
                                                                    c2Var322.h();
                                                                    break;
                                                                case 1:
                                                                    qs.f(p10.s0).m(qs.s3, Boolean.FALSE, tLObject32, a2Var422.f.document, a2Var422.l, Boolean.TRUE);
                                                                    c2Var322.h();
                                                                    break;
                                                                default:
                                                                    qs f11 = qs.f(p10.s0);
                                                                    TLRPC.Document document2 = a2Var422.f.document;
                                                                    String str2 = a2Var422.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(qs.s3, bool2, tLObject32, document2, str2, bool2);
                                                                    c2Var322.h();
                                                                    break;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    c2Var22.n(tL_error);
                                                    c2Var22.h();
                                                    z9 = false;
                                                }
                                                c20 c20Var2 = a2Var32.n;
                                                if (c20Var2 != null) {
                                                    c20Var2.a(Boolean.valueOf(z9));
                                                    a2Var32.n = null;
                                                    break;
                                                }
                                                break;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z13 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final c2 c2Var32 = c2Var3;
                                                final a2 a2Var42 = a2Var4;
                                                if (z13) {
                                                    int i162 = i17;
                                                    z10 = true;
                                                    ui.b0(i162).I1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                    ui.b0(i162).f2(null, tLObject3, 2, null, false, false);
                                                    fi.s0 s0Var2 = c2Var32.d0;
                                                    if (s0Var2 != null) {
                                                        s0Var2.setProgress(1.0f);
                                                    }
                                                    final int i172 = 0;
                                                    org.telegram.messenger.g0.i3(new Runnable() { // from class: tg.w1
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            int i1622 = i172;
                                                            a2 a2Var422 = a2Var42;
                                                            TLObject tLObject32 = tLObject3;
                                                            c2 c2Var322 = c2Var32;
                                                            switch (i1622) {
                                                                case 0:
                                                                    qs f10 = qs.f(p10.s0);
                                                                    TLRPC.Document document = a2Var422.f.document;
                                                                    String str = a2Var422.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(qs.s3, bool, tLObject32, document, str, bool);
                                                                    c2Var322.h();
                                                                    break;
                                                                case 1:
                                                                    qs.f(p10.s0).m(qs.s3, Boolean.FALSE, tLObject32, a2Var422.f.document, a2Var422.l, Boolean.TRUE);
                                                                    c2Var322.h();
                                                                    break;
                                                                default:
                                                                    qs f11 = qs.f(p10.s0);
                                                                    TLRPC.Document document2 = a2Var422.f.document;
                                                                    String str2 = a2Var422.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(qs.s3, bool2, tLObject32, document2, str2, bool2);
                                                                    c2Var322.h();
                                                                    break;
                                                            }
                                                        }
                                                    }, 250L);
                                                } else {
                                                    c2Var32.n(tL_error);
                                                    c2Var32.h();
                                                    z10 = false;
                                                }
                                                c20 c20Var22 = a2Var42.n;
                                                if (c20Var22 != null) {
                                                    c20Var22.a(Boolean.valueOf(z10));
                                                    a2Var42.n = null;
                                                    break;
                                                }
                                                break;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z14 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final c2 c2Var4 = c2Var3;
                                                final a2 a2Var5 = a2Var4;
                                                if (z14) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i18 = i17;
                                                    z11 = true;
                                                    ui.b0(i18).I1(tL_messages_stickerSet2, true);
                                                    if (!ui.b0(i18).B0(tL_messages_stickerSet2.set.id, true)) {
                                                        ui.b0(i18).f2(null, tLObject4, 2, null, false, false);
                                                    }
                                                    fi.s0 s0Var3 = c2Var4.d0;
                                                    if (s0Var3 != null) {
                                                        s0Var3.setProgress(1.0f);
                                                    }
                                                    final int i19 = 2;
                                                    org.telegram.messenger.g0.i3(new Runnable() { // from class: tg.w1
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            int i1622 = i19;
                                                            a2 a2Var422 = a2Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            c2 c2Var322 = c2Var4;
                                                            switch (i1622) {
                                                                case 0:
                                                                    qs f10 = qs.f(p10.s0);
                                                                    TLRPC.Document document = a2Var422.f.document;
                                                                    String str = a2Var422.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(qs.s3, bool, tLObject32, document, str, bool);
                                                                    c2Var322.h();
                                                                    break;
                                                                case 1:
                                                                    qs.f(p10.s0).m(qs.s3, Boolean.FALSE, tLObject32, a2Var422.f.document, a2Var422.l, Boolean.TRUE);
                                                                    c2Var322.h();
                                                                    break;
                                                                default:
                                                                    qs f11 = qs.f(p10.s0);
                                                                    TLRPC.Document document2 = a2Var422.f.document;
                                                                    String str2 = a2Var422.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(qs.s3, bool2, tLObject32, document2, str2, bool2);
                                                                    c2Var322.h();
                                                                    break;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    c2Var4.n(tL_error);
                                                    c2Var4.h();
                                                    z11 = false;
                                                }
                                                c20 c20Var3 = a2Var5.n;
                                                if (c20Var3 != null) {
                                                    c20Var3.a(Boolean.valueOf(z11));
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
        gz.C(i7).v0(a2Var.f.document, null, a2Var.i, null, null, null, null, null, true, 0, 0, false, null, null, 0L, 0L, null);
        fi.s0 s0Var = this.d0;
        if (s0Var != null) {
            s0Var.setProgress(1.0f);
        }
        org.telegram.messenger.g0.i3(new org.telegram.ui.Wallet.f2(this, i7, 8), 450L);
        c20 c20Var2 = a2Var.n;
        if (c20Var2 != null) {
            c20Var2.a(Boolean.TRUE);
            a2Var.n = null;
        }
    }

    public final void b() {
        ValueAnimator valueAnimator = this.N;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.N = null;
        }
        this.I = null;
        if (this.H != null) {
            int i7 = 0;
            while (true) {
                z1[] z1VarArr = this.H;
                if (i7 >= z1VarArr.length) {
                    break;
                }
                z1 z1Var = z1VarArr[i7];
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
                i7++;
            }
            this.H = null;
        }
        this.D = false;
        this.y = false;
        this.L = false;
        this.M.setAlpha(0.0f);
        this.M.setScaleX(0.3f);
        this.M.setScaleY(0.3f);
        a2 a2Var = this.W;
        if (a2Var != null) {
            if (!a2Var.o) {
                a2Var.a();
            }
            this.W = null;
        }
        h();
        this.V = false;
    }

    public final Bitmap d(int i7, int i10, Bitmap bitmap, boolean z9) {
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
        if (z9) {
            canvas.scale(createBitmap.getWidth() / bitmap.getWidth(), createBitmap.getHeight() / bitmap.getHeight());
            canvas.drawBitmap(bitmap, i7, i10, paint);
        } else {
            canvas.drawBitmap(bitmap, i7, i10, paint);
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

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        a2 a2Var;
        if (i7 == qs.U1) {
            String str = (String) objArr[0];
            TLRPC.InputFile inputFile = (TLRPC.InputFile) objArr[1];
            a2 a2Var2 = this.W;
            if (a2Var2 == null || !str.equalsIgnoreCase(a2Var2.b)) {
                return;
            }
            a2 a2Var3 = this.W;
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
            ConnectionsManager.getInstance(p10.s0).sendRequest(tL_messages_uploadMedia, new p41(7, this, a2Var3), 2);
            return;
        }
        if (i7 == qs.W1) {
            String str2 = (String) objArr[0];
            a2 a2Var4 = this.W;
            if (a2Var4 == null || !str2.equalsIgnoreCase(a2Var4.b)) {
                return;
            }
            long longValue = ((Long) objArr[1]).longValue();
            long longValue2 = ((Long) objArr[2]).longValue();
            if (longValue2 > 0) {
                a2 a2Var5 = this.W;
                a2Var5.u = Utilities.i(longValue / longValue2, 1.0f, a2Var5.u);
                fi.s0 s0Var = this.d0;
                if (s0Var != null) {
                    s0Var.setProgress(this.W.b());
                    return;
                }
                return;
            }
            return;
        }
        if (i7 == qs.V1) {
            String str3 = (String) objArr[0];
            a2 a2Var6 = this.W;
            if (a2Var6 == null || !str3.equalsIgnoreCase(a2Var6.b)) {
                return;
            }
            h();
            return;
        }
        if (i7 == qs.a2) {
            a2 a2Var7 = this.W;
            if (a2Var7 != null && objArr[0] == a2Var7.r) {
                w7.G(p10.s0).h0(false, 67108864, this.W.b, true);
                return;
            }
            return;
        }
        if (i7 != qs.b2) {
            if (i7 == qs.c2 && (a2Var = this.W) != null && objArr[0] == a2Var.r) {
                h();
                return;
            }
            return;
        }
        a2 a2Var8 = this.W;
        if (a2Var8 != null && objArr[0] == a2Var8.r) {
            String str4 = (String) objArr[1];
            long longValue3 = ((Long) objArr[2]).longValue();
            long longValue4 = ((Long) objArr[3]).longValue();
            Float f10 = (Float) objArr[4];
            float floatValue = f10.floatValue();
            this.W.r.p0.Y = true;
            w7.G(this.a).n(str4, false, Math.max(1L, longValue3), longValue4, f10);
            a2 a2Var9 = this.W;
            a2Var9.t = Math.max(a2Var9.t, floatValue);
            fi.s0 s0Var2 = this.d0;
            if (s0Var2 != null) {
                s0Var2.setProgress(this.W.b());
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
        boolean z9;
        this.n0 = motionEvent.getX();
        float y10 = motionEvent.getY();
        this.o0 = y10;
        if (this.H != null && this.N != null) {
            z1 j3 = j(this.n0, y10);
            int i7 = 0;
            while (true) {
                z1[] z1VarArr = this.H;
                if (i7 >= z1VarArr.length) {
                    break;
                }
                if (z1VarArr[i7] == j3 && motionEvent.getAction() != 3) {
                    z9 = true;
                }
                z9 = false;
                if (z9 && !this.H[i7].b) {
                    org.telegram.messenger.g0.c4(this);
                }
                this.H[i7].b = z9;
                i7++;
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
        z1 z1Var = this.E;
        if (z1Var != null) {
            this.K = bitmap;
            if (z1Var.f != null && this.L) {
                Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                Paint paint = new Paint(3);
                Paint paint2 = new Paint(3);
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint2);
                Rect rect = new Rect();
                rect.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
                z1 z1Var2 = this.E;
                if (z1Var2.c == 0) {
                    canvas.drawBitmap(z1Var2.a(), (Rect) null, rect, paint);
                    return createBitmap;
                }
                Matrix matrix = new Matrix();
                z1 z1Var3 = this.E;
                matrix.postRotate(z1Var3.c, z1Var3.a().getWidth() / 2.0f, this.E.a().getHeight() / 2.0f);
                if ((this.E.c / 90) % 2 != 0) {
                    float height = (r4.b().getHeight() - this.E.b().getWidth()) / 2.0f;
                    matrix.postTranslate(height, -height);
                }
                matrix.postScale(bitmap.getWidth() / this.E.a().getHeight(), bitmap.getHeight() / this.E.a().getWidth());
                canvas.drawBitmap(this.E.a(), matrix, paint);
                return createBitmap;
            }
        }
        return bitmap;
    }

    public final void f() {
        this.b.e(false, 0.0f);
        ValueAnimator valueAnimator = this.N;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.N = null;
        }
        setOnClickListener(null);
        setClickable(false);
        TextView textView = this.M;
        textView.animate().cancel();
        textView.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(240L).setInterpolator(wq.h).start();
    }

    public final void g(Canvas canvas, boolean z9, ViewGroup viewGroup, boolean z10) {
        v5 v5Var = this.c;
        v5Var.a = viewGroup;
        boolean z11 = this.i0;
        if (z11 || v5Var.c > 0.0f) {
            float d = viewGroup == null ? 1.0f : v5Var.d(z11 && !z10);
            z1[] z1VarArr = this.H;
            if (z1VarArr != null) {
                for (z1 z1Var : z1VarArr) {
                    if (z1Var != null && z1Var == this.E) {
                        if (this.F > 0.0f) {
                            if (z1Var.t.k0 == null) {
                                return;
                            }
                            canvas.save();
                            canvas.clipPath(z1Var.t.k0);
                            if (z1Var.t.I != null) {
                                Paint paint = z9 ? z1Var.q : z1Var.p;
                                paint.setAlpha((int) (d * 255.0f));
                                paint.setStrokeWidth(org.telegram.messenger.g0.L(r4));
                                canvas.drawPath(z1Var.l, paint);
                                if (z1Var.t.k0 != null && z9) {
                                    canvas.clipPath(z1Var.l);
                                    paint.setStrokeWidth(org.telegram.messenger.g0.L(r4 * 2.0f));
                                    canvas.drawPath(z1Var.t.k0, paint);
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
        return this.P;
    }

    public float getSegmentBorderImageWidth() {
        return this.O;
    }

    public Bitmap getSegmentedDarkMaskImage() {
        z1 z1Var;
        if (!this.L || (z1Var = this.E) == null) {
            return null;
        }
        return z1Var.a();
    }

    public Bitmap getSourceBitmap() {
        return this.I;
    }

    public dz0 getThanosEffect() {
        if (!dz0.c()) {
            return null;
        }
        if (this.S == null) {
            dz0 dz0Var = new dz0(getContext(), new t1(this, 1));
            this.S = dz0Var;
            addView(dz0Var, ha.c(-1.0f, -1));
        }
        return this.S;
    }

    public final void h() {
        fi.s0 s0Var = this.d0;
        if (s0Var != null) {
            s0Var.a();
            this.d0 = null;
        }
    }

    public final boolean i() {
        return this.L;
    }

    public final z1 j(float f10, float f11) {
        int width;
        int height;
        if (this.I == null) {
            return null;
        }
        int i7 = 0;
        while (true) {
            z1[] z1VarArr = this.H;
            if (i7 >= z1VarArr.length) {
                return null;
            }
            z1 z1Var = z1VarArr[i7];
            if (z1Var != null) {
                if ((z1Var.c / 90) % 2 != 0) {
                    width = this.I.getHeight();
                    height = this.I.getWidth();
                } else {
                    width = this.I.getWidth();
                    height = this.I.getHeight();
                }
                RectF rectF = org.telegram.messenger.g0.P;
                RectF rectF2 = this.H[i7].i;
                float f12 = width;
                float f13 = rectF2.left / f12;
                float f14 = this.f0;
                float f15 = height;
                float f16 = rectF2.top / f15;
                float f17 = this.g0;
                rectF.set(f13 * f14, f16 * f17, (rectF2.right / f12) * f14, (rectF2.bottom / f15) * f17);
                this.e0.mapRect(rectF);
                if (rectF.contains(f10, f11)) {
                    return z1Var;
                }
            }
            i7++;
        }
    }

    public final void l() {
        Bitmap bitmap;
        z1[] z1VarArr = this.H;
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
                    c(z1Var, this.T, this.U);
                }
            }
        }
    }

    public final void m(Bitmap bitmap, int i7, int i10, int i11, mn0 mn0Var) {
        vb.c cVar;
        int i12 = i10 <= 0 ? org.telegram.messenger.g0.q.x : i10;
        int i13 = i11 <= 0 ? org.telegram.messenger.g0.q.y : i11;
        this.T = i12;
        this.U = i13;
        if (this.D || this.y || bitmap == null || Build.VERSION.SDK_INT < 24) {
            return;
        }
        this.I = bitmap;
        this.J = i7;
        this.c0 = null;
        d4 d4Var = new d4(this, i7, mn0Var, 5);
        this.y = true;
        ia.a aVar = new ia.a();
        aVar.b = true;
        aVar.c = true;
        zzd a10 = ke.a(new zb.d(aVar));
        if (n6.h(getContext()).f()) {
            ArrayList arrayList = new ArrayList();
            Bitmap bitmap2 = this.I;
            b2 b2Var = new b2();
            int min = (int) (Math.min(bitmap2.getWidth(), bitmap2.getHeight()) * 0.4f);
            b2Var.e = min;
            b2Var.d = min;
            b2Var.a = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
            new Canvas(b2Var.a).drawRect(0.0f, 0.0f, b2Var.d, b2Var.e, m6.Dm);
            b2Var.b = (bitmap2.getWidth() - b2Var.d) / 2;
            b2Var.c = (bitmap2.getHeight() - b2Var.e) / 2;
            arrayList.add(b2Var);
            d4Var.a(arrayList);
            return;
        }
        ub.a a11 = ub.a.a(i7, bitmap);
        a10.g(a11).addOnSuccessListener(new n3(d4Var, 24)).addOnFailureListener(new i6(this, bitmap, i7, mn0Var, d4Var, 5));
        if (this.c0 == null) {
            xb.a aVar2 = xb.a.b;
            q6.m.h(aVar2, "options cannot be null");
            synchronized (vb.c.class) {
                cVar = (vb.c) pb.g.c().a(vb.c.class);
            }
            ua.b bVar = (ua.b) cVar.a.get(xb.a.class);
            q6.m.g(bVar);
            yb.c cVar2 = (yb.c) bVar.get();
            cVar2.getClass();
            ta taVar = cVar2.c;
            b8 b8Var = new b8();
            b8Var.c = y7.b;
            pb.m.a.execute(new pa(taVar, new wa(b8Var, 1), a8.c, taVar.b(), 0));
            new ImageLabelerImpl((pb.e) cVar2.a.R0(aVar2), (Executor) cVar2.b.a.get(), new n6.c("vision.ica", 1L)).g(a11).addOnSuccessListener(new n3(this, 25)).addOnFailureListener(new s0.b(19));
        }
        ArrayList arrayList2 = ui.b0(this.a).n;
        for (int i14 = 0; i14 < Math.min(arrayList2.size(), 9); i14++) {
            org.telegram.messenger.i6.g(((TLRPC.TL_availableReaction) arrayList2.get(i14)).reaction);
        }
    }

    public final void n(TLRPC.TL_error tL_error) {
        if (tL_error == null || "PACK_TITLE_INVALID".equals(tL_error.text)) {
            return;
        }
        new gc((FrameLayout) getParent(), this.a0).t(tL_error.text, null).j();
    }

    public final void o() {
        Path path = this.k0;
        if (path == null) {
            this.k0 = new Path();
        } else {
            path.rewind();
        }
        if (this.l0 == null) {
            this.l0 = new Path();
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(0.0f, 0.0f, 1.0f, 1.0f);
            this.l0.addRoundRect(rectF, rectF.width() * 0.12f, rectF.height() * 0.12f, Path.Direction.CW);
        }
        this.k0.addPath(this.l0, this.j0);
        this.k0.computeBounds(this.m0, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        qs.f(this.a).c(this, qs.U1);
        qs.f(this.a).c(this, qs.W1);
        qs.f(this.a).c(this, qs.V1);
        qs.f(this.a).c(this, qs.c2);
        qs.f(this.a).c(this, qs.a2);
        qs.f(this.a).c(this, qs.b2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = this.a;
        if (i7 >= 0) {
            qs.f(i7).n(this, qs.U1);
            qs.f(this.a).n(this, qs.W1);
            qs.f(this.a).n(this, qs.V1);
            qs.f(this.a).n(this, qs.c2);
            qs.f(this.a).n(this, qs.a2);
            qs.f(this.a).n(this, qs.b2);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
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
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        this.M.setTranslationY(-((getMeasuredWidth() / 2.0f) + org.telegram.messenger.g0.L(10.0f)));
        if (Build.VERSION.SDK_INT >= 29) {
            ArrayList arrayList = this.p0;
            arrayList.clear();
            if (this.i0) {
                Rect rect = this.q0;
                arrayList.add(rect);
                int measuredHeight = (int) (getMeasuredHeight() * 0.3f);
                rect.set(0, (getMeasuredHeight() - measuredHeight) / 2, org.telegram.messenger.g0.L(20.0f), (getMeasuredHeight() + measuredHeight) / 2);
            }
            setSystemGestureExclusionRects(arrayList);
        }
    }

    public final void p(final String str, final j20 j20Var, final String str2, final CharSequence charSequence, final boolean z9, final long j3, final TLRPC.StickerSet stickerSet, final TLRPC.Document document, final TLRPC.Document document2, final String str3, final c20 c20Var, final v10 v10Var) {
        org.telegram.messenger.g0.i3(new Runnable() { // from class: tg.x1
            @Override // java.lang.Runnable
            public final void run() {
                a2 a2Var;
                c2 c2Var = c2.this;
                c20 c20Var2 = c20Var;
                int i7 = 0;
                boolean z10 = c20Var2 == null || (a2Var = c2Var.W) == null || !a2Var.o;
                if (z10) {
                    a2 a2Var2 = c2Var.W;
                    if (a2Var2 != null) {
                        a2Var2.a();
                    }
                    a2 a2Var3 = new a2();
                    a2Var3.p = new ArrayList();
                    a2Var3.q = new ArrayList();
                    a2Var3.t = 0.0f;
                    a2Var3.u = 0.0f;
                    c2Var.W = a2Var3;
                }
                a2 a2Var4 = c2Var.W;
                a2Var4.c = str2;
                String str4 = str;
                a2Var4.b = str4;
                a2Var4.a = str4;
                a2Var4.d = charSequence;
                a2Var4.h = z9;
                a2Var4.i = j3;
                a2Var4.j = stickerSet;
                a2Var4.k = document;
                j20 j20Var2 = j20Var;
                a2Var4.s = j20Var2;
                a2Var4.l = str3;
                a2Var4.n = c20Var2;
                a2Var4.m = v10Var;
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
                if (z10) {
                    TLRPC.Document document3 = document2;
                    if (document3 != null) {
                        a2 a2Var5 = c2Var.W;
                        a2Var5.e = ui.a0(document3, a2Var5.c);
                        c2Var.W.f = new TLRPC.TL_messageMediaDocument();
                        TLRPC.TL_messageMediaDocument tL_messageMediaDocument = c2Var.W.f;
                        tL_messageMediaDocument.flags |= 1;
                        tL_messageMediaDocument.document = document3;
                        c2Var.a();
                    } else if (j20Var2 != null) {
                        TLRPC.TL_message tL_message = new TLRPC.TL_message();
                        tL_message.id = 1;
                        a2 a2Var6 = c2Var.W;
                        String absolutePath = e7.w(p10.s0, "webm").getAbsolutePath();
                        tL_message.attachPath = absolutePath;
                        a2Var6.b = absolutePath;
                        c2Var.W.r = new ij(p10.s0, tL_message, null, false, false);
                        c2Var.W.r.p0 = j20Var2;
                        MediaController.B().h0(c2Var.W.r, false, false, false);
                    } else {
                        w7.G(c2Var.a).h0(false, 67108864, str4, true);
                    }
                } else {
                    c2Var.a();
                }
                if (c20Var2 == null) {
                    if (c2Var.d0 == null) {
                        c2Var.d0 = new fi.s0(c2Var.getContext(), id.M0(2131746919, null));
                    }
                    c2Var.d0.setOnCancelListener(new t1(c2Var, i7));
                    if (c2Var.d0.getParent() == null) {
                        c2Var.addView(c2Var.d0, ha.e(-1, -1, 17));
                    }
                    fi.s0 s0Var = c2Var.d0;
                    s0Var.E = true;
                    s0Var.invalidate();
                }
            }
        }, 300L);
    }

    public void setCurrentAccount(int i7) {
        int i10 = this.a;
        if (i10 != i7) {
            int i11 = qs.b2;
            int i12 = qs.a2;
            int i13 = qs.c2;
            int i14 = qs.V1;
            int i15 = qs.W1;
            int i16 = qs.U1;
            if (i10 >= 0 && isAttachedToWindow()) {
                qs.f(this.a).n(this, i16);
                qs.f(this.a).n(this, i15);
                qs.f(this.a).n(this, i14);
                qs.f(this.a).n(this, i13);
                qs.f(this.a).n(this, i12);
                qs.f(this.a).n(this, i11);
            }
            this.a = i7;
            if (i7 < 0 || !isAttachedToWindow()) {
                return;
            }
            qs.f(this.a).c(this, i16);
            qs.f(this.a).c(this, i15);
            qs.f(this.a).c(this, i14);
            qs.f(this.a).c(this, i13);
            qs.f(this.a).c(this, i12);
            qs.f(this.a).c(this, i11);
        }
    }

    public void setOutlineVisible(boolean z9) {
        if (this.i0 == z9) {
            return;
        }
        this.i0 = z9;
        this.h0.animate().alpha(z9 ? 1.0f : 0.0f).translationX(z9 ? 0.0f : org.telegram.messenger.g0.L(-18.0f)).setInterpolator(wq.h).setDuration(320L).start();
        if (getParent() instanceof View) {
            ((View) getParent()).invalidate();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            ArrayList arrayList = this.p0;
            arrayList.clear();
            if (this.i0) {
                Rect rect = this.q0;
                arrayList.add(rect);
                int measuredHeight = (int) (getMeasuredHeight() * 0.3f);
                rect.set(0, (getMeasuredHeight() - measuredHeight) / 2, org.telegram.messenger.g0.L(20.0f), (getMeasuredHeight() + measuredHeight) / 2);
            }
            setSystemGestureExclusionRects(arrayList);
        }
    }

    public void setOutlineWidth(float f10) {
        this.F = f10;
        if (getParent() instanceof View) {
            ((View) getParent()).invalidate();
        }
    }

    public void setStickerCutOutBtn(s1 s1Var) {
        this.b0 = s1Var;
    }
}
