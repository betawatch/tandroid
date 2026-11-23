package tg;

import a8.a8;
import a8.b8;
import a8.qa;
import a8.ua;
import a8.xa;
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
import bi.j5;
import bi.o5;
import c8.na;
import c8.oe;
import com.google.mlkit.vision.label.internal.ImageLabelerImpl;
import com.google.mlkit.vision.segmentation.subject.internal.zzd;
import hi.x7;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.Executor;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bz;
import org.telegram.messenger.d20;
import org.telegram.messenger.fj;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.j6;
import org.telegram.messenger.ks;
import org.telegram.messenger.p10;
import org.telegram.messenger.ri;
import org.telegram.messenger.w10;
import org.telegram.messenger.w7;
import org.telegram.messenger.zy;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.nd0;
import org.telegram.ui.Components.nz0;
import org.telegram.ui.ao0;
import org.telegram.ui.cd0;
import org.telegram.ui.d31;
import org.telegram.ui.pn0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class i2 extends FrameLayout implements fs {
    public static final /* synthetic */ int s0 = 0;
    public volatile boolean E;
    public f2 F;
    public float G;
    public boolean H;
    public f2[] I;
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
    public nz0 T;
    public int U;
    public int V;
    public boolean W;
    public int a;
    public g2 a0;
    public final c6 b;
    public final i6 b0;
    public final c6 c;
    public x1 c0;
    public final Paint d;
    public String d0;
    public final Paint e;
    public hi.c1 e0;
    public final Paint f;
    public final Matrix f0;
    public float g0;
    public final Paint h;
    public float h0;
    public final r1 i0;
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

    public i2(ContextThemeWrapper contextThemeWrapper, i6 i6Var) {
        super(contextThemeWrapper);
        this.a = -1;
        kr krVar = kr.h;
        this.b = new c6(0.0f, (View) null, 0L, 420L, krVar);
        this.c = new c6(0.0f, (View) null, 0L, 420L, krVar);
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
        this.b0 = i6Var;
        paint.setColor(-1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint.setPathEffect(new DashPathEffect(new float[]{org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(10.0f)}, 0.5f));
        paint.setShadowLayer(org.telegram.messenger.g0.N(0.75f), 0.0f, 0.0f, 1342177280);
        paint.setAlpha(ks.W1);
        TextView textView = new TextView(contextThemeWrapper);
        this.N = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(-1);
        textView.setAlpha(0.0f);
        textView.setScaleX(0.3f);
        textView.setScaleY(0.3f);
        addView(textView, na.e(-2, -2, 17));
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
        r1 r1Var = new r1(contextThemeWrapper);
        this.i0 = r1Var;
        r1Var.setAlpha(0.0f);
        r1Var.setTranslationX(-org.telegram.messenger.g0.L(18.0f));
        r1Var.b(0.33f, 10.0f);
        r1Var.setBrushWeight(this.G);
        r1Var.setValueOverride(new nd0(this, 18));
        r1Var.setTranslationX(-org.telegram.messenger.g0.L(18.0f));
        r1Var.setAlpha(0.0f);
        addView(r1Var, na.c(-1.0f, -1));
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0240  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void c(f2 f2Var, int i7, int i10) {
        Bitmap bitmap;
        e2 e2Var;
        boolean z10;
        float f10;
        int i11;
        Bitmap b10 = f2Var.b();
        Path path = f2Var.l;
        int width = b10.getWidth();
        int height = f2Var.b().getHeight();
        int i12 = 2;
        float max = Math.max(width, height) / (bz.o() == 2 ? 512.0f : 384.0f);
        if ((f2Var.c / 90) % 2 != 0) {
            width = f2Var.b().getHeight();
            height = f2Var.b().getWidth();
        }
        float f11 = width;
        float f12 = height;
        Bitmap createBitmap = Bitmap.createBitmap((int) (f11 / max), (int) (f12 / max), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        RectF rectF = new RectF();
        rectF.set(0.0f, 0.0f, createBitmap.getWidth(), createBitmap.getHeight());
        if (f2Var.c != 0) {
            Matrix matrix = new Matrix();
            matrix.postRotate(f2Var.c, f2Var.b().getWidth() / 2.0f, f2Var.d.getHeight() / 2.0f);
            if ((f2Var.c / 90) % 2 != 0) {
                float height2 = (f2Var.b().getHeight() - f2Var.b().getWidth()) / 2.0f;
                matrix.postTranslate(height2, -height2);
            }
            matrix.postScale(rectF.width() / f11, rectF.height() / f12);
            canvas.drawBitmap(f2Var.b(), matrix, new Paint(3));
        } else {
            canvas.drawBitmap(f2Var.b(), (Rect) null, rectF, new Paint(3));
        }
        int height3 = createBitmap.getHeight() * createBitmap.getWidth();
        int[] iArr = new int[height3];
        createBitmap.getPixels(iArr, 0, createBitmap.getWidth(), 0, 0, createBitmap.getWidth(), createBitmap.getHeight());
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        float f13 = i7;
        float f14 = i10;
        float min = Math.min(f13 / createBitmap.getWidth(), f14 / createBitmap.getHeight());
        e2 e2Var2 = null;
        e2 e2Var3 = null;
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
                    e2Var3 = new e2(min, width3, width2);
                }
                if (e2Var2 == null && z13 && iArr[i11] != 0) {
                    e2Var2 = new e2(min, width3, width2);
                }
            } else {
                f10 = f11;
            }
            boolean z14 = width3 == createBitmap.getWidth() + (-1);
            boolean z15 = width3 == 0;
            if (z14) {
                e2 e2Var4 = z11 ? new e2(min, width3, width2) : e2Var3;
                if (e2Var2 != null) {
                    arrayList.add(e2Var2);
                }
                if (e2Var4 != null) {
                    arrayList2.add(e2Var4);
                }
                e2Var2 = null;
                e2Var3 = null;
            }
            if (z15 && z11) {
                e2Var2 = new e2(min, width3, width2);
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
        e2 e2Var5 = null;
        e2 e2Var6 = null;
        while (i19 < height3) {
            float f16 = f12;
            int height4 = i19 / createBitmap.getHeight();
            e2 e2Var7 = e2Var5;
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
                    e2Var6 = new e2(min, height4, height5);
                }
                if (e2Var7 == null && z18 && iArr[width5] != 0) {
                    e2Var = new e2(min, height4, height5);
                    int i20 = height3;
                    z10 = height5 != bitmap.getHeight() + (-1);
                    boolean z19 = height5 != 0;
                    if (z10) {
                        if (z16) {
                            e2Var6 = new e2(min, height4, height5);
                        }
                        if (e2Var != null) {
                            arrayList3.add(e2Var);
                        }
                        if (e2Var6 != null) {
                            arrayList4.add(e2Var6);
                        }
                        e2Var = null;
                        e2Var6 = null;
                    }
                    e2Var5 = (z19 || !z16) ? e2Var : new e2(min, height4, height5);
                    i19++;
                    f12 = f16;
                    createBitmap = bitmap;
                    height3 = i20;
                }
            }
            e2Var = e2Var7;
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
            e2 e2Var8 = (e2) arrayList5.get(i21);
            if (path2.isEmpty()) {
                path2.moveTo(((Point) e2Var8).x, ((Point) e2Var8).y);
            } else {
                path2.lineTo(((Point) e2Var8).x, ((Point) e2Var8).y);
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
            e2 e2Var9 = (e2) arrayList6.get(i22);
            if (path3.isEmpty()) {
                path3.moveTo(((Point) e2Var9).x, ((Point) e2Var9).y);
            } else {
                path3.lineTo(((Point) e2Var9).x, ((Point) e2Var9).y);
            }
            i22 += 2;
        }
        path.reset();
        path.op(path2, path3, Path.Op.INTERSECT);
        float min2 = Math.min(f13 / f15, f14 / f17);
        float f18 = f15 * min2;
        f2Var.j = f18;
        float f19 = min2 * f17;
        f2Var.k = f19;
        path.offset((-f18) / 2.0f, (-f19) / 2.0f);
        Paint paint = f2Var.r;
        Paint paint2 = f2Var.q;
        Paint paint3 = f2Var.p;
        Paint paint4 = f2Var.s;
        PathMeasure pathMeasure = new PathMeasure();
        pathMeasure.setPath(path, true);
        float length = pathMeasure.getLength();
        int ceil = (int) Math.ceil(length / org.telegram.messenger.g0.L(2.0f));
        f2Var.n = ceil;
        f2Var.o = new float[ceil * 2];
        float[] fArr = new float[i18];
        int i23 = 0;
        while (true) {
            int i24 = f2Var.n;
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
                paint4.setColor(n6.r1(0.04f, -1));
                paint4.setStrokeCap(cap);
                paint4.setStrokeWidth(org.telegram.messenger.g0.L(20.0f));
                paint4.setColor(n6.r1(0.04f, -1));
                paint4.setMaskFilter(new BlurMaskFilter(org.telegram.messenger.g0.L(60.0f), blur));
                return;
            }
            pathMeasure.getPosTan(((i23 / i24) * length) % length, fArr, null);
            float[] fArr2 = f2Var.o;
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
        arrayList2.add((e2) arrayList.get(0));
        int i7 = 1;
        while (i7 < arrayList.size() - 1) {
            e2 e2Var = (e2) arrayList.get(i7 - 1);
            e2 e2Var2 = (e2) arrayList.get(i7);
            i7++;
            e2 e2Var3 = (e2) arrayList.get(i7);
            int i10 = ((Point) e2Var2).x;
            int i11 = ((Point) e2Var).x;
            int i12 = ((Point) e2Var3).y;
            int i13 = ((Point) e2Var).y;
            if (Math.abs((((i12 - i13) * (i10 - i11)) - ((((Point) e2Var3).x - i11) * (((Point) e2Var2).y - i13))) - (-1.0f)) >= 0.15f) {
                arrayList2.add(e2Var2);
            }
        }
        arrayList2.add((e2) i5.c.h(1, arrayList));
        return arrayList2;
    }

    public final void a() {
        final g2 g2Var = this.a0;
        if (g2Var == null) {
            return;
        }
        final int i7 = i10.t0;
        final int i10 = 1;
        g2Var.o = true;
        if (g2Var.m != null) {
            h();
            g2Var.m.a(g2Var.b, g2Var.e.document);
            org.telegram.messenger.g0.h3(new cd0(25), 250L);
            return;
        }
        final int i11 = 0;
        if (g2Var.k != null) {
            TLRPC.TL_stickers_replaceSticker tL_stickers_replaceSticker = new TLRPC.TL_stickers_replaceSticker();
            tL_stickers_replaceSticker.sticker = ri.c0(g2Var.k, g2Var.c).document;
            tL_stickers_replaceSticker.new_sticker = g2Var.e;
            ConnectionsManager.getInstance(i7).sendRequest(tL_stickers_replaceSticker, new RequestDelegate(this) { // from class: tg.z1
                public final /* synthetic */ i2 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (i11) {
                        case 0:
                            final int i12 = 0;
                            final i2 i2Var = this.b;
                            final int i13 = i7;
                            final g2 g2Var2 = g2Var;
                            org.telegram.messenger.g0.g3(new Runnable() { // from class: tg.a2
                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean z10;
                                    boolean z11;
                                    boolean z12;
                                    switch (i12) {
                                        case 0:
                                            final TLObject tLObject2 = tLObject;
                                            boolean z13 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                            final i2 i2Var2 = i2Var;
                                            final g2 g2Var3 = g2Var2;
                                            if (z13) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                int i14 = i13;
                                                z10 = true;
                                                ri.d0(i14).N1(tL_messages_stickerSet, true);
                                                if (!ri.d0(i14).E0(tL_messages_stickerSet.set.id, true)) {
                                                    ri.d0(i14).k2(null, tLObject2, 2, null, false, false);
                                                }
                                                hi.c1 c1Var = i2Var2.e0;
                                                if (c1Var != null) {
                                                    c1Var.setProgress(1.0f);
                                                }
                                                final int i15 = 1;
                                                org.telegram.messenger.g0.h3(new Runnable() { // from class: tg.b2
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i16 = i15;
                                                        g2 g2Var4 = g2Var3;
                                                        TLObject tLObject3 = tLObject2;
                                                        i2 i2Var3 = i2Var2;
                                                        switch (i16) {
                                                            case 0:
                                                                ks f10 = ks.f(i10.t0);
                                                                TLRPC.Document document = g2Var4.f.document;
                                                                String str = g2Var4.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                f10.m(ks.u3, bool, tLObject3, document, str, bool);
                                                                i2Var3.h();
                                                                break;
                                                            case 1:
                                                                ks.f(i10.t0).m(ks.u3, Boolean.FALSE, tLObject3, g2Var4.f.document, g2Var4.l, Boolean.TRUE);
                                                                i2Var3.h();
                                                                break;
                                                            default:
                                                                ks f11 = ks.f(i10.t0);
                                                                TLRPC.Document document2 = g2Var4.f.document;
                                                                String str2 = g2Var4.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                f11.m(ks.u3, bool2, tLObject3, document2, str2, bool2);
                                                                i2Var3.h();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                            } else {
                                                i2Var2.n(tL_error);
                                                i2Var2.h();
                                                z10 = false;
                                            }
                                            w10 w10Var = g2Var3.n;
                                            if (w10Var != null) {
                                                w10Var.a(Boolean.valueOf(z10));
                                                g2Var3.n = null;
                                                break;
                                            }
                                            break;
                                        case 1:
                                            final TLObject tLObject3 = tLObject;
                                            boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                            final i2 i2Var3 = i2Var;
                                            final g2 g2Var4 = g2Var2;
                                            if (z14) {
                                                int i16 = i13;
                                                z11 = true;
                                                ri.d0(i16).N1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                ri.d0(i16).k2(null, tLObject3, 2, null, false, false);
                                                hi.c1 c1Var2 = i2Var3.e0;
                                                if (c1Var2 != null) {
                                                    c1Var2.setProgress(1.0f);
                                                }
                                                final int i17 = 0;
                                                org.telegram.messenger.g0.h3(new Runnable() { // from class: tg.b2
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i162 = i17;
                                                        g2 g2Var42 = g2Var4;
                                                        TLObject tLObject32 = tLObject3;
                                                        i2 i2Var32 = i2Var3;
                                                        switch (i162) {
                                                            case 0:
                                                                ks f10 = ks.f(i10.t0);
                                                                TLRPC.Document document = g2Var42.f.document;
                                                                String str = g2Var42.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                f10.m(ks.u3, bool, tLObject32, document, str, bool);
                                                                i2Var32.h();
                                                                break;
                                                            case 1:
                                                                ks.f(i10.t0).m(ks.u3, Boolean.FALSE, tLObject32, g2Var42.f.document, g2Var42.l, Boolean.TRUE);
                                                                i2Var32.h();
                                                                break;
                                                            default:
                                                                ks f11 = ks.f(i10.t0);
                                                                TLRPC.Document document2 = g2Var42.f.document;
                                                                String str2 = g2Var42.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                f11.m(ks.u3, bool2, tLObject32, document2, str2, bool2);
                                                                i2Var32.h();
                                                                break;
                                                        }
                                                    }
                                                }, 250L);
                                            } else {
                                                i2Var3.n(tL_error);
                                                i2Var3.h();
                                                z11 = false;
                                            }
                                            w10 w10Var2 = g2Var4.n;
                                            if (w10Var2 != null) {
                                                w10Var2.a(Boolean.valueOf(z11));
                                                g2Var4.n = null;
                                                break;
                                            }
                                            break;
                                        default:
                                            final TLObject tLObject4 = tLObject;
                                            boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                            final i2 i2Var4 = i2Var;
                                            final g2 g2Var5 = g2Var2;
                                            if (z15) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                int i18 = i13;
                                                z12 = true;
                                                ri.d0(i18).N1(tL_messages_stickerSet2, true);
                                                if (!ri.d0(i18).E0(tL_messages_stickerSet2.set.id, true)) {
                                                    ri.d0(i18).k2(null, tLObject4, 2, null, false, false);
                                                }
                                                hi.c1 c1Var3 = i2Var4.e0;
                                                if (c1Var3 != null) {
                                                    c1Var3.setProgress(1.0f);
                                                }
                                                final int i19 = 2;
                                                org.telegram.messenger.g0.h3(new Runnable() { // from class: tg.b2
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i162 = i19;
                                                        g2 g2Var42 = g2Var5;
                                                        TLObject tLObject32 = tLObject4;
                                                        i2 i2Var32 = i2Var4;
                                                        switch (i162) {
                                                            case 0:
                                                                ks f10 = ks.f(i10.t0);
                                                                TLRPC.Document document = g2Var42.f.document;
                                                                String str = g2Var42.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                f10.m(ks.u3, bool, tLObject32, document, str, bool);
                                                                i2Var32.h();
                                                                break;
                                                            case 1:
                                                                ks.f(i10.t0).m(ks.u3, Boolean.FALSE, tLObject32, g2Var42.f.document, g2Var42.l, Boolean.TRUE);
                                                                i2Var32.h();
                                                                break;
                                                            default:
                                                                ks f11 = ks.f(i10.t0);
                                                                TLRPC.Document document2 = g2Var42.f.document;
                                                                String str2 = g2Var42.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                f11.m(ks.u3, bool2, tLObject32, document2, str2, bool2);
                                                                i2Var32.h();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                            } else {
                                                i2Var4.n(tL_error);
                                                i2Var4.h();
                                                z12 = false;
                                            }
                                            w10 w10Var3 = g2Var5.n;
                                            if (w10Var3 != null) {
                                                w10Var3.a(Boolean.valueOf(z12));
                                                g2Var5.n = null;
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                        case 1:
                            final int i14 = 1;
                            final i2 i2Var2 = this.b;
                            final int i15 = i7;
                            final g2 g2Var3 = g2Var;
                            org.telegram.messenger.g0.g3(new Runnable() { // from class: tg.a2
                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean z10;
                                    boolean z11;
                                    boolean z12;
                                    switch (i14) {
                                        case 0:
                                            final TLObject tLObject2 = tLObject;
                                            boolean z13 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                            final i2 i2Var22 = i2Var2;
                                            final g2 g2Var32 = g2Var3;
                                            if (z13) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                int i142 = i15;
                                                z10 = true;
                                                ri.d0(i142).N1(tL_messages_stickerSet, true);
                                                if (!ri.d0(i142).E0(tL_messages_stickerSet.set.id, true)) {
                                                    ri.d0(i142).k2(null, tLObject2, 2, null, false, false);
                                                }
                                                hi.c1 c1Var = i2Var22.e0;
                                                if (c1Var != null) {
                                                    c1Var.setProgress(1.0f);
                                                }
                                                final int i152 = 1;
                                                org.telegram.messenger.g0.h3(new Runnable() { // from class: tg.b2
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i162 = i152;
                                                        g2 g2Var42 = g2Var32;
                                                        TLObject tLObject32 = tLObject2;
                                                        i2 i2Var32 = i2Var22;
                                                        switch (i162) {
                                                            case 0:
                                                                ks f10 = ks.f(i10.t0);
                                                                TLRPC.Document document = g2Var42.f.document;
                                                                String str = g2Var42.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                f10.m(ks.u3, bool, tLObject32, document, str, bool);
                                                                i2Var32.h();
                                                                break;
                                                            case 1:
                                                                ks.f(i10.t0).m(ks.u3, Boolean.FALSE, tLObject32, g2Var42.f.document, g2Var42.l, Boolean.TRUE);
                                                                i2Var32.h();
                                                                break;
                                                            default:
                                                                ks f11 = ks.f(i10.t0);
                                                                TLRPC.Document document2 = g2Var42.f.document;
                                                                String str2 = g2Var42.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                f11.m(ks.u3, bool2, tLObject32, document2, str2, bool2);
                                                                i2Var32.h();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                            } else {
                                                i2Var22.n(tL_error);
                                                i2Var22.h();
                                                z10 = false;
                                            }
                                            w10 w10Var = g2Var32.n;
                                            if (w10Var != null) {
                                                w10Var.a(Boolean.valueOf(z10));
                                                g2Var32.n = null;
                                                break;
                                            }
                                            break;
                                        case 1:
                                            final TLObject tLObject3 = tLObject;
                                            boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                            final i2 i2Var3 = i2Var2;
                                            final g2 g2Var4 = g2Var3;
                                            if (z14) {
                                                int i16 = i15;
                                                z11 = true;
                                                ri.d0(i16).N1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                ri.d0(i16).k2(null, tLObject3, 2, null, false, false);
                                                hi.c1 c1Var2 = i2Var3.e0;
                                                if (c1Var2 != null) {
                                                    c1Var2.setProgress(1.0f);
                                                }
                                                final int i17 = 0;
                                                org.telegram.messenger.g0.h3(new Runnable() { // from class: tg.b2
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i162 = i17;
                                                        g2 g2Var42 = g2Var4;
                                                        TLObject tLObject32 = tLObject3;
                                                        i2 i2Var32 = i2Var3;
                                                        switch (i162) {
                                                            case 0:
                                                                ks f10 = ks.f(i10.t0);
                                                                TLRPC.Document document = g2Var42.f.document;
                                                                String str = g2Var42.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                f10.m(ks.u3, bool, tLObject32, document, str, bool);
                                                                i2Var32.h();
                                                                break;
                                                            case 1:
                                                                ks.f(i10.t0).m(ks.u3, Boolean.FALSE, tLObject32, g2Var42.f.document, g2Var42.l, Boolean.TRUE);
                                                                i2Var32.h();
                                                                break;
                                                            default:
                                                                ks f11 = ks.f(i10.t0);
                                                                TLRPC.Document document2 = g2Var42.f.document;
                                                                String str2 = g2Var42.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                f11.m(ks.u3, bool2, tLObject32, document2, str2, bool2);
                                                                i2Var32.h();
                                                                break;
                                                        }
                                                    }
                                                }, 250L);
                                            } else {
                                                i2Var3.n(tL_error);
                                                i2Var3.h();
                                                z11 = false;
                                            }
                                            w10 w10Var2 = g2Var4.n;
                                            if (w10Var2 != null) {
                                                w10Var2.a(Boolean.valueOf(z11));
                                                g2Var4.n = null;
                                                break;
                                            }
                                            break;
                                        default:
                                            final TLObject tLObject4 = tLObject;
                                            boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                            final i2 i2Var4 = i2Var2;
                                            final g2 g2Var5 = g2Var3;
                                            if (z15) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                int i18 = i15;
                                                z12 = true;
                                                ri.d0(i18).N1(tL_messages_stickerSet2, true);
                                                if (!ri.d0(i18).E0(tL_messages_stickerSet2.set.id, true)) {
                                                    ri.d0(i18).k2(null, tLObject4, 2, null, false, false);
                                                }
                                                hi.c1 c1Var3 = i2Var4.e0;
                                                if (c1Var3 != null) {
                                                    c1Var3.setProgress(1.0f);
                                                }
                                                final int i19 = 2;
                                                org.telegram.messenger.g0.h3(new Runnable() { // from class: tg.b2
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i162 = i19;
                                                        g2 g2Var42 = g2Var5;
                                                        TLObject tLObject32 = tLObject4;
                                                        i2 i2Var32 = i2Var4;
                                                        switch (i162) {
                                                            case 0:
                                                                ks f10 = ks.f(i10.t0);
                                                                TLRPC.Document document = g2Var42.f.document;
                                                                String str = g2Var42.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                f10.m(ks.u3, bool, tLObject32, document, str, bool);
                                                                i2Var32.h();
                                                                break;
                                                            case 1:
                                                                ks.f(i10.t0).m(ks.u3, Boolean.FALSE, tLObject32, g2Var42.f.document, g2Var42.l, Boolean.TRUE);
                                                                i2Var32.h();
                                                                break;
                                                            default:
                                                                ks f11 = ks.f(i10.t0);
                                                                TLRPC.Document document2 = g2Var42.f.document;
                                                                String str2 = g2Var42.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                f11.m(ks.u3, bool2, tLObject32, document2, str2, bool2);
                                                                i2Var32.h();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                            } else {
                                                i2Var4.n(tL_error);
                                                i2Var4.h();
                                                z12 = false;
                                            }
                                            w10 w10Var3 = g2Var5.n;
                                            if (w10Var3 != null) {
                                                w10Var3.a(Boolean.valueOf(z12));
                                                g2Var5.n = null;
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                        default:
                            final int i16 = 2;
                            final i2 i2Var3 = this.b;
                            final int i17 = i7;
                            final g2 g2Var4 = g2Var;
                            org.telegram.messenger.g0.g3(new Runnable() { // from class: tg.a2
                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean z10;
                                    boolean z11;
                                    boolean z12;
                                    switch (i16) {
                                        case 0:
                                            final TLObject tLObject2 = tLObject;
                                            boolean z13 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                            final i2 i2Var22 = i2Var3;
                                            final g2 g2Var32 = g2Var4;
                                            if (z13) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                int i142 = i17;
                                                z10 = true;
                                                ri.d0(i142).N1(tL_messages_stickerSet, true);
                                                if (!ri.d0(i142).E0(tL_messages_stickerSet.set.id, true)) {
                                                    ri.d0(i142).k2(null, tLObject2, 2, null, false, false);
                                                }
                                                hi.c1 c1Var = i2Var22.e0;
                                                if (c1Var != null) {
                                                    c1Var.setProgress(1.0f);
                                                }
                                                final int i152 = 1;
                                                org.telegram.messenger.g0.h3(new Runnable() { // from class: tg.b2
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i162 = i152;
                                                        g2 g2Var42 = g2Var32;
                                                        TLObject tLObject32 = tLObject2;
                                                        i2 i2Var32 = i2Var22;
                                                        switch (i162) {
                                                            case 0:
                                                                ks f10 = ks.f(i10.t0);
                                                                TLRPC.Document document = g2Var42.f.document;
                                                                String str = g2Var42.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                f10.m(ks.u3, bool, tLObject32, document, str, bool);
                                                                i2Var32.h();
                                                                break;
                                                            case 1:
                                                                ks.f(i10.t0).m(ks.u3, Boolean.FALSE, tLObject32, g2Var42.f.document, g2Var42.l, Boolean.TRUE);
                                                                i2Var32.h();
                                                                break;
                                                            default:
                                                                ks f11 = ks.f(i10.t0);
                                                                TLRPC.Document document2 = g2Var42.f.document;
                                                                String str2 = g2Var42.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                f11.m(ks.u3, bool2, tLObject32, document2, str2, bool2);
                                                                i2Var32.h();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                            } else {
                                                i2Var22.n(tL_error);
                                                i2Var22.h();
                                                z10 = false;
                                            }
                                            w10 w10Var = g2Var32.n;
                                            if (w10Var != null) {
                                                w10Var.a(Boolean.valueOf(z10));
                                                g2Var32.n = null;
                                                break;
                                            }
                                            break;
                                        case 1:
                                            final TLObject tLObject3 = tLObject;
                                            boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                            final i2 i2Var32 = i2Var3;
                                            final g2 g2Var42 = g2Var4;
                                            if (z14) {
                                                int i162 = i17;
                                                z11 = true;
                                                ri.d0(i162).N1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                ri.d0(i162).k2(null, tLObject3, 2, null, false, false);
                                                hi.c1 c1Var2 = i2Var32.e0;
                                                if (c1Var2 != null) {
                                                    c1Var2.setProgress(1.0f);
                                                }
                                                final int i172 = 0;
                                                org.telegram.messenger.g0.h3(new Runnable() { // from class: tg.b2
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i1622 = i172;
                                                        g2 g2Var422 = g2Var42;
                                                        TLObject tLObject32 = tLObject3;
                                                        i2 i2Var322 = i2Var32;
                                                        switch (i1622) {
                                                            case 0:
                                                                ks f10 = ks.f(i10.t0);
                                                                TLRPC.Document document = g2Var422.f.document;
                                                                String str = g2Var422.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                f10.m(ks.u3, bool, tLObject32, document, str, bool);
                                                                i2Var322.h();
                                                                break;
                                                            case 1:
                                                                ks.f(i10.t0).m(ks.u3, Boolean.FALSE, tLObject32, g2Var422.f.document, g2Var422.l, Boolean.TRUE);
                                                                i2Var322.h();
                                                                break;
                                                            default:
                                                                ks f11 = ks.f(i10.t0);
                                                                TLRPC.Document document2 = g2Var422.f.document;
                                                                String str2 = g2Var422.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                f11.m(ks.u3, bool2, tLObject32, document2, str2, bool2);
                                                                i2Var322.h();
                                                                break;
                                                        }
                                                    }
                                                }, 250L);
                                            } else {
                                                i2Var32.n(tL_error);
                                                i2Var32.h();
                                                z11 = false;
                                            }
                                            w10 w10Var2 = g2Var42.n;
                                            if (w10Var2 != null) {
                                                w10Var2.a(Boolean.valueOf(z11));
                                                g2Var42.n = null;
                                                break;
                                            }
                                            break;
                                        default:
                                            final TLObject tLObject4 = tLObject;
                                            boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                            final i2 i2Var4 = i2Var3;
                                            final g2 g2Var5 = g2Var4;
                                            if (z15) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                int i18 = i17;
                                                z12 = true;
                                                ri.d0(i18).N1(tL_messages_stickerSet2, true);
                                                if (!ri.d0(i18).E0(tL_messages_stickerSet2.set.id, true)) {
                                                    ri.d0(i18).k2(null, tLObject4, 2, null, false, false);
                                                }
                                                hi.c1 c1Var3 = i2Var4.e0;
                                                if (c1Var3 != null) {
                                                    c1Var3.setProgress(1.0f);
                                                }
                                                final int i19 = 2;
                                                org.telegram.messenger.g0.h3(new Runnable() { // from class: tg.b2
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i1622 = i19;
                                                        g2 g2Var422 = g2Var5;
                                                        TLObject tLObject32 = tLObject4;
                                                        i2 i2Var322 = i2Var4;
                                                        switch (i1622) {
                                                            case 0:
                                                                ks f10 = ks.f(i10.t0);
                                                                TLRPC.Document document = g2Var422.f.document;
                                                                String str = g2Var422.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                f10.m(ks.u3, bool, tLObject32, document, str, bool);
                                                                i2Var322.h();
                                                                break;
                                                            case 1:
                                                                ks.f(i10.t0).m(ks.u3, Boolean.FALSE, tLObject32, g2Var422.f.document, g2Var422.l, Boolean.TRUE);
                                                                i2Var322.h();
                                                                break;
                                                            default:
                                                                ks f11 = ks.f(i10.t0);
                                                                TLRPC.Document document2 = g2Var422.f.document;
                                                                String str2 = g2Var422.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                f11.m(ks.u3, bool2, tLObject32, document2, str2, bool2);
                                                                i2Var322.h();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                            } else {
                                                i2Var4.n(tL_error);
                                                i2Var4.h();
                                                z12 = false;
                                            }
                                            w10 w10Var3 = g2Var5.n;
                                            if (w10Var3 != null) {
                                                w10Var3.a(Boolean.valueOf(z12));
                                                g2Var5.n = null;
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
        if (g2Var.d != null) {
            TLRPC.TL_stickers_createStickerSet tL_stickers_createStickerSet = new TLRPC.TL_stickers_createStickerSet();
            tL_stickers_createStickerSet.user_id = new TLRPC.TL_inputUserSelf();
            tL_stickers_createStickerSet.title = g2Var.d.toString();
            tL_stickers_createStickerSet.short_name = "";
            tL_stickers_createStickerSet.stickers.add(g2Var.e);
            ConnectionsManager.getInstance(i7).sendRequest(tL_stickers_createStickerSet, new RequestDelegate(this) { // from class: tg.z1
                public final /* synthetic */ i2 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (i10) {
                        case 0:
                            final int i12 = 0;
                            final i2 i2Var = this.b;
                            final int i13 = i7;
                            final g2 g2Var2 = g2Var;
                            org.telegram.messenger.g0.g3(new Runnable() { // from class: tg.a2
                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean z10;
                                    boolean z11;
                                    boolean z12;
                                    switch (i12) {
                                        case 0:
                                            final TLObject tLObject2 = tLObject;
                                            boolean z13 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                            final i2 i2Var22 = i2Var;
                                            final g2 g2Var32 = g2Var2;
                                            if (z13) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                int i142 = i13;
                                                z10 = true;
                                                ri.d0(i142).N1(tL_messages_stickerSet, true);
                                                if (!ri.d0(i142).E0(tL_messages_stickerSet.set.id, true)) {
                                                    ri.d0(i142).k2(null, tLObject2, 2, null, false, false);
                                                }
                                                hi.c1 c1Var = i2Var22.e0;
                                                if (c1Var != null) {
                                                    c1Var.setProgress(1.0f);
                                                }
                                                final int i152 = 1;
                                                org.telegram.messenger.g0.h3(new Runnable() { // from class: tg.b2
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i1622 = i152;
                                                        g2 g2Var422 = g2Var32;
                                                        TLObject tLObject32 = tLObject2;
                                                        i2 i2Var322 = i2Var22;
                                                        switch (i1622) {
                                                            case 0:
                                                                ks f10 = ks.f(i10.t0);
                                                                TLRPC.Document document = g2Var422.f.document;
                                                                String str = g2Var422.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                f10.m(ks.u3, bool, tLObject32, document, str, bool);
                                                                i2Var322.h();
                                                                break;
                                                            case 1:
                                                                ks.f(i10.t0).m(ks.u3, Boolean.FALSE, tLObject32, g2Var422.f.document, g2Var422.l, Boolean.TRUE);
                                                                i2Var322.h();
                                                                break;
                                                            default:
                                                                ks f11 = ks.f(i10.t0);
                                                                TLRPC.Document document2 = g2Var422.f.document;
                                                                String str2 = g2Var422.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                f11.m(ks.u3, bool2, tLObject32, document2, str2, bool2);
                                                                i2Var322.h();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                            } else {
                                                i2Var22.n(tL_error);
                                                i2Var22.h();
                                                z10 = false;
                                            }
                                            w10 w10Var = g2Var32.n;
                                            if (w10Var != null) {
                                                w10Var.a(Boolean.valueOf(z10));
                                                g2Var32.n = null;
                                                break;
                                            }
                                            break;
                                        case 1:
                                            final TLObject tLObject3 = tLObject;
                                            boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                            final i2 i2Var32 = i2Var;
                                            final g2 g2Var42 = g2Var2;
                                            if (z14) {
                                                int i162 = i13;
                                                z11 = true;
                                                ri.d0(i162).N1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                ri.d0(i162).k2(null, tLObject3, 2, null, false, false);
                                                hi.c1 c1Var2 = i2Var32.e0;
                                                if (c1Var2 != null) {
                                                    c1Var2.setProgress(1.0f);
                                                }
                                                final int i172 = 0;
                                                org.telegram.messenger.g0.h3(new Runnable() { // from class: tg.b2
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i1622 = i172;
                                                        g2 g2Var422 = g2Var42;
                                                        TLObject tLObject32 = tLObject3;
                                                        i2 i2Var322 = i2Var32;
                                                        switch (i1622) {
                                                            case 0:
                                                                ks f10 = ks.f(i10.t0);
                                                                TLRPC.Document document = g2Var422.f.document;
                                                                String str = g2Var422.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                f10.m(ks.u3, bool, tLObject32, document, str, bool);
                                                                i2Var322.h();
                                                                break;
                                                            case 1:
                                                                ks.f(i10.t0).m(ks.u3, Boolean.FALSE, tLObject32, g2Var422.f.document, g2Var422.l, Boolean.TRUE);
                                                                i2Var322.h();
                                                                break;
                                                            default:
                                                                ks f11 = ks.f(i10.t0);
                                                                TLRPC.Document document2 = g2Var422.f.document;
                                                                String str2 = g2Var422.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                f11.m(ks.u3, bool2, tLObject32, document2, str2, bool2);
                                                                i2Var322.h();
                                                                break;
                                                        }
                                                    }
                                                }, 250L);
                                            } else {
                                                i2Var32.n(tL_error);
                                                i2Var32.h();
                                                z11 = false;
                                            }
                                            w10 w10Var2 = g2Var42.n;
                                            if (w10Var2 != null) {
                                                w10Var2.a(Boolean.valueOf(z11));
                                                g2Var42.n = null;
                                                break;
                                            }
                                            break;
                                        default:
                                            final TLObject tLObject4 = tLObject;
                                            boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                            final i2 i2Var4 = i2Var;
                                            final g2 g2Var5 = g2Var2;
                                            if (z15) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                int i18 = i13;
                                                z12 = true;
                                                ri.d0(i18).N1(tL_messages_stickerSet2, true);
                                                if (!ri.d0(i18).E0(tL_messages_stickerSet2.set.id, true)) {
                                                    ri.d0(i18).k2(null, tLObject4, 2, null, false, false);
                                                }
                                                hi.c1 c1Var3 = i2Var4.e0;
                                                if (c1Var3 != null) {
                                                    c1Var3.setProgress(1.0f);
                                                }
                                                final int i19 = 2;
                                                org.telegram.messenger.g0.h3(new Runnable() { // from class: tg.b2
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i1622 = i19;
                                                        g2 g2Var422 = g2Var5;
                                                        TLObject tLObject32 = tLObject4;
                                                        i2 i2Var322 = i2Var4;
                                                        switch (i1622) {
                                                            case 0:
                                                                ks f10 = ks.f(i10.t0);
                                                                TLRPC.Document document = g2Var422.f.document;
                                                                String str = g2Var422.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                f10.m(ks.u3, bool, tLObject32, document, str, bool);
                                                                i2Var322.h();
                                                                break;
                                                            case 1:
                                                                ks.f(i10.t0).m(ks.u3, Boolean.FALSE, tLObject32, g2Var422.f.document, g2Var422.l, Boolean.TRUE);
                                                                i2Var322.h();
                                                                break;
                                                            default:
                                                                ks f11 = ks.f(i10.t0);
                                                                TLRPC.Document document2 = g2Var422.f.document;
                                                                String str2 = g2Var422.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                f11.m(ks.u3, bool2, tLObject32, document2, str2, bool2);
                                                                i2Var322.h();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                            } else {
                                                i2Var4.n(tL_error);
                                                i2Var4.h();
                                                z12 = false;
                                            }
                                            w10 w10Var3 = g2Var5.n;
                                            if (w10Var3 != null) {
                                                w10Var3.a(Boolean.valueOf(z12));
                                                g2Var5.n = null;
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                        case 1:
                            final int i14 = 1;
                            final i2 i2Var2 = this.b;
                            final int i15 = i7;
                            final g2 g2Var3 = g2Var;
                            org.telegram.messenger.g0.g3(new Runnable() { // from class: tg.a2
                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean z10;
                                    boolean z11;
                                    boolean z12;
                                    switch (i14) {
                                        case 0:
                                            final TLObject tLObject2 = tLObject;
                                            boolean z13 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                            final i2 i2Var22 = i2Var2;
                                            final g2 g2Var32 = g2Var3;
                                            if (z13) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                int i142 = i15;
                                                z10 = true;
                                                ri.d0(i142).N1(tL_messages_stickerSet, true);
                                                if (!ri.d0(i142).E0(tL_messages_stickerSet.set.id, true)) {
                                                    ri.d0(i142).k2(null, tLObject2, 2, null, false, false);
                                                }
                                                hi.c1 c1Var = i2Var22.e0;
                                                if (c1Var != null) {
                                                    c1Var.setProgress(1.0f);
                                                }
                                                final int i152 = 1;
                                                org.telegram.messenger.g0.h3(new Runnable() { // from class: tg.b2
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i1622 = i152;
                                                        g2 g2Var422 = g2Var32;
                                                        TLObject tLObject32 = tLObject2;
                                                        i2 i2Var322 = i2Var22;
                                                        switch (i1622) {
                                                            case 0:
                                                                ks f10 = ks.f(i10.t0);
                                                                TLRPC.Document document = g2Var422.f.document;
                                                                String str = g2Var422.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                f10.m(ks.u3, bool, tLObject32, document, str, bool);
                                                                i2Var322.h();
                                                                break;
                                                            case 1:
                                                                ks.f(i10.t0).m(ks.u3, Boolean.FALSE, tLObject32, g2Var422.f.document, g2Var422.l, Boolean.TRUE);
                                                                i2Var322.h();
                                                                break;
                                                            default:
                                                                ks f11 = ks.f(i10.t0);
                                                                TLRPC.Document document2 = g2Var422.f.document;
                                                                String str2 = g2Var422.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                f11.m(ks.u3, bool2, tLObject32, document2, str2, bool2);
                                                                i2Var322.h();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                            } else {
                                                i2Var22.n(tL_error);
                                                i2Var22.h();
                                                z10 = false;
                                            }
                                            w10 w10Var = g2Var32.n;
                                            if (w10Var != null) {
                                                w10Var.a(Boolean.valueOf(z10));
                                                g2Var32.n = null;
                                                break;
                                            }
                                            break;
                                        case 1:
                                            final TLObject tLObject3 = tLObject;
                                            boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                            final i2 i2Var32 = i2Var2;
                                            final g2 g2Var42 = g2Var3;
                                            if (z14) {
                                                int i162 = i15;
                                                z11 = true;
                                                ri.d0(i162).N1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                ri.d0(i162).k2(null, tLObject3, 2, null, false, false);
                                                hi.c1 c1Var2 = i2Var32.e0;
                                                if (c1Var2 != null) {
                                                    c1Var2.setProgress(1.0f);
                                                }
                                                final int i172 = 0;
                                                org.telegram.messenger.g0.h3(new Runnable() { // from class: tg.b2
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i1622 = i172;
                                                        g2 g2Var422 = g2Var42;
                                                        TLObject tLObject32 = tLObject3;
                                                        i2 i2Var322 = i2Var32;
                                                        switch (i1622) {
                                                            case 0:
                                                                ks f10 = ks.f(i10.t0);
                                                                TLRPC.Document document = g2Var422.f.document;
                                                                String str = g2Var422.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                f10.m(ks.u3, bool, tLObject32, document, str, bool);
                                                                i2Var322.h();
                                                                break;
                                                            case 1:
                                                                ks.f(i10.t0).m(ks.u3, Boolean.FALSE, tLObject32, g2Var422.f.document, g2Var422.l, Boolean.TRUE);
                                                                i2Var322.h();
                                                                break;
                                                            default:
                                                                ks f11 = ks.f(i10.t0);
                                                                TLRPC.Document document2 = g2Var422.f.document;
                                                                String str2 = g2Var422.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                f11.m(ks.u3, bool2, tLObject32, document2, str2, bool2);
                                                                i2Var322.h();
                                                                break;
                                                        }
                                                    }
                                                }, 250L);
                                            } else {
                                                i2Var32.n(tL_error);
                                                i2Var32.h();
                                                z11 = false;
                                            }
                                            w10 w10Var2 = g2Var42.n;
                                            if (w10Var2 != null) {
                                                w10Var2.a(Boolean.valueOf(z11));
                                                g2Var42.n = null;
                                                break;
                                            }
                                            break;
                                        default:
                                            final TLObject tLObject4 = tLObject;
                                            boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                            final i2 i2Var4 = i2Var2;
                                            final g2 g2Var5 = g2Var3;
                                            if (z15) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                int i18 = i15;
                                                z12 = true;
                                                ri.d0(i18).N1(tL_messages_stickerSet2, true);
                                                if (!ri.d0(i18).E0(tL_messages_stickerSet2.set.id, true)) {
                                                    ri.d0(i18).k2(null, tLObject4, 2, null, false, false);
                                                }
                                                hi.c1 c1Var3 = i2Var4.e0;
                                                if (c1Var3 != null) {
                                                    c1Var3.setProgress(1.0f);
                                                }
                                                final int i19 = 2;
                                                org.telegram.messenger.g0.h3(new Runnable() { // from class: tg.b2
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i1622 = i19;
                                                        g2 g2Var422 = g2Var5;
                                                        TLObject tLObject32 = tLObject4;
                                                        i2 i2Var322 = i2Var4;
                                                        switch (i1622) {
                                                            case 0:
                                                                ks f10 = ks.f(i10.t0);
                                                                TLRPC.Document document = g2Var422.f.document;
                                                                String str = g2Var422.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                f10.m(ks.u3, bool, tLObject32, document, str, bool);
                                                                i2Var322.h();
                                                                break;
                                                            case 1:
                                                                ks.f(i10.t0).m(ks.u3, Boolean.FALSE, tLObject32, g2Var422.f.document, g2Var422.l, Boolean.TRUE);
                                                                i2Var322.h();
                                                                break;
                                                            default:
                                                                ks f11 = ks.f(i10.t0);
                                                                TLRPC.Document document2 = g2Var422.f.document;
                                                                String str2 = g2Var422.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                f11.m(ks.u3, bool2, tLObject32, document2, str2, bool2);
                                                                i2Var322.h();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                            } else {
                                                i2Var4.n(tL_error);
                                                i2Var4.h();
                                                z12 = false;
                                            }
                                            w10 w10Var3 = g2Var5.n;
                                            if (w10Var3 != null) {
                                                w10Var3.a(Boolean.valueOf(z12));
                                                g2Var5.n = null;
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                        default:
                            final int i16 = 2;
                            final i2 i2Var3 = this.b;
                            final int i17 = i7;
                            final g2 g2Var4 = g2Var;
                            org.telegram.messenger.g0.g3(new Runnable() { // from class: tg.a2
                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean z10;
                                    boolean z11;
                                    boolean z12;
                                    switch (i16) {
                                        case 0:
                                            final TLObject tLObject2 = tLObject;
                                            boolean z13 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                            final i2 i2Var22 = i2Var3;
                                            final g2 g2Var32 = g2Var4;
                                            if (z13) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                int i142 = i17;
                                                z10 = true;
                                                ri.d0(i142).N1(tL_messages_stickerSet, true);
                                                if (!ri.d0(i142).E0(tL_messages_stickerSet.set.id, true)) {
                                                    ri.d0(i142).k2(null, tLObject2, 2, null, false, false);
                                                }
                                                hi.c1 c1Var = i2Var22.e0;
                                                if (c1Var != null) {
                                                    c1Var.setProgress(1.0f);
                                                }
                                                final int i152 = 1;
                                                org.telegram.messenger.g0.h3(new Runnable() { // from class: tg.b2
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i1622 = i152;
                                                        g2 g2Var422 = g2Var32;
                                                        TLObject tLObject32 = tLObject2;
                                                        i2 i2Var322 = i2Var22;
                                                        switch (i1622) {
                                                            case 0:
                                                                ks f10 = ks.f(i10.t0);
                                                                TLRPC.Document document = g2Var422.f.document;
                                                                String str = g2Var422.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                f10.m(ks.u3, bool, tLObject32, document, str, bool);
                                                                i2Var322.h();
                                                                break;
                                                            case 1:
                                                                ks.f(i10.t0).m(ks.u3, Boolean.FALSE, tLObject32, g2Var422.f.document, g2Var422.l, Boolean.TRUE);
                                                                i2Var322.h();
                                                                break;
                                                            default:
                                                                ks f11 = ks.f(i10.t0);
                                                                TLRPC.Document document2 = g2Var422.f.document;
                                                                String str2 = g2Var422.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                f11.m(ks.u3, bool2, tLObject32, document2, str2, bool2);
                                                                i2Var322.h();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                            } else {
                                                i2Var22.n(tL_error);
                                                i2Var22.h();
                                                z10 = false;
                                            }
                                            w10 w10Var = g2Var32.n;
                                            if (w10Var != null) {
                                                w10Var.a(Boolean.valueOf(z10));
                                                g2Var32.n = null;
                                                break;
                                            }
                                            break;
                                        case 1:
                                            final TLObject tLObject3 = tLObject;
                                            boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                            final i2 i2Var32 = i2Var3;
                                            final g2 g2Var42 = g2Var4;
                                            if (z14) {
                                                int i162 = i17;
                                                z11 = true;
                                                ri.d0(i162).N1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                ri.d0(i162).k2(null, tLObject3, 2, null, false, false);
                                                hi.c1 c1Var2 = i2Var32.e0;
                                                if (c1Var2 != null) {
                                                    c1Var2.setProgress(1.0f);
                                                }
                                                final int i172 = 0;
                                                org.telegram.messenger.g0.h3(new Runnable() { // from class: tg.b2
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i1622 = i172;
                                                        g2 g2Var422 = g2Var42;
                                                        TLObject tLObject32 = tLObject3;
                                                        i2 i2Var322 = i2Var32;
                                                        switch (i1622) {
                                                            case 0:
                                                                ks f10 = ks.f(i10.t0);
                                                                TLRPC.Document document = g2Var422.f.document;
                                                                String str = g2Var422.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                f10.m(ks.u3, bool, tLObject32, document, str, bool);
                                                                i2Var322.h();
                                                                break;
                                                            case 1:
                                                                ks.f(i10.t0).m(ks.u3, Boolean.FALSE, tLObject32, g2Var422.f.document, g2Var422.l, Boolean.TRUE);
                                                                i2Var322.h();
                                                                break;
                                                            default:
                                                                ks f11 = ks.f(i10.t0);
                                                                TLRPC.Document document2 = g2Var422.f.document;
                                                                String str2 = g2Var422.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                f11.m(ks.u3, bool2, tLObject32, document2, str2, bool2);
                                                                i2Var322.h();
                                                                break;
                                                        }
                                                    }
                                                }, 250L);
                                            } else {
                                                i2Var32.n(tL_error);
                                                i2Var32.h();
                                                z11 = false;
                                            }
                                            w10 w10Var2 = g2Var42.n;
                                            if (w10Var2 != null) {
                                                w10Var2.a(Boolean.valueOf(z11));
                                                g2Var42.n = null;
                                                break;
                                            }
                                            break;
                                        default:
                                            final TLObject tLObject4 = tLObject;
                                            boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                            final i2 i2Var4 = i2Var3;
                                            final g2 g2Var5 = g2Var4;
                                            if (z15) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                int i18 = i17;
                                                z12 = true;
                                                ri.d0(i18).N1(tL_messages_stickerSet2, true);
                                                if (!ri.d0(i18).E0(tL_messages_stickerSet2.set.id, true)) {
                                                    ri.d0(i18).k2(null, tLObject4, 2, null, false, false);
                                                }
                                                hi.c1 c1Var3 = i2Var4.e0;
                                                if (c1Var3 != null) {
                                                    c1Var3.setProgress(1.0f);
                                                }
                                                final int i19 = 2;
                                                org.telegram.messenger.g0.h3(new Runnable() { // from class: tg.b2
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i1622 = i19;
                                                        g2 g2Var422 = g2Var5;
                                                        TLObject tLObject32 = tLObject4;
                                                        i2 i2Var322 = i2Var4;
                                                        switch (i1622) {
                                                            case 0:
                                                                ks f10 = ks.f(i10.t0);
                                                                TLRPC.Document document = g2Var422.f.document;
                                                                String str = g2Var422.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                f10.m(ks.u3, bool, tLObject32, document, str, bool);
                                                                i2Var322.h();
                                                                break;
                                                            case 1:
                                                                ks.f(i10.t0).m(ks.u3, Boolean.FALSE, tLObject32, g2Var422.f.document, g2Var422.l, Boolean.TRUE);
                                                                i2Var322.h();
                                                                break;
                                                            default:
                                                                ks f11 = ks.f(i10.t0);
                                                                TLRPC.Document document2 = g2Var422.f.document;
                                                                String str2 = g2Var422.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                f11.m(ks.u3, bool2, tLObject32, document2, str2, bool2);
                                                                i2Var322.h();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                            } else {
                                                i2Var4.n(tL_error);
                                                i2Var4.h();
                                                z12 = false;
                                            }
                                            w10 w10Var3 = g2Var5.n;
                                            if (w10Var3 != null) {
                                                w10Var3.a(Boolean.valueOf(z12));
                                                g2Var5.n = null;
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
        if (g2Var.h) {
            h();
            ks.f(i7).m(ks.u3, Boolean.FALSE);
            org.telegram.messenger.g0.h3(new org.telegram.ui.web.z0(g2Var, 21), 350L);
            w10 w10Var = g2Var.n;
            if (w10Var != null) {
                w10Var.a(Boolean.TRUE);
                return;
            }
            return;
        }
        if (g2Var.i == 0) {
            if (g2Var.j != null) {
                TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet = new TLRPC.TL_stickers_addStickerToSet();
                tL_stickers_addStickerToSet.stickerset = ri.b0(g2Var.j);
                tL_stickers_addStickerToSet.sticker = g2Var.e;
                final int i12 = 2;
                ConnectionsManager.getInstance(i7).sendRequest(tL_stickers_addStickerToSet, new RequestDelegate(this) { // from class: tg.z1
                    public final /* synthetic */ i2 b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (i12) {
                            case 0:
                                final int i122 = 0;
                                final i2 i2Var = this.b;
                                final int i13 = i7;
                                final g2 g2Var2 = g2Var;
                                org.telegram.messenger.g0.g3(new Runnable() { // from class: tg.a2
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        boolean z10;
                                        boolean z11;
                                        boolean z12;
                                        switch (i122) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                boolean z13 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                                final i2 i2Var22 = i2Var;
                                                final g2 g2Var32 = g2Var2;
                                                if (z13) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i142 = i13;
                                                    z10 = true;
                                                    ri.d0(i142).N1(tL_messages_stickerSet, true);
                                                    if (!ri.d0(i142).E0(tL_messages_stickerSet.set.id, true)) {
                                                        ri.d0(i142).k2(null, tLObject2, 2, null, false, false);
                                                    }
                                                    hi.c1 c1Var = i2Var22.e0;
                                                    if (c1Var != null) {
                                                        c1Var.setProgress(1.0f);
                                                    }
                                                    final int i152 = 1;
                                                    org.telegram.messenger.g0.h3(new Runnable() { // from class: tg.b2
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            int i1622 = i152;
                                                            g2 g2Var422 = g2Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            i2 i2Var322 = i2Var22;
                                                            switch (i1622) {
                                                                case 0:
                                                                    ks f10 = ks.f(i10.t0);
                                                                    TLRPC.Document document = g2Var422.f.document;
                                                                    String str = g2Var422.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(ks.u3, bool, tLObject32, document, str, bool);
                                                                    i2Var322.h();
                                                                    break;
                                                                case 1:
                                                                    ks.f(i10.t0).m(ks.u3, Boolean.FALSE, tLObject32, g2Var422.f.document, g2Var422.l, Boolean.TRUE);
                                                                    i2Var322.h();
                                                                    break;
                                                                default:
                                                                    ks f11 = ks.f(i10.t0);
                                                                    TLRPC.Document document2 = g2Var422.f.document;
                                                                    String str2 = g2Var422.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(ks.u3, bool2, tLObject32, document2, str2, bool2);
                                                                    i2Var322.h();
                                                                    break;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    i2Var22.n(tL_error);
                                                    i2Var22.h();
                                                    z10 = false;
                                                }
                                                w10 w10Var2 = g2Var32.n;
                                                if (w10Var2 != null) {
                                                    w10Var2.a(Boolean.valueOf(z10));
                                                    g2Var32.n = null;
                                                    break;
                                                }
                                                break;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final i2 i2Var32 = i2Var;
                                                final g2 g2Var42 = g2Var2;
                                                if (z14) {
                                                    int i162 = i13;
                                                    z11 = true;
                                                    ri.d0(i162).N1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                    ri.d0(i162).k2(null, tLObject3, 2, null, false, false);
                                                    hi.c1 c1Var2 = i2Var32.e0;
                                                    if (c1Var2 != null) {
                                                        c1Var2.setProgress(1.0f);
                                                    }
                                                    final int i172 = 0;
                                                    org.telegram.messenger.g0.h3(new Runnable() { // from class: tg.b2
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            int i1622 = i172;
                                                            g2 g2Var422 = g2Var42;
                                                            TLObject tLObject32 = tLObject3;
                                                            i2 i2Var322 = i2Var32;
                                                            switch (i1622) {
                                                                case 0:
                                                                    ks f10 = ks.f(i10.t0);
                                                                    TLRPC.Document document = g2Var422.f.document;
                                                                    String str = g2Var422.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(ks.u3, bool, tLObject32, document, str, bool);
                                                                    i2Var322.h();
                                                                    break;
                                                                case 1:
                                                                    ks.f(i10.t0).m(ks.u3, Boolean.FALSE, tLObject32, g2Var422.f.document, g2Var422.l, Boolean.TRUE);
                                                                    i2Var322.h();
                                                                    break;
                                                                default:
                                                                    ks f11 = ks.f(i10.t0);
                                                                    TLRPC.Document document2 = g2Var422.f.document;
                                                                    String str2 = g2Var422.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(ks.u3, bool2, tLObject32, document2, str2, bool2);
                                                                    i2Var322.h();
                                                                    break;
                                                            }
                                                        }
                                                    }, 250L);
                                                } else {
                                                    i2Var32.n(tL_error);
                                                    i2Var32.h();
                                                    z11 = false;
                                                }
                                                w10 w10Var22 = g2Var42.n;
                                                if (w10Var22 != null) {
                                                    w10Var22.a(Boolean.valueOf(z11));
                                                    g2Var42.n = null;
                                                    break;
                                                }
                                                break;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final i2 i2Var4 = i2Var;
                                                final g2 g2Var5 = g2Var2;
                                                if (z15) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i18 = i13;
                                                    z12 = true;
                                                    ri.d0(i18).N1(tL_messages_stickerSet2, true);
                                                    if (!ri.d0(i18).E0(tL_messages_stickerSet2.set.id, true)) {
                                                        ri.d0(i18).k2(null, tLObject4, 2, null, false, false);
                                                    }
                                                    hi.c1 c1Var3 = i2Var4.e0;
                                                    if (c1Var3 != null) {
                                                        c1Var3.setProgress(1.0f);
                                                    }
                                                    final int i19 = 2;
                                                    org.telegram.messenger.g0.h3(new Runnable() { // from class: tg.b2
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            int i1622 = i19;
                                                            g2 g2Var422 = g2Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            i2 i2Var322 = i2Var4;
                                                            switch (i1622) {
                                                                case 0:
                                                                    ks f10 = ks.f(i10.t0);
                                                                    TLRPC.Document document = g2Var422.f.document;
                                                                    String str = g2Var422.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(ks.u3, bool, tLObject32, document, str, bool);
                                                                    i2Var322.h();
                                                                    break;
                                                                case 1:
                                                                    ks.f(i10.t0).m(ks.u3, Boolean.FALSE, tLObject32, g2Var422.f.document, g2Var422.l, Boolean.TRUE);
                                                                    i2Var322.h();
                                                                    break;
                                                                default:
                                                                    ks f11 = ks.f(i10.t0);
                                                                    TLRPC.Document document2 = g2Var422.f.document;
                                                                    String str2 = g2Var422.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(ks.u3, bool2, tLObject32, document2, str2, bool2);
                                                                    i2Var322.h();
                                                                    break;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    i2Var4.n(tL_error);
                                                    i2Var4.h();
                                                    z12 = false;
                                                }
                                                w10 w10Var3 = g2Var5.n;
                                                if (w10Var3 != null) {
                                                    w10Var3.a(Boolean.valueOf(z12));
                                                    g2Var5.n = null;
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                                break;
                            case 1:
                                final int i14 = 1;
                                final i2 i2Var2 = this.b;
                                final int i15 = i7;
                                final g2 g2Var3 = g2Var;
                                org.telegram.messenger.g0.g3(new Runnable() { // from class: tg.a2
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        boolean z10;
                                        boolean z11;
                                        boolean z12;
                                        switch (i14) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                boolean z13 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                                final i2 i2Var22 = i2Var2;
                                                final g2 g2Var32 = g2Var3;
                                                if (z13) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i142 = i15;
                                                    z10 = true;
                                                    ri.d0(i142).N1(tL_messages_stickerSet, true);
                                                    if (!ri.d0(i142).E0(tL_messages_stickerSet.set.id, true)) {
                                                        ri.d0(i142).k2(null, tLObject2, 2, null, false, false);
                                                    }
                                                    hi.c1 c1Var = i2Var22.e0;
                                                    if (c1Var != null) {
                                                        c1Var.setProgress(1.0f);
                                                    }
                                                    final int i152 = 1;
                                                    org.telegram.messenger.g0.h3(new Runnable() { // from class: tg.b2
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            int i1622 = i152;
                                                            g2 g2Var422 = g2Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            i2 i2Var322 = i2Var22;
                                                            switch (i1622) {
                                                                case 0:
                                                                    ks f10 = ks.f(i10.t0);
                                                                    TLRPC.Document document = g2Var422.f.document;
                                                                    String str = g2Var422.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(ks.u3, bool, tLObject32, document, str, bool);
                                                                    i2Var322.h();
                                                                    break;
                                                                case 1:
                                                                    ks.f(i10.t0).m(ks.u3, Boolean.FALSE, tLObject32, g2Var422.f.document, g2Var422.l, Boolean.TRUE);
                                                                    i2Var322.h();
                                                                    break;
                                                                default:
                                                                    ks f11 = ks.f(i10.t0);
                                                                    TLRPC.Document document2 = g2Var422.f.document;
                                                                    String str2 = g2Var422.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(ks.u3, bool2, tLObject32, document2, str2, bool2);
                                                                    i2Var322.h();
                                                                    break;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    i2Var22.n(tL_error);
                                                    i2Var22.h();
                                                    z10 = false;
                                                }
                                                w10 w10Var2 = g2Var32.n;
                                                if (w10Var2 != null) {
                                                    w10Var2.a(Boolean.valueOf(z10));
                                                    g2Var32.n = null;
                                                    break;
                                                }
                                                break;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final i2 i2Var32 = i2Var2;
                                                final g2 g2Var42 = g2Var3;
                                                if (z14) {
                                                    int i162 = i15;
                                                    z11 = true;
                                                    ri.d0(i162).N1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                    ri.d0(i162).k2(null, tLObject3, 2, null, false, false);
                                                    hi.c1 c1Var2 = i2Var32.e0;
                                                    if (c1Var2 != null) {
                                                        c1Var2.setProgress(1.0f);
                                                    }
                                                    final int i172 = 0;
                                                    org.telegram.messenger.g0.h3(new Runnable() { // from class: tg.b2
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            int i1622 = i172;
                                                            g2 g2Var422 = g2Var42;
                                                            TLObject tLObject32 = tLObject3;
                                                            i2 i2Var322 = i2Var32;
                                                            switch (i1622) {
                                                                case 0:
                                                                    ks f10 = ks.f(i10.t0);
                                                                    TLRPC.Document document = g2Var422.f.document;
                                                                    String str = g2Var422.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(ks.u3, bool, tLObject32, document, str, bool);
                                                                    i2Var322.h();
                                                                    break;
                                                                case 1:
                                                                    ks.f(i10.t0).m(ks.u3, Boolean.FALSE, tLObject32, g2Var422.f.document, g2Var422.l, Boolean.TRUE);
                                                                    i2Var322.h();
                                                                    break;
                                                                default:
                                                                    ks f11 = ks.f(i10.t0);
                                                                    TLRPC.Document document2 = g2Var422.f.document;
                                                                    String str2 = g2Var422.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(ks.u3, bool2, tLObject32, document2, str2, bool2);
                                                                    i2Var322.h();
                                                                    break;
                                                            }
                                                        }
                                                    }, 250L);
                                                } else {
                                                    i2Var32.n(tL_error);
                                                    i2Var32.h();
                                                    z11 = false;
                                                }
                                                w10 w10Var22 = g2Var42.n;
                                                if (w10Var22 != null) {
                                                    w10Var22.a(Boolean.valueOf(z11));
                                                    g2Var42.n = null;
                                                    break;
                                                }
                                                break;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final i2 i2Var4 = i2Var2;
                                                final g2 g2Var5 = g2Var3;
                                                if (z15) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i18 = i15;
                                                    z12 = true;
                                                    ri.d0(i18).N1(tL_messages_stickerSet2, true);
                                                    if (!ri.d0(i18).E0(tL_messages_stickerSet2.set.id, true)) {
                                                        ri.d0(i18).k2(null, tLObject4, 2, null, false, false);
                                                    }
                                                    hi.c1 c1Var3 = i2Var4.e0;
                                                    if (c1Var3 != null) {
                                                        c1Var3.setProgress(1.0f);
                                                    }
                                                    final int i19 = 2;
                                                    org.telegram.messenger.g0.h3(new Runnable() { // from class: tg.b2
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            int i1622 = i19;
                                                            g2 g2Var422 = g2Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            i2 i2Var322 = i2Var4;
                                                            switch (i1622) {
                                                                case 0:
                                                                    ks f10 = ks.f(i10.t0);
                                                                    TLRPC.Document document = g2Var422.f.document;
                                                                    String str = g2Var422.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(ks.u3, bool, tLObject32, document, str, bool);
                                                                    i2Var322.h();
                                                                    break;
                                                                case 1:
                                                                    ks.f(i10.t0).m(ks.u3, Boolean.FALSE, tLObject32, g2Var422.f.document, g2Var422.l, Boolean.TRUE);
                                                                    i2Var322.h();
                                                                    break;
                                                                default:
                                                                    ks f11 = ks.f(i10.t0);
                                                                    TLRPC.Document document2 = g2Var422.f.document;
                                                                    String str2 = g2Var422.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(ks.u3, bool2, tLObject32, document2, str2, bool2);
                                                                    i2Var322.h();
                                                                    break;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    i2Var4.n(tL_error);
                                                    i2Var4.h();
                                                    z12 = false;
                                                }
                                                w10 w10Var3 = g2Var5.n;
                                                if (w10Var3 != null) {
                                                    w10Var3.a(Boolean.valueOf(z12));
                                                    g2Var5.n = null;
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                                break;
                            default:
                                final int i16 = 2;
                                final i2 i2Var3 = this.b;
                                final int i17 = i7;
                                final g2 g2Var4 = g2Var;
                                org.telegram.messenger.g0.g3(new Runnable() { // from class: tg.a2
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        boolean z10;
                                        boolean z11;
                                        boolean z12;
                                        switch (i16) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                boolean z13 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                                final i2 i2Var22 = i2Var3;
                                                final g2 g2Var32 = g2Var4;
                                                if (z13) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i142 = i17;
                                                    z10 = true;
                                                    ri.d0(i142).N1(tL_messages_stickerSet, true);
                                                    if (!ri.d0(i142).E0(tL_messages_stickerSet.set.id, true)) {
                                                        ri.d0(i142).k2(null, tLObject2, 2, null, false, false);
                                                    }
                                                    hi.c1 c1Var = i2Var22.e0;
                                                    if (c1Var != null) {
                                                        c1Var.setProgress(1.0f);
                                                    }
                                                    final int i152 = 1;
                                                    org.telegram.messenger.g0.h3(new Runnable() { // from class: tg.b2
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            int i1622 = i152;
                                                            g2 g2Var422 = g2Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            i2 i2Var322 = i2Var22;
                                                            switch (i1622) {
                                                                case 0:
                                                                    ks f10 = ks.f(i10.t0);
                                                                    TLRPC.Document document = g2Var422.f.document;
                                                                    String str = g2Var422.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(ks.u3, bool, tLObject32, document, str, bool);
                                                                    i2Var322.h();
                                                                    break;
                                                                case 1:
                                                                    ks.f(i10.t0).m(ks.u3, Boolean.FALSE, tLObject32, g2Var422.f.document, g2Var422.l, Boolean.TRUE);
                                                                    i2Var322.h();
                                                                    break;
                                                                default:
                                                                    ks f11 = ks.f(i10.t0);
                                                                    TLRPC.Document document2 = g2Var422.f.document;
                                                                    String str2 = g2Var422.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(ks.u3, bool2, tLObject32, document2, str2, bool2);
                                                                    i2Var322.h();
                                                                    break;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    i2Var22.n(tL_error);
                                                    i2Var22.h();
                                                    z10 = false;
                                                }
                                                w10 w10Var2 = g2Var32.n;
                                                if (w10Var2 != null) {
                                                    w10Var2.a(Boolean.valueOf(z10));
                                                    g2Var32.n = null;
                                                    break;
                                                }
                                                break;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final i2 i2Var32 = i2Var3;
                                                final g2 g2Var42 = g2Var4;
                                                if (z14) {
                                                    int i162 = i17;
                                                    z11 = true;
                                                    ri.d0(i162).N1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                    ri.d0(i162).k2(null, tLObject3, 2, null, false, false);
                                                    hi.c1 c1Var2 = i2Var32.e0;
                                                    if (c1Var2 != null) {
                                                        c1Var2.setProgress(1.0f);
                                                    }
                                                    final int i172 = 0;
                                                    org.telegram.messenger.g0.h3(new Runnable() { // from class: tg.b2
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            int i1622 = i172;
                                                            g2 g2Var422 = g2Var42;
                                                            TLObject tLObject32 = tLObject3;
                                                            i2 i2Var322 = i2Var32;
                                                            switch (i1622) {
                                                                case 0:
                                                                    ks f10 = ks.f(i10.t0);
                                                                    TLRPC.Document document = g2Var422.f.document;
                                                                    String str = g2Var422.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(ks.u3, bool, tLObject32, document, str, bool);
                                                                    i2Var322.h();
                                                                    break;
                                                                case 1:
                                                                    ks.f(i10.t0).m(ks.u3, Boolean.FALSE, tLObject32, g2Var422.f.document, g2Var422.l, Boolean.TRUE);
                                                                    i2Var322.h();
                                                                    break;
                                                                default:
                                                                    ks f11 = ks.f(i10.t0);
                                                                    TLRPC.Document document2 = g2Var422.f.document;
                                                                    String str2 = g2Var422.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(ks.u3, bool2, tLObject32, document2, str2, bool2);
                                                                    i2Var322.h();
                                                                    break;
                                                            }
                                                        }
                                                    }, 250L);
                                                } else {
                                                    i2Var32.n(tL_error);
                                                    i2Var32.h();
                                                    z11 = false;
                                                }
                                                w10 w10Var22 = g2Var42.n;
                                                if (w10Var22 != null) {
                                                    w10Var22.a(Boolean.valueOf(z11));
                                                    g2Var42.n = null;
                                                    break;
                                                }
                                                break;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final i2 i2Var4 = i2Var3;
                                                final g2 g2Var5 = g2Var4;
                                                if (z15) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i18 = i17;
                                                    z12 = true;
                                                    ri.d0(i18).N1(tL_messages_stickerSet2, true);
                                                    if (!ri.d0(i18).E0(tL_messages_stickerSet2.set.id, true)) {
                                                        ri.d0(i18).k2(null, tLObject4, 2, null, false, false);
                                                    }
                                                    hi.c1 c1Var3 = i2Var4.e0;
                                                    if (c1Var3 != null) {
                                                        c1Var3.setProgress(1.0f);
                                                    }
                                                    final int i19 = 2;
                                                    org.telegram.messenger.g0.h3(new Runnable() { // from class: tg.b2
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            int i1622 = i19;
                                                            g2 g2Var422 = g2Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            i2 i2Var322 = i2Var4;
                                                            switch (i1622) {
                                                                case 0:
                                                                    ks f10 = ks.f(i10.t0);
                                                                    TLRPC.Document document = g2Var422.f.document;
                                                                    String str = g2Var422.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(ks.u3, bool, tLObject32, document, str, bool);
                                                                    i2Var322.h();
                                                                    break;
                                                                case 1:
                                                                    ks.f(i10.t0).m(ks.u3, Boolean.FALSE, tLObject32, g2Var422.f.document, g2Var422.l, Boolean.TRUE);
                                                                    i2Var322.h();
                                                                    break;
                                                                default:
                                                                    ks f11 = ks.f(i10.t0);
                                                                    TLRPC.Document document2 = g2Var422.f.document;
                                                                    String str2 = g2Var422.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(ks.u3, bool2, tLObject32, document2, str2, bool2);
                                                                    i2Var322.h();
                                                                    break;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    i2Var4.n(tL_error);
                                                    i2Var4.h();
                                                    z12 = false;
                                                }
                                                w10 w10Var3 = g2Var5.n;
                                                if (w10Var3 != null) {
                                                    w10Var3.a(Boolean.valueOf(z12));
                                                    g2Var5.n = null;
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
        zy.C(i7).v0(g2Var.f.document, null, g2Var.i, null, null, null, null, null, true, 0, 0, false, null, null, 0L, 0L, null);
        hi.c1 c1Var = this.e0;
        if (c1Var != null) {
            c1Var.setProgress(1.0f);
        }
        org.telegram.messenger.g0.h3(new ao0(this, i7, 16), 450L);
        w10 w10Var2 = g2Var.n;
        if (w10Var2 != null) {
            w10Var2.a(Boolean.TRUE);
            g2Var.n = null;
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
            int i7 = 0;
            while (true) {
                f2[] f2VarArr = this.I;
                if (i7 >= f2VarArr.length) {
                    break;
                }
                f2 f2Var = f2VarArr[i7];
                if (f2Var != null) {
                    f2Var.l.reset();
                    Bitmap bitmap = f2Var.e;
                    if (bitmap != null) {
                        bitmap.recycle();
                        f2Var.e = null;
                    }
                    Bitmap bitmap2 = f2Var.d;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                        f2Var.d = null;
                    }
                    Bitmap bitmap3 = f2Var.g;
                    if (bitmap3 != null) {
                        bitmap3.recycle();
                        f2Var.g = null;
                    }
                    Bitmap bitmap4 = f2Var.f;
                    if (bitmap4 != null) {
                        bitmap4.recycle();
                        f2Var.f = null;
                    }
                }
                i7++;
            }
            this.I = null;
        }
        this.E = false;
        this.y = false;
        this.M = false;
        this.N.setAlpha(0.0f);
        this.N.setScaleX(0.3f);
        this.N.setScaleY(0.3f);
        g2 g2Var = this.a0;
        if (g2Var != null) {
            if (!g2Var.o) {
                g2Var.a();
            }
            this.a0 = null;
        }
        h();
        this.W = false;
    }

    public final Bitmap d(int i7, int i10, Bitmap bitmap, boolean z10) {
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

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        g2 g2Var;
        if (i7 == ks.U1) {
            String str = (String) objArr[0];
            TLRPC.InputFile inputFile = (TLRPC.InputFile) objArr[1];
            g2 g2Var2 = this.a0;
            if (g2Var2 == null || !str.equalsIgnoreCase(g2Var2.b)) {
                return;
            }
            g2 g2Var3 = this.a0;
            g2Var3.g = inputFile;
            TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia = new TLRPC.TL_messages_uploadMedia();
            tL_messages_uploadMedia.peer = new TLRPC.TL_inputPeerSelf();
            TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument = new TLRPC.TL_inputMediaUploadedDocument();
            tL_messages_uploadMedia.media = tL_inputMediaUploadedDocument;
            tL_inputMediaUploadedDocument.file = g2Var3.g;
            if (g2Var3.s != null) {
                tL_inputMediaUploadedDocument.mime_type = "video/webm";
            } else {
                tL_inputMediaUploadedDocument.mime_type = "image/webp";
            }
            TLRPC.TL_documentAttributeSticker tL_documentAttributeSticker = new TLRPC.TL_documentAttributeSticker();
            tL_documentAttributeSticker.alt = g2Var3.c;
            tL_documentAttributeSticker.stickerset = new TLRPC.TL_inputStickerSetEmpty();
            tL_messages_uploadMedia.media.attributes.add(tL_documentAttributeSticker);
            ConnectionsManager.getInstance(i10.t0).sendRequest(tL_messages_uploadMedia, new d31(9, this, g2Var3), 2);
            return;
        }
        if (i7 == ks.W1) {
            String str2 = (String) objArr[0];
            g2 g2Var4 = this.a0;
            if (g2Var4 == null || !str2.equalsIgnoreCase(g2Var4.b)) {
                return;
            }
            long longValue = ((Long) objArr[1]).longValue();
            long longValue2 = ((Long) objArr[2]).longValue();
            if (longValue2 > 0) {
                g2 g2Var5 = this.a0;
                g2Var5.u = Utilities.i(longValue / longValue2, 1.0f, g2Var5.u);
                hi.c1 c1Var = this.e0;
                if (c1Var != null) {
                    c1Var.setProgress(this.a0.b());
                    return;
                }
                return;
            }
            return;
        }
        if (i7 == ks.V1) {
            String str3 = (String) objArr[0];
            g2 g2Var6 = this.a0;
            if (g2Var6 == null || !str3.equalsIgnoreCase(g2Var6.b)) {
                return;
            }
            h();
            return;
        }
        if (i7 == ks.a2) {
            g2 g2Var7 = this.a0;
            if (g2Var7 != null && objArr[0] == g2Var7.r) {
                w7.G(i10.t0).h0(false, 67108864, this.a0.b, true);
                return;
            }
            return;
        }
        if (i7 != ks.b2) {
            if (i7 == ks.c2 && (g2Var = this.a0) != null && objArr[0] == g2Var.r) {
                h();
                return;
            }
            return;
        }
        g2 g2Var8 = this.a0;
        if (g2Var8 != null && objArr[0] == g2Var8.r) {
            String str4 = (String) objArr[1];
            long longValue3 = ((Long) objArr[2]).longValue();
            long longValue4 = ((Long) objArr[3]).longValue();
            Float f10 = (Float) objArr[4];
            float floatValue = f10.floatValue();
            this.a0.r.r0.Y = true;
            w7.G(this.a).n(str4, false, Math.max(1L, longValue3), longValue4, f10);
            g2 g2Var9 = this.a0;
            g2Var9.t = Math.max(g2Var9.t, floatValue);
            hi.c1 c1Var2 = this.e0;
            if (c1Var2 != null) {
                c1Var2.setProgress(this.a0.b());
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
        float y10 = motionEvent.getY();
        this.p0 = y10;
        if (this.I != null && this.O != null) {
            f2 j3 = j(this.o0, y10);
            int i7 = 0;
            while (true) {
                f2[] f2VarArr = this.I;
                if (i7 >= f2VarArr.length) {
                    break;
                }
                if (f2VarArr[i7] == j3 && motionEvent.getAction() != 3) {
                    z10 = true;
                }
                z10 = false;
                if (z10 && !this.I[i7].b) {
                    org.telegram.messenger.g0.a4(this);
                }
                this.I[i7].b = z10;
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
        f2 f2Var = this.F;
        if (f2Var != null) {
            this.L = bitmap;
            if (f2Var.f != null && this.M) {
                Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                Paint paint = new Paint(3);
                Paint paint2 = new Paint(3);
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint2);
                Rect rect = new Rect();
                rect.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
                f2 f2Var2 = this.F;
                if (f2Var2.c == 0) {
                    canvas.drawBitmap(f2Var2.a(), (Rect) null, rect, paint);
                    return createBitmap;
                }
                Matrix matrix = new Matrix();
                f2 f2Var3 = this.F;
                matrix.postRotate(f2Var3.c, f2Var3.a().getWidth() / 2.0f, this.F.a().getHeight() / 2.0f);
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
        textView.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(240L).setInterpolator(kr.h).start();
    }

    public final void g(Canvas canvas, boolean z10, ViewGroup viewGroup, boolean z11) {
        c6 c6Var = this.c;
        c6Var.a = viewGroup;
        boolean z12 = this.j0;
        if (z12 || c6Var.c > 0.0f) {
            float d = viewGroup == null ? 1.0f : c6Var.d(z12 && !z11);
            f2[] f2VarArr = this.I;
            if (f2VarArr != null) {
                for (f2 f2Var : f2VarArr) {
                    if (f2Var != null && f2Var == this.F) {
                        if (this.G > 0.0f) {
                            if (f2Var.t.l0 == null) {
                                return;
                            }
                            canvas.save();
                            canvas.clipPath(f2Var.t.l0);
                            if (f2Var.t.J != null) {
                                Paint paint = z10 ? f2Var.q : f2Var.p;
                                paint.setAlpha((int) (d * 255.0f));
                                paint.setStrokeWidth(org.telegram.messenger.g0.L(r4));
                                canvas.drawPath(f2Var.l, paint);
                                if (f2Var.t.l0 != null && z10) {
                                    canvas.clipPath(f2Var.l);
                                    paint.setStrokeWidth(org.telegram.messenger.g0.L(r4 * 2.0f));
                                    canvas.drawPath(f2Var.t.l0, paint);
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
        f2 f2Var;
        if (!this.M || (f2Var = this.F) == null) {
            return null;
        }
        return f2Var.a();
    }

    public Bitmap getSourceBitmap() {
        return this.J;
    }

    public nz0 getThanosEffect() {
        if (!nz0.c()) {
            return null;
        }
        if (this.T == null) {
            nz0 nz0Var = new nz0(getContext(), new y1(this, 1));
            this.T = nz0Var;
            addView(nz0Var, na.c(-1.0f, -1));
        }
        return this.T;
    }

    public final void h() {
        hi.c1 c1Var = this.e0;
        if (c1Var != null) {
            c1Var.a();
            this.e0 = null;
        }
    }

    public final boolean i() {
        return this.M;
    }

    public final f2 j(float f10, float f11) {
        int width;
        int height;
        if (this.J == null) {
            return null;
        }
        int i7 = 0;
        while (true) {
            f2[] f2VarArr = this.I;
            if (i7 >= f2VarArr.length) {
                return null;
            }
            f2 f2Var = f2VarArr[i7];
            if (f2Var != null) {
                if ((f2Var.c / 90) % 2 != 0) {
                    width = this.J.getHeight();
                    height = this.J.getWidth();
                } else {
                    width = this.J.getWidth();
                    height = this.J.getHeight();
                }
                RectF rectF = org.telegram.messenger.g0.P;
                RectF rectF2 = this.I[i7].i;
                float f12 = width;
                float f13 = rectF2.left / f12;
                float f14 = this.g0;
                float f15 = height;
                float f16 = rectF2.top / f15;
                float f17 = this.h0;
                rectF.set(f13 * f14, f16 * f17, (rectF2.right / f12) * f14, (rectF2.bottom / f15) * f17);
                this.f0.mapRect(rectF);
                if (rectF.contains(f10, f11)) {
                    return f2Var;
                }
            }
            i7++;
        }
    }

    public final void l() {
        Bitmap bitmap;
        f2[] f2VarArr = this.I;
        if (f2VarArr != null) {
            for (f2 f2Var : f2VarArr) {
                if (f2Var != null && (bitmap = f2Var.e) != null) {
                    bitmap.recycle();
                    f2Var.e = null;
                    Bitmap bitmap2 = f2Var.g;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                        f2Var.g = null;
                    }
                    c(f2Var, this.U, this.V);
                }
            }
        }
    }

    public final void m(Bitmap bitmap, int i7, int i10, int i11, pn0 pn0Var) {
        vb.c cVar;
        int i12 = i10 <= 0 ? org.telegram.messenger.g0.q.x : i10;
        int i13 = i11 <= 0 ? org.telegram.messenger.g0.q.y : i11;
        this.U = i12;
        this.V = i13;
        if (this.E || this.y || bitmap == null || Build.VERSION.SDK_INT < 24) {
            return;
        }
        this.J = bitmap;
        this.K = i7;
        this.d0 = null;
        j5 j5Var = new j5(this, i7, pn0Var, 6);
        this.y = true;
        ia.a aVar = new ia.a();
        aVar.b = true;
        aVar.c = true;
        zzd a10 = oe.a(new zb.d(aVar));
        if (org.telegram.messenger.n6.h(getContext()).f()) {
            ArrayList arrayList = new ArrayList();
            Bitmap bitmap2 = this.J;
            h2 h2Var = new h2();
            int min = (int) (Math.min(bitmap2.getWidth(), bitmap2.getHeight()) * 0.4f);
            h2Var.e = min;
            h2Var.d = min;
            h2Var.a = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
            new Canvas(h2Var.a).drawRect(0.0f, 0.0f, h2Var.d, h2Var.e, n6.Gm);
            h2Var.b = (bitmap2.getWidth() - h2Var.d) / 2;
            h2Var.c = (bitmap2.getHeight() - h2Var.e) / 2;
            arrayList.add(h2Var);
            j5Var.a(arrayList);
            return;
        }
        ub.a a11 = ub.a.a(i7, bitmap);
        a10.h(a11).addOnSuccessListener(new s(j5Var, 3)).addOnFailureListener(new o5(this, bitmap, i7, pn0Var, j5Var, 6));
        if (this.d0 == null) {
            xb.a aVar2 = xb.a.b;
            q6.m.i(aVar2, "options cannot be null");
            synchronized (vb.c.class) {
                cVar = (vb.c) pb.g.c().a(vb.c.class);
            }
            ua.b bVar = (ua.b) cVar.a.get(xb.a.class);
            q6.m.h(bVar);
            yb.b bVar2 = (yb.b) bVar.get();
            bVar2.getClass();
            ua uaVar = bVar2.c;
            b8 b8Var = new b8();
            b8Var.c = y7.b;
            pb.n.a.execute(new qa(uaVar, new xa(b8Var, 1), a8.c, uaVar.b(), 0));
            new ImageLabelerImpl((pb.e) bVar2.a.R0(aVar2), (Executor) bVar2.b.a.get(), new n6.c("vision.ica", 1L)).h(a11).addOnSuccessListener(new s(this, 4)).addOnFailureListener(new r0.f1(27));
        }
        ArrayList arrayList2 = ri.d0(this.a).n;
        for (int i14 = 0; i14 < Math.min(arrayList2.size(), 9); i14++) {
            j6.g(((TLRPC.TL_availableReaction) arrayList2.get(i14)).reaction);
        }
    }

    public final void n(TLRPC.TL_error tL_error) {
        if (tL_error == null || "PACK_TITLE_INVALID".equals(tL_error.text)) {
            return;
        }
        new kc((FrameLayout) getParent(), this.b0).t(tL_error.text, null).j();
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
        ks.f(this.a).c(this, ks.U1);
        ks.f(this.a).c(this, ks.W1);
        ks.f(this.a).c(this, ks.V1);
        ks.f(this.a).c(this, ks.c2);
        ks.f(this.a).c(this, ks.a2);
        ks.f(this.a).c(this, ks.b2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = this.a;
        if (i7 >= 0) {
            ks.f(i7).n(this, ks.U1);
            ks.f(this.a).n(this, ks.W1);
            ks.f(this.a).n(this, ks.V1);
            ks.f(this.a).n(this, ks.c2);
            ks.f(this.a).n(this, ks.a2);
            ks.f(this.a).n(this, ks.b2);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
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

    public final void p(final String str, final d20 d20Var, final String str2, final CharSequence charSequence, final boolean z10, final long j3, final TLRPC.StickerSet stickerSet, final TLRPC.Document document, final TLRPC.Document document2, final String str3, final w10 w10Var, final p10 p10Var) {
        org.telegram.messenger.g0.h3(new Runnable() { // from class: tg.d2
            @Override // java.lang.Runnable
            public final void run() {
                g2 g2Var;
                i2 i2Var = i2.this;
                w10 w10Var2 = w10Var;
                int i7 = 0;
                boolean z11 = w10Var2 == null || (g2Var = i2Var.a0) == null || !g2Var.o;
                if (z11) {
                    g2 g2Var2 = i2Var.a0;
                    if (g2Var2 != null) {
                        g2Var2.a();
                    }
                    g2 g2Var3 = new g2();
                    g2Var3.p = new ArrayList();
                    g2Var3.q = new ArrayList();
                    g2Var3.t = 0.0f;
                    g2Var3.u = 0.0f;
                    i2Var.a0 = g2Var3;
                }
                g2 g2Var4 = i2Var.a0;
                g2Var4.c = str2;
                String str4 = str;
                g2Var4.b = str4;
                g2Var4.a = str4;
                g2Var4.d = charSequence;
                g2Var4.h = z10;
                g2Var4.i = j3;
                g2Var4.j = stickerSet;
                g2Var4.k = document;
                d20 d20Var2 = d20Var;
                g2Var4.s = d20Var2;
                g2Var4.l = str3;
                g2Var4.n = w10Var2;
                g2Var4.m = p10Var;
                ArrayList arrayList = g2Var4.q;
                if (!TextUtils.isEmpty(str4)) {
                    g2Var4.p.add(new File(g2Var4.b));
                }
                if (!TextUtils.isEmpty(g2Var4.a) && !TextUtils.equals(g2Var4.a, g2Var4.b)) {
                    arrayList.add(new File(g2Var4.a));
                }
                if (!TextUtils.isEmpty(g2Var4.l)) {
                    arrayList.add(new File(g2Var4.l));
                }
                if (z11) {
                    TLRPC.Document document3 = document2;
                    if (document3 != null) {
                        g2 g2Var5 = i2Var.a0;
                        g2Var5.e = ri.c0(document3, g2Var5.c);
                        i2Var.a0.f = new TLRPC.TL_messageMediaDocument();
                        TLRPC.TL_messageMediaDocument tL_messageMediaDocument = i2Var.a0.f;
                        tL_messageMediaDocument.flags |= 1;
                        tL_messageMediaDocument.document = document3;
                        i2Var.a();
                    } else if (d20Var2 != null) {
                        TLRPC.TL_message tL_message = new TLRPC.TL_message();
                        tL_message.id = 1;
                        g2 g2Var6 = i2Var.a0;
                        String absolutePath = x7.w(i10.t0, "webm").getAbsolutePath();
                        tL_message.attachPath = absolutePath;
                        g2Var6.b = absolutePath;
                        i2Var.a0.r = new fj(i10.t0, tL_message, null, false, false);
                        i2Var.a0.r.r0 = d20Var2;
                        MediaController.B().h0(i2Var.a0.r, false, false, false);
                    } else {
                        w7.G(i2Var.a).h0(false, 67108864, str4, true);
                    }
                } else {
                    i2Var.a();
                }
                if (w10Var2 == null) {
                    if (i2Var.e0 == null) {
                        i2Var.e0 = new hi.c1(i2Var.getContext(), gd.N0(2131746725, null));
                    }
                    i2Var.e0.setOnCancelListener(new y1(i2Var, i7));
                    if (i2Var.e0.getParent() == null) {
                        i2Var.addView(i2Var.e0, na.e(-1, -1, 17));
                    }
                    hi.c1 c1Var = i2Var.e0;
                    c1Var.F = true;
                    c1Var.invalidate();
                }
            }
        }, 300L);
    }

    public void setCurrentAccount(int i7) {
        int i10 = this.a;
        if (i10 != i7) {
            int i11 = ks.b2;
            int i12 = ks.a2;
            int i13 = ks.c2;
            int i14 = ks.V1;
            int i15 = ks.W1;
            int i16 = ks.U1;
            if (i10 >= 0 && isAttachedToWindow()) {
                ks.f(this.a).n(this, i16);
                ks.f(this.a).n(this, i15);
                ks.f(this.a).n(this, i14);
                ks.f(this.a).n(this, i13);
                ks.f(this.a).n(this, i12);
                ks.f(this.a).n(this, i11);
            }
            this.a = i7;
            if (i7 < 0 || !isAttachedToWindow()) {
                return;
            }
            ks.f(this.a).c(this, i16);
            ks.f(this.a).c(this, i15);
            ks.f(this.a).c(this, i14);
            ks.f(this.a).c(this, i13);
            ks.f(this.a).c(this, i12);
            ks.f(this.a).c(this, i11);
        }
    }

    public void setOutlineVisible(boolean z10) {
        if (this.j0 == z10) {
            return;
        }
        this.j0 = z10;
        this.i0.animate().alpha(z10 ? 1.0f : 0.0f).translationX(z10 ? 0.0f : org.telegram.messenger.g0.L(-18.0f)).setInterpolator(kr.h).setDuration(320L).start();
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

    public void setStickerCutOutBtn(x1 x1Var) {
        this.c0 = x1Var;
    }
}
