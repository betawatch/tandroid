// default package

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.PixelCopy;
import android.view.RoundedCorner;
import android.view.View;
import java.util.List;
import java.util.WeakHashMap;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ProfileActivity;
import org.telegram.utils.twidget.z;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class rs0 extends d implements jm7 {
    public static final d53 F = new d53(0.2d, 0.1d, 0.35d, 0.9d);
    public final RectF E;
    public final long a;
    public TLRPC.UserFull b;
    public su c;
    public ss0 d;
    public qs0 e;
    public zja f;
    public boolean h;
    public final ls0 n;
    public float r;
    public eq s;
    public boolean w;
    public float x;
    public AnimatorSet y;

    public rs0(Bundle bundle) {
        super(bundle);
        this.n = new ls0(this, (byte) 0);
        this.r = -1.0f;
        this.x = 1.0f;
        this.E = new RectF();
        this.a = bundle.getLong("user_id");
        this.hasOwnBackground = true;
    }

    public static rs0 f0(int i, long j) {
        TLRPC.User W1 = oc7.r1(i).W1(Long.valueOf(j));
        if (W1 == null || !W1.bot || z.a()) {
            return null;
        }
        TLRPC.UserFull X1 = oc7.r1(i).X1(j);
        boolean z = e21.a;
        if (X1 == null || X1.bot_profile_widget == null) {
            return null;
        }
        return new rs0(kt6.k(j, "user_id"));
    }

    public static void k0(View view, int[] iArr, RectF rectF) {
        if (view == null) {
            return;
        }
        int[] iArr2 = new int[2];
        view.getLocationInWindow(iArr2);
        rectF.set(iArr2[0] - iArr[0], iArr2[1] - iArr[1], view.getWidth() + r2, view.getHeight() + (iArr2[1] - iArr[1]));
    }

    @Override // org.telegram.ui.ActionBar.d
    public final View createView(Context context) {
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setActionBarMenuOnItemClick(new r8(this, (byte) 9));
        zja a = this.simpleActionBar.t().a(0, R.drawable.ic_ab_other);
        this.f = a;
        a.setContentDescription(jb6.M0(2131754838, null));
        this.f.e(1, R.drawable.msg_info, jb6.M0(2131752959, null));
        this.f.e(2, R.drawable.msg_discussion, jb6.M0(2131752965, null));
        this.f.e(3, R.drawable.msg_search, jb6.M0(2131745570, null));
        this.f.e(4, R.drawable.msg_mute, jb6.M0(2131748071, null));
        this.f.e(5, R.drawable.msg_unmute, jb6.M0(2131743536, null));
        this.f.e(6, R.drawable.msg_share, jb6.M0(2131752935, null));
        this.f.e(7, R.drawable.msg_block2, jb6.M0(2131752960, null));
        this.f.e(8, R.drawable.msg_retry, jb6.M0(2131752948, null));
        this.f.e(9, R.drawable.menu_privacy_policy, jb6.M0(2131752966, null));
        this.f.e(10, R.drawable.msg_report, jb6.M0(2131745964, null));
        p0();
        this.c = new su(this, context);
        this.d = new ss0(context, this.currentAccount, this.a, getResourceProvider(), new os0(this));
        su suVar = this.c;
        xg0 xg0Var = new xg0(this, (byte) 13);
        WeakHashMap weakHashMap = kfc.a;
        cfc.i(suVar, xg0Var);
        this.c.addView(this.d, qoe.c(-1.0f, -1));
        this.fragmentView = this.c;
        eh0 baseSimpleGlass = getBaseSimpleGlass();
        baseSimpleGlass.g(this.c, this.simpleActionBar, getResourceProvider());
        baseSimpleGlass.o = new ms0(this, (byte) 0);
        this.simpleActionBar.setBackground(null);
        qs0 qs0Var = new qs0(this, context, baseSimpleGlass);
        this.e = qs0Var;
        this.c.addView(qs0Var, qoe.c(-1.0f, -1));
        im0 im0Var = this.e.a;
        im0Var.p(qqd.l(getResourceProvider()));
        im0Var.q(gm.L(6.0f));
        this.e.c();
        q0();
        return this.fragmentView;
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        ss0 ss0Var;
        if (i == nm7.E0) {
            if (((Long) objArr[0]).longValue() == this.a) {
                this.b = (TLRPC.UserFull) objArr[1];
                q0();
                p0();
                return;
            }
            return;
        }
        if (i == 2) {
            qs0 qs0Var = this.e;
            if (qs0Var != null) {
                qs0Var.c();
            }
            p0();
            return;
        }
        if (i != nm7.r || (ss0Var = this.d) == null) {
            return;
        }
        ss0Var.k();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    public final boolean e0() {
        if (getMessagesController().x0.indexOfKey(this.a) >= 0) {
            return true;
        }
        TLRPC.UserFull userFull = this.b;
        return userFull != null && userFull.blocked;
    }

    public final void g0(int i) {
        boolean z;
        oc7 messagesController = getMessagesController();
        long j = this.a;
        TLRPC.User W1 = messagesController.W1(Long.valueOf(j));
        if (i == -1) {
            finishFragment();
            return;
        }
        char c = 1;
        if (i == 1) {
            presentFragment(new ProfileActivity(kt6.k(j, "user_id"), null));
            return;
        }
        if (i == 2 || i == 3) {
            h0(i == 3);
            return;
        }
        if (i == 4) {
            z = true;
        } else {
            if (i != 5) {
                if (i == 6) {
                    String p = W1 == null ? null : m9c.p(W1);
                    if (TextUtils.isEmpty(p)) {
                        return;
                    }
                    try {
                        Intent intent = new Intent("android.intent.action.SEND");
                        intent.setType("text/plain");
                        intent.putExtra("android.intent.extra.TEXT", "https://" + getMessagesController().N2 + "/" + p);
                        startActivityForResult(Intent.createChooser(intent, jb6.M0(2131752935, null)), 500);
                        return;
                    } catch (Exception e) {
                        fc4.g(e, true);
                        return;
                    }
                }
                if (i == 7 && W1 != null) {
                    ik.r(this, false, null, W1, false, true, false, true, new o(this, W1, (byte) 23));
                    return;
                }
                if (i == 8) {
                    ls0 ls0Var = new ls0(this, c == true ? 1 : 0);
                    if (e0()) {
                        getMessagesController().n5(ls0Var, j);
                        return;
                    } else {
                        ls0Var.run();
                        return;
                    }
                }
                if (i == 9) {
                    wu0.l(this.currentAccount, j);
                    return;
                } else {
                    if (i == 10) {
                        da9.E0(this.currentAccount, getParentActivity(), c41.b0(this), j);
                        return;
                    }
                    return;
                }
            }
            z = false;
        }
        getNotificationsController().G(this.a, 0L, z);
        c41.A(this, z, getResourceProvider()).j();
        p0();
    }

    public final void h0(boolean z) {
        if (j0() != null && !z) {
            finishFragment();
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", this.a);
        yv1 yv1Var = new yv1(bundle);
        presentFragment(yv1Var);
        if (z) {
            gm.d3(new mz(yv1Var, (byte) 1), 300L);
        }
    }

    public final void i0(RectF rectF) {
        eq eqVar = this.s;
        if (eqVar != null) {
            RectF rectF2 = (RectF) eqVar.a;
            float f = this.x;
            if (f < 1.0f) {
                rectF.set(gm.R1(rectF2.left, 0.0f, f), gm.R1(rectF2.top, 0.0f, f), gm.R1(rectF2.right, this.c.getWidth(), f), gm.R1(rectF2.bottom, this.c.getHeight(), f));
                return;
            }
        }
        rectF.set(0.0f, 0.0f, this.c.getWidth(), this.c.getHeight());
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isLightStatusBar() {
        float f = this.r;
        if (f < 0.0f) {
            f = gm.B(getThemedColor(cmb.c6));
        }
        return f > 0.721f;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final yv1 j0() {
        if (getParentLayout() != null) {
            List fragmentStack = getParentLayout().getFragmentStack();
            int indexOf = fragmentStack == null ? -1 : fragmentStack.indexOf(this);
            d dVar = indexOf > 0 ? (d) fragmentStack.get(indexOf - 1) : null;
            if (dVar instanceof yv1) {
                yv1 yv1Var = (yv1) dVar;
                if (yv1Var.a() == this.a) {
                    return yv1Var;
                }
            }
        }
        return null;
    }

    public final void l0() {
        if (Build.VERSION.SDK_INT < 26 || this.c == null || getParentActivity() == null || !this.c.isAttachedToWindow()) {
            return;
        }
        int[] iArr = new int[2];
        this.c.getLocationInWindow(iArr);
        int max = Math.max(1, this.d.x.top);
        int i = iArr[0];
        Rect rect = new Rect(i, iArr[1], this.c.getWidth() + i, iArr[1] + max);
        if (rect.width() > 0) {
            Bitmap createBitmap = Bitmap.createBitmap(16, 4, Bitmap.Config.ARGB_8888);
            try {
                PixelCopy.request(getParentActivity().getWindow(), rect, createBitmap, new ol(this, createBitmap, (byte) 1), new Handler(Looper.getMainLooper()));
            } catch (Exception e) {
                fc4.g(e, true);
            }
        }
    }

    public final float m0() {
        su suVar;
        RoundedCorner roundedCorner;
        if (Build.VERSION.SDK_INT < 31 || (suVar = this.c) == null || suVar.getRootWindowInsets() == null || (roundedCorner = this.c.getRootWindowInsets().getRoundedCorner(0)) == null) {
            return 0.0f;
        }
        return roundedCorner.getRadius();
    }

    public final void n0(float f) {
        this.x = f;
        su suVar = this.c;
        if (suVar != null) {
            suVar.invalidate();
            this.d.invalidateOutline();
            ss0 ss0Var = this.d;
            eq eqVar = this.s;
            float f2 = 1.0f;
            ss0Var.setAlpha((eqVar == null || this.w) ? eqVar == null ? 1.0f : Math.min(1.0f, this.x / 0.22f) : 0.0f);
            rja rjaVar = this.simpleActionBar;
            if (this.s != null && !this.w) {
                f2 = 0.0f;
            }
            rjaVar.setAlpha(f2);
        }
        qs0 qs0Var = this.e;
        if (qs0Var != null) {
            qs0Var.invalidate();
        }
        this.glassEngine.g();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean needDelayOpenAnimation() {
        return false;
    }

    public final void o0(int i, boolean z) {
        zja zjaVar = this.f;
        if (z) {
            zjaVar.S(i);
        } else {
            zjaVar.u(i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a1  */
    @Override // org.telegram.ui.ActionBar.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AnimatorSet onCustomTransitionAnimation(boolean z, Runnable runnable) {
        eq eqVar;
        im0 im0Var;
        yv1 j0 = j0();
        AnimatorSet animatorSet = null;
        byte b = 1;
        if (j0 != null && this.c != null && !gm.O1()) {
            a actionBar = j0.getActionBar();
            pr1 pr1Var = j0.p1;
            Rect rect = new Rect();
            if (actionBar != null && pr1Var != null && pr1Var.getVisibility() == 0 && (im0Var = actionBar.a) != null && !actionBar.R0 && actionBar.w1) {
                im0Var.b(rect);
                if (rect.width() > 0 && rect.height() > 0) {
                    eqVar = new eq((byte) 2);
                    RectF rectF = (RectF) eqVar.a;
                    eqVar.e = actionBar;
                    eqVar.f = pr1Var;
                    int[] iArr = new int[2];
                    this.c.getLocationInWindow(iArr);
                    actionBar.getLocationInWindow(new int[2]);
                    rectF.set(rect);
                    rectF.offset(r11[0] - iArr[0], r11[1] - iArr[1]);
                    k0(pr1Var.e, iArr, (RectF) eqVar.b);
                    k0(pr1Var.getTitleTextView(), iArr, (RectF) eqVar.c);
                    k0(pr1Var.getSubtitleTextView(), iArr, (RectF) eqVar.d);
                    if (eqVar != null && this.d != null) {
                        this.s = eqVar;
                        this.w = false;
                        float f = 1.0f;
                        n0(!z ? 0.0f : 1.0f);
                        float f2 = 0.0f;
                        animatorSet = new AnimatorSet();
                        if (!z) {
                            f2 = 1.0f;
                            f = 0.0f;
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
                        ofFloat.addUpdateListener(new f0(this, (byte) 19));
                        animatorSet.playTogether(ofFloat);
                        animatorSet.setDuration(!z ? 260L : 220L);
                        animatorSet.setInterpolator(!z ? F : d53.g);
                        animatorSet.addListener(new i8(this, eqVar, runnable, b));
                        this.y = animatorSet;
                        op6 op6Var = new op6((Object) this, (Object) animatorSet, (Object) eqVar, (byte) 25);
                        if (!z) {
                            gm.d3(new ps0(this, animatorSet, System.currentTimeMillis(), op6Var), 16L);
                            return animatorSet;
                        }
                        op6Var.run();
                    }
                    return animatorSet;
                }
            }
        }
        eqVar = null;
        if (eqVar != null) {
            this.s = eqVar;
            this.w = false;
            float f3 = 1.0f;
            n0(!z ? 0.0f : 1.0f);
            float f22 = 0.0f;
            animatorSet = new AnimatorSet();
            if (!z) {
            }
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f22, f3);
            ofFloat2.addUpdateListener(new f0(this, (byte) 19));
            animatorSet.playTogether(ofFloat2);
            animatorSet.setDuration(!z ? 260L : 220L);
            animatorSet.setInterpolator(!z ? F : d53.g);
            animatorSet.addListener(new i8(this, eqVar, runnable, b));
            this.y = animatorSet;
            op6 op6Var2 = new op6((Object) this, (Object) animatorSet, (Object) eqVar, (byte) 25);
            if (!z) {
            }
        }
        return animatorSet;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onFragmentCreate() {
        oc7 messagesController = getMessagesController();
        long j = this.a;
        TLRPC.User W1 = messagesController.W1(Long.valueOf(j));
        if (W1 == null) {
            return false;
        }
        TLRPC.UserFull X1 = getMessagesController().X1(j);
        this.b = X1;
        if (X1 == null) {
            getMessagesController().b3(W1, this.classGuid, true, null);
        }
        getNotificationCenter().a(this, nm7.E0);
        getNotificationCenter().a(this, 2);
        getNotificationCenter().a(this, nm7.r);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, nm7.E0);
        getNotificationCenter().n(this, 2);
        getNotificationCenter().n(this, nm7.r);
        ss0 ss0Var = this.d;
        if (ss0Var != null) {
            ss0Var.c();
        }
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onPause() {
        super.onPause();
        ss0 ss0Var = this.d;
        if (ss0Var != null) {
            ss0Var.setActive(false);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onResume() {
        super.onResume();
        ss0 ss0Var = this.d;
        if (ss0Var != null) {
            ss0Var.setActive(true);
            this.d.k();
        }
        p0();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        super.onTransitionAnimationEnd(z, z2);
        if (z) {
            gm.d3(new ls0(this, (byte) 0), 32L);
        }
    }

    public final void p0() {
        if (this.f == null) {
            return;
        }
        boolean o2 = getMessagesController().o2(this.a, 0L, null);
        boolean e0 = e0();
        o0(4, !o2);
        o0(5, o2);
        o0(7, !e0);
        o0(8, e0);
    }

    public final void q0() {
        boolean z = e21.a;
        TLRPC.UserFull userFull = this.b;
        TL_bots.TL_botProfileWidget tL_botProfileWidget = userFull != null ? userFull.bot_profile_widget : null;
        ss0 ss0Var = this.d;
        if (ss0Var != null) {
            if (tL_botProfileWidget != null) {
                ss0Var.setWidget(tL_botProfileWidget);
                this.d.k();
            } else {
                if (userFull == null || this.h || this.finishing) {
                    return;
                }
                this.h = true;
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", this.a);
                presentFragment(new ProfileActivity(bundle, null), true);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean useSimpleActionBar() {
        return true;
    }
}
