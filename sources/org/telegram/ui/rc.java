package org.telegram.ui;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class rc extends FrameLayout {
    public final org.telegram.ui.ActionBar.g6 a;
    public final qb1 b;
    public final f2.j0 c;
    public final int d;
    public int e;

    public rc(int i10, Activity activity, org.telegram.ui.ActionBar.g6 g6Var) {
        super(activity);
        this.d = i10;
        this.a = g6Var;
        qb1 qb1Var = new qb1(activity, 2, g6Var);
        this.b = qb1Var;
        qb1Var.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(6.0f), 0);
        qb1Var.setClipToPadding(false);
        qb1Var.setAdapter(new pc(this, activity, g6Var, i10));
        f2.j0 j0Var = new f2.j0();
        this.c = j0Var;
        j0Var.j1(0);
        qb1Var.setLayoutManager(j0Var);
        addView(qb1Var, k7.c6.c(-1.0f, -1));
    }

    public final void a(int i10, boolean z4) {
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
            if (!z4) {
                this.c.h1(i11, (AndroidUtilities.displaySize.x - AndroidUtilities.dp(56.0f)) / 2);
            }
            AndroidUtilities.forEachViews((RecyclerView) this.b, (h5.d) new oc(0, this, z4));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (getParent() != null) {
            ViewParent parent = getParent();
            boolean z4 = true;
            if (!canScrollHorizontally(-1) && !canScrollHorizontally(1)) {
                z4 = false;
            }
            parent.requestDisallowInterceptTouchEvent(z4);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
}
