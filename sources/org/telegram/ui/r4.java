package org.telegram.ui;

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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class r4 extends org.telegram.ui.ActionBar.d2 implements org.telegram.messenger.cs {
    public q4 a;
    public q4 b;
    public q4 c;
    public q4 d;
    public q4 e;
    public LinearLayout f;
    public final ArrayList h;
    public int n;
    public org.telegram.ui.Components.km0 r;

    public r4() {
        super(null);
        this.h = new ArrayList();
        this.n = 0;
    }

    public final int Z() {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i3 >= arrayList.size()) {
                return this.n;
            }
            if (((q4) arrayList.get(i3)).b.f) {
                return ((q4) arrayList.get(i3)).e;
            }
            i3++;
        }
    }

    public final void a0(int i3, boolean z10) {
        TransitionSet transitionSet = new TransitionSet();
        ChangeBounds changeBounds = new ChangeBounds();
        changeBounds.setDuration(150L);
        Fade fade = new Fade(1);
        fade.setDuration(150L);
        transitionSet.addTransition(new Fade(2).setDuration(150L)).addTransition(changeBounds).addTransition(fade);
        transitionSet.setOrdering(0);
        transitionSet.setInterpolator((TimeInterpolator) org.telegram.ui.Components.xq.f);
        TransitionManager.beginDelayedTransition(this.f, transitionSet);
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 >= arrayList.size()) {
                int i11 = 0;
                while (i11 < arrayList.size()) {
                    if (((q4) arrayList.get(i11)).d) {
                        this.f.removeView((View) arrayList.get(i11));
                        arrayList.remove(i11);
                        i11--;
                    }
                    i11++;
                }
                int size = arrayList.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= arrayList.size()) {
                        break;
                    }
                    if (i3 < ((q4) arrayList.get(i12)).e) {
                        size = i12 + 1;
                        break;
                    }
                    i12++;
                }
                q4 q4Var = new q4(getParentActivity(), null);
                q4Var.d = true;
                q4Var.e = i3;
                q4Var.c(org.telegram.messenger.bd.a0("AutoDeleteAfterShort", null, 2131753872, org.telegram.messenger.bd.c0(i3 * 60)), false, true);
                arrayList.add(size, q4Var);
                this.f.addView(q4Var, size);
                c0();
                b0(q4Var, z10);
                return;
            }
            if (((q4) arrayList.get(i10)).e == i3) {
                b0((View) arrayList.get(i10), z10);
                return;
            }
            i10++;
        }
    }

    public final void b0(View view, boolean z10) {
        int i3;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) == view) {
                ((q4) arrayList.get(i10)).a(true, this.fragmentBeginToShow);
            } else {
                ((q4) arrayList.get(i10)).a(false, this.fragmentBeginToShow);
            }
            i10++;
        }
        if (!z10 || (i3 = ((q4) view).e) <= 0) {
            return;
        }
        org.telegram.messenger.camera.q.s(org.telegram.messenger.bd.a0("AutoDeleteGlobalTimerEnabled", null, 2131753857, org.telegram.messenger.bd.c0(i3 * 60)), org.telegram.ui.Components.fc.a0(this), R.raw.fire_on, 36);
    }

    public final void c0() {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i3 >= arrayList.size()) {
                return;
            }
            View view = (View) arrayList.get(i3);
            int i10 = org.telegram.ui.ActionBar.k6.d6;
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, i10, false);
            int i11 = org.telegram.ui.ActionBar.k6.i6;
            org.telegram.ui.ActionBar.r6.R(view, org.telegram.ui.ActionBar.k6.i0(x02, org.telegram.ui.ActionBar.k6.x0(null, i11, false)), org.telegram.ui.ActionBar.r6.N(i10), org.telegram.ui.ActionBar.r6.N(i11), null);
            ((q4) arrayList.get(i3)).setOnClickListener(new a(this, 3));
            i3++;
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131753850, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new ai.g5(this, 25));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.jm0 jm0Var = new org.telegram.ui.Components.jm0(getParentActivity());
        org.telegram.ui.Components.km0 km0Var = new org.telegram.ui.Components.km0(getParentActivity(), jm0Var, this.resourceProvider, true);
        this.r = km0Var;
        km0Var.setDrawBackground(true);
        this.r.setOverScrollMode(0);
        jm0Var.setOrientation(1);
        this.r.addView(jm0Var);
        frameLayout.addView(this.r);
        FrameLayout frameLayout2 = new FrameLayout(context);
        org.telegram.ui.Components.av0 av0Var = new org.telegram.ui.Components.av0(context, this.currentAccount);
        av0Var.setStickerNum(10);
        frameLayout2.addView(av0Var, b8.mf.e(org.telegram.messenger.hs.O1, org.telegram.messenger.hs.O1, 17));
        frameLayout2.setTag(-33024);
        jm0Var.addView(frameLayout2, b8.mf.o(-1, org.telegram.messenger.hs.A2));
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        this.f = linearLayout;
        linearLayout.setOrientation(1);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, this.f, null);
        jm0Var.addView(this.f, b8.mf.o(-1, -2));
        org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(getParentActivity());
        n4Var.setText(org.telegram.messenger.bd.M0(2131748595, null));
        this.f.addView(n4Var);
        q4 q4Var = new q4(getParentActivity(), null);
        this.a = q4Var;
        q4Var.c(org.telegram.messenger.bd.M0(2131745371, null), false, true);
        q4 q4Var2 = this.a;
        q4Var2.e = 0;
        this.f.addView(q4Var2);
        q4 q4Var3 = new q4(getParentActivity(), null);
        this.b = q4Var3;
        q4Var3.c(org.telegram.messenger.bd.M0(2131753875, null), false, true);
        q4 q4Var4 = this.b;
        q4Var4.e = 1440;
        this.f.addView(q4Var4);
        q4 q4Var5 = new q4(getParentActivity(), null);
        this.c = q4Var5;
        q4Var5.c(org.telegram.messenger.bd.M0(2131753873, null), false, true);
        q4 q4Var6 = this.c;
        q4Var6.e = 10080;
        this.f.addView(q4Var6);
        q4 q4Var7 = new q4(getParentActivity(), null);
        this.d = q4Var7;
        q4Var7.c(org.telegram.messenger.bd.M0(2131753874, null), false, true);
        q4 q4Var8 = this.d;
        q4Var8.e = 44640;
        this.f.addView(q4Var8);
        q4 q4Var9 = new q4(getParentActivity(), null);
        this.e = q4Var9;
        q4Var9.c(org.telegram.messenger.bd.M0(2131745544, null), false, false);
        this.e.b.setVisibility(8);
        this.f.addView(this.e);
        q4 q4Var10 = this.a;
        ArrayList arrayList = this.h;
        arrayList.add(q4Var10);
        arrayList.add(this.b);
        arrayList.add(this.c);
        arrayList.add(this.d);
        arrayList.add(this.e);
        c0();
        org.telegram.ui.Cells.y8 y8Var = new org.telegram.ui.Cells.y8(12, context, this.resourceProvider);
        y8Var.setText(org.telegram.messenger.g0.U2(org.telegram.messenger.bd.M0(2131749544, null), new o4(this, 0)));
        jm0Var.addView(y8Var, b8.mf.o(-1, -2));
        a0(this.n, false);
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final org.telegram.ui.Components.km0 getScrollViewForSimpleGlass() {
        return this.r;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean onFragmentCreate() {
        int i3 = getUserConfig().q0;
        this.n = i3;
        if (i3 < 0) {
            this.n = 0;
        }
        getUserConfig().t();
        getNotificationCenter().c(this, org.telegram.messenger.hs.s5);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.hs.s5);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onPause() {
        super.onPause();
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i3 >= arrayList.size()) {
                return;
            }
            if (((q4) arrayList.get(i3)).b.f) {
                if (((q4) arrayList.get(i3)).e != this.n) {
                    this.n = ((q4) arrayList.get(i3)).e;
                    TLRPC.TL_messages_setDefaultHistoryTTL tL_messages_setDefaultHistoryTTL = new TLRPC.TL_messages_setDefaultHistoryTTL();
                    tL_messages_setDefaultHistoryTTL.period = ((q4) arrayList.get(i3)).e * 60;
                    getConnectionsManager().sendRequest(tL_messages_setDefaultHistoryTTL, new p4());
                    getUserConfig().q0 = this.n;
                    org.telegram.messenger.hs.f(this.currentAccount).k(org.telegram.messenger.hs.s5, new Object[0]);
                    return;
                }
                return;
            }
            i3++;
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean useSimpleActionBar() {
        return true;
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
    }
}
