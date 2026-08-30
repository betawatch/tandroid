package vh;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y1 b;
    public final /* synthetic */ a c;

    public /* synthetic */ i1(y1 y1Var, a aVar, int i10) {
        this.a = i10;
        this.b = y1Var;
        this.c = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        a aVar = this.c;
        y1 y1Var = this.b;
        switch (i10) {
            case 0:
                r3 r3Var = y1Var.M;
                ArrayList arrayList = r3.p4;
                TL_iv.pageBlockPullquote pageblockpullquote = new TL_iv.pageBlockPullquote();
                pageblockpullquote.caption = new TL_iv.textEmpty();
                r3Var.U4(this.c, pageblockpullquote, 0, 0, false, false);
                break;
            case 1:
                y1Var.M.V4(aVar, new TL_iv.pageBlockPreformatted());
                break;
            case 2:
                y1Var.M.V4(aVar, new TL_iv.pageBlockFooter());
                break;
            case 3:
                y1Var.M.V4(aVar, new TL_iv.pageBlockParagraph());
                break;
            case 4:
                r3 r3Var2 = y1Var.M;
                ArrayList arrayList2 = r3.p4;
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                r3Var2.U4(this.c, pageblockblockquote, 0, 0, false, false);
                break;
            case 5:
                y1Var.M.W4(aVar, 0);
                break;
            case 6:
                y1Var.M.W4(aVar, 1);
                break;
            case 7:
                y1Var.M.W4(aVar, 2);
                break;
            case 8:
                y1Var.M.W4(aVar, 3);
                break;
            default:
                View z12 = y1Var.M.z1(aVar);
                if (!(z12 instanceof i4)) {
                    y1Var.M.V2.N(false);
                    break;
                } else {
                    ((i4) z12).h(aVar, y1Var.M.getMapDelegate());
                    break;
                }
        }
    }
}
