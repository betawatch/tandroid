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

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wt implements org.telegram.ui.Components.mw0, org.telegram.ui.ActionBar.a2, MessagesController.ErrorDelegate, org.telegram.ui.Components.nh0, Utilities.Callback5, org.telegram.ui.Components.ke0, org.telegram.ui.ActionBar.k1, org.telegram.ui.Components.tl0, hg.z1, org.telegram.ui.Components.yl0, r0.n, org.telegram.ui.Components.xl0, pt, ne.d, fj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wt(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // r0.n
    public r0.k1 B0(View view, r0.k1 k1Var) {
        ba0 ba0Var = (ba0) this.b;
        i0.c defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        if (!ba0Var.a.equals(defaultWindowInsets)) {
            ba0Var.a = defaultWindowInsets;
            ba0Var.requestLayout();
        }
        int childCount = ba0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            r0.i0.b(ba0Var.getChildAt(i10), k1Var);
        }
        return k1Var;
    }

    @Override // hg.z1
    public /* synthetic */ a0.h J() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.pt
    public void L0(kt ktVar) {
        eg0 eg0Var = (eg0) this.b;
        eg0Var.I = true;
        String str = ktVar.c;
        eg0Var.a.setText(str);
        eg0Var.t(str, ktVar);
        eg0Var.y = ktVar;
        eg0Var.x = 0;
        eg0Var.I = false;
        MessagesController.getGlobalMainSettings().edit().putString("phone_code_last_matched_" + ktVar.c, ktVar.d).apply();
        AndroidUtilities.runOnUIThread(new uf0(eg0Var, 4), 300L);
        bg0 bg0Var = eg0Var.b;
        bg0Var.requestFocus();
        bg0Var.setSelection(bg0Var.length());
    }

    @Override // hg.z1
    public /* synthetic */ boolean O(int i10) {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Components.xl0
    public /* synthetic */ boolean P0(View view) {
        return false;
    }

    @Override // hg.z1
    public /* synthetic */ void Y(ArrayList arrayList) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.yl0
    public boolean a(int i10, View view) {
        switch (this.a) {
            case 13:
                break;
            case 22:
                final wi0 wi0Var = (wi0) this.b;
                if (i10 >= wi0Var.I && i10 < wi0Var.J) {
                    try {
                        view.performHapticFeedback(0, 2);
                    } catch (Exception unused) {
                    }
                    final MessageObject messageObject = (MessageObject) wi0Var.x.get(i10 - wi0Var.I);
                    final long dialogId = MessageObject.getDialogId(messageObject.messageOwner);
                    final boolean isUserDialog = DialogObject.isUserDialog(dialogId);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wi0Var.getParentActivity(), 0, wi0Var.getResourceProvider());
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
                    DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.ri0
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i11) {
                            org.telegram.ui.ActionBar.n2 n2Var = wi0.this;
                            n2Var.getClass();
                            MessageObject messageObject2 = messageObject;
                            boolean isStory = messageObject2.isStory();
                            boolean z10 = isUserDialog;
                            long j10 = dialogId;
                            if (isStory) {
                                n2Var.presentFragment(z10 ? ProfileActivity.m4(j10) : sn.W9(j10));
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
                            if (n2Var.getMessagesController().checkCanOpenChat(bundle, n2Var)) {
                                n2Var.presentFragment(new sn(bundle));
                            }
                        }
                    };
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                    b2Var.P = charSequenceArr;
                    b2Var.Q = intArray;
                    b2Var.M = onClickListener;
                    wi0Var.showDialog(b2Var);
                    break;
                }
                break;
            default:
                mk0 mk0Var = (mk0) this.b;
                mk0Var.getClass();
                if (view instanceof lk0) {
                    lk0 lk0Var = (lk0) view;
                    mk0Var.Z(lk0Var.e);
                    lk0Var.performHapticFeedback(0);
                    break;
                }
                break;
        }
        return false;
    }

    @Override // org.telegram.ui.fj0
    public void b(Canvas canvas) {
        ((Layout) this.b).draw(canvas);
    }

    @Override // org.telegram.ui.Components.xl0
    public void d(float f7, float f10, int i10, View view) {
        int U;
        sb0 sb0Var = (sb0) this.b;
        ArrayList arrayList = sb0Var.s;
        if (view == null || i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        mb0 mb0Var = (mb0) arrayList.get(i10);
        int i11 = mb0Var.a;
        int i12 = mb0Var.e;
        if (i11 != 3 && i11 != 4) {
            if (i11 == 5 && mb0Var.f == 1) {
                SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                boolean z10 = globalMainSettings.getBoolean("view_animations", true);
                SharedPreferences.Editor edit = globalMainSettings.edit();
                boolean z11 = !z10;
                edit.putBoolean("view_animations", z11);
                SharedConfig.setAnimationsEnabled(z11);
                edit.commit();
                ((org.telegram.ui.Cells.q8) view).setChecked(z11);
                return;
            }
            return;
        }
        if (LiteMode.isPowerSaverApplied()) {
            sb0Var.e = org.telegram.ui.Components.xc.a0(sb0Var).L(new org.telegram.ui.Components.y9(0.1f, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Y5, false)), LocaleController.getString(R.string.LiteBatteryRestricted)).j();
            return;
        }
        if (mb0Var.a != 3 || Integer.bitCount(i12) <= 1 || (!LocaleController.isRTL ? f7 < view.getMeasuredWidth() - AndroidUtilities.dp(75.0f) : f7 > AndroidUtilities.dp(75.0f)) || (U = sb0Var.U(i12)) == -1) {
            LiteMode.toggleFlag(i12, !LiteMode.isEnabledSetting(i12));
            sb0Var.Y();
        } else {
            sb0Var.n[U] = !r8[U];
            sb0Var.Y();
            sb0Var.X();
        }
    }

    @Override // hg.z1
    public void f(int i10) {
        switch (this.a) {
            case 11:
                l60 l60Var = (l60) this.b;
                n60 n60Var = l60Var.I;
                n60Var.q0(l60Var.H);
                if (l60Var.h == null && !l60Var.f.e() && l60Var.h() == 0) {
                    n60Var.s.e(false, true);
                }
                l60Var.l();
                break;
            default:
                ck0 ck0Var = (ck0) this.b;
                if (ck0Var.f == null && !ck0Var.h.e()) {
                    ck0Var.n.c.c();
                }
                ck0Var.l();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11;
        wf.d dVar;
        int i12 = this.a;
        int i13 = 1;
        Object obj = this.b;
        switch (i12) {
            case 1:
                ((a3.i0) obj).run();
                break;
            case 12:
                ((w60) obj).U(true);
                break;
            case 14:
                Pattern pattern = LaunchActivity.C1;
                AndroidUtilities.addToClipboard((StringBuilder) obj);
                break;
            case 17:
                od0 od0Var = (od0) obj;
                Bundle bundle = new Bundle();
                bundle.putString("phone", od0Var.I);
                bundle.putString("ephone", od0Var.J);
                bundle.putString("phoneFormated", od0Var.L);
                TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail = new TLRPC.TL_auth_resetLoginEmail();
                tL_auth_resetLoginEmail.phone_number = od0Var.L;
                tL_auth_resetLoginEmail.phone_code_hash = od0Var.M;
                od0Var.W.getConnectionsManager().sendRequest(tL_auth_resetLoginEmail, new ed0(od0Var, bundle, tL_auth_resetLoginEmail, i13), 10);
                break;
            case 18:
                xd0 xd0Var = (xd0) obj;
                fg0.n0(xd0Var.y, xd0Var.s, xd0Var.v, xd0Var.w);
                break;
            case 19:
                qe0 qe0Var = (qe0) obj;
                fg0 fg0Var = qe0Var.E;
                fg0Var.n1(0, true);
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Forgot password";
                i11 = ((org.telegram.ui.ActionBar.n2) fg0Var).currentAccount;
                ConnectionsManager.getInstance(i11).sendRequest(deleteaccount, new m(qe0Var, 12), 10);
                break;
            case 25:
                ((org.telegram.messenger.xi) obj).run();
                break;
            case 27:
                mk0 mk0Var = ((ik0) obj).b;
                SparseArray sparseArray = mk0Var.J;
                ArrayList arrayList = new ArrayList();
                for (int i14 = 0; i14 < sparseArray.size(); i14++) {
                    kk0 kk0Var = (kk0) sparseArray.valueAt(i14);
                    TLRPC.Document document = kk0Var.e;
                    if (document != null) {
                        arrayList.add(document);
                        wf.c cVar = mk0Var.getMediaDataController().ringtoneDataStore;
                        TLRPC.Document document2 = kk0Var.e;
                        ArrayList arrayList2 = cVar.e;
                        if (document2 != null) {
                            if (!cVar.f) {
                                cVar.f(true);
                                cVar.f = true;
                            }
                            int i15 = 0;
                            while (true) {
                                if (i15 < arrayList2.size()) {
                                    if (((wf.b) arrayList2.get(i15)).a == null || ((wf.b) arrayList2.get(i15)).a.id != document2.id) {
                                        i15++;
                                    } else {
                                        arrayList2.remove(i15);
                                    }
                                }
                            }
                        }
                    }
                    if (kk0Var.g != null && (dVar = mk0Var.getMediaDataController().ringtoneUploaderHashMap.get(kk0Var.g)) != null) {
                        dVar.c = true;
                        dVar.a();
                        int i16 = dVar.a;
                        FileLoader fileLoader = FileLoader.getInstance(i16);
                        String str = dVar.b;
                        fileLoader.cancelFileUpload(str, false);
                        MediaDataController.getInstance(i16).onRingtoneUploaded(str, null, true);
                    }
                    if (kk0Var == mk0Var.H) {
                        mk0Var.N = null;
                        mk0Var.H = (kk0) mk0Var.b.get(0);
                        mk0Var.I = true;
                    }
                    mk0Var.a.remove(kk0Var);
                    mk0Var.c.remove(kk0Var);
                }
                mk0Var.getMediaDataController().ringtoneDataStore.h();
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
                    mk0Var.getConnectionsManager().sendRequest(saveringtone, new ci.e6(8));
                }
                mk0.W(mk0Var);
                mk0Var.c0();
                mk0Var.f.l();
                b2Var.dismiss();
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
                        if (childAt instanceof org.telegram.ui.Cells.ba) {
                            ((org.telegram.ui.Cells.ba) childAt).setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.E6, false));
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

    @Override // org.telegram.ui.Components.mw0
    public void h(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        DataAutoDownloadActivity dataAutoDownloadActivity = ((xt) this.b).d;
        DownloadController.Preset preset = (DownloadController.Preset) dataAutoDownloadActivity.c.get(i10);
        if (preset == dataAutoDownloadActivity.y) {
            dataAutoDownloadActivity.e = 0;
        } else if (preset == dataAutoDownloadActivity.E) {
            dataAutoDownloadActivity.e = 1;
        } else if (preset == dataAutoDownloadActivity.F) {
            dataAutoDownloadActivity.e = 2;
        } else {
            dataAutoDownloadActivity.e = 3;
        }
        int i18 = dataAutoDownloadActivity.f;
        if (i18 == 0) {
            i17 = ((org.telegram.ui.ActionBar.n2) dataAutoDownloadActivity).currentAccount;
            DownloadController.getInstance(i17).currentMobilePreset = dataAutoDownloadActivity.e;
        } else if (i18 == 1) {
            i12 = ((org.telegram.ui.ActionBar.n2) dataAutoDownloadActivity).currentAccount;
            DownloadController.getInstance(i12).currentWifiPreset = dataAutoDownloadActivity.e;
        } else {
            i11 = ((org.telegram.ui.ActionBar.n2) dataAutoDownloadActivity).currentAccount;
            DownloadController.getInstance(i11).currentRoamingPreset = dataAutoDownloadActivity.e;
        }
        i13 = ((org.telegram.ui.ActionBar.n2) dataAutoDownloadActivity).currentAccount;
        SharedPreferences.Editor edit = MessagesController.getMainSettings(i13).edit();
        edit.putInt(dataAutoDownloadActivity.K, dataAutoDownloadActivity.e);
        edit.commit();
        i14 = ((org.telegram.ui.ActionBar.n2) dataAutoDownloadActivity).currentAccount;
        DownloadController.getInstance(i14).checkAutodownloadSettings();
        for (int i19 = 0; i19 < 4; i19++) {
            org.telegram.ui.Components.im0 im0Var = dataAutoDownloadActivity.b;
            i15 = dataAutoDownloadActivity.photosRow;
            s4.b1 K = im0Var.K(i15 + i19);
            if (K != null) {
                xt xtVar = dataAutoDownloadActivity.a;
                i16 = dataAutoDownloadActivity.photosRow;
                xtVar.v(K, i16 + i19);
            }
        }
        dataAutoDownloadActivity.I = true;
    }

    @Override // org.telegram.ui.Components.ke0
    public void j(org.telegram.ui.Components.le0 le0Var) {
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
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.passcodeDismissed, le0Var);
    }

    @Override // org.telegram.ui.ActionBar.k1
    public void n(KeyEvent keyEvent) {
        lz lzVar = (lz) this.b;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && lzVar.x.isShowing()) {
            lzVar.x.d(true);
        }
    }

    @Override // org.telegram.ui.Components.tl0
    public int run() {
        return ((FiltersSetupActivity) this.b).w;
    }

    @Override // ne.d
    public void u(int i10, float f7, float f10, ne.e eVar) {
        rg0 rg0Var = (rg0) this.b;
        rg0Var.getClass();
        rg0Var.setScaleX(AndroidUtilities.lerp(1.0f, 1.019f, f7));
        rg0Var.setScaleY(AndroidUtilities.lerp(1.0f, 1.019f, f7));
    }

    @Override // hg.z1
    public /* synthetic */ a0.h y() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.a) {
            case 6:
                wy wyVar = (wy) this.b;
                View view = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                if (((org.telegram.ui.Components.f61) obj).d == 1 && wyVar.b != null) {
                    boolean z10 = !wyVar.c;
                    wyVar.c = z10;
                    ai.q5 q5Var = wyVar.f;
                    if (q5Var != null) {
                        q5Var.run(Boolean.valueOf(z10), Boolean.valueOf(wyVar.d));
                    }
                    ((org.telegram.ui.Cells.v8) view).setChecked(wyVar.c);
                    wyVar.e.W2.N(true);
                    break;
                }
                break;
            case 10:
                org.telegram.ui.Components.im0.O0((Canvas) obj, (RectF) obj2, ((Float) obj3).floatValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue(), ((org.telegram.ui.Components.im0) this.b).n2);
                break;
            default:
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                PasskeysActivity.W((PasskeysActivity) this.b, (org.telegram.ui.Components.f61) obj, (View) obj2);
                break;
        }
    }

    @Override // org.telegram.messenger.MessagesController.ErrorDelegate
    public boolean run(TLRPC.TL_error tL_error) {
        ((a3.h0) this.b).run();
        return true;
    }

    private final /* synthetic */ void c(ArrayList arrayList) {
    }

    private final /* synthetic */ void e(ArrayList arrayList) {
    }

    @Override // org.telegram.ui.Components.mw0
    public /* synthetic */ void m() {
    }

    @Override // ne.d
    public /* synthetic */ void E(float f7, int i10) {
    }

    @Override // org.telegram.ui.Components.xl0
    public /* synthetic */ void a0(View view, float f7, float f10) {
    }
}
