package yh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.bm0;
import org.telegram.ui.Components.bw0;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.h91;
import org.telegram.ui.Components.zl0;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public final class y7 extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {
    public final int a;
    public final h91 b;
    public final x7 c;
    public final FrameLayout d;
    public final bw0 e;
    public final long f;

    public y7(Context context, int i10, boolean z10, long j3, int i11, org.telegram.ui.ActionBar.d6 d6Var, bw0 bw0Var) {
        super(context);
        this.e = bw0Var;
        this.a = i10;
        this.f = j3;
        setOrientation(1);
        h91 h91Var = bw0Var == null ? new h91(context, null) : new bm0(context, d6Var, bw0Var);
        this.b = h91Var;
        x7 x7Var = new x7(context, i10, z10, j3, i11, d6Var);
        this.c = x7Var;
        x7Var.g = bw0Var == null ? null : (bm0) h91Var;
        h91Var.setAdapter(x7Var);
        View n10 = h91Var.n(bw0Var == null ? 3 : -2, true);
        View view = new View(context);
        view.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.d7, d6Var));
        if (bw0Var == null) {
            this.d = null;
            addView(n10, w7.z5.n(-1, 48));
            addView(view, new LinearLayout.LayoutParams(w7.z5.z(-1.0f), w7.z5.z(1.0f / AndroidUtilities.density)));
            setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.h5, d6Var));
        } else {
            setClipChildren(false);
            setClipToPadding(false);
            FrameLayout frameLayout = new FrameLayout(context);
            this.d = frameLayout;
            frameLayout.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
            frameLayout.addView(n10, w7.z5.e(-1, 48, 48));
        }
        addView(h91Var, w7.z5.n(-1, -1));
    }

    public final void a(boolean z10) {
        x7 x7Var = this.c;
        h91 h91Var = this.b;
        bw0 bw0Var = this.e;
        if (bw0Var == null) {
            x7Var.i();
            h91Var.o(z10);
            return;
        }
        ArrayList arrayList = x7Var.i;
        ArrayList arrayList2 = x7Var.i;
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            i10 |= 1 << ((h61) arrayList.get(i11)).z;
        }
        View currentView = h91Var.getCurrentView();
        int i12 = currentView instanceof w7 ? ((w7) currentView).d : 0;
        x7Var.i();
        int i13 = 0;
        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
            i13 |= 1 << ((h61) arrayList2.get(i14)).z;
        }
        if (i10 == i13) {
            if (z10) {
                return;
            }
            h91Var.o(false);
            return;
        }
        h91Var.onTouchEvent(null);
        int i15 = 0;
        while (true) {
            if (i15 >= arrayList2.size()) {
                i15 = 0;
                break;
            } else if (((h61) arrayList2.get(i15)).z == i12) {
                break;
            } else {
                i15++;
            }
        }
        h91Var.setPosition(i15);
        h91Var.J();
        h91Var.o(false);
        bw0Var.l();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.starTransactionsLoaded;
        long j3 = this.f;
        if ((i10 == i12 && j3 == 0) || (i10 == NotificationCenter.botStarsTransactionsLoaded && j3 != 0 && ((Long) objArr[0]).longValue() == j3)) {
            a(true);
        }
    }

    public zl0 getCurrentListView() {
        View currentView = this.b.getCurrentView();
        if (currentView instanceof w7) {
            return ((w7) currentView).a;
        }
        return null;
    }

    public FrameLayout getTabsContainer() {
        return this.d;
    }

    public h91 getViewPager() {
        return this.b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        a(false);
        NotificationCenter.getInstance(this.a).addObserver(this, this.f == 0 ? NotificationCenter.starTransactionsLoaded : NotificationCenter.botStarsTransactionsLoaded);
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        NotificationCenter.getInstance(this.a).removeObserver(this, this.f == 0 ? NotificationCenter.starTransactionsLoaded : NotificationCenter.botStarsTransactionsLoaded);
        super.onDetachedFromWindow();
    }

    public void setGlassEngine(li.p pVar) {
        if (pVar != null) {
            x7 x7Var = this.c;
            if (x7Var.h == pVar) {
                return;
            }
            x7Var.h = pVar;
            h91 h91Var = this.b;
            pVar.c(h91Var);
            for (View view : h91Var.getViewPages()) {
                if (view instanceof w7) {
                    pVar.b(((w7) view).a);
                }
            }
        }
    }
}
