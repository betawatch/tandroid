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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class t4 extends org.telegram.ui.ActionBar.r2 implements NotificationCenter.NotificationCenterDelegate {
    public s4 a;
    public s4 b;
    public s4 c;
    public s4 d;
    public s4 e;
    public LinearLayout f;
    public final ArrayList h;
    public int n;
    public org.telegram.ui.Components.hp0 r;

    public t4() {
        super(null);
        this.h = new ArrayList();
        this.n = 0;
    }

    public final int V() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 >= arrayList.size()) {
                return this.n;
            }
            if (((s4) arrayList.get(i10)).b.f) {
                return ((s4) arrayList.get(i10)).e;
            }
            i10++;
        }
    }

    public final void W(int i10, boolean z10) {
        TransitionSet transitionSet = new TransitionSet();
        ChangeBounds changeBounds = new ChangeBounds();
        changeBounds.setDuration(150L);
        Fade fade = new Fade(1);
        fade.setDuration(150L);
        transitionSet.addTransition(new Fade(2).setDuration(150L)).addTransition(changeBounds).addTransition(fade);
        transitionSet.setOrdering(0);
        transitionSet.setInterpolator((TimeInterpolator) org.telegram.ui.Components.ds.f);
        TransitionManager.beginDelayedTransition(this.f, transitionSet);
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i11 >= arrayList.size()) {
                int i12 = 0;
                while (i12 < arrayList.size()) {
                    if (((s4) arrayList.get(i12)).d) {
                        this.f.removeView((View) arrayList.get(i12));
                        arrayList.remove(i12);
                        i12--;
                    }
                    i12++;
                }
                int size = arrayList.size();
                int i13 = 0;
                while (true) {
                    if (i13 >= arrayList.size()) {
                        break;
                    }
                    if (i10 < ((s4) arrayList.get(i13)).e) {
                        size = i13 + 1;
                        break;
                    }
                    i13++;
                }
                s4 s4Var = new s4(getParentActivity(), null);
                s4Var.d = true;
                s4Var.e = i10;
                s4Var.c(LocaleController.formatString("AutoDeleteAfterShort", R.string.AutoDeleteAfterShort, LocaleController.formatTTLString(i10 * 60)), false, true);
                arrayList.add(size, s4Var);
                this.f.addView(s4Var, size);
                Y();
                X(s4Var, z10);
                return;
            }
            if (((s4) arrayList.get(i11)).e == i10) {
                X((View) arrayList.get(i11), z10);
                return;
            }
            i11++;
        }
    }

    public final void X(View view, boolean z10) {
        int i10;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i11 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i11) == view) {
                ((s4) arrayList.get(i11)).a(true, this.fragmentBeginToShow);
            } else {
                ((s4) arrayList.get(i11)).a(false, this.fragmentBeginToShow);
            }
            i11++;
        }
        if (!z10 || (i10 = ((s4) view).e) <= 0) {
            return;
        }
        org.telegram.ui.Components.wc.b0(this).R(R.raw.fire_on, 36, AndroidUtilities.replaceTags(LocaleController.formatString("AutoDeleteGlobalTimerEnabled", R.string.AutoDeleteGlobalTimerEnabled, LocaleController.formatTTLString(i10 * 60)))).j();
    }

    public final void Y() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 >= arrayList.size()) {
                return;
            }
            View view = (View) arrayList.get(i10);
            int i11 = org.telegram.ui.ActionBar.y6.d6;
            int x02 = org.telegram.ui.ActionBar.y6.x0(null, i11, false);
            int i12 = org.telegram.ui.ActionBar.y6.i6;
            org.telegram.ui.ActionBar.f7.R(view, org.telegram.ui.ActionBar.y6.h0(x02, org.telegram.ui.ActionBar.y6.x0(null, i12, false)), org.telegram.ui.ActionBar.f7.N(i11), org.telegram.ui.ActionBar.f7.N(i12), null);
            ((s4) arrayList.get(i10)).setOnClickListener(new a(this, 3));
            i10++;
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(LocaleController.getString(R.string.AutoDeleteMessages));
        this.simpleActionBar.setActionBarMenuOnItemClick(new bh.m(this, 23));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.gp0 gp0Var = new org.telegram.ui.Components.gp0(getParentActivity());
        org.telegram.ui.Components.hp0 hp0Var = new org.telegram.ui.Components.hp0(getParentActivity(), gp0Var, this.resourceProvider, true);
        this.r = hp0Var;
        hp0Var.setDrawBackground(true);
        this.r.setOverScrollMode(0);
        gp0Var.setOrientation(1);
        this.r.addView(gp0Var);
        frameLayout.addView(this.r);
        FrameLayout frameLayout2 = new FrameLayout(context);
        org.telegram.ui.Components.gy0 gy0Var = new org.telegram.ui.Components.gy0(context, this.currentAccount);
        gy0Var.setStickerNum(10);
        frameLayout2.addView(gy0Var, org.telegram.ui.Components.kb1.i(130, 130, 17));
        frameLayout2.setTag(-33024);
        gp0Var.addView(frameLayout2, org.telegram.ui.Components.kb1.r(-1, 170));
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        this.f = linearLayout;
        linearLayout.setOrientation(1);
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, this.f, null);
        gp0Var.addView(this.f, org.telegram.ui.Components.kb1.r(-1, -2));
        org.telegram.ui.Cells.q4 q4Var = new org.telegram.ui.Cells.q4(getParentActivity());
        q4Var.setText(LocaleController.getString(R.string.MessageLifetime));
        this.f.addView(q4Var);
        s4 s4Var = new s4(getParentActivity(), null);
        this.a = s4Var;
        s4Var.c(LocaleController.getString(R.string.ShortMessageLifetimeForever), false, true);
        s4 s4Var2 = this.a;
        s4Var2.e = 0;
        this.f.addView(s4Var2);
        s4 s4Var3 = new s4(getParentActivity(), null);
        this.b = s4Var3;
        s4Var3.c(LocaleController.getString(R.string.AutoDeleteAfter1Day), false, true);
        s4 s4Var4 = this.b;
        s4Var4.e = 1440;
        this.f.addView(s4Var4);
        s4 s4Var5 = new s4(getParentActivity(), null);
        this.c = s4Var5;
        s4Var5.c(LocaleController.getString(R.string.AutoDeleteAfter1Week), false, true);
        s4 s4Var6 = this.c;
        s4Var6.e = 10080;
        this.f.addView(s4Var6);
        s4 s4Var7 = new s4(getParentActivity(), null);
        this.d = s4Var7;
        s4Var7.c(LocaleController.getString(R.string.AutoDeleteAfter1Month), false, true);
        s4 s4Var8 = this.d;
        s4Var8.e = 44640;
        this.f.addView(s4Var8);
        s4 s4Var9 = new s4(getParentActivity(), null);
        this.e = s4Var9;
        s4Var9.c(LocaleController.getString(R.string.SetCustomTime), false, false);
        this.e.b.setVisibility(8);
        this.f.addView(this.e);
        s4 s4Var10 = this.a;
        ArrayList arrayList = this.h;
        arrayList.add(s4Var10);
        arrayList.add(this.b);
        arrayList.add(this.c);
        arrayList.add(this.d);
        arrayList.add(this.e);
        Y();
        org.telegram.ui.Cells.i9 i9Var = new org.telegram.ui.Cells.i9(context, 12, this.resourceProvider);
        i9Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.GlobalAutoDeleteInfo), new q4(this)));
        gp0Var.addView(i9Var, org.telegram.ui.Components.kb1.r(-1, -2));
        W(this.n, false);
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final org.telegram.ui.Components.hp0 getScrollViewForSimpleGlass() {
        return this.r;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean onFragmentCreate() {
        int globalTTl = getUserConfig().getGlobalTTl();
        this.n = globalTTl;
        if (globalTTl < 0) {
            this.n = 0;
        }
        getUserConfig().loadGlobalTTl();
        getNotificationCenter().addWeakObserver(this, NotificationCenter.didUpdateGlobalAutoDeleteTimer);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.didUpdateGlobalAutoDeleteTimer);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onPause() {
        super.onPause();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 >= arrayList.size()) {
                return;
            }
            if (((s4) arrayList.get(i10)).b.f) {
                if (((s4) arrayList.get(i10)).e != this.n) {
                    this.n = ((s4) arrayList.get(i10)).e;
                    TLRPC.TL_messages_setDefaultHistoryTTL tL_messages_setDefaultHistoryTTL = new TLRPC.TL_messages_setDefaultHistoryTTL();
                    tL_messages_setDefaultHistoryTTL.period = ((s4) arrayList.get(i10)).e * 60;
                    getConnectionsManager().sendRequest(tL_messages_setDefaultHistoryTTL, new r4());
                    getUserConfig().setGlobalTtl(this.n);
                    NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateGlobalAutoDeleteTimer, new Object[0]);
                    return;
                }
                return;
            }
            i10++;
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean useSimpleActionBar() {
        return true;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
    }
}
