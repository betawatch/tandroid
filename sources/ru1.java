// default package

import org.telegram.ui.ActionBar.d;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ThemeActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class ru1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iv1 b;

    public /* synthetic */ ru1(iv1 iv1Var, byte b) {
        this.a = b;
        this.b = iv1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        iv1 iv1Var = this.b;
        switch (b) {
            case 0:
                yv1 yv1Var = iv1Var.a;
                yv1Var.v5 = null;
                yv1Var.w5 = null;
                break;
            case 1:
                yv1 yv1Var2 = iv1Var.a;
                new kj8((d) yv1Var2, 8, true).show();
                yv1Var2.getMessagesController().J3();
                break;
            case 2:
                yv1 yv1Var3 = iv1Var.a;
                new kj8((d) yv1Var3, 8, true).show();
                yv1Var3.getMessagesController().J3();
                break;
            case 3:
                yv1 yv1Var4 = iv1Var.a;
                new kj8((d) yv1Var4, 8, true).show();
                yv1Var4.getMessagesController().J3();
                break;
            case 4:
                iv1Var.a.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                break;
            case 5:
                yv1 yv1Var5 = iv1Var.a;
                yv1Var5.v5 = null;
                yv1Var5.w5 = null;
                break;
            case 6:
                iv1Var.a.a0.j1();
                break;
            case 7:
                iv1Var.a.a0.j1();
                break;
            case 8:
                yv1 yv1Var6 = iv1Var.a;
                ThemeActivity themeActivity = new ThemeActivity(0);
                themeActivity.V0 = true;
                yv1Var6.presentFragment(themeActivity);
                break;
            default:
                yv1 yv1Var7 = iv1Var.a;
                yv1Var7.showDialog(new kj8((d) yv1Var7, 39, false));
                break;
        }
    }
}
