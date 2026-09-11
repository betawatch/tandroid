package org.telegram.ui;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class z9 extends org.telegram.ui.ActionBar.n2 {
    public y9 a;
    public y9 b;
    public org.telegram.ui.ActionBar.v0 c;
    public org.telegram.ui.ActionBar.f6 d;

    public static void U(z9 z9Var) {
        String str;
        TLRPC.User currentUser = UserConfig.getInstance(z9Var.currentAccount).getCurrentUser();
        if (currentUser == null || z9Var.b.getText() == null || z9Var.a.getText() == null) {
            return;
        }
        String obj = z9Var.a.getText().toString();
        String obj2 = z9Var.b.getText().toString();
        String str2 = currentUser.first_name;
        if (str2 == null || !str2.equals(obj) || (str = currentUser.last_name) == null || !str.equals(obj2)) {
            TL_account.updateProfile updateprofile = new TL_account.updateProfile();
            updateprofile.flags = 3;
            updateprofile.first_name = obj;
            currentUser.first_name = obj;
            updateprofile.last_name = obj2;
            currentUser.last_name = obj2;
            TLRPC.User user = MessagesController.getInstance(z9Var.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(z9Var.currentAccount).getClientUserId()));
            if (user != null) {
                user.first_name = updateprofile.first_name;
                user.last_name = updateprofile.last_name;
            }
            UserConfig.getInstance(z9Var.currentAccount).saveConfig(true);
            NotificationCenter.getInstance(z9Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
            NotificationCenter.getInstance(z9Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_NAME));
            ConnectionsManager.getInstance(z9Var.currentAccount).sendRequest(updateprofile, new bi.c7(8));
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.j6.f8;
        org.telegram.ui.ActionBar.f6 f6Var = this.d;
        kVar.B(org.telegram.ui.ActionBar.j6.v0(i10, f6Var), false);
        this.actionBar.C(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.v8, f6Var), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.EditName));
        this.actionBar.setActionBarMenuOnItemClick(new ah.t(this, 27));
        this.c = this.actionBar.n().h(1, R.drawable.ic_ab_done, LocaleController.getString(R.string.Done), AndroidUtilities.dp(56.0f));
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(this.currentAccount).getClientUserId()));
        if (user == null) {
            user = UserConfig.getInstance(this.currentAccount).getCurrentUser();
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.fragmentView = linearLayout;
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        ((LinearLayout) this.fragmentView).setOrientation(1);
        this.fragmentView.setOnTouchListener(new ci.d(2));
        y9 y9Var = new y9(this, context, 0);
        this.a = y9Var;
        y9Var.setTextSize(1, 18.0f);
        y9 y9Var2 = this.a;
        int i11 = org.telegram.ui.ActionBar.j6.H6;
        y9Var2.setHintTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        y9 y9Var3 = this.a;
        int i12 = org.telegram.ui.ActionBar.j6.G6;
        y9Var3.setTextColor(org.telegram.ui.ActionBar.j6.v0(i12, f6Var));
        this.a.setBackgroundDrawable(null);
        y9 y9Var4 = this.a;
        int i13 = org.telegram.ui.ActionBar.j6.k6;
        int themedColor = getThemedColor(i13);
        int i14 = org.telegram.ui.ActionBar.j6.l6;
        int themedColor2 = getThemedColor(i14);
        int i15 = org.telegram.ui.ActionBar.j6.p7;
        y9Var4.setLineColors(themedColor, themedColor2, getThemedColor(i15));
        this.a.setMaxLines(1);
        this.a.setLines(1);
        this.a.setSingleLine(true);
        this.a.setGravity(LocaleController.isRTL ? 5 : 3);
        this.a.setInputType(49152);
        this.a.setImeOptions(5);
        this.a.setHint(LocaleController.getString(R.string.FirstName));
        this.a.setCursorColor(org.telegram.ui.ActionBar.j6.v0(i12, f6Var));
        this.a.setCursorSize(AndroidUtilities.dp(20.0f));
        this.a.setCursorWidth(1.5f);
        linearLayout.addView(this.a, w7.x5.k(24.0f, 24.0f, 24.0f, 0.0f, -1, 36));
        final int i16 = 0;
        this.a.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.x9
            public final /* synthetic */ z9 b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i17, KeyEvent keyEvent) {
                switch (i16) {
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
        this.b.setHintTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        this.b.setTextColor(org.telegram.ui.ActionBar.j6.v0(i12, f6Var));
        this.b.setBackgroundDrawable(null);
        this.b.setLineColors(getThemedColor(i13), getThemedColor(i14), getThemedColor(i15));
        this.b.setMaxLines(1);
        this.b.setLines(1);
        this.b.setSingleLine(true);
        this.b.setGravity(LocaleController.isRTL ? 5 : 3);
        this.b.setInputType(49152);
        this.b.setImeOptions(6);
        this.b.setHint(LocaleController.getString(R.string.LastName));
        this.b.setCursorColor(org.telegram.ui.ActionBar.j6.v0(i12, f6Var));
        this.b.setCursorSize(AndroidUtilities.dp(20.0f));
        this.b.setCursorWidth(1.5f);
        linearLayout.addView(this.b, w7.x5.k(24.0f, 16.0f, 24.0f, 0.0f, -1, 36));
        final int i17 = 1;
        this.b.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.x9
            public final /* synthetic */ z9 b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i172, KeyEvent keyEvent) {
                switch (i17) {
                    case 0:
                        if (i172 == 5) {
                            z9 z9Var = this.b;
                            z9Var.b.requestFocus();
                            y9 y9Var52 = z9Var.b;
                            y9Var52.setSelection(y9Var52.length());
                            break;
                        }
                        break;
                    default:
                        if (i172 == 6) {
                            this.b.c.performClick();
                            break;
                        }
                        break;
                }
                return true;
            }
        });
        if (user != null) {
            this.a.setText(user.first_name);
            y9 y9Var6 = this.a;
            y9Var6.setSelection(y9Var6.length());
            this.b.setText(user.last_name);
        }
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final org.telegram.ui.ActionBar.f6 getResourceProvider() {
        return this.d;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.t8));
        y9 y9Var = this.a;
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(y9Var, 4, null, null, null, null, i10));
        y9 y9Var2 = this.a;
        int i11 = org.telegram.ui.ActionBar.j6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(y9Var2, TLObject.FLAG_23, null, null, null, null, i11));
        y9 y9Var3 = this.a;
        int i12 = org.telegram.ui.ActionBar.j6.k6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(y9Var3, 32, null, null, null, null, i12));
        y9 y9Var4 = this.a;
        int i13 = org.telegram.ui.ActionBar.j6.l6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(y9Var4, 65568, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, TLObject.FLAG_23, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 32, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 65568, null, null, null, null, i13));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onResume() {
        super.onResume();
        if (MessagesController.getGlobalMainSettings().getBoolean("view_animations", true)) {
            return;
        }
        this.a.requestFocus();
        AndroidUtilities.showKeyboard(this.a);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            AndroidUtilities.runOnUIThread(new lu0(this, 18), 100L);
        }
    }
}
