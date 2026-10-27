package org.telegram.ui;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class sc extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public final org.telegram.ui.ActionBar.u6 a;
    public final bb1 b;
    public final s4.c0 c;
    public final int d;
    public int e;

    public sc(int i10, Activity activity, org.telegram.ui.ActionBar.u6 u6Var) {
        super(activity);
        this.d = i10;
        this.a = u6Var;
        bb1 bb1Var = new bb1(activity, 3, u6Var);
        this.b = bb1Var;
        bb1Var.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(6.0f), 0);
        bb1Var.setClipToPadding(false);
        bb1Var.setAdapter(new qc(this, activity, u6Var, i10));
        s4.c0 c0Var = new s4.c0();
        this.c = c0Var;
        c0Var.k1(0);
        bb1Var.setLayoutManager(c0Var);
        addView(bb1Var, org.telegram.ui.Components.kb1.g(-1.0f, -1));
    }

    public final void a(int i10, boolean z10) {
        MessagesController.PeerColors peerColors = MessagesController.getInstance(this.d).peerColors;
        int i11 = 0;
        if (peerColors != null) {
            int i12 = 0;
            while (true) {
                if (i12 >= peerColors.colors.size()) {
                    break;
                }
                if (peerColors.colors.get(i12).id == i10) {
                    i11 = i12;
                    break;
                }
                i12++;
            }
        }
        if (i11 != this.e) {
            this.e = i11;
            if (!z10) {
                this.c.h1(i11, (AndroidUtilities.displaySize.x - AndroidUtilities.dp(56.0f)) / 2);
            }
            AndroidUtilities.forEachViews((RecyclerView) this.b, (Utilities.Callback<View>) new bi.t8(4, this, z10));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (getParent() != null) {
            ViewParent parent = getParent();
            boolean z10 = true;
            if (!canScrollHorizontally(-1) && !canScrollHorizontally(1)) {
                z10 = false;
            }
            parent.requestDisallowInterceptTouchEvent(z10);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        AndroidUtilities.forEachViews((RecyclerView) this.b, (Utilities.Callback<View>) new li.s2(8, this, MessagesController.getInstance(this.d).peerColors));
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
