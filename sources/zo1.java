// default package

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class zo1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zu1 b;

    public /* synthetic */ zo1(zu1 zu1Var, byte b) {
        this.a = b;
        this.b = zu1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        nr1 nr1Var;
        wb2 wb2Var;
        r47 primaryMessageObject;
        TLRPC.Message message;
        byte b = this.a;
        zu1 zu1Var = this.b;
        switch (b) {
            case 0:
                zu1Var.W4();
                break;
            case 1:
                if (!e.hasSheets(zu1Var) && (nr1Var = zu1Var.a0) != null) {
                    nr1Var.setFieldFocused(true);
                    zu1Var.a0.o1();
                    break;
                }
                break;
            case 2:
                zu1Var.Dd();
                zu1Var.O7();
                hl.d0(zu1Var.A0, new gl1(zu1Var, (byte) 4));
                zu1Var.G5();
                er1 er1Var = zu1Var.m3;
                if (er1Var != null) {
                    er1Var.setTranslationX(zu1Var.o7() / 2.0f);
                }
                dr1 dr1Var = zu1Var.n3;
                if (dr1Var != null) {
                    dr1Var.setTranslationX(zu1Var.o7() / 2.0f);
                }
                FrameLayout frameLayout = zu1Var.f1;
                if (frameLayout != null) {
                    frameLayout.setTranslationX(zu1Var.o7() / 2.0f);
                }
                zu1Var.e5();
                zu1Var.F5();
                break;
            case 3:
                wxb e0 = wxb.e0(-zu1Var.l6, 0L);
                e0.E = zu1Var;
                zu1Var.presentFragment(e0);
                break;
            case 4:
                zu1Var.Hc(true);
                break;
            case 5:
                int i = zu1.Ad;
                zu1Var.l5();
                break;
            case 6:
                int i2 = zu1.Ad;
                if (zu1Var.O1 == null) {
                    wb2 wb2Var2 = null;
                    for (int childCount = zu1Var.A0.getChildCount() - 1; childCount >= 0; childCount--) {
                        View childAt = zu1Var.A0.getChildAt(childCount);
                        if ((childAt instanceof wb2) && (primaryMessageObject = (wb2Var = (wb2) childAt).getPrimaryMessageObject()) != null && (message = primaryMessageObject.k) != null && message.via_business_bot_id != 0) {
                            wb2Var2 = wb2Var;
                        }
                    }
                    zu1Var.Vb(wb2Var2);
                    break;
                }
                break;
            case 7:
                int i3 = zu1.Ad;
                zu1Var.hb();
                break;
            default:
                if (zu1Var.getParentLayout() != null) {
                    tzb.M0(zu1Var);
                    break;
                }
                break;
        }
    }
}
