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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class s4 extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public r4 a;
    public r4 b;
    public r4 c;
    public r4 d;
    public r4 e;
    public LinearLayout f;
    public final ArrayList h;
    public int n;

    public s4() {
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
            if (((r4) arrayList.get(i10)).b.f) {
                return ((r4) arrayList.get(i10)).e;
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
        transitionSet.setInterpolator((TimeInterpolator) org.telegram.ui.Components.nr.f);
        TransitionManager.beginDelayedTransition(this.f, transitionSet);
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i11 >= arrayList.size()) {
                int i12 = 0;
                while (i12 < arrayList.size()) {
                    if (((r4) arrayList.get(i12)).d) {
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
                    if (i10 < ((r4) arrayList.get(i13)).e) {
                        size = i13 + 1;
                        break;
                    }
                    i13++;
                }
                r4 r4Var = new r4(getParentActivity(), null);
                r4Var.d = true;
                r4Var.e = i10;
                r4Var.c(LocaleController.formatString("AutoDeleteAfterShort", R.string.AutoDeleteAfterShort, LocaleController.formatTTLString(i10 * 60)), false, true);
                arrayList.add(size, r4Var);
                this.f.addView(r4Var, size);
                X();
                W(r4Var, z4);
                return;
            }
            if (((r4) arrayList.get(i11)).e == i10) {
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
                ((r4) arrayList.get(i11)).a(true, this.fragmentBeginToShow);
            } else {
                ((r4) arrayList.get(i11)).a(false, this.fragmentBeginToShow);
            }
            i11++;
        }
        if (!z4 || (i10 = ((r4) view).e) <= 0) {
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
            ((r4) arrayList.get(i10)).setBackground(org.telegram.ui.ActionBar.j6.g0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.i6, false)));
            ((r4) arrayList.get(i10)).setOnClickListener(new a(this, 3));
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
        org.telegram.ui.Components.eo0 eo0Var = new org.telegram.ui.Components.eo0(getParentActivity(), u3Var, this.resourceProvider, true);
        u3Var.setOrientation(1);
        eo0Var.addView(u3Var);
        frameLayout.addView(eo0Var);
        this.actionBar.setAdaptiveBackground(eo0Var);
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
        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(getParentActivity());
        m4Var.setText(LocaleController.getString(R.string.MessageLifetime));
        this.f.addView(m4Var);
        r4 r4Var = new r4(getParentActivity(), null);
        this.a = r4Var;
        r4Var.c(LocaleController.getString(R.string.ShortMessageLifetimeForever), false, true);
        r4 r4Var2 = this.a;
        r4Var2.e = 0;
        this.f.addView(r4Var2);
        r4 r4Var3 = new r4(getParentActivity(), null);
        this.b = r4Var3;
        r4Var3.c(LocaleController.getString(R.string.AutoDeleteAfter1Day), false, true);
        r4 r4Var4 = this.b;
        r4Var4.e = 1440;
        this.f.addView(r4Var4);
        r4 r4Var5 = new r4(getParentActivity(), null);
        this.c = r4Var5;
        r4Var5.c(LocaleController.getString(R.string.AutoDeleteAfter1Week), false, true);
        r4 r4Var6 = this.c;
        r4Var6.e = 10080;
        this.f.addView(r4Var6);
        r4 r4Var7 = new r4(getParentActivity(), null);
        this.d = r4Var7;
        r4Var7.c(LocaleController.getString(R.string.AutoDeleteAfter1Month), false, true);
        r4 r4Var8 = this.d;
        r4Var8.e = 44640;
        this.f.addView(r4Var8);
        r4 r4Var9 = new r4(getParentActivity(), null);
        this.e = r4Var9;
        r4Var9.c(LocaleController.getString(R.string.SetCustomTime), false, false);
        this.e.b.setVisibility(8);
        this.f.addView(this.e);
        r4 r4Var10 = this.a;
        ArrayList arrayList = this.h;
        arrayList.add(r4Var10);
        arrayList.add(this.b);
        arrayList.add(this.c);
        arrayList.add(this.d);
        arrayList.add(this.e);
        X();
        org.telegram.ui.Cells.a9 a9Var = new org.telegram.ui.Cells.a9(context, 12, this.resourceProvider);
        a9Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.GlobalAutoDeleteInfo), new p4(this)));
        u3Var.addView(a9Var, k7.b6.n(-1, -2));
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
            if (((r4) arrayList.get(i10)).b.f) {
                if (((r4) arrayList.get(i10)).e != this.n) {
                    this.n = ((r4) arrayList.get(i10)).e;
                    TLRPC.TL_messages_setDefaultHistoryTTL tL_messages_setDefaultHistoryTTL = new TLRPC.TL_messages_setDefaultHistoryTTL();
                    tL_messages_setDefaultHistoryTTL.period = ((r4) arrayList.get(i10)).e * 60;
                    getConnectionsManager().sendRequest(tL_messages_setDefaultHistoryTTL, new q4());
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
