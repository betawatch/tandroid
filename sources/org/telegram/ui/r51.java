package org.telegram.ui;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r51 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s51 b;

    public /* synthetic */ r51(s51 s51Var, int i10) {
        this.a = i10;
        this.b = s51Var;
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
