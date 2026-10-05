package org.telegram.ui;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class tc extends FrameLayout {
    public final org.telegram.ui.ActionBar.d6 a;
    public final xb1 b;
    public final s4.c0 c;
    public final int d;
    public int e;

    public tc(int i10, Activity activity, org.telegram.ui.ActionBar.d6 d6Var) {
        super(activity);
        this.d = i10;
        this.a = d6Var;
        xb1 xb1Var = new xb1(activity, 3, d6Var);
        this.b = xb1Var;
        xb1Var.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(6.0f), 0);
        xb1Var.setClipToPadding(false);
        xb1Var.setAdapter(new rc(this, activity, d6Var, i10));
        s4.c0 c0Var = new s4.c0();
        this.c = c0Var;
        c0Var.j1(0);
        xb1Var.setLayoutManager(c0Var);
        addView(xb1Var, w7.z5.c(-1.0f, -1));
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
            AndroidUtilities.forEachViews((RecyclerView) this.b, (Utilities.Callback<View>) new ai.i3(3, this, z10));
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
}
