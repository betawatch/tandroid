package yh;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.Components.z81;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final class v7 extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {
    public final int a;
    public final z81 b;
    public final u7 c;

    public v7(Context context, int i10, boolean z10, long j3, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.a = i10;
        setOrientation(1);
        z81 z81Var = new z81(context, null);
        this.b = z81Var;
        u7 u7Var = new u7(context, i10, z10, j3, i11, f6Var);
        this.c = u7Var;
        z81Var.setAdapter(u7Var);
        View n10 = z81Var.n(3, true);
        View view = new View(context);
        view.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d7, f6Var));
        addView(n10, w7.y5.n(-1, 48));
        addView(view, new LinearLayout.LayoutParams(w7.y5.z(-1.0f), w7.y5.z(1.0f / AndroidUtilities.density)));
        addView(z81Var, w7.y5.n(-1, -1));
        setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.h5, f6Var));
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starTransactionsLoaded) {
            this.c.i();
            this.b.o(true);
        }
    }

    public yl0 getCurrentListView() {
        View currentView = this.b.getCurrentView();
        if (currentView instanceof t7) {
            return ((t7) currentView).a;
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
