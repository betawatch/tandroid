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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class z9 extends org.telegram.ui.ActionBar.k2 {
    public y9 a;
    public y9 b;
    public org.telegram.ui.ActionBar.t0 c;
    public org.telegram.ui.ActionBar.p6 d;

    public static void Y(z9 z9Var) {
        String str;
        TLRPC.User f7 = org.telegram.messenger.d20.i(z9Var.currentAccount).f();
        if (f7 == null || z9Var.b.getText() == null || z9Var.a.getText() == null) {
            return;
        }
        String obj = z9Var.a.getText().toString();
        String obj2 = z9Var.b.getText().toString();
        String str2 = f7.first_name;
        if (str2 == null || !str2.equals(obj) || (str = f7.last_name) == null || !str.equals(obj2)) {
            TL_account.updateProfile updateprofile = new TL_account.updateProfile();
            updateprofile.flags = 3;
            updateprofile.first_name = obj;
            f7.first_name = obj;
            updateprofile.last_name = obj2;
            f7.last_name = obj2;
            TLRPC.User Z1 = org.telegram.messenger.vp.r1(z9Var.currentAccount).Z1(Long.valueOf(org.telegram.messenger.d20.i(z9Var.currentAccount).e()));
            if (Z1 != null) {
                Z1.first_name = updateprofile.first_name;
                Z1.last_name = updateprofile.last_name;
            }
            org.telegram.messenger.d20.i(z9Var.currentAccount).v(true);
            org.telegram.messenger.zs.f(z9Var.currentAccount).k(org.telegram.messenger.zs.j0, new Object[0]);
            org.telegram.messenger.zs.f(z9Var.currentAccount).k(org.telegram.messenger.zs.r, 1);
            ConnectionsManager.getInstance(z9Var.currentAccount).sendRequest(updateprofile, new ag.c3(4));
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.d6));
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.p6 p6Var = this.d;
        org.telegram.ui.ActionBar.a7.m(this.actionBar, 3, org.telegram.ui.ActionBar.t6.f8, p6Var);
        final int i10 = 1;
        org.telegram.ui.ActionBar.a7.m(this.actionBar, 1, org.telegram.ui.ActionBar.t6.v8, p6Var);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(org.telegram.messenger.cd.L0(2131751265, null));
        this.actionBar.setActionBarMenuOnItemClick(new ag.e(this, 20));
        this.c = this.actionBar.p().h(1, R.drawable.ic_ab_done, org.telegram.messenger.cd.L0(2131751355, null), org.telegram.messenger.i0.L(56.0f));
        TLRPC.User Z1 = org.telegram.messenger.vp.r1(this.currentAccount).Z1(Long.valueOf(org.telegram.messenger.d20.i(this.currentAccount).e()));
        if (Z1 == null) {
            Z1 = org.telegram.messenger.d20.i(this.currentAccount).f();
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.fragmentView = linearLayout;
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        ((LinearLayout) this.fragmentView).setOrientation(1);
        this.fragmentView.setOnTouchListener(new org.telegram.ui.ActionBar.n2(1));
        final int i11 = 0;
        y9 y9Var = new y9(this, context, 0);
        this.a = y9Var;
        y9Var.setTextSize(1, 18.0f);
        y9 y9Var2 = this.a;
        int i12 = org.telegram.ui.ActionBar.t6.H6;
        org.telegram.ui.ActionBar.a7.E(y9Var2, i12, p6Var);
        y9 y9Var3 = this.a;
        int i13 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.a7.V(y9Var3, i13, p6Var);
        this.a.setBackgroundDrawable(null);
        y9 y9Var4 = this.a;
        int i14 = org.telegram.ui.ActionBar.t6.k6;
        int i15 = org.telegram.ui.ActionBar.t6.l6;
        int i16 = org.telegram.ui.ActionBar.t6.p7;
        org.telegram.ui.ActionBar.a7.G(y9Var4, i14, i15, i16, p6Var);
        this.a.setMaxLines(1);
        this.a.setLines(1);
        this.a.setSingleLine(true);
        this.a.setGravity(org.telegram.messenger.cd.X ? 5 : 3);
        this.a.setInputType(49152);
        this.a.setImeOptions(5);
        this.a.setHint(org.telegram.messenger.cd.L0(2131750695, null));
        org.telegram.ui.ActionBar.a7.w(this.a, i13, p6Var);
        this.a.setCursorSize(org.telegram.messenger.i0.L(20.0f));
        this.a.setCursorWidth(1.5f);
        linearLayout.addView(this.a, w7.b6.k(24.0f, 24.0f, 24.0f, 0.0f, -1, 36));
        this.a.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.x9
            public final /* synthetic */ z9 b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i17, KeyEvent keyEvent) {
                switch (i11) {
                    case 0:
                        if (i17 == 5) {
                            z9 z9Var = this.b;
                            z9Var.b.requestFocus();
                            y9 y9Var5 = z9Var.b;
                            y9Var5.setSelection(y9Var5.length());
                            break;
                        }
                        break;
                    default:
                        if (i17 == 6) {
                            this.b.c.performClick();
                            break;
                        }
                        break;
                }
                return true;
            }
        });
        y9 y9Var5 = new y9(this, context, 1);
        this.b = y9Var5;
        y9Var5.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.a7.E(this.b, i12, p6Var);
        org.telegram.ui.ActionBar.a7.V(this.b, i13, p6Var);
        this.b.setBackgroundDrawable(null);
        org.telegram.ui.ActionBar.a7.G(this.b, i14, i15, i16, p6Var);
        this.b.setMaxLines(1);
        this.b.setLines(1);
        this.b.setSingleLine(true);
        this.b.setGravity(org.telegram.messenger.cd.X ? 5 : 3);
        this.b.setInputType(49152);
        this.b.setImeOptions(6);
        this.b.setHint(org.telegram.messenger.cd.L0(2131749042, null));
        org.telegram.ui.ActionBar.a7.w(this.b, i13, p6Var);
        this.b.setCursorSize(org.telegram.messenger.i0.L(20.0f));
        this.b.setCursorWidth(1.5f);
        linearLayout.addView(this.b, w7.b6.k(24.0f, 16.0f, 24.0f, 0.0f, -1, 36));
        this.b.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.x9
            public final /* synthetic */ z9 b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i17, KeyEvent keyEvent) {
                switch (i10) {
                    case 0:
                        if (i17 == 5) {
                            z9 z9Var = this.b;
                            z9Var.b.requestFocus();
                            y9 y9Var52 = z9Var.b;
                            y9Var52.setSelection(y9Var52.length());
                            break;
                        }
                        break;
                    default:
                        if (i17 == 6) {
                            this.b.c.performClick();
                            break;
                        }
                        break;
                }
                return true;
            }
        });
        if (Z1 != null) {
            this.a.setText(Z1.first_name);
            y9 y9Var6 = this.a;
            y9Var6.setSelection(y9Var6.length());
            this.b.setText(Z1.last_name);
        }
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final org.telegram.ui.ActionBar.p6 getResourceProvider() {
        return this.d;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        y9 y9Var = this.a;
        int i10 = org.telegram.ui.ActionBar.t6.k6;
        arrayList.add(new org.telegram.ui.ActionBar.c7(y9Var, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        y9 y9Var2 = this.a;
        int i11 = org.telegram.ui.ActionBar.t6.l6;
        arrayList.add(new org.telegram.ui.ActionBar.c7(y9Var2, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.b, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.b, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i11));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onResume() {
        super.onResume();
        if (org.telegram.messenger.vp.d1().getBoolean("view_animations", true)) {
            return;
        }
        this.a.requestFocus();
        org.telegram.messenger.i0.J3(this.a);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            org.telegram.messenger.i0.h3(new rr0(this, 18), 100L);
        }
    }
}
