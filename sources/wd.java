// default package

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class wd implements View.OnAttachStateChangeListener {
    public final /* synthetic */ byte a;
    public Object b;

    public /* synthetic */ wd(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i = 0;
        switch (this.a) {
            case 0:
                ((zy) this.b).c(null);
                break;
            case 1:
                ((ps8) this.b).b(view);
                break;
            case 2:
                ((ed0) this.b).b.I();
                break;
            case 3:
                sm0 sm0Var = (sm0) this.b;
                ArrayList arrayList = sm0Var.c;
                arrayList.clear();
                for (View view2 = sm0Var.b; view2 != null; view2 = (View) view2.getParent()) {
                    arrayList.add(0, view2);
                    if (!(view2.getParent() instanceof View)) {
                        break;
                    }
                }
                break;
            case 4:
            case 5:
                break;
            case 6:
                ((jq2) this.b).a();
                break;
            case 7:
                nm7.e().b((dw2) this.b, nm7.m4);
                break;
            case 8:
                ((r97) this.b).run();
                break;
            case 9:
                ((lx4) this.b).l.a();
                break;
            case 10:
                ((on5) this.b).b.I();
                break;
            case 11:
                ((vt7) this.b).f.I();
                break;
            case 12:
                tm tmVar = ((x28) this.b).i;
                if (tmVar != null) {
                    tmVar.a();
                    break;
                }
                break;
            case 13:
                p99 p99Var = (p99) this.b;
                tm tmVar2 = p99Var.t;
                if (tmVar2 != null) {
                    tmVar2.a();
                }
                tm tmVar3 = p99Var.u;
                if (tmVar3 != null) {
                    tmVar3.a();
                    break;
                }
                break;
            case 14:
                lb9 lb9Var = (lb9) this.b;
                jb9 jb9Var = lb9Var.b0;
                if (jb9Var != null) {
                    jb9Var.b(lb9Var.c);
                    break;
                }
                break;
            case 15:
                ob9 ob9Var = (ob9) this.b;
                mb9 mb9Var = ob9Var.b0;
                if (mb9Var != null) {
                    mb9Var.b(ob9Var.c);
                    break;
                }
                break;
            case 16:
                break;
            case 17:
                y9a y9aVar = (y9a) this.b;
                y9aVar.h.a();
                y9aVar.n.a();
                break;
            case 18:
                break;
            case 19:
                ArrayList arrayList2 = ((hsa) this.b).e;
                int size = arrayList2.size();
                while (i < size) {
                    Object obj = arrayList2.get(i);
                    i++;
                    fsa fsaVar = (fsa) obj;
                    if (fsaVar.c) {
                        fsaVar.d.I();
                    }
                }
                break;
            default:
                wm9 wm9Var = (wm9) this.b;
                zgc zgcVar = (zgc) wm9Var.c;
                ViewTreeObserver viewTreeObserver = ((View) wm9Var.b).getViewTreeObserver();
                ViewTreeObserver viewTreeObserver2 = (ViewTreeObserver) wm9Var.d;
                if (viewTreeObserver2 != viewTreeObserver) {
                    if (viewTreeObserver2 != null) {
                        if (viewTreeObserver2.isAlive()) {
                            ((ViewTreeObserver) wm9Var.d).removeOnPreDrawListener(zgcVar);
                        }
                        wm9Var.d = null;
                    }
                    wm9Var.d = viewTreeObserver;
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.addOnPreDrawListener(zgcVar);
                        break;
                    }
                }
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        int i = 0;
        switch (this.a) {
            case 0:
                ((zy) this.b).b(null);
                break;
            case 1:
                ((ps8) this.b).o(view);
                break;
            case 2:
                ((ed0) this.b).b.K();
                break;
            case 3:
                ((sm0) this.b).c.clear();
                break;
            case 4:
                u31 u31Var = (u31) this.b;
                u31Var.e.removeOnAttachStateChangeListener(this);
                u31Var.c(0L, false);
                break;
            case 5:
                fe1 fe1Var = (fe1) this.b;
                ViewTreeObserver viewTreeObserver = fe1Var.O;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        fe1Var.O = view.getViewTreeObserver();
                    }
                    fe1Var.O.removeGlobalOnLayoutListener(fe1Var.r);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 6:
                ((jq2) this.b).b();
                break;
            case 7:
                nm7.e().n((dw2) this.b, nm7.m4);
                break;
            case 8:
                break;
            case 9:
                ((lx4) this.b).l.b();
                break;
            case 10:
                ((on5) this.b).b.K();
                break;
            case 11:
                ((vt7) this.b).f.K();
                break;
            case 12:
                tm tmVar = ((x28) this.b).i;
                if (tmVar != null) {
                    tmVar.b();
                    break;
                }
                break;
            case 13:
                p99 p99Var = (p99) this.b;
                tm tmVar2 = p99Var.t;
                if (tmVar2 != null) {
                    tmVar2.b();
                }
                tm tmVar3 = p99Var.u;
                if (tmVar3 != null) {
                    tmVar3.a();
                    break;
                }
                break;
            case 14:
                lb9 lb9Var = (lb9) this.b;
                jb9 jb9Var = lb9Var.b0;
                if (jb9Var != null) {
                    jb9Var.o(lb9Var.c);
                    break;
                }
                break;
            case 15:
                ob9 ob9Var = (ob9) this.b;
                mb9 mb9Var = ob9Var.b0;
                if (mb9Var != null) {
                    mb9Var.o(ob9Var.c);
                    break;
                }
                break;
            case 16:
                view.removeCallbacks((Runnable) ((bx9) this.b).a.remove(view));
                view.removeOnAttachStateChangeListener(this);
                break;
            case 17:
                y9a y9aVar = (y9a) this.b;
                y9aVar.h.b();
                y9aVar.n.b();
                break;
            case 18:
                zoa zoaVar = (zoa) this.b;
                ViewTreeObserver viewTreeObserver2 = zoaVar.F;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        zoaVar.F = view.getViewTreeObserver();
                    }
                    zoaVar.F.removeGlobalOnLayoutListener(zoaVar.r);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 19:
                ArrayList arrayList = ((hsa) this.b).e;
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((fsa) obj).a();
                }
                break;
            default:
                wm9 wm9Var = (wm9) this.b;
                ViewTreeObserver viewTreeObserver3 = (ViewTreeObserver) wm9Var.d;
                if (viewTreeObserver3 != null) {
                    if (viewTreeObserver3.isAlive()) {
                        ((ViewTreeObserver) wm9Var.d).removeOnPreDrawListener((zgc) wm9Var.c);
                    }
                    wm9Var.d = null;
                    break;
                }
                break;
        }
    }

    public /* synthetic */ wd() {
        this.a = (byte) 7;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }

    private final void d(View view) {
    }

    private final void e(View view) {
    }
}
