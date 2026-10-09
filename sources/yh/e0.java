package yh;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.hs;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class e0 extends View implements NotificationCenter.NotificationCenterDelegate {
    public float E;
    public e5 F;
    public final ArrayList G;
    public final ArrayList H;
    public final HashSet I;
    public int J;
    public final DecelerateInterpolator K;
    public final LinearInterpolator L;
    public d0 M;
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
    public float v;
    public float w;
    public float x;
    public final org.telegram.ui.Components.g6 y;

    public e0(Context context, int i10, long j3, org.telegram.ui.k0 k0Var) {
        super(context);
        this.d = true;
        this.y = new org.telegram.ui.Components.g6(this, 0L, 350L, hs.h);
        this.E = 1.0f;
        this.G = new ArrayList();
        this.H = new ArrayList();
        this.I = new HashSet();
        this.K = new DecelerateInterpolator();
        this.L = new LinearInterpolator();
        this.a = i10;
        this.b = j3;
        this.c = k0Var;
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
        e5 G;
        boolean z10;
        int i10;
        ArrayList arrayList;
        int i11;
        int i12;
        d0 d0Var;
        d0 d0Var2;
        int i13 = this.a;
        if (!MessagesController.getInstance(i13).enableGiftsInProfile) {
            return;
        }
        this.J = MessagesController.getInstance(i13).stargiftsPinnedToTopLimit;
        ArrayList arrayList2 = this.G;
        arrayList2.clear();
        ArrayList arrayList3 = this.H;
        arrayList2.addAll(arrayList3);
        arrayList3.clear();
        HashSet hashSet = this.I;
        hashSet.clear();
        long j3 = this.b;
        if (j3 >= 0) {
            TLRPC.User user = MessagesController.getInstance(i13).getUser(Long.valueOf(j3));
            if (user != null) {
                emojiStatus = user.emoji_status;
                if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                    hashSet.add(Long.valueOf(((TLRPC.TL_emojiStatusCollectible) emojiStatus).collectible_id));
                }
                int i14 = 0;
                G = m5.y(i13, false).G(j3, true);
                this.F = G;
                if (G != null) {
                    for (int i15 = 0; i15 < this.F.l.size(); i15++) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.F.l.get(i15);
                        if (!savedStarGift.unsaved && savedStarGift.pinned_to_top) {
                            TL_stars.StarGift starGift = savedStarGift.gift;
                            if (starGift instanceof TL_stars.TL_starGiftUnique) {
                                d0 d0Var3 = new d0(this, (TL_stars.TL_starGiftUnique) starGift);
                                long j10 = d0Var3.a;
                                if (!hashSet.contains(Long.valueOf(j10))) {
                                    arrayList3.add(d0Var3);
                                    hashSet.add(Long.valueOf(j10));
                                }
                            }
                        }
                    }
                }
                if (arrayList3.size() == arrayList2.size()) {
                    for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                        d0 d0Var4 = (d0) arrayList3.get(i16);
                        d0 d0Var5 = (d0) arrayList2.get(i16);
                        d0Var4.getClass();
                        if (d0Var5 != null && d0Var5.a == d0Var4.a) {
                        }
                    }
                    z10 = false;
                    i10 = 0;
                    while (i10 < arrayList3.size()) {
                        d0 d0Var6 = (d0) arrayList3.get(i10);
                        int i17 = i14;
                        while (true) {
                            if (i17 >= arrayList2.size()) {
                                d0Var2 = null;
                                break;
                            } else {
                                if (((d0) arrayList2.get(i17)).a == d0Var6.a) {
                                    d0Var2 = (d0) arrayList2.get(i17);
                                    break;
                                }
                                i17++;
                            }
                        }
                        if (d0Var2 != null) {
                            d0Var6.getClass();
                            d0Var6.h = d0Var2.h;
                            d0Var6.j = d0Var2.j;
                            d0Var6.i = d0Var2.i;
                            d0Var6.k = d0Var2.k;
                            d0Var6.f = d0Var2.f;
                            d0Var6.g = d0Var2.g;
                        } else {
                            float dp = AndroidUtilities.dp(22.5f);
                            int i18 = d0Var6.d;
                            d0Var6.h = new RadialGradient(0.0f, 0.0f, dp, new int[]{i18, org.telegram.ui.ActionBar.i6.m1(0.0f, i18)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                            Paint paint = new Paint(1);
                            d0Var6.i = paint;
                            paint.setShader(d0Var6.h);
                            TLRPC.Document document = d0Var6.b;
                            if (document != null) {
                                d0Var6.j = org.telegram.ui.Components.s5.m(i13, i14, document);
                            } else {
                                d0Var6.j = org.telegram.ui.Components.s5.n(i13, d0Var6.c, null, i14);
                            }
                            org.telegram.ui.Components.g6 g6Var = new org.telegram.ui.Components.g6(this, 0L, 320L, (TimeInterpolator) null);
                            d0Var6.k = g6Var;
                            g6Var.d(0.0f, true);
                            if (isAttachedToWindow()) {
                                d0Var6.j.a(this);
                            }
                        }
                        i10++;
                        i14 = 0;
                    }
                    arrayList = new ArrayList();
                    for (i11 = 0; i11 < this.J; i11 = com.google.android.gms.internal.vision.e2.e(i11, i11, 1, arrayList)) {
                    }
                    for (i12 = 0; i12 < arrayList2.size(); i12++) {
                        d0 d0Var7 = (d0) arrayList2.get(i12);
                        int i19 = 0;
                        while (true) {
                            if (i19 >= arrayList3.size()) {
                                d0Var = null;
                                break;
                            } else {
                                if (((d0) arrayList3.get(i19)).a == d0Var7.a) {
                                    d0Var = (d0) arrayList3.get(i19);
                                    break;
                                }
                                i19++;
                            }
                        }
                        if (d0Var == null) {
                            d0Var7.j.o(this);
                            d0Var7.j = null;
                            d0Var7.h = null;
                        } else {
                            arrayList.remove(Integer.valueOf(d0Var7.g));
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        com.google.android.gms.common.api.internal.r rVar = new com.google.android.gms.common.api.internal.r(arrayList);
                        for (int i20 = 0; i20 < arrayList3.size(); i20++) {
                            d0 d0Var8 = (d0) arrayList3.get(i20);
                            if (d0Var8.g == -1) {
                                d0Var8.g = ((Integer) rVar.c()).intValue();
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
            G = m5.y(i13, false).G(j3, true);
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
            TLRPC.User user2 = MessagesController.getInstance(i13).getUser(Long.valueOf(-j3));
            if (user2 != null) {
                emojiStatus = user2.emoji_status;
                if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                }
                int i1422 = 0;
                G = m5.y(i13, false).G(j3, true);
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
            G = m5.y(i13, false).G(j3, true);
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

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starUserGiftsLoaded && ((Long) objArr[0]).longValue() == this.b) {
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
        float dp;
        int dp2;
        float f10;
        float clamp01;
        float f11;
        ArrayList arrayList;
        float f12;
        d0 d0Var;
        boolean z10;
        e0 e0Var = this;
        ArrayList arrayList2 = e0Var.H;
        if (arrayList2.isEmpty()) {
            return;
        }
        float f13 = 1.0f;
        if (e0Var.e < 1.0f) {
            float f14 = 0.0f;
            if (e0Var.f <= 0.0f) {
                return;
            }
            View view = e0Var.c;
            float x10 = view.getX();
            float y3 = view.getY();
            float scaleX = view.getScaleX() * view.getWidth();
            float scaleY = view.getScaleY() * view.getHeight();
            float dpf2 = AndroidUtilities.dpf2(96.0f);
            float f15 = 2.0f;
            float min = Math.min(x10, (e0Var.getWidth() - dpf2) / 2.0f);
            float max = Math.max(y3, (e0Var.x - dpf2) / 2.0f);
            float max2 = Math.max(scaleX, dpf2);
            float max3 = Math.max(scaleY, dpf2);
            canvas.save();
            canvas.clipRect(0.0f, 0.0f, e0Var.getWidth(), e0Var.w);
            float f16 = (max2 / 2.0f) + min;
            float f17 = (max3 / 2.0f) + max;
            float f18 = (scaleX / 2.0f) + x10;
            float f19 = (scaleY / 2.0f) + y3;
            float f20 = e0Var.w;
            float f21 = f20 / e0Var.x;
            float clamp012 = Utilities.clamp01((f20 - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight)) / AndroidUtilities.dp(50.0f));
            boolean z11 = false;
            int i10 = 0;
            while (i10 < arrayList2.size()) {
                d0 d0Var2 = (d0) arrayList2.get(i10);
                float f22 = f15;
                float d = d0Var2.k.d(f13, z11);
                float lerp = AndroidUtilities.lerp(0.5f, f13, d);
                float f23 = f14;
                int i11 = i10;
                float z12 = org.telegram.messenger.q.z(f13, e0Var.n, (f13 - e0Var.e) * d, clamp012);
                int i12 = d0Var2.g;
                float f24 = 1.6f;
                float f25 = f13;
                if (i12 != 0) {
                    if (i12 != 1) {
                        if (i12 == 2) {
                            f7 = clamp012;
                            dp = ((f16 * f22) / 3.0f) - (AndroidUtilities.dp(12.0f) * f21);
                            f10 = (max + max3) - AndroidUtilities.dp(16.0f);
                        } else if (i12 == 3) {
                            f7 = clamp012;
                            dp = (AndroidUtilities.dp(20.0f) * f21) + (1.5f * f16);
                            dp2 = AndroidUtilities.dp(13.0f);
                        } else if (i12 != 4) {
                            dp = (AndroidUtilities.dp(12.0f) * f21) + ((4.0f * f16) / 3.0f);
                            f7 = clamp012;
                            f10 = (max + max3) - AndroidUtilities.dp(16.0f);
                        } else {
                            f7 = clamp012;
                            dp = (AndroidUtilities.dp(12.0f) * f21) + ((f16 * 4.0f) / 3.0f);
                            f10 = max - AndroidUtilities.dp(4.0f);
                        }
                        f24 = 0.9f;
                        float min2 = (!e0Var.h || d >= f25) ? e0Var.f : Math.min(d, e0Var.f);
                        float f26 = f24 * 0.2f;
                        clamp01 = min2 >= f25 - f26 ? f25 : Utilities.clamp01(((min2 - 0.32000002f) + f26) / 0.67999995f);
                        if (clamp01 < f25) {
                            dp = AndroidUtilities.lerp(f18, dp, e0Var.K.getInterpolation(clamp01));
                            f10 = AndroidUtilities.lerp(f19, f10, e0Var.L.getInterpolation(clamp01));
                            lerp = AndroidUtilities.lerp(lerp / f22, lerp, clamp01);
                        }
                        if (z12 <= f23) {
                            f11 = f19;
                            arrayList = arrayList2;
                            f12 = f23;
                            z10 = false;
                        } else {
                            float dp3 = AndroidUtilities.dp(45.0f);
                            float f27 = lerp;
                            float f28 = dp3 / f22;
                            f11 = f19;
                            arrayList = arrayList2;
                            d0Var2.l.set(dp - f28, f10 - f28, dp + f28, f10 + f28);
                            canvas.save();
                            canvas.translate(dp, f10);
                            f12 = f23;
                            canvas.rotate(f12);
                            float a2 = d0Var2.m.a(0.1f) * f27;
                            canvas.scale(a2, a2);
                            d0Var2.f.d();
                            d0Var2.f.b(canvas, d0Var2.d, z12);
                            Paint paint = d0Var2.i;
                            if (paint != null) {
                                paint.setAlpha((int) (z12 * 255.0f * f25));
                                float f29 = (-dp3) / f22;
                                d0Var = d0Var2;
                                z10 = false;
                                canvas.drawRect(f29, f29, f28, f28, d0Var2.i);
                            } else {
                                d0Var = d0Var2;
                                z10 = false;
                            }
                            if (d0Var.j != null) {
                                int dp4 = AndroidUtilities.dp(24.0f);
                                int i13 = (-dp4) / 2;
                                int i14 = dp4 / 2;
                                d0Var.j.setBounds(i13, i13, i14, i14);
                                d0Var.j.setAlpha((int) (z12 * 255.0f));
                                d0Var.j.draw(canvas);
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
                        clamp012 = f7;
                        e0Var = this;
                    } else {
                        f7 = clamp012;
                        dp = ((f16 * f22) / 3.0f) - (AndroidUtilities.dp(6.0f) * f21);
                        f10 = max - AndroidUtilities.dp(4.0f);
                    }
                    f24 = f23;
                    if (e0Var.h) {
                    }
                    float f262 = f24 * 0.2f;
                    if (min2 >= f25 - f262) {
                    }
                    if (clamp01 < f25) {
                    }
                    if (z12 <= f23) {
                    }
                    i10 = i11 + 1;
                    f14 = f12;
                    f15 = f22;
                    z11 = z10;
                    f19 = f11;
                    f13 = f25;
                    arrayList2 = arrayList;
                    clamp012 = f7;
                    e0Var = this;
                } else {
                    f7 = clamp012;
                    dp = (f16 / f22) - (AndroidUtilities.dp(20.0f) * f21);
                    dp2 = AndroidUtilities.dp(13.0f);
                }
                f10 = f17 - dp2;
                if (e0Var.h) {
                }
                float f2622 = f24 * 0.2f;
                if (min2 >= f25 - f2622) {
                }
                if (clamp01 < f25) {
                }
                if (z12 <= f23) {
                }
                i10 = i11 + 1;
                f14 = f12;
                f15 = f22;
                z11 = z10;
                f19 = f11;
                f13 = f25;
                arrayList2 = arrayList;
                clamp012 = f7;
                e0Var = this;
            }
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.a).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        ArrayList arrayList = this.H;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((d0) obj).j.a(this);
        }
        a();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.a).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
        ArrayList arrayList = this.H;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((d0) obj).j.o(this);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        d0 d0Var;
        d0 d0Var2;
        if (!this.d) {
            return false;
        }
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.H;
            if (i10 >= arrayList.size()) {
                d0Var = null;
                break;
            }
            if (((d0) arrayList.get(i10)).l.contains(x10, y3)) {
                d0Var = (d0) arrayList.get(i10);
                break;
            }
            i10++;
        }
        if (motionEvent.getAction() == 0) {
            this.M = d0Var;
            if (d0Var != null) {
                d0Var.m.c(true);
            }
        } else if (motionEvent.getAction() == 2) {
            d0 d0Var3 = this.M;
            if (d0Var3 != d0Var && d0Var3 != null) {
                d0Var3.m.c(false);
                this.M = null;
            }
        } else if (motionEvent.getAction() == 1) {
            d0 d0Var4 = this.M;
            if (d0Var4 != null) {
                of.f.s(getContext(), "https://t.me/nft/" + d0Var4.e);
                this.M.m.c(false);
                this.M = null;
            }
        } else if (motionEvent.getAction() == 3 && (d0Var2 = this.M) != null) {
            d0Var2.m.c(false);
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
        this.w = f7;
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
