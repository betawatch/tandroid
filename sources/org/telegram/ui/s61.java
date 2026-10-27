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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class s61 extends org.telegram.ui.Components.bb implements NotificationCenter.NotificationCenterDelegate {
    public final org.telegram.ui.Components.vz X;
    public final fi.d Y;
    public final di.z6 Z;
    public final HashMap a0;
    public final int b0;
    public int c0;
    public org.telegram.ui.Components.k71 d0;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public s61(org.telegram.ui.ActionBar.r2 r2Var, long j10, int i10, bi.f4 f4Var) {
        super(r2, r2Var, new org.telegram.ui.Components.ab(r3));
        Activity parentActivity = r2Var.getParentActivity();
        org.telegram.ui.Components.ab abVar = new org.telegram.ui.Components.ab();
        abVar.a = false;
        abVar.c = false;
        abVar.f = 2;
        abVar.g = r2Var.getResourceProvider();
        this.a0 = new HashMap();
        this.b0 = i10;
        di.z6 A = MessagesController.getInstance(r2Var.getCurrentAccount()).getStoriesController().A(j10, 1, -1, true);
        this.Z = A;
        A.p(30, false);
        this.K = AndroidUtilities.dp(12.0f);
        fixNavigationBar();
        K();
        FrameLayout frameLayout = new FrameLayout(getContext());
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.h5, frameLayout, this.resourcesProvider);
        int i11 = this.backgroundPaddingLeft;
        frameLayout.setPadding(i11, 0, i11, 0);
        this.containerView.addView(frameLayout, org.telegram.ui.Components.kb1.h(-1, -2.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        View view = new View(getContext());
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d7, view, this.resourcesProvider);
        frameLayout.addView(view, org.telegram.ui.Components.kb1.e(-1.0f, 1.0f / AndroidUtilities.density, 55));
        fi.d dVar = new fi.d(getContext(), this.resourcesProvider, true);
        this.Y = dVar;
        dVar.i(LocaleController.getString(R.string.StoriesAlbumMenuAddStories), false, true);
        dVar.setEnabled(false);
        dVar.setOnClickListener(new zd0(14, this, f4Var));
        frameLayout.addView(dVar, org.telegram.ui.Components.kb1.h(-1, 48.0f, 119, 10.0f, (1.0f / AndroidUtilities.density) + 10.0f, 10.0f, 10.0f));
        getContext();
        org.telegram.ui.Components.vz vzVar = new org.telegram.ui.Components.vz(i10, false);
        this.X = vzVar;
        vzVar.O = new q61(this);
        org.telegram.ui.Components.nm0 nm0Var = this.d;
        int i12 = this.backgroundPaddingLeft;
        nm0Var.setPadding(i12, 0, i12, 0);
        this.d.setSelectorType(9);
        this.d.setSelectorDrawableColor(0);
        this.d.setLayoutManager(vzVar);
        this.d.setOnItemClickListener(new o11(this, 5));
        this.d.setOnItemLongClickListener(new jl0(this, 18));
        this.d.setOnScrollListener(new r61(this));
        this.d0.O(true);
    }

    public final void P() {
        org.telegram.ui.Components.vz vzVar = this.X;
        int L0 = vzVar.L0();
        int abs = L0 == -1 ? 0 : Math.abs(vzVar.N0() - L0) + 1;
        di.z6 z6Var = this.Z;
        if (z6Var != null) {
            int i10 = L0 + abs;
            int i11 = z6Var.i();
            int i12 = this.b0;
            if (i10 > i11 - i12) {
                z6Var.p(Math.min(100, Math.max(1, i12 / 2) * i12 * i12), false);
            }
        }
    }

    public final boolean Q(int i10, View view) {
        org.telegram.ui.Components.u61 G;
        org.telegram.ui.Components.k71 k71Var = this.d0;
        if (k71Var == null || i10 == 0 || (G = k71Var.G(i10 - 1)) == null) {
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
                ((org.telegram.ui.Cells.w7) view).i(false, true);
            } else {
                hashMap.put(Integer.valueOf(id2), messageObject.storyItem);
                G.e = true;
                ((org.telegram.ui.Cells.w7) view).i(true, true);
            }
            boolean z10 = !hashMap.isEmpty();
            fi.d dVar = this.Y;
            dVar.setEnabled(z10);
            dVar.b(hashMap.size(), true);
        }
        return true;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.storiesListUpdated && ((di.z6) objArr[0]) == this.Z) {
            this.d0.O(false);
            P();
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.c0 = this.Z.o();
        NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.storiesListUpdated);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.Z.z(this.c0);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.storiesListUpdated);
    }

    @Override // org.telegram.ui.Components.bb
    public final org.telegram.ui.Components.mm0 v(org.telegram.ui.Components.nm0 nm0Var) {
        org.telegram.ui.Components.k71 k71Var = new org.telegram.ui.Components.k71(nm0Var, getContext(), this.currentAccount, 0, false, new e5(this, 25), this.resourcesProvider);
        this.d0 = k71Var;
        k71Var.r = false;
        return k71Var;
    }

    @Override // org.telegram.ui.Components.bb
    public final CharSequence y() {
        return LocaleController.getString(R.string.StoriesAlbumMenuAddStories);
    }
}
