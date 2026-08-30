package uf;

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
import java.util.ArrayList;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.y3;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Cells.z1;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.rp;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.a51;
import org.telegram.ui.yh;
import ph.a7;
import ph.d4;
import ph.f6;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class k0 extends p2 {
    public static final int R = -1;
    public static final int S = -2;
    public static final int T = -3;
    public static final int U = -4;
    public static final int V = -5;
    public static final int W = -6;
    public static final int X = -7;
    public static final int Y = -8;
    public static final int Z = -9;
    public static final int a0 = -10;
    public static final int b0 = -11;
    public static final int c0 = -12;
    public static final int d0 = -13;
    public static final int e0 = -14;
    public static final int f0 = -15;
    public static final int g0 = -16;
    public static final int h0 = -17;
    public static final int i0 = -18;
    public static final int j0 = -19;
    public static final int k0 = -20;
    public static final int l0 = -21;
    public int B;
    public final g0 C;
    public TL_account.connectedBots D;
    public TL_account.TL_connectedBot E;
    public boolean F;
    public TL_account.TL_businessBotRights G;
    public boolean H;
    public boolean I;
    public TLRPC.User J;
    public final LongSparseArray K;
    public int L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public mr a;
    public org.telegram.ui.ActionBar.w0 b;
    public g61 c;
    public tf.k1 d;
    public FrameLayout e;
    public EditTextBoldCursor f;
    public View h;
    public a51 n;
    public TextView r;
    public ImageView s;
    public v v;
    public boolean w;
    public boolean x;
    public String y;

    public k0() {
        super(null);
        this.B = 0;
        this.C = new g0(this, 4);
        this.G = TL_account.TL_businessBotRights.makeDefault();
        this.J = null;
        this.K = new LongSparseArray();
        this.L = -4;
        this.M = true;
        this.N = false;
        this.O = false;
    }

    public static void U(k0 k0Var, TLRPC.TL_error tL_error, TLObject tLObject, int[] iArr, ArrayList arrayList, boolean z4, TLRPC.User user) {
        p2 U2;
        if (tL_error != null) {
            k0Var.a.a(0.0f);
            qc.b0(tL_error);
            return;
        }
        if (tLObject instanceof TLRPC.TL_boolFalse) {
            k0Var.a.a(0.0f);
            y3.s(R.string.UnknownError, qc.a0(k0Var), null);
            return;
        }
        if (tLObject instanceof TLRPC.Updates) {
            Utilities.stageQueue.postRunnable(new f6(29, k0Var, tLObject));
        }
        int i10 = iArr[0] + 1;
        iArr[0] = i10;
        if (i10 == arrayList.size()) {
            f.a(k0Var.currentAccount).b();
            k0Var.getMessagesController().clearFullUsers();
            k0Var.finishFragment();
            if (!z4 || user == null) {
                if (user == null || (U2 = LaunchActivity.U()) == null) {
                    return;
                }
                yh.s(R.string.BusinessBotUpdated, new Object[]{UserObject.getUserName(user)}, qc.a0(U2), R.raw.contact_check, 36);
                return;
            }
            p2 U3 = LaunchActivity.U();
            if (U3 != null) {
                yh.s(R.string.BusinessBotDone, new Object[]{UserObject.getUserName(user)}, qc.a0(U3), R.raw.contact_check, 36);
            }
        }
    }

    public static void W(final k0 k0Var, i51 i51Var, final View view) {
        if (i51Var.g && !k0Var.v.h(i51Var)) {
            int i10 = i51Var.d;
            if (i10 == R) {
                v vVar = k0Var.v;
                k0Var.F = true;
                vVar.h = true;
                k0Var.c.V2.N(true);
                k0Var.Y(true);
                return;
            }
            if (i10 == S) {
                v vVar2 = k0Var.v;
                k0Var.F = false;
                vVar2.h = false;
                k0Var.c.V2.N(true);
                k0Var.Y(true);
                return;
            }
            if (i10 == T) {
                k0Var.J = null;
                k0Var.c.V2.N(true);
                k0Var.Y(true);
                return;
            }
            if (i51Var.a == 13) {
                TLRPC.User user = (TLRPC.User) k0Var.K.get(i51Var.x);
                if (user == null) {
                    return;
                }
                if (user.bot_business) {
                    k0Var.J = user;
                    AndroidUtilities.hideKeyboard(k0Var.f);
                    k0Var.c.V2.N(true);
                    k0Var.Y(true);
                    return;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(k0Var.getParentActivity(), 0, k0Var.resourceProvider);
                alertDialog$Builder.a.O = LocaleController.getString(R.string.BusinessBotNotSupportedTitle);
                alertDialog$Builder.a.Q = AndroidUtilities.replaceTags(LocaleController.getString(R.string.BusinessBotNotSupportedMessage));
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                k0Var.showDialog(alertDialog$Builder.a);
                return;
            }
            if (i10 == U) {
                boolean z4 = !k0Var.M;
                k0Var.M = z4;
                ((r8) view).setChecked(z4);
                k0Var.c.V2.N(true);
                return;
            }
            if (i10 == V) {
                int i11 = -k0Var.L;
                k0Var.L = i11;
                AndroidUtilities.shakeViewSpring(view, i11);
                return;
            }
            if (i10 == W) {
                TL_account.TL_businessBotRights tL_businessBotRights = k0Var.G;
                boolean z10 = !tL_businessBotRights.reply;
                tL_businessBotRights.reply = z10;
                ((z1) view).c(z10, true);
                k0Var.c.V2.N(true);
                k0Var.Y(true);
                return;
            }
            if (i10 == X) {
                TL_account.TL_businessBotRights tL_businessBotRights2 = k0Var.G;
                boolean z11 = !tL_businessBotRights2.read_messages;
                tL_businessBotRights2.read_messages = z11;
                ((z1) view).c(z11, true);
                k0Var.c.V2.N(true);
                k0Var.Y(true);
                return;
            }
            if (i10 == Y) {
                TL_account.TL_businessBotRights tL_businessBotRights3 = k0Var.G;
                boolean z12 = !tL_businessBotRights3.delete_sent_messages;
                tL_businessBotRights3.delete_sent_messages = z12;
                ((z1) view).c(z12, true);
                k0Var.c.V2.N(true);
                k0Var.Y(true);
                return;
            }
            if (i10 == Z) {
                TL_account.TL_businessBotRights tL_businessBotRights4 = k0Var.G;
                boolean z13 = !tL_businessBotRights4.delete_received_messages;
                tL_businessBotRights4.delete_received_messages = z13;
                ((z1) view).c(z13, true);
                k0Var.c.V2.N(true);
                k0Var.Y(true);
                return;
            }
            if (i10 == a0) {
                boolean z14 = !k0Var.N;
                k0Var.N = z14;
                ((r8) view).setChecked(z14);
                k0Var.c.V2.N(true);
                return;
            }
            if (i10 == b0) {
                TL_account.TL_businessBotRights tL_businessBotRights5 = k0Var.G;
                boolean z15 = !tL_businessBotRights5.edit_name;
                tL_businessBotRights5.edit_name = z15;
                ((z1) view).c(z15, true);
                k0Var.c.V2.N(true);
                k0Var.Y(true);
                return;
            }
            if (i10 == c0) {
                TL_account.TL_businessBotRights tL_businessBotRights6 = k0Var.G;
                boolean z16 = !tL_businessBotRights6.edit_bio;
                tL_businessBotRights6.edit_bio = z16;
                ((z1) view).c(z16, true);
                k0Var.c.V2.N(true);
                k0Var.Y(true);
                return;
            }
            if (i10 == d0) {
                TL_account.TL_businessBotRights tL_businessBotRights7 = k0Var.G;
                boolean z17 = !tL_businessBotRights7.edit_profile_photo;
                tL_businessBotRights7.edit_profile_photo = z17;
                ((z1) view).c(z17, true);
                k0Var.c.V2.N(true);
                k0Var.Y(true);
                return;
            }
            if (i10 == e0) {
                final int i12 = 5;
                k0Var.X(i10, !k0Var.G.edit_username, new Runnable(k0Var) { // from class: uf.f0
                    public final /* synthetic */ k0 b;

                    {
                        this.b = k0Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                k0 k0Var2 = this.b;
                                k0Var2.getClass();
                                z1 z1Var = (z1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights8 = k0Var2.G;
                                boolean z18 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z18;
                                z1Var.c(z18, true);
                                k0Var2.c.V2.N(true);
                                k0Var2.Y(true);
                                break;
                            case 1:
                                k0 k0Var3 = this.b;
                                k0Var3.getClass();
                                z1 z1Var2 = (z1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights9 = k0Var3.G;
                                boolean z19 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z19;
                                z1Var2.c(z19, true);
                                k0Var3.c.V2.N(true);
                                k0Var3.Y(true);
                                break;
                            case 2:
                                k0 k0Var4 = this.b;
                                k0Var4.getClass();
                                z1 z1Var3 = (z1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights10 = k0Var4.G;
                                boolean z20 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z20;
                                z1Var3.c(z20, true);
                                k0Var4.c.V2.N(true);
                                k0Var4.Y(true);
                                break;
                            case 3:
                                k0 k0Var5 = this.b;
                                k0Var5.getClass();
                                z1 z1Var4 = (z1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights11 = k0Var5.G;
                                boolean z21 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z21;
                                z1Var4.c(z21, true);
                                k0Var5.c.V2.N(true);
                                k0Var5.Y(true);
                                break;
                            case 4:
                                k0 k0Var6 = this.b;
                                k0Var6.getClass();
                                z1 z1Var5 = (z1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights12 = k0Var6.G;
                                boolean z22 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z22;
                                z1Var5.c(z22, true);
                                k0Var6.c.V2.N(true);
                                k0Var6.Y(true);
                                break;
                            default:
                                k0 k0Var7 = this.b;
                                k0Var7.getClass();
                                z1 z1Var6 = (z1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights13 = k0Var7.G;
                                boolean z23 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z23;
                                z1Var6.c(z23, true);
                                k0Var7.c.V2.N(true);
                                k0Var7.Y(true);
                                break;
                        }
                    }
                });
                return;
            }
            if (i10 == f0) {
                boolean z18 = !k0Var.O;
                k0Var.O = z18;
                ((r8) view).setChecked(z18);
                k0Var.c.V2.N(true);
                return;
            }
            if (i10 == g0) {
                final int i13 = 0;
                k0Var.X(i10, !k0Var.G.view_gifts, new Runnable(k0Var) { // from class: uf.f0
                    public final /* synthetic */ k0 b;

                    {
                        this.b = k0Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i13) {
                            case 0:
                                k0 k0Var2 = this.b;
                                k0Var2.getClass();
                                z1 z1Var = (z1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights8 = k0Var2.G;
                                boolean z182 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z182;
                                z1Var.c(z182, true);
                                k0Var2.c.V2.N(true);
                                k0Var2.Y(true);
                                break;
                            case 1:
                                k0 k0Var3 = this.b;
                                k0Var3.getClass();
                                z1 z1Var2 = (z1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights9 = k0Var3.G;
                                boolean z19 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z19;
                                z1Var2.c(z19, true);
                                k0Var3.c.V2.N(true);
                                k0Var3.Y(true);
                                break;
                            case 2:
                                k0 k0Var4 = this.b;
                                k0Var4.getClass();
                                z1 z1Var3 = (z1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights10 = k0Var4.G;
                                boolean z20 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z20;
                                z1Var3.c(z20, true);
                                k0Var4.c.V2.N(true);
                                k0Var4.Y(true);
                                break;
                            case 3:
                                k0 k0Var5 = this.b;
                                k0Var5.getClass();
                                z1 z1Var4 = (z1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights11 = k0Var5.G;
                                boolean z21 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z21;
                                z1Var4.c(z21, true);
                                k0Var5.c.V2.N(true);
                                k0Var5.Y(true);
                                break;
                            case 4:
                                k0 k0Var6 = this.b;
                                k0Var6.getClass();
                                z1 z1Var5 = (z1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights12 = k0Var6.G;
                                boolean z22 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z22;
                                z1Var5.c(z22, true);
                                k0Var6.c.V2.N(true);
                                k0Var6.Y(true);
                                break;
                            default:
                                k0 k0Var7 = this.b;
                                k0Var7.getClass();
                                z1 z1Var6 = (z1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights13 = k0Var7.G;
                                boolean z23 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z23;
                                z1Var6.c(z23, true);
                                k0Var7.c.V2.N(true);
                                k0Var7.Y(true);
                                break;
                        }
                    }
                });
                return;
            }
            if (i10 == h0) {
                final int i14 = 1;
                k0Var.X(i10, !k0Var.G.sell_gifts, new Runnable(k0Var) { // from class: uf.f0
                    public final /* synthetic */ k0 b;

                    {
                        this.b = k0Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i14) {
                            case 0:
                                k0 k0Var2 = this.b;
                                k0Var2.getClass();
                                z1 z1Var = (z1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights8 = k0Var2.G;
                                boolean z182 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z182;
                                z1Var.c(z182, true);
                                k0Var2.c.V2.N(true);
                                k0Var2.Y(true);
                                break;
                            case 1:
                                k0 k0Var3 = this.b;
                                k0Var3.getClass();
                                z1 z1Var2 = (z1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights9 = k0Var3.G;
                                boolean z19 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z19;
                                z1Var2.c(z19, true);
                                k0Var3.c.V2.N(true);
                                k0Var3.Y(true);
                                break;
                            case 2:
                                k0 k0Var4 = this.b;
                                k0Var4.getClass();
                                z1 z1Var3 = (z1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights10 = k0Var4.G;
                                boolean z20 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z20;
                                z1Var3.c(z20, true);
                                k0Var4.c.V2.N(true);
                                k0Var4.Y(true);
                                break;
                            case 3:
                                k0 k0Var5 = this.b;
                                k0Var5.getClass();
                                z1 z1Var4 = (z1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights11 = k0Var5.G;
                                boolean z21 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z21;
                                z1Var4.c(z21, true);
                                k0Var5.c.V2.N(true);
                                k0Var5.Y(true);
                                break;
                            case 4:
                                k0 k0Var6 = this.b;
                                k0Var6.getClass();
                                z1 z1Var5 = (z1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights12 = k0Var6.G;
                                boolean z22 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z22;
                                z1Var5.c(z22, true);
                                k0Var6.c.V2.N(true);
                                k0Var6.Y(true);
                                break;
                            default:
                                k0 k0Var7 = this.b;
                                k0Var7.getClass();
                                z1 z1Var6 = (z1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights13 = k0Var7.G;
                                boolean z23 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z23;
                                z1Var6.c(z23, true);
                                k0Var7.c.V2.N(true);
                                k0Var7.Y(true);
                                break;
                        }
                    }
                });
                return;
            }
            if (i10 == i0) {
                final int i15 = 2;
                k0Var.X(i10, !k0Var.G.change_gift_settings, new Runnable(k0Var) { // from class: uf.f0
                    public final /* synthetic */ k0 b;

                    {
                        this.b = k0Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i15) {
                            case 0:
                                k0 k0Var2 = this.b;
                                k0Var2.getClass();
                                z1 z1Var = (z1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights8 = k0Var2.G;
                                boolean z182 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z182;
                                z1Var.c(z182, true);
                                k0Var2.c.V2.N(true);
                                k0Var2.Y(true);
                                break;
                            case 1:
                                k0 k0Var3 = this.b;
                                k0Var3.getClass();
                                z1 z1Var2 = (z1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights9 = k0Var3.G;
                                boolean z19 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z19;
                                z1Var2.c(z19, true);
                                k0Var3.c.V2.N(true);
                                k0Var3.Y(true);
                                break;
                            case 2:
                                k0 k0Var4 = this.b;
                                k0Var4.getClass();
                                z1 z1Var3 = (z1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights10 = k0Var4.G;
                                boolean z20 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z20;
                                z1Var3.c(z20, true);
                                k0Var4.c.V2.N(true);
                                k0Var4.Y(true);
                                break;
                            case 3:
                                k0 k0Var5 = this.b;
                                k0Var5.getClass();
                                z1 z1Var4 = (z1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights11 = k0Var5.G;
                                boolean z21 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z21;
                                z1Var4.c(z21, true);
                                k0Var5.c.V2.N(true);
                                k0Var5.Y(true);
                                break;
                            case 4:
                                k0 k0Var6 = this.b;
                                k0Var6.getClass();
                                z1 z1Var5 = (z1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights12 = k0Var6.G;
                                boolean z22 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z22;
                                z1Var5.c(z22, true);
                                k0Var6.c.V2.N(true);
                                k0Var6.Y(true);
                                break;
                            default:
                                k0 k0Var7 = this.b;
                                k0Var7.getClass();
                                z1 z1Var6 = (z1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights13 = k0Var7.G;
                                boolean z23 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z23;
                                z1Var6.c(z23, true);
                                k0Var7.c.V2.N(true);
                                k0Var7.Y(true);
                                break;
                        }
                    }
                });
                return;
            }
            if (i10 == j0) {
                final int i16 = 3;
                k0Var.X(i10, !k0Var.G.transfer_and_upgrade_gifts, new Runnable(k0Var) { // from class: uf.f0
                    public final /* synthetic */ k0 b;

                    {
                        this.b = k0Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i16) {
                            case 0:
                                k0 k0Var2 = this.b;
                                k0Var2.getClass();
                                z1 z1Var = (z1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights8 = k0Var2.G;
                                boolean z182 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z182;
                                z1Var.c(z182, true);
                                k0Var2.c.V2.N(true);
                                k0Var2.Y(true);
                                break;
                            case 1:
                                k0 k0Var3 = this.b;
                                k0Var3.getClass();
                                z1 z1Var2 = (z1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights9 = k0Var3.G;
                                boolean z19 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z19;
                                z1Var2.c(z19, true);
                                k0Var3.c.V2.N(true);
                                k0Var3.Y(true);
                                break;
                            case 2:
                                k0 k0Var4 = this.b;
                                k0Var4.getClass();
                                z1 z1Var3 = (z1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights10 = k0Var4.G;
                                boolean z20 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z20;
                                z1Var3.c(z20, true);
                                k0Var4.c.V2.N(true);
                                k0Var4.Y(true);
                                break;
                            case 3:
                                k0 k0Var5 = this.b;
                                k0Var5.getClass();
                                z1 z1Var4 = (z1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights11 = k0Var5.G;
                                boolean z21 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z21;
                                z1Var4.c(z21, true);
                                k0Var5.c.V2.N(true);
                                k0Var5.Y(true);
                                break;
                            case 4:
                                k0 k0Var6 = this.b;
                                k0Var6.getClass();
                                z1 z1Var5 = (z1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights12 = k0Var6.G;
                                boolean z22 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z22;
                                z1Var5.c(z22, true);
                                k0Var6.c.V2.N(true);
                                k0Var6.Y(true);
                                break;
                            default:
                                k0 k0Var7 = this.b;
                                k0Var7.getClass();
                                z1 z1Var6 = (z1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights13 = k0Var7.G;
                                boolean z23 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z23;
                                z1Var6.c(z23, true);
                                k0Var7.c.V2.N(true);
                                k0Var7.Y(true);
                                break;
                        }
                    }
                });
            } else if (i10 == k0) {
                final int i17 = 4;
                k0Var.X(i10, !k0Var.G.transfer_stars, new Runnable(k0Var) { // from class: uf.f0
                    public final /* synthetic */ k0 b;

                    {
                        this.b = k0Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i17) {
                            case 0:
                                k0 k0Var2 = this.b;
                                k0Var2.getClass();
                                z1 z1Var = (z1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights8 = k0Var2.G;
                                boolean z182 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z182;
                                z1Var.c(z182, true);
                                k0Var2.c.V2.N(true);
                                k0Var2.Y(true);
                                break;
                            case 1:
                                k0 k0Var3 = this.b;
                                k0Var3.getClass();
                                z1 z1Var2 = (z1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights9 = k0Var3.G;
                                boolean z19 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z19;
                                z1Var2.c(z19, true);
                                k0Var3.c.V2.N(true);
                                k0Var3.Y(true);
                                break;
                            case 2:
                                k0 k0Var4 = this.b;
                                k0Var4.getClass();
                                z1 z1Var3 = (z1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights10 = k0Var4.G;
                                boolean z20 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z20;
                                z1Var3.c(z20, true);
                                k0Var4.c.V2.N(true);
                                k0Var4.Y(true);
                                break;
                            case 3:
                                k0 k0Var5 = this.b;
                                k0Var5.getClass();
                                z1 z1Var4 = (z1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights11 = k0Var5.G;
                                boolean z21 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z21;
                                z1Var4.c(z21, true);
                                k0Var5.c.V2.N(true);
                                k0Var5.Y(true);
                                break;
                            case 4:
                                k0 k0Var6 = this.b;
                                k0Var6.getClass();
                                z1 z1Var5 = (z1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights12 = k0Var6.G;
                                boolean z22 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z22;
                                z1Var5.c(z22, true);
                                k0Var6.c.V2.N(true);
                                k0Var6.Y(true);
                                break;
                            default:
                                k0 k0Var7 = this.b;
                                k0Var7.getClass();
                                z1 z1Var6 = (z1) view;
                                TL_account.TL_businessBotRights tL_businessBotRights13 = k0Var7.G;
                                boolean z23 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z23;
                                z1Var6.c(z23, true);
                                k0Var7.c.V2.N(true);
                                k0Var7.Y(true);
                                break;
                        }
                    }
                });
            } else if (i10 == l0) {
                k0Var.X(i10, !k0Var.G.manage_stories, new g0(k0Var, 0));
            }
        }
    }

    public final void X(int i10, boolean z4, final Runnable runnable) {
        final int i11 = 1;
        final int i12 = 0;
        if (!this.H && i10 == e0 && z4) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
            String string = LocaleController.getString(R.string.BusinessBotPermissionsWarning);
            d2 d2Var = alertDialog$Builder.a;
            d2Var.O = string;
            d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BusinessBotPermissionsUsernamesWarningText, UserObject.getPublicUsername(this.J)));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.k(LocaleController.getString(R.string.Allow), new c2(this) { // from class: uf.j0
                public final /* synthetic */ k0 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.c2
                public final void i(d2 d2Var2, int i13) {
                    switch (i12) {
                        case 0:
                            this.b.H = true;
                            runnable.run();
                            break;
                        default:
                            this.b.I = true;
                            runnable.run();
                            break;
                    }
                }
            });
            alertDialog$Builder.d(-1);
            alertDialog$Builder.o();
            return;
        }
        if (this.I || !z4 || (i10 != h0 && i10 != i0 && i10 != j0 && i10 != k0)) {
            runnable.run();
            return;
        }
        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
        String string2 = LocaleController.getString(R.string.BusinessBotPermissionsWarning);
        d2 d2Var2 = alertDialog$Builder2.a;
        d2Var2.O = string2;
        d2Var2.Q = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BusinessBotPermissionsGiftsWarningText, UserObject.getPublicUsername(this.J)));
        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder2.k(LocaleController.getString(R.string.Allow), new c2(this) { // from class: uf.j0
            public final /* synthetic */ k0 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.c2
            public final void i(d2 d2Var22, int i13) {
                switch (i11) {
                    case 0:
                        this.b.H = true;
                        runnable.run();
                        break;
                    default:
                        this.b.I = true;
                        runnable.run();
                        break;
                }
            }
        });
        alertDialog$Builder2.d(-1);
        alertDialog$Builder2.o();
    }

    public final void Y(boolean z4) {
        if (this.b == null) {
            return;
        }
        boolean Z2 = Z();
        this.b.setEnabled(Z2);
        if (z4) {
            this.b.animate().alpha(Z2 ? 1.0f : 0.0f).scaleX(Z2 ? 1.0f : 0.0f).scaleY(Z2 ? 1.0f : 0.0f).setDuration(180L).start();
            return;
        }
        this.b.setAlpha(Z2 ? 1.0f : 0.0f);
        this.b.setScaleX(Z2 ? 1.0f : 0.0f);
        this.b.setScaleY(Z2 ? 1.0f : 0.0f);
    }

    public final boolean Z() {
        v vVar;
        if (this.Q) {
            TLRPC.User user = this.J;
            boolean z4 = user != null;
            TL_account.TL_connectedBot tL_connectedBot = this.E;
            if (z4 == (tL_connectedBot != null)) {
                if ((user == null ? 0L : user.id) == (tL_connectedBot != null ? tL_connectedBot.bot_id : 0L) && (user == null || (this.G.equals(tL_connectedBot.rights) && ((vVar = this.v) == null || !vVar.g())))) {
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
            TLRPC.User user2 = this.J;
            boolean z4 = user2 != null && ((tL_connectedBot = this.E) == null || tL_connectedBot.bot_id != user2.id);
            ArrayList arrayList = new ArrayList();
            TL_account.TL_connectedBot tL_connectedBot2 = this.E;
            if (tL_connectedBot2 != null && ((user = this.J) == null || tL_connectedBot2.bot_id != user.id)) {
                TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
                updateconnectedbot.deleted = true;
                updateconnectedbot.bot = getMessagesController().getInputUser(this.E.bot_id);
                updateconnectedbot.recipients = new TL_account.TL_inputBusinessBotRecipients();
                arrayList.add(updateconnectedbot);
            }
            if (this.J != null) {
                TL_account.updateConnectedBot updateconnectedbot2 = new TL_account.updateConnectedBot();
                updateconnectedbot2.deleted = false;
                updateconnectedbot2.rights = this.G;
                updateconnectedbot2.bot = getMessagesController().getInputUser(this.J);
                updateconnectedbot2.recipients = this.v.b();
                arrayList.add(updateconnectedbot2);
                TL_account.TL_connectedBot tL_connectedBot3 = this.E;
                if (tL_connectedBot3 != null) {
                    tL_connectedBot3.bot_id = this.J.id;
                    tL_connectedBot3.recipients = this.v.c();
                    this.E.rights = this.G;
                }
            }
            if (arrayList.isEmpty()) {
                finishFragment();
                return;
            }
            int[] iArr = {0};
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                getConnectionsManager().sendRequest((TLObject) arrayList.get(i10), new jh.g(this, iArr, arrayList, z4, user2));
            }
        }
    }

    public final void b0() {
        boolean z4 = this.w;
        boolean e = this.d.e();
        boolean z10 = true;
        LongSparseArray longSparseArray = this.K;
        if (z4 != (e || this.x || longSparseArray.size() > 0)) {
            if (!this.d.e() && !this.x && longSparseArray.size() <= 0) {
                z10 = false;
            }
            this.w = z10;
            ViewPropertyAnimator duration = this.r.animate().alpha(z10 ? 0.0f : 1.0f).translationY(z10 ? -AndroidUtilities.dp(8.0f) : 0.0f).setDuration(320L);
            nr nrVar = nr.h;
            duration.setInterpolator(nrVar).start();
            this.s.animate().alpha(z10 ? 1.0f : 0.0f).translationY(z10 ? 0.0f : AndroidUtilities.dp(8.0f)).setDuration(320L).setInterpolator(nrVar).start();
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.BusinessBots2));
        this.actionBar.setActionBarMenuOnItemClick(new sh.e(this, 8));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i10 = j6.v8;
        mutate.setColorFilter(new PorterDuffColorFilter(j6.w0(null, i10, false), PorterDuff.Mode.MULTIPLY));
        this.a = new mr(mutate, new rp(j6.w0(null, i10, false)));
        this.b = this.actionBar.n().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.a);
        Y(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(j6.w0(null, j6.a7, false));
        new LinearLayout(getParentActivity()).setOrientation(0);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(getParentActivity());
        this.f = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 17.0f);
        this.f.setHintTextColor(j6.w0(null, j6.H6, false));
        EditTextBoldCursor editTextBoldCursor2 = this.f;
        int i11 = j6.G6;
        editTextBoldCursor2.setTextColor(j6.w0(null, i11, false));
        this.f.setBackgroundDrawable(null);
        this.f.setMaxLines(1);
        this.f.setLines(1);
        this.f.setPadding(0, 0, 0, 0);
        this.f.setSingleLine(true);
        this.f.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        this.f.setInputType(180224);
        this.f.setImeOptions(6);
        this.f.setHint(LocaleController.getString(R.string.BusinessBotLink));
        this.f.setCursorColor(j6.w0(null, i11, false));
        this.f.setCursorSize(AndroidUtilities.dp(19.0f));
        this.f.setCursorWidth(1.5f);
        this.f.setOnEditorActionListener(new lh.k(this, 1));
        this.f.addTextChangedListener(new dh.c(this, 18));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.e = frameLayout2;
        frameLayout2.addView(this.f, b6.d(-1, -1.0f, 48, 21.0f, 15.0f, 21.0f, 15.0f));
        FrameLayout frameLayout3 = this.e;
        int i12 = j6.d6;
        frameLayout3.setBackgroundColor(getThemedColor(i12));
        View view = new View(context);
        this.h = view;
        view.setBackgroundColor(getThemedColor(j6.d7));
        FrameLayout frameLayout4 = this.e;
        View view2 = this.h;
        float f10 = 1.0f / AndroidUtilities.density;
        boolean z4 = LocaleController.isRTL;
        frameLayout4.addView(view2, b6.d(-1, f10, 87, z4 ? 0 : 21, 0.0f, z4 ? 21 : 0, 0.0f));
        a51 a51Var = new a51(context, 10);
        this.n = a51Var;
        a51Var.setBackgroundColor(getThemedColor(i12));
        TextView textView = new TextView(context);
        this.r = textView;
        textView.setText(LocaleController.getString(R.string.BusinessBotNotFound));
        this.r.setTextSize(1, 14.0f);
        TextView textView2 = this.r;
        int i13 = j6.z6;
        textView2.setTextColor(getThemedColor(i13));
        this.n.addView(this.r, b6.e(-2, -2, 17));
        this.s = new ImageView(context);
        a7 a7Var = new a7(getThemedColor(i13));
        this.s.setScaleType(ImageView.ScaleType.CENTER);
        this.s.setImageDrawable(a7Var);
        this.n.addView(this.s, b6.e(-2, -2, 17));
        this.s.setAlpha(0.0f);
        this.s.setTranslationY(AndroidUtilities.dp(8.0f));
        tf.k1 k1Var = new tf.k1(true);
        this.d = k1Var;
        k1Var.a = new org.telegram.ui.Cells.f1(this, 24);
        v vVar = new v(this, new g0(this, 3));
        this.v = vVar;
        TL_account.TL_connectedBot tL_connectedBot = this.E;
        vVar.i(tL_connectedBot == null ? null : tL_connectedBot.recipients);
        g61 g61Var = new g61(this, new d4(this, 19), new i0(this, 3), null);
        this.c = g61Var;
        g61Var.p1();
        g61 g61Var2 = this.c;
        g61Var2.V2.r = false;
        frameLayout.addView(g61Var2, b6.c(-1.0f, -1));
        this.actionBar.A(this.c, true);
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onBackPressed(boolean z4) {
        if (Z()) {
            if (z4) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.a.O = LocaleController.getString(R.string.UnsavedChanges);
                alertDialog$Builder.a.Q = LocaleController.getString(R.string.BusinessBotUnsavedChanges);
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new i0(this, 0));
                alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new i0(this, 1));
                showDialog(alertDialog$Builder.a);
                return false;
            }
        } else {
            if (this.J != null || Z() || (this.d.d.isEmpty() && this.d.e.isEmpty())) {
                return super.onBackPressed(z4);
            }
            if (z4) {
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder2.a.O = LocaleController.getString(R.string.BusinessBotNoAddedTitle);
                alertDialog$Builder2.a.Q = LocaleController.getString(R.string.BusinessBotNoAddedText);
                alertDialog$Builder2.k(LocaleController.getString(R.string.BusinessBotNoAddedButton), new i0(this, 2));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                showDialog(alertDialog$Builder2.a);
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onFragmentCreate() {
        if (!this.P && !this.Q) {
            this.P = true;
            f.a(this.currentAccount).c(new org.telegram.ui.web.y0(this, 19));
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.c.setPadding(0, 0, 0, i13);
        this.c.setClipToPadding(false);
    }
}
