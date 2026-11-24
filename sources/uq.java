// default package

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.WeakHashMap;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ExternalActionActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class uq implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ uq(Object obj, byte b) {
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
                fr frVar = (fr) obj;
                if (!frVar.getInternalPopup().a()) {
                    frVar.f.l(wq.b(frVar), wq.a(frVar));
                }
                ViewTreeObserver viewTreeObserver = frVar.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    vq.a(viewTreeObserver, this);
                    break;
                }
                break;
            case 1:
                cr crVar = (cr) obj;
                fr frVar2 = crVar.X;
                WeakHashMap weakHashMap = kfc.a;
                if (!frVar2.isAttachedToWindow() || !frVar2.getGlobalVisibleRect(crVar.V)) {
                    crVar.dismiss();
                    break;
                } else {
                    crVar.q();
                    crVar.f();
                    break;
                }
                break;
            case 2:
                fe1 fe1Var = (fe1) obj;
                ArrayList arrayList = fe1Var.n;
                if (fe1Var.a() && arrayList.size() > 0 && !((ee1) arrayList.get(0)).a.O) {
                    View view = fe1Var.F;
                    if (view != null && view.isShown()) {
                        int size = arrayList.size();
                        while (b2 < size) {
                            ((ee1) arrayList.get(b2)).a.f();
                            b2++;
                        }
                        break;
                    } else {
                        fe1Var.dismiss();
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
                wu6 wu6Var = (wu6) obj;
                wu6Var.V.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                HashSet hashSet = wu6Var.Y;
                if (hashSet != null && hashSet.size() != 0) {
                    mu6 mu6Var = new mu6(wu6Var, b2);
                    int firstVisiblePosition = wu6Var.V.getFirstVisiblePosition();
                    boolean z = false;
                    while (i < wu6Var.V.getChildCount()) {
                        View childAt = wu6Var.V.getChildAt(i);
                        if (wu6Var.Y.contains((ew6) wu6Var.W.getItem(firstVisiblePosition + i))) {
                            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                            alphaAnimation.setDuration(wu6Var.z0);
                            alphaAnimation.setFillEnabled(true);
                            alphaAnimation.setFillAfter(true);
                            z = z;
                            if (!z) {
                                alphaAnimation.setAnimationListener(mu6Var);
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
                    wu6Var.j(true);
                    break;
                }
            case 5:
                tt7 tt7Var = (tt7) obj;
                tt7Var.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                int currentItem = tt7Var.e.getCurrentItem();
                tt7Var.h = currentItem;
                tt7Var.d(currentItem, 0);
                break;
            default:
                zoa zoaVar = (zoa) obj;
                q27 q27Var = zoaVar.n;
                if (zoaVar.a() && !q27Var.O) {
                    View view2 = zoaVar.y;
                    if (view2 != null && view2.isShown()) {
                        q27Var.f();
                        break;
                    } else {
                        zoaVar.dismiss();
                        break;
                    }
                }
                break;
        }
    }
}
