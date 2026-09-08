package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class uj extends ym {
    public int Y2;
    public final ArrayList Z2;
    public final ArrayList a3;
    public final ArrayList b3;
    public final ArrayList c3;
    public final ArrayList d3;
    public int e3;
    public int f3;
    public int g3;
    public long h3;
    public float i3;
    public float j3;
    public boolean k3;
    public final float l3;
    public final Paint m3;
    public final Paint n3;
    public final o1.j o3;
    public final o1.k p3;
    public final o1.j q3;
    public final o1.k r3;
    public final o1.j s3;
    public final o1.k t3;
    public boolean u3;
    public final Path v3;
    public boolean w3;
    public int x3;
    public final /* synthetic */ co y3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uj(co coVar, Context context, ao aoVar) {
        super(coVar, context, aoVar);
        this.y3 = coVar;
        this.Z2 = new ArrayList();
        this.a3 = new ArrayList();
        this.b3 = new ArrayList();
        this.c3 = new ArrayList();
        this.d3 = new ArrayList(10);
        this.l3 = 2000.0f;
        Paint paint = new Paint(1);
        this.m3 = paint;
        Paint paint2 = new Paint(1);
        this.n3 = paint2;
        o1.j jVar = new o1.j(0.0f);
        this.o3 = jVar;
        o1.k kVar = new o1.k(jVar);
        kVar.h = 0.0f;
        kVar.g = 2000.0f;
        kVar.u = org.telegram.ui.Cells.p6.l(0.0f, 1500.0f, 1.0f);
        final int i10 = 0;
        kVar.b(new o1.g(this) { // from class: org.telegram.ui.sj
            public final /* synthetic */ uj b;

            {
                this.b = this;
            }

            @Override // o1.g
            public final void a(o1.h hVar, float f7, float f10) {
                switch (i10) {
                    case 0:
                        this.b.invalidate();
                        break;
                    case 1:
                        this.b.invalidate();
                        break;
                    default:
                        this.b.invalidate();
                        break;
                }
            }
        });
        this.p3 = kVar;
        o1.j jVar2 = new o1.j(0.0f);
        this.q3 = jVar2;
        o1.k kVar2 = new o1.k(jVar2);
        kVar2.h = 0.0f;
        kVar2.u = org.telegram.ui.Cells.p6.l(0.0f, 400.0f, 0.5f);
        final int i11 = 1;
        kVar2.b(new o1.g(this) { // from class: org.telegram.ui.sj
            public final /* synthetic */ uj b;

            {
                this.b = this;
            }

            @Override // o1.g
            public final void a(o1.h hVar, float f7, float f10) {
                switch (i11) {
                    case 0:
                        this.b.invalidate();
                        break;
                    case 1:
                        this.b.invalidate();
                        break;
                    default:
                        this.b.invalidate();
                        break;
                }
            }
        });
        this.r3 = kVar2;
        o1.j jVar3 = new o1.j(0.0f);
        this.s3 = jVar3;
        o1.k kVar3 = new o1.k(jVar3);
        kVar3.h = 0.0f;
        kVar3.u = org.telegram.ui.Cells.p6.l(0.0f, 200.0f, 1.0f);
        final int i12 = 2;
        kVar3.b(new o1.g(this) { // from class: org.telegram.ui.sj
            public final /* synthetic */ uj b;

            {
                this.b = this;
            }

            @Override // o1.g
            public final void a(o1.h hVar, float f7, float f10) {
                switch (i12) {
                    case 0:
                        this.b.invalidate();
                        break;
                    case 1:
                        this.b.invalidate();
                        break;
                    default:
                        this.b.invalidate();
                        break;
                }
            }
        });
        this.t3 = kVar3;
        this.v3 = new Path();
        this.x3 = 0;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }

    @Override // org.telegram.ui.Components.ll0
    public final boolean F0(View view) {
        return (view.getVisibility() == 4 || view.getVisibility() == 8) ? false : true;
    }

    @Override // android.view.View
    public final AccessibilityNodeInfo createAccessibilityNodeInfo() {
        if (this.y3.h != null) {
            return null;
        }
        return super.createAccessibilityNodeInfo();
    }

    @Override // org.telegram.ui.Components.ll0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        co coVar = this.y3;
        coVar.u8 = null;
        canvas.save();
        if (coVar.V9 != null && coVar.R9) {
            boolean z10 = coVar.S9;
        }
        this.G1.setEmpty();
        if (coVar.N9 != 0.0f) {
            int save = canvas.save();
            float measuredHeight = (-coVar.N9) - (coVar.U9 != 0.0f ? (coVar.x0.getMeasuredHeight() - coVar.N9) * coVar.U9 : 0.0f);
            coVar.ya = measuredHeight;
            canvas.translate(0.0f, measuredHeight);
            v1(canvas, null);
            super.dispatchDraw(canvas);
            w1(canvas, null);
            canvas.restoreToCount(save);
        } else {
            v1(canvas, null);
            super.dispatchDraw(canvas);
            w1(canvas, null);
        }
        canvas.restore();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0029, code lost:
    
        if ((java.lang.System.currentTimeMillis() - r2.N6) <= 200) goto L8;
     */
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(Canvas canvas) {
        ArrayList arrayList;
        int i10;
        ArrayList arrayList2;
        boolean z10;
        float f7;
        int i11;
        int dp;
        int i12;
        org.telegram.ui.ActionBar.f5 f5Var;
        float f10;
        org.telegram.ui.ActionBar.f5 f5Var2;
        boolean z11;
        rn rnVar;
        int i13;
        float f11;
        float f12;
        boolean z12;
        co coVar = this.y3;
        ArrayList arrayList3 = coVar.u6;
        ColorMatrix colorMatrix = coVar.R6;
        m.c3 c3Var = coVar.S6;
        org.telegram.ui.ActionBar.f5 f5Var3 = coVar.T6;
        Paint paint = coVar.b7;
        Paint paint2 = coVar.P6;
        ArrayList arrayList4 = coVar.O6;
        Paint paint3 = coVar.Q6;
        long j3 = coVar.N6 != 0 ? 200L : 200L;
        if (!AndroidUtilities.isTablet() && !coVar.g4 && coVar.f == null) {
            TLRPC.Chat chat = coVar.e;
            boolean z13 = (chat == null || ChatObject.isChannelAndNotMegaGroup(chat)) && coVar.R3 != 7;
            if (coVar.N9 != 0.0f) {
                canvas.save();
                canvas.translate(0.0f, -coVar.N9);
            }
            int i14 = org.telegram.ui.ActionBar.j6.d6;
            org.telegram.ui.ActionBar.f6 f6Var = this.p2;
            boolean z14 = i0.a.f(org.telegram.ui.ActionBar.j6.v0(i14, f6Var)) <= 0.699999988079071d;
            int i15 = org.telegram.ui.ActionBar.j6.i6;
            int v02 = org.telegram.ui.ActionBar.j6.v0(i15, f6Var);
            if (z14) {
                arrayList = arrayList3;
                i10 = 33;
            } else {
                arrayList = arrayList3;
                i10 = 3;
            }
            boolean z15 = z13;
            int d = i0.a.d(z14 ? 0.9f : 0.5f, v02, Color.argb(i10, 255, 255, 255));
            int k10 = i0.a.k(org.telegram.ui.ActionBar.j6.v0(i15, f6Var), z14 ? 24 : co.Hc);
            if (coVar.a7 != k10 || coVar.Z6 != d) {
                coVar.Z6 = d;
                coVar.a7 = k10;
                int dp2 = AndroidUtilities.dp(200.0f);
                coVar.V6 = dp2;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, dp2, 0.0f, new int[]{k10, d, d, k10}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, tileMode);
                coVar.Y6 = linearGradient;
                coVar.W6 = (-coVar.V6) * 2;
                paint2.setShader(linearGradient);
                int argb = Color.argb(z14 ? 43 : 96, 255, 255, 255);
                LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, coVar.V6, 0.0f, new int[]{0, argb, argb, 0}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, tileMode);
                coVar.d7 = linearGradient2;
                paint.setShader(linearGradient2);
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            org.telegram.ui.ActionBar.f5 f5Var4 = f5Var3;
            long j10 = coVar.U6;
            Matrix matrix = coVar.c7;
            m.c3 c3Var2 = c3Var;
            Matrix matrix2 = coVar.X6;
            long abs = Math.abs(j10 - elapsedRealtime);
            if (abs > 17) {
                abs = 16;
            }
            long j11 = abs < 4 ? 0L : abs;
            int width = getWidth();
            coVar.U6 = elapsedRealtime;
            int i16 = (int) (coVar.W6 + ((width * j11) / 400.0f));
            coVar.W6 = i16;
            if (i16 >= width * 2) {
                coVar.W6 = (-coVar.V6) * 2;
            }
            matrix2.setTranslate(coVar.W6, 0.0f);
            LinearGradient linearGradient3 = coVar.Y6;
            if (linearGradient3 != null) {
                linearGradient3.setLocalMatrix(matrix2);
            }
            matrix.setTranslate(coVar.W6, 0.0f);
            LinearGradient linearGradient4 = coVar.d7;
            if (linearGradient4 != null) {
                linearGradient4.setLocalMatrix(matrix);
            }
            int height = ((getHeight() - coVar.Aa) - ((int) (coVar.W8(org.telegram.ui.Components.s21.c) + coVar.v.c()))) - AndroidUtilities.dp(57.0f);
            int i17 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            for (int i18 = 0; i18 < getChildCount(); i18++) {
                int top = getChildAt(i18).getTop();
                if (top < i17) {
                    i17 = top;
                }
            }
            if (coVar.N6 == 0 && i17 <= 0) {
                z12 = ((org.telegram.ui.ActionBar.n2) coVar).fragmentBeginToShow;
                coVar.L6(z12);
            }
            Paint W0 = W0("paintChatActionBackground");
            if (paint3.getColor() != W0.getColor()) {
                paint3.setColor(W0.getColor());
            }
            if (paint3.getShader() != W0.getShader()) {
                paint3.setShader(W0.getShader());
                colorMatrix.setSaturation(co.Ic);
                paint3.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            }
            int i19 = 0;
            while (i19 < getChildCount()) {
                View childAt = getChildAt(i19);
                if (childAt instanceof org.telegram.ui.Cells.t1) {
                    org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) childAt;
                    MessageObject.GroupedMessages currentMessagesGroup = t1Var.getCurrentMessagesGroup();
                    float top2 = childAt.getTop() + t1Var.y2(true).getBounds().top;
                    if (currentMessagesGroup != null) {
                        f11 = 1.0f;
                        f12 = r13.top + currentMessagesGroup.transitionParams.offsetTop;
                    } else {
                        f11 = 1.0f;
                        f12 = 0.0f;
                    }
                    int i20 = (int) (top2 + f12);
                    i13 = i19;
                    if (coVar.N6 == 0 && coVar.D9()) {
                        i20 = AndroidUtilities.lerp(height, i20, childAt.getAlpha());
                    } else if (childAt.getAlpha() != f11) {
                        i20 = height;
                    }
                    if (i20 < height) {
                        height = i20;
                    }
                } else {
                    i13 = i19;
                    if (childAt instanceof org.telegram.ui.Cells.w0) {
                        int lerp = (coVar.N6 == 0 && coVar.D9()) ? AndroidUtilities.lerp(height, childAt.getTop(), childAt.getAlpha()) : childAt.getAlpha() == 1.0f ? childAt.getTop() : height;
                        if (lerp < height) {
                            height = lerp;
                        }
                    }
                }
                i19 = i13 + 1;
            }
            if (coVar.D9()) {
                boolean z16 = SharedConfig.getDevicePerformanceClass() != 0 && org.telegram.ui.ActionBar.j6.a1();
                int i21 = org.telegram.ui.ActionBar.j6.d6;
                boolean z17 = i0.a.f(org.telegram.ui.ActionBar.j6.v0(i21, f6Var)) <= 0.699999988079071d && org.telegram.ui.ActionBar.j6.a1();
                boolean z18 = i0.a.f(org.telegram.ui.ActionBar.j6.v0(i21, f6Var)) <= 0.009999999776482582d && org.telegram.ui.ActionBar.j6.a1();
                if (z16) {
                    org.telegram.ui.ActionBar.j6.q(0.0f, getY() - coVar.w9, getMeasuredWidth(), AndroidUtilities.displaySize.y);
                }
                int alpha = org.telegram.ui.ActionBar.j6.h2.getAlpha();
                if (z18) {
                    org.telegram.ui.ActionBar.j6.h2.setAlpha((int) (alpha * 4.0f));
                }
                if (coVar.N6 != 0) {
                    z10 = z17;
                    f7 = 1.0f - ((System.currentTimeMillis() - coVar.N6) / 200.0f);
                } else {
                    z10 = z17;
                    f7 = 1.0f;
                }
                int alpha2 = paint2.getAlpha();
                int alpha3 = paint3.getAlpha();
                int alpha4 = paint.getAlpha();
                ao aoVar = coVar.ea;
                float f13 = (aoVar == null || !aoVar.G || paint3.getShader() == null) ? 1.0f : 0.3f;
                paint3.setAlpha((int) (255.0f * f7 * f13));
                float f14 = alpha2;
                paint2.setAlpha((int) (f7 * f13 * f14));
                paint.setAlpha((int) (f7 * f14));
                int i22 = 0;
                while (height > coVar.za) {
                    int dp3 = height - AndroidUtilities.dp(3.0f);
                    if (i22 >= arrayList4.size()) {
                        rnVar = new rn();
                        f5Var2 = f5Var4;
                        TLRPC.Chat chat2 = coVar.e;
                        if (chat2 == null || !ChatObject.isChannelAndNotMegaGroup(chat2)) {
                            z11 = z16;
                            rnVar.b = Utilities.fastRandom.nextInt(AndroidUtilities.dp(64.0f)) + AndroidUtilities.dp(64.0f);
                        } else {
                            z11 = z16;
                            rnVar.b = Utilities.fastRandom.nextInt(AndroidUtilities.dp(64.0f)) + AndroidUtilities.dp(128.0f);
                        }
                        rnVar.a = (int) Math.min((coVar.x0.getWidth() * 0.8f) - (z15 ? 0 : AndroidUtilities.dp(42.0f)), (((Utilities.fastRandom.nextFloat() * 0.35f) + 0.4f) * coVar.x0.getWidth()) + AndroidUtilities.dp(42.0f));
                        arrayList4.add(rnVar);
                    } else {
                        f5Var2 = f5Var4;
                        z11 = z16;
                        rnVar = (rn) arrayList4.get(i22);
                    }
                    boolean z19 = z10;
                    rnVar.c = coVar.N6 != 0 ? arrayList.size() <= 2 ? Math.min(rnVar.c, dp3) : rnVar.c : dp3;
                    height = dp3 - rnVar.b;
                    i22++;
                    z10 = z19;
                    z16 = z11;
                    f5Var4 = f5Var2;
                }
                org.telegram.ui.ActionBar.f5 f5Var5 = f5Var4;
                boolean z20 = z16;
                boolean z21 = z10;
                if (arrayList4.isEmpty()) {
                    dp = getHeight() - coVar.Aa;
                    i11 = 0;
                } else {
                    i11 = 0;
                    dp = ((rn) arrayList4.get(0)).c + AndroidUtilities.dp(3.0f);
                }
                int dp4 = AndroidUtilities.dp(z15 ? 3.0f : 51.0f);
                if (coVar.C9()) {
                    dp4 = AndroidUtilities.lerp(dp4, AndroidUtilities.dp(71.0f), coVar.Q8());
                }
                while (i11 < arrayList4.size() && dp > coVar.za) {
                    int dp5 = dp - AndroidUtilities.dp(3.0f);
                    rn rnVar2 = (rn) arrayList4.get(i11);
                    int i23 = rnVar2.c;
                    ArrayList arrayList5 = arrayList4;
                    boolean z22 = z21;
                    org.telegram.ui.ActionBar.f5 f5Var6 = f5Var5;
                    f5Var6.setBounds(dp4, i23 - rnVar2.b, rnVar2.a, i23);
                    m.c3 c3Var3 = c3Var2;
                    if (z20) {
                        f5Var6.d(canvas, c3Var3, paint3);
                    }
                    f5Var6.d(canvas, c3Var3, paint2);
                    if (z22) {
                        f5Var6.d(canvas, c3Var3, org.telegram.ui.ActionBar.j6.h2);
                    }
                    f5Var6.d(canvas, c3Var3, paint);
                    if (z15) {
                        c3Var2 = c3Var3;
                        i12 = dp4;
                        f5Var = f5Var6;
                    } else {
                        if (z20) {
                            f10 = 27.0f;
                            c3Var2 = c3Var3;
                            i12 = dp4;
                            canvas.drawCircle(AndroidUtilities.dp(27.0f), i23 - AndroidUtilities.dp(21.0f), AndroidUtilities.dp(21.0f), paint3);
                        } else {
                            c3Var2 = c3Var3;
                            i12 = dp4;
                            f10 = 27.0f;
                        }
                        canvas.drawCircle(AndroidUtilities.dp(f10), i23 - AndroidUtilities.dp(21.0f), AndroidUtilities.dp(21.0f), paint2);
                        if (z22) {
                            f5Var = f5Var6;
                            canvas.drawCircle(AndroidUtilities.dp(f10), i23 - AndroidUtilities.dp(21.0f), AndroidUtilities.dp(21.0f), org.telegram.ui.ActionBar.j6.h2);
                        } else {
                            f5Var = f5Var6;
                        }
                        canvas.drawCircle(AndroidUtilities.dp(f10), i23 - AndroidUtilities.dp(21.0f), AndroidUtilities.dp(21.0f), paint);
                    }
                    dp = dp5 - rnVar2.b;
                    i11++;
                    arrayList4 = arrayList5;
                    z21 = z22;
                    dp4 = i12;
                    f5Var5 = f5Var;
                }
                arrayList2 = arrayList4;
                paint3.setAlpha(alpha3);
                paint2.setAlpha(alpha2);
                paint.setAlpha(alpha4);
                org.telegram.ui.ActionBar.j6.h2.setAlpha(alpha);
                invalidate();
            } else {
                arrayList2 = arrayList4;
                if (System.currentTimeMillis() - coVar.N6 > j3) {
                    arrayList2.clear();
                }
            }
            arrayList2.size();
            arrayList.size();
            if (coVar.N9 != 0.0f) {
                canvas.restore();
            }
        }
        super.draw(canvas);
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x028a, code lost:
    
        if ((r4 & 1) != 0) goto L160;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:157:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x059f  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x05ad  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x05cf  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x05d6  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x05f2  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0603  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0644  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0653  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0685  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x069c  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x067c  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0637  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x05a5  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0199  */
    /* JADX WARN: Type inference failed for: r0v52, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v61, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11, types: [org.telegram.ui.Cells.n4] */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v15, types: [org.telegram.ui.Cells.n4] */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v18, types: [org.telegram.ui.Cells.n4] */
    /* JADX WARN: Type inference failed for: r11v41 */
    @Override // org.telegram.ui.Components.ll0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.Cells.t1 t1Var;
        boolean z10;
        org.telegram.ui.Cells.t1 t1Var2;
        int i10;
        org.telegram.ui.Cells.w0 w0Var;
        MessageObject.GroupedMessages groupedMessages;
        int i11;
        float f7;
        boolean z11;
        float f10;
        boolean z12;
        float f11;
        boolean z13;
        boolean z14;
        int paddingTop;
        float f12;
        float checkBoxTranslation;
        int i12;
        float f13;
        int b10;
        int b11;
        int i13;
        int i14;
        int i15;
        MessageObject messageObject;
        co coVar = this.y3;
        if (coVar.D9()) {
            invalidate();
        }
        boolean z15 = view == coVar.J8;
        boolean z16 = view instanceof org.telegram.ui.Cells.t1;
        if (z16) {
            t1Var = (org.telegram.ui.Cells.t1) view;
            z10 = t1Var.Zc.w0;
        } else {
            t1Var = null;
            z10 = false;
        }
        if ((!org.telegram.ui.Components.ov0.v0 && ((view.getY() > getMeasuredHeight() || view.getY() + view.getMeasuredHeight() < 0.0f) && !z10)) || view.getVisibility() == 4 || view.getVisibility() == 8) {
            z15 = true;
        }
        if (z16) {
            t1Var2 = (org.telegram.ui.Cells.t1) view;
            if (coVar.n6.contains(t1Var2)) {
                z15 = true;
            }
            MessageObject.GroupedMessagePosition currentPosition = t1Var2.getCurrentPosition();
            groupedMessages = t1Var2.getCurrentMessagesGroup();
            if (currentPosition != null) {
                int i16 = currentPosition.pw;
                int i17 = currentPosition.spanSize;
                if (i16 != i17 && i17 == 1000 && currentPosition.siblingHeights == null && groupedMessages.hasSibling) {
                    i10 = t1Var2.getBackgroundDrawableLeft();
                    i14 = 0;
                    i15 = t1Var2.K1;
                    if (i15 != 7) {
                    }
                    coVar.u8 = t1Var2;
                    if (!z15) {
                    }
                    if (z15) {
                    }
                    i11 = i14;
                    w0Var = null;
                } else if (currentPosition.siblingHeights != null) {
                    i14 = view.getBottom() - AndroidUtilities.dp((t1Var2.m3() ? 1 : 0) + 1);
                    i10 = 0;
                    i15 = t1Var2.K1;
                    if ((i15 != 7 || i15 == 4) && (messageObject = t1Var2.y7) != null && messageObject.type != 5 && MediaController.getInstance().isPlayingMessage(t1Var2.y7)) {
                        coVar.u8 = t1Var2;
                    }
                    if (!z15) {
                        View view2 = coVar.J8;
                        if (view2 instanceof org.telegram.ui.Cells.t1) {
                            org.telegram.ui.Cells.t1 t1Var3 = (org.telegram.ui.Cells.t1) view2;
                            if (t1Var3.getCurrentMessagesGroup() != null && t1Var3.getCurrentMessagesGroup() == groupedMessages) {
                                z15 = true;
                            }
                        }
                    }
                    if (z15) {
                        t1Var2.getPhotoImage().skipDraw();
                    }
                    i11 = i14;
                    w0Var = null;
                }
            }
            i10 = 0;
            i14 = 0;
            i15 = t1Var2.K1;
            if (i15 != 7) {
            }
            coVar.u8 = t1Var2;
            if (!z15) {
            }
            if (z15) {
            }
            i11 = i14;
            w0Var = null;
        } else {
            if (view instanceof org.telegram.ui.Cells.w0) {
                w0Var = (org.telegram.ui.Cells.w0) view;
                t1Var2 = null;
                i10 = 0;
            } else {
                t1Var2 = null;
                i10 = 0;
                w0Var = null;
            }
            groupedMessages = null;
            i11 = 0;
        }
        if (i10 != 0) {
            canvas.save();
        } else if (i11 != 0) {
            canvas.save();
        }
        if (z15) {
            z15 = false;
        }
        if (z15) {
            f7 = 0.0f;
            z11 = false;
        } else {
            boolean z17 = (t1Var2 == null || t1Var2.Zc.v1 || groupedMessages == null || !groupedMessages.transitionParams.backgroundChangeBounds) ? false : true;
            if (z17) {
                canvas.save();
                float E2 = t1Var2.E2(true);
                MessageObject.GroupedMessages.TransitionParams transitionParams = groupedMessages.transitionParams;
                float f14 = transitionParams.right + E2;
                f7 = 0.0f;
                canvas.clipRect(transitionParams.left + E2 + transitionParams.offsetLeft + AndroidUtilities.dp(4.0f), transitionParams.top + transitionParams.offsetTop + AndroidUtilities.dp(4.0f), (f14 + transitionParams.offsetRight) - AndroidUtilities.dp(4.0f), (transitionParams.bottom + transitionParams.offsetBottom) - AndroidUtilities.dp(4.0f));
            } else {
                f7 = 0.0f;
            }
            if (t1Var2 != null) {
                org.telegram.ui.Cells.s1 s1Var = t1Var2.Zc;
                if (s1Var.v1) {
                    canvas.save();
                    canvas.translate(t1Var2.getX(), t1Var2.getY());
                    t1Var2.S1(canvas);
                    canvas.restore();
                    z11 = s1Var.g;
                    if (z17) {
                        canvas.restore();
                    }
                    if (t1Var2 == null && t1Var2.U2()) {
                        canvas.save();
                        canvas.translate(t1Var2.getX(), t1Var2.getPaddingTopAnimated() + t1Var2.getY());
                        t1Var2.X1(canvas);
                        canvas.restore();
                    } else if (w0Var != null) {
                        canvas.save();
                        canvas.translate(w0Var.getX(), w0Var.getY());
                        w0Var.A(canvas);
                        canvas.restore();
                    }
                }
            }
            z11 = (t1Var2 == null || !z17) ? super.drawChild(canvas, view, j3) : super.drawChild(canvas, view, j3);
            if (z17) {
            }
            if (t1Var2 == null) {
            }
            if (w0Var != null) {
            }
        }
        if (i10 != 0 || i11 != 0) {
            canvas.restore();
        }
        if (view.getTranslationY() != f7) {
            canvas.save();
            f10 = 0.0f;
            canvas.translate(0.0f, view.getTranslationY());
        } else {
            f10 = 0.0f;
        }
        if (t1Var2 != null) {
            t1Var2.K1(canvas);
        }
        if (view.getTranslationY() != f10) {
            canvas.restore();
        }
        if (view.getTranslationY() != f10) {
            canvas.save();
            canvas.translate(f10, view.getTranslationY());
        }
        if (t1Var2 != null) {
            MessageObject messageObject2 = t1Var2.getMessageObject();
            MessageObject.GroupedMessagePosition currentPosition2 = t1Var2.getCurrentPosition();
            if (!z15) {
                if (currentPosition2 != null || t1Var2.getTransitionParams().w0) {
                    if (currentPosition2 == null || currentPosition2.last || (currentPosition2.minX == 0 && currentPosition2.minY == 0)) {
                        if (currentPosition2 == null || currentPosition2.last) {
                            this.Z2.add(t1Var2);
                        }
                        if ((currentPosition2 == null || (currentPosition2.minX == 0 && currentPosition2.minY == 0)) && t1Var2.T2()) {
                            this.a3.add(t1Var2);
                        }
                    }
                    if (currentPosition2 != null || t1Var2.getTransitionParams().C0 || t1Var2.getTransitionParams().w0) {
                        if (currentPosition2 == null || (currentPosition2.flags & t1Var2.t0()) != 0) {
                            this.b3.add(t1Var2);
                        }
                        if (currentPosition2 != null) {
                            int i18 = currentPosition2.flags;
                            if ((i18 & 8) != 0) {
                            }
                        }
                        this.c3.add(t1Var2);
                    }
                }
                if (coVar.t8 != null && ((messageObject2.isRoundVideo() || messageObject2.isVideo()) && !messageObject2.isVoiceTranscriptionOpen() && MediaController.getInstance().isPlayingMessage(messageObject2))) {
                    ImageReceiver photoImage = t1Var2.getPhotoImage();
                    float x10 = t1Var2.getX() + photoImage.getImageX();
                    float y3 = (coVar.x0.getY() + (photoImage.getImageY() + (t1Var2.getY() + t1Var2.getPaddingTop()))) - coVar.t8.getTop();
                    if (coVar.t8.getTranslationX() != x10 || coVar.t8.getTranslationY() != y3) {
                        coVar.t8.setTranslationX(x10);
                        coVar.t8.setTranslationY(y3);
                        coVar.fragmentView.invalidate();
                        coVar.t8.invalidate();
                    }
                }
            }
        }
        if (t1Var != null) {
            MessageObject messageObject3 = t1Var.getMessageObject();
            MessageObject.GroupedMessagePosition currentPosition3 = t1Var.getCurrentPosition();
            ImageReceiver avatarImage = t1Var.getAvatarImage();
            if (avatarImage != null && coVar.Q8() < 1.0f) {
                MessageObject.GroupedMessages X8 = coVar.X8(messageObject3);
                if (!t1Var.getMessageObject().deleted) {
                    coVar.x0.getClass();
                    if (RecyclerView.R(view) != -1) {
                        z13 = true;
                        z14 = !coVar.x0.X1 || (X8 != null && X8.transitionParams.backgroundChangeBounds);
                        paddingTop = view.getPaddingTop() + (!z14 ? view.getTop() : (int) view.getY());
                        if (t1Var.j()) {
                            if (t1Var.oc) {
                                b11 = ((SparseArray) coVar.W8.j).indexOfValue(view);
                                if (b11 >= 0) {
                                    b11 = ((SparseArray) coVar.W8.j).keyAt(b11);
                                }
                            } else {
                                b11 = coVar.x0.T(view).b();
                            }
                            if (b11 >= 0) {
                                if (X8 == null || currentPosition3 == null) {
                                    z12 = z11;
                                    f12 = 1.0f;
                                    i13 = b11 - 1;
                                } else {
                                    int indexOf = X8.posArray.indexOf(currentPosition3);
                                    f12 = 1.0f;
                                    int size = X8.posArray.size();
                                    if ((currentPosition3.flags & 8) != 0) {
                                        i13 = (b11 - size) + indexOf;
                                    } else {
                                        i13 = b11 - 1;
                                        int i19 = indexOf + 1;
                                        while (i19 < size) {
                                            z12 = z11;
                                            if (X8.posArray.get(i19).minY > currentPosition3.maxY) {
                                                break;
                                            }
                                            i13--;
                                            i19++;
                                            z11 = z12;
                                        }
                                    }
                                    z12 = z11;
                                }
                                if (t1Var.oc) {
                                    if (((View) ((SparseArray) coVar.W8.j).get(i13)) != null) {
                                        if (view.getTranslationY() != 0.0f) {
                                            canvas.restore();
                                        }
                                        avatarImage.setVisible(false, false);
                                        return z12;
                                    }
                                } else if (coVar.x0.K(i13) != null) {
                                    if (view.getTranslationY() != 0.0f) {
                                        canvas.restore();
                                    }
                                    avatarImage.setVisible(false, false);
                                    return z12;
                                }
                                checkBoxTranslation = t1Var.getCheckBoxTranslation() + t1Var.getSlidingOffsetX();
                                int layoutHeight = (int) (t1Var2.getLayoutHeight() + t1Var2.getTransitionParams().i0 + ((int) (t1Var.getPaddingTopAnimated() + ((int) (0 + (z14 ? view.getTop() : view.getY()))))));
                                int measuredHeight = coVar.x0.getMeasuredHeight() - coVar.x0.getPaddingBottom();
                                boolean z18 = (!t1Var.m1 || t1Var.n1) && checkBoxTranslation == 0.0f;
                                if (!t1Var.o3() || t1Var.getTransitionParams().k2) {
                                    if (t1Var.getTransitionParams().k2) {
                                        float f15 = t1Var.getTransitionParams().K1;
                                        if (!t1Var.o3()) {
                                            f15 = f12 - f15;
                                        }
                                        layoutHeight = (int) com.google.android.gms.internal.vision.e2.z(1.0f, f15, Math.min(layoutHeight, measuredHeight), layoutHeight * f15);
                                    }
                                } else if (layoutHeight > measuredHeight) {
                                    layoutHeight = measuredHeight;
                                }
                                if (!z14 && view.getTranslationY() != 0.0f) {
                                    canvas.restore();
                                }
                                if (t1Var.h()) {
                                    if (t1Var.oc) {
                                        b10 = ((SparseArray) coVar.W8.j).indexOfValue(view);
                                        if (b10 >= 0) {
                                            b10 = ((SparseArray) coVar.W8.j).keyAt(b10);
                                        }
                                    } else {
                                        b10 = coVar.x0.T(view).b();
                                    }
                                    if (b10 >= 0) {
                                        float f16 = checkBoxTranslation;
                                        ?? r11 = t1Var;
                                        int i20 = b10;
                                        int i21 = 0;
                                        while (i21 < 20) {
                                            i21++;
                                            if (X8 == null || currentPosition3 == null) {
                                                i12 = layoutHeight;
                                                i20++;
                                            } else {
                                                int indexOf2 = X8.posArray.indexOf(currentPosition3);
                                                if (indexOf2 < 0) {
                                                    break;
                                                }
                                                i12 = layoutHeight;
                                                X8.posArray.size();
                                                if ((currentPosition3.flags & 4) != 0) {
                                                    i20 = i20 + indexOf2 + 1;
                                                } else {
                                                    i20++;
                                                    for (int i22 = indexOf2 - 1; i22 >= 0 && X8.posArray.get(i22).maxY >= currentPosition3.minY; i22--) {
                                                        i20++;
                                                    }
                                                }
                                            }
                                            if (!r11.i()) {
                                                s4.c1 K = coVar.x0.K(i20);
                                                if (K == null) {
                                                    break;
                                                }
                                                ?? r02 = K.a;
                                                paddingTop = r02.getPaddingTop() + r02.getTop();
                                                if (!(r02 instanceof org.telegram.ui.Cells.t1)) {
                                                    break;
                                                }
                                                r11 = (org.telegram.ui.Cells.n4) r02;
                                                float checkBoxTranslation2 = r11.getCheckBoxTranslation() + r11.getSlidingOffsetX();
                                                if (z18 && checkBoxTranslation2 > 0.0f) {
                                                    f16 = checkBoxTranslation2;
                                                }
                                                if (!r11.h()) {
                                                    break;
                                                }
                                                layoutHeight = i12;
                                                r11 = r11;
                                            } else {
                                                ?? r03 = (View) ((SparseArray) coVar.W8.j).get(i20);
                                                if (r03 == 0) {
                                                    break;
                                                }
                                                paddingTop = r03.getPaddingTop() + r03.getTop();
                                                if (!(r03 instanceof org.telegram.ui.Cells.n4)) {
                                                    break;
                                                }
                                                r11 = (org.telegram.ui.Cells.n4) r03;
                                                float checkBoxTranslation3 = r11.getCheckBoxTranslation() + r11.getSlidingOffsetX();
                                                if (z18 && checkBoxTranslation3 > 0.0f) {
                                                    f16 = checkBoxTranslation3;
                                                }
                                                if (!r11.h()) {
                                                    break;
                                                }
                                                layoutHeight = i12;
                                                r11 = r11;
                                            }
                                            int dp = i12 - AndroidUtilities.dp(48.0f) < paddingTop ? AndroidUtilities.dp(48.0f) + paddingTop : i12;
                                            if (!t1Var.j()) {
                                                int bottom = z14 ? view.getBottom() : (int) (t1Var.getDeltaBottom() + t1Var.getY() + t1Var.getMeasuredHeight());
                                                if (dp > bottom) {
                                                    dp = bottom;
                                                }
                                            }
                                            canvas.save();
                                            if (checkBoxTranslation != 0.0f) {
                                                canvas.translate(checkBoxTranslation, 0.0f);
                                            }
                                            if (t1Var instanceof org.telegram.ui.Cells.t1) {
                                                org.telegram.ui.Cells.t1 t1Var4 = t1Var;
                                                if (t1Var4.getCurrentMessagesGroup() != null && t1Var4.getCurrentMessagesGroup().transitionParams.backgroundChangeBounds) {
                                                    dp = (int) (dp - t1Var4.getTranslationY());
                                                }
                                            }
                                            if (z13) {
                                                avatarImage.setImageY(dp - AndroidUtilities.dp(44.0f));
                                            }
                                            if (t1Var.a()) {
                                                avatarImage.setAlpha(t1Var.getAlpha() * (1.0f - coVar.Q8()));
                                                canvas.scale(t1Var.getScaleX(), t1Var.getScaleY(), t1Var.getPivotX() + t1Var.getX(), t1Var.getY() + (t1Var.getHeight() >> 1));
                                                f13 = 1.0f;
                                            } else {
                                                f13 = 1.0f;
                                                avatarImage.setAlpha(1.0f - coVar.Q8());
                                            }
                                            if (z13) {
                                                avatarImage.setVisible(true, false);
                                            }
                                            if (coVar.Q8() > 0.0f) {
                                                canvas.scale(f13 - coVar.Q8(), f13 - coVar.Q8(), avatarImage.getImageX2(), avatarImage.getImageY2());
                                                f11 = 0.0f;
                                                canvas.translate(coVar.Q8() * AndroidUtilities.dp(24.0f), 0.0f);
                                            } else {
                                                f11 = 0.0f;
                                            }
                                            avatarImage.draw(canvas);
                                            canvas.restore();
                                            if (!z14 && view.getTranslationY() != f11) {
                                                canvas.save();
                                            }
                                            if (view.getTranslationY() != f11) {
                                                canvas.restore();
                                            }
                                            return z12;
                                        }
                                        i12 = layoutHeight;
                                        t1Var = r11;
                                        checkBoxTranslation = f16;
                                        if (i12 - AndroidUtilities.dp(48.0f) < paddingTop) {
                                        }
                                        if (!t1Var.j()) {
                                        }
                                        canvas.save();
                                        if (checkBoxTranslation != 0.0f) {
                                        }
                                        if (t1Var instanceof org.telegram.ui.Cells.t1) {
                                        }
                                        if (z13) {
                                        }
                                        if (t1Var.a()) {
                                        }
                                        if (z13) {
                                        }
                                        if (coVar.Q8() > 0.0f) {
                                        }
                                        avatarImage.draw(canvas);
                                        canvas.restore();
                                        if (!z14) {
                                            canvas.save();
                                        }
                                        if (view.getTranslationY() != f11) {
                                        }
                                        return z12;
                                    }
                                }
                                i12 = layoutHeight;
                                if (i12 - AndroidUtilities.dp(48.0f) < paddingTop) {
                                }
                                if (!t1Var.j()) {
                                }
                                canvas.save();
                                if (checkBoxTranslation != 0.0f) {
                                }
                                if (t1Var instanceof org.telegram.ui.Cells.t1) {
                                }
                                if (z13) {
                                }
                                if (t1Var.a()) {
                                }
                                if (z13) {
                                }
                                if (coVar.Q8() > 0.0f) {
                                }
                                avatarImage.draw(canvas);
                                canvas.restore();
                                if (!z14) {
                                }
                                if (view.getTranslationY() != f11) {
                                }
                                return z12;
                            }
                        }
                        z12 = z11;
                        f12 = 1.0f;
                        checkBoxTranslation = t1Var.getCheckBoxTranslation() + t1Var.getSlidingOffsetX();
                        int layoutHeight2 = (int) (t1Var2.getLayoutHeight() + t1Var2.getTransitionParams().i0 + ((int) (t1Var.getPaddingTopAnimated() + ((int) (0 + (z14 ? view.getTop() : view.getY()))))));
                        int measuredHeight2 = coVar.x0.getMeasuredHeight() - coVar.x0.getPaddingBottom();
                        if (t1Var.m1) {
                        }
                        if (t1Var.o3()) {
                        }
                        if (t1Var.getTransitionParams().k2) {
                        }
                        if (!z14) {
                            canvas.restore();
                        }
                        if (t1Var.h()) {
                        }
                        i12 = layoutHeight2;
                        if (i12 - AndroidUtilities.dp(48.0f) < paddingTop) {
                        }
                        if (!t1Var.j()) {
                        }
                        canvas.save();
                        if (checkBoxTranslation != 0.0f) {
                        }
                        if (t1Var instanceof org.telegram.ui.Cells.t1) {
                        }
                        if (z13) {
                        }
                        if (t1Var.a()) {
                        }
                        if (z13) {
                        }
                        if (coVar.Q8() > 0.0f) {
                        }
                        avatarImage.draw(canvas);
                        canvas.restore();
                        if (!z14) {
                        }
                        if (view.getTranslationY() != f11) {
                        }
                        return z12;
                    }
                }
                z13 = false;
                if (coVar.x0.X1) {
                }
                paddingTop = view.getPaddingTop() + (!z14 ? view.getTop() : (int) view.getY());
                if (t1Var.j()) {
                }
                z12 = z11;
                f12 = 1.0f;
                checkBoxTranslation = t1Var.getCheckBoxTranslation() + t1Var.getSlidingOffsetX();
                int layoutHeight22 = (int) (t1Var2.getLayoutHeight() + t1Var2.getTransitionParams().i0 + ((int) (t1Var.getPaddingTopAnimated() + ((int) (0 + (z14 ? view.getTop() : view.getY()))))));
                int measuredHeight22 = coVar.x0.getMeasuredHeight() - coVar.x0.getPaddingBottom();
                if (t1Var.m1) {
                }
                if (t1Var.o3()) {
                }
                if (t1Var.getTransitionParams().k2) {
                }
                if (!z14) {
                }
                if (t1Var.h()) {
                }
                i12 = layoutHeight22;
                if (i12 - AndroidUtilities.dp(48.0f) < paddingTop) {
                }
                if (!t1Var.j()) {
                }
                canvas.save();
                if (checkBoxTranslation != 0.0f) {
                }
                if (t1Var instanceof org.telegram.ui.Cells.t1) {
                }
                if (z13) {
                }
                if (t1Var.a()) {
                }
                if (z13) {
                }
                if (coVar.Q8() > 0.0f) {
                }
                avatarImage.draw(canvas);
                canvas.restore();
                if (!z14) {
                }
                if (view.getTranslationY() != f11) {
                }
                return z12;
            }
        }
        z12 = z11;
        f11 = 0.0f;
        if (view.getTranslationY() != f11) {
        }
        return z12;
    }

    @Override // org.telegram.ui.Components.ll0
    public final void g1(View view, float f7, float f10, boolean z10) {
        MessageObject.GroupedMessages currentMessagesGroup;
        super.g1(view, f7, f10, z10);
        if (view instanceof org.telegram.ui.Cells.t1) {
            org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view;
            MessageObject messageObject = t1Var.getMessageObject();
            if (messageObject.isMusic() || messageObject.isDocument() || (currentMessagesGroup = t1Var.getCurrentMessagesGroup()) == null) {
                return;
            }
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = getChildAt(i10);
                if (childAt != view && (childAt instanceof org.telegram.ui.Cells.t1)) {
                    org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) childAt;
                    if (t1Var2.getCurrentMessagesGroup() == currentMessagesGroup) {
                        t1Var2.setPressed(z10);
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:190:0x0700  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x07ee  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x070d  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0891  */
    /* JADX WARN: Removed duplicated region for block: B:222:? A[RETURN, SYNTHETIC] */
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float f7;
        float f10;
        aq aqVar;
        int i10;
        float f11;
        int i11;
        String string;
        String string2;
        String string3;
        int i12;
        TLRPC.TL_forumTopic tL_forumTopic;
        int i13;
        Paint paint;
        Paint paint2;
        int i14;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        Paint paint3;
        float f17;
        Paint paint4;
        Paint paint5;
        float f18;
        float f19;
        float f20;
        org.telegram.ui.ActionBar.f6 f6Var;
        int i15;
        float f21;
        float f22;
        super.onDraw(canvas);
        co coVar = this.y3;
        org.telegram.ui.Cells.t1 t1Var = coVar.d9;
        if (t1Var != null) {
            float slidingOffsetX = com.google.android.gms.internal.vision.e2.u(t1Var) ? t1Var.getSlidingOffsetX() : 0.0f;
            if (!coVar.e9 && !coVar.f9 && this.j3 != 0.0f && slidingOffsetX != 0.0f) {
                long currentTimeMillis = System.currentTimeMillis();
                float f23 = ((currentTimeMillis - this.h3) / 180.0f) + this.i3;
                this.i3 = f23;
                if (f23 > 1.0f) {
                    this.i3 = 1.0f;
                }
                this.h3 = currentTimeMillis;
                float interpolation = (1.0f - AndroidUtilities.decelerateInterpolator.getInterpolation(this.i3)) * this.j3;
                if (interpolation == 0.0f) {
                    this.j3 = 0.0f;
                }
                org.telegram.ui.Cells.t1 t1Var2 = coVar.d9;
                if (com.google.android.gms.internal.vision.e2.u(t1Var2)) {
                    y1(t1Var2, interpolation);
                }
                co.V1(coVar, interpolation);
                MessageObject T1 = co.T1(coVar);
                if (T1 != null && (T1.isRoundVideo() || T1.isVideo())) {
                    coVar.Mc(false, false);
                }
                float f24 = this.i3;
                if (f24 == 1.0f || f24 == 0.0f) {
                    co.V1(coVar, 0.0f);
                    coVar.d9 = null;
                }
                invalidate();
            }
            if (coVar.d9 != null && Thread.currentThread() == Looper.getMainLooper().getThread()) {
                Paint W0 = W0("paintChatActionBackground");
                Paint paint6 = org.telegram.ui.ActionBar.j6.h2;
                Paint paint7 = this.m3;
                if (paint7.getColor() != W0.getColor()) {
                    paint7.setColor(W0.getColor());
                }
                Paint paint8 = this.n3;
                if (paint8.getColor() != paint6.getColor()) {
                    paint8.setColor(paint6.getColor());
                }
                if (paint7.getShader() != W0.getShader()) {
                    paint7.setShader(W0.getShader());
                }
                if (paint8.getShader() != paint6.getShader()) {
                    paint8.setShader(paint6.getShader());
                }
                o1.j jVar = this.q3;
                float f25 = jVar.a;
                float f26 = this.l3;
                float f27 = f25 / f26;
                f7 = 255.0f;
                int color = paint8.getColor();
                if (f27 > 1.0f) {
                    this.u3 = true;
                }
                f10 = 2.0f;
                org.telegram.ui.Cells.t1 t1Var3 = coVar.d9;
                float E2 = com.google.android.gms.internal.vision.e2.u(t1Var3) ? t1Var3.E2(false) : 0.0f;
                o1.j jVar2 = this.o3;
                float f28 = jVar2.a;
                o1.j jVar3 = this.s3;
                o1.k kVar = this.t3;
                o1.k kVar2 = this.r3;
                if (f28 == 0.0f) {
                    kVar2.c();
                    paint = paint6;
                    paint2 = paint7;
                    i14 = color;
                    double d = 0.0f;
                    kVar2.u.i = d;
                    jVar.a = 0.0f;
                    kVar.c();
                    kVar.u.i = d;
                    jVar3.a = 0.0f;
                    this.u3 = false;
                } else {
                    paint = paint6;
                    paint2 = paint7;
                    i14 = color;
                }
                if (((float) kVar2.u.i) != f26) {
                    f12 = 1.0f;
                    f13 = w7.p.a(((-E2) - AndroidUtilities.dp(20.0f)) / AndroidUtilities.dp(30.0f), 0.0f, 1.0f);
                } else {
                    f12 = 1.0f;
                    f13 = 1.0f;
                }
                if (f13 == f12) {
                    o1.l lVar = kVar2.u;
                    f14 = f27;
                    f15 = 20.0f;
                    if (((float) lVar.i) != f26) {
                        double d10 = f26;
                        lVar.i = d10;
                        kVar2.f();
                        kVar.u.i = d10;
                        kVar.f();
                    }
                } else {
                    f14 = f27;
                    f15 = 20.0f;
                }
                float f29 = E2 <= ((float) (-AndroidUtilities.dp(f15))) ? f26 : 0.0f;
                o1.k kVar3 = this.p3;
                o1.l lVar2 = kVar3.u;
                if (f29 != ((float) lVar2.i)) {
                    lVar2.i = f29;
                    if (!kVar3.f) {
                        kVar3.f();
                    }
                }
                float f30 = jVar2.a / f26;
                MessageObject T12 = co.T1(coVar);
                float measuredWidth = (E2 * ((T12 == null || !T12.isOut()) ? 1.0f : 0.5f)) + getMeasuredWidth();
                float measuredHeight = (coVar.d9.getMeasuredHeight() / 2.0f) + coVar.d9.getTop();
                boolean z10 = this.u3;
                float f31 = z10 ? f14 : f30;
                float f32 = z10 ? 0.0f : 1.0f - f14;
                int i16 = org.telegram.ui.ActionBar.j6.d6;
                org.telegram.ui.ActionBar.f6 f6Var2 = this.p2;
                boolean z11 = i0.a.f(org.telegram.ui.ActionBar.j6.v0(i16, f6Var2)) <= 0.5d;
                if (f30 != 0.0f) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    f18 = f26;
                    rectF.set((int) ((paint2.getStrokeWidth() / 2.0f) + (measuredWidth - (AndroidUtilities.dp(16.0f) * f31))), (int) ((paint2.getStrokeWidth() / 2.0f) + (measuredHeight - (AndroidUtilities.dp(16.0f) * f31))), (int) (((AndroidUtilities.dp(16.0f) * f31) + measuredWidth) - (paint2.getStrokeWidth() / 2.0f)), (int) (((AndroidUtilities.dp(16.0f) * f31) + measuredHeight) - (paint2.getStrokeWidth() / 2.0f)));
                    org.telegram.ui.ActionBar.j6.q(0.0f, getY() + rectF.top, getMeasuredWidth(), AndroidUtilities.displaySize.y);
                    if (f14 == 0.0f) {
                        int alpha = paint2.getAlpha();
                        Paint paint9 = paint2;
                        paint9.setAlpha((int) (alpha * f30));
                        float f33 = f13 * 360.0f;
                        f16 = f13;
                        f19 = f30;
                        paint3 = paint;
                        f6Var = f6Var2;
                        f17 = measuredWidth;
                        f20 = measuredHeight;
                        canvas.drawArc(rectF, -90.0f, f33, false, paint9);
                        paint9.setAlpha(alpha);
                        if (coVar.ea.o0()) {
                            int alpha2 = paint8.getAlpha();
                            paint5 = paint8;
                            if (z11) {
                                paint5.setColor(-1);
                            }
                            paint5.setAlpha((int) (alpha2 * f19));
                            paint4 = paint9;
                            canvas2 = canvas;
                            canvas2.drawArc(rectF, -90.0f, f33, false, paint5);
                        } else {
                            paint4 = paint9;
                            paint5 = paint8;
                            canvas2 = canvas;
                        }
                    } else {
                        Paint paint10 = paint2;
                        f16 = f13;
                        paint3 = paint;
                        f17 = measuredWidth;
                        paint4 = paint10;
                        canvas2 = canvas;
                        f19 = f30;
                        f6Var = f6Var2;
                        paint5 = paint8;
                        f20 = measuredHeight;
                    }
                } else {
                    Paint paint11 = paint2;
                    f16 = f13;
                    paint3 = paint;
                    f17 = measuredWidth;
                    paint4 = paint11;
                    canvas2 = canvas;
                    paint5 = paint8;
                    f18 = f26;
                    f19 = f30;
                    f20 = measuredHeight;
                    f6Var = f6Var2;
                }
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set((int) (f17 - (AndroidUtilities.dp(16.0f) * f31)), (int) (f20 - (AndroidUtilities.dp(16.0f) * f31)), (int) ((AndroidUtilities.dp(16.0f) * f31) + f17), (int) ((AndroidUtilities.dp(16.0f) * f31) + f20));
                org.telegram.ui.ActionBar.j6.q(0.0f, getY() + rectF2.top, getMeasuredWidth(), AndroidUtilities.displaySize.y);
                Path path = this.v3;
                path.rewind();
                Path.Direction direction = Path.Direction.CW;
                path.addRoundRect(rectF2, AndroidUtilities.dp(16.0f) * f31, AndroidUtilities.dp(16.0f) * f31, direction);
                int alpha3 = W0.getAlpha();
                float f34 = 0.6f * f19 * f16;
                W0.setAlpha((int) (alpha3 * f34));
                canvas2.drawPath(path, W0);
                W0.setAlpha(alpha3);
                if (coVar.ea.o0()) {
                    int alpha4 = org.telegram.ui.ActionBar.j6.h2.getAlpha();
                    if (z11) {
                        f22 = f34;
                        org.telegram.ui.ActionBar.j6.h2.setColor(-1);
                    } else {
                        f22 = f34;
                    }
                    org.telegram.ui.ActionBar.j6.h2.setAlpha((int) (alpha4 * f22));
                    canvas2.drawPath(path, org.telegram.ui.ActionBar.j6.h2);
                    org.telegram.ui.ActionBar.j6.h2.setAlpha(alpha4);
                }
                int i17 = (f32 > 0.0f ? 1 : (f32 == 0.0f ? 0 : -1));
                if (i17 != 0) {
                    i15 = i17;
                    f21 = f31;
                    rectF2.set((int) (f17 - (AndroidUtilities.dp(16.0f) * f32)), (int) (f20 - (AndroidUtilities.dp(16.0f) * f32)), (int) ((AndroidUtilities.dp(16.0f) * f32) + f17), (int) ((AndroidUtilities.dp(16.0f) * f32) + f20));
                    path.rewind();
                    path.addRoundRect(rectF2, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), direction);
                    canvas2.save();
                    canvas2.clipPath(path, Region.Op.DIFFERENCE);
                } else {
                    i15 = i17;
                    f21 = f31;
                }
                rectF2.set((int) (f17 - (AndroidUtilities.dp(16.0f) * f21)), (int) (f20 - (AndroidUtilities.dp(16.0f) * f21)), (int) ((AndroidUtilities.dp(16.0f) * f21) + f17), (int) ((AndroidUtilities.dp(16.0f) * f21) + f20));
                org.telegram.ui.ActionBar.j6.q(0.0f, getY() + rectF2.top, getMeasuredWidth(), AndroidUtilities.displaySize.y);
                path.rewind();
                path.addRoundRect(rectF2, AndroidUtilities.dp(16.0f) * f21, AndroidUtilities.dp(16.0f) * f21, direction);
                int alpha5 = W0.getAlpha();
                float f35 = 0.4f * f19;
                W0.setAlpha((int) (alpha5 * f35));
                canvas2.drawPath(path, W0);
                W0.setAlpha(alpha5);
                if (coVar.ea.o0()) {
                    int alpha6 = org.telegram.ui.ActionBar.j6.h2.getAlpha();
                    if (z11) {
                        org.telegram.ui.ActionBar.j6.h2.setColor(-1);
                    }
                    org.telegram.ui.ActionBar.j6.h2.setAlpha((int) (f35 * alpha6));
                    canvas2.drawPath(path, org.telegram.ui.ActionBar.j6.h2);
                    org.telegram.ui.ActionBar.j6.h2.setAlpha(alpha6);
                }
                if (i15 != 0) {
                    canvas2.restore();
                }
                float f36 = jVar3.a / f18;
                if (f36 != 0.0f && f36 != 1.0f) {
                    float f37 = f36 + 1.0f;
                    float strokeWidth = paint4.getStrokeWidth();
                    float f38 = (1.0f - f36) * strokeWidth;
                    if (f38 != 0.0f) {
                        rectF2.set((int) ((f17 - (AndroidUtilities.dp(16.0f) * f37)) + f38), (int) ((f20 - (AndroidUtilities.dp(16.0f) * f37)) + f38), (int) (((AndroidUtilities.dp(16.0f) * f37) + f17) - f38), (int) (((AndroidUtilities.dp(16.0f) * f37) + f20) - f38));
                        org.telegram.ui.ActionBar.j6.q(0.0f, getY() + rectF2.top, getMeasuredWidth(), AndroidUtilities.displaySize.y);
                        int alpha7 = paint4.getAlpha();
                        paint4.setAlpha((int) (alpha7 * f19));
                        paint4.setStrokeWidth(f38);
                        canvas2.drawRoundRect(rectF2, AndroidUtilities.dp(16.0f) * f37, AndroidUtilities.dp(16.0f) * f37, paint4);
                        paint4.setStrokeWidth(strokeWidth);
                        paint4.setAlpha(alpha7);
                        if (coVar.ea.o0()) {
                            int alpha8 = paint5.getAlpha();
                            if (z11) {
                                paint5.setColor(-1);
                            }
                            paint5.setAlpha((int) (alpha8 * f19));
                            paint5.setStrokeWidth(f38);
                            canvas2.drawRoundRect(rectF2, AndroidUtilities.dp(16.0f) * f37, AndroidUtilities.dp(16.0f) * f37, paint5);
                            paint5.setStrokeWidth(strokeWidth);
                        }
                    }
                }
                int i18 = (int) (f19 * 255.0f);
                Drawable drawable = f6Var != null ? f6Var.getDrawable("drawableReplyIcon") : null;
                if (drawable == null) {
                    drawable = org.telegram.ui.ActionBar.j6.O0("drawableReplyIcon");
                }
                drawable.setAlpha(i18);
                drawable.setBounds((int) (f17 - ((drawable.getIntrinsicWidth() / 2) * f21)), (int) (f20 - ((drawable.getIntrinsicHeight() / 2) * f21)), (int) (((drawable.getIntrinsicWidth() / 2) * f21) + f17), (int) (((drawable.getIntrinsicHeight() / 2) * f21) + f20));
                drawable.draw(canvas2);
                drawable.setAlpha(255);
                int i19 = i14;
                paint5.setColor(i19);
                paint3.setColor(i19);
                if (coVar.N9 != 0.0f || coVar.isInPreviewMode() || coVar.Oa || (i10 = coVar.R3) == 3 || i10 == 1) {
                    aqVar = coVar.P9;
                    if (aqVar == null) {
                        aqVar.O = 0.0f;
                        aqVar.N = false;
                        return;
                    }
                    return;
                }
                canvas2.save();
                if (coVar.U9 != 0.0f) {
                    float measuredHeight2 = coVar.x0.getMeasuredHeight() - coVar.N9;
                    co coVar2 = coVar.T9;
                    f11 = (measuredHeight2 + (coVar2 == null ? 0.0f : coVar2.O9)) * coVar.U9;
                } else {
                    f11 = 0.0f;
                }
                canvas2.translate(0.0f, (getMeasuredHeight() - coVar.Aa) - f11);
                if (coVar.P9 == null) {
                    i13 = ((org.telegram.ui.ActionBar.n2) coVar).currentAccount;
                    aq aqVar2 = new aq(i13, coVar.fragmentView, coVar.T5, coVar.ua, coVar.va, coVar.d(), coVar.ea);
                    coVar.P9 = aqVar2;
                    aqVar2.S = coVar.uc.e;
                    ArrayList arrayList = coVar.fb;
                    if (arrayList != null && !arrayList.isEmpty()) {
                        coVar.P9.i((TLRPC.Chat) coVar.fb.get(0));
                    } else if (coVar.h4) {
                        coVar.P9.j();
                    } else {
                        coVar.P9.h();
                    }
                    coVar.P9.f();
                }
                aq aqVar3 = coVar.P9;
                int measuredWidth2 = getMeasuredWidth() - (coVar.C9() ? AndroidUtilities.dp(71.0f) : 0);
                ImageReceiver imageReceiver = aqVar3.F;
                TextPaint textPaint = aqVar3.f;
                TextPaint textPaint2 = aqVar3.h;
                boolean z12 = aqVar3.X;
                if (measuredWidth2 != aqVar3.c || (z12 && (tL_forumTopic = aqVar3.H) != null && aqVar3.I != tL_forumTopic.id)) {
                    aqVar3.d = AndroidUtilities.dp(56.0f) / f10;
                    aqVar3.c = measuredWidth2;
                    TLRPC.Chat chat = aqVar3.G;
                    if (chat != null) {
                        string = chat.title;
                    } else {
                        TLRPC.TL_forumTopic tL_forumTopic2 = aqVar3.H;
                        if (tL_forumTopic2 != null) {
                            string = tL_forumTopic2.title;
                        } else {
                            if (z12) {
                                i11 = 0;
                                string = LocaleController.formatString(R.string.SwipeToGoNextTopicEnd, MessagesController.getInstance(aqVar3.e0).getChat(Long.valueOf(-aqVar3.i0)).title);
                            } else {
                                i11 = 0;
                                string = LocaleController.getString(R.string.SwipeToGoNextChannelEnd);
                            }
                            int measureText = (int) textPaint.measureText((CharSequence) string, i11, string.length());
                            aqVar3.x = measureText;
                            int min = Math.min(measureText, aqVar3.c - AndroidUtilities.dp(60.0f));
                            aqVar3.x = min;
                            aqVar3.s = org.telegram.ui.Components.iw0.c(string, textPaint, min, Layout.Alignment.ALIGN_NORMAL, 0.0f, false, TextUtils.TruncateAt.END, min, 1, true);
                            if (!aqVar3.V) {
                                string2 = LocaleController.getString(R.string.SwipeToGoNextRecommendedChannel);
                                string3 = LocaleController.getString(R.string.ReleaseToGoNextRecommendedChannel);
                            } else if (z12) {
                                string2 = LocaleController.getString(R.string.SwipeToGoNextUnreadTopic);
                                string3 = LocaleController.getString(R.string.ReleaseToGoNextUnreadTopic);
                            } else {
                                boolean z13 = aqVar3.W;
                                if (z13 && (i12 = aqVar3.a) != aqVar3.f0 && i12 != 0) {
                                    string2 = LocaleController.getString(R.string.SwipeToGoNextArchive);
                                    string3 = LocaleController.getString(R.string.ReleaseToGoNextArchive);
                                } else if (z13) {
                                    string2 = LocaleController.getString(R.string.SwipeToGoNextFolder);
                                    string3 = LocaleController.getString(R.string.ReleaseToGoNextFolder);
                                } else {
                                    string2 = LocaleController.getString(R.string.SwipeToGoNextChannel);
                                    string3 = LocaleController.getString(R.string.ReleaseToGoNextChannel);
                                }
                            }
                            int measureText2 = (int) textPaint2.measureText(string2);
                            aqVar3.y = measureText2;
                            aqVar3.y = Math.min(measureText2, aqVar3.c - AndroidUtilities.dp(60.0f));
                            int i20 = aqVar3.y;
                            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                            aqVar3.v = new StaticLayout(string2, textPaint2, i20, alignment, 1.0f, 0.0f, false);
                            int measureText3 = (int) textPaint2.measureText(string3);
                            aqVar3.E = measureText3;
                            aqVar3.E = Math.min(measureText3, aqVar3.c - AndroidUtilities.dp(60.0f));
                            aqVar3.w = new StaticLayout(string3, textPaint2, aqVar3.E, alignment, 1.0f, 0.0f, false);
                            imageReceiver.setImageCoords((aqVar3.c / f10) - (AndroidUtilities.dp(40.0f) / f10), (AndroidUtilities.dp(12.0f) + aqVar3.d) - (AndroidUtilities.dp(40.0f) / f10), AndroidUtilities.dp(40.0f), AndroidUtilities.dp(40.0f));
                            imageReceiver.setRoundRadius((int) (AndroidUtilities.dp(40.0f) / f10));
                            aqVar3.c0.d(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(100.0f));
                            if (z12) {
                                aqVar3.I = aqVar3.H == null ? 0L : r3.id;
                            }
                        }
                    }
                    i11 = 0;
                    int measureText4 = (int) textPaint.measureText((CharSequence) string, i11, string.length());
                    aqVar3.x = measureText4;
                    int min2 = Math.min(measureText4, aqVar3.c - AndroidUtilities.dp(60.0f));
                    aqVar3.x = min2;
                    aqVar3.s = org.telegram.ui.Components.iw0.c(string, textPaint, min2, Layout.Alignment.ALIGN_NORMAL, 0.0f, false, TextUtils.TruncateAt.END, min2, 1, true);
                    if (!aqVar3.V) {
                    }
                    int measureText22 = (int) textPaint2.measureText(string2);
                    aqVar3.y = measureText22;
                    aqVar3.y = Math.min(measureText22, aqVar3.c - AndroidUtilities.dp(60.0f));
                    int i202 = aqVar3.y;
                    Layout.Alignment alignment2 = Layout.Alignment.ALIGN_CENTER;
                    aqVar3.v = new StaticLayout(string2, textPaint2, i202, alignment2, 1.0f, 0.0f, false);
                    int measureText32 = (int) textPaint2.measureText(string3);
                    aqVar3.E = measureText32;
                    aqVar3.E = Math.min(measureText32, aqVar3.c - AndroidUtilities.dp(60.0f));
                    aqVar3.w = new StaticLayout(string3, textPaint2, aqVar3.E, alignment2, 1.0f, 0.0f, false);
                    imageReceiver.setImageCoords((aqVar3.c / f10) - (AndroidUtilities.dp(40.0f) / f10), (AndroidUtilities.dp(12.0f) + aqVar3.d) - (AndroidUtilities.dp(40.0f) / f10), AndroidUtilities.dp(40.0f), AndroidUtilities.dp(40.0f));
                    imageReceiver.setRoundRadius((int) (AndroidUtilities.dp(40.0f) / f10));
                    aqVar3.c0.d(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(100.0f));
                    if (z12) {
                    }
                }
                float min3 = Math.min(1.0f, coVar.N9 / AndroidUtilities.dp(110.0f));
                canvas2.translate(coVar.C9() ? AndroidUtilities.lerp(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(71.0f), coVar.Q8()) : 0.0f, -(coVar.W8(org.telegram.ui.Components.s21.c) + coVar.S.getInputBubbleHeight() + coVar.v.c() + AndroidUtilities.dp(10.0f)));
                coVar.P9.a(canvas2, coVar.x0, min3, 1.0f - coVar.U9);
                canvas2.restore();
                if (coVar.T9 != null) {
                    canvas2.saveLayerAlpha(0.0f, 0.0f, r2.x0.getMeasuredWidth(), coVar.T9.x0.getMeasuredHeight(), (int) (coVar.U9 * f7), 31);
                    canvas2.translate(0.0f, (getMeasuredHeight() - coVar.N9) - f11);
                    coVar.T9.x0.draw(canvas2);
                    canvas2.restore();
                    return;
                }
                return;
            }
        }
        canvas2 = canvas;
        f7 = 255.0f;
        f10 = 2.0f;
        if (coVar.N9 != 0.0f) {
        }
        aqVar = coVar.P9;
        if (aqVar == null) {
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        if (this.y3.h != null) {
            return;
        }
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        AccessibilityNodeInfo.CollectionInfo collectionInfo = accessibilityNodeInfo.getCollectionInfo();
        if (collectionInfo != null) {
            accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(collectionInfo.getRowCount(), 1, false));
        }
    }

    @Override // org.telegram.ui.Components.ll0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        vh.i iVar;
        org.telegram.ui.ActionBar.k kVar;
        co coVar = this.y3;
        vm vmVar = coVar.c9;
        vmVar.getClass();
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            AndroidUtilities.cancelRunOnUIThread(vmVar.g0);
            vmVar.z = false;
        }
        if (this.X1 || ((iVar = coVar.X9) != null && iVar.a())) {
            return false;
        }
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        kVar = ((org.telegram.ui.ActionBar.n2) coVar).actionBar;
        if (!kVar.s() && !coVar.A9()) {
            x1(motionEvent);
        }
        return onInterceptTouchEvent;
    }

    @Override // org.telegram.ui.Components.ll0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int i14 = this.Y2;
        int i15 = i12 - i10;
        co coVar = this.y3;
        if (i14 != i15) {
            if (i14 != 0) {
                coVar.h9(false);
            }
            this.Y2 = i15;
        }
        int measuredHeight = getMeasuredHeight();
        if (this.x3 != measuredHeight) {
            this.w3 = true;
            wj wjVar = coVar.y0;
            if (wjVar != null) {
                wjVar.g();
            }
            coVar.W8.a();
            this.w3 = false;
            this.x3 = measuredHeight;
        }
        coVar.R5 = false;
        vm vmVar = coVar.c9;
        if (vmVar != null && vmVar.y()) {
            coVar.c9.x();
        }
        coVar.p9();
        coVar.D9();
    }

    @Override // org.telegram.ui.Components.ll0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        aq aqVar;
        co coVar = this.y3;
        le.b bVar = coVar.uc;
        vm vmVar = coVar.c9;
        vmVar.getClass();
        final int i10 = 3;
        final int i11 = 0;
        final int i12 = 1;
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            AndroidUtilities.cancelRunOnUIThread(vmVar.g0);
            vmVar.z = false;
        }
        if (motionEvent.getAction() == 0) {
            coVar.sa = true;
        }
        if (coVar.N9 != 0.0f && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            float min = Math.min(1.0f, coVar.N9 / AndroidUtilities.dp(110.0f));
            final int i13 = 2;
            if (motionEvent.getAction() != 1 || min != 1.0f || (aqVar = coVar.P9) == null || aqVar.R) {
                aq aqVar2 = coVar.P9;
                if (aqVar2 != null && aqVar2.R) {
                    long currentTimeMillis = System.currentTimeMillis();
                    aq aqVar3 = coVar.P9;
                    if (currentTimeMillis - aqVar3.U < 500 && aqVar3.M) {
                        AnimatorSet animatorSet = new AnimatorSet();
                        coVar.Q9 = animatorSet;
                        if (coVar.P9 != null) {
                            bVar.a(false, true);
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(coVar.N9, AndroidUtilities.dp(111.0f));
                        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.tj
                            public final /* synthetic */ uj b;

                            {
                                this.b = this;
                            }

                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (i12) {
                                    case 0:
                                        co coVar2 = this.b.y3;
                                        coVar2.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        coVar2.x0.invalidate();
                                        break;
                                    case 1:
                                        co coVar3 = this.b.y3;
                                        coVar3.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        coVar3.x0.invalidate();
                                        break;
                                    case 2:
                                        co coVar4 = this.b.y3;
                                        coVar4.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        coVar4.x0.invalidate();
                                        break;
                                    default:
                                        co coVar5 = this.b.y3;
                                        coVar5.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        coVar5.x0.invalidate();
                                        break;
                                }
                            }
                        });
                        ofFloat.setDuration(400L);
                        ofFloat.setInterpolator(org.telegram.ui.Components.pr.f);
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(AndroidUtilities.dp(111.0f), 0.0f);
                        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.tj
                            public final /* synthetic */ uj b;

                            {
                                this.b = this;
                            }

                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (i13) {
                                    case 0:
                                        co coVar2 = this.b.y3;
                                        coVar2.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        coVar2.x0.invalidate();
                                        break;
                                    case 1:
                                        co coVar3 = this.b.y3;
                                        coVar3.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        coVar3.x0.invalidate();
                                        break;
                                    case 2:
                                        co coVar4 = this.b.y3;
                                        coVar4.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        coVar4.x0.invalidate();
                                        break;
                                    default:
                                        co coVar5 = this.b.y3;
                                        coVar5.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        coVar5.x0.invalidate();
                                        break;
                                }
                            }
                        });
                        ofFloat2.setStartDelay(600L);
                        ofFloat2.setDuration(250L);
                        ofFloat2.setInterpolator(ki.o.V);
                        animatorSet.playSequentially(ofFloat, ofFloat2);
                        animatorSet.start();
                    }
                }
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(coVar.N9, 0.0f);
                coVar.Q9 = ofFloat3;
                if (coVar.P9 != null) {
                    bVar.a(false, true);
                }
                ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.tj
                    public final /* synthetic */ uj b;

                    {
                        this.b = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i10) {
                            case 0:
                                co coVar2 = this.b.y3;
                                coVar2.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                coVar2.x0.invalidate();
                                break;
                            case 1:
                                co coVar3 = this.b.y3;
                                coVar3.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                coVar3.x0.invalidate();
                                break;
                            case 2:
                                co coVar4 = this.b.y3;
                                coVar4.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                coVar4.x0.invalidate();
                                break;
                            default:
                                co coVar5 = this.b.y3;
                                coVar5.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                coVar5.x0.invalidate();
                                break;
                        }
                    }
                });
                ofFloat3.setDuration(250L);
                ofFloat3.setInterpolator(ki.o.V);
                ofFloat3.start();
            } else if (aqVar.K != 1.0f) {
                float f7 = coVar.N9;
                ValueAnimator ofFloat4 = ValueAnimator.ofFloat(f7, AndroidUtilities.dp(8.0f) + f7);
                coVar.Q9 = ofFloat4;
                ofFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.tj
                    public final /* synthetic */ uj b;

                    {
                        this.b = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i11) {
                            case 0:
                                co coVar2 = this.b.y3;
                                coVar2.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                coVar2.x0.invalidate();
                                break;
                            case 1:
                                co coVar3 = this.b.y3;
                                coVar3.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                coVar3.x0.invalidate();
                                break;
                            case 2:
                                co coVar4 = this.b.y3;
                                coVar4.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                coVar4.x0.invalidate();
                                break;
                            default:
                                co coVar5 = this.b.y3;
                                coVar5.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                coVar5.x0.invalidate();
                                break;
                        }
                    }
                });
                ofFloat4.setDuration(200L);
                org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.f;
                ofFloat4.setInterpolator(prVar);
                ofFloat4.start();
                final aq aqVar4 = coVar.P9;
                dj djVar = new dj(this, i12);
                AnimatorSet animatorSet2 = aqVar4.J;
                if (animatorSet2 != null) {
                    animatorSet2.removeAllListeners();
                    aqVar4.J.cancel();
                }
                aqVar4.Y = djVar;
                aqVar4.J = new AnimatorSet();
                ValueAnimator ofFloat5 = ValueAnimator.ofFloat(aqVar4.K, 1.0f);
                ofFloat5.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.zp
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i11) {
                            case 0:
                                aq aqVar5 = aqVar4;
                                aqVar5.getClass();
                                aqVar5.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                aqVar5.T.invalidate();
                                View view = aqVar5.a0;
                                if (view != null) {
                                    view.invalidate();
                                    break;
                                }
                                break;
                            default:
                                aq aqVar6 = aqVar4;
                                aqVar6.getClass();
                                aqVar6.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                View view2 = aqVar6.a0;
                                if (view2 != null) {
                                    view2.invalidate();
                                    break;
                                }
                                break;
                        }
                    }
                });
                ValueAnimator ofFloat6 = ValueAnimator.ofFloat(aqVar4.L, 0.0f);
                ofFloat6.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.zp
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i12) {
                            case 0:
                                aq aqVar5 = aqVar4;
                                aqVar5.getClass();
                                aqVar5.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                aqVar5.T.invalidate();
                                View view = aqVar5.a0;
                                if (view != null) {
                                    view.invalidate();
                                    break;
                                }
                                break;
                            default:
                                aq aqVar6 = aqVar4;
                                aqVar6.getClass();
                                aqVar6.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                View view2 = aqVar6.a0;
                                if (view2 != null) {
                                    view2.invalidate();
                                    break;
                                }
                                break;
                        }
                    }
                });
                aqVar4.J.addListener(new s0(aqVar4, 26));
                aqVar4.J.playTogether(ofFloat5, ofFloat6);
                aqVar4.J.setDuration(120L);
                aqVar4.J.setInterpolator(prVar);
                aqVar4.J.start();
            } else {
                co.X1(coVar);
            }
        }
        if (!this.X1) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            kVar = ((org.telegram.ui.ActionBar.n2) coVar).actionBar;
            if (kVar.s() || coVar.A9()) {
                return onTouchEvent;
            }
            x1(motionEvent);
            if (coVar.f9 || onTouchEvent) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        if (this.y3.Q8 != null) {
            return false;
        }
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        if (this.y3.d9 != null) {
            x1(null);
        }
    }

    @Override // org.telegram.ui.Components.ll0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.w3) {
            return;
        }
        ih.a aVar = this.y3.Qb;
        if (aVar.b != 0) {
            int childCount = aVar.a.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                aVar.a.getChildAt(i10).forceLayout();
            }
        }
        super.requestLayout();
    }

    @Override // org.telegram.ui.Components.ll0, androidx.recyclerview.widget.RecyclerView
    public final void setItemAnimator(s4.m0 m0Var) {
        if (this.X1) {
            return;
        }
        super.setItemAnimator(m0Var);
    }

    @Override // org.telegram.ui.Components.ll0, android.view.View
    public final void setTranslationY(float f7) {
        if (f7 != getTranslationY()) {
            super.setTranslationY(f7);
            co coVar = this.y3;
            coVar.o9();
            coVar.r9();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x03bf, code lost:
    
        if (r2.messages.size() != 1) goto L155;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v1(Canvas canvas, RectF rectF) {
        int i10;
        int i11;
        float f7;
        float f10;
        co coVar;
        float f11;
        int i12;
        float f12;
        boolean z10;
        MessageObject.GroupedMessages currentMessagesGroup;
        int i13;
        org.telegram.ui.ActionBar.k kVar;
        int measuredHeight;
        int i14;
        int i15;
        org.telegram.ui.ActionBar.k kVar2;
        int measuredHeight2;
        uj ujVar = this;
        Canvas canvas2 = canvas;
        int childCount = ujVar.getChildCount();
        MessageObject.GroupedMessages groupedMessages = null;
        int i16 = 0;
        while (true) {
            i10 = 8;
            i11 = 2;
            f7 = 0.0f;
            f10 = 2.0f;
            coVar = ujVar.y3;
            if (i16 >= childCount) {
                f11 = 1.0f;
                break;
            }
            View childAt = ujVar.getChildAt(i16);
            f11 = 1.0f;
            if (childAt.getVisibility() != 4 && childAt.getVisibility() != 8) {
                if (!co.d2(coVar, childAt, rectF)) {
                    if (childAt instanceof org.telegram.ui.Cells.u1) {
                        canvas2.save();
                        canvas2.translate(childAt.getX(), childAt.getY());
                        ((org.telegram.ui.Cells.u1) childAt).a(canvas2);
                        canvas2.restore();
                    } else if (coVar.A0.n && (childAt instanceof org.telegram.ui.Cells.h0)) {
                        float measuredHeight3 = ((((ujVar.getMeasuredHeight() - coVar.s9) - coVar.Aa) / 2.0f) - (childAt.getMeasuredHeight() / 2)) + coVar.s9;
                        if (!((org.telegram.ui.Cells.h0) childAt).I && !coVar.x0.X1) {
                            if (childAt.getTop() > measuredHeight3) {
                                childAt.setTranslationY(measuredHeight3 - childAt.getTop());
                            } else {
                                childAt.setTranslationY(0.0f);
                            }
                        }
                    } else if (childAt instanceof org.telegram.ui.Cells.bb) {
                        float measuredHeight4 = ((((ujVar.getMeasuredHeight() - coVar.s9) - coVar.Aa) / 2.0f) - (childAt.getMeasuredHeight() / 2)) + coVar.s9;
                        if (!((org.telegram.ui.Cells.bb) childAt).N && !coVar.x0.X1) {
                            if (childAt.getTop() > measuredHeight4) {
                                childAt.setTranslationY(measuredHeight4 - childAt.getTop());
                            } else {
                                childAt.setTranslationY(0.0f);
                            }
                        }
                    } else {
                        if (childAt instanceof org.telegram.ui.Cells.t1) {
                            org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) childAt;
                            MessageObject.GroupedMessages currentMessagesGroup2 = t1Var.getCurrentMessagesGroup();
                            if (currentMessagesGroup2 == null || currentMessagesGroup2 != groupedMessages) {
                                MessageObject.GroupedMessagePosition currentPosition = t1Var.getCurrentPosition();
                                org.telegram.ui.Components.qa0 backgroundDrawable = t1Var.getBackgroundDrawable();
                                if ((backgroundDrawable.f || t1Var.g3()) && (currentPosition == null || (2 & currentPosition.flags) != 0)) {
                                    boolean z11 = t1Var.f8;
                                    org.telegram.ui.ActionBar.f6 f6Var = ujVar.p2;
                                    if (z11 || t1Var.g8) {
                                        i13 = i16;
                                        if (currentPosition == null) {
                                            Paint W0 = ujVar.W0("paintChatMessageBackgroundSelected");
                                            ao aoVar = coVar.ea;
                                            if ((aoVar == null || !aoVar.G) && W0 != null) {
                                                if (coVar.x9()) {
                                                    measuredHeight = coVar.x0.getTop();
                                                } else {
                                                    kVar = ((org.telegram.ui.ActionBar.n2) coVar).actionBar;
                                                    measuredHeight = kVar.getMeasuredHeight();
                                                }
                                                float backgroundTranslationY = measuredHeight - coVar.X0.getBackgroundTranslationY();
                                                int backgroundSizeY = coVar.X0.getBackgroundSizeY();
                                                ao aoVar2 = coVar.ea;
                                                if (aoVar2 != null) {
                                                    aoVar2.l(t1Var.getX(), backgroundTranslationY, ujVar.getMeasuredWidth(), backgroundSizeY);
                                                } else {
                                                    org.telegram.ui.ActionBar.j6.q(t1Var.getX(), backgroundTranslationY, ujVar.getMeasuredWidth(), backgroundSizeY);
                                                }
                                            } else {
                                                W0 = org.telegram.ui.ActionBar.j6.a2;
                                                W0.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Hc, f6Var));
                                            }
                                            Paint paint = W0;
                                            canvas2.save();
                                            canvas2.translate(0.0f, t1Var.getTranslationY());
                                            int alpha = paint.getAlpha();
                                            paint.setAlpha((int) (t1Var.getAlpha() * t1Var.getHighlightAlpha() * alpha));
                                            canvas2.drawRect(0.0f, t1Var.getTop(), ujVar.getMeasuredWidth(), t1Var.getBottom(), paint);
                                            paint.setAlpha(alpha);
                                            canvas2.restore();
                                        }
                                    } else {
                                        int y3 = (int) t1Var.getY();
                                        canvas2.save();
                                        if (currentPosition == null) {
                                            i14 = t1Var.getMeasuredHeight();
                                            i13 = i16;
                                        } else {
                                            int measuredHeight5 = t1Var.getMeasuredHeight() + y3;
                                            long j3 = 0;
                                            int i17 = 0;
                                            float f13 = 0.0f;
                                            while (i17 < childCount) {
                                                View childAt2 = ujVar.getChildAt(i17);
                                                int i18 = i16;
                                                if (childAt2 instanceof org.telegram.ui.Cells.t1) {
                                                    org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) childAt2;
                                                    if (t1Var2.getCurrentMessagesGroup() == currentMessagesGroup2) {
                                                        org.telegram.ui.Components.qa0 backgroundDrawable2 = t1Var2.getBackgroundDrawable();
                                                        i15 = i17;
                                                        y3 = Math.min(y3, (int) t1Var2.getY());
                                                        measuredHeight5 = Math.max(measuredHeight5, t1Var2.getMeasuredHeight() + ((int) t1Var2.getY()));
                                                        long j10 = backgroundDrawable2.l;
                                                        if (j10 > j3) {
                                                            j3 = j10;
                                                            f7 = t1Var2.getX() + backgroundDrawable2.h;
                                                            f13 = t1Var2.getY() + backgroundDrawable2.i;
                                                        }
                                                        i17 = i15 + 1;
                                                        i16 = i18;
                                                    }
                                                }
                                                i15 = i17;
                                                i17 = i15 + 1;
                                                i16 = i18;
                                            }
                                            i13 = i16;
                                            backgroundDrawable.j = f7;
                                            backgroundDrawable.k = f13 - y3;
                                            i14 = measuredHeight5 - y3;
                                        }
                                        int i19 = i14 + y3;
                                        canvas2.clipRect(0, y3, ujVar.getMeasuredWidth(), i19);
                                        Paint W02 = ujVar.W0("paintChatMessageBackgroundSelected");
                                        ao aoVar3 = coVar.ea;
                                        if (aoVar3 == null || aoVar3.G || W02 == null) {
                                            backgroundDrawable.b = null;
                                            backgroundDrawable.a.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Hc, f6Var));
                                        } else {
                                            backgroundDrawable.b = W02;
                                            if (coVar.x9()) {
                                                measuredHeight2 = coVar.x0.getTop();
                                            } else {
                                                kVar2 = ((org.telegram.ui.ActionBar.n2) coVar).actionBar;
                                                measuredHeight2 = kVar2.getMeasuredHeight();
                                            }
                                            float backgroundTranslationY2 = measuredHeight2 - coVar.X0.getBackgroundTranslationY();
                                            int backgroundSizeY2 = coVar.X0.getBackgroundSizeY();
                                            ao aoVar4 = coVar.ea;
                                            if (aoVar4 != null) {
                                                aoVar4.l(t1Var.getX(), backgroundTranslationY2, ujVar.getMeasuredWidth(), backgroundSizeY2);
                                            } else {
                                                org.telegram.ui.ActionBar.j6.q(t1Var.getX(), backgroundTranslationY2, ujVar.getMeasuredWidth(), backgroundSizeY2);
                                            }
                                        }
                                        backgroundDrawable.setBounds(0, y3, ujVar.getMeasuredWidth(), i19);
                                        backgroundDrawable.draw(canvas2);
                                        canvas2.restore();
                                    }
                                } else {
                                    i13 = i16;
                                }
                                groupedMessages = currentMessagesGroup2;
                            } else {
                                i13 = i16;
                            }
                            if (coVar.J8 != t1Var && currentMessagesGroup2 == null && t1Var.C1()) {
                                canvas2.save();
                                canvas2.translate(t1Var.getX(), t1Var.getY() + t1Var.getPaddingTop());
                                if (t1Var.getScaleX() != 1.0f) {
                                    canvas2.scale(t1Var.getScaleX(), t1Var.getScaleY(), t1Var.getPivotX(), t1Var.getHeight() >> 1);
                                }
                                t1Var.D1(canvas2, true, false);
                                canvas2.restore();
                            }
                        } else {
                            i13 = i16;
                            if (childAt instanceof org.telegram.ui.Cells.w0) {
                                org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) childAt;
                                if (w0Var.J()) {
                                    canvas2.save();
                                    canvas2.translate(w0Var.getX(), w0Var.getY() + w0Var.getPaddingTop());
                                    canvas2.scale(w0Var.getScaleX(), w0Var.getScaleY(), w0Var.getMeasuredWidth() / 2.0f, w0Var.getMeasuredHeight() / 2.0f);
                                    canvas2.translate(coVar.R8() / 2.0f, 0.0f);
                                    w0Var.y(canvas2, true);
                                    w0Var.B(canvas2, true);
                                    canvas2.restore();
                                }
                            }
                        }
                        i16 = i13 + 1;
                    }
                }
            }
            i13 = i16;
            i16 = i13 + 1;
        }
        View view = coVar.J8;
        MessageObject.GroupedMessages currentMessagesGroup3 = view instanceof org.telegram.ui.Cells.t1 ? ((org.telegram.ui.Cells.t1) view).getCurrentMessagesGroup() : null;
        int i20 = 0;
        while (i20 < 3) {
            ArrayList arrayList = ujVar.d3;
            arrayList.clear();
            if (i20 != i11 || coVar.x0.X1) {
                int i21 = 0;
                while (i21 < childCount) {
                    View childAt3 = coVar.x0.getChildAt(i21);
                    if (childAt3 instanceof org.telegram.ui.Cells.t1) {
                        org.telegram.ui.Cells.t1 t1Var3 = (org.telegram.ui.Cells.t1) childAt3;
                        if (childAt3.getY() <= coVar.x0.getHeight() && childAt3.getY() + childAt3.getHeight() >= f7 && t1Var3.getVisibility() != i10 && (currentMessagesGroup = t1Var3.getCurrentMessagesGroup()) != null) {
                            int i22 = i20 == 0 ? 1 : 1;
                            if ((i20 != i22 || currentMessagesGroup.transitionParams.drawBackgroundForDeletedItems) && ((i20 != 0 || !t1Var3.getMessageObject().deleted) && ((i20 != 1 || t1Var3.getMessageObject().deleted) && ((i20 != i11 || t1Var3.oc) && (i20 == i11 || !t1Var3.oc))))) {
                                if (!arrayList.contains(currentMessagesGroup)) {
                                    MessageObject.GroupedMessages.TransitionParams transitionParams = currentMessagesGroup.transitionParams;
                                    transitionParams.left = 0;
                                    transitionParams.top = 0;
                                    transitionParams.right = 0;
                                    transitionParams.bottom = 0;
                                    transitionParams.pinnedBotton = false;
                                    transitionParams.pinnedTop = false;
                                    transitionParams.cell = t1Var3;
                                    arrayList.add(currentMessagesGroup);
                                }
                                currentMessagesGroup.transitionParams.pinnedTop = t1Var3.n3();
                                currentMessagesGroup.transitionParams.pinnedBotton = t1Var3.m3();
                                int backgroundDrawableLeft = t1Var3.getBackgroundDrawableLeft() + t1Var3.getLeft();
                                int backgroundDrawableRight = t1Var3.getBackgroundDrawableRight() + t1Var3.getLeft();
                                int backgroundDrawableTop = t1Var3.getBackgroundDrawableTop() + t1Var3.getPaddingTop() + t1Var3.getTop();
                                int backgroundDrawableBottom = t1Var3.getBackgroundDrawableBottom() + t1Var3.getPaddingTop() + t1Var3.getTop();
                                if ((t1Var3.getCurrentPosition().flags & 4) == 0) {
                                    backgroundDrawableTop -= AndroidUtilities.dp(10.0f);
                                }
                                int i23 = backgroundDrawableTop;
                                if ((t1Var3.getCurrentPosition().flags & 8) == 0) {
                                    backgroundDrawableBottom = AndroidUtilities.dp(10.0f) + backgroundDrawableBottom;
                                }
                                int i24 = backgroundDrawableBottom;
                                if (t1Var3.oc) {
                                    currentMessagesGroup.transitionParams.cell = t1Var3;
                                }
                                MessageObject.GroupedMessages.TransitionParams transitionParams2 = currentMessagesGroup.transitionParams;
                                int i25 = transitionParams2.top;
                                if (i25 == 0 || i23 < i25) {
                                    transitionParams2.top = i23;
                                }
                                int i26 = transitionParams2.bottom;
                                if (i26 == 0 || i24 > i26) {
                                    transitionParams2.bottom = i24;
                                }
                                int i27 = transitionParams2.left;
                                if (i27 == 0 || backgroundDrawableLeft < i27) {
                                    transitionParams2.left = backgroundDrawableLeft;
                                }
                                int i28 = transitionParams2.right;
                                if (i28 == 0 || backgroundDrawableRight > i28) {
                                    transitionParams2.right = backgroundDrawableRight;
                                }
                                i21++;
                                i10 = 8;
                                i11 = 2;
                                f7 = 0.0f;
                            }
                        }
                    }
                    i21++;
                    i10 = 8;
                    i11 = 2;
                    f7 = 0.0f;
                }
                int i29 = 0;
                while (i29 < arrayList.size()) {
                    MessageObject.GroupedMessages groupedMessages2 = (MessageObject.GroupedMessages) arrayList.get(i29);
                    float E2 = groupedMessages2.transitionParams.cell.E2(true);
                    MessageObject.GroupedMessages.TransitionParams transitionParams3 = groupedMessages2.transitionParams;
                    float f14 = transitionParams3.left + E2 + transitionParams3.offsetLeft;
                    float f15 = transitionParams3.top + transitionParams3.offsetTop;
                    float f16 = transitionParams3.offsetRight + transitionParams3.right + E2;
                    float f17 = transitionParams3.bottom + transitionParams3.offsetBottom;
                    if (!transitionParams3.backgroundChangeBounds) {
                        f15 += transitionParams3.cell.getTranslationY();
                        f17 += groupedMessages2.transitionParams.cell.getTranslationY();
                    }
                    float f18 = f15;
                    if (f17 > AndroidUtilities.dp(20.0f) + coVar.x0.getMeasuredHeight()) {
                        f17 = AndroidUtilities.dp(20.0f) + coVar.x0.getMeasuredHeight();
                    }
                    float f19 = f17;
                    boolean z12 = (groupedMessages2.transitionParams.cell.getScaleX() == f11 && groupedMessages2.transitionParams.cell.getScaleY() == f11) ? false : true;
                    if (z12) {
                        canvas2.save();
                        i12 = i20;
                        canvas2.scale(groupedMessages2.transitionParams.cell.getScaleX(), groupedMessages2.transitionParams.cell.getScaleY(), com.google.android.gms.internal.vision.e2.A(f16, f14, f10, f14), com.google.android.gms.internal.vision.e2.A(f19, f18, f10, f18));
                    } else {
                        i12 = i20;
                    }
                    int size = groupedMessages2.messages.size();
                    int i30 = 0;
                    while (true) {
                        if (i30 >= size) {
                            f12 = f19;
                            z10 = true;
                            break;
                        }
                        MessageObject messageObject = groupedMessages2.messages.get(i30);
                        f12 = f19;
                        if (coVar.W5[messageObject.getDialogId() == coVar.T5 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) < 0) {
                            z10 = false;
                            break;
                        } else {
                            i30++;
                            f19 = f12;
                        }
                    }
                    MessageObject.GroupedMessages.TransitionParams transitionParams4 = groupedMessages2.transitionParams;
                    float f20 = f12;
                    co coVar2 = coVar;
                    transitionParams4.cell.B1(canvas, (int) f14, (int) f18, (int) f16, (int) f20, transitionParams4.pinnedTop, transitionParams4.pinnedBotton, z10, 0);
                    if (groupedMessages2 != currentMessagesGroup3) {
                        groupedMessages2.transitionParams.cell = null;
                    }
                    groupedMessages2.transitionParams.drawCaptionLayout = groupedMessages2.hasCaption;
                    if (z12) {
                        canvas.restore();
                        for (int i31 = 0; i31 < childCount; i31++) {
                            View childAt4 = coVar2.x0.getChildAt(i31);
                            if (childAt4 instanceof org.telegram.ui.Cells.t1) {
                                org.telegram.ui.Cells.t1 t1Var4 = (org.telegram.ui.Cells.t1) childAt4;
                                if (t1Var4.getCurrentMessagesGroup() == groupedMessages2) {
                                    int left = t1Var4.getLeft();
                                    int top = t1Var4.getTop();
                                    childAt4.setPivotX(((f16 - f14) / 2.0f) + (f14 - left));
                                    childAt4.setPivotY(((f20 - f18) / 2.0f) + (f18 - top));
                                }
                            }
                        }
                    }
                    i29++;
                    canvas2 = canvas;
                    coVar = coVar2;
                    i20 = i12;
                    f10 = 2.0f;
                }
            }
            canvas2 = canvas;
            coVar = coVar;
            i10 = 8;
            i11 = 2;
            f7 = 0.0f;
            f10 = 2.0f;
            i20++;
            ujVar = this;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void w1(Canvas canvas, RectF rectF) {
        float f7;
        ArrayList arrayList;
        ArrayList arrayList2 = this.Z2;
        int size = arrayList2.size();
        co coVar = this.y3;
        boolean z10 = 1;
        boolean z11 = false;
        if (size > 0) {
            for (int i10 = 0; i10 < size; i10++) {
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) arrayList2.get(i10);
                if (!co.d2(coVar, t1Var, rectF)) {
                    canvas.save();
                    canvas.translate(t1Var.E2(false) + t1Var.getLeft(), t1Var.getY() + t1Var.getPaddingTop());
                    t1Var.m2(t1Var.a() ? t1Var.getAlpha() : 1.0f, canvas, true);
                    canvas.restore();
                }
            }
            arrayList2.clear();
        }
        ArrayList arrayList3 = this.a3;
        int size2 = arrayList3.size();
        if (size2 > 0) {
            for (int i11 = 0; i11 < size2; i11++) {
                org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) arrayList3.get(i11);
                if (!co.d2(coVar, t1Var2, rectF)) {
                    float E2 = t1Var2.E2(false) + t1Var2.getLeft();
                    float y3 = t1Var2.getY() + t1Var2.getPaddingTop();
                    float alpha = t1Var2.a() ? t1Var2.getAlpha() : 1.0f;
                    canvas.save();
                    canvas.translate(E2, y3);
                    t1Var2.setInvalidatesParent(true);
                    t1Var2.W1(canvas, alpha);
                    t1Var2.setInvalidatesParent(false);
                    canvas.restore();
                }
            }
            arrayList3.clear();
        }
        ArrayList arrayList4 = this.b3;
        int size3 = arrayList4.size();
        if (size3 > 0) {
            int i12 = 0;
            while (i12 < size3) {
                org.telegram.ui.Cells.t1 t1Var3 = (org.telegram.ui.Cells.t1) arrayList4.get(i12);
                if (co.d2(coVar, t1Var3, rectF)) {
                    arrayList = arrayList4;
                } else {
                    boolean z12 = t1Var3.getCurrentPosition() != null && (t1Var3.getCurrentPosition().flags & z10) == 0;
                    float alpha2 = t1Var3.a() ? t1Var3.getAlpha() : 1.0f;
                    float E22 = t1Var3.E2(z11) + t1Var3.getLeft();
                    float y10 = t1Var3.getY() + t1Var3.getPaddingTop();
                    canvas.save();
                    MessageObject.GroupedMessages currentMessagesGroup = t1Var3.getCurrentMessagesGroup();
                    if (currentMessagesGroup == null) {
                        arrayList = arrayList4;
                    } else if (currentMessagesGroup.transitionParams.backgroundChangeBounds) {
                        float E23 = t1Var3.E2(z10);
                        MessageObject.GroupedMessages.TransitionParams transitionParams = currentMessagesGroup.transitionParams;
                        float f10 = transitionParams.left + E23 + transitionParams.offsetLeft;
                        arrayList = arrayList4;
                        float f11 = transitionParams.top + transitionParams.offsetTop;
                        float f12 = transitionParams.right + E23 + transitionParams.offsetRight;
                        float f13 = transitionParams.bottom + transitionParams.offsetBottom;
                        if (!transitionParams.backgroundChangeBounds) {
                            f11 += t1Var3.getTranslationY();
                            f13 += t1Var3.getTranslationY();
                        }
                        canvas.clipRect(f10 + AndroidUtilities.dp(8.0f), f11 + AndroidUtilities.dp(8.0f), f12 - AndroidUtilities.dp(8.0f), f13 - AndroidUtilities.dp(8.0f));
                    } else {
                        arrayList = arrayList4;
                    }
                    if (t1Var3.getTransitionParams().v0) {
                        canvas.translate(E22, y10);
                        t1Var3.setInvalidatesParent(true);
                        t1Var3.I1(alpha2, canvas, z12);
                        t1Var3.setInvalidatesParent(false);
                    }
                    canvas.restore();
                }
                i12++;
                arrayList4 = arrayList;
                z10 = 1;
                z11 = false;
            }
            f7 = 8.0f;
            arrayList4.clear();
        } else {
            f7 = 8.0f;
        }
        ArrayList arrayList5 = this.c3;
        int size4 = arrayList5.size();
        if (size4 > 0) {
            for (int i13 = 0; i13 < size4; i13++) {
                org.telegram.ui.Cells.t1 t1Var4 = (org.telegram.ui.Cells.t1) arrayList5.get(i13);
                if (!co.d2(coVar, t1Var4, rectF)) {
                    boolean z13 = t1Var4.getCurrentPosition() != null && (t1Var4.getCurrentPosition().flags & 1) == 0;
                    float alpha3 = t1Var4.a() ? t1Var4.getAlpha() : 1.0f;
                    float E24 = t1Var4.E2(false) + t1Var4.getLeft();
                    float y11 = t1Var4.getY() + t1Var4.getPaddingTop();
                    canvas.save();
                    MessageObject.GroupedMessages currentMessagesGroup2 = t1Var4.getCurrentMessagesGroup();
                    if (currentMessagesGroup2 != null && currentMessagesGroup2.transitionParams.backgroundChangeBounds) {
                        float E25 = t1Var4.E2(true);
                        MessageObject.GroupedMessages.TransitionParams transitionParams2 = currentMessagesGroup2.transitionParams;
                        float f14 = transitionParams2.left + E25 + transitionParams2.offsetLeft;
                        float f15 = transitionParams2.top + transitionParams2.offsetTop;
                        float f16 = transitionParams2.right + E25 + transitionParams2.offsetRight;
                        float f17 = transitionParams2.bottom + transitionParams2.offsetBottom;
                        if (!transitionParams2.backgroundChangeBounds) {
                            f15 += t1Var4.getTranslationY();
                            f17 += t1Var4.getTranslationY();
                        }
                        canvas.clipRect(f14 + AndroidUtilities.dp(f7), f15 + AndroidUtilities.dp(f7), f16 - AndroidUtilities.dp(f7), f17 - AndroidUtilities.dp(f7));
                    }
                    if (!z13 && t1Var4.getTransitionParams().v0) {
                        canvas.translate(E24, y11);
                        t1Var4.setInvalidatesParent(true);
                        t1Var4.d2(canvas, alpha3, null);
                        t1Var4.N1(canvas, alpha3);
                        t1Var4.setInvalidatesParent(false);
                    }
                    canvas.restore();
                }
            }
            arrayList5.clear();
        }
    }

    public final void x1(MotionEvent motionEvent) {
        TLRPC.Chat chat;
        MessageObject.GroupedMessages y82;
        MessageObject messageObject;
        boolean z10;
        ArrayList arrayList;
        TLRPC.Chat chat2;
        co coVar = this.y3;
        if (motionEvent != null) {
            coVar.D4 = true;
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && !coVar.f9 && !coVar.e9 && coVar.d9 == null) {
            z10 = ((org.telegram.ui.ActionBar.n2) coVar).inPreviewMode;
            if (!z10) {
                View pressedChildView = getPressedChildView();
                if (pressedChildView instanceof org.telegram.ui.Cells.t1) {
                    if (coVar.d9 != null) {
                        co.V1(coVar, 0.0f);
                    }
                    coVar.d9 = (org.telegram.ui.Cells.t1) pressedChildView;
                    MessageObject T1 = co.T1(coVar);
                    boolean F6 = coVar.F6(T1);
                    int i10 = coVar.R3;
                    if ((i10 != 0 && i10 != 5 && i10 != 8 && (i10 != 3 || coVar.d4 != coVar.getUserConfig().getClientUserId())) || (((arrayList = coVar.a4) != null && arrayList.contains(T1)) || ((coVar.E8(T1) == 1 && (T1.getDialogId() == coVar.L6 || T1.needDrawBluredPreview())) || ((coVar.h == null && T1.getId() < 0) || (((chat2 = coVar.e) != null && ChatObject.isForum(chat2) && !F6) || coVar.b9() || (T1.isEphemeral() && T1.isOut())))))) {
                        co.V1(coVar, 0.0f);
                        coVar.d9 = null;
                        return;
                    } else {
                        this.g3 = motionEvent.getPointerId(0);
                        coVar.e9 = true;
                        this.e3 = (int) motionEvent.getX();
                        this.f3 = (int) motionEvent.getY();
                        return;
                    }
                }
                return;
            }
        }
        if (coVar.d9 != null && motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.g3) {
            int max = Math.max(AndroidUtilities.dp(-80.0f), Math.min(0, (int) (motionEvent.getX() - this.e3)));
            int abs = Math.abs(((int) motionEvent.getY()) - this.f3);
            if (getScrollState() == 0 && coVar.e9 && !coVar.f9 && max <= (-AndroidUtilities.getPixelsInCM(0.4f, true)) && Math.abs(max) / 3 > abs) {
                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                coVar.d9.onTouchEvent(obtain);
                super.onInterceptTouchEvent(obtain);
                obtain.recycle();
                coVar.z0.R = false;
                coVar.e9 = false;
                coVar.f9 = true;
                this.e3 = (int) motionEvent.getX();
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    return;
                }
                return;
            }
            if (coVar.f9) {
                if (Math.abs(max) < AndroidUtilities.dp(50.0f)) {
                    this.k3 = false;
                } else if (!this.k3) {
                    try {
                        performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    this.k3 = true;
                }
                float f7 = max;
                co.V1(coVar, f7);
                MessageObject T12 = co.T1(coVar);
                if (T12 != null && (T12.isRoundVideo() || T12.isVideo())) {
                    coVar.Mc(false, false);
                }
                org.telegram.ui.Cells.t1 t1Var = coVar.d9;
                if (com.google.android.gms.internal.vision.e2.u(t1Var)) {
                    y1(t1Var, f7);
                }
                invalidate();
                return;
            }
            return;
        }
        if (coVar.d9 != null) {
            if (motionEvent != null) {
                if (motionEvent.getPointerId(0) != this.g3) {
                    return;
                }
                if (motionEvent.getAction() != 3 && motionEvent.getAction() != 1 && motionEvent.getAction() != 6) {
                    return;
                }
            }
            if (motionEvent != null && motionEvent.getAction() != 3) {
                org.telegram.ui.Cells.t1 t1Var2 = coVar.d9;
                if (Math.abs(com.google.android.gms.internal.vision.e2.u(t1Var2) ? t1Var2.E2(false) : 0.0f) >= AndroidUtilities.dp(50.0f)) {
                    MessageObject T13 = co.T1(coVar);
                    boolean F62 = coVar.F6(T13);
                    rk rkVar = coVar.O0;
                    if ((rkVar == null || rkVar.getVisibility() != 0 || ((coVar.I0 && F62) || T13.wasJustSent)) && ((chat = coVar.e) == null || ((!ChatObject.isNotInChat(chat) || coVar.F9()) && ((!ChatObject.isChannel(coVar.e) || ChatObject.canPost(coVar.e) || coVar.e.megagroup) && ChatObject.canSendMessages(coVar.e))))) {
                        coVar.Bb(co.T1(coVar));
                    } else {
                        if (T13.getGroupId() != 0 && (y82 = coVar.y8(T13.getGroupId())) != null && (messageObject = y82.captionMessage) != null) {
                            T13 = messageObject;
                        }
                        coVar.n5 = T13;
                        Bundle e7 = org.telegram.messenger.w1.e(3, "onlySelect", "dialogsType", true);
                        e7.putBoolean("quote", true);
                        e7.putBoolean("reply_to", true);
                        long peerDialogId = DialogObject.getPeerDialogId(T13.getFromPeer());
                        if (peerDialogId != 0 && peerDialogId != coVar.a() && peerDialogId != coVar.getUserConfig().getClientUserId() && peerDialogId > 0) {
                            e7.putLong("reply_to_author", peerDialogId);
                        }
                        e7.putInt("messagesCount", 1);
                        e7.putBoolean("canSelectTopics", true);
                        uy uyVar = new uy(e7);
                        uyVar.C2 = coVar;
                        coVar.presentFragment(uyVar);
                    }
                }
            }
            org.telegram.ui.Cells.t1 t1Var3 = coVar.d9;
            float slidingOffsetX = com.google.android.gms.internal.vision.e2.u(t1Var3) ? t1Var3.getSlidingOffsetX() : 0.0f;
            this.j3 = slidingOffsetX;
            if (slidingOffsetX == 0.0f) {
                coVar.d9 = null;
            }
            this.h3 = System.currentTimeMillis();
            this.i3 = 0.0f;
            invalidate();
            coVar.e9 = false;
            coVar.f9 = false;
            coVar.z0.R = true;
        }
    }

    public final void y1(org.telegram.ui.Cells.t1 t1Var, float f7) {
        MessageObject.GroupedMessages currentMessagesGroup = t1Var.getCurrentMessagesGroup();
        if (currentMessagesGroup == null) {
            return;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt != t1Var && (childAt instanceof org.telegram.ui.Cells.t1)) {
                org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) childAt;
                if (t1Var2.getCurrentMessagesGroup() == currentMessagesGroup) {
                    t1Var2.setSlidingOffset(f7);
                    t1Var2.invalidate();
                }
            }
        }
        invalidate();
    }
}
