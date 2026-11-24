// default package

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Iterator;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class t93 extends d {
    public static final int[][] r = {new int[]{-14899731, -15431455}, new int[]{-11154873, -14175180}, new int[]{-11565578, -13276952}, new int[]{-1007845, -1996271}, new int[]{-765355, -2148011}, new int[]{-3903756, -6335009}, new int[]{-13451058, -14836538}};
    public static final int[] s = {cmb.Xj, cmb.Yj, cmb.bk, cmb.ak, cmb.Zj, cmb.fk, cmb.gk};
    public static final int[] w = {R.drawable.msg_filled_data_videos, R.drawable.msg_filled_data_files, R.drawable.msg_filled_data_photos, R.drawable.msg_filled_data_messages, R.drawable.msg_filled_data_music, R.drawable.msg_filled_data_voice, R.drawable.msg_filled_data_calls};
    public static final int[] x = {2131748516, 2131748525, 2131748520, 2131748206, 2131748522, 2131748532, 2131752548};
    public static final int[] y = {2, 5, 4, 1, 7, 3, 0};
    public wgc a;
    public vgc b;
    public FrameLayout c;
    public View d;
    public final g79 e;
    public boolean f;
    public int h;
    public int n;

    public t93() {
        super(null);
        this.e = new g79(0, false);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final View createView(Context context) {
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(jb6.M0(2131748055, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new fh2(this, (byte) 11));
        a6 a6Var = new a6(context, (byte) 10);
        anb.h(cmb.Z6, null, a6Var);
        wgc wgcVar = new wgc(context, null);
        this.a = wgcVar;
        wgcVar.setAdapter(new fn2(this, (byte) 2));
        this.c = new FrameLayout(context);
        this.b = this.a.l(-2, true);
        a6Var.addView(this.a, qoe.e(-1, -1, nm7.D1));
        View view = new View(context);
        this.d = view;
        a6Var.addView(view, qoe.e(-1, 0, 48));
        this.d.getLayoutParams().height = gm.L(44.0f) + a.getCurrentActionBarHeight() + this.h;
        this.c.setTranslationY(eh0.d(this.h) - gm.L(9.66f));
        this.c.addView(this.b, qoe.c(48.0f, -1));
        this.c.setPadding(gm.L(4.0f), gm.L(4.0f), gm.L(4.0f), gm.L(4.0f));
        FrameLayout frameLayout = this.c;
        im0 c = getBaseSimpleGlass().c.c(this.c, null, false);
        c.p(qqd.l(this.resourceProvider));
        c.q(gm.L(9.66f));
        c.r(gm.L(18.0f));
        frameLayout.setBackground(c);
        eh0 baseSimpleGlass = getBaseSimpleGlass();
        wgc wgcVar2 = this.a;
        rja rjaVar = this.simpleActionBar;
        ylb ylbVar = this.resourceProvider;
        baseSimpleGlass.m = a6Var;
        baseSimpleGlass.n = wgcVar2;
        baseSimpleGlass.a.c(wgcVar2);
        baseSimpleGlass.h(a6Var, rjaVar, ylbVar);
        getBaseSimpleGlass().o = new dh0(this, a6Var, (byte) 4);
        getBaseSimpleGlass().n = null;
        a6Var.addView(this.c, qoe.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        this.d.setBackground(getBaseSimpleGlass().a(this.d));
        this.simpleActionBar.setBackground(null);
        this.fragmentView = a6Var;
        return a6Var;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final ylb getResourceProvider() {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isLightStatusBar() {
        return !this.f ? super.isLightStatusBar() : gm.B(cmb.w0(null, cmb.v8, false)) > 0.721f;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (motionEvent != null) {
            if (motionEvent.getY() <= gm.L(48.0f) + a.getCurrentActionBarHeight()) {
                return true;
            }
        }
        return this.a.getCurrentPosition() == 0;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onInsets(int i, int i2, int i3, int i4) {
        this.h = i2;
        this.n = i4;
        this.c.setTranslationY(eh0.d(i2) - gm.L(9.66f));
        this.d.getLayoutParams().height = gm.L(44.0f) + a.getCurrentActionBarHeight() + this.h;
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            q93 q93Var = (q93) it.next();
            t93 t93Var = q93Var.w3;
            eh0.e(q93Var, t93Var.h, t93Var.n, gm.L(42.0f) + a.getCurrentActionBarHeight(), 0);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onTransitionAnimationProgress(boolean z, float f) {
        if (f > 0.5f && !this.f) {
            this.f = true;
            nm7.e().k(nm7.v4, new Object[0]);
        }
        super.onTransitionAnimationProgress(z, f);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final void x0() {
        View currentView = this.a.getCurrentView();
        if (currentView instanceof q93) {
            q93 q93Var = (q93) currentView;
            q93Var.f1(new m93(q93Var), 700, true);
        }
    }
}
