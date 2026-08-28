package ve;

import android.animation.ValueAnimator;
import android.content.DialogInterface;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.Components.gr;
import org.telegram.ui.xs0;
import xf.q1;
import xf.s0;
import yf.f;
import yf.g;
import yf.j;
import yf.m2;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a(Object obj, int i9, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i9 = this.a;
        final int i10 = this.b;
        Object obj = this.c;
        switch (i9) {
            case 0:
                c2[] c2VarArr = (c2[]) obj;
                c2 c2Var = c2VarArr[0];
                if (c2Var != null) {
                    try {
                        c2Var.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: ve.b
                            @Override // android.content.DialogInterface.OnCancelListener
                            public final void onCancel(DialogInterface dialogInterface) {
                                ConnectionsManager.getInstance(UserConfig.selectedAccount).cancelRequest(i10, true);
                            }
                        });
                        c2VarArr[0].show();
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
            case 1:
                ((vg.a) obj).v0(i10, 0, null);
                break;
            case 2:
                j jVar = (j) obj;
                jVar.H = i10;
                jVar.G = true;
                int i11 = 2;
                try {
                    jVar.performHapticFeedback(3, 2);
                } catch (Exception unused2) {
                }
                ValueAnimator valueAnimator = jVar.L;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator valueAnimator2 = jVar.M;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                jVar.L = duration;
                duration.setInterpolator(gr.f);
                jVar.L.addUpdateListener(new f(jVar, 5));
                jVar.L.addListener(new g(jVar, i11));
                jVar.L.start();
                break;
            case 3:
                xs0 xs0Var = (xs0) obj;
                q1 q1Var = xs0Var.G1;
                xs0Var.s0(q1Var, null);
                s0.e(i10).j(q1Var.c);
                break;
            default:
                m2 m2Var = (m2) obj;
                m2Var.getClass();
                NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.customStickerCreated, Boolean.FALSE);
                m2Var.h();
                break;
        }
    }
}
