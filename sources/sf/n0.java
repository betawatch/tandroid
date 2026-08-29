package sf;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import i7.f6;
import java.util.ArrayList;
import nh.t4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.ir;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.w41;
import org.telegram.ui.th;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class n0 extends o2 implements NotificationCenter.NotificationCenterDelegate {
    public ir a;
    public org.telegram.ui.ActionBar.w0 b;
    public u51 c;
    public w d;
    public final int[] e;
    public final String[] f;
    public boolean h;
    public int n;
    public TL_account.TL_businessGreetingMessage r;
    public boolean s;
    public boolean v;
    public int w;

    public n0() {
        super(null);
        int[] iArr = {7, 14, 21, 28};
        this.e = iArr;
        this.n = -4;
        this.w = 7;
        this.f = new String[iArr.length];
        int i10 = 0;
        while (true) {
            int[] iArr2 = this.e;
            if (i10 >= iArr2.length) {
                return;
            }
            this.f[i10] = LocaleController.formatPluralString("DaysSchedule", iArr2[i10], new Object[0]);
            i10++;
        }
    }

    public static void U(n0 n0Var, ArrayList arrayList, k51 k51Var) {
        String string = LocaleController.getString(R.string.BusinessGreet);
        String string2 = LocaleController.getString(R.string.BusinessGreetInfo);
        w41 w41Var = new w41(2);
        w41Var.l = string;
        w41Var.o = string2;
        w41Var.m = "RestrictedEmoji";
        w41Var.n = "👋";
        arrayList.add(w41Var);
        w41 i10 = w41.i(1, LocaleController.getString(R.string.BusinessGreetSend));
        i10.K(n0Var.s);
        arrayList.add(i10);
        arrayList.add(w41.B(null));
        if (n0Var.s) {
            r1 d = s1.f(n0Var.currentAccount).d("hello");
            if (d != null) {
                w41 w41Var2 = new w41(17);
                w41Var2.G = d;
                arrayList.add(w41Var2);
            } else {
                w41 c3 = w41.c(2, R.drawable.msg2_chats_add, LocaleController.getString(R.string.BusinessGreetCreate));
                c3.q = true;
                arrayList.add(c3);
            }
            arrayList.add(w41.B(null));
            th.p(R.string.BusinessRecipients, arrayList);
            w41 w10 = w41.w(3, LocaleController.getString(R.string.BusinessChatsAllPrivateExcept2));
            w10.K(n0Var.v);
            arrayList.add(w10);
            w41 w11 = w41.w(4, LocaleController.getString(R.string.BusinessChatsOnlySelected2));
            w11.K(!n0Var.v);
            arrayList.add(w11);
            arrayList.add(w41.B(null));
            n0Var.d.a(arrayList, k51Var, true);
            th.A(R.string.BusinessGreetRecipientsInfo, arrayList);
            th.p(R.string.BusinessGreetPeriod, arrayList);
            int i11 = 0;
            while (true) {
                int[] iArr = n0Var.e;
                if (i11 >= iArr.length) {
                    i11 = -1;
                    break;
                } else if (iArr[i11] == n0Var.w) {
                    break;
                } else {
                    i11++;
                }
            }
            String[] strArr = n0Var.f;
            nh.b0 b0Var = new nh.b0(n0Var, 20);
            w41 w41Var3 = new w41(14);
            w41Var3.p = strArr;
            w41Var3.z = i11;
            w41Var3.C = b0Var;
            w41Var3.B = -1L;
            arrayList.add(w41Var3);
            th.A(R.string.BusinessGreetPeriodInfo, arrayList);
        }
    }

    public final void V(boolean z10) {
        if (this.b == null) {
            return;
        }
        boolean W = W();
        this.b.setEnabled(W);
        if (z10) {
            this.b.animate().alpha(W ? 1.0f : 0.0f).scaleX(W ? 1.0f : 0.0f).scaleY(W ? 1.0f : 0.0f).setDuration(180L).start();
            return;
        }
        this.b.setAlpha(W ? 1.0f : 0.0f);
        this.b.setScaleX(W ? 1.0f : 0.0f);
        this.b.setScaleY(W ? 1.0f : 0.0f);
    }

    public final boolean W() {
        w wVar;
        if (this.h) {
            boolean z10 = this.s;
            TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = this.r;
            if (z10 != (tL_businessGreetingMessage != null) || (z10 && tL_businessGreetingMessage != null && (tL_businessGreetingMessage.no_activity_days != this.w || tL_businessGreetingMessage.recipients.exclude_selected != this.v || ((wVar = this.d) != null && wVar.g())))) {
                return true;
            }
        }
        return false;
    }

    public final void X() {
        if (this.a.c > 0.0f) {
            return;
        }
        if (!W()) {
            finishFragment();
            return;
        }
        r1 d = s1.f(this.currentAccount).d("hello");
        boolean z10 = this.s;
        if (z10 && d == null) {
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            View y12 = this.c.y1(2);
            int i10 = -this.n;
            this.n = i10;
            AndroidUtilities.shakeViewSpring(y12, i10);
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
            getConnectionsManager().sendRequest(updatebusinessgreetingmessage, new ef.a(this, 25));
            getMessagesStorage().updateUserInfo(userFull, false);
        }
    }

    public final void Y() {
        k51 k51Var;
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
        w wVar = this.d;
        if (wVar != null) {
            wVar.j(tL_businessGreetingMessage == null ? null : tL_businessGreetingMessage.recipients);
        }
        u51 u51Var = this.c;
        if (u51Var != null && (k51Var = u51Var.U2) != null) {
            k51Var.N(true);
        }
        V(true);
        this.h = true;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.BusinessGreet));
        this.actionBar.setActionBarMenuOnItemClick(new qh.e(this, 9));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i10 = g6.v8;
        mutate.setColorFilter(new PorterDuffColorFilter(g6.w0(null, i10, false), PorterDuff.Mode.MULTIPLY));
        this.a = new ir(mutate, new np(g6.w0(null, i10, false)));
        this.b = this.actionBar.n().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.a);
        V(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(g6.w0(null, g6.a7, false));
        w wVar = new w(this, new org.telegram.ui.web.t1(this, 18));
        this.d = wVar;
        wVar.n = true;
        TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = this.r;
        wVar.j(tL_businessGreetingMessage == null ? null : tL_businessGreetingMessage.recipients);
        u51 u51Var = new u51(this, new t4(this, 20), new m0(this, 2), null);
        this.c = u51Var;
        u51Var.p1();
        u51 u51Var2 = this.c;
        u51Var2.U2.r = false;
        frameLayout.addView(u51Var2, f6.c(-1.0f, -1));
        this.actionBar.A(this.c, true);
        Y();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        k51 k51Var;
        if (i10 != NotificationCenter.quickRepliesUpdated) {
            if (i10 == NotificationCenter.userInfoDidLoad) {
                Y();
            }
        } else {
            u51 u51Var = this.c;
            if (u51Var != null && (k51Var = u51Var.U2) != null) {
                k51Var.N(true);
            }
            V(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onBackPressed(boolean z10) {
        if (!W()) {
            return super.onBackPressed(z10);
        }
        if (z10) {
            if (!this.s) {
                X();
                return false;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.a.N = LocaleController.getString(R.string.UnsavedChanges);
            alertDialog$Builder.a.P = LocaleController.getString(R.string.BusinessGreetUnsavedChanges);
            alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new m0(this, 0));
            alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new m0(this, 1));
            showDialog(alertDialog$Builder.a);
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.quickRepliesUpdated);
        getNotificationCenter().addObserver(this, NotificationCenter.userInfoDidLoad);
        s1.f(this.currentAccount).h();
        Y();
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.quickRepliesUpdated);
        getNotificationCenter().removeObserver(this, NotificationCenter.userInfoDidLoad);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.c.setPadding(0, 0, 0, i13);
        this.c.setClipToPadding(false);
    }
}
