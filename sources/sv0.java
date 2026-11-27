// default package

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.util.SparseIntArray;
import android.widget.ImageView;
import org.telegram.ui.ActionBar.a;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class sv0 {
    public final SparseIntArray a = new SparseIntArray();
    public final SparseIntArray b = new SparseIntArray();
    public final int[] c = {aob.G6, aob.u8, aob.G8, aob.E8, aob.F8, aob.I5, aob.zj};
    public float d;

    public final int a(int i) {
        return vm2.f(this.d, this.a.get(i), this.b.get(i));
    }

    public final void b(a aVar, float f) {
        this.d = f;
        int i = aob.G6;
        aVar.setTitleColor(a(i));
        aVar.setSubtitleColor(aob.p1(0.45f, a(i)));
        aVar.H(a(i), false);
        ImageView imageView = aVar.e;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(a(i), PorterDuff.Mode.SRC_IN));
        }
        aVar.G(a(aob.u8), false);
    }

    public final void c(SparseIntArray sparseIntArray, int i, vnb vnbVar) {
        int i2;
        int[] iArr = this.c;
        int i3 = 0;
        if (i == 0) {
            while (i3 < iArr.length) {
                int i4 = iArr[i3];
                sparseIntArray.put(i4, aob.v0(i4, vnbVar));
                i3++;
            }
            return;
        }
        int i5 = vm2.h(i) < 0.5d ? -1 : -16777216;
        int o = vm2.o(i5, 60);
        while (i3 < iArr.length) {
            int i6 = iArr[i3];
            if (i6 == aob.G8 || i6 == aob.E8 || i6 == aob.F8 || i6 == (i2 = aob.I5)) {
                sparseIntArray.put(i6, aob.v0(i6, vnbVar));
            } else if (i6 == aob.zj) {
                sparseIntArray.put(i6, vm2.f(0.5f, i, i5));
            } else if (i6 == aob.u8 || i6 == i2) {
                sparseIntArray.put(i6, o);
            } else {
                sparseIntArray.put(i6, i5);
            }
            i3++;
        }
    }
}
