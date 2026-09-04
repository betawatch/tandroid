package zh;

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
import org.telegram.ui.Components.pr;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final class g0 extends View implements NotificationCenter.NotificationCenterDelegate {
    public float E;
    public j5 F;
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
    public float v;
    public float w;
    public float x;
    public final org.telegram.ui.Components.e6 y;

    public g0(Context context, int i10, long j3, org.telegram.ui.j0 j0Var) {
        super(context);
        this.d = true;
        this.y = new org.telegram.ui.Components.e6(this, 0L, 350L, pr.h);
        this.E = 1.0f;
        this.G = new ArrayList();
        this.H = new ArrayList();
        this.I = new HashSet();
        this.K = new DecelerateInterpolator();
        this.L = new LinearInterpolator();
        this.a = i10;
        this.b = j3;
        this.c = j0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a8 A[LOOP:3: B:63:0x01a4->B:65:0x01a8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        TLRPC.EmojiStatus emojiStatus;
        j5 G;
        boolean z10;
        int i10;
        ArrayList arrayList;
        int i11;
        int i12;
        f0 f0Var;
        f0 f0Var2;
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
                G = s5.y(i13, false).G(j3, true);
                this.F = G;
                if (G != null) {
                    for (int i15 = 0; i15 < this.F.l.size(); i15++) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.F.l.get(i15);
                        if (!savedStarGift.unsaved && savedStarGift.pinned_to_top) {
                            TL_stars.StarGift starGift = savedStarGift.gift;
                            if (starGift instanceof TL_stars.TL_starGiftUnique) {
                                f0 f0Var3 = new f0(this, (TL_stars.TL_starGiftUnique) starGift);
                                long j10 = f0Var3.a;
                                if (!hashSet.contains(Long.valueOf(j10))) {
                                    arrayList3.add(f0Var3);
                                    hashSet.add(Long.valueOf(j10));
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
                        int i17 = 0;
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
                            float dp = AndroidUtilities.dp(22.5f);
                            int i18 = f0Var6.d;
                            f0Var6.h = new RadialGradient(0.0f, 0.0f, dp, new int[]{i18, org.telegram.ui.ActionBar.j6.l1(0.0f, i18)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                            Paint paint = new Paint(1);
                            f0Var6.i = paint;
                            paint.setShader(f0Var6.h);
                            TLRPC.Document document = f0Var6.b;
                            if (document != null) {
                                f0Var6.j = org.telegram.ui.Components.q5.m(i13, i14, document);
                            } else {
                                f0Var6.j = org.telegram.ui.Components.q5.n(i13, f0Var6.c, null, i14);
                            }
                            org.telegram.ui.Components.e6 e6Var = new org.telegram.ui.Components.e6(this, 0L, 320L, (TimeInterpolator) null);
                            f0Var6.k = e6Var;
                            e6Var.d(0.0f, true);
                            if (isAttachedToWindow()) {
                                f0Var6.j.a(this);
                            }
                        }
                        i10++;
                        i14 = 0;
                    }
                    arrayList = new ArrayList();
                    for (i11 = 0; i11 < this.J; i11 = com.google.android.gms.internal.vision.e2.e(i11, i11, 1, arrayList)) {
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
                            f0Var7.j.o(this);
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
            G = s5.y(i13, false).G(j3, true);
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
                G = s5.y(i13, false).G(j3, true);
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
            G = s5.y(i13, false).G(j3, true);
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

    /* JADX WARN: Removed duplicated region for block: B:24:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x018e  */
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
        f0 f0Var;
        g0 g0Var = this;
        ArrayList arrayList2 = g0Var.H;
        if (arrayList2.isEmpty()) {
            return;
        }
        float f12 = 1.0f;
        if (g0Var.e >= 1.0f || g0Var.f <= 0.0f) {
            return;
        }
        View view = g0Var.c;
        float x10 = view.getX();
        float y3 = view.getY();
        float scaleX = view.getScaleX() * view.getWidth();
        float scaleY = view.getScaleY() * view.getHeight();
        float dpf2 = AndroidUtilities.dpf2(96.0f);
        float min = Math.min(x10, (g0Var.getWidth() - dpf2) / 2.0f);
        float max = Math.max(y3, (g0Var.x - dpf2) / 2.0f);
        float max2 = Math.max(scaleX, dpf2);
        float max3 = Math.max(scaleY, dpf2);
        canvas.save();
        canvas.clipRect(0.0f, 0.0f, g0Var.getWidth(), g0Var.w);
        float f13 = (max2 / 2.0f) + min;
        float f14 = (max3 / 2.0f) + max;
        float f15 = (scaleX / 2.0f) + x10;
        float f16 = (scaleY / 2.0f) + y3;
        float f17 = g0Var.w;
        float f18 = f17 / g0Var.x;
        float clamp012 = Utilities.clamp01((f17 - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight)) / AndroidUtilities.dp(50.0f));
        boolean z10 = false;
        int i10 = 0;
        while (i10 < arrayList2.size()) {
            f0 f0Var2 = (f0) arrayList2.get(i10);
            float d = f0Var2.k.d(f12, z10);
            float lerp = AndroidUtilities.lerp(0.5f, f12, d);
            int i11 = i10;
            float A = org.telegram.messenger.w1.A(f12, g0Var.n, (f12 - g0Var.e) * d, clamp012);
            int i12 = f0Var2.g;
            float f19 = 1.6f;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 == 2) {
                        f7 = clamp012;
                        dp = ((f13 * 2.0f) / 3.0f) - (AndroidUtilities.dp(12.0f) * f18);
                        f10 = (max + max3) - AndroidUtilities.dp(16.0f);
                    } else if (i12 == 3) {
                        f7 = clamp012;
                        dp = (AndroidUtilities.dp(20.0f) * f18) + (1.5f * f13);
                        dp2 = AndroidUtilities.dp(13.0f);
                    } else if (i12 != 4) {
                        dp = (AndroidUtilities.dp(12.0f) * f18) + ((4.0f * f13) / 3.0f);
                        f7 = clamp012;
                        f10 = (max + max3) - AndroidUtilities.dp(16.0f);
                    } else {
                        f7 = clamp012;
                        dp = (AndroidUtilities.dp(12.0f) * f18) + ((f13 * 4.0f) / 3.0f);
                        f10 = max - AndroidUtilities.dp(4.0f);
                    }
                    f19 = 0.9f;
                    float min2 = (!g0Var.h || d >= 1.0f) ? g0Var.f : Math.min(d, g0Var.f);
                    float f20 = f19 * 0.2f;
                    clamp01 = min2 >= 1.0f - f20 ? 1.0f : Utilities.clamp01(((min2 - 0.32000002f) + f20) / 0.67999995f);
                    if (clamp01 < 1.0f) {
                        dp = AndroidUtilities.lerp(f15, dp, g0Var.K.getInterpolation(clamp01));
                        f10 = AndroidUtilities.lerp(f16, f10, g0Var.L.getInterpolation(clamp01));
                        lerp = AndroidUtilities.lerp(lerp / 2.0f, lerp, clamp01);
                    }
                    if (A <= 0.0f) {
                        f11 = f16;
                        arrayList = arrayList2;
                    } else {
                        float dp3 = AndroidUtilities.dp(45.0f);
                        float f21 = lerp;
                        float f22 = dp3 / 2.0f;
                        f11 = f16;
                        arrayList = arrayList2;
                        f0Var2.l.set(dp - f22, f10 - f22, dp + f22, f10 + f22);
                        canvas.save();
                        canvas.translate(dp, f10);
                        canvas.rotate(0.0f);
                        float a2 = f0Var2.m.a(0.1f) * f21;
                        canvas.scale(a2, a2);
                        f0Var2.f.d();
                        f0Var2.f.b(canvas, f0Var2.d, A);
                        Paint paint = f0Var2.i;
                        if (paint != null) {
                            paint.setAlpha((int) (A * 255.0f * 1.0f));
                            float f23 = (-dp3) / 2.0f;
                            f0Var = f0Var2;
                            canvas.drawRect(f23, f23, f22, f22, f0Var2.i);
                        } else {
                            f0Var = f0Var2;
                        }
                        if (f0Var.j != null) {
                            int dp4 = AndroidUtilities.dp(24.0f);
                            int i13 = (-dp4) / 2;
                            int i14 = dp4 / 2;
                            f0Var.j.setBounds(i13, i13, i14, i14);
                            f0Var.j.setAlpha((int) (A * 255.0f));
                            f0Var.j.draw(canvas);
                        }
                        canvas.restore();
                    }
                    i10 = i11 + 1;
                    g0Var = this;
                    f16 = f11;
                    arrayList2 = arrayList;
                    clamp012 = f7;
                    z10 = false;
                    f12 = 1.0f;
                } else {
                    f7 = clamp012;
                    dp = ((f13 * 2.0f) / 3.0f) - (AndroidUtilities.dp(6.0f) * f18);
                    f10 = max - AndroidUtilities.dp(4.0f);
                }
                f19 = 0.0f;
                if (g0Var.h) {
                }
                float f202 = f19 * 0.2f;
                if (min2 >= 1.0f - f202) {
                }
                if (clamp01 < 1.0f) {
                }
                if (A <= 0.0f) {
                }
                i10 = i11 + 1;
                g0Var = this;
                f16 = f11;
                arrayList2 = arrayList;
                clamp012 = f7;
                z10 = false;
                f12 = 1.0f;
            } else {
                f7 = clamp012;
                dp = (f13 / 2.0f) - (AndroidUtilities.dp(20.0f) * f18);
                dp2 = AndroidUtilities.dp(13.0f);
            }
            f10 = f14 - dp2;
            if (g0Var.h) {
            }
            float f2022 = f19 * 0.2f;
            if (min2 >= 1.0f - f2022) {
            }
            if (clamp01 < 1.0f) {
            }
            if (A <= 0.0f) {
            }
            i10 = i11 + 1;
            g0Var = this;
            f16 = f11;
            arrayList2 = arrayList;
            clamp012 = f7;
            z10 = false;
            f12 = 1.0f;
        }
        canvas.restore();
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
            ((f0) obj).j.a(this);
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
            ((f0) obj).j.o(this);
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
                of.f.s(getContext(), "https://t.me/nft/" + f0Var4.e);
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
