// default package

import android.view.View;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class ro1 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tl b;

    public /* synthetic */ ro1(tl tlVar, byte b) {
        this.a = b;
        this.b = tlVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        byte b = this.a;
        tl tlVar = this.b;
        switch (b) {
            case 0:
                tlVar.a();
                break;
            case 1:
                tlVar.a();
                break;
            default:
                tlVar.a();
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        byte b = this.a;
        tl tlVar = this.b;
        switch (b) {
            case 0:
                tlVar.b();
                break;
            case 1:
                tlVar.b();
                break;
            default:
                tlVar.b();
                break;
        }
    }
}
