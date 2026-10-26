package zh;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.am0;
import org.telegram.ui.Components.t61;
import org.telegram.ui.zo0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class o2 implements Utilities.Callback5, am0 {
    public final /* synthetic */ org.telegram.ui.ActionBar.k3 a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o2(org.telegram.ui.ActionBar.k3 k3Var, Object obj) {
        this.a = k3Var;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.am0
    public /* synthetic */ boolean c1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.am0
    public void e(float f7, float f10, int i10, View view) {
        g4.Q((g4) this.a, (f4) this.b, i10);
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        q2 q2Var = (q2) this.a;
        fi.d dVar = (fi.d) this.b;
        View view = (View) obj2;
        q2Var.getClass();
        long j10 = ((TL_stars.SavedStarGift) ((t61) obj).G).gift.id;
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
                if (childAt instanceof zo0) {
                    zo0 zo0Var = (zo0) childAt;
                    zo0Var.b(q2Var.b == zo0Var.getGiftId(), true);
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.am0
    public /* synthetic */ void l0(View view, float f7, float f10) {
    }
}
