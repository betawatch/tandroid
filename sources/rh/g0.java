package rh;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.us;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class g0 extends View implements us {
    public final org.telegram.ui.Components.t5 D;
    public float E;
    public v5 F;
    public final ArrayList G;
    public final ArrayList H;
    public final HashSet I;
    public int J;
    public final DecelerateInterpolator K;
    public final LinearInterpolator L;
    public f0 M;
    public final int a;
    public final long b;
    public final View c;
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

    public g0(Context context, int i10, long j10, org.telegram.ui.l0 l0Var) {
        super(context);
        this.d = true;
        this.D = new org.telegram.ui.Components.t5(this, 0L, 350L, gr.h);
        this.E = 1.0f;
        this.G = new ArrayList();
        this.H = new ArrayList();
        this.I = new HashSet();
        this.K = new DecelerateInterpolator();
        this.L = new LinearInterpolator();
        this.a = i10;
        this.b = j10;
        this.c = l0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a9 A[LOOP:3: B:63:0x01a5->B:65:0x01a9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        TLRPC.EmojiStatus emojiStatus;
        v5 G;
        boolean z10;
        int i10;
        ArrayList arrayList;
        int i11;
        int i12;
        f0 f0Var;
        f0 f0Var2;
        int i13 = this.a;
        if (!vp.r1(i13).z7) {
            return;
        }
        this.J = vp.r1(i13).L6;
        ArrayList arrayList2 = this.G;
        arrayList2.clear();
        ArrayList arrayList3 = this.H;
        arrayList2.addAll(arrayList3);
        arrayList3.clear();
        HashSet hashSet = this.I;
        hashSet.clear();
        long j10 = this.b;
        if (j10 >= 0) {
            TLRPC.User Z1 = vp.r1(i13).Z1(Long.valueOf(j10));
            if (Z1 != null) {
                emojiStatus = Z1.emoji_status;
                if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                    hashSet.add(Long.valueOf(((TLRPC.TL_emojiStatusCollectible) emojiStatus).collectible_id));
                }
                int i14 = 0;
                G = e6.y(i13, false).G(j10, true);
                this.F = G;
                if (G != null) {
                    for (int i15 = 0; i15 < this.F.l.size(); i15++) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.F.l.get(i15);
                        if (!savedStarGift.unsaved && savedStarGift.pinned_to_top) {
                            TL_stars.StarGift starGift = savedStarGift.gift;
                            if (starGift instanceof TL_stars.TL_starGiftUnique) {
                                f0 f0Var3 = new f0(this, (TL_stars.TL_starGiftUnique) starGift);
                                long j11 = f0Var3.a;
                                if (!hashSet.contains(Long.valueOf(j11))) {
                                    arrayList3.add(f0Var3);
                                    hashSet.add(Long.valueOf(j11));
                                }
                            }
                        }
                    }
                }
                if (arrayList3.size() == arrayList2.size()) {
                    for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                        f0 f0Var4 = (f0) arrayList3.get(i16);
                        f0 f0Var5 = (f0) arrayList2.get(i16);
                        f0Var4.getClass();
                        if (f0Var5 != null && f0Var5.a == f0Var4.a) {
                        }
                    }
                    z10 = false;
                    i10 = 0;
                    while (i10 < arrayList3.size()) {
                        f0 f0Var6 = (f0) arrayList3.get(i10);
                        int i17 = i14;
                        while (true) {
                            if (i17 >= arrayList2.size()) {
                                f0Var2 = null;
                                break;
                            } else {
                                if (((f0) arrayList2.get(i17)).a == f0Var6.a) {
                                    f0Var2 = (f0) arrayList2.get(i17);
                                    break;
                                }
                                i17++;
                            }
                        }
                        if (f0Var2 != null) {
                            f0Var6.getClass();
                            f0Var6.h = f0Var2.h;
                            f0Var6.j = f0Var2.j;
                            f0Var6.i = f0Var2.i;
                            f0Var6.k = f0Var2.k;
                            f0Var6.f = f0Var2.f;
                            f0Var6.g = f0Var2.g;
                        } else {
                            float L = org.telegram.messenger.i0.L(22.5f);
                            int i18 = f0Var6.d;
                            f0Var6.h = new RadialGradient(0.0f, 0.0f, L, new int[]{i18, org.telegram.ui.ActionBar.t6.r1(0.0f, i18)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                            Paint paint = new Paint(1);
                            f0Var6.i = paint;
                            paint.setShader(f0Var6.h);
                            TLRPC.Document document = f0Var6.b;
                            if (document != null) {
                                f0Var6.j = org.telegram.ui.Components.f5.l(i13, i14, document);
                            } else {
                                f0Var6.j = org.telegram.ui.Components.f5.m(i13, f0Var6.c, null, i14);
                            }
                            org.telegram.ui.Components.t5 t5Var = new org.telegram.ui.Components.t5(this, 0L, 320L, (TimeInterpolator) null);
                            f0Var6.k = t5Var;
                            t5Var.e(true, 0.0f);
                            if (isAttachedToWindow()) {
                                f0Var6.j.a(this);
                            }
                        }
                        i10++;
                        i14 = 0;
                    }
                    arrayList = new ArrayList();
                    for (i11 = 0; i11 < this.J; i11 = c3.i0.j(i11, i11, 1, arrayList)) {
                    }
                    for (i12 = 0; i12 < arrayList2.size(); i12++) {
                        f0 f0Var7 = (f0) arrayList2.get(i12);
                        int i19 = 0;
                        while (true) {
                            if (i19 >= arrayList3.size()) {
                                f0Var = null;
                                break;
                            } else {
                                if (((f0) arrayList3.get(i19)).a == f0Var7.a) {
                                    f0Var = (f0) arrayList3.get(i19);
                                    break;
                                }
                                i19++;
                            }
                        }
                        if (f0Var == null) {
                            f0Var7.j.n(this);
                            f0Var7.j = null;
                            f0Var7.h = null;
                        } else {
                            arrayList.remove(Integer.valueOf(f0Var7.g));
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        com.google.android.gms.common.api.internal.r rVar = new com.google.android.gms.common.api.internal.r(arrayList);
                        for (int i20 = 0; i20 < arrayList3.size(); i20++) {
                            f0 f0Var8 = (f0) arrayList3.get(i20);
                            if (f0Var8.g == -1) {
                                f0Var8.g = ((Integer) rVar.c()).intValue();
                            }
                        }
                    }
                    if (z10) {
                        invalidate();
                        return;
                    }
                    return;
                }
                z10 = true;
                i10 = 0;
                while (i10 < arrayList3.size()) {
                }
                arrayList = new ArrayList();
                while (i11 < this.J) {
                }
                while (i12 < arrayList2.size()) {
                }
                if (!arrayList.isEmpty()) {
                }
                if (z10) {
                }
            }
            emojiStatus = null;
            if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
            }
            int i142 = 0;
            G = e6.y(i13, false).G(j10, true);
            this.F = G;
            if (G != null) {
            }
            if (arrayList3.size() == arrayList2.size()) {
            }
            z10 = true;
            i10 = 0;
            while (i10 < arrayList3.size()) {
            }
            arrayList = new ArrayList();
            while (i11 < this.J) {
            }
            while (i12 < arrayList2.size()) {
            }
            if (!arrayList.isEmpty()) {
            }
            if (z10) {
            }
        } else {
            TLRPC.User Z12 = vp.r1(i13).Z1(Long.valueOf(-j10));
            if (Z12 != null) {
                emojiStatus = Z12.emoji_status;
                if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                }
                int i1422 = 0;
                G = e6.y(i13, false).G(j10, true);
                this.F = G;
                if (G != null) {
                }
                if (arrayList3.size() == arrayList2.size()) {
                }
                z10 = true;
                i10 = 0;
                while (i10 < arrayList3.size()) {
                }
                arrayList = new ArrayList();
                while (i11 < this.J) {
                }
                while (i12 < arrayList2.size()) {
                }
                if (!arrayList.isEmpty()) {
                }
                if (z10) {
                }
            }
            emojiStatus = null;
            if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
            }
            int i14222 = 0;
            G = e6.y(i13, false).G(j10, true);
            this.F = G;
            if (G != null) {
            }
            if (arrayList3.size() == arrayList2.size()) {
            }
            z10 = true;
            i10 = 0;
            while (i10 < arrayList3.size()) {
            }
            arrayList = new ArrayList();
            while (i11 < this.J) {
            }
            while (i12 < arrayList2.size()) {
            }
            if (!arrayList.isEmpty()) {
            }
            if (z10) {
            }
        }
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == zs.G3 && ((Long) objArr[0]).longValue() == this.b) {
            a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x018a  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        float L;
        int L2;
        float f10;
        float l4;
        float f11;
        ArrayList arrayList;
        float f12;
        f0 f0Var;
        boolean z10;
        g0 g0Var = this;
        ArrayList arrayList2 = g0Var.H;
        if (arrayList2.isEmpty()) {
            return;
        }
        float f13 = 1.0f;
        if (g0Var.e < 1.0f) {
            float f14 = 0.0f;
            if (g0Var.f <= 0.0f) {
                return;
            }
            View view = g0Var.c;
            float x10 = view.getX();
            float y3 = view.getY();
            float scaleX = view.getScaleX() * view.getWidth();
            float scaleY = view.getScaleY() * view.getHeight();
            float N = org.telegram.messenger.i0.N(96.0f);
            float f15 = 2.0f;
            float min = Math.min(x10, (g0Var.getWidth() - N) / 2.0f);
            float max = Math.max(y3, (g0Var.y - N) / 2.0f);
            float max2 = Math.max(scaleX, N);
            float max3 = Math.max(scaleY, N);
            canvas.save();
            canvas.clipRect(0.0f, 0.0f, g0Var.getWidth(), g0Var.x);
            float f16 = (max2 / 2.0f) + min;
            float f17 = (max3 / 2.0f) + max;
            float f18 = (scaleX / 2.0f) + x10;
            float f19 = (scaleY / 2.0f) + y3;
            float f20 = g0Var.x;
            float f21 = f20 / g0Var.y;
            float l10 = Utilities.l((f20 - (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + org.telegram.messenger.i0.m)) / org.telegram.messenger.i0.L(50.0f));
            boolean z11 = false;
            int i10 = 0;
            while (i10 < arrayList2.size()) {
                f0 f0Var2 = (f0) arrayList2.get(i10);
                float f22 = f15;
                float e = f0Var2.k.e(z11, f13);
                float T1 = org.telegram.messenger.i0.T1(0.5f, f13, e);
                float f23 = f14;
                int i11 = i10;
                float A = org.telegram.messenger.m5.A(f13, g0Var.n, (f13 - g0Var.e) * e, l10);
                int i12 = f0Var2.g;
                float f24 = 1.6f;
                float f25 = f13;
                if (i12 != 0) {
                    if (i12 != 1) {
                        if (i12 == 2) {
                            f7 = l10;
                            L = ((f16 * f22) / 3.0f) - (org.telegram.messenger.i0.L(12.0f) * f21);
                            f10 = (max + max3) - org.telegram.messenger.i0.L(16.0f);
                        } else if (i12 == 3) {
                            f7 = l10;
                            L = (org.telegram.messenger.i0.L(20.0f) * f21) + (1.5f * f16);
                            L2 = org.telegram.messenger.i0.L(13.0f);
                        } else if (i12 != 4) {
                            L = (org.telegram.messenger.i0.L(12.0f) * f21) + ((4.0f * f16) / 3.0f);
                            f7 = l10;
                            f10 = (max + max3) - org.telegram.messenger.i0.L(16.0f);
                        } else {
                            f7 = l10;
                            L = (org.telegram.messenger.i0.L(12.0f) * f21) + ((f16 * 4.0f) / 3.0f);
                            f10 = max - org.telegram.messenger.i0.L(4.0f);
                        }
                        f24 = 0.9f;
                        float min2 = (!g0Var.h || e >= f25) ? g0Var.f : Math.min(e, g0Var.f);
                        float f26 = f24 * 0.2f;
                        l4 = min2 >= f25 - f26 ? f25 : Utilities.l(((min2 - 0.32000002f) + f26) / 0.67999995f);
                        if (l4 < f25) {
                            L = org.telegram.messenger.i0.T1(f18, L, g0Var.K.getInterpolation(l4));
                            f10 = org.telegram.messenger.i0.T1(f19, f10, g0Var.L.getInterpolation(l4));
                            T1 = org.telegram.messenger.i0.T1(T1 / f22, T1, l4);
                        }
                        if (A <= f23) {
                            f11 = f19;
                            arrayList = arrayList2;
                            f12 = f23;
                            z10 = false;
                        } else {
                            float L3 = org.telegram.messenger.i0.L(45.0f);
                            float f27 = T1;
                            float f28 = L3 / f22;
                            f11 = f19;
                            arrayList = arrayList2;
                            f0Var2.l.set(L - f28, f10 - f28, L + f28, f10 + f28);
                            canvas.save();
                            canvas.translate(L, f10);
                            f12 = f23;
                            canvas.rotate(f12);
                            float a2 = f0Var2.m.a(0.1f) * f27;
                            canvas.scale(a2, a2);
                            f0Var2.f.d();
                            f0Var2.f.b(canvas, f0Var2.d, A);
                            Paint paint = f0Var2.i;
                            if (paint != null) {
                                paint.setAlpha((int) (A * 255.0f * f25));
                                float f29 = (-L3) / f22;
                                f0Var = f0Var2;
                                z10 = false;
                                canvas.drawRect(f29, f29, f28, f28, f0Var2.i);
                            } else {
                                f0Var = f0Var2;
                                z10 = false;
                            }
                            if (f0Var.j != null) {
                                int L4 = org.telegram.messenger.i0.L(24.0f);
                                int i13 = (-L4) / 2;
                                int i14 = L4 / 2;
                                f0Var.j.setBounds(i13, i13, i14, i14);
                                f0Var.j.setAlpha((int) (A * 255.0f));
                                f0Var.j.draw(canvas);
                            }
                            canvas.restore();
                        }
                        i10 = i11 + 1;
                        f14 = f12;
                        f15 = f22;
                        z11 = z10;
                        f19 = f11;
                        f13 = f25;
                        arrayList2 = arrayList;
                        l10 = f7;
                        g0Var = this;
                    } else {
                        f7 = l10;
                        L = ((f16 * f22) / 3.0f) - (org.telegram.messenger.i0.L(6.0f) * f21);
                        f10 = max - org.telegram.messenger.i0.L(4.0f);
                    }
                    f24 = f23;
                    if (g0Var.h) {
                    }
                    float f262 = f24 * 0.2f;
                    if (min2 >= f25 - f262) {
                    }
                    if (l4 < f25) {
                    }
                    if (A <= f23) {
                    }
                    i10 = i11 + 1;
                    f14 = f12;
                    f15 = f22;
                    z11 = z10;
                    f19 = f11;
                    f13 = f25;
                    arrayList2 = arrayList;
                    l10 = f7;
                    g0Var = this;
                } else {
                    f7 = l10;
                    L = (f16 / f22) - (org.telegram.messenger.i0.L(20.0f) * f21);
                    L2 = org.telegram.messenger.i0.L(13.0f);
                }
                f10 = f17 - L2;
                if (g0Var.h) {
                }
                float f2622 = f24 * 0.2f;
                if (min2 >= f25 - f2622) {
                }
                if (l4 < f25) {
                }
                if (A <= f23) {
                }
                i10 = i11 + 1;
                f14 = f12;
                f15 = f22;
                z11 = z10;
                f19 = f11;
                f13 = f25;
                arrayList2 = arrayList;
                l10 = f7;
                g0Var = this;
            }
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        zs.f(this.a).c(this, zs.G3);
        ArrayList arrayList = this.H;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((f0) obj).j.a(this);
        }
        a();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        zs.f(this.a).n(this, zs.G3);
        ArrayList arrayList = this.H;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((f0) obj).j.n(this);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        f0 f0Var;
        f0 f0Var2;
        if (!this.d) {
            return false;
        }
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.H;
            if (i10 >= arrayList.size()) {
                f0Var = null;
                break;
            }
            if (((f0) arrayList.get(i10)).l.contains(x10, y3)) {
                f0Var = (f0) arrayList.get(i10);
                break;
            }
            i10++;
        }
        if (motionEvent.getAction() == 0) {
            this.M = f0Var;
            if (f0Var != null) {
                f0Var.m.c(true);
            }
        } else if (motionEvent.getAction() == 2) {
            f0 f0Var3 = this.M;
            if (f0Var3 != f0Var && f0Var3 != null) {
                f0Var3.m.c(false);
                this.M = null;
            }
        } else if (motionEvent.getAction() == 1) {
            f0 f0Var4 = this.M;
            if (f0Var4 != null) {
                gf.f.r(getContext(), "https://t.me/nft/" + f0Var4.e);
                this.M.m.c(false);
                this.M = null;
            }
        } else if (motionEvent.getAction() == 3 && (f0Var2 = this.M) != null) {
            f0Var2.m.c(false);
            this.M = null;
        }
        return this.M != null;
    }

    public void setActionBarActionMode(float f7) {
        this.n = f7;
        invalidate();
    }

    public void setActive(boolean z10) {
        this.d = z10;
    }

    public void setExpandCoords(float f7) {
        this.x = f7;
        invalidate();
    }

    public void setExpandProgress(float f7) {
        if (this.e != f7) {
            this.e = f7;
            invalidate();
        }
    }

    public void setProgressToStoriesInsets(float f7) {
        if (this.E == f7) {
            return;
        }
        this.E = f7;
        invalidate();
    }
}
