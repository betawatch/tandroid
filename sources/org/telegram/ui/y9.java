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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class y9 extends org.telegram.ui.ActionBar.f2 {
    public x9 a;
    public x9 b;
    public org.telegram.ui.ActionBar.r0 c;
    public org.telegram.ui.ActionBar.h6 d;

    public static void Z(y9 y9Var) {
        String str;
        TLRPC.User f10 = org.telegram.messenger.p10.i(y9Var.currentAccount).f();
        if (f10 == null || y9Var.b.getText() == null || y9Var.a.getText() == null) {
            return;
        }
        String obj = y9Var.a.getText().toString();
        String obj2 = y9Var.b.getText().toString();
        String str2 = f10.first_name;
        if (str2 == null || !str2.equals(obj) || (str = f10.last_name) == null || !str.equals(obj2)) {
            TL_account.updateProfile updateprofile = new TL_account.updateProfile();
            updateprofile.flags = 3;
            updateprofile.first_name = obj;
            f10.first_name = obj;
            updateprofile.last_name = obj2;
            f10.last_name = obj2;
            TLRPC.User a22 = org.telegram.messenger.qp.s1(y9Var.currentAccount).a2(Long.valueOf(org.telegram.messenger.p10.i(y9Var.currentAccount).e()));
            if (a22 != null) {
                a22.first_name = updateprofile.first_name;
                a22.last_name = updateprofile.last_name;
            }
            org.telegram.messenger.p10.i(y9Var.currentAccount).v(true);
            org.telegram.messenger.qs.f(y9Var.currentAccount).k(org.telegram.messenger.qs.j0, new Object[0]);
            org.telegram.messenger.qs.f(y9Var.currentAccount).k(org.telegram.messenger.qs.r, 1);
            ConnectionsManager.getInstance(y9Var.currentAccount).sendRequest(updateprofile, new di.v5(9));
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.d6));
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.h6 h6Var = this.d;
        org.telegram.ui.ActionBar.t6.l(this.actionBar, 3, org.telegram.ui.ActionBar.m6.f8, h6Var);
        final int i7 = 1;
        org.telegram.ui.ActionBar.t6.l(this.actionBar, 1, org.telegram.ui.ActionBar.m6.v8, h6Var);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(org.telegram.messenger.id.M0(2131751264, null));
        final int i10 = 0;
        this.actionBar.setActionBarMenuOnItemClick(new w9(this, i10));
        this.c = this.actionBar.s().h(1, R.drawable.ic_ab_done, org.telegram.messenger.g0.L(56.0f), org.telegram.messenger.id.M0(2131751354, null));
        TLRPC.User a22 = org.telegram.messenger.qp.s1(this.currentAccount).a2(Long.valueOf(org.telegram.messenger.p10.i(this.currentAccount).e()));
        if (a22 == null) {
            a22 = org.telegram.messenger.p10.i(this.currentAccount).f();
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.fragmentView = linearLayout;
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        ((LinearLayout) this.fragmentView).setOrientation(1);
        this.fragmentView.setOnTouchListener(new ei.b(2));
        x9 x9Var = new x9(this, context, 0);
        this.a = x9Var;
        x9Var.setTextSize(1, 18.0f);
        x9 x9Var2 = this.a;
        int i11 = org.telegram.ui.ActionBar.m6.H6;
        org.telegram.ui.ActionBar.t6.D(x9Var2, i11, h6Var);
        x9 x9Var3 = this.a;
        int i12 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.t6.U(x9Var3, i12, h6Var);
        this.a.setBackgroundDrawable(null);
        x9 x9Var4 = this.a;
        int i13 = org.telegram.ui.ActionBar.m6.k6;
        int i14 = org.telegram.ui.ActionBar.m6.l6;
        int i15 = org.telegram.ui.ActionBar.m6.p7;
        org.telegram.ui.ActionBar.t6.F(x9Var4, i13, i14, i15, h6Var);
        this.a.setMaxLines(1);
        this.a.setLines(1);
        this.a.setSingleLine(true);
        this.a.setGravity(org.telegram.messenger.id.a0 ? 5 : 3);
        this.a.setInputType(49152);
        this.a.setImeOptions(5);
        this.a.setHint(org.telegram.messenger.id.M0(2131750694, null));
        org.telegram.ui.ActionBar.t6.v(this.a, i12, h6Var);
        this.a.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        this.a.setCursorWidth(1.5f);
        linearLayout.addView(this.a, c8.ha.k(24.0f, 24.0f, 24.0f, 0.0f, -1, 36));
        this.a.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.v9
            public final /* synthetic */ y9 b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i16, KeyEvent keyEvent) {
                switch (i10) {
                    case 0:
                        if (i16 == 5) {
                            y9 y9Var = this.b;
                            y9Var.b.requestFocus();
                            x9 x9Var5 = y9Var.b;
                            x9Var5.setSelection(x9Var5.length());
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
        x9 x9Var5 = new x9(this, context, 1);
        this.b = x9Var5;
        x9Var5.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.t6.D(this.b, i11, h6Var);
        org.telegram.ui.ActionBar.t6.U(this.b, i12, h6Var);
        this.b.setBackgroundDrawable(null);
        org.telegram.ui.ActionBar.t6.F(this.b, i13, i14, i15, h6Var);
        this.b.setMaxLines(1);
        this.b.setLines(1);
        this.b.setSingleLine(true);
        this.b.setGravity(org.telegram.messenger.id.a0 ? 5 : 3);
        this.b.setInputType(49152);
        this.b.setImeOptions(6);
        this.b.setHint(org.telegram.messenger.id.M0(2131749032, null));
        org.telegram.ui.ActionBar.t6.v(this.b, i12, h6Var);
        this.b.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        this.b.setCursorWidth(1.5f);
        linearLayout.addView(this.b, c8.ha.k(24.0f, 16.0f, 24.0f, 0.0f, -1, 36));
        this.b.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.v9
            public final /* synthetic */ y9 b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i16, KeyEvent keyEvent) {
                switch (i7) {
                    case 0:
                        if (i16 == 5) {
                            y9 y9Var = this.b;
                            y9Var.b.requestFocus();
                            x9 x9Var52 = y9Var.b;
                            x9Var52.setSelection(x9Var52.length());
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
            x9 x9Var6 = this.a;
            x9Var6.setSelection(x9Var6.length());
            this.b.setText(a22.last_name);
        }
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final org.telegram.ui.ActionBar.h6 getResourceProvider() {
        return this.d;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        x9 x9Var = this.a;
        int i7 = org.telegram.ui.ActionBar.m6.k6;
        arrayList.add(new org.telegram.ui.ActionBar.v6(x9Var, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        x9 x9Var2 = this.a;
        int i10 = org.telegram.ui.ActionBar.m6.l6;
        arrayList.add(new org.telegram.ui.ActionBar.v6(x9Var2, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.b, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.b, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i10));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onResume() {
        super.onResume();
        if (org.telegram.messenger.qp.e1().getBoolean("view_animations", true)) {
            return;
        }
        this.a.requestFocus();
        org.telegram.messenger.g0.K3(this.a);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onTransitionAnimationEnd(boolean z9, boolean z10) {
        if (z9) {
            org.telegram.messenger.g0.i3(new jq0(this, 18), 100L);
        }
    }
}
