package zg;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.gms.internal.vision.e2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.o4;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Cells.w0;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.o6;
import org.telegram.ui.Components.q5;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.wq;
import org.telegram.ui.db1;
import org.telegram.ui.pm;
import yh.z5;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class p0 {
    public static int Z;
    public MessageObject A;
    public d6 B;
    public Integer C;
    public float D;
    public boolean E;
    public int F;
    public boolean G;
    public int I;
    public int J;
    public boolean K;
    public boolean L;
    public boolean M;
    public float Q;
    public float R;
    public m0 S;
    public boolean T;
    public z5 U;
    public float a;
    public boolean b;
    public int c;
    public int d;
    public float e;
    public float f;
    public float g;
    public float h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public int m;
    public int o;
    public int p;
    public int q;
    public int r;
    public boolean s;
    public final float t;
    public int u;
    public final org.telegram.ui.Cells.a0 z;
    public static final Paint V = new Paint(1);
    public static final Paint W = new Paint(1);
    public static final Paint X = new Paint(1);
    public static final TextPaint Y = new TextPaint(1);
    public static final l0 a0 = new l0();
    public static int b0 = 1;
    public static final db1 c0 = new db1(25);
    public final ArrayList v = new ArrayList();
    public final ArrayList w = new ArrayList();
    public final HashMap x = new HashMap();
    public final HashMap y = new HashMap();
    public final HashMap H = new HashMap();
    public final ArrayList N = new ArrayList();
    public final RectF O = new RectF();
    public final Rect P = new Rect();
    public final int n = UserConfig.selectedAccount;

    public p0(org.telegram.ui.Cells.a0 a0Var) {
        this.z = a0Var;
        o(this.B);
        this.t = ViewConfiguration.get(ApplicationLoader.applicationContext).getScaledTouchSlop();
    }

    public static boolean g(TLRPC.Reaction reaction, TLRPC.Reaction reaction2) {
        return ((reaction instanceof TLRPC.TL_reactionEmoji) && (reaction2 instanceof TLRPC.TL_reactionEmoji)) ? TextUtils.equals(((TLRPC.TL_reactionEmoji) reaction).emoticon, ((TLRPC.TL_reactionEmoji) reaction2).emoticon) : (reaction instanceof TLRPC.TL_reactionCustomEmoji) && (reaction2 instanceof TLRPC.TL_reactionCustomEmoji) && ((TLRPC.TL_reactionCustomEmoji) reaction).document_id == ((TLRPC.TL_reactionCustomEmoji) reaction2).document_id;
    }

    public static void h(RectF rectF, RectF rectF2, Path path) {
        path.rewind();
        float f7 = rectF.left;
        rectF2.set(f7, rectF.top, AndroidUtilities.dp(12.0f) + f7, rectF.top + AndroidUtilities.dp(12.0f));
        path.arcTo(rectF2, -90.0f, -90.0f, false);
        rectF2.set(rectF.left, rectF.bottom - AndroidUtilities.dp(12.0f), rectF.left + AndroidUtilities.dp(12.0f), rectF.bottom);
        path.arcTo(rectF2, -180.0f, -90.0f, false);
        float f10 = rectF.height() > ((float) AndroidUtilities.dp(26.0f)) ? 1.4f : 0.0f;
        float dpf2 = rectF.right - AndroidUtilities.dpf2(9.09f);
        float dpf22 = dpf2 - AndroidUtilities.dpf2(0.056f);
        float dpf23 = AndroidUtilities.dpf2(1.22f) + dpf2;
        float dpf24 = AndroidUtilities.dpf2(3.07f) + dpf2;
        float dpf25 = AndroidUtilities.dpf2(2.406f) + dpf2;
        float dpf26 = AndroidUtilities.dpf2(8.27f + f10) + dpf2;
        float dpf27 = AndroidUtilities.dpf2(8.923f + f10) + dpf2;
        float dpf28 = AndroidUtilities.dpf2(1.753f) + rectF.top;
        float dpf29 = rectF.bottom - AndroidUtilities.dpf2(1.753f);
        float dpf210 = AndroidUtilities.dpf2(0.663f) + rectF.top;
        float dpf211 = rectF.bottom - AndroidUtilities.dpf2(0.663f);
        float f11 = 10.263f + f10;
        float dpf212 = AndroidUtilities.dpf2(f11) + rectF.top;
        float dpf213 = rectF.bottom - AndroidUtilities.dpf2(f11);
        float f12 = f10 + 11.333f;
        float dpf214 = AndroidUtilities.dpf2(f12) + rectF.top;
        float dpf215 = rectF.bottom - AndroidUtilities.dpf2(f12);
        path.lineTo(dpf22, rectF.bottom);
        path.cubicTo(dpf23, rectF.bottom, dpf25, dpf211, dpf24, dpf29);
        path.lineTo(dpf26, dpf213);
        path.cubicTo(dpf27, dpf215, dpf27, dpf214, dpf26, dpf212);
        path.lineTo(dpf24, dpf28);
        float f13 = rectF.top;
        path.cubicTo(dpf25, dpf210, dpf23, f13, dpf22, f13);
        path.close();
    }

    public static long k(TLObject tLObject) {
        if (tLObject instanceof TLRPC.User) {
            return ((TLRPC.User) tLObject).id;
        }
        if (tLObject instanceof TLRPC.Chat) {
            return ((TLRPC.Chat) tLObject).id;
        }
        return 0L;
    }

    public static void o(d6 d6Var) {
        V.setColor(h6.v0(h6.ie, d6Var));
        int v02 = h6.v0(h6.Sh, d6Var);
        TextPaint textPaint = Y;
        textPaint.setColor(v02);
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        X.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public final boolean a() {
        ArrayList arrayList;
        j9 j9Var;
        int i10;
        int i11;
        if (this.A == null) {
            return false;
        }
        HashMap hashMap = this.y;
        hashMap.clear();
        int i12 = 0;
        while (true) {
            arrayList = this.w;
            if (i12 >= arrayList.size()) {
                break;
            }
            ((m0) arrayList.get(i12)).b();
            i12++;
        }
        arrayList.clear();
        hashMap.putAll(this.x);
        int i13 = 0;
        boolean z10 = false;
        while (true) {
            ArrayList arrayList2 = this.v;
            if (i13 >= arrayList2.size()) {
                break;
            }
            m0 m0Var = (m0) arrayList2.get(i13);
            String str = m0Var.o;
            wq wqVar = m0Var.F;
            m0 m0Var2 = (m0) hashMap.get(str);
            if (m0Var2 != null && m0Var.b != m0Var2.b) {
                m0Var2 = null;
            }
            if (m0Var2 != null) {
                hashMap.remove(m0Var.o);
                int i14 = m0Var.x;
                int i15 = m0Var2.x;
                if (i14 == i15 && m0Var.y == m0Var2.y && m0Var.A == m0Var2.A && m0Var.w == m0Var2.w && m0Var.p == m0Var2.p && m0Var.T == null && m0Var2.T == null) {
                    m0Var.c = 0;
                    i13++;
                } else {
                    m0Var.d = i15;
                    m0Var.e = m0Var2.y;
                    m0Var.f = m0Var2.A;
                    m0Var.i = m0Var2.N;
                    m0Var.g = m0Var2.O;
                    m0Var.h = m0Var2.P;
                    m0Var.c = 3;
                    int i16 = m0Var.w;
                    int i17 = m0Var2.w;
                    if (i16 != i17 && wqVar != null) {
                        wqVar.c(i17, false);
                        wqVar.c(m0Var.w, true);
                    }
                    j9 j9Var2 = m0Var.T;
                    if (j9Var2 != null || m0Var2.T != null) {
                        if (j9Var2 == null) {
                            m0Var.p(new ArrayList());
                        }
                        if (m0Var2.T == null) {
                            m0Var2.p(new ArrayList());
                        }
                        ArrayList arrayList3 = m0Var2.U;
                        ArrayList arrayList4 = m0Var.U;
                        if (arrayList3 != null && arrayList4 != null && arrayList3.size() == arrayList4.size()) {
                            while (i11 < arrayList3.size()) {
                                TLObject tLObject = (TLObject) arrayList3.get(i11);
                                TLObject tLObject2 = (TLObject) arrayList4.get(i11);
                                i11 = (tLObject == null || tLObject2 == null || k(tLObject) != k(tLObject2)) ? 0 : i11 + 1;
                            }
                        }
                        j9 j9Var3 = m0Var.T;
                        if (j9Var3 != null && (j9Var = m0Var2.T) != null) {
                            ValueAnimator valueAnimator = j9Var.f;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                                if (j9Var3.w) {
                                    j9Var3.w = false;
                                    j9Var3.n();
                                }
                            }
                            TLObject[] tLObjectArr = new TLObject[3];
                            int i18 = 0;
                            while (true) {
                                i10 = this.n;
                                if (i18 >= 3) {
                                    break;
                                }
                                tLObjectArr[i18] = j9Var3.b[i18].h;
                                j9Var3.l(i18, j9Var.b[i18].h, i10);
                                i18++;
                            }
                            j9Var3.b(false, true);
                            for (int i19 = 0; i19 < 3; i19++) {
                                j9Var3.l(i19, tLObjectArr[i19], i10);
                            }
                            j9Var3.d = true;
                            j9Var3.b(true, false);
                        }
                    }
                }
            } else {
                m0Var.c = 1;
            }
            z10 = true;
            i13++;
        }
        if (!hashMap.isEmpty()) {
            arrayList.addAll(hashMap.values());
            for (int i20 = 0; i20 < arrayList.size(); i20++) {
                ((m0) arrayList.get(i20)).l = ((m0) arrayList.get(i20)).n;
                ((m0) arrayList.get(i20)).a();
            }
            z10 = true;
        }
        if (this.i) {
            float f7 = this.g;
            if (f7 != this.c || this.h != this.d) {
                this.j = true;
                this.e = f7;
                this.f = this.h;
                z10 = true;
            }
        }
        int i21 = this.F;
        if (i21 != this.q) {
            this.k = true;
            this.r = i21;
            z10 = true;
        }
        int i22 = this.I;
        if (i22 == this.p) {
            return z10;
        }
        this.l = true;
        this.J = i22;
        return true;
    }

    public final void b(o0 o0Var) {
        int i10 = 0;
        if (o0Var.g == 0) {
            HashMap hashMap = this.H;
            if (hashMap.get(o0Var) == null) {
                ImageReceiver imageReceiver = new ImageReceiver();
                imageReceiver.setParentView(this.z);
                int i11 = Z;
                Z = i11 + 1;
                imageReceiver.setUniqKeyPrefix(Integer.toString(i11));
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(this.n).getReactionsMap().get(o0Var.f);
                if (tL_availableReaction != null) {
                    imageReceiver.setImage(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_nolimit", null, "tgs", tL_availableReaction, 1);
                }
                imageReceiver.setAutoRepeat(0);
                imageReceiver.onAttachedToWindow();
                hashMap.put(o0Var, imageReceiver);
                return;
            }
        }
        if (!this.M || o0Var.g == 0) {
            return;
        }
        while (true) {
            ArrayList arrayList = this.v;
            if (i10 >= arrayList.size()) {
                return;
            }
            if (o0Var.f(((m0) arrayList.get(i10)).r)) {
                ((m0) arrayList.get(i10)).q();
                return;
            }
            i10++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean c(MotionEvent motionEvent) {
        MessageObject messageObject;
        TLRPC.Message message;
        int i10 = 0;
        if (this.s || this.b || (messageObject = this.A) == null || (message = messageObject.messageOwner) == null || message.reactions == null) {
            return false;
        }
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        org.telegram.ui.Cells.a0 a0Var = this.z;
        if (e2.u(a0Var)) {
            y3 -= a0Var.getPaddingTop();
            if (a0Var instanceof w0) {
                x10 -= ((w0) a0Var).j0 / 2.0f;
            }
        }
        float f7 = x10 - this.c;
        float f10 = y3 - this.d;
        if (motionEvent.getAction() == 0) {
            ArrayList arrayList = this.v;
            int size = arrayList.size();
            while (true) {
                if (i10 >= size) {
                    break;
                }
                if (f7 <= ((m0) arrayList.get(i10)).x || f7 >= ((m0) arrayList.get(i10)).x + ((m0) arrayList.get(i10)).A || f10 <= ((m0) arrayList.get(i10)).y || f10 >= ((m0) arrayList.get(i10)).y + ((m0) arrayList.get(i10)).B) {
                    i10++;
                } else {
                    this.Q = motionEvent.getX();
                    this.R = y3;
                    this.S = (m0) arrayList.get(i10);
                    z5 z5Var = this.U;
                    if (z5Var != null) {
                        AndroidUtilities.cancelRunOnUIThread(z5Var);
                        this.U = null;
                    }
                    this.S.Y.c(true);
                    z5 z5Var2 = new z5(7, this, this.S);
                    this.U = z5Var2;
                    AndroidUtilities.runOnUIThread(z5Var2, ViewConfiguration.getLongPressTimeout());
                    this.T = true;
                }
            }
        } else if (motionEvent.getAction() == 2) {
            boolean z10 = this.T;
            float f11 = this.t;
            if ((z10 && Math.abs(motionEvent.getX() - this.Q) > f11) || Math.abs(y3 - this.R) > f11) {
                this.T = false;
                m0 m0Var = this.S;
                if (m0Var != null) {
                    m0Var.Y.c(false);
                }
                this.S = null;
                z5 z5Var3 = this.U;
                if (z5Var3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(z5Var3);
                    this.U = null;
                }
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            z5 z5Var4 = this.U;
            if (z5Var4 != null) {
                AndroidUtilities.cancelRunOnUIThread(z5Var4);
                this.U = null;
            }
            if (this.T && this.S != null && motionEvent.getAction() == 1) {
                TLRPC.ReactionCount reactionCount = this.S.a;
                float x11 = motionEvent.getX();
                if (e2.u(a0Var)) {
                    ((o4) a0Var).f(reactionCount, false, x11, y3);
                }
            }
            this.T = false;
            m0 m0Var2 = this.S;
            if (m0Var2 != null) {
                m0Var2.Y.c(false);
            }
            this.S = null;
        }
        return this.T;
    }

    public final void d(Canvas canvas, float f7, Integer num) {
        float f10;
        Canvas canvas2 = canvas;
        boolean z10 = this.s;
        ArrayList arrayList = this.w;
        if (z10 && arrayList.isEmpty()) {
            return;
        }
        float f11 = this.c;
        float f12 = this.d;
        if (this.s) {
            f11 = this.g;
            f12 = this.h;
        } else if (this.j) {
            float f13 = 1.0f - f7;
            f11 = (f11 * f7) + (this.e * f13);
            f12 = (f12 * f7) + (this.f * f13);
        }
        float f14 = f11;
        float f15 = f12;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList2 = this.v;
            if (i11 >= arrayList2.size()) {
                break;
            }
            m0 m0Var = (m0) arrayList2.get(i11);
            if (this.C == null && num == null && this.D < 0.5f) {
                m0Var.c();
            }
            if (!Integer.valueOf(m0Var.r.hashCode()).equals(this.C) && (num == null || m0Var.r.hashCode() == num.intValue())) {
                canvas2.save();
                float f16 = m0Var.x;
                float f17 = m0Var.y;
                if (f7 != 1.0f && m0Var.c == 3) {
                    float f18 = 1.0f - f7;
                    f16 = (f16 * f7) + (m0Var.d * f18);
                    f17 = (f17 * f7) + (m0Var.e * f18);
                }
                if (f7 == 1.0f || m0Var.c != 1) {
                    f10 = 1.0f;
                } else {
                    float f19 = (f7 * 0.5f) + 0.5f;
                    canvas2.scale(f19, f19, (m0Var.A / 2.0f) + f14 + f16, (m0Var.B / 2.0f) + f15 + f17);
                    f10 = f7;
                }
                m0Var.d(canvas2, f16 + f14, f17 + f15, m0Var.c == 3 ? f7 : 1.0f, f10, num != null, this.E, this.D);
                canvas2.restore();
            }
            i11++;
        }
        while (i10 < arrayList.size()) {
            m0 m0Var2 = (m0) arrayList.get(i10);
            float f20 = 1.0f - f7;
            float f21 = (f20 * 0.5f) + 0.5f;
            canvas2.save();
            canvas2.scale(f21, f21, (m0Var2.A / 2.0f) + m0Var2.x + f14, (m0Var2.B / 2.0f) + m0Var2.y + f15);
            ((m0) arrayList.get(i10)).d(canvas2, m0Var2.x + f14, m0Var2.y + f15, 1.0f, f20, false, this.E, this.D);
            canvas.restore();
            i10++;
            canvas2 = canvas;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0080, code lost:
    
        if (r9.c != 1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0082, code lost:
    
        r5 = (r19 * 0.5f) + 0.5f;
        r18.scale(r5, r5, (r9.A / 2.0f) + (r2 + r10), (r9.B / 2.0f) + (r4 + r14));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(Canvas canvas, float f7) {
        boolean z10 = this.s;
        ArrayList arrayList = this.w;
        if (z10 && arrayList.isEmpty()) {
            return;
        }
        float f10 = this.c;
        float f11 = this.d;
        float f12 = 1.0f;
        if (this.s) {
            f10 = this.g;
            f11 = this.h;
        } else if (this.j) {
            float f13 = 1.0f - f7;
            f10 = (f10 * f7) + (this.e * f13);
            f11 = (f11 * f7) + (this.f * f13);
        }
        int i10 = 0;
        boolean z11 = false;
        while (true) {
            ArrayList arrayList2 = this.v;
            if (i10 >= arrayList2.size()) {
                break;
            }
            m0 m0Var = (m0) arrayList2.get(i10);
            if (m0Var.m) {
                canvas.save();
                float f14 = m0Var.x;
                float f15 = m0Var.y;
                if (f7 != f12 && m0Var.c == 3) {
                    float f16 = 1.0f - f7;
                    f14 = (f14 * f7) + (m0Var.d * f16);
                    f15 = (f15 * f7) + (m0Var.e * f16);
                }
                z11 = z11 || m0Var.g(canvas, f14 + f10, f15 + f11);
                canvas.restore();
            }
            i10++;
            f12 = 1.0f;
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            m0 m0Var2 = (m0) arrayList.get(i11);
            if (m0Var2.m) {
                float f17 = ((1.0f - f7) * 0.5f) + 0.5f;
                canvas.save();
                canvas.scale(f17, f17, (m0Var2.A / 2.0f) + m0Var2.x + f10, (m0Var2.B / 2.0f) + m0Var2.y + f11);
                boolean z12 = z11 || ((m0) arrayList.get(i11)).g(canvas, ((float) m0Var2.x) + f10, ((float) m0Var2.y) + f11);
                canvas.restore();
                z11 = z12;
            }
        }
    }

    public final void f(pm pmVar, Canvas canvas, int i10, Integer num) {
        if (this.s && this.w.isEmpty()) {
            return;
        }
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.v;
            if (i11 >= arrayList.size()) {
                return;
            }
            m0 m0Var = (m0) arrayList.get(i11);
            if ((num == null || m0Var.r.hashCode() == num.intValue()) && num != null) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(m0Var.t);
                float dp = AndroidUtilities.dp(140.0f);
                float dp2 = AndroidUtilities.dp(14.0f);
                float clamp = Utilities.clamp(rectF.left - AndroidUtilities.dp(12.0f), ((this.z instanceof u1 ? ((u1) r8).getParentWidth() : AndroidUtilities.displaySize.x) - dp) - AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
                float f7 = rectF.top - dp2;
                float f10 = i10;
                float f11 = f7 + f10;
                RectF rectF2 = this.O;
                rectF2.set(clamp, (f7 - dp) + f10, dp + clamp, f11);
                float interpolation = rr.h.getInterpolation(this.D);
                AndroidUtilities.lerp(rectF, rectF2, interpolation, rectF2);
                int i12 = m0Var.V;
                o0 o0Var = m0Var.s;
                View view = m0Var.W;
                if (m0Var.f0 == null && m0Var.g0 == null) {
                    if (view != null && (view.getParent() instanceof View)) {
                        view = (View) view.getParent();
                    }
                    if (m0Var.r != null && !o0Var.a) {
                        if (o0Var.f != null) {
                            TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i12).getReactionsMap().get(o0Var.f);
                            if (tL_availableReaction != null && tL_availableReaction.activate_animation != null) {
                                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(tL_availableReaction.static_icon, h6.a7, 1.0f);
                                ImageReceiver imageReceiver = new ImageReceiver(view);
                                m0Var.f0 = imageReceiver;
                                imageReceiver.setLayerNum(7);
                                m0Var.f0.onAttachedToWindow();
                                m0Var.f0.setRoundRadius(AndroidUtilities.dp(14.0f));
                                m0Var.f0.setAllowStartLottieAnimation(true);
                                m0Var.f0.setAllowStartAnimation(true);
                                m0Var.f0.setAutoRepeat(1);
                                m0Var.f0.setAllowDecodeSingleFrame(true);
                                m0Var.f0.setImage(ImageLocation.getForDocument(tL_availableReaction.activate_animation), "140_140", svgThumb, null, tL_availableReaction, 1);
                            }
                        } else if (o0Var.g != 0) {
                            q5 q5Var = new q5(24, i12, o0Var.g);
                            m0Var.g0 = q5Var;
                            q5Var.a(view);
                        }
                    }
                }
                this.P.set((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
                if (interpolation > 0.0f) {
                    ImageReceiver imageReceiver2 = m0Var.f0;
                    if (imageReceiver2 != null) {
                        imageReceiver2.setImageCoords(rectF2);
                        m0Var.f0.setAlpha(interpolation);
                        m0Var.f0.draw(canvas);
                    } else {
                        q5 q5Var2 = m0Var.g0;
                        if (q5Var2 != null) {
                            q5Var2.setBounds((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
                            m0Var.g0.setAlpha((int) (interpolation * 255.0f));
                            m0Var.g0.draw(canvas);
                        }
                    }
                    pmVar.invalidate();
                }
            }
            i11++;
        }
    }

    public final float i(float f7) {
        if (!this.l) {
            return this.p;
        }
        return (this.p * f7) + ((1.0f - f7) * this.J);
    }

    public final float j(float f7) {
        if (!this.k) {
            return this.q;
        }
        return (this.q * f7) + ((1.0f - f7) * this.r);
    }

    public final m0 l(String str) {
        boolean z10 = this.b;
        HashMap hashMap = this.x;
        if (z10) {
            m0 m0Var = (m0) hashMap.get(str + "_");
            if (m0Var != null) {
                return m0Var;
            }
        }
        return (m0) hashMap.get(str);
    }

    public final m0 m(o0 o0Var) {
        String l4;
        if (o0Var.a) {
            l4 = "stars";
        } else {
            String str = o0Var.f;
            l4 = str != null ? str : Long.toString(o0Var.g);
        }
        return l(l4);
    }

    public final boolean n() {
        if (this.L) {
            return !(this.s && this.w.isEmpty()) && LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS) && LiteMode.isEnabled(131072);
        }
        return false;
    }

    public final void p(int i10, int i11) {
        ArrayList arrayList;
        this.o = 0;
        this.q = 0;
        this.m = 0;
        this.p = 0;
        if (this.s) {
            return;
        }
        ArrayList arrayList2 = this.N;
        arrayList2.clear();
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            arrayList = this.v;
            if (i12 >= arrayList.size()) {
                break;
            }
            m0 m0Var = (m0) arrayList.get(i12);
            boolean z10 = m0Var.b;
            o6 o6Var = m0Var.G;
            wq wqVar = m0Var.F;
            if (z10) {
                m0Var.A = AndroidUtilities.dp(14.0f);
                m0Var.B = AndroidUtilities.dp(14.0f);
            } else if (m0Var.S) {
                m0Var.A = AndroidUtilities.dp(42.0f);
                m0Var.B = AndroidUtilities.dp(26.0f);
                if (m0Var.u) {
                    m0Var.A = (int) (o6Var.d + AndroidUtilities.dp(8.0f) + m0Var.A);
                } else if (wqVar != null && m0Var.w > 1) {
                    m0Var.A = org.telegram.messenger.f0.C(8.0f, (int) Math.ceil(wqVar.m), m0Var.A);
                }
            } else {
                m0Var.A = AndroidUtilities.dp(m0Var.D != null ? 6.0f : 4.0f) + AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(8.0f);
                if (m0Var.T != null && m0Var.U.size() > 0) {
                    m0Var.U.size();
                    m0Var.A = (int) ((AndroidUtilities.dp(20.0f) * (m0Var.U.size() > 1 ? m0Var.U.size() - 1 : 0) * 0.8f) + AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(2.0f) + AndroidUtilities.dp(1.0f) + m0Var.A);
                    m0Var.T.o = AndroidUtilities.dp(26.0f);
                } else if (m0Var.u) {
                    m0Var.A = (int) (o6Var.d + AndroidUtilities.dp(8.0f) + m0Var.A);
                } else if (((int) Math.ceil(wqVar.m)) > 0) {
                    m0Var.A = org.telegram.messenger.f0.C(8.0f, (int) Math.ceil(wqVar.m), m0Var.A);
                } else {
                    m0Var.A -= AndroidUtilities.dp(1.0f);
                }
                m0Var.B = AndroidUtilities.dp(26.0f);
            }
            if (m0Var.A + i13 > i10) {
                arrayList2.add(Integer.valueOf(i13));
                i15 = org.telegram.messenger.f0.C(4.0f, m0Var.B, i15);
                i16++;
                i13 = 0;
            }
            m0Var.x = i13;
            m0Var.y = i15;
            m0Var.z = i16;
            i13 = org.telegram.messenger.f0.C(4.0f, m0Var.A, i13);
            if (i13 > i14) {
                i14 = i13;
            }
            i12++;
        }
        arrayList2.add(Integer.valueOf(i13));
        if (i11 == 5 && !arrayList.isEmpty()) {
            int i17 = ((m0) arrayList.get(0)).y;
            int i18 = 0;
            for (int i19 = 0; i19 < arrayList.size(); i19++) {
                if (((m0) arrayList.get(i19)).y != i17) {
                    int i20 = i19 - 1;
                    int i21 = i10 - (((m0) arrayList.get(i20)).x + ((m0) arrayList.get(i20)).A);
                    while (i18 < i19) {
                        ((m0) arrayList.get(i18)).x += i21;
                        i18++;
                    }
                    i18 = i19;
                }
            }
            int size = arrayList.size() - 1;
            int i22 = i10 - (((m0) arrayList.get(size)).x + ((m0) arrayList.get(size)).A);
            while (i18 <= size) {
                ((m0) arrayList.get(i18)).x += i22;
                i18++;
            }
        } else if (i11 == 1 && !arrayList.isEmpty()) {
            for (int i23 = 0; i23 < arrayList.size(); i23++) {
                m0 m0Var2 = (m0) arrayList.get(i23);
                int i24 = m0Var2.z;
                m0Var2.x = (int) e2.A(i10, (i24 < 0 || i24 >= arrayList2.size()) ? 0.0f : ((Integer) arrayList2.get(m0Var2.z)).intValue(), 2.0f, m0Var2.x);
            }
        }
        this.u = i13;
        if (i11 == 5 || i11 == 1) {
            this.q = i10;
        } else {
            this.q = i14;
        }
        this.o = i15 + (arrayList.size() == 0 ? 0 : AndroidUtilities.dp(26.0f));
        this.a = 0.0f;
    }

    public final void q() {
        int i10 = 0;
        this.G = false;
        while (true) {
            ArrayList arrayList = this.v;
            if (i10 >= arrayList.size()) {
                break;
            }
            ((m0) arrayList.get(i10)).b();
            i10++;
        }
        HashMap hashMap = this.H;
        if (!hashMap.isEmpty()) {
            Iterator it = hashMap.values().iterator();
            while (it.hasNext()) {
                ((ImageReceiver) it.next()).onDetachedFromWindow();
            }
        }
        hashMap.clear();
    }

    public final void r() {
        HashMap hashMap = this.x;
        hashMap.clear();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.v;
            if (i10 >= arrayList.size()) {
                this.i = !this.s;
                this.g = this.c;
                this.h = this.d;
                this.F = this.q;
                this.I = this.p;
                return;
            }
            hashMap.put(((m0) arrayList.get(i10)).o, (m0) arrayList.get(i10));
            i10++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x028c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d4  */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s(MessageObject messageObject, boolean z10, boolean z11, d6 d6Var) {
        boolean z12;
        int i10;
        TLRPC.ReactionCount reactionCount;
        m0 m0Var;
        int i11;
        int i12;
        p0 p0Var = this;
        boolean z13 = z10;
        boolean z14 = z11;
        p0Var.B = d6Var;
        p0Var.b = z13;
        p0Var.M = z14;
        p0Var.A = messageObject;
        ArrayList arrayList = p0Var.v;
        ArrayList arrayList2 = new ArrayList(arrayList);
        ?? r92 = 0;
        p0Var.K = false;
        p0Var.L = false;
        arrayList.clear();
        if (messageObject != null) {
            long dialogId = messageObject.getDialogId();
            l0 l0Var = a0;
            l0Var.a = dialogId;
            TLRPC.TL_messageReactions tL_messageReactions = messageObject.messageOwner.reactions;
            if (tL_messageReactions != null && tL_messageReactions.results != null) {
                int i13 = 0;
                for (int i14 = 0; i14 < messageObject.messageOwner.reactions.results.size(); i14++) {
                    i13 += messageObject.messageOwner.reactions.results.get(i14).count;
                }
                int i15 = p0Var.n;
                TLRPC.ChatFull chatFull = MessagesController.getInstance(i15).getChatFull(-messageObject.getDialogId());
                if (!z13 && !messageObject.messageOwner.reactions.results.isEmpty() && chatFull != null && chatFull.paid_reactions_available) {
                    boolean z15 = false;
                    for (int i16 = 0; i16 < messageObject.messageOwner.reactions.results.size(); i16++) {
                        TLRPC.Reaction reaction = messageObject.messageOwner.reactions.results.get(i16).reaction;
                        if (reaction instanceof TLRPC.TL_reactionPaid) {
                            z15 = true;
                        }
                        if (reaction instanceof TLRPC.TL_reactionEmoji) {
                            String str = ((TLRPC.TL_reactionEmoji) reaction).emoticon;
                            TextUtils.equals("👍", str);
                            TextUtils.equals("👎", str);
                        }
                    }
                    if (!z15) {
                        z12 = true;
                        ArrayList arrayList3 = new ArrayList();
                        if (z12) {
                            arrayList3.add(new TLRPC.TL_reactionPaid());
                        }
                        i10 = -arrayList3.size();
                        while (i10 < messageObject.messageOwner.reactions.results.size()) {
                            if (i10 < 0) {
                                reactionCount = new TLRPC.TL_reactionCount();
                                reactionCount.reaction = (TLRPC.Reaction) arrayList3.get(arrayList3.size() + i10);
                                reactionCount.chosen = r92;
                                reactionCount.count = r92;
                            } else {
                                reactionCount = messageObject.messageOwner.reactions.results.get(i10);
                            }
                            TLRPC.ReactionCount reactionCount2 = reactionCount;
                            int i17 = 0;
                            while (true) {
                                if (i17 >= arrayList2.size()) {
                                    m0Var = null;
                                    break;
                                }
                                m0Var = (m0) arrayList2.get(i17);
                                if (m0Var.r.equals(reactionCount2.reaction)) {
                                    break;
                                } else {
                                    i17++;
                                }
                            }
                            n0 n0Var = new n0(p0Var, m0Var, reactionCount2, z13, z14);
                            n0Var.R = messageObject.hasValidGroupId();
                            arrayList.add(n0Var);
                            p0Var.L = p0Var.L || n0Var.m;
                            if (!z10 && !z11 && messageObject.messageOwner.reactions.recent_reactions != null) {
                                if (messageObject.getDialogId() > 0 && !UserObject.isReplyUser(messageObject.getDialogId())) {
                                    ArrayList arrayList4 = new ArrayList();
                                    TLRPC.User currentUser = UserConfig.getInstance(i15).getCurrentUser();
                                    TLRPC.User user = MessagesController.getInstance(i15).getUser(Long.valueOf(messageObject.getDialogId()));
                                    if (reactionCount2.count == 2) {
                                        if (currentUser != null) {
                                            arrayList4.add(currentUser);
                                        }
                                        if (user != null) {
                                            arrayList4.add(user);
                                        }
                                    } else if (reactionCount2.chosen) {
                                        if (currentUser != null) {
                                            arrayList4.add(currentUser);
                                        }
                                    } else if (user != null) {
                                        arrayList4.add(user);
                                    }
                                    n0Var.p(arrayList4);
                                    if (!arrayList4.isEmpty()) {
                                        n0Var.w = 0;
                                        n0Var.F.c(0, false);
                                    }
                                } else if (reactionCount2.count <= 3 && i13 <= 3) {
                                    ArrayList arrayList5 = null;
                                    int i18 = 0;
                                    while (i18 < messageObject.messageOwner.reactions.recent_reactions.size()) {
                                        TLRPC.MessagePeerReaction messagePeerReaction = messageObject.messageOwner.reactions.recent_reactions.get(i18);
                                        o0 d = o0.d(messagePeerReaction.reaction);
                                        o0 d10 = o0.d(reactionCount2.reaction);
                                        int i19 = i13;
                                        int i20 = i15;
                                        TLObject userOrChat = MessagesController.getInstance(i15).getUserOrChat(MessageObject.getPeerId(messagePeerReaction.peer_id));
                                        if (d.equals(d10) && userOrChat != null) {
                                            if (arrayList5 == null) {
                                                arrayList5 = new ArrayList();
                                            }
                                            arrayList5.add(userOrChat);
                                        }
                                        i18++;
                                        i13 = i19;
                                        i15 = i20;
                                    }
                                    i11 = i13;
                                    i12 = i15;
                                    n0Var.p(arrayList5);
                                    if (arrayList5 != null && !arrayList5.isEmpty()) {
                                        n0Var.w = 0;
                                        n0Var.F.c(0, false);
                                    }
                                    if (z10) {
                                        if (reactionCount2.count > 1) {
                                            if (reactionCount2.chosen) {
                                                p0Var = this;
                                                n0 n0Var2 = new n0(p0Var, null, reactionCount2, z10, z11);
                                                n0Var2.R = messageObject.hasValidGroupId();
                                                arrayList.add(n0Var2);
                                                ((m0) arrayList.get(0)).Q = false;
                                                ((m0) arrayList.get(1)).Q = true;
                                                ((m0) arrayList.get(0)).j = 1;
                                                ((m0) arrayList.get(1)).j = 1;
                                                ((m0) arrayList.get(1)).o = a4.a.t(new StringBuilder(), ((m0) arrayList.get(1)).o, "_");
                                                break;
                                            }
                                        }
                                        p0Var = this;
                                        if (!z10 && i10 == 2) {
                                            break;
                                        }
                                        if (p0Var.G) {
                                            n0Var.a();
                                        }
                                        i10++;
                                        z13 = z10;
                                        z14 = z11;
                                        i13 = i11;
                                        i15 = i12;
                                        r92 = 0;
                                    }
                                    p0Var = this;
                                    if (!z10) {
                                    }
                                    if (p0Var.G) {
                                    }
                                    i10++;
                                    z13 = z10;
                                    z14 = z11;
                                    i13 = i11;
                                    i15 = i12;
                                    r92 = 0;
                                }
                            }
                            i11 = i13;
                            i12 = i15;
                            if (z10) {
                            }
                            p0Var = this;
                            if (!z10) {
                            }
                            if (p0Var.G) {
                            }
                            i10++;
                            z13 = z10;
                            z14 = z11;
                            i13 = i11;
                            i15 = i12;
                            r92 = 0;
                        }
                    }
                }
                z12 = false;
                ArrayList arrayList32 = new ArrayList();
                if (z12) {
                }
                i10 = -arrayList32.size();
                while (i10 < messageObject.messageOwner.reactions.results.size()) {
                }
            }
            if (!z10 && !arrayList.isEmpty()) {
                Collections.sort(arrayList, l0Var);
                for (int i21 = 0; i21 < arrayList.size(); i21++) {
                    TLRPC.ReactionCount reactionCount3 = ((m0) arrayList.get(i21)).a;
                    int i22 = b0;
                    b0 = i22 + 1;
                    reactionCount3.lastDrawnPosition = i22;
                }
            }
            p0Var.K = MessageObject.hasUnreadReactions(messageObject.messageOwner);
        }
        for (int i23 = 0; i23 < arrayList2.size(); i23++) {
            ((m0) arrayList2.get(i23)).b();
        }
        p0Var.s = arrayList.isEmpty();
    }
}
