// default package

import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import org.telegram.messenger.video.OldVideoPlayerRewinder;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class ya2 extends OldVideoPlayerRewinder {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ya2(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // org.telegram.messenger.video.OldVideoPlayerRewinder
    public final void onRewindCanceled() {
        sj4 sj4Var;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                gb2 gb2Var = (gb2) obj;
                gb2Var.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                gb2Var.ac.d(false);
                break;
            default:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                Drawable[] drawableArr = PhotoViewer.d9;
                photoViewer.h1(obtain);
                photoViewer.A1.d(false);
                xa8 xa8Var = photoViewer.U8;
                if (xa8Var != null && (sj4Var = xa8Var.e) != null) {
                    sj4Var.F.d(false);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.messenger.video.OldVideoPlayerRewinder
    public final void onRewindStart(boolean z) {
        sj4 sj4Var;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                gb2 gb2Var = (gb2) obj;
                rac racVar = gb2Var.ac;
                racVar.n = new lj9(this, (byte) 20);
                racVar.c(false);
                gb2Var.ac.b(!z);
                gb2Var.ac.d(true);
                gb2Var.invalidate();
                break;
            default:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                photoViewer.A1.c(false);
                boolean z2 = !z;
                photoViewer.A1.b(z2);
                photoViewer.A1.d(true);
                photoViewer.f0.invalidate();
                xa8 xa8Var = photoViewer.U8;
                if (xa8Var != null && (sj4Var = xa8Var.e) != null) {
                    rac racVar2 = sj4Var.F;
                    racVar2.c(false);
                    racVar2.b(z2);
                    racVar2.d(true);
                    rj4 rj4Var = sj4Var.o;
                    if (rj4Var != null) {
                        rj4Var.invalidate();
                    }
                    lj4 lj4Var = sj4Var.m;
                    if (lj4Var != null) {
                        lj4Var.invalidate();
                        break;
                    }
                }
                break;
        }
    }

    @Override // org.telegram.messenger.video.OldVideoPlayerRewinder
    public final void updateRewindProgressUi(long j, float f, boolean z) {
        sj4 sj4Var;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                gb2 gb2Var = (gb2) obj;
                gb2Var.ac.e(Math.abs(j));
                if (z) {
                    gb2Var.Q5.b0 = f;
                    gb2Var.W3();
                    break;
                }
                break;
            default:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                photoViewer.A1.e(Math.abs(j));
                if (z) {
                    photoViewer.q3.h(false, f);
                    photoViewer.r3.invalidate();
                }
                xa8 xa8Var = photoViewer.U8;
                if (xa8Var != null && (sj4Var = xa8Var.e) != null) {
                    sj4Var.F.e(0L);
                    if (z) {
                        sj4Var.I = f;
                        rj4 rj4Var = sj4Var.o;
                        if (rj4Var != null) {
                            rj4Var.invalidate();
                        }
                        lj4 lj4Var = sj4Var.m;
                        if (lj4Var != null) {
                            lj4Var.invalidate();
                            break;
                        }
                    }
                }
                break;
        }
    }
}
