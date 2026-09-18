package yh;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.j81;
import org.telegram.ui.Components.ml0;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final class x7 extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {
    public final int a;
    public final j81 b;
    public final w7 c;

    public x7(Context context, int i10, boolean z10, long j3, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.a = i10;
        setOrientation(1);
        j81 j81Var = new j81(context, null);
        this.b = j81Var;
        w7 w7Var = new w7(context, i10, z10, j3, i11, f6Var);
        this.c = w7Var;
        j81Var.setAdapter(w7Var);
        View n10 = j81Var.n(3, true);
        View view = new View(context);
        view.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d7, f6Var));
        addView(n10, w7.x5.n(-1, 48));
        addView(view, new LinearLayout.LayoutParams(w7.x5.z(-1.0f), w7.x5.z(1.0f / AndroidUtilities.density)));
        addView(j81Var, w7.x5.n(-1, -1));
        setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.h5, f6Var));
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starTransactionsLoaded) {
            this.c.i();
            this.b.o(true);
        }
    }

    public ml0 getCurrentListView() {
        View currentView = this.b.getCurrentView();
        if (currentView instanceof v7) {
            return ((v7) currentView).a;
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
