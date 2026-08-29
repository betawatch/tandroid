package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Build;
import android.util.Property;
import android.view.View;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class s70 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate, View.OnClickListener, vd.b, ah.d {
    public boolean A;
    public final HashMap B;
    public final ArrayList C;
    public org.telegram.ui.Components.j30 D;
    public int E;
    public int F;
    public int G;
    public final lg.e H;
    public final qg.d I;
    public lg.k J;
    public final ArrayList K;
    public final RectF L;
    public final int a;
    public final vd.c b;
    public org.telegram.ui.Components.u10 c;
    public q70 d;
    public org.telegram.ui.ActionBar.w1 e;
    public r70 f;
    public org.telegram.ui.Components.jl0 h;
    public f2.j0 n;
    public org.telegram.ui.Components.qw0 r;
    public o70 s;
    public boolean v;
    public ArrayList w;
    public int x;
    public boolean y;

    public s70() {
        super(null);
        int i10 = Build.VERSION.SDK_INT;
        this.a = i10 >= 31 ? 48 : 0;
        this.b = new vd.c(3, this, org.telegram.ui.Components.jr.h, 350L, AndroidUtilities.dp(37.0f));
        this.B = new HashMap();
        this.C = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.K = arrayList;
        RectF rectF = new RectF();
        this.L = rectF;
        arrayList.add(rectF);
        if (i10 >= 31) {
            this.H = new lg.e(false);
            this.I = new qg.d(null);
        } else {
            this.H = null;
            this.I = null;
        }
    }

    public static void U(s70 s70Var, View view, int i10) {
        org.telegram.ui.Cells.n4 n4Var;
        ContactsController.Contact contact;
        if (i10 == 0 && !s70Var.A) {
            try {
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("text/plain");
                String inviteText = ContactsController.getInstance(s70Var.currentAccount).getInviteText(0);
                intent.putExtra("android.intent.extra.TEXT", inviteText);
                s70Var.getParentActivity().startActivityForResult(Intent.createChooser(intent, inviteText), 500);
                return;
            } catch (Exception e10) {
                FileLog.e(e10);
                return;
            }
        }
        if ((view instanceof org.telegram.ui.Cells.n4) && (contact = (n4Var = (org.telegram.ui.Cells.n4) view).getContact()) != null) {
            org.telegram.ui.Components.j30 j30Var = (org.telegram.ui.Components.j30) s70Var.B.get(contact.key);
            int i11 = 1;
            if (j30Var != null) {
                s70Var.f.a(j30Var);
            } else {
                org.telegram.ui.Components.j30 j30Var2 = new org.telegram.ui.Components.j30(s70Var.getParentActivity(), null, contact, true, s70Var.resourceProvider);
                r70 r70Var = s70Var.f;
                ArrayList arrayList = r70Var.c;
                s70 s70Var2 = r70Var.h;
                s70Var2.C.add(j30Var2);
                s70Var2.B.put(j30Var2.getKey(), j30Var2);
                AnimatorSet animatorSet = r70Var.a;
                if (animatorSet != null) {
                    animatorSet.setupEndValues();
                    r70Var.a.cancel();
                }
                r70Var.b = false;
                AnimatorSet animatorSet2 = new AnimatorSet();
                r70Var.a = animatorSet2;
                animatorSet2.addListener(new e50(r70Var, i11));
                r70Var.a.setInterpolator(org.telegram.ui.Components.jr.h);
                r70Var.a.setDuration(320L);
                r70Var.d = j30Var2;
                arrayList.clear();
                arrayList.add(ObjectAnimator.ofFloat(r70Var.d, (Property<org.telegram.ui.Components.j30, Float>) View.SCALE_X, 0.75f, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(r70Var.d, (Property<org.telegram.ui.Components.j30, Float>) View.SCALE_Y, 0.75f, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(r70Var.d, (Property<org.telegram.ui.Components.j30, Float>) View.ALPHA, 0.0f, 1.0f));
                r70Var.addView(j30Var2);
                j30Var2.setOnClickListener(s70Var);
            }
            s70Var.c.e(!s70Var.C.isEmpty(), true);
            if (s70Var.A || s70Var.y) {
                return;
            }
            boolean z10 = j30Var == null;
            org.telegram.ui.Components.hp hpVar = n4Var.e;
            if (hpVar != null) {
                hpVar.a(z10, true);
            }
        }
    }

    public static /* synthetic */ void V(s70 s70Var) {
        ArrayList arrayList = s70Var.C;
        try {
            StringBuilder sb2 = new StringBuilder();
            int i10 = 0;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ContactsController.Contact contact = ((org.telegram.ui.Components.j30) arrayList.get(i11)).getContact();
                if (sb2.length() != 0) {
                    sb2.append(';');
                }
                sb2.append(contact.phones.get(0));
                if (i11 == 0 && arrayList.size() == 1) {
                    i10 = contact.imported;
                }
            }
            Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:" + sb2.toString()));
            intent.putExtra("sms_body", ContactsController.getInstance(s70Var.currentAccount).getInviteText(i10));
            s70Var.getParentActivity().startActivityForResult(intent, 500);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        s70Var.finishFragment();
    }

    @Override // ah.d
    public final View M() {
        return this.fragmentView;
    }

    @Override // vd.b
    public final void N(int i10, float f9, float f10, vd.c cVar) {
        if (i10 == 3) {
            int paddingTop = this.h.getPaddingTop();
            this.d.invalidate();
            a0();
            b0();
            int paddingTop2 = this.h.getPaddingTop();
            if (paddingTop2 != paddingTop) {
                this.h.scrollBy(0, paddingTop - paddingTop2);
            }
        }
    }

    public final void Y() {
        lg.e eVar;
        if (Build.VERSION.SDK_INT < 31 || (eVar = this.H) == null) {
            return;
        }
        int dp = AndroidUtilities.dp(48.0f);
        this.L.set(0.0f, -dp, this.fragmentView.getMeasuredWidth(), this.actionBar.getMeasuredHeight() + dp + AndroidUtilities.dp(48.0f) + this.x);
        eVar.g(1, this.K);
        eVar.e(this.J, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
    }

    public final void Z() {
        org.telegram.ui.Components.u10 u10Var = this.c;
        if (u10Var != null) {
            u10Var.setTranslationY(-Math.max(this.F, this.G));
        }
    }

    public final void a0() {
        this.h.setPadding(0, AndroidUtilities.dp(4.0f) + this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(this.a) + ((int) this.b.e), 0, this.F);
        this.r.setPadding(0, 0, 0, this.F);
    }

    public final void b0() {
        this.d.setTranslationY(this.actionBar.getMeasuredHeight());
    }

    public final void c0() {
        org.telegram.ui.Cells.n4 n4Var;
        ContactsController.Contact contact;
        int childCount = this.h.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.h.getChildAt(i10);
            if ((childAt instanceof org.telegram.ui.Cells.n4) && (contact = (n4Var = (org.telegram.ui.Cells.n4) childAt).getContact()) != null) {
                boolean containsKey = this.B.containsKey(contact.key);
                org.telegram.ui.Components.hp hpVar = n4Var.e;
                if (hpVar != null) {
                    hpVar.a(containsKey, true);
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final org.telegram.ui.ActionBar.l createActionBar(Context context) {
        org.telegram.ui.ActionBar.l createActionBar = super.createActionBar(context);
        createActionBar.setAddToContainer(false);
        return createActionBar;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        this.A = false;
        this.y = false;
        this.C.clear();
        this.B.clear();
        this.D = null;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.InviteFriends));
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.Components.m51(this, 18));
        n0 n0Var = new n0(this, context, 9);
        this.fragmentView = n0Var;
        org.telegram.ui.ActionBar.w1 w1Var = new org.telegram.ui.ActionBar.w1(this, context, 3);
        this.e = w1Var;
        w1Var.setVerticalScrollBarEnabled(false);
        r70 r70Var = new r70(this, context);
        this.f = r70Var;
        this.e.addView(r70Var, i7.f6.c(108.0f, -1));
        this.d = new q70(this, context, this.e);
        org.telegram.ui.Components.p00 p00Var = new org.telegram.ui.Components.p00(context, null);
        p00Var.setViewType(6);
        p00Var.w = false;
        org.telegram.ui.Components.qw0 qw0Var = new org.telegram.ui.Components.qw0(context, p00Var, 0, null);
        this.r = qw0Var;
        qw0Var.addView(p00Var, 0);
        this.r.setAnimateLayoutChange(true);
        this.r.d.setText(LocaleController.getString(R.string.NoContacts));
        this.r.e.setText("");
        this.r.e(ContactsController.getInstance(this.currentAccount).isLoadingContacts(), true);
        int i10 = org.telegram.ui.ActionBar.g6.a7;
        n0Var.setBackgroundColor(getThemedColor(i10));
        n0Var.addView(this.r);
        this.n = new f2.j0(1, false);
        this.s = new o70(this, context);
        org.telegram.ui.Components.jl0 jl0Var = new org.telegram.ui.Components.jl0(context, null);
        this.h = jl0Var;
        jl0Var.setSections(true);
        this.h.setEmptyView(this.r);
        this.h.setAdapter(this.s);
        this.h.setLayoutManager(this.n);
        this.h.setVerticalScrollBarEnabled(true);
        this.h.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        this.h.setClipToPadding(false);
        n0Var.addView(this.h, i7.f6.d(-1, -1.0f, 119, 0.0f, -this.a, 0.0f, 0.0f));
        this.h.setOnItemClickListener(new j(this, 14));
        this.h.setOnScrollListener(new m3(this, 16));
        org.telegram.ui.ActionBar.h2 h2Var = new org.telegram.ui.ActionBar.h2(false);
        h2Var.l = 180;
        h2Var.invalidateSelf();
        org.telegram.ui.Components.u10 u10Var = new org.telegram.ui.Components.u10(context, this.resourceProvider, false);
        this.c = u10Var;
        u10Var.c.setImageDrawable(h2Var);
        this.c.e(false, false);
        this.c.setContentDescription(LocaleController.getString(R.string.Next));
        this.c.setOnClickListener(new t50(this, 4));
        this.actionBar.setBackgroundColor(getThemedColor(i10));
        org.telegram.ui.Components.jl0 jl0Var2 = this.h;
        Objects.requireNonNull(jl0Var2);
        this.J = new lg.k(jl0Var2, n0Var, new ms(jl0Var2, 0));
        this.h.C0(new l70(this, 0));
        o70 o70Var = this.s;
        if (o70Var != null && !this.A) {
            this.r.setVisibility(o70Var.h() != 2 ? 4 : 0);
        }
        n0Var.addView(this.c, org.telegram.ui.Components.u10.b());
        n0Var.addView(this.actionBar);
        n0Var.addView(this.d, i7.f6.d(-1, -2.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
        LaunchActivity launchActivity = LaunchActivity.C1;
        if (launchActivity != null) {
            launchActivity.c1.d.add(this);
        }
        return this.fragmentView;
    }

    public final void d0() {
        ArrayList arrayList = new ArrayList(ContactsController.getInstance(this.currentAccount).phoneBookContacts);
        this.w = arrayList;
        Collections.sort(arrayList, new org.telegram.ui.Components.wp0(6));
        org.telegram.ui.Components.qw0 qw0Var = this.r;
        if (qw0Var != null) {
            qw0Var.e(false, true);
        }
        o70 o70Var = this.s;
        if (o70Var != null) {
            o70Var.l();
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.Components.qw0 qw0Var;
        if (i10 == NotificationCenter.contactsImported) {
            d0();
        } else {
            if (i10 != NotificationCenter.contactsDidLoad || (qw0Var = this.r) == null) {
                return;
            }
            qw0Var.e(false, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        f fVar = new f(this, 19);
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h, 32768, null, null, null, null, org.telegram.ui.ActionBar.g6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h, 33554432, null, null, null, null, org.telegram.ui.ActionBar.g6.l7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h, 33554432, null, null, null, null, org.telegram.ui.ActionBar.g6.m7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h, 33554432, null, null, null, null, org.telegram.ui.ActionBar.g6.n7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.k0, null, null, org.telegram.ui.ActionBar.g6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h, 16, new Class[]{org.telegram.ui.Cells.d4.class}, null, null, null, org.telegram.ui.ActionBar.g6.e7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h, 0, new Class[]{org.telegram.ui.Cells.d4.class}, new String[]{"drawable"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Zh));
        int i10 = org.telegram.ui.ActionBar.g6.ai;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h, 4, new Class[]{org.telegram.ui.Cells.d4.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h, 4, new Class[]{org.telegram.ui.Cells.n4.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h, 4, new Class[]{org.telegram.ui.Cells.n4.class}, new String[]{"nameTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h, 4, new Class[]{org.telegram.ui.Cells.n4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.i7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h, 4, new Class[]{org.telegram.ui.Cells.n4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.k7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h, 262148, new Class[]{org.telegram.ui.Cells.n4.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.n6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h, 262148, new Class[]{org.telegram.ui.Cells.n4.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.y6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h, 0, new Class[]{org.telegram.ui.Cells.n4.class}, null, org.telegram.ui.ActionBar.g6.r0, null, org.telegram.ui.ActionBar.g6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.S7));
        int i11 = org.telegram.ui.ActionBar.g6.T7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f, 0, new Class[]{org.telegram.ui.Components.j30.class}, null, null, null, org.telegram.ui.ActionBar.g6.ci));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f, 0, new Class[]{org.telegram.ui.Components.j30.class}, null, null, null, org.telegram.ui.ActionBar.g6.bi));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f, 0, new Class[]{org.telegram.ui.Components.j30.class}, null, null, null, org.telegram.ui.ActionBar.g6.di));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f, 0, new Class[]{org.telegram.ui.Components.j30.class}, null, null, null, i11));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // ah.d
    public final void k(r0.m1 m1Var) {
        this.G = m1Var.a.f(8).d;
        Z();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.Components.j30 j30Var = (org.telegram.ui.Components.j30) view;
        if (j30Var.y) {
            this.D = null;
            this.f.a(j30Var);
            this.c.e(!this.C.isEmpty(), true);
            c0();
            return;
        }
        org.telegram.ui.Components.j30 j30Var2 = this.D;
        if (j30Var2 != null) {
            j30Var2.a();
        }
        this.D = j30Var;
        j30Var.b();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.contactsImported);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.contactsDidLoad);
        d0();
        if (!UserConfig.getInstance(this.currentAccount).contactsReimported) {
            ContactsController.getInstance(this.currentAccount).forceImportContacts();
            UserConfig.getInstance(this.currentAccount).contactsReimported = true;
            UserConfig.getInstance(this.currentAccount).saveConfig(false);
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.contactsImported);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.contactsDidLoad);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.F = i13;
        a0();
        Z();
    }

    @Override // ah.d
    public final /* synthetic */ void I() {
    }

    @Override // ah.d
    public final /* synthetic */ void t() {
    }

    @Override // vd.b
    public final /* synthetic */ void z(float f9, int i10) {
    }
}
