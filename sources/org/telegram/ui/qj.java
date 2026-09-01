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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class qj extends tm {
    public int V2;
    public final ArrayList W2;
    public final ArrayList X2;
    public final ArrayList Y2;
    public final ArrayList Z2;
    public final ArrayList a3;
    public int b3;
    public int c3;
    public int d3;
    public long e3;
    public float f3;
    public float g3;
    public boolean h3;
    public final float i3;
    public final Paint j3;
    public final Paint k3;
    public final kb.a l3;
    public final o1.j m3;
    public final kb.a n3;
    public final o1.j o3;
    public final kb.a p3;
    public final o1.j q3;
    public boolean r3;
    public final Path s3;
    public boolean t3;
    public int u3;
    public final /* synthetic */ xn v3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qj(xn xnVar, Context context, vn vnVar) {
        super(xnVar, context, vnVar);
        this.v3 = xnVar;
        this.W2 = new ArrayList();
        this.X2 = new ArrayList();
        this.Y2 = new ArrayList();
        this.Z2 = new ArrayList();
        this.a3 = new ArrayList(10);
        this.i3 = 2000.0f;
        Paint paint = new Paint(1);
        this.j3 = paint;
        Paint paint2 = new Paint(1);
        this.k3 = paint2;
        kb.a aVar = new kb.a(0.0f);
        this.l3 = aVar;
        o1.j jVar = new o1.j(aVar);
        jVar.h = 0.0f;
        jVar.g = 2000.0f;
        jVar.u = yh.n(0.0f, 1500.0f, 1.0f);
        final int i10 = 0;
        jVar.b(new o1.g(this) { // from class: org.telegram.ui.oj
            public final /* synthetic */ qj b;

            {
                this.b = this;
            }

            @Override // o1.g
            public final void a(o1.h hVar, float f10, float f11) {
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
        this.m3 = jVar;
        kb.a aVar2 = new kb.a(0.0f);
        this.n3 = aVar2;
        o1.j jVar2 = new o1.j(aVar2);
        jVar2.h = 0.0f;
        jVar2.u = yh.n(0.0f, 400.0f, 0.5f);
        final int i11 = 1;
        jVar2.b(new o1.g(this) { // from class: org.telegram.ui.oj
            public final /* synthetic */ qj b;

            {
                this.b = this;
            }

            @Override // o1.g
            public final void a(o1.h hVar, float f10, float f11) {
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
        this.o3 = jVar2;
        kb.a aVar3 = new kb.a(0.0f);
        this.p3 = aVar3;
        o1.j jVar3 = new o1.j(aVar3);
        jVar3.h = 0.0f;
        jVar3.u = yh.n(0.0f, 200.0f, 1.0f);
        final int i12 = 2;
        jVar3.b(new o1.g(this) { // from class: org.telegram.ui.oj
            public final /* synthetic */ qj b;

            {
                this.b = this;
            }

            @Override // o1.g
            public final void a(o1.h hVar, float f10, float f11) {
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
        this.q3 = jVar3;
        this.s3 = new Path();
        this.u3 = 0;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }

    @Override // org.telegram.ui.Components.tl0
    public final boolean F0(View view) {
        return (view.getVisibility() == 4 || view.getVisibility() == 8) ? false : true;
    }

    @Override // android.view.View
    public final AccessibilityNodeInfo createAccessibilityNodeInfo() {
        if (this.v3.h != null) {
            return null;
        }
        return super.createAccessibilityNodeInfo();
    }

    @Override // org.telegram.ui.Components.tl0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        xn xnVar = this.v3;
        xnVar.r8 = null;
        canvas.save();
        if (xnVar.S9 != null && xnVar.O9) {
            boolean z4 = xnVar.P9;
        }
        this.D1.setEmpty();
        if (xnVar.K9 != 0.0f) {
            int save = canvas.save();
            float measuredHeight = (-xnVar.K9) - (xnVar.R9 != 0.0f ? (xnVar.u0.getMeasuredHeight() - xnVar.K9) * xnVar.R9 : 0.0f);
            xnVar.va = measuredHeight;
            canvas.translate(0.0f, measuredHeight);
            w1(canvas, null);
            super.dispatchDraw(canvas);
            x1(canvas, null);
            canvas.restoreToCount(save);
        } else {
            w1(canvas, null);
            super.dispatchDraw(canvas);
            x1(canvas, null);
        }
        canvas.restore();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0029, code lost:
    
        if ((java.lang.System.currentTimeMillis() - r2.K6) <= 200) goto L8;
     */
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(Canvas canvas) {
        ArrayList arrayList;
        int i10;
        ArrayList arrayList2;
        boolean z4;
        float f10;
        int i11;
        int dp;
        int i12;
        org.telegram.ui.ActionBar.h5 h5Var;
        float f11;
        org.telegram.ui.ActionBar.h5 h5Var2;
        boolean z10;
        mn mnVar;
        int i13;
        float f12;
        float f13;
        boolean z11;
        xn xnVar = this.v3;
        ArrayList arrayList3 = xnVar.r6;
        ColorMatrix colorMatrix = xnVar.O6;
        m.e3 e3Var = xnVar.P6;
        org.telegram.ui.ActionBar.h5 h5Var3 = xnVar.Q6;
        Paint paint = xnVar.Y6;
        Paint paint2 = xnVar.M6;
        ArrayList arrayList4 = xnVar.L6;
        Paint paint3 = xnVar.N6;
        long j10 = xnVar.K6 != 0 ? 200L : 200L;
        if (!AndroidUtilities.isTablet() && !xnVar.d4 && xnVar.f == null) {
            TLRPC.Chat chat = xnVar.e;
            boolean z12 = (chat == null || ChatObject.isChannelAndNotMegaGroup(chat)) && xnVar.O3 != 7;
            if (xnVar.K9 != 0.0f) {
                canvas.save();
                canvas.translate(0.0f, -xnVar.K9);
            }
            int i14 = org.telegram.ui.ActionBar.k6.d6;
            org.telegram.ui.ActionBar.g6 g6Var = this.m2;
            boolean z13 = i0.a.f(org.telegram.ui.ActionBar.k6.v0(i14, g6Var)) <= 0.699999988079071d;
            int i15 = org.telegram.ui.ActionBar.k6.i6;
            int v02 = org.telegram.ui.ActionBar.k6.v0(i15, g6Var);
            if (z13) {
                arrayList = arrayList3;
                i10 = 33;
            } else {
                arrayList = arrayList3;
                i10 = 3;
            }
            boolean z14 = z12;
            int d = i0.a.d(z13 ? 0.9f : 0.5f, v02, Color.argb(i10, 255, 255, 255));
            int k10 = i0.a.k(org.telegram.ui.ActionBar.k6.v0(i15, g6Var), z13 ? 24 : xn.Ec);
            if (xnVar.X6 != k10 || xnVar.W6 != d) {
                xnVar.W6 = d;
                xnVar.X6 = k10;
                int dp2 = AndroidUtilities.dp(200.0f);
                xnVar.S6 = dp2;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, dp2, 0.0f, new int[]{k10, d, d, k10}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, tileMode);
                xnVar.V6 = linearGradient;
                xnVar.T6 = (-xnVar.S6) * 2;
                paint2.setShader(linearGradient);
                int argb = Color.argb(z13 ? 43 : 96, 255, 255, 255);
                LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, xnVar.S6, 0.0f, new int[]{0, argb, argb, 0}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, tileMode);
                xnVar.a7 = linearGradient2;
                paint.setShader(linearGradient2);
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            org.telegram.ui.ActionBar.h5 h5Var4 = h5Var3;
            long j11 = xnVar.R6;
            Matrix matrix = xnVar.Z6;
            m.e3 e3Var2 = e3Var;
            Matrix matrix2 = xnVar.U6;
            long abs = Math.abs(j11 - elapsedRealtime);
            if (abs > 17) {
                abs = 16;
            }
            long j12 = abs < 4 ? 0L : abs;
            int width = getWidth();
            xnVar.R6 = elapsedRealtime;
            int i16 = (int) (xnVar.T6 + ((width * j12) / 400.0f));
            xnVar.T6 = i16;
            if (i16 >= width * 2) {
                xnVar.T6 = (-xnVar.S6) * 2;
            }
            matrix2.setTranslate(xnVar.T6, 0.0f);
            LinearGradient linearGradient3 = xnVar.V6;
            if (linearGradient3 != null) {
                linearGradient3.setLocalMatrix(matrix2);
            }
            matrix.setTranslate(xnVar.T6, 0.0f);
            LinearGradient linearGradient4 = xnVar.a7;
            if (linearGradient4 != null) {
                linearGradient4.setLocalMatrix(matrix);
            }
            int height = ((getHeight() - xnVar.xa) - ((int) (xnVar.W8(org.telegram.ui.Components.t21.c) + xnVar.v.c()))) - AndroidUtilities.dp(57.0f);
            int i17 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            for (int i18 = 0; i18 < getChildCount(); i18++) {
                int top = getChildAt(i18).getTop();
                if (top < i17) {
                    i17 = top;
                }
            }
            if (xnVar.K6 == 0 && i17 <= 0) {
                z11 = ((org.telegram.ui.ActionBar.p2) xnVar).fragmentBeginToShow;
                xnVar.L6(z11);
            }
            Paint X0 = X0("paintChatActionBackground");
            if (paint3.getColor() != X0.getColor()) {
                paint3.setColor(X0.getColor());
            }
            if (paint3.getShader() != X0.getShader()) {
                paint3.setShader(X0.getShader());
                colorMatrix.setSaturation(xn.Fc);
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
                        f12 = 1.0f;
                        f13 = r13.top + currentMessagesGroup.transitionParams.offsetTop;
                    } else {
                        f12 = 1.0f;
                        f13 = 0.0f;
                    }
                    int i20 = (int) (top2 + f13);
                    i13 = i19;
                    if (xnVar.K6 == 0 && xnVar.D9()) {
                        i20 = AndroidUtilities.lerp(height, i20, childAt.getAlpha());
                    } else if (childAt.getAlpha() != f12) {
                        i20 = height;
                    }
                    if (i20 < height) {
                        height = i20;
                    }
                } else {
                    i13 = i19;
                    if (childAt instanceof org.telegram.ui.Cells.v0) {
                        int lerp = (xnVar.K6 == 0 && xnVar.D9()) ? AndroidUtilities.lerp(height, childAt.getTop(), childAt.getAlpha()) : childAt.getAlpha() == 1.0f ? childAt.getTop() : height;
                        if (lerp < height) {
                            height = lerp;
                        }
                    }
                }
                i19 = i13 + 1;
            }
            if (xnVar.D9()) {
                boolean z15 = SharedConfig.getDevicePerformanceClass() != 0 && org.telegram.ui.ActionBar.k6.a1();
                int i21 = org.telegram.ui.ActionBar.k6.d6;
                boolean z16 = i0.a.f(org.telegram.ui.ActionBar.k6.v0(i21, g6Var)) <= 0.699999988079071d && org.telegram.ui.ActionBar.k6.a1();
                boolean z17 = i0.a.f(org.telegram.ui.ActionBar.k6.v0(i21, g6Var)) <= 0.009999999776482582d && org.telegram.ui.ActionBar.k6.a1();
                if (z15) {
                    org.telegram.ui.ActionBar.k6.q(0.0f, getY() - xnVar.t9, getMeasuredWidth(), AndroidUtilities.displaySize.y);
                }
                int alpha = org.telegram.ui.ActionBar.k6.h2.getAlpha();
                if (z17) {
                    org.telegram.ui.ActionBar.k6.h2.setAlpha((int) (alpha * 4.0f));
                }
                if (xnVar.K6 != 0) {
                    z4 = z16;
                    f10 = 1.0f - ((System.currentTimeMillis() - xnVar.K6) / 200.0f);
                } else {
                    z4 = z16;
                    f10 = 1.0f;
                }
                int alpha2 = paint2.getAlpha();
                int alpha3 = paint3.getAlpha();
                int alpha4 = paint.getAlpha();
                vn vnVar = xnVar.ba;
                float f14 = (vnVar == null || !vnVar.D || paint3.getShader() == null) ? 1.0f : 0.3f;
                paint3.setAlpha((int) (255.0f * f10 * f14));
                float f15 = alpha2;
                paint2.setAlpha((int) (f10 * f14 * f15));
                paint.setAlpha((int) (f10 * f15));
                int i22 = 0;
                while (height > xnVar.wa) {
                    int dp3 = height - AndroidUtilities.dp(3.0f);
                    if (i22 >= arrayList4.size()) {
                        mnVar = new mn();
                        h5Var2 = h5Var4;
                        TLRPC.Chat chat2 = xnVar.e;
                        if (chat2 == null || !ChatObject.isChannelAndNotMegaGroup(chat2)) {
                            z10 = z15;
                            mnVar.b = Utilities.fastRandom.nextInt(AndroidUtilities.dp(64.0f)) + AndroidUtilities.dp(64.0f);
                        } else {
                            z10 = z15;
                            mnVar.b = Utilities.fastRandom.nextInt(AndroidUtilities.dp(64.0f)) + AndroidUtilities.dp(128.0f);
                        }
                        mnVar.a = (int) Math.min((xnVar.u0.getWidth() * 0.8f) - (z14 ? 0 : AndroidUtilities.dp(42.0f)), (((Utilities.fastRandom.nextFloat() * 0.35f) + 0.4f) * xnVar.u0.getWidth()) + AndroidUtilities.dp(42.0f));
                        arrayList4.add(mnVar);
                    } else {
                        h5Var2 = h5Var4;
                        z10 = z15;
                        mnVar = (mn) arrayList4.get(i22);
                    }
                    boolean z18 = z4;
                    mnVar.c = xnVar.K6 != 0 ? arrayList.size() <= 2 ? Math.min(mnVar.c, dp3) : mnVar.c : dp3;
                    height = dp3 - mnVar.b;
                    i22++;
                    z4 = z18;
                    z15 = z10;
                    h5Var4 = h5Var2;
                }
                org.telegram.ui.ActionBar.h5 h5Var5 = h5Var4;
                boolean z19 = z15;
                boolean z20 = z4;
                if (arrayList4.isEmpty()) {
                    dp = getHeight() - xnVar.xa;
                    i11 = 0;
                } else {
                    i11 = 0;
                    dp = ((mn) arrayList4.get(0)).c + AndroidUtilities.dp(3.0f);
                }
                int dp4 = AndroidUtilities.dp(z14 ? 3.0f : 51.0f);
                if (xnVar.C9()) {
                    dp4 = AndroidUtilities.lerp(dp4, AndroidUtilities.dp(71.0f), xnVar.Q8());
                }
                while (i11 < arrayList4.size() && dp > xnVar.wa) {
                    int dp5 = dp - AndroidUtilities.dp(3.0f);
                    mn mnVar2 = (mn) arrayList4.get(i11);
                    int i23 = mnVar2.c;
                    ArrayList arrayList5 = arrayList4;
                    boolean z21 = z20;
                    org.telegram.ui.ActionBar.h5 h5Var6 = h5Var5;
                    h5Var6.setBounds(dp4, i23 - mnVar2.b, mnVar2.a, i23);
                    m.e3 e3Var3 = e3Var2;
                    if (z19) {
                        h5Var6.d(canvas, e3Var3, paint3);
                    }
                    h5Var6.d(canvas, e3Var3, paint2);
                    if (z21) {
                        h5Var6.d(canvas, e3Var3, org.telegram.ui.ActionBar.k6.h2);
                    }
                    h5Var6.d(canvas, e3Var3, paint);
                    if (z14) {
                        e3Var2 = e3Var3;
                        i12 = dp4;
                        h5Var = h5Var6;
                    } else {
                        if (z19) {
                            f11 = 27.0f;
                            e3Var2 = e3Var3;
                            i12 = dp4;
                            canvas.drawCircle(AndroidUtilities.dp(27.0f), i23 - AndroidUtilities.dp(21.0f), AndroidUtilities.dp(21.0f), paint3);
                        } else {
                            e3Var2 = e3Var3;
                            i12 = dp4;
                            f11 = 27.0f;
                        }
                        canvas.drawCircle(AndroidUtilities.dp(f11), i23 - AndroidUtilities.dp(21.0f), AndroidUtilities.dp(21.0f), paint2);
                        if (z21) {
                            h5Var = h5Var6;
                            canvas.drawCircle(AndroidUtilities.dp(f11), i23 - AndroidUtilities.dp(21.0f), AndroidUtilities.dp(21.0f), org.telegram.ui.ActionBar.k6.h2);
                        } else {
                            h5Var = h5Var6;
                        }
                        canvas.drawCircle(AndroidUtilities.dp(f11), i23 - AndroidUtilities.dp(21.0f), AndroidUtilities.dp(21.0f), paint);
                    }
                    dp = dp5 - mnVar2.b;
                    i11++;
                    arrayList4 = arrayList5;
                    z20 = z21;
                    dp4 = i12;
                    h5Var5 = h5Var;
                }
                arrayList2 = arrayList4;
                paint3.setAlpha(alpha3);
                paint2.setAlpha(alpha2);
                paint.setAlpha(alpha4);
                org.telegram.ui.ActionBar.k6.h2.setAlpha(alpha);
                invalidate();
            } else {
                arrayList2 = arrayList4;
                if (System.currentTimeMillis() - xnVar.K6 > j10) {
                    arrayList2.clear();
                }
            }
            arrayList2.size();
            arrayList.size();
            if (xnVar.K9 != 0.0f) {
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
    /* JADX WARN: Type inference failed for: r11v11, types: [org.telegram.ui.Cells.o4] */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v15, types: [org.telegram.ui.Cells.o4] */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v18, types: [org.telegram.ui.Cells.o4] */
    /* JADX WARN: Type inference failed for: r11v41 */
    @Override // org.telegram.ui.Components.tl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.Cells.t1 t1Var;
        boolean z4;
        org.telegram.ui.Cells.t1 t1Var2;
        int i10;
        org.telegram.ui.Cells.v0 v0Var;
        MessageObject.GroupedMessages groupedMessages;
        int i11;
        float f10;
        boolean z10;
        float f11;
        boolean z11;
        float f12;
        boolean z12;
        boolean z13;
        int paddingTop;
        float f13;
        float checkBoxTranslation;
        int i12;
        float f14;
        int b10;
        int b11;
        int i13;
        int i14;
        int i15;
        MessageObject messageObject;
        xn xnVar = this.v3;
        if (xnVar.D9()) {
            invalidate();
        }
        boolean z14 = view == xnVar.G8;
        boolean z15 = view instanceof org.telegram.ui.Cells.t1;
        if (z15) {
            t1Var = (org.telegram.ui.Cells.t1) view;
            z4 = t1Var.Wc.w0;
        } else {
            t1Var = null;
            z4 = false;
        }
        if ((!org.telegram.ui.Components.qv0.s0 && ((view.getY() > getMeasuredHeight() || view.getY() + view.getMeasuredHeight() < 0.0f) && !z4)) || view.getVisibility() == 4 || view.getVisibility() == 8) {
            z14 = true;
        }
        if (z15) {
            t1Var2 = (org.telegram.ui.Cells.t1) view;
            if (xnVar.k6.contains(t1Var2)) {
                z14 = true;
            }
            MessageObject.GroupedMessagePosition currentPosition = t1Var2.getCurrentPosition();
            groupedMessages = t1Var2.getCurrentMessagesGroup();
            if (currentPosition != null) {
                int i16 = currentPosition.pw;
                int i17 = currentPosition.spanSize;
                if (i16 != i17 && i17 == 1000 && currentPosition.siblingHeights == null && groupedMessages.hasSibling) {
                    i10 = t1Var2.getBackgroundDrawableLeft();
                    i14 = 0;
                    i15 = t1Var2.H1;
                    if (i15 != 7) {
                    }
                    xnVar.r8 = t1Var2;
                    if (!z14) {
                    }
                    if (z14) {
                    }
                    i11 = i14;
                    v0Var = null;
                } else if (currentPosition.siblingHeights != null) {
                    i14 = view.getBottom() - AndroidUtilities.dp((t1Var2.m3() ? 1 : 0) + 1);
                    i10 = 0;
                    i15 = t1Var2.H1;
                    if ((i15 != 7 || i15 == 4) && (messageObject = t1Var2.v7) != null && messageObject.type != 5 && MediaController.getInstance().isPlayingMessage(t1Var2.v7)) {
                        xnVar.r8 = t1Var2;
                    }
                    if (!z14) {
                        View view2 = xnVar.G8;
                        if (view2 instanceof org.telegram.ui.Cells.t1) {
                            org.telegram.ui.Cells.t1 t1Var3 = (org.telegram.ui.Cells.t1) view2;
                            if (t1Var3.getCurrentMessagesGroup() != null && t1Var3.getCurrentMessagesGroup() == groupedMessages) {
                                z14 = true;
                            }
                        }
                    }
                    if (z14) {
                        t1Var2.getPhotoImage().skipDraw();
                    }
                    i11 = i14;
                    v0Var = null;
                }
            }
            i10 = 0;
            i14 = 0;
            i15 = t1Var2.H1;
            if (i15 != 7) {
            }
            xnVar.r8 = t1Var2;
            if (!z14) {
            }
            if (z14) {
            }
            i11 = i14;
            v0Var = null;
        } else {
            if (view instanceof org.telegram.ui.Cells.v0) {
                v0Var = (org.telegram.ui.Cells.v0) view;
                t1Var2 = null;
                i10 = 0;
            } else {
                t1Var2 = null;
                i10 = 0;
                v0Var = null;
            }
            groupedMessages = null;
            i11 = 0;
        }
        if (i10 != 0) {
            canvas.save();
        } else if (i11 != 0) {
            canvas.save();
        }
        if (z14) {
            z14 = false;
        }
        if (z14) {
            f10 = 0.0f;
            z10 = false;
        } else {
            boolean z16 = (t1Var2 == null || t1Var2.Wc.v1 || groupedMessages == null || !groupedMessages.transitionParams.backgroundChangeBounds) ? false : true;
            if (z16) {
                canvas.save();
                float E2 = t1Var2.E2(true);
                MessageObject.GroupedMessages.TransitionParams transitionParams = groupedMessages.transitionParams;
                float f15 = transitionParams.right + E2;
                f10 = 0.0f;
                canvas.clipRect(transitionParams.left + E2 + transitionParams.offsetLeft + AndroidUtilities.dp(4.0f), transitionParams.top + transitionParams.offsetTop + AndroidUtilities.dp(4.0f), (f15 + transitionParams.offsetRight) - AndroidUtilities.dp(4.0f), (transitionParams.bottom + transitionParams.offsetBottom) - AndroidUtilities.dp(4.0f));
            } else {
                f10 = 0.0f;
            }
            if (t1Var2 != null) {
                org.telegram.ui.Cells.s1 s1Var = t1Var2.Wc;
                if (s1Var.v1) {
                    canvas.save();
                    canvas.translate(t1Var2.getX(), t1Var2.getY());
                    t1Var2.S1(canvas);
                    canvas.restore();
                    z10 = s1Var.g;
                    if (z16) {
                        canvas.restore();
                    }
                    if (t1Var2 == null && t1Var2.U2()) {
                        canvas.save();
                        canvas.translate(t1Var2.getX(), t1Var2.getPaddingTopAnimated() + t1Var2.getY());
                        t1Var2.X1(canvas);
                        canvas.restore();
                    } else if (v0Var != null) {
                        canvas.save();
                        canvas.translate(v0Var.getX(), v0Var.getY());
                        v0Var.A(canvas);
                        canvas.restore();
                    }
                }
            }
            z10 = (t1Var2 == null || !z16) ? super.drawChild(canvas, view, j10) : super.drawChild(canvas, view, j10);
            if (z16) {
            }
            if (t1Var2 == null) {
            }
            if (v0Var != null) {
            }
        }
        if (i10 != 0 || i11 != 0) {
            canvas.restore();
        }
        if (view.getTranslationY() != f10) {
            canvas.save();
            f11 = 0.0f;
            canvas.translate(0.0f, view.getTranslationY());
        } else {
            f11 = 0.0f;
        }
        if (t1Var2 != null) {
            t1Var2.K1(canvas);
        }
        if (view.getTranslationY() != f11) {
            canvas.restore();
        }
        if (view.getTranslationY() != f11) {
            canvas.save();
            canvas.translate(f11, view.getTranslationY());
        }
        if (t1Var2 != null) {
            MessageObject messageObject2 = t1Var2.getMessageObject();
            MessageObject.GroupedMessagePosition currentPosition2 = t1Var2.getCurrentPosition();
            if (!z14) {
                if (currentPosition2 != null || t1Var2.getTransitionParams().w0) {
                    if (currentPosition2 == null || currentPosition2.last || (currentPosition2.minX == 0 && currentPosition2.minY == 0)) {
                        if (currentPosition2 == null || currentPosition2.last) {
                            this.W2.add(t1Var2);
                        }
                        if ((currentPosition2 == null || (currentPosition2.minX == 0 && currentPosition2.minY == 0)) && t1Var2.T2()) {
                            this.X2.add(t1Var2);
                        }
                    }
                    if (currentPosition2 != null || t1Var2.getTransitionParams().C0 || t1Var2.getTransitionParams().w0) {
                        if (currentPosition2 == null || (currentPosition2.flags & t1Var2.t0()) != 0) {
                            this.Y2.add(t1Var2);
                        }
                        if (currentPosition2 != null) {
                            int i18 = currentPosition2.flags;
                            if ((i18 & 8) != 0) {
                            }
                        }
                        this.Z2.add(t1Var2);
                    }
                }
                if (xnVar.q8 != null && ((messageObject2.isRoundVideo() || messageObject2.isVideo()) && !messageObject2.isVoiceTranscriptionOpen() && MediaController.getInstance().isPlayingMessage(messageObject2))) {
                    ImageReceiver photoImage = t1Var2.getPhotoImage();
                    float x10 = t1Var2.getX() + photoImage.getImageX();
                    float y10 = (xnVar.u0.getY() + (photoImage.getImageY() + (t1Var2.getY() + t1Var2.getPaddingTop()))) - xnVar.q8.getTop();
                    if (xnVar.q8.getTranslationX() != x10 || xnVar.q8.getTranslationY() != y10) {
                        xnVar.q8.setTranslationX(x10);
                        xnVar.q8.setTranslationY(y10);
                        xnVar.fragmentView.invalidate();
                        xnVar.q8.invalidate();
                    }
                }
            }
        }
        if (t1Var != null) {
            MessageObject messageObject3 = t1Var.getMessageObject();
            MessageObject.GroupedMessagePosition currentPosition3 = t1Var.getCurrentPosition();
            ImageReceiver avatarImage = t1Var.getAvatarImage();
            if (avatarImage != null && xnVar.Q8() < 1.0f) {
                MessageObject.GroupedMessages X8 = xnVar.X8(messageObject3);
                if (!t1Var.getMessageObject().deleted) {
                    xnVar.u0.getClass();
                    if (RecyclerView.R(view) != -1) {
                        z12 = true;
                        z13 = !xnVar.u0.U1 || (X8 != null && X8.transitionParams.backgroundChangeBounds);
                        paddingTop = view.getPaddingTop() + (!z13 ? view.getTop() : (int) view.getY());
                        if (t1Var.j()) {
                            if (t1Var.lc) {
                                b11 = ((SparseArray) xnVar.T8.j).indexOfValue(view);
                                if (b11 >= 0) {
                                    b11 = ((SparseArray) xnVar.T8.j).keyAt(b11);
                                }
                            } else {
                                b11 = xnVar.u0.T(view).b();
                            }
                            if (b11 >= 0) {
                                if (X8 == null || currentPosition3 == null) {
                                    z11 = z10;
                                    f13 = 1.0f;
                                    i13 = b11 - 1;
                                } else {
                                    int indexOf = X8.posArray.indexOf(currentPosition3);
                                    f13 = 1.0f;
                                    int size = X8.posArray.size();
                                    if ((currentPosition3.flags & 8) != 0) {
                                        i13 = (b11 - size) + indexOf;
                                    } else {
                                        i13 = b11 - 1;
                                        int i19 = indexOf + 1;
                                        while (i19 < size) {
                                            z11 = z10;
                                            if (X8.posArray.get(i19).minY > currentPosition3.maxY) {
                                                break;
                                            }
                                            i13--;
                                            i19++;
                                            z10 = z11;
                                        }
                                    }
                                    z11 = z10;
                                }
                                if (t1Var.lc) {
                                    if (((View) ((SparseArray) xnVar.T8.j).get(i13)) != null) {
                                        if (view.getTranslationY() != 0.0f) {
                                            canvas.restore();
                                        }
                                        avatarImage.setVisible(false, false);
                                        return z11;
                                    }
                                } else if (xnVar.u0.K(i13) != null) {
                                    if (view.getTranslationY() != 0.0f) {
                                        canvas.restore();
                                    }
                                    avatarImage.setVisible(false, false);
                                    return z11;
                                }
                                checkBoxTranslation = t1Var.getCheckBoxTranslation() + t1Var.getSlidingOffsetX();
                                int layoutHeight = (int) (t1Var2.getLayoutHeight() + t1Var2.getTransitionParams().i0 + ((int) (t1Var.getPaddingTopAnimated() + ((int) (0 + (z13 ? view.getTop() : view.getY()))))));
                                int measuredHeight = xnVar.u0.getMeasuredHeight() - xnVar.u0.getPaddingBottom();
                                boolean z17 = (!t1Var.j1 || t1Var.k1) && checkBoxTranslation == 0.0f;
                                if (!t1Var.o3() || t1Var.getTransitionParams().k2) {
                                    if (t1Var.getTransitionParams().k2) {
                                        float f16 = t1Var.getTransitionParams().K1;
                                        if (!t1Var.o3()) {
                                            f16 = f13 - f16;
                                        }
                                        layoutHeight = (int) e2.c.w(1.0f, f16, Math.min(layoutHeight, measuredHeight), layoutHeight * f16);
                                    }
                                } else if (layoutHeight > measuredHeight) {
                                    layoutHeight = measuredHeight;
                                }
                                if (!z13 && view.getTranslationY() != 0.0f) {
                                    canvas.restore();
                                }
                                if (t1Var.h()) {
                                    if (t1Var.lc) {
                                        b10 = ((SparseArray) xnVar.T8.j).indexOfValue(view);
                                        if (b10 >= 0) {
                                            b10 = ((SparseArray) xnVar.T8.j).keyAt(b10);
                                        }
                                    } else {
                                        b10 = xnVar.u0.T(view).b();
                                    }
                                    if (b10 >= 0) {
                                        float f17 = checkBoxTranslation;
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
                                                f2.m1 K = xnVar.u0.K(i20);
                                                if (K == null) {
                                                    break;
                                                }
                                                ?? r02 = K.a;
                                                paddingTop = r02.getPaddingTop() + r02.getTop();
                                                if (!(r02 instanceof org.telegram.ui.Cells.t1)) {
                                                    break;
                                                }
                                                r11 = (org.telegram.ui.Cells.o4) r02;
                                                float checkBoxTranslation2 = r11.getCheckBoxTranslation() + r11.getSlidingOffsetX();
                                                if (z17 && checkBoxTranslation2 > 0.0f) {
                                                    f17 = checkBoxTranslation2;
                                                }
                                                if (!r11.h()) {
                                                    break;
                                                }
                                                layoutHeight = i12;
                                                r11 = r11;
                                            } else {
                                                ?? r03 = (View) ((SparseArray) xnVar.T8.j).get(i20);
                                                if (r03 == 0) {
                                                    break;
                                                }
                                                paddingTop = r03.getPaddingTop() + r03.getTop();
                                                if (!(r03 instanceof org.telegram.ui.Cells.o4)) {
                                                    break;
                                                }
                                                r11 = (org.telegram.ui.Cells.o4) r03;
                                                float checkBoxTranslation3 = r11.getCheckBoxTranslation() + r11.getSlidingOffsetX();
                                                if (z17 && checkBoxTranslation3 > 0.0f) {
                                                    f17 = checkBoxTranslation3;
                                                }
                                                if (!r11.h()) {
                                                    break;
                                                }
                                                layoutHeight = i12;
                                                r11 = r11;
                                            }
                                            int dp = i12 - AndroidUtilities.dp(48.0f) < paddingTop ? AndroidUtilities.dp(48.0f) + paddingTop : i12;
                                            if (!t1Var.j()) {
                                                int bottom = z13 ? view.getBottom() : (int) (t1Var.getDeltaBottom() + t1Var.getY() + t1Var.getMeasuredHeight());
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
                                            if (z12) {
                                                avatarImage.setImageY(dp - AndroidUtilities.dp(44.0f));
                                            }
                                            if (t1Var.a()) {
                                                avatarImage.setAlpha(t1Var.getAlpha() * (1.0f - xnVar.Q8()));
                                                canvas.scale(t1Var.getScaleX(), t1Var.getScaleY(), t1Var.getPivotX() + t1Var.getX(), t1Var.getY() + (t1Var.getHeight() >> 1));
                                                f14 = 1.0f;
                                            } else {
                                                f14 = 1.0f;
                                                avatarImage.setAlpha(1.0f - xnVar.Q8());
                                            }
                                            if (z12) {
                                                avatarImage.setVisible(true, false);
                                            }
                                            if (xnVar.Q8() > 0.0f) {
                                                canvas.scale(f14 - xnVar.Q8(), f14 - xnVar.Q8(), avatarImage.getImageX2(), avatarImage.getImageY2());
                                                f12 = 0.0f;
                                                canvas.translate(xnVar.Q8() * AndroidUtilities.dp(24.0f), 0.0f);
                                            } else {
                                                f12 = 0.0f;
                                            }
                                            avatarImage.draw(canvas);
                                            canvas.restore();
                                            if (!z13 && view.getTranslationY() != f12) {
                                                canvas.save();
                                            }
                                            if (view.getTranslationY() != f12) {
                                                canvas.restore();
                                            }
                                            return z11;
                                        }
                                        i12 = layoutHeight;
                                        t1Var = r11;
                                        checkBoxTranslation = f17;
                                        if (i12 - AndroidUtilities.dp(48.0f) < paddingTop) {
                                        }
                                        if (!t1Var.j()) {
                                        }
                                        canvas.save();
                                        if (checkBoxTranslation != 0.0f) {
                                        }
                                        if (t1Var instanceof org.telegram.ui.Cells.t1) {
                                        }
                                        if (z12) {
                                        }
                                        if (t1Var.a()) {
                                        }
                                        if (z12) {
                                        }
                                        if (xnVar.Q8() > 0.0f) {
                                        }
                                        avatarImage.draw(canvas);
                                        canvas.restore();
                                        if (!z13) {
                                            canvas.save();
                                        }
                                        if (view.getTranslationY() != f12) {
                                        }
                                        return z11;
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
                                if (z12) {
                                }
                                if (t1Var.a()) {
                                }
                                if (z12) {
                                }
                                if (xnVar.Q8() > 0.0f) {
                                }
                                avatarImage.draw(canvas);
                                canvas.restore();
                                if (!z13) {
                                }
                                if (view.getTranslationY() != f12) {
                                }
                                return z11;
                            }
                        }
                        z11 = z10;
                        f13 = 1.0f;
                        checkBoxTranslation = t1Var.getCheckBoxTranslation() + t1Var.getSlidingOffsetX();
                        int layoutHeight2 = (int) (t1Var2.getLayoutHeight() + t1Var2.getTransitionParams().i0 + ((int) (t1Var.getPaddingTopAnimated() + ((int) (0 + (z13 ? view.getTop() : view.getY()))))));
                        int measuredHeight2 = xnVar.u0.getMeasuredHeight() - xnVar.u0.getPaddingBottom();
                        if (t1Var.j1) {
                        }
                        if (t1Var.o3()) {
                        }
                        if (t1Var.getTransitionParams().k2) {
                        }
                        if (!z13) {
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
                        if (z12) {
                        }
                        if (t1Var.a()) {
                        }
                        if (z12) {
                        }
                        if (xnVar.Q8() > 0.0f) {
                        }
                        avatarImage.draw(canvas);
                        canvas.restore();
                        if (!z13) {
                        }
                        if (view.getTranslationY() != f12) {
                        }
                        return z11;
                    }
                }
                z12 = false;
                if (xnVar.u0.U1) {
                }
                paddingTop = view.getPaddingTop() + (!z13 ? view.getTop() : (int) view.getY());
                if (t1Var.j()) {
                }
                z11 = z10;
                f13 = 1.0f;
                checkBoxTranslation = t1Var.getCheckBoxTranslation() + t1Var.getSlidingOffsetX();
                int layoutHeight22 = (int) (t1Var2.getLayoutHeight() + t1Var2.getTransitionParams().i0 + ((int) (t1Var.getPaddingTopAnimated() + ((int) (0 + (z13 ? view.getTop() : view.getY()))))));
                int measuredHeight22 = xnVar.u0.getMeasuredHeight() - xnVar.u0.getPaddingBottom();
                if (t1Var.j1) {
                }
                if (t1Var.o3()) {
                }
                if (t1Var.getTransitionParams().k2) {
                }
                if (!z13) {
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
                if (z12) {
                }
                if (t1Var.a()) {
                }
                if (z12) {
                }
                if (xnVar.Q8() > 0.0f) {
                }
                avatarImage.draw(canvas);
                canvas.restore();
                if (!z13) {
                }
                if (view.getTranslationY() != f12) {
                }
                return z11;
            }
        }
        z11 = z10;
        f12 = 0.0f;
        if (view.getTranslationY() != f12) {
        }
        return z11;
    }

    @Override // org.telegram.ui.Components.tl0
    public final void h1(View view, float f10, float f11, boolean z4) {
        MessageObject.GroupedMessages currentMessagesGroup;
        super.h1(view, f10, f11, z4);
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
                        t1Var2.setPressed(z4);
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
        float f10;
        float f11;
        up upVar;
        int i10;
        float f12;
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
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        Paint paint3;
        float f18;
        Paint paint4;
        Paint paint5;
        float f19;
        float f20;
        float f21;
        org.telegram.ui.ActionBar.g6 g6Var;
        int i15;
        float f22;
        float f23;
        super.onDraw(canvas);
        xn xnVar = this.v3;
        org.telegram.ui.Cells.t1 t1Var = xnVar.a9;
        if (t1Var != null) {
            float slidingOffsetX = e2.c.s(t1Var) ? t1Var.getSlidingOffsetX() : 0.0f;
            if (!xnVar.b9 && !xnVar.c9 && this.g3 != 0.0f && slidingOffsetX != 0.0f) {
                long currentTimeMillis = System.currentTimeMillis();
                float f24 = ((currentTimeMillis - this.e3) / 180.0f) + this.f3;
                this.f3 = f24;
                if (f24 > 1.0f) {
                    this.f3 = 1.0f;
                }
                this.e3 = currentTimeMillis;
                float interpolation = (1.0f - AndroidUtilities.decelerateInterpolator.getInterpolation(this.f3)) * this.g3;
                if (interpolation == 0.0f) {
                    this.g3 = 0.0f;
                }
                org.telegram.ui.Cells.t1 t1Var2 = xnVar.a9;
                if (e2.c.s(t1Var2)) {
                    z1(t1Var2, interpolation);
                }
                xn.V1(xnVar, interpolation);
                MessageObject T1 = xn.T1(xnVar);
                if (T1 != null && (T1.isRoundVideo() || T1.isVideo())) {
                    xnVar.Mc(false, false);
                }
                float f25 = this.f3;
                if (f25 == 1.0f || f25 == 0.0f) {
                    xn.V1(xnVar, 0.0f);
                    xnVar.a9 = null;
                }
                invalidate();
            }
            if (xnVar.a9 != null && Thread.currentThread() == Looper.getMainLooper().getThread()) {
                Paint X0 = X0("paintChatActionBackground");
                Paint paint6 = org.telegram.ui.ActionBar.k6.h2;
                Paint paint7 = this.j3;
                if (paint7.getColor() != X0.getColor()) {
                    paint7.setColor(X0.getColor());
                }
                Paint paint8 = this.k3;
                if (paint8.getColor() != paint6.getColor()) {
                    paint8.setColor(paint6.getColor());
                }
                if (paint7.getShader() != X0.getShader()) {
                    paint7.setShader(X0.getShader());
                }
                if (paint8.getShader() != paint6.getShader()) {
                    paint8.setShader(paint6.getShader());
                }
                kb.a aVar = this.n3;
                float f26 = aVar.a;
                float f27 = this.i3;
                float f28 = f26 / f27;
                f10 = 255.0f;
                int color = paint8.getColor();
                if (f28 > 1.0f) {
                    this.r3 = true;
                }
                f11 = 2.0f;
                org.telegram.ui.Cells.t1 t1Var3 = xnVar.a9;
                float E2 = e2.c.s(t1Var3) ? t1Var3.E2(false) : 0.0f;
                kb.a aVar2 = this.l3;
                float f29 = aVar2.a;
                kb.a aVar3 = this.p3;
                o1.j jVar = this.q3;
                o1.j jVar2 = this.o3;
                if (f29 == 0.0f) {
                    jVar2.c();
                    paint = paint6;
                    paint2 = paint7;
                    i14 = color;
                    double d = 0.0f;
                    jVar2.u.i = d;
                    aVar.a = 0.0f;
                    jVar.c();
                    jVar.u.i = d;
                    aVar3.a = 0.0f;
                    this.r3 = false;
                } else {
                    paint = paint6;
                    paint2 = paint7;
                    i14 = color;
                }
                if (((float) jVar2.u.i) != f27) {
                    f13 = 1.0f;
                    f14 = k7.o.a(((-E2) - AndroidUtilities.dp(20.0f)) / AndroidUtilities.dp(30.0f), 0.0f, 1.0f);
                } else {
                    f13 = 1.0f;
                    f14 = 1.0f;
                }
                if (f14 == f13) {
                    o1.k kVar = jVar2.u;
                    f15 = f28;
                    f16 = 20.0f;
                    if (((float) kVar.i) != f27) {
                        double d10 = f27;
                        kVar.i = d10;
                        jVar2.f();
                        jVar.u.i = d10;
                        jVar.f();
                    }
                } else {
                    f15 = f28;
                    f16 = 20.0f;
                }
                float f30 = E2 <= ((float) (-AndroidUtilities.dp(f16))) ? f27 : 0.0f;
                o1.j jVar3 = this.m3;
                o1.k kVar2 = jVar3.u;
                if (f30 != ((float) kVar2.i)) {
                    kVar2.i = f30;
                    if (!jVar3.f) {
                        jVar3.f();
                    }
                }
                float f31 = aVar2.a / f27;
                MessageObject T12 = xn.T1(xnVar);
                float measuredWidth = (E2 * ((T12 == null || !T12.isOut()) ? 1.0f : 0.5f)) + getMeasuredWidth();
                float measuredHeight = (xnVar.a9.getMeasuredHeight() / 2.0f) + xnVar.a9.getTop();
                boolean z4 = this.r3;
                float f32 = z4 ? f15 : f31;
                float f33 = z4 ? 0.0f : 1.0f - f15;
                int i16 = org.telegram.ui.ActionBar.k6.d6;
                org.telegram.ui.ActionBar.g6 g6Var2 = this.m2;
                boolean z10 = i0.a.f(org.telegram.ui.ActionBar.k6.v0(i16, g6Var2)) <= 0.5d;
                if (f31 != 0.0f) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    f19 = f27;
                    rectF.set((int) ((paint2.getStrokeWidth() / 2.0f) + (measuredWidth - (AndroidUtilities.dp(16.0f) * f32))), (int) ((paint2.getStrokeWidth() / 2.0f) + (measuredHeight - (AndroidUtilities.dp(16.0f) * f32))), (int) (((AndroidUtilities.dp(16.0f) * f32) + measuredWidth) - (paint2.getStrokeWidth() / 2.0f)), (int) (((AndroidUtilities.dp(16.0f) * f32) + measuredHeight) - (paint2.getStrokeWidth() / 2.0f)));
                    org.telegram.ui.ActionBar.k6.q(0.0f, getY() + rectF.top, getMeasuredWidth(), AndroidUtilities.displaySize.y);
                    if (f15 == 0.0f) {
                        int alpha = paint2.getAlpha();
                        Paint paint9 = paint2;
                        paint9.setAlpha((int) (alpha * f31));
                        float f34 = f14 * 360.0f;
                        f17 = f14;
                        f20 = f31;
                        paint3 = paint;
                        g6Var = g6Var2;
                        f18 = measuredWidth;
                        f21 = measuredHeight;
                        canvas.drawArc(rectF, -90.0f, f34, false, paint9);
                        paint9.setAlpha(alpha);
                        if (xnVar.ba.o0()) {
                            int alpha2 = paint8.getAlpha();
                            paint5 = paint8;
                            if (z10) {
                                paint5.setColor(-1);
                            }
                            paint5.setAlpha((int) (alpha2 * f20));
                            paint4 = paint9;
                            canvas2 = canvas;
                            canvas2.drawArc(rectF, -90.0f, f34, false, paint5);
                        } else {
                            paint4 = paint9;
                            paint5 = paint8;
                            canvas2 = canvas;
                        }
                    } else {
                        Paint paint10 = paint2;
                        f17 = f14;
                        paint3 = paint;
                        f18 = measuredWidth;
                        paint4 = paint10;
                        canvas2 = canvas;
                        f20 = f31;
                        g6Var = g6Var2;
                        paint5 = paint8;
                        f21 = measuredHeight;
                    }
                } else {
                    Paint paint11 = paint2;
                    f17 = f14;
                    paint3 = paint;
                    f18 = measuredWidth;
                    paint4 = paint11;
                    canvas2 = canvas;
                    paint5 = paint8;
                    f19 = f27;
                    f20 = f31;
                    f21 = measuredHeight;
                    g6Var = g6Var2;
                }
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set((int) (f18 - (AndroidUtilities.dp(16.0f) * f32)), (int) (f21 - (AndroidUtilities.dp(16.0f) * f32)), (int) ((AndroidUtilities.dp(16.0f) * f32) + f18), (int) ((AndroidUtilities.dp(16.0f) * f32) + f21));
                org.telegram.ui.ActionBar.k6.q(0.0f, getY() + rectF2.top, getMeasuredWidth(), AndroidUtilities.displaySize.y);
                Path path = this.s3;
                path.rewind();
                Path.Direction direction = Path.Direction.CW;
                path.addRoundRect(rectF2, AndroidUtilities.dp(16.0f) * f32, AndroidUtilities.dp(16.0f) * f32, direction);
                int alpha3 = X0.getAlpha();
                float f35 = 0.6f * f20 * f17;
                X0.setAlpha((int) (alpha3 * f35));
                canvas2.drawPath(path, X0);
                X0.setAlpha(alpha3);
                if (xnVar.ba.o0()) {
                    int alpha4 = org.telegram.ui.ActionBar.k6.h2.getAlpha();
                    if (z10) {
                        f23 = f35;
                        org.telegram.ui.ActionBar.k6.h2.setColor(-1);
                    } else {
                        f23 = f35;
                    }
                    org.telegram.ui.ActionBar.k6.h2.setAlpha((int) (alpha4 * f23));
                    canvas2.drawPath(path, org.telegram.ui.ActionBar.k6.h2);
                    org.telegram.ui.ActionBar.k6.h2.setAlpha(alpha4);
                }
                int i17 = (f33 > 0.0f ? 1 : (f33 == 0.0f ? 0 : -1));
                if (i17 != 0) {
                    i15 = i17;
                    f22 = f32;
                    rectF2.set((int) (f18 - (AndroidUtilities.dp(16.0f) * f33)), (int) (f21 - (AndroidUtilities.dp(16.0f) * f33)), (int) ((AndroidUtilities.dp(16.0f) * f33) + f18), (int) ((AndroidUtilities.dp(16.0f) * f33) + f21));
                    path.rewind();
                    path.addRoundRect(rectF2, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), direction);
                    canvas2.save();
                    canvas2.clipPath(path, Region.Op.DIFFERENCE);
                } else {
                    i15 = i17;
                    f22 = f32;
                }
                rectF2.set((int) (f18 - (AndroidUtilities.dp(16.0f) * f22)), (int) (f21 - (AndroidUtilities.dp(16.0f) * f22)), (int) ((AndroidUtilities.dp(16.0f) * f22) + f18), (int) ((AndroidUtilities.dp(16.0f) * f22) + f21));
                org.telegram.ui.ActionBar.k6.q(0.0f, getY() + rectF2.top, getMeasuredWidth(), AndroidUtilities.displaySize.y);
                path.rewind();
                path.addRoundRect(rectF2, AndroidUtilities.dp(16.0f) * f22, AndroidUtilities.dp(16.0f) * f22, direction);
                int alpha5 = X0.getAlpha();
                float f36 = 0.4f * f20;
                X0.setAlpha((int) (alpha5 * f36));
                canvas2.drawPath(path, X0);
                X0.setAlpha(alpha5);
                if (xnVar.ba.o0()) {
                    int alpha6 = org.telegram.ui.ActionBar.k6.h2.getAlpha();
                    if (z10) {
                        org.telegram.ui.ActionBar.k6.h2.setColor(-1);
                    }
                    org.telegram.ui.ActionBar.k6.h2.setAlpha((int) (f36 * alpha6));
                    canvas2.drawPath(path, org.telegram.ui.ActionBar.k6.h2);
                    org.telegram.ui.ActionBar.k6.h2.setAlpha(alpha6);
                }
                if (i15 != 0) {
                    canvas2.restore();
                }
                float f37 = aVar3.a / f19;
                if (f37 != 0.0f && f37 != 1.0f) {
                    float f38 = f37 + 1.0f;
                    float strokeWidth = paint4.getStrokeWidth();
                    float f39 = (1.0f - f37) * strokeWidth;
                    if (f39 != 0.0f) {
                        rectF2.set((int) ((f18 - (AndroidUtilities.dp(16.0f) * f38)) + f39), (int) ((f21 - (AndroidUtilities.dp(16.0f) * f38)) + f39), (int) (((AndroidUtilities.dp(16.0f) * f38) + f18) - f39), (int) (((AndroidUtilities.dp(16.0f) * f38) + f21) - f39));
                        org.telegram.ui.ActionBar.k6.q(0.0f, getY() + rectF2.top, getMeasuredWidth(), AndroidUtilities.displaySize.y);
                        int alpha7 = paint4.getAlpha();
                        paint4.setAlpha((int) (alpha7 * f20));
                        paint4.setStrokeWidth(f39);
                        canvas2.drawRoundRect(rectF2, AndroidUtilities.dp(16.0f) * f38, AndroidUtilities.dp(16.0f) * f38, paint4);
                        paint4.setStrokeWidth(strokeWidth);
                        paint4.setAlpha(alpha7);
                        if (xnVar.ba.o0()) {
                            int alpha8 = paint5.getAlpha();
                            if (z10) {
                                paint5.setColor(-1);
                            }
                            paint5.setAlpha((int) (alpha8 * f20));
                            paint5.setStrokeWidth(f39);
                            canvas2.drawRoundRect(rectF2, AndroidUtilities.dp(16.0f) * f38, AndroidUtilities.dp(16.0f) * f38, paint5);
                            paint5.setStrokeWidth(strokeWidth);
                        }
                    }
                }
                int i18 = (int) (f20 * 255.0f);
                Drawable drawable = g6Var != null ? g6Var.getDrawable("drawableReplyIcon") : null;
                if (drawable == null) {
                    drawable = org.telegram.ui.ActionBar.k6.O0("drawableReplyIcon");
                }
                drawable.setAlpha(i18);
                drawable.setBounds((int) (f18 - ((drawable.getIntrinsicWidth() / 2) * f22)), (int) (f21 - ((drawable.getIntrinsicHeight() / 2) * f22)), (int) (((drawable.getIntrinsicWidth() / 2) * f22) + f18), (int) (((drawable.getIntrinsicHeight() / 2) * f22) + f21));
                drawable.draw(canvas2);
                drawable.setAlpha(255);
                int i19 = i14;
                paint5.setColor(i19);
                paint3.setColor(i19);
                if (xnVar.K9 != 0.0f || xnVar.isInPreviewMode() || xnVar.La || (i10 = xnVar.O3) == 3 || i10 == 1) {
                    upVar = xnVar.M9;
                    if (upVar == null) {
                        upVar.L = 0.0f;
                        upVar.K = false;
                        return;
                    }
                    return;
                }
                canvas2.save();
                if (xnVar.R9 != 0.0f) {
                    float measuredHeight2 = xnVar.u0.getMeasuredHeight() - xnVar.K9;
                    xn xnVar2 = xnVar.Q9;
                    f12 = (measuredHeight2 + (xnVar2 == null ? 0.0f : xnVar2.L9)) * xnVar.R9;
                } else {
                    f12 = 0.0f;
                }
                canvas2.translate(0.0f, (getMeasuredHeight() - xnVar.xa) - f12);
                if (xnVar.M9 == null) {
                    i13 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
                    up upVar2 = new up(i13, xnVar.fragmentView, xnVar.Q5, xnVar.ra, xnVar.sa, xnVar.b(), xnVar.ba);
                    xnVar.M9 = upVar2;
                    upVar2.P = xnVar.rc.e;
                    ArrayList arrayList = xnVar.cb;
                    if (arrayList != null && !arrayList.isEmpty()) {
                        xnVar.M9.i((TLRPC.Chat) xnVar.cb.get(0));
                    } else if (xnVar.e4) {
                        xnVar.M9.j();
                    } else {
                        xnVar.M9.h();
                    }
                    xnVar.M9.f();
                }
                up upVar3 = xnVar.M9;
                int measuredWidth2 = getMeasuredWidth() - (xnVar.C9() ? AndroidUtilities.dp(71.0f) : 0);
                ImageReceiver imageReceiver = upVar3.C;
                TextPaint textPaint = upVar3.f;
                TextPaint textPaint2 = upVar3.h;
                boolean z11 = upVar3.U;
                if (measuredWidth2 != upVar3.c || (z11 && (tL_forumTopic = upVar3.E) != null && upVar3.F != tL_forumTopic.id)) {
                    upVar3.d = AndroidUtilities.dp(56.0f) / f11;
                    upVar3.c = measuredWidth2;
                    TLRPC.Chat chat = upVar3.D;
                    if (chat != null) {
                        string = chat.title;
                    } else {
                        TLRPC.TL_forumTopic tL_forumTopic2 = upVar3.E;
                        if (tL_forumTopic2 != null) {
                            string = tL_forumTopic2.title;
                        } else {
                            if (z11) {
                                i11 = 0;
                                string = LocaleController.formatString(R.string.SwipeToGoNextTopicEnd, MessagesController.getInstance(upVar3.b0).getChat(Long.valueOf(-upVar3.f0)).title);
                            } else {
                                i11 = 0;
                                string = LocaleController.getString(R.string.SwipeToGoNextChannelEnd);
                            }
                            int measureText = (int) textPaint.measureText((CharSequence) string, i11, string.length());
                            upVar3.x = measureText;
                            int min = Math.min(measureText, upVar3.c - AndroidUtilities.dp(60.0f));
                            upVar3.x = min;
                            upVar3.s = org.telegram.ui.Components.lw0.c(string, textPaint, min, Layout.Alignment.ALIGN_NORMAL, 0.0f, false, TextUtils.TruncateAt.END, min, 1, true);
                            if (!upVar3.S) {
                                string2 = LocaleController.getString(R.string.SwipeToGoNextRecommendedChannel);
                                string3 = LocaleController.getString(R.string.ReleaseToGoNextRecommendedChannel);
                            } else if (z11) {
                                string2 = LocaleController.getString(R.string.SwipeToGoNextUnreadTopic);
                                string3 = LocaleController.getString(R.string.ReleaseToGoNextUnreadTopic);
                            } else {
                                boolean z12 = upVar3.T;
                                if (z12 && (i12 = upVar3.a) != upVar3.c0 && i12 != 0) {
                                    string2 = LocaleController.getString(R.string.SwipeToGoNextArchive);
                                    string3 = LocaleController.getString(R.string.ReleaseToGoNextArchive);
                                } else if (z12) {
                                    string2 = LocaleController.getString(R.string.SwipeToGoNextFolder);
                                    string3 = LocaleController.getString(R.string.ReleaseToGoNextFolder);
                                } else {
                                    string2 = LocaleController.getString(R.string.SwipeToGoNextChannel);
                                    string3 = LocaleController.getString(R.string.ReleaseToGoNextChannel);
                                }
                            }
                            int measureText2 = (int) textPaint2.measureText(string2);
                            upVar3.y = measureText2;
                            upVar3.y = Math.min(measureText2, upVar3.c - AndroidUtilities.dp(60.0f));
                            int i20 = upVar3.y;
                            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                            upVar3.v = new StaticLayout(string2, textPaint2, i20, alignment, 1.0f, 0.0f, false);
                            int measureText3 = (int) textPaint2.measureText(string3);
                            upVar3.B = measureText3;
                            upVar3.B = Math.min(measureText3, upVar3.c - AndroidUtilities.dp(60.0f));
                            upVar3.w = new StaticLayout(string3, textPaint2, upVar3.B, alignment, 1.0f, 0.0f, false);
                            imageReceiver.setImageCoords((upVar3.c / f11) - (AndroidUtilities.dp(40.0f) / f11), (AndroidUtilities.dp(12.0f) + upVar3.d) - (AndroidUtilities.dp(40.0f) / f11), AndroidUtilities.dp(40.0f), AndroidUtilities.dp(40.0f));
                            imageReceiver.setRoundRadius((int) (AndroidUtilities.dp(40.0f) / f11));
                            upVar3.Z.d(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(100.0f));
                            if (z11) {
                                upVar3.F = upVar3.E == null ? 0L : r3.id;
                            }
                        }
                    }
                    i11 = 0;
                    int measureText4 = (int) textPaint.measureText((CharSequence) string, i11, string.length());
                    upVar3.x = measureText4;
                    int min2 = Math.min(measureText4, upVar3.c - AndroidUtilities.dp(60.0f));
                    upVar3.x = min2;
                    upVar3.s = org.telegram.ui.Components.lw0.c(string, textPaint, min2, Layout.Alignment.ALIGN_NORMAL, 0.0f, false, TextUtils.TruncateAt.END, min2, 1, true);
                    if (!upVar3.S) {
                    }
                    int measureText22 = (int) textPaint2.measureText(string2);
                    upVar3.y = measureText22;
                    upVar3.y = Math.min(measureText22, upVar3.c - AndroidUtilities.dp(60.0f));
                    int i202 = upVar3.y;
                    Layout.Alignment alignment2 = Layout.Alignment.ALIGN_CENTER;
                    upVar3.v = new StaticLayout(string2, textPaint2, i202, alignment2, 1.0f, 0.0f, false);
                    int measureText32 = (int) textPaint2.measureText(string3);
                    upVar3.B = measureText32;
                    upVar3.B = Math.min(measureText32, upVar3.c - AndroidUtilities.dp(60.0f));
                    upVar3.w = new StaticLayout(string3, textPaint2, upVar3.B, alignment2, 1.0f, 0.0f, false);
                    imageReceiver.setImageCoords((upVar3.c / f11) - (AndroidUtilities.dp(40.0f) / f11), (AndroidUtilities.dp(12.0f) + upVar3.d) - (AndroidUtilities.dp(40.0f) / f11), AndroidUtilities.dp(40.0f), AndroidUtilities.dp(40.0f));
                    imageReceiver.setRoundRadius((int) (AndroidUtilities.dp(40.0f) / f11));
                    upVar3.Z.d(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(100.0f));
                    if (z11) {
                    }
                }
                float min3 = Math.min(1.0f, xnVar.K9 / AndroidUtilities.dp(110.0f));
                canvas2.translate(xnVar.C9() ? AndroidUtilities.lerp(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(71.0f), xnVar.Q8()) : 0.0f, -(xnVar.W8(org.telegram.ui.Components.t21.c) + xnVar.P.getInputBubbleHeight() + xnVar.v.c() + AndroidUtilities.dp(10.0f)));
                xnVar.M9.a(canvas2, xnVar.u0, min3, 1.0f - xnVar.R9);
                canvas2.restore();
                if (xnVar.Q9 != null) {
                    canvas2.saveLayerAlpha(0.0f, 0.0f, r2.u0.getMeasuredWidth(), xnVar.Q9.u0.getMeasuredHeight(), (int) (xnVar.R9 * f10), 31);
                    canvas2.translate(0.0f, (getMeasuredHeight() - xnVar.K9) - f12);
                    xnVar.Q9.u0.draw(canvas2);
                    canvas2.restore();
                    return;
                }
                return;
            }
        }
        canvas2 = canvas;
        f10 = 255.0f;
        f11 = 2.0f;
        if (xnVar.K9 != 0.0f) {
        }
        upVar = xnVar.M9;
        if (upVar == null) {
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        if (this.v3.h != null) {
            return;
        }
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        AccessibilityNodeInfo.CollectionInfo collectionInfo = accessibilityNodeInfo.getCollectionInfo();
        if (collectionInfo != null) {
            accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(collectionInfo.getRowCount(), 1, false));
        }
    }

    @Override // org.telegram.ui.Components.tl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ih.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        xn xnVar = this.v3;
        qm qmVar = xnVar.Z8;
        qmVar.getClass();
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            AndroidUtilities.cancelRunOnUIThread(qmVar.g0);
            qmVar.z = false;
        }
        if (this.U1 || ((kVar = xnVar.U9) != null && kVar.a())) {
            return false;
        }
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        kVar2 = ((org.telegram.ui.ActionBar.p2) xnVar).actionBar;
        if (!kVar2.s() && !xnVar.A9()) {
            y1(motionEvent);
        }
        return onInterceptTouchEvent;
    }

    @Override // org.telegram.ui.Components.tl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        int i14 = this.V2;
        int i15 = i12 - i10;
        xn xnVar = this.v3;
        if (i14 != i15) {
            if (i14 != 0) {
                xnVar.h9(false);
            }
            this.V2 = i15;
        }
        int measuredHeight = getMeasuredHeight();
        if (this.u3 != measuredHeight) {
            this.t3 = true;
            sj sjVar = xnVar.v0;
            if (sjVar != null) {
                sjVar.g();
            }
            xnVar.T8.a();
            this.t3 = false;
            this.u3 = measuredHeight;
        }
        xnVar.O5 = false;
        qm qmVar = xnVar.Z8;
        if (qmVar != null && qmVar.y()) {
            xnVar.Z8.x();
        }
        xnVar.p9();
        xnVar.D9();
    }

    @Override // org.telegram.ui.Components.tl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        up upVar;
        xn xnVar = this.v3;
        xd.a aVar = xnVar.rc;
        qm qmVar = xnVar.Z8;
        qmVar.getClass();
        final int i10 = 3;
        final int i11 = 0;
        final int i12 = 1;
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            AndroidUtilities.cancelRunOnUIThread(qmVar.g0);
            qmVar.z = false;
        }
        if (motionEvent.getAction() == 0) {
            xnVar.pa = true;
        }
        if (xnVar.K9 != 0.0f && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            float min = Math.min(1.0f, xnVar.K9 / AndroidUtilities.dp(110.0f));
            final int i13 = 2;
            if (motionEvent.getAction() != 1 || min != 1.0f || (upVar = xnVar.M9) == null || upVar.O) {
                up upVar2 = xnVar.M9;
                if (upVar2 != null && upVar2.O) {
                    long currentTimeMillis = System.currentTimeMillis();
                    up upVar3 = xnVar.M9;
                    if (currentTimeMillis - upVar3.R < 500 && upVar3.J) {
                        AnimatorSet animatorSet = new AnimatorSet();
                        xnVar.N9 = animatorSet;
                        if (xnVar.M9 != null) {
                            aVar.a(false, true);
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(xnVar.K9, AndroidUtilities.dp(111.0f));
                        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.pj
                            public final /* synthetic */ qj b;

                            {
                                this.b = this;
                            }

                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (i12) {
                                    case 0:
                                        xn xnVar2 = this.b.v3;
                                        xnVar2.K9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        xnVar2.u0.invalidate();
                                        break;
                                    case 1:
                                        xn xnVar3 = this.b.v3;
                                        xnVar3.K9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        xnVar3.u0.invalidate();
                                        break;
                                    case 2:
                                        xn xnVar4 = this.b.v3;
                                        xnVar4.K9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        xnVar4.u0.invalidate();
                                        break;
                                    default:
                                        xn xnVar5 = this.b.v3;
                                        xnVar5.K9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        xnVar5.u0.invalidate();
                                        break;
                                }
                            }
                        });
                        ofFloat.setDuration(400L);
                        ofFloat.setInterpolator(org.telegram.ui.Components.pr.f);
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(AndroidUtilities.dp(111.0f), 0.0f);
                        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.pj
                            public final /* synthetic */ qj b;

                            {
                                this.b = this;
                            }

                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (i13) {
                                    case 0:
                                        xn xnVar2 = this.b.v3;
                                        xnVar2.K9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        xnVar2.u0.invalidate();
                                        break;
                                    case 1:
                                        xn xnVar3 = this.b.v3;
                                        xnVar3.K9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        xnVar3.u0.invalidate();
                                        break;
                                    case 2:
                                        xn xnVar4 = this.b.v3;
                                        xnVar4.K9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        xnVar4.u0.invalidate();
                                        break;
                                    default:
                                        xn xnVar5 = this.b.v3;
                                        xnVar5.K9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        xnVar5.u0.invalidate();
                                        break;
                                }
                            }
                        });
                        ofFloat2.setStartDelay(600L);
                        ofFloat2.setDuration(250L);
                        ofFloat2.setInterpolator(xh.n.V);
                        animatorSet.playSequentially(ofFloat, ofFloat2);
                        animatorSet.start();
                    }
                }
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(xnVar.K9, 0.0f);
                xnVar.N9 = ofFloat3;
                if (xnVar.M9 != null) {
                    aVar.a(false, true);
                }
                ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.pj
                    public final /* synthetic */ qj b;

                    {
                        this.b = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i10) {
                            case 0:
                                xn xnVar2 = this.b.v3;
                                xnVar2.K9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                xnVar2.u0.invalidate();
                                break;
                            case 1:
                                xn xnVar3 = this.b.v3;
                                xnVar3.K9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                xnVar3.u0.invalidate();
                                break;
                            case 2:
                                xn xnVar4 = this.b.v3;
                                xnVar4.K9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                xnVar4.u0.invalidate();
                                break;
                            default:
                                xn xnVar5 = this.b.v3;
                                xnVar5.K9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                xnVar5.u0.invalidate();
                                break;
                        }
                    }
                });
                ofFloat3.setDuration(250L);
                ofFloat3.setInterpolator(xh.n.V);
                ofFloat3.start();
            } else if (upVar.H != 1.0f) {
                float f10 = xnVar.K9;
                ValueAnimator ofFloat4 = ValueAnimator.ofFloat(f10, AndroidUtilities.dp(8.0f) + f10);
                xnVar.N9 = ofFloat4;
                ofFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.pj
                    public final /* synthetic */ qj b;

                    {
                        this.b = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i11) {
                            case 0:
                                xn xnVar2 = this.b.v3;
                                xnVar2.K9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                xnVar2.u0.invalidate();
                                break;
                            case 1:
                                xn xnVar3 = this.b.v3;
                                xnVar3.K9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                xnVar3.u0.invalidate();
                                break;
                            case 2:
                                xn xnVar4 = this.b.v3;
                                xnVar4.K9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                xnVar4.u0.invalidate();
                                break;
                            default:
                                xn xnVar5 = this.b.v3;
                                xnVar5.K9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                xnVar5.u0.invalidate();
                                break;
                        }
                    }
                });
                ofFloat4.setDuration(200L);
                org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.f;
                ofFloat4.setInterpolator(prVar);
                ofFloat4.start();
                final up upVar4 = xnVar.M9;
                zi ziVar = new zi(this, i12);
                AnimatorSet animatorSet2 = upVar4.G;
                if (animatorSet2 != null) {
                    animatorSet2.removeAllListeners();
                    upVar4.G.cancel();
                }
                upVar4.V = ziVar;
                upVar4.G = new AnimatorSet();
                ValueAnimator ofFloat5 = ValueAnimator.ofFloat(upVar4.H, 1.0f);
                ofFloat5.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.tp
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i11) {
                            case 0:
                                up upVar5 = upVar4;
                                upVar5.getClass();
                                upVar5.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                upVar5.Q.invalidate();
                                View view = upVar5.X;
                                if (view != null) {
                                    view.invalidate();
                                    break;
                                }
                                break;
                            default:
                                up upVar6 = upVar4;
                                upVar6.getClass();
                                upVar6.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                View view2 = upVar6.X;
                                if (view2 != null) {
                                    view2.invalidate();
                                    break;
                                }
                                break;
                        }
                    }
                });
                ValueAnimator ofFloat6 = ValueAnimator.ofFloat(upVar4.I, 0.0f);
                ofFloat6.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.tp
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i12) {
                            case 0:
                                up upVar5 = upVar4;
                                upVar5.getClass();
                                upVar5.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                upVar5.Q.invalidate();
                                View view = upVar5.X;
                                if (view != null) {
                                    view.invalidate();
                                    break;
                                }
                                break;
                            default:
                                up upVar6 = upVar4;
                                upVar6.getClass();
                                upVar6.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                View view2 = upVar6.X;
                                if (view2 != null) {
                                    view2.invalidate();
                                    break;
                                }
                                break;
                        }
                    }
                });
                upVar4.G.addListener(new s5(upVar4, 22));
                upVar4.G.playTogether(ofFloat5, ofFloat6);
                upVar4.G.setDuration(120L);
                upVar4.G.setInterpolator(prVar);
                upVar4.G.start();
            } else {
                xn.X1(xnVar);
            }
        }
        if (!this.U1) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            kVar = ((org.telegram.ui.ActionBar.p2) xnVar).actionBar;
            if (kVar.s() || xnVar.A9()) {
                return onTouchEvent;
            }
            y1(motionEvent);
            if (xnVar.c9 || onTouchEvent) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z4) {
        if (this.v3.N8 != null) {
            return false;
        }
        return super.requestChildRectangleOnScreen(view, rect, z4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z4) {
        super.requestDisallowInterceptTouchEvent(z4);
        if (this.v3.a9 != null) {
            y1(null);
        }
    }

    @Override // org.telegram.ui.Components.tl0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.t3) {
            return;
        }
        vg.a aVar = this.v3.Nb;
        if (aVar.b != 0) {
            int childCount = aVar.a.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                aVar.a.getChildAt(i10).forceLayout();
            }
        }
        super.requestLayout();
    }

    @Override // org.telegram.ui.Components.tl0, androidx.recyclerview.widget.RecyclerView
    public final void setItemAnimator(f2.u0 u0Var) {
        if (this.U1) {
            return;
        }
        super.setItemAnimator(u0Var);
    }

    @Override // org.telegram.ui.Components.tl0, android.view.View
    public final void setTranslationY(float f10) {
        if (f10 != getTranslationY()) {
            super.setTranslationY(f10);
            xn xnVar = this.v3;
            xnVar.o9();
            xnVar.r9();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x03bf, code lost:
    
        if (r2.messages.size() != 1) goto L155;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w1(Canvas canvas, RectF rectF) {
        int i10;
        int i11;
        float f10;
        float f11;
        xn xnVar;
        float f12;
        int i12;
        float f13;
        boolean z4;
        MessageObject.GroupedMessages currentMessagesGroup;
        int i13;
        org.telegram.ui.ActionBar.k kVar;
        int measuredHeight;
        int i14;
        int i15;
        org.telegram.ui.ActionBar.k kVar2;
        int measuredHeight2;
        qj qjVar = this;
        Canvas canvas2 = canvas;
        int childCount = qjVar.getChildCount();
        MessageObject.GroupedMessages groupedMessages = null;
        int i16 = 0;
        while (true) {
            i10 = 8;
            i11 = 2;
            f10 = 0.0f;
            f11 = 2.0f;
            xnVar = qjVar.v3;
            if (i16 >= childCount) {
                f12 = 1.0f;
                break;
            }
            View childAt = qjVar.getChildAt(i16);
            f12 = 1.0f;
            if (childAt.getVisibility() != 4 && childAt.getVisibility() != 8) {
                if (!xn.d2(xnVar, childAt, rectF)) {
                    if (childAt instanceof org.telegram.ui.Cells.u1) {
                        canvas2.save();
                        canvas2.translate(childAt.getX(), childAt.getY());
                        ((org.telegram.ui.Cells.u1) childAt).a(canvas2);
                        canvas2.restore();
                    } else if (xnVar.x0.n && (childAt instanceof org.telegram.ui.Cells.h0)) {
                        float measuredHeight3 = ((((qjVar.getMeasuredHeight() - xnVar.p9) - xnVar.xa) / 2.0f) - (childAt.getMeasuredHeight() / 2)) + xnVar.p9;
                        if (!((org.telegram.ui.Cells.h0) childAt).F && !xnVar.u0.U1) {
                            if (childAt.getTop() > measuredHeight3) {
                                childAt.setTranslationY(measuredHeight3 - childAt.getTop());
                            } else {
                                childAt.setTranslationY(0.0f);
                            }
                        }
                    } else if (childAt instanceof org.telegram.ui.Cells.xa) {
                        float measuredHeight4 = ((((qjVar.getMeasuredHeight() - xnVar.p9) - xnVar.xa) / 2.0f) - (childAt.getMeasuredHeight() / 2)) + xnVar.p9;
                        if (!((org.telegram.ui.Cells.xa) childAt).K && !xnVar.u0.U1) {
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
                                org.telegram.ui.Components.ta0 backgroundDrawable = t1Var.getBackgroundDrawable();
                                if ((backgroundDrawable.f || t1Var.g3()) && (currentPosition == null || (2 & currentPosition.flags) != 0)) {
                                    boolean z10 = t1Var.c8;
                                    org.telegram.ui.ActionBar.g6 g6Var = qjVar.m2;
                                    if (z10 || t1Var.d8) {
                                        i13 = i16;
                                        if (currentPosition == null) {
                                            Paint X0 = qjVar.X0("paintChatMessageBackgroundSelected");
                                            vn vnVar = xnVar.ba;
                                            if ((vnVar == null || !vnVar.D) && X0 != null) {
                                                if (xnVar.x9()) {
                                                    measuredHeight = xnVar.u0.getTop();
                                                } else {
                                                    kVar = ((org.telegram.ui.ActionBar.p2) xnVar).actionBar;
                                                    measuredHeight = kVar.getMeasuredHeight();
                                                }
                                                float backgroundTranslationY = measuredHeight - xnVar.U0.getBackgroundTranslationY();
                                                int backgroundSizeY = xnVar.U0.getBackgroundSizeY();
                                                vn vnVar2 = xnVar.ba;
                                                if (vnVar2 != null) {
                                                    vnVar2.l(t1Var.getX(), backgroundTranslationY, qjVar.getMeasuredWidth(), backgroundSizeY);
                                                } else {
                                                    org.telegram.ui.ActionBar.k6.q(t1Var.getX(), backgroundTranslationY, qjVar.getMeasuredWidth(), backgroundSizeY);
                                                }
                                            } else {
                                                X0 = org.telegram.ui.ActionBar.k6.a2;
                                                X0.setColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Hc, g6Var));
                                            }
                                            Paint paint = X0;
                                            canvas2.save();
                                            canvas2.translate(0.0f, t1Var.getTranslationY());
                                            int alpha = paint.getAlpha();
                                            paint.setAlpha((int) (t1Var.getAlpha() * t1Var.getHighlightAlpha() * alpha));
                                            canvas2.drawRect(0.0f, t1Var.getTop(), qjVar.getMeasuredWidth(), t1Var.getBottom(), paint);
                                            paint.setAlpha(alpha);
                                            canvas2.restore();
                                        }
                                    } else {
                                        int y10 = (int) t1Var.getY();
                                        canvas2.save();
                                        if (currentPosition == null) {
                                            i14 = t1Var.getMeasuredHeight();
                                            i13 = i16;
                                        } else {
                                            int measuredHeight5 = t1Var.getMeasuredHeight() + y10;
                                            long j10 = 0;
                                            int i17 = 0;
                                            float f14 = 0.0f;
                                            while (i17 < childCount) {
                                                View childAt2 = qjVar.getChildAt(i17);
                                                int i18 = i16;
                                                if (childAt2 instanceof org.telegram.ui.Cells.t1) {
                                                    org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) childAt2;
                                                    if (t1Var2.getCurrentMessagesGroup() == currentMessagesGroup2) {
                                                        org.telegram.ui.Components.ta0 backgroundDrawable2 = t1Var2.getBackgroundDrawable();
                                                        i15 = i17;
                                                        y10 = Math.min(y10, (int) t1Var2.getY());
                                                        measuredHeight5 = Math.max(measuredHeight5, t1Var2.getMeasuredHeight() + ((int) t1Var2.getY()));
                                                        long j11 = backgroundDrawable2.l;
                                                        if (j11 > j10) {
                                                            j10 = j11;
                                                            f10 = t1Var2.getX() + backgroundDrawable2.h;
                                                            f14 = t1Var2.getY() + backgroundDrawable2.i;
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
                                            backgroundDrawable.j = f10;
                                            backgroundDrawable.k = f14 - y10;
                                            i14 = measuredHeight5 - y10;
                                        }
                                        int i19 = i14 + y10;
                                        canvas2.clipRect(0, y10, qjVar.getMeasuredWidth(), i19);
                                        Paint X02 = qjVar.X0("paintChatMessageBackgroundSelected");
                                        vn vnVar3 = xnVar.ba;
                                        if (vnVar3 == null || vnVar3.D || X02 == null) {
                                            backgroundDrawable.b = null;
                                            backgroundDrawable.a.setColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Hc, g6Var));
                                        } else {
                                            backgroundDrawable.b = X02;
                                            if (xnVar.x9()) {
                                                measuredHeight2 = xnVar.u0.getTop();
                                            } else {
                                                kVar2 = ((org.telegram.ui.ActionBar.p2) xnVar).actionBar;
                                                measuredHeight2 = kVar2.getMeasuredHeight();
                                            }
                                            float backgroundTranslationY2 = measuredHeight2 - xnVar.U0.getBackgroundTranslationY();
                                            int backgroundSizeY2 = xnVar.U0.getBackgroundSizeY();
                                            vn vnVar4 = xnVar.ba;
                                            if (vnVar4 != null) {
                                                vnVar4.l(t1Var.getX(), backgroundTranslationY2, qjVar.getMeasuredWidth(), backgroundSizeY2);
                                            } else {
                                                org.telegram.ui.ActionBar.k6.q(t1Var.getX(), backgroundTranslationY2, qjVar.getMeasuredWidth(), backgroundSizeY2);
                                            }
                                        }
                                        backgroundDrawable.setBounds(0, y10, qjVar.getMeasuredWidth(), i19);
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
                            if (xnVar.G8 != t1Var && currentMessagesGroup2 == null && t1Var.C1()) {
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
                            if (childAt instanceof org.telegram.ui.Cells.v0) {
                                org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) childAt;
                                if (v0Var.I()) {
                                    canvas2.save();
                                    canvas2.translate(v0Var.getX(), v0Var.getY() + v0Var.getPaddingTop());
                                    canvas2.scale(v0Var.getScaleX(), v0Var.getScaleY(), v0Var.getMeasuredWidth() / 2.0f, v0Var.getMeasuredHeight() / 2.0f);
                                    canvas2.translate(xnVar.R8() / 2.0f, 0.0f);
                                    v0Var.y(canvas2, true);
                                    v0Var.B(canvas2, true);
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
        View view = xnVar.G8;
        MessageObject.GroupedMessages currentMessagesGroup3 = view instanceof org.telegram.ui.Cells.t1 ? ((org.telegram.ui.Cells.t1) view).getCurrentMessagesGroup() : null;
        int i20 = 0;
        while (i20 < 3) {
            ArrayList arrayList = qjVar.a3;
            arrayList.clear();
            if (i20 != i11 || xnVar.u0.U1) {
                int i21 = 0;
                while (i21 < childCount) {
                    View childAt3 = xnVar.u0.getChildAt(i21);
                    if (childAt3 instanceof org.telegram.ui.Cells.t1) {
                        org.telegram.ui.Cells.t1 t1Var3 = (org.telegram.ui.Cells.t1) childAt3;
                        if (childAt3.getY() <= xnVar.u0.getHeight() && childAt3.getY() + childAt3.getHeight() >= f10 && t1Var3.getVisibility() != i10 && (currentMessagesGroup = t1Var3.getCurrentMessagesGroup()) != null) {
                            int i22 = i20 == 0 ? 1 : 1;
                            if ((i20 != i22 || currentMessagesGroup.transitionParams.drawBackgroundForDeletedItems) && ((i20 != 0 || !t1Var3.getMessageObject().deleted) && ((i20 != 1 || t1Var3.getMessageObject().deleted) && ((i20 != i11 || t1Var3.lc) && (i20 == i11 || !t1Var3.lc))))) {
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
                                if (t1Var3.lc) {
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
                                f10 = 0.0f;
                            }
                        }
                    }
                    i21++;
                    i10 = 8;
                    i11 = 2;
                    f10 = 0.0f;
                }
                int i29 = 0;
                while (i29 < arrayList.size()) {
                    MessageObject.GroupedMessages groupedMessages2 = (MessageObject.GroupedMessages) arrayList.get(i29);
                    float E2 = groupedMessages2.transitionParams.cell.E2(true);
                    MessageObject.GroupedMessages.TransitionParams transitionParams3 = groupedMessages2.transitionParams;
                    float f15 = transitionParams3.left + E2 + transitionParams3.offsetLeft;
                    float f16 = transitionParams3.top + transitionParams3.offsetTop;
                    float f17 = transitionParams3.offsetRight + transitionParams3.right + E2;
                    float f18 = transitionParams3.bottom + transitionParams3.offsetBottom;
                    if (!transitionParams3.backgroundChangeBounds) {
                        f16 += transitionParams3.cell.getTranslationY();
                        f18 += groupedMessages2.transitionParams.cell.getTranslationY();
                    }
                    float f19 = f16;
                    if (f18 > AndroidUtilities.dp(20.0f) + xnVar.u0.getMeasuredHeight()) {
                        f18 = AndroidUtilities.dp(20.0f) + xnVar.u0.getMeasuredHeight();
                    }
                    float f20 = f18;
                    boolean z11 = (groupedMessages2.transitionParams.cell.getScaleX() == f12 && groupedMessages2.transitionParams.cell.getScaleY() == f12) ? false : true;
                    if (z11) {
                        canvas2.save();
                        i12 = i20;
                        canvas2.scale(groupedMessages2.transitionParams.cell.getScaleX(), groupedMessages2.transitionParams.cell.getScaleY(), e2.c.x(f17, f15, f11, f15), e2.c.x(f20, f19, f11, f19));
                    } else {
                        i12 = i20;
                    }
                    int size = groupedMessages2.messages.size();
                    int i30 = 0;
                    while (true) {
                        if (i30 >= size) {
                            f13 = f20;
                            z4 = true;
                            break;
                        }
                        MessageObject messageObject = groupedMessages2.messages.get(i30);
                        f13 = f20;
                        if (xnVar.T5[messageObject.getDialogId() == xnVar.Q5 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) < 0) {
                            z4 = false;
                            break;
                        } else {
                            i30++;
                            f20 = f13;
                        }
                    }
                    MessageObject.GroupedMessages.TransitionParams transitionParams4 = groupedMessages2.transitionParams;
                    float f21 = f13;
                    xn xnVar2 = xnVar;
                    transitionParams4.cell.B1(canvas, (int) f15, (int) f19, (int) f17, (int) f21, transitionParams4.pinnedTop, transitionParams4.pinnedBotton, z4, 0);
                    if (groupedMessages2 != currentMessagesGroup3) {
                        groupedMessages2.transitionParams.cell = null;
                    }
                    groupedMessages2.transitionParams.drawCaptionLayout = groupedMessages2.hasCaption;
                    if (z11) {
                        canvas.restore();
                        for (int i31 = 0; i31 < childCount; i31++) {
                            View childAt4 = xnVar2.u0.getChildAt(i31);
                            if (childAt4 instanceof org.telegram.ui.Cells.t1) {
                                org.telegram.ui.Cells.t1 t1Var4 = (org.telegram.ui.Cells.t1) childAt4;
                                if (t1Var4.getCurrentMessagesGroup() == groupedMessages2) {
                                    int left = t1Var4.getLeft();
                                    int top = t1Var4.getTop();
                                    childAt4.setPivotX(((f17 - f15) / 2.0f) + (f15 - left));
                                    childAt4.setPivotY(((f21 - f19) / 2.0f) + (f19 - top));
                                }
                            }
                        }
                    }
                    i29++;
                    canvas2 = canvas;
                    xnVar = xnVar2;
                    i20 = i12;
                    f11 = 2.0f;
                }
            }
            canvas2 = canvas;
            xnVar = xnVar;
            i10 = 8;
            i11 = 2;
            f10 = 0.0f;
            f11 = 2.0f;
            i20++;
            qjVar = this;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void x1(Canvas canvas, RectF rectF) {
        float f10;
        ArrayList arrayList;
        ArrayList arrayList2 = this.W2;
        int size = arrayList2.size();
        xn xnVar = this.v3;
        boolean z4 = 1;
        boolean z10 = false;
        if (size > 0) {
            for (int i10 = 0; i10 < size; i10++) {
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) arrayList2.get(i10);
                if (!xn.d2(xnVar, t1Var, rectF)) {
                    canvas.save();
                    canvas.translate(t1Var.E2(false) + t1Var.getLeft(), t1Var.getY() + t1Var.getPaddingTop());
                    t1Var.m2(t1Var.a() ? t1Var.getAlpha() : 1.0f, canvas, true);
                    canvas.restore();
                }
            }
            arrayList2.clear();
        }
        ArrayList arrayList3 = this.X2;
        int size2 = arrayList3.size();
        if (size2 > 0) {
            for (int i11 = 0; i11 < size2; i11++) {
                org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) arrayList3.get(i11);
                if (!xn.d2(xnVar, t1Var2, rectF)) {
                    float E2 = t1Var2.E2(false) + t1Var2.getLeft();
                    float y10 = t1Var2.getY() + t1Var2.getPaddingTop();
                    float alpha = t1Var2.a() ? t1Var2.getAlpha() : 1.0f;
                    canvas.save();
                    canvas.translate(E2, y10);
                    t1Var2.setInvalidatesParent(true);
                    t1Var2.W1(canvas, alpha);
                    t1Var2.setInvalidatesParent(false);
                    canvas.restore();
                }
            }
            arrayList3.clear();
        }
        ArrayList arrayList4 = this.Y2;
        int size3 = arrayList4.size();
        if (size3 > 0) {
            int i12 = 0;
            while (i12 < size3) {
                org.telegram.ui.Cells.t1 t1Var3 = (org.telegram.ui.Cells.t1) arrayList4.get(i12);
                if (xn.d2(xnVar, t1Var3, rectF)) {
                    arrayList = arrayList4;
                } else {
                    boolean z11 = t1Var3.getCurrentPosition() != null && (t1Var3.getCurrentPosition().flags & z4) == 0;
                    float alpha2 = t1Var3.a() ? t1Var3.getAlpha() : 1.0f;
                    float E22 = t1Var3.E2(z10) + t1Var3.getLeft();
                    float y11 = t1Var3.getY() + t1Var3.getPaddingTop();
                    canvas.save();
                    MessageObject.GroupedMessages currentMessagesGroup = t1Var3.getCurrentMessagesGroup();
                    if (currentMessagesGroup == null) {
                        arrayList = arrayList4;
                    } else if (currentMessagesGroup.transitionParams.backgroundChangeBounds) {
                        float E23 = t1Var3.E2(z4);
                        MessageObject.GroupedMessages.TransitionParams transitionParams = currentMessagesGroup.transitionParams;
                        float f11 = transitionParams.left + E23 + transitionParams.offsetLeft;
                        arrayList = arrayList4;
                        float f12 = transitionParams.top + transitionParams.offsetTop;
                        float f13 = transitionParams.right + E23 + transitionParams.offsetRight;
                        float f14 = transitionParams.bottom + transitionParams.offsetBottom;
                        if (!transitionParams.backgroundChangeBounds) {
                            f12 += t1Var3.getTranslationY();
                            f14 += t1Var3.getTranslationY();
                        }
                        canvas.clipRect(f11 + AndroidUtilities.dp(8.0f), f12 + AndroidUtilities.dp(8.0f), f13 - AndroidUtilities.dp(8.0f), f14 - AndroidUtilities.dp(8.0f));
                    } else {
                        arrayList = arrayList4;
                    }
                    if (t1Var3.getTransitionParams().v0) {
                        canvas.translate(E22, y11);
                        t1Var3.setInvalidatesParent(true);
                        t1Var3.I1(alpha2, canvas, z11);
                        t1Var3.setInvalidatesParent(false);
                    }
                    canvas.restore();
                }
                i12++;
                arrayList4 = arrayList;
                z4 = 1;
                z10 = false;
            }
            f10 = 8.0f;
            arrayList4.clear();
        } else {
            f10 = 8.0f;
        }
        ArrayList arrayList5 = this.Z2;
        int size4 = arrayList5.size();
        if (size4 > 0) {
            for (int i13 = 0; i13 < size4; i13++) {
                org.telegram.ui.Cells.t1 t1Var4 = (org.telegram.ui.Cells.t1) arrayList5.get(i13);
                if (!xn.d2(xnVar, t1Var4, rectF)) {
                    boolean z12 = t1Var4.getCurrentPosition() != null && (t1Var4.getCurrentPosition().flags & 1) == 0;
                    float alpha3 = t1Var4.a() ? t1Var4.getAlpha() : 1.0f;
                    float E24 = t1Var4.E2(false) + t1Var4.getLeft();
                    float y12 = t1Var4.getY() + t1Var4.getPaddingTop();
                    canvas.save();
                    MessageObject.GroupedMessages currentMessagesGroup2 = t1Var4.getCurrentMessagesGroup();
                    if (currentMessagesGroup2 != null && currentMessagesGroup2.transitionParams.backgroundChangeBounds) {
                        float E25 = t1Var4.E2(true);
                        MessageObject.GroupedMessages.TransitionParams transitionParams2 = currentMessagesGroup2.transitionParams;
                        float f15 = transitionParams2.left + E25 + transitionParams2.offsetLeft;
                        float f16 = transitionParams2.top + transitionParams2.offsetTop;
                        float f17 = transitionParams2.right + E25 + transitionParams2.offsetRight;
                        float f18 = transitionParams2.bottom + transitionParams2.offsetBottom;
                        if (!transitionParams2.backgroundChangeBounds) {
                            f16 += t1Var4.getTranslationY();
                            f18 += t1Var4.getTranslationY();
                        }
                        canvas.clipRect(f15 + AndroidUtilities.dp(f10), f16 + AndroidUtilities.dp(f10), f17 - AndroidUtilities.dp(f10), f18 - AndroidUtilities.dp(f10));
                    }
                    if (!z12 && t1Var4.getTransitionParams().v0) {
                        canvas.translate(E24, y12);
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

    public final void y1(MotionEvent motionEvent) {
        TLRPC.Chat chat;
        MessageObject.GroupedMessages y82;
        MessageObject messageObject;
        boolean z4;
        ArrayList arrayList;
        TLRPC.Chat chat2;
        xn xnVar = this.v3;
        if (motionEvent != null) {
            xnVar.A4 = true;
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && !xnVar.c9 && !xnVar.b9 && xnVar.a9 == null) {
            z4 = ((org.telegram.ui.ActionBar.p2) xnVar).inPreviewMode;
            if (!z4) {
                View pressedChildView = getPressedChildView();
                if (pressedChildView instanceof org.telegram.ui.Cells.t1) {
                    if (xnVar.a9 != null) {
                        xn.V1(xnVar, 0.0f);
                    }
                    xnVar.a9 = (org.telegram.ui.Cells.t1) pressedChildView;
                    MessageObject T1 = xn.T1(xnVar);
                    boolean F6 = xnVar.F6(T1);
                    int i10 = xnVar.O3;
                    if ((i10 != 0 && i10 != 5 && i10 != 8 && (i10 != 3 || xnVar.a4 != xnVar.getUserConfig().getClientUserId())) || (((arrayList = xnVar.X3) != null && arrayList.contains(T1)) || ((xnVar.E8(T1) == 1 && (T1.getDialogId() == xnVar.I6 || T1.needDrawBluredPreview())) || ((xnVar.h == null && T1.getId() < 0) || (((chat2 = xnVar.e) != null && ChatObject.isForum(chat2) && !F6) || xnVar.b9() || (T1.isEphemeral() && T1.isOut())))))) {
                        xn.V1(xnVar, 0.0f);
                        xnVar.a9 = null;
                        return;
                    } else {
                        this.d3 = motionEvent.getPointerId(0);
                        xnVar.b9 = true;
                        this.b3 = (int) motionEvent.getX();
                        this.c3 = (int) motionEvent.getY();
                        return;
                    }
                }
                return;
            }
        }
        if (xnVar.a9 != null && motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.d3) {
            int max = Math.max(AndroidUtilities.dp(-80.0f), Math.min(0, (int) (motionEvent.getX() - this.b3)));
            int abs = Math.abs(((int) motionEvent.getY()) - this.c3);
            if (getScrollState() == 0 && xnVar.b9 && !xnVar.c9 && max <= (-AndroidUtilities.getPixelsInCM(0.4f, true)) && Math.abs(max) / 3 > abs) {
                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                xnVar.a9.onTouchEvent(obtain);
                super.onInterceptTouchEvent(obtain);
                obtain.recycle();
                xnVar.w0.R = false;
                xnVar.b9 = false;
                xnVar.c9 = true;
                this.b3 = (int) motionEvent.getX();
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    return;
                }
                return;
            }
            if (xnVar.c9) {
                if (Math.abs(max) < AndroidUtilities.dp(50.0f)) {
                    this.h3 = false;
                } else if (!this.h3) {
                    try {
                        performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    this.h3 = true;
                }
                float f10 = max;
                xn.V1(xnVar, f10);
                MessageObject T12 = xn.T1(xnVar);
                if (T12 != null && (T12.isRoundVideo() || T12.isVideo())) {
                    xnVar.Mc(false, false);
                }
                org.telegram.ui.Cells.t1 t1Var = xnVar.a9;
                if (e2.c.s(t1Var)) {
                    z1(t1Var, f10);
                }
                invalidate();
                return;
            }
            return;
        }
        if (xnVar.a9 != null) {
            if (motionEvent != null) {
                if (motionEvent.getPointerId(0) != this.d3) {
                    return;
                }
                if (motionEvent.getAction() != 3 && motionEvent.getAction() != 1 && motionEvent.getAction() != 6) {
                    return;
                }
            }
            if (motionEvent != null && motionEvent.getAction() != 3) {
                org.telegram.ui.Cells.t1 t1Var2 = xnVar.a9;
                if (Math.abs(e2.c.s(t1Var2) ? t1Var2.E2(false) : 0.0f) >= AndroidUtilities.dp(50.0f)) {
                    MessageObject T13 = xn.T1(xnVar);
                    boolean F62 = xnVar.F6(T13);
                    ok okVar = xnVar.L0;
                    if ((okVar == null || okVar.getVisibility() != 0 || ((xnVar.F0 && F62) || T13.wasJustSent)) && ((chat = xnVar.e) == null || ((!ChatObject.isNotInChat(chat) || xnVar.F9()) && ((!ChatObject.isChannel(xnVar.e) || ChatObject.canPost(xnVar.e) || xnVar.e.megagroup) && ChatObject.canSendMessages(xnVar.e))))) {
                        xnVar.Bb(xn.T1(xnVar));
                    } else {
                        if (T13.getGroupId() != 0 && (y82 = xnVar.y8(T13.getGroupId())) != null && (messageObject = y82.captionMessage) != null) {
                            T13 = messageObject;
                        }
                        xnVar.k5 = T13;
                        Bundle e6 = org.telegram.messenger.y3.e(3, "onlySelect", "dialogsType", true);
                        e6.putBoolean("quote", true);
                        e6.putBoolean("reply_to", true);
                        long peerDialogId = DialogObject.getPeerDialogId(T13.getFromPeer());
                        if (peerDialogId != 0 && peerDialogId != xnVar.a() && peerDialogId != xnVar.getUserConfig().getClientUserId() && peerDialogId > 0) {
                            e6.putLong("reply_to_author", peerDialogId);
                        }
                        e6.putInt("messagesCount", 1);
                        e6.putBoolean("canSelectTopics", true);
                        py pyVar = new py(e6);
                        pyVar.z2 = xnVar;
                        xnVar.presentFragment(pyVar);
                    }
                }
            }
            org.telegram.ui.Cells.t1 t1Var3 = xnVar.a9;
            float slidingOffsetX = e2.c.s(t1Var3) ? t1Var3.getSlidingOffsetX() : 0.0f;
            this.g3 = slidingOffsetX;
            if (slidingOffsetX == 0.0f) {
                xnVar.a9 = null;
            }
            this.e3 = System.currentTimeMillis();
            this.f3 = 0.0f;
            invalidate();
            xnVar.b9 = false;
            xnVar.c9 = false;
            xnVar.w0.R = true;
        }
    }

    public final void z1(org.telegram.ui.Cells.t1 t1Var, float f10) {
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
                    t1Var2.setSlidingOffset(f10);
                    t1Var2.invalidate();
                }
            }
        }
        invalidate();
    }
}
