// default package

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.ContactsActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ug3 extends d {
    public static final rg3 y = new rg3((byte) 0);
    public nk3 a;
    public ContactsActivity b;
    public r7 c;
    public Paint d;
    public ScrollSlidingTextTabStrip e;
    public tg3[] f;
    public AnimatorSet h;
    public boolean n;
    public boolean r;
    public boolean s;
    public int w;
    public boolean x;

    @Override // org.telegram.ui.ActionBar.d
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(cmb.s8));
        hashSet.add(Integer.valueOf(cmb.z8));
        hashSet.add(Integer.valueOf(cmb.u8));
        hashSet.add(Integer.valueOf(cmb.r8));
        hashSet.add(Integer.valueOf(cmb.c6));
        nk3 nk3Var = this.a;
        if (nk3Var != null) {
            nk3Var.addThemeColorKeys(hashSet);
        }
        ContactsActivity contactsActivity = this.b;
        if (contactsActivity != null) {
            contactsActivity.addThemeColorKeys(hashSet);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final View createView(Context context) {
        float f;
        ContactsActivity contactsActivity = this.b;
        nk3 nk3Var = this.a;
        tg3[] tg3VarArr = this.f;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setTitle(jb6.M0(2131753652, null));
        tk5 tk5Var = this.parentLayout;
        if (tk5Var != null && ((ActionBarLayout) tk5Var).T0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        float f2 = 44.0f;
        this.actionBar.setExtraHeight(gm.L(44.0f));
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setClipContent(true);
        this.actionBar.setActionBarMenuOnItemClick(new fh2(this, (byte) 12));
        this.hasOwnBackground = true;
        r7 a = this.actionBar.t().a(0, R.drawable.outline_header_search);
        a.N();
        a.I = new q20(this, (byte) 9);
        this.c = a;
        a.setSearchFieldHint(jb6.M0(2131745570, null));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(context, null);
        this.e = scrollSlidingTextTabStrip;
        scrollSlidingTextTabStrip.setUseSameWidth(true);
        this.actionBar.addView(this.e, qoe.e(-1, 44, 83));
        this.e.setDelegate(new k6d((Object) this, (byte) 28));
        this.w = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        sg3 sg3Var = new sg3(this, context);
        this.fragmentView = sg3Var;
        sg3Var.setWillNotDraw(false);
        nk3Var.setParentFragment(this);
        contactsActivity.setParentFragment(this);
        int i = 0;
        while (i < tg3VarArr.length) {
            tg3 tg3Var = new tg3(this, context);
            tg3VarArr[i] = tg3Var;
            sg3Var.addView(tg3Var, qoe.c(-1.0f, -1));
            if (i == 0) {
                tg3 tg3Var2 = tg3VarArr[i];
                tg3Var2.a = nk3Var;
                f = f2;
                tg3Var2.d = nk3Var.f0[0].a;
                nk3Var.i3();
                sj3 sj3Var = nk3Var.D0;
                tg3Var2.e = sj3Var != null ? sj3Var.b0 : null;
            } else {
                f = f2;
                if (i == 1) {
                    tg3 tg3Var3 = tg3VarArr[i];
                    tg3Var3.a = contactsActivity;
                    tg3Var3.d = contactsActivity.d;
                    tg3Var3.setVisibility(8);
                }
            }
            tg3VarArr[i].d.setScrollingTouchSlop(1);
            tg3 tg3Var4 = tg3VarArr[i];
            tg3Var4.b = (FrameLayout) tg3Var4.a.getFragmentView();
            tg3 tg3Var5 = tg3VarArr[i];
            tg3Var5.c = tg3Var5.a.getActionBar();
            tg3 tg3Var6 = tg3VarArr[i];
            tg3Var6.addView(tg3Var6.b, qoe.c(-1.0f, -1));
            gm.B2(tg3VarArr[i].c);
            tg3 tg3Var7 = tg3VarArr[i];
            tg3Var7.addView(tg3Var7.c, qoe.c(-2.0f, -1));
            tg3VarArr[i].c.setVisibility(8);
            int i2 = 0;
            while (i2 < 2) {
                r59 r59Var = i2 == 0 ? tg3VarArr[i].d : tg3VarArr[i].e;
                if (r59Var != null) {
                    r59Var.setClipToPadding(false);
                    r59Var.setOnScrollListener(new bk1(this, r59Var.getOnScrollListener(), (byte) 3));
                }
                i2++;
            }
            i++;
            f2 = f;
        }
        float f3 = f2;
        sg3Var.addView(this.actionBar, qoe.c(-2.0f, -1));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip2 = this.e;
        if (scrollSlidingTextTabStrip2 != null) {
            scrollSlidingTextTabStrip2.a(0, jb6.M0(2131753655, null), null);
            this.e.a(1, jb6.M0(2131753654, null), null);
            this.e.setVisibility(0);
            this.actionBar.setExtraHeight(gm.L(f3));
            int currentTabId = this.e.getCurrentTabId();
            if (currentTabId >= 0) {
                tg3VarArr[0].f = currentTabId;
            }
            this.e.c();
        }
        r0(false);
        this.x = this.e.getCurrentTabId() == this.e.getFirstTabId();
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new cnb(this.e.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (bnb) null, cmb.H8));
        arrayList.add(new cnb(this.e.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (bnb) null, cmb.I8));
        arrayList.add(new cnb(this.e.getTabsContainer(), 65568, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (bnb) null, cmb.J8));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, new Drawable[]{this.e.getSelectorDrawable()}, (bnb) null, cmb.K8));
        arrayList.addAll(this.a.getThemeDescriptions());
        arrayList.addAll(this.b.getThemeDescriptions());
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return this.x;
    }

    public final void o0(TLRPC.User user) {
        if (oc7.G2(user)) {
            ik.t0(jb6.M0(2131751042, null), this);
        } else {
            oc7.r1(this.currentAccount).t(user.id);
            ik.t0(jb6.M0(2131743448, null), this);
        }
        finishFragment();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onFragmentDestroy() {
        nk3 nk3Var = this.a;
        if (nk3Var != null) {
            nk3Var.onFragmentDestroy();
        }
        ContactsActivity contactsActivity = this.b;
        if (contactsActivity != null) {
            contactsActivity.onFragmentDestroy();
        }
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onPause() {
        super.onPause();
        nk3 nk3Var = this.a;
        if (nk3Var != null) {
            nk3Var.onPause();
        }
        ContactsActivity contactsActivity = this.b;
        if (contactsActivity != null) {
            contactsActivity.onPause();
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onResume() {
        super.onResume();
        nk3 nk3Var = this.a;
        if (nk3Var != null) {
            nk3Var.onResume();
        }
        ContactsActivity contactsActivity = this.b;
        if (contactsActivity != null) {
            contactsActivity.onResume();
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            nk3 nk3Var = this.a;
            if (nk3Var != null && nk3Var.fragmentView != null) {
                nk3Var.onThemeColorsChanged();
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
        try {
            ContactsActivity contactsActivity = this.b;
            if (contactsActivity == null || contactsActivity.fragmentView == null) {
                return;
            }
            contactsActivity.onThemeColorsChanged();
        } catch (Exception e2) {
            fc4.g(e2, true);
        }
    }

    public final void p0(float f) {
        tg3[] tg3VarArr = this.f;
        this.actionBar.setTranslationY(f);
        for (int i = 0; i < tg3VarArr.length; i++) {
            int i2 = (int) f;
            tg3VarArr[i].d.setPinnedSectionOffsetY(i2);
            pu9 pu9Var = tg3VarArr[i].e;
            if (pu9Var != null) {
                pu9Var.setPinnedSectionOffsetY(i2);
            }
        }
        this.fragmentView.invalidate();
    }

    public final void q0(TLRPC.User user) {
        if (user != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String M0 = jb6.M0(2131753657, null);
            he heVar = alertDialog$Builder.a;
            heVar.S = M0;
            heVar.U = gm.S2(jb6.a0("AreYouSureBlockContact2", null, 2131754084, bw2.m(0, user.first_name, user.last_name)));
            alertDialog$Builder.j(jb6.M0(2131753658, null), new x92((Object) this, (Object) user, (byte) 20));
            alertDialog$Builder.g(jb6.M0(2131752542, null), null);
            showDialog(heVar);
            TextView textView = (TextView) heVar.c(-1);
            if (textView != null) {
                anb.X(textView, cmb.p7, null);
            }
        }
    }

    public final void r0(boolean z) {
        tg3[] tg3VarArr = this.f;
        for (int i = 0; i < tg3VarArr.length; i++) {
            tg3VarArr[i].d.D0();
            pu9 pu9Var = tg3VarArr[i].e;
            if (pu9Var != null) {
                pu9Var.D0();
            }
        }
        int i2 = 0;
        while (i2 < 2) {
            r59 r59Var = i2 == 0 ? tg3VarArr[z ? 1 : 0].d : tg3VarArr[z ? 1 : 0].e;
            if (r59Var != null) {
                r59Var.getAdapter();
                r59Var.setPinnedHeaderShadowDrawable(null);
                if (this.actionBar.getTranslationY() != 0.0f) {
                    ((u46) r59Var.getLayoutManager()).g1(0, (int) this.actionBar.getTranslationY());
                }
            }
            i2++;
        }
    }
}
