package qh;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p b;
    public final /* synthetic */ a c;

    public /* synthetic */ f(p pVar, a aVar, int i9) {
        this.a = i9;
        this.b = pVar;
        this.c = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i9 = this.a;
        a aVar = this.c;
        p pVar = this.b;
        switch (i9) {
            case 0:
                o3 o3Var = pVar.r;
                View z12 = o3Var.z1(aVar);
                if (!(z12 instanceof f4)) {
                    o3Var.U2.N(false);
                    break;
                } else {
                    ((f4) z12).h(aVar, o3Var.getMapDelegate());
                    break;
                }
            case 1:
                pVar.r.W4(aVar, 0);
                break;
            case 2:
                pVar.r.W4(aVar, 1);
                break;
            case 3:
                pVar.r.W4(aVar, 2);
                break;
            case 4:
                pVar.r.W4(aVar, 3);
                break;
            case 5:
                pVar.r.V4(aVar, new TL_iv.pageBlockParagraph());
                break;
            case 6:
                o3 o3Var2 = pVar.r;
                ArrayList arrayList = o3.o4;
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                o3Var2.U4(this.c, pageblockblockquote, 0, 0, false, false);
                break;
            case 7:
                o3 o3Var3 = pVar.r;
                ArrayList arrayList2 = o3.o4;
                TL_iv.pageBlockPullquote pageblockpullquote = new TL_iv.pageBlockPullquote();
                pageblockpullquote.caption = new TL_iv.textEmpty();
                o3Var3.U4(this.c, pageblockpullquote, 0, 0, false, false);
                break;
            case 8:
                pVar.r.V4(aVar, new TL_iv.pageBlockPreformatted());
                break;
            default:
                pVar.r.V4(aVar, new TL_iv.pageBlockFooter());
                break;
        }
    }
}
