// default package

import org.telegram.ui.StickersActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class x3b implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ StickersActivity b;

    public /* synthetic */ x3b(StickersActivity stickersActivity, byte b) {
        this.a = b;
        this.b = stickersActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        StickersActivity stickersActivity = this.b;
        switch (b) {
            case 0:
                stickersActivity.o0();
                break;
            default:
                stickersActivity.n--;
                break;
        }
    }
}
