package qh;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x1 b;
    public final /* synthetic */ a c;

    public /* synthetic */ i1(x1 x1Var, a aVar, int i9) {
        this.a = i9;
        this.b = x1Var;
        this.c = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i9 = this.a;
        a aVar = this.c;
        x1 x1Var = this.b;
        switch (i9) {
            case 0:
                o3 o3Var = x1Var.L;
                ArrayList arrayList = o3.o4;
                TL_iv.pageBlockPullquote pageblockpullquote = new TL_iv.pageBlockPullquote();
                pageblockpullquote.caption = new TL_iv.textEmpty();
                o3Var.U4(this.c, pageblockpullquote, 0, 0, false, false);
                break;
            case 1:
                x1Var.L.V4(aVar, new TL_iv.pageBlockPreformatted());
                break;
            case 2:
                x1Var.L.V4(aVar, new TL_iv.pageBlockFooter());
                break;
            case 3:
                x1Var.L.V4(aVar, new TL_iv.pageBlockParagraph());
                break;
            case 4:
                o3 o3Var2 = x1Var.L;
                ArrayList arrayList2 = o3.o4;
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                o3Var2.U4(this.c, pageblockblockquote, 0, 0, false, false);
                break;
            case 5:
                x1Var.L.W4(aVar, 0);
                break;
            case 6:
                x1Var.L.W4(aVar, 1);
                break;
            case 7:
                x1Var.L.W4(aVar, 2);
                break;
            case 8:
                x1Var.L.W4(aVar, 3);
                break;
            default:
                View z12 = x1Var.L.z1(aVar);
                if (!(z12 instanceof f4)) {
                    x1Var.L.U2.N(false);
                    break;
                } else {
                    ((f4) z12).h(aVar, x1Var.L.getMapDelegate());
                    break;
                }
        }
    }
}
