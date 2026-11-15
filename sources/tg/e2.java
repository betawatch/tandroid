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
import bi.b3;
import bi.w2;
import c8.ja;
import c8.ke;
import com.google.mlkit.vision.label.internal.ImageLabelerImpl;
import com.google.mlkit.vision.segmentation.subject.internal.zzd;
import hi.d7;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.Executor;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ez;
import org.telegram.messenger.g20;
import org.telegram.messenger.gj;
import org.telegram.messenger.gz;
import org.telegram.messenger.hd;
import org.telegram.messenger.is;
import org.telegram.messenger.m10;
import org.telegram.messenger.n6;
import org.telegram.messenger.ns;
import org.telegram.messenger.s10;
import org.telegram.messenger.si;
import org.telegram.messenger.w7;
import org.telegram.messenger.z10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.cf;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.fz0;
import org.telegram.ui.Components.u5;
import org.telegram.ui.a31;
import org.telegram.ui.ah0;
import org.telegram.ui.ln0;
import org.telegram.ui.nb1;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class e2 extends FrameLayout implements is {
    public static final /* synthetic */ int s0 = 0;
    public volatile boolean E;
    public b2 F;
    public float G;
    public boolean H;
    public b2[] I;
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
    public fz0 T;
    public int U;
    public int V;
    public boolean W;
    public int a;
    public c2 a0;
    public final u5 b;
    public final e6 b0;
    public final u5 c;
    public s1 c0;
    public final Paint d;
    public String d0;
    public final Paint e;
    public hi.t0 e0;
    public final Paint f;
    public final Matrix f0;
    public float g0;
    public final Paint h;
    public float h0;
    public final m1 i0;
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

    public e2(ContextThemeWrapper contextThemeWrapper, e6 e6Var) {
        super(contextThemeWrapper);
        this.a = -1;
        er erVar = er.h;
        this.b = new u5(0.0f, (View) null, 0L, 420L, erVar);
        this.c = new u5(0.0f, (View) null, 0L, 420L, erVar);
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
        paint.setAlpha(ns.W1);
        TextView textView = new TextView(contextThemeWrapper);
        this.N = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(-1);
        textView.setAlpha(0.0f);
        textView.setScaleX(0.3f);
        textView.setScaleY(0.3f);
        addView(textView, ja.e(-2, -2, 17));
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
        this.i0 = m1Var;
        m1Var.setAlpha(0.0f);
        m1Var.setTranslationX(-org.telegram.messenger.g0.L(18.0f));
        m1Var.b(0.33f, 10.0f);
        m1Var.setBrushWeight(this.G);
        m1Var.setValueOverride(new cf(this));
        m1Var.setTranslationX(-org.telegram.messenger.g0.L(18.0f));
        m1Var.setAlpha(0.0f);
        addView(m1Var, ja.c(-1.0f, -1));
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0240  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void c(b2 b2Var, int i7, int i10) {
        Bitmap bitmap;
        a2 a2Var;
        boolean z10;
        float f10;
        int i11;
        Bitmap b10 = b2Var.b();
        Path path = b2Var.l;
        int width = b10.getWidth();
        int height = b2Var.b().getHeight();
        int i12 = 2;
        float max = Math.max(width, height) / (gz.o() == 2 ? 512.0f : 384.0f);
        if ((b2Var.c / 90) % 2 != 0) {
            width = b2Var.b().getHeight();
            height = b2Var.b().getWidth();
        }
        float f11 = width;
        float f12 = height;
        Bitmap createBitmap = Bitmap.createBitmap((int) (f11 / max), (int) (f12 / max), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        RectF rectF = new RectF();
        rectF.set(0.0f, 0.0f, createBitmap.getWidth(), createBitmap.getHeight());
        if (b2Var.c != 0) {
            Matrix matrix = new Matrix();
            matrix.postRotate(b2Var.c, b2Var.b().getWidth() / 2.0f, b2Var.d.getHeight() / 2.0f);
            if ((b2Var.c / 90) % 2 != 0) {
                float height2 = (b2Var.b().getHeight() - b2Var.b().getWidth()) / 2.0f;
                matrix.postTranslate(height2, -height2);
            }
            matrix.postScale(rectF.width() / f11, rectF.height() / f12);
            canvas.drawBitmap(b2Var.b(), matrix, new Paint(3));
        } else {
            canvas.drawBitmap(b2Var.b(), (Rect) null, rectF, new Paint(3));
        }
        int height3 = createBitmap.getHeight() * createBitmap.getWidth();
        int[] iArr = new int[height3];
        createBitmap.getPixels(iArr, 0, createBitmap.getWidth(), 0, 0, createBitmap.getWidth(), createBitmap.getHeight());
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        float f13 = i7;
        float f14 = i10;
        float min = Math.min(f13 / createBitmap.getWidth(), f14 / createBitmap.getHeight());
        a2 a2Var2 = null;
        a2 a2Var3 = null;
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
                    a2Var3 = new a2(min, width3, width2);
                }
                if (a2Var2 == null && z13 && iArr[i11] != 0) {
                    a2Var2 = new a2(min, width3, width2);
                }
            } else {
                f10 = f11;
            }
            boolean z14 = width3 == createBitmap.getWidth() + (-1);
            boolean z15 = width3 == 0;
            if (z14) {
                a2 a2Var4 = z11 ? new a2(min, width3, width2) : a2Var3;
                if (a2Var2 != null) {
                    arrayList.add(a2Var2);
                }
                if (a2Var4 != null) {
                    arrayList2.add(a2Var4);
                }
                a2Var2 = null;
                a2Var3 = null;
            }
            if (z15 && z11) {
                a2Var2 = new a2(min, width3, width2);
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
        a2 a2Var5 = null;
        a2 a2Var6 = null;
        while (i19 < height3) {
            float f16 = f12;
            int height4 = i19 / createBitmap.getHeight();
            a2 a2Var7 = a2Var5;
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
                    a2Var6 = new a2(min, height4, height5);
                }
                if (a2Var7 == null && z18 && iArr[width5] != 0) {
                    a2Var = new a2(min, height4, height5);
                    int i20 = height3;
                    z10 = height5 != bitmap.getHeight() + (-1);
                    boolean z19 = height5 != 0;
                    if (z10) {
                        if (z16) {
                            a2Var6 = new a2(min, height4, height5);
                        }
                        if (a2Var != null) {
                            arrayList3.add(a2Var);
                        }
                        if (a2Var6 != null) {
                            arrayList4.add(a2Var6);
                        }
                        a2Var = null;
                        a2Var6 = null;
                    }
                    a2Var5 = (z19 || !z16) ? a2Var : new a2(min, height4, height5);
                    i19++;
                    f12 = f16;
                    createBitmap = bitmap;
                    height3 = i20;
                }
            }
            a2Var = a2Var7;
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
            a2 a2Var8 = (a2) arrayList5.get(i21);
            if (path2.isEmpty()) {
                path2.moveTo(((Point) a2Var8).x, ((Point) a2Var8).y);
            } else {
                path2.lineTo(((Point) a2Var8).x, ((Point) a2Var8).y);
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
            a2 a2Var9 = (a2) arrayList6.get(i22);
            if (path3.isEmpty()) {
                path3.moveTo(((Point) a2Var9).x, ((Point) a2Var9).y);
            } else {
                path3.lineTo(((Point) a2Var9).x, ((Point) a2Var9).y);
            }
            i22 += 2;
        }
        path.reset();
        path.op(path2, path3, Path.Op.INTERSECT);
        float min2 = Math.min(f13 / f15, f14 / f17);
        float f18 = f15 * min2;
        b2Var.j = f18;
        float f19 = min2 * f17;
        b2Var.k = f19;
        path.offset((-f18) / 2.0f, (-f19) / 2.0f);
        Paint paint = b2Var.r;
        Paint paint2 = b2Var.q;
        Paint paint3 = b2Var.p;
        Paint paint4 = b2Var.s;
        PathMeasure pathMeasure = new PathMeasure();
        pathMeasure.setPath(path, true);
        float length = pathMeasure.getLength();
        int ceil = (int) Math.ceil(length / org.telegram.messenger.g0.L(2.0f));
        b2Var.n = ceil;
        b2Var.o = new float[ceil * 2];
        float[] fArr = new float[i18];
        int i23 = 0;
        while (true) {
            int i24 = b2Var.n;
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
                paint4.setColor(j6.r1(0.04f, -1));
                paint4.setStrokeCap(cap);
                paint4.setStrokeWidth(org.telegram.messenger.g0.L(20.0f));
                paint4.setColor(j6.r1(0.04f, -1));
                paint4.setMaskFilter(new BlurMaskFilter(org.telegram.messenger.g0.L(60.0f), blur));
                return;
            }
            pathMeasure.getPosTan(((i23 / i24) * length) % length, fArr, null);
            float[] fArr2 = b2Var.o;
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
        arrayList2.add((a2) arrayList.get(0));
        int i7 = 1;
        while (i7 < arrayList.size() - 1) {
            a2 a2Var = (a2) arrayList.get(i7 - 1);
            a2 a2Var2 = (a2) arrayList.get(i7);
            i7++;
            a2 a2Var3 = (a2) arrayList.get(i7);
            int i10 = ((Point) a2Var2).x;
            int i11 = ((Point) a2Var).x;
            int i12 = ((Point) a2Var3).y;
            int i13 = ((Point) a2Var).y;
            if (Math.abs((((i12 - i13) * (i10 - i11)) - ((((Point) a2Var3).x - i11) * (((Point) a2Var2).y - i13))) - (-1.0f)) >= 0.15f) {
                arrayList2.add(a2Var2);
            }
        }
        arrayList2.add((a2) i5.c.h(1, arrayList));
        return arrayList2;
    }

    public final void a() {
        final c2 c2Var = this.a0;
        if (c2Var == null) {
            return;
        }
        final int i7 = m10.t0;
        final int i10 = 1;
        c2Var.o = true;
        if (c2Var.m != null) {
            h();
            c2Var.m.a(c2Var.b, c2Var.e.document);
            org.telegram.messenger.g0.i3(new ah0(22), 250L);
            return;
        }
        final int i11 = 0;
        if (c2Var.k != null) {
            TLRPC.TL_stickers_replaceSticker tL_stickers_replaceSticker = new TLRPC.TL_stickers_replaceSticker();
            tL_stickers_replaceSticker.sticker = si.a0(c2Var.k, c2Var.c).document;
            tL_stickers_replaceSticker.new_sticker = c2Var.e;
            ConnectionsManager.getInstance(i7).sendRequest(tL_stickers_replaceSticker, new RequestDelegate(this) { // from class: tg.u1
                public final /* synthetic */ e2 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (i11) {
                        case 0:
                            final int i12 = 0;
                            final e2 e2Var = this.b;
                            final int i13 = i7;
                            final c2 c2Var2 = c2Var;
                            org.telegram.messenger.g0.h3(new Runnable() { // from class: tg.v1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean z10;
                                    boolean z11;
                                    boolean z12;
                                    switch (i12) {
                                        case 0:
                                            final TLObject tLObject2 = tLObject;
                                            boolean z13 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                            final e2 e2Var2 = e2Var;
                                            final c2 c2Var3 = c2Var2;
                                            if (z13) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                int i14 = i13;
                                                z10 = true;
                                                si.b0(i14).I1(tL_messages_stickerSet, true);
                                                if (!si.b0(i14).B0(tL_messages_stickerSet.set.id, true)) {
                                                    si.b0(i14).f2(null, tLObject2, 2, null, false, false);
                                                }
                                                hi.t0 t0Var = e2Var2.e0;
                                                if (t0Var != null) {
                                                    t0Var.setProgress(1.0f);
                                                }
                                                final int i15 = 1;
                                                org.telegram.messenger.g0.i3(new Runnable() { // from class: tg.w1
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i16 = i15;
                                                        c2 c2Var4 = c2Var3;
                                                        TLObject tLObject3 = tLObject2;
                                                        e2 e2Var3 = e2Var2;
                                                        switch (i16) {
                                                            case 0:
                                                                ns f10 = ns.f(m10.t0);
                                                                TLRPC.Document document = c2Var4.f.document;
                                                                String str = c2Var4.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                f10.m(ns.s3, bool, tLObject3, document, str, bool);
                                                                e2Var3.h();
                                                                break;
                                                            case 1:
                                                                ns.f(m10.t0).m(ns.s3, Boolean.FALSE, tLObject3, c2Var4.f.document, c2Var4.l, Boolean.TRUE);
                                                                e2Var3.h();
                                                                break;
                                                            default:
                                                                ns f11 = ns.f(m10.t0);
                                                                TLRPC.Document document2 = c2Var4.f.document;
                                                                String str2 = c2Var4.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                f11.m(ns.s3, bool2, tLObject3, document2, str2, bool2);
                                                                e2Var3.h();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                            } else {
                                                e2Var2.n(tL_error);
                                                e2Var2.h();
                                                z10 = false;
                                            }
                                            z10 z10Var = c2Var3.n;
                                            if (z10Var != null) {
                                                z10Var.a(Boolean.valueOf(z10));
                                                c2Var3.n = null;
                                                break;
                                            }
                                            break;
                                        case 1:
                                            final TLObject tLObject3 = tLObject;
                                            boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                            final e2 e2Var3 = e2Var;
                                            final c2 c2Var4 = c2Var2;
                                            if (z14) {
                                                int i16 = i13;
                                                z11 = true;
                                                si.b0(i16).I1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                si.b0(i16).f2(null, tLObject3, 2, null, false, false);
                                                hi.t0 t0Var2 = e2Var3.e0;
                                                if (t0Var2 != null) {
                                                    t0Var2.setProgress(1.0f);
                                                }
                                                final int i17 = 0;
                                                org.telegram.messenger.g0.i3(new Runnable() { // from class: tg.w1
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i162 = i17;
                                                        c2 c2Var42 = c2Var4;
                                                        TLObject tLObject32 = tLObject3;
                                                        e2 e2Var32 = e2Var3;
                                                        switch (i162) {
                                                            case 0:
                                                                ns f10 = ns.f(m10.t0);
                                                                TLRPC.Document document = c2Var42.f.document;
                                                                String str = c2Var42.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                f10.m(ns.s3, bool, tLObject32, document, str, bool);
                                                                e2Var32.h();
                                                                break;
                                                            case 1:
                                                                ns.f(m10.t0).m(ns.s3, Boolean.FALSE, tLObject32, c2Var42.f.document, c2Var42.l, Boolean.TRUE);
                                                                e2Var32.h();
                                                                break;
                                                            default:
                                                                ns f11 = ns.f(m10.t0);
                                                                TLRPC.Document document2 = c2Var42.f.document;
                                                                String str2 = c2Var42.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                f11.m(ns.s3, bool2, tLObject32, document2, str2, bool2);
                                                                e2Var32.h();
                                                                break;
                                                        }
                                                    }
                                                }, 250L);
                                            } else {
                                                e2Var3.n(tL_error);
                                                e2Var3.h();
                                                z11 = false;
                                            }
                                            z10 z10Var2 = c2Var4.n;
                                            if (z10Var2 != null) {
                                                z10Var2.a(Boolean.valueOf(z11));
                                                c2Var4.n = null;
                                                break;
                                            }
                                            break;
                                        default:
                                            final TLObject tLObject4 = tLObject;
                                            boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                            final e2 e2Var4 = e2Var;
                                            final c2 c2Var5 = c2Var2;
                                            if (z15) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                int i18 = i13;
                                                z12 = true;
                                                si.b0(i18).I1(tL_messages_stickerSet2, true);
                                                if (!si.b0(i18).B0(tL_messages_stickerSet2.set.id, true)) {
                                                    si.b0(i18).f2(null, tLObject4, 2, null, false, false);
                                                }
                                                hi.t0 t0Var3 = e2Var4.e0;
                                                if (t0Var3 != null) {
                                                    t0Var3.setProgress(1.0f);
                                                }
                                                final int i19 = 2;
                                                org.telegram.messenger.g0.i3(new Runnable() { // from class: tg.w1
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i162 = i19;
                                                        c2 c2Var42 = c2Var5;
                                                        TLObject tLObject32 = tLObject4;
                                                        e2 e2Var32 = e2Var4;
                                                        switch (i162) {
                                                            case 0:
                                                                ns f10 = ns.f(m10.t0);
                                                                TLRPC.Document document = c2Var42.f.document;
                                                                String str = c2Var42.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                f10.m(ns.s3, bool, tLObject32, document, str, bool);
                                                                e2Var32.h();
                                                                break;
                                                            case 1:
                                                                ns.f(m10.t0).m(ns.s3, Boolean.FALSE, tLObject32, c2Var42.f.document, c2Var42.l, Boolean.TRUE);
                                                                e2Var32.h();
                                                                break;
                                                            default:
                                                                ns f11 = ns.f(m10.t0);
                                                                TLRPC.Document document2 = c2Var42.f.document;
                                                                String str2 = c2Var42.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                f11.m(ns.s3, bool2, tLObject32, document2, str2, bool2);
                                                                e2Var32.h();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                            } else {
                                                e2Var4.n(tL_error);
                                                e2Var4.h();
                                                z12 = false;
                                            }
                                            z10 z10Var3 = c2Var5.n;
                                            if (z10Var3 != null) {
                                                z10Var3.a(Boolean.valueOf(z12));
                                                c2Var5.n = null;
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                        case 1:
                            final int i14 = 1;
                            final e2 e2Var2 = this.b;
                            final int i15 = i7;
                            final c2 c2Var3 = c2Var;
                            org.telegram.messenger.g0.h3(new Runnable() { // from class: tg.v1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean z10;
                                    boolean z11;
                                    boolean z12;
                                    switch (i14) {
                                        case 0:
                                            final TLObject tLObject2 = tLObject;
                                            boolean z13 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                            final e2 e2Var22 = e2Var2;
                                            final c2 c2Var32 = c2Var3;
                                            if (z13) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                int i142 = i15;
                                                z10 = true;
                                                si.b0(i142).I1(tL_messages_stickerSet, true);
                                                if (!si.b0(i142).B0(tL_messages_stickerSet.set.id, true)) {
                                                    si.b0(i142).f2(null, tLObject2, 2, null, false, false);
                                                }
                                                hi.t0 t0Var = e2Var22.e0;
                                                if (t0Var != null) {
                                                    t0Var.setProgress(1.0f);
                                                }
                                                final int i152 = 1;
                                                org.telegram.messenger.g0.i3(new Runnable() { // from class: tg.w1
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i162 = i152;
                                                        c2 c2Var42 = c2Var32;
                                                        TLObject tLObject32 = tLObject2;
                                                        e2 e2Var32 = e2Var22;
                                                        switch (i162) {
                                                            case 0:
                                                                ns f10 = ns.f(m10.t0);
                                                                TLRPC.Document document = c2Var42.f.document;
                                                                String str = c2Var42.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                f10.m(ns.s3, bool, tLObject32, document, str, bool);
                                                                e2Var32.h();
                                                                break;
                                                            case 1:
                                                                ns.f(m10.t0).m(ns.s3, Boolean.FALSE, tLObject32, c2Var42.f.document, c2Var42.l, Boolean.TRUE);
                                                                e2Var32.h();
                                                                break;
                                                            default:
                                                                ns f11 = ns.f(m10.t0);
                                                                TLRPC.Document document2 = c2Var42.f.document;
                                                                String str2 = c2Var42.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                f11.m(ns.s3, bool2, tLObject32, document2, str2, bool2);
                                                                e2Var32.h();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                            } else {
                                                e2Var22.n(tL_error);
                                                e2Var22.h();
                                                z10 = false;
                                            }
                                            z10 z10Var = c2Var32.n;
                                            if (z10Var != null) {
                                                z10Var.a(Boolean.valueOf(z10));
                                                c2Var32.n = null;
                                                break;
                                            }
                                            break;
                                        case 1:
                                            final TLObject tLObject3 = tLObject;
                                            boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                            final e2 e2Var3 = e2Var2;
                                            final c2 c2Var4 = c2Var3;
                                            if (z14) {
                                                int i16 = i15;
                                                z11 = true;
                                                si.b0(i16).I1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                si.b0(i16).f2(null, tLObject3, 2, null, false, false);
                                                hi.t0 t0Var2 = e2Var3.e0;
                                                if (t0Var2 != null) {
                                                    t0Var2.setProgress(1.0f);
                                                }
                                                final int i17 = 0;
                                                org.telegram.messenger.g0.i3(new Runnable() { // from class: tg.w1
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i162 = i17;
                                                        c2 c2Var42 = c2Var4;
                                                        TLObject tLObject32 = tLObject3;
                                                        e2 e2Var32 = e2Var3;
                                                        switch (i162) {
                                                            case 0:
                                                                ns f10 = ns.f(m10.t0);
                                                                TLRPC.Document document = c2Var42.f.document;
                                                                String str = c2Var42.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                f10.m(ns.s3, bool, tLObject32, document, str, bool);
                                                                e2Var32.h();
                                                                break;
                                                            case 1:
                                                                ns.f(m10.t0).m(ns.s3, Boolean.FALSE, tLObject32, c2Var42.f.document, c2Var42.l, Boolean.TRUE);
                                                                e2Var32.h();
                                                                break;
                                                            default:
                                                                ns f11 = ns.f(m10.t0);
                                                                TLRPC.Document document2 = c2Var42.f.document;
                                                                String str2 = c2Var42.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                f11.m(ns.s3, bool2, tLObject32, document2, str2, bool2);
                                                                e2Var32.h();
                                                                break;
                                                        }
                                                    }
                                                }, 250L);
                                            } else {
                                                e2Var3.n(tL_error);
                                                e2Var3.h();
                                                z11 = false;
                                            }
                                            z10 z10Var2 = c2Var4.n;
                                            if (z10Var2 != null) {
                                                z10Var2.a(Boolean.valueOf(z11));
                                                c2Var4.n = null;
                                                break;
                                            }
                                            break;
                                        default:
                                            final TLObject tLObject4 = tLObject;
                                            boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                            final e2 e2Var4 = e2Var2;
                                            final c2 c2Var5 = c2Var3;
                                            if (z15) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                int i18 = i15;
                                                z12 = true;
                                                si.b0(i18).I1(tL_messages_stickerSet2, true);
                                                if (!si.b0(i18).B0(tL_messages_stickerSet2.set.id, true)) {
                                                    si.b0(i18).f2(null, tLObject4, 2, null, false, false);
                                                }
                                                hi.t0 t0Var3 = e2Var4.e0;
                                                if (t0Var3 != null) {
                                                    t0Var3.setProgress(1.0f);
                                                }
                                                final int i19 = 2;
                                                org.telegram.messenger.g0.i3(new Runnable() { // from class: tg.w1
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i162 = i19;
                                                        c2 c2Var42 = c2Var5;
                                                        TLObject tLObject32 = tLObject4;
                                                        e2 e2Var32 = e2Var4;
                                                        switch (i162) {
                                                            case 0:
                                                                ns f10 = ns.f(m10.t0);
                                                                TLRPC.Document document = c2Var42.f.document;
                                                                String str = c2Var42.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                f10.m(ns.s3, bool, tLObject32, document, str, bool);
                                                                e2Var32.h();
                                                                break;
                                                            case 1:
                                                                ns.f(m10.t0).m(ns.s3, Boolean.FALSE, tLObject32, c2Var42.f.document, c2Var42.l, Boolean.TRUE);
                                                                e2Var32.h();
                                                                break;
                                                            default:
                                                                ns f11 = ns.f(m10.t0);
                                                                TLRPC.Document document2 = c2Var42.f.document;
                                                                String str2 = c2Var42.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                f11.m(ns.s3, bool2, tLObject32, document2, str2, bool2);
                                                                e2Var32.h();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                            } else {
                                                e2Var4.n(tL_error);
                                                e2Var4.h();
                                                z12 = false;
                                            }
                                            z10 z10Var3 = c2Var5.n;
                                            if (z10Var3 != null) {
                                                z10Var3.a(Boolean.valueOf(z12));
                                                c2Var5.n = null;
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                        default:
                            final int i16 = 2;
                            final e2 e2Var3 = this.b;
                            final int i17 = i7;
                            final c2 c2Var4 = c2Var;
                            org.telegram.messenger.g0.h3(new Runnable() { // from class: tg.v1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean z10;
                                    boolean z11;
                                    boolean z12;
                                    switch (i16) {
                                        case 0:
                                            final TLObject tLObject2 = tLObject;
                                            boolean z13 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                            final e2 e2Var22 = e2Var3;
                                            final c2 c2Var32 = c2Var4;
                                            if (z13) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                int i142 = i17;
                                                z10 = true;
                                                si.b0(i142).I1(tL_messages_stickerSet, true);
                                                if (!si.b0(i142).B0(tL_messages_stickerSet.set.id, true)) {
                                                    si.b0(i142).f2(null, tLObject2, 2, null, false, false);
                                                }
                                                hi.t0 t0Var = e2Var22.e0;
                                                if (t0Var != null) {
                                                    t0Var.setProgress(1.0f);
                                                }
                                                final int i152 = 1;
                                                org.telegram.messenger.g0.i3(new Runnable() { // from class: tg.w1
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i162 = i152;
                                                        c2 c2Var42 = c2Var32;
                                                        TLObject tLObject32 = tLObject2;
                                                        e2 e2Var32 = e2Var22;
                                                        switch (i162) {
                                                            case 0:
                                                                ns f10 = ns.f(m10.t0);
                                                                TLRPC.Document document = c2Var42.f.document;
                                                                String str = c2Var42.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                f10.m(ns.s3, bool, tLObject32, document, str, bool);
                                                                e2Var32.h();
                                                                break;
                                                            case 1:
                                                                ns.f(m10.t0).m(ns.s3, Boolean.FALSE, tLObject32, c2Var42.f.document, c2Var42.l, Boolean.TRUE);
                                                                e2Var32.h();
                                                                break;
                                                            default:
                                                                ns f11 = ns.f(m10.t0);
                                                                TLRPC.Document document2 = c2Var42.f.document;
                                                                String str2 = c2Var42.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                f11.m(ns.s3, bool2, tLObject32, document2, str2, bool2);
                                                                e2Var32.h();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                            } else {
                                                e2Var22.n(tL_error);
                                                e2Var22.h();
                                                z10 = false;
                                            }
                                            z10 z10Var = c2Var32.n;
                                            if (z10Var != null) {
                                                z10Var.a(Boolean.valueOf(z10));
                                                c2Var32.n = null;
                                                break;
                                            }
                                            break;
                                        case 1:
                                            final TLObject tLObject3 = tLObject;
                                            boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                            final e2 e2Var32 = e2Var3;
                                            final c2 c2Var42 = c2Var4;
                                            if (z14) {
                                                int i162 = i17;
                                                z11 = true;
                                                si.b0(i162).I1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                si.b0(i162).f2(null, tLObject3, 2, null, false, false);
                                                hi.t0 t0Var2 = e2Var32.e0;
                                                if (t0Var2 != null) {
                                                    t0Var2.setProgress(1.0f);
                                                }
                                                final int i172 = 0;
                                                org.telegram.messenger.g0.i3(new Runnable() { // from class: tg.w1
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i1622 = i172;
                                                        c2 c2Var422 = c2Var42;
                                                        TLObject tLObject32 = tLObject3;
                                                        e2 e2Var322 = e2Var32;
                                                        switch (i1622) {
                                                            case 0:
                                                                ns f10 = ns.f(m10.t0);
                                                                TLRPC.Document document = c2Var422.f.document;
                                                                String str = c2Var422.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                f10.m(ns.s3, bool, tLObject32, document, str, bool);
                                                                e2Var322.h();
                                                                break;
                                                            case 1:
                                                                ns.f(m10.t0).m(ns.s3, Boolean.FALSE, tLObject32, c2Var422.f.document, c2Var422.l, Boolean.TRUE);
                                                                e2Var322.h();
                                                                break;
                                                            default:
                                                                ns f11 = ns.f(m10.t0);
                                                                TLRPC.Document document2 = c2Var422.f.document;
                                                                String str2 = c2Var422.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                f11.m(ns.s3, bool2, tLObject32, document2, str2, bool2);
                                                                e2Var322.h();
                                                                break;
                                                        }
                                                    }
                                                }, 250L);
                                            } else {
                                                e2Var32.n(tL_error);
                                                e2Var32.h();
                                                z11 = false;
                                            }
                                            z10 z10Var2 = c2Var42.n;
                                            if (z10Var2 != null) {
                                                z10Var2.a(Boolean.valueOf(z11));
                                                c2Var42.n = null;
                                                break;
                                            }
                                            break;
                                        default:
                                            final TLObject tLObject4 = tLObject;
                                            boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                            final e2 e2Var4 = e2Var3;
                                            final c2 c2Var5 = c2Var4;
                                            if (z15) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                int i18 = i17;
                                                z12 = true;
                                                si.b0(i18).I1(tL_messages_stickerSet2, true);
                                                if (!si.b0(i18).B0(tL_messages_stickerSet2.set.id, true)) {
                                                    si.b0(i18).f2(null, tLObject4, 2, null, false, false);
                                                }
                                                hi.t0 t0Var3 = e2Var4.e0;
                                                if (t0Var3 != null) {
                                                    t0Var3.setProgress(1.0f);
                                                }
                                                final int i19 = 2;
                                                org.telegram.messenger.g0.i3(new Runnable() { // from class: tg.w1
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i1622 = i19;
                                                        c2 c2Var422 = c2Var5;
                                                        TLObject tLObject32 = tLObject4;
                                                        e2 e2Var322 = e2Var4;
                                                        switch (i1622) {
                                                            case 0:
                                                                ns f10 = ns.f(m10.t0);
                                                                TLRPC.Document document = c2Var422.f.document;
                                                                String str = c2Var422.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                f10.m(ns.s3, bool, tLObject32, document, str, bool);
                                                                e2Var322.h();
                                                                break;
                                                            case 1:
                                                                ns.f(m10.t0).m(ns.s3, Boolean.FALSE, tLObject32, c2Var422.f.document, c2Var422.l, Boolean.TRUE);
                                                                e2Var322.h();
                                                                break;
                                                            default:
                                                                ns f11 = ns.f(m10.t0);
                                                                TLRPC.Document document2 = c2Var422.f.document;
                                                                String str2 = c2Var422.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                f11.m(ns.s3, bool2, tLObject32, document2, str2, bool2);
                                                                e2Var322.h();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                            } else {
                                                e2Var4.n(tL_error);
                                                e2Var4.h();
                                                z12 = false;
                                            }
                                            z10 z10Var3 = c2Var5.n;
                                            if (z10Var3 != null) {
                                                z10Var3.a(Boolean.valueOf(z12));
                                                c2Var5.n = null;
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
        if (c2Var.d != null) {
            TLRPC.TL_stickers_createStickerSet tL_stickers_createStickerSet = new TLRPC.TL_stickers_createStickerSet();
            tL_stickers_createStickerSet.user_id = new TLRPC.TL_inputUserSelf();
            tL_stickers_createStickerSet.title = c2Var.d.toString();
            tL_stickers_createStickerSet.short_name = "";
            tL_stickers_createStickerSet.stickers.add(c2Var.e);
            ConnectionsManager.getInstance(i7).sendRequest(tL_stickers_createStickerSet, new RequestDelegate(this) { // from class: tg.u1
                public final /* synthetic */ e2 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (i10) {
                        case 0:
                            final int i12 = 0;
                            final e2 e2Var = this.b;
                            final int i13 = i7;
                            final c2 c2Var2 = c2Var;
                            org.telegram.messenger.g0.h3(new Runnable() { // from class: tg.v1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean z10;
                                    boolean z11;
                                    boolean z12;
                                    switch (i12) {
                                        case 0:
                                            final TLObject tLObject2 = tLObject;
                                            boolean z13 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                            final e2 e2Var22 = e2Var;
                                            final c2 c2Var32 = c2Var2;
                                            if (z13) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                int i142 = i13;
                                                z10 = true;
                                                si.b0(i142).I1(tL_messages_stickerSet, true);
                                                if (!si.b0(i142).B0(tL_messages_stickerSet.set.id, true)) {
                                                    si.b0(i142).f2(null, tLObject2, 2, null, false, false);
                                                }
                                                hi.t0 t0Var = e2Var22.e0;
                                                if (t0Var != null) {
                                                    t0Var.setProgress(1.0f);
                                                }
                                                final int i152 = 1;
                                                org.telegram.messenger.g0.i3(new Runnable() { // from class: tg.w1
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i1622 = i152;
                                                        c2 c2Var422 = c2Var32;
                                                        TLObject tLObject32 = tLObject2;
                                                        e2 e2Var322 = e2Var22;
                                                        switch (i1622) {
                                                            case 0:
                                                                ns f10 = ns.f(m10.t0);
                                                                TLRPC.Document document = c2Var422.f.document;
                                                                String str = c2Var422.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                f10.m(ns.s3, bool, tLObject32, document, str, bool);
                                                                e2Var322.h();
                                                                break;
                                                            case 1:
                                                                ns.f(m10.t0).m(ns.s3, Boolean.FALSE, tLObject32, c2Var422.f.document, c2Var422.l, Boolean.TRUE);
                                                                e2Var322.h();
                                                                break;
                                                            default:
                                                                ns f11 = ns.f(m10.t0);
                                                                TLRPC.Document document2 = c2Var422.f.document;
                                                                String str2 = c2Var422.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                f11.m(ns.s3, bool2, tLObject32, document2, str2, bool2);
                                                                e2Var322.h();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                            } else {
                                                e2Var22.n(tL_error);
                                                e2Var22.h();
                                                z10 = false;
                                            }
                                            z10 z10Var = c2Var32.n;
                                            if (z10Var != null) {
                                                z10Var.a(Boolean.valueOf(z10));
                                                c2Var32.n = null;
                                                break;
                                            }
                                            break;
                                        case 1:
                                            final TLObject tLObject3 = tLObject;
                                            boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                            final e2 e2Var32 = e2Var;
                                            final c2 c2Var42 = c2Var2;
                                            if (z14) {
                                                int i162 = i13;
                                                z11 = true;
                                                si.b0(i162).I1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                si.b0(i162).f2(null, tLObject3, 2, null, false, false);
                                                hi.t0 t0Var2 = e2Var32.e0;
                                                if (t0Var2 != null) {
                                                    t0Var2.setProgress(1.0f);
                                                }
                                                final int i172 = 0;
                                                org.telegram.messenger.g0.i3(new Runnable() { // from class: tg.w1
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i1622 = i172;
                                                        c2 c2Var422 = c2Var42;
                                                        TLObject tLObject32 = tLObject3;
                                                        e2 e2Var322 = e2Var32;
                                                        switch (i1622) {
                                                            case 0:
                                                                ns f10 = ns.f(m10.t0);
                                                                TLRPC.Document document = c2Var422.f.document;
                                                                String str = c2Var422.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                f10.m(ns.s3, bool, tLObject32, document, str, bool);
                                                                e2Var322.h();
                                                                break;
                                                            case 1:
                                                                ns.f(m10.t0).m(ns.s3, Boolean.FALSE, tLObject32, c2Var422.f.document, c2Var422.l, Boolean.TRUE);
                                                                e2Var322.h();
                                                                break;
                                                            default:
                                                                ns f11 = ns.f(m10.t0);
                                                                TLRPC.Document document2 = c2Var422.f.document;
                                                                String str2 = c2Var422.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                f11.m(ns.s3, bool2, tLObject32, document2, str2, bool2);
                                                                e2Var322.h();
                                                                break;
                                                        }
                                                    }
                                                }, 250L);
                                            } else {
                                                e2Var32.n(tL_error);
                                                e2Var32.h();
                                                z11 = false;
                                            }
                                            z10 z10Var2 = c2Var42.n;
                                            if (z10Var2 != null) {
                                                z10Var2.a(Boolean.valueOf(z11));
                                                c2Var42.n = null;
                                                break;
                                            }
                                            break;
                                        default:
                                            final TLObject tLObject4 = tLObject;
                                            boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                            final e2 e2Var4 = e2Var;
                                            final c2 c2Var5 = c2Var2;
                                            if (z15) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                int i18 = i13;
                                                z12 = true;
                                                si.b0(i18).I1(tL_messages_stickerSet2, true);
                                                if (!si.b0(i18).B0(tL_messages_stickerSet2.set.id, true)) {
                                                    si.b0(i18).f2(null, tLObject4, 2, null, false, false);
                                                }
                                                hi.t0 t0Var3 = e2Var4.e0;
                                                if (t0Var3 != null) {
                                                    t0Var3.setProgress(1.0f);
                                                }
                                                final int i19 = 2;
                                                org.telegram.messenger.g0.i3(new Runnable() { // from class: tg.w1
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i1622 = i19;
                                                        c2 c2Var422 = c2Var5;
                                                        TLObject tLObject32 = tLObject4;
                                                        e2 e2Var322 = e2Var4;
                                                        switch (i1622) {
                                                            case 0:
                                                                ns f10 = ns.f(m10.t0);
                                                                TLRPC.Document document = c2Var422.f.document;
                                                                String str = c2Var422.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                f10.m(ns.s3, bool, tLObject32, document, str, bool);
                                                                e2Var322.h();
                                                                break;
                                                            case 1:
                                                                ns.f(m10.t0).m(ns.s3, Boolean.FALSE, tLObject32, c2Var422.f.document, c2Var422.l, Boolean.TRUE);
                                                                e2Var322.h();
                                                                break;
                                                            default:
                                                                ns f11 = ns.f(m10.t0);
                                                                TLRPC.Document document2 = c2Var422.f.document;
                                                                String str2 = c2Var422.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                f11.m(ns.s3, bool2, tLObject32, document2, str2, bool2);
                                                                e2Var322.h();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                            } else {
                                                e2Var4.n(tL_error);
                                                e2Var4.h();
                                                z12 = false;
                                            }
                                            z10 z10Var3 = c2Var5.n;
                                            if (z10Var3 != null) {
                                                z10Var3.a(Boolean.valueOf(z12));
                                                c2Var5.n = null;
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                        case 1:
                            final int i14 = 1;
                            final e2 e2Var2 = this.b;
                            final int i15 = i7;
                            final c2 c2Var3 = c2Var;
                            org.telegram.messenger.g0.h3(new Runnable() { // from class: tg.v1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean z10;
                                    boolean z11;
                                    boolean z12;
                                    switch (i14) {
                                        case 0:
                                            final TLObject tLObject2 = tLObject;
                                            boolean z13 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                            final e2 e2Var22 = e2Var2;
                                            final c2 c2Var32 = c2Var3;
                                            if (z13) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                int i142 = i15;
                                                z10 = true;
                                                si.b0(i142).I1(tL_messages_stickerSet, true);
                                                if (!si.b0(i142).B0(tL_messages_stickerSet.set.id, true)) {
                                                    si.b0(i142).f2(null, tLObject2, 2, null, false, false);
                                                }
                                                hi.t0 t0Var = e2Var22.e0;
                                                if (t0Var != null) {
                                                    t0Var.setProgress(1.0f);
                                                }
                                                final int i152 = 1;
                                                org.telegram.messenger.g0.i3(new Runnable() { // from class: tg.w1
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i1622 = i152;
                                                        c2 c2Var422 = c2Var32;
                                                        TLObject tLObject32 = tLObject2;
                                                        e2 e2Var322 = e2Var22;
                                                        switch (i1622) {
                                                            case 0:
                                                                ns f10 = ns.f(m10.t0);
                                                                TLRPC.Document document = c2Var422.f.document;
                                                                String str = c2Var422.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                f10.m(ns.s3, bool, tLObject32, document, str, bool);
                                                                e2Var322.h();
                                                                break;
                                                            case 1:
                                                                ns.f(m10.t0).m(ns.s3, Boolean.FALSE, tLObject32, c2Var422.f.document, c2Var422.l, Boolean.TRUE);
                                                                e2Var322.h();
                                                                break;
                                                            default:
                                                                ns f11 = ns.f(m10.t0);
                                                                TLRPC.Document document2 = c2Var422.f.document;
                                                                String str2 = c2Var422.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                f11.m(ns.s3, bool2, tLObject32, document2, str2, bool2);
                                                                e2Var322.h();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                            } else {
                                                e2Var22.n(tL_error);
                                                e2Var22.h();
                                                z10 = false;
                                            }
                                            z10 z10Var = c2Var32.n;
                                            if (z10Var != null) {
                                                z10Var.a(Boolean.valueOf(z10));
                                                c2Var32.n = null;
                                                break;
                                            }
                                            break;
                                        case 1:
                                            final TLObject tLObject3 = tLObject;
                                            boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                            final e2 e2Var32 = e2Var2;
                                            final c2 c2Var42 = c2Var3;
                                            if (z14) {
                                                int i162 = i15;
                                                z11 = true;
                                                si.b0(i162).I1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                si.b0(i162).f2(null, tLObject3, 2, null, false, false);
                                                hi.t0 t0Var2 = e2Var32.e0;
                                                if (t0Var2 != null) {
                                                    t0Var2.setProgress(1.0f);
                                                }
                                                final int i172 = 0;
                                                org.telegram.messenger.g0.i3(new Runnable() { // from class: tg.w1
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i1622 = i172;
                                                        c2 c2Var422 = c2Var42;
                                                        TLObject tLObject32 = tLObject3;
                                                        e2 e2Var322 = e2Var32;
                                                        switch (i1622) {
                                                            case 0:
                                                                ns f10 = ns.f(m10.t0);
                                                                TLRPC.Document document = c2Var422.f.document;
                                                                String str = c2Var422.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                f10.m(ns.s3, bool, tLObject32, document, str, bool);
                                                                e2Var322.h();
                                                                break;
                                                            case 1:
                                                                ns.f(m10.t0).m(ns.s3, Boolean.FALSE, tLObject32, c2Var422.f.document, c2Var422.l, Boolean.TRUE);
                                                                e2Var322.h();
                                                                break;
                                                            default:
                                                                ns f11 = ns.f(m10.t0);
                                                                TLRPC.Document document2 = c2Var422.f.document;
                                                                String str2 = c2Var422.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                f11.m(ns.s3, bool2, tLObject32, document2, str2, bool2);
                                                                e2Var322.h();
                                                                break;
                                                        }
                                                    }
                                                }, 250L);
                                            } else {
                                                e2Var32.n(tL_error);
                                                e2Var32.h();
                                                z11 = false;
                                            }
                                            z10 z10Var2 = c2Var42.n;
                                            if (z10Var2 != null) {
                                                z10Var2.a(Boolean.valueOf(z11));
                                                c2Var42.n = null;
                                                break;
                                            }
                                            break;
                                        default:
                                            final TLObject tLObject4 = tLObject;
                                            boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                            final e2 e2Var4 = e2Var2;
                                            final c2 c2Var5 = c2Var3;
                                            if (z15) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                int i18 = i15;
                                                z12 = true;
                                                si.b0(i18).I1(tL_messages_stickerSet2, true);
                                                if (!si.b0(i18).B0(tL_messages_stickerSet2.set.id, true)) {
                                                    si.b0(i18).f2(null, tLObject4, 2, null, false, false);
                                                }
                                                hi.t0 t0Var3 = e2Var4.e0;
                                                if (t0Var3 != null) {
                                                    t0Var3.setProgress(1.0f);
                                                }
                                                final int i19 = 2;
                                                org.telegram.messenger.g0.i3(new Runnable() { // from class: tg.w1
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i1622 = i19;
                                                        c2 c2Var422 = c2Var5;
                                                        TLObject tLObject32 = tLObject4;
                                                        e2 e2Var322 = e2Var4;
                                                        switch (i1622) {
                                                            case 0:
                                                                ns f10 = ns.f(m10.t0);
                                                                TLRPC.Document document = c2Var422.f.document;
                                                                String str = c2Var422.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                f10.m(ns.s3, bool, tLObject32, document, str, bool);
                                                                e2Var322.h();
                                                                break;
                                                            case 1:
                                                                ns.f(m10.t0).m(ns.s3, Boolean.FALSE, tLObject32, c2Var422.f.document, c2Var422.l, Boolean.TRUE);
                                                                e2Var322.h();
                                                                break;
                                                            default:
                                                                ns f11 = ns.f(m10.t0);
                                                                TLRPC.Document document2 = c2Var422.f.document;
                                                                String str2 = c2Var422.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                f11.m(ns.s3, bool2, tLObject32, document2, str2, bool2);
                                                                e2Var322.h();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                            } else {
                                                e2Var4.n(tL_error);
                                                e2Var4.h();
                                                z12 = false;
                                            }
                                            z10 z10Var3 = c2Var5.n;
                                            if (z10Var3 != null) {
                                                z10Var3.a(Boolean.valueOf(z12));
                                                c2Var5.n = null;
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                        default:
                            final int i16 = 2;
                            final e2 e2Var3 = this.b;
                            final int i17 = i7;
                            final c2 c2Var4 = c2Var;
                            org.telegram.messenger.g0.h3(new Runnable() { // from class: tg.v1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean z10;
                                    boolean z11;
                                    boolean z12;
                                    switch (i16) {
                                        case 0:
                                            final TLObject tLObject2 = tLObject;
                                            boolean z13 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                            final e2 e2Var22 = e2Var3;
                                            final c2 c2Var32 = c2Var4;
                                            if (z13) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                int i142 = i17;
                                                z10 = true;
                                                si.b0(i142).I1(tL_messages_stickerSet, true);
                                                if (!si.b0(i142).B0(tL_messages_stickerSet.set.id, true)) {
                                                    si.b0(i142).f2(null, tLObject2, 2, null, false, false);
                                                }
                                                hi.t0 t0Var = e2Var22.e0;
                                                if (t0Var != null) {
                                                    t0Var.setProgress(1.0f);
                                                }
                                                final int i152 = 1;
                                                org.telegram.messenger.g0.i3(new Runnable() { // from class: tg.w1
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i1622 = i152;
                                                        c2 c2Var422 = c2Var32;
                                                        TLObject tLObject32 = tLObject2;
                                                        e2 e2Var322 = e2Var22;
                                                        switch (i1622) {
                                                            case 0:
                                                                ns f10 = ns.f(m10.t0);
                                                                TLRPC.Document document = c2Var422.f.document;
                                                                String str = c2Var422.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                f10.m(ns.s3, bool, tLObject32, document, str, bool);
                                                                e2Var322.h();
                                                                break;
                                                            case 1:
                                                                ns.f(m10.t0).m(ns.s3, Boolean.FALSE, tLObject32, c2Var422.f.document, c2Var422.l, Boolean.TRUE);
                                                                e2Var322.h();
                                                                break;
                                                            default:
                                                                ns f11 = ns.f(m10.t0);
                                                                TLRPC.Document document2 = c2Var422.f.document;
                                                                String str2 = c2Var422.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                f11.m(ns.s3, bool2, tLObject32, document2, str2, bool2);
                                                                e2Var322.h();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                            } else {
                                                e2Var22.n(tL_error);
                                                e2Var22.h();
                                                z10 = false;
                                            }
                                            z10 z10Var = c2Var32.n;
                                            if (z10Var != null) {
                                                z10Var.a(Boolean.valueOf(z10));
                                                c2Var32.n = null;
                                                break;
                                            }
                                            break;
                                        case 1:
                                            final TLObject tLObject3 = tLObject;
                                            boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                            final e2 e2Var32 = e2Var3;
                                            final c2 c2Var42 = c2Var4;
                                            if (z14) {
                                                int i162 = i17;
                                                z11 = true;
                                                si.b0(i162).I1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                si.b0(i162).f2(null, tLObject3, 2, null, false, false);
                                                hi.t0 t0Var2 = e2Var32.e0;
                                                if (t0Var2 != null) {
                                                    t0Var2.setProgress(1.0f);
                                                }
                                                final int i172 = 0;
                                                org.telegram.messenger.g0.i3(new Runnable() { // from class: tg.w1
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i1622 = i172;
                                                        c2 c2Var422 = c2Var42;
                                                        TLObject tLObject32 = tLObject3;
                                                        e2 e2Var322 = e2Var32;
                                                        switch (i1622) {
                                                            case 0:
                                                                ns f10 = ns.f(m10.t0);
                                                                TLRPC.Document document = c2Var422.f.document;
                                                                String str = c2Var422.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                f10.m(ns.s3, bool, tLObject32, document, str, bool);
                                                                e2Var322.h();
                                                                break;
                                                            case 1:
                                                                ns.f(m10.t0).m(ns.s3, Boolean.FALSE, tLObject32, c2Var422.f.document, c2Var422.l, Boolean.TRUE);
                                                                e2Var322.h();
                                                                break;
                                                            default:
                                                                ns f11 = ns.f(m10.t0);
                                                                TLRPC.Document document2 = c2Var422.f.document;
                                                                String str2 = c2Var422.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                f11.m(ns.s3, bool2, tLObject32, document2, str2, bool2);
                                                                e2Var322.h();
                                                                break;
                                                        }
                                                    }
                                                }, 250L);
                                            } else {
                                                e2Var32.n(tL_error);
                                                e2Var32.h();
                                                z11 = false;
                                            }
                                            z10 z10Var2 = c2Var42.n;
                                            if (z10Var2 != null) {
                                                z10Var2.a(Boolean.valueOf(z11));
                                                c2Var42.n = null;
                                                break;
                                            }
                                            break;
                                        default:
                                            final TLObject tLObject4 = tLObject;
                                            boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                            final e2 e2Var4 = e2Var3;
                                            final c2 c2Var5 = c2Var4;
                                            if (z15) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                int i18 = i17;
                                                z12 = true;
                                                si.b0(i18).I1(tL_messages_stickerSet2, true);
                                                if (!si.b0(i18).B0(tL_messages_stickerSet2.set.id, true)) {
                                                    si.b0(i18).f2(null, tLObject4, 2, null, false, false);
                                                }
                                                hi.t0 t0Var3 = e2Var4.e0;
                                                if (t0Var3 != null) {
                                                    t0Var3.setProgress(1.0f);
                                                }
                                                final int i19 = 2;
                                                org.telegram.messenger.g0.i3(new Runnable() { // from class: tg.w1
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i1622 = i19;
                                                        c2 c2Var422 = c2Var5;
                                                        TLObject tLObject32 = tLObject4;
                                                        e2 e2Var322 = e2Var4;
                                                        switch (i1622) {
                                                            case 0:
                                                                ns f10 = ns.f(m10.t0);
                                                                TLRPC.Document document = c2Var422.f.document;
                                                                String str = c2Var422.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                f10.m(ns.s3, bool, tLObject32, document, str, bool);
                                                                e2Var322.h();
                                                                break;
                                                            case 1:
                                                                ns.f(m10.t0).m(ns.s3, Boolean.FALSE, tLObject32, c2Var422.f.document, c2Var422.l, Boolean.TRUE);
                                                                e2Var322.h();
                                                                break;
                                                            default:
                                                                ns f11 = ns.f(m10.t0);
                                                                TLRPC.Document document2 = c2Var422.f.document;
                                                                String str2 = c2Var422.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                f11.m(ns.s3, bool2, tLObject32, document2, str2, bool2);
                                                                e2Var322.h();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                            } else {
                                                e2Var4.n(tL_error);
                                                e2Var4.h();
                                                z12 = false;
                                            }
                                            z10 z10Var3 = c2Var5.n;
                                            if (z10Var3 != null) {
                                                z10Var3.a(Boolean.valueOf(z12));
                                                c2Var5.n = null;
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
        if (c2Var.h) {
            h();
            ns.f(i7).m(ns.s3, Boolean.FALSE);
            org.telegram.messenger.g0.i3(new q2.d(c2Var, 17), 350L);
            z10 z10Var = c2Var.n;
            if (z10Var != null) {
                z10Var.a(Boolean.TRUE);
                return;
            }
            return;
        }
        if (c2Var.i == 0) {
            if (c2Var.j != null) {
                TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet = new TLRPC.TL_stickers_addStickerToSet();
                tL_stickers_addStickerToSet.stickerset = si.Z(c2Var.j);
                tL_stickers_addStickerToSet.sticker = c2Var.e;
                final int i12 = 2;
                ConnectionsManager.getInstance(i7).sendRequest(tL_stickers_addStickerToSet, new RequestDelegate(this) { // from class: tg.u1
                    public final /* synthetic */ e2 b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (i12) {
                            case 0:
                                final int i122 = 0;
                                final e2 e2Var = this.b;
                                final int i13 = i7;
                                final c2 c2Var2 = c2Var;
                                org.telegram.messenger.g0.h3(new Runnable() { // from class: tg.v1
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        boolean z10;
                                        boolean z11;
                                        boolean z12;
                                        switch (i122) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                boolean z13 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                                final e2 e2Var22 = e2Var;
                                                final c2 c2Var32 = c2Var2;
                                                if (z13) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i142 = i13;
                                                    z10 = true;
                                                    si.b0(i142).I1(tL_messages_stickerSet, true);
                                                    if (!si.b0(i142).B0(tL_messages_stickerSet.set.id, true)) {
                                                        si.b0(i142).f2(null, tLObject2, 2, null, false, false);
                                                    }
                                                    hi.t0 t0Var = e2Var22.e0;
                                                    if (t0Var != null) {
                                                        t0Var.setProgress(1.0f);
                                                    }
                                                    final int i152 = 1;
                                                    org.telegram.messenger.g0.i3(new Runnable() { // from class: tg.w1
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            int i1622 = i152;
                                                            c2 c2Var422 = c2Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            e2 e2Var322 = e2Var22;
                                                            switch (i1622) {
                                                                case 0:
                                                                    ns f10 = ns.f(m10.t0);
                                                                    TLRPC.Document document = c2Var422.f.document;
                                                                    String str = c2Var422.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(ns.s3, bool, tLObject32, document, str, bool);
                                                                    e2Var322.h();
                                                                    break;
                                                                case 1:
                                                                    ns.f(m10.t0).m(ns.s3, Boolean.FALSE, tLObject32, c2Var422.f.document, c2Var422.l, Boolean.TRUE);
                                                                    e2Var322.h();
                                                                    break;
                                                                default:
                                                                    ns f11 = ns.f(m10.t0);
                                                                    TLRPC.Document document2 = c2Var422.f.document;
                                                                    String str2 = c2Var422.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(ns.s3, bool2, tLObject32, document2, str2, bool2);
                                                                    e2Var322.h();
                                                                    break;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    e2Var22.n(tL_error);
                                                    e2Var22.h();
                                                    z10 = false;
                                                }
                                                z10 z10Var2 = c2Var32.n;
                                                if (z10Var2 != null) {
                                                    z10Var2.a(Boolean.valueOf(z10));
                                                    c2Var32.n = null;
                                                    break;
                                                }
                                                break;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final e2 e2Var32 = e2Var;
                                                final c2 c2Var42 = c2Var2;
                                                if (z14) {
                                                    int i162 = i13;
                                                    z11 = true;
                                                    si.b0(i162).I1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                    si.b0(i162).f2(null, tLObject3, 2, null, false, false);
                                                    hi.t0 t0Var2 = e2Var32.e0;
                                                    if (t0Var2 != null) {
                                                        t0Var2.setProgress(1.0f);
                                                    }
                                                    final int i172 = 0;
                                                    org.telegram.messenger.g0.i3(new Runnable() { // from class: tg.w1
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            int i1622 = i172;
                                                            c2 c2Var422 = c2Var42;
                                                            TLObject tLObject32 = tLObject3;
                                                            e2 e2Var322 = e2Var32;
                                                            switch (i1622) {
                                                                case 0:
                                                                    ns f10 = ns.f(m10.t0);
                                                                    TLRPC.Document document = c2Var422.f.document;
                                                                    String str = c2Var422.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(ns.s3, bool, tLObject32, document, str, bool);
                                                                    e2Var322.h();
                                                                    break;
                                                                case 1:
                                                                    ns.f(m10.t0).m(ns.s3, Boolean.FALSE, tLObject32, c2Var422.f.document, c2Var422.l, Boolean.TRUE);
                                                                    e2Var322.h();
                                                                    break;
                                                                default:
                                                                    ns f11 = ns.f(m10.t0);
                                                                    TLRPC.Document document2 = c2Var422.f.document;
                                                                    String str2 = c2Var422.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(ns.s3, bool2, tLObject32, document2, str2, bool2);
                                                                    e2Var322.h();
                                                                    break;
                                                            }
                                                        }
                                                    }, 250L);
                                                } else {
                                                    e2Var32.n(tL_error);
                                                    e2Var32.h();
                                                    z11 = false;
                                                }
                                                z10 z10Var22 = c2Var42.n;
                                                if (z10Var22 != null) {
                                                    z10Var22.a(Boolean.valueOf(z11));
                                                    c2Var42.n = null;
                                                    break;
                                                }
                                                break;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final e2 e2Var4 = e2Var;
                                                final c2 c2Var5 = c2Var2;
                                                if (z15) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i18 = i13;
                                                    z12 = true;
                                                    si.b0(i18).I1(tL_messages_stickerSet2, true);
                                                    if (!si.b0(i18).B0(tL_messages_stickerSet2.set.id, true)) {
                                                        si.b0(i18).f2(null, tLObject4, 2, null, false, false);
                                                    }
                                                    hi.t0 t0Var3 = e2Var4.e0;
                                                    if (t0Var3 != null) {
                                                        t0Var3.setProgress(1.0f);
                                                    }
                                                    final int i19 = 2;
                                                    org.telegram.messenger.g0.i3(new Runnable() { // from class: tg.w1
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            int i1622 = i19;
                                                            c2 c2Var422 = c2Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            e2 e2Var322 = e2Var4;
                                                            switch (i1622) {
                                                                case 0:
                                                                    ns f10 = ns.f(m10.t0);
                                                                    TLRPC.Document document = c2Var422.f.document;
                                                                    String str = c2Var422.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(ns.s3, bool, tLObject32, document, str, bool);
                                                                    e2Var322.h();
                                                                    break;
                                                                case 1:
                                                                    ns.f(m10.t0).m(ns.s3, Boolean.FALSE, tLObject32, c2Var422.f.document, c2Var422.l, Boolean.TRUE);
                                                                    e2Var322.h();
                                                                    break;
                                                                default:
                                                                    ns f11 = ns.f(m10.t0);
                                                                    TLRPC.Document document2 = c2Var422.f.document;
                                                                    String str2 = c2Var422.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(ns.s3, bool2, tLObject32, document2, str2, bool2);
                                                                    e2Var322.h();
                                                                    break;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    e2Var4.n(tL_error);
                                                    e2Var4.h();
                                                    z12 = false;
                                                }
                                                z10 z10Var3 = c2Var5.n;
                                                if (z10Var3 != null) {
                                                    z10Var3.a(Boolean.valueOf(z12));
                                                    c2Var5.n = null;
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                                break;
                            case 1:
                                final int i14 = 1;
                                final e2 e2Var2 = this.b;
                                final int i15 = i7;
                                final c2 c2Var3 = c2Var;
                                org.telegram.messenger.g0.h3(new Runnable() { // from class: tg.v1
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        boolean z10;
                                        boolean z11;
                                        boolean z12;
                                        switch (i14) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                boolean z13 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                                final e2 e2Var22 = e2Var2;
                                                final c2 c2Var32 = c2Var3;
                                                if (z13) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i142 = i15;
                                                    z10 = true;
                                                    si.b0(i142).I1(tL_messages_stickerSet, true);
                                                    if (!si.b0(i142).B0(tL_messages_stickerSet.set.id, true)) {
                                                        si.b0(i142).f2(null, tLObject2, 2, null, false, false);
                                                    }
                                                    hi.t0 t0Var = e2Var22.e0;
                                                    if (t0Var != null) {
                                                        t0Var.setProgress(1.0f);
                                                    }
                                                    final int i152 = 1;
                                                    org.telegram.messenger.g0.i3(new Runnable() { // from class: tg.w1
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            int i1622 = i152;
                                                            c2 c2Var422 = c2Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            e2 e2Var322 = e2Var22;
                                                            switch (i1622) {
                                                                case 0:
                                                                    ns f10 = ns.f(m10.t0);
                                                                    TLRPC.Document document = c2Var422.f.document;
                                                                    String str = c2Var422.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(ns.s3, bool, tLObject32, document, str, bool);
                                                                    e2Var322.h();
                                                                    break;
                                                                case 1:
                                                                    ns.f(m10.t0).m(ns.s3, Boolean.FALSE, tLObject32, c2Var422.f.document, c2Var422.l, Boolean.TRUE);
                                                                    e2Var322.h();
                                                                    break;
                                                                default:
                                                                    ns f11 = ns.f(m10.t0);
                                                                    TLRPC.Document document2 = c2Var422.f.document;
                                                                    String str2 = c2Var422.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(ns.s3, bool2, tLObject32, document2, str2, bool2);
                                                                    e2Var322.h();
                                                                    break;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    e2Var22.n(tL_error);
                                                    e2Var22.h();
                                                    z10 = false;
                                                }
                                                z10 z10Var2 = c2Var32.n;
                                                if (z10Var2 != null) {
                                                    z10Var2.a(Boolean.valueOf(z10));
                                                    c2Var32.n = null;
                                                    break;
                                                }
                                                break;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final e2 e2Var32 = e2Var2;
                                                final c2 c2Var42 = c2Var3;
                                                if (z14) {
                                                    int i162 = i15;
                                                    z11 = true;
                                                    si.b0(i162).I1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                    si.b0(i162).f2(null, tLObject3, 2, null, false, false);
                                                    hi.t0 t0Var2 = e2Var32.e0;
                                                    if (t0Var2 != null) {
                                                        t0Var2.setProgress(1.0f);
                                                    }
                                                    final int i172 = 0;
                                                    org.telegram.messenger.g0.i3(new Runnable() { // from class: tg.w1
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            int i1622 = i172;
                                                            c2 c2Var422 = c2Var42;
                                                            TLObject tLObject32 = tLObject3;
                                                            e2 e2Var322 = e2Var32;
                                                            switch (i1622) {
                                                                case 0:
                                                                    ns f10 = ns.f(m10.t0);
                                                                    TLRPC.Document document = c2Var422.f.document;
                                                                    String str = c2Var422.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(ns.s3, bool, tLObject32, document, str, bool);
                                                                    e2Var322.h();
                                                                    break;
                                                                case 1:
                                                                    ns.f(m10.t0).m(ns.s3, Boolean.FALSE, tLObject32, c2Var422.f.document, c2Var422.l, Boolean.TRUE);
                                                                    e2Var322.h();
                                                                    break;
                                                                default:
                                                                    ns f11 = ns.f(m10.t0);
                                                                    TLRPC.Document document2 = c2Var422.f.document;
                                                                    String str2 = c2Var422.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(ns.s3, bool2, tLObject32, document2, str2, bool2);
                                                                    e2Var322.h();
                                                                    break;
                                                            }
                                                        }
                                                    }, 250L);
                                                } else {
                                                    e2Var32.n(tL_error);
                                                    e2Var32.h();
                                                    z11 = false;
                                                }
                                                z10 z10Var22 = c2Var42.n;
                                                if (z10Var22 != null) {
                                                    z10Var22.a(Boolean.valueOf(z11));
                                                    c2Var42.n = null;
                                                    break;
                                                }
                                                break;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final e2 e2Var4 = e2Var2;
                                                final c2 c2Var5 = c2Var3;
                                                if (z15) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i18 = i15;
                                                    z12 = true;
                                                    si.b0(i18).I1(tL_messages_stickerSet2, true);
                                                    if (!si.b0(i18).B0(tL_messages_stickerSet2.set.id, true)) {
                                                        si.b0(i18).f2(null, tLObject4, 2, null, false, false);
                                                    }
                                                    hi.t0 t0Var3 = e2Var4.e0;
                                                    if (t0Var3 != null) {
                                                        t0Var3.setProgress(1.0f);
                                                    }
                                                    final int i19 = 2;
                                                    org.telegram.messenger.g0.i3(new Runnable() { // from class: tg.w1
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            int i1622 = i19;
                                                            c2 c2Var422 = c2Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            e2 e2Var322 = e2Var4;
                                                            switch (i1622) {
                                                                case 0:
                                                                    ns f10 = ns.f(m10.t0);
                                                                    TLRPC.Document document = c2Var422.f.document;
                                                                    String str = c2Var422.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(ns.s3, bool, tLObject32, document, str, bool);
                                                                    e2Var322.h();
                                                                    break;
                                                                case 1:
                                                                    ns.f(m10.t0).m(ns.s3, Boolean.FALSE, tLObject32, c2Var422.f.document, c2Var422.l, Boolean.TRUE);
                                                                    e2Var322.h();
                                                                    break;
                                                                default:
                                                                    ns f11 = ns.f(m10.t0);
                                                                    TLRPC.Document document2 = c2Var422.f.document;
                                                                    String str2 = c2Var422.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(ns.s3, bool2, tLObject32, document2, str2, bool2);
                                                                    e2Var322.h();
                                                                    break;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    e2Var4.n(tL_error);
                                                    e2Var4.h();
                                                    z12 = false;
                                                }
                                                z10 z10Var3 = c2Var5.n;
                                                if (z10Var3 != null) {
                                                    z10Var3.a(Boolean.valueOf(z12));
                                                    c2Var5.n = null;
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                                break;
                            default:
                                final int i16 = 2;
                                final e2 e2Var3 = this.b;
                                final int i17 = i7;
                                final c2 c2Var4 = c2Var;
                                org.telegram.messenger.g0.h3(new Runnable() { // from class: tg.v1
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        boolean z10;
                                        boolean z11;
                                        boolean z12;
                                        switch (i16) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                boolean z13 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                                final e2 e2Var22 = e2Var3;
                                                final c2 c2Var32 = c2Var4;
                                                if (z13) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i142 = i17;
                                                    z10 = true;
                                                    si.b0(i142).I1(tL_messages_stickerSet, true);
                                                    if (!si.b0(i142).B0(tL_messages_stickerSet.set.id, true)) {
                                                        si.b0(i142).f2(null, tLObject2, 2, null, false, false);
                                                    }
                                                    hi.t0 t0Var = e2Var22.e0;
                                                    if (t0Var != null) {
                                                        t0Var.setProgress(1.0f);
                                                    }
                                                    final int i152 = 1;
                                                    org.telegram.messenger.g0.i3(new Runnable() { // from class: tg.w1
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            int i1622 = i152;
                                                            c2 c2Var422 = c2Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            e2 e2Var322 = e2Var22;
                                                            switch (i1622) {
                                                                case 0:
                                                                    ns f10 = ns.f(m10.t0);
                                                                    TLRPC.Document document = c2Var422.f.document;
                                                                    String str = c2Var422.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(ns.s3, bool, tLObject32, document, str, bool);
                                                                    e2Var322.h();
                                                                    break;
                                                                case 1:
                                                                    ns.f(m10.t0).m(ns.s3, Boolean.FALSE, tLObject32, c2Var422.f.document, c2Var422.l, Boolean.TRUE);
                                                                    e2Var322.h();
                                                                    break;
                                                                default:
                                                                    ns f11 = ns.f(m10.t0);
                                                                    TLRPC.Document document2 = c2Var422.f.document;
                                                                    String str2 = c2Var422.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(ns.s3, bool2, tLObject32, document2, str2, bool2);
                                                                    e2Var322.h();
                                                                    break;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    e2Var22.n(tL_error);
                                                    e2Var22.h();
                                                    z10 = false;
                                                }
                                                z10 z10Var2 = c2Var32.n;
                                                if (z10Var2 != null) {
                                                    z10Var2.a(Boolean.valueOf(z10));
                                                    c2Var32.n = null;
                                                    break;
                                                }
                                                break;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final e2 e2Var32 = e2Var3;
                                                final c2 c2Var42 = c2Var4;
                                                if (z14) {
                                                    int i162 = i17;
                                                    z11 = true;
                                                    si.b0(i162).I1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                    si.b0(i162).f2(null, tLObject3, 2, null, false, false);
                                                    hi.t0 t0Var2 = e2Var32.e0;
                                                    if (t0Var2 != null) {
                                                        t0Var2.setProgress(1.0f);
                                                    }
                                                    final int i172 = 0;
                                                    org.telegram.messenger.g0.i3(new Runnable() { // from class: tg.w1
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            int i1622 = i172;
                                                            c2 c2Var422 = c2Var42;
                                                            TLObject tLObject32 = tLObject3;
                                                            e2 e2Var322 = e2Var32;
                                                            switch (i1622) {
                                                                case 0:
                                                                    ns f10 = ns.f(m10.t0);
                                                                    TLRPC.Document document = c2Var422.f.document;
                                                                    String str = c2Var422.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(ns.s3, bool, tLObject32, document, str, bool);
                                                                    e2Var322.h();
                                                                    break;
                                                                case 1:
                                                                    ns.f(m10.t0).m(ns.s3, Boolean.FALSE, tLObject32, c2Var422.f.document, c2Var422.l, Boolean.TRUE);
                                                                    e2Var322.h();
                                                                    break;
                                                                default:
                                                                    ns f11 = ns.f(m10.t0);
                                                                    TLRPC.Document document2 = c2Var422.f.document;
                                                                    String str2 = c2Var422.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(ns.s3, bool2, tLObject32, document2, str2, bool2);
                                                                    e2Var322.h();
                                                                    break;
                                                            }
                                                        }
                                                    }, 250L);
                                                } else {
                                                    e2Var32.n(tL_error);
                                                    e2Var32.h();
                                                    z11 = false;
                                                }
                                                z10 z10Var22 = c2Var42.n;
                                                if (z10Var22 != null) {
                                                    z10Var22.a(Boolean.valueOf(z11));
                                                    c2Var42.n = null;
                                                    break;
                                                }
                                                break;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final e2 e2Var4 = e2Var3;
                                                final c2 c2Var5 = c2Var4;
                                                if (z15) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i18 = i17;
                                                    z12 = true;
                                                    si.b0(i18).I1(tL_messages_stickerSet2, true);
                                                    if (!si.b0(i18).B0(tL_messages_stickerSet2.set.id, true)) {
                                                        si.b0(i18).f2(null, tLObject4, 2, null, false, false);
                                                    }
                                                    hi.t0 t0Var3 = e2Var4.e0;
                                                    if (t0Var3 != null) {
                                                        t0Var3.setProgress(1.0f);
                                                    }
                                                    final int i19 = 2;
                                                    org.telegram.messenger.g0.i3(new Runnable() { // from class: tg.w1
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            int i1622 = i19;
                                                            c2 c2Var422 = c2Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            e2 e2Var322 = e2Var4;
                                                            switch (i1622) {
                                                                case 0:
                                                                    ns f10 = ns.f(m10.t0);
                                                                    TLRPC.Document document = c2Var422.f.document;
                                                                    String str = c2Var422.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f10.m(ns.s3, bool, tLObject32, document, str, bool);
                                                                    e2Var322.h();
                                                                    break;
                                                                case 1:
                                                                    ns.f(m10.t0).m(ns.s3, Boolean.FALSE, tLObject32, c2Var422.f.document, c2Var422.l, Boolean.TRUE);
                                                                    e2Var322.h();
                                                                    break;
                                                                default:
                                                                    ns f11 = ns.f(m10.t0);
                                                                    TLRPC.Document document2 = c2Var422.f.document;
                                                                    String str2 = c2Var422.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f11.m(ns.s3, bool2, tLObject32, document2, str2, bool2);
                                                                    e2Var322.h();
                                                                    break;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    e2Var4.n(tL_error);
                                                    e2Var4.h();
                                                    z12 = false;
                                                }
                                                z10 z10Var3 = c2Var5.n;
                                                if (z10Var3 != null) {
                                                    z10Var3.a(Boolean.valueOf(z12));
                                                    c2Var5.n = null;
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
        ez.C(i7).v0(c2Var.f.document, null, c2Var.i, null, null, null, null, null, true, 0, 0, false, null, null, 0L, 0L, null);
        hi.t0 t0Var = this.e0;
        if (t0Var != null) {
            t0Var.setProgress(1.0f);
        }
        org.telegram.messenger.g0.i3(new nb1(this, i7, 11), 450L);
        z10 z10Var2 = c2Var.n;
        if (z10Var2 != null) {
            z10Var2.a(Boolean.TRUE);
            c2Var.n = null;
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
                b2[] b2VarArr = this.I;
                if (i7 >= b2VarArr.length) {
                    break;
                }
                b2 b2Var = b2VarArr[i7];
                if (b2Var != null) {
                    b2Var.l.reset();
                    Bitmap bitmap = b2Var.e;
                    if (bitmap != null) {
                        bitmap.recycle();
                        b2Var.e = null;
                    }
                    Bitmap bitmap2 = b2Var.d;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                        b2Var.d = null;
                    }
                    Bitmap bitmap3 = b2Var.g;
                    if (bitmap3 != null) {
                        bitmap3.recycle();
                        b2Var.g = null;
                    }
                    Bitmap bitmap4 = b2Var.f;
                    if (bitmap4 != null) {
                        bitmap4.recycle();
                        b2Var.f = null;
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
        c2 c2Var = this.a0;
        if (c2Var != null) {
            if (!c2Var.o) {
                c2Var.a();
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

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        c2 c2Var;
        if (i7 == ns.U1) {
            String str = (String) objArr[0];
            TLRPC.InputFile inputFile = (TLRPC.InputFile) objArr[1];
            c2 c2Var2 = this.a0;
            if (c2Var2 == null || !str.equalsIgnoreCase(c2Var2.b)) {
                return;
            }
            c2 c2Var3 = this.a0;
            c2Var3.g = inputFile;
            TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia = new TLRPC.TL_messages_uploadMedia();
            tL_messages_uploadMedia.peer = new TLRPC.TL_inputPeerSelf();
            TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument = new TLRPC.TL_inputMediaUploadedDocument();
            tL_messages_uploadMedia.media = tL_inputMediaUploadedDocument;
            tL_inputMediaUploadedDocument.file = c2Var3.g;
            if (c2Var3.s != null) {
                tL_inputMediaUploadedDocument.mime_type = "video/webm";
            } else {
                tL_inputMediaUploadedDocument.mime_type = "image/webp";
            }
            TLRPC.TL_documentAttributeSticker tL_documentAttributeSticker = new TLRPC.TL_documentAttributeSticker();
            tL_documentAttributeSticker.alt = c2Var3.c;
            tL_documentAttributeSticker.stickerset = new TLRPC.TL_inputStickerSetEmpty();
            tL_messages_uploadMedia.media.attributes.add(tL_documentAttributeSticker);
            ConnectionsManager.getInstance(m10.t0).sendRequest(tL_messages_uploadMedia, new a31(9, this, c2Var3), 2);
            return;
        }
        if (i7 == ns.W1) {
            String str2 = (String) objArr[0];
            c2 c2Var4 = this.a0;
            if (c2Var4 == null || !str2.equalsIgnoreCase(c2Var4.b)) {
                return;
            }
            long longValue = ((Long) objArr[1]).longValue();
            long longValue2 = ((Long) objArr[2]).longValue();
            if (longValue2 > 0) {
                c2 c2Var5 = this.a0;
                c2Var5.u = Utilities.i(longValue / longValue2, 1.0f, c2Var5.u);
                hi.t0 t0Var = this.e0;
                if (t0Var != null) {
                    t0Var.setProgress(this.a0.b());
                    return;
                }
                return;
            }
            return;
        }
        if (i7 == ns.V1) {
            String str3 = (String) objArr[0];
            c2 c2Var6 = this.a0;
            if (c2Var6 == null || !str3.equalsIgnoreCase(c2Var6.b)) {
                return;
            }
            h();
            return;
        }
        if (i7 == ns.a2) {
            c2 c2Var7 = this.a0;
            if (c2Var7 != null && objArr[0] == c2Var7.r) {
                w7.G(m10.t0).h0(false, 67108864, this.a0.b, true);
                return;
            }
            return;
        }
        if (i7 != ns.b2) {
            if (i7 == ns.c2 && (c2Var = this.a0) != null && objArr[0] == c2Var.r) {
                h();
                return;
            }
            return;
        }
        c2 c2Var8 = this.a0;
        if (c2Var8 != null && objArr[0] == c2Var8.r) {
            String str4 = (String) objArr[1];
            long longValue3 = ((Long) objArr[2]).longValue();
            long longValue4 = ((Long) objArr[3]).longValue();
            Float f10 = (Float) objArr[4];
            float floatValue = f10.floatValue();
            this.a0.r.r0.Y = true;
            w7.G(this.a).n(str4, false, Math.max(1L, longValue3), longValue4, f10);
            c2 c2Var9 = this.a0;
            c2Var9.t = Math.max(c2Var9.t, floatValue);
            hi.t0 t0Var2 = this.e0;
            if (t0Var2 != null) {
                t0Var2.setProgress(this.a0.b());
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
            b2 j3 = j(this.o0, y10);
            int i7 = 0;
            while (true) {
                b2[] b2VarArr = this.I;
                if (i7 >= b2VarArr.length) {
                    break;
                }
                if (b2VarArr[i7] == j3 && motionEvent.getAction() != 3) {
                    z10 = true;
                }
                z10 = false;
                if (z10 && !this.I[i7].b) {
                    org.telegram.messenger.g0.b4(this);
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
        b2 b2Var = this.F;
        if (b2Var != null) {
            this.L = bitmap;
            if (b2Var.f != null && this.M) {
                Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                Paint paint = new Paint(3);
                Paint paint2 = new Paint(3);
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint2);
                Rect rect = new Rect();
                rect.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
                b2 b2Var2 = this.F;
                if (b2Var2.c == 0) {
                    canvas.drawBitmap(b2Var2.a(), (Rect) null, rect, paint);
                    return createBitmap;
                }
                Matrix matrix = new Matrix();
                b2 b2Var3 = this.F;
                matrix.postRotate(b2Var3.c, b2Var3.a().getWidth() / 2.0f, this.F.a().getHeight() / 2.0f);
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
        textView.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(240L).setInterpolator(er.h).start();
    }

    public final void g(Canvas canvas, boolean z10, ViewGroup viewGroup, boolean z11) {
        u5 u5Var = this.c;
        u5Var.a = viewGroup;
        boolean z12 = this.j0;
        if (z12 || u5Var.c > 0.0f) {
            float d = viewGroup == null ? 1.0f : u5Var.d(z12 && !z11);
            b2[] b2VarArr = this.I;
            if (b2VarArr != null) {
                for (b2 b2Var : b2VarArr) {
                    if (b2Var != null && b2Var == this.F) {
                        if (this.G > 0.0f) {
                            if (b2Var.t.l0 == null) {
                                return;
                            }
                            canvas.save();
                            canvas.clipPath(b2Var.t.l0);
                            if (b2Var.t.J != null) {
                                Paint paint = z10 ? b2Var.q : b2Var.p;
                                paint.setAlpha((int) (d * 255.0f));
                                paint.setStrokeWidth(org.telegram.messenger.g0.L(r4));
                                canvas.drawPath(b2Var.l, paint);
                                if (b2Var.t.l0 != null && z10) {
                                    canvas.clipPath(b2Var.l);
                                    paint.setStrokeWidth(org.telegram.messenger.g0.L(r4 * 2.0f));
                                    canvas.drawPath(b2Var.t.l0, paint);
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
        b2 b2Var;
        if (!this.M || (b2Var = this.F) == null) {
            return null;
        }
        return b2Var.a();
    }

    public Bitmap getSourceBitmap() {
        return this.J;
    }

    public fz0 getThanosEffect() {
        if (!fz0.c()) {
            return null;
        }
        if (this.T == null) {
            fz0 fz0Var = new fz0(getContext(), new t1(this, 1));
            this.T = fz0Var;
            addView(fz0Var, ja.c(-1.0f, -1));
        }
        return this.T;
    }

    public final void h() {
        hi.t0 t0Var = this.e0;
        if (t0Var != null) {
            t0Var.a();
            this.e0 = null;
        }
    }

    public final boolean i() {
        return this.M;
    }

    public final b2 j(float f10, float f11) {
        int width;
        int height;
        if (this.J == null) {
            return null;
        }
        int i7 = 0;
        while (true) {
            b2[] b2VarArr = this.I;
            if (i7 >= b2VarArr.length) {
                return null;
            }
            b2 b2Var = b2VarArr[i7];
            if (b2Var != null) {
                if ((b2Var.c / 90) % 2 != 0) {
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
                    return b2Var;
                }
            }
            i7++;
        }
    }

    public final void l() {
        Bitmap bitmap;
        b2[] b2VarArr = this.I;
        if (b2VarArr != null) {
            for (b2 b2Var : b2VarArr) {
                if (b2Var != null && (bitmap = b2Var.e) != null) {
                    bitmap.recycle();
                    b2Var.e = null;
                    Bitmap bitmap2 = b2Var.g;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                        b2Var.g = null;
                    }
                    c(b2Var, this.U, this.V);
                }
            }
        }
    }

    public final void m(Bitmap bitmap, int i7, int i10, int i11, ln0 ln0Var) {
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
        w2 w2Var = new w2(this, i7, ln0Var, 6);
        this.y = true;
        ia.a aVar = new ia.a();
        aVar.b = true;
        aVar.c = true;
        zzd a10 = ke.a(new zb.d(aVar));
        if (n6.h(getContext()).f()) {
            ArrayList arrayList = new ArrayList();
            Bitmap bitmap2 = this.J;
            d2 d2Var = new d2();
            int min = (int) (Math.min(bitmap2.getWidth(), bitmap2.getHeight()) * 0.4f);
            d2Var.e = min;
            d2Var.d = min;
            d2Var.a = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
            new Canvas(d2Var.a).drawRect(0.0f, 0.0f, d2Var.d, d2Var.e, j6.Gm);
            d2Var.b = (bitmap2.getWidth() - d2Var.d) / 2;
            d2Var.c = (bitmap2.getHeight() - d2Var.e) / 2;
            arrayList.add(d2Var);
            w2Var.a(arrayList);
            return;
        }
        ub.a a11 = ub.a.a(i7, bitmap);
        a10.g(a11).addOnSuccessListener(new org.telegram.ui.ActionBar.z(w2Var, 29)).addOnFailureListener(new b3(this, bitmap, i7, ln0Var, w2Var, 6));
        if (this.d0 == null) {
            xb.a aVar2 = xb.a.b;
            q6.m.h(aVar2, "options cannot be null");
            synchronized (vb.c.class) {
                cVar = (vb.c) pb.g.c().a(vb.c.class);
            }
            ua.b bVar = (ua.b) cVar.a.get(xb.a.class);
            q6.m.g(bVar);
            yb.b bVar2 = (yb.b) bVar.get();
            bVar2.getClass();
            ua uaVar = bVar2.c;
            b8 b8Var = new b8();
            b8Var.c = y7.b;
            pb.n.a.execute(new qa(uaVar, new xa(b8Var, 1), a8.c, uaVar.b(), 0));
            new ImageLabelerImpl((pb.e) bVar2.a.R0(aVar2), (Executor) bVar2.b.a.get(), new n6.c("vision.ica", 1L)).g(a11).addOnSuccessListener(new z1(this, 0)).addOnFailureListener(new r2.j(26));
        }
        ArrayList arrayList2 = si.b0(this.a).n;
        for (int i14 = 0; i14 < Math.min(arrayList2.size(), 9); i14++) {
            org.telegram.messenger.j6.g(((TLRPC.TL_availableReaction) arrayList2.get(i14)).reaction);
        }
    }

    public final void n(TLRPC.TL_error tL_error) {
        if (tL_error == null || "PACK_TITLE_INVALID".equals(tL_error.text)) {
            return;
        }
        new cc((FrameLayout) getParent(), this.b0).t(tL_error.text, null).j();
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
        ns.f(this.a).c(this, ns.U1);
        ns.f(this.a).c(this, ns.W1);
        ns.f(this.a).c(this, ns.V1);
        ns.f(this.a).c(this, ns.c2);
        ns.f(this.a).c(this, ns.a2);
        ns.f(this.a).c(this, ns.b2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = this.a;
        if (i7 >= 0) {
            ns.f(i7).n(this, ns.U1);
            ns.f(this.a).n(this, ns.W1);
            ns.f(this.a).n(this, ns.V1);
            ns.f(this.a).n(this, ns.c2);
            ns.f(this.a).n(this, ns.a2);
            ns.f(this.a).n(this, ns.b2);
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

    public final void p(final String str, final g20 g20Var, final String str2, final CharSequence charSequence, final boolean z10, final long j3, final TLRPC.StickerSet stickerSet, final TLRPC.Document document, final TLRPC.Document document2, final String str3, final z10 z10Var, final s10 s10Var) {
        org.telegram.messenger.g0.i3(new Runnable() { // from class: tg.y1
            @Override // java.lang.Runnable
            public final void run() {
                c2 c2Var;
                e2 e2Var = e2.this;
                z10 z10Var2 = z10Var;
                int i7 = 0;
                boolean z11 = z10Var2 == null || (c2Var = e2Var.a0) == null || !c2Var.o;
                if (z11) {
                    c2 c2Var2 = e2Var.a0;
                    if (c2Var2 != null) {
                        c2Var2.a();
                    }
                    c2 c2Var3 = new c2();
                    c2Var3.p = new ArrayList();
                    c2Var3.q = new ArrayList();
                    c2Var3.t = 0.0f;
                    c2Var3.u = 0.0f;
                    e2Var.a0 = c2Var3;
                }
                c2 c2Var4 = e2Var.a0;
                c2Var4.c = str2;
                String str4 = str;
                c2Var4.b = str4;
                c2Var4.a = str4;
                c2Var4.d = charSequence;
                c2Var4.h = z10;
                c2Var4.i = j3;
                c2Var4.j = stickerSet;
                c2Var4.k = document;
                g20 g20Var2 = g20Var;
                c2Var4.s = g20Var2;
                c2Var4.l = str3;
                c2Var4.n = z10Var2;
                c2Var4.m = s10Var;
                ArrayList arrayList = c2Var4.q;
                if (!TextUtils.isEmpty(str4)) {
                    c2Var4.p.add(new File(c2Var4.b));
                }
                if (!TextUtils.isEmpty(c2Var4.a) && !TextUtils.equals(c2Var4.a, c2Var4.b)) {
                    arrayList.add(new File(c2Var4.a));
                }
                if (!TextUtils.isEmpty(c2Var4.l)) {
                    arrayList.add(new File(c2Var4.l));
                }
                if (z11) {
                    TLRPC.Document document3 = document2;
                    if (document3 != null) {
                        c2 c2Var5 = e2Var.a0;
                        c2Var5.e = si.a0(document3, c2Var5.c);
                        e2Var.a0.f = new TLRPC.TL_messageMediaDocument();
                        TLRPC.TL_messageMediaDocument tL_messageMediaDocument = e2Var.a0.f;
                        tL_messageMediaDocument.flags |= 1;
                        tL_messageMediaDocument.document = document3;
                        e2Var.a();
                    } else if (g20Var2 != null) {
                        TLRPC.TL_message tL_message = new TLRPC.TL_message();
                        tL_message.id = 1;
                        c2 c2Var6 = e2Var.a0;
                        String absolutePath = d7.w(m10.t0, "webm").getAbsolutePath();
                        tL_message.attachPath = absolutePath;
                        c2Var6.b = absolutePath;
                        e2Var.a0.r = new gj(m10.t0, tL_message, null, false, false);
                        e2Var.a0.r.r0 = g20Var2;
                        MediaController.B().h0(e2Var.a0.r, false, false, false);
                    } else {
                        w7.G(e2Var.a).h0(false, 67108864, str4, true);
                    }
                } else {
                    e2Var.a();
                }
                if (z10Var2 == null) {
                    if (e2Var.e0 == null) {
                        e2Var.e0 = new hi.t0(e2Var.getContext(), hd.M0(2131746919, null));
                    }
                    e2Var.e0.setOnCancelListener(new t1(e2Var, i7));
                    if (e2Var.e0.getParent() == null) {
                        e2Var.addView(e2Var.e0, ja.e(-1, -1, 17));
                    }
                    hi.t0 t0Var = e2Var.e0;
                    t0Var.F = true;
                    t0Var.invalidate();
                }
            }
        }, 300L);
    }

    public void setCurrentAccount(int i7) {
        int i10 = this.a;
        if (i10 != i7) {
            int i11 = ns.b2;
            int i12 = ns.a2;
            int i13 = ns.c2;
            int i14 = ns.V1;
            int i15 = ns.W1;
            int i16 = ns.U1;
            if (i10 >= 0 && isAttachedToWindow()) {
                ns.f(this.a).n(this, i16);
                ns.f(this.a).n(this, i15);
                ns.f(this.a).n(this, i14);
                ns.f(this.a).n(this, i13);
                ns.f(this.a).n(this, i12);
                ns.f(this.a).n(this, i11);
            }
            this.a = i7;
            if (i7 < 0 || !isAttachedToWindow()) {
                return;
            }
            ns.f(this.a).c(this, i16);
            ns.f(this.a).c(this, i15);
            ns.f(this.a).c(this, i14);
            ns.f(this.a).c(this, i13);
            ns.f(this.a).c(this, i12);
            ns.f(this.a).c(this, i11);
        }
    }

    public void setOutlineVisible(boolean z10) {
        if (this.j0 == z10) {
            return;
        }
        this.j0 = z10;
        this.i0.animate().alpha(z10 ? 1.0f : 0.0f).translationX(z10 ? 0.0f : org.telegram.messenger.g0.L(-18.0f)).setInterpolator(er.h).setDuration(320L).start();
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
