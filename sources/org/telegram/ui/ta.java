package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ta extends org.telegram.ui.ActionBar.r2 {
    public static final Paint H = new Paint(1);
    public static final Paint I = new Paint(1);
    public static final Paint J = new Paint(1);
    public qa E;
    public sa F;
    public org.telegram.ui.Cells.w1 G;
    public org.telegram.ui.ActionBar.u5 a;
    public org.telegram.ui.Components.mm0 b;
    public ka c;
    public boolean d;
    public int e;
    public String f;
    public org.telegram.messenger.voip.m0 h;
    public boolean n;
    public String r;
    public final ArrayList s;
    public final ArrayList v;
    public final ArrayList w;
    public final long x;
    public na y;

    public ta(Bundle bundle) {
        super(bundle);
        this.r = "";
        this.s = new ArrayList();
        this.v = new ArrayList();
        this.w = new ArrayList();
        if (bundle != null) {
            this.x = bundle.getLong("bot_id");
        }
    }

    public static /* synthetic */ void V(ta taVar, org.telegram.ui.ActionBar.e2 e2Var, TLRPC.TL_error tL_error, TL_account.updateUsername updateusername) {
        try {
            e2Var.dismiss();
        } catch (Exception e) {
            FileLog.e(e);
        }
        org.telegram.ui.Components.g5.e0(taVar.currentAccount, tL_error, taVar, updateusername, new Object[0]);
        taVar.i0();
    }

    public static /* synthetic */ void X(ta taVar, String str) {
        TL_account.checkUsername checkusername = new TL_account.checkUsername();
        checkusername.username = str;
        taVar.e = ConnectionsManager.getInstance(taVar.currentAccount).sendRequest(checkusername, new ea(taVar, str, checkusername, 0), 2);
    }

    public static /* synthetic */ void Y(ta taVar, org.telegram.ui.ActionBar.e2 e2Var, TLRPC.User user) {
        try {
            e2Var.dismiss();
        } catch (Exception e) {
            FileLog.e(e);
        }
        ArrayList<TLRPC.User> arrayList = new ArrayList<>();
        arrayList.add(user);
        MessagesController.getInstance(taVar.currentAccount).putUsers(arrayList, false);
        MessagesStorage.getInstance(taVar.currentAccount).putUsersAndChats(arrayList, null, false, true);
        UserConfig.getInstance(taVar.currentAccount).saveConfig(true);
        taVar.finishFragment();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void Z(ta taVar) {
        TL_bots.reorderUsernames reorderusernames;
        long j10 = taVar.x;
        ArrayList arrayList = taVar.v;
        ArrayList arrayList2 = taVar.s;
        if (taVar.d) {
            taVar.d = false;
            ArrayList<String> arrayList3 = new ArrayList<>();
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                if (((TLRPC.TL_username) arrayList2.get(i10)).active) {
                    arrayList3.add(((TLRPC.TL_username) arrayList2.get(i10)).username);
                }
            }
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (((TLRPC.TL_username) arrayList.get(i11)).active) {
                    arrayList3.add(((TLRPC.TL_username) arrayList.get(i11)).username);
                }
            }
            if (j10 == 0) {
                TL_account.reorderUsernames reorderusernames2 = new TL_account.reorderUsernames();
                reorderusernames2.order = arrayList3;
                reorderusernames = reorderusernames2;
            } else {
                TL_bots.reorderUsernames reorderusernames3 = new TL_bots.reorderUsernames();
                reorderusernames3.bot = MessagesController.getInstance(taVar.currentAccount).getInputUser(j10);
                reorderusernames3.order = arrayList3;
                reorderusernames = reorderusernames3;
            }
            taVar.getConnectionsManager().sendRequest(reorderusernames, new di.d6(9));
            ArrayList<TLRPC.TL_username> arrayList4 = new ArrayList<>();
            arrayList4.addAll(arrayList2);
            arrayList4.addAll(arrayList);
            TLRPC.User user = MessagesController.getInstance(taVar.currentAccount).getUser(Long.valueOf(taVar.h0()));
            user.usernames = arrayList4;
            MessagesController.getInstance(taVar.currentAccount).putUser(user, false, true);
        }
    }

    public static void a0(ta taVar) {
        if (taVar.x != 0) {
            taVar.finishFragment();
            return;
        }
        int i10 = 1;
        if (taVar.r.startsWith("@")) {
            taVar.r = taVar.r.substring(1);
        }
        if (!taVar.r.isEmpty() && !taVar.e0(taVar.r)) {
            taVar.i0();
            return;
        }
        TLRPC.User g02 = taVar.g0();
        if (taVar.getParentActivity() == null || g02 == null) {
            return;
        }
        String publicUsername = UserObject.getPublicUsername(g02);
        if (publicUsername == null) {
            publicUsername = "";
        }
        if (publicUsername.equals(taVar.r)) {
            taVar.finishFragment();
            return;
        }
        org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(taVar.getParentActivity(), 3, null);
        TL_account.updateUsername updateusername = new TL_account.updateUsername();
        updateusername.username = taVar.r;
        NotificationCenter.getInstance(taVar.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_NAME));
        int sendRequest = ConnectionsManager.getInstance(taVar.currentAccount).sendRequest(updateusername, new ea(taVar, e2Var, updateusername, i10), 2);
        ConnectionsManager.getInstance(taVar.currentAccount).bindRequestToGuid(sendRequest, taVar.classGuid);
        e2Var.setOnCancelListener(new bi.f0(taVar, sendRequest, i10));
        e2Var.show();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.d6));
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final View createView(Context context) {
        String str;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(LocaleController.getString(R.string.Username));
        this.simpleActionBar.setActionBarMenuOnItemClick(new ga(this, 0));
        this.a = this.simpleActionBar.i(LocaleController.getString(R.string.Save));
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(h0()));
        if (user == null) {
            user = g0();
        }
        if (user != null) {
            this.r = null;
            if (user.usernames != null) {
                int i10 = 0;
                while (true) {
                    if (i10 >= user.usernames.size()) {
                        break;
                    }
                    TLRPC.TL_username tL_username = user.usernames.get(i10);
                    if (tL_username != null && tL_username.editable) {
                        this.r = tL_username.username;
                        break;
                    }
                    i10++;
                }
            }
            if (this.r == null && (str = user.username) != null) {
                this.r = str;
            }
            if (this.r == null) {
                this.r = "";
            }
            this.s.clear();
            ArrayList arrayList = this.v;
            arrayList.clear();
            for (int i11 = 0; i11 < user.usernames.size(); i11++) {
                if (user.usernames.get(i11).active) {
                    arrayList.add(user.usernames.get(i11));
                }
            }
            for (int i12 = 0; i12 < user.usernames.size(); i12++) {
                if (!user.usernames.get(i12).active) {
                    arrayList.add(user.usernames.get(i12));
                }
            }
        }
        this.fragmentView = new FrameLayout(context);
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(context, null);
        this.b = mm0Var;
        mm0Var.u1();
        this.b.setLayoutManager(new s4.c0());
        org.telegram.ui.Components.mm0 mm0Var2 = this.b;
        ka kaVar = new ka(this);
        this.c = kaVar;
        mm0Var2.setAdapter(kaVar);
        org.telegram.ui.ActionBar.f7.K(this.b, org.telegram.ui.ActionBar.y6.i6, getResourceProvider());
        this.b.setSectionsDrawBackground(true);
        new s4.z(new oa(this)).h(this.b);
        ((FrameLayout) this.fragmentView).addView(this.b, org.telegram.ui.Components.gb1.g(-1.0f, -1));
        this.fragmentView.setOnTouchListener(new ei.d(6));
        this.b.setOnItemClickListener(new ia(this));
        AndroidUtilities.runOnUIThread(new zt0(this, 19), 40L);
        return this.fragmentView;
    }

    public final boolean e0(String str) {
        if (str != null && str.startsWith("@")) {
            str = str.substring(1);
        }
        org.telegram.ui.Cells.w1 w1Var = this.G;
        if (w1Var != null) {
            w1Var.setVisibility(!TextUtils.isEmpty(str) ? 0 : 8);
            sa saVar = this.F;
            if (saVar != null) {
                sa.a(saVar);
            }
        }
        org.telegram.messenger.voip.m0 m0Var = this.h;
        if (m0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(m0Var);
            this.h = null;
            this.f = null;
            if (this.e != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.e, true);
            }
        }
        if (str != null) {
            if (str.startsWith("_") || str.endsWith("_")) {
                org.telegram.ui.Cells.w1 w1Var2 = this.G;
                if (w1Var2 != null) {
                    w1Var2.setText(LocaleController.getString(R.string.UsernameInvalid));
                    org.telegram.ui.Cells.w1 w1Var3 = this.G;
                    int i10 = org.telegram.ui.ActionBar.y6.p7;
                    w1Var3.setTag(Integer.valueOf(i10));
                    org.telegram.ui.ActionBar.f7.V(this.G, i10, null);
                    sa saVar2 = this.F;
                    if (saVar2 != null) {
                        sa.a(saVar2);
                        return false;
                    }
                }
            } else {
                for (int i11 = 0; i11 < str.length(); i11++) {
                    char charAt = str.charAt(i11);
                    if (i11 == 0 && charAt >= '0' && charAt <= '9') {
                        org.telegram.ui.Cells.w1 w1Var4 = this.G;
                        if (w1Var4 != null) {
                            w1Var4.setText(LocaleController.getString(R.string.UsernameInvalidStartNumber));
                            org.telegram.ui.Cells.w1 w1Var5 = this.G;
                            int i12 = org.telegram.ui.ActionBar.y6.p7;
                            w1Var5.setTag(Integer.valueOf(i12));
                            org.telegram.ui.ActionBar.f7.V(this.G, i12, null);
                            sa saVar3 = this.F;
                            if (saVar3 != null) {
                                sa.a(saVar3);
                                return false;
                            }
                        }
                    } else if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        org.telegram.ui.Cells.w1 w1Var6 = this.G;
                        if (w1Var6 != null) {
                            w1Var6.setText(LocaleController.getString(R.string.UsernameInvalid));
                            org.telegram.ui.Cells.w1 w1Var7 = this.G;
                            int i13 = org.telegram.ui.ActionBar.y6.p7;
                            w1Var7.setTag(Integer.valueOf(i13));
                            org.telegram.ui.ActionBar.f7.V(this.G, i13, null);
                            sa saVar4 = this.F;
                            if (saVar4 != null) {
                                sa.a(saVar4);
                                return false;
                            }
                        }
                    }
                }
            }
            return false;
        }
        if (str == null || str.length() < 4) {
            org.telegram.ui.Cells.w1 w1Var8 = this.G;
            if (w1Var8 != null) {
                w1Var8.setText(LocaleController.getString(R.string.UsernameInvalidShort));
                org.telegram.ui.Cells.w1 w1Var9 = this.G;
                int i14 = org.telegram.ui.ActionBar.y6.p7;
                w1Var9.setTag(Integer.valueOf(i14));
                org.telegram.ui.ActionBar.f7.V(this.G, i14, null);
                sa saVar5 = this.F;
                if (saVar5 != null) {
                    sa.a(saVar5);
                }
            }
        } else {
            if (str.length() <= 32) {
                String str2 = g0().username;
                if (str2 == null) {
                    str2 = "";
                }
                if (str.equals(str2)) {
                    org.telegram.ui.Cells.w1 w1Var10 = this.G;
                    if (w1Var10 != null) {
                        w1Var10.setText(LocaleController.formatString("UsernameAvailable", R.string.UsernameAvailable, str));
                        org.telegram.ui.Cells.w1 w1Var11 = this.G;
                        int i15 = org.telegram.ui.ActionBar.y6.w6;
                        w1Var11.setTag(Integer.valueOf(i15));
                        org.telegram.ui.ActionBar.f7.V(this.G, i15, null);
                        sa saVar6 = this.F;
                        if (saVar6 != null) {
                            sa.a(saVar6);
                        }
                    }
                    return true;
                }
                org.telegram.ui.Cells.w1 w1Var12 = this.G;
                if (w1Var12 != null) {
                    w1Var12.setText(LocaleController.getString(R.string.UsernameChecking));
                    org.telegram.ui.Cells.w1 w1Var13 = this.G;
                    int i16 = org.telegram.ui.ActionBar.y6.F6;
                    w1Var13.setTag(Integer.valueOf(i16));
                    org.telegram.ui.ActionBar.f7.V(this.G, i16, null);
                    sa saVar7 = this.F;
                    if (saVar7 != null) {
                        sa.a(saVar7);
                    }
                }
                this.f = str;
                org.telegram.messenger.voip.m0 m0Var2 = new org.telegram.messenger.voip.m0(22, this, str);
                this.h = m0Var2;
                AndroidUtilities.runOnUIThread(m0Var2, 300L);
                return true;
            }
            org.telegram.ui.Cells.w1 w1Var14 = this.G;
            if (w1Var14 != null) {
                w1Var14.setText(LocaleController.getString(R.string.UsernameInvalidLong));
                org.telegram.ui.Cells.w1 w1Var15 = this.G;
                int i17 = org.telegram.ui.ActionBar.y6.p7;
                w1Var15.setTag(Integer.valueOf(i17));
                org.telegram.ui.ActionBar.f7.V(this.G, i17, null);
                sa saVar8 = this.F;
                if (saVar8 != null) {
                    sa.a(saVar8);
                    return false;
                }
            }
        }
        return false;
    }

    public final void f0(boolean z10) {
        na naVar = this.y;
        if (naVar != null) {
            if (!naVar.a.isFocused()) {
                EditTextBoldCursor editTextBoldCursor = this.y.a;
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
            }
            this.y.a.requestFocus();
            if (z10) {
                AndroidUtilities.showKeyboard(this.y.a);
            }
        }
    }

    public final TLRPC.User g0() {
        long j10 = this.x;
        return j10 != 0 ? MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j10)) : UserConfig.getInstance(this.currentAccount).getCurrentUser();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final org.telegram.ui.Components.mm0 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final ArrayList getThemeDescriptions() {
        return new ArrayList();
    }

    public final long h0() {
        long j10 = this.x;
        return j10 != 0 ? j10 : UserConfig.getInstance(this.currentAccount).getClientUserId();
    }

    public final void i0() {
        if (this.b == null) {
            return;
        }
        for (int i10 = 0; i10 < this.b.getChildCount(); i10++) {
            View childAt = this.b.getChildAt(i10);
            if ((childAt instanceof org.telegram.ui.Cells.q4) && i10 == 0) {
                AndroidUtilities.shakeViewSpring(((org.telegram.ui.Cells.q4) childAt).getTextView());
            } else if (childAt instanceof sa) {
                AndroidUtilities.shakeViewSpring(childAt);
            } else if (childAt instanceof na) {
                na naVar = (na) childAt;
                AndroidUtilities.shakeViewSpring(naVar.a);
                AndroidUtilities.shakeViewSpring(naVar.b);
            }
        }
        BotWebViewVibrationEffect.APP_ERROR.vibrate();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j0(int i10, boolean z10, boolean z11) {
        TLRPC.TL_username tL_username;
        int min;
        int i11 = i10 - 4;
        if (i11 >= 0) {
            ArrayList arrayList = this.v;
            if (i11 < arrayList.size() && (tL_username = (TLRPC.TL_username) arrayList.get(i11)) != null) {
                tL_username.active = z10;
                int i12 = -1;
                if (!z10) {
                    int i13 = -1;
                    for (int i14 = 0; i14 < arrayList.size(); i14++) {
                        if (((TLRPC.TL_username) arrayList.get(i14)).active) {
                            i13 = i14;
                        }
                    }
                    if (i13 >= 0) {
                        min = Math.min(arrayList.size() - 1, i13 + 1);
                        i12 = min + 4;
                    }
                    if (this.b != null) {
                    }
                    if (i12 >= 0) {
                        return;
                    } else {
                        return;
                    }
                }
                int i15 = 0;
                while (true) {
                    if (i15 >= arrayList.size()) {
                        i15 = -1;
                        break;
                    } else if (!((TLRPC.TL_username) arrayList.get(i15)).active) {
                        break;
                    } else {
                        i15++;
                    }
                }
                if (i15 >= 0) {
                    min = Math.max(0, i15 - 1);
                    i12 = min + 4;
                }
                if (this.b != null) {
                    int i16 = 0;
                    while (true) {
                        if (i16 >= this.b.getChildCount()) {
                            break;
                        }
                        View childAt = this.b.getChildAt(i16);
                        this.b.getClass();
                        if (RecyclerView.R(childAt) == i10) {
                            if (z11) {
                                AndroidUtilities.shakeView(childAt);
                            }
                            if (childAt instanceof qa) {
                                qa qaVar = (qa) childAt;
                                qaVar.setLoading(this.w.contains(tL_username.username));
                                TLRPC.TL_username tL_username2 = qaVar.v;
                                if (tL_username2 != null) {
                                    qaVar.a(tL_username2, qaVar.w, true, qaVar.x);
                                }
                            }
                        } else {
                            i16++;
                        }
                    }
                }
                if (i12 >= 0 || i10 == i12) {
                    return;
                }
                ka kaVar = this.c;
                int i17 = i12 - 4;
                ArrayList arrayList2 = kaVar.c.v;
                if (i11 >= arrayList2.size() || i17 >= arrayList2.size()) {
                    return;
                }
                arrayList2.add(i17, (TLRPC.TL_username) arrayList2.remove(i11));
                kaVar.p(i10, i12);
                for (int i18 = 0; i18 < arrayList2.size(); i18++) {
                    kaVar.m(i18 + 4);
                }
            }
        }
    }

    public final void k0(TLRPC.TL_username tL_username, boolean z10, boolean z11) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.v;
            if (i10 >= arrayList.size()) {
                return;
            }
            if (arrayList.get(i10) == tL_username) {
                j0(i10 + 4, z10, z11);
                return;
            }
            i10++;
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onResume() {
        super.onResume();
        if (MessagesController.getGlobalMainSettings().getBoolean("view_animations", true)) {
            return;
        }
        f0(false);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            f0(false);
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
