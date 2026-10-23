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

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ut implements org.telegram.ui.Components.ow0, org.telegram.ui.ActionBar.a2, MessagesController.ErrorDelegate, org.telegram.ui.Components.oh0, Utilities.Callback5, org.telegram.ui.Components.ke0, org.telegram.ui.ActionBar.k1, org.telegram.ui.Components.ul0, hg.z1, org.telegram.ui.Components.zl0, r0.n, org.telegram.ui.Components.yl0, nt, ne.d, dj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ut(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // r0.n
    public r0.k1 B0(View view, r0.k1 k1Var) {
        z90 z90Var = (z90) this.b;
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        if (!z90Var.a.equals(defaultWindowInsets)) {
            z90Var.a = defaultWindowInsets;
            z90Var.requestLayout();
        }
        int childCount = z90Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            r0.i0.b(z90Var.getChildAt(i10), k1Var);
        }
        return k1Var;
    }

    @Override // hg.z1
    public /* synthetic */ a0.h G() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.nt
    public void L0(ht htVar) {
        cg0 cg0Var = (cg0) this.b;
        cg0Var.I = true;
        String str = htVar.c;
        cg0Var.a.setText(str);
        cg0Var.t(str, htVar);
        cg0Var.y = htVar;
        cg0Var.x = 0;
        cg0Var.I = false;
        MessagesController.getGlobalMainSettings().edit().putString("phone_code_last_matched_" + htVar.c, htVar.d).apply();
        AndroidUtilities.runOnUIThread(new sf0(cg0Var, 4), 300L);
        zf0 zf0Var = cg0Var.b;
        zf0Var.requestFocus();
        zf0Var.setSelection(zf0Var.length());
    }

    @Override // hg.z1
    public /* synthetic */ boolean O(int i10) {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Components.yl0
    public /* synthetic */ boolean P0(View view) {
        return false;
    }

    @Override // hg.z1
    public /* synthetic */ void S(ArrayList arrayList) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.zl0
    public boolean a(int i10, View view) {
        switch (this.a) {
            case 13:
                break;
            case 22:
                final ui0 ui0Var = (ui0) this.b;
                if (i10 >= ui0Var.I && i10 < ui0Var.J) {
                    try {
                        view.performHapticFeedback(0, 2);
                    } catch (Exception unused) {
                    }
                    final MessageObject messageObject = (MessageObject) ui0Var.x.get(i10 - ui0Var.I);
                    final long dialogId = MessageObject.getDialogId(messageObject.messageOwner);
                    final boolean isUserDialog = DialogObject.isUserDialog(dialogId);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ui0Var.getParentActivity(), 0, ui0Var.getResourceProvider());
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
                    DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.pi0
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i11) {
                            org.telegram.ui.ActionBar.n2 n2Var = ui0.this;
                            n2Var.getClass();
                            MessageObject messageObject2 = messageObject;
                            boolean isStory = messageObject2.isStory();
                            boolean z10 = isUserDialog;
                            long j10 = dialogId;
                            if (isStory) {
                                n2Var.presentFragment(z10 ? ProfileActivity.m4(j10) : qn.W9(j10));
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
                                n2Var.presentFragment(new qn(bundle));
                            }
                        }
                    };
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                    b2Var.P = charSequenceArr;
                    b2Var.Q = intArray;
                    b2Var.M = onClickListener;
                    ui0Var.showDialog(b2Var);
                    break;
                }
                break;
            default:
                kk0 kk0Var = (kk0) this.b;
                kk0Var.getClass();
                if (view instanceof jk0) {
                    jk0 jk0Var = (jk0) view;
                    kk0Var.Z(jk0Var.e);
                    jk0Var.performHapticFeedback(0);
                    break;
                }
                break;
        }
        return false;
    }

    @Override // org.telegram.ui.dj0
    public void b(Canvas canvas) {
        ((Layout) this.b).draw(canvas);
    }

    @Override // org.telegram.ui.Components.yl0
    public void d(float f7, float f10, int i10, View view) {
        int U;
        qb0 qb0Var = (qb0) this.b;
        ArrayList arrayList = qb0Var.s;
        if (view == null || i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        kb0 kb0Var = (kb0) arrayList.get(i10);
        int i11 = kb0Var.a;
        int i12 = kb0Var.e;
        if (i11 != 3 && i11 != 4) {
            if (i11 == 5 && kb0Var.f == 1) {
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
            qb0Var.e = org.telegram.ui.Components.xc.a0(qb0Var).L(new org.telegram.ui.Components.y9(0.1f, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Y5, false)), LocaleController.getString(R.string.LiteBatteryRestricted)).j();
            return;
        }
        if (kb0Var.a != 3 || Integer.bitCount(i12) <= 1 || (!LocaleController.isRTL ? f7 < view.getMeasuredWidth() - AndroidUtilities.dp(75.0f) : f7 > AndroidUtilities.dp(75.0f)) || (U = qb0Var.U(i12)) == -1) {
            LiteMode.toggleFlag(i12, !LiteMode.isEnabledSetting(i12));
            qb0Var.Y();
        } else {
            qb0Var.n[U] = !r8[U];
            qb0Var.Y();
            qb0Var.X();
        }
    }

    @Override // hg.z1
    public void f(int i10) {
        switch (this.a) {
            case 11:
                j60 j60Var = (j60) this.b;
                l60 l60Var = j60Var.I;
                l60Var.q0(j60Var.H);
                if (j60Var.h == null && !j60Var.f.e() && j60Var.h() == 0) {
                    l60Var.s.e(false, true);
                }
                j60Var.l();
                break;
            default:
                ak0 ak0Var = (ak0) this.b;
                if (ak0Var.f == null && !ak0Var.h.e()) {
                    ak0Var.n.c.c();
                }
                ak0Var.l();
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
                ((u60) obj).U(true);
                break;
            case 14:
                Pattern pattern = LaunchActivity.C1;
                AndroidUtilities.addToClipboard((StringBuilder) obj);
                break;
            case 17:
                md0 md0Var = (md0) obj;
                Bundle bundle = new Bundle();
                bundle.putString("phone", md0Var.I);
                bundle.putString("ephone", md0Var.J);
                bundle.putString("phoneFormated", md0Var.L);
                TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail = new TLRPC.TL_auth_resetLoginEmail();
                tL_auth_resetLoginEmail.phone_number = md0Var.L;
                tL_auth_resetLoginEmail.phone_code_hash = md0Var.M;
                md0Var.W.getConnectionsManager().sendRequest(tL_auth_resetLoginEmail, new cd0(md0Var, bundle, tL_auth_resetLoginEmail, i13), 10);
                break;
            case 18:
                vd0 vd0Var = (vd0) obj;
                dg0.n0(vd0Var.y, vd0Var.s, vd0Var.v, vd0Var.w);
                break;
            case 19:
                oe0 oe0Var = (oe0) obj;
                dg0 dg0Var = oe0Var.E;
                dg0Var.n1(0, true);
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Forgot password";
                i11 = ((org.telegram.ui.ActionBar.n2) dg0Var).currentAccount;
                ConnectionsManager.getInstance(i11).sendRequest(deleteaccount, new m(oe0Var, 12), 10);
                break;
            case 25:
                ((org.telegram.messenger.yi) obj).run();
                break;
            case 27:
                kk0 kk0Var = ((gk0) obj).b;
                SparseArray sparseArray = kk0Var.J;
                ArrayList arrayList = new ArrayList();
                for (int i14 = 0; i14 < sparseArray.size(); i14++) {
                    ik0 ik0Var = (ik0) sparseArray.valueAt(i14);
                    TLRPC.Document document = ik0Var.e;
                    if (document != null) {
                        arrayList.add(document);
                        wf.c cVar = kk0Var.getMediaDataController().ringtoneDataStore;
                        TLRPC.Document document2 = ik0Var.e;
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
                    if (ik0Var.g != null && (dVar = kk0Var.getMediaDataController().ringtoneUploaderHashMap.get(ik0Var.g)) != null) {
                        dVar.c = true;
                        dVar.a();
                        int i16 = dVar.a;
                        FileLoader fileLoader = FileLoader.getInstance(i16);
                        String str = dVar.b;
                        fileLoader.cancelFileUpload(str, false);
                        MediaDataController.getInstance(i16).onRingtoneUploaded(str, null, true);
                    }
                    if (ik0Var == kk0Var.H) {
                        kk0Var.N = null;
                        kk0Var.H = (ik0) kk0Var.b.get(0);
                        kk0Var.I = true;
                    }
                    kk0Var.a.remove(ik0Var);
                    kk0Var.c.remove(ik0Var);
                }
                kk0Var.getMediaDataController().ringtoneDataStore.h();
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
                    kk0Var.getConnectionsManager().sendRequest(saveringtone, new ci.e6(8));
                }
                kk0.W(kk0Var);
                kk0Var.c0();
                kk0Var.f.l();
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

    @Override // org.telegram.ui.Components.ow0
    public void h(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        DataAutoDownloadActivity dataAutoDownloadActivity = ((vt) this.b).d;
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
            org.telegram.ui.Components.jm0 jm0Var = dataAutoDownloadActivity.b;
            i15 = dataAutoDownloadActivity.photosRow;
            s4.b1 K = jm0Var.K(i15 + i19);
            if (K != null) {
                vt vtVar = dataAutoDownloadActivity.a;
                i16 = dataAutoDownloadActivity.photosRow;
                vtVar.v(K, i16 + i19);
            }
        }
        dataAutoDownloadActivity.I = true;
    }

    @Override // org.telegram.ui.Components.ke0
    public void j(org.telegram.ui.Components.me0 me0Var) {
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
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.passcodeDismissed, me0Var);
    }

    @Override // org.telegram.ui.ActionBar.k1
    public void n(KeyEvent keyEvent) {
        jz jzVar = (jz) this.b;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && jzVar.x.isShowing()) {
            jzVar.x.d(true);
        }
    }

    @Override // ne.d
    public void r(int i10, float f7, float f10, ne.e eVar) {
        pg0 pg0Var = (pg0) this.b;
        pg0Var.getClass();
        pg0Var.setScaleX(AndroidUtilities.lerp(1.0f, 1.019f, f7));
        pg0Var.setScaleY(AndroidUtilities.lerp(1.0f, 1.019f, f7));
    }

    @Override // org.telegram.ui.Components.ul0
    public int run() {
        return ((FiltersSetupActivity) this.b).w;
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
                uy uyVar = (uy) this.b;
                View view = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                if (((org.telegram.ui.Components.h61) obj).d == 1 && uyVar.b != null) {
                    boolean z10 = !uyVar.c;
                    uyVar.c = z10;
                    ai.r5 r5Var = uyVar.f;
                    if (r5Var != null) {
                        r5Var.run(Boolean.valueOf(z10), Boolean.valueOf(uyVar.d));
                    }
                    ((org.telegram.ui.Cells.v8) view).setChecked(uyVar.c);
                    uyVar.e.W2.N(true);
                    break;
                }
                break;
            case 10:
                org.telegram.ui.Components.jm0.O0((Canvas) obj, (RectF) obj2, ((Float) obj3).floatValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue(), ((org.telegram.ui.Components.jm0) this.b).n2);
                break;
            default:
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                PasskeysActivity.W((PasskeysActivity) this.b, (org.telegram.ui.Components.h61) obj, (View) obj2);
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

    @Override // org.telegram.ui.Components.ow0
    public /* synthetic */ void m() {
    }

    @Override // ne.d
    public /* synthetic */ void H(float f7, int i10) {
    }

    @Override // org.telegram.ui.Components.yl0
    public /* synthetic */ void a0(View view, float f7, float f10) {
    }
}
