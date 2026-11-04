package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class x9 extends org.telegram.ui.ActionBar.d2 {
    public w9 a;
    public w9 b;
    public org.telegram.ui.ActionBar.q0 c;
    public org.telegram.ui.ActionBar.e6 d;

    public static void Z(x9 x9Var) {
        String str;
        TLRPC.User f10 = org.telegram.messenger.h10.i(x9Var.currentAccount).f();
        if (f10 == null || x9Var.b.getText() == null || x9Var.a.getText() == null) {
            return;
        }
        String obj = x9Var.a.getText().toString();
        String obj2 = x9Var.b.getText().toString();
        String str2 = f10.first_name;
        if (str2 == null || !str2.equals(obj) || (str = f10.last_name) == null || !str.equals(obj2)) {
            TL_account.updateProfile updateprofile = new TL_account.updateProfile();
            updateprofile.flags = 3;
            updateprofile.first_name = obj;
            f10.first_name = obj;
            updateprofile.last_name = obj2;
            f10.last_name = obj2;
            TLRPC.User a22 = org.telegram.messenger.hp.s1(x9Var.currentAccount).a2(Long.valueOf(org.telegram.messenger.h10.i(x9Var.currentAccount).e()));
            if (a22 != null) {
                a22.first_name = updateprofile.first_name;
                a22.last_name = updateprofile.last_name;
            }
            org.telegram.messenger.h10.i(x9Var.currentAccount).v(true);
            org.telegram.messenger.hs.f(x9Var.currentAccount).k(org.telegram.messenger.hs.j0, new Object[0]);
            org.telegram.messenger.hs.f(x9Var.currentAccount).k(org.telegram.messenger.hs.r, 1);
            ConnectionsManager.getInstance(x9Var.currentAccount).sendRequest(updateprofile, new ei.u5(9));
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.d6));
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.e6 e6Var = this.d;
        org.telegram.ui.ActionBar.r6.m(this.actionBar, 3, org.telegram.ui.ActionBar.k6.f8, e6Var);
        final int i3 = 1;
        org.telegram.ui.ActionBar.r6.m(this.actionBar, 1, org.telegram.ui.ActionBar.k6.v8, e6Var);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(org.telegram.messenger.bd.M0(2131751265, null));
        this.actionBar.setActionBarMenuOnItemClick(new o9(this, i3));
        this.c = this.actionBar.q().h(1, R.drawable.ic_ab_done, org.telegram.messenger.g0.L(56.0f), org.telegram.messenger.bd.M0(2131751355, null));
        TLRPC.User a22 = org.telegram.messenger.hp.s1(this.currentAccount).a2(Long.valueOf(org.telegram.messenger.h10.i(this.currentAccount).e()));
        if (a22 == null) {
            a22 = org.telegram.messenger.h10.i(this.currentAccount).f();
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.fragmentView = linearLayout;
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        ((LinearLayout) this.fragmentView).setOrientation(1);
        this.fragmentView.setOnTouchListener(new fi.a(2));
        final int i10 = 0;
        w9 w9Var = new w9(this, context, 0);
        this.a = w9Var;
        w9Var.setTextSize(1, 18.0f);
        w9 w9Var2 = this.a;
        int i11 = org.telegram.ui.ActionBar.k6.H6;
        org.telegram.ui.ActionBar.r6.E(w9Var2, i11, e6Var);
        w9 w9Var3 = this.a;
        int i12 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.V(w9Var3, i12, e6Var);
        this.a.setBackgroundDrawable(null);
        w9 w9Var4 = this.a;
        int i13 = org.telegram.ui.ActionBar.k6.k6;
        int i14 = org.telegram.ui.ActionBar.k6.l6;
        int i15 = org.telegram.ui.ActionBar.k6.p7;
        org.telegram.ui.ActionBar.r6.G(w9Var4, i13, i14, i15, e6Var);
        this.a.setMaxLines(1);
        this.a.setLines(1);
        this.a.setSingleLine(true);
        this.a.setGravity(org.telegram.messenger.bd.a0 ? 5 : 3);
        this.a.setInputType(49152);
        this.a.setImeOptions(5);
        this.a.setHint(org.telegram.messenger.bd.M0(2131750695, null));
        org.telegram.ui.ActionBar.r6.w(this.a, i12, e6Var);
        this.a.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        this.a.setCursorWidth(1.5f);
        linearLayout.addView(this.a, b8.mf.k(24.0f, 24.0f, 24.0f, 0.0f, -1, 36));
        this.a.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.v9
            public final /* synthetic */ x9 b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i16, KeyEvent keyEvent) {
                switch (i10) {
                    case 0:
                        if (i16 == 5) {
                            x9 x9Var = this.b;
                            x9Var.b.requestFocus();
                            w9 w9Var5 = x9Var.b;
                            w9Var5.setSelection(w9Var5.length());
                            break;
                        }
                        break;
                    default:
                        if (i16 == 6) {
                            this.b.c.performClick();
                            break;
                        }
                        break;
                }
                return true;
            }
        });
        w9 w9Var5 = new w9(this, context, 1);
        this.b = w9Var5;
        w9Var5.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.r6.E(this.b, i11, e6Var);
        org.telegram.ui.ActionBar.r6.V(this.b, i12, e6Var);
        this.b.setBackgroundDrawable(null);
        org.telegram.ui.ActionBar.r6.G(this.b, i13, i14, i15, e6Var);
        this.b.setMaxLines(1);
        this.b.setLines(1);
        this.b.setSingleLine(true);
        this.b.setGravity(org.telegram.messenger.bd.a0 ? 5 : 3);
        this.b.setInputType(49152);
        this.b.setImeOptions(6);
        this.b.setHint(org.telegram.messenger.bd.M0(2131749040, null));
        org.telegram.ui.ActionBar.r6.w(this.b, i12, e6Var);
        this.b.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        this.b.setCursorWidth(1.5f);
        linearLayout.addView(this.b, b8.mf.k(24.0f, 16.0f, 24.0f, 0.0f, -1, 36));
        this.b.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.v9
            public final /* synthetic */ x9 b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i16, KeyEvent keyEvent) {
                switch (i3) {
                    case 0:
                        if (i16 == 5) {
                            x9 x9Var = this.b;
                            x9Var.b.requestFocus();
                            w9 w9Var52 = x9Var.b;
                            w9Var52.setSelection(w9Var52.length());
                            break;
                        }
                        break;
                    default:
                        if (i16 == 6) {
                            this.b.c.performClick();
                            break;
                        }
                        break;
                }
                return true;
            }
        });
        if (a22 != null) {
            this.a.setText(a22.first_name);
            w9 w9Var6 = this.a;
            w9Var6.setSelection(w9Var6.length());
            this.b.setText(a22.last_name);
        }
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final org.telegram.ui.ActionBar.e6 getResourceProvider() {
        return this.d;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        w9 w9Var = this.a;
        int i3 = org.telegram.ui.ActionBar.k6.k6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(w9Var, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        w9 w9Var2 = this.a;
        int i10 = org.telegram.ui.ActionBar.k6.l6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(w9Var2, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onResume() {
        super.onResume();
        if (org.telegram.messenger.hp.e1().getBoolean("view_animations", true)) {
            return;
        }
        this.a.requestFocus();
        org.telegram.messenger.g0.K3(this.a);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            org.telegram.messenger.g0.i3(new xp0(this, 18), 100L);
        }
    }
}
