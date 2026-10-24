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

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class u4 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public t4 a;
    public t4 b;
    public t4 c;
    public t4 d;
    public t4 e;
    public LinearLayout f;
    public final ArrayList h;
    public int n;

    public u4() {
        super(null);
        this.h = new ArrayList();
        this.n = 0;
    }

    public final int U() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 >= arrayList.size()) {
                return this.n;
            }
            if (((t4) arrayList.get(i10)).b.f) {
                return ((t4) arrayList.get(i10)).e;
            }
            i10++;
        }
    }

    public final void V(int i10, boolean z10) {
        TransitionSet transitionSet = new TransitionSet();
        ChangeBounds changeBounds = new ChangeBounds();
        changeBounds.setDuration(150L);
        Fade fade = new Fade(1);
        fade.setDuration(150L);
        transitionSet.addTransition(new Fade(2).setDuration(150L)).addTransition(changeBounds).addTransition(fade);
        transitionSet.setOrdering(0);
        transitionSet.setInterpolator((TimeInterpolator) org.telegram.ui.Components.bs.f);
        TransitionManager.beginDelayedTransition(this.f, transitionSet);
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i11 >= arrayList.size()) {
                int i12 = 0;
                while (i12 < arrayList.size()) {
                    if (((t4) arrayList.get(i12)).d) {
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
                    if (i10 < ((t4) arrayList.get(i13)).e) {
                        size = i13 + 1;
                        break;
                    }
                    i13++;
                }
                t4 t4Var = new t4(getParentActivity(), null);
                t4Var.d = true;
                t4Var.e = i10;
                t4Var.c(LocaleController.formatString("AutoDeleteAfterShort", R.string.AutoDeleteAfterShort, LocaleController.formatTTLString(i10 * 60)), false, true);
                arrayList.add(size, t4Var);
                this.f.addView(t4Var, size);
                X();
                W(t4Var, z10);
                return;
            }
            if (((t4) arrayList.get(i11)).e == i10) {
                W((View) arrayList.get(i11), z10);
                return;
            }
            i11++;
        }
    }

    public final void W(View view, boolean z10) {
        int i10;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i11 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i11) == view) {
                ((t4) arrayList.get(i11)).a(true, this.fragmentBeginToShow);
            } else {
                ((t4) arrayList.get(i11)).a(false, this.fragmentBeginToShow);
            }
            i11++;
        }
        if (!z10 || (i10 = ((t4) view).e) <= 0) {
            return;
        }
        org.telegram.ui.Components.xc.a0(this).Q(R.raw.fire_on, 36, AndroidUtilities.replaceTags(LocaleController.formatString("AutoDeleteGlobalTimerEnabled", R.string.AutoDeleteGlobalTimerEnabled, LocaleController.formatTTLString(i10 * 60)))).j();
    }

    public final void X() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 >= arrayList.size()) {
                return;
            }
            View view = (View) arrayList.get(i10);
            int i11 = org.telegram.ui.ActionBar.k6.d6;
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, i11, false);
            int i12 = org.telegram.ui.ActionBar.k6.i6;
            org.telegram.ui.ActionBar.r6.S(view, org.telegram.ui.ActionBar.k6.h0(x02, org.telegram.ui.ActionBar.k6.x0(null, i12, false)), org.telegram.ui.ActionBar.r6.O(i11), org.telegram.ui.ActionBar.r6.O(i12), null);
            ((t4) arrayList.get(i10)).setOnClickListener(new a(this, 3));
            i10++;
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.AutoDeleteMessages));
        this.actionBar.setActionBarMenuOnItemClick(new ah.s(this, 23));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.a7, frameLayout, null);
        ai.r rVar = new ai.r(getParentActivity());
        org.telegram.ui.Components.bp0 bp0Var = new org.telegram.ui.Components.bp0(getParentActivity(), rVar, this.resourceProvider, true);
        rVar.setOrientation(1);
        bp0Var.addView(rVar);
        frameLayout.addView(bp0Var);
        this.actionBar.setAdaptiveBackground(bp0Var);
        FrameLayout frameLayout2 = new FrameLayout(context);
        org.telegram.ui.Components.xx0 xx0Var = new org.telegram.ui.Components.xx0(context, this.currentAccount);
        xx0Var.setStickerNum(10);
        frameLayout2.addView(xx0Var, w7.z5.e(130, 130, 17));
        frameLayout2.setTag(-33024);
        rVar.addView(frameLayout2, w7.z5.n(-1, 170));
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        this.f = linearLayout;
        linearLayout.setOrientation(1);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, this.f, null);
        rVar.addView(this.f, w7.z5.n(-1, -2));
        org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(getParentActivity());
        l4Var.setText(LocaleController.getString(R.string.MessageLifetime));
        this.f.addView(l4Var);
        t4 t4Var = new t4(getParentActivity(), null);
        this.a = t4Var;
        t4Var.c(LocaleController.getString(R.string.ShortMessageLifetimeForever), false, true);
        t4 t4Var2 = this.a;
        t4Var2.e = 0;
        this.f.addView(t4Var2);
        t4 t4Var3 = new t4(getParentActivity(), null);
        this.b = t4Var3;
        t4Var3.c(LocaleController.getString(R.string.AutoDeleteAfter1Day), false, true);
        t4 t4Var4 = this.b;
        t4Var4.e = 1440;
        this.f.addView(t4Var4);
        t4 t4Var5 = new t4(getParentActivity(), null);
        this.c = t4Var5;
        t4Var5.c(LocaleController.getString(R.string.AutoDeleteAfter1Week), false, true);
        t4 t4Var6 = this.c;
        t4Var6.e = 10080;
        this.f.addView(t4Var6);
        t4 t4Var7 = new t4(getParentActivity(), null);
        this.d = t4Var7;
        t4Var7.c(LocaleController.getString(R.string.AutoDeleteAfter1Month), false, true);
        t4 t4Var8 = this.d;
        t4Var8.e = 44640;
        this.f.addView(t4Var8);
        t4 t4Var9 = new t4(getParentActivity(), null);
        this.e = t4Var9;
        t4Var9.c(LocaleController.getString(R.string.SetCustomTime), false, false);
        this.e.b.setVisibility(8);
        this.f.addView(this.e);
        t4 t4Var10 = this.a;
        ArrayList arrayList = this.h;
        arrayList.add(t4Var10);
        arrayList.add(this.b);
        arrayList.add(this.c);
        arrayList.add(this.d);
        arrayList.add(this.e);
        X();
        org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(context, 12, this.resourceProvider);
        e9Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.GlobalAutoDeleteInfo), new r4(this)));
        rVar.addView(e9Var, w7.z5.n(-1, -2));
        V(this.n, false);
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        int globalTTl = getUserConfig().getGlobalTTl();
        this.n = globalTTl;
        if (globalTTl < 0) {
            this.n = 0;
        }
        getUserConfig().loadGlobalTTl();
        getNotificationCenter().addObserver(this, NotificationCenter.didUpdateGlobalAutoDeleteTimer);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.didUpdateGlobalAutoDeleteTimer);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onPause() {
        super.onPause();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 >= arrayList.size()) {
                return;
            }
            if (((t4) arrayList.get(i10)).b.f) {
                if (((t4) arrayList.get(i10)).e != this.n) {
                    this.n = ((t4) arrayList.get(i10)).e;
                    TLRPC.TL_messages_setDefaultHistoryTTL tL_messages_setDefaultHistoryTTL = new TLRPC.TL_messages_setDefaultHistoryTTL();
                    tL_messages_setDefaultHistoryTTL.period = ((t4) arrayList.get(i10)).e * 60;
                    getConnectionsManager().sendRequest(tL_messages_setDefaultHistoryTTL, new s4());
                    getUserConfig().setGlobalTtl(this.n);
                    NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateGlobalAutoDeleteTimer, new Object[0]);
                    return;
                }
                return;
            }
            i10++;
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
    }
}
