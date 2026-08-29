package sf;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import i7.f6;
import java.util.ArrayList;
import nh.t4;
import nh.v7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.x3;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Cells.p8;
import org.telegram.ui.Cells.y1;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ir;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.w41;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.n31;
import org.telegram.ui.th;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class l0 extends o2 {
    public static final int Q = -1;
    public static final int R = -2;
    public static final int S = -3;
    public static final int T = -4;
    public static final int U = -5;
    public static final int V = -6;
    public static final int W = -7;
    public static final int X = -8;
    public static final int Y = -9;
    public static final int Z = -10;
    public static final int a0 = -11;
    public static final int b0 = -12;
    public static final int c0 = -13;
    public static final int d0 = -14;
    public static final int e0 = -15;
    public static final int f0 = -16;
    public static final int g0 = -17;
    public static final int h0 = -18;
    public static final int i0 = -19;
    public static final int j0 = -20;
    public static final int k0 = -21;
    public int A;
    public final h0 B;
    public TL_account.connectedBots C;
    public TL_account.TL_connectedBot D;
    public boolean E;
    public TL_account.TL_businessBotRights F;
    public boolean G;
    public boolean H;
    public TLRPC.User I;
    public final LongSparseArray J;
    public int K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public ir a;
    public org.telegram.ui.ActionBar.w0 b;
    public u51 c;
    public rf.k1 d;
    public FrameLayout e;
    public EditTextBoldCursor f;
    public View h;
    public n31 n;
    public TextView r;
    public ImageView s;
    public w v;
    public boolean w;
    public boolean x;
    public String y;

    public l0() {
        super(null);
        this.A = 0;
        this.B = new h0(this, 4);
        this.F = TL_account.TL_businessBotRights.makeDefault();
        this.I = null;
        this.J = new LongSparseArray();
        this.K = -4;
        this.L = true;
        this.M = false;
        this.N = false;
    }

    public static void U(l0 l0Var, TLRPC.TL_error tL_error, TLObject tLObject, int[] iArr, ArrayList arrayList, boolean z10, TLRPC.User user) {
        o2 U2;
        if (tL_error != null) {
            l0Var.a.a(0.0f);
            tc.b0(tL_error);
            return;
        }
        if (tLObject instanceof TLRPC.TL_boolFalse) {
            l0Var.a.a(0.0f);
            x3.s(R.string.UnknownError, tc.a0(l0Var), null);
            return;
        }
        if (tLObject instanceof TLRPC.Updates) {
            Utilities.stageQueue.postRunnable(new org.telegram.ui.web.y(28, l0Var, tLObject));
        }
        int i10 = iArr[0] + 1;
        iArr[0] = i10;
        if (i10 == arrayList.size()) {
            g.a(l0Var.currentAccount).b();
            l0Var.getMessagesController().clearFullUsers();
            l0Var.finishFragment();
            if (!z10 || user == null) {
                if (user == null || (U2 = LaunchActivity.U()) == null) {
                    return;
                }
                th.r(R.string.BusinessBotUpdated, new Object[]{UserObject.getUserName(user)}, tc.a0(U2), R.raw.contact_check, 36);
                return;
            }
            o2 U3 = LaunchActivity.U();
            if (U3 != null) {
                th.r(R.string.BusinessBotDone, new Object[]{UserObject.getUserName(user)}, tc.a0(U3), R.raw.contact_check, 36);
            }
        }
    }

    public static void W(final l0 l0Var, w41 w41Var, final View view) {
        if (w41Var.g && !l0Var.v.h(w41Var)) {
            int i10 = w41Var.d;
            if (i10 == Q) {
                w wVar = l0Var.v;
                l0Var.E = true;
                wVar.h = true;
                l0Var.c.U2.N(true);
                l0Var.Y(true);
                return;
            }
            if (i10 == R) {
                w wVar2 = l0Var.v;
                l0Var.E = false;
                wVar2.h = false;
                l0Var.c.U2.N(true);
                l0Var.Y(true);
                return;
            }
            if (i10 == S) {
                l0Var.I = null;
                l0Var.c.U2.N(true);
                l0Var.Y(true);
                return;
            }
            if (w41Var.a == 13) {
                TLRPC.User user = (TLRPC.User) l0Var.J.get(w41Var.x);
                if (user == null) {
                    return;
                }
                if (user.bot_business) {
                    l0Var.I = user;
                    AndroidUtilities.hideKeyboard(l0Var.f);
                    l0Var.c.U2.N(true);
                    l0Var.Y(true);
                    return;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(l0Var.getParentActivity(), 0, l0Var.resourceProvider);
                alertDialog$Builder.a.N = LocaleController.getString(R.string.BusinessBotNotSupportedTitle);
                alertDialog$Builder.a.P = AndroidUtilities.replaceTags(LocaleController.getString(R.string.BusinessBotNotSupportedMessage));
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                l0Var.showDialog(alertDialog$Builder.a);
                return;
            }
            if (i10 == T) {
                boolean z10 = !l0Var.L;
                l0Var.L = z10;
                ((p8) view).setChecked(z10);
                l0Var.c.U2.N(true);
                return;
            }
            if (i10 == U) {
                int i11 = -l0Var.K;
                l0Var.K = i11;
                AndroidUtilities.shakeViewSpring(view, i11);
                return;
            }
            if (i10 == V) {
                TL_account.TL_businessBotRights tL_businessBotRights = l0Var.F;
                boolean z11 = !tL_businessBotRights.reply;
                tL_businessBotRights.reply = z11;
                ((y1) view).c(z11, true);
                l0Var.c.U2.N(true);
                l0Var.Y(true);
                return;
            }
            if (i10 == W) {
                TL_account.TL_businessBotRights tL_businessBotRights2 = l0Var.F;
                boolean z12 = !tL_businessBotRights2.read_messages;
                tL_businessBotRights2.read_messages = z12;
                ((y1) view).c(z12, true);
                l0Var.c.U2.N(true);
                l0Var.Y(true);
                return;
            }
            if (i10 == X) {
                TL_account.TL_businessBotRights tL_businessBotRights3 = l0Var.F;
                boolean z13 = !tL_businessBotRights3.delete_sent_messages;
                tL_businessBotRights3.delete_sent_messages = z13;
                ((y1) view).c(z13, true);
                l0Var.c.U2.N(true);
                l0Var.Y(true);
                return;
            }
            if (i10 == Y) {
                TL_account.TL_businessBotRights tL_businessBotRights4 = l0Var.F;
                boolean z14 = !tL_businessBotRights4.delete_received_messages;
                tL_businessBotRights4.delete_received_messages = z14;
                ((y1) view).c(z14, true);
                l0Var.c.U2.N(true);
                l0Var.Y(true);
                return;
            }
            if (i10 == Z) {
                boolean z15 = !l0Var.M;
                l0Var.M = z15;
                ((p8) view).setChecked(z15);
                l0Var.c.U2.N(true);
                return;
            }
            if (i10 == a0) {
                TL_account.TL_businessBotRights tL_businessBotRights5 = l0Var.F;
                boolean z16 = !tL_businessBotRights5.edit_name;
                tL_businessBotRights5.edit_name = z16;
                ((y1) view).c(z16, true);
                l0Var.c.U2.N(true);
                l0Var.Y(true);
                return;
            }
            if (i10 == b0) {
                TL_account.TL_businessBotRights tL_businessBotRights6 = l0Var.F;
                boolean z17 = !tL_businessBotRights6.edit_bio;
                tL_businessBotRights6.edit_bio = z17;
                ((y1) view).c(z17, true);
                l0Var.c.U2.N(true);
                l0Var.Y(true);
                return;
            }
            if (i10 == c0) {
                TL_account.TL_businessBotRights tL_businessBotRights7 = l0Var.F;
                boolean z18 = !tL_businessBotRights7.edit_profile_photo;
                tL_businessBotRights7.edit_profile_photo = z18;
                ((y1) view).c(z18, true);
                l0Var.c.U2.N(true);
                l0Var.Y(true);
                return;
            }
            if (i10 == d0) {
                final int i12 = 5;
                l0Var.X(i10, !l0Var.F.edit_username, new Runnable(l0Var) { // from class: sf.g0
                    public final /* synthetic */ l0 b;

                    {
                        this.b = l0Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                l0 l0Var2 = this.b;
                                l0Var2.getClass();
                                y1 y1Var = (y1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights8 = l0Var2.F;
                                boolean z19 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z19;
                                y1Var.c(z19, true);
                                l0Var2.c.U2.N(true);
                                l0Var2.Y(true);
                                break;
                            case 1:
                                l0 l0Var3 = this.b;
                                l0Var3.getClass();
                                y1 y1Var2 = (y1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights9 = l0Var3.F;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                y1Var2.c(z20, true);
                                l0Var3.c.U2.N(true);
                                l0Var3.Y(true);
                                break;
                            case 2:
                                l0 l0Var4 = this.b;
                                l0Var4.getClass();
                                y1 y1Var3 = (y1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights10 = l0Var4.F;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                y1Var3.c(z21, true);
                                l0Var4.c.U2.N(true);
                                l0Var4.Y(true);
                                break;
                            case 3:
                                l0 l0Var5 = this.b;
                                l0Var5.getClass();
                                y1 y1Var4 = (y1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights11 = l0Var5.F;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                y1Var4.c(z22, true);
                                l0Var5.c.U2.N(true);
                                l0Var5.Y(true);
                                break;
                            case 4:
                                l0 l0Var6 = this.b;
                                l0Var6.getClass();
                                y1 y1Var5 = (y1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights12 = l0Var6.F;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                y1Var5.c(z23, true);
                                l0Var6.c.U2.N(true);
                                l0Var6.Y(true);
                                break;
                            default:
                                l0 l0Var7 = this.b;
                                l0Var7.getClass();
                                y1 y1Var6 = (y1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights13 = l0Var7.F;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                y1Var6.c(z24, true);
                                l0Var7.c.U2.N(true);
                                l0Var7.Y(true);
                                break;
                        }
                    }
                });
                return;
            }
            if (i10 == e0) {
                boolean z19 = !l0Var.N;
                l0Var.N = z19;
                ((p8) view).setChecked(z19);
                l0Var.c.U2.N(true);
                return;
            }
            if (i10 == f0) {
                final int i13 = 0;
                l0Var.X(i10, !l0Var.F.view_gifts, new Runnable(l0Var) { // from class: sf.g0
                    public final /* synthetic */ l0 b;

                    {
                        this.b = l0Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i13) {
                            case 0:
                                l0 l0Var2 = this.b;
                                l0Var2.getClass();
                                y1 y1Var = (y1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights8 = l0Var2.F;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                y1Var.c(z192, true);
                                l0Var2.c.U2.N(true);
                                l0Var2.Y(true);
                                break;
                            case 1:
                                l0 l0Var3 = this.b;
                                l0Var3.getClass();
                                y1 y1Var2 = (y1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights9 = l0Var3.F;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                y1Var2.c(z20, true);
                                l0Var3.c.U2.N(true);
                                l0Var3.Y(true);
                                break;
                            case 2:
                                l0 l0Var4 = this.b;
                                l0Var4.getClass();
                                y1 y1Var3 = (y1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights10 = l0Var4.F;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                y1Var3.c(z21, true);
                                l0Var4.c.U2.N(true);
                                l0Var4.Y(true);
                                break;
                            case 3:
                                l0 l0Var5 = this.b;
                                l0Var5.getClass();
                                y1 y1Var4 = (y1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights11 = l0Var5.F;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                y1Var4.c(z22, true);
                                l0Var5.c.U2.N(true);
                                l0Var5.Y(true);
                                break;
                            case 4:
                                l0 l0Var6 = this.b;
                                l0Var6.getClass();
                                y1 y1Var5 = (y1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights12 = l0Var6.F;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                y1Var5.c(z23, true);
                                l0Var6.c.U2.N(true);
                                l0Var6.Y(true);
                                break;
                            default:
                                l0 l0Var7 = this.b;
                                l0Var7.getClass();
                                y1 y1Var6 = (y1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights13 = l0Var7.F;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                y1Var6.c(z24, true);
                                l0Var7.c.U2.N(true);
                                l0Var7.Y(true);
                                break;
                        }
                    }
                });
                return;
            }
            if (i10 == g0) {
                final int i14 = 1;
                l0Var.X(i10, !l0Var.F.sell_gifts, new Runnable(l0Var) { // from class: sf.g0
                    public final /* synthetic */ l0 b;

                    {
                        this.b = l0Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i14) {
                            case 0:
                                l0 l0Var2 = this.b;
                                l0Var2.getClass();
                                y1 y1Var = (y1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights8 = l0Var2.F;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                y1Var.c(z192, true);
                                l0Var2.c.U2.N(true);
                                l0Var2.Y(true);
                                break;
                            case 1:
                                l0 l0Var3 = this.b;
                                l0Var3.getClass();
                                y1 y1Var2 = (y1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights9 = l0Var3.F;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                y1Var2.c(z20, true);
                                l0Var3.c.U2.N(true);
                                l0Var3.Y(true);
                                break;
                            case 2:
                                l0 l0Var4 = this.b;
                                l0Var4.getClass();
                                y1 y1Var3 = (y1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights10 = l0Var4.F;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                y1Var3.c(z21, true);
                                l0Var4.c.U2.N(true);
                                l0Var4.Y(true);
                                break;
                            case 3:
                                l0 l0Var5 = this.b;
                                l0Var5.getClass();
                                y1 y1Var4 = (y1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights11 = l0Var5.F;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                y1Var4.c(z22, true);
                                l0Var5.c.U2.N(true);
                                l0Var5.Y(true);
                                break;
                            case 4:
                                l0 l0Var6 = this.b;
                                l0Var6.getClass();
                                y1 y1Var5 = (y1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights12 = l0Var6.F;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                y1Var5.c(z23, true);
                                l0Var6.c.U2.N(true);
                                l0Var6.Y(true);
                                break;
                            default:
                                l0 l0Var7 = this.b;
                                l0Var7.getClass();
                                y1 y1Var6 = (y1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights13 = l0Var7.F;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                y1Var6.c(z24, true);
                                l0Var7.c.U2.N(true);
                                l0Var7.Y(true);
                                break;
                        }
                    }
                });
                return;
            }
            if (i10 == h0) {
                final int i15 = 2;
                l0Var.X(i10, !l0Var.F.change_gift_settings, new Runnable(l0Var) { // from class: sf.g0
                    public final /* synthetic */ l0 b;

                    {
                        this.b = l0Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i15) {
                            case 0:
                                l0 l0Var2 = this.b;
                                l0Var2.getClass();
                                y1 y1Var = (y1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights8 = l0Var2.F;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                y1Var.c(z192, true);
                                l0Var2.c.U2.N(true);
                                l0Var2.Y(true);
                                break;
                            case 1:
                                l0 l0Var3 = this.b;
                                l0Var3.getClass();
                                y1 y1Var2 = (y1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights9 = l0Var3.F;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                y1Var2.c(z20, true);
                                l0Var3.c.U2.N(true);
                                l0Var3.Y(true);
                                break;
                            case 2:
                                l0 l0Var4 = this.b;
                                l0Var4.getClass();
                                y1 y1Var3 = (y1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights10 = l0Var4.F;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                y1Var3.c(z21, true);
                                l0Var4.c.U2.N(true);
                                l0Var4.Y(true);
                                break;
                            case 3:
                                l0 l0Var5 = this.b;
                                l0Var5.getClass();
                                y1 y1Var4 = (y1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights11 = l0Var5.F;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                y1Var4.c(z22, true);
                                l0Var5.c.U2.N(true);
                                l0Var5.Y(true);
                                break;
                            case 4:
                                l0 l0Var6 = this.b;
                                l0Var6.getClass();
                                y1 y1Var5 = (y1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights12 = l0Var6.F;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                y1Var5.c(z23, true);
                                l0Var6.c.U2.N(true);
                                l0Var6.Y(true);
                                break;
                            default:
                                l0 l0Var7 = this.b;
                                l0Var7.getClass();
                                y1 y1Var6 = (y1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights13 = l0Var7.F;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                y1Var6.c(z24, true);
                                l0Var7.c.U2.N(true);
                                l0Var7.Y(true);
                                break;
                        }
                    }
                });
                return;
            }
            if (i10 == i0) {
                final int i16 = 3;
                l0Var.X(i10, !l0Var.F.transfer_and_upgrade_gifts, new Runnable(l0Var) { // from class: sf.g0
                    public final /* synthetic */ l0 b;

                    {
                        this.b = l0Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i16) {
                            case 0:
                                l0 l0Var2 = this.b;
                                l0Var2.getClass();
                                y1 y1Var = (y1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights8 = l0Var2.F;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                y1Var.c(z192, true);
                                l0Var2.c.U2.N(true);
                                l0Var2.Y(true);
                                break;
                            case 1:
                                l0 l0Var3 = this.b;
                                l0Var3.getClass();
                                y1 y1Var2 = (y1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights9 = l0Var3.F;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                y1Var2.c(z20, true);
                                l0Var3.c.U2.N(true);
                                l0Var3.Y(true);
                                break;
                            case 2:
                                l0 l0Var4 = this.b;
                                l0Var4.getClass();
                                y1 y1Var3 = (y1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights10 = l0Var4.F;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                y1Var3.c(z21, true);
                                l0Var4.c.U2.N(true);
                                l0Var4.Y(true);
                                break;
                            case 3:
                                l0 l0Var5 = this.b;
                                l0Var5.getClass();
                                y1 y1Var4 = (y1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights11 = l0Var5.F;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                y1Var4.c(z22, true);
                                l0Var5.c.U2.N(true);
                                l0Var5.Y(true);
                                break;
                            case 4:
                                l0 l0Var6 = this.b;
                                l0Var6.getClass();
                                y1 y1Var5 = (y1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights12 = l0Var6.F;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                y1Var5.c(z23, true);
                                l0Var6.c.U2.N(true);
                                l0Var6.Y(true);
                                break;
                            default:
                                l0 l0Var7 = this.b;
                                l0Var7.getClass();
                                y1 y1Var6 = (y1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights13 = l0Var7.F;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                y1Var6.c(z24, true);
                                l0Var7.c.U2.N(true);
                                l0Var7.Y(true);
                                break;
                        }
                    }
                });
            } else if (i10 == j0) {
                final int i17 = 4;
                l0Var.X(i10, !l0Var.F.transfer_stars, new Runnable(l0Var) { // from class: sf.g0
                    public final /* synthetic */ l0 b;

                    {
                        this.b = l0Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i17) {
                            case 0:
                                l0 l0Var2 = this.b;
                                l0Var2.getClass();
                                y1 y1Var = (y1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights8 = l0Var2.F;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                y1Var.c(z192, true);
                                l0Var2.c.U2.N(true);
                                l0Var2.Y(true);
                                break;
                            case 1:
                                l0 l0Var3 = this.b;
                                l0Var3.getClass();
                                y1 y1Var2 = (y1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights9 = l0Var3.F;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                y1Var2.c(z20, true);
                                l0Var3.c.U2.N(true);
                                l0Var3.Y(true);
                                break;
                            case 2:
                                l0 l0Var4 = this.b;
                                l0Var4.getClass();
                                y1 y1Var3 = (y1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights10 = l0Var4.F;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                y1Var3.c(z21, true);
                                l0Var4.c.U2.N(true);
                                l0Var4.Y(true);
                                break;
                            case 3:
                                l0 l0Var5 = this.b;
                                l0Var5.getClass();
                                y1 y1Var4 = (y1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights11 = l0Var5.F;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                y1Var4.c(z22, true);
                                l0Var5.c.U2.N(true);
                                l0Var5.Y(true);
                                break;
                            case 4:
                                l0 l0Var6 = this.b;
                                l0Var6.getClass();
                                y1 y1Var5 = (y1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights12 = l0Var6.F;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                y1Var5.c(z23, true);
                                l0Var6.c.U2.N(true);
                                l0Var6.Y(true);
                                break;
                            default:
                                l0 l0Var7 = this.b;
                                l0Var7.getClass();
                                y1 y1Var6 = (y1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights13 = l0Var7.F;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                y1Var6.c(z24, true);
                                l0Var7.c.U2.N(true);
                                l0Var7.Y(true);
                                break;
                        }
                    }
                });
            } else if (i10 == k0) {
                l0Var.X(i10, !l0Var.F.manage_stories, new h0(l0Var, 0));
            }
        }
    }

    public final void X(int i10, boolean z10, final Runnable runnable) {
        final int i11 = 1;
        final int i12 = 0;
        if (!this.G && i10 == d0 && z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
            String string = LocaleController.getString(R.string.BusinessBotPermissionsWarning);
            c2 c2Var = alertDialog$Builder.a;
            c2Var.N = string;
            c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BusinessBotPermissionsUsernamesWarningText, UserObject.getPublicUsername(this.I)));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.k(LocaleController.getString(R.string.Allow), new b2(this) { // from class: sf.k0
                public final /* synthetic */ l0 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.b2
                public final void g(c2 c2Var2, int i13) {
                    switch (i12) {
                        case 0:
                            this.b.G = true;
                            runnable.run();
                            break;
                        default:
                            this.b.H = true;
                            runnable.run();
                            break;
                    }
                }
            });
            alertDialog$Builder.d(-1);
            alertDialog$Builder.o();
            return;
        }
        if (this.H || !z10 || (i10 != g0 && i10 != h0 && i10 != i0 && i10 != j0)) {
            runnable.run();
            return;
        }
        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
        String string2 = LocaleController.getString(R.string.BusinessBotPermissionsWarning);
        c2 c2Var2 = alertDialog$Builder2.a;
        c2Var2.N = string2;
        c2Var2.P = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BusinessBotPermissionsGiftsWarningText, UserObject.getPublicUsername(this.I)));
        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder2.k(LocaleController.getString(R.string.Allow), new b2(this) { // from class: sf.k0
            public final /* synthetic */ l0 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.b2
            public final void g(c2 c2Var22, int i13) {
                switch (i11) {
                    case 0:
                        this.b.G = true;
                        runnable.run();
                        break;
                    default:
                        this.b.H = true;
                        runnable.run();
                        break;
                }
            }
        });
        alertDialog$Builder2.d(-1);
        alertDialog$Builder2.o();
    }

    public final void Y(boolean z10) {
        if (this.b == null) {
            return;
        }
        boolean Z2 = Z();
        this.b.setEnabled(Z2);
        if (z10) {
            this.b.animate().alpha(Z2 ? 1.0f : 0.0f).scaleX(Z2 ? 1.0f : 0.0f).scaleY(Z2 ? 1.0f : 0.0f).setDuration(180L).start();
            return;
        }
        this.b.setAlpha(Z2 ? 1.0f : 0.0f);
        this.b.setScaleX(Z2 ? 1.0f : 0.0f);
        this.b.setScaleY(Z2 ? 1.0f : 0.0f);
    }

    public final boolean Z() {
        w wVar;
        if (this.P) {
            TLRPC.User user = this.I;
            boolean z10 = user != null;
            TL_account.TL_connectedBot tL_connectedBot = this.D;
            if (z10 == (tL_connectedBot != null)) {
                if ((user == null ? 0L : user.id) == (tL_connectedBot != null ? tL_connectedBot.bot_id : 0L) && (user == null || (this.F.equals(tL_connectedBot.rights) && ((wVar = this.v) == null || !wVar.g())))) {
                }
            }
            return true;
        }
        return false;
    }

    public final void a0() {
        TLRPC.User user;
        TL_account.TL_connectedBot tL_connectedBot;
        if (this.a.c > 0.0f) {
            return;
        }
        if (!Z()) {
            finishFragment();
            return;
        }
        if (this.v.k(this.c)) {
            TLRPC.User user2 = this.I;
            boolean z10 = user2 != null && ((tL_connectedBot = this.D) == null || tL_connectedBot.bot_id != user2.id);
            ArrayList arrayList = new ArrayList();
            TL_account.TL_connectedBot tL_connectedBot2 = this.D;
            if (tL_connectedBot2 != null && ((user = this.I) == null || tL_connectedBot2.bot_id != user.id)) {
                TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
                updateconnectedbot.deleted = true;
                updateconnectedbot.bot = getMessagesController().getInputUser(this.D.bot_id);
                updateconnectedbot.recipients = new TL_account.TL_inputBusinessBotRecipients();
                arrayList.add(updateconnectedbot);
            }
            if (this.I != null) {
                TL_account.updateConnectedBot updateconnectedbot2 = new TL_account.updateConnectedBot();
                updateconnectedbot2.deleted = false;
                updateconnectedbot2.rights = this.F;
                updateconnectedbot2.bot = getMessagesController().getInputUser(this.I);
                updateconnectedbot2.recipients = this.v.b();
                arrayList.add(updateconnectedbot2);
                TL_account.TL_connectedBot tL_connectedBot3 = this.D;
                if (tL_connectedBot3 != null) {
                    tL_connectedBot3.bot_id = this.I.id;
                    tL_connectedBot3.recipients = this.v.c();
                    this.D.rights = this.F;
                }
            }
            if (arrayList.isEmpty()) {
                finishFragment();
                return;
            }
            int[] iArr = {0};
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                getConnectionsManager().sendRequest((TLObject) arrayList.get(i10), new hh.g(this, iArr, arrayList, z10, user2));
            }
        }
    }

    public final void b0() {
        boolean z10 = this.w;
        boolean e10 = this.d.e();
        boolean z11 = true;
        LongSparseArray longSparseArray = this.J;
        if (z10 != (e10 || this.x || longSparseArray.size() > 0)) {
            if (!this.d.e() && !this.x && longSparseArray.size() <= 0) {
                z11 = false;
            }
            this.w = z11;
            ViewPropertyAnimator duration = this.r.animate().alpha(z11 ? 0.0f : 1.0f).translationY(z11 ? -AndroidUtilities.dp(8.0f) : 0.0f).setDuration(320L);
            jr jrVar = jr.h;
            duration.setInterpolator(jrVar).start();
            this.s.animate().alpha(z11 ? 1.0f : 0.0f).translationY(z11 ? 0.0f : AndroidUtilities.dp(8.0f)).setDuration(320L).setInterpolator(jrVar).start();
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.BusinessBots2));
        this.actionBar.setActionBarMenuOnItemClick(new qh.e(this, 8));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i10 = g6.v8;
        mutate.setColorFilter(new PorterDuffColorFilter(g6.w0(null, i10, false), PorterDuff.Mode.MULTIPLY));
        this.a = new ir(mutate, new np(g6.w0(null, i10, false)));
        this.b = this.actionBar.n().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.a);
        Y(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(g6.w0(null, g6.a7, false));
        new LinearLayout(getParentActivity()).setOrientation(0);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(getParentActivity());
        this.f = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 17.0f);
        this.f.setHintTextColor(g6.w0(null, g6.H6, false));
        EditTextBoldCursor editTextBoldCursor2 = this.f;
        int i11 = g6.G6;
        editTextBoldCursor2.setTextColor(g6.w0(null, i11, false));
        this.f.setBackgroundDrawable(null);
        this.f.setMaxLines(1);
        this.f.setLines(1);
        this.f.setPadding(0, 0, 0, 0);
        this.f.setSingleLine(true);
        this.f.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        this.f.setInputType(180224);
        this.f.setImeOptions(6);
        this.f.setHint(LocaleController.getString(R.string.BusinessBotLink));
        this.f.setCursorColor(g6.w0(null, i11, false));
        this.f.setCursorSize(AndroidUtilities.dp(19.0f));
        this.f.setCursorWidth(1.5f);
        this.f.setOnEditorActionListener(new jh.j(this, 1));
        this.f.addTextChangedListener(new bh.c(this, 18));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.e = frameLayout2;
        frameLayout2.addView(this.f, f6.d(-1, -1.0f, 48, 21.0f, 15.0f, 21.0f, 15.0f));
        FrameLayout frameLayout3 = this.e;
        int i12 = g6.d6;
        frameLayout3.setBackgroundColor(getThemedColor(i12));
        View view = new View(context);
        this.h = view;
        view.setBackgroundColor(getThemedColor(g6.d7));
        FrameLayout frameLayout4 = this.e;
        View view2 = this.h;
        float f9 = 1.0f / AndroidUtilities.density;
        boolean z10 = LocaleController.isRTL;
        frameLayout4.addView(view2, f6.d(-1, f9, 87, z10 ? 0 : 21, 0.0f, z10 ? 21 : 0, 0.0f));
        n31 n31Var = new n31(context, 10);
        this.n = n31Var;
        n31Var.setBackgroundColor(getThemedColor(i12));
        TextView textView = new TextView(context);
        this.r = textView;
        textView.setText(LocaleController.getString(R.string.BusinessBotNotFound));
        this.r.setTextSize(1, 14.0f);
        TextView textView2 = this.r;
        int i13 = g6.z6;
        textView2.setTextColor(getThemedColor(i13));
        this.n.addView(this.r, f6.e(-2, -2, 17));
        this.s = new ImageView(context);
        v7 v7Var = new v7(getThemedColor(i13));
        this.s.setScaleType(ImageView.ScaleType.CENTER);
        this.s.setImageDrawable(v7Var);
        this.n.addView(this.s, f6.e(-2, -2, 17));
        this.s.setAlpha(0.0f);
        this.s.setTranslationY(AndroidUtilities.dp(8.0f));
        rf.k1 k1Var = new rf.k1(true);
        this.d = k1Var;
        k1Var.a = new o1.a(this, 21);
        w wVar = new w(this, new h0(this, 3));
        this.v = wVar;
        TL_account.TL_connectedBot tL_connectedBot = this.D;
        wVar.i(tL_connectedBot == null ? null : tL_connectedBot.recipients);
        u51 u51Var = new u51(this, new t4(this, 19), new j0(this, 3), null);
        this.c = u51Var;
        u51Var.p1();
        u51 u51Var2 = this.c;
        u51Var2.U2.r = false;
        frameLayout.addView(u51Var2, f6.c(-1.0f, -1));
        this.actionBar.A(this.c, true);
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onBackPressed(boolean z10) {
        if (Z()) {
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.a.N = LocaleController.getString(R.string.UnsavedChanges);
                alertDialog$Builder.a.P = LocaleController.getString(R.string.BusinessBotUnsavedChanges);
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new j0(this, 0));
                alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new j0(this, 1));
                showDialog(alertDialog$Builder.a);
                return false;
            }
        } else {
            if (this.I != null || Z() || (this.d.d.isEmpty() && this.d.e.isEmpty())) {
                return super.onBackPressed(z10);
            }
            if (z10) {
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder2.a.N = LocaleController.getString(R.string.BusinessBotNoAddedTitle);
                alertDialog$Builder2.a.P = LocaleController.getString(R.string.BusinessBotNoAddedText);
                alertDialog$Builder2.k(LocaleController.getString(R.string.BusinessBotNoAddedButton), new j0(this, 2));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                showDialog(alertDialog$Builder2.a);
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        if (!this.O && !this.P) {
            this.O = true;
            g.a(this.currentAccount).c(new nh.b0(this, 19));
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.c.setPadding(0, 0, 0, i13);
        this.c.setClipToPadding(false);
    }
}
