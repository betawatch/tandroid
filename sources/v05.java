// default package

import android.view.MotionEvent;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class v05 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ su b;

    public /* synthetic */ v05(su suVar, byte b) {
        this.a = b;
        this.b = suVar;
    }

    public final Boolean a(MotionEvent motionEvent) {
        byte b = this.a;
        su suVar = this.b;
        switch (b) {
            case 0:
                return suVar.c(motionEvent);
            default:
                return suVar.d(motionEvent);
        }
    }
}
