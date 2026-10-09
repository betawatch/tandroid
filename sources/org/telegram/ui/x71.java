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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class x71 extends org.telegram.ui.Components.eb implements NotificationCenter.NotificationCenterDelegate {
    public final org.telegram.ui.Components.d00 X;
    public final ci.d Y;
    public final ai.e9 Z;
    public final HashMap a0;
    public final int b0;
    public int c0;
    public org.telegram.ui.Components.c71 d0;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public x71(org.telegram.ui.ActionBar.n2 n2Var, long j3, int i10, org.telegram.ui.Components.wc wcVar) {
        super(r2, n2Var, new org.telegram.ui.Components.db(r3));
        Activity parentActivity = n2Var.getParentActivity();
        org.telegram.ui.Components.db dbVar = new org.telegram.ui.Components.db();
        dbVar.a = false;
        dbVar.c = false;
        dbVar.f = 2;
        dbVar.g = n2Var.getResourceProvider();
        this.a0 = new HashMap();
        this.b0 = i10;
        ai.e9 A = MessagesController.getInstance(n2Var.getCurrentAccount()).getStoriesController().A(j3, 1, -1, true);
        this.Z = A;
        A.p(30, false);
        this.K = AndroidUtilities.dp(12.0f);
        fixNavigationBar();
        L();
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.h5, this.resourcesProvider));
        int i11 = this.backgroundPaddingLeft;
        frameLayout.setPadding(i11, 0, i11, 0);
        this.containerView.addView(frameLayout, w7.x5.a(-2.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 87));
        View view = new View(getContext());
        view.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.d7, this.resourcesProvider));
        frameLayout.addView(view, w7.x5.b(-1.0f, 1.0f / AndroidUtilities.density, 55));
        ci.d dVar = new ci.d(getContext(), this.resourcesProvider, true);
        this.Y = dVar;
        dVar.g(LocaleController.getString(R.string.StoriesAlbumMenuAddStories), false, true);
        dVar.setEnabled(false);
        dVar.setOnClickListener(new vy0(3, this, wcVar));
        frameLayout.addView(dVar, w7.x5.a(48.0f, 10.0f, (1.0f / AndroidUtilities.density) + 10.0f, 10.0f, 10.0f, -1, 119));
        getContext();
        org.telegram.ui.Components.d00 d00Var = new org.telegram.ui.Components.d00(i10, false);
        this.X = d00Var;
        d00Var.O = new v71(this);
        org.telegram.ui.Components.qm0 qm0Var = this.d;
        int i12 = this.backgroundPaddingLeft;
        qm0Var.setPadding(i12, 0, i12, 0);
        this.d.setSelectorType(9);
        this.d.setSelectorDrawableColor(0);
        this.d.setLayoutManager(d00Var);
        this.d.setOnItemClickListener(new z21(this, 5));
        this.d.setOnItemLongClickListener(new hq0(this, 16));
        this.d.setOnScrollListener(new w71(this));
        this.d0.N(true);
    }

    @Override // org.telegram.ui.Components.eb
    public final CharSequence B() {
        return LocaleController.getString(R.string.StoriesAlbumMenuAddStories);
    }

    public final void Q() {
        org.telegram.ui.Components.d00 d00Var = this.X;
        int L0 = d00Var.L0();
        int abs = L0 == -1 ? 0 : Math.abs(d00Var.N0() - L0) + 1;
        ai.e9 e9Var = this.Z;
        if (e9Var != null) {
            int i10 = L0 + abs;
            int i11 = e9Var.i();
            int i12 = this.b0;
            if (i10 > i11 - i12) {
                e9Var.p(Math.min(100, Math.max(1, i12 / 2) * i12 * i12), false);
            }
        }
    }

    public final boolean R(int i10, View view) {
        org.telegram.ui.Components.p61 G;
        org.telegram.ui.Components.c71 c71Var = this.d0;
        if (c71Var == null || i10 == 0 || (G = c71Var.G(i10 - 1)) == null) {
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
                ((org.telegram.ui.Cells.t7) view).i(false, true);
            } else {
                hashMap.put(Integer.valueOf(id2), messageObject.storyItem);
                G.e = true;
                ((org.telegram.ui.Cells.t7) view).i(true, true);
            }
            boolean z10 = !hashMap.isEmpty();
            ci.d dVar = this.Y;
            dVar.setEnabled(z10);
            dVar.b(hashMap.size(), true);
        }
        return true;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.storiesListUpdated && ((ai.e9) objArr[0]) == this.Z) {
            this.d0.N(false);
            Q();
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

    @Override // org.telegram.ui.Components.eb
    public final org.telegram.ui.Components.pm0 x(org.telegram.ui.Components.qm0 qm0Var) {
        org.telegram.ui.Components.c71 c71Var = new org.telegram.ui.Components.c71(qm0Var, getContext(), this.currentAccount, 0, false, new b5(this, 25), this.resourcesProvider);
        this.d0 = c71Var;
        c71Var.r = false;
        return c71Var;
    }
}
