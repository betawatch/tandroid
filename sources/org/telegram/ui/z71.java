package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class z71 extends org.telegram.ui.Components.ab implements NotificationCenter.NotificationCenterDelegate {
    public final org.telegram.ui.Components.uz X;
    public final bi.d Y;
    public final zh.a5 Z;
    public final HashMap a0;
    public final int b0;
    public int c0;
    public org.telegram.ui.Components.j61 d0;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public z71(org.telegram.ui.ActionBar.p2 p2Var, long j3, int i10, org.telegram.ui.Components.sc scVar) {
        super(r2, p2Var, new org.telegram.ui.Components.za(r3));
        Activity parentActivity = p2Var.getParentActivity();
        org.telegram.ui.Components.za zaVar = new org.telegram.ui.Components.za();
        zaVar.a = false;
        zaVar.c = false;
        zaVar.f = 2;
        zaVar.g = p2Var.getResourceProvider();
        this.a0 = new HashMap();
        this.b0 = i10;
        zh.a5 A = MessagesController.getInstance(p2Var.getCurrentAccount()).getStoriesController().A(j3, 1, -1, true);
        this.Z = A;
        A.p(30, false);
        this.K = AndroidUtilities.dp(12.0f);
        fixNavigationBar();
        K();
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.h5, this.resourcesProvider));
        int i11 = this.backgroundPaddingLeft;
        frameLayout.setPadding(i11, 0, i11, 0);
        this.containerView.addView(frameLayout, w7.a6.d(-1, -2.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        View view = new View(getContext());
        view.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d7, this.resourcesProvider));
        frameLayout.addView(view, w7.a6.a(-1.0f, 1.0f / AndroidUtilities.density, 55));
        bi.d dVar = new bi.d(getContext(), this.resourcesProvider, true);
        this.Y = dVar;
        dVar.g(LocaleController.getString(R.string.StoriesAlbumMenuAddStories), false, true);
        dVar.setEnabled(false);
        dVar.setOnClickListener(new w71(0, this, scVar));
        frameLayout.addView(dVar, w7.a6.d(-1, 48.0f, 119, 10.0f, (1.0f / AndroidUtilities.density) + 10.0f, 10.0f, 10.0f));
        getContext();
        org.telegram.ui.Components.uz uzVar = new org.telegram.ui.Components.uz(i10, false);
        this.X = uzVar;
        uzVar.O = new x71(this);
        org.telegram.ui.Components.vl0 vl0Var = this.d;
        int i12 = this.backgroundPaddingLeft;
        vl0Var.setPadding(i12, 0, i12, 0);
        this.d.setSelectorType(9);
        this.d.setSelectorDrawableColor(0);
        this.d.setLayoutManager(uzVar);
        this.d.setOnItemClickListener(new f31(this, 4));
        this.d.setOnItemLongClickListener(new ul0(this, 17));
        this.d.setOnScrollListener(new y71(this));
        this.d0.N(true);
    }

    public final void P() {
        org.telegram.ui.Components.uz uzVar = this.X;
        int L0 = uzVar.L0();
        int abs = L0 == -1 ? 0 : Math.abs(uzVar.N0() - L0) + 1;
        zh.a5 a5Var = this.Z;
        if (a5Var != null) {
            int i10 = L0 + abs;
            int i11 = a5Var.i();
            int i12 = this.b0;
            if (i10 > i11 - i12) {
                a5Var.p(Math.min(100, Math.max(1, i12 / 2) * i12 * i12), false);
            }
        }
    }

    public final boolean Q(int i10, View view) {
        org.telegram.ui.Components.v51 G;
        org.telegram.ui.Components.j61 j61Var = this.d0;
        if (j61Var == null || i10 == 0 || (G = j61Var.G(i10 - 1)) == null) {
            return false;
        }
        Object obj = G.G;
        if (obj instanceof MessageObject) {
            MessageObject messageObject = (MessageObject) obj;
            int id2 = messageObject.getId();
            Integer valueOf = Integer.valueOf(id2);
            HashMap hashMap = this.a0;
            if (hashMap.containsKey(valueOf)) {
                hashMap.remove(Integer.valueOf(id2));
                G.e = false;
                ((org.telegram.ui.Cells.u7) view).i(false, true);
            } else {
                hashMap.put(Integer.valueOf(id2), messageObject.storyItem);
                G.e = true;
                ((org.telegram.ui.Cells.u7) view).i(true, true);
            }
            boolean z10 = !hashMap.isEmpty();
            bi.d dVar = this.Y;
            dVar.setEnabled(z10);
            dVar.b(hashMap.size(), true);
        }
        return true;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.storiesListUpdated && ((zh.a5) objArr[0]) == this.Z) {
            this.d0.N(false);
            P();
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.c0 = this.Z.o();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesListUpdated);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.Z.z(this.c0);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.storiesListUpdated);
    }

    @Override // org.telegram.ui.Components.ab
    public final org.telegram.ui.Components.ul0 v(org.telegram.ui.Components.vl0 vl0Var) {
        org.telegram.ui.Components.j61 j61Var = new org.telegram.ui.Components.j61(vl0Var, getContext(), this.currentAccount, 0, false, new b5(this, 25), this.resourcesProvider);
        this.d0 = j61Var;
        j61Var.r = false;
        return j61Var;
    }

    @Override // org.telegram.ui.Components.ab
    public final CharSequence y() {
        return LocaleController.getString(R.string.StoriesAlbumMenuAddStories);
    }
}
