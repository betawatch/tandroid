package org.telegram.ui;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class sc extends FrameLayout {
    public final org.telegram.ui.ActionBar.f6 a;
    public final ec1 b;
    public final s4.c0 c;
    public final int d;
    public int e;

    public sc(int i10, Activity activity, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity);
        this.d = i10;
        this.a = f6Var;
        ec1 ec1Var = new ec1(activity, 3, f6Var);
        this.b = ec1Var;
        ec1Var.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(6.0f), 0);
        ec1Var.setClipToPadding(false);
        ec1Var.setAdapter(new qc(this, activity, f6Var, i10));
        s4.c0 c0Var = new s4.c0();
        this.c = c0Var;
        c0Var.j1(0);
        ec1Var.setLayoutManager(c0Var);
        addView(ec1Var, w7.x5.c(-1.0f, -1));
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
            AndroidUtilities.forEachViews((RecyclerView) this.b, (e2.h) new m4.s0(1, this, z10));
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
