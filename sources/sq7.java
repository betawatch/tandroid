// default package

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class sq7 extends d {
    public final CharSequence a;
    public final ArrayList b;
    public final int c;
    public final int d;
    public final int e;
    public oq7 f;
    public bj7 h;
    public q5c n;
    public boolean r;

    public sq7(CharSequence charSequence, ArrayList arrayList, int i, int i2, int i3) {
        super(null);
        this.a = charSequence;
        this.b = arrayList;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.r = !arrayList.isEmpty();
    }

    public final boolean Y() {
        ArrayList arrayList = this.b;
        return arrayList.size() == 1 && ((pq7) arrayList.get(0)).a == 0 && ((pq7) arrayList.get(0)).b == 1439;
    }

    public final boolean Z() {
        ArrayList arrayList = this.b;
        if (arrayList.size() >= this.e) {
            return false;
        }
        return arrayList.isEmpty() || Y() || ((pq7) b00.f(1, arrayList)).b < Math.min(1438, this.d + (-2));
    }

    @Override // org.telegram.ui.ActionBar.d
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(this.a);
        this.simpleActionBar.setActionBarMenuOnItemClick(new bq5(this, (byte) 14));
        FrameLayout frameLayout = new FrameLayout(context);
        q5c q5cVar = new q5c(this, new ur4(this, (byte) 24), new im6(this, (byte) 19), null);
        this.n = q5cVar;
        q5cVar.r1();
        this.n.setSectionsDrawBackground(true);
        frameLayout.addView(this.n, nme.c(-1.0f, -1));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final o39 getListViewForSimpleGlass() {
        return this.n;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onBecomeFullyHidden() {
        bj7 bj7Var = this.h;
        if (bj7Var != null) {
            bj7Var.run();
        }
        super.onBecomeFullyHidden();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.r) {
            return;
        }
        ArrayList arrayList = this.b;
        if (arrayList.isEmpty()) {
            return;
        }
        arrayList.clear();
        oq7 oq7Var = this.f;
        if (oq7Var != null) {
            oq7Var.run();
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            if (this.n != null) {
                for (int i = 0; i < this.n.getChildCount(); i++) {
                    View childAt = this.n.getChildAt(i);
                    if ((childAt instanceof ahb) && ((ahb) childAt).b == -1) {
                        zkb.h(this.r ? bkb.e6 : bkb.d6, null, childAt);
                    }
                }
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean useSimpleActionBar() {
        return true;
    }
}
