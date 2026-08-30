package rh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import k7.b6;
import lh.m5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e5;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.ha;
import org.telegram.ui.Cells.w7;
import org.telegram.ui.Components.e90;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.sz0;
import org.telegram.ui.Components.w51;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.gw0;
import org.telegram.ui.l20;
import org.telegram.ui.wh;
import org.telegram.ui.wm0;
import org.telegram.ui.yh;
import ph.d4;
import ph.t8;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class k extends l20 implements NotificationCenter.NotificationCenterDelegate {
    public final long M;
    public FrameLayout N;
    public fg.i O;
    public LinearLayout P;
    public lh.o Q;
    public e90 R;
    public boolean T;
    public TL_payments.starRefProgram U;
    public TL_payments.starRefProgram V;
    public boolean Y;
    public f Z;
    public final d S = new d(this, 0);
    public String[] W = null;
    public final List X = Arrays.asList(1, 3, 6, 12, 24, 36, 0);

    public k(long j10) {
        this.M = j10;
        this.J = true;
        this.I = AndroidUtilities.dp(60.0f);
    }

    public static void A0(k kVar, int i10) {
        f fVar = kVar.Z;
        if (fVar == null) {
            return;
        }
        int i11 = fVar.G(i10).d;
        if (i11 != 4) {
            if (i11 == 2) {
                kVar.presentFragment(new y3(kVar.M));
                return;
            }
            return;
        }
        LinearLayout linearLayout = new LinearLayout(kVar.getParentActivity());
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
        TextView textView = new TextView(kVar.getParentActivity());
        textView.setTextSize(1, 16.0f);
        int i12 = j6.G6;
        textView.setTextColor(j6.v0(i12, kVar.resourceProvider));
        org.telegram.messenger.y3.q(R.string.AffiliateProgramStopText, textView);
        linearLayout.addView(textView, b6.k(0.0f, 0.0f, 0.0f, 17.0f, -1, -2));
        wm0 wm0Var = new wm0(kVar.getParentActivity(), 2);
        wm0Var.setPadding(AndroidUtilities.dp(15.0f), 0, 0, 0);
        wm0Var.setTextSize(1, 16.0f);
        wm0Var.setTextColor(j6.v0(i12, kVar.resourceProvider));
        wm0Var.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.AffiliateProgramStopText1)));
        linearLayout.addView(wm0Var, b6.k(0.0f, 0.0f, 0.0f, 17.0f, -1, -2));
        wm0 wm0Var2 = new wm0(kVar.getParentActivity(), 2);
        wm0Var2.setPadding(AndroidUtilities.dp(15.0f), 0, 0, 0);
        wm0Var2.setTextSize(1, 16.0f);
        wm0Var2.setTextColor(j6.v0(i12, kVar.resourceProvider));
        wm0Var2.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.AffiliateProgramStopText2)));
        linearLayout.addView(wm0Var2, b6.k(0.0f, 0.0f, 0.0f, 17.0f, -1, -2));
        wm0 wm0Var3 = new wm0(kVar.getParentActivity(), 2);
        wm0Var3.setPadding(AndroidUtilities.dp(15.0f), 0, 0, 0);
        wm0Var3.setTextSize(1, 16.0f);
        wm0Var3.setTextColor(j6.v0(i12, kVar.resourceProvider));
        wm0Var3.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.AffiliateProgramStopText3)));
        linearLayout.addView(wm0Var3, b6.k(0.0f, 0.0f, 0.0f, 10.0f, -1, -2));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kVar.getParentActivity(), 0, kVar.resourceProvider);
        alertDialog$Builder.a.O = LocaleController.getString(R.string.AffiliateProgramAlert);
        alertDialog$Builder.n(linearLayout);
        alertDialog$Builder.k(LocaleController.getString(R.string.AffiliateProgramStopButton), new e(kVar, 0));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.d(-1);
        alertDialog$Builder.o();
    }

    public static String G0(int i10) {
        float f10 = i10 / 10.0f;
        if (((int) f10) != f10) {
            return String.format(Locale.US, "%.1f%%", Float.valueOf(f10));
        }
        Locale locale = Locale.US;
        return android.support.v4.media.a.l(i10 / 10, "%");
    }

    public static void x0(k kVar, Context context) {
        if (kVar.Q.T) {
            FrameLayout frameLayout = new FrameLayout(context);
            sz0 sz0Var = new sz0(context, kVar.resourceProvider);
            d dVar = new d(kVar, 1);
            sz0Var.c(LocaleController.getString(R.string.AffiliateProgramCommission), G0(kVar.V.commission_permille), null, null);
            String string = LocaleController.getString(R.string.AffiliateProgramDuration);
            int i10 = kVar.V.duration_months;
            sz0Var.c(string, i10 <= 0 ? LocaleController.getString(R.string.Infinity) : (i10 < 12 || i10 % 12 != 0) ? LocaleController.formatPluralString("Months", i10, new Object[0]) : LocaleController.formatPluralString("Years", i10 / 12, new Object[0]), null, null);
            frameLayout.addView(sz0Var, b6.d(-1, -2.0f, 119, 24.0f, 0.0f, 24.0f, 0.0f));
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, kVar.resourceProvider);
            alertDialog$Builder.a.O = LocaleController.getString(R.string.AffiliateProgramAlert);
            alertDialog$Builder.a.Q = LocaleController.getString(kVar.T ? R.string.AffiliateProgramStartAlertText : R.string.AffiliateProgramUpdateAlertText);
            alertDialog$Builder.n(frameLayout);
            alertDialog$Builder.k(LocaleController.getString(kVar.T ? R.string.AffiliateProgramStartAlertButton : R.string.AffiliateProgramUpdateAlertButton), new m5(dVar, 29));
            kh.a2.u(R.string.Cancel, alertDialog$Builder, null);
        }
    }

    public static /* synthetic */ void y0(k kVar, org.telegram.ui.ActionBar.d2 d2Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        long j10 = kVar.M;
        d2Var.dismiss();
        if (!(tLObject instanceof TL_payments.starRefProgram)) {
            if (tL_error != null) {
                qc.b0(tL_error);
                return;
            }
            return;
        }
        TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) tLObject;
        TLRPC.UserFull userFull = kVar.getMessagesController().getUserFull(j10);
        if (userFull != null) {
            userFull.starref_program = starrefprogram;
            kVar.getMessagesStorage().updateUserInfo(userFull, false);
            NotificationCenter.getInstance(kVar.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.userInfoDidLoad, Long.valueOf(j10), userFull);
        }
        kVar.D0(false);
    }

    public static /* synthetic */ void z0(k kVar, org.telegram.ui.ActionBar.d2 d2Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        long j10 = kVar.M;
        d2Var.dismiss();
        if (!(tLObject instanceof TL_payments.starRefProgram)) {
            if (tL_error != null) {
                qc.b0(tL_error);
                return;
            }
            return;
        }
        TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) tLObject;
        TLRPC.UserFull userFull = kVar.getMessagesController().getUserFull(j10);
        if (userFull != null) {
            TL_payments.starRefProgram starrefprogram2 = kVar.V;
            starrefprogram2.flags |= 2;
            starrefprogram2.end_date = kVar.getConnectionsManager().getCurrentTime() + (kVar.getConnectionsManager().isTestBackend() ? 300 : 86400);
            userFull.starref_program = starrefprogram;
            kVar.getMessagesStorage().updateUserInfo(userFull, false);
            NotificationCenter.getInstance(kVar.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.userInfoDidLoad, Long.valueOf(j10), userFull);
        }
        kVar.D0(true);
    }

    public final void D0(boolean z4) {
        org.telegram.ui.ActionBar.p2 p2Var = null;
        if (getParentLayout() == null || getParentLayout().getFragmentStack() == null) {
            finishFragment();
        } else {
            e5 parentLayout = getParentLayout();
            List fragmentStack = parentLayout.getFragmentStack();
            int size = fragmentStack.size() - 1;
            while (true) {
                if (size <= 0) {
                    size = -1;
                    break;
                }
                org.telegram.ui.ActionBar.p2 p2Var2 = (org.telegram.ui.ActionBar.p2) fragmentStack.get(size);
                if ((p2Var2 instanceof ProfileActivity) && ((ProfileActivity) p2Var2).a() == this.M) {
                    p2Var = p2Var2;
                    break;
                }
                size--;
            }
            if (p2Var != null) {
                for (int size2 = fragmentStack.size() - 1; size2 > size; size2--) {
                    ((ActionBarLayout) parentLayout).a0((org.telegram.ui.ActionBar.p2) fragmentStack.get(size2), false);
                }
                finishFragment();
            } else {
                finishFragment();
                p2Var = parentLayout.getBackgroundFragment();
            }
        }
        if (p2Var != null) {
            if (z4) {
                qc.a0(p2Var).M(LocaleController.getString(R.string.AffiliateProgramEndedTitle), AndroidUtilities.replaceTags(LocaleController.getString(R.string.AffiliateProgramEndedText)), R.raw.linkbroken).j();
            } else {
                qc.a0(p2Var).M(LocaleController.getString(R.string.AffiliateProgramStartedTitle), LocaleController.getString(R.string.AffiliateProgramStartedText), R.raw.contact_check).j();
            }
        }
    }

    public final void E0(ArrayList arrayList, w51 w51Var) {
        if (getParentActivity() == null) {
            return;
        }
        eg.h0 h0Var = (eg.h0) super.r0(getParentActivity());
        i51 i51Var = new i51(-2);
        i51Var.c = h0Var;
        arrayList.add(i51Var);
        arrayList.add(i.a(R.drawable.menu_feature_premium, LocaleController.getString(R.string.BotAffiliateProgramFeature1Title), LocaleController.getString(R.string.BotAffiliateProgramFeature1)));
        arrayList.add(i.a(R.drawable.msg_channel, LocaleController.getString(R.string.BotAffiliateProgramFeature2Title), LocaleController.getString(R.string.BotAffiliateProgramFeature2)));
        arrayList.add(i.a(R.drawable.menu_feature_links2, LocaleController.getString(R.string.BotAffiliateProgramFeature3Title), LocaleController.getString(R.string.BotAffiliateProgramFeature3)));
        arrayList.add(i51.A(1, null));
        arrayList.add(i51.t(LocaleController.getString(R.string.AffiliateProgramCommission)));
        int i10 = getMessagesController().starrefMinCommissionPermille;
        int i11 = this.V.commission_permille;
        int i12 = getMessagesController().starrefMaxCommissionPermille;
        wh whVar = new wh(6);
        a aVar = new a(this, 1);
        i51 i51Var2 = new i51(15);
        i51Var2.z = i11;
        i51Var2.C = aVar;
        w7 w7Var = new w7();
        w7Var.a = i10;
        w7Var.b = i12;
        w7Var.e = new ha(whVar, 7);
        i51Var2.G = w7Var;
        i51Var2.B = -1L;
        i51Var2.B = this.U == null ? -1 : r3.commission_permille;
        arrayList.add(i51Var2);
        yh.A(R.string.AffiliateProgramCommissionInfo, arrayList);
        yh.r(R.string.AffiliateProgramDuration, arrayList);
        String[] strArr = this.W;
        List list = this.X;
        if (strArr == null) {
            this.W = new String[list.size()];
            for (int i13 = 0; i13 < list.size(); i13++) {
                int intValue = ((Integer) list.get(i13)).intValue();
                if (intValue == 0) {
                    this.W[i13] = LocaleController.getString(R.string.Infinity);
                } else if (intValue < 12 || intValue % 12 != 0) {
                    this.W[i13] = LocaleController.formatPluralString("MonthsShort", intValue, new Object[0]);
                } else {
                    this.W[i13] = LocaleController.formatPluralString("YearsShort", intValue / 12, new Object[0]);
                }
            }
        }
        String[] strArr2 = this.W;
        int indexOf = list.indexOf(Integer.valueOf(this.V.duration_months));
        a aVar2 = new a(this, 2);
        i51 i51Var3 = new i51(14);
        i51Var3.p = strArr2;
        i51Var3.z = indexOf;
        i51Var3.C = aVar2;
        i51Var3.B = -1L;
        TL_payments.starRefProgram starrefprogram = this.U;
        if (starrefprogram != null) {
            if (starrefprogram.duration_months > 0) {
                int size = list.size() - 1;
                while (true) {
                    if (size < 0) {
                        break;
                    }
                    if (((Integer) list.get(size)).intValue() > 0 && ((Integer) list.get(size)).intValue() <= this.U.duration_months) {
                        i51Var3.B = size;
                        break;
                    }
                    size--;
                }
            } else {
                i51Var3.B = list.size() - 1;
            }
        }
        arrayList.add(i51Var3);
        yh.A(R.string.AffiliateProgramDurationInfo, arrayList);
        arrayList.add(g.a(2, getThemedColor(j6.uj), R.drawable.filled_earn_stars, LocaleController.getString(R.string.AffiliateProgramExistingProgramsTitle), LocaleController.getString(R.string.AffiliateProgramExistingProgramsText)));
        arrayList.add(i51.A(3, null));
        if (!this.T && this.V.end_date == 0) {
            i51 e = i51.e(4, LocaleController.getString(R.string.AffiliateProgramStop));
            e.r = true;
            arrayList.add(e);
            arrayList.add(i51.A(5, null));
        }
        arrayList.add(i51.A(6, null));
        arrayList.add(i51.A(7, null));
    }

    public final TL_payments.starRefProgram F0() {
        TL_payments.starRefProgram starrefprogram = new TL_payments.starRefProgram();
        starrefprogram.commission_permille = Utilities.clamp(50, getMessagesController().starrefMaxCommissionPermille, getMessagesController().starrefMinCommissionPermille);
        starrefprogram.duration_months = 1;
        return starrefprogram;
    }

    public final void H0(boolean z4) {
        this.Q.g(LocaleController.getString((this.T || this.V.end_date != 0) ? R.string.AffiliateProgramStart : R.string.AffiliateProgramUpdate), z4, true);
        d dVar = this.S;
        AndroidUtilities.cancelRunOnUIThread(dVar);
        dVar.run();
        this.R.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString((this.T || this.V.end_date != 0) ? R.string.AffiliateProgramStartInfo : R.string.AffiliateProgramUpdateInfo), new d(this, 2)));
        I0();
        f fVar = this.Z;
        if (fVar != null) {
            fVar.N(z4);
        }
    }

    public final void I0() {
        TL_payments.starRefProgram starrefprogram;
        lh.o oVar = this.Q;
        TL_payments.starRefProgram starrefprogram2 = this.V;
        oVar.setEnabled(starrefprogram2.end_date == 0 && !((starrefprogram = this.U) != null && starrefprogram.commission_permille == starrefprogram2.commission_permille && starrefprogram.duration_months == starrefprogram2.duration_months));
    }

    @Override // org.telegram.ui.l20, org.telegram.ui.ActionBar.p2
    public final View createView(Context context) {
        this.D = false;
        this.B = AndroidUtilities.dp(238.0f);
        new gw0(this, context, 8).setBackgroundColor(j6.w0(null, j6.i5, false));
        super.createView(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.N = frameLayout;
        frameLayout.setClickable(true);
        fg.i iVar = new fg.i(context, 1, 3);
        this.O = iVar;
        fg.a aVar = iVar.b;
        aVar.w = j6.fk;
        aVar.x = j6.gk;
        aVar.b();
        this.O.setStarParticlesView(this.e);
        this.N.addView(this.O, b6.d(190, 190.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        m0(LocaleController.getString(R.string.BotAffiliateProgramTitle), LocaleController.getString(R.string.BotAffiliateProgramText), this.N, null);
        LinearLayout linearLayout = new LinearLayout(context);
        this.P = linearLayout;
        linearLayout.setOrientation(1);
        this.P.setBackgroundColor(getThemedColor(j6.d6));
        View view = new View(context);
        view.setBackgroundColor(getThemedColor(j6.d7));
        this.P.addView(view, new LinearLayout.LayoutParams(b6.z(-1.0f), b6.z(1.0f / AndroidUtilities.density)));
        int i10 = 2;
        lh.o oVar = new lh.o(i10, context, this.resourceProvider, true);
        oVar.setRoundRadius(24);
        this.Q = oVar;
        oVar.g(LocaleController.getString(R.string.AffiliateProgramStart), false, true);
        this.Q.setOnClickListener(new t8(1, this, context));
        this.P.addView(this.Q, b6.k(10.0f, 10.0f, 10.0f, 7.0f, -1, 48));
        e90 e90Var = new e90(context, this.resourceProvider);
        this.R = e90Var;
        e90Var.setTextColor(getThemedColor(j6.z6));
        this.R.setLinkTextColor(getThemedColor(j6.gc));
        this.R.setTextSize(1, 12.0f);
        this.R.setGravity(17);
        this.P.addView(this.R, b6.k(32.0f, 1.0f, 32.0f, 8.0f, -1, -2));
        H0(false);
        ((FrameLayout) this.fragmentView).addView(this.P, b6.e(-1, -2, 87));
        this.c.setPadding(0, 0, 0, AndroidUtilities.dp(84.0f));
        this.c.setOnItemClickListener(new dg.n(this, 19));
        f2.l lVar = new f2.l();
        lVar.m = false;
        lVar.C = false;
        lVar.o(nr.h);
        lVar.n(350L);
        this.c.setItemAnimator(lVar);
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final int getNavigationBarColor() {
        return getThemedColor(j6.d6);
    }

    @Override // org.telegram.ui.l20
    public final f2.o0 n0() {
        f fVar = new f(this, this.c, getParentActivity(), this.currentAccount, this.classGuid, new d4(this, 7), getResourceProvider());
        this.Z = fVar;
        return fVar;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onFragmentCreate() {
        this.Y = true;
        this.T = true;
        this.V = F0();
        this.U = null;
        MessagesController messagesController = getMessagesController();
        long j10 = this.M;
        TLRPC.UserFull userFull = messagesController.getUserFull(j10);
        if (userFull != null) {
            this.T = false;
            TL_payments.starRefProgram starrefprogram = userFull.starref_program;
            this.V = starrefprogram;
            if (starrefprogram == null) {
                this.T = true;
                this.V = F0();
                this.U = null;
            } else {
                TL_payments.starRefProgram starrefprogram2 = new TL_payments.starRefProgram();
                this.U = starrefprogram2;
                TL_payments.starRefProgram starrefprogram3 = this.V;
                starrefprogram2.commission_permille = starrefprogram3.commission_permille;
                starrefprogram2.duration_months = starrefprogram3.duration_months;
            }
        } else {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(j10));
            if (user != null) {
                getMessagesController().loadFullUser(user, getClassGuid(), true, new a(this, 0));
            }
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onFragmentDestroy() {
        this.Y = false;
        AndroidUtilities.cancelRunOnUIThread(this.S);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.l20, org.telegram.ui.ActionBar.p2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.c.setPadding(0, 0, 0, AndroidUtilities.dp(84.0f) + i13);
        this.c.setClipToPadding(false);
        this.P.setPadding(0, 0, 0, i13);
    }

    @Override // org.telegram.ui.l20, org.telegram.ui.ActionBar.p2
    public final void onPause() {
        super.onPause();
        fg.i iVar = this.O;
        if (iVar != null) {
            iVar.setPaused(true);
            this.O.setDialogVisible(true);
        }
    }

    @Override // org.telegram.ui.l20, org.telegram.ui.ActionBar.p2
    public final void onResume() {
        super.onResume();
        fg.i iVar = this.O;
        if (iVar != null) {
            iVar.setPaused(false);
            this.O.setDialogVisible(false);
        }
    }

    @Override // org.telegram.ui.l20
    public final eg.q2 p0() {
        eg.h hVar = new eg.h(getParentActivity(), 4);
        hVar.b();
        return hVar;
    }

    @Override // org.telegram.ui.l20
    public final View r0(Context context) {
        throw null;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
    }
}
