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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class zwc implements c8 {
    public static final AccelerateInterpolator x = new AccelerateInterpolator();
    public static final DecelerateInterpolator y = new DecelerateInterpolator();
    public Context a;
    public Context b;
    public ActionBarOverlayLayout c;
    public ActionBarContainer d;
    public g93 e;
    public ActionBarContextView f;
    public final View g;
    public boolean h;
    public ywc i;
    public ywc j;
    public tg2 k;
    public boolean l;
    public boolean p;
    public boolean q;
    public cfc s;
    public boolean t;
    public final ArrayList m = new ArrayList();
    public int n = 0;
    public boolean o = true;
    public boolean r = true;
    public final xwc u = new xwc(this, 0);
    public final xwc v = new xwc(this, 1);
    public final g29 w = new g29((Object) this, (byte) 22);

    public zwc(Activity activity, boolean z) {
        View decorView = activity.getWindow().getDecorView();
        b(decorView);
        if (z) {
            return;
        }
        this.g = decorView.findViewById(R.id.content);
    }

    public final void a(boolean z) {
        afc i;
        afc afcVar;
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
        WeakHashMap weakHashMap = jdc.a;
        boolean isLaidOut = actionBarContainer.isLaidOut();
        g93 g93Var = this.e;
        if (!isLaidOut) {
            if (z) {
                ((itb) g93Var).a.setVisibility(4);
                this.f.setVisibility(0);
                return;
            } else {
                ((itb) g93Var).a.setVisibility(0);
                this.f.setVisibility(8);
                return;
            }
        }
        if (z) {
            itb itbVar = (itb) g93Var;
            i = jdc.a(itbVar.a);
            i.a(0.0f);
            i.c(100L);
            i.d(new htb(itbVar, 4));
            afcVar = this.f.i(0, 200L);
        } else {
            itb itbVar2 = (itb) g93Var;
            afc a = jdc.a(itbVar2.a);
            a.a(1.0f);
            a.c(200L);
            a.d(new htb(itbVar2, 0));
            i = this.f.i(8, 100L);
            afcVar = a;
        }
        cfc cfcVar = new cfc();
        ArrayList arrayList = (ArrayList) cfcVar.c;
        arrayList.add(i);
        View view = (View) i.a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) afcVar.a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(afcVar);
        cfcVar.b();
    }

    public final void b(View view) {
        g93 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(org.telegram.messenger.beta.R.id.decor_content_parent);
        this.c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback findViewById = view.findViewById(org.telegram.messenger.beta.R.id.action_bar);
        if (findViewById instanceof g93) {
            wrapper = (g93) findViewById;
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
        g93 g93Var = this.e;
        if (g93Var == null || this.f == null || actionBarContainer == null) {
            sc8.j(zwc.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
            return;
        }
        Context context = ((itb) g93Var).a.getContext();
        this.a = context;
        if ((((itb) this.e).b & 4) != 0) {
            this.h = true;
        }
        int i = context.getApplicationInfo().targetSdkVersion;
        this.e.getClass();
        if (context.getResources().getBoolean(org.telegram.messenger.beta.R.bool.abc_action_bar_embed_tabs)) {
            this.d.setTabContainer(null);
            ((itb) this.e).getClass();
        } else {
            ((itb) this.e).getClass();
            this.d.setTabContainer(null);
        }
        this.e.getClass();
        ((itb) this.e).a.setCollapsible(false);
        this.c.setHasNonEmbeddedTabs(false);
        TypedArray obtainStyledAttributes = this.a.obtainStyledAttributes(null, jy8.a, org.telegram.messenger.beta.R.attr.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.c;
            if (!actionBarOverlayLayout2.n) {
                sc8.j("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
                return;
            } else {
                this.t = true;
                actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
            }
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.d;
            WeakHashMap weakHashMap = jdc.a;
            bdc.h(actionBarContainer2, dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    public final void c(boolean z) {
        if (this.h) {
            return;
        }
        int i = z ? 4 : 0;
        itb itbVar = (itb) this.e;
        int i2 = itbVar.b;
        this.h = true;
        itbVar.a((i & 4) | (i2 & (-5)));
    }

    public final void d(boolean z) {
        boolean z2 = this.q || !this.p;
        boolean z3 = this.r;
        byte b = 29;
        g29 g29Var = this.w;
        View view = this.g;
        if (!z2) {
            if (z3) {
                this.r = false;
                cfc cfcVar = this.s;
                if (cfcVar != null) {
                    cfcVar.a();
                }
                int i = this.n;
                xwc xwcVar = this.u;
                if (i != 0 || !z) {
                    xwcVar.c();
                    return;
                }
                this.d.setAlpha(1.0f);
                this.d.setTransitioning(true);
                cfc cfcVar2 = new cfc();
                ArrayList arrayList = (ArrayList) cfcVar2.c;
                float f = -this.d.getHeight();
                if (z) {
                    this.d.getLocationInWindow(new int[]{0, 0});
                    f -= r13[1];
                }
                afc a = jdc.a(this.d);
                a.e(f);
                View view2 = (View) a.a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(g29Var != null ? new pk(g29Var, view2, b) : null);
                }
                if (!cfcVar2.b) {
                    arrayList.add(a);
                }
                if (this.o && view != null) {
                    afc a2 = jdc.a(view);
                    a2.e(f);
                    if (!cfcVar2.b) {
                        arrayList.add(a2);
                    }
                }
                boolean z4 = cfcVar2.b;
                if (!z4) {
                    cfcVar2.d = x;
                }
                if (!z4) {
                    cfcVar2.a = 250L;
                }
                if (!z4) {
                    cfcVar2.e = xwcVar;
                }
                this.s = cfcVar2;
                cfcVar2.b();
                return;
            }
            return;
        }
        if (z3) {
            return;
        }
        this.r = true;
        cfc cfcVar3 = this.s;
        if (cfcVar3 != null) {
            cfcVar3.a();
        }
        this.d.setVisibility(0);
        int i2 = this.n;
        xwc xwcVar2 = this.v;
        if (i2 == 0 && z) {
            this.d.setTranslationY(0.0f);
            float f2 = -this.d.getHeight();
            if (z) {
                this.d.getLocationInWindow(new int[]{0, 0});
                f2 -= r13[1];
            }
            this.d.setTranslationY(f2);
            cfc cfcVar4 = new cfc();
            ArrayList arrayList2 = (ArrayList) cfcVar4.c;
            afc a3 = jdc.a(this.d);
            a3.e(0.0f);
            View view3 = (View) a3.a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(g29Var != null ? new pk(g29Var, view3, b) : null);
            }
            if (!cfcVar4.b) {
                arrayList2.add(a3);
            }
            if (this.o && view != null) {
                view.setTranslationY(f2);
                afc a4 = jdc.a(view);
                a4.e(0.0f);
                if (!cfcVar4.b) {
                    arrayList2.add(a4);
                }
            }
            boolean z5 = cfcVar4.b;
            if (!z5) {
                cfcVar4.d = y;
            }
            if (!z5) {
                cfcVar4.a = 250L;
            }
            if (!z5) {
                cfcVar4.e = xwcVar2;
            }
            this.s = cfcVar4;
            cfcVar4.b();
        } else {
            this.d.setAlpha(1.0f);
            this.d.setTranslationY(0.0f);
            if (this.o && view != null) {
                view.setTranslationY(0.0f);
            }
            xwcVar2.c();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.c;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = jdc.a;
            zcc.c(actionBarOverlayLayout);
        }
    }

    public zwc(dp dpVar) {
        b(dpVar.getWindow().getDecorView());
    }
}
