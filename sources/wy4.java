// default package

import android.view.MotionEvent;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
