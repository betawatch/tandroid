// default package

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.WeakHashMap;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ExternalActionActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class vp implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vp(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        byte b = this.a;
        byte b2 = 0;
        int i = 0;
        Object obj = this.b;
        switch (b) {
            case 0:
                gq gqVar = (gq) obj;
                if (!gqVar.getInternalPopup().a()) {
                    gqVar.f.l(xp.b(gqVar), xp.a(gqVar));
                }
                ViewTreeObserver viewTreeObserver = gqVar.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    wp.a(viewTreeObserver, this);
                    break;
                }
                break;
            case 1:
                dq dqVar = (dq) obj;
                gq gqVar2 = dqVar.X;
                WeakHashMap weakHashMap = ihc.a;
                if (!gqVar2.isAttachedToWindow() || !gqVar2.getGlobalVisibleRect(dqVar.V)) {
                    dqVar.dismiss();
                    break;
                } else {
                    dqVar.q();
                    dqVar.g();
                    break;
                }
                break;
            case 2:
                fd1 fd1Var = (fd1) obj;
                ArrayList arrayList = fd1Var.n;
                if (fd1Var.a() && arrayList.size() > 0 && !((ed1) arrayList.get(0)).a.O) {
                    View view = fd1Var.F;
                    if (view != null && view.isShown()) {
                        int size = arrayList.size();
                        while (b2 < size) {
                            ((ed1) arrayList.get(b2)).a.g();
                            b2++;
                        }
                        break;
                    } else {
                        fd1Var.dismiss();
                        break;
                    }
                }
                break;
            case 3:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj;
                externalActionActivity.f();
                ActionBarLayout actionBarLayout = externalActionActivity.c;
                if (actionBarLayout != null) {
                    actionBarLayout.getView().getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    break;
                }
                break;
            case 4:
                bv6 bv6Var = (bv6) obj;
                bv6Var.V.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                HashSet hashSet = bv6Var.Y;
                if (hashSet != null && hashSet.size() != 0) {
                    ru6 ru6Var = new ru6(bv6Var, b2);
                    int firstVisiblePosition = bv6Var.V.getFirstVisiblePosition();
                    boolean z = false;
                    while (i < bv6Var.V.getChildCount()) {
                        View childAt = bv6Var.V.getChildAt(i);
                        if (bv6Var.Y.contains((jw6) bv6Var.W.getItem(firstVisiblePosition + i))) {
                            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                            alphaAnimation.setDuration(bv6Var.z0);
                            alphaAnimation.setFillEnabled(true);
                            alphaAnimation.setFillAfter(true);
                            z = z;
                            if (!z) {
                                alphaAnimation.setAnimationListener(ru6Var);
                                z = true;
                            }
                            childAt.clearAnimation();
                            childAt.startAnimation(alphaAnimation);
                        }
                        i++;
                        z = z;
                    }
                    break;
                } else {
                    bv6Var.j(true);
                    break;
                }
            case 5:
                yu7 yu7Var = (yu7) obj;
                yu7Var.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                int currentItem = yu7Var.e.getCurrentItem();
                yu7Var.h = currentItem;
                yu7Var.d(currentItem, 0);
                break;
            default:
                vqa vqaVar = (vqa) obj;
                x27 x27Var = vqaVar.n;
                if (vqaVar.a() && !x27Var.O) {
                    View view2 = vqaVar.y;
                    if (view2 != null && view2.isShown()) {
                        x27Var.g();
                        break;
                    } else {
                        vqaVar.dismiss();
                        break;
                    }
                }
                break;
        }
    }
}
