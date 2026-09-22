package yh;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.i81;
import org.telegram.ui.Components.ll0;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class w7 extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {
    public final int a;
    public final i81 b;
    public final v7 c;

    public w7(Context context, int i10, boolean z10, long j3, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.a = i10;
        setOrientation(1);
        i81 i81Var = new i81(context, null);
        this.b = i81Var;
        v7 v7Var = new v7(context, i10, z10, j3, i11, e6Var);
        this.c = v7Var;
        i81Var.setAdapter(v7Var);
        View n10 = i81Var.n(3, true);
        View view = new View(context);
        view.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.d7, e6Var));
        addView(n10, w7.x5.n(-1, 48));
        addView(view, new LinearLayout.LayoutParams(w7.x5.z(-1.0f), w7.x5.z(1.0f / AndroidUtilities.density)));
        addView(i81Var, w7.x5.n(-1, -1));
        setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.h5, e6Var));
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starTransactionsLoaded) {
            this.c.i();
            this.b.o(true);
        }
    }

    public ll0 getCurrentListView() {
        View currentView = this.b.getCurrentView();
        if (currentView instanceof u7) {
            return ((u7) currentView).a;
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        this.c.i();
        this.b.o(false);
        NotificationCenter.getInstance(this.a).addObserver(this, NotificationCenter.starTransactionsLoaded);
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        NotificationCenter.getInstance(this.a).removeObserver(this, NotificationCenter.starTransactionsLoaded);
        super.onDetachedFromWindow();
    }
}
