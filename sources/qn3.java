// default package

import android.view.KeyEvent;
import android.view.View;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class qn3 implements View.OnKeyListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xv4 b;

    public /* synthetic */ qn3(xv4 xv4Var, byte b) {
        this.a = b;
        this.b = xv4Var;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        byte b = this.a;
        xv4 xv4Var = this.b;
        switch (b) {
            case 0:
                if (i == 4) {
                    if (keyEvent.getAction() == 1) {
                        LinearLayout linearLayout = xv4Var.e;
                        if (linearLayout == null || xv4Var.O) {
                            xv4Var.c(null);
                        } else {
                            xv4Var.e = null;
                            xv4Var.h(linearLayout, false);
                        }
                    }
                    break;
                }
                break;
            case 1:
                if (i == 4) {
                    if (keyEvent.getAction() == 1) {
                        xv4Var.c(null);
                    }
                    break;
                }
                break;
            case 2:
                if (i == 4) {
                    if (keyEvent.getAction() == 1) {
                        xv4Var.c(null);
                    }
                    break;
                }
                break;
            default:
                if (i == 4) {
                    if (keyEvent.getAction() == 1) {
                        xv4Var.c(null);
                    }
                    break;
                }
                break;
        }
        return true;
    }
}
