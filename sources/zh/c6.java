package zh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.pk0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class c6 extends z4.a {
    public final ArrayList c = new ArrayList();
    public final /* synthetic */ Context d;
    public final /* synthetic */ u7 e;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 f;
    public final /* synthetic */ k7 g;

    public c6(k7 k7Var, Context context, u7 u7Var, org.telegram.ui.ActionBar.f6 f6Var) {
        this.g = k7Var;
        this.d = context;
        this.e = u7Var;
        this.f = f6Var;
    }

    @Override // z4.a
    public final void a(z4.g gVar, Object obj) {
        FrameLayout frameLayout = (FrameLayout) obj;
        gVar.removeView(frameLayout);
        a3 a3Var = (a3) frameLayout.getChildAt(0);
        AndroidUtilities.removeFromParent(a3Var);
        this.c.add(a3Var);
    }

    @Override // z4.a
    public final int b() {
        k7 k7Var = this.g;
        ArrayList arrayList = k7Var.x0;
        return arrayList != null ? arrayList.size() : k7Var.A0.size();
    }

    @Override // z4.a
    public final Object e(z4.g gVar, int i10) {
        a3 b6Var;
        Context context = this.d;
        k7 k7Var = this.g;
        e6 e6Var = new e6(k7Var, context);
        ArrayList arrayList = this.c;
        boolean isEmpty = arrayList.isEmpty();
        u7 u7Var = this.e;
        if (isEmpty) {
            b6Var = new b6(this, this.d, u7Var, k7Var.H0, this.f);
        } else {
            b6Var = (a3) arrayList.remove(0);
            b6Var.o1.a.getImageReceiver().setVisible(true, true);
            if (b6Var.e2 != null) {
                b6Var.b2.P0();
                b6Var.b2.setAlpha(1.0f - b6Var.d4);
            }
            pk0 pk0Var = b6Var.f2;
            if (pk0Var != null) {
                pk0Var.n();
            }
            pk0 pk0Var2 = b6Var.r3;
            if (pk0Var2 != null) {
                pk0Var2.n();
            }
            f60 f60Var = b6Var.J2;
            if (f60Var != null) {
                AndroidUtilities.removeFromParent(f60Var);
                b6Var.J2.h(true);
                b6Var.J2 = null;
            }
            b6Var.setActive(false);
            b6Var.setIsVisible(false);
            b6Var.L2 = false;
            b6Var.O2.d(0.0f, false);
            b6Var.l1 = null;
            b6Var.i3 = false;
            b6Var.p0();
        }
        e6Var.a = b6Var;
        b6Var.setAccount(k7Var.y0);
        b6Var.setDelegate(k7Var.B0);
        b6Var.setLongpressed(u7Var.a1);
        e6Var.setTag(Integer.valueOf(i10));
        ArrayList arrayList2 = k7Var.x0;
        if (arrayList2 != null) {
            if (u7Var.R0) {
                i10 = (arrayList2.size() - 1) - i10;
            }
            ArrayList arrayList3 = (ArrayList) arrayList2.get(i10);
            e6Var.c = arrayList3;
            a5 a5Var = u7Var.O0;
            if ((a5Var instanceof u4) || (a5Var instanceof c5)) {
                MessageObject f7 = a5Var.f(((Integer) arrayList3.get(0)).intValue());
                e6Var.b = f7 == null ? k7Var.w0 : f7.getDialogId();
            } else {
                e6Var.b = k7Var.w0;
            }
        } else {
            e6Var.c = null;
            e6Var.b = ((Long) k7Var.A0.get(i10)).longValue();
        }
        e6Var.addView(b6Var);
        b6Var.requestLayout();
        gVar.addView(e6Var);
        return e6Var;
    }

    @Override // z4.a
    public final boolean f(View view, Object obj) {
        return view == obj;
    }
}
