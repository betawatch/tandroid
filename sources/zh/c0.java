package zh;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.FrameLayout;
import com.google.android.gms.internal.vision.t2;
import com.google.android.gms.internal.vision.x1;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d0 b;

    public /* synthetic */ c0(d0 d0Var, int i10) {
        this.a = i10;
        this.b = d0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                d0 d0Var = this.b;
                d0Var.e();
                m0 m0Var = (m0) d0Var.a.b;
                FrameLayout frameLayout = m0Var.f;
                if (frameLayout != null) {
                    frameLayout.removeView(d0Var);
                }
                if (m0Var.E == d0Var) {
                    m0Var.E = null;
                }
                b1 b1Var = m0Var.d;
                if (b1Var != null) {
                    b1Var.setScanHidden(false);
                    break;
                }
                break;
            case 1:
                d0 d0Var2 = this.b;
                r8.n nVar = d0Var2.e0;
                if (nVar != null) {
                    nVar.X0();
                    d0Var2.e0 = null;
                }
                Bitmap bitmap = d0Var2.g0;
                if (bitmap != null) {
                    bitmap.recycle();
                    d0Var2.g0 = null;
                }
                d0Var2.b0.quitSafely();
                break;
            default:
                d0 d0Var3 = this.b;
                try {
                    Context context = ApplicationLoader.applicationContext;
                    x1 x1Var = new x1();
                    x1Var.a = 256;
                    d0Var3.e0 = new r8.n(new t2(context, x1Var));
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
                d0Var3.f0 = new a6.i(23);
                break;
        }
    }
}
