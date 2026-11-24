// default package

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class te9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jf9 b;
    public final /* synthetic */ ll0 c;

    public /* synthetic */ te9(jf9 jf9Var, ll0 ll0Var, byte b) {
        this.a = b;
        this.b = jf9Var;
        this.c = ll0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ll0 ll0Var = this.c;
        jf9 jf9Var = this.b;
        switch (b) {
            case 0:
                ch9 ch9Var = jf9Var.Q;
                ArrayList arrayList = ch9.A4;
                TL_iv.pageBlockPullquote pageblockpullquote = new TL_iv.pageBlockPullquote();
                pageblockpullquote.caption = new TL_iv.textEmpty();
                ch9Var.X4(this.c, pageblockpullquote, 0, 0, false, false);
                break;
            case 1:
                jf9Var.Q.Y4(ll0Var, new TL_iv.pageBlockPreformatted());
                break;
            case 2:
                jf9Var.Q.Y4(ll0Var, new TL_iv.pageBlockFooter());
                break;
            case 3:
                jf9Var.Q.Y4(ll0Var, new TL_iv.pageBlockParagraph());
                break;
            case 4:
                ch9 ch9Var2 = jf9Var.Q;
                ArrayList arrayList2 = ch9.A4;
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                ch9Var2.X4(this.c, pageblockblockquote, 0, 0, false, false);
                break;
            case 5:
                jf9Var.Q.Z4(ll0Var, 0);
                break;
            case 6:
                jf9Var.Q.Z4(ll0Var, 1);
                break;
            case 7:
                jf9Var.Q.Z4(ll0Var, 2);
                break;
            case 8:
                jf9Var.Q.Z4(ll0Var, 3);
                break;
            default:
                View C1 = jf9Var.Q.C1(ll0Var);
                boolean z = C1 instanceof th9;
                ch9 ch9Var3 = jf9Var.Q;
                if (!z) {
                    ch9Var3.g3.O(false);
                    break;
                } else {
                    ((th9) C1).g(ll0Var, ch9Var3.getMapDelegate());
                    break;
                }
        }
    }
}
