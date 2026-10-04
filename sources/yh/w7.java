package yh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.aw0;
import org.telegram.ui.Components.bm0;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.g91;
import org.telegram.ui.Components.zl0;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes4.dex */
public final class w7 extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {
    public final int a;
    public final g91 b;
    public final v7 c;
    public final FrameLayout d;
    public final aw0 e;

    public w7(Context context, int i10, boolean z10, long j3, int i11, org.telegram.ui.ActionBar.d6 d6Var, aw0 aw0Var) {
        super(context);
        this.e = aw0Var;
        this.a = i10;
        setOrientation(1);
        g91 g91Var = aw0Var == null ? new g91(context, null) : new bm0(context, d6Var, aw0Var);
        this.b = g91Var;
        v7 v7Var = new v7(context, i10, z10, j3, i11, d6Var);
        this.c = v7Var;
        v7Var.g = aw0Var == null ? null : (bm0) g91Var;
        g91Var.setAdapter(v7Var);
        View n10 = g91Var.n(aw0Var == null ? 3 : -2, true);
        View view = new View(context);
        view.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.d7, d6Var));
        if (aw0Var == null) {
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
        addView(g91Var, w7.z5.n(-1, -1));
    }

    public final void a(boolean z10) {
        v7 v7Var = this.c;
        g91 g91Var = this.b;
        aw0 aw0Var = this.e;
        if (aw0Var == null) {
            v7Var.i();
            g91Var.o(z10);
            return;
        }
        ArrayList arrayList = v7Var.i;
        ArrayList arrayList2 = v7Var.i;
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            i10 |= 1 << ((g61) arrayList.get(i11)).z;
        }
        View currentView = g91Var.getCurrentView();
        int i12 = currentView instanceof u7 ? ((u7) currentView).d : 0;
        v7Var.i();
        int i13 = 0;
        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
            i13 |= 1 << ((g61) arrayList2.get(i14)).z;
        }
        if (i10 == i13) {
            if (z10) {
                return;
            }
            g91Var.o(false);
            return;
        }
        g91Var.onTouchEvent(null);
        int i15 = 0;
        while (true) {
            if (i15 >= arrayList2.size()) {
                i15 = 0;
                break;
            } else if (((g61) arrayList2.get(i15)).z == i12) {
                break;
            } else {
                i15++;
            }
        }
        g91Var.setPosition(i15);
        g91Var.J();
        g91Var.o(false);
        aw0Var.k0();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starTransactionsLoaded) {
            a(true);
        }
    }

    public zl0 getCurrentListView() {
        View currentView = this.b.getCurrentView();
        if (currentView instanceof u7) {
            return ((u7) currentView).a;
        }
        return null;
    }

    public FrameLayout getTabsContainer() {
        return this.d;
    }

    public g91 getViewPager() {
        return this.b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        a(false);
        NotificationCenter.getInstance(this.a).addObserver(this, NotificationCenter.starTransactionsLoaded);
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        NotificationCenter.getInstance(this.a).removeObserver(this, NotificationCenter.starTransactionsLoaded);
        super.onDetachedFromWindow();
    }

    public void setGlassEngine(li.m mVar) {
        if (mVar != null) {
            v7 v7Var = this.c;
            if (v7Var.h == mVar) {
                return;
            }
            v7Var.h = mVar;
            g91 g91Var = this.b;
            mVar.c(g91Var);
            for (View view : g91Var.getViewPages()) {
                if (view instanceof u7) {
                    mVar.b(((u7) view).a);
                }
            }
        }
    }
}
