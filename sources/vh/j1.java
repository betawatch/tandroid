package vh;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y1 b;
    public final /* synthetic */ a c;

    public /* synthetic */ j1(y1 y1Var, a aVar, int i10) {
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
                s3 s3Var = y1Var.M;
                ArrayList arrayList = s3.p4;
                TL_iv.pageBlockPullquote pageblockpullquote = new TL_iv.pageBlockPullquote();
                pageblockpullquote.caption = new TL_iv.textEmpty();
                s3Var.T4(this.c, pageblockpullquote, 0, 0, false, false);
                break;
            case 1:
                y1Var.M.U4(aVar, new TL_iv.pageBlockPreformatted());
                break;
            case 2:
                y1Var.M.U4(aVar, new TL_iv.pageBlockFooter());
                break;
            case 3:
                y1Var.M.U4(aVar, new TL_iv.pageBlockParagraph());
                break;
            case 4:
                s3 s3Var2 = y1Var.M;
                ArrayList arrayList2 = s3.p4;
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                s3Var2.T4(this.c, pageblockblockquote, 0, 0, false, false);
                break;
            case 5:
                y1Var.M.V4(aVar, 0);
                break;
            case 6:
                y1Var.M.V4(aVar, 1);
                break;
            case 7:
                y1Var.M.V4(aVar, 2);
                break;
            case 8:
                y1Var.M.V4(aVar, 3);
                break;
            default:
                View y12 = y1Var.M.y1(aVar);
                if (!(y12 instanceof j4)) {
                    y1Var.M.V2.N(false);
                    break;
                } else {
                    ((j4) y12).h(aVar, y1Var.M.getMapDelegate());
                    break;
                }
        }
    }
}
