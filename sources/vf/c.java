package vf;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.or;
import org.telegram.ui.Components.tp;
import org.telegram.ui.Components.w51;
import org.telegram.ui.yh;
import qh.c4;
import qh.u9;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class c extends p2 implements NotificationCenter.NotificationCenterDelegate {
    public int B;
    public int C;
    public int D;
    public or a;
    public org.telegram.ui.ActionBar.w0 b;
    public h61 c;
    public v d;
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

    public static void U(c cVar, ArrayList arrayList, w51 w51Var) {
        String string = LocaleController.getString(R.string.BusinessAway);
        String string2 = LocaleController.getString(R.string.BusinessAwayInfo);
        h51 h51Var = new h51(2);
        h51Var.l = string;
        h51Var.o = string2;
        h51Var.m = "RestrictedEmoji";
        h51Var.n = "💤";
        arrayList.add(h51Var);
        h51 i10 = h51.i(1, LocaleController.getString(R.string.BusinessAwaySend));
        i10.K(cVar.s);
        arrayList.add(i10);
        arrayList.add(h51.B(null));
        if (cVar.s) {
            o1 d = p1.f(cVar.currentAccount).d("away");
            if (d != null) {
                h51 h51Var2 = new h51(17);
                h51Var2.G = d;
                arrayList.add(h51Var2);
            } else {
                h51 c3 = h51.c(2, R.drawable.msg2_chats_add, LocaleController.getString(R.string.BusinessAwayCreate));
                c3.q = true;
                arrayList.add(c3);
            }
            arrayList.add(h51.B(null));
            yh.r(R.string.BusinessAwaySchedule, arrayList);
            h51 w10 = h51.w(3, LocaleController.getString(R.string.BusinessAwayScheduleAlways));
            w10.K(cVar.x == 0);
            arrayList.add(w10);
            if (cVar.e) {
                h51 w11 = h51.w(4, LocaleController.getString(R.string.BusinessAwayScheduleOutsideHours));
                w11.K(cVar.x == 1);
                arrayList.add(w11);
            }
            h51 w12 = h51.w(5, LocaleController.getString(R.string.BusinessAwayScheduleCustom));
            w12.K(cVar.x == 2);
            arrayList.add(w12);
            if (cVar.x == 2) {
                arrayList.add(h51.B(null));
                yh.r(R.string.BusinessAwaySchedule, arrayList);
                arrayList.add(h51.f(LocaleController.getString(R.string.BusinessAwayScheduleCustomStart), LocaleController.formatShortDateTime(cVar.C), 8));
                arrayList.add(h51.f(LocaleController.getString(R.string.BusinessAwayScheduleCustomEnd), LocaleController.formatShortDateTime(cVar.D), 9));
            }
            arrayList.add(h51.B(null));
            h51 i11 = h51.i(10, LocaleController.getString(R.string.BusinessAwayOnlyOffline));
            i11.K(cVar.w);
            arrayList.add(i11);
            yh.A(R.string.BusinessAwayOnlyOfflineInfo, arrayList);
            yh.r(R.string.BusinessRecipients, arrayList);
            h51 w13 = h51.w(6, LocaleController.getString(R.string.BusinessChatsAllPrivateExcept2));
            w13.K(cVar.v);
            arrayList.add(w13);
            h51 w14 = h51.w(7, LocaleController.getString(R.string.BusinessChatsOnlySelected2));
            w14.K(!cVar.v);
            arrayList.add(w14);
            arrayList.add(h51.B(null));
            cVar.d.a(arrayList, w51Var, true);
            arrayList.add(h51.B(null));
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
        if (this.f) {
            boolean z4 = this.s;
            TL_account.TL_businessAwayMessage tL_businessAwayMessage = this.n;
            if (z4 == (tL_businessAwayMessage != null)) {
                if (z4 && tL_businessAwayMessage != null) {
                    if (tL_businessAwayMessage.recipients.exclude_selected == this.v && ((vVar = this.d) == null || !vVar.g())) {
                        int i10 = this.r;
                        int i11 = this.x;
                        if (i10 == i11 && this.n.offline_only == this.w && (i11 != 2 || (this.y == this.C && this.B == this.D))) {
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
        o1 d = p1.f(this.currentAccount).d("away");
        boolean z4 = this.s;
        if (z4 && d == null) {
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            View x12 = this.c.x1(2);
            int i10 = -this.h;
            this.h = i10;
            AndroidUtilities.shakeViewSpring(x12, i10);
            h61 h61Var = this.c;
            h61Var.x0(h61Var.w1(2));
            return;
        }
        if (!z4 || this.d.k(this.c)) {
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
                    tL_businessAwayMessageScheduleCustom.start_date = this.C;
                    tL_businessAwayMessageScheduleCustom.end_date = this.D;
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
            getConnectionsManager().sendRequest(updatebusinessawaymessage, new gf.a(this, 22));
            getMessagesStorage().updateUserInfo(userFull, false);
        }
    }

    public final void Y() {
        h61 h61Var;
        w51 w51Var;
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
        v vVar = this.d;
        if (vVar != null) {
            vVar.j(tL_businessAwayMessage == null ? null : tL_businessAwayMessage.recipients);
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
                this.C = i10;
                int i11 = tL_businessAwayMessageScheduleCustom.end_date;
                this.B = i11;
                this.D = i11;
                h61Var = this.c;
                if (h61Var != null && (w51Var = h61Var.V2) != null) {
                    w51Var.N(true);
                }
                V(true);
                this.f = true;
            }
        }
        this.C = getConnectionsManager().getCurrentTime();
        this.D = getConnectionsManager().getCurrentTime() + 86400;
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
        h61Var = this.c;
        if (h61Var != null) {
            w51Var.N(true);
        }
        V(true);
        this.f = true;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.BusinessAway));
        this.actionBar.setActionBarMenuOnItemClick(new th.e(this, 6));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i10 = k6.v8;
        mutate.setColorFilter(new PorterDuffColorFilter(k6.w0(null, i10, false), PorterDuff.Mode.MULTIPLY));
        this.a = new or(mutate, new tp(k6.w0(null, i10, false)));
        this.b = this.actionBar.n().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.a);
        V(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(k6.w0(null, k6.a7, false));
        v vVar = new v(this, new u9(this, 18));
        this.d = vVar;
        vVar.h = this.v;
        TL_account.TL_businessAwayMessage tL_businessAwayMessage = this.n;
        vVar.j(tL_businessAwayMessage == null ? null : tL_businessAwayMessage.recipients);
        h61 h61Var = new h61(this, new c4(this, 16), new a(this, 0), null);
        this.c = h61Var;
        h61Var.o1();
        h61 h61Var2 = this.c;
        h61Var2.V2.r = false;
        frameLayout.addView(h61Var2, c6.c(-1.0f, -1));
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
            h61 h61Var = this.c;
            if (h61Var != null && (w51Var = h61Var.V2) != null) {
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
            alertDialog$Builder.a.Q = LocaleController.getString(R.string.BusinessAwayUnsavedChanges);
            alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new a(this, 1));
            alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new a(this, 2));
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
