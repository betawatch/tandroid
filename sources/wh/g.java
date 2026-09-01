package wh;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q b;
    public final /* synthetic */ a c;

    public /* synthetic */ g(q qVar, a aVar, int i10) {
        this.a = i10;
        this.b = qVar;
        this.c = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        a aVar = this.c;
        q qVar = this.b;
        switch (i10) {
            case 0:
                r3 r3Var = qVar.r;
                View z12 = r3Var.z1(aVar);
                if (!(z12 instanceof i4)) {
                    r3Var.V2.N(false);
                    break;
                } else {
                    ((i4) z12).h(aVar, r3Var.getMapDelegate());
                    break;
                }
            case 1:
                qVar.r.W4(aVar, 0);
                break;
            case 2:
                qVar.r.W4(aVar, 1);
                break;
            case 3:
                qVar.r.W4(aVar, 2);
                break;
            case 4:
                qVar.r.W4(aVar, 3);
                break;
            case 5:
                qVar.r.V4(aVar, new TL_iv.pageBlockParagraph());
                break;
            case 6:
                r3 r3Var2 = qVar.r;
                ArrayList arrayList = r3.p4;
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                r3Var2.U4(this.c, pageblockblockquote, 0, 0, false, false);
                break;
            case 7:
                r3 r3Var3 = qVar.r;
                ArrayList arrayList2 = r3.p4;
                TL_iv.pageBlockPullquote pageblockpullquote = new TL_iv.pageBlockPullquote();
                pageblockpullquote.caption = new TL_iv.textEmpty();
                r3Var3.U4(this.c, pageblockpullquote, 0, 0, false, false);
                break;
            case 8:
                qVar.r.V4(aVar, new TL_iv.pageBlockPreformatted());
                break;
            default:
                qVar.r.V4(aVar, new TL_iv.pageBlockFooter());
                break;
        }
    }
}
