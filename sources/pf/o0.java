package pf;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import g7.e6;
import java.util.ArrayList;
import kh.b8;
import kh.i9;
import mh.m2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Cells.j2;
import org.telegram.ui.Components.fr;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.jp;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.z41;
import org.telegram.ui.xe1;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class o0 extends o2 implements NotificationCenter.NotificationCenterDelegate {
    public fr a;
    public org.telegram.ui.ActionBar.w0 b;
    public i51 c;
    public x d;
    public final int[] e;
    public final String[] f;
    public boolean h;
    public int n;
    public TL_account.TL_businessGreetingMessage r;
    public boolean s;
    public boolean v;
    public int w;

    public o0() {
        super(null);
        int[] iArr = {7, 14, 21, 28};
        this.e = iArr;
        this.n = -4;
        this.w = 7;
        this.f = new String[iArr.length];
        int i9 = 0;
        while (true) {
            int[] iArr2 = this.e;
            if (i9 >= iArr2.length) {
                return;
            }
            this.f[i9] = LocaleController.formatPluralString("DaysSchedule", iArr2[i9], new Object[0]);
            i9++;
        }
    }

    public static void T(o0 o0Var, ArrayList arrayList, z41 z41Var) {
        String string = LocaleController.getString(R.string.BusinessGreet);
        String string2 = LocaleController.getString(R.string.BusinessGreetInfo);
        l41 l41Var = new l41(2);
        l41Var.l = string;
        l41Var.o = string2;
        l41Var.m = "RestrictedEmoji";
        l41Var.n = "👋";
        arrayList.add(l41Var);
        l41 i9 = l41.i(1, LocaleController.getString(R.string.BusinessGreetSend));
        i9.K(o0Var.s);
        arrayList.add(i9);
        arrayList.add(l41.B(null));
        if (o0Var.s) {
            q1 d = r1.f(o0Var.currentAccount).d("hello");
            if (d != null) {
                l41 l41Var2 = new l41(17);
                l41Var2.G = d;
                arrayList.add(l41Var2);
            } else {
                l41 c10 = l41.c(2, R.drawable.msg2_chats_add, LocaleController.getString(R.string.BusinessGreetCreate));
                c10.q = true;
                arrayList.add(c10);
            }
            arrayList.add(l41.B(null));
            j2.l(R.string.BusinessRecipients, arrayList);
            l41 w8 = l41.w(3, LocaleController.getString(R.string.BusinessChatsAllPrivateExcept2));
            w8.K(o0Var.v);
            arrayList.add(w8);
            l41 w10 = l41.w(4, LocaleController.getString(R.string.BusinessChatsOnlySelected2));
            w10.K(!o0Var.v);
            arrayList.add(w10);
            arrayList.add(l41.B(null));
            o0Var.d.a(arrayList, z41Var, true);
            j2.y(R.string.BusinessGreetRecipientsInfo, arrayList);
            j2.l(R.string.BusinessGreetPeriod, arrayList);
            int i10 = 0;
            while (true) {
                int[] iArr = o0Var.e;
                if (i10 >= iArr.length) {
                    i10 = -1;
                    break;
                } else if (iArr[i10] == o0Var.w) {
                    break;
                } else {
                    i10++;
                }
            }
            String[] strArr = o0Var.f;
            i9 i9Var = new i9(o0Var, 13);
            l41 l41Var3 = new l41(14);
            l41Var3.p = strArr;
            l41Var3.z = i10;
            l41Var3.C = i9Var;
            l41Var3.B = -1L;
            arrayList.add(l41Var3);
            j2.y(R.string.BusinessGreetPeriodInfo, arrayList);
        }
    }

    public final void U(boolean z10) {
        if (this.b == null) {
            return;
        }
        boolean V = V();
        this.b.setEnabled(V);
        if (z10) {
            this.b.animate().alpha(V ? 1.0f : 0.0f).scaleX(V ? 1.0f : 0.0f).scaleY(V ? 1.0f : 0.0f).setDuration(180L).start();
            return;
        }
        this.b.setAlpha(V ? 1.0f : 0.0f);
        this.b.setScaleX(V ? 1.0f : 0.0f);
        this.b.setScaleY(V ? 1.0f : 0.0f);
    }

    public final boolean V() {
        x xVar;
        if (this.h) {
            boolean z10 = this.s;
            TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = this.r;
            if (z10 != (tL_businessGreetingMessage != null) || (z10 && tL_businessGreetingMessage != null && (tL_businessGreetingMessage.no_activity_days != this.w || tL_businessGreetingMessage.recipients.exclude_selected != this.v || ((xVar = this.d) != null && xVar.g())))) {
                return true;
            }
        }
        return false;
    }

    public final void W() {
        if (this.a.c > 0.0f) {
            return;
        }
        if (!V()) {
            finishFragment();
            return;
        }
        q1 d = r1.f(this.currentAccount).d("hello");
        boolean z10 = this.s;
        if (z10 && d == null) {
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            View y12 = this.c.y1(2);
            int i9 = -this.n;
            this.n = i9;
            AndroidUtilities.shakeViewSpring(y12, i9);
            return;
        }
        if (!z10 || this.d.k(this.c)) {
            this.a.a(1.0f);
            TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
            TL_account.updateBusinessGreetingMessage updatebusinessgreetingmessage = new TL_account.updateBusinessGreetingMessage();
            if (this.s) {
                TL_account.TL_inputBusinessGreetingMessage tL_inputBusinessGreetingMessage = new TL_account.TL_inputBusinessGreetingMessage();
                updatebusinessgreetingmessage.message = tL_inputBusinessGreetingMessage;
                tL_inputBusinessGreetingMessage.shortcut_id = d.a;
                tL_inputBusinessGreetingMessage.recipients = this.d.e();
                updatebusinessgreetingmessage.message.no_activity_days = this.w;
                updatebusinessgreetingmessage.flags |= 1;
                if (userFull != null) {
                    userFull.flags2 |= 4;
                    TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = new TL_account.TL_businessGreetingMessage();
                    userFull.business_greeting_message = tL_businessGreetingMessage;
                    tL_businessGreetingMessage.shortcut_id = d.a;
                    tL_businessGreetingMessage.recipients = this.d.f();
                    userFull.business_greeting_message.no_activity_days = this.w;
                }
            } else if (userFull != null) {
                userFull.flags2 &= -5;
                userFull.business_greeting_message = null;
            }
            getConnectionsManager().sendRequest(updatebusinessgreetingmessage, new bf.a(this, 25));
            getMessagesStorage().updateUserInfo(userFull, false);
        }
    }

    public final void X() {
        z41 z41Var;
        if (this.h) {
            return;
        }
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        if (userFull == null) {
            getMessagesController().loadUserInfo(getUserConfig().getCurrentUser(), true, getClassGuid());
            return;
        }
        TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = userFull.business_greeting_message;
        this.r = tL_businessGreetingMessage;
        this.s = tL_businessGreetingMessage != null;
        this.w = tL_businessGreetingMessage != null ? tL_businessGreetingMessage.no_activity_days : 7;
        this.v = tL_businessGreetingMessage != null ? tL_businessGreetingMessage.recipients.exclude_selected : true;
        x xVar = this.d;
        if (xVar != null) {
            xVar.j(tL_businessGreetingMessage == null ? null : tL_businessGreetingMessage.recipients);
        }
        i51 i51Var = this.c;
        if (i51Var != null && (z41Var = i51Var.U2) != null) {
            z41Var.N(true);
        }
        U(true);
        this.h = true;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.BusinessGreet));
        this.actionBar.setActionBarMenuOnItemClick(new xe1(this, 8));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i9 = f6.v8;
        mutate.setColorFilter(new PorterDuffColorFilter(f6.w0(null, i9, false), PorterDuff.Mode.MULTIPLY));
        this.a = new fr(mutate, new jp(f6.w0(null, i9, false)));
        this.b = this.actionBar.n().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.a);
        U(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(f6.w0(null, f6.a7, false));
        x xVar = new x(this, new m2(this, 27));
        this.d = xVar;
        xVar.n = true;
        TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = this.r;
        xVar.j(tL_businessGreetingMessage == null ? null : tL_businessGreetingMessage.recipients);
        i51 i51Var = new i51(this, new b8(this, 19), new n0(this, 2), null);
        this.c = i51Var;
        i51Var.p1();
        i51 i51Var2 = this.c;
        i51Var2.U2.r = false;
        frameLayout.addView(i51Var2, e6.c(-1.0f, -1));
        this.actionBar.z(this.c, true);
        X();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        z41 z41Var;
        if (i9 != NotificationCenter.quickRepliesUpdated) {
            if (i9 == NotificationCenter.userInfoDidLoad) {
                X();
            }
        } else {
            i51 i51Var = this.c;
            if (i51Var != null && (z41Var = i51Var.U2) != null) {
                z41Var.N(true);
            }
            U(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onBackPressed(boolean z10) {
        if (!V()) {
            return super.onBackPressed(z10);
        }
        if (z10) {
            if (!this.s) {
                W();
                return false;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.a.N = LocaleController.getString(R.string.UnsavedChanges);
            alertDialog$Builder.a.P = LocaleController.getString(R.string.BusinessGreetUnsavedChanges);
            alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new n0(this, 0));
            alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new n0(this, 1));
            showDialog(alertDialog$Builder.a);
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.quickRepliesUpdated);
        getNotificationCenter().addObserver(this, NotificationCenter.userInfoDidLoad);
        r1.f(this.currentAccount).h();
        X();
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.quickRepliesUpdated);
        getNotificationCenter().removeObserver(this, NotificationCenter.userInfoDidLoad);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onInsets(int i9, int i10, int i11, int i12) {
        this.c.setPadding(0, 0, 0, i12);
        this.c.setClipToPadding(false);
    }
}
