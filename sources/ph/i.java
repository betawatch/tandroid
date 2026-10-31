package ph;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.ActionBar.p6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class i extends vh.d {
    public final /* synthetic */ int k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i10, Context context, p6 p6Var, boolean z10) {
        super(context, p6Var, z10);
        this.k0 = i10;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.k0) {
            case 0:
                if (this.c0) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                return false;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // vh.d
    public boolean j() {
        switch (this.k0) {
            case 1:
                return false;
            case 2:
            default:
                return super.j();
            case 3:
                return false;
        }
    }
}
