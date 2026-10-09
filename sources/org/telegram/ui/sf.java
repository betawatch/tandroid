package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sf implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ sf(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Runnable runnable;
        int i10;
        int L;
        Activity parentActivity;
        int b10;
        View view2;
        int i11 = this.a;
        int i12 = 4;
        int i13 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i11) {
            case 0:
                zn znVar = (zn) obj2;
                if (znVar.getMediaDataController().saveToRingtones(((MessageObject) obj).getDocument())) {
                    znVar.T7();
                    UndoView undoView = znVar.y3;
                    if (undoView != null) {
                        long j3 = znVar.T5;
                        int i14 = UndoView.e0;
                        undoView.j(83, j3, new k4(znVar, 1));
                    }
                }
                znVar.D7(true);
                break;
            case 1:
                zn.W0((zn) obj2, (String) obj);
                break;
            case 2:
                zn.S0((zn) obj2, (org.telegram.ui.Components.p80) obj);
                break;
            case 3:
                org.telegram.ui.Cells.a2 a2Var = (org.telegram.ui.Cells.a2) obj2;
                boolean z10 = !a2Var.b();
                a2Var.c(z10, true);
                ((AtomicBoolean) obj).set(z10);
                break;
            case 4:
                zn.g1((zn) obj2, (Context) obj);
                break;
            case 5:
                uo uoVar = (uo) obj2;
                Context context = (Context) obj;
                org.telegram.ui.ActionBar.a3 a3Var = new org.telegram.ui.ActionBar.a3(context, null);
                org.telegram.ui.ActionBar.f3 f3Var = a3Var.a;
                f3Var.applyTopPadding = false;
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context, org.telegram.ui.ActionBar.i6.n5, 23, 15, false, null);
                m4Var.setHeight(47);
                m4Var.setText(LocaleController.getString("ChatHistory", R.string.ChatHistory));
                linearLayout.addView(m4Var);
                LinearLayout e7 = org.telegram.messenger.bi.e(context, 1);
                linearLayout.addView(e7, w7.x5.n(-1, -2));
                org.telegram.ui.Cells.j6[] j6VarArr = new org.telegram.ui.Cells.j6[2];
                int i15 = 0;
                for (int i16 = 2; i15 < i16; i16 = 2) {
                    org.telegram.ui.Cells.j6 j6Var = new org.telegram.ui.Cells.j6(context, true);
                    j6VarArr[i15] = j6Var;
                    j6Var.setTag(Integer.valueOf(i15));
                    j6VarArr[i15].setBackgroundDrawable(org.telegram.ui.ActionBar.i6.L0(false));
                    if (i15 == 0) {
                        j6VarArr[i15].b(LocaleController.getString("ChatHistoryVisible", R.string.ChatHistoryVisible), LocaleController.getString("ChatHistoryVisibleInfo", R.string.ChatHistoryVisibleInfo), true, !uoVar.J0);
                    } else if (ChatObject.isChannel(uoVar.x0)) {
                        j6VarArr[i15].b(LocaleController.getString("ChatHistoryHidden", R.string.ChatHistoryHidden), LocaleController.getString("ChatHistoryHiddenInfo", R.string.ChatHistoryHiddenInfo), false, uoVar.J0);
                    } else {
                        j6VarArr[i15].b(LocaleController.getString("ChatHistoryHidden", R.string.ChatHistoryHidden), LocaleController.getString("ChatHistoryHiddenInfo2", R.string.ChatHistoryHiddenInfo2), false, uoVar.J0);
                    }
                    e7.addView(j6VarArr[i15], w7.x5.n(-1, -2));
                    j6VarArr[i15].setOnClickListener(new a0(uoVar, j6VarArr, a3Var, 8));
                    i15++;
                }
                a3Var.b(linearLayout);
                uoVar.showDialog(f3Var);
                break;
            case 6:
                uo.U((uo) obj2, (FrameLayout) obj, view);
                break;
            case 7:
                nq.V((nq) obj2, (org.telegram.ui.ActionBar.a3) obj, view);
                break;
            case 8:
                new rg.y0(((org.telegram.ui.Components.e0) obj2).getContext(), 42, (org.telegram.ui.ActionBar.e6) obj).show();
                break;
            case 9:
                org.telegram.ui.Components.y.R((org.telegram.ui.Components.y) obj2, (org.telegram.ui.ActionBar.e6) obj);
                break;
            case 10:
                ((Utilities.Callback) obj2).run((TL_aicompose.AiComposeTone) obj);
                break;
            case 11:
                org.telegram.ui.ActionBar.v0 v0Var = (org.telegram.ui.ActionBar.v0) obj2;
                org.telegram.ui.Components.e5 e5Var = (org.telegram.ui.Components.e5) obj;
                v0Var.M(null, null);
                v0Var.G(e5Var.d, false);
                v0Var.setupPopupRadialSelectors(e5Var.f);
                v0Var.B(e5Var.e);
                break;
            case 12:
                boolean[] zArr = (boolean[]) obj2;
                boolean z11 = !zArr[0];
                zArr[0] = z11;
                ((org.telegram.ui.Cells.a2) view).c(z11, true);
                ((ai.t4) obj).run();
                break;
            case 13:
                int intValue = ((Integer) view.getTag()).intValue();
                ((AlertDialog$Builder) obj2).a.L0.run();
                ((lu) obj).onClick(null, intValue);
                break;
            case 14:
                runnable = ((org.telegram.ui.ActionBar.a3) obj2).a.dismissRunnable;
                runnable.run();
                ((Utilities.Callback) obj).run(null);
                break;
            case 15:
                ((boolean[]) obj2)[0] = true;
                ((Runnable) obj).run();
                break;
            case 16:
                org.telegram.ui.Components.l8.G((org.telegram.ui.Components.l8) obj2, (float[]) obj);
                break;
            case 17:
                org.telegram.ui.Components.l8 l8Var = (org.telegram.ui.Components.l8) obj2;
                l8Var.getClass();
                ((org.telegram.ui.Components.p80) obj).u();
                l8Var.u0(6);
                break;
            case 18:
                org.telegram.ui.Components.ta0 ta0Var = (org.telegram.ui.Components.ta0) obj;
                org.telegram.ui.Components.l8 l8Var2 = ((org.telegram.ui.Components.c8) obj2).F;
                i10 = ((org.telegram.ui.ActionBar.f3) l8Var2).currentAccount;
                LaunchActivity launchActivity = l8Var2.G0;
                if (MessagesController.getInstance(i10).getTotalDialogsCount() > 10 && !TextUtils.isEmpty(ta0Var.getText().toString())) {
                    String charSequence = ta0Var.getText().toString();
                    if (launchActivity.O().getLastFragment() instanceof ty) {
                        ty tyVar = (ty) launchActivity.O().getLastFragment();
                        int totalDialogsCount = tyVar.getMessagesController().getTotalDialogsCount();
                        if (!tyVar.l2 && (totalDialogsCount > 10 || tyVar.K)) {
                            if (tyVar.j2) {
                                tyVar.X.r.setText(charSequence);
                                tyVar.X.r.setSelection(charSequence.length());
                                dy dyVar = tyVar.C0;
                                if (dyVar != null && (L = dyVar.L(3)) >= 0 && tyVar.C0.getTabsView().getCurrentTabId() != L) {
                                    tyVar.C0.getTabsView().d(L, L);
                                }
                            } else {
                                tyVar.x = 3;
                                tyVar.X.r.setText(charSequence);
                                tyVar.X.r.setSelection(charSequence.length());
                            }
                            l8Var2.dismiss();
                            break;
                        }
                    }
                    ty tyVar2 = new ty(null);
                    tyVar2.n2 = charSequence;
                    tyVar2.x = 3;
                    launchActivity.q0(tyVar2, false, false);
                    l8Var2.dismiss();
                    break;
                }
                break;
            case 19:
                org.telegram.ui.Components.g9 g9Var = (org.telegram.ui.Components.g9) obj2;
                ((boolean[]) obj)[0] = true;
                g9Var.J.x1(g9Var.Y);
                g9Var.S.dismiss();
                break;
            case 20:
                org.telegram.ui.Components.ga gaVar = (org.telegram.ui.Components.ga) obj2;
                LaunchActivity launchActivity2 = (LaunchActivity) obj;
                if (!ApplicationLoader.isStandaloneBuild() && !BuildVars.DEBUG_VERSION) {
                    if (BuildVars.isHuaweiStoreApp()) {
                        of.f.s(launchActivity2, BuildVars.HUAWEI_STORE_URL);
                        break;
                    } else {
                        of.f.s(launchActivity2, BuildVars.PLAYSTORE_APP_URL);
                        break;
                    }
                } else if (ApplicationLoader.applicationLoaderInstance.checkApkInstallPermissions(gaVar.getContext())) {
                    TLRPC.TL_help_appUpdate tL_help_appUpdate = gaVar.n;
                    if (tL_help_appUpdate.document instanceof TLRPC.TL_document) {
                        if (!ApplicationLoader.applicationLoaderInstance.openApkInstall((Activity) gaVar.getContext(), gaVar.n.document)) {
                            FileLoader.getInstance(gaVar.s).loadFile(gaVar.n.document, "update", 3, 1);
                            gaVar.a(true);
                            break;
                        }
                    } else if (tL_help_appUpdate.url != null) {
                        of.f.s(gaVar.getContext(), gaVar.n.url);
                        break;
                    }
                }
                break;
            case 21:
                org.telegram.ui.Components.od odVar = (org.telegram.ui.Components.od) obj2;
                FrameLayout frameLayout = (FrameLayout) obj;
                org.telegram.ui.Components.p80 p80Var = odVar.X0;
                if (p80Var == null || !p80Var.D()) {
                    odVar.d1.e(true);
                    org.telegram.ui.Components.p80 F = org.telegram.ui.Components.p80.F(frameLayout, new ai.d(), odVar.V0);
                    odVar.X0 = F;
                    F.s = 0;
                    F.p(13, AndroidUtilities.dp(200.0f), LocaleController.getString(R.string.TimerPeriodHint));
                    odVar.X0.k();
                    int[] iArr = odVar.c1;
                    int length = iArr.length;
                    for (int i17 = 0; i17 < length; i17++) {
                        int i18 = iArr[i17];
                        odVar.X0.c(0, i18 == 0 ? LocaleController.getString(R.string.TimerPeriodDoNotDelete) : i18 == Integer.MAX_VALUE ? LocaleController.getString(R.string.TimerPeriodOnce) : LocaleController.formatPluralString("Seconds", i18, new Object[0]), new org.telegram.ui.Components.nd(odVar, i18, i13), false);
                        if (odVar.b1 == i18) {
                            odVar.X0.L();
                        }
                    }
                    odVar.X0.Z();
                    break;
                } else {
                    odVar.X0.u();
                    odVar.X0 = null;
                    break;
                }
                break;
            case 22:
                org.telegram.ui.Components.ul ulVar = (org.telegram.ui.Components.ul) obj2;
                org.telegram.ui.Components.wl wlVar = (org.telegram.ui.Components.wl) obj;
                org.telegram.ui.Components.xl xlVar = ulVar.b;
                org.telegram.ui.Components.yi yiVar = xlVar.b;
                zn znVar2 = (zn) yiVar.f0;
                if (znVar2.c()) {
                    parentActivity = xlVar.getParentActivity();
                    org.telegram.ui.Components.g5.L(parentActivity, znVar2.a(), new org.telegram.ui.Components.y2(i12, ulVar, wlVar), xlVar.a);
                    break;
                } else {
                    org.telegram.ui.Components.g5.Z(yiVar.M1, yiVar.l1() + 1, yiVar.p1(), new pc(20, ulVar, wlVar));
                    break;
                }
            case 23:
                org.telegram.ui.Components.lo loVar = ((org.telegram.ui.Components.jo) obj2).d;
                fc1 fc1Var = loVar.s;
                View F2 = fc1Var.F((org.telegram.ui.Components.io) obj);
                s4.d1 T = F2 != null ? fc1Var.T(F2) : null;
                if (T != null && (b10 = T.b() - loVar.t0) >= 0 && b10 < loVar.K.length) {
                    org.telegram.ui.Components.lo.R(loVar, b10);
                    break;
                }
                break;
            case 24:
                org.telegram.ui.Components.uo uoVar2 = (org.telegram.ui.Components.uo) obj2;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj;
                zn znVar3 = uoVar2.G;
                if (uoVar2.T) {
                    znVar3.showDialog(org.telegram.ui.Components.g5.U(uoVar2.getContext(), znVar3.h, e6Var).a);
                    break;
                } else {
                    org.telegram.ui.Components.qo qoVar = uoVar2.e;
                    if (znVar3.getParentActivity() != null) {
                        TLRPC.Chat chat = znVar3.e;
                        if (chat == null || ChatObject.canUserDoAdminAction(chat, 13)) {
                            TLRPC.ChatFull chatFull = znVar3.Z7;
                            TLRPC.UserFull userFull = znVar3.a8;
                            int i19 = userFull != null ? userFull.ttl_period : chatFull != null ? chatFull.ttl_period : 0;
                            org.telegram.ui.Components.q8 q8Var = new org.telegram.ui.Components.q8(uoVar2.getContext(), null, new org.telegram.ui.Components.ro(uoVar2, r4), true, 0, uoVar2.d0);
                            q8Var.b(i19);
                            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = q8Var.a;
                            org.telegram.ui.Components.so soVar = new org.telegram.ui.Components.so(uoVar2, actionBarPopupWindow$ActionBarPopupWindowLayout);
                            org.telegram.ui.ActionBar.n1[] n1VarArr = {soVar};
                            soVar.e = true;
                            soVar.c = 220;
                            soVar.setOutsideTouchable(true);
                            n1VarArr[0].setClippingEnabled(true);
                            n1VarArr[0].setAnimationStyle(R.style.PopupContextAnimation);
                            n1VarArr[0].setFocusable(true);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                            n1VarArr[0].setInputMethodMode(2);
                            n1VarArr[0].getContentView().setFocusableInTouchMode(true);
                            n1VarArr[0].showAtLocation(qoVar, 0, (int) (uoVar2.getX() + qoVar.getX()), (int) qoVar.getY());
                            znVar3.j8(false, true, 0.2f);
                            break;
                        } else if (uoVar2.a.f && znVar3.getParentActivity() != null && znVar3.fragmentView != null && znVar3.Z7 != null) {
                            if (znVar3.o2 == null) {
                                org.telegram.ui.Components.z40 z40Var = new org.telegram.ui.Components.z40(7, znVar3.getParentActivity(), znVar3.ea, true);
                                znVar3.o2 = z40Var;
                                z40Var.setAlpha(0.0f);
                                znVar3.o2.setVisibility(4);
                                znVar3.o2.setShowingDuration(4000L);
                                znVar3.X0.addView(znVar3.o2, w7.x5.a(-2.0f, 19.0f, 0.0f, 19.0f, 0.0f, -2, 51));
                            }
                            int i20 = znVar3.Z7.ttl_period;
                            znVar3.o2.setText(LocaleController.formatString("AutoDeleteSetInfo", R.string.AutoDeleteSetInfo, i20 > 86400 ? LocaleController.formatPluralString("Days", i20 / 86400, new Object[0]) : i20 >= 3600 ? LocaleController.formatPluralString("Hours", i20 / 3600, new Object[0]) : i20 >= 60 ? LocaleController.formatPluralString("Minutes", i20 / 60, new Object[0]) : LocaleController.formatPluralString("Seconds", i20, new Object[0])));
                            znVar3.o2.f(znVar3.a1.getTimeItem(), true);
                            break;
                        }
                    }
                }
                break;
            case 25:
                org.telegram.ui.Components.cq.p((org.telegram.ui.Components.cq) obj, (zn) obj2);
                break;
            case 26:
                org.telegram.ui.Components.ds.Q((org.telegram.ui.Components.ds) obj2, (TLRPC.Peer) obj);
                break;
            case 27:
                org.telegram.ui.Components.ls lsVar = (org.telegram.ui.Components.ls) obj2;
                String str = (String) obj;
                if (lsVar.b == null && (view2 = lsVar.d) != null) {
                    View findFocus = view2.findFocus();
                    if (findFocus instanceof EditText) {
                        lsVar.b = (EditText) findFocus;
                    }
                }
                if (lsVar.b != null) {
                    try {
                        lsVar.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    EditText editText = lsVar.b;
                    if (editText instanceof EditTextBoldCursor) {
                        ((EditTextBoldCursor) editText).setTextWatchersSuppressed(true, false);
                    }
                    Editable text = lsVar.b.getText();
                    int length2 = lsVar.b.getSelectionEnd() == lsVar.b.length() ? -1 : str.length() + lsVar.b.getSelectionStart();
                    if (lsVar.b.getSelectionStart() == -1 || lsVar.b.getSelectionEnd() == -1) {
                        lsVar.b.setText(str);
                        EditText editText2 = lsVar.b;
                        editText2.setSelection(editText2.length());
                    } else {
                        EditText editText3 = lsVar.b;
                        editText3.setText(text.replace(editText3.getSelectionStart(), lsVar.b.getSelectionEnd(), str));
                        EditText editText4 = lsVar.b;
                        if (length2 == -1) {
                            length2 = editText4.length();
                        }
                        editText4.setSelection(length2);
                    }
                    EditText editText5 = lsVar.b;
                    if (editText5 instanceof EditTextBoldCursor) {
                        ((EditTextBoldCursor) editText5).setTextWatchersSuppressed(false, true);
                        break;
                    }
                }
                break;
            case 28:
                org.telegram.ui.Components.vs vsVar = (org.telegram.ui.Components.vs) obj2;
                org.telegram.ui.Components.us usVar = (org.telegram.ui.Components.us) obj;
                vsVar.K();
                usVar.f = !usVar.f;
                usVar.j.X.N(true);
                vsVar.u();
                break;
            default:
                ((org.telegram.ui.Components.vs) obj2).B0 = !r13.B0;
                ((org.telegram.ui.Components.c71) obj).N(true);
                break;
        }
    }

    public /* synthetic */ sf(org.telegram.ui.Components.cq cqVar, zn znVar) {
        this.a = 25;
        this.c = cqVar;
        this.b = znVar;
    }
}
