// default package

import java.util.WeakHashMap;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class q76 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ s76 b;

    public /* synthetic */ q76(s76 s76Var, byte b) {
        this.a = b;
        this.b = s76Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        s76 s76Var = this.b;
        switch (b) {
            case 0:
                vr3 vr3Var = s76Var.c;
                if (vr3Var != null) {
                    vr3Var.setListSelectionHidden(true);
                    vr3Var.requestLayout();
                    break;
                }
                break;
            default:
                vr3 vr3Var2 = s76Var.c;
                if (vr3Var2 != null) {
                    WeakHashMap weakHashMap = ihc.a;
                    if (vr3Var2.isAttachedToWindow() && s76Var.c.getCount() > s76Var.c.getChildCount() && s76Var.c.getChildCount() <= s76Var.y) {
                        s76Var.P.setInputMethodMode(2);
                        s76Var.g();
                        break;
                    }
                }
                break;
        }
    }
}
