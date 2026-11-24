// default package

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final /* synthetic */ class sc9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hd9 b;
    public final /* synthetic */ lk0 c;

    public /* synthetic */ sc9(hd9 hd9Var, lk0 lk0Var, byte b) {
        this.a = b;
        this.b = hd9Var;
        this.c = lk0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        lk0 lk0Var = this.c;
        hd9 hd9Var = this.b;
        switch (b) {
            case 0:
                ye9 ye9Var = hd9Var.Q;
                ArrayList arrayList = ye9.A4;
                TL_iv.pageBlockPullquote pageblockpullquote = new TL_iv.pageBlockPullquote();
                pageblockpullquote.caption = new TL_iv.textEmpty();
                ye9Var.X4(this.c, pageblockpullquote, 0, 0, false, false);
                break;
            case 1:
                hd9Var.Q.Y4(lk0Var, new TL_iv.pageBlockPreformatted());
                break;
            case 2:
                hd9Var.Q.Y4(lk0Var, new TL_iv.pageBlockFooter());
                break;
            case 3:
                hd9Var.Q.Y4(lk0Var, new TL_iv.pageBlockParagraph());
                break;
            case 4:
                ye9 ye9Var2 = hd9Var.Q;
                ArrayList arrayList2 = ye9.A4;
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                ye9Var2.X4(this.c, pageblockblockquote, 0, 0, false, false);
                break;
            case 5:
                hd9Var.Q.Z4(lk0Var, 0);
                break;
            case 6:
                hd9Var.Q.Z4(lk0Var, 1);
                break;
            case 7:
                hd9Var.Q.Z4(lk0Var, 2);
                break;
            case 8:
                hd9Var.Q.Z4(lk0Var, 3);
                break;
            default:
                View C1 = hd9Var.Q.C1(lk0Var);
                boolean z = C1 instanceof pf9;
                ye9 ye9Var3 = hd9Var.Q;
                if (!z) {
                    ye9Var3.g3.O(false);
                    break;
                } else {
                    ((pf9) C1).g(lk0Var, ye9Var3.getMapDelegate());
                    break;
                }
        }
    }
}
