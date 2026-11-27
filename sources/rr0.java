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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.ProfileActivity;
import org.telegram.utils.twidget.z;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class rr0 extends e implements fn7 {
    public static final k43 F = new k43(0.2d, 0.1d, 0.35d, 0.9d);
    public final RectF E;
    public final long a;
    public TLRPC.UserFull b;
    public tt c;
    public sr0 d;
    public qr0 e;
    public sla f;
    public boolean h;
    public final lr0 n;
    public float r;
    public fp s;
    public boolean w;
    public float x;
    public AnimatorSet y;

    public rr0(Bundle bundle) {
        super(bundle);
        this.n = new lr0(this, (byte) 0);
        this.r = -1.0f;
        this.x = 1.0f;
        this.E = new RectF();
        this.a = bundle.getLong("user_id");
        this.hasOwnBackground = true;
    }

    public static rr0 e0(int i, long j) {
        TLRPC.User X1 = uc7.s1(i).X1(Long.valueOf(j));
        if (X1 == null || !X1.bot || z.a()) {
            return null;
        }
        TLRPC.UserFull Y1 = uc7.s1(i).Y1(j);
        boolean z = f11.a;
        if (Y1 == null || Y1.bot_profile_widget == null) {
            return null;
        }
        return new rr0(qu6.k(j, "user_id"));
    }

    public static void j0(View view, int[] iArr, RectF rectF) {
        if (view == null) {
            return;
        }
        int[] iArr2 = new int[2];
        view.getLocationInWindow(iArr2);
        rectF.set(iArr2[0] - iArr[0], iArr2[1] - iArr[1], view.getWidth() + r2, view.getHeight() + (iArr2[1] - iArr[1]));
    }

    @Override // org.telegram.ui.ActionBar.e
    public final View createView(Context context) {
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setActionBarMenuOnItemClick(new s8(this, (byte) 9));
        sla a = this.simpleActionBar.v().a(0, R.drawable.ic_ab_other);
        this.f = a;
        a.setContentDescription(ob6.M0(2131754834, null));
        this.f.e(1, R.drawable.msg_info, ob6.M0(2131752987, null));
        this.f.e(2, R.drawable.msg_discussion, ob6.M0(2131752993, null));
        this.f.e(3, R.drawable.msg_search, ob6.M0(2131745564, null));
        this.f.e(4, R.drawable.msg_mute, ob6.M0(2131748068, null));
        this.f.e(5, R.drawable.msg_unmute, ob6.M0(2131743504, null));
        this.f.e(6, R.drawable.msg_share, ob6.M0(2131752963, null));
        this.f.e(7, R.drawable.msg_block2, ob6.M0(2131752988, null));
        this.f.e(8, R.drawable.msg_retry, ob6.M0(2131752976, null));
        this.f.e(9, R.drawable.menu_privacy_policy, ob6.M0(2131752994, null));
        this.f.e(10, R.drawable.msg_report, ob6.M0(2131745958, null));
        o0();
        this.c = new tt(this, context);
        this.d = new sr0(context, this.currentAccount, this.a, getResourceProvider(), new or0(this));
        tt ttVar = this.c;
        tg0 tg0Var = new tg0(this, (byte) 11);
        WeakHashMap weakHashMap = ihc.a;
        ahc.i(ttVar, tg0Var);
        this.c.addView(this.d, tre.c(-1.0f, -1));
        this.fragmentView = this.c;
        eg0 baseSimpleGlass = getBaseSimpleGlass();
        baseSimpleGlass.i(this.c, this.simpleActionBar, getResourceProvider());
        baseSimpleGlass.o = new mr0(this, (byte) 0);
        this.simpleActionBar.setBackground(null);
        qr0 qr0Var = new qr0(this, context, baseSimpleGlass);
        this.e = qr0Var;
        this.c.addView(qr0Var, tre.c(-1.0f, -1));
        jl0 jl0Var = this.e.a;
        jl0Var.p(dtd.l(getResourceProvider()));
        jl0Var.q(hl.L(6.0f));
        this.e.c();
        p0();
        return this.fragmentView;
    }

    public final boolean d0() {
        if (getMessagesController().x0.indexOfKey(this.a) >= 0) {
            return true;
        }
        TLRPC.UserFull userFull = this.b;
        return userFull != null && userFull.blocked;
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        sr0 sr0Var;
        if (i == jn7.E0) {
            if (((Long) objArr[0]).longValue() == this.a) {
                this.b = (TLRPC.UserFull) objArr[1];
                p0();
                o0();
                return;
            }
            return;
        }
        if (i == 2) {
            qr0 qr0Var = this.e;
            if (qr0Var != null) {
                qr0Var.c();
            }
            o0();
            return;
        }
        if (i != jn7.r || (sr0Var = this.d) == null) {
            return;
        }
        sr0Var.k();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    public final void f0(int i) {
        boolean z;
        uc7 messagesController = getMessagesController();
        long j = this.a;
        TLRPC.User X1 = messagesController.X1(Long.valueOf(j));
        if (i == -1) {
            finishFragment();
            return;
        }
        char c = 1;
        if (i == 1) {
            presentFragment(new ProfileActivity(qu6.k(j, "user_id"), null));
            return;
        }
        if (i == 2 || i == 3) {
            g0(i == 3);
            return;
        }
        if (i == 4) {
            z = true;
        } else {
            if (i != 5) {
                if (i == 6) {
                    String p = X1 == null ? null : lbc.p(X1);
                    if (TextUtils.isEmpty(p)) {
                        return;
                    }
                    try {
                        Intent intent = new Intent("android.intent.action.SEND");
                        intent.setType("text/plain");
                        intent.putExtra("android.intent.extra.TEXT", "https://" + getMessagesController().N2 + "/" + p);
                        startActivityForResult(Intent.createChooser(intent, ob6.M0(2131752963, null)), 500);
                        return;
                    } catch (Exception e) {
                        cc4.g(e, true);
                        return;
                    }
                }
                if (i == 7 && X1 != null) {
                    jj.r(this, false, null, X1, false, true, false, true, new o(this, X1, (byte) 23));
                    return;
                }
                if (i == 8) {
                    lr0 lr0Var = new lr0(this, c == true ? 1 : 0);
                    if (d0()) {
                        getMessagesController().t5(lr0Var, j);
                        return;
                    } else {
                        lr0Var.run();
                        return;
                    }
                }
                if (i == 9) {
                    wt0.l(this.currentAccount, j);
                    return;
                } else {
                    if (i == 10) {
                        nb9.F0(this.currentAccount, getParentActivity(), d31.b0(this), j);
                        return;
                    }
                    return;
                }
            }
            z = false;
        }
        getNotificationsController().G(this.a, 0L, z);
        d31.A(this, z, getResourceProvider()).j();
        o0();
    }

    public final void g0(boolean z) {
        if (i0() != null && !z) {
            finishFragment();
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", this.a);
        zu1 zu1Var = new zu1(bundle);
        presentFragment(zu1Var);
        if (z) {
            hl.d3(new ny(zu1Var, (byte) 1), 300L);
        }
    }

    public final void h0(RectF rectF) {
        fp fpVar = this.s;
        if (fpVar != null) {
            RectF rectF2 = (RectF) fpVar.a;
            float f = this.x;
            if (f < 1.0f) {
                rectF.set(hl.R1(rectF2.left, 0.0f, f), hl.R1(rectF2.top, 0.0f, f), hl.R1(rectF2.right, this.c.getWidth(), f), hl.R1(rectF2.bottom, this.c.getHeight(), f));
                return;
            }
        }
        rectF.set(0.0f, 0.0f, this.c.getWidth(), this.c.getHeight());
    }

    public final zu1 i0() {
        if (getParentLayout() != null) {
            List fragmentStack = getParentLayout().getFragmentStack();
            int indexOf = fragmentStack == null ? -1 : fragmentStack.indexOf(this);
            e eVar = indexOf > 0 ? (e) fragmentStack.get(indexOf - 1) : null;
            if (eVar instanceof zu1) {
                zu1 zu1Var = (zu1) eVar;
                if (zu1Var.a() == this.a) {
                    return zu1Var;
                }
            }
        }
        return null;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean isLightStatusBar() {
        float f = this.r;
        if (f < 0.0f) {
            f = hl.B(getThemedColor(aob.d6));
        }
        return f > 0.721f;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void k0() {
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
                PixelCopy.request(getParentActivity().getWindow(), rect, createBitmap, new pk(this, createBitmap, (byte) 1), new Handler(Looper.getMainLooper()));
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
    }

    public final float l0() {
        tt ttVar;
        RoundedCorner roundedCorner;
        if (Build.VERSION.SDK_INT < 31 || (ttVar = this.c) == null || ttVar.getRootWindowInsets() == null || (roundedCorner = this.c.getRootWindowInsets().getRoundedCorner(0)) == null) {
            return 0.0f;
        }
        return roundedCorner.getRadius();
    }

    public final void m0(float f) {
        this.x = f;
        tt ttVar = this.c;
        if (ttVar != null) {
            ttVar.invalidate();
            this.d.invalidateOutline();
            sr0 sr0Var = this.d;
            fp fpVar = this.s;
            float f2 = 1.0f;
            sr0Var.setAlpha((fpVar == null || this.w) ? fpVar == null ? 1.0f : Math.min(1.0f, this.x / 0.22f) : 0.0f);
            jla jlaVar = this.simpleActionBar;
            if (this.s != null && !this.w) {
                f2 = 0.0f;
            }
            jlaVar.setAlpha(f2);
        }
        qr0 qr0Var = this.e;
        if (qr0Var != null) {
            qr0Var.invalidate();
        }
        this.glassEngine.g();
    }

    public final void n0(int i, boolean z) {
        sla slaVar = this.f;
        if (z) {
            slaVar.S(i);
        } else {
            slaVar.u(i);
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean needDelayOpenAnimation() {
        return false;
    }

    public final void o0() {
        if (this.f == null) {
            return;
        }
        boolean p2 = getMessagesController().p2(this.a, 0L, null);
        boolean d0 = d0();
        n0(4, !p2);
        n0(5, p2);
        n0(7, !d0);
        n0(8, d0);
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
    @Override // org.telegram.ui.ActionBar.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AnimatorSet onCustomTransitionAnimation(boolean z, Runnable runnable) {
        fp fpVar;
        jl0 jl0Var;
        zu1 i0 = i0();
        AnimatorSet animatorSet = null;
        byte b = 1;
        if (i0 != null && this.c != null && !hl.O1()) {
            a actionBar = i0.getActionBar();
            qq1 qq1Var = i0.p1;
            Rect rect = new Rect();
            if (actionBar != null && qq1Var != null && qq1Var.getVisibility() == 0 && (jl0Var = actionBar.a) != null && !actionBar.R0 && actionBar.w1) {
                jl0Var.b(rect);
                if (rect.width() > 0 && rect.height() > 0) {
                    fpVar = new fp((byte) 2);
                    RectF rectF = (RectF) fpVar.a;
                    fpVar.e = actionBar;
                    fpVar.f = qq1Var;
                    int[] iArr = new int[2];
                    this.c.getLocationInWindow(iArr);
                    actionBar.getLocationInWindow(new int[2]);
                    rectF.set(rect);
                    rectF.offset(r11[0] - iArr[0], r11[1] - iArr[1]);
                    j0(qq1Var.e, iArr, (RectF) fpVar.b);
                    j0(qq1Var.getTitleTextView(), iArr, (RectF) fpVar.c);
                    j0(qq1Var.getSubtitleTextView(), iArr, (RectF) fpVar.d);
                    if (fpVar != null && this.d != null) {
                        this.s = fpVar;
                        this.w = false;
                        float f = 1.0f;
                        m0(!z ? 0.0f : 1.0f);
                        float f2 = 0.0f;
                        animatorSet = new AnimatorSet();
                        if (!z) {
                            f2 = 1.0f;
                            f = 0.0f;
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
                        ofFloat.addUpdateListener(new g0(this, (byte) 18));
                        animatorSet.playTogether(ofFloat);
                        animatorSet.setDuration(!z ? 260L : 220L);
                        animatorSet.setInterpolator(!z ? F : k43.g);
                        animatorSet.addListener(new j8(this, fpVar, runnable, b));
                        this.y = animatorSet;
                        es6 es6Var = new es6((Object) this, (Object) animatorSet, (Object) fpVar, (byte) 25);
                        if (!z) {
                            hl.d3(new pr0(this, animatorSet, System.currentTimeMillis(), es6Var), 16L);
                            return animatorSet;
                        }
                        es6Var.run();
                    }
                    return animatorSet;
                }
            }
        }
        fpVar = null;
        if (fpVar != null) {
            this.s = fpVar;
            this.w = false;
            float f3 = 1.0f;
            m0(!z ? 0.0f : 1.0f);
            float f22 = 0.0f;
            animatorSet = new AnimatorSet();
            if (!z) {
            }
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f22, f3);
            ofFloat2.addUpdateListener(new g0(this, (byte) 18));
            animatorSet.playTogether(ofFloat2);
            animatorSet.setDuration(!z ? 260L : 220L);
            animatorSet.setInterpolator(!z ? F : k43.g);
            animatorSet.addListener(new j8(this, fpVar, runnable, b));
            this.y = animatorSet;
            es6 es6Var2 = new es6((Object) this, (Object) animatorSet, (Object) fpVar, (byte) 25);
            if (!z) {
            }
        }
        return animatorSet;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean onFragmentCreate() {
        uc7 messagesController = getMessagesController();
        long j = this.a;
        TLRPC.User X1 = messagesController.X1(Long.valueOf(j));
        if (X1 == null) {
            return false;
        }
        TLRPC.UserFull Y1 = getMessagesController().Y1(j);
        this.b = Y1;
        if (Y1 == null) {
            getMessagesController().f3(X1, this.classGuid, true, null);
        }
        getNotificationCenter().a(this, jn7.E0);
        getNotificationCenter().a(this, 2);
        getNotificationCenter().a(this, jn7.r);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, jn7.E0);
        getNotificationCenter().n(this, 2);
        getNotificationCenter().n(this, jn7.r);
        sr0 sr0Var = this.d;
        if (sr0Var != null) {
            sr0Var.c();
        }
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onPause() {
        super.onPause();
        sr0 sr0Var = this.d;
        if (sr0Var != null) {
            sr0Var.setActive(false);
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onResume() {
        super.onResume();
        sr0 sr0Var = this.d;
        if (sr0Var != null) {
            sr0Var.setActive(true);
            this.d.k();
        }
        o0();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        super.onTransitionAnimationEnd(z, z2);
        if (z) {
            hl.d3(new lr0(this, (byte) 0), 32L);
        }
    }

    public final void p0() {
        boolean z = f11.a;
        TLRPC.UserFull userFull = this.b;
        TL_bots.TL_botProfileWidget tL_botProfileWidget = userFull != null ? userFull.bot_profile_widget : null;
        sr0 sr0Var = this.d;
        if (sr0Var != null) {
            if (tL_botProfileWidget != null) {
                sr0Var.setWidget(tL_botProfileWidget);
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

    @Override // org.telegram.ui.ActionBar.e
    public final boolean useSimpleActionBar() {
        return true;
    }
}
