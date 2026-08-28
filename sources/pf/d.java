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
public final class d extends o2 implements NotificationCenter.NotificationCenterDelegate {
    public int A;
    public int B;
    public int C;
    public fr a;
    public org.telegram.ui.ActionBar.w0 b;
    public i51 c;
    public x d;
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

    public static void T(d dVar, ArrayList arrayList, z41 z41Var) {
        String string = LocaleController.getString(R.string.BusinessAway);
        String string2 = LocaleController.getString(R.string.BusinessAwayInfo);
        l41 l41Var = new l41(2);
        l41Var.l = string;
        l41Var.o = string2;
        l41Var.m = "RestrictedEmoji";
        l41Var.n = "💤";
        arrayList.add(l41Var);
        l41 i9 = l41.i(1, LocaleController.getString(R.string.BusinessAwaySend));
        i9.K(dVar.s);
        arrayList.add(i9);
        arrayList.add(l41.B(null));
        if (dVar.s) {
            q1 d = r1.f(dVar.currentAccount).d("away");
            if (d != null) {
                l41 l41Var2 = new l41(17);
                l41Var2.G = d;
                arrayList.add(l41Var2);
            } else {
                l41 c10 = l41.c(2, R.drawable.msg2_chats_add, LocaleController.getString(R.string.BusinessAwayCreate));
                c10.q = true;
                arrayList.add(c10);
            }
            arrayList.add(l41.B(null));
            j2.l(R.string.BusinessAwaySchedule, arrayList);
            l41 w8 = l41.w(3, LocaleController.getString(R.string.BusinessAwayScheduleAlways));
            w8.K(dVar.x == 0);
            arrayList.add(w8);
            if (dVar.e) {
                l41 w10 = l41.w(4, LocaleController.getString(R.string.BusinessAwayScheduleOutsideHours));
                w10.K(dVar.x == 1);
                arrayList.add(w10);
            }
            l41 w11 = l41.w(5, LocaleController.getString(R.string.BusinessAwayScheduleCustom));
            w11.K(dVar.x == 2);
            arrayList.add(w11);
            if (dVar.x == 2) {
                arrayList.add(l41.B(null));
                j2.l(R.string.BusinessAwaySchedule, arrayList);
                arrayList.add(l41.f(LocaleController.getString(R.string.BusinessAwayScheduleCustomStart), LocaleController.formatShortDateTime(dVar.B), 8));
                arrayList.add(l41.f(LocaleController.getString(R.string.BusinessAwayScheduleCustomEnd), LocaleController.formatShortDateTime(dVar.C), 9));
            }
            arrayList.add(l41.B(null));
            l41 i10 = l41.i(10, LocaleController.getString(R.string.BusinessAwayOnlyOffline));
            i10.K(dVar.w);
            arrayList.add(i10);
            j2.y(R.string.BusinessAwayOnlyOfflineInfo, arrayList);
            j2.l(R.string.BusinessRecipients, arrayList);
            l41 w12 = l41.w(6, LocaleController.getString(R.string.BusinessChatsAllPrivateExcept2));
            w12.K(dVar.v);
            arrayList.add(w12);
            l41 w13 = l41.w(7, LocaleController.getString(R.string.BusinessChatsOnlySelected2));
            w13.K(!dVar.v);
            arrayList.add(w13);
            arrayList.add(l41.B(null));
            dVar.d.a(arrayList, z41Var, true);
            arrayList.add(l41.B(null));
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
        if (this.f) {
            boolean z10 = this.s;
            TL_account.TL_businessAwayMessage tL_businessAwayMessage = this.n;
            if (z10 == (tL_businessAwayMessage != null)) {
                if (z10 && tL_businessAwayMessage != null) {
                    if (tL_businessAwayMessage.recipients.exclude_selected == this.v && ((xVar = this.d) == null || !xVar.g())) {
                        int i9 = this.r;
                        int i10 = this.x;
                        if (i9 == i10 && this.n.offline_only == this.w && (i10 != 2 || (this.y == this.B && this.A == this.C))) {
                        }
                    }
                }
            }
            return true;
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
        q1 d = r1.f(this.currentAccount).d("away");
        boolean z10 = this.s;
        if (z10 && d == null) {
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            View y12 = this.c.y1(2);
            int i9 = -this.h;
            this.h = i9;
            AndroidUtilities.shakeViewSpring(y12, i9);
            i51 i51Var = this.c;
            i51Var.x0(i51Var.x1(2));
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
                int i10 = this.x;
                if (i10 == 0) {
                    updatebusinessawaymessage.message.schedule = new TL_account.TL_businessAwayMessageScheduleAlways();
                } else if (i10 == 1) {
                    updatebusinessawaymessage.message.schedule = new TL_account.TL_businessAwayMessageScheduleOutsideWorkHours();
                } else if (i10 == 2) {
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
            getConnectionsManager().sendRequest(updatebusinessawaymessage, new bf.a(this, 22));
            getMessagesStorage().updateUserInfo(userFull, false);
        }
    }

    public final void X() {
        i51 i51Var;
        z41 z41Var;
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
        x xVar = this.d;
        if (xVar != null) {
            xVar.j(tL_businessAwayMessage == null ? null : tL_businessAwayMessage.recipients);
        }
        TL_account.TL_businessAwayMessage tL_businessAwayMessage2 = this.n;
        if (tL_businessAwayMessage2 != null) {
            TL_account.BusinessAwayMessageSchedule businessAwayMessageSchedule = tL_businessAwayMessage2.schedule;
            if (businessAwayMessageSchedule instanceof TL_account.TL_businessAwayMessageScheduleCustom) {
                this.r = 2;
                this.x = 2;
                TL_account.TL_businessAwayMessageScheduleCustom tL_businessAwayMessageScheduleCustom = (TL_account.TL_businessAwayMessageScheduleCustom) businessAwayMessageSchedule;
                int i9 = tL_businessAwayMessageScheduleCustom.start_date;
                this.y = i9;
                this.B = i9;
                int i10 = tL_businessAwayMessageScheduleCustom.end_date;
                this.A = i10;
                this.C = i10;
                i51Var = this.c;
                if (i51Var != null && (z41Var = i51Var.U2) != null) {
                    z41Var.N(true);
                }
                U(true);
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
        i51Var = this.c;
        if (i51Var != null) {
            z41Var.N(true);
        }
        U(true);
        this.f = true;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.BusinessAway));
        this.actionBar.setActionBarMenuOnItemClick(new xe1(this, 5));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i9 = f6.v8;
        mutate.setColorFilter(new PorterDuffColorFilter(f6.w0(null, i9, false), PorterDuff.Mode.MULTIPLY));
        this.a = new fr(mutate, new jp(f6.w0(null, i9, false)));
        this.b = this.actionBar.n().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.a);
        U(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(f6.w0(null, f6.a7, false));
        x xVar = new x(this, new m2(this, 23));
        this.d = xVar;
        xVar.h = this.v;
        TL_account.TL_businessAwayMessage tL_businessAwayMessage = this.n;
        xVar.j(tL_businessAwayMessage == null ? null : tL_businessAwayMessage.recipients);
        i51 i51Var = new i51(this, new b8(this, 15), new b(this, 0), null);
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
