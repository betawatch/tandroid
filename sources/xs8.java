// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.a;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class xs8 extends View implements jm7 {
    public final ln E;
    public float F;
    public ava G;
    public final ArrayList H;
    public final ArrayList I;
    public final HashSet J;
    public int K;
    public final DecelerateInterpolator L;
    public final LinearInterpolator M;
    public ws8 N;
    public final int a;
    public final long b;
    public final ne6 c;
    public boolean d;
    public float e;
    public float f;
    public boolean h;
    public float n;
    public float r;
    public float s;
    public float w;
    public float x;
    public float y;

    public xs8(Context context, int i, long j, ne6 ne6Var) {
        super(context);
        this.d = true;
        this.E = new ln(this, 0L, 350L, d53.h);
        this.F = 1.0f;
        this.H = new ArrayList();
        this.I = new ArrayList();
        this.J = new HashSet();
        this.L = new DecelerateInterpolator();
        this.M = new LinearInterpolator();
        this.a = i;
        this.b = j;
        this.c = ne6Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01d4 A[LOOP:4: B:75:0x01d0->B:77:0x01d4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        TLRPC.EmojiStatus emojiStatus;
        boolean z;
        int i;
        xs8 xs8Var;
        ArrayList arrayList;
        int i2;
        int i3;
        ws8 ws8Var;
        ws8 ws8Var2;
        xs8 xs8Var2;
        if (!oc7.r1(this.a).l4.L1.f) {
            return;
        }
        this.K = oc7.r1(this.a).l4.J1.f();
        this.H.clear();
        this.H.addAll(this.I);
        this.I.clear();
        this.J.clear();
        long j = this.b;
        int i4 = this.a;
        if (j >= 0) {
            TLRPC.User W1 = oc7.r1(i4).W1(Long.valueOf(this.b));
            if (W1 != null) {
                emojiStatus = W1.emoji_status;
            }
            emojiStatus = null;
        } else {
            TLRPC.User W12 = oc7.r1(i4).W1(Long.valueOf(-this.b));
            if (W12 != null) {
                emojiStatus = W12.emoji_status;
            }
            emojiStatus = null;
        }
        if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
            this.J.add(Long.valueOf(((TLRPC.TL_emojiStatusCollectible) emojiStatus).collectible_id));
        }
        ava D = jva.v(this.a, false).D(this.b, true);
        this.G = D;
        if (D != null) {
            for (int i5 = 0; i5 < this.G.l.size(); i5++) {
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.G.l.get(i5);
                if (!savedStarGift.unsaved && savedStarGift.pinned_to_top) {
                    TL_stars.StarGift starGift = savedStarGift.gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        ws8 ws8Var3 = new ws8(this, (TL_stars.TL_starGiftUnique) starGift);
                        if (!this.J.contains(Long.valueOf(ws8Var3.a))) {
                            this.I.add(ws8Var3);
                            this.J.add(Long.valueOf(ws8Var3.a));
                        }
                    }
                }
            }
        }
        if (this.I.size() == this.H.size()) {
            for (int i6 = 0; i6 < this.I.size(); i6++) {
                ws8 ws8Var4 = (ws8) this.I.get(i6);
                ws8 ws8Var5 = (ws8) this.H.get(i6);
                if (ws8Var5 == null) {
                    ws8Var4.getClass();
                } else if (ws8Var5.a == ws8Var4.a) {
                }
            }
            z = false;
            i = 0;
            while (i < this.I.size()) {
                ws8 ws8Var6 = (ws8) this.I.get(i);
                int i7 = 0;
                while (true) {
                    if (i7 >= this.H.size()) {
                        ws8Var2 = null;
                        break;
                    } else {
                        if (((ws8) this.H.get(i7)).a == ws8Var6.a) {
                            ws8Var2 = (ws8) this.H.get(i7);
                            break;
                        }
                        i7++;
                    }
                }
                if (ws8Var2 != null) {
                    ws8Var6.getClass();
                    ws8Var6.h = ws8Var2.h;
                    ws8Var6.j = ws8Var2.j;
                    ws8Var6.i = ws8Var2.i;
                    ws8Var6.k = ws8Var2.k;
                    ws8Var6.f = ws8Var2.f;
                    ws8Var6.g = ws8Var2.g;
                    xs8Var2 = this;
                } else {
                    float L = gm.L(22.5f);
                    int i8 = ws8Var6.d;
                    ws8Var6.h = new RadialGradient(0.0f, 0.0f, L, new int[]{i8, cmb.p1(0.0f, i8)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    Paint paint = new Paint(1);
                    ws8Var6.i = paint;
                    paint.setShader(ws8Var6.h);
                    TLRPC.Document document = ws8Var6.b;
                    int i9 = this.a;
                    if (document != null) {
                        ws8Var6.j = vm.l(i9, 0, document);
                    } else {
                        ws8Var6.j = vm.m(i9, ws8Var6.c, null, 0);
                    }
                    xs8Var2 = this;
                    ln lnVar = new ln(xs8Var2, 0L, 320L, (Interpolator) null);
                    ws8Var6.k = lnVar;
                    lnVar.e(true, 0.0f);
                    if (xs8Var2.isAttachedToWindow()) {
                        ws8Var6.j.b(xs8Var2);
                    }
                }
                i++;
                this = xs8Var2;
            }
            xs8Var = this;
            arrayList = new ArrayList();
            for (i2 = 0; i2 < xs8Var.K; i2 = td4.g(i2, i2, 1, arrayList)) {
            }
            for (i3 = 0; i3 < xs8Var.H.size(); i3++) {
                ws8 ws8Var7 = (ws8) xs8Var.H.get(i3);
                int i10 = 0;
                while (true) {
                    if (i10 >= xs8Var.I.size()) {
                        ws8Var = null;
                        break;
                    } else {
                        if (((ws8) xs8Var.I.get(i10)).a == ws8Var7.a) {
                            ws8Var = (ws8) xs8Var.I.get(i10);
                            break;
                        }
                        i10++;
                    }
                }
                if (ws8Var == null) {
                    ws8Var7.j.o(xs8Var);
                    ws8Var7.j = null;
                    ws8Var7.h = null;
                } else {
                    arrayList.remove(Integer.valueOf(ws8Var7.g));
                }
            }
            if (!arrayList.isEmpty()) {
                ef0 ef0Var = new ef0(arrayList);
                for (int i11 = 0; i11 < xs8Var.I.size(); i11++) {
                    ws8 ws8Var8 = (ws8) xs8Var.I.get(i11);
                    if (ws8Var8.g == -1) {
                        ws8Var8.g = ((Integer) ef0Var.b()).intValue();
                    }
                }
            }
            if (z) {
                return;
            }
            xs8Var.invalidate();
            return;
        }
        z = true;
        i = 0;
        while (i < this.I.size()) {
        }
        xs8Var = this;
        arrayList = new ArrayList();
        while (i2 < xs8Var.K) {
        }
        while (i3 < xs8Var.H.size()) {
        }
        if (!arrayList.isEmpty()) {
        }
        if (z) {
        }
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.I3 && ((Long) objArr[0]).longValue() == this.b) {
            a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0185  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f;
        float L;
        int L2;
        float f2;
        float l;
        float f3;
        ArrayList arrayList;
        float f4;
        ws8 ws8Var;
        boolean z;
        xs8 xs8Var = this;
        ArrayList arrayList2 = xs8Var.I;
        if (arrayList2.isEmpty()) {
            return;
        }
        float f5 = 1.0f;
        if (xs8Var.e < 1.0f) {
            float f6 = 0.0f;
            if (xs8Var.f > 0.0f) {
                ne6 ne6Var = xs8Var.c;
                float x = ne6Var.getX();
                float y = ne6Var.getY();
                float scaleX = ne6Var.getScaleX() * ne6Var.getWidth();
                float scaleY = ne6Var.getScaleY() * ne6Var.getHeight();
                float N = gm.N(96.0f);
                float f7 = 2.0f;
                float min = Math.min(x, (xs8Var.getWidth() - N) / 2.0f);
                float f8 = aq1.f(xs8Var.y, N, 2.0f, y);
                float max = Math.max(scaleX, N);
                float max2 = Math.max(scaleY, N);
                canvas.save();
                canvas.clipRect(0.0f, 0.0f, xs8Var.getWidth(), xs8Var.x);
                float f9 = (max / 2.0f) + min;
                float f10 = (max2 / 2.0f) + f8;
                float f11 = (scaleX / 2.0f) + x;
                float f12 = (scaleY / 2.0f) + y;
                float f13 = xs8Var.x;
                float f14 = f13 / xs8Var.y;
                float l2 = Utilities.l((f13 - (a.getCurrentActionBarHeight() + gm.m)) / gm.L(50.0f));
                boolean z2 = false;
                int i = 0;
                while (i < arrayList2.size()) {
                    ws8 ws8Var2 = (ws8) arrayList2.get(i);
                    float f15 = f7;
                    float e = ws8Var2.k.e(z2, f5);
                    float R1 = gm.R1(0.5f, f5, e);
                    float f16 = f6;
                    int i2 = i;
                    float z3 = td4.z(f5, xs8Var.n, (f5 - xs8Var.e) * e, l2);
                    int i3 = ws8Var2.g;
                    float f17 = 1.6f;
                    float f18 = f5;
                    if (i3 != 0) {
                        if (i3 != 1) {
                            if (i3 == 2) {
                                f = l2;
                                L = ((f9 * f15) / 3.0f) - (gm.L(12.0f) * f14);
                                f2 = (f8 + max2) - gm.L(16.0f);
                            } else if (i3 == 3) {
                                f = l2;
                                L = (gm.L(20.0f) * f14) + (1.5f * f9);
                                L2 = gm.L(13.0f);
                            } else if (i3 != 4) {
                                L = (gm.L(12.0f) * f14) + ((4.0f * f9) / 3.0f);
                                f = l2;
                                f2 = (f8 + max2) - gm.L(16.0f);
                            } else {
                                f = l2;
                                L = (gm.L(12.0f) * f14) + ((f9 * 4.0f) / 3.0f);
                                f2 = f8 - gm.L(4.0f);
                            }
                            f17 = 0.9f;
                            float min2 = (!xs8Var.h || e >= f18) ? xs8Var.f : Math.min(e, xs8Var.f);
                            float f19 = f17 * 0.2f;
                            l = min2 >= f18 - f19 ? f18 : Utilities.l(((min2 - 0.32000002f) + f19) / 0.67999995f);
                            if (l < f18) {
                                L = gm.R1(f11, L, xs8Var.L.getInterpolation(l));
                                f2 = gm.R1(f12, f2, xs8Var.M.getInterpolation(l));
                                R1 = gm.R1(R1 / f15, R1, l);
                            }
                            if (z3 <= f16) {
                                f3 = f12;
                                arrayList = arrayList2;
                                f4 = f16;
                                z = false;
                            } else {
                                float L3 = gm.L(45.0f);
                                float f20 = R1;
                                float f21 = L3 / f15;
                                f3 = f12;
                                arrayList = arrayList2;
                                ws8Var2.l.set(L - f21, f2 - f21, L + f21, f2 + f21);
                                canvas.save();
                                canvas.translate(L, f2);
                                f4 = f16;
                                canvas.rotate(f4);
                                float a = ws8Var2.m.a(0.1f) * f20;
                                canvas.scale(a, a);
                                ws8Var2.f.d();
                                ws8Var2.f.b(canvas, ws8Var2.d, z3);
                                Paint paint = ws8Var2.i;
                                if (paint != null) {
                                    paint.setAlpha((int) (z3 * 255.0f * f18));
                                    float f22 = (-L3) / f15;
                                    ws8Var = ws8Var2;
                                    z = false;
                                    canvas.drawRect(f22, f22, f21, f21, ws8Var2.i);
                                } else {
                                    ws8Var = ws8Var2;
                                    z = false;
                                }
                                if (ws8Var.j != null) {
                                    int L4 = gm.L(24.0f);
                                    int i4 = (-L4) / 2;
                                    int i5 = L4 / 2;
                                    ws8Var.j.setBounds(i4, i4, i5, i5);
                                    ws8Var.j.setAlpha((int) (z3 * 255.0f));
                                    ws8Var.j.draw(canvas);
                                }
                                canvas.restore();
                            }
                            i = i2 + 1;
                            f6 = f4;
                            f7 = f15;
                            z2 = z;
                            f12 = f3;
                            f5 = f18;
                            arrayList2 = arrayList;
                            l2 = f;
                            xs8Var = this;
                        } else {
                            f = l2;
                            L = ((f9 * f15) / 3.0f) - (gm.L(6.0f) * f14);
                            f2 = f8 - gm.L(4.0f);
                        }
                        f17 = f16;
                        if (xs8Var.h) {
                        }
                        float f192 = f17 * 0.2f;
                        if (min2 >= f18 - f192) {
                        }
                        if (l < f18) {
                        }
                        if (z3 <= f16) {
                        }
                        i = i2 + 1;
                        f6 = f4;
                        f7 = f15;
                        z2 = z;
                        f12 = f3;
                        f5 = f18;
                        arrayList2 = arrayList;
                        l2 = f;
                        xs8Var = this;
                    } else {
                        f = l2;
                        L = (f9 / f15) - (gm.L(20.0f) * f14);
                        L2 = gm.L(13.0f);
                    }
                    f2 = f10 - L2;
                    if (xs8Var.h) {
                    }
                    float f1922 = f17 * 0.2f;
                    if (min2 >= f18 - f1922) {
                    }
                    if (l < f18) {
                    }
                    if (z3 <= f16) {
                    }
                    i = i2 + 1;
                    f6 = f4;
                    f7 = f15;
                    z2 = z;
                    f12 = f3;
                    f5 = f18;
                    arrayList2 = arrayList;
                    l2 = f;
                    xs8Var = this;
                }
                canvas.restore();
            }
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        nm7.f(this.a).b(this, nm7.I3);
        ArrayList arrayList = this.I;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((ws8) obj).j.b(this);
        }
        a();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        nm7.f(this.a).n(this, nm7.I3);
        ArrayList arrayList = this.I;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((ws8) obj).j.o(this);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ws8 ws8Var;
        ws8 ws8Var2;
        if (this.d) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int i = 0;
            while (true) {
                ArrayList arrayList = this.I;
                if (i >= arrayList.size()) {
                    ws8Var = null;
                    break;
                }
                if (((ws8) arrayList.get(i)).l.contains(x, y)) {
                    ws8Var = (ws8) arrayList.get(i);
                    break;
                }
                i++;
            }
            if (motionEvent.getAction() == 0) {
                this.N = ws8Var;
                if (ws8Var != null) {
                    ws8Var.m.c(true);
                }
            } else if (motionEvent.getAction() == 2) {
                ws8 ws8Var3 = this.N;
                if (ws8Var3 != ws8Var && ws8Var3 != null) {
                    ws8Var3.m.c(false);
                    this.N = null;
                }
            } else if (motionEvent.getAction() == 1) {
                ws8 ws8Var4 = this.N;
                if (ws8Var4 != null) {
                    l11.u(getContext(), "https://t.me/nft/" + ws8Var4.e);
                    this.N.m.c(false);
                    this.N = null;
                }
            } else if (motionEvent.getAction() == 3 && (ws8Var2 = this.N) != null) {
                ws8Var2.m.c(false);
                this.N = null;
            }
            if (this.N != null) {
                return true;
            }
        }
        return false;
    }

    public void setActionBarActionMode(float f) {
        this.n = f;
        invalidate();
    }

    public void setActive(boolean z) {
        this.d = z;
    }

    public void setExpandCoords(float f) {
        this.x = f;
        invalidate();
    }

    public void setExpandProgress(float f) {
        if (this.e != f) {
            this.e = f;
            invalidate();
        }
    }

    public void setProgressToStoriesInsets(float f) {
        if (this.F == f) {
            return;
        }
        this.F = f;
        invalidate();
    }
}
