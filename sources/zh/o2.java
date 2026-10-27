package zh;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.bm0;
import org.telegram.ui.Components.u61;
import org.telegram.ui.bp0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class o2 implements Utilities.Callback5, bm0 {
    public final /* synthetic */ org.telegram.ui.ActionBar.k3 a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o2(org.telegram.ui.ActionBar.k3 k3Var, Object obj) {
        this.a = k3Var;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.bm0
    public /* synthetic */ boolean c1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.bm0
    public void e(float f7, float f10, int i10, View view) {
        g4.Q((g4) this.a, (f4) this.b, i10);
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        q2 q2Var = (q2) this.a;
        fi.d dVar = (fi.d) this.b;
        View view = (View) obj2;
        q2Var.getClass();
        long j10 = ((TL_stars.SavedStarGift) ((u61) obj).G).gift.id;
        if (q2Var.b == j10) {
            q2Var.b = 0L;
        } else {
            q2Var.b = j10;
        }
        dVar.setEnabled(q2Var.b != 0);
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt instanceof bp0) {
                    bp0 bp0Var = (bp0) childAt;
                    bp0Var.b(q2Var.b == bp0Var.getGiftId(), true);
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.bm0
    public /* synthetic */ void l0(View view, float f7, float f10) {
    }
}
