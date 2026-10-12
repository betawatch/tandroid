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

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class xf implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xf(int i10, Object obj, Object obj2) {
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
        int i12 = 7;
        int i13 = 1;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i11) {
            case 0:
                fo foVar = (fo) obj2;
                if (foVar.getMediaDataController().saveToRingtones(((MessageObject) obj).getDocument())) {
                    foVar.T7();
                    UndoView undoView = foVar.y3;
                    if (undoView != null) {
                        long j10 = foVar.T5;
                        int i14 = UndoView.e0;
                        undoView.j(83, j10, new m4(foVar, 1));
                    }
                }
                foVar.D7(true);
                break;
            case 1:
                fo.W0((fo) obj2, (String) obj);
                break;
            case 2:
                fo.S0((fo) obj2, (org.telegram.ui.Components.m80) obj);
                break;
            case 3:
                org.telegram.ui.Cells.a2 a2Var = (org.telegram.ui.Cells.a2) obj2;
                boolean z10 = !a2Var.b();
                a2Var.c(z10, true);
                ((AtomicBoolean) obj).set(z10);
                break;
            case 4:
                fo.g1((fo) obj2, (Context) obj);
                break;
            case 5:
                zo zoVar = (zo) obj2;
                Context context = (Context) obj;
                org.telegram.ui.ActionBar.z2 z2Var = new org.telegram.ui.ActionBar.z2(context, null);
                org.telegram.ui.ActionBar.e3 e3Var = z2Var.a;
                e3Var.applyTopPadding = false;
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context, org.telegram.ui.ActionBar.g6.n5, 23, 15, false, null);
                m4Var.setHeight(47);
                m4Var.setText(LocaleController.getString("ChatHistory", R.string.ChatHistory));
                linearLayout.addView(m4Var);
                LinearLayout e = org.telegram.messenger.yh.e(context, 1);
                linearLayout.addView(e, w7.a6.n(-1, -2));
                org.telegram.ui.Cells.j6[] j6VarArr = new org.telegram.ui.Cells.j6[2];
                int i15 = 0;
                for (int i16 = 2; i15 < i16; i16 = 2) {
                    org.telegram.ui.Cells.j6 j6Var = new org.telegram.ui.Cells.j6(context, true);
                    j6VarArr[i15] = j6Var;
                    j6Var.setTag(Integer.valueOf(i15));
                    j6VarArr[i15].setBackgroundDrawable(org.telegram.ui.ActionBar.g6.L0(false));
                    if (i15 == 0) {
                        j6VarArr[i15].b(LocaleController.getString("ChatHistoryVisible", R.string.ChatHistoryVisible), LocaleController.getString("ChatHistoryVisibleInfo", R.string.ChatHistoryVisibleInfo), true, !zoVar.J0);
                    } else if (ChatObject.isChannel(zoVar.x0)) {
                        j6VarArr[i15].b(LocaleController.getString("ChatHistoryHidden", R.string.ChatHistoryHidden), LocaleController.getString("ChatHistoryHiddenInfo", R.string.ChatHistoryHiddenInfo), false, zoVar.J0);
                    } else {
                        j6VarArr[i15].b(LocaleController.getString("ChatHistoryHidden", R.string.ChatHistoryHidden), LocaleController.getString("ChatHistoryHiddenInfo2", R.string.ChatHistoryHiddenInfo2), false, zoVar.J0);
                    }
                    e.addView(j6VarArr[i15], w7.a6.n(-1, -2));
                    j6VarArr[i15].setOnClickListener(new a0(zoVar, j6VarArr, z2Var, 8));
                    i15++;
                }
                z2Var.b(linearLayout);
                zoVar.showDialog(e3Var);
                break;
            case 6:
                zo.U((zo) obj2, (FrameLayout) obj, view);
                break;
            case 7:
                tq.V((tq) obj2, (org.telegram.ui.ActionBar.z2) obj, view);
                break;
            case 8:
                new sg.y0(((org.telegram.ui.Components.e0) obj2).getContext(), 42, (org.telegram.ui.ActionBar.c6) obj).show();
                break;
            case 9:
                org.telegram.ui.Components.y.R((org.telegram.ui.Components.y) obj2, (org.telegram.ui.ActionBar.c6) obj);
                break;
            case 10:
                ((Utilities.Callback) obj2).run((TL_aicompose.AiComposeTone) obj);
                break;
            case 11:
                org.telegram.ui.ActionBar.u0 u0Var = (org.telegram.ui.ActionBar.u0) obj2;
                org.telegram.ui.Components.e5 e5Var = (org.telegram.ui.Components.e5) obj;
                u0Var.M(null, null);
                u0Var.G(e5Var.d, false);
                u0Var.setupPopupRadialSelectors(e5Var.f);
                u0Var.B(e5Var.e);
                break;
            case 12:
                boolean[] zArr = (boolean[]) obj2;
                boolean z11 = !zArr[0];
                zArr[0] = z11;
                ((org.telegram.ui.Cells.a2) view).c(z11, true);
                ((bi.h4) obj).run();
                break;
            case 13:
                int intValue = ((Integer) view.getTag()).intValue();
                ((AlertDialog$Builder) obj2).a.L0.run();
                ((ru) obj).onClick(null, intValue);
                break;
            case 14:
                runnable = ((org.telegram.ui.ActionBar.z2) obj2).a.dismissRunnable;
                runnable.run();
                ((Utilities.Callback) obj).run(null);
                break;
            case 15:
                ((boolean[]) obj2)[0] = true;
                ((Runnable) obj).run();
                break;
            case 16:
                org.telegram.ui.Components.m8.G((org.telegram.ui.Components.m8) obj2, (float[]) obj);
                break;
            case 17:
                org.telegram.ui.Components.m8 m8Var = (org.telegram.ui.Components.m8) obj2;
                m8Var.getClass();
                ((org.telegram.ui.Components.m80) obj).u();
                m8Var.u0(6);
                break;
            case 18:
                org.telegram.ui.Components.sa0 sa0Var = (org.telegram.ui.Components.sa0) obj;
                org.telegram.ui.Components.m8 m8Var2 = ((org.telegram.ui.Components.d8) obj2).F;
                i10 = ((org.telegram.ui.ActionBar.e3) m8Var2).currentAccount;
                LaunchActivity launchActivity = m8Var2.G0;
                if (MessagesController.getInstance(i10).getTotalDialogsCount() > 10 && !TextUtils.isEmpty(sa0Var.getText().toString())) {
                    String charSequence = sa0Var.getText().toString();
                    if (launchActivity.O().getLastFragment() instanceof yy) {
                        yy yyVar = (yy) launchActivity.O().getLastFragment();
                        int totalDialogsCount = yyVar.getMessagesController().getTotalDialogsCount();
                        if (!yyVar.l2 && (totalDialogsCount > 10 || yyVar.K)) {
                            if (yyVar.j2) {
                                yyVar.X.r.setText(charSequence);
                                yyVar.X.r.setSelection(charSequence.length());
                                iy iyVar = yyVar.C0;
                                if (iyVar != null && (L = iyVar.L(3)) >= 0 && yyVar.C0.getTabsView().getCurrentTabId() != L) {
                                    yyVar.C0.getTabsView().d(L, L);
                                }
                            } else {
                                yyVar.x = 3;
                                yyVar.X.r.setText(charSequence);
                                yyVar.X.r.setSelection(charSequence.length());
                            }
                            m8Var2.dismiss();
                            break;
                        }
                    }
                    yy yyVar2 = new yy(null);
                    yyVar2.n2 = charSequence;
                    yyVar2.x = 3;
                    launchActivity.q0(yyVar2, false, false);
                    m8Var2.dismiss();
                    break;
                }
                break;
            case 19:
                org.telegram.ui.Components.h9 h9Var = (org.telegram.ui.Components.h9) obj2;
                ((boolean[]) obj)[0] = true;
                h9Var.J.x1(h9Var.Y);
                h9Var.S.dismiss();
                break;
            case 20:
                org.telegram.ui.Components.fa faVar = (org.telegram.ui.Components.fa) obj2;
                LaunchActivity launchActivity2 = (LaunchActivity) obj;
                if (!ApplicationLoader.isStandaloneBuild() && !BuildVars.DEBUG_VERSION) {
                    if (BuildVars.isHuaweiStoreApp()) {
                        pf.d.s(launchActivity2, BuildVars.HUAWEI_STORE_URL);
                        break;
                    } else {
                        pf.d.s(launchActivity2, BuildVars.PLAYSTORE_APP_URL);
                        break;
                    }
                } else if (ApplicationLoader.applicationLoaderInstance.checkApkInstallPermissions(faVar.getContext())) {
                    TLRPC.TL_help_appUpdate tL_help_appUpdate = faVar.n;
                    if (tL_help_appUpdate.document instanceof TLRPC.TL_document) {
                        if (!ApplicationLoader.applicationLoaderInstance.openApkInstall((Activity) faVar.getContext(), faVar.n.document)) {
                            FileLoader.getInstance(faVar.s).loadFile(faVar.n.document, "update", 3, 1);
                            faVar.a(true);
                            break;
                        }
                    } else if (tL_help_appUpdate.url != null) {
                        pf.d.s(faVar.getContext(), faVar.n.url);
                        break;
                    }
                }
                break;
            case 21:
                org.telegram.ui.Components.md mdVar = (org.telegram.ui.Components.md) obj2;
                FrameLayout frameLayout = (FrameLayout) obj;
                org.telegram.ui.Components.m80 m80Var = mdVar.X0;
                if (m80Var == null || !m80Var.D()) {
                    mdVar.d1.e(true);
                    org.telegram.ui.Components.m80 F = org.telegram.ui.Components.m80.F(frameLayout, new bi.b(), mdVar.V0);
                    mdVar.X0 = F;
                    F.s = 0;
                    F.p(13, AndroidUtilities.dp(200.0f), LocaleController.getString(R.string.TimerPeriodHint));
                    mdVar.X0.k();
                    int[] iArr = mdVar.c1;
                    int length = iArr.length;
                    for (int i17 = 0; i17 < length; i17++) {
                        int i18 = iArr[i17];
                        mdVar.X0.c(0, i18 == 0 ? LocaleController.getString(R.string.TimerPeriodDoNotDelete) : i18 == Integer.MAX_VALUE ? LocaleController.getString(R.string.TimerPeriodOnce) : LocaleController.formatPluralString("Seconds", i18, new Object[0]), new org.telegram.ui.Components.o8(mdVar, i18, i13), false);
                        if (mdVar.b1 == i18) {
                            mdVar.X0.L();
                        }
                    }
                    mdVar.X0.Z();
                    break;
                } else {
                    mdVar.X0.u();
                    mdVar.X0 = null;
                    break;
                }
                break;
            case 22:
                org.telegram.ui.Components.rl rlVar = (org.telegram.ui.Components.rl) obj2;
                org.telegram.ui.Components.tl tlVar = (org.telegram.ui.Components.tl) obj;
                org.telegram.ui.Components.ul ulVar = rlVar.b;
                org.telegram.ui.Components.vi viVar = ulVar.b;
                fo foVar2 = (fo) viVar.f0;
                if (foVar2.c()) {
                    parentActivity = ulVar.getParentActivity();
                    org.telegram.ui.Components.g5.L(parentActivity, foVar2.a(), new org.telegram.ui.Components.t2(i12, rlVar, tlVar), ulVar.a);
                    break;
                } else {
                    org.telegram.ui.Components.g5.Z(viVar.M1, viVar.l1() + 1, viVar.p1(), new vc(20, rlVar, tlVar));
                    break;
                }
            case 23:
                org.telegram.ui.Components.io ioVar = ((org.telegram.ui.Components.go) obj2).d;
                kc1 kc1Var = ioVar.s;
                View F2 = kc1Var.F((org.telegram.ui.Components.fo) obj);
                s4.b1 T = F2 != null ? kc1Var.T(F2) : null;
                if (T != null && (b10 = T.b() - ioVar.t0) >= 0 && b10 < ioVar.K.length) {
                    org.telegram.ui.Components.io.R(ioVar, b10);
                    break;
                }
                break;
            case 24:
                org.telegram.ui.Components.ro roVar = (org.telegram.ui.Components.ro) obj2;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) obj;
                fo foVar3 = roVar.G;
                if (roVar.T) {
                    foVar3.showDialog(org.telegram.ui.Components.g5.U(roVar.getContext(), foVar3.h, c6Var).a);
                    break;
                } else {
                    org.telegram.ui.Components.no noVar = roVar.e;
                    if (foVar3.getParentActivity() != null) {
                        TLRPC.Chat chat = foVar3.e;
                        if (chat == null || ChatObject.canUserDoAdminAction(chat, 13)) {
                            TLRPC.ChatFull chatFull = foVar3.Z7;
                            TLRPC.UserFull userFull = foVar3.a8;
                            int i19 = userFull != null ? userFull.ttl_period : chatFull != null ? chatFull.ttl_period : 0;
                            org.telegram.ui.Components.s8 s8Var = new org.telegram.ui.Components.s8(roVar.getContext(), null, new org.telegram.ui.Components.oo(roVar, r4), true, 0, roVar.d0);
                            s8Var.b(i19);
                            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = s8Var.a;
                            org.telegram.ui.Components.po poVar = new org.telegram.ui.Components.po(roVar, actionBarPopupWindow$ActionBarPopupWindowLayout);
                            org.telegram.ui.ActionBar.m1[] m1VarArr = {poVar};
                            poVar.e = true;
                            poVar.c = 220;
                            poVar.setOutsideTouchable(true);
                            m1VarArr[0].setClippingEnabled(true);
                            m1VarArr[0].setAnimationStyle(R.style.PopupContextAnimation);
                            m1VarArr[0].setFocusable(true);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                            m1VarArr[0].setInputMethodMode(2);
                            m1VarArr[0].getContentView().setFocusableInTouchMode(true);
                            m1VarArr[0].showAtLocation(noVar, 0, (int) (roVar.getX() + noVar.getX()), (int) noVar.getY());
                            foVar3.j8(false, true, 0.2f);
                            break;
                        } else if (roVar.a.f && foVar3.getParentActivity() != null && foVar3.fragmentView != null && foVar3.Z7 != null) {
                            if (foVar3.o2 == null) {
                                org.telegram.ui.Components.v40 v40Var = new org.telegram.ui.Components.v40(7, foVar3.getParentActivity(), foVar3.ea, true);
                                foVar3.o2 = v40Var;
                                v40Var.setAlpha(0.0f);
                                foVar3.o2.setVisibility(4);
                                foVar3.o2.setShowingDuration(4000L);
                                foVar3.X0.addView(foVar3.o2, w7.a6.a(-2.0f, 19.0f, 0.0f, 19.0f, 0.0f, -2, 51));
                            }
                            int i20 = foVar3.Z7.ttl_period;
                            foVar3.o2.setText(LocaleController.formatString("AutoDeleteSetInfo", R.string.AutoDeleteSetInfo, i20 > 86400 ? LocaleController.formatPluralString("Days", i20 / 86400, new Object[0]) : i20 >= 3600 ? LocaleController.formatPluralString("Hours", i20 / 3600, new Object[0]) : i20 >= 60 ? LocaleController.formatPluralString("Minutes", i20 / 60, new Object[0]) : LocaleController.formatPluralString("Seconds", i20, new Object[0])));
                            foVar3.o2.f(foVar3.a1.getTimeItem(), true);
                            break;
                        }
                    }
                }
                break;
            case 25:
                org.telegram.ui.Components.zp.o((org.telegram.ui.Components.zp) obj, (fo) obj2);
                break;
            case 26:
                org.telegram.ui.Components.as.Q((org.telegram.ui.Components.as) obj2, (TLRPC.Peer) obj);
                break;
            case 27:
                org.telegram.ui.Components.is isVar = (org.telegram.ui.Components.is) obj2;
                String str = (String) obj;
                if (isVar.b == null && (view2 = isVar.d) != null) {
                    View findFocus = view2.findFocus();
                    if (findFocus instanceof EditText) {
                        isVar.b = (EditText) findFocus;
                    }
                }
                if (isVar.b != null) {
                    try {
                        isVar.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    EditText editText = isVar.b;
                    if (editText instanceof EditTextBoldCursor) {
                        ((EditTextBoldCursor) editText).setTextWatchersSuppressed(true, false);
                    }
                    Editable text = isVar.b.getText();
                    int length2 = isVar.b.getSelectionEnd() == isVar.b.length() ? -1 : str.length() + isVar.b.getSelectionStart();
                    if (isVar.b.getSelectionStart() == -1 || isVar.b.getSelectionEnd() == -1) {
                        isVar.b.setText(str);
                        EditText editText2 = isVar.b;
                        editText2.setSelection(editText2.length());
                    } else {
                        EditText editText3 = isVar.b;
                        editText3.setText(text.replace(editText3.getSelectionStart(), isVar.b.getSelectionEnd(), str));
                        EditText editText4 = isVar.b;
                        if (length2 == -1) {
                            length2 = editText4.length();
                        }
                        editText4.setSelection(length2);
                    }
                    EditText editText5 = isVar.b;
                    if (editText5 instanceof EditTextBoldCursor) {
                        ((EditTextBoldCursor) editText5).setTextWatchersSuppressed(false, true);
                        break;
                    }
                }
                break;
            case 28:
                org.telegram.ui.Components.ss ssVar = (org.telegram.ui.Components.ss) obj2;
                org.telegram.ui.Components.rs rsVar = (org.telegram.ui.Components.rs) obj;
                ssVar.K();
                rsVar.f = !rsVar.f;
                rsVar.j.X.N(true);
                ssVar.u();
                break;
            default:
                ((org.telegram.ui.Components.ss) obj2).B0 = !r13.B0;
                ((org.telegram.ui.Components.z61) obj).N(true);
                break;
        }
    }

    public /* synthetic */ xf(org.telegram.ui.Components.zp zpVar, fo foVar) {
        this.a = 25;
        this.c = zpVar;
        this.b = foVar;
    }
}
