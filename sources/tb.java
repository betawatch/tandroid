// default package

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class tb extends u41 {
    public final /* synthetic */ byte m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tb(Context context, boolean z, wjb wjbVar, byte b) {
        super(wjbVar, context, z);
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

    @Override // u41
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
