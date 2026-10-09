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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class wj extends ai.g7 {
    public int X2;
    public final ArrayList Y2;
    public final ArrayList Z2;
    public final ArrayList a3;
    public final ArrayList b3;
    public final ArrayList c3;
    public int d3;
    public int e3;
    public int f3;
    public long g3;
    public float h3;
    public float i3;
    public boolean j3;
    public final float k3;
    public final Paint l3;
    public final Paint m3;
    public final o1.j n3;
    public final o1.k o3;
    public final o1.j p3;
    public final o1.k q3;
    public final o1.j r3;
    public final o1.k s3;
    public boolean t3;
    public final Path u3;
    public boolean v3;
    public int w3;
    public final /* synthetic */ zn x3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wj(zn znVar, Context context, xn xnVar) {
        super(znVar, context, xnVar, 1);
        this.x3 = znVar;
        this.Y2 = new ArrayList();
        this.Z2 = new ArrayList();
        this.a3 = new ArrayList();
        this.b3 = new ArrayList();
        this.c3 = new ArrayList(10);
        this.k3 = 2000.0f;
        Paint paint = new Paint(1);
        this.l3 = paint;
        Paint paint2 = new Paint(1);
        this.m3 = paint2;
        o1.j jVar = new o1.j(0.0f);
        this.n3 = jVar;
        o1.k kVar = new o1.k(jVar);
        kVar.h = 0.0f;
        kVar.g = 2000.0f;
        kVar.u = org.telegram.ui.Cells.c1.j(0.0f, 1500.0f, 1.0f);
        final int i10 = 0;
        kVar.b(new o1.g(this) { // from class: org.telegram.ui.vj
            public final /* synthetic */ wj b;

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
        this.o3 = kVar;
        o1.j jVar2 = new o1.j(0.0f);
        this.p3 = jVar2;
        o1.k kVar2 = new o1.k(jVar2);
        kVar2.h = 0.0f;
        kVar2.u = org.telegram.ui.Cells.c1.j(0.0f, 400.0f, 0.5f);
        final int i11 = 1;
        kVar2.b(new o1.g(this) { // from class: org.telegram.ui.vj
            public final /* synthetic */ wj b;

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
        this.q3 = kVar2;
        o1.j jVar3 = new o1.j(0.0f);
        this.r3 = jVar3;
        o1.k kVar3 = new o1.k(jVar3);
        kVar3.h = 0.0f;
        kVar3.u = org.telegram.ui.Cells.c1.j(0.0f, 200.0f, 1.0f);
        final int i12 = 2;
        kVar3.b(new o1.g(this) { // from class: org.telegram.ui.vj
            public final /* synthetic */ wj b;

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
        this.s3 = kVar3;
        this.u3 = new Path();
        this.w3 = 0;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }

    public final void A1(org.telegram.ui.Cells.u1 u1Var, float f7) {
        MessageObject.GroupedMessages currentMessagesGroup = u1Var.getCurrentMessagesGroup();
        if (currentMessagesGroup == null) {
            return;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt != u1Var && (childAt instanceof org.telegram.ui.Cells.u1)) {
                org.telegram.ui.Cells.u1 u1Var2 = (org.telegram.ui.Cells.u1) childAt;
                if (u1Var2.getCurrentMessagesGroup() == currentMessagesGroup) {
                    u1Var2.setSlidingOffset(f7);
                    u1Var2.invalidate();
                }
            }
        }
        invalidate();
    }

    @Override // org.telegram.ui.Components.qm0
    public final boolean F0(View view) {
        return (view.getVisibility() == 4 || view.getVisibility() == 8) ? false : true;
    }

    @Override // android.view.View
    public final AccessibilityNodeInfo createAccessibilityNodeInfo() {
        if (this.x3.h != null) {
            return null;
        }
        return super.createAccessibilityNodeInfo();
    }

    @Override // org.telegram.ui.Components.qm0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        zn znVar = this.x3;
        znVar.u8 = null;
        canvas.save();
        if (znVar.V9 != null && znVar.R9) {
            boolean z10 = znVar.S9;
        }
        this.E1.setEmpty();
        if (znVar.N9 != 0.0f) {
            int save = canvas.save();
            float measuredHeight = (-znVar.N9) - (znVar.U9 != 0.0f ? (znVar.x0.getMeasuredHeight() - znVar.N9) * znVar.U9 : 0.0f);
            znVar.za = measuredHeight;
            canvas.translate(0.0f, measuredHeight);
            x1(canvas, null);
            super.dispatchDraw(canvas);
            y1(canvas, null);
            canvas.restoreToCount(save);
        } else {
            x1(canvas, null);
            super.dispatchDraw(canvas);
            y1(canvas, null);
        }
        canvas.restore();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002b, code lost:
    
        if ((java.lang.System.currentTimeMillis() - r2.N6) <= 200) goto L8;
     */
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(Canvas canvas) {
        ArrayList arrayList;
        boolean z10;
        float f7;
        int i10;
        int dp;
        int i11;
        org.telegram.ui.ActionBar.f5 f5Var;
        float f10;
        org.telegram.ui.ActionBar.f5 f5Var2;
        boolean z11;
        on onVar;
        int i12;
        int i13;
        float f11;
        int dp2;
        int i14;
        float f12;
        float f13;
        boolean z12;
        zn znVar = this.x3;
        ArrayList arrayList2 = znVar.u6;
        ColorMatrix colorMatrix = znVar.R6;
        m.c3 c3Var = znVar.S6;
        org.telegram.ui.ActionBar.f5 f5Var3 = znVar.T6;
        Paint paint = znVar.b7;
        Paint paint2 = znVar.P6;
        ArrayList arrayList3 = znVar.O6;
        Paint paint3 = znVar.Q6;
        long j3 = znVar.N6 != 0 ? 0L : 0L;
        if (!AndroidUtilities.isTablet() && !znVar.g4 && znVar.f == null) {
            TLRPC.Chat chat = znVar.e;
            boolean z13 = (chat == null || ChatObject.isChannelAndNotMegaGroup(chat)) && znVar.R3 != 7;
            if (znVar.N9 != 0.0f) {
                canvas.save();
                canvas.translate(0.0f, -znVar.N9);
            }
            int i15 = org.telegram.ui.ActionBar.i6.d6;
            org.telegram.ui.ActionBar.e6 e6Var = this.n2;
            boolean z14 = i0.a.f(org.telegram.ui.ActionBar.i6.w0(i15, e6Var)) <= 0.699999988079071d;
            int i16 = org.telegram.ui.ActionBar.i6.i6;
            boolean z15 = z13;
            int d = i0.a.d(z14 ? 0.9f : 0.5f, org.telegram.ui.ActionBar.i6.w0(i16, e6Var), Color.argb(z14 ? 33 : 3, 255, 255, 255));
            int k10 = i0.a.k(org.telegram.ui.ActionBar.i6.w0(i16, e6Var), z14 ? 24 : zn.Hc);
            if (znVar.a7 != k10 || znVar.Z6 != d) {
                znVar.Z6 = d;
                znVar.a7 = k10;
                int dp3 = AndroidUtilities.dp(200.0f);
                znVar.V6 = dp3;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, dp3, 0.0f, new int[]{k10, d, d, k10}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, tileMode);
                znVar.Y6 = linearGradient;
                znVar.W6 = (-znVar.V6) * 2;
                paint2.setShader(linearGradient);
                int argb = Color.argb(z14 ? 43 : 96, 255, 255, 255);
                LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, znVar.V6, 0.0f, new int[]{0, argb, argb, 0}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, tileMode);
                znVar.d7 = linearGradient2;
                paint.setShader(linearGradient2);
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            org.telegram.ui.ActionBar.f5 f5Var4 = f5Var3;
            long j10 = znVar.U6;
            int i17 = 2;
            Matrix matrix = znVar.c7;
            m.c3 c3Var2 = c3Var;
            Matrix matrix2 = znVar.X6;
            long abs = Math.abs(j10 - elapsedRealtime);
            if (abs > 17) {
                abs = 16;
            }
            long j11 = abs < 4 ? j3 : abs;
            int width = getWidth();
            znVar.U6 = elapsedRealtime;
            int i18 = (int) (znVar.W6 + ((width * j11) / 400.0f));
            znVar.W6 = i18;
            if (i18 >= width * 2) {
                znVar.W6 = (-znVar.V6) * 2;
            }
            matrix2.setTranslate(znVar.W6, 0.0f);
            LinearGradient linearGradient3 = znVar.Y6;
            if (linearGradient3 != null) {
                linearGradient3.setLocalMatrix(matrix2);
            }
            matrix.setTranslate(znVar.W6, 0.0f);
            LinearGradient linearGradient4 = znVar.d7;
            if (linearGradient4 != null) {
                linearGradient4.setLocalMatrix(matrix);
            }
            int height = ((getHeight() - znVar.Ba) - ((int) (znVar.b9(org.telegram.ui.Components.y31.c) + znVar.v.d()))) - AndroidUtilities.dp(57.0f);
            int i19 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            for (int i20 = 0; i20 < getChildCount(); i20++) {
                int top = getChildAt(i20).getTop();
                if (top < i19) {
                    i19 = top;
                }
            }
            if (znVar.N6 == j3 && i19 <= 0) {
                z12 = ((org.telegram.ui.ActionBar.n2) znVar).fragmentBeginToShow;
                znVar.O6(z12);
            }
            Paint X0 = X0("paintChatActionBackground");
            if (paint3.getColor() != X0.getColor()) {
                paint3.setColor(X0.getColor());
            }
            if (paint3.getShader() != X0.getShader()) {
                paint3.setShader(X0.getShader());
                colorMatrix.setSaturation(zn.Ic);
                paint3.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            }
            int i21 = 0;
            while (i21 < getChildCount()) {
                View childAt = getChildAt(i21);
                if (childAt instanceof org.telegram.ui.Cells.u1) {
                    org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) childAt;
                    MessageObject.GroupedMessages currentMessagesGroup = u1Var.getCurrentMessagesGroup();
                    float top2 = childAt.getTop() + u1Var.y2(true).getBounds().top;
                    if (currentMessagesGroup != null) {
                        f12 = 1.0f;
                        f13 = r13.top + currentMessagesGroup.transitionParams.offsetTop;
                    } else {
                        f12 = 1.0f;
                        f13 = 0.0f;
                    }
                    int i22 = (int) (top2 + f13);
                    i14 = i21;
                    if (znVar.N6 == j3 && znVar.I9()) {
                        i22 = AndroidUtilities.lerp(height, i22, childAt.getAlpha());
                    } else if (childAt.getAlpha() != f12) {
                        i22 = height;
                    }
                    if (i22 < height) {
                        height = i22;
                    }
                } else {
                    i14 = i21;
                    if (childAt instanceof org.telegram.ui.Cells.w0) {
                        int lerp = (znVar.N6 == j3 && znVar.I9()) ? AndroidUtilities.lerp(height, childAt.getTop(), childAt.getAlpha()) : childAt.getAlpha() == 1.0f ? childAt.getTop() : height;
                        if (lerp < height) {
                            height = lerp;
                        }
                    }
                }
                i21 = i14 + 1;
            }
            if (znVar.I9()) {
                boolean z16 = SharedConfig.getDevicePerformanceClass() != 0 && org.telegram.ui.ActionBar.i6.b1();
                int i23 = org.telegram.ui.ActionBar.i6.d6;
                boolean z17 = i0.a.f(org.telegram.ui.ActionBar.i6.w0(i23, e6Var)) <= 0.699999988079071d && org.telegram.ui.ActionBar.i6.b1();
                boolean z18 = i0.a.f(org.telegram.ui.ActionBar.i6.w0(i23, e6Var)) <= 0.009999999776482582d && org.telegram.ui.ActionBar.i6.b1();
                if (z16) {
                    org.telegram.ui.ActionBar.i6.q(0.0f, getY() - znVar.w9, getMeasuredWidth(), AndroidUtilities.displaySize.y);
                }
                int alpha = org.telegram.ui.ActionBar.i6.h2.getAlpha();
                if (z18) {
                    org.telegram.ui.ActionBar.i6.h2.setAlpha((int) (alpha * 4.0f));
                }
                if (znVar.N6 != j3) {
                    z10 = z17;
                    f7 = 1.0f - ((System.currentTimeMillis() - znVar.N6) / 200.0f);
                } else {
                    z10 = z17;
                    f7 = 1.0f;
                }
                int alpha2 = paint2.getAlpha();
                int alpha3 = paint3.getAlpha();
                int alpha4 = paint.getAlpha();
                xn xnVar = znVar.ea;
                float f14 = (xnVar == null || !xnVar.G || paint3.getShader() == null) ? 1.0f : 0.3f;
                paint3.setAlpha((int) (255.0f * f7 * f14));
                float f15 = alpha2;
                paint2.setAlpha((int) (f7 * f14 * f15));
                paint.setAlpha((int) (f7 * f15));
                int i24 = 0;
                while (height > znVar.Aa) {
                    int dp4 = height - AndroidUtilities.dp(3.0f);
                    if (i24 >= arrayList3.size()) {
                        onVar = new on();
                        f5Var2 = f5Var4;
                        TLRPC.Chat chat2 = znVar.e;
                        if (chat2 == null || !ChatObject.isChannelAndNotMegaGroup(chat2)) {
                            z11 = z16;
                            onVar.b = Utilities.fastRandom.nextInt(AndroidUtilities.dp(64.0f)) + AndroidUtilities.dp(64.0f);
                        } else {
                            z11 = z16;
                            onVar.b = Utilities.fastRandom.nextInt(AndroidUtilities.dp(64.0f)) + AndroidUtilities.dp(128.0f);
                        }
                        float width2 = znVar.x0.getWidth() * 0.8f;
                        if (z15) {
                            f11 = 42.0f;
                            dp2 = 0;
                        } else {
                            f11 = 42.0f;
                            dp2 = AndroidUtilities.dp(42.0f);
                        }
                        onVar.a = (int) Math.min(width2 - dp2, (((Utilities.fastRandom.nextFloat() * 0.35f) + 0.4f) * znVar.x0.getWidth()) + AndroidUtilities.dp(f11));
                        arrayList3.add(onVar);
                    } else {
                        f5Var2 = f5Var4;
                        z11 = z16;
                        onVar = (on) arrayList3.get(i24);
                    }
                    boolean z19 = z10;
                    if (znVar.N6 != j3) {
                        i12 = i17;
                        i13 = arrayList2.size() <= i12 ? Math.min(onVar.c, dp4) : onVar.c;
                    } else {
                        i12 = i17;
                        i13 = dp4;
                    }
                    onVar.c = i13;
                    height = dp4 - onVar.b;
                    i24++;
                    i17 = i12;
                    z16 = z11;
                    z10 = z19;
                    f5Var4 = f5Var2;
                }
                org.telegram.ui.ActionBar.f5 f5Var5 = f5Var4;
                boolean z20 = z16;
                boolean z21 = z10;
                if (arrayList3.isEmpty()) {
                    dp = getHeight() - znVar.Ba;
                    i10 = 0;
                } else {
                    i10 = 0;
                    dp = ((on) arrayList3.get(0)).c + AndroidUtilities.dp(3.0f);
                }
                int dp5 = AndroidUtilities.dp(z15 ? 3.0f : 51.0f);
                if (znVar.H9()) {
                    dp5 = AndroidUtilities.lerp(dp5, AndroidUtilities.dp(71.0f), znVar.V8());
                }
                while (i10 < arrayList3.size() && dp > znVar.Aa) {
                    int dp6 = dp - AndroidUtilities.dp(3.0f);
                    on onVar2 = (on) arrayList3.get(i10);
                    int i25 = onVar2.c;
                    ArrayList arrayList4 = arrayList3;
                    boolean z22 = z21;
                    org.telegram.ui.ActionBar.f5 f5Var6 = f5Var5;
                    f5Var6.setBounds(dp5, i25 - onVar2.b, onVar2.a, i25);
                    m.c3 c3Var3 = c3Var2;
                    if (z20) {
                        f5Var6.d(canvas, c3Var3, paint3);
                    }
                    f5Var6.d(canvas, c3Var3, paint2);
                    if (z22) {
                        f5Var6.d(canvas, c3Var3, org.telegram.ui.ActionBar.i6.h2);
                    }
                    f5Var6.d(canvas, c3Var3, paint);
                    if (z15) {
                        c3Var2 = c3Var3;
                        i11 = dp5;
                        f5Var = f5Var6;
                    } else {
                        if (z20) {
                            f10 = 27.0f;
                            c3Var2 = c3Var3;
                            i11 = dp5;
                            canvas.drawCircle(AndroidUtilities.dp(27.0f), i25 - AndroidUtilities.dp(21.0f), AndroidUtilities.dp(21.0f), paint3);
                        } else {
                            c3Var2 = c3Var3;
                            i11 = dp5;
                            f10 = 27.0f;
                        }
                        canvas.drawCircle(AndroidUtilities.dp(f10), i25 - AndroidUtilities.dp(21.0f), AndroidUtilities.dp(21.0f), paint2);
                        if (z22) {
                            f5Var = f5Var6;
                            canvas.drawCircle(AndroidUtilities.dp(f10), i25 - AndroidUtilities.dp(21.0f), AndroidUtilities.dp(21.0f), org.telegram.ui.ActionBar.i6.h2);
                        } else {
                            f5Var = f5Var6;
                        }
                        canvas.drawCircle(AndroidUtilities.dp(f10), i25 - AndroidUtilities.dp(21.0f), AndroidUtilities.dp(21.0f), paint);
                    }
                    dp = dp6 - onVar2.b;
                    i10++;
                    arrayList3 = arrayList4;
                    z21 = z22;
                    dp5 = i11;
                    f5Var5 = f5Var;
                }
                arrayList = arrayList3;
                paint3.setAlpha(alpha3);
                paint2.setAlpha(alpha2);
                paint.setAlpha(alpha4);
                org.telegram.ui.ActionBar.i6.h2.setAlpha(alpha);
                invalidate();
            } else {
                arrayList = arrayList3;
                if (System.currentTimeMillis() - znVar.N6 > 200) {
                    arrayList.clear();
                }
            }
            arrayList.size();
            arrayList2.size();
            if (znVar.N9 != 0.0f) {
                canvas.restore();
            }
        }
        super.draw(canvas);
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x028c, code lost:
    
        if ((r4 & 1) != 0) goto L160;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x05a3  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x05d3  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x05da  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x05f6  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0607  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0647  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0657  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0688  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x069f  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x067f  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x063a  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x05a9  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0356  */
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
    @Override // org.telegram.ui.Components.qm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.Cells.u1 u1Var;
        boolean z10;
        org.telegram.ui.Cells.u1 u1Var2;
        int i10;
        org.telegram.ui.Cells.w0 w0Var;
        MessageObject.GroupedMessages groupedMessages;
        int i11;
        boolean z11;
        float f7;
        boolean z12;
        float f10;
        boolean z13;
        float f11;
        boolean z14;
        boolean z15;
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
        zn znVar = this.x3;
        if (znVar.I9()) {
            invalidate();
        }
        boolean z16 = view == znVar.J8;
        boolean z17 = view instanceof org.telegram.ui.Cells.u1;
        if (z17) {
            u1Var = (org.telegram.ui.Cells.u1) view;
            z10 = u1Var.Zc.w0;
        } else {
            u1Var = null;
            z10 = false;
        }
        if ((!org.telegram.ui.Components.sw0.v0 && ((view.getY() > getMeasuredHeight() || view.getY() + view.getMeasuredHeight() < 0.0f) && !z10)) || view.getVisibility() == 4 || view.getVisibility() == 8) {
            z16 = true;
        }
        if (z17) {
            u1Var2 = (org.telegram.ui.Cells.u1) view;
            if (znVar.n6.contains(u1Var2)) {
                z16 = true;
            }
            MessageObject.GroupedMessagePosition currentPosition = u1Var2.getCurrentPosition();
            groupedMessages = u1Var2.getCurrentMessagesGroup();
            if (currentPosition != null) {
                int i16 = currentPosition.pw;
                int i17 = currentPosition.spanSize;
                if (i16 != i17 && i17 == 1000 && currentPosition.siblingHeights == null && groupedMessages.hasSibling) {
                    i10 = u1Var2.getBackgroundDrawableLeft();
                    i14 = 0;
                    i15 = u1Var2.K1;
                    if (i15 != 7) {
                    }
                    znVar.u8 = u1Var2;
                    if (!z16) {
                    }
                    if (z16) {
                    }
                    i11 = i14;
                    w0Var = null;
                } else if (currentPosition.siblingHeights != null) {
                    i14 = view.getBottom() - AndroidUtilities.dp((u1Var2.m3() ? 1 : 0) + 1);
                    i10 = 0;
                    i15 = u1Var2.K1;
                    if ((i15 != 7 || i15 == 4) && (messageObject = u1Var2.y7) != null && messageObject.type != 5 && MediaController.getInstance().isPlayingMessage(u1Var2.y7)) {
                        znVar.u8 = u1Var2;
                    }
                    if (!z16) {
                        View view2 = znVar.J8;
                        if (view2 instanceof org.telegram.ui.Cells.u1) {
                            org.telegram.ui.Cells.u1 u1Var3 = (org.telegram.ui.Cells.u1) view2;
                            if (u1Var3.getCurrentMessagesGroup() != null && u1Var3.getCurrentMessagesGroup() == groupedMessages) {
                                z16 = true;
                            }
                        }
                    }
                    if (z16) {
                        u1Var2.getPhotoImage().skipDraw();
                    }
                    i11 = i14;
                    w0Var = null;
                }
            }
            i10 = 0;
            i14 = 0;
            i15 = u1Var2.K1;
            if (i15 != 7) {
            }
            znVar.u8 = u1Var2;
            if (!z16) {
            }
            if (z16) {
            }
            i11 = i14;
            w0Var = null;
        } else {
            if (view instanceof org.telegram.ui.Cells.w0) {
                w0Var = (org.telegram.ui.Cells.w0) view;
                u1Var2 = null;
                i10 = 0;
            } else {
                u1Var2 = null;
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
        if (z16) {
            z16 = false;
        }
        if (z16) {
            z11 = true;
            f7 = 0.0f;
            z12 = false;
        } else {
            boolean z18 = (u1Var2 == null || u1Var2.Zc.v1 || groupedMessages == null || !groupedMessages.transitionParams.backgroundChangeBounds) ? false : true;
            if (z18) {
                canvas.save();
                float E2 = u1Var2.E2(true);
                MessageObject.GroupedMessages.TransitionParams transitionParams = groupedMessages.transitionParams;
                z11 = true;
                float f14 = transitionParams.right + E2;
                f7 = 0.0f;
                canvas.clipRect(transitionParams.left + E2 + transitionParams.offsetLeft + AndroidUtilities.dp(4.0f), transitionParams.top + transitionParams.offsetTop + AndroidUtilities.dp(4.0f), (f14 + transitionParams.offsetRight) - AndroidUtilities.dp(4.0f), (transitionParams.bottom + transitionParams.offsetBottom) - AndroidUtilities.dp(4.0f));
            } else {
                z11 = true;
                f7 = 0.0f;
            }
            if (u1Var2 != null) {
                org.telegram.ui.Cells.t1 t1Var = u1Var2.Zc;
                if (t1Var.v1) {
                    canvas.save();
                    canvas.translate(u1Var2.getX(), u1Var2.getY());
                    u1Var2.S1(canvas);
                    canvas.restore();
                    z12 = t1Var.g;
                    if (z18) {
                        canvas.restore();
                    }
                    if (u1Var2 == null && u1Var2.U2()) {
                        canvas.save();
                        canvas.translate(u1Var2.getX(), u1Var2.getPaddingTopAnimated() + u1Var2.getY());
                        u1Var2.X1(canvas);
                        canvas.restore();
                    } else if (w0Var != null) {
                        canvas.save();
                        canvas.translate(w0Var.getX(), w0Var.getY());
                        w0Var.C(canvas);
                        canvas.restore();
                    }
                }
            }
            z12 = (u1Var2 == null || !z18) ? super.drawChild(canvas, view, j3) : super.drawChild(canvas, view, j3);
            if (z18) {
            }
            if (u1Var2 == null) {
            }
            if (w0Var != null) {
            }
        }
        if (i10 != 0 || i11 != 0) {
            canvas.restore();
        }
        if (view.getTranslationY() != f7) {
            canvas.save();
            f10 = f7;
            canvas.translate(f10, view.getTranslationY());
        } else {
            f10 = f7;
        }
        if (u1Var2 != null) {
            u1Var2.K1(canvas);
        }
        if (view.getTranslationY() != f10) {
            canvas.restore();
        }
        if (view.getTranslationY() != f10) {
            canvas.save();
            canvas.translate(f10, view.getTranslationY());
        }
        if (u1Var2 != null) {
            MessageObject messageObject2 = u1Var2.getMessageObject();
            MessageObject.GroupedMessagePosition currentPosition2 = u1Var2.getCurrentPosition();
            if (!z16) {
                if (currentPosition2 != null || u1Var2.getTransitionParams().w0) {
                    if (currentPosition2 == null || currentPosition2.last || (currentPosition2.minX == 0 && currentPosition2.minY == 0)) {
                        if (currentPosition2 == null || currentPosition2.last) {
                            this.Y2.add(u1Var2);
                        }
                        if ((currentPosition2 == null || (currentPosition2.minX == 0 && currentPosition2.minY == 0)) && u1Var2.T2()) {
                            this.Z2.add(u1Var2);
                        }
                    }
                    if (currentPosition2 != null || u1Var2.getTransitionParams().C0 || u1Var2.getTransitionParams().w0) {
                        if (currentPosition2 == null || (currentPosition2.flags & u1Var2.t0()) != 0) {
                            this.a3.add(u1Var2);
                        }
                        if (currentPosition2 != null) {
                            int i18 = currentPosition2.flags;
                            if ((i18 & 8) != 0) {
                            }
                        }
                        this.b3.add(u1Var2);
                    }
                }
                if (znVar.t8 != null && ((messageObject2.isRoundVideo() || messageObject2.isVideo()) && !messageObject2.isVoiceTranscriptionOpen() && MediaController.getInstance().isPlayingMessage(messageObject2))) {
                    ImageReceiver photoImage = u1Var2.getPhotoImage();
                    float x10 = u1Var2.getX() + photoImage.getImageX();
                    float y3 = (znVar.x0.getY() + (photoImage.getImageY() + (u1Var2.getY() + u1Var2.getPaddingTop()))) - znVar.t8.getTop();
                    if (znVar.t8.getTranslationX() != x10 || znVar.t8.getTranslationY() != y3) {
                        znVar.t8.setTranslationX(x10);
                        znVar.t8.setTranslationY(y3);
                        znVar.fragmentView.invalidate();
                        znVar.t8.invalidate();
                    }
                }
            }
        }
        if (u1Var != null) {
            MessageObject messageObject3 = u1Var.getMessageObject();
            MessageObject.GroupedMessagePosition currentPosition3 = u1Var.getCurrentPosition();
            ImageReceiver avatarImage = u1Var.getAvatarImage();
            if (avatarImage != null && znVar.V8() < 1.0f) {
                MessageObject.GroupedMessages c92 = znVar.c9(messageObject3);
                if (!u1Var.getMessageObject().deleted) {
                    znVar.x0.getClass();
                    if (RecyclerView.R(view) != -1) {
                        z14 = z11;
                        z15 = (!znVar.x0.V1 || (c92 != null && c92.transitionParams.backgroundChangeBounds)) ? z11 : false;
                        paddingTop = view.getPaddingTop() + (!z15 ? view.getTop() : (int) view.getY());
                        if (u1Var.j()) {
                            if (u1Var.oc) {
                                b11 = ((SparseArray) znVar.W8.j).indexOfValue(view);
                                if (b11 >= 0) {
                                    b11 = ((SparseArray) znVar.W8.j).keyAt(b11);
                                }
                            } else {
                                b11 = znVar.x0.T(view).b();
                            }
                            if (b11 >= 0) {
                                if (c92 == null || currentPosition3 == null) {
                                    z13 = z12;
                                    f12 = 1.0f;
                                    i13 = b11 - 1;
                                } else {
                                    int indexOf = c92.posArray.indexOf(currentPosition3);
                                    f12 = 1.0f;
                                    int size = c92.posArray.size();
                                    if ((currentPosition3.flags & 8) != 0) {
                                        i13 = (b11 - size) + indexOf;
                                    } else {
                                        i13 = b11 - 1;
                                        int i19 = indexOf + 1;
                                        while (i19 < size) {
                                            z13 = z12;
                                            if (c92.posArray.get(i19).minY > currentPosition3.maxY) {
                                                break;
                                            }
                                            i13--;
                                            i19++;
                                            z12 = z13;
                                        }
                                    }
                                    z13 = z12;
                                }
                                if (u1Var.oc) {
                                    if (((View) ((SparseArray) znVar.W8.j).get(i13)) != null) {
                                        if (view.getTranslationY() != 0.0f) {
                                            canvas.restore();
                                        }
                                        avatarImage.setVisible(false, false);
                                        return z13;
                                    }
                                } else if (znVar.x0.K(i13) != null) {
                                    if (view.getTranslationY() != 0.0f) {
                                        canvas.restore();
                                    }
                                    avatarImage.setVisible(false, false);
                                    return z13;
                                }
                                checkBoxTranslation = u1Var.getCheckBoxTranslation() + u1Var.getSlidingOffsetX();
                                int layoutHeight = (int) (u1Var2.getLayoutHeight() + u1Var2.getTransitionParams().i0 + ((int) (u1Var.getPaddingTopAnimated() + ((int) (0 + (z15 ? view.getTop() : view.getY()))))));
                                int measuredHeight = znVar.x0.getMeasuredHeight() - znVar.x0.getPaddingBottom();
                                boolean z19 = ((!u1Var.m1 || u1Var.n1) && checkBoxTranslation == 0.0f) ? z11 : false;
                                if (!u1Var.o3() || u1Var.getTransitionParams().k2) {
                                    if (u1Var.getTransitionParams().k2) {
                                        float f15 = u1Var.getTransitionParams().K1;
                                        if (!u1Var.o3()) {
                                            f15 = f12 - f15;
                                        }
                                        layoutHeight = (int) com.google.android.gms.internal.vision.e2.y(f12, f15, Math.min(layoutHeight, measuredHeight), layoutHeight * f15);
                                    }
                                } else if (layoutHeight > measuredHeight) {
                                    layoutHeight = measuredHeight;
                                }
                                if (!z15 && view.getTranslationY() != 0.0f) {
                                    canvas.restore();
                                }
                                if (u1Var.h()) {
                                    if (u1Var.oc) {
                                        b10 = ((SparseArray) znVar.W8.j).indexOfValue(view);
                                        if (b10 >= 0) {
                                            b10 = ((SparseArray) znVar.W8.j).keyAt(b10);
                                        }
                                    } else {
                                        b10 = znVar.x0.T(view).b();
                                    }
                                    if (b10 >= 0) {
                                        float f16 = checkBoxTranslation;
                                        ?? r11 = u1Var;
                                        int i20 = b10;
                                        int i21 = 0;
                                        while (i21 < 20) {
                                            i21++;
                                            if (c92 == null || currentPosition3 == null) {
                                                i12 = layoutHeight;
                                                i20++;
                                            } else {
                                                int indexOf2 = c92.posArray.indexOf(currentPosition3);
                                                if (indexOf2 < 0) {
                                                    break;
                                                }
                                                i12 = layoutHeight;
                                                c92.posArray.size();
                                                if ((currentPosition3.flags & 4) != 0) {
                                                    i20 = i20 + indexOf2 + 1;
                                                } else {
                                                    i20++;
                                                    for (int i22 = indexOf2 - 1; i22 >= 0 && c92.posArray.get(i22).maxY >= currentPosition3.minY; i22--) {
                                                        i20++;
                                                    }
                                                }
                                            }
                                            if (!r11.i()) {
                                                s4.d1 K = znVar.x0.K(i20);
                                                if (K == null) {
                                                    break;
                                                }
                                                ?? r02 = K.a;
                                                paddingTop = r02.getPaddingTop() + r02.getTop();
                                                if (!(r02 instanceof org.telegram.ui.Cells.u1)) {
                                                    break;
                                                }
                                                r11 = (org.telegram.ui.Cells.o4) r02;
                                                float checkBoxTranslation2 = r11.getCheckBoxTranslation() + r11.getSlidingOffsetX();
                                                if (z19 && checkBoxTranslation2 > 0.0f) {
                                                    f16 = checkBoxTranslation2;
                                                }
                                                if (!r11.h()) {
                                                    break;
                                                }
                                                layoutHeight = i12;
                                                r11 = r11;
                                            } else {
                                                ?? r03 = (View) ((SparseArray) znVar.W8.j).get(i20);
                                                if (r03 == 0) {
                                                    break;
                                                }
                                                paddingTop = r03.getPaddingTop() + r03.getTop();
                                                if (!(r03 instanceof org.telegram.ui.Cells.o4)) {
                                                    break;
                                                }
                                                r11 = (org.telegram.ui.Cells.o4) r03;
                                                float checkBoxTranslation3 = r11.getCheckBoxTranslation() + r11.getSlidingOffsetX();
                                                if (z19 && checkBoxTranslation3 > 0.0f) {
                                                    f16 = checkBoxTranslation3;
                                                }
                                                if (!r11.h()) {
                                                    break;
                                                }
                                                layoutHeight = i12;
                                                r11 = r11;
                                            }
                                            int dp = i12 - AndroidUtilities.dp(48.0f) < paddingTop ? AndroidUtilities.dp(48.0f) + paddingTop : i12;
                                            if (!u1Var.j()) {
                                                int bottom = z15 ? view.getBottom() : (int) (u1Var.getDeltaBottom() + u1Var.getY() + u1Var.getMeasuredHeight());
                                                if (dp > bottom) {
                                                    dp = bottom;
                                                }
                                            }
                                            canvas.save();
                                            if (checkBoxTranslation != 0.0f) {
                                                canvas.translate(checkBoxTranslation, 0.0f);
                                            }
                                            if (u1Var instanceof org.telegram.ui.Cells.u1) {
                                                org.telegram.ui.Cells.u1 u1Var4 = u1Var;
                                                if (u1Var4.getCurrentMessagesGroup() != null && u1Var4.getCurrentMessagesGroup().transitionParams.backgroundChangeBounds) {
                                                    dp = (int) (dp - u1Var4.getTranslationY());
                                                }
                                            }
                                            if (z14) {
                                                avatarImage.setImageY(dp - AndroidUtilities.dp(44.0f));
                                            }
                                            if (u1Var.a()) {
                                                avatarImage.setAlpha(u1Var.getAlpha() * (1.0f - znVar.V8()));
                                                canvas.scale(u1Var.getScaleX(), u1Var.getScaleY(), u1Var.getPivotX() + u1Var.getX(), u1Var.getY() + (u1Var.getHeight() >> 1));
                                                f13 = 1.0f;
                                            } else {
                                                f13 = 1.0f;
                                                avatarImage.setAlpha(1.0f - znVar.V8());
                                            }
                                            if (z14) {
                                                avatarImage.setVisible(z11, false);
                                            }
                                            if (znVar.V8() > 0.0f) {
                                                canvas.scale(f13 - znVar.V8(), f13 - znVar.V8(), avatarImage.getImageX2(), avatarImage.getImageY2());
                                                f11 = 0.0f;
                                                canvas.translate(znVar.V8() * AndroidUtilities.dp(24.0f), 0.0f);
                                            } else {
                                                f11 = 0.0f;
                                            }
                                            avatarImage.draw(canvas);
                                            canvas.restore();
                                            if (!z15 && view.getTranslationY() != f11) {
                                                canvas.save();
                                            }
                                            if (view.getTranslationY() != f11) {
                                                canvas.restore();
                                            }
                                            return z13;
                                        }
                                        i12 = layoutHeight;
                                        u1Var = r11;
                                        checkBoxTranslation = f16;
                                        if (i12 - AndroidUtilities.dp(48.0f) < paddingTop) {
                                        }
                                        if (!u1Var.j()) {
                                        }
                                        canvas.save();
                                        if (checkBoxTranslation != 0.0f) {
                                        }
                                        if (u1Var instanceof org.telegram.ui.Cells.u1) {
                                        }
                                        if (z14) {
                                        }
                                        if (u1Var.a()) {
                                        }
                                        if (z14) {
                                        }
                                        if (znVar.V8() > 0.0f) {
                                        }
                                        avatarImage.draw(canvas);
                                        canvas.restore();
                                        if (!z15) {
                                            canvas.save();
                                        }
                                        if (view.getTranslationY() != f11) {
                                        }
                                        return z13;
                                    }
                                }
                                i12 = layoutHeight;
                                if (i12 - AndroidUtilities.dp(48.0f) < paddingTop) {
                                }
                                if (!u1Var.j()) {
                                }
                                canvas.save();
                                if (checkBoxTranslation != 0.0f) {
                                }
                                if (u1Var instanceof org.telegram.ui.Cells.u1) {
                                }
                                if (z14) {
                                }
                                if (u1Var.a()) {
                                }
                                if (z14) {
                                }
                                if (znVar.V8() > 0.0f) {
                                }
                                avatarImage.draw(canvas);
                                canvas.restore();
                                if (!z15) {
                                }
                                if (view.getTranslationY() != f11) {
                                }
                                return z13;
                            }
                        }
                        z13 = z12;
                        f12 = 1.0f;
                        checkBoxTranslation = u1Var.getCheckBoxTranslation() + u1Var.getSlidingOffsetX();
                        int layoutHeight2 = (int) (u1Var2.getLayoutHeight() + u1Var2.getTransitionParams().i0 + ((int) (u1Var.getPaddingTopAnimated() + ((int) (0 + (z15 ? view.getTop() : view.getY()))))));
                        int measuredHeight2 = znVar.x0.getMeasuredHeight() - znVar.x0.getPaddingBottom();
                        if (u1Var.m1) {
                        }
                        if (u1Var.o3()) {
                        }
                        if (u1Var.getTransitionParams().k2) {
                        }
                        if (!z15) {
                            canvas.restore();
                        }
                        if (u1Var.h()) {
                        }
                        i12 = layoutHeight2;
                        if (i12 - AndroidUtilities.dp(48.0f) < paddingTop) {
                        }
                        if (!u1Var.j()) {
                        }
                        canvas.save();
                        if (checkBoxTranslation != 0.0f) {
                        }
                        if (u1Var instanceof org.telegram.ui.Cells.u1) {
                        }
                        if (z14) {
                        }
                        if (u1Var.a()) {
                        }
                        if (z14) {
                        }
                        if (znVar.V8() > 0.0f) {
                        }
                        avatarImage.draw(canvas);
                        canvas.restore();
                        if (!z15) {
                        }
                        if (view.getTranslationY() != f11) {
                        }
                        return z13;
                    }
                }
                z14 = false;
                if (znVar.x0.V1) {
                }
                paddingTop = view.getPaddingTop() + (!z15 ? view.getTop() : (int) view.getY());
                if (u1Var.j()) {
                }
                z13 = z12;
                f12 = 1.0f;
                checkBoxTranslation = u1Var.getCheckBoxTranslation() + u1Var.getSlidingOffsetX();
                int layoutHeight22 = (int) (u1Var2.getLayoutHeight() + u1Var2.getTransitionParams().i0 + ((int) (u1Var.getPaddingTopAnimated() + ((int) (0 + (z15 ? view.getTop() : view.getY()))))));
                int measuredHeight22 = znVar.x0.getMeasuredHeight() - znVar.x0.getPaddingBottom();
                if (u1Var.m1) {
                }
                if (u1Var.o3()) {
                }
                if (u1Var.getTransitionParams().k2) {
                }
                if (!z15) {
                }
                if (u1Var.h()) {
                }
                i12 = layoutHeight22;
                if (i12 - AndroidUtilities.dp(48.0f) < paddingTop) {
                }
                if (!u1Var.j()) {
                }
                canvas.save();
                if (checkBoxTranslation != 0.0f) {
                }
                if (u1Var instanceof org.telegram.ui.Cells.u1) {
                }
                if (z14) {
                }
                if (u1Var.a()) {
                }
                if (z14) {
                }
                if (znVar.V8() > 0.0f) {
                }
                avatarImage.draw(canvas);
                canvas.restore();
                if (!z15) {
                }
                if (view.getTranslationY() != f11) {
                }
                return z13;
            }
        }
        z13 = z12;
        f11 = 0.0f;
        if (view.getTranslationY() != f11) {
        }
        return z13;
    }

    @Override // org.telegram.ui.Components.qm0
    public final void h1(View view, float f7, float f10, boolean z10) {
        MessageObject.GroupedMessages currentMessagesGroup;
        super.h1(view, f7, f10, z10);
        if (view instanceof org.telegram.ui.Cells.u1) {
            org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) view;
            MessageObject messageObject = u1Var.getMessageObject();
            if (messageObject.isMusic() || messageObject.isDocument() || (currentMessagesGroup = u1Var.getCurrentMessagesGroup()) == null) {
                return;
            }
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = getChildAt(i10);
                if (childAt != view && (childAt instanceof org.telegram.ui.Cells.u1)) {
                    org.telegram.ui.Cells.u1 u1Var2 = (org.telegram.ui.Cells.u1) childAt;
                    if (u1Var2.getCurrentMessagesGroup() == currentMessagesGroup) {
                        u1Var2.setPressed(z10);
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:191:0x06f4  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x07e2  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0701  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0885  */
    /* JADX WARN: Removed duplicated region for block: B:223:? A[RETURN, SYNTHETIC] */
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float f7;
        float f10;
        xp xpVar;
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
        org.telegram.ui.ActionBar.e6 e6Var;
        int i15;
        float f21;
        float f22;
        super.onDraw(canvas);
        zn znVar = this.x3;
        View view = znVar.d9;
        if (view != null) {
            float slidingOffsetX = view instanceof org.telegram.ui.Cells.u1 ? ((org.telegram.ui.Cells.u1) view).getSlidingOffsetX() : view instanceof org.telegram.ui.Cells.w0 ? ((org.telegram.ui.Cells.w0) view).getWalletSlidingOffset() : 0.0f;
            if (!znVar.e9 && !znVar.f9 && this.i3 != 0.0f && slidingOffsetX != 0.0f) {
                long currentTimeMillis = System.currentTimeMillis();
                float f23 = ((currentTimeMillis - this.g3) / 180.0f) + this.h3;
                this.h3 = f23;
                if (f23 > 1.0f) {
                    this.h3 = 1.0f;
                }
                this.g3 = currentTimeMillis;
                float interpolation = (1.0f - AndroidUtilities.decelerateInterpolator.getInterpolation(this.h3)) * this.i3;
                if (interpolation == 0.0f) {
                    this.i3 = 0.0f;
                }
                View view2 = znVar.d9;
                if (view2 instanceof org.telegram.ui.Cells.u1) {
                    A1((org.telegram.ui.Cells.u1) view2, interpolation);
                }
                zn.W1(znVar, interpolation);
                MessageObject T1 = zn.T1(znVar);
                if (T1 != null && (T1.isRoundVideo() || T1.isVideo())) {
                    znVar.Qc(false, false);
                }
                float f24 = this.h3;
                if (f24 == 1.0f || f24 == 0.0f) {
                    zn.W1(znVar, 0.0f);
                    znVar.d9 = null;
                }
                invalidate();
            }
            if (znVar.d9 != null && Thread.currentThread() == Looper.getMainLooper().getThread()) {
                Paint X0 = X0("paintChatActionBackground");
                Paint paint6 = org.telegram.ui.ActionBar.i6.h2;
                Paint paint7 = this.l3;
                if (paint7.getColor() != X0.getColor()) {
                    paint7.setColor(X0.getColor());
                }
                Paint paint8 = this.m3;
                if (paint8.getColor() != paint6.getColor()) {
                    paint8.setColor(paint6.getColor());
                }
                if (paint7.getShader() != X0.getShader()) {
                    paint7.setShader(X0.getShader());
                }
                if (paint8.getShader() != paint6.getShader()) {
                    paint8.setShader(paint6.getShader());
                }
                o1.j jVar = this.p3;
                float f25 = jVar.a;
                float f26 = this.k3;
                float f27 = f25 / f26;
                f7 = 255.0f;
                int color = paint8.getColor();
                if (f27 > 1.0f) {
                    this.t3 = true;
                }
                f10 = 2.0f;
                View view3 = znVar.d9;
                float E2 = view3 instanceof org.telegram.ui.Cells.u1 ? ((org.telegram.ui.Cells.u1) view3).E2(false) : view3 instanceof org.telegram.ui.Cells.w0 ? ((org.telegram.ui.Cells.w0) view3).getWalletSlidingOffset() : 0.0f;
                o1.j jVar2 = this.n3;
                float f28 = jVar2.a;
                o1.j jVar3 = this.r3;
                o1.k kVar = this.s3;
                o1.k kVar2 = this.q3;
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
                    this.t3 = false;
                } else {
                    paint = paint6;
                    paint2 = paint7;
                    i14 = color;
                }
                if (((float) kVar2.u.i) != f26) {
                    f12 = 1.0f;
                    f13 = w7.o.a(((-E2) - AndroidUtilities.dp(20.0f)) / AndroidUtilities.dp(30.0f), 0.0f, 1.0f);
                } else {
                    f12 = 1.0f;
                    f13 = 1.0f;
                }
                if (f13 == f12) {
                    o1.l lVar = kVar2.u;
                    f14 = 20.0f;
                    f15 = f27;
                    if (((float) lVar.i) != f26) {
                        double d10 = f26;
                        lVar.i = d10;
                        kVar2.h();
                        kVar.u.i = d10;
                        kVar.h();
                    }
                } else {
                    f14 = 20.0f;
                    f15 = f27;
                }
                float f29 = E2 <= ((float) (-AndroidUtilities.dp(f14))) ? f26 : 0.0f;
                o1.k kVar3 = this.o3;
                o1.l lVar2 = kVar3.u;
                if (f29 != ((float) lVar2.i)) {
                    lVar2.i = f29;
                    if (!kVar3.f) {
                        kVar3.h();
                    }
                }
                float f30 = jVar2.a / f26;
                MessageObject T12 = zn.T1(znVar);
                float measuredWidth = (E2 * ((T12 == null || !T12.isOut()) ? 1.0f : 0.5f)) + getMeasuredWidth();
                float measuredHeight = (znVar.d9.getMeasuredHeight() / 2.0f) + znVar.d9.getTop();
                boolean z10 = this.t3;
                float f31 = z10 ? f15 : f30;
                float f32 = z10 ? 0.0f : 1.0f - f15;
                int i16 = org.telegram.ui.ActionBar.i6.d6;
                org.telegram.ui.ActionBar.e6 e6Var2 = this.n2;
                boolean z11 = i0.a.f(org.telegram.ui.ActionBar.i6.w0(i16, e6Var2)) <= 0.5d;
                if (f30 != 0.0f) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    f18 = f26;
                    rectF.set((int) ((paint2.getStrokeWidth() / 2.0f) + (measuredWidth - (AndroidUtilities.dp(16.0f) * f31))), (int) ((paint2.getStrokeWidth() / 2.0f) + (measuredHeight - (AndroidUtilities.dp(16.0f) * f31))), (int) (((AndroidUtilities.dp(16.0f) * f31) + measuredWidth) - (paint2.getStrokeWidth() / 2.0f)), (int) (((AndroidUtilities.dp(16.0f) * f31) + measuredHeight) - (paint2.getStrokeWidth() / 2.0f)));
                    org.telegram.ui.ActionBar.i6.q(0.0f, getY() + rectF.top, getMeasuredWidth(), AndroidUtilities.displaySize.y);
                    if (f15 == 0.0f) {
                        int alpha = paint2.getAlpha();
                        Paint paint9 = paint2;
                        paint9.setAlpha((int) (alpha * f30));
                        float f33 = f13 * 360.0f;
                        f16 = f13;
                        f19 = f30;
                        paint3 = paint;
                        e6Var = e6Var2;
                        f17 = measuredWidth;
                        f20 = measuredHeight;
                        canvas.drawArc(rectF, -90.0f, f33, false, paint9);
                        paint9.setAlpha(alpha);
                        if (znVar.ea.k0()) {
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
                        paint5 = paint8;
                        e6Var = e6Var2;
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
                    e6Var = e6Var2;
                }
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set((int) (f17 - (AndroidUtilities.dp(16.0f) * f31)), (int) (f20 - (AndroidUtilities.dp(16.0f) * f31)), (int) ((AndroidUtilities.dp(16.0f) * f31) + f17), (int) ((AndroidUtilities.dp(16.0f) * f31) + f20));
                org.telegram.ui.ActionBar.i6.q(0.0f, getY() + rectF2.top, getMeasuredWidth(), AndroidUtilities.displaySize.y);
                Path path = this.u3;
                path.rewind();
                Path.Direction direction = Path.Direction.CW;
                path.addRoundRect(rectF2, AndroidUtilities.dp(16.0f) * f31, AndroidUtilities.dp(16.0f) * f31, direction);
                int alpha3 = X0.getAlpha();
                float f34 = 0.6f * f19 * f16;
                X0.setAlpha((int) (alpha3 * f34));
                canvas2.drawPath(path, X0);
                X0.setAlpha(alpha3);
                if (znVar.ea.k0()) {
                    int alpha4 = org.telegram.ui.ActionBar.i6.h2.getAlpha();
                    if (z11) {
                        f22 = f34;
                        org.telegram.ui.ActionBar.i6.h2.setColor(-1);
                    } else {
                        f22 = f34;
                    }
                    org.telegram.ui.ActionBar.i6.h2.setAlpha((int) (alpha4 * f22));
                    canvas2.drawPath(path, org.telegram.ui.ActionBar.i6.h2);
                    org.telegram.ui.ActionBar.i6.h2.setAlpha(alpha4);
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
                org.telegram.ui.ActionBar.i6.q(0.0f, getY() + rectF2.top, getMeasuredWidth(), AndroidUtilities.displaySize.y);
                path.rewind();
                path.addRoundRect(rectF2, AndroidUtilities.dp(16.0f) * f21, AndroidUtilities.dp(16.0f) * f21, direction);
                int alpha5 = X0.getAlpha();
                float f35 = 0.4f * f19;
                X0.setAlpha((int) (alpha5 * f35));
                canvas2.drawPath(path, X0);
                X0.setAlpha(alpha5);
                if (znVar.ea.k0()) {
                    int alpha6 = org.telegram.ui.ActionBar.i6.h2.getAlpha();
                    if (z11) {
                        org.telegram.ui.ActionBar.i6.h2.setColor(-1);
                    }
                    org.telegram.ui.ActionBar.i6.h2.setAlpha((int) (f35 * alpha6));
                    canvas2.drawPath(path, org.telegram.ui.ActionBar.i6.h2);
                    org.telegram.ui.ActionBar.i6.h2.setAlpha(alpha6);
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
                        org.telegram.ui.ActionBar.i6.q(0.0f, getY() + rectF2.top, getMeasuredWidth(), AndroidUtilities.displaySize.y);
                        int alpha7 = paint4.getAlpha();
                        paint4.setAlpha((int) (alpha7 * f19));
                        paint4.setStrokeWidth(f38);
                        canvas2.drawRoundRect(rectF2, AndroidUtilities.dp(16.0f) * f37, AndroidUtilities.dp(16.0f) * f37, paint4);
                        paint4.setStrokeWidth(strokeWidth);
                        paint4.setAlpha(alpha7);
                        if (znVar.ea.k0()) {
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
                Drawable drawable = e6Var != null ? e6Var.getDrawable("drawableReplyIcon") : null;
                if (drawable == null) {
                    drawable = org.telegram.ui.ActionBar.i6.P0("drawableReplyIcon");
                }
                drawable.setAlpha(i18);
                drawable.setBounds((int) (f17 - ((drawable.getIntrinsicWidth() / 2) * f21)), (int) (f20 - ((drawable.getIntrinsicHeight() / 2) * f21)), (int) (((drawable.getIntrinsicWidth() / 2) * f21) + f17), (int) (((drawable.getIntrinsicHeight() / 2) * f21) + f20));
                drawable.draw(canvas2);
                drawable.setAlpha(255);
                int i19 = i14;
                paint5.setColor(i19);
                paint3.setColor(i19);
                if (znVar.N9 != 0.0f || znVar.isInPreviewMode() || znVar.Pa || (i10 = znVar.R3) == 3 || i10 == 1) {
                    xpVar = znVar.P9;
                    if (xpVar == null) {
                        xpVar.O = 0.0f;
                        xpVar.N = false;
                        return;
                    }
                    return;
                }
                canvas2.save();
                if (znVar.U9 != 0.0f) {
                    float measuredHeight2 = znVar.x0.getMeasuredHeight() - znVar.N9;
                    zn znVar2 = znVar.T9;
                    f11 = (measuredHeight2 + (znVar2 == null ? 0.0f : znVar2.O9)) * znVar.U9;
                } else {
                    f11 = 0.0f;
                }
                canvas2.translate(0.0f, (getMeasuredHeight() - znVar.Ba) - f11);
                if (znVar.P9 == null) {
                    i13 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
                    xp xpVar2 = new xp(i13, znVar.fragmentView, znVar.T5, znVar.ua, znVar.va, znVar.d(), znVar.ea);
                    znVar.P9 = xpVar2;
                    xpVar2.S = znVar.uc.e;
                    ArrayList arrayList = znVar.fb;
                    if (arrayList != null && !arrayList.isEmpty()) {
                        znVar.P9.i((TLRPC.Chat) znVar.fb.get(0));
                    } else if (znVar.h4) {
                        znVar.P9.j();
                    } else {
                        znVar.P9.h();
                    }
                    znVar.P9.f();
                }
                xp xpVar3 = znVar.P9;
                int measuredWidth2 = getMeasuredWidth() - (znVar.H9() ? AndroidUtilities.dp(71.0f) : 0);
                ImageReceiver imageReceiver = xpVar3.F;
                TextPaint textPaint = xpVar3.f;
                TextPaint textPaint2 = xpVar3.h;
                boolean z12 = xpVar3.X;
                if (measuredWidth2 != xpVar3.c || (z12 && (tL_forumTopic = xpVar3.H) != null && xpVar3.I != tL_forumTopic.id)) {
                    xpVar3.d = AndroidUtilities.dp(56.0f) / f10;
                    xpVar3.c = measuredWidth2;
                    TLRPC.Chat chat = xpVar3.G;
                    if (chat != null) {
                        string = chat.title;
                    } else {
                        TLRPC.TL_forumTopic tL_forumTopic2 = xpVar3.H;
                        if (tL_forumTopic2 != null) {
                            string = tL_forumTopic2.title;
                        } else {
                            if (z12) {
                                i11 = 0;
                                string = LocaleController.formatString(R.string.SwipeToGoNextTopicEnd, MessagesController.getInstance(xpVar3.e0).getChat(Long.valueOf(-xpVar3.i0)).title);
                            } else {
                                i11 = 0;
                                string = LocaleController.getString(R.string.SwipeToGoNextChannelEnd);
                            }
                            int measureText = (int) textPaint.measureText((CharSequence) string, i11, string.length());
                            xpVar3.x = measureText;
                            int min = Math.min(measureText, xpVar3.c - AndroidUtilities.dp(60.0f));
                            xpVar3.x = min;
                            xpVar3.s = org.telegram.ui.Components.mx0.c(string, textPaint, min, Layout.Alignment.ALIGN_NORMAL, 0.0f, TextUtils.TruncateAt.END, min, 1, true);
                            if (!xpVar3.V) {
                                string2 = LocaleController.getString(R.string.SwipeToGoNextRecommendedChannel);
                                string3 = LocaleController.getString(R.string.ReleaseToGoNextRecommendedChannel);
                            } else if (z12) {
                                string2 = LocaleController.getString(R.string.SwipeToGoNextUnreadTopic);
                                string3 = LocaleController.getString(R.string.ReleaseToGoNextUnreadTopic);
                            } else {
                                boolean z13 = xpVar3.W;
                                if (z13 && (i12 = xpVar3.a) != xpVar3.f0 && i12 != 0) {
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
                            xpVar3.y = measureText2;
                            xpVar3.y = Math.min(measureText2, xpVar3.c - AndroidUtilities.dp(60.0f));
                            int i20 = xpVar3.y;
                            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                            xpVar3.v = new StaticLayout(string2, textPaint2, i20, alignment, 1.0f, 0.0f, false);
                            int measureText3 = (int) textPaint2.measureText(string3);
                            xpVar3.E = measureText3;
                            xpVar3.E = Math.min(measureText3, xpVar3.c - AndroidUtilities.dp(60.0f));
                            xpVar3.w = new StaticLayout(string3, textPaint2, xpVar3.E, alignment, 1.0f, 0.0f, false);
                            imageReceiver.setImageCoords((xpVar3.c / f10) - (AndroidUtilities.dp(40.0f) / f10), (AndroidUtilities.dp(12.0f) + xpVar3.d) - (AndroidUtilities.dp(40.0f) / f10), AndroidUtilities.dp(40.0f), AndroidUtilities.dp(40.0f));
                            imageReceiver.setRoundRadius((int) (AndroidUtilities.dp(40.0f) / f10));
                            xpVar3.c0.d(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(100.0f));
                            if (z12) {
                                xpVar3.I = xpVar3.H == null ? 0L : r3.id;
                            }
                        }
                    }
                    i11 = 0;
                    int measureText4 = (int) textPaint.measureText((CharSequence) string, i11, string.length());
                    xpVar3.x = measureText4;
                    int min2 = Math.min(measureText4, xpVar3.c - AndroidUtilities.dp(60.0f));
                    xpVar3.x = min2;
                    xpVar3.s = org.telegram.ui.Components.mx0.c(string, textPaint, min2, Layout.Alignment.ALIGN_NORMAL, 0.0f, TextUtils.TruncateAt.END, min2, 1, true);
                    if (!xpVar3.V) {
                    }
                    int measureText22 = (int) textPaint2.measureText(string2);
                    xpVar3.y = measureText22;
                    xpVar3.y = Math.min(measureText22, xpVar3.c - AndroidUtilities.dp(60.0f));
                    int i202 = xpVar3.y;
                    Layout.Alignment alignment2 = Layout.Alignment.ALIGN_CENTER;
                    xpVar3.v = new StaticLayout(string2, textPaint2, i202, alignment2, 1.0f, 0.0f, false);
                    int measureText32 = (int) textPaint2.measureText(string3);
                    xpVar3.E = measureText32;
                    xpVar3.E = Math.min(measureText32, xpVar3.c - AndroidUtilities.dp(60.0f));
                    xpVar3.w = new StaticLayout(string3, textPaint2, xpVar3.E, alignment2, 1.0f, 0.0f, false);
                    imageReceiver.setImageCoords((xpVar3.c / f10) - (AndroidUtilities.dp(40.0f) / f10), (AndroidUtilities.dp(12.0f) + xpVar3.d) - (AndroidUtilities.dp(40.0f) / f10), AndroidUtilities.dp(40.0f), AndroidUtilities.dp(40.0f));
                    imageReceiver.setRoundRadius((int) (AndroidUtilities.dp(40.0f) / f10));
                    xpVar3.c0.d(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(100.0f));
                    if (z12) {
                    }
                }
                float min3 = Math.min(1.0f, znVar.N9 / AndroidUtilities.dp(110.0f));
                canvas2.translate(znVar.H9() ? AndroidUtilities.lerp(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(71.0f), znVar.V8()) : 0.0f, -(znVar.b9(org.telegram.ui.Components.y31.c) + znVar.S.getInputBubbleHeight() + znVar.v.d() + AndroidUtilities.dp(10.0f)));
                znVar.P9.a(canvas2, znVar.x0, min3, 1.0f - znVar.U9);
                canvas2.restore();
                if (znVar.T9 != null) {
                    canvas2.saveLayerAlpha(0.0f, 0.0f, r2.x0.getMeasuredWidth(), znVar.T9.x0.getMeasuredHeight(), (int) (znVar.U9 * f7), 31);
                    canvas2.translate(0.0f, (getMeasuredHeight() - znVar.N9) - f11);
                    znVar.T9.x0.draw(canvas2);
                    canvas2.restore();
                    return;
                }
                return;
            }
        }
        canvas2 = canvas;
        f7 = 255.0f;
        f10 = 2.0f;
        if (znVar.N9 != 0.0f) {
        }
        xpVar = znVar.P9;
        if (xpVar == null) {
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        if (this.x3.h != null) {
            return;
        }
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        AccessibilityNodeInfo.CollectionInfo collectionInfo = accessibilityNodeInfo.getCollectionInfo();
        if (collectionInfo != null) {
            accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(collectionInfo.getRowCount(), 1, false));
        }
    }

    @Override // org.telegram.ui.Components.qm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        uh.i iVar;
        org.telegram.ui.ActionBar.k kVar;
        zn znVar = this.x3;
        tm tmVar = znVar.c9;
        tmVar.getClass();
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            AndroidUtilities.cancelRunOnUIThread(tmVar.f0);
            tmVar.z = false;
        }
        if (this.V1 || ((iVar = znVar.X9) != null && iVar.a())) {
            return false;
        }
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        kVar = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
        if (!kVar.t() && !znVar.F9()) {
            z1(motionEvent);
        }
        return onInterceptTouchEvent;
    }

    @Override // org.telegram.ui.Components.qm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int i14 = this.X2;
        int i15 = i12 - i10;
        zn znVar = this.x3;
        if (i14 != i15) {
            if (i14 != 0) {
                znVar.m9(false);
            }
            this.X2 = i15;
        }
        int measuredHeight = getMeasuredHeight();
        if (this.w3 != measuredHeight) {
            this.v3 = true;
            yj yjVar = znVar.y0;
            if (yjVar != null) {
                yjVar.g();
            }
            znVar.W8.a();
            this.v3 = false;
            this.w3 = measuredHeight;
        }
        znVar.R5 = false;
        tm tmVar = znVar.c9;
        if (tmVar != null && tmVar.x()) {
            znVar.c9.w();
        }
        znVar.u9();
        znVar.I9();
    }

    @Override // org.telegram.ui.Components.qm0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        xp xpVar;
        zn znVar = this.x3;
        me.b bVar = znVar.uc;
        tm tmVar = znVar.c9;
        tmVar.getClass();
        final int i10 = 3;
        final int i11 = 0;
        final int i12 = 1;
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            AndroidUtilities.cancelRunOnUIThread(tmVar.f0);
            tmVar.z = false;
        }
        if (motionEvent.getAction() == 0) {
            znVar.sa = true;
        }
        if (znVar.N9 != 0.0f && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            float min = Math.min(1.0f, znVar.N9 / AndroidUtilities.dp(110.0f));
            final int i13 = 2;
            if (motionEvent.getAction() != 1 || min != 1.0f || (xpVar = znVar.P9) == null || xpVar.R) {
                xp xpVar2 = znVar.P9;
                if (xpVar2 != null && xpVar2.R) {
                    long currentTimeMillis = System.currentTimeMillis();
                    xp xpVar3 = znVar.P9;
                    if (currentTimeMillis - xpVar3.U < 500 && xpVar3.M) {
                        AnimatorSet animatorSet = new AnimatorSet();
                        znVar.Q9 = animatorSet;
                        if (znVar.P9 != null) {
                            bVar.a(false, true);
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(znVar.N9, AndroidUtilities.dp(111.0f));
                        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.uj
                            public final /* synthetic */ wj b;

                            {
                                this.b = this;
                            }

                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (i12) {
                                    case 0:
                                        zn znVar2 = this.b.x3;
                                        znVar2.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        znVar2.x0.invalidate();
                                        break;
                                    case 1:
                                        zn znVar3 = this.b.x3;
                                        znVar3.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        znVar3.x0.invalidate();
                                        break;
                                    case 2:
                                        zn znVar4 = this.b.x3;
                                        znVar4.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        znVar4.x0.invalidate();
                                        break;
                                    default:
                                        zn znVar5 = this.b.x3;
                                        znVar5.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        znVar5.x0.invalidate();
                                        break;
                                }
                            }
                        });
                        ofFloat.setDuration(400L);
                        ofFloat.setInterpolator(org.telegram.ui.Components.hs.f);
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(AndroidUtilities.dp(111.0f), 0.0f);
                        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.uj
                            public final /* synthetic */ wj b;

                            {
                                this.b = this;
                            }

                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (i13) {
                                    case 0:
                                        zn znVar2 = this.b.x3;
                                        znVar2.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        znVar2.x0.invalidate();
                                        break;
                                    case 1:
                                        zn znVar3 = this.b.x3;
                                        znVar3.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        znVar3.x0.invalidate();
                                        break;
                                    case 2:
                                        zn znVar4 = this.b.x3;
                                        znVar4.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        znVar4.x0.invalidate();
                                        break;
                                    default:
                                        zn znVar5 = this.b.x3;
                                        znVar5.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        znVar5.x0.invalidate();
                                        break;
                                }
                            }
                        });
                        ofFloat2.setStartDelay(600L);
                        ofFloat2.setDuration(250L);
                        ofFloat2.setInterpolator(ji.n.V);
                        animatorSet.playSequentially(ofFloat, ofFloat2);
                        animatorSet.start();
                    }
                }
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(znVar.N9, 0.0f);
                znVar.Q9 = ofFloat3;
                if (znVar.P9 != null) {
                    bVar.a(false, true);
                }
                ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.uj
                    public final /* synthetic */ wj b;

                    {
                        this.b = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i10) {
                            case 0:
                                zn znVar2 = this.b.x3;
                                znVar2.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                znVar2.x0.invalidate();
                                break;
                            case 1:
                                zn znVar3 = this.b.x3;
                                znVar3.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                znVar3.x0.invalidate();
                                break;
                            case 2:
                                zn znVar4 = this.b.x3;
                                znVar4.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                znVar4.x0.invalidate();
                                break;
                            default:
                                zn znVar5 = this.b.x3;
                                znVar5.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                znVar5.x0.invalidate();
                                break;
                        }
                    }
                });
                ofFloat3.setDuration(250L);
                ofFloat3.setInterpolator(ji.n.V);
                ofFloat3.start();
            } else if (xpVar.K != 1.0f) {
                float f7 = znVar.N9;
                ValueAnimator ofFloat4 = ValueAnimator.ofFloat(f7, AndroidUtilities.dp(8.0f) + f7);
                znVar.Q9 = ofFloat4;
                ofFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.uj
                    public final /* synthetic */ wj b;

                    {
                        this.b = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i11) {
                            case 0:
                                zn znVar2 = this.b.x3;
                                znVar2.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                znVar2.x0.invalidate();
                                break;
                            case 1:
                                zn znVar3 = this.b.x3;
                                znVar3.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                znVar3.x0.invalidate();
                                break;
                            case 2:
                                zn znVar4 = this.b.x3;
                                znVar4.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                znVar4.x0.invalidate();
                                break;
                            default:
                                zn znVar5 = this.b.x3;
                                znVar5.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                znVar5.x0.invalidate();
                                break;
                        }
                    }
                });
                ofFloat4.setDuration(200L);
                org.telegram.ui.Components.hs hsVar = org.telegram.ui.Components.hs.f;
                ofFloat4.setInterpolator(hsVar);
                ofFloat4.start();
                final xp xpVar4 = znVar.P9;
                cj cjVar = new cj(this, i13);
                AnimatorSet animatorSet2 = xpVar4.J;
                if (animatorSet2 != null) {
                    animatorSet2.removeAllListeners();
                    xpVar4.J.cancel();
                }
                xpVar4.Y = cjVar;
                xpVar4.J = new AnimatorSet();
                ValueAnimator ofFloat5 = ValueAnimator.ofFloat(xpVar4.K, 1.0f);
                ofFloat5.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.wp
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i11) {
                            case 0:
                                xp xpVar5 = xpVar4;
                                xpVar5.getClass();
                                xpVar5.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                xpVar5.T.invalidate();
                                View view = xpVar5.a0;
                                if (view != null) {
                                    view.invalidate();
                                    break;
                                }
                                break;
                            default:
                                xp xpVar6 = xpVar4;
                                xpVar6.getClass();
                                xpVar6.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                View view2 = xpVar6.a0;
                                if (view2 != null) {
                                    view2.invalidate();
                                    break;
                                }
                                break;
                        }
                    }
                });
                ValueAnimator ofFloat6 = ValueAnimator.ofFloat(xpVar4.L, 0.0f);
                ofFloat6.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.wp
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i12) {
                            case 0:
                                xp xpVar5 = xpVar4;
                                xpVar5.getClass();
                                xpVar5.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                xpVar5.T.invalidate();
                                View view = xpVar5.a0;
                                if (view != null) {
                                    view.invalidate();
                                    break;
                                }
                                break;
                            default:
                                xp xpVar6 = xpVar4;
                                xpVar6.getClass();
                                xpVar6.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                View view2 = xpVar6.a0;
                                if (view2 != null) {
                                    view2.invalidate();
                                    break;
                                }
                                break;
                        }
                    }
                });
                xpVar4.J.addListener(new t4(xpVar4, 23));
                xpVar4.J.playTogether(ofFloat5, ofFloat6);
                xpVar4.J.setDuration(120L);
                xpVar4.J.setInterpolator(hsVar);
                xpVar4.J.start();
            } else {
                zn.X1(znVar);
            }
        }
        if (!this.V1) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            kVar = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
            if (kVar.t() || znVar.F9()) {
                return onTouchEvent;
            }
            z1(motionEvent);
            if (znVar.f9 || onTouchEvent) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        if (this.x3.Q8 != null) {
            return false;
        }
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        if (this.x3.d9 != null) {
            z1(null);
        }
    }

    @Override // org.telegram.ui.Components.qm0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.v3) {
            return;
        }
        hh.a aVar = this.x3.Qb;
        if (aVar.b != 0) {
            int childCount = aVar.a.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                aVar.a.getChildAt(i10).forceLayout();
            }
        }
        super.requestLayout();
    }

    @Override // org.telegram.ui.Components.qm0, androidx.recyclerview.widget.RecyclerView
    public final void setItemAnimator(s4.n0 n0Var) {
        if (this.V1) {
            return;
        }
        super.setItemAnimator(n0Var);
    }

    @Override // org.telegram.ui.Components.qm0, android.view.View
    public final void setTranslationY(float f7) {
        if (f7 != getTranslationY()) {
            super.setTranslationY(f7);
            zn znVar = this.x3;
            znVar.t9();
            znVar.w9();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x03bf, code lost:
    
        if (r2.messages.size() != 1) goto L155;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x1(Canvas canvas, RectF rectF) {
        int i10;
        int i11;
        float f7;
        float f10;
        zn znVar;
        float f11;
        int i12;
        float f12;
        int i13;
        int i14;
        float f13;
        boolean z10;
        int i15;
        MessageObject.GroupedMessages currentMessagesGroup;
        int i16;
        boolean z11;
        org.telegram.ui.ActionBar.k kVar;
        int measuredHeight;
        int i17;
        int i18;
        org.telegram.ui.ActionBar.k kVar2;
        int measuredHeight2;
        wj wjVar = this;
        Canvas canvas2 = canvas;
        int childCount = wjVar.getChildCount();
        MessageObject.GroupedMessages groupedMessages = null;
        int i19 = 0;
        while (true) {
            i10 = 8;
            i11 = 2;
            f7 = 0.0f;
            f10 = 2.0f;
            znVar = wjVar.x3;
            if (i19 >= childCount) {
                f11 = 1.0f;
                break;
            }
            View childAt = wjVar.getChildAt(i19);
            f11 = 1.0f;
            if (childAt.getVisibility() != 4 && childAt.getVisibility() != 8) {
                if (!zn.e2(znVar, childAt, rectF)) {
                    if (childAt instanceof org.telegram.ui.Cells.v1) {
                        canvas2.save();
                        canvas2.translate(childAt.getX(), childAt.getY());
                        ((org.telegram.ui.Cells.v1) childAt).a(canvas2);
                        canvas2.restore();
                    } else if (znVar.A0.n && (childAt instanceof org.telegram.ui.Cells.h0)) {
                        float measuredHeight3 = ((((wjVar.getMeasuredHeight() - znVar.s9) - znVar.Ba) / 2.0f) - (childAt.getMeasuredHeight() / 2)) + znVar.s9;
                        if (!((org.telegram.ui.Cells.h0) childAt).I && !znVar.x0.V1) {
                            if (childAt.getTop() > measuredHeight3) {
                                childAt.setTranslationY(measuredHeight3 - childAt.getTop());
                            } else {
                                childAt.setTranslationY(0.0f);
                            }
                        }
                    } else if (childAt instanceof org.telegram.ui.Cells.za) {
                        float measuredHeight4 = ((((wjVar.getMeasuredHeight() - znVar.s9) - znVar.Ba) / 2.0f) - (childAt.getMeasuredHeight() / 2)) + znVar.s9;
                        if (!((org.telegram.ui.Cells.za) childAt).N && !znVar.x0.V1) {
                            if (childAt.getTop() > measuredHeight4) {
                                childAt.setTranslationY(measuredHeight4 - childAt.getTop());
                            } else {
                                childAt.setTranslationY(0.0f);
                            }
                        }
                    } else {
                        if (childAt instanceof org.telegram.ui.Cells.u1) {
                            org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) childAt;
                            MessageObject.GroupedMessages currentMessagesGroup2 = u1Var.getCurrentMessagesGroup();
                            if (currentMessagesGroup2 == null || currentMessagesGroup2 != groupedMessages) {
                                MessageObject.GroupedMessagePosition currentPosition = u1Var.getCurrentPosition();
                                org.telegram.ui.Components.rb0 backgroundDrawable = u1Var.getBackgroundDrawable();
                                if ((backgroundDrawable.f || u1Var.g3()) && (currentPosition == null || (2 & currentPosition.flags) != 0)) {
                                    boolean z12 = u1Var.f8;
                                    org.telegram.ui.ActionBar.e6 e6Var = wjVar.n2;
                                    z11 = true;
                                    if (z12 || u1Var.g8) {
                                        i16 = i19;
                                        if (currentPosition == null) {
                                            Paint X0 = wjVar.X0("paintChatMessageBackgroundSelected");
                                            xn xnVar = znVar.ea;
                                            if ((xnVar == null || !xnVar.G) && X0 != null) {
                                                if (znVar.C9()) {
                                                    measuredHeight = znVar.x0.getTop();
                                                } else {
                                                    kVar = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
                                                    measuredHeight = kVar.getMeasuredHeight();
                                                }
                                                float backgroundTranslationY = measuredHeight - znVar.X0.getBackgroundTranslationY();
                                                int backgroundSizeY = znVar.X0.getBackgroundSizeY();
                                                xn xnVar2 = znVar.ea;
                                                if (xnVar2 != null) {
                                                    xnVar2.m(u1Var.getX(), backgroundTranslationY, wjVar.getMeasuredWidth(), backgroundSizeY);
                                                } else {
                                                    org.telegram.ui.ActionBar.i6.q(u1Var.getX(), backgroundTranslationY, wjVar.getMeasuredWidth(), backgroundSizeY);
                                                }
                                            } else {
                                                X0 = org.telegram.ui.ActionBar.i6.a2;
                                                X0.setColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Hc, e6Var));
                                            }
                                            Paint paint = X0;
                                            canvas2.save();
                                            canvas2.translate(0.0f, u1Var.getTranslationY());
                                            int alpha = paint.getAlpha();
                                            paint.setAlpha((int) (u1Var.getAlpha() * u1Var.getHighlightAlpha() * alpha));
                                            canvas2.drawRect(0.0f, u1Var.getTop(), wjVar.getMeasuredWidth(), u1Var.getBottom(), paint);
                                            paint.setAlpha(alpha);
                                            canvas2.restore();
                                        }
                                    } else {
                                        int y3 = (int) u1Var.getY();
                                        canvas2.save();
                                        if (currentPosition == null) {
                                            i17 = u1Var.getMeasuredHeight();
                                            i16 = i19;
                                        } else {
                                            int measuredHeight5 = u1Var.getMeasuredHeight() + y3;
                                            long j3 = 0;
                                            float f14 = 0.0f;
                                            int i20 = 0;
                                            while (i20 < childCount) {
                                                View childAt2 = wjVar.getChildAt(i20);
                                                int i21 = i19;
                                                if (childAt2 instanceof org.telegram.ui.Cells.u1) {
                                                    org.telegram.ui.Cells.u1 u1Var2 = (org.telegram.ui.Cells.u1) childAt2;
                                                    if (u1Var2.getCurrentMessagesGroup() == currentMessagesGroup2) {
                                                        org.telegram.ui.Components.rb0 backgroundDrawable2 = u1Var2.getBackgroundDrawable();
                                                        i18 = i20;
                                                        y3 = Math.min(y3, (int) u1Var2.getY());
                                                        measuredHeight5 = Math.max(measuredHeight5, u1Var2.getMeasuredHeight() + ((int) u1Var2.getY()));
                                                        long j10 = backgroundDrawable2.l;
                                                        if (j10 > j3) {
                                                            j3 = j10;
                                                            f7 = u1Var2.getX() + backgroundDrawable2.h;
                                                            f14 = u1Var2.getY() + backgroundDrawable2.i;
                                                        }
                                                        i20 = i18 + 1;
                                                        i19 = i21;
                                                    }
                                                }
                                                i18 = i20;
                                                i20 = i18 + 1;
                                                i19 = i21;
                                            }
                                            i16 = i19;
                                            backgroundDrawable.j = f7;
                                            backgroundDrawable.k = f14 - y3;
                                            i17 = measuredHeight5 - y3;
                                        }
                                        int i22 = i17 + y3;
                                        canvas2.clipRect(0, y3, wjVar.getMeasuredWidth(), i22);
                                        Paint X02 = wjVar.X0("paintChatMessageBackgroundSelected");
                                        xn xnVar3 = znVar.ea;
                                        if (xnVar3 == null || xnVar3.G || X02 == null) {
                                            backgroundDrawable.b = null;
                                            backgroundDrawable.a.setColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Hc, e6Var));
                                        } else {
                                            backgroundDrawable.b = X02;
                                            if (znVar.C9()) {
                                                measuredHeight2 = znVar.x0.getTop();
                                            } else {
                                                kVar2 = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
                                                measuredHeight2 = kVar2.getMeasuredHeight();
                                            }
                                            float backgroundTranslationY2 = measuredHeight2 - znVar.X0.getBackgroundTranslationY();
                                            int backgroundSizeY2 = znVar.X0.getBackgroundSizeY();
                                            xn xnVar4 = znVar.ea;
                                            if (xnVar4 != null) {
                                                xnVar4.m(u1Var.getX(), backgroundTranslationY2, wjVar.getMeasuredWidth(), backgroundSizeY2);
                                            } else {
                                                org.telegram.ui.ActionBar.i6.q(u1Var.getX(), backgroundTranslationY2, wjVar.getMeasuredWidth(), backgroundSizeY2);
                                            }
                                        }
                                        backgroundDrawable.setBounds(0, y3, wjVar.getMeasuredWidth(), i22);
                                        backgroundDrawable.draw(canvas2);
                                        canvas2.restore();
                                    }
                                } else {
                                    i16 = i19;
                                    z11 = true;
                                }
                                groupedMessages = currentMessagesGroup2;
                            } else {
                                i16 = i19;
                                z11 = true;
                            }
                            if (znVar.J8 != u1Var && currentMessagesGroup2 == null && u1Var.C1()) {
                                canvas2.save();
                                canvas2.translate(u1Var.getX(), u1Var.getY() + u1Var.getPaddingTop());
                                if (u1Var.getScaleX() != 1.0f) {
                                    canvas2.scale(u1Var.getScaleX(), u1Var.getScaleY(), u1Var.getPivotX(), u1Var.getHeight() >> 1);
                                }
                                u1Var.D1(canvas2, z11, false);
                                canvas2.restore();
                            }
                        } else {
                            i16 = i19;
                            if (childAt instanceof org.telegram.ui.Cells.w0) {
                                org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) childAt;
                                if (w0Var.K()) {
                                    canvas2.save();
                                    canvas2.translate(w0Var.getX(), w0Var.getY() + w0Var.getPaddingTop());
                                    canvas2.scale(w0Var.getScaleX(), w0Var.getScaleY(), w0Var.getMeasuredWidth() / 2.0f, w0Var.getMeasuredHeight() / 2.0f);
                                    canvas2.translate(znVar.W8() / 2.0f, 0.0f);
                                    w0Var.B(canvas2, true);
                                    w0Var.D(canvas2, true);
                                    canvas2.restore();
                                }
                            }
                        }
                        i19 = i16 + 1;
                    }
                }
            }
            i16 = i19;
            i19 = i16 + 1;
        }
        View view = znVar.J8;
        MessageObject.GroupedMessages currentMessagesGroup3 = view instanceof org.telegram.ui.Cells.u1 ? ((org.telegram.ui.Cells.u1) view).getCurrentMessagesGroup() : null;
        int i23 = 0;
        while (i23 < 3) {
            ArrayList arrayList = wjVar.c3;
            arrayList.clear();
            if (i23 != i11 || znVar.x0.V1) {
                int i24 = 0;
                while (i24 < childCount) {
                    View childAt3 = znVar.x0.getChildAt(i24);
                    if (childAt3 instanceof org.telegram.ui.Cells.u1) {
                        org.telegram.ui.Cells.u1 u1Var3 = (org.telegram.ui.Cells.u1) childAt3;
                        if (childAt3.getY() <= znVar.x0.getHeight() && childAt3.getY() + childAt3.getHeight() >= f7 && u1Var3.getVisibility() != i10 && (currentMessagesGroup = u1Var3.getCurrentMessagesGroup()) != null) {
                            int i25 = i23 == 0 ? 1 : 1;
                            if ((i23 != i25 || currentMessagesGroup.transitionParams.drawBackgroundForDeletedItems) && ((i23 != 0 || !u1Var3.getMessageObject().deleted) && ((i23 != 1 || u1Var3.getMessageObject().deleted) && ((i23 != i11 || u1Var3.oc) && (i23 == i11 || !u1Var3.oc))))) {
                                if (!arrayList.contains(currentMessagesGroup)) {
                                    MessageObject.GroupedMessages.TransitionParams transitionParams = currentMessagesGroup.transitionParams;
                                    transitionParams.left = 0;
                                    transitionParams.top = 0;
                                    transitionParams.right = 0;
                                    transitionParams.bottom = 0;
                                    transitionParams.pinnedBotton = false;
                                    transitionParams.pinnedTop = false;
                                    transitionParams.cell = u1Var3;
                                    arrayList.add(currentMessagesGroup);
                                }
                                i15 = i10;
                                currentMessagesGroup.transitionParams.pinnedTop = u1Var3.n3();
                                currentMessagesGroup.transitionParams.pinnedBotton = u1Var3.m3();
                                int backgroundDrawableLeft = u1Var3.getBackgroundDrawableLeft() + u1Var3.getLeft();
                                int backgroundDrawableRight = u1Var3.getBackgroundDrawableRight() + u1Var3.getLeft();
                                int backgroundDrawableTop = u1Var3.getBackgroundDrawableTop() + u1Var3.getPaddingTop() + u1Var3.getTop();
                                int backgroundDrawableBottom = u1Var3.getBackgroundDrawableBottom() + u1Var3.getPaddingTop() + u1Var3.getTop();
                                if ((u1Var3.getCurrentPosition().flags & 4) == 0) {
                                    backgroundDrawableTop -= AndroidUtilities.dp(10.0f);
                                }
                                int i26 = backgroundDrawableTop;
                                if ((u1Var3.getCurrentPosition().flags & 8) == 0) {
                                    backgroundDrawableBottom = AndroidUtilities.dp(10.0f) + backgroundDrawableBottom;
                                }
                                int i27 = backgroundDrawableBottom;
                                if (u1Var3.oc) {
                                    currentMessagesGroup.transitionParams.cell = u1Var3;
                                }
                                MessageObject.GroupedMessages.TransitionParams transitionParams2 = currentMessagesGroup.transitionParams;
                                int i28 = transitionParams2.top;
                                if (i28 == 0 || i26 < i28) {
                                    transitionParams2.top = i26;
                                }
                                int i29 = transitionParams2.bottom;
                                if (i29 == 0 || i27 > i29) {
                                    transitionParams2.bottom = i27;
                                }
                                int i30 = transitionParams2.left;
                                if (i30 == 0 || backgroundDrawableLeft < i30) {
                                    transitionParams2.left = backgroundDrawableLeft;
                                }
                                int i31 = transitionParams2.right;
                                if (i31 == 0 || backgroundDrawableRight > i31) {
                                    transitionParams2.right = backgroundDrawableRight;
                                }
                                i24++;
                                i10 = i15;
                                i11 = 2;
                                f7 = 0.0f;
                            }
                        }
                    }
                    i15 = i10;
                    i24++;
                    i10 = i15;
                    i11 = 2;
                    f7 = 0.0f;
                }
                i12 = i10;
                int i32 = 0;
                while (i32 < arrayList.size()) {
                    MessageObject.GroupedMessages groupedMessages2 = (MessageObject.GroupedMessages) arrayList.get(i32);
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
                    if (f18 > AndroidUtilities.dp(20.0f) + znVar.x0.getMeasuredHeight()) {
                        f18 = AndroidUtilities.dp(20.0f) + znVar.x0.getMeasuredHeight();
                    }
                    float f20 = f18;
                    boolean z13 = (groupedMessages2.transitionParams.cell.getScaleX() == f11 && groupedMessages2.transitionParams.cell.getScaleY() == f11) ? false : true;
                    if (z13) {
                        canvas2.save();
                        i14 = i23;
                        canvas2.scale(groupedMessages2.transitionParams.cell.getScaleX(), groupedMessages2.transitionParams.cell.getScaleY(), com.google.android.gms.internal.vision.e2.z(f17, f15, f10, f15), com.google.android.gms.internal.vision.e2.z(f20, f19, f10, f19));
                    } else {
                        i14 = i23;
                    }
                    int size = groupedMessages2.messages.size();
                    int i33 = 0;
                    while (true) {
                        if (i33 >= size) {
                            f13 = f20;
                            z10 = true;
                            break;
                        }
                        MessageObject messageObject = groupedMessages2.messages.get(i33);
                        f13 = f20;
                        if (znVar.W5[messageObject.getDialogId() == znVar.T5 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) < 0) {
                            z10 = false;
                            break;
                        } else {
                            i33++;
                            f20 = f13;
                        }
                    }
                    MessageObject.GroupedMessages.TransitionParams transitionParams4 = groupedMessages2.transitionParams;
                    float f21 = f13;
                    zn znVar2 = znVar;
                    transitionParams4.cell.B1(canvas, (int) f15, (int) f19, (int) f17, (int) f21, transitionParams4.pinnedTop, transitionParams4.pinnedBotton, z10, 0);
                    if (groupedMessages2 != currentMessagesGroup3) {
                        groupedMessages2.transitionParams.cell = null;
                    }
                    groupedMessages2.transitionParams.drawCaptionLayout = groupedMessages2.hasCaption;
                    if (z13) {
                        canvas.restore();
                        for (int i34 = 0; i34 < childCount; i34++) {
                            View childAt4 = znVar2.x0.getChildAt(i34);
                            if (childAt4 instanceof org.telegram.ui.Cells.u1) {
                                org.telegram.ui.Cells.u1 u1Var4 = (org.telegram.ui.Cells.u1) childAt4;
                                if (u1Var4.getCurrentMessagesGroup() == groupedMessages2) {
                                    int left = u1Var4.getLeft();
                                    int top = u1Var4.getTop();
                                    childAt4.setPivotX(((f17 - f15) / 2.0f) + (f15 - left));
                                    childAt4.setPivotY(((f21 - f19) / 2.0f) + (f19 - top));
                                }
                            }
                        }
                    }
                    i32++;
                    canvas2 = canvas;
                    znVar = znVar2;
                    i23 = i14;
                    f10 = 2.0f;
                }
                f12 = 0.0f;
                i13 = 2;
            } else {
                i12 = i10;
                i13 = i11;
                f12 = f7;
            }
            canvas2 = canvas;
            znVar = znVar;
            i10 = i12;
            f7 = f12;
            i11 = i13;
            f10 = f10;
            i23++;
            wjVar = this;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void y1(Canvas canvas, RectF rectF) {
        float f7;
        ArrayList arrayList;
        ArrayList arrayList2 = this.Y2;
        int size = arrayList2.size();
        zn znVar = this.x3;
        boolean z10 = 1;
        boolean z11 = false;
        if (size > 0) {
            for (int i10 = 0; i10 < size; i10++) {
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) arrayList2.get(i10);
                if (!zn.e2(znVar, u1Var, rectF)) {
                    canvas.save();
                    canvas.translate(u1Var.E2(false) + u1Var.getLeft(), u1Var.getY() + u1Var.getPaddingTop());
                    u1Var.m2(u1Var.a() ? u1Var.getAlpha() : 1.0f, canvas, true);
                    canvas.restore();
                }
            }
            arrayList2.clear();
        }
        ArrayList arrayList3 = this.Z2;
        int size2 = arrayList3.size();
        if (size2 > 0) {
            for (int i11 = 0; i11 < size2; i11++) {
                org.telegram.ui.Cells.u1 u1Var2 = (org.telegram.ui.Cells.u1) arrayList3.get(i11);
                if (!zn.e2(znVar, u1Var2, rectF)) {
                    float E2 = u1Var2.E2(false) + u1Var2.getLeft();
                    float y3 = u1Var2.getY() + u1Var2.getPaddingTop();
                    float alpha = u1Var2.a() ? u1Var2.getAlpha() : 1.0f;
                    canvas.save();
                    canvas.translate(E2, y3);
                    u1Var2.setInvalidatesParent(true);
                    u1Var2.W1(canvas, alpha);
                    u1Var2.setInvalidatesParent(false);
                    canvas.restore();
                }
            }
            arrayList3.clear();
        }
        ArrayList arrayList4 = this.a3;
        int size3 = arrayList4.size();
        if (size3 > 0) {
            int i12 = 0;
            while (i12 < size3) {
                org.telegram.ui.Cells.u1 u1Var3 = (org.telegram.ui.Cells.u1) arrayList4.get(i12);
                if (zn.e2(znVar, u1Var3, rectF)) {
                    arrayList = arrayList4;
                } else {
                    boolean z12 = (u1Var3.getCurrentPosition() == null || (u1Var3.getCurrentPosition().flags & z10) != 0) ? z11 : z10;
                    float alpha2 = u1Var3.a() ? u1Var3.getAlpha() : 1.0f;
                    float E22 = u1Var3.E2(z11) + u1Var3.getLeft();
                    float y10 = u1Var3.getY() + u1Var3.getPaddingTop();
                    canvas.save();
                    MessageObject.GroupedMessages currentMessagesGroup = u1Var3.getCurrentMessagesGroup();
                    if (currentMessagesGroup == null) {
                        arrayList = arrayList4;
                    } else if (currentMessagesGroup.transitionParams.backgroundChangeBounds) {
                        float E23 = u1Var3.E2(z10);
                        MessageObject.GroupedMessages.TransitionParams transitionParams = currentMessagesGroup.transitionParams;
                        float f10 = transitionParams.left + E23 + transitionParams.offsetLeft;
                        arrayList = arrayList4;
                        float f11 = transitionParams.top + transitionParams.offsetTop;
                        float f12 = transitionParams.right + E23 + transitionParams.offsetRight;
                        float f13 = transitionParams.bottom + transitionParams.offsetBottom;
                        if (!transitionParams.backgroundChangeBounds) {
                            f11 += u1Var3.getTranslationY();
                            f13 += u1Var3.getTranslationY();
                        }
                        canvas.clipRect(f10 + AndroidUtilities.dp(8.0f), f11 + AndroidUtilities.dp(8.0f), f12 - AndroidUtilities.dp(8.0f), f13 - AndroidUtilities.dp(8.0f));
                    } else {
                        arrayList = arrayList4;
                    }
                    if (u1Var3.getTransitionParams().v0) {
                        canvas.translate(E22, y10);
                        u1Var3.setInvalidatesParent(true);
                        u1Var3.I1(alpha2, canvas, z12);
                        u1Var3.setInvalidatesParent(false);
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
        ArrayList arrayList5 = this.b3;
        int size4 = arrayList5.size();
        if (size4 > 0) {
            for (int i13 = 0; i13 < size4; i13++) {
                org.telegram.ui.Cells.u1 u1Var4 = (org.telegram.ui.Cells.u1) arrayList5.get(i13);
                if (!zn.e2(znVar, u1Var4, rectF)) {
                    boolean z13 = u1Var4.getCurrentPosition() != null && (u1Var4.getCurrentPosition().flags & 1) == 0;
                    float alpha3 = u1Var4.a() ? u1Var4.getAlpha() : 1.0f;
                    float E24 = u1Var4.E2(false) + u1Var4.getLeft();
                    float y11 = u1Var4.getY() + u1Var4.getPaddingTop();
                    canvas.save();
                    MessageObject.GroupedMessages currentMessagesGroup2 = u1Var4.getCurrentMessagesGroup();
                    if (currentMessagesGroup2 != null && currentMessagesGroup2.transitionParams.backgroundChangeBounds) {
                        float E25 = u1Var4.E2(true);
                        MessageObject.GroupedMessages.TransitionParams transitionParams2 = currentMessagesGroup2.transitionParams;
                        float f14 = transitionParams2.left + E25 + transitionParams2.offsetLeft;
                        float f15 = transitionParams2.top + transitionParams2.offsetTop;
                        float f16 = transitionParams2.right + E25 + transitionParams2.offsetRight;
                        float f17 = transitionParams2.bottom + transitionParams2.offsetBottom;
                        if (!transitionParams2.backgroundChangeBounds) {
                            f15 += u1Var4.getTranslationY();
                            f17 += u1Var4.getTranslationY();
                        }
                        canvas.clipRect(f14 + AndroidUtilities.dp(f7), f15 + AndroidUtilities.dp(f7), f16 - AndroidUtilities.dp(f7), f17 - AndroidUtilities.dp(f7));
                    }
                    if (!z13 && u1Var4.getTransitionParams().v0) {
                        canvas.translate(E24, y11);
                        u1Var4.setInvalidatesParent(true);
                        u1Var4.d2(canvas, alpha3, null);
                        u1Var4.N1(canvas, alpha3);
                        u1Var4.setInvalidatesParent(false);
                    }
                    canvas.restore();
                }
            }
            arrayList5.clear();
        }
    }

    public final void z1(MotionEvent motionEvent) {
        TLRPC.Chat chat;
        MessageObject.GroupedMessages D8;
        MessageObject messageObject;
        boolean z10;
        ArrayList arrayList;
        TLRPC.Chat chat2;
        zn znVar = this.x3;
        if (motionEvent != null) {
            znVar.D4 = true;
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && !znVar.f9 && !znVar.e9 && znVar.d9 == null) {
            z10 = ((org.telegram.ui.ActionBar.n2) znVar).inPreviewMode;
            if (!z10) {
                View pressedChildView = getPressedChildView();
                if (!(pressedChildView instanceof org.telegram.ui.Cells.u1)) {
                    if (!(pressedChildView instanceof org.telegram.ui.Cells.w0)) {
                        return;
                    }
                    org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) pressedChildView;
                    float x10 = motionEvent.getX() - pressedChildView.getX();
                    float y3 = motionEvent.getY() - pressedChildView.getY();
                    if (!w0Var.M()) {
                        return;
                    }
                    org.telegram.ui.Wallet.d3 d3Var = w0Var.I0;
                    float f7 = (x10 - w0Var.K0) - (w0Var.j0 / 2.0f);
                    float paddingTop = (y3 - w0Var.L0) - w0Var.getPaddingTop();
                    org.telegram.ui.Wallet.c3 c3Var = d3Var.m;
                    if (c3Var != null && c3Var.h && d3Var.w.contains((int) f7, (int) paddingTop)) {
                        return;
                    }
                }
                if (znVar.d9 != null) {
                    zn.W1(znVar, 0.0f);
                }
                znVar.d9 = pressedChildView;
                MessageObject T1 = zn.T1(znVar);
                boolean I6 = znVar.I6(T1);
                int i10 = znVar.R3;
                if ((i10 != 0 && i10 != 5 && i10 != 8 && (i10 != 3 || znVar.d4 != znVar.getUserConfig().getClientUserId())) || (((arrayList = znVar.a4) != null && arrayList.contains(T1)) || ((znVar.J8(T1) == 1 && (T1.getDialogId() == znVar.L6 || T1.needDrawBluredPreview())) || ((znVar.h == null && T1.getId() < 0) || (((chat2 = znVar.e) != null && ChatObject.isForum(chat2) && !I6) || znVar.g9() || (T1.isEphemeral() && T1.isOut())))))) {
                    zn.W1(znVar, 0.0f);
                    znVar.d9 = null;
                    return;
                } else {
                    this.f3 = motionEvent.getPointerId(0);
                    znVar.e9 = true;
                    this.d3 = (int) motionEvent.getX();
                    this.e3 = (int) motionEvent.getY();
                    return;
                }
            }
        }
        if (znVar.d9 != null && motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f3) {
            int max = Math.max(AndroidUtilities.dp(-80.0f), Math.min(0, (int) (motionEvent.getX() - this.d3)));
            int abs = Math.abs(((int) motionEvent.getY()) - this.e3);
            if (getScrollState() == 0 && znVar.e9 && !znVar.f9 && max <= (-AndroidUtilities.getPixelsInCM(0.4f, true)) && Math.abs(max) / 3 > abs) {
                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                znVar.d9.onTouchEvent(obtain);
                super.onInterceptTouchEvent(obtain);
                obtain.recycle();
                znVar.z0.R = false;
                znVar.e9 = false;
                znVar.f9 = true;
                this.d3 = (int) motionEvent.getX();
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    return;
                }
                return;
            }
            if (znVar.f9) {
                if (Math.abs(max) < AndroidUtilities.dp(50.0f)) {
                    this.j3 = false;
                } else if (!this.j3) {
                    try {
                        performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    this.j3 = true;
                }
                float f10 = max;
                zn.W1(znVar, f10);
                MessageObject T12 = zn.T1(znVar);
                if (T12 != null && (T12.isRoundVideo() || T12.isVideo())) {
                    znVar.Qc(false, false);
                }
                View view = znVar.d9;
                if (view instanceof org.telegram.ui.Cells.u1) {
                    A1((org.telegram.ui.Cells.u1) view, f10);
                }
                invalidate();
                return;
            }
            return;
        }
        if (znVar.d9 != null) {
            if (motionEvent != null) {
                if (motionEvent.getPointerId(0) != this.f3) {
                    return;
                }
                if (motionEvent.getAction() != 3 && motionEvent.getAction() != 1 && motionEvent.getAction() != 6) {
                    return;
                }
            }
            if (motionEvent != null && motionEvent.getAction() != 3) {
                View view2 = znVar.d9;
                if (Math.abs(view2 instanceof org.telegram.ui.Cells.u1 ? ((org.telegram.ui.Cells.u1) view2).E2(false) : view2 instanceof org.telegram.ui.Cells.w0 ? ((org.telegram.ui.Cells.w0) view2).getWalletSlidingOffset() : 0.0f) >= AndroidUtilities.dp(50.0f)) {
                    MessageObject T13 = zn.T1(znVar);
                    boolean I62 = znVar.I6(T13);
                    sk skVar = znVar.O0;
                    if ((skVar == null || skVar.getVisibility() != 0 || ((znVar.I0 && I62) || T13.wasJustSent)) && ((chat = znVar.e) == null || ((!ChatObject.isNotInChat(chat) || znVar.K9()) && ((!ChatObject.isChannel(znVar.e) || ChatObject.canPost(znVar.e) || znVar.e.megagroup) && ChatObject.canSendMessages(znVar.e))))) {
                        znVar.Fb(zn.T1(znVar));
                    } else {
                        if (T13.getGroupId() != 0 && (D8 = znVar.D8(T13.getGroupId())) != null && (messageObject = D8.captionMessage) != null) {
                            T13 = messageObject;
                        }
                        znVar.n5 = T13;
                        Bundle d = org.telegram.messenger.bi.d(3, "onlySelect", "dialogsType", true);
                        d.putBoolean("quote", true);
                        d.putBoolean("reply_to", true);
                        long peerDialogId = DialogObject.getPeerDialogId(T13.getFromPeer());
                        if (peerDialogId != 0 && peerDialogId != znVar.a() && peerDialogId != znVar.getUserConfig().getClientUserId() && peerDialogId > 0) {
                            d.putLong("reply_to_author", peerDialogId);
                        }
                        d.putInt("messagesCount", 1);
                        d.putBoolean("canSelectTopics", true);
                        ty tyVar = new ty(d);
                        tyVar.C2 = znVar;
                        znVar.presentFragment(tyVar);
                    }
                }
            }
            View view3 = znVar.d9;
            float slidingOffsetX = view3 instanceof org.telegram.ui.Cells.u1 ? ((org.telegram.ui.Cells.u1) view3).getSlidingOffsetX() : view3 instanceof org.telegram.ui.Cells.w0 ? ((org.telegram.ui.Cells.w0) view3).getWalletSlidingOffset() : 0.0f;
            this.i3 = slidingOffsetX;
            if (slidingOffsetX == 0.0f) {
                znVar.d9 = null;
            }
            this.g3 = System.currentTimeMillis();
            this.h3 = 0.0f;
            invalidate();
            znVar.e9 = false;
            znVar.f9 = false;
            znVar.z0.R = true;
        }
    }
}
