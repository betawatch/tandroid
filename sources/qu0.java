// default package

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.widget.FrameLayout;
import java.util.regex.Pattern;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class qu0 extends e {
    public final /* synthetic */ byte a;
    public final Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qu0(long j) {
        super(null);
        this.a = (byte) 6;
        this.b = new t07(this, this, getLayoutContainer(), j);
    }

    @Override // org.telegram.ui.ActionBar.e
    public final View createView(Context context) {
        switch (this.a) {
            case 6:
                this.actionBar.setAllowOverlayTitle(true);
                this.actionBar.setActionBarMenuOnItemClick(new zl5(this, (byte) 10));
                this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
                a aVar = this.actionBar;
                t07 t07Var = (t07) this.b;
                aVar.setTitle(ob6.M0(t07Var.a ? 2131744089 : 2131748389, null));
                s7 a = this.actionBar.u().a(0, R.drawable.outline_header_search);
                a.N();
                a.I = new r10(this, (byte) 16);
                a.setSearchFieldHint(ob6.M0(2131745564, null));
                a.setVisibility(8);
                e eVar = t07Var.g;
                if (t07Var.m == null) {
                    FrameLayout frameLayout = new FrameLayout(eVar.getParentActivity());
                    t07Var.m = frameLayout;
                    yob.h(aob.a7, eVar.getResourceProvider(), frameLayout);
                    tk4 b = t07Var.b();
                    t07Var.q = b;
                    t07Var.m.addView(b, -1, -1);
                    z2b c = t07Var.c();
                    t07Var.o = c;
                    t07Var.m.addView(c, -1, -1);
                    z2b a2 = t07Var.a();
                    t07Var.n = a2;
                    t07Var.m.addView(a2, tre.c(-1.0f, -1));
                    eVar.getParentActivity();
                    x46 x46Var = new x46();
                    d79 d79Var = new d79(eVar.getParentActivity(), null);
                    t07Var.p = d79Var;
                    d79Var.setAdapter(t07Var.f);
                    t07Var.p.s1();
                    t07Var.p.setLayoutManager(x46Var);
                    t07Var.p.setOnItemClickListener(new zg4(t07Var, (byte) 11));
                    t07Var.p.setOnScrollListener(t07Var.D);
                    yob.J(t07Var.p, aob.i6, eVar.getResourceProvider());
                    t07Var.m.addView(t07Var.p, -1, -1);
                    zb3 zb3Var = new zb3();
                    zb3Var.n(350L);
                    zb3Var.o(k43.h);
                    zb3Var.C = false;
                    zb3Var.m = false;
                    t07Var.p.setItemAnimator(zb3Var);
                }
                FrameLayout frameLayout2 = t07Var.m;
                a aVar2 = this.actionBar;
                d79 d79Var2 = t07Var.p;
                aVar2.getClass();
                aVar2.F(d79Var2, aob.a7, aob.s8);
                t07Var.e();
                this.fragmentView = frameLayout2;
                return frameLayout2;
            case 7:
                this.hasOwnBackground = true;
                this.actionBar.setAddToContainer(false);
                View view = new View(context);
                view.setBackgroundColor(0);
                return view;
            default:
                return super.createView(context);
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final Context getContext() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 2:
                return ((gu3) obj).a.getContext();
            case 8:
                return ((dx7) obj).getContext();
            case 11:
                return ((l3a) obj).b.getContext();
            case 13:
                return ((wua) obj).getContext();
            default:
                return super.getContext();
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final int getCurrentAccount() {
        switch (this.a) {
            case 2:
                return this.currentAccount;
            case 3:
            case 6:
            case 7:
            case 9:
            case 12:
            default:
                return super.getCurrentAccount();
            case 4:
                return this.currentAccount;
            case 5:
                return ((g14) this.b).H.d1;
            case 8:
                return this.currentAccount;
            case 10:
                return this.currentAccount;
            case 11:
                return this.currentAccount;
            case 13:
                return this.currentAccount;
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final View getFragmentView() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 4:
                ly3 ly3Var = ((hy3) obj).y;
                Pattern pattern = ly3.P1;
                return ly3Var.b;
            case 5:
                return ((g14) obj).H.r;
            case 10:
                return ((kl8) obj).b;
            default:
                return super.getFragmentView();
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final FrameLayout getLayoutContainer() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 4:
                ly3 ly3Var = ((hy3) obj).y;
                Pattern pattern = ly3.P1;
                return (FrameLayout) ly3Var.b;
            case 5:
                return ((g14) obj).H.r;
            case 10:
                return ((kl8) obj).H2;
            default:
                return super.getLayoutContainer();
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final Activity getParentActivity() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((rv0) obj).a0;
            case 1:
                return ((e) obj).getParentActivity();
            case 2:
                for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
                    if (context instanceof Activity) {
                        return (Activity) context;
                    }
                }
                return null;
            case 3:
                return LaunchActivity.H1;
            case 4:
            case 5:
            case 6:
            case 7:
            case 11:
            default:
                return super.getParentActivity();
            case 8:
                return hl.W(((dx7) obj).getContext());
            case 9:
                Activity W = hl.W(((o68) obj).getContext());
                return W == null ? LaunchActivity.H1 : W;
            case 10:
                e eVar = ((kl8) obj).o2;
                if (eVar != null) {
                    return eVar.getParentActivity();
                }
                return null;
            case 12:
                a5a a5aVar = (a5a) obj;
                Activity ownerActivity = a5aVar.getOwnerActivity();
                if (ownerActivity == null) {
                    ownerActivity = LaunchActivity.H1;
                }
                return ownerActivity == null ? hl.W(a5aVar.getContext()) : ownerActivity;
            case 13:
                for (Context context2 = ((wua) obj).getContext(); context2 instanceof ContextWrapper; context2 = ((ContextWrapper) context2).getBaseContext()) {
                    if (context2 instanceof Activity) {
                        return (Activity) context2;
                    }
                }
                return null;
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final vnb getResourceProvider() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return new pu0(((rv0) obj).e, (byte) 0);
            case 1:
                return new uk5((vnb) new x53());
            case 2:
            case 6:
            case 7:
            case 10:
            default:
                return super.getResourceProvider();
            case 3:
                return new pu0(((tw7) obj).J0, (byte) 1);
            case 4:
                ly3 ly3Var = ((hy3) obj).y;
                Pattern pattern = ly3.P1;
                return ly3Var.J0;
            case 5:
                return ((g14) obj).H.a2;
            case 8:
                return ((dx7) obj).q1;
            case 9:
                return new pu0(((o68) obj).l0, (byte) 3);
            case 11:
                return ((l3a) obj).b.s;
            case 12:
                return ((a5a) obj).J0;
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final Dialog getVisibleDialog() {
        switch (this.a) {
            case 2:
                return new fu3(this, ((gu3) this.b).a.getContext());
            default:
                return super.getVisibleDialog();
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean isLightStatusBar() {
        switch (this.a) {
            case 0:
            case 1:
            case 3:
            case 9:
                return false;
            default:
                return super.isLightStatusBar();
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean onBackPressed(boolean z) {
        switch (this.a) {
            case 6:
                d17 d17Var = ((t07) this.b).s;
                if (d17Var == null) {
                    return true;
                }
                if (!z) {
                    return false;
                }
                d17Var.e(false);
                return false;
            default:
                return super.onBackPressed(z);
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        switch (this.a) {
            case 7:
                if (z && z2) {
                    ((mu7) this.b).dismiss();
                    break;
                }
                break;
            default:
                super.onTransitionAnimationEnd(z, z2);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean presentFragment(e eVar) {
        switch (this.a) {
            case 1:
                return false;
            case 8:
                e Q = LaunchActivity.Q();
                if (Q == null) {
                    return false;
                }
                bg0 bg0Var = new bg0();
                bg0Var.a = true;
                Q.showAsSheet(eVar, bg0Var);
                return true;
            case 9:
                lcb lcbVar = ((o68) this.b).t0;
                if (lcbVar != null) {
                    lcbVar.L(eVar);
                }
                return true;
            default:
                return super.presentFragment(eVar);
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final Dialog showDialog(Dialog dialog) {
        switch (this.a) {
            case 0:
                dialog.show();
                return dialog;
            case 3:
                dialog.show();
                return dialog;
            case 9:
                lcb lcbVar = ((o68) this.b).t0;
                if (lcbVar != null) {
                    lcbVar.u(dialog);
                } else if (dialog != null) {
                    dialog.show();
                }
                return dialog;
            case 10:
                dialog.show();
                return dialog;
            case 13:
                dialog.show();
                return dialog;
            default:
                return super.showDialog(dialog);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qu0(Object obj, byte b) {
        super(null);
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qu0(e eVar) {
        super(null);
        this.a = (byte) 1;
        this.b = eVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qu0(tw7 tw7Var) {
        super(null);
        this.a = (byte) 3;
        this.b = tw7Var;
        this.currentAccount = tw7Var.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qu0(rv0 rv0Var) {
        super(null);
        this.a = (byte) 0;
        this.b = rv0Var;
        this.currentAccount = rv0Var.N;
    }
}
