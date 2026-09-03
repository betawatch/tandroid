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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class u4 extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
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

    public final void V(int i10, boolean z4) {
        TransitionSet transitionSet = new TransitionSet();
        ChangeBounds changeBounds = new ChangeBounds();
        changeBounds.setDuration(150L);
        Fade fade = new Fade(1);
        fade.setDuration(150L);
        transitionSet.addTransition(new Fade(2).setDuration(150L)).addTransition(changeBounds).addTransition(fade);
        transitionSet.setOrdering(0);
        transitionSet.setInterpolator((TimeInterpolator) org.telegram.ui.Components.mr.f);
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
                W(t4Var, z4);
                return;
            }
            if (((t4) arrayList.get(i11)).e == i10) {
                W((View) arrayList.get(i11), z4);
                return;
            }
            i11++;
        }
    }

    public final void W(View view, boolean z4) {
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
        if (!z4 || (i10 = ((t4) view).e) <= 0) {
            return;
        }
        org.telegram.ui.Components.qc.a0(this).Q(R.raw.fire_on, 36, AndroidUtilities.replaceTags(LocaleController.formatString("AutoDeleteGlobalTimerEnabled", R.string.AutoDeleteGlobalTimerEnabled, LocaleController.formatTTLString(i10 * 60)))).j();
    }

    public final void X() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 >= arrayList.size()) {
                return;
            }
            ((t4) arrayList.get(i10)).setBackground(org.telegram.ui.ActionBar.j6.g0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.i6, false)));
            ((t4) arrayList.get(i10)).setOnClickListener(new a(this, 3));
            i10++;
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.AutoDeleteMessages));
        this.actionBar.setActionBarMenuOnItemClick(new eg.m1(this, 7));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.a7, false));
        dg.u3 u3Var = new dg.u3(getParentActivity());
        org.telegram.ui.Components.do0 do0Var = new org.telegram.ui.Components.do0(getParentActivity(), u3Var, this.resourceProvider, true);
        u3Var.setOrientation(1);
        do0Var.addView(u3Var);
        frameLayout.addView(do0Var);
        this.actionBar.setAdaptiveBackground(do0Var);
        FrameLayout frameLayout2 = new FrameLayout(context);
        org.telegram.ui.Components.ax0 ax0Var = new org.telegram.ui.Components.ax0(context, this.currentAccount);
        ax0Var.setStickerNum(10);
        frameLayout2.addView(ax0Var, k7.b6.e(130, 130, 17));
        frameLayout2.setTag(-33024);
        u3Var.addView(frameLayout2, k7.b6.n(-1, 170));
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        this.f = linearLayout;
        linearLayout.setOrientation(1);
        this.f.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
        u3Var.addView(this.f, k7.b6.n(-1, -2));
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
        org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(context, 12, this.resourceProvider);
        z8Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.GlobalAutoDeleteInfo), new r4(this)));
        u3Var.addView(z8Var, k7.b6.n(-1, -2));
        V(this.n, false);
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.p2
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

    @Override // org.telegram.ui.ActionBar.p2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.didUpdateGlobalAutoDeleteTimer);
    }

    @Override // org.telegram.ui.ActionBar.p2
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
