// default package

import android.view.MotionEvent;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class wy4 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ st b;

    public /* synthetic */ wy4(st stVar, byte b) {
        this.a = b;
        this.b = stVar;
    }

    public final Boolean a(MotionEvent motionEvent) {
        byte b = this.a;
        st stVar = this.b;
        switch (b) {
            case 0:
                return stVar.c(motionEvent);
            default:
                return stVar.d(motionEvent);
        }
    }
}
