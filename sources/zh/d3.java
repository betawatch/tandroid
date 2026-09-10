package zh;

import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.s01;
import org.telegram.ui.vz0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class d3 implements q7 {
    public final /* synthetic */ Object a;

    public /* synthetic */ d3(Object obj) {
        this.a = obj;
    }

    @Override // zh.q7
    public void H0(long j3, int i10, j2 j2Var) {
        vz0 vz0Var = (vz0) this.a;
        int i11 = ProfileStoriesView.s0;
        vz0Var.f(true, false);
        j2Var.run();
    }

    @Override // zh.q7
    public boolean y0(long j3, int i10, int i11, int i12, r7 r7Var) {
        ImageReceiver imageReceiver;
        e3 e3Var;
        e3 e3Var2;
        r7Var.b = null;
        r7Var.c = null;
        vz0 vz0Var = (vz0) this.a;
        s01 s01Var = vz0Var.h;
        ArrayList arrayList = vz0Var.w;
        if (vz0Var.N < 0.2f) {
            r7Var.b = s01Var.getImageReceiver();
            r7Var.c = null;
            r7Var.a = s01Var;
            r7Var.h = 0.0f;
            r7Var.i = AndroidUtilities.displaySize.y;
            r7Var.g = (View) vz0Var.getParent();
            r7Var.d = vz0Var.y;
            r7Var.n = true;
            return true;
        }
        int i13 = 0;
        while (true) {
            if (i13 >= arrayList.size()) {
                imageReceiver = null;
                e3Var = null;
                e3Var2 = null;
                break;
            }
            e3 e3Var3 = (e3) arrayList.get(i13);
            if (e3Var3.e >= 1.0f && e3Var3.a == i11) {
                int i14 = i13 - 1;
                int i15 = i13 - 2;
                e3 d = ProfileStoriesView.d(i14 >= 0 ? (e3) arrayList.get(i14) : null, i15 >= 0 ? (e3) arrayList.get(i15) : null, e3Var3);
                imageReceiver = e3Var3.b;
                e3Var2 = d;
                e3Var = e3Var3;
            }
            i13++;
        }
        if (imageReceiver == null) {
            return false;
        }
        r7Var.c = imageReceiver;
        r7Var.b = null;
        r7Var.a = vz0Var;
        r7Var.h = 0.0f;
        r7Var.i = AndroidUtilities.displaySize.y;
        r7Var.g = (View) vz0Var.getParent();
        if (e3Var == null || e3Var2 == null) {
            r7Var.f = null;
            return true;
        }
        r7Var.f = new f1.a(this, new RectF(e3Var.m), e3Var, new RectF(e3Var2.m), e3Var2);
        return true;
    }

    @Override // zh.q7
    public /* synthetic */ void b(boolean z10) {
    }
}
