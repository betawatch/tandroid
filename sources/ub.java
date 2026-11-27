// default package

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class ub extends c51 {
    public final /* synthetic */ byte m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ub(Context context, boolean z, vnb vnbVar, byte b) {
        super(vnbVar, context, z);
        this.m0 = b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.m0) {
            case 1:
                if (this.e0) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                return false;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // c51
    public final boolean j() {
        switch (this.m0) {
            case 0:
            case 3:
                return false;
            default:
                return super.j();
        }
    }
}
