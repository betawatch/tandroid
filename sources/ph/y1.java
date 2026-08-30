package ph;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.hm;
import org.telegram.ui.ek;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public class y1 extends org.telegram.ui.ActionBar.g3 implements NotificationCenter.NotificationCenterDelegate {
    public static int D = 1;
    public uf.g B;
    public Utilities.CallbackReturn C;
    public String b;
    public int c;
    public final x0 d;
    public final y0 e;
    public final ek f;
    public final x1 h;
    public float n;
    public final boolean r;
    public final boolean s;
    public boolean v;
    public d4 w;
    public float x;
    public Utilities.Callback3Return y;

    public y1(Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z4, boolean z10) {
        super(context, f6Var, true, false);
        this.b = null;
        this.c = -1;
        this.d = new x0();
        this.e = new y0();
        this.n = -1.0f;
        this.r = z4;
        this.s = z10;
        this.useSmoothKeyboard = true;
        fixNavigationBar(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.h5, f6Var));
        this.occupyNavigationBar = true;
        setUseLightStatusBar(false);
        this.containerView = new a1(this, context);
        ek ekVar = new ek(this, context, 6);
        this.f = ekVar;
        ekVar.b = z4 ? 0 : D;
        ekVar.setAdapter(new z0(this, z4, context));
        this.containerView.addView(ekVar, k7.b6.e(-1, -1, 87));
        new i3(this.containerView, false, new w0(this, 0));
        if (!z4) {
            x1 x1Var = new x1(context);
            this.h = x1Var;
            x1Var.D = new w0(this, 1);
            x1Var.C = ekVar.b;
            x1Var.invalidate();
            this.containerView.addView(x1Var, k7.b6.e(-1, -2, 87));
        }
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.stickersDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.groupStickersDidLoad);
        FileLog.disableGson(true);
        if (!z4) {
            MediaDataController.getInstance(this.currentAccount).checkStickers(5);
            MediaDataController.getInstance(this.currentAccount).checkFeaturedEmoji();
            MediaDataController.getInstance(this.currentAccount).loadRecents(0, true, true, false);
        }
        MediaDataController.getInstance(this.currentAccount).checkStickers(0);
        MediaDataController.getInstance(this.currentAccount).loadRecents(0, false, true, false);
        MediaDataController.getInstance(this.currentAccount).loadRecents(2, false, true, false);
        MediaDataController.getInstance(this.currentAccount).loadRecents(7, false, true, false);
    }

    public static /* synthetic */ void m(y1 y1Var) {
        boolean z4 = y1Var.v;
        boolean z10 = y1Var.keyboardVisible;
        if (z4 != z10) {
            y1Var.v = z10;
            y1Var.container.clearAnimation();
            float f10 = 0.0f;
            if (y1Var.keyboardVisible) {
                int i10 = AndroidUtilities.displaySize.y;
                int i11 = y1Var.keyboardHeight;
                f10 = Math.min(0.0f, Math.max(((i10 - i11) * 0.3f) - y1Var.x, (-i11) / 3.0f));
            }
            y1Var.container.animate().translationY(f10).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.r1.w).start();
        }
    }

    @Override // org.telegram.ui.ActionBar.g3
    public final boolean canDismissWithSwipe() {
        return this.f.getTranslationY() >= ((float) ((int) this.n));
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.stickersDidLoad || i10 == NotificationCenter.groupStickersDidLoad) {
            for (View view : this.f.getViewPages()) {
                if (view instanceof o1) {
                    o1 o1Var = (o1) view;
                    if (i10 == NotificationCenter.groupStickersDidLoad || ((o1Var.a == 0 && ((Integer) objArr[0]).intValue() == 5) || (o1Var.a == 1 && ((Integer) objArr[0]).intValue() == 0))) {
                        n1 n1Var = o1Var.c;
                        if (n1Var.E == null) {
                            n1Var.D(null);
                        }
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.g3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.l2
    public final void dismiss() {
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.stickersDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.groupStickersDidLoad);
        o0();
        super.dismiss();
        FileLog.disableGson(false);
    }

    @Override // org.telegram.ui.ActionBar.g3
    public final int getContainerViewHeight() {
        return this.containerView.getMeasuredHeight() <= 0 ? AndroidUtilities.displaySize.y : (int) (this.containerView.getMeasuredHeight() - this.f.getY());
    }

    public boolean l0(Integer num) {
        return true;
    }

    public boolean m0(Integer num) {
        return true;
    }

    public boolean n0(hm hmVar) {
        return true;
    }

    public final void o0() {
        s1 s1Var;
        this.keyboardVisible = false;
        this.container.animate().translationY(0.0f).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.r1.w).start();
        for (View view : this.f.getViewPages()) {
            if (view instanceof o1) {
                s1 s1Var2 = ((o1) view).f;
                if (s1Var2 != null) {
                    AndroidUtilities.hideKeyboard(s1Var2.d);
                }
            } else if ((view instanceof i1) && (s1Var = ((i1) view).d) != null) {
                AndroidUtilities.hideKeyboard(s1Var.d);
            }
        }
    }

    public final void p0(int i10) {
        if (l0(Integer.valueOf(i10))) {
            if ((i10 != 1 || n0(new hm(this, i10, 28))) && ((Boolean) this.C.run(Integer.valueOf(i10))).booleanValue()) {
                dismiss();
            }
        }
    }

    public final void q0(Utilities.CallbackReturn callbackReturn) {
        this.C = callbackReturn;
        for (View view : this.f.getViewPages()) {
            if (view instanceof o1) {
                n1 n1Var = ((o1) view).c;
                if (n1Var.E == null) {
                    n1Var.D(null);
                }
            }
        }
    }
}
