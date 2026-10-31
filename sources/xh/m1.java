package xh;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.util.SparseIntArray;
import android.widget.ImageView;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class m1 {
    public final SparseIntArray a = new SparseIntArray();
    public final SparseIntArray b = new SparseIntArray();
    public final int[] c = {t6.G6, t6.u8, t6.G8, t6.E8, t6.F8, t6.I5, t6.wj};
    public float d;

    public final int a(int i10) {
        return i0.b.f(this.d, this.a.get(i10), this.b.get(i10));
    }

    public final void b(org.telegram.ui.ActionBar.l lVar, float f7) {
        this.d = f7;
        int i10 = t6.G6;
        lVar.setTitleColor(a(i10));
        lVar.setSubtitleColor(t6.r1(0.45f, a(i10)));
        lVar.D(a(i10), false);
        ImageView imageView = lVar.e;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(a(i10), PorterDuff.Mode.SRC_IN));
        }
        lVar.C(a(t6.u8), false);
    }

    public final void c(SparseIntArray sparseIntArray, int i10, p6 p6Var) {
        int i11;
        int[] iArr = this.c;
        int i12 = 0;
        if (i10 == 0) {
            while (i12 < iArr.length) {
                int i13 = iArr[i12];
                sparseIntArray.put(i13, t6.w0(i13, p6Var));
                i12++;
            }
            return;
        }
        int i14 = i0.b.h(i10) < 0.5d ? -1 : -16777216;
        int o10 = i0.b.o(i14, 60);
        while (i12 < iArr.length) {
            int i15 = iArr[i12];
            if (i15 == t6.G8 || i15 == t6.E8 || i15 == t6.F8 || i15 == (i11 = t6.I5)) {
                sparseIntArray.put(i15, t6.w0(i15, p6Var));
            } else if (i15 == t6.wj) {
                sparseIntArray.put(i15, i0.b.f(0.5f, i10, i14));
            } else if (i15 == t6.u8 || i15 == i11) {
                sparseIntArray.put(i15, o10);
            } else {
                sparseIntArray.put(i15, i14);
            }
            i12++;
        }
    }
}
