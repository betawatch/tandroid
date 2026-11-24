// default package

import android.util.SparseIntArray;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class wo1 implements eec {
    public final /* synthetic */ AtomicBoolean a;
    public final /* synthetic */ LinearLayout b;
    public final /* synthetic */ int c;
    public final /* synthetic */ HorizontalScrollView d;
    public final /* synthetic */ SparseIntArray e;
    public final /* synthetic */ ActionBarPopupWindow$ActionBarPopupWindowLayout f;
    public final /* synthetic */ int[] g;

    public wo1(AtomicBoolean atomicBoolean, LinearLayout linearLayout, int i, HorizontalScrollView horizontalScrollView, SparseIntArray sparseIntArray, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr) {
        this.a = atomicBoolean;
        this.b = linearLayout;
        this.c = i;
        this.d = horizontalScrollView;
        this.e = sparseIntArray;
        this.f = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.g = iArr;
    }

    @Override // eec
    public final void a(int i) {
        this.f.getSwipeBack().f(this.g[0], this.e.get(i), true);
    }

    @Override // eec
    public final void b(float f, int i, int i2) {
        HorizontalScrollView horizontalScrollView;
        if (this.a.get()) {
            return;
        }
        float f2 = -1.0f;
        float f3 = -1.0f;
        int i3 = 0;
        while (true) {
            LinearLayout linearLayout = this.b;
            int childCount = linearLayout.getChildCount();
            horizontalScrollView = this.d;
            if (i3 >= childCount) {
                break;
            }
            c09 c09Var = (c09) linearLayout.getChildAt(i3);
            c09Var.setOutlineProgress(i3 == i ? 1.0f - f : i3 == (i + 1) % this.c ? f : 0.0f);
            if (i3 == i) {
                f2 = c09Var.getX() - ((horizontalScrollView.getWidth() - c09Var.getWidth()) / 2.0f);
            }
            if (i3 == i + 1) {
                f3 = c09Var.getX() - ((horizontalScrollView.getWidth() - c09Var.getWidth()) / 2.0f);
            }
            i3++;
        }
        if (f2 != -1.0f && f3 != -1.0f) {
            horizontalScrollView.setScrollX((int) tb4.A(f3, f2, f, f2));
        }
        SparseIntArray sparseIntArray = this.e;
        this.f.getSwipeBack().f(this.g[0], (int) ((sparseIntArray.get(i + 1, 0) * f) + ((1.0f - f) * sparseIntArray.get(i, 0))), false);
    }

    @Override // eec
    public final void c(int i) {
        if (i == 0) {
            this.a.set(false);
        }
    }
}
