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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Cells.o4;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Cells.w0;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.q6;
import org.telegram.ui.Components.s5;
import org.telegram.ui.mb1;
import org.telegram.ui.sm;
import yh.t5;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class o0 {
    public static int Z;
    public MessageObject A;
    public e6 B;
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
    public l0 S;
    public boolean T;
    public t5 U;
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
    public static final k0 a0 = new k0();
    public static int b0 = 1;
    public static final mb1 c0 = new mb1(27);
    public final ArrayList v = new ArrayList();
    public final ArrayList w = new ArrayList();
    public final HashMap x = new HashMap();
    public final HashMap y = new HashMap();
    public final HashMap H = new HashMap();
    public final ArrayList N = new ArrayList();
    public final RectF O = new RectF();
    public final Rect P = new Rect();
    public final int n = UserConfig.selectedAccount;

    public o0(org.telegram.ui.Cells.a0 a0Var) {
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

    public static void o(e6 e6Var) {
        V.setColor(i6.w0(i6.ie, e6Var));
        int w02 = i6.w0(i6.Sh, e6Var);
        TextPaint textPaint = Y;
        textPaint.setColor(w02);
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        X.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public final boolean a() {
        ArrayList arrayList;
        l9 l9Var;
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
            ((l0) arrayList.get(i12)).b();
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
            l0 l0Var = (l0) arrayList2.get(i13);
            String str = l0Var.o;
            lr lrVar = l0Var.F;
            l0 l0Var2 = (l0) hashMap.get(str);
            if (l0Var2 != null && l0Var.b != l0Var2.b) {
                l0Var2 = null;
            }
            if (l0Var2 != null) {
                hashMap.remove(l0Var.o);
                int i14 = l0Var.x;
                int i15 = l0Var2.x;
                if (i14 == i15 && l0Var.y == l0Var2.y && l0Var.A == l0Var2.A && l0Var.w == l0Var2.w && l0Var.p == l0Var2.p && l0Var.T == null && l0Var2.T == null) {
                    l0Var.c = 0;
                    i13++;
                } else {
                    l0Var.d = i15;
                    l0Var.e = l0Var2.y;
                    l0Var.f = l0Var2.A;
                    l0Var.i = l0Var2.N;
                    l0Var.g = l0Var2.O;
                    l0Var.h = l0Var2.P;
                    l0Var.c = 3;
                    int i16 = l0Var.w;
                    int i17 = l0Var2.w;
                    if (i16 != i17 && lrVar != null) {
                        lrVar.c(i17, false);
                        lrVar.c(l0Var.w, true);
                    }
                    l9 l9Var2 = l0Var.T;
                    if (l9Var2 != null || l0Var2.T != null) {
                        if (l9Var2 == null) {
                            l0Var.p(new ArrayList());
                        }
                        if (l0Var2.T == null) {
                            l0Var2.p(new ArrayList());
                        }
                        ArrayList arrayList3 = l0Var2.U;
                        ArrayList arrayList4 = l0Var.U;
                        if (arrayList3 != null && arrayList4 != null && arrayList3.size() == arrayList4.size()) {
                            for (0; i11 < arrayList3.size(); i11 + 1) {
                                TLObject tLObject = (TLObject) arrayList3.get(i11);
                                TLObject tLObject2 = (TLObject) arrayList4.get(i11);
                                i11 = (tLObject == null || tLObject2 == null || k(tLObject) != k(tLObject2)) ? 0 : i11 + 1;
                            }
                        }
                        l9 l9Var3 = l0Var.T;
                        if (l9Var3 != null && (l9Var = l0Var2.T) != null) {
                            ValueAnimator valueAnimator = l9Var.f;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                                if (l9Var3.w) {
                                    l9Var3.w = false;
                                    l9Var3.n();
                                }
                            }
                            TLObject[] tLObjectArr = new TLObject[3];
                            int i18 = 0;
                            while (true) {
                                i10 = this.n;
                                if (i18 >= 3) {
                                    break;
                                }
                                tLObjectArr[i18] = l9Var3.b[i18].h;
                                l9Var3.l(i18, l9Var.b[i18].h, i10);
                                i18++;
                            }
                            l9Var3.b(false, true);
                            for (int i19 = 0; i19 < 3; i19++) {
                                l9Var3.l(i19, tLObjectArr[i19], i10);
                            }
                            l9Var3.d = true;
                            l9Var3.b(true, false);
                        }
                    }
                }
            } else {
                l0Var.c = 1;
            }
            z10 = true;
            i13++;
        }
        if (!hashMap.isEmpty()) {
            arrayList.addAll(hashMap.values());
            for (int i20 = 0; i20 < arrayList.size(); i20++) {
                ((l0) arrayList.get(i20)).l = ((l0) arrayList.get(i20)).n;
                ((l0) arrayList.get(i20)).a();
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

    public final void b(n0 n0Var) {
        int i10 = 0;
        if (n0Var.g == 0) {
            HashMap hashMap = this.H;
            if (hashMap.get(n0Var) == null) {
                ImageReceiver imageReceiver = new ImageReceiver();
                imageReceiver.setParentView(this.z);
                int i11 = Z;
                Z = i11 + 1;
                imageReceiver.setUniqKeyPrefix(Integer.toString(i11));
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(this.n).getReactionsMap().get(n0Var.f);
                if (tL_availableReaction != null) {
                    imageReceiver.setImage(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_nolimit", null, "tgs", tL_availableReaction, 1);
                }
                imageReceiver.setAutoRepeat(0);
                imageReceiver.onAttachedToWindow();
                hashMap.put(n0Var, imageReceiver);
                return;
            }
        }
        if (!this.M || n0Var.g == 0) {
            return;
        }
        while (true) {
            ArrayList arrayList = this.v;
            if (i10 >= arrayList.size()) {
                return;
            }
            if (n0Var.f(((l0) arrayList.get(i10)).r)) {
                ((l0) arrayList.get(i10)).q();
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
        if (e2.t(a0Var)) {
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
                if (f7 <= ((l0) arrayList.get(i10)).x || f7 >= ((l0) arrayList.get(i10)).x + ((l0) arrayList.get(i10)).A || f10 <= ((l0) arrayList.get(i10)).y || f10 >= ((l0) arrayList.get(i10)).y + ((l0) arrayList.get(i10)).B) {
                    i10++;
                } else {
                    this.Q = motionEvent.getX();
                    this.R = y3;
                    this.S = (l0) arrayList.get(i10);
                    t5 t5Var = this.U;
                    if (t5Var != null) {
                        AndroidUtilities.cancelRunOnUIThread(t5Var);
                        this.U = null;
                    }
                    this.S.Y.c(true);
                    t5 t5Var2 = new t5(7, this, this.S);
                    this.U = t5Var2;
                    AndroidUtilities.runOnUIThread(t5Var2, ViewConfiguration.getLongPressTimeout());
                    this.T = true;
                }
            }
        } else if (motionEvent.getAction() == 2) {
            boolean z10 = this.T;
            float f11 = this.t;
            if ((z10 && Math.abs(motionEvent.getX() - this.Q) > f11) || Math.abs(y3 - this.R) > f11) {
                this.T = false;
                l0 l0Var = this.S;
                if (l0Var != null) {
                    l0Var.Y.c(false);
                }
                this.S = null;
                t5 t5Var3 = this.U;
                if (t5Var3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(t5Var3);
                    this.U = null;
                }
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            t5 t5Var4 = this.U;
            if (t5Var4 != null) {
                AndroidUtilities.cancelRunOnUIThread(t5Var4);
                this.U = null;
            }
            if (this.T && this.S != null && motionEvent.getAction() == 1) {
                TLRPC.ReactionCount reactionCount = this.S.a;
                float x11 = motionEvent.getX();
                if (e2.t(a0Var)) {
                    ((o4) a0Var).f(reactionCount, false, x11, y3);
                }
            }
            this.T = false;
            l0 l0Var2 = this.S;
            if (l0Var2 != null) {
                l0Var2.Y.c(false);
            }
            this.S = null;
        }
        return this.T;
    }

    public final void d(Canvas canvas, float f7, Integer num) {
        float f10;
        float f11;
        float f12;
        Canvas canvas2 = canvas;
        boolean z10 = this.s;
        ArrayList arrayList = this.w;
        if (z10 && arrayList.isEmpty()) {
            return;
        }
        float f13 = this.c;
        float f14 = this.d;
        if (this.s) {
            f13 = this.g;
            f14 = this.h;
        } else if (this.j) {
            float f15 = 1.0f - f7;
            f13 = (f13 * f7) + (this.e * f15);
            f14 = (f14 * f7) + (this.f * f15);
        }
        float f16 = f13;
        float f17 = f14;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList2 = this.v;
            if (i11 >= arrayList2.size()) {
                break;
            }
            l0 l0Var = (l0) arrayList2.get(i11);
            if (this.C == null && num == null && this.D < 0.5f) {
                l0Var.c();
            }
            if (!Integer.valueOf(l0Var.r.hashCode()).equals(this.C) && (num == null || l0Var.r.hashCode() == num.intValue())) {
                canvas2.save();
                float f18 = l0Var.x;
                float f19 = l0Var.y;
                if (f7 != 1.0f && l0Var.c == 3) {
                    float f20 = 1.0f - f7;
                    f18 = (f18 * f7) + (l0Var.d * f20);
                    f19 = (f19 * f7) + (l0Var.e * f20);
                }
                if (f7 == 1.0f || l0Var.c != 1) {
                    f10 = 1.0f;
                } else {
                    float f21 = (f7 * 0.5f) + 0.5f;
                    canvas2.scale(f21, f21, (l0Var.A / 2.0f) + f16 + f18, (l0Var.B / 2.0f) + f17 + f19);
                    f10 = f7;
                }
                float f22 = f18 + f16;
                float f23 = f19 + f17;
                if (l0Var.c == 3) {
                    f11 = f10;
                    f12 = f7;
                } else {
                    f11 = f10;
                    f12 = 1.0f;
                }
                l0Var.d(canvas2, f22, f23, f12, f11, num != null, this.E, this.D);
                canvas2.restore();
            }
            i11++;
        }
        while (i10 < arrayList.size()) {
            l0 l0Var2 = (l0) arrayList.get(i10);
            float f24 = 1.0f - f7;
            float f25 = (f24 * 0.5f) + 0.5f;
            canvas2.save();
            canvas2.scale(f25, f25, (l0Var2.A / 2.0f) + l0Var2.x + f16, (l0Var2.B / 2.0f) + l0Var2.y + f17);
            ((l0) arrayList.get(i10)).d(canvas2, l0Var2.x + f16, l0Var2.y + f17, 1.0f, f24, false, this.E, this.D);
            canvas.restore();
            i10++;
            canvas2 = canvas;
        }
    }

    public final void e(Canvas canvas, float f7) {
        float f10;
        boolean z10 = this.s;
        ArrayList arrayList = this.w;
        if (z10 && arrayList.isEmpty()) {
            return;
        }
        float f11 = this.c;
        float f12 = this.d;
        float f13 = 1.0f;
        if (this.s) {
            f11 = this.g;
            f12 = this.h;
        } else if (this.j) {
            float f14 = 1.0f - f7;
            f11 = (f11 * f7) + (this.e * f14);
            f12 = (f12 * f7) + (this.f * f14);
        }
        int i10 = 0;
        boolean z11 = false;
        while (true) {
            ArrayList arrayList2 = this.v;
            if (i10 >= arrayList2.size()) {
                break;
            }
            l0 l0Var = (l0) arrayList2.get(i10);
            if (l0Var.m) {
                canvas.save();
                float f15 = l0Var.x;
                float f16 = l0Var.y;
                if (f7 != f13) {
                    f10 = f13;
                    if (l0Var.c == 3) {
                        float f17 = f10 - f7;
                        f15 = (f15 * f7) + (l0Var.d * f17);
                        f16 = (f16 * f7) + (l0Var.e * f17);
                    }
                } else {
                    f10 = f13;
                }
                if (f7 != f13 && l0Var.c == 1) {
                    float f18 = (f7 * 0.5f) + 0.5f;
                    canvas.scale(f18, f18, (l0Var.A / 2.0f) + f11 + f15, (l0Var.B / 2.0f) + f12 + f16);
                }
                z11 = z11 || l0Var.g(canvas, f15 + f11, f16 + f12);
                canvas.restore();
            } else {
                f10 = f13;
            }
            i10++;
            f13 = f10;
        }
        float f19 = f13;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            l0 l0Var2 = (l0) arrayList.get(i11);
            if (l0Var2.m) {
                float f20 = ((f19 - f7) * 0.5f) + 0.5f;
                canvas.save();
                canvas.scale(f20, f20, (l0Var2.A / 2.0f) + l0Var2.x + f11, (l0Var2.B / 2.0f) + l0Var2.y + f12);
                boolean z12 = z11 || ((l0) arrayList.get(i11)).g(canvas, ((float) l0Var2.x) + f11, ((float) l0Var2.y) + f12);
                canvas.restore();
                z11 = z12;
            }
        }
    }

    public final void f(sm smVar, Canvas canvas, int i10, Integer num) {
        if (this.s && this.w.isEmpty()) {
            return;
        }
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.v;
            if (i11 >= arrayList.size()) {
                return;
            }
            l0 l0Var = (l0) arrayList.get(i11);
            if ((num == null || l0Var.r.hashCode() == num.intValue()) && num != null) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(l0Var.t);
                float dp = AndroidUtilities.dp(140.0f);
                float dp2 = AndroidUtilities.dp(14.0f);
                float clamp = Utilities.clamp(rectF.left - AndroidUtilities.dp(12.0f), ((this.z instanceof u1 ? ((u1) r8).getParentWidth() : AndroidUtilities.displaySize.x) - dp) - AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
                float f7 = rectF.top - dp2;
                float f10 = i10;
                float f11 = f7 + f10;
                RectF rectF2 = this.O;
                rectF2.set(clamp, (f7 - dp) + f10, dp + clamp, f11);
                float interpolation = hs.h.getInterpolation(this.D);
                AndroidUtilities.lerp(rectF, rectF2, interpolation, rectF2);
                int i12 = l0Var.V;
                n0 n0Var = l0Var.s;
                View view = l0Var.W;
                if (l0Var.f0 == null && l0Var.g0 == null) {
                    if (view != null && (view.getParent() instanceof View)) {
                        view = (View) view.getParent();
                    }
                    if (l0Var.r != null && !n0Var.a) {
                        if (n0Var.f != null) {
                            TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i12).getReactionsMap().get(n0Var.f);
                            if (tL_availableReaction != null && tL_availableReaction.activate_animation != null) {
                                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(tL_availableReaction.static_icon, i6.a7, 1.0f);
                                ImageReceiver imageReceiver = new ImageReceiver(view);
                                l0Var.f0 = imageReceiver;
                                imageReceiver.setLayerNum(7);
                                l0Var.f0.onAttachedToWindow();
                                l0Var.f0.setRoundRadius(AndroidUtilities.dp(14.0f));
                                l0Var.f0.setAllowStartLottieAnimation(true);
                                l0Var.f0.setAllowStartAnimation(true);
                                l0Var.f0.setAutoRepeat(1);
                                l0Var.f0.setAllowDecodeSingleFrame(true);
                                l0Var.f0.setImage(ImageLocation.getForDocument(tL_availableReaction.activate_animation), "140_140", svgThumb, null, tL_availableReaction, 1);
                            }
                        } else if (n0Var.g != 0) {
                            s5 s5Var = new s5(24, i12, n0Var.g);
                            l0Var.g0 = s5Var;
                            s5Var.a(view);
                        }
                    }
                }
                this.P.set((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
                if (interpolation > 0.0f) {
                    ImageReceiver imageReceiver2 = l0Var.f0;
                    if (imageReceiver2 != null) {
                        imageReceiver2.setImageCoords(rectF2);
                        l0Var.f0.setAlpha(interpolation);
                        l0Var.f0.draw(canvas);
                    } else {
                        s5 s5Var2 = l0Var.g0;
                        if (s5Var2 != null) {
                            s5Var2.setBounds((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
                            l0Var.g0.setAlpha((int) (interpolation * 255.0f));
                            l0Var.g0.draw(canvas);
                        }
                    }
                    smVar.invalidate();
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

    public final l0 l(String str) {
        boolean z10 = this.b;
        HashMap hashMap = this.x;
        if (z10) {
            l0 l0Var = (l0) hashMap.get(str + "_");
            if (l0Var != null) {
                return l0Var;
            }
        }
        return (l0) hashMap.get(str);
    }

    public final l0 m(n0 n0Var) {
        String l4;
        if (n0Var.a) {
            l4 = "stars";
        } else {
            String str = n0Var.f;
            l4 = str != null ? str : Long.toString(n0Var.g);
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
            l0 l0Var = (l0) arrayList.get(i12);
            boolean z10 = l0Var.b;
            q6 q6Var = l0Var.G;
            lr lrVar = l0Var.F;
            if (z10) {
                l0Var.A = AndroidUtilities.dp(14.0f);
                l0Var.B = AndroidUtilities.dp(14.0f);
            } else if (l0Var.S) {
                l0Var.A = AndroidUtilities.dp(42.0f);
                l0Var.B = AndroidUtilities.dp(26.0f);
                if (l0Var.u) {
                    l0Var.A = (int) (q6Var.d + AndroidUtilities.dp(8.0f) + l0Var.A);
                } else if (lrVar != null && l0Var.w > 1) {
                    l0Var.A = org.telegram.messenger.q.C(8.0f, (int) Math.ceil(lrVar.m), l0Var.A);
                }
            } else {
                l0Var.A = AndroidUtilities.dp(l0Var.D != null ? 6.0f : 4.0f) + AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(8.0f);
                if (l0Var.T != null && l0Var.U.size() > 0) {
                    l0Var.U.size();
                    l0Var.A = (int) ((AndroidUtilities.dp(20.0f) * (l0Var.U.size() > 1 ? l0Var.U.size() - 1 : 0) * 0.8f) + AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(2.0f) + AndroidUtilities.dp(1.0f) + l0Var.A);
                    l0Var.T.o = AndroidUtilities.dp(26.0f);
                } else if (l0Var.u) {
                    l0Var.A = (int) (q6Var.d + AndroidUtilities.dp(8.0f) + l0Var.A);
                } else if (((int) Math.ceil(lrVar.m)) > 0) {
                    l0Var.A = org.telegram.messenger.q.C(8.0f, (int) Math.ceil(lrVar.m), l0Var.A);
                } else {
                    l0Var.A -= AndroidUtilities.dp(1.0f);
                }
                l0Var.B = AndroidUtilities.dp(26.0f);
            }
            if (l0Var.A + i13 > i10) {
                arrayList2.add(Integer.valueOf(i13));
                i15 = org.telegram.messenger.q.C(4.0f, l0Var.B, i15);
                i16++;
                i13 = 0;
            }
            l0Var.x = i13;
            l0Var.y = i15;
            l0Var.z = i16;
            i13 = org.telegram.messenger.q.C(4.0f, l0Var.A, i13);
            if (i13 > i14) {
                i14 = i13;
            }
            i12++;
        }
        arrayList2.add(Integer.valueOf(i13));
        if (i11 == 5 && !arrayList.isEmpty()) {
            int i17 = ((l0) arrayList.get(0)).y;
            int i18 = 0;
            for (int i19 = 0; i19 < arrayList.size(); i19++) {
                if (((l0) arrayList.get(i19)).y != i17) {
                    int i20 = i19 - 1;
                    int i21 = i10 - (((l0) arrayList.get(i20)).x + ((l0) arrayList.get(i20)).A);
                    while (i18 < i19) {
                        ((l0) arrayList.get(i18)).x += i21;
                        i18++;
                    }
                    i18 = i19;
                }
            }
            int size = arrayList.size() - 1;
            int i22 = i10 - (((l0) arrayList.get(size)).x + ((l0) arrayList.get(size)).A);
            while (i18 <= size) {
                ((l0) arrayList.get(i18)).x += i22;
                i18++;
            }
        } else if (i11 == 1 && !arrayList.isEmpty()) {
            for (int i23 = 0; i23 < arrayList.size(); i23++) {
                l0 l0Var2 = (l0) arrayList.get(i23);
                int i24 = l0Var2.z;
                l0Var2.x = (int) e2.z(i10, (i24 < 0 || i24 >= arrayList2.size()) ? 0.0f : ((Integer) arrayList2.get(l0Var2.z)).intValue(), 2.0f, l0Var2.x);
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
            ((l0) arrayList.get(i10)).b();
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
            hashMap.put(((l0) arrayList.get(i10)).o, (l0) arrayList.get(i10));
            i10++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x028c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d4  */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s(MessageObject messageObject, boolean z10, boolean z11, e6 e6Var) {
        int i10;
        boolean z12;
        int i11;
        TLRPC.ReactionCount reactionCount;
        l0 l0Var;
        int i12;
        int i13;
        o0 o0Var = this;
        boolean z13 = z10;
        boolean z14 = z11;
        o0Var.B = e6Var;
        o0Var.b = z13;
        o0Var.M = z14;
        o0Var.A = messageObject;
        ArrayList arrayList = o0Var.v;
        ArrayList arrayList2 = new ArrayList(arrayList);
        ?? r92 = 0;
        r92 = 0;
        r92 = 0;
        o0Var.K = false;
        o0Var.L = false;
        arrayList.clear();
        if (messageObject != null) {
            long dialogId = messageObject.getDialogId();
            k0 k0Var = a0;
            k0Var.a = dialogId;
            TLRPC.TL_messageReactions tL_messageReactions = messageObject.messageOwner.reactions;
            if (tL_messageReactions != null && tL_messageReactions.results != null) {
                int i14 = 0;
                for (int i15 = 0; i15 < messageObject.messageOwner.reactions.results.size(); i15++) {
                    i14 += messageObject.messageOwner.reactions.results.get(i15).count;
                }
                int i16 = o0Var.n;
                TLRPC.ChatFull chatFull = MessagesController.getInstance(i16).getChatFull(-messageObject.getDialogId());
                if (!z13 && !messageObject.messageOwner.reactions.results.isEmpty() && chatFull != null && chatFull.paid_reactions_available) {
                    boolean z15 = false;
                    for (int i17 = 0; i17 < messageObject.messageOwner.reactions.results.size(); i17++) {
                        TLRPC.Reaction reaction = messageObject.messageOwner.reactions.results.get(i17).reaction;
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
                        i11 = -arrayList3.size();
                        while (i11 < messageObject.messageOwner.reactions.results.size()) {
                            if (i11 < 0) {
                                reactionCount = new TLRPC.TL_reactionCount();
                                reactionCount.reaction = (TLRPC.Reaction) arrayList3.get(arrayList3.size() + i11);
                                reactionCount.chosen = r92;
                                reactionCount.count = r92 == true ? 1 : 0;
                            } else {
                                reactionCount = messageObject.messageOwner.reactions.results.get(i11);
                            }
                            TLRPC.ReactionCount reactionCount2 = reactionCount;
                            int i18 = r92 == true ? 1 : 0;
                            while (true) {
                                if (i18 >= arrayList2.size()) {
                                    l0Var = null;
                                    break;
                                }
                                l0Var = (l0) arrayList2.get(i18);
                                if (l0Var.r.equals(reactionCount2.reaction)) {
                                    break;
                                } else {
                                    i18++;
                                }
                            }
                            m0 m0Var = new m0(o0Var, l0Var, reactionCount2, z13, z14);
                            m0Var.R = messageObject.hasValidGroupId();
                            arrayList.add(m0Var);
                            o0Var.L = o0Var.L || m0Var.m;
                            if (!z10 && !z11 && messageObject.messageOwner.reactions.recent_reactions != null) {
                                if (messageObject.getDialogId() > 0 && !UserObject.isReplyUser(messageObject.getDialogId())) {
                                    ArrayList arrayList4 = new ArrayList();
                                    TLRPC.User currentUser = UserConfig.getInstance(i16).getCurrentUser();
                                    TLRPC.User user = MessagesController.getInstance(i16).getUser(Long.valueOf(messageObject.getDialogId()));
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
                                    m0Var.p(arrayList4);
                                    if (!arrayList4.isEmpty()) {
                                        m0Var.w = 0;
                                        m0Var.F.c(0, false);
                                    }
                                } else if (reactionCount2.count <= 3 && i14 <= 3) {
                                    ArrayList arrayList5 = null;
                                    int i19 = 0;
                                    while (i19 < messageObject.messageOwner.reactions.recent_reactions.size()) {
                                        TLRPC.MessagePeerReaction messagePeerReaction = messageObject.messageOwner.reactions.recent_reactions.get(i19);
                                        n0 d = n0.d(messagePeerReaction.reaction);
                                        n0 d10 = n0.d(reactionCount2.reaction);
                                        int i20 = i14;
                                        int i21 = i16;
                                        TLObject userOrChat = MessagesController.getInstance(i16).getUserOrChat(MessageObject.getPeerId(messagePeerReaction.peer_id));
                                        if (d.equals(d10) && userOrChat != null) {
                                            if (arrayList5 == null) {
                                                arrayList5 = new ArrayList();
                                            }
                                            arrayList5.add(userOrChat);
                                        }
                                        i19++;
                                        i14 = i20;
                                        i16 = i21;
                                    }
                                    i12 = i14;
                                    i13 = i16;
                                    m0Var.p(arrayList5);
                                    if (arrayList5 != null && !arrayList5.isEmpty()) {
                                        m0Var.w = 0;
                                        m0Var.F.c(0, false);
                                    }
                                    if (z10) {
                                        if (reactionCount2.count > 1) {
                                            if (reactionCount2.chosen) {
                                                o0Var = this;
                                                m0 m0Var2 = new m0(o0Var, null, reactionCount2, z10, z11);
                                                m0Var2.R = messageObject.hasValidGroupId();
                                                arrayList.add(m0Var2);
                                                i10 = 0;
                                                ((l0) arrayList.get(0)).Q = false;
                                                ((l0) arrayList.get(1)).Q = true;
                                                ((l0) arrayList.get(0)).j = 1;
                                                ((l0) arrayList.get(1)).j = 1;
                                                ((l0) arrayList.get(1)).o = a1.g.t(new StringBuilder(), ((l0) arrayList.get(1)).o, "_");
                                                break;
                                            }
                                        }
                                        i10 = 0;
                                        o0Var = this;
                                        if (!z10 && i11 == 2) {
                                            break;
                                        }
                                        if (o0Var.G) {
                                            m0Var.a();
                                        }
                                        i11++;
                                        z14 = z11;
                                        r92 = 0;
                                        i14 = i12;
                                        i16 = i13;
                                        z13 = z10;
                                    }
                                    i10 = 0;
                                    o0Var = this;
                                    if (!z10) {
                                    }
                                    if (o0Var.G) {
                                    }
                                    i11++;
                                    z14 = z11;
                                    r92 = 0;
                                    i14 = i12;
                                    i16 = i13;
                                    z13 = z10;
                                }
                            }
                            i12 = i14;
                            i13 = i16;
                            if (z10) {
                            }
                            i10 = 0;
                            o0Var = this;
                            if (!z10) {
                            }
                            if (o0Var.G) {
                            }
                            i11++;
                            z14 = z11;
                            r92 = 0;
                            i14 = i12;
                            i16 = i13;
                            z13 = z10;
                        }
                    }
                }
                z12 = false;
                ArrayList arrayList32 = new ArrayList();
                if (z12) {
                }
                i11 = -arrayList32.size();
                while (i11 < messageObject.messageOwner.reactions.results.size()) {
                }
            }
            i10 = r92;
            if (!z10 && !arrayList.isEmpty()) {
                Collections.sort(arrayList, k0Var);
                for (int i22 = i10; i22 < arrayList.size(); i22++) {
                    TLRPC.ReactionCount reactionCount3 = ((l0) arrayList.get(i22)).a;
                    int i23 = b0;
                    b0 = i23 + 1;
                    reactionCount3.lastDrawnPosition = i23;
                }
            }
            o0Var.K = MessageObject.hasUnreadReactions(messageObject.messageOwner);
        } else {
            i10 = 0;
        }
        for (int i24 = i10; i24 < arrayList2.size(); i24++) {
            ((l0) arrayList2.get(i24)).b();
        }
        o0Var.s = arrayList.isEmpty();
    }
}
