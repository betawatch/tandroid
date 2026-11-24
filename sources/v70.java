// default package

import android.animation.TimeInterpolator;
import android.content.Context;
import android.transition.ChangeBounds;
import android.transition.Fade;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class v70 extends d implements jm7 {
    public u70 a;
    public u70 b;
    public u70 c;
    public u70 d;
    public u70 e;
    public LinearLayout f;
    public final ArrayList h;
    public int n;
    public ww9 r;

    public v70() {
        super(null);
        this.h = new ArrayList();
        this.n = 0;
    }

    public final int Z() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i >= arrayList.size()) {
                return this.n;
            }
            if (((u70) arrayList.get(i)).b.f) {
                return ((u70) arrayList.get(i)).e;
            }
            i++;
        }
    }

    public final void a0(int i, boolean z) {
        TransitionSet transitionSet = new TransitionSet();
        ChangeBounds changeBounds = new ChangeBounds();
        changeBounds.setDuration(150L);
        Fade fade = new Fade(1);
        fade.setDuration(150L);
        transitionSet.addTransition(new Fade(2).setDuration(150L)).addTransition(changeBounds).addTransition(fade);
        transitionSet.setOrdering(0);
        transitionSet.setInterpolator((TimeInterpolator) d53.f);
        TransitionManager.beginDelayedTransition(this.f, transitionSet);
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i2 >= arrayList.size()) {
                int i3 = 0;
                while (i3 < arrayList.size()) {
                    if (((u70) arrayList.get(i3)).d) {
                        this.f.removeView((View) arrayList.get(i3));
                        arrayList.remove(i3);
                        i3--;
                    }
                    i3++;
                }
                int size = arrayList.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= arrayList.size()) {
                        break;
                    }
                    if (i < ((u70) arrayList.get(i4)).e) {
                        size = i4 + 1;
                        break;
                    }
                    i4++;
                }
                u70 u70Var = new u70(getParentActivity(), null);
                u70Var.d = true;
                u70Var.e = i;
                u70Var.c(jb6.a0("AutoDeleteAfterShort", null, 2131753837, jb6.c0(i * 60)), false, true);
                arrayList.add(size, u70Var);
                this.f.addView(u70Var, size);
                c0();
                b0(u70Var, z);
                return;
            }
            if (((u70) arrayList.get(i2)).e == i) {
                b0((View) arrayList.get(i2), z);
                return;
            }
            i2++;
        }
    }

    public final void b0(View view, boolean z) {
        int i;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i2 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i2) == view) {
                ((u70) arrayList.get(i2)).a(true, this.fragmentBeginToShow);
            } else {
                ((u70) arrayList.get(i2)).a(false, this.fragmentBeginToShow);
            }
            i2++;
        }
        if (!z || (i = ((u70) view).e) <= 0) {
            return;
        }
        b10.u(jb6.a0("AutoDeleteGlobalTimerEnabled", null, 2131753822, jb6.c0(i * 60)), c41.b0(this), R.raw.fire_on, 36);
    }

    public final void c0() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i >= arrayList.size()) {
                return;
            }
            View view = (View) arrayList.get(i);
            int i2 = cmb.c6;
            int w0 = cmb.w0(null, i2, false);
            int i3 = cmb.h6;
            anb.R(view, cmb.g0(w0, cmb.w0(null, i3, false)), anb.M(i2), anb.M(i3), null);
            ((u70) arrayList.get(i)).setOnClickListener(new j1(this, (byte) 14));
            i++;
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(jb6.M0(2131753815, null));
        byte b = 5;
        this.simpleActionBar.setActionBarMenuOnItemClick(new r8(this, b));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        t1 t1Var = new t1(getParentActivity(), (byte) 9);
        ww9 ww9Var = new ww9(getParentActivity(), t1Var, this.resourceProvider, true);
        this.r = ww9Var;
        ww9Var.setDrawBackground(true);
        this.r.setOverScrollMode(0);
        t1Var.setOrientation(1);
        this.r.addView(t1Var);
        frameLayout.addView(this.r);
        FrameLayout frameLayout2 = new FrameLayout(context);
        b1b b1bVar = new b1b(context, this.currentAccount);
        b1bVar.setStickerNum(10);
        frameLayout2.addView(b1bVar, qoe.e(nm7.N1, nm7.N1, 17));
        frameLayout2.setTag(-33024);
        t1Var.addView(frameLayout2, qoe.o(-1, nm7.z2));
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        this.f = linearLayout;
        linearLayout.setOrientation(1);
        anb.h(cmb.c6, null, this.f);
        t1Var.addView(this.f, qoe.o(-1, -2));
        jf5 jf5Var = new jf5(getParentActivity());
        jf5Var.setText(jb6.M0(2131748344, null));
        this.f.addView(jf5Var);
        u70 u70Var = new u70(getParentActivity(), null);
        this.a = u70Var;
        u70Var.c(jb6.M0(2131745095, null), false, true);
        u70 u70Var2 = this.a;
        u70Var2.e = 0;
        this.f.addView(u70Var2);
        u70 u70Var3 = new u70(getParentActivity(), null);
        this.b = u70Var3;
        u70Var3.c(jb6.M0(2131753840, null), false, true);
        u70 u70Var4 = this.b;
        u70Var4.e = 1440;
        this.f.addView(u70Var4);
        u70 u70Var5 = new u70(getParentActivity(), null);
        this.c = u70Var5;
        u70Var5.c(jb6.M0(2131753838, null), false, true);
        u70 u70Var6 = this.c;
        u70Var6.e = 10080;
        this.f.addView(u70Var6);
        u70 u70Var7 = new u70(getParentActivity(), null);
        this.d = u70Var7;
        u70Var7.c(jb6.M0(2131753839, null), false, true);
        u70 u70Var8 = this.d;
        u70Var8.e = 44640;
        this.f.addView(u70Var8);
        u70 u70Var9 = new u70(getParentActivity(), null);
        this.e = u70Var9;
        u70Var9.c(jb6.M0(2131745268, null), false, false);
        this.e.b.setVisibility(8);
        this.f.addView(this.e);
        u70 u70Var10 = this.a;
        ArrayList arrayList = this.h;
        arrayList.add(u70Var10);
        arrayList.add(this.b);
        arrayList.add(this.c);
        arrayList.add(this.d);
        arrayList.add(this.e);
        c0();
        njb njbVar = new njb(12, this.resourceProvider, context);
        njbVar.setText(gm.N2(jb6.M0(2131749310, null), -1, 0, new o1(this, b), null));
        t1Var.addView(njbVar, qoe.o(-1, -2));
        a0(this.n, false);
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final ww9 getScrollViewForSimpleGlass() {
        return this.r;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onFragmentCreate() {
        int i = getUserConfig().q0;
        this.n = i;
        if (i < 0) {
            this.n = 0;
        }
        getUserConfig().s();
        getNotificationCenter().b(this, nm7.w5);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, nm7.w5);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onPause() {
        super.onPause();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i >= arrayList.size()) {
                return;
            }
            if (((u70) arrayList.get(i)).b.f) {
                if (((u70) arrayList.get(i)).e != this.n) {
                    this.n = ((u70) arrayList.get(i)).e;
                    TLRPC.TL_messages_setDefaultHistoryTTL tL_messages_setDefaultHistoryTTL = new TLRPC.TL_messages_setDefaultHistoryTTL();
                    tL_messages_setDefaultHistoryTTL.period = ((u70) arrayList.get(i)).e * 60;
                    getConnectionsManager().sendRequest(tL_messages_setDefaultHistoryTTL, new t70());
                    getUserConfig().q0 = this.n;
                    nm7.f(this.currentAccount).k(nm7.w5, new Object[0]);
                    return;
                }
                return;
            }
            i++;
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean useSimpleActionBar() {
        return true;
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
    }
}
