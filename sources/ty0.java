// default package

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class ty0 extends av9 {
    public final /* synthetic */ byte n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ty0(Context context, slb slbVar) {
        super(slbVar, context, false);
        this.n0 = (byte) 3;
    }

    @Override // av9, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.n0) {
            case 0:
                if (motionEvent.getAction() == 0) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                break;
            case 1:
                if (motionEvent.getAction() == 0) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                break;
            case 2:
                if (motionEvent.getAction() == 0) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                break;
            default:
                if (motionEvent.getAction() == 0) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                break;
        }
        return d(motionEvent);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ty0(Context context, boolean z, wjb wjbVar, byte b) {
        super(wjbVar, context, z);
        this.n0 = b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ty0(Context context) {
        super(context);
        this.n0 = (byte) 1;
    }
}
