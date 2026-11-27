// default package

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class xt7 extends e {
    public final CharSequence a;
    public final ArrayList b;
    public final int c;
    public final int d;
    public final int e;
    public fe7 f;
    public pl7 h;
    public q9c n;
    public boolean r;

    public xt7(CharSequence charSequence, ArrayList arrayList, int i, int i2, int i3) {
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
        return arrayList.size() == 1 && ((ut7) arrayList.get(0)).a == 0 && ((ut7) arrayList.get(0)).b == 1439;
    }

    public final boolean Z() {
        ArrayList arrayList = this.b;
        if (arrayList.size() >= this.e) {
            return false;
        }
        return arrayList.isEmpty() || Y() || ((ut7) c00.g(1, arrayList)).b < Math.min(1438, this.d + (-2));
    }

    @Override // org.telegram.ui.ActionBar.e
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(this.a);
        this.simpleActionBar.setActionBarMenuOnItemClick(new zl5(this, (byte) 16));
        FrameLayout frameLayout = new FrameLayout(context);
        q9c q9cVar = new q9c(this, new yt4(this, (byte) 24), new bm6(this, (byte) 24), null);
        this.n = q9cVar;
        q9cVar.s1();
        this.n.setSectionsDrawBackground(true);
        frameLayout.addView(this.n, tre.c(-1.0f, -1));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final d79 getListViewForSimpleGlass() {
        return this.n;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onBecomeFullyHidden() {
        pl7 pl7Var = this.h;
        if (pl7Var != null) {
            pl7Var.run();
        }
        super.onBecomeFullyHidden();
    }

    @Override // org.telegram.ui.ActionBar.e
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
        fe7 fe7Var = this.f;
        if (fe7Var != null) {
            fe7Var.run();
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            if (this.n != null) {
                for (int i = 0; i < this.n.getChildCount(); i++) {
                    View childAt = this.n.getChildAt(i);
                    if ((childAt instanceof wkb) && ((wkb) childAt).b == -1) {
                        yob.h(this.r ? aob.f6 : aob.e6, null, childAt);
                    }
                }
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean useSimpleActionBar() {
        return true;
    }
}
