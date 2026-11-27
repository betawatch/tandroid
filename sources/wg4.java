// default package

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class wg4 extends c79 {
    public final Context c;
    public final /* synthetic */ yg4 d;

    public wg4(yg4 yg4Var, Context context) {
        this.d = yg4Var;
        this.c = context;
    }

    @Override // c79
    public final boolean D(f89 f89Var) {
        return false;
    }

    @Override // j79
    public final int b() {
        yg4 yg4Var = this.d;
        if (yg4Var.f.isEmpty()) {
            return 0;
        }
        return ((int) Math.ceil(r0.size() / yg4Var.s)) + (!yg4Var.O ? 1 : 0);
    }

    @Override // j79
    public final int d(int i) {
        yg4 yg4Var = this.d;
        return i < ((int) Math.ceil((double) (((float) yg4Var.f.size()) / ((float) yg4Var.s)))) ? 0 : 1;
    }

    @Override // j79
    public final void t(f89 f89Var, int i) {
        yg4 yg4Var = this.d;
        qg4 qg4Var = yg4Var.T;
        ArrayList arrayList = yg4Var.f;
        int i2 = f89Var.f;
        View view = f89Var.a;
        if (i2 != 0) {
            if (i2 != 3) {
                if (i2 == 1) {
                    int ceil = (int) Math.ceil(arrayList.size() / yg4Var.s);
                    byte b = yg4Var.s;
                    ((tk4) view).w = b - ((ceil * b) - arrayList.size());
                    return;
                }
                return;
            }
            of3 of3Var = (of3) view;
            of3Var.t2 = i != b() - 1;
            r47 r47Var = (r47) arrayList.get(i);
            boolean z = of3Var.getMessage() != null && of3Var.getMessage().e1() == r47Var.e1();
            of3Var.P = yg4Var.q0;
            of3Var.e0(r47.B0(r47Var.k), r47Var, r47Var.k.date, false, false);
            if (!yg4Var.p0.u()) {
                of3Var.d0(false, z);
                return;
            }
            int e1 = r47Var.e1();
            qg4Var.a = r47.B0(r47Var.k);
            qg4Var.b = e1;
            of3Var.d0(yg4Var.p0.d(qg4Var), z);
            return;
        }
        kja kjaVar = (kja) view;
        kjaVar.setItemsCount(yg4Var.s);
        kjaVar.setIsFirst(i == 0);
        int i3 = 0;
        while (true) {
            byte b2 = yg4Var.s;
            if (i3 >= b2) {
                kjaVar.requestLayout();
                return;
            }
            int i4 = (b2 * i) + i3;
            if (i4 < arrayList.size()) {
                r47 r47Var2 = (r47) arrayList.get(i4);
                kjaVar.c(i3, arrayList.indexOf(r47Var2), r47Var2);
                if (yg4Var.p0.u()) {
                    int e12 = r47Var2.e1();
                    qg4Var.a = r47.B0(r47Var2.k);
                    qg4Var.b = e12;
                    kjaVar.b(i3, yg4Var.p0.d(qg4Var), true);
                } else {
                    kjaVar.b(i3, false, true);
                }
            } else {
                kjaVar.c(i3, i4, null);
            }
            i3++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10, types: [lg4, tk4] */
    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        FrameLayout frameLayout;
        Context context = this.c;
        if (i == 0) {
            kja kjaVar = new kja(context);
            Paint paint = new Paint();
            kjaVar.n = paint;
            kjaVar.s = yac.t0;
            kjaVar.r = true;
            paint.setColor(aob.w0(null, aob.Ci, false));
            kjaVar.b = new r47[6];
            kjaVar.a = new fja[6];
            kjaVar.c = new int[6];
            for (int i2 = 0; i2 < 6; i2++) {
                kjaVar.a[i2] = new fja(kjaVar, context);
                kjaVar.addView(kjaVar.a[i2]);
                kjaVar.a[i2].setVisibility(4);
                kjaVar.a[i2].setTag(Integer.valueOf(i2));
                kjaVar.a[i2].setOnClickListener(new jn8(kjaVar, (byte) 29));
                kjaVar.a[i2].setOnLongClickListener(new zs(kjaVar, (byte) 17));
            }
            kjaVar.setDelegate(new wz4(this));
            frameLayout = kjaVar;
        } else if (i != 2) {
            ?? lg4Var = new lg4((byte) 1, context, this);
            lg4Var.setIsSingleCell(true);
            lg4Var.setViewType(2);
            frameLayout = lg4Var;
        } else {
            FrameLayout p55Var = new p55(context, null);
            p55Var.setBackgroundColor(aob.w0(null, aob.e7, false) & (-218103809));
            frameLayout = p55Var;
        }
        return qu6.h(frameLayout, frameLayout, -1, -2);
    }
}
