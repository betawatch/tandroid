package vh;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
                s3 s3Var = qVar.r;
                View y12 = s3Var.y1(aVar);
                if (!(y12 instanceof j4)) {
                    s3Var.V2.N(false);
                    break;
                } else {
                    ((j4) y12).h(aVar, s3Var.getMapDelegate());
                    break;
                }
            case 1:
                qVar.r.V4(aVar, 0);
                break;
            case 2:
                qVar.r.V4(aVar, 1);
                break;
            case 3:
                qVar.r.V4(aVar, 2);
                break;
            case 4:
                qVar.r.V4(aVar, 3);
                break;
            case 5:
                qVar.r.U4(aVar, new TL_iv.pageBlockParagraph());
                break;
            case 6:
                s3 s3Var2 = qVar.r;
                ArrayList arrayList = s3.p4;
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                s3Var2.T4(this.c, pageblockblockquote, 0, 0, false, false);
                break;
            case 7:
                s3 s3Var3 = qVar.r;
                ArrayList arrayList2 = s3.p4;
                TL_iv.pageBlockPullquote pageblockpullquote = new TL_iv.pageBlockPullquote();
                pageblockpullquote.caption = new TL_iv.textEmpty();
                s3Var3.T4(this.c, pageblockpullquote, 0, 0, false, false);
                break;
            case 8:
                qVar.r.U4(aVar, new TL_iv.pageBlockPreformatted());
                break;
            default:
                qVar.r.U4(aVar, new TL_iv.pageBlockFooter());
                break;
        }
    }
}
