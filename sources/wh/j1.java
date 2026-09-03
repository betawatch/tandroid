package wh;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z1 b;
    public final /* synthetic */ a c;

    public /* synthetic */ j1(z1 z1Var, a aVar, int i10) {
        this.a = i10;
        this.b = z1Var;
        this.c = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        a aVar = this.c;
        z1 z1Var = this.b;
        switch (i10) {
            case 0:
                r3 r3Var = z1Var.M;
                ArrayList arrayList = r3.p4;
                TL_iv.pageBlockPullquote pageblockpullquote = new TL_iv.pageBlockPullquote();
                pageblockpullquote.caption = new TL_iv.textEmpty();
                r3Var.T4(this.c, pageblockpullquote, 0, 0, false, false);
                break;
            case 1:
                z1Var.M.U4(aVar, new TL_iv.pageBlockPreformatted());
                break;
            case 2:
                z1Var.M.U4(aVar, new TL_iv.pageBlockFooter());
                break;
            case 3:
                z1Var.M.U4(aVar, new TL_iv.pageBlockParagraph());
                break;
            case 4:
                r3 r3Var2 = z1Var.M;
                ArrayList arrayList2 = r3.p4;
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                r3Var2.T4(this.c, pageblockblockquote, 0, 0, false, false);
                break;
            case 5:
                z1Var.M.V4(aVar, 0);
                break;
            case 6:
                z1Var.M.V4(aVar, 1);
                break;
            case 7:
                z1Var.M.V4(aVar, 2);
                break;
            case 8:
                z1Var.M.V4(aVar, 3);
                break;
            default:
                View y12 = z1Var.M.y1(aVar);
                if (!(y12 instanceof i4)) {
                    z1Var.M.V2.N(false);
                    break;
                } else {
                    ((i4) y12).h(aVar, z1Var.M.getMapDelegate());
                    break;
                }
        }
    }
}
