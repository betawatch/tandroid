package uf;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.qp;
import org.telegram.ui.Components.w51;
import org.telegram.ui.ai;
import ph.d4;
import ph.ga;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class n0 extends p2 implements NotificationCenter.NotificationCenterDelegate {
    public lr a;
    public org.telegram.ui.ActionBar.w0 b;
    public g61 c;
    public v d;
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

    public static void U(n0 n0Var, ArrayList arrayList, w51 w51Var) {
        String string = LocaleController.getString(R.string.BusinessGreet);
        String string2 = LocaleController.getString(R.string.BusinessGreetInfo);
        i51 i51Var = new i51(2);
        i51Var.l = string;
        i51Var.o = string2;
        i51Var.m = "RestrictedEmoji";
        i51Var.n = "👋";
        arrayList.add(i51Var);
        i51 i10 = i51.i(1, LocaleController.getString(R.string.BusinessGreetSend));
        i10.K(n0Var.s);
        arrayList.add(i10);
        arrayList.add(i51.B(null));
        if (n0Var.s) {
            o1 d = p1.f(n0Var.currentAccount).d("hello");
            if (d != null) {
                i51 i51Var2 = new i51(17);
                i51Var2.G = d;
                arrayList.add(i51Var2);
            } else {
                i51 c3 = i51.c(2, R.drawable.msg2_chats_add, LocaleController.getString(R.string.BusinessGreetCreate));
                c3.q = true;
                arrayList.add(c3);
            }
            arrayList.add(i51.B(null));
            ai.q(R.string.BusinessRecipients, arrayList);
            i51 w10 = i51.w(3, LocaleController.getString(R.string.BusinessChatsAllPrivateExcept2));
            w10.K(n0Var.v);
            arrayList.add(w10);
            i51 w11 = i51.w(4, LocaleController.getString(R.string.BusinessChatsOnlySelected2));
            w11.K(!n0Var.v);
            arrayList.add(w11);
            arrayList.add(i51.B(null));
            n0Var.d.a(arrayList, w51Var, true);
            ai.A(R.string.BusinessGreetRecipientsInfo, arrayList);
            ai.q(R.string.BusinessGreetPeriod, arrayList);
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
            org.telegram.ui.web.a1 a1Var = new org.telegram.ui.web.a1(n0Var, 20);
            i51 i51Var3 = new i51(14);
            i51Var3.p = strArr;
            i51Var3.z = i11;
            i51Var3.C = a1Var;
            i51Var3.B = -1L;
            arrayList.add(i51Var3);
            ai.A(R.string.BusinessGreetPeriodInfo, arrayList);
        }
    }

    public final void V(boolean z4) {
        if (this.b == null) {
            return;
        }
        boolean W = W();
        this.b.setEnabled(W);
        if (z4) {
            this.b.animate().alpha(W ? 1.0f : 0.0f).scaleX(W ? 1.0f : 0.0f).scaleY(W ? 1.0f : 0.0f).setDuration(180L).start();
            return;
        }
        this.b.setAlpha(W ? 1.0f : 0.0f);
        this.b.setScaleX(W ? 1.0f : 0.0f);
        this.b.setScaleY(W ? 1.0f : 0.0f);
    }

    public final boolean W() {
        v vVar;
        if (this.h) {
            boolean z4 = this.s;
            TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = this.r;
            if (z4 != (tL_businessGreetingMessage != null) || (z4 && tL_businessGreetingMessage != null && (tL_businessGreetingMessage.no_activity_days != this.w || tL_businessGreetingMessage.recipients.exclude_selected != this.v || ((vVar = this.d) != null && vVar.g())))) {
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
        o1 d = p1.f(this.currentAccount).d("hello");
        boolean z4 = this.s;
        if (z4 && d == null) {
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            View x12 = this.c.x1(2);
            int i10 = -this.n;
            this.n = i10;
            AndroidUtilities.shakeViewSpring(x12, i10);
            return;
        }
        if (!z4 || this.d.k(this.c)) {
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
            getConnectionsManager().sendRequest(updatebusinessgreetingmessage, new ff.a(this, 25));
            getMessagesStorage().updateUserInfo(userFull, false);
        }
    }

    public final void Y() {
        w51 w51Var;
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
        v vVar = this.d;
        if (vVar != null) {
            vVar.j(tL_businessGreetingMessage == null ? null : tL_businessGreetingMessage.recipients);
        }
        g61 g61Var = this.c;
        if (g61Var != null && (w51Var = g61Var.V2) != null) {
            w51Var.N(true);
        }
        V(true);
        this.h = true;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.BusinessGreet));
        this.actionBar.setActionBarMenuOnItemClick(new sh.e(this, 9));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i10 = j6.v8;
        mutate.setColorFilter(new PorterDuffColorFilter(j6.w0(null, i10, false), PorterDuff.Mode.MULTIPLY));
        this.a = new lr(mutate, new qp(j6.w0(null, i10, false)));
        this.b = this.actionBar.n().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.a);
        V(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(j6.w0(null, j6.a7, false));
        v vVar = new v(this, new ga(this, 21));
        this.d = vVar;
        vVar.n = true;
        TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = this.r;
        vVar.j(tL_businessGreetingMessage == null ? null : tL_businessGreetingMessage.recipients);
        g61 g61Var = new g61(this, new d4(this, 20), new m0(this, 2), null);
        this.c = g61Var;
        g61Var.o1();
        g61 g61Var2 = this.c;
        g61Var2.V2.r = false;
        frameLayout.addView(g61Var2, b6.c(-1.0f, -1));
        this.actionBar.A(this.c, true);
        Y();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        w51 w51Var;
        if (i10 != NotificationCenter.quickRepliesUpdated) {
            if (i10 == NotificationCenter.userInfoDidLoad) {
                Y();
            }
        } else {
            g61 g61Var = this.c;
            if (g61Var != null && (w51Var = g61Var.V2) != null) {
                w51Var.N(true);
            }
            V(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onBackPressed(boolean z4) {
        if (!W()) {
            return super.onBackPressed(z4);
        }
        if (z4) {
            if (!this.s) {
                X();
                return false;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.a.O = LocaleController.getString(R.string.UnsavedChanges);
            alertDialog$Builder.a.Q = LocaleController.getString(R.string.BusinessGreetUnsavedChanges);
            alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new m0(this, 0));
            alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new m0(this, 1));
            showDialog(alertDialog$Builder.a);
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.quickRepliesUpdated);
        getNotificationCenter().addObserver(this, NotificationCenter.userInfoDidLoad);
        p1.f(this.currentAccount).h();
        Y();
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.quickRepliesUpdated);
        getNotificationCenter().removeObserver(this, NotificationCenter.userInfoDidLoad);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.c.setPadding(0, 0, 0, i13);
        this.c.setClipToPadding(false);
    }
}
