package org.telegram.ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.Layout;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xt implements org.telegram.ui.Components.kv0, org.telegram.ui.ActionBar.b2, MessagesController.ErrorDelegate, org.telegram.ui.Components.og0, Utilities.Callback5, org.telegram.ui.Components.md0, org.telegram.ui.ActionBar.m1, org.telegram.ui.Components.wk0, rf.j1, org.telegram.ui.Components.bl0, r0.o, org.telegram.ui.Components.al0, qt, vd.b, bj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xt(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // rf.j1
    public /* synthetic */ boolean A(int i10) {
        switch (this.a) {
        }
        return true;
    }

    @Override // rf.j1
    public /* synthetic */ void E(ArrayList arrayList) {
        int i10 = this.a;
    }

    @Override // r0.o
    public r0.m1 I0(View view, r0.m1 m1Var) {
        ea0 ea0Var = (ea0) this.b;
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        if (!ea0Var.a.equals(defaultWindowInsets)) {
            ea0Var.a = defaultWindowInsets;
            ea0Var.requestLayout();
        }
        int childCount = ea0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            r0.j0.b(ea0Var.getChildAt(i10), m1Var);
        }
        return m1Var;
    }

    @Override // vd.b
    public void N(int i10, float f9, float f10, vd.c cVar) {
        pg0 pg0Var = (pg0) this.b;
        pg0Var.getClass();
        pg0Var.setScaleX(AndroidUtilities.lerp(1.0f, 1.019f, f9));
        pg0Var.setScaleY(AndroidUtilities.lerp(1.0f, 1.019f, f9));
    }

    @Override // org.telegram.ui.qt
    public void Z0(lt ltVar) {
        eg0 eg0Var = (eg0) this.b;
        eg0Var.E = true;
        String str = ltVar.c;
        eg0Var.a.setText(str);
        eg0Var.v(str, ltVar);
        eg0Var.y = ltVar;
        eg0Var.x = 0;
        eg0Var.E = false;
        MessagesController.getGlobalMainSettings().edit().putString("phone_code_last_matched_" + ltVar.c, ltVar.d).apply();
        AndroidUtilities.runOnUIThread(new uf0(eg0Var, 4), 300L);
        bg0 bg0Var = eg0Var.b;
        bg0Var.requestFocus();
        bg0Var.setSelection(bg0Var.length());
    }

    @Override // org.telegram.ui.bj0
    public void a(Canvas canvas) {
        ((Layout) this.b).draw(canvas);
    }

    @Override // org.telegram.ui.Components.al0
    public void b(float f9, float f10, int i10, View view) {
        int U;
        switch (this.a) {
            case 16:
                ub0 ub0Var = (ub0) this.b;
                ArrayList arrayList = ub0Var.s;
                if (view != null && i10 >= 0 && i10 < arrayList.size()) {
                    ob0 ob0Var = (ob0) arrayList.get(i10);
                    int i11 = ob0Var.a;
                    int i12 = ob0Var.e;
                    if (i11 != 3 && i11 != 4) {
                        if (i11 == 5 && ob0Var.f == 1) {
                            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                            boolean z10 = globalMainSettings.getBoolean("view_animations", true);
                            SharedPreferences.Editor edit = globalMainSettings.edit();
                            boolean z11 = !z10;
                            edit.putBoolean("view_animations", z11);
                            SharedConfig.setAnimationsEnabled(z11);
                            edit.commit();
                            ((org.telegram.ui.Cells.m8) view).setChecked(z11);
                            break;
                        }
                    } else if (!LiteMode.isPowerSaverApplied()) {
                        if (ob0Var.a == 3 && Integer.bitCount(i12) > 1 && (!LocaleController.isRTL ? f9 >= view.getMeasuredWidth() - AndroidUtilities.dp(75.0f) : f9 <= AndroidUtilities.dp(75.0f)) && (U = ub0Var.U(i12)) != -1) {
                            ub0Var.n[U] = !r8[U];
                            ub0Var.Y();
                            ub0Var.X();
                            break;
                        } else {
                            LiteMode.toggleFlag(i12, !LiteMode.isEnabledSetting(i12));
                            ub0Var.Y();
                            break;
                        }
                    } else {
                        ub0Var.e = org.telegram.ui.Components.tc.a0(ub0Var).L(new org.telegram.ui.Components.v9(0.1f, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Y5, false)), LocaleController.getString(R.string.LiteBatteryRestricted)).j();
                        break;
                    }
                }
                break;
            default:
                hg0.U((hg0) this.b, i10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.al0
    public /* synthetic */ boolean b1(View view) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Components.bl0
    public boolean c(int i10, View view) {
        switch (this.a) {
            case 13:
                break;
            case 23:
                final si0 si0Var = (si0) this.b;
                if (i10 >= si0Var.E && i10 < si0Var.F) {
                    try {
                        view.performHapticFeedback(0, 2);
                    } catch (Exception unused) {
                    }
                    final MessageObject messageObject = (MessageObject) si0Var.x.get(i10 - si0Var.E);
                    final long dialogId = MessageObject.getDialogId(messageObject.messageOwner);
                    final boolean isUserDialog = DialogObject.isUserDialog(dialogId);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(si0Var.getParentActivity(), 0, si0Var.getResourceProvider());
                    if (messageObject.isStory()) {
                        arrayList.add(LocaleController.getString(isUserDialog ? R.string.OpenProfile : R.string.OpenChannel2));
                        arrayList3.add(Integer.valueOf(isUserDialog ? R.drawable.msg_openprofile : R.drawable.msg_channel));
                    } else {
                        arrayList.add(LocaleController.getString(R.string.ViewMessage));
                        arrayList3.add(Integer.valueOf(R.drawable.msg_msgbubble3));
                    }
                    arrayList2.add(0);
                    CharSequence[] charSequenceArr = (CharSequence[]) arrayList.toArray(new CharSequence[arrayList2.size()]);
                    int[] intArray = AndroidUtilities.toIntArray(arrayList3);
                    DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.ni0
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i11) {
                            org.telegram.ui.ActionBar.o2 o2Var = si0.this;
                            o2Var.getClass();
                            MessageObject messageObject2 = messageObject;
                            boolean isStory = messageObject2.isStory();
                            boolean z10 = isUserDialog;
                            long j10 = dialogId;
                            if (isStory) {
                                o2Var.presentFragment(z10 ? ProfileActivity.m4(j10) : tn.R9(j10));
                                return;
                            }
                            Bundle bundle = new Bundle();
                            if (z10) {
                                bundle.putLong("user_id", j10);
                            } else {
                                bundle.putLong("chat_id", -j10);
                            }
                            bundle.putInt("message_id", messageObject2.getId());
                            bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                            if (o2Var.getMessagesController().checkCanOpenChat(bundle, o2Var)) {
                                o2Var.presentFragment(new tn(bundle));
                            }
                        }
                    };
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                    c2Var.L = charSequenceArr;
                    c2Var.M = intArray;
                    c2Var.I = onClickListener;
                    si0Var.showDialog(c2Var);
                    break;
                }
                break;
            default:
                gk0 gk0Var = (gk0) this.b;
                gk0Var.getClass();
                if (view instanceof fk0) {
                    fk0 fk0Var = (fk0) view;
                    gk0Var.Z(fk0Var.e);
                    fk0Var.performHapticFeedback(0);
                    break;
                }
                break;
        }
        return false;
    }

    @Override // rf.j1
    public void f(int i10) {
        switch (this.a) {
            case 11:
                k60 k60Var = (k60) this.b;
                m60 m60Var = k60Var.E;
                m60Var.q0(k60Var.D);
                if (k60Var.h == null && !k60Var.f.e() && k60Var.h() == 0) {
                    m60Var.s.e(false, true);
                }
                k60Var.l();
                break;
            default:
                yj0 yj0Var = (yj0) this.b;
                if (yj0Var.f == null && !yj0Var.h.e()) {
                    yj0Var.n.c.c();
                }
                yj0Var.l();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        int i11;
        ef.f fVar;
        int i12 = this.a;
        int i13 = 1;
        Object obj = this.b;
        switch (i12) {
            case 1:
                ((g5.v) obj).run();
                break;
            case 12:
                ((v60) obj).U(true);
                break;
            case 14:
                Pattern pattern = LaunchActivity.x1;
                AndroidUtilities.addToClipboard((StringBuilder) obj);
                break;
            case 17:
                pd0 pd0Var = (pd0) obj;
                Bundle bundle = new Bundle();
                bundle.putString("phone", pd0Var.E);
                bundle.putString("ephone", pd0Var.F);
                bundle.putString("phoneFormated", pd0Var.H);
                TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail = new TLRPC.TL_auth_resetLoginEmail();
                tL_auth_resetLoginEmail.phone_number = pd0Var.H;
                tL_auth_resetLoginEmail.phone_code_hash = pd0Var.I;
                pd0Var.S.getConnectionsManager().sendRequest(tL_auth_resetLoginEmail, new gd0(pd0Var, bundle, tL_auth_resetLoginEmail, i13), 10);
                break;
            case 18:
                xd0 xd0Var = (xd0) obj;
                fg0.n0(xd0Var.y, xd0Var.s, xd0Var.v, xd0Var.w);
                break;
            case 19:
                qe0 qe0Var = (qe0) obj;
                fg0 fg0Var = qe0Var.A;
                fg0Var.n1(0, true);
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Forgot password";
                i11 = ((org.telegram.ui.ActionBar.o2) fg0Var).currentAccount;
                ConnectionsManager.getInstance(i11).sendRequest(deleteaccount, new o(qe0Var, 12), 10);
                break;
            case 26:
                ((org.telegram.messenger.qj) obj).run();
                break;
            case 28:
                gk0 gk0Var = ((ck0) obj).b;
                SparseArray sparseArray = gk0Var.F;
                ArrayList arrayList = new ArrayList();
                for (int i14 = 0; i14 < sparseArray.size(); i14++) {
                    ek0 ek0Var = (ek0) sparseArray.valueAt(i14);
                    TLRPC.Document document = ek0Var.e;
                    if (document != null) {
                        arrayList.add(document);
                        ef.e eVar = gk0Var.getMediaDataController().ringtoneDataStore;
                        TLRPC.Document document2 = ek0Var.e;
                        ArrayList arrayList2 = eVar.e;
                        if (document2 != null) {
                            if (!eVar.f) {
                                eVar.f(true);
                                eVar.f = true;
                            }
                            int i15 = 0;
                            while (true) {
                                if (i15 < arrayList2.size()) {
                                    if (((ef.d) arrayList2.get(i15)).a == null || ((ef.d) arrayList2.get(i15)).a.id != document2.id) {
                                        i15++;
                                    } else {
                                        arrayList2.remove(i15);
                                    }
                                }
                            }
                        }
                    }
                    if (ek0Var.g != null && (fVar = gk0Var.getMediaDataController().ringtoneUploaderHashMap.get(ek0Var.g)) != null) {
                        fVar.c = true;
                        fVar.a();
                        int i16 = fVar.a;
                        FileLoader fileLoader = FileLoader.getInstance(i16);
                        String str = fVar.b;
                        fileLoader.cancelFileUpload(str, false);
                        MediaDataController.getInstance(i16).onRingtoneUploaded(str, null, true);
                    }
                    if (ek0Var == gk0Var.D) {
                        gk0Var.J = null;
                        gk0Var.D = (ek0) gk0Var.b.get(0);
                        gk0Var.E = true;
                    }
                    gk0Var.a.remove(ek0Var);
                    gk0Var.c.remove(ek0Var);
                }
                gk0Var.getMediaDataController().ringtoneDataStore.h();
                for (int i17 = 0; i17 < arrayList.size(); i17++) {
                    TLRPC.Document document3 = (TLRPC.Document) arrayList.get(i17);
                    TL_account.saveRingtone saveringtone = new TL_account.saveRingtone();
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    saveringtone.id = tL_inputDocument;
                    tL_inputDocument.id = document3.id;
                    tL_inputDocument.access_hash = document3.access_hash;
                    byte[] bArr = document3.file_reference;
                    tL_inputDocument.file_reference = bArr;
                    if (bArr == null) {
                        tL_inputDocument.file_reference = new byte[0];
                    }
                    saveringtone.unsave = true;
                    gk0Var.getConnectionsManager().sendRequest(saveringtone, new lh.o5(5));
                }
                gk0.W(gk0Var);
                gk0Var.c0();
                gk0Var.f.l();
                c2Var.dismiss();
                break;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) obj;
                passcodeActivity.getClass();
                SharedConfig.passcodeHash = "";
                SharedConfig.appLocked = false;
                SharedConfig.saveConfig();
                passcodeActivity.getMediaDataController().buildShortcuts();
                int childCount = passcodeActivity.c.getChildCount();
                int i18 = 0;
                while (true) {
                    if (i18 < childCount) {
                        View childAt = passcodeActivity.c.getChildAt(i18);
                        if (childAt instanceof org.telegram.ui.Cells.y9) {
                            ((org.telegram.ui.Cells.y9) childAt).setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.E6, false));
                        } else {
                            i18++;
                        }
                    }
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetPasscode, new Object[0]);
                passcodeActivity.finishFragment();
                break;
        }
    }

    @Override // org.telegram.ui.Components.kv0
    public void h(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        DataAutoDownloadActivity dataAutoDownloadActivity = ((yt) this.b).d;
        DownloadController.Preset preset = (DownloadController.Preset) dataAutoDownloadActivity.c.get(i10);
        if (preset == dataAutoDownloadActivity.y) {
            dataAutoDownloadActivity.e = 0;
        } else if (preset == dataAutoDownloadActivity.A) {
            dataAutoDownloadActivity.e = 1;
        } else if (preset == dataAutoDownloadActivity.B) {
            dataAutoDownloadActivity.e = 2;
        } else {
            dataAutoDownloadActivity.e = 3;
        }
        int i18 = dataAutoDownloadActivity.f;
        if (i18 == 0) {
            i17 = ((org.telegram.ui.ActionBar.o2) dataAutoDownloadActivity).currentAccount;
            DownloadController.getInstance(i17).currentMobilePreset = dataAutoDownloadActivity.e;
        } else if (i18 == 1) {
            i12 = ((org.telegram.ui.ActionBar.o2) dataAutoDownloadActivity).currentAccount;
            DownloadController.getInstance(i12).currentWifiPreset = dataAutoDownloadActivity.e;
        } else {
            i11 = ((org.telegram.ui.ActionBar.o2) dataAutoDownloadActivity).currentAccount;
            DownloadController.getInstance(i11).currentRoamingPreset = dataAutoDownloadActivity.e;
        }
        i13 = ((org.telegram.ui.ActionBar.o2) dataAutoDownloadActivity).currentAccount;
        SharedPreferences.Editor edit = MessagesController.getMainSettings(i13).edit();
        edit.putInt(dataAutoDownloadActivity.G, dataAutoDownloadActivity.e);
        edit.commit();
        i14 = ((org.telegram.ui.ActionBar.o2) dataAutoDownloadActivity).currentAccount;
        DownloadController.getInstance(i14).checkAutodownloadSettings();
        for (int i19 = 0; i19 < 4; i19++) {
            org.telegram.ui.Components.jl0 jl0Var = dataAutoDownloadActivity.b;
            i15 = dataAutoDownloadActivity.photosRow;
            f2.n1 K = jl0Var.K(i15 + i19);
            if (K != null) {
                yt ytVar = dataAutoDownloadActivity.a;
                i16 = dataAutoDownloadActivity.photosRow;
                ytVar.v(K, i16 + i19);
            }
        }
        dataAutoDownloadActivity.E = true;
    }

    @Override // org.telegram.ui.Components.md0
    public void i(org.telegram.ui.Components.nd0 nd0Var) {
        ExternalActionActivity externalActionActivity = (ExternalActionActivity) this.b;
        ArrayList arrayList = ExternalActionActivity.x;
        SharedConfig.isWaitingForPasscodeEnter = false;
        Intent intent = externalActionActivity.h;
        if (intent != null) {
            externalActionActivity.d(intent, externalActionActivity.n, externalActionActivity.v, true, externalActionActivity.r, externalActionActivity.s);
            externalActionActivity.h = null;
        }
        externalActionActivity.c.c0();
        if (AndroidUtilities.isTablet()) {
            externalActionActivity.d.c0();
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.passcodeDismissed, nd0Var);
    }

    @Override // org.telegram.ui.ActionBar.m1
    public void o(KeyEvent keyEvent) {
        lz lzVar = (lz) this.b;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && lzVar.x.isShowing()) {
            lzVar.x.d(true);
        }
    }

    @Override // org.telegram.ui.Components.al0
    public /* synthetic */ void o0(View view, float f9, float f10) {
        int i10 = this.a;
    }

    @Override // rf.j1
    public /* synthetic */ a0.h q() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Components.wk0
    public int run() {
        return ((FiltersSetupActivity) this.b).w;
    }

    @Override // rf.j1
    public /* synthetic */ a0.h t() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.a) {
            case 6:
                xy xyVar = (xy) this.b;
                View view = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                if (((org.telegram.ui.Components.w41) obj).d == 1 && xyVar.b != null) {
                    boolean z10 = !xyVar.c;
                    xyVar.c = z10;
                    bh.v vVar = xyVar.f;
                    if (vVar != null) {
                        vVar.run(Boolean.valueOf(z10), Boolean.valueOf(xyVar.d));
                    }
                    ((org.telegram.ui.Cells.q8) view).setChecked(xyVar.c);
                    xyVar.e.U2.N(true);
                    break;
                }
                break;
            default:
                org.telegram.ui.Components.jl0.N0((Canvas) obj, (RectF) obj2, ((Float) obj3).floatValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue(), ((org.telegram.ui.Components.jl0) this.b).l2);
                break;
        }
    }

    @Override // org.telegram.messenger.MessagesController.ErrorDelegate
    public boolean run(TLRPC.TL_error tL_error) {
        ((g5.x) this.b).run();
        return true;
    }

    private final /* synthetic */ void j(ArrayList arrayList) {
    }

    private final /* synthetic */ void k(ArrayList arrayList) {
    }

    @Override // org.telegram.ui.Components.kv0
    public /* synthetic */ void m() {
    }

    @Override // vd.b
    public /* synthetic */ void z(float f9, int i10) {
    }

    private final /* synthetic */ void d(View view, float f9, float f10) {
    }

    private final /* synthetic */ void e(View view, float f9, float f10) {
    }
}
