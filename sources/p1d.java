// default package

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class p1d implements d8 {
    public static final AccelerateInterpolator x = new AccelerateInterpolator();
    public static final DecelerateInterpolator y = new DecelerateInterpolator();
    public Context a;
    public Context b;
    public ActionBarOverlayLayout c;
    public ActionBarContainer d;
    public z93 e;
    public ActionBarContextView f;
    public final View g;
    public boolean h;
    public o1d i;
    public o1d j;
    public lh2 k;
    public boolean l;
    public boolean p;
    public boolean q;
    public bjc s;
    public boolean t;
    public final ArrayList m = new ArrayList();
    public int n = 0;
    public boolean o = true;
    public boolean r = true;
    public final n1d u = new n1d(this, 0);
    public final n1d v = new n1d(this, 1);
    public final pq8 w = new pq8((Object) this, (byte) 26);

    public p1d(Activity activity, boolean z) {
        View decorView = activity.getWindow().getDecorView();
        b(decorView);
        if (z) {
            return;
        }
        this.g = decorView.findViewById(R.id.content);
    }

    public final void a(boolean z) {
        zic i;
        zic zicVar;
        boolean z2 = this.q;
        if (z) {
            if (!z2) {
                this.q = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                d(false);
            }
        } else if (z2) {
            this.q = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            d(false);
        }
        ActionBarContainer actionBarContainer = this.d;
        WeakHashMap weakHashMap = ihc.a;
        boolean isLaidOut = actionBarContainer.isLaidOut();
        z93 z93Var = this.e;
        if (!isLaidOut) {
            if (z) {
                ((jxb) z93Var).a.setVisibility(4);
                this.f.setVisibility(0);
                return;
            } else {
                ((jxb) z93Var).a.setVisibility(0);
                this.f.setVisibility(8);
                return;
            }
        }
        if (z) {
            jxb jxbVar = (jxb) z93Var;
            i = ihc.a(jxbVar.a);
            i.a(0.0f);
            i.c(100L);
            i.d(new ixb(jxbVar, 4));
            zicVar = this.f.i(0, 200L);
        } else {
            jxb jxbVar2 = (jxb) z93Var;
            zic a = ihc.a(jxbVar2.a);
            a.a(1.0f);
            a.c(200L);
            a.d(new ixb(jxbVar2, 0));
            i = this.f.i(8, 100L);
            zicVar = a;
        }
        bjc bjcVar = new bjc();
        ArrayList arrayList = (ArrayList) bjcVar.c;
        arrayList.add(i);
        View view = (View) i.a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) zicVar.a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(zicVar);
        bjcVar.b();
    }

    public final void b(View view) {
        z93 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(org.telegram.messenger.beta.R.id.decor_content_parent);
        this.c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback findViewById = view.findViewById(org.telegram.messenger.beta.R.id.action_bar);
        if (findViewById instanceof z93) {
            wrapper = (z93) findViewById;
        } else {
            if (!(findViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById != null ? findViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) findViewById).getWrapper();
        }
        this.e = wrapper;
        this.f = (ActionBarContextView) view.findViewById(org.telegram.messenger.beta.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(org.telegram.messenger.beta.R.id.action_bar_container);
        this.d = actionBarContainer;
        z93 z93Var = this.e;
        if (z93Var == null || this.f == null || actionBarContainer == null) {
            grb.i(p1d.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
            return;
        }
        Context context = ((jxb) z93Var).a.getContext();
        this.a = context;
        if ((((jxb) this.e).b & 4) != 0) {
            this.h = true;
        }
        int i = context.getApplicationInfo().targetSdkVersion;
        this.e.getClass();
        if (context.getResources().getBoolean(org.telegram.messenger.beta.R.bool.abc_action_bar_embed_tabs)) {
            this.d.setTabContainer(null);
            ((jxb) this.e).getClass();
        } else {
            ((jxb) this.e).getClass();
            this.d.setTabContainer(null);
        }
        this.e.getClass();
        ((jxb) this.e).a.setCollapsible(false);
        this.c.setHasNonEmbeddedTabs(false);
        TypedArray obtainStyledAttributes = this.a.obtainStyledAttributes(null, w19.a, org.telegram.messenger.beta.R.attr.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.c;
            if (!actionBarOverlayLayout2.n) {
                grb.i("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
                return;
            } else {
                this.t = true;
                actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
            }
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.d;
            WeakHashMap weakHashMap = ihc.a;
            ahc.h(actionBarContainer2, dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    public final void c(boolean z) {
        if (this.h) {
            return;
        }
        int i = z ? 4 : 0;
        jxb jxbVar = (jxb) this.e;
        int i2 = jxbVar.b;
        this.h = true;
        jxbVar.a((i & 4) | (i2 & (-5)));
    }

    public final void d(boolean z) {
        boolean z2 = this.q || !this.p;
        boolean z3 = this.r;
        byte b = 29;
        pq8 pq8Var = this.w;
        View view = this.g;
        if (!z2) {
            if (z3) {
                this.r = false;
                bjc bjcVar = this.s;
                if (bjcVar != null) {
                    bjcVar.a();
                }
                int i = this.n;
                n1d n1dVar = this.u;
                if (i != 0 || !z) {
                    n1dVar.c();
                    return;
                }
                this.d.setAlpha(1.0f);
                this.d.setTransitioning(true);
                bjc bjcVar2 = new bjc();
                ArrayList arrayList = (ArrayList) bjcVar2.c;
                float f = -this.d.getHeight();
                if (z) {
                    this.d.getLocationInWindow(new int[]{0, 0});
                    f -= r13[1];
                }
                zic a = ihc.a(this.d);
                a.e(f);
                View view2 = (View) a.a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(pq8Var != null ? new lk(pq8Var, view2, b) : null);
                }
                if (!bjcVar2.b) {
                    arrayList.add(a);
                }
                if (this.o && view != null) {
                    zic a2 = ihc.a(view);
                    a2.e(f);
                    if (!bjcVar2.b) {
                        arrayList.add(a2);
                    }
                }
                boolean z4 = bjcVar2.b;
                if (!z4) {
                    bjcVar2.d = x;
                }
                if (!z4) {
                    bjcVar2.a = 250L;
                }
                if (!z4) {
                    bjcVar2.e = n1dVar;
                }
                this.s = bjcVar2;
                bjcVar2.b();
                return;
            }
            return;
        }
        if (z3) {
            return;
        }
        this.r = true;
        bjc bjcVar3 = this.s;
        if (bjcVar3 != null) {
            bjcVar3.a();
        }
        this.d.setVisibility(0);
        int i2 = this.n;
        n1d n1dVar2 = this.v;
        if (i2 == 0 && z) {
            this.d.setTranslationY(0.0f);
            float f2 = -this.d.getHeight();
            if (z) {
                this.d.getLocationInWindow(new int[]{0, 0});
                f2 -= r13[1];
            }
            this.d.setTranslationY(f2);
            bjc bjcVar4 = new bjc();
            ArrayList arrayList2 = (ArrayList) bjcVar4.c;
            zic a3 = ihc.a(this.d);
            a3.e(0.0f);
            View view3 = (View) a3.a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(pq8Var != null ? new lk(pq8Var, view3, b) : null);
            }
            if (!bjcVar4.b) {
                arrayList2.add(a3);
            }
            if (this.o && view != null) {
                view.setTranslationY(f2);
                zic a4 = ihc.a(view);
                a4.e(0.0f);
                if (!bjcVar4.b) {
                    arrayList2.add(a4);
                }
            }
            boolean z5 = bjcVar4.b;
            if (!z5) {
                bjcVar4.d = y;
            }
            if (!z5) {
                bjcVar4.a = 250L;
            }
            if (!z5) {
                bjcVar4.e = n1dVar2;
            }
            this.s = bjcVar4;
            bjcVar4.b();
        } else {
            this.d.setAlpha(1.0f);
            this.d.setTranslationY(0.0f);
            if (this.o && view != null) {
                view.setTranslationY(0.0f);
            }
            n1dVar2.c();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.c;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = ihc.a;
            ygc.c(actionBarOverlayLayout);
        }
    }

    public p1d(ep epVar) {
        b(epVar.getWindow().getDecorView());
    }
}
