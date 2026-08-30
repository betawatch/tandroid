package org.telegram.ui;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class sc extends FrameLayout {
    public final org.telegram.ui.ActionBar.f6 a;
    public final jb1 b;
    public final f2.i0 c;
    public final int d;
    public int e;

    public sc(int i10, Activity activity, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity);
        this.d = i10;
        this.a = f6Var;
        jb1 jb1Var = new jb1(activity, 2, f6Var);
        this.b = jb1Var;
        jb1Var.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(6.0f), 0);
        jb1Var.setClipToPadding(false);
        jb1Var.setAdapter(new qc(this, activity, f6Var, i10));
        f2.i0 i0Var = new f2.i0();
        this.c = i0Var;
        i0Var.j1(0);
        jb1Var.setLayoutManager(i0Var);
        addView(jb1Var, k7.b6.c(-1.0f, -1));
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
            AndroidUtilities.forEachViews((RecyclerView) this.b, (h5.d) new pc(0, this, z4));
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
