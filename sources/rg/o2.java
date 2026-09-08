package rg;

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
import com.google.mlkit.vision.label.internal.ImageLabelerImpl;
import com.google.mlkit.vision.segmentation.subject.internal.zzd;
import di.o8;
import fi.s4;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.Executor;
import ji.k5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.EmuDetector;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.w01;
import org.telegram.ui.Components.yc;
import org.telegram.ui.cj1;
import org.telegram.ui.or0;
import org.telegram.ui.q31;
import w7.x5;
import x7.fa;
import x7.m7;
import x7.o7;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class o2 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final /* synthetic */ int r0 = 0;
    public l2 E;
    public float F;
    public boolean G;
    public l2[] H;
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
    public w01 S;
    public int T;
    public int U;
    public boolean V;
    public m2 W;
    public int a;
    public final f6 a0;
    public final e6 b;
    public e2 b0;
    public final e6 c;
    public String c0;
    public final Paint d;
    public di.t0 d0;
    public final Paint e;
    public final Matrix e0;
    public final Paint f;
    public float f0;
    public float g0;
    public final Paint h;
    public final y1 h0;
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
    public final Path v;
    public final Path w;
    public volatile boolean x;
    public volatile boolean y;

    public o2(ContextThemeWrapper contextThemeWrapper, f6 f6Var) {
        super(contextThemeWrapper);
        this.a = -1;
        pr prVar = pr.h;
        this.b = new e6(0.0f, (View) null, 0L, 420L, prVar);
        this.c = new e6(0.0f, (View) null, 0L, 420L, prVar);
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
        this.v = new Path();
        this.w = new Path();
        this.F = 2.0f;
        this.e0 = new Matrix();
        this.j0 = new Matrix();
        this.m0 = new RectF();
        this.p0 = new ArrayList();
        this.q0 = new Rect();
        this.a0 = f6Var;
        paint.setColor(-1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint.setPathEffect(new DashPathEffect(new float[]{AndroidUtilities.dp(5.0f), AndroidUtilities.dp(10.0f)}, 0.5f));
        paint.setShadowLayer(AndroidUtilities.dpf2(0.75f), 0.0f, 0.0f, 1342177280);
        paint.setAlpha(140);
        TextView textView = new TextView(contextThemeWrapper);
        this.M = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(-1);
        textView.setAlpha(0.0f);
        textView.setScaleX(0.3f);
        textView.setScaleY(0.3f);
        addView(textView, x5.e(-2, -2, 17));
        paint3.setColor(-1);
        paint3.setStrokeWidth(AndroidUtilities.dp(3.0f));
        paint3.setStyle(style);
        paint3.setStrokeCap(cap);
        paint3.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(20.0f)));
        float dp = AndroidUtilities.dp(4.0f);
        BlurMaskFilter.Blur blur = BlurMaskFilter.Blur.NORMAL;
        paint3.setMaskFilter(new BlurMaskFilter(dp, blur));
        paint4.setColor(-1);
        paint4.setStrokeWidth(AndroidUtilities.dp(3.0f));
        paint4.setStyle(style);
        paint4.setStrokeCap(cap);
        paint4.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(20.0f)));
        paint4.setMaskFilter(new BlurMaskFilter(AndroidUtilities.dp(4.0f), blur));
        paint2.setColor(1711276032);
        setLayerType(2, null);
        y1 y1Var = new y1(contextThemeWrapper);
        this.h0 = y1Var;
        y1Var.setAlpha(0.0f);
        y1Var.setTranslationX(-AndroidUtilities.dp(18.0f));
        y1Var.b(0.33f, 10.0f);
        y1Var.setBrushWeight(this.F);
        y1Var.setValueOverride(new mg.n(this, 14));
        y1Var.setTranslationX(-AndroidUtilities.dp(18.0f));
        y1Var.setAlpha(0.0f);
        addView(y1Var, x5.c(-1.0f, -1));
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x023b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void c(l2 l2Var, int i10, int i11) {
        Bitmap bitmap;
        k2 k2Var;
        boolean z10;
        float f7;
        int i12;
        Bitmap b10 = l2Var.b();
        Path path = l2Var.l;
        int width = b10.getWidth();
        int height = l2Var.b().getHeight();
        float max = Math.max(width, height) / (SharedConfig.getDevicePerformanceClass() == 2 ? 512.0f : 384.0f);
        if ((l2Var.c / 90) % 2 != 0) {
            width = l2Var.b().getHeight();
            height = l2Var.b().getWidth();
        }
        float f10 = width;
        float f11 = height;
        Bitmap createBitmap = Bitmap.createBitmap((int) (f10 / max), (int) (f11 / max), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        RectF rectF = new RectF();
        rectF.set(0.0f, 0.0f, createBitmap.getWidth(), createBitmap.getHeight());
        if (l2Var.c != 0) {
            Matrix matrix = new Matrix();
            matrix.postRotate(l2Var.c, l2Var.b().getWidth() / 2.0f, l2Var.d.getHeight() / 2.0f);
            if ((l2Var.c / 90) % 2 != 0) {
                float height2 = (l2Var.b().getHeight() - l2Var.b().getWidth()) / 2.0f;
                matrix.postTranslate(height2, -height2);
            }
            matrix.postScale(rectF.width() / f10, rectF.height() / f11);
            canvas.drawBitmap(l2Var.b(), matrix, new Paint(3));
        } else {
            canvas.drawBitmap(l2Var.b(), (Rect) null, rectF, new Paint(3));
        }
        int height3 = createBitmap.getHeight() * createBitmap.getWidth();
        int[] iArr = new int[height3];
        createBitmap.getPixels(iArr, 0, createBitmap.getWidth(), 0, 0, createBitmap.getWidth(), createBitmap.getHeight());
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        float f12 = i10;
        float f13 = i11;
        float min = Math.min(f12 / createBitmap.getWidth(), f13 / createBitmap.getHeight());
        k2 k2Var2 = null;
        k2 k2Var3 = null;
        int i13 = 0;
        while (i13 < height3) {
            int width2 = i13 / createBitmap.getWidth();
            int width3 = i13 - (createBitmap.getWidth() * width2);
            int i14 = iArr[i13];
            boolean z11 = i14 != 0;
            if (i14 == 0) {
                int i15 = i13 - 1;
                boolean z12 = i15 >= 0;
                f7 = f10;
                int i16 = i13 + 1;
                boolean z13 = i16 < height3;
                if (!z12 || iArr[i15] == 0) {
                    i12 = i16;
                } else {
                    i12 = i16;
                    k2Var3 = new k2(min, width3, width2);
                }
                if (k2Var2 == null && z13 && iArr[i12] != 0) {
                    k2Var2 = new k2(min, width3, width2);
                }
            } else {
                f7 = f10;
            }
            boolean z14 = width3 == createBitmap.getWidth() + (-1);
            boolean z15 = width3 == 0;
            if (z14) {
                k2 k2Var4 = z11 ? new k2(min, width3, width2) : k2Var3;
                if (k2Var2 != null) {
                    arrayList.add(k2Var2);
                }
                if (k2Var4 != null) {
                    arrayList2.add(k2Var4);
                }
                k2Var2 = null;
                k2Var3 = null;
            }
            if (z15 && z11) {
                k2Var2 = new k2(min, width3, width2);
            }
            i13++;
            f10 = f7;
        }
        float f14 = f10;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        k2 k2Var5 = null;
        k2 k2Var6 = null;
        int i17 = 0;
        while (i17 < height3) {
            float f15 = f11;
            int height4 = i17 / createBitmap.getHeight();
            k2 k2Var7 = k2Var5;
            int height5 = i17 - (createBitmap.getHeight() * height4);
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
                    k2Var6 = new k2(min, height4, height5);
                }
                if (k2Var7 == null && z18 && iArr[width5] != 0) {
                    k2Var = new k2(min, height4, height5);
                    int i18 = height3;
                    z10 = height5 != bitmap.getHeight() + (-1);
                    boolean z19 = height5 != 0;
                    if (z10) {
                        if (z16) {
                            k2Var6 = new k2(min, height4, height5);
                        }
                        if (k2Var != null) {
                            arrayList3.add(k2Var);
                        }
                        if (k2Var6 != null) {
                            arrayList4.add(k2Var6);
                        }
                        k2Var = null;
                        k2Var6 = null;
                    }
                    k2Var5 = (z19 || !z16) ? k2Var : new k2(min, height4, height5);
                    i17++;
                    f11 = f15;
                    createBitmap = bitmap;
                    height3 = i18;
                }
            }
            k2Var = k2Var7;
            int i182 = height3;
            if (height5 != bitmap.getHeight() + (-1)) {
            }
            if (height5 != 0) {
            }
            if (z10) {
            }
            if (z19) {
            }
            i17++;
            f11 = f15;
            createBitmap = bitmap;
            height3 = i182;
        }
        float f16 = f11;
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
        int i19 = 0;
        while (true) {
            ArrayList arrayList5 = (ArrayList) k11;
            if (i19 >= arrayList5.size()) {
                break;
            }
            k2 k2Var8 = (k2) arrayList5.get(i19);
            if (path2.isEmpty()) {
                path2.moveTo(((Point) k2Var8).x, ((Point) k2Var8).y);
            } else {
                path2.lineTo(((Point) k2Var8).x, ((Point) k2Var8).y);
            }
            i19 += 2;
        }
        Path path3 = new Path();
        int i20 = 0;
        while (true) {
            ArrayList arrayList6 = (ArrayList) k10;
            if (i20 >= arrayList6.size()) {
                break;
            }
            k2 k2Var9 = (k2) arrayList6.get(i20);
            if (path3.isEmpty()) {
                path3.moveTo(((Point) k2Var9).x, ((Point) k2Var9).y);
            } else {
                path3.lineTo(((Point) k2Var9).x, ((Point) k2Var9).y);
            }
            i20 += 2;
        }
        path.reset();
        path.op(path2, path3, Path.Op.INTERSECT);
        float min2 = Math.min(f12 / f14, f13 / f16);
        float f17 = f14 * min2;
        l2Var.j = f17;
        float f18 = min2 * f16;
        l2Var.k = f18;
        path.offset((-f17) / 2.0f, (-f18) / 2.0f);
        Paint paint = l2Var.r;
        Paint paint2 = l2Var.q;
        Paint paint3 = l2Var.p;
        Paint paint4 = l2Var.s;
        PathMeasure pathMeasure = new PathMeasure();
        pathMeasure.setPath(path, true);
        float length = pathMeasure.getLength();
        int ceil = (int) Math.ceil(length / AndroidUtilities.dp(2.0f));
        l2Var.n = ceil;
        l2Var.o = new float[ceil * 2];
        float[] fArr = new float[2];
        int i21 = 0;
        while (true) {
            int i22 = l2Var.n;
            if (i21 >= i22) {
                paint3.setStyle(Paint.Style.FILL);
                paint3.setColor(-1);
                Paint.Join join = Paint.Join.ROUND;
                paint3.setStrokeJoin(join);
                Paint.Cap cap = Paint.Cap.ROUND;
                paint3.setStrokeCap(cap);
                paint3.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(10.0f)));
                Paint.Style style = Paint.Style.STROKE;
                paint2.setStyle(style);
                paint2.setColor(-1);
                paint2.setStrokeJoin(join);
                paint2.setStrokeCap(cap);
                paint2.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(10.0f)));
                paint.setStyle(style);
                paint.setStrokeWidth(AndroidUtilities.dp(4.0f));
                paint.setColor(-1);
                paint.setStrokeCap(cap);
                float dp = AndroidUtilities.dp(0.33f);
                BlurMaskFilter.Blur blur = BlurMaskFilter.Blur.NORMAL;
                paint.setMaskFilter(new BlurMaskFilter(dp, blur));
                paint4.setStyle(style);
                paint4.setColor(j6.l1(0.04f, -1));
                paint4.setStrokeCap(cap);
                paint4.setStrokeWidth(AndroidUtilities.dp(20.0f));
                paint4.setColor(j6.l1(0.04f, -1));
                paint4.setMaskFilter(new BlurMaskFilter(AndroidUtilities.dp(60.0f), blur));
                return;
            }
            pathMeasure.getPosTan(((i21 / i22) * length) % length, fArr, null);
            float[] fArr2 = l2Var.o;
            int i23 = i21 * 2;
            fArr2[i23] = fArr[0];
            fArr2[i23 + 1] = fArr[1];
            i21++;
        }
    }

    public static List k(ArrayList arrayList) {
        if (arrayList.size() < 3) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add((k2) arrayList.get(0));
        int i10 = 1;
        while (i10 < arrayList.size() - 1) {
            k2 k2Var = (k2) arrayList.get(i10 - 1);
            k2 k2Var2 = (k2) arrayList.get(i10);
            i10++;
            k2 k2Var3 = (k2) arrayList.get(i10);
            int i11 = ((Point) k2Var2).x;
            int i12 = ((Point) k2Var).x;
            int i13 = ((Point) k2Var3).y;
            int i14 = ((Point) k2Var).y;
            if (Math.abs((((i13 - i14) * (i11 - i12)) - ((((Point) k2Var3).x - i12) * (((Point) k2Var2).y - i14))) - (-1.0f)) >= 0.15f) {
                arrayList2.add(k2Var2);
            }
        }
        arrayList2.add((k2) i2.g.h(1, arrayList));
        return arrayList2;
    }

    public final void a() {
        final m2 m2Var = this.W;
        if (m2Var == null) {
            return;
        }
        final int i10 = UserConfig.selectedAccount;
        final int i11 = 1;
        m2Var.o = true;
        if (m2Var.m != null) {
            h();
            m2Var.m.run(m2Var.b, m2Var.e.document);
            AndroidUtilities.runOnUIThread(new q31(13), 250L);
            return;
        }
        final int i12 = 0;
        if (m2Var.k != null) {
            TLRPC.TL_stickers_replaceSticker tL_stickers_replaceSticker = new TLRPC.TL_stickers_replaceSticker();
            tL_stickers_replaceSticker.sticker = MediaDataController.getInputStickerSetItem(m2Var.k, m2Var.c).document;
            tL_stickers_replaceSticker.new_sticker = m2Var.e;
            ConnectionsManager.getInstance(i10).sendRequest(tL_stickers_replaceSticker, new RequestDelegate(this) { // from class: rg.g2
                public final /* synthetic */ o2 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (i12) {
                        case 0:
                            final int i13 = 0;
                            final o2 o2Var = this.b;
                            final int i14 = i10;
                            final m2 m2Var2 = m2Var;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: rg.h2
                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean z10;
                                    boolean z11;
                                    boolean z12;
                                    switch (i13) {
                                        case 0:
                                            final TLObject tLObject2 = tLObject;
                                            boolean z13 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                            final o2 o2Var2 = o2Var;
                                            final m2 m2Var3 = m2Var2;
                                            if (z13) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                int i15 = i14;
                                                MediaDataController.getInstance(i15).putStickerSet(tL_messages_stickerSet);
                                                if (!MediaDataController.getInstance(i15).isStickerPackInstalled(tL_messages_stickerSet.set.id)) {
                                                    MediaDataController.getInstance(i15).toggleStickerSet(null, tLObject2, 2, null, false, false);
                                                }
                                                di.t0 t0Var = o2Var2.d0;
                                                if (t0Var != null) {
                                                    t0Var.setProgress(1.0f);
                                                }
                                                final int i16 = 1;
                                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: rg.i2
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i17 = i16;
                                                        m2 m2Var4 = m2Var3;
                                                        TLObject tLObject3 = tLObject2;
                                                        o2 o2Var3 = o2Var2;
                                                        o2Var3.getClass();
                                                        switch (i17) {
                                                            case 0:
                                                                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i18 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document = m2Var4.f.document;
                                                                String str = m2Var4.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                notificationCenter.postNotificationNameOnUIThread(i18, bool, tLObject3, document, str, bool);
                                                                o2Var3.h();
                                                                break;
                                                            case 1:
                                                                NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject3, m2Var4.f.document, m2Var4.l, Boolean.TRUE);
                                                                o2Var3.h();
                                                                break;
                                                            default:
                                                                NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i19 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document2 = m2Var4.f.document;
                                                                String str2 = m2Var4.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                notificationCenter2.postNotificationNameOnUIThread(i19, bool2, tLObject3, document2, str2, bool2);
                                                                o2Var3.h();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                                z10 = true;
                                            } else {
                                                o2Var2.n(tL_error);
                                                o2Var2.h();
                                                z10 = false;
                                            }
                                            Utilities.Callback callback = m2Var3.n;
                                            if (callback != null) {
                                                callback.run(Boolean.valueOf(z10));
                                                m2Var3.n = null;
                                                break;
                                            }
                                            break;
                                        case 1:
                                            final TLObject tLObject3 = tLObject;
                                            boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                            final o2 o2Var3 = o2Var;
                                            final m2 m2Var4 = m2Var2;
                                            if (z14) {
                                                int i17 = i14;
                                                MediaDataController.getInstance(i17).putStickerSet((TLRPC.TL_messages_stickerSet) tLObject3);
                                                MediaDataController.getInstance(i17).toggleStickerSet(null, tLObject3, 2, null, false, false);
                                                di.t0 t0Var2 = o2Var3.d0;
                                                if (t0Var2 != null) {
                                                    t0Var2.setProgress(1.0f);
                                                }
                                                final int i18 = 0;
                                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: rg.i2
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i172 = i18;
                                                        m2 m2Var42 = m2Var4;
                                                        TLObject tLObject32 = tLObject3;
                                                        o2 o2Var32 = o2Var3;
                                                        o2Var32.getClass();
                                                        switch (i172) {
                                                            case 0:
                                                                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i182 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document = m2Var42.f.document;
                                                                String str = m2Var42.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                notificationCenter.postNotificationNameOnUIThread(i182, bool, tLObject32, document, str, bool);
                                                                o2Var32.h();
                                                                break;
                                                            case 1:
                                                                NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, m2Var42.f.document, m2Var42.l, Boolean.TRUE);
                                                                o2Var32.h();
                                                                break;
                                                            default:
                                                                NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i19 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document2 = m2Var42.f.document;
                                                                String str2 = m2Var42.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                notificationCenter2.postNotificationNameOnUIThread(i19, bool2, tLObject32, document2, str2, bool2);
                                                                o2Var32.h();
                                                                break;
                                                        }
                                                    }
                                                }, 250L);
                                                z11 = true;
                                            } else {
                                                o2Var3.n(tL_error);
                                                o2Var3.h();
                                                z11 = false;
                                            }
                                            Utilities.Callback callback2 = m2Var4.n;
                                            if (callback2 != null) {
                                                callback2.run(Boolean.valueOf(z11));
                                                m2Var4.n = null;
                                                break;
                                            }
                                            break;
                                        default:
                                            final TLObject tLObject4 = tLObject;
                                            boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                            final o2 o2Var4 = o2Var;
                                            final m2 m2Var5 = m2Var2;
                                            if (z15) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                int i19 = i14;
                                                MediaDataController.getInstance(i19).putStickerSet(tL_messages_stickerSet2);
                                                if (!MediaDataController.getInstance(i19).isStickerPackInstalled(tL_messages_stickerSet2.set.id)) {
                                                    MediaDataController.getInstance(i19).toggleStickerSet(null, tLObject4, 2, null, false, false);
                                                }
                                                di.t0 t0Var3 = o2Var4.d0;
                                                if (t0Var3 != null) {
                                                    t0Var3.setProgress(1.0f);
                                                }
                                                final int i20 = 2;
                                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: rg.i2
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i172 = i20;
                                                        m2 m2Var42 = m2Var5;
                                                        TLObject tLObject32 = tLObject4;
                                                        o2 o2Var32 = o2Var4;
                                                        o2Var32.getClass();
                                                        switch (i172) {
                                                            case 0:
                                                                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i182 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document = m2Var42.f.document;
                                                                String str = m2Var42.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                notificationCenter.postNotificationNameOnUIThread(i182, bool, tLObject32, document, str, bool);
                                                                o2Var32.h();
                                                                break;
                                                            case 1:
                                                                NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, m2Var42.f.document, m2Var42.l, Boolean.TRUE);
                                                                o2Var32.h();
                                                                break;
                                                            default:
                                                                NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i192 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document2 = m2Var42.f.document;
                                                                String str2 = m2Var42.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                notificationCenter2.postNotificationNameOnUIThread(i192, bool2, tLObject32, document2, str2, bool2);
                                                                o2Var32.h();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                                z12 = true;
                                            } else {
                                                o2Var4.n(tL_error);
                                                o2Var4.h();
                                                z12 = false;
                                            }
                                            Utilities.Callback callback3 = m2Var5.n;
                                            if (callback3 != null) {
                                                callback3.run(Boolean.valueOf(z12));
                                                m2Var5.n = null;
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                        case 1:
                            final int i15 = 1;
                            final o2 o2Var2 = this.b;
                            final int i16 = i10;
                            final m2 m2Var3 = m2Var;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: rg.h2
                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean z10;
                                    boolean z11;
                                    boolean z12;
                                    switch (i15) {
                                        case 0:
                                            final TLObject tLObject2 = tLObject;
                                            boolean z13 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                            final o2 o2Var22 = o2Var2;
                                            final m2 m2Var32 = m2Var3;
                                            if (z13) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                int i152 = i16;
                                                MediaDataController.getInstance(i152).putStickerSet(tL_messages_stickerSet);
                                                if (!MediaDataController.getInstance(i152).isStickerPackInstalled(tL_messages_stickerSet.set.id)) {
                                                    MediaDataController.getInstance(i152).toggleStickerSet(null, tLObject2, 2, null, false, false);
                                                }
                                                di.t0 t0Var = o2Var22.d0;
                                                if (t0Var != null) {
                                                    t0Var.setProgress(1.0f);
                                                }
                                                final int i162 = 1;
                                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: rg.i2
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i172 = i162;
                                                        m2 m2Var42 = m2Var32;
                                                        TLObject tLObject32 = tLObject2;
                                                        o2 o2Var32 = o2Var22;
                                                        o2Var32.getClass();
                                                        switch (i172) {
                                                            case 0:
                                                                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i182 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document = m2Var42.f.document;
                                                                String str = m2Var42.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                notificationCenter.postNotificationNameOnUIThread(i182, bool, tLObject32, document, str, bool);
                                                                o2Var32.h();
                                                                break;
                                                            case 1:
                                                                NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, m2Var42.f.document, m2Var42.l, Boolean.TRUE);
                                                                o2Var32.h();
                                                                break;
                                                            default:
                                                                NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i192 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document2 = m2Var42.f.document;
                                                                String str2 = m2Var42.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                notificationCenter2.postNotificationNameOnUIThread(i192, bool2, tLObject32, document2, str2, bool2);
                                                                o2Var32.h();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                                z10 = true;
                                            } else {
                                                o2Var22.n(tL_error);
                                                o2Var22.h();
                                                z10 = false;
                                            }
                                            Utilities.Callback callback = m2Var32.n;
                                            if (callback != null) {
                                                callback.run(Boolean.valueOf(z10));
                                                m2Var32.n = null;
                                                break;
                                            }
                                            break;
                                        case 1:
                                            final TLObject tLObject3 = tLObject;
                                            boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                            final o2 o2Var3 = o2Var2;
                                            final m2 m2Var4 = m2Var3;
                                            if (z14) {
                                                int i17 = i16;
                                                MediaDataController.getInstance(i17).putStickerSet((TLRPC.TL_messages_stickerSet) tLObject3);
                                                MediaDataController.getInstance(i17).toggleStickerSet(null, tLObject3, 2, null, false, false);
                                                di.t0 t0Var2 = o2Var3.d0;
                                                if (t0Var2 != null) {
                                                    t0Var2.setProgress(1.0f);
                                                }
                                                final int i18 = 0;
                                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: rg.i2
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i172 = i18;
                                                        m2 m2Var42 = m2Var4;
                                                        TLObject tLObject32 = tLObject3;
                                                        o2 o2Var32 = o2Var3;
                                                        o2Var32.getClass();
                                                        switch (i172) {
                                                            case 0:
                                                                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i182 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document = m2Var42.f.document;
                                                                String str = m2Var42.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                notificationCenter.postNotificationNameOnUIThread(i182, bool, tLObject32, document, str, bool);
                                                                o2Var32.h();
                                                                break;
                                                            case 1:
                                                                NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, m2Var42.f.document, m2Var42.l, Boolean.TRUE);
                                                                o2Var32.h();
                                                                break;
                                                            default:
                                                                NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i192 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document2 = m2Var42.f.document;
                                                                String str2 = m2Var42.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                notificationCenter2.postNotificationNameOnUIThread(i192, bool2, tLObject32, document2, str2, bool2);
                                                                o2Var32.h();
                                                                break;
                                                        }
                                                    }
                                                }, 250L);
                                                z11 = true;
                                            } else {
                                                o2Var3.n(tL_error);
                                                o2Var3.h();
                                                z11 = false;
                                            }
                                            Utilities.Callback callback2 = m2Var4.n;
                                            if (callback2 != null) {
                                                callback2.run(Boolean.valueOf(z11));
                                                m2Var4.n = null;
                                                break;
                                            }
                                            break;
                                        default:
                                            final TLObject tLObject4 = tLObject;
                                            boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                            final o2 o2Var4 = o2Var2;
                                            final m2 m2Var5 = m2Var3;
                                            if (z15) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                int i19 = i16;
                                                MediaDataController.getInstance(i19).putStickerSet(tL_messages_stickerSet2);
                                                if (!MediaDataController.getInstance(i19).isStickerPackInstalled(tL_messages_stickerSet2.set.id)) {
                                                    MediaDataController.getInstance(i19).toggleStickerSet(null, tLObject4, 2, null, false, false);
                                                }
                                                di.t0 t0Var3 = o2Var4.d0;
                                                if (t0Var3 != null) {
                                                    t0Var3.setProgress(1.0f);
                                                }
                                                final int i20 = 2;
                                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: rg.i2
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i172 = i20;
                                                        m2 m2Var42 = m2Var5;
                                                        TLObject tLObject32 = tLObject4;
                                                        o2 o2Var32 = o2Var4;
                                                        o2Var32.getClass();
                                                        switch (i172) {
                                                            case 0:
                                                                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i182 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document = m2Var42.f.document;
                                                                String str = m2Var42.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                notificationCenter.postNotificationNameOnUIThread(i182, bool, tLObject32, document, str, bool);
                                                                o2Var32.h();
                                                                break;
                                                            case 1:
                                                                NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, m2Var42.f.document, m2Var42.l, Boolean.TRUE);
                                                                o2Var32.h();
                                                                break;
                                                            default:
                                                                NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i192 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document2 = m2Var42.f.document;
                                                                String str2 = m2Var42.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                notificationCenter2.postNotificationNameOnUIThread(i192, bool2, tLObject32, document2, str2, bool2);
                                                                o2Var32.h();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                                z12 = true;
                                            } else {
                                                o2Var4.n(tL_error);
                                                o2Var4.h();
                                                z12 = false;
                                            }
                                            Utilities.Callback callback3 = m2Var5.n;
                                            if (callback3 != null) {
                                                callback3.run(Boolean.valueOf(z12));
                                                m2Var5.n = null;
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                        default:
                            final int i17 = 2;
                            final o2 o2Var3 = this.b;
                            final int i18 = i10;
                            final m2 m2Var4 = m2Var;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: rg.h2
                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean z10;
                                    boolean z11;
                                    boolean z12;
                                    switch (i17) {
                                        case 0:
                                            final TLObject tLObject2 = tLObject;
                                            boolean z13 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                            final o2 o2Var22 = o2Var3;
                                            final m2 m2Var32 = m2Var4;
                                            if (z13) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                int i152 = i18;
                                                MediaDataController.getInstance(i152).putStickerSet(tL_messages_stickerSet);
                                                if (!MediaDataController.getInstance(i152).isStickerPackInstalled(tL_messages_stickerSet.set.id)) {
                                                    MediaDataController.getInstance(i152).toggleStickerSet(null, tLObject2, 2, null, false, false);
                                                }
                                                di.t0 t0Var = o2Var22.d0;
                                                if (t0Var != null) {
                                                    t0Var.setProgress(1.0f);
                                                }
                                                final int i162 = 1;
                                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: rg.i2
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i172 = i162;
                                                        m2 m2Var42 = m2Var32;
                                                        TLObject tLObject32 = tLObject2;
                                                        o2 o2Var32 = o2Var22;
                                                        o2Var32.getClass();
                                                        switch (i172) {
                                                            case 0:
                                                                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i182 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document = m2Var42.f.document;
                                                                String str = m2Var42.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                notificationCenter.postNotificationNameOnUIThread(i182, bool, tLObject32, document, str, bool);
                                                                o2Var32.h();
                                                                break;
                                                            case 1:
                                                                NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, m2Var42.f.document, m2Var42.l, Boolean.TRUE);
                                                                o2Var32.h();
                                                                break;
                                                            default:
                                                                NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i192 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document2 = m2Var42.f.document;
                                                                String str2 = m2Var42.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                notificationCenter2.postNotificationNameOnUIThread(i192, bool2, tLObject32, document2, str2, bool2);
                                                                o2Var32.h();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                                z10 = true;
                                            } else {
                                                o2Var22.n(tL_error);
                                                o2Var22.h();
                                                z10 = false;
                                            }
                                            Utilities.Callback callback = m2Var32.n;
                                            if (callback != null) {
                                                callback.run(Boolean.valueOf(z10));
                                                m2Var32.n = null;
                                                break;
                                            }
                                            break;
                                        case 1:
                                            final TLObject tLObject3 = tLObject;
                                            boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                            final o2 o2Var32 = o2Var3;
                                            final m2 m2Var42 = m2Var4;
                                            if (z14) {
                                                int i172 = i18;
                                                MediaDataController.getInstance(i172).putStickerSet((TLRPC.TL_messages_stickerSet) tLObject3);
                                                MediaDataController.getInstance(i172).toggleStickerSet(null, tLObject3, 2, null, false, false);
                                                di.t0 t0Var2 = o2Var32.d0;
                                                if (t0Var2 != null) {
                                                    t0Var2.setProgress(1.0f);
                                                }
                                                final int i182 = 0;
                                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: rg.i2
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i1722 = i182;
                                                        m2 m2Var422 = m2Var42;
                                                        TLObject tLObject32 = tLObject3;
                                                        o2 o2Var322 = o2Var32;
                                                        o2Var322.getClass();
                                                        switch (i1722) {
                                                            case 0:
                                                                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i1822 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document = m2Var422.f.document;
                                                                String str = m2Var422.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                notificationCenter.postNotificationNameOnUIThread(i1822, bool, tLObject32, document, str, bool);
                                                                o2Var322.h();
                                                                break;
                                                            case 1:
                                                                NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, m2Var422.f.document, m2Var422.l, Boolean.TRUE);
                                                                o2Var322.h();
                                                                break;
                                                            default:
                                                                NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i192 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document2 = m2Var422.f.document;
                                                                String str2 = m2Var422.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                notificationCenter2.postNotificationNameOnUIThread(i192, bool2, tLObject32, document2, str2, bool2);
                                                                o2Var322.h();
                                                                break;
                                                        }
                                                    }
                                                }, 250L);
                                                z11 = true;
                                            } else {
                                                o2Var32.n(tL_error);
                                                o2Var32.h();
                                                z11 = false;
                                            }
                                            Utilities.Callback callback2 = m2Var42.n;
                                            if (callback2 != null) {
                                                callback2.run(Boolean.valueOf(z11));
                                                m2Var42.n = null;
                                                break;
                                            }
                                            break;
                                        default:
                                            final TLObject tLObject4 = tLObject;
                                            boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                            final o2 o2Var4 = o2Var3;
                                            final m2 m2Var5 = m2Var4;
                                            if (z15) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                int i19 = i18;
                                                MediaDataController.getInstance(i19).putStickerSet(tL_messages_stickerSet2);
                                                if (!MediaDataController.getInstance(i19).isStickerPackInstalled(tL_messages_stickerSet2.set.id)) {
                                                    MediaDataController.getInstance(i19).toggleStickerSet(null, tLObject4, 2, null, false, false);
                                                }
                                                di.t0 t0Var3 = o2Var4.d0;
                                                if (t0Var3 != null) {
                                                    t0Var3.setProgress(1.0f);
                                                }
                                                final int i20 = 2;
                                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: rg.i2
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i1722 = i20;
                                                        m2 m2Var422 = m2Var5;
                                                        TLObject tLObject32 = tLObject4;
                                                        o2 o2Var322 = o2Var4;
                                                        o2Var322.getClass();
                                                        switch (i1722) {
                                                            case 0:
                                                                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i1822 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document = m2Var422.f.document;
                                                                String str = m2Var422.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                notificationCenter.postNotificationNameOnUIThread(i1822, bool, tLObject32, document, str, bool);
                                                                o2Var322.h();
                                                                break;
                                                            case 1:
                                                                NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, m2Var422.f.document, m2Var422.l, Boolean.TRUE);
                                                                o2Var322.h();
                                                                break;
                                                            default:
                                                                NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i192 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document2 = m2Var422.f.document;
                                                                String str2 = m2Var422.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                notificationCenter2.postNotificationNameOnUIThread(i192, bool2, tLObject32, document2, str2, bool2);
                                                                o2Var322.h();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                                z12 = true;
                                            } else {
                                                o2Var4.n(tL_error);
                                                o2Var4.h();
                                                z12 = false;
                                            }
                                            Utilities.Callback callback3 = m2Var5.n;
                                            if (callback3 != null) {
                                                callback3.run(Boolean.valueOf(z12));
                                                m2Var5.n = null;
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
        if (m2Var.d != null) {
            TLRPC.TL_stickers_createStickerSet tL_stickers_createStickerSet = new TLRPC.TL_stickers_createStickerSet();
            tL_stickers_createStickerSet.user_id = new TLRPC.TL_inputUserSelf();
            tL_stickers_createStickerSet.title = m2Var.d.toString();
            tL_stickers_createStickerSet.short_name = "";
            tL_stickers_createStickerSet.stickers.add(m2Var.e);
            ConnectionsManager.getInstance(i10).sendRequest(tL_stickers_createStickerSet, new RequestDelegate(this) { // from class: rg.g2
                public final /* synthetic */ o2 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (i11) {
                        case 0:
                            final int i13 = 0;
                            final o2 o2Var = this.b;
                            final int i14 = i10;
                            final m2 m2Var2 = m2Var;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: rg.h2
                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean z10;
                                    boolean z11;
                                    boolean z12;
                                    switch (i13) {
                                        case 0:
                                            final TLObject tLObject2 = tLObject;
                                            boolean z13 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                            final o2 o2Var22 = o2Var;
                                            final m2 m2Var32 = m2Var2;
                                            if (z13) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                int i152 = i14;
                                                MediaDataController.getInstance(i152).putStickerSet(tL_messages_stickerSet);
                                                if (!MediaDataController.getInstance(i152).isStickerPackInstalled(tL_messages_stickerSet.set.id)) {
                                                    MediaDataController.getInstance(i152).toggleStickerSet(null, tLObject2, 2, null, false, false);
                                                }
                                                di.t0 t0Var = o2Var22.d0;
                                                if (t0Var != null) {
                                                    t0Var.setProgress(1.0f);
                                                }
                                                final int i162 = 1;
                                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: rg.i2
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i1722 = i162;
                                                        m2 m2Var422 = m2Var32;
                                                        TLObject tLObject32 = tLObject2;
                                                        o2 o2Var322 = o2Var22;
                                                        o2Var322.getClass();
                                                        switch (i1722) {
                                                            case 0:
                                                                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i1822 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document = m2Var422.f.document;
                                                                String str = m2Var422.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                notificationCenter.postNotificationNameOnUIThread(i1822, bool, tLObject32, document, str, bool);
                                                                o2Var322.h();
                                                                break;
                                                            case 1:
                                                                NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, m2Var422.f.document, m2Var422.l, Boolean.TRUE);
                                                                o2Var322.h();
                                                                break;
                                                            default:
                                                                NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i192 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document2 = m2Var422.f.document;
                                                                String str2 = m2Var422.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                notificationCenter2.postNotificationNameOnUIThread(i192, bool2, tLObject32, document2, str2, bool2);
                                                                o2Var322.h();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                                z10 = true;
                                            } else {
                                                o2Var22.n(tL_error);
                                                o2Var22.h();
                                                z10 = false;
                                            }
                                            Utilities.Callback callback = m2Var32.n;
                                            if (callback != null) {
                                                callback.run(Boolean.valueOf(z10));
                                                m2Var32.n = null;
                                                break;
                                            }
                                            break;
                                        case 1:
                                            final TLObject tLObject3 = tLObject;
                                            boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                            final o2 o2Var32 = o2Var;
                                            final m2 m2Var42 = m2Var2;
                                            if (z14) {
                                                int i172 = i14;
                                                MediaDataController.getInstance(i172).putStickerSet((TLRPC.TL_messages_stickerSet) tLObject3);
                                                MediaDataController.getInstance(i172).toggleStickerSet(null, tLObject3, 2, null, false, false);
                                                di.t0 t0Var2 = o2Var32.d0;
                                                if (t0Var2 != null) {
                                                    t0Var2.setProgress(1.0f);
                                                }
                                                final int i182 = 0;
                                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: rg.i2
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i1722 = i182;
                                                        m2 m2Var422 = m2Var42;
                                                        TLObject tLObject32 = tLObject3;
                                                        o2 o2Var322 = o2Var32;
                                                        o2Var322.getClass();
                                                        switch (i1722) {
                                                            case 0:
                                                                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i1822 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document = m2Var422.f.document;
                                                                String str = m2Var422.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                notificationCenter.postNotificationNameOnUIThread(i1822, bool, tLObject32, document, str, bool);
                                                                o2Var322.h();
                                                                break;
                                                            case 1:
                                                                NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, m2Var422.f.document, m2Var422.l, Boolean.TRUE);
                                                                o2Var322.h();
                                                                break;
                                                            default:
                                                                NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i192 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document2 = m2Var422.f.document;
                                                                String str2 = m2Var422.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                notificationCenter2.postNotificationNameOnUIThread(i192, bool2, tLObject32, document2, str2, bool2);
                                                                o2Var322.h();
                                                                break;
                                                        }
                                                    }
                                                }, 250L);
                                                z11 = true;
                                            } else {
                                                o2Var32.n(tL_error);
                                                o2Var32.h();
                                                z11 = false;
                                            }
                                            Utilities.Callback callback2 = m2Var42.n;
                                            if (callback2 != null) {
                                                callback2.run(Boolean.valueOf(z11));
                                                m2Var42.n = null;
                                                break;
                                            }
                                            break;
                                        default:
                                            final TLObject tLObject4 = tLObject;
                                            boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                            final o2 o2Var4 = o2Var;
                                            final m2 m2Var5 = m2Var2;
                                            if (z15) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                int i19 = i14;
                                                MediaDataController.getInstance(i19).putStickerSet(tL_messages_stickerSet2);
                                                if (!MediaDataController.getInstance(i19).isStickerPackInstalled(tL_messages_stickerSet2.set.id)) {
                                                    MediaDataController.getInstance(i19).toggleStickerSet(null, tLObject4, 2, null, false, false);
                                                }
                                                di.t0 t0Var3 = o2Var4.d0;
                                                if (t0Var3 != null) {
                                                    t0Var3.setProgress(1.0f);
                                                }
                                                final int i20 = 2;
                                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: rg.i2
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i1722 = i20;
                                                        m2 m2Var422 = m2Var5;
                                                        TLObject tLObject32 = tLObject4;
                                                        o2 o2Var322 = o2Var4;
                                                        o2Var322.getClass();
                                                        switch (i1722) {
                                                            case 0:
                                                                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i1822 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document = m2Var422.f.document;
                                                                String str = m2Var422.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                notificationCenter.postNotificationNameOnUIThread(i1822, bool, tLObject32, document, str, bool);
                                                                o2Var322.h();
                                                                break;
                                                            case 1:
                                                                NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, m2Var422.f.document, m2Var422.l, Boolean.TRUE);
                                                                o2Var322.h();
                                                                break;
                                                            default:
                                                                NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i192 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document2 = m2Var422.f.document;
                                                                String str2 = m2Var422.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                notificationCenter2.postNotificationNameOnUIThread(i192, bool2, tLObject32, document2, str2, bool2);
                                                                o2Var322.h();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                                z12 = true;
                                            } else {
                                                o2Var4.n(tL_error);
                                                o2Var4.h();
                                                z12 = false;
                                            }
                                            Utilities.Callback callback3 = m2Var5.n;
                                            if (callback3 != null) {
                                                callback3.run(Boolean.valueOf(z12));
                                                m2Var5.n = null;
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                        case 1:
                            final int i15 = 1;
                            final o2 o2Var2 = this.b;
                            final int i16 = i10;
                            final m2 m2Var3 = m2Var;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: rg.h2
                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean z10;
                                    boolean z11;
                                    boolean z12;
                                    switch (i15) {
                                        case 0:
                                            final TLObject tLObject2 = tLObject;
                                            boolean z13 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                            final o2 o2Var22 = o2Var2;
                                            final m2 m2Var32 = m2Var3;
                                            if (z13) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                int i152 = i16;
                                                MediaDataController.getInstance(i152).putStickerSet(tL_messages_stickerSet);
                                                if (!MediaDataController.getInstance(i152).isStickerPackInstalled(tL_messages_stickerSet.set.id)) {
                                                    MediaDataController.getInstance(i152).toggleStickerSet(null, tLObject2, 2, null, false, false);
                                                }
                                                di.t0 t0Var = o2Var22.d0;
                                                if (t0Var != null) {
                                                    t0Var.setProgress(1.0f);
                                                }
                                                final int i162 = 1;
                                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: rg.i2
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i1722 = i162;
                                                        m2 m2Var422 = m2Var32;
                                                        TLObject tLObject32 = tLObject2;
                                                        o2 o2Var322 = o2Var22;
                                                        o2Var322.getClass();
                                                        switch (i1722) {
                                                            case 0:
                                                                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i1822 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document = m2Var422.f.document;
                                                                String str = m2Var422.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                notificationCenter.postNotificationNameOnUIThread(i1822, bool, tLObject32, document, str, bool);
                                                                o2Var322.h();
                                                                break;
                                                            case 1:
                                                                NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, m2Var422.f.document, m2Var422.l, Boolean.TRUE);
                                                                o2Var322.h();
                                                                break;
                                                            default:
                                                                NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i192 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document2 = m2Var422.f.document;
                                                                String str2 = m2Var422.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                notificationCenter2.postNotificationNameOnUIThread(i192, bool2, tLObject32, document2, str2, bool2);
                                                                o2Var322.h();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                                z10 = true;
                                            } else {
                                                o2Var22.n(tL_error);
                                                o2Var22.h();
                                                z10 = false;
                                            }
                                            Utilities.Callback callback = m2Var32.n;
                                            if (callback != null) {
                                                callback.run(Boolean.valueOf(z10));
                                                m2Var32.n = null;
                                                break;
                                            }
                                            break;
                                        case 1:
                                            final TLObject tLObject3 = tLObject;
                                            boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                            final o2 o2Var32 = o2Var2;
                                            final m2 m2Var42 = m2Var3;
                                            if (z14) {
                                                int i172 = i16;
                                                MediaDataController.getInstance(i172).putStickerSet((TLRPC.TL_messages_stickerSet) tLObject3);
                                                MediaDataController.getInstance(i172).toggleStickerSet(null, tLObject3, 2, null, false, false);
                                                di.t0 t0Var2 = o2Var32.d0;
                                                if (t0Var2 != null) {
                                                    t0Var2.setProgress(1.0f);
                                                }
                                                final int i182 = 0;
                                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: rg.i2
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i1722 = i182;
                                                        m2 m2Var422 = m2Var42;
                                                        TLObject tLObject32 = tLObject3;
                                                        o2 o2Var322 = o2Var32;
                                                        o2Var322.getClass();
                                                        switch (i1722) {
                                                            case 0:
                                                                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i1822 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document = m2Var422.f.document;
                                                                String str = m2Var422.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                notificationCenter.postNotificationNameOnUIThread(i1822, bool, tLObject32, document, str, bool);
                                                                o2Var322.h();
                                                                break;
                                                            case 1:
                                                                NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, m2Var422.f.document, m2Var422.l, Boolean.TRUE);
                                                                o2Var322.h();
                                                                break;
                                                            default:
                                                                NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i192 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document2 = m2Var422.f.document;
                                                                String str2 = m2Var422.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                notificationCenter2.postNotificationNameOnUIThread(i192, bool2, tLObject32, document2, str2, bool2);
                                                                o2Var322.h();
                                                                break;
                                                        }
                                                    }
                                                }, 250L);
                                                z11 = true;
                                            } else {
                                                o2Var32.n(tL_error);
                                                o2Var32.h();
                                                z11 = false;
                                            }
                                            Utilities.Callback callback2 = m2Var42.n;
                                            if (callback2 != null) {
                                                callback2.run(Boolean.valueOf(z11));
                                                m2Var42.n = null;
                                                break;
                                            }
                                            break;
                                        default:
                                            final TLObject tLObject4 = tLObject;
                                            boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                            final o2 o2Var4 = o2Var2;
                                            final m2 m2Var5 = m2Var3;
                                            if (z15) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                int i19 = i16;
                                                MediaDataController.getInstance(i19).putStickerSet(tL_messages_stickerSet2);
                                                if (!MediaDataController.getInstance(i19).isStickerPackInstalled(tL_messages_stickerSet2.set.id)) {
                                                    MediaDataController.getInstance(i19).toggleStickerSet(null, tLObject4, 2, null, false, false);
                                                }
                                                di.t0 t0Var3 = o2Var4.d0;
                                                if (t0Var3 != null) {
                                                    t0Var3.setProgress(1.0f);
                                                }
                                                final int i20 = 2;
                                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: rg.i2
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i1722 = i20;
                                                        m2 m2Var422 = m2Var5;
                                                        TLObject tLObject32 = tLObject4;
                                                        o2 o2Var322 = o2Var4;
                                                        o2Var322.getClass();
                                                        switch (i1722) {
                                                            case 0:
                                                                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i1822 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document = m2Var422.f.document;
                                                                String str = m2Var422.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                notificationCenter.postNotificationNameOnUIThread(i1822, bool, tLObject32, document, str, bool);
                                                                o2Var322.h();
                                                                break;
                                                            case 1:
                                                                NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, m2Var422.f.document, m2Var422.l, Boolean.TRUE);
                                                                o2Var322.h();
                                                                break;
                                                            default:
                                                                NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i192 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document2 = m2Var422.f.document;
                                                                String str2 = m2Var422.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                notificationCenter2.postNotificationNameOnUIThread(i192, bool2, tLObject32, document2, str2, bool2);
                                                                o2Var322.h();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                                z12 = true;
                                            } else {
                                                o2Var4.n(tL_error);
                                                o2Var4.h();
                                                z12 = false;
                                            }
                                            Utilities.Callback callback3 = m2Var5.n;
                                            if (callback3 != null) {
                                                callback3.run(Boolean.valueOf(z12));
                                                m2Var5.n = null;
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                        default:
                            final int i17 = 2;
                            final o2 o2Var3 = this.b;
                            final int i18 = i10;
                            final m2 m2Var4 = m2Var;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: rg.h2
                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean z10;
                                    boolean z11;
                                    boolean z12;
                                    switch (i17) {
                                        case 0:
                                            final TLObject tLObject2 = tLObject;
                                            boolean z13 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                            final o2 o2Var22 = o2Var3;
                                            final m2 m2Var32 = m2Var4;
                                            if (z13) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                int i152 = i18;
                                                MediaDataController.getInstance(i152).putStickerSet(tL_messages_stickerSet);
                                                if (!MediaDataController.getInstance(i152).isStickerPackInstalled(tL_messages_stickerSet.set.id)) {
                                                    MediaDataController.getInstance(i152).toggleStickerSet(null, tLObject2, 2, null, false, false);
                                                }
                                                di.t0 t0Var = o2Var22.d0;
                                                if (t0Var != null) {
                                                    t0Var.setProgress(1.0f);
                                                }
                                                final int i162 = 1;
                                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: rg.i2
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i1722 = i162;
                                                        m2 m2Var422 = m2Var32;
                                                        TLObject tLObject32 = tLObject2;
                                                        o2 o2Var322 = o2Var22;
                                                        o2Var322.getClass();
                                                        switch (i1722) {
                                                            case 0:
                                                                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i1822 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document = m2Var422.f.document;
                                                                String str = m2Var422.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                notificationCenter.postNotificationNameOnUIThread(i1822, bool, tLObject32, document, str, bool);
                                                                o2Var322.h();
                                                                break;
                                                            case 1:
                                                                NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, m2Var422.f.document, m2Var422.l, Boolean.TRUE);
                                                                o2Var322.h();
                                                                break;
                                                            default:
                                                                NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i192 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document2 = m2Var422.f.document;
                                                                String str2 = m2Var422.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                notificationCenter2.postNotificationNameOnUIThread(i192, bool2, tLObject32, document2, str2, bool2);
                                                                o2Var322.h();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                                z10 = true;
                                            } else {
                                                o2Var22.n(tL_error);
                                                o2Var22.h();
                                                z10 = false;
                                            }
                                            Utilities.Callback callback = m2Var32.n;
                                            if (callback != null) {
                                                callback.run(Boolean.valueOf(z10));
                                                m2Var32.n = null;
                                                break;
                                            }
                                            break;
                                        case 1:
                                            final TLObject tLObject3 = tLObject;
                                            boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                            final o2 o2Var32 = o2Var3;
                                            final m2 m2Var42 = m2Var4;
                                            if (z14) {
                                                int i172 = i18;
                                                MediaDataController.getInstance(i172).putStickerSet((TLRPC.TL_messages_stickerSet) tLObject3);
                                                MediaDataController.getInstance(i172).toggleStickerSet(null, tLObject3, 2, null, false, false);
                                                di.t0 t0Var2 = o2Var32.d0;
                                                if (t0Var2 != null) {
                                                    t0Var2.setProgress(1.0f);
                                                }
                                                final int i182 = 0;
                                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: rg.i2
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i1722 = i182;
                                                        m2 m2Var422 = m2Var42;
                                                        TLObject tLObject32 = tLObject3;
                                                        o2 o2Var322 = o2Var32;
                                                        o2Var322.getClass();
                                                        switch (i1722) {
                                                            case 0:
                                                                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i1822 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document = m2Var422.f.document;
                                                                String str = m2Var422.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                notificationCenter.postNotificationNameOnUIThread(i1822, bool, tLObject32, document, str, bool);
                                                                o2Var322.h();
                                                                break;
                                                            case 1:
                                                                NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, m2Var422.f.document, m2Var422.l, Boolean.TRUE);
                                                                o2Var322.h();
                                                                break;
                                                            default:
                                                                NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i192 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document2 = m2Var422.f.document;
                                                                String str2 = m2Var422.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                notificationCenter2.postNotificationNameOnUIThread(i192, bool2, tLObject32, document2, str2, bool2);
                                                                o2Var322.h();
                                                                break;
                                                        }
                                                    }
                                                }, 250L);
                                                z11 = true;
                                            } else {
                                                o2Var32.n(tL_error);
                                                o2Var32.h();
                                                z11 = false;
                                            }
                                            Utilities.Callback callback2 = m2Var42.n;
                                            if (callback2 != null) {
                                                callback2.run(Boolean.valueOf(z11));
                                                m2Var42.n = null;
                                                break;
                                            }
                                            break;
                                        default:
                                            final TLObject tLObject4 = tLObject;
                                            boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                            final o2 o2Var4 = o2Var3;
                                            final m2 m2Var5 = m2Var4;
                                            if (z15) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                int i19 = i18;
                                                MediaDataController.getInstance(i19).putStickerSet(tL_messages_stickerSet2);
                                                if (!MediaDataController.getInstance(i19).isStickerPackInstalled(tL_messages_stickerSet2.set.id)) {
                                                    MediaDataController.getInstance(i19).toggleStickerSet(null, tLObject4, 2, null, false, false);
                                                }
                                                di.t0 t0Var3 = o2Var4.d0;
                                                if (t0Var3 != null) {
                                                    t0Var3.setProgress(1.0f);
                                                }
                                                final int i20 = 2;
                                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: rg.i2
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i1722 = i20;
                                                        m2 m2Var422 = m2Var5;
                                                        TLObject tLObject32 = tLObject4;
                                                        o2 o2Var322 = o2Var4;
                                                        o2Var322.getClass();
                                                        switch (i1722) {
                                                            case 0:
                                                                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i1822 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document = m2Var422.f.document;
                                                                String str = m2Var422.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                notificationCenter.postNotificationNameOnUIThread(i1822, bool, tLObject32, document, str, bool);
                                                                o2Var322.h();
                                                                break;
                                                            case 1:
                                                                NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, m2Var422.f.document, m2Var422.l, Boolean.TRUE);
                                                                o2Var322.h();
                                                                break;
                                                            default:
                                                                NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i192 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document2 = m2Var422.f.document;
                                                                String str2 = m2Var422.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                notificationCenter2.postNotificationNameOnUIThread(i192, bool2, tLObject32, document2, str2, bool2);
                                                                o2Var322.h();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                                z12 = true;
                                            } else {
                                                o2Var4.n(tL_error);
                                                o2Var4.h();
                                                z12 = false;
                                            }
                                            Utilities.Callback callback3 = m2Var5.n;
                                            if (callback3 != null) {
                                                callback3.run(Boolean.valueOf(z12));
                                                m2Var5.n = null;
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
        if (m2Var.h) {
            h();
            NotificationCenter.getInstance(i10).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE);
            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.b(m2Var, 21), 350L);
            Utilities.Callback callback = m2Var.n;
            if (callback != null) {
                callback.run(Boolean.TRUE);
                return;
            }
            return;
        }
        final int i13 = 2;
        if (m2Var.i == 0) {
            if (m2Var.j != null) {
                TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet = new TLRPC.TL_stickers_addStickerToSet();
                tL_stickers_addStickerToSet.stickerset = MediaDataController.getInputStickerSet(m2Var.j);
                tL_stickers_addStickerToSet.sticker = m2Var.e;
                ConnectionsManager.getInstance(i10).sendRequest(tL_stickers_addStickerToSet, new RequestDelegate(this) { // from class: rg.g2
                    public final /* synthetic */ o2 b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (i13) {
                            case 0:
                                final int i132 = 0;
                                final o2 o2Var = this.b;
                                final int i14 = i10;
                                final m2 m2Var2 = m2Var;
                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: rg.h2
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        boolean z10;
                                        boolean z11;
                                        boolean z12;
                                        switch (i132) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                boolean z13 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                                final o2 o2Var22 = o2Var;
                                                final m2 m2Var32 = m2Var2;
                                                if (z13) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i152 = i14;
                                                    MediaDataController.getInstance(i152).putStickerSet(tL_messages_stickerSet);
                                                    if (!MediaDataController.getInstance(i152).isStickerPackInstalled(tL_messages_stickerSet.set.id)) {
                                                        MediaDataController.getInstance(i152).toggleStickerSet(null, tLObject2, 2, null, false, false);
                                                    }
                                                    di.t0 t0Var = o2Var22.d0;
                                                    if (t0Var != null) {
                                                        t0Var.setProgress(1.0f);
                                                    }
                                                    final int i162 = 1;
                                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: rg.i2
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            int i1722 = i162;
                                                            m2 m2Var422 = m2Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            o2 o2Var322 = o2Var22;
                                                            o2Var322.getClass();
                                                            switch (i1722) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i1822 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = m2Var422.f.document;
                                                                    String str = m2Var422.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i1822, bool, tLObject32, document, str, bool);
                                                                    o2Var322.h();
                                                                    break;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, m2Var422.f.document, m2Var422.l, Boolean.TRUE);
                                                                    o2Var322.h();
                                                                    break;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i192 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = m2Var422.f.document;
                                                                    String str2 = m2Var422.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i192, bool2, tLObject32, document2, str2, bool2);
                                                                    o2Var322.h();
                                                                    break;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z10 = true;
                                                } else {
                                                    o2Var22.n(tL_error);
                                                    o2Var22.h();
                                                    z10 = false;
                                                }
                                                Utilities.Callback callback2 = m2Var32.n;
                                                if (callback2 != null) {
                                                    callback2.run(Boolean.valueOf(z10));
                                                    m2Var32.n = null;
                                                    break;
                                                }
                                                break;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final o2 o2Var32 = o2Var;
                                                final m2 m2Var42 = m2Var2;
                                                if (z14) {
                                                    int i172 = i14;
                                                    MediaDataController.getInstance(i172).putStickerSet((TLRPC.TL_messages_stickerSet) tLObject3);
                                                    MediaDataController.getInstance(i172).toggleStickerSet(null, tLObject3, 2, null, false, false);
                                                    di.t0 t0Var2 = o2Var32.d0;
                                                    if (t0Var2 != null) {
                                                        t0Var2.setProgress(1.0f);
                                                    }
                                                    final int i182 = 0;
                                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: rg.i2
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            int i1722 = i182;
                                                            m2 m2Var422 = m2Var42;
                                                            TLObject tLObject32 = tLObject3;
                                                            o2 o2Var322 = o2Var32;
                                                            o2Var322.getClass();
                                                            switch (i1722) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i1822 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = m2Var422.f.document;
                                                                    String str = m2Var422.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i1822, bool, tLObject32, document, str, bool);
                                                                    o2Var322.h();
                                                                    break;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, m2Var422.f.document, m2Var422.l, Boolean.TRUE);
                                                                    o2Var322.h();
                                                                    break;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i192 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = m2Var422.f.document;
                                                                    String str2 = m2Var422.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i192, bool2, tLObject32, document2, str2, bool2);
                                                                    o2Var322.h();
                                                                    break;
                                                            }
                                                        }
                                                    }, 250L);
                                                    z11 = true;
                                                } else {
                                                    o2Var32.n(tL_error);
                                                    o2Var32.h();
                                                    z11 = false;
                                                }
                                                Utilities.Callback callback22 = m2Var42.n;
                                                if (callback22 != null) {
                                                    callback22.run(Boolean.valueOf(z11));
                                                    m2Var42.n = null;
                                                    break;
                                                }
                                                break;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final o2 o2Var4 = o2Var;
                                                final m2 m2Var5 = m2Var2;
                                                if (z15) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i19 = i14;
                                                    MediaDataController.getInstance(i19).putStickerSet(tL_messages_stickerSet2);
                                                    if (!MediaDataController.getInstance(i19).isStickerPackInstalled(tL_messages_stickerSet2.set.id)) {
                                                        MediaDataController.getInstance(i19).toggleStickerSet(null, tLObject4, 2, null, false, false);
                                                    }
                                                    di.t0 t0Var3 = o2Var4.d0;
                                                    if (t0Var3 != null) {
                                                        t0Var3.setProgress(1.0f);
                                                    }
                                                    final int i20 = 2;
                                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: rg.i2
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            int i1722 = i20;
                                                            m2 m2Var422 = m2Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            o2 o2Var322 = o2Var4;
                                                            o2Var322.getClass();
                                                            switch (i1722) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i1822 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = m2Var422.f.document;
                                                                    String str = m2Var422.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i1822, bool, tLObject32, document, str, bool);
                                                                    o2Var322.h();
                                                                    break;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, m2Var422.f.document, m2Var422.l, Boolean.TRUE);
                                                                    o2Var322.h();
                                                                    break;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i192 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = m2Var422.f.document;
                                                                    String str2 = m2Var422.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i192, bool2, tLObject32, document2, str2, bool2);
                                                                    o2Var322.h();
                                                                    break;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z12 = true;
                                                } else {
                                                    o2Var4.n(tL_error);
                                                    o2Var4.h();
                                                    z12 = false;
                                                }
                                                Utilities.Callback callback3 = m2Var5.n;
                                                if (callback3 != null) {
                                                    callback3.run(Boolean.valueOf(z12));
                                                    m2Var5.n = null;
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                                break;
                            case 1:
                                final int i15 = 1;
                                final o2 o2Var2 = this.b;
                                final int i16 = i10;
                                final m2 m2Var3 = m2Var;
                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: rg.h2
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        boolean z10;
                                        boolean z11;
                                        boolean z12;
                                        switch (i15) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                boolean z13 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                                final o2 o2Var22 = o2Var2;
                                                final m2 m2Var32 = m2Var3;
                                                if (z13) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i152 = i16;
                                                    MediaDataController.getInstance(i152).putStickerSet(tL_messages_stickerSet);
                                                    if (!MediaDataController.getInstance(i152).isStickerPackInstalled(tL_messages_stickerSet.set.id)) {
                                                        MediaDataController.getInstance(i152).toggleStickerSet(null, tLObject2, 2, null, false, false);
                                                    }
                                                    di.t0 t0Var = o2Var22.d0;
                                                    if (t0Var != null) {
                                                        t0Var.setProgress(1.0f);
                                                    }
                                                    final int i162 = 1;
                                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: rg.i2
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            int i1722 = i162;
                                                            m2 m2Var422 = m2Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            o2 o2Var322 = o2Var22;
                                                            o2Var322.getClass();
                                                            switch (i1722) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i1822 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = m2Var422.f.document;
                                                                    String str = m2Var422.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i1822, bool, tLObject32, document, str, bool);
                                                                    o2Var322.h();
                                                                    break;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, m2Var422.f.document, m2Var422.l, Boolean.TRUE);
                                                                    o2Var322.h();
                                                                    break;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i192 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = m2Var422.f.document;
                                                                    String str2 = m2Var422.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i192, bool2, tLObject32, document2, str2, bool2);
                                                                    o2Var322.h();
                                                                    break;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z10 = true;
                                                } else {
                                                    o2Var22.n(tL_error);
                                                    o2Var22.h();
                                                    z10 = false;
                                                }
                                                Utilities.Callback callback2 = m2Var32.n;
                                                if (callback2 != null) {
                                                    callback2.run(Boolean.valueOf(z10));
                                                    m2Var32.n = null;
                                                    break;
                                                }
                                                break;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final o2 o2Var32 = o2Var2;
                                                final m2 m2Var42 = m2Var3;
                                                if (z14) {
                                                    int i172 = i16;
                                                    MediaDataController.getInstance(i172).putStickerSet((TLRPC.TL_messages_stickerSet) tLObject3);
                                                    MediaDataController.getInstance(i172).toggleStickerSet(null, tLObject3, 2, null, false, false);
                                                    di.t0 t0Var2 = o2Var32.d0;
                                                    if (t0Var2 != null) {
                                                        t0Var2.setProgress(1.0f);
                                                    }
                                                    final int i182 = 0;
                                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: rg.i2
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            int i1722 = i182;
                                                            m2 m2Var422 = m2Var42;
                                                            TLObject tLObject32 = tLObject3;
                                                            o2 o2Var322 = o2Var32;
                                                            o2Var322.getClass();
                                                            switch (i1722) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i1822 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = m2Var422.f.document;
                                                                    String str = m2Var422.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i1822, bool, tLObject32, document, str, bool);
                                                                    o2Var322.h();
                                                                    break;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, m2Var422.f.document, m2Var422.l, Boolean.TRUE);
                                                                    o2Var322.h();
                                                                    break;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i192 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = m2Var422.f.document;
                                                                    String str2 = m2Var422.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i192, bool2, tLObject32, document2, str2, bool2);
                                                                    o2Var322.h();
                                                                    break;
                                                            }
                                                        }
                                                    }, 250L);
                                                    z11 = true;
                                                } else {
                                                    o2Var32.n(tL_error);
                                                    o2Var32.h();
                                                    z11 = false;
                                                }
                                                Utilities.Callback callback22 = m2Var42.n;
                                                if (callback22 != null) {
                                                    callback22.run(Boolean.valueOf(z11));
                                                    m2Var42.n = null;
                                                    break;
                                                }
                                                break;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final o2 o2Var4 = o2Var2;
                                                final m2 m2Var5 = m2Var3;
                                                if (z15) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i19 = i16;
                                                    MediaDataController.getInstance(i19).putStickerSet(tL_messages_stickerSet2);
                                                    if (!MediaDataController.getInstance(i19).isStickerPackInstalled(tL_messages_stickerSet2.set.id)) {
                                                        MediaDataController.getInstance(i19).toggleStickerSet(null, tLObject4, 2, null, false, false);
                                                    }
                                                    di.t0 t0Var3 = o2Var4.d0;
                                                    if (t0Var3 != null) {
                                                        t0Var3.setProgress(1.0f);
                                                    }
                                                    final int i20 = 2;
                                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: rg.i2
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            int i1722 = i20;
                                                            m2 m2Var422 = m2Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            o2 o2Var322 = o2Var4;
                                                            o2Var322.getClass();
                                                            switch (i1722) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i1822 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = m2Var422.f.document;
                                                                    String str = m2Var422.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i1822, bool, tLObject32, document, str, bool);
                                                                    o2Var322.h();
                                                                    break;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, m2Var422.f.document, m2Var422.l, Boolean.TRUE);
                                                                    o2Var322.h();
                                                                    break;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i192 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = m2Var422.f.document;
                                                                    String str2 = m2Var422.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i192, bool2, tLObject32, document2, str2, bool2);
                                                                    o2Var322.h();
                                                                    break;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z12 = true;
                                                } else {
                                                    o2Var4.n(tL_error);
                                                    o2Var4.h();
                                                    z12 = false;
                                                }
                                                Utilities.Callback callback3 = m2Var5.n;
                                                if (callback3 != null) {
                                                    callback3.run(Boolean.valueOf(z12));
                                                    m2Var5.n = null;
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                                break;
                            default:
                                final int i17 = 2;
                                final o2 o2Var3 = this.b;
                                final int i18 = i10;
                                final m2 m2Var4 = m2Var;
                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: rg.h2
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        boolean z10;
                                        boolean z11;
                                        boolean z12;
                                        switch (i17) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                boolean z13 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                                final o2 o2Var22 = o2Var3;
                                                final m2 m2Var32 = m2Var4;
                                                if (z13) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i152 = i18;
                                                    MediaDataController.getInstance(i152).putStickerSet(tL_messages_stickerSet);
                                                    if (!MediaDataController.getInstance(i152).isStickerPackInstalled(tL_messages_stickerSet.set.id)) {
                                                        MediaDataController.getInstance(i152).toggleStickerSet(null, tLObject2, 2, null, false, false);
                                                    }
                                                    di.t0 t0Var = o2Var22.d0;
                                                    if (t0Var != null) {
                                                        t0Var.setProgress(1.0f);
                                                    }
                                                    final int i162 = 1;
                                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: rg.i2
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            int i1722 = i162;
                                                            m2 m2Var422 = m2Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            o2 o2Var322 = o2Var22;
                                                            o2Var322.getClass();
                                                            switch (i1722) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i1822 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = m2Var422.f.document;
                                                                    String str = m2Var422.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i1822, bool, tLObject32, document, str, bool);
                                                                    o2Var322.h();
                                                                    break;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, m2Var422.f.document, m2Var422.l, Boolean.TRUE);
                                                                    o2Var322.h();
                                                                    break;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i192 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = m2Var422.f.document;
                                                                    String str2 = m2Var422.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i192, bool2, tLObject32, document2, str2, bool2);
                                                                    o2Var322.h();
                                                                    break;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z10 = true;
                                                } else {
                                                    o2Var22.n(tL_error);
                                                    o2Var22.h();
                                                    z10 = false;
                                                }
                                                Utilities.Callback callback2 = m2Var32.n;
                                                if (callback2 != null) {
                                                    callback2.run(Boolean.valueOf(z10));
                                                    m2Var32.n = null;
                                                    break;
                                                }
                                                break;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final o2 o2Var32 = o2Var3;
                                                final m2 m2Var42 = m2Var4;
                                                if (z14) {
                                                    int i172 = i18;
                                                    MediaDataController.getInstance(i172).putStickerSet((TLRPC.TL_messages_stickerSet) tLObject3);
                                                    MediaDataController.getInstance(i172).toggleStickerSet(null, tLObject3, 2, null, false, false);
                                                    di.t0 t0Var2 = o2Var32.d0;
                                                    if (t0Var2 != null) {
                                                        t0Var2.setProgress(1.0f);
                                                    }
                                                    final int i182 = 0;
                                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: rg.i2
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            int i1722 = i182;
                                                            m2 m2Var422 = m2Var42;
                                                            TLObject tLObject32 = tLObject3;
                                                            o2 o2Var322 = o2Var32;
                                                            o2Var322.getClass();
                                                            switch (i1722) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i1822 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = m2Var422.f.document;
                                                                    String str = m2Var422.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i1822, bool, tLObject32, document, str, bool);
                                                                    o2Var322.h();
                                                                    break;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, m2Var422.f.document, m2Var422.l, Boolean.TRUE);
                                                                    o2Var322.h();
                                                                    break;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i192 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = m2Var422.f.document;
                                                                    String str2 = m2Var422.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i192, bool2, tLObject32, document2, str2, bool2);
                                                                    o2Var322.h();
                                                                    break;
                                                            }
                                                        }
                                                    }, 250L);
                                                    z11 = true;
                                                } else {
                                                    o2Var32.n(tL_error);
                                                    o2Var32.h();
                                                    z11 = false;
                                                }
                                                Utilities.Callback callback22 = m2Var42.n;
                                                if (callback22 != null) {
                                                    callback22.run(Boolean.valueOf(z11));
                                                    m2Var42.n = null;
                                                    break;
                                                }
                                                break;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final o2 o2Var4 = o2Var3;
                                                final m2 m2Var5 = m2Var4;
                                                if (z15) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i19 = i18;
                                                    MediaDataController.getInstance(i19).putStickerSet(tL_messages_stickerSet2);
                                                    if (!MediaDataController.getInstance(i19).isStickerPackInstalled(tL_messages_stickerSet2.set.id)) {
                                                        MediaDataController.getInstance(i19).toggleStickerSet(null, tLObject4, 2, null, false, false);
                                                    }
                                                    di.t0 t0Var3 = o2Var4.d0;
                                                    if (t0Var3 != null) {
                                                        t0Var3.setProgress(1.0f);
                                                    }
                                                    final int i20 = 2;
                                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: rg.i2
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            int i1722 = i20;
                                                            m2 m2Var422 = m2Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            o2 o2Var322 = o2Var4;
                                                            o2Var322.getClass();
                                                            switch (i1722) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i1822 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = m2Var422.f.document;
                                                                    String str = m2Var422.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i1822, bool, tLObject32, document, str, bool);
                                                                    o2Var322.h();
                                                                    break;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, m2Var422.f.document, m2Var422.l, Boolean.TRUE);
                                                                    o2Var322.h();
                                                                    break;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i192 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = m2Var422.f.document;
                                                                    String str2 = m2Var422.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i192, bool2, tLObject32, document2, str2, bool2);
                                                                    o2Var322.h();
                                                                    break;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z12 = true;
                                                } else {
                                                    o2Var4.n(tL_error);
                                                    o2Var4.h();
                                                    z12 = false;
                                                }
                                                Utilities.Callback callback3 = m2Var5.n;
                                                if (callback3 != null) {
                                                    callback3.run(Boolean.valueOf(z12));
                                                    m2Var5.n = null;
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
        SendMessagesHelper.getInstance(i10).sendSticker(m2Var.f.document, null, m2Var.i, null, null, null, null, null, true, 0, 0, false, null, null, 0L, 0L, null);
        di.t0 t0Var = this.d0;
        if (t0Var != null) {
            t0Var.setProgress(1.0f);
        }
        AndroidUtilities.runOnUIThread(new f(this, i10, i13), 450L);
        Utilities.Callback callback2 = m2Var.n;
        if (callback2 != null) {
            callback2.run(Boolean.TRUE);
            m2Var.n = null;
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
            int i10 = 0;
            while (true) {
                l2[] l2VarArr = this.H;
                if (i10 >= l2VarArr.length) {
                    break;
                }
                l2 l2Var = l2VarArr[i10];
                if (l2Var != null) {
                    l2Var.l.reset();
                    Bitmap bitmap = l2Var.e;
                    if (bitmap != null) {
                        bitmap.recycle();
                        l2Var.e = null;
                    }
                    Bitmap bitmap2 = l2Var.d;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                        l2Var.d = null;
                    }
                    Bitmap bitmap3 = l2Var.g;
                    if (bitmap3 != null) {
                        bitmap3.recycle();
                        l2Var.g = null;
                    }
                    Bitmap bitmap4 = l2Var.f;
                    if (bitmap4 != null) {
                        bitmap4.recycle();
                        l2Var.f = null;
                    }
                }
                i10++;
            }
            this.H = null;
        }
        this.y = false;
        this.x = false;
        this.L = false;
        this.M.setAlpha(0.0f);
        this.M.setScaleX(0.3f);
        this.M.setScaleY(0.3f);
        m2 m2Var = this.W;
        if (m2Var != null) {
            if (!m2Var.o) {
                m2Var.a();
            }
            this.W = null;
        }
        h();
        this.V = false;
    }

    public final Bitmap d(Bitmap bitmap, int i10, int i11, boolean z10) {
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
            canvas.drawBitmap(bitmap, i10, i11, paint);
        } else {
            canvas.drawBitmap(bitmap, i10, i11, paint);
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

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        m2 m2Var;
        if (i10 == NotificationCenter.fileUploaded) {
            String str = (String) objArr[0];
            TLRPC.InputFile inputFile = (TLRPC.InputFile) objArr[1];
            m2 m2Var2 = this.W;
            if (m2Var2 == null || !str.equalsIgnoreCase(m2Var2.b)) {
                return;
            }
            m2 m2Var3 = this.W;
            m2Var3.g = inputFile;
            TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia = new TLRPC.TL_messages_uploadMedia();
            tL_messages_uploadMedia.peer = new TLRPC.TL_inputPeerSelf();
            TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument = new TLRPC.TL_inputMediaUploadedDocument();
            tL_messages_uploadMedia.media = tL_inputMediaUploadedDocument;
            tL_inputMediaUploadedDocument.file = m2Var3.g;
            if (m2Var3.s != null) {
                tL_inputMediaUploadedDocument.mime_type = "video/webm";
            } else {
                tL_inputMediaUploadedDocument.mime_type = "image/webp";
            }
            TLRPC.TL_documentAttributeSticker tL_documentAttributeSticker = new TLRPC.TL_documentAttributeSticker();
            tL_documentAttributeSticker.alt = m2Var3.c;
            tL_documentAttributeSticker.stickerset = new TLRPC.TL_inputStickerSetEmpty();
            tL_messages_uploadMedia.media.attributes.add(tL_documentAttributeSticker);
            ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_messages_uploadMedia, new cj1(1, this, m2Var3), 2);
            return;
        }
        if (i10 == NotificationCenter.fileUploadProgressChanged) {
            String str2 = (String) objArr[0];
            m2 m2Var4 = this.W;
            if (m2Var4 == null || !str2.equalsIgnoreCase(m2Var4.b)) {
                return;
            }
            long longValue = ((Long) objArr[1]).longValue();
            long longValue2 = ((Long) objArr[2]).longValue();
            if (longValue2 > 0) {
                m2 m2Var5 = this.W;
                m2Var5.u = Utilities.clamp(longValue / longValue2, 1.0f, m2Var5.u);
                di.t0 t0Var = this.d0;
                if (t0Var != null) {
                    t0Var.setProgress(this.W.b());
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.fileUploadFailed) {
            String str3 = (String) objArr[0];
            m2 m2Var6 = this.W;
            if (m2Var6 == null || !str3.equalsIgnoreCase(m2Var6.b)) {
                return;
            }
            h();
            return;
        }
        if (i10 == NotificationCenter.filePreparingStarted) {
            m2 m2Var7 = this.W;
            if (m2Var7 != null && objArr[0] == m2Var7.r) {
                FileLoader.getInstance(UserConfig.selectedAccount).uploadFile(this.W.b, false, true, 67108864);
                return;
            }
            return;
        }
        if (i10 != NotificationCenter.fileNewChunkAvailable) {
            if (i10 == NotificationCenter.filePreparingFailed && (m2Var = this.W) != null && objArr[0] == m2Var.r) {
                h();
                return;
            }
            return;
        }
        m2 m2Var8 = this.W;
        if (m2Var8 != null && objArr[0] == m2Var8.r) {
            String str4 = (String) objArr[1];
            long longValue3 = ((Long) objArr[2]).longValue();
            long longValue4 = ((Long) objArr[3]).longValue();
            Float f7 = (Float) objArr[4];
            float floatValue = f7.floatValue();
            this.W.r.videoEditedInfo.needUpdateProgress = true;
            FileLoader.getInstance(this.a).checkUploadNewDataAvailable(str4, false, Math.max(1L, longValue3), longValue4, f7);
            m2 m2Var9 = this.W;
            m2Var9.t = Math.max(m2Var9.t, floatValue);
            di.t0 t0Var2 = this.d0;
            if (t0Var2 != null) {
                t0Var2.setProgress(this.W.b());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        canvas.drawPath(this.v, this.e);
        canvas.drawPath(this.w, this.d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        if (r6.getAction() != 1) goto L17;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        this.n0 = motionEvent.getX();
        float y3 = motionEvent.getY();
        this.o0 = y3;
        if (this.H != null && this.N != null) {
            l2 j3 = j(this.n0, y3);
            int i10 = 0;
            while (true) {
                l2[] l2VarArr = this.H;
                if (i10 >= l2VarArr.length) {
                    break;
                }
                boolean z10 = l2VarArr[i10] == j3 && motionEvent.getAction() != 3;
                if (z10 && !this.H[i10].b) {
                    AndroidUtilities.vibrateCursor(this);
                }
                this.H[i10].b = z10;
                i10++;
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
        l2 l2Var = this.E;
        if (l2Var != null) {
            this.K = bitmap;
            if (l2Var.f != null && this.L) {
                Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                Paint paint = new Paint(3);
                Paint paint2 = new Paint(3);
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint2);
                Rect rect = new Rect();
                rect.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
                l2 l2Var2 = this.E;
                if (l2Var2.c == 0) {
                    canvas.drawBitmap(l2Var2.a(), (Rect) null, rect, paint);
                    return createBitmap;
                }
                Matrix matrix = new Matrix();
                l2 l2Var3 = this.E;
                matrix.postRotate(l2Var3.c, l2Var3.a().getWidth() / 2.0f, this.E.a().getHeight() / 2.0f);
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
        this.b.d(0.0f, false);
        ValueAnimator valueAnimator = this.N;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.N = null;
        }
        setOnClickListener(null);
        setClickable(false);
        TextView textView = this.M;
        textView.animate().cancel();
        textView.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(240L).setInterpolator(pr.h).start();
    }

    public final void g(Canvas canvas, boolean z10, ViewGroup viewGroup, boolean z11) {
        e6 e6Var = this.c;
        e6Var.a = viewGroup;
        boolean z12 = this.i0;
        if (z12 || e6Var.c > 0.0f) {
            float e7 = viewGroup == null ? 1.0f : e6Var.e(z12 && !z11);
            l2[] l2VarArr = this.H;
            if (l2VarArr != null) {
                for (l2 l2Var : l2VarArr) {
                    if (l2Var != null && l2Var == this.E) {
                        if (this.F > 0.0f) {
                            if (l2Var.t.k0 == null) {
                                return;
                            }
                            canvas.save();
                            canvas.clipPath(l2Var.t.k0);
                            if (l2Var.t.I != null) {
                                Paint paint = z10 ? l2Var.q : l2Var.p;
                                paint.setAlpha((int) (e7 * 255.0f));
                                paint.setStrokeWidth(AndroidUtilities.dp(r4));
                                canvas.drawPath(l2Var.l, paint);
                                if (l2Var.t.k0 != null && z10) {
                                    canvas.clipPath(l2Var.l);
                                    paint.setStrokeWidth(AndroidUtilities.dp(r4 * 2.0f));
                                    canvas.drawPath(l2Var.t.k0, paint);
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
        l2 l2Var;
        if (!this.L || (l2Var = this.E) == null) {
            return null;
        }
        return l2Var.a();
    }

    public Bitmap getSourceBitmap() {
        return this.I;
    }

    public w01 getThanosEffect() {
        if (!w01.c()) {
            return null;
        }
        if (this.S == null) {
            w01 w01Var = new w01(getContext(), new f2(this, 1));
            this.S = w01Var;
            addView(w01Var, x5.c(-1.0f, -1));
        }
        return this.S;
    }

    public final void h() {
        di.t0 t0Var = this.d0;
        if (t0Var != null) {
            t0Var.a();
            this.d0 = null;
        }
    }

    public final boolean i() {
        return this.L;
    }

    public final l2 j(float f7, float f10) {
        int width;
        int height;
        if (this.I == null) {
            return null;
        }
        int i10 = 0;
        while (true) {
            l2[] l2VarArr = this.H;
            if (i10 >= l2VarArr.length) {
                return null;
            }
            l2 l2Var = l2VarArr[i10];
            if (l2Var != null) {
                if ((l2Var.c / 90) % 2 != 0) {
                    width = this.I.getHeight();
                    height = this.I.getWidth();
                } else {
                    width = this.I.getWidth();
                    height = this.I.getHeight();
                }
                RectF rectF = AndroidUtilities.rectTmp;
                RectF rectF2 = this.H[i10].i;
                float f11 = width;
                float f12 = rectF2.left / f11;
                float f13 = this.f0;
                float f14 = height;
                float f15 = rectF2.top / f14;
                float f16 = this.g0;
                rectF.set(f12 * f13, f15 * f16, (rectF2.right / f11) * f13, (rectF2.bottom / f14) * f16);
                this.e0.mapRect(rectF);
                if (rectF.contains(f7, f10)) {
                    return l2Var;
                }
            }
            i10++;
        }
    }

    public final void l() {
        Bitmap bitmap;
        l2[] l2VarArr = this.H;
        if (l2VarArr != null) {
            for (l2 l2Var : l2VarArr) {
                if (l2Var != null && (bitmap = l2Var.e) != null) {
                    bitmap.recycle();
                    l2Var.e = null;
                    Bitmap bitmap2 = l2Var.g;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                        l2Var.g = null;
                    }
                    c(l2Var, this.T, this.U);
                }
            }
        }
    }

    public final void m(Bitmap bitmap, int i10, int i11, int i12, or0 or0Var) {
        wb.c cVar;
        int i13 = i11 <= 0 ? AndroidUtilities.displaySize.x : i11;
        int i14 = i12 <= 0 ? AndroidUtilities.displaySize.y : i12;
        this.T = i13;
        this.U = i14;
        if (this.y || this.x || bitmap == null || Build.VERSION.SDK_INT < 24) {
            return;
        }
        this.I = bitmap;
        this.J = i10;
        this.c0 = null;
        s4 s4Var = new s4(this, i10, or0Var, 4);
        this.x = true;
        ac.d dVar = new ac.d();
        dVar.b = true;
        dVar.c = true;
        zzd a2 = i8.d.a(new ac.e(dVar));
        if (EmuDetector.with(getContext()).detect()) {
            ArrayList arrayList = new ArrayList();
            Bitmap bitmap2 = this.I;
            n2 n2Var = new n2();
            int min = (int) (Math.min(bitmap2.getWidth(), bitmap2.getHeight()) * 0.4f);
            n2Var.e = min;
            n2Var.d = min;
            n2Var.a = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
            new Canvas(n2Var.a).drawRect(0.0f, 0.0f, n2Var.d, n2Var.e, j6.Jl);
            n2Var.b = (bitmap2.getWidth() - n2Var.d) / 2;
            n2Var.c = (bitmap2.getHeight() - n2Var.e) / 2;
            arrayList.add(n2Var);
            s4Var.run(arrayList);
            return;
        }
        vb.a a10 = vb.a.a(bitmap, i10);
        a2.g(a10).addOnSuccessListener(new k5(s4Var, 28)).addOnFailureListener(new org.telegram.ui.Components.e2(this, bitmap, i10, or0Var, s4Var, 4));
        if (this.c0 == null) {
            yb.a aVar = yb.a.b;
            n6.l.i(aVar, "options cannot be null");
            synchronized (wb.c.class) {
                cVar = (wb.c) qb.g.c().a(wb.c.class);
            }
            pa.b bVar = (pa.b) cVar.a.get(yb.a.class);
            n6.l.h(bVar);
            zb.d dVar2 = (zb.d) bVar.get();
            dVar2.getClass();
            fa faVar = dVar2.c;
            com.google.firebase.messaging.n nVar = new com.google.firebase.messaging.n();
            nVar.c = m7.b;
            qb.m.a.execute(new com.google.android.gms.internal.cast.p(faVar, new a5.a(nVar, 1), o7.c, faVar.b(), 7));
            new ImageLabelerImpl((qb.e) dVar2.a.O0(aVar), (Executor) dVar2.b.a.get(), new k6.c("vision.ica", 1L)).g(a10).addOnSuccessListener(new k5(this, 29)).addOnFailureListener(new r9.i(2));
        }
        List<TLRPC.TL_availableReaction> enabledReactionsList = MediaDataController.getInstance(this.a).getEnabledReactionsList();
        for (int i15 = 0; i15 < Math.min(enabledReactionsList.size(), 9); i15++) {
            Emoji.getEmojiDrawable(enabledReactionsList.get(i15).reaction);
        }
    }

    public final void n(TLRPC.TL_error tL_error) {
        if (tL_error == null || "PACK_TITLE_INVALID".equals(tL_error.text)) {
            return;
        }
        new yc((FrameLayout) getParent(), this.a0).t(tL_error.text, null).j();
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
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, 1.0f, 1.0f);
            this.l0.addRoundRect(rectF, rectF.width() * 0.12f, rectF.height() * 0.12f, Path.Direction.CW);
        }
        this.k0.addPath(this.l0, this.j0);
        this.k0.computeBounds(this.m0, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.a).addObserver(this, NotificationCenter.fileUploaded);
        NotificationCenter.getInstance(this.a).addObserver(this, NotificationCenter.fileUploadProgressChanged);
        NotificationCenter.getInstance(this.a).addObserver(this, NotificationCenter.fileUploadFailed);
        NotificationCenter.getInstance(this.a).addObserver(this, NotificationCenter.filePreparingFailed);
        NotificationCenter.getInstance(this.a).addObserver(this, NotificationCenter.filePreparingStarted);
        NotificationCenter.getInstance(this.a).addObserver(this, NotificationCenter.fileNewChunkAvailable);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = this.a;
        if (i10 >= 0) {
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.fileUploaded);
            NotificationCenter.getInstance(this.a).removeObserver(this, NotificationCenter.fileUploadProgressChanged);
            NotificationCenter.getInstance(this.a).removeObserver(this, NotificationCenter.fileUploadFailed);
            NotificationCenter.getInstance(this.a).removeObserver(this, NotificationCenter.filePreparingFailed);
            NotificationCenter.getInstance(this.a).removeObserver(this, NotificationCenter.filePreparingStarted);
            NotificationCenter.getInstance(this.a).removeObserver(this, NotificationCenter.fileNewChunkAvailable);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        float dp = AndroidUtilities.dp(10.0f);
        float f7 = dp * 2.0f;
        float measuredWidth = getMeasuredWidth() - f7;
        float measuredHeight = getMeasuredHeight() - f7;
        float f10 = measuredWidth / 8.0f;
        RectF rectF = AndroidUtilities.rectTmp;
        float f11 = measuredWidth + dp;
        rectF.set(dp, dp, f11, f11);
        rectF.offset(0.0f, (measuredHeight - rectF.height()) / 2.0f);
        Path path = this.s;
        path.rewind();
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, f10, f10, direction);
        Path path2 = this.r;
        path2.rewind();
        path2.addRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), direction);
        Path path3 = this.v;
        path3.reset();
        path3.op(path2, path, Path.Op.DIFFERENCE);
        Path path4 = this.w;
        path4.rewind();
        rectF.inset(AndroidUtilities.dp(-1.0f), AndroidUtilities.dp(-1.0f));
        path4.addRoundRect(rectF, f10, f10, direction);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.M.setTranslationY(-((getMeasuredWidth() / 2.0f) + AndroidUtilities.dp(10.0f)));
        if (Build.VERSION.SDK_INT >= 29) {
            ArrayList arrayList = this.p0;
            arrayList.clear();
            if (this.i0) {
                Rect rect = this.q0;
                arrayList.add(rect);
                int measuredHeight = (int) (getMeasuredHeight() * 0.3f);
                rect.set(0, (getMeasuredHeight() - measuredHeight) / 2, AndroidUtilities.dp(20.0f), (getMeasuredHeight() + measuredHeight) / 2);
            }
            setSystemGestureExclusionRects(arrayList);
        }
    }

    public final void p(final String str, final VideoEditedInfo videoEditedInfo, final String str2, final CharSequence charSequence, final boolean z10, final long j3, final TLRPC.StickerSet stickerSet, final TLRPC.Document document, final TLRPC.Document document2, final String str3, final Utilities.Callback callback, final Utilities.Callback2 callback2) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: rg.j2
            @Override // java.lang.Runnable
            public final void run() {
                m2 m2Var;
                o2 o2Var = o2.this;
                Utilities.Callback callback3 = callback;
                boolean z11 = callback3 == null || (m2Var = o2Var.W) == null || !m2Var.o;
                if (z11) {
                    m2 m2Var2 = o2Var.W;
                    if (m2Var2 != null) {
                        m2Var2.a();
                    }
                    m2 m2Var3 = new m2();
                    m2Var3.p = new ArrayList();
                    m2Var3.q = new ArrayList();
                    m2Var3.t = 0.0f;
                    m2Var3.u = 0.0f;
                    o2Var.W = m2Var3;
                }
                m2 m2Var4 = o2Var.W;
                m2Var4.c = str2;
                String str4 = str;
                m2Var4.b = str4;
                m2Var4.a = str4;
                m2Var4.d = charSequence;
                m2Var4.h = z10;
                m2Var4.i = j3;
                m2Var4.j = stickerSet;
                m2Var4.k = document;
                VideoEditedInfo videoEditedInfo2 = videoEditedInfo;
                m2Var4.s = videoEditedInfo2;
                m2Var4.l = str3;
                m2Var4.n = callback3;
                m2Var4.m = callback2;
                ArrayList arrayList = m2Var4.q;
                if (!TextUtils.isEmpty(str4)) {
                    m2Var4.p.add(new File(m2Var4.b));
                }
                if (!TextUtils.isEmpty(m2Var4.a) && !TextUtils.equals(m2Var4.a, m2Var4.b)) {
                    arrayList.add(new File(m2Var4.a));
                }
                if (!TextUtils.isEmpty(m2Var4.l)) {
                    arrayList.add(new File(m2Var4.l));
                }
                if (z11) {
                    TLRPC.Document document3 = document2;
                    if (document3 != null) {
                        m2 m2Var5 = o2Var.W;
                        m2Var5.e = MediaDataController.getInputStickerSetItem(document3, m2Var5.c);
                        o2Var.W.f = new TLRPC.TL_messageMediaDocument();
                        TLRPC.TL_messageMediaDocument tL_messageMediaDocument = o2Var.W.f;
                        tL_messageMediaDocument.flags |= 1;
                        tL_messageMediaDocument.document = document3;
                        o2Var.a();
                    } else if (videoEditedInfo2 != null) {
                        TLRPC.TL_message tL_message = new TLRPC.TL_message();
                        tL_message.id = 1;
                        m2 m2Var6 = o2Var.W;
                        String absolutePath = o8.w(UserConfig.selectedAccount, "webm").getAbsolutePath();
                        tL_message.attachPath = absolutePath;
                        m2Var6.b = absolutePath;
                        o2Var.W.r = new MessageObject(UserConfig.selectedAccount, (TLRPC.Message) tL_message, (MessageObject) null, false, false);
                        o2Var.W.r.videoEditedInfo = videoEditedInfo2;
                        MediaController.getInstance().scheduleVideoConvert(o2Var.W.r, false, false, false);
                    } else {
                        FileLoader.getInstance(o2Var.a).uploadFile(str4, false, true, 67108864);
                    }
                } else {
                    o2Var.a();
                }
                if (callback3 == null) {
                    if (o2Var.d0 == null) {
                        o2Var.d0 = new di.t0(o2Var.getContext(), LocaleController.getString(R.string.PreparingSticker));
                    }
                    o2Var.d0.setOnCancelListener(new f2(o2Var, 0));
                    if (o2Var.d0.getParent() == null) {
                        o2Var.addView(o2Var.d0, x5.e(-1, -1, 17));
                    }
                    di.t0 t0Var = o2Var.d0;
                    t0Var.E = true;
                    t0Var.invalidate();
                }
            }
        }, 300L);
    }

    public void setCurrentAccount(int i10) {
        int i11 = this.a;
        if (i11 != i10) {
            if (i11 >= 0 && isAttachedToWindow()) {
                NotificationCenter.getInstance(this.a).removeObserver(this, NotificationCenter.fileUploaded);
                NotificationCenter.getInstance(this.a).removeObserver(this, NotificationCenter.fileUploadProgressChanged);
                NotificationCenter.getInstance(this.a).removeObserver(this, NotificationCenter.fileUploadFailed);
                NotificationCenter.getInstance(this.a).removeObserver(this, NotificationCenter.filePreparingFailed);
                NotificationCenter.getInstance(this.a).removeObserver(this, NotificationCenter.filePreparingStarted);
                NotificationCenter.getInstance(this.a).removeObserver(this, NotificationCenter.fileNewChunkAvailable);
            }
            this.a = i10;
            if (i10 < 0 || !isAttachedToWindow()) {
                return;
            }
            NotificationCenter.getInstance(this.a).addObserver(this, NotificationCenter.fileUploaded);
            NotificationCenter.getInstance(this.a).addObserver(this, NotificationCenter.fileUploadProgressChanged);
            NotificationCenter.getInstance(this.a).addObserver(this, NotificationCenter.fileUploadFailed);
            NotificationCenter.getInstance(this.a).addObserver(this, NotificationCenter.filePreparingFailed);
            NotificationCenter.getInstance(this.a).addObserver(this, NotificationCenter.filePreparingStarted);
            NotificationCenter.getInstance(this.a).addObserver(this, NotificationCenter.fileNewChunkAvailable);
        }
    }

    public void setOutlineVisible(boolean z10) {
        if (this.i0 == z10) {
            return;
        }
        this.i0 = z10;
        this.h0.animate().alpha(z10 ? 1.0f : 0.0f).translationX(z10 ? 0.0f : AndroidUtilities.dp(-18.0f)).setInterpolator(pr.h).setDuration(320L).start();
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
                rect.set(0, (getMeasuredHeight() - measuredHeight) / 2, AndroidUtilities.dp(20.0f), (getMeasuredHeight() + measuredHeight) / 2);
            }
            setSystemGestureExclusionRects(arrayList);
        }
    }

    public void setOutlineWidth(float f7) {
        this.F = f7;
        if (getParent() instanceof View) {
            ((View) getParent()).invalidate();
        }
    }

    public void setStickerCutOutBtn(e2 e2Var) {
        this.b0 = e2Var;
    }
}
