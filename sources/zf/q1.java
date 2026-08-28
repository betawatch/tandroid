package zf;

import android.widget.FrameLayout;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;

    public /* synthetic */ q1(int i9, FrameLayout frameLayout) {
        this.a = i9;
        this.b = frameLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((r1) this.b).invalidate();
                break;
            default:
                ((z1) this.b).a();
                break;
        }
    }
}
