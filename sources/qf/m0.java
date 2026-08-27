package qf;

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
import h7.z5;
import java.util.ArrayList;
import lh.a8;
import lh.g8;
import lh.n6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.y1;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.o8;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.dr;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.hp;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.n41;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ed1;
import org.telegram.ui.z71;
import org.telegram.ui.zh1;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class m0 extends n2 {
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
    public final i0 B;
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
    public dr a;
    public org.telegram.ui.ActionBar.v0 b;
    public k51 c;
    public pf.j1 d;
    public FrameLayout e;
    public EditTextBoldCursor f;
    public View h;
    public z71 n;
    public TextView r;
    public ImageView s;
    public x v;
    public boolean w;
    public boolean x;
    public String y;

    public m0() {
        super(null);
        this.A = 0;
        this.B = new i0(this, 4);
        this.F = TL_account.TL_businessBotRights.makeDefault();
        this.I = null;
        this.J = new LongSparseArray();
        this.K = -4;
        this.L = true;
        this.M = false;
        this.N = false;
    }

    public static void U(m0 m0Var, TLRPC.TL_error tL_error, TLObject tLObject, int[] iArr, ArrayList arrayList, boolean z10, TLRPC.User user) {
        n2 U2;
        if (tL_error != null) {
            m0Var.a.a(0.0f);
            mc.b0(tL_error);
            return;
        }
        if (tLObject instanceof TLRPC.TL_boolFalse) {
            m0Var.a.a(0.0f);
            y1.r(R.string.UnknownError, mc.a0(m0Var), null);
            return;
        }
        if (tLObject instanceof TLRPC.Updates) {
            Utilities.stageQueue.postRunnable(new zh1(20, m0Var, tLObject));
        }
        int i10 = iArr[0] + 1;
        iArr[0] = i10;
        if (i10 == arrayList.size()) {
            h.a(m0Var.currentAccount).b();
            m0Var.getMessagesController().clearFullUsers();
            m0Var.finishFragment();
            if (!z10 || user == null) {
                if (user == null || (U2 = LaunchActivity.U()) == null) {
                    return;
                }
                pa.r(R.string.BusinessBotUpdated, new Object[]{UserObject.getUserName(user)}, mc.a0(U2), R.raw.contact_check, 36);
                return;
            }
            n2 U3 = LaunchActivity.U();
            if (U3 != null) {
                pa.r(R.string.BusinessBotDone, new Object[]{UserObject.getUserName(user)}, mc.a0(U3), R.raw.contact_check, 36);
            }
        }
    }

    public static void W(final m0 m0Var, n41 n41Var, final View view) {
        if (n41Var.g && !m0Var.v.h(n41Var)) {
            int i10 = n41Var.d;
            if (i10 == Q) {
                x xVar = m0Var.v;
                m0Var.E = true;
                xVar.h = true;
                m0Var.c.U2.N(true);
                m0Var.Y(true);
                return;
            }
            if (i10 == R) {
                x xVar2 = m0Var.v;
                m0Var.E = false;
                xVar2.h = false;
                m0Var.c.U2.N(true);
                m0Var.Y(true);
                return;
            }
            if (i10 == S) {
                m0Var.I = null;
                m0Var.c.U2.N(true);
                m0Var.Y(true);
                return;
            }
            if (n41Var.a == 13) {
                TLRPC.User user = (TLRPC.User) m0Var.J.get(n41Var.x);
                if (user == null) {
                    return;
                }
                if (user.bot_business) {
                    m0Var.I = user;
                    AndroidUtilities.hideKeyboard(m0Var.f);
                    m0Var.c.U2.N(true);
                    m0Var.Y(true);
                    return;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(m0Var.getParentActivity(), 0, m0Var.resourceProvider);
                alertDialog$Builder.a.N = LocaleController.getString(R.string.BusinessBotNotSupportedTitle);
                alertDialog$Builder.a.P = AndroidUtilities.replaceTags(LocaleController.getString(R.string.BusinessBotNotSupportedMessage));
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                m0Var.showDialog(alertDialog$Builder.a);
                return;
            }
            if (i10 == T) {
                boolean z10 = !m0Var.L;
                m0Var.L = z10;
                ((o8) view).setChecked(z10);
                m0Var.c.U2.N(true);
                return;
            }
            if (i10 == U) {
                int i11 = -m0Var.K;
                m0Var.K = i11;
                AndroidUtilities.shakeViewSpring(view, i11);
                return;
            }
            if (i10 == V) {
                TL_account.TL_businessBotRights tL_businessBotRights = m0Var.F;
                boolean z11 = !tL_businessBotRights.reply;
                tL_businessBotRights.reply = z11;
                ((org.telegram.ui.Cells.y1) view).c(z11, true);
                m0Var.c.U2.N(true);
                m0Var.Y(true);
                return;
            }
            if (i10 == W) {
                TL_account.TL_businessBotRights tL_businessBotRights2 = m0Var.F;
                boolean z12 = !tL_businessBotRights2.read_messages;
                tL_businessBotRights2.read_messages = z12;
                ((org.telegram.ui.Cells.y1) view).c(z12, true);
                m0Var.c.U2.N(true);
                m0Var.Y(true);
                return;
            }
            if (i10 == X) {
                TL_account.TL_businessBotRights tL_businessBotRights3 = m0Var.F;
                boolean z13 = !tL_businessBotRights3.delete_sent_messages;
                tL_businessBotRights3.delete_sent_messages = z13;
                ((org.telegram.ui.Cells.y1) view).c(z13, true);
                m0Var.c.U2.N(true);
                m0Var.Y(true);
                return;
            }
            if (i10 == Y) {
                TL_account.TL_businessBotRights tL_businessBotRights4 = m0Var.F;
                boolean z14 = !tL_businessBotRights4.delete_received_messages;
                tL_businessBotRights4.delete_received_messages = z14;
                ((org.telegram.ui.Cells.y1) view).c(z14, true);
                m0Var.c.U2.N(true);
                m0Var.Y(true);
                return;
            }
            if (i10 == Z) {
                boolean z15 = !m0Var.M;
                m0Var.M = z15;
                ((o8) view).setChecked(z15);
                m0Var.c.U2.N(true);
                return;
            }
            if (i10 == a0) {
                TL_account.TL_businessBotRights tL_businessBotRights5 = m0Var.F;
                boolean z16 = !tL_businessBotRights5.edit_name;
                tL_businessBotRights5.edit_name = z16;
                ((org.telegram.ui.Cells.y1) view).c(z16, true);
                m0Var.c.U2.N(true);
                m0Var.Y(true);
                return;
            }
            if (i10 == b0) {
                TL_account.TL_businessBotRights tL_businessBotRights6 = m0Var.F;
                boolean z17 = !tL_businessBotRights6.edit_bio;
                tL_businessBotRights6.edit_bio = z17;
                ((org.telegram.ui.Cells.y1) view).c(z17, true);
                m0Var.c.U2.N(true);
                m0Var.Y(true);
                return;
            }
            if (i10 == c0) {
                TL_account.TL_businessBotRights tL_businessBotRights7 = m0Var.F;
                boolean z18 = !tL_businessBotRights7.edit_profile_photo;
                tL_businessBotRights7.edit_profile_photo = z18;
                ((org.telegram.ui.Cells.y1) view).c(z18, true);
                m0Var.c.U2.N(true);
                m0Var.Y(true);
                return;
            }
            if (i10 == d0) {
                final int i12 = 5;
                m0Var.X(i10, !m0Var.F.edit_username, new Runnable(m0Var) { // from class: qf.h0
                    public final /* synthetic */ m0 b;

                    {
                        this.b = m0Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                m0 m0Var2 = this.b;
                                m0Var2.getClass();
                                org.telegram.ui.Cells.y1 y1Var = (org.telegram.ui.Cells.y1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights8 = m0Var2.F;
                                boolean z19 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z19;
                                y1Var.c(z19, true);
                                m0Var2.c.U2.N(true);
                                m0Var2.Y(true);
                                break;
                            case 1:
                                m0 m0Var3 = this.b;
                                m0Var3.getClass();
                                org.telegram.ui.Cells.y1 y1Var2 = (org.telegram.ui.Cells.y1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights9 = m0Var3.F;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                y1Var2.c(z20, true);
                                m0Var3.c.U2.N(true);
                                m0Var3.Y(true);
                                break;
                            case 2:
                                m0 m0Var4 = this.b;
                                m0Var4.getClass();
                                org.telegram.ui.Cells.y1 y1Var3 = (org.telegram.ui.Cells.y1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights10 = m0Var4.F;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                y1Var3.c(z21, true);
                                m0Var4.c.U2.N(true);
                                m0Var4.Y(true);
                                break;
                            case 3:
                                m0 m0Var5 = this.b;
                                m0Var5.getClass();
                                org.telegram.ui.Cells.y1 y1Var4 = (org.telegram.ui.Cells.y1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights11 = m0Var5.F;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                y1Var4.c(z22, true);
                                m0Var5.c.U2.N(true);
                                m0Var5.Y(true);
                                break;
                            case 4:
                                m0 m0Var6 = this.b;
                                m0Var6.getClass();
                                org.telegram.ui.Cells.y1 y1Var5 = (org.telegram.ui.Cells.y1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights12 = m0Var6.F;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                y1Var5.c(z23, true);
                                m0Var6.c.U2.N(true);
                                m0Var6.Y(true);
                                break;
                            default:
                                m0 m0Var7 = this.b;
                                m0Var7.getClass();
                                org.telegram.ui.Cells.y1 y1Var6 = (org.telegram.ui.Cells.y1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights13 = m0Var7.F;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                y1Var6.c(z24, true);
                                m0Var7.c.U2.N(true);
                                m0Var7.Y(true);
                                break;
                        }
                    }
                });
                return;
            }
            if (i10 == e0) {
                boolean z19 = !m0Var.N;
                m0Var.N = z19;
                ((o8) view).setChecked(z19);
                m0Var.c.U2.N(true);
                return;
            }
            if (i10 == f0) {
                final int i13 = 0;
                m0Var.X(i10, !m0Var.F.view_gifts, new Runnable(m0Var) { // from class: qf.h0
                    public final /* synthetic */ m0 b;

                    {
                        this.b = m0Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i13) {
                            case 0:
                                m0 m0Var2 = this.b;
                                m0Var2.getClass();
                                org.telegram.ui.Cells.y1 y1Var = (org.telegram.ui.Cells.y1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights8 = m0Var2.F;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                y1Var.c(z192, true);
                                m0Var2.c.U2.N(true);
                                m0Var2.Y(true);
                                break;
                            case 1:
                                m0 m0Var3 = this.b;
                                m0Var3.getClass();
                                org.telegram.ui.Cells.y1 y1Var2 = (org.telegram.ui.Cells.y1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights9 = m0Var3.F;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                y1Var2.c(z20, true);
                                m0Var3.c.U2.N(true);
                                m0Var3.Y(true);
                                break;
                            case 2:
                                m0 m0Var4 = this.b;
                                m0Var4.getClass();
                                org.telegram.ui.Cells.y1 y1Var3 = (org.telegram.ui.Cells.y1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights10 = m0Var4.F;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                y1Var3.c(z21, true);
                                m0Var4.c.U2.N(true);
                                m0Var4.Y(true);
                                break;
                            case 3:
                                m0 m0Var5 = this.b;
                                m0Var5.getClass();
                                org.telegram.ui.Cells.y1 y1Var4 = (org.telegram.ui.Cells.y1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights11 = m0Var5.F;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                y1Var4.c(z22, true);
                                m0Var5.c.U2.N(true);
                                m0Var5.Y(true);
                                break;
                            case 4:
                                m0 m0Var6 = this.b;
                                m0Var6.getClass();
                                org.telegram.ui.Cells.y1 y1Var5 = (org.telegram.ui.Cells.y1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights12 = m0Var6.F;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                y1Var5.c(z23, true);
                                m0Var6.c.U2.N(true);
                                m0Var6.Y(true);
                                break;
                            default:
                                m0 m0Var7 = this.b;
                                m0Var7.getClass();
                                org.telegram.ui.Cells.y1 y1Var6 = (org.telegram.ui.Cells.y1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights13 = m0Var7.F;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                y1Var6.c(z24, true);
                                m0Var7.c.U2.N(true);
                                m0Var7.Y(true);
                                break;
                        }
                    }
                });
                return;
            }
            if (i10 == g0) {
                final int i14 = 1;
                m0Var.X(i10, !m0Var.F.sell_gifts, new Runnable(m0Var) { // from class: qf.h0
                    public final /* synthetic */ m0 b;

                    {
                        this.b = m0Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i14) {
                            case 0:
                                m0 m0Var2 = this.b;
                                m0Var2.getClass();
                                org.telegram.ui.Cells.y1 y1Var = (org.telegram.ui.Cells.y1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights8 = m0Var2.F;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                y1Var.c(z192, true);
                                m0Var2.c.U2.N(true);
                                m0Var2.Y(true);
                                break;
                            case 1:
                                m0 m0Var3 = this.b;
                                m0Var3.getClass();
                                org.telegram.ui.Cells.y1 y1Var2 = (org.telegram.ui.Cells.y1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights9 = m0Var3.F;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                y1Var2.c(z20, true);
                                m0Var3.c.U2.N(true);
                                m0Var3.Y(true);
                                break;
                            case 2:
                                m0 m0Var4 = this.b;
                                m0Var4.getClass();
                                org.telegram.ui.Cells.y1 y1Var3 = (org.telegram.ui.Cells.y1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights10 = m0Var4.F;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                y1Var3.c(z21, true);
                                m0Var4.c.U2.N(true);
                                m0Var4.Y(true);
                                break;
                            case 3:
                                m0 m0Var5 = this.b;
                                m0Var5.getClass();
                                org.telegram.ui.Cells.y1 y1Var4 = (org.telegram.ui.Cells.y1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights11 = m0Var5.F;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                y1Var4.c(z22, true);
                                m0Var5.c.U2.N(true);
                                m0Var5.Y(true);
                                break;
                            case 4:
                                m0 m0Var6 = this.b;
                                m0Var6.getClass();
                                org.telegram.ui.Cells.y1 y1Var5 = (org.telegram.ui.Cells.y1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights12 = m0Var6.F;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                y1Var5.c(z23, true);
                                m0Var6.c.U2.N(true);
                                m0Var6.Y(true);
                                break;
                            default:
                                m0 m0Var7 = this.b;
                                m0Var7.getClass();
                                org.telegram.ui.Cells.y1 y1Var6 = (org.telegram.ui.Cells.y1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights13 = m0Var7.F;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                y1Var6.c(z24, true);
                                m0Var7.c.U2.N(true);
                                m0Var7.Y(true);
                                break;
                        }
                    }
                });
                return;
            }
            if (i10 == h0) {
                final int i15 = 2;
                m0Var.X(i10, !m0Var.F.change_gift_settings, new Runnable(m0Var) { // from class: qf.h0
                    public final /* synthetic */ m0 b;

                    {
                        this.b = m0Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i15) {
                            case 0:
                                m0 m0Var2 = this.b;
                                m0Var2.getClass();
                                org.telegram.ui.Cells.y1 y1Var = (org.telegram.ui.Cells.y1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights8 = m0Var2.F;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                y1Var.c(z192, true);
                                m0Var2.c.U2.N(true);
                                m0Var2.Y(true);
                                break;
                            case 1:
                                m0 m0Var3 = this.b;
                                m0Var3.getClass();
                                org.telegram.ui.Cells.y1 y1Var2 = (org.telegram.ui.Cells.y1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights9 = m0Var3.F;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                y1Var2.c(z20, true);
                                m0Var3.c.U2.N(true);
                                m0Var3.Y(true);
                                break;
                            case 2:
                                m0 m0Var4 = this.b;
                                m0Var4.getClass();
                                org.telegram.ui.Cells.y1 y1Var3 = (org.telegram.ui.Cells.y1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights10 = m0Var4.F;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                y1Var3.c(z21, true);
                                m0Var4.c.U2.N(true);
                                m0Var4.Y(true);
                                break;
                            case 3:
                                m0 m0Var5 = this.b;
                                m0Var5.getClass();
                                org.telegram.ui.Cells.y1 y1Var4 = (org.telegram.ui.Cells.y1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights11 = m0Var5.F;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                y1Var4.c(z22, true);
                                m0Var5.c.U2.N(true);
                                m0Var5.Y(true);
                                break;
                            case 4:
                                m0 m0Var6 = this.b;
                                m0Var6.getClass();
                                org.telegram.ui.Cells.y1 y1Var5 = (org.telegram.ui.Cells.y1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights12 = m0Var6.F;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                y1Var5.c(z23, true);
                                m0Var6.c.U2.N(true);
                                m0Var6.Y(true);
                                break;
                            default:
                                m0 m0Var7 = this.b;
                                m0Var7.getClass();
                                org.telegram.ui.Cells.y1 y1Var6 = (org.telegram.ui.Cells.y1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights13 = m0Var7.F;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                y1Var6.c(z24, true);
                                m0Var7.c.U2.N(true);
                                m0Var7.Y(true);
                                break;
                        }
                    }
                });
                return;
            }
            if (i10 == i0) {
                final int i16 = 3;
                m0Var.X(i10, !m0Var.F.transfer_and_upgrade_gifts, new Runnable(m0Var) { // from class: qf.h0
                    public final /* synthetic */ m0 b;

                    {
                        this.b = m0Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i16) {
                            case 0:
                                m0 m0Var2 = this.b;
                                m0Var2.getClass();
                                org.telegram.ui.Cells.y1 y1Var = (org.telegram.ui.Cells.y1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights8 = m0Var2.F;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                y1Var.c(z192, true);
                                m0Var2.c.U2.N(true);
                                m0Var2.Y(true);
                                break;
                            case 1:
                                m0 m0Var3 = this.b;
                                m0Var3.getClass();
                                org.telegram.ui.Cells.y1 y1Var2 = (org.telegram.ui.Cells.y1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights9 = m0Var3.F;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                y1Var2.c(z20, true);
                                m0Var3.c.U2.N(true);
                                m0Var3.Y(true);
                                break;
                            case 2:
                                m0 m0Var4 = this.b;
                                m0Var4.getClass();
                                org.telegram.ui.Cells.y1 y1Var3 = (org.telegram.ui.Cells.y1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights10 = m0Var4.F;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                y1Var3.c(z21, true);
                                m0Var4.c.U2.N(true);
                                m0Var4.Y(true);
                                break;
                            case 3:
                                m0 m0Var5 = this.b;
                                m0Var5.getClass();
                                org.telegram.ui.Cells.y1 y1Var4 = (org.telegram.ui.Cells.y1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights11 = m0Var5.F;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                y1Var4.c(z22, true);
                                m0Var5.c.U2.N(true);
                                m0Var5.Y(true);
                                break;
                            case 4:
                                m0 m0Var6 = this.b;
                                m0Var6.getClass();
                                org.telegram.ui.Cells.y1 y1Var5 = (org.telegram.ui.Cells.y1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights12 = m0Var6.F;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                y1Var5.c(z23, true);
                                m0Var6.c.U2.N(true);
                                m0Var6.Y(true);
                                break;
                            default:
                                m0 m0Var7 = this.b;
                                m0Var7.getClass();
                                org.telegram.ui.Cells.y1 y1Var6 = (org.telegram.ui.Cells.y1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights13 = m0Var7.F;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                y1Var6.c(z24, true);
                                m0Var7.c.U2.N(true);
                                m0Var7.Y(true);
                                break;
                        }
                    }
                });
            } else if (i10 == j0) {
                final int i17 = 4;
                m0Var.X(i10, !m0Var.F.transfer_stars, new Runnable(m0Var) { // from class: qf.h0
                    public final /* synthetic */ m0 b;

                    {
                        this.b = m0Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i17) {
                            case 0:
                                m0 m0Var2 = this.b;
                                m0Var2.getClass();
                                org.telegram.ui.Cells.y1 y1Var = (org.telegram.ui.Cells.y1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights8 = m0Var2.F;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                y1Var.c(z192, true);
                                m0Var2.c.U2.N(true);
                                m0Var2.Y(true);
                                break;
                            case 1:
                                m0 m0Var3 = this.b;
                                m0Var3.getClass();
                                org.telegram.ui.Cells.y1 y1Var2 = (org.telegram.ui.Cells.y1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights9 = m0Var3.F;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                y1Var2.c(z20, true);
                                m0Var3.c.U2.N(true);
                                m0Var3.Y(true);
                                break;
                            case 2:
                                m0 m0Var4 = this.b;
                                m0Var4.getClass();
                                org.telegram.ui.Cells.y1 y1Var3 = (org.telegram.ui.Cells.y1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights10 = m0Var4.F;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                y1Var3.c(z21, true);
                                m0Var4.c.U2.N(true);
                                m0Var4.Y(true);
                                break;
                            case 3:
                                m0 m0Var5 = this.b;
                                m0Var5.getClass();
                                org.telegram.ui.Cells.y1 y1Var4 = (org.telegram.ui.Cells.y1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights11 = m0Var5.F;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                y1Var4.c(z22, true);
                                m0Var5.c.U2.N(true);
                                m0Var5.Y(true);
                                break;
                            case 4:
                                m0 m0Var6 = this.b;
                                m0Var6.getClass();
                                org.telegram.ui.Cells.y1 y1Var5 = (org.telegram.ui.Cells.y1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights12 = m0Var6.F;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                y1Var5.c(z23, true);
                                m0Var6.c.U2.N(true);
                                m0Var6.Y(true);
                                break;
                            default:
                                m0 m0Var7 = this.b;
                                m0Var7.getClass();
                                org.telegram.ui.Cells.y1 y1Var6 = (org.telegram.ui.Cells.y1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights13 = m0Var7.F;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                y1Var6.c(z24, true);
                                m0Var7.c.U2.N(true);
                                m0Var7.Y(true);
                                break;
                        }
                    }
                });
            } else if (i10 == k0) {
                m0Var.X(i10, !m0Var.F.manage_stories, new i0(m0Var, 0));
            }
        }
    }

    public final void X(int i10, boolean z10, final Runnable runnable) {
        final int i11 = 1;
        final int i12 = 0;
        if (!this.G && i10 == d0 && z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
            String string = LocaleController.getString(R.string.BusinessBotPermissionsWarning);
            b2 b2Var = alertDialog$Builder.a;
            b2Var.N = string;
            b2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BusinessBotPermissionsUsernamesWarningText, UserObject.getPublicUsername(this.I)));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.k(LocaleController.getString(R.string.Allow), new a2(this) { // from class: qf.l0
                public final /* synthetic */ m0 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.a2
                public final void f(b2 b2Var2, int i13) {
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
        b2 b2Var2 = alertDialog$Builder2.a;
        b2Var2.N = string2;
        b2Var2.P = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BusinessBotPermissionsGiftsWarningText, UserObject.getPublicUsername(this.I)));
        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder2.k(LocaleController.getString(R.string.Allow), new a2(this) { // from class: qf.l0
            public final /* synthetic */ m0 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.a2
            public final void f(b2 b2Var22, int i13) {
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
        x xVar;
        if (this.P) {
            TLRPC.User user = this.I;
            boolean z10 = user != null;
            TL_account.TL_connectedBot tL_connectedBot = this.D;
            if (z10 == (tL_connectedBot != null)) {
                if ((user == null ? 0L : user.id) == (tL_connectedBot != null ? tL_connectedBot.bot_id : 0L) && (user == null || (this.F.equals(tL_connectedBot.rights) && ((xVar = this.v) == null || !xVar.g())))) {
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
                getConnectionsManager().sendRequest((TLObject) arrayList.get(i10), new fh.g(this, iArr, arrayList, z10, user2));
            }
        }
    }

    public final void b0() {
        boolean z10 = this.w;
        boolean e9 = this.d.e();
        boolean z11 = true;
        LongSparseArray longSparseArray = this.J;
        if (z10 != (e9 || this.x || longSparseArray.size() > 0)) {
            if (!this.d.e() && !this.x && longSparseArray.size() <= 0) {
                z11 = false;
            }
            this.w = z11;
            ViewPropertyAnimator duration = this.r.animate().alpha(z11 ? 0.0f : 1.0f).translationY(z11 ? -AndroidUtilities.dp(8.0f) : 0.0f).setDuration(320L);
            er erVar = er.h;
            duration.setInterpolator(erVar).start();
            this.s.animate().alpha(z11 ? 1.0f : 0.0f).translationY(z11 ? 0.0f : AndroidUtilities.dp(8.0f)).setDuration(320L).setInterpolator(erVar).start();
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.BusinessBots2));
        this.actionBar.setActionBarMenuOnItemClick(new ed1(8, this));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i10 = g6.v8;
        mutate.setColorFilter(new PorterDuffColorFilter(g6.w0(null, i10, false), PorterDuff.Mode.MULTIPLY));
        this.a = new dr(mutate, new hp(g6.w0(null, i10, false)));
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
        this.f.setOnEditorActionListener(new hh.k(this, 1));
        this.f.addTextChangedListener(new ch.e(this, 17));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.e = frameLayout2;
        frameLayout2.addView(this.f, z5.d(-1, -1.0f, 48, 21.0f, 15.0f, 21.0f, 15.0f));
        FrameLayout frameLayout3 = this.e;
        int i12 = g6.d6;
        frameLayout3.setBackgroundColor(getThemedColor(i12));
        View view = new View(context);
        this.h = view;
        view.setBackgroundColor(getThemedColor(g6.d7));
        FrameLayout frameLayout4 = this.e;
        View view2 = this.h;
        float f10 = 1.0f / AndroidUtilities.density;
        boolean z10 = LocaleController.isRTL;
        frameLayout4.addView(view2, z5.d(-1, f10, 87, z10 ? 0 : 21, 0.0f, z10 ? 21 : 0, 0.0f));
        z71 z71Var = new z71(context, 8);
        this.n = z71Var;
        z71Var.setBackgroundColor(getThemedColor(i12));
        TextView textView = new TextView(context);
        this.r = textView;
        textView.setText(LocaleController.getString(R.string.BusinessBotNotFound));
        this.r.setTextSize(1, 14.0f);
        TextView textView2 = this.r;
        int i13 = g6.z6;
        textView2.setTextColor(getThemedColor(i13));
        this.n.addView(this.r, z5.e(-2, -2, 17));
        this.s = new ImageView(context);
        g8 g8Var = new g8(getThemedColor(i13));
        this.s.setScaleType(ImageView.ScaleType.CENTER);
        this.s.setImageDrawable(g8Var);
        this.n.addView(this.s, z5.e(-2, -2, 17));
        this.s.setAlpha(0.0f);
        this.s.setTranslationY(AndroidUtilities.dp(8.0f));
        pf.j1 j1Var = new pf.j1(true);
        this.d = j1Var;
        j1Var.a = new o0.b(this, 14);
        x xVar = new x(this, new i0(this, 3));
        this.v = xVar;
        TL_account.TL_connectedBot tL_connectedBot = this.D;
        xVar.i(tL_connectedBot == null ? null : tL_connectedBot.recipients);
        k51 k51Var = new k51(this, new a8(this, 18), new k0(this, 3), null);
        this.c = k51Var;
        k51Var.p1();
        k51 k51Var2 = this.c;
        k51Var2.U2.r = false;
        frameLayout.addView(k51Var2, z5.c(-1.0f, -1));
        this.actionBar.B(this.c, true);
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onBackPressed(boolean z10) {
        if (Z()) {
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.a.N = LocaleController.getString(R.string.UnsavedChanges);
                alertDialog$Builder.a.P = LocaleController.getString(R.string.BusinessBotUnsavedChanges);
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new k0(this, 0));
                alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new k0(this, 1));
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
                alertDialog$Builder2.k(LocaleController.getString(R.string.BusinessBotNoAddedButton), new k0(this, 2));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                showDialog(alertDialog$Builder2.a);
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onFragmentCreate() {
        if (!this.O && !this.P) {
            this.O = true;
            h.a(this.currentAccount).c(new n6(this, 14));
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.c.setPadding(0, 0, 0, i13);
        this.c.setClipToPadding(false);
    }
}
