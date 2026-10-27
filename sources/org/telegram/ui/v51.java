package org.telegram.ui;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v51 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ w51 b;

    public /* synthetic */ v51(w51 w51Var, int i10) {
        this.a = i10;
        this.b = w51Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                super/*android.widget.PopupWindow*/.dismiss();
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}
