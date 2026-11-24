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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class vq8 extends View implements gk7 {
    public final lm E;
    public float F;
    public xsa G;
    public final ArrayList H;
    public final ArrayList I;
    public final HashSet J;
    public int K;
    public final DecelerateInterpolator L;
    public final LinearInterpolator M;
    public uq8 N;
    public final int a;
    public final long b;
    public final oc6 c;
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

    public vq8(Context context, int i, long j, oc6 oc6Var) {
        super(context);
        this.d = true;
        this.E = new lm(this, 0L, 350L, s33.h);
        this.F = 1.0f;
        this.H = new ArrayList();
        this.I = new ArrayList();
        this.J = new HashSet();
        this.L = new DecelerateInterpolator();
        this.M = new LinearInterpolator();
        this.a = i;
        this.b = j;
        this.c = oc6Var;
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
        vq8 vq8Var;
        ArrayList arrayList;
        int i2;
        int i3;
        uq8 uq8Var;
        uq8 uq8Var2;
        vq8 vq8Var2;
        if (!na7.q1(this.a).k4.L1.f) {
            return;
        }
        this.K = na7.q1(this.a).k4.J1.f();
        this.H.clear();
        this.H.addAll(this.I);
        this.I.clear();
        this.J.clear();
        long j = this.b;
        int i4 = this.a;
        if (j >= 0) {
            TLRPC.User V1 = na7.q1(i4).V1(Long.valueOf(this.b));
            if (V1 != null) {
                emojiStatus = V1.emoji_status;
            }
            emojiStatus = null;
        } else {
            TLRPC.User V12 = na7.q1(i4).V1(Long.valueOf(-this.b));
            if (V12 != null) {
                emojiStatus = V12.emoji_status;
            }
            emojiStatus = null;
        }
        if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
            this.J.add(Long.valueOf(((TLRPC.TL_emojiStatusCollectible) emojiStatus).collectible_id));
        }
        xsa D = gta.v(this.a, false).D(this.b, true);
        this.G = D;
        if (D != null) {
            for (int i5 = 0; i5 < this.G.l.size(); i5++) {
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.G.l.get(i5);
                if (!savedStarGift.unsaved && savedStarGift.pinned_to_top) {
                    TL_stars.StarGift starGift = savedStarGift.gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        uq8 uq8Var3 = new uq8(this, (TL_stars.TL_starGiftUnique) starGift);
                        if (!this.J.contains(Long.valueOf(uq8Var3.a))) {
                            this.I.add(uq8Var3);
                            this.J.add(Long.valueOf(uq8Var3.a));
                        }
                    }
                }
            }
        }
        if (this.I.size() == this.H.size()) {
            for (int i6 = 0; i6 < this.I.size(); i6++) {
                uq8 uq8Var4 = (uq8) this.I.get(i6);
                uq8 uq8Var5 = (uq8) this.H.get(i6);
                if (uq8Var5 == null) {
                    uq8Var4.getClass();
                } else if (uq8Var5.a == uq8Var4.a) {
                }
            }
            z = false;
            i = 0;
            while (i < this.I.size()) {
                uq8 uq8Var6 = (uq8) this.I.get(i);
                int i7 = 0;
                while (true) {
                    if (i7 >= this.H.size()) {
                        uq8Var2 = null;
                        break;
                    } else {
                        if (((uq8) this.H.get(i7)).a == uq8Var6.a) {
                            uq8Var2 = (uq8) this.H.get(i7);
                            break;
                        }
                        i7++;
                    }
                }
                if (uq8Var2 != null) {
                    uq8Var6.getClass();
                    uq8Var6.h = uq8Var2.h;
                    uq8Var6.j = uq8Var2.j;
                    uq8Var6.i = uq8Var2.i;
                    uq8Var6.k = uq8Var2.k;
                    uq8Var6.f = uq8Var2.f;
                    uq8Var6.g = uq8Var2.g;
                    vq8Var2 = this;
                } else {
                    float L = gl.L(22.5f);
                    int i8 = uq8Var6.d;
                    uq8Var6.h = new RadialGradient(0.0f, 0.0f, L, new int[]{i8, bkb.p1(0.0f, i8)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    Paint paint = new Paint(1);
                    uq8Var6.i = paint;
                    paint.setShader(uq8Var6.h);
                    TLRPC.Document document = uq8Var6.b;
                    int i9 = this.a;
                    if (document != null) {
                        uq8Var6.j = vl.l(i9, 0, document);
                    } else {
                        uq8Var6.j = vl.m(i9, uq8Var6.c, null, 0);
                    }
                    vq8Var2 = this;
                    lm lmVar = new lm(vq8Var2, 0L, 320L, (Interpolator) null);
                    uq8Var6.k = lmVar;
                    lmVar.e(true, 0.0f);
                    if (vq8Var2.isAttachedToWindow()) {
                        uq8Var6.j.b(vq8Var2);
                    }
                }
                i++;
                this = vq8Var2;
            }
            vq8Var = this;
            arrayList = new ArrayList();
            for (i2 = 0; i2 < vq8Var.K; i2 = tb4.g(i2, i2, 1, arrayList)) {
            }
            for (i3 = 0; i3 < vq8Var.H.size(); i3++) {
                uq8 uq8Var7 = (uq8) vq8Var.H.get(i3);
                int i10 = 0;
                while (true) {
                    if (i10 >= vq8Var.I.size()) {
                        uq8Var = null;
                        break;
                    } else {
                        if (((uq8) vq8Var.I.get(i10)).a == uq8Var7.a) {
                            uq8Var = (uq8) vq8Var.I.get(i10);
                            break;
                        }
                        i10++;
                    }
                }
                if (uq8Var == null) {
                    uq8Var7.j.o(vq8Var);
                    uq8Var7.j = null;
                    uq8Var7.h = null;
                } else {
                    arrayList.remove(Integer.valueOf(uq8Var7.g));
                }
            }
            if (!arrayList.isEmpty()) {
                ee0 ee0Var = new ee0(arrayList);
                for (int i11 = 0; i11 < vq8Var.I.size(); i11++) {
                    uq8 uq8Var8 = (uq8) vq8Var.I.get(i11);
                    if (uq8Var8.g == -1) {
                        uq8Var8.g = ((Integer) ee0Var.b()).intValue();
                    }
                }
            }
            if (z) {
                return;
            }
            vq8Var.invalidate();
            return;
        }
        z = true;
        i = 0;
        while (i < this.I.size()) {
        }
        vq8Var = this;
        arrayList = new ArrayList();
        while (i2 < vq8Var.K) {
        }
        while (i3 < vq8Var.H.size()) {
        }
        if (!arrayList.isEmpty()) {
        }
        if (z) {
        }
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.H3 && ((Long) objArr[0]).longValue() == this.b) {
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
        uq8 uq8Var;
        boolean z;
        vq8 vq8Var = this;
        ArrayList arrayList2 = vq8Var.I;
        if (arrayList2.isEmpty()) {
            return;
        }
        float f5 = 1.0f;
        if (vq8Var.e < 1.0f) {
            float f6 = 0.0f;
            if (vq8Var.f > 0.0f) {
                oc6 oc6Var = vq8Var.c;
                float x = oc6Var.getX();
                float y = oc6Var.getY();
                float scaleX = oc6Var.getScaleX() * oc6Var.getWidth();
                float scaleY = oc6Var.getScaleY() * oc6Var.getHeight();
                float N = gl.N(96.0f);
                float f7 = 2.0f;
                float min = Math.min(x, (vq8Var.getWidth() - N) / 2.0f);
                float f8 = oo1.f(vq8Var.y, N, 2.0f, y);
                float max = Math.max(scaleX, N);
                float max2 = Math.max(scaleY, N);
                canvas.save();
                canvas.clipRect(0.0f, 0.0f, vq8Var.getWidth(), vq8Var.x);
                float f9 = (max / 2.0f) + min;
                float f10 = (max2 / 2.0f) + f8;
                float f11 = (scaleX / 2.0f) + x;
                float f12 = (scaleY / 2.0f) + y;
                float f13 = vq8Var.x;
                float f14 = f13 / vq8Var.y;
                float l2 = Utilities.l((f13 - (a.getCurrentActionBarHeight() + gl.m)) / gl.L(50.0f));
                boolean z2 = false;
                int i = 0;
                while (i < arrayList2.size()) {
                    uq8 uq8Var2 = (uq8) arrayList2.get(i);
                    float f15 = f7;
                    float e = uq8Var2.k.e(z2, f5);
                    float R1 = gl.R1(0.5f, f5, e);
                    float f16 = f6;
                    int i2 = i;
                    float z3 = tb4.z(f5, vq8Var.n, (f5 - vq8Var.e) * e, l2);
                    int i3 = uq8Var2.g;
                    float f17 = 1.6f;
                    float f18 = f5;
                    if (i3 != 0) {
                        if (i3 != 1) {
                            if (i3 == 2) {
                                f = l2;
                                L = ((f9 * f15) / 3.0f) - (gl.L(12.0f) * f14);
                                f2 = (f8 + max2) - gl.L(16.0f);
                            } else if (i3 == 3) {
                                f = l2;
                                L = (gl.L(20.0f) * f14) + (1.5f * f9);
                                L2 = gl.L(13.0f);
                            } else if (i3 != 4) {
                                L = (gl.L(12.0f) * f14) + ((4.0f * f9) / 3.0f);
                                f = l2;
                                f2 = (f8 + max2) - gl.L(16.0f);
                            } else {
                                f = l2;
                                L = (gl.L(12.0f) * f14) + ((f9 * 4.0f) / 3.0f);
                                f2 = f8 - gl.L(4.0f);
                            }
                            f17 = 0.9f;
                            float min2 = (!vq8Var.h || e >= f18) ? vq8Var.f : Math.min(e, vq8Var.f);
                            float f19 = f17 * 0.2f;
                            l = min2 >= f18 - f19 ? f18 : Utilities.l(((min2 - 0.32000002f) + f19) / 0.67999995f);
                            if (l < f18) {
                                L = gl.R1(f11, L, vq8Var.L.getInterpolation(l));
                                f2 = gl.R1(f12, f2, vq8Var.M.getInterpolation(l));
                                R1 = gl.R1(R1 / f15, R1, l);
                            }
                            if (z3 <= f16) {
                                f3 = f12;
                                arrayList = arrayList2;
                                f4 = f16;
                                z = false;
                            } else {
                                float L3 = gl.L(45.0f);
                                float f20 = R1;
                                float f21 = L3 / f15;
                                f3 = f12;
                                arrayList = arrayList2;
                                uq8Var2.l.set(L - f21, f2 - f21, L + f21, f2 + f21);
                                canvas.save();
                                canvas.translate(L, f2);
                                f4 = f16;
                                canvas.rotate(f4);
                                float a = uq8Var2.m.a(0.1f) * f20;
                                canvas.scale(a, a);
                                uq8Var2.f.d();
                                uq8Var2.f.b(canvas, uq8Var2.d, z3);
                                Paint paint = uq8Var2.i;
                                if (paint != null) {
                                    paint.setAlpha((int) (z3 * 255.0f * f18));
                                    float f22 = (-L3) / f15;
                                    uq8Var = uq8Var2;
                                    z = false;
                                    canvas.drawRect(f22, f22, f21, f21, uq8Var2.i);
                                } else {
                                    uq8Var = uq8Var2;
                                    z = false;
                                }
                                if (uq8Var.j != null) {
                                    int L4 = gl.L(24.0f);
                                    int i4 = (-L4) / 2;
                                    int i5 = L4 / 2;
                                    uq8Var.j.setBounds(i4, i4, i5, i5);
                                    uq8Var.j.setAlpha((int) (z3 * 255.0f));
                                    uq8Var.j.draw(canvas);
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
                            vq8Var = this;
                        } else {
                            f = l2;
                            L = ((f9 * f15) / 3.0f) - (gl.L(6.0f) * f14);
                            f2 = f8 - gl.L(4.0f);
                        }
                        f17 = f16;
                        if (vq8Var.h) {
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
                        vq8Var = this;
                    } else {
                        f = l2;
                        L = (f9 / f15) - (gl.L(20.0f) * f14);
                        L2 = gl.L(13.0f);
                    }
                    f2 = f10 - L2;
                    if (vq8Var.h) {
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
                    vq8Var = this;
                }
                canvas.restore();
            }
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        kk7.f(this.a).b(this, kk7.H3);
        ArrayList arrayList = this.I;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((uq8) obj).j.b(this);
        }
        a();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        kk7.f(this.a).n(this, kk7.H3);
        ArrayList arrayList = this.I;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((uq8) obj).j.o(this);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        uq8 uq8Var;
        uq8 uq8Var2;
        if (this.d) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int i = 0;
            while (true) {
                ArrayList arrayList = this.I;
                if (i >= arrayList.size()) {
                    uq8Var = null;
                    break;
                }
                if (((uq8) arrayList.get(i)).l.contains(x, y)) {
                    uq8Var = (uq8) arrayList.get(i);
                    break;
                }
                i++;
            }
            if (motionEvent.getAction() == 0) {
                this.N = uq8Var;
                if (uq8Var != null) {
                    uq8Var.m.c(true);
                }
            } else if (motionEvent.getAction() == 2) {
                uq8 uq8Var3 = this.N;
                if (uq8Var3 != uq8Var && uq8Var3 != null) {
                    uq8Var3.m.c(false);
                    this.N = null;
                }
            } else if (motionEvent.getAction() == 1) {
                uq8 uq8Var4 = this.N;
                if (uq8Var4 != null) {
                    d01.t(getContext(), "https://t.me/nft/" + uq8Var4.e);
                    this.N.m.c(false);
                    this.N = null;
                }
            } else if (motionEvent.getAction() == 3 && (uq8Var2 = this.N) != null) {
                uq8Var2.m.c(false);
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
