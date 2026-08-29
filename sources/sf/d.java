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
public final class d extends o2 implements NotificationCenter.NotificationCenterDelegate {
    public int A;
    public int B;
    public int C;
    public ir a;
    public org.telegram.ui.ActionBar.w0 b;
    public u51 c;
    public w d;
    public boolean e;
    public boolean f;
    public int h;
    public TL_account.TL_businessAwayMessage n;
    public int r;
    public boolean s;
    public boolean v;
    public boolean w;
    public int x;
    public int y;

    public static void U(d dVar, ArrayList arrayList, k51 k51Var) {
        String string = LocaleController.getString(R.string.BusinessAway);
        String string2 = LocaleController.getString(R.string.BusinessAwayInfo);
        w41 w41Var = new w41(2);
        w41Var.l = string;
        w41Var.o = string2;
        w41Var.m = "RestrictedEmoji";
        w41Var.n = "💤";
        arrayList.add(w41Var);
        w41 i10 = w41.i(1, LocaleController.getString(R.string.BusinessAwaySend));
        i10.K(dVar.s);
        arrayList.add(i10);
        arrayList.add(w41.B(null));
        if (dVar.s) {
            r1 d = s1.f(dVar.currentAccount).d("away");
            if (d != null) {
                w41 w41Var2 = new w41(17);
                w41Var2.G = d;
                arrayList.add(w41Var2);
            } else {
                w41 c3 = w41.c(2, R.drawable.msg2_chats_add, LocaleController.getString(R.string.BusinessAwayCreate));
                c3.q = true;
                arrayList.add(c3);
            }
            arrayList.add(w41.B(null));
            th.p(R.string.BusinessAwaySchedule, arrayList);
            w41 w10 = w41.w(3, LocaleController.getString(R.string.BusinessAwayScheduleAlways));
            w10.K(dVar.x == 0);
            arrayList.add(w10);
            if (dVar.e) {
                w41 w11 = w41.w(4, LocaleController.getString(R.string.BusinessAwayScheduleOutsideHours));
                w11.K(dVar.x == 1);
                arrayList.add(w11);
            }
            w41 w12 = w41.w(5, LocaleController.getString(R.string.BusinessAwayScheduleCustom));
            w12.K(dVar.x == 2);
            arrayList.add(w12);
            if (dVar.x == 2) {
                arrayList.add(w41.B(null));
                th.p(R.string.BusinessAwaySchedule, arrayList);
                arrayList.add(w41.f(LocaleController.getString(R.string.BusinessAwayScheduleCustomStart), LocaleController.formatShortDateTime(dVar.B), 8));
                arrayList.add(w41.f(LocaleController.getString(R.string.BusinessAwayScheduleCustomEnd), LocaleController.formatShortDateTime(dVar.C), 9));
            }
            arrayList.add(w41.B(null));
            w41 i11 = w41.i(10, LocaleController.getString(R.string.BusinessAwayOnlyOffline));
            i11.K(dVar.w);
            arrayList.add(i11);
            th.A(R.string.BusinessAwayOnlyOfflineInfo, arrayList);
            th.p(R.string.BusinessRecipients, arrayList);
            w41 w13 = w41.w(6, LocaleController.getString(R.string.BusinessChatsAllPrivateExcept2));
            w13.K(dVar.v);
            arrayList.add(w13);
            w41 w14 = w41.w(7, LocaleController.getString(R.string.BusinessChatsOnlySelected2));
            w14.K(!dVar.v);
            arrayList.add(w14);
            arrayList.add(w41.B(null));
            dVar.d.a(arrayList, k51Var, true);
            arrayList.add(w41.B(null));
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
        if (this.f) {
            boolean z10 = this.s;
            TL_account.TL_businessAwayMessage tL_businessAwayMessage = this.n;
            if (z10 == (tL_businessAwayMessage != null)) {
                if (z10 && tL_businessAwayMessage != null) {
                    if (tL_businessAwayMessage.recipients.exclude_selected == this.v && ((wVar = this.d) == null || !wVar.g())) {
                        int i10 = this.r;
                        int i11 = this.x;
                        if (i10 == i11 && this.n.offline_only == this.w && (i11 != 2 || (this.y == this.B && this.A == this.C))) {
                        }
                    }
                }
            }
            return true;
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
        r1 d = s1.f(this.currentAccount).d("away");
        boolean z10 = this.s;
        if (z10 && d == null) {
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            View y12 = this.c.y1(2);
            int i10 = -this.h;
            this.h = i10;
            AndroidUtilities.shakeViewSpring(y12, i10);
            u51 u51Var = this.c;
            u51Var.x0(u51Var.x1(2));
            return;
        }
        if (!z10 || this.d.k(this.c)) {
            this.a.a(1.0f);
            TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
            TL_account.updateBusinessAwayMessage updatebusinessawaymessage = new TL_account.updateBusinessAwayMessage();
            if (this.s) {
                TL_account.TL_inputBusinessAwayMessage tL_inputBusinessAwayMessage = new TL_account.TL_inputBusinessAwayMessage();
                updatebusinessawaymessage.message = tL_inputBusinessAwayMessage;
                tL_inputBusinessAwayMessage.offline_only = this.w;
                tL_inputBusinessAwayMessage.shortcut_id = d.a;
                tL_inputBusinessAwayMessage.recipients = this.d.e();
                int i11 = this.x;
                if (i11 == 0) {
                    updatebusinessawaymessage.message.schedule = new TL_account.TL_businessAwayMessageScheduleAlways();
                } else if (i11 == 1) {
                    updatebusinessawaymessage.message.schedule = new TL_account.TL_businessAwayMessageScheduleOutsideWorkHours();
                } else if (i11 == 2) {
                    TL_account.TL_businessAwayMessageScheduleCustom tL_businessAwayMessageScheduleCustom = new TL_account.TL_businessAwayMessageScheduleCustom();
                    tL_businessAwayMessageScheduleCustom.start_date = this.B;
                    tL_businessAwayMessageScheduleCustom.end_date = this.C;
                    updatebusinessawaymessage.message.schedule = tL_businessAwayMessageScheduleCustom;
                }
                updatebusinessawaymessage.flags |= 1;
                if (userFull != null) {
                    userFull.flags2 |= 8;
                    TL_account.TL_businessAwayMessage tL_businessAwayMessage = new TL_account.TL_businessAwayMessage();
                    userFull.business_away_message = tL_businessAwayMessage;
                    tL_businessAwayMessage.offline_only = this.w;
                    tL_businessAwayMessage.shortcut_id = d.a;
                    tL_businessAwayMessage.recipients = this.d.f();
                    userFull.business_away_message.schedule = updatebusinessawaymessage.message.schedule;
                }
            } else if (userFull != null) {
                userFull.flags2 &= -9;
                userFull.business_away_message = null;
            }
            getConnectionsManager().sendRequest(updatebusinessawaymessage, new ef.a(this, 22));
            getMessagesStorage().updateUserInfo(userFull, false);
        }
    }

    public final void Y() {
        u51 u51Var;
        k51 k51Var;
        if (this.f) {
            return;
        }
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        if (userFull == null) {
            getMessagesController().loadUserInfo(getUserConfig().getCurrentUser(), true, getClassGuid());
            return;
        }
        TL_account.TL_businessAwayMessage tL_businessAwayMessage = userFull.business_away_message;
        this.n = tL_businessAwayMessage;
        this.e = userFull.business_work_hours != null;
        this.s = tL_businessAwayMessage != null;
        this.v = tL_businessAwayMessage != null ? tL_businessAwayMessage.recipients.exclude_selected : true;
        this.w = tL_businessAwayMessage != null ? tL_businessAwayMessage.offline_only : true;
        w wVar = this.d;
        if (wVar != null) {
            wVar.j(tL_businessAwayMessage == null ? null : tL_businessAwayMessage.recipients);
        }
        TL_account.TL_businessAwayMessage tL_businessAwayMessage2 = this.n;
        if (tL_businessAwayMessage2 != null) {
            TL_account.BusinessAwayMessageSchedule businessAwayMessageSchedule = tL_businessAwayMessage2.schedule;
            if (businessAwayMessageSchedule instanceof TL_account.TL_businessAwayMessageScheduleCustom) {
                this.r = 2;
                this.x = 2;
                TL_account.TL_businessAwayMessageScheduleCustom tL_businessAwayMessageScheduleCustom = (TL_account.TL_businessAwayMessageScheduleCustom) businessAwayMessageSchedule;
                int i10 = tL_businessAwayMessageScheduleCustom.start_date;
                this.y = i10;
                this.B = i10;
                int i11 = tL_businessAwayMessageScheduleCustom.end_date;
                this.A = i11;
                this.C = i11;
                u51Var = this.c;
                if (u51Var != null && (k51Var = u51Var.U2) != null) {
                    k51Var.N(true);
                }
                V(true);
                this.f = true;
            }
        }
        this.B = getConnectionsManager().getCurrentTime();
        this.C = getConnectionsManager().getCurrentTime() + 86400;
        TL_account.TL_businessAwayMessage tL_businessAwayMessage3 = this.n;
        if (tL_businessAwayMessage3 != null && (tL_businessAwayMessage3.schedule instanceof TL_account.TL_businessAwayMessageScheduleAlways)) {
            this.r = 0;
            this.x = 0;
        } else if (tL_businessAwayMessage3 == null || !(tL_businessAwayMessage3.schedule instanceof TL_account.TL_businessAwayMessageScheduleOutsideWorkHours)) {
            this.r = 0;
            this.x = 0;
        } else {
            this.r = 1;
            this.x = 1;
        }
        u51Var = this.c;
        if (u51Var != null) {
            k51Var.N(true);
        }
        V(true);
        this.f = true;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.BusinessAway));
        this.actionBar.setActionBarMenuOnItemClick(new qh.e(this, 6));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i10 = g6.v8;
        mutate.setColorFilter(new PorterDuffColorFilter(g6.w0(null, i10, false), PorterDuff.Mode.MULTIPLY));
        this.a = new ir(mutate, new np(g6.w0(null, i10, false)));
        this.b = this.actionBar.n().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.a);
        V(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(g6.w0(null, g6.a7, false));
        w wVar = new w(this, new org.telegram.ui.web.t1(this, 14));
        this.d = wVar;
        wVar.h = this.v;
        TL_account.TL_businessAwayMessage tL_businessAwayMessage = this.n;
        wVar.j(tL_businessAwayMessage == null ? null : tL_businessAwayMessage.recipients);
        u51 u51Var = new u51(this, new t4(this, 16), new b(this, 0), null);
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
            alertDialog$Builder.a.P = LocaleController.getString(R.string.BusinessAwayUnsavedChanges);
            alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new b(this, 1));
            alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new b(this, 2));
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
