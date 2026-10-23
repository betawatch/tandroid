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

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xt implements org.telegram.ui.Components.rw0, org.telegram.ui.ActionBar.z1, MessagesController.ErrorDelegate, org.telegram.ui.Components.rh0, Utilities.Callback5, org.telegram.ui.Components.ne0, org.telegram.ui.ActionBar.k1, org.telegram.ui.Components.xl0, hg.z1, org.telegram.ui.Components.cm0, r0.n, org.telegram.ui.Components.bm0, qt, ne.d, hj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xt(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // r0.n
    public r0.k1 B0(View view, r0.k1 k1Var) {
        ga0 ga0Var = (ga0) this.b;
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        if (!ga0Var.a.equals(defaultWindowInsets)) {
            ga0Var.a = defaultWindowInsets;
            ga0Var.requestLayout();
        }
        int childCount = ga0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            r0.i0.b(ga0Var.getChildAt(i10), k1Var);
        }
        return k1Var;
    }

    @Override // hg.z1
    public /* synthetic */ a0.h G() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.qt
    public void L0(lt ltVar) {
        hg0 hg0Var = (hg0) this.b;
        hg0Var.K = true;
        String str = ltVar.c;
        hg0Var.a.setText(str);
        hg0Var.s(str, ltVar);
        hg0Var.F = ltVar;
        hg0Var.E = 0;
        hg0Var.K = false;
        MessagesController.getGlobalMainSettings().edit().putString("phone_code_last_matched_" + ltVar.c, ltVar.d).apply();
        AndroidUtilities.runOnUIThread(new xf0(hg0Var, 4), 300L);
        eg0 eg0Var = hg0Var.b;
        eg0Var.requestFocus();
        eg0Var.setSelection(eg0Var.length());
    }

    @Override // hg.z1
    public /* synthetic */ boolean O(int i10) {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Components.bm0
    public /* synthetic */ boolean P0(View view) {
        return false;
    }

    @Override // hg.z1
    public /* synthetic */ void S(ArrayList arrayList) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.hj0
    public void a(Canvas canvas) {
        ((Layout) this.b).draw(canvas);
    }

    @Override // org.telegram.ui.Components.bm0
    public void c(float f7, float f10, int i10, View view) {
        int U;
        wb0 wb0Var = (wb0) this.b;
        ArrayList arrayList = wb0Var.s;
        if (view == null || i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        qb0 qb0Var = (qb0) arrayList.get(i10);
        int i11 = qb0Var.a;
        int i12 = qb0Var.e;
        if (i11 != 3 && i11 != 4) {
            if (i11 == 5 && qb0Var.f == 1) {
                SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                boolean z10 = globalMainSettings.getBoolean("view_animations", true);
                SharedPreferences.Editor edit = globalMainSettings.edit();
                boolean z11 = !z10;
                edit.putBoolean("view_animations", z11);
                SharedConfig.setAnimationsEnabled(z11);
                edit.commit();
                ((org.telegram.ui.Cells.r8) view).setChecked(z11);
                return;
            }
            return;
        }
        if (LiteMode.isPowerSaverApplied()) {
            wb0Var.e = org.telegram.ui.Components.xc.a0(wb0Var).L(new org.telegram.ui.Components.y9(0.1f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Y5, false)), LocaleController.getString(R.string.LiteBatteryRestricted)).j();
            return;
        }
        if (qb0Var.a != 3 || Integer.bitCount(i12) <= 1 || (!LocaleController.isRTL ? f7 < view.getMeasuredWidth() - AndroidUtilities.dp(75.0f) : f7 > AndroidUtilities.dp(75.0f)) || (U = wb0Var.U(i12)) == -1) {
            LiteMode.toggleFlag(i12, !LiteMode.isEnabledSetting(i12));
            wb0Var.Y();
        } else {
            wb0Var.n[U] = !r8[U];
            wb0Var.Y();
            wb0Var.X();
        }
    }

    @Override // org.telegram.ui.Components.cm0
    public boolean d(int i10, View view) {
        switch (this.a) {
            case 13:
                break;
            case 22:
                final yi0 yi0Var = (yi0) this.b;
                if (i10 >= yi0Var.I && i10 < yi0Var.J) {
                    try {
                        view.performHapticFeedback(0, 2);
                    } catch (Exception unused) {
                    }
                    final MessageObject messageObject = (MessageObject) yi0Var.x.get(i10 - yi0Var.I);
                    final long dialogId = MessageObject.getDialogId(messageObject.messageOwner);
                    final boolean isUserDialog = DialogObject.isUserDialog(dialogId);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(yi0Var.getParentActivity(), 0, yi0Var.getResourceProvider());
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
                    DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.ti0
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i11) {
                            org.telegram.ui.ActionBar.o2 o2Var = yi0.this;
                            o2Var.getClass();
                            MessageObject messageObject2 = messageObject;
                            boolean isStory = messageObject2.isStory();
                            boolean z10 = isUserDialog;
                            long j10 = dialogId;
                            if (isStory) {
                                o2Var.presentFragment(z10 ? ProfileActivity.o4(j10) : sn.W9(j10));
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
                                o2Var.presentFragment(new sn(bundle));
                            }
                        }
                    };
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                    c2Var.P = charSequenceArr;
                    c2Var.Q = intArray;
                    c2Var.M = onClickListener;
                    yi0Var.showDialog(c2Var);
                    break;
                }
                break;
            default:
                nk0 nk0Var = (nk0) this.b;
                nk0Var.getClass();
                if (view instanceof mk0) {
                    mk0 mk0Var = (mk0) view;
                    nk0Var.Z(mk0Var.e);
                    mk0Var.performHapticFeedback(0);
                    break;
                }
                break;
        }
        return false;
    }

    @Override // hg.z1
    public void f(int i10) {
        switch (this.a) {
            case 11:
                n60 n60Var = (n60) this.b;
                p60 p60Var = n60Var.I;
                p60Var.q0(n60Var.H);
                if (n60Var.h == null && !n60Var.f.e() && n60Var.h() == 0) {
                    p60Var.s.e(false, true);
                }
                n60Var.l();
                break;
            default:
                fk0 fk0Var = (fk0) this.b;
                if (fk0Var.f == null && !fk0Var.h.e()) {
                    fk0Var.n.c.c();
                }
                fk0Var.l();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
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
                ((y60) obj).U(true);
                break;
            case 14:
                Pattern pattern = LaunchActivity.E1;
                AndroidUtilities.addToClipboard((StringBuilder) obj);
                break;
            case 17:
                rd0 rd0Var = (rd0) obj;
                Bundle bundle = new Bundle();
                bundle.putString("phone", rd0Var.I);
                bundle.putString("ephone", rd0Var.J);
                bundle.putString("phoneFormated", rd0Var.L);
                TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail = new TLRPC.TL_auth_resetLoginEmail();
                tL_auth_resetLoginEmail.phone_number = rd0Var.L;
                tL_auth_resetLoginEmail.phone_code_hash = rd0Var.M;
                rd0Var.W.getConnectionsManager().sendRequest(tL_auth_resetLoginEmail, new id0(rd0Var, bundle, tL_auth_resetLoginEmail, i13), 10);
                break;
            case 18:
                be0 be0Var = (be0) obj;
                ig0.n0(be0Var.y, be0Var.s, be0Var.v, be0Var.w);
                break;
            case 19:
                ve0 ve0Var = (ve0) obj;
                ig0 ig0Var = ve0Var.G;
                ig0Var.r1(0, true);
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Forgot password";
                i11 = ((org.telegram.ui.ActionBar.o2) ig0Var).currentAccount;
                ConnectionsManager.getInstance(i11).sendRequest(deleteaccount, new l(ve0Var, 13), 10);
                break;
            case 25:
                ((org.telegram.messenger.yi) obj).run();
                break;
            case 27:
                nk0 nk0Var = ((jk0) obj).b;
                SparseArray sparseArray = nk0Var.J;
                ArrayList arrayList = new ArrayList();
                for (int i14 = 0; i14 < sparseArray.size(); i14++) {
                    lk0 lk0Var = (lk0) sparseArray.valueAt(i14);
                    TLRPC.Document document = lk0Var.e;
                    if (document != null) {
                        arrayList.add(document);
                        wf.c cVar = nk0Var.getMediaDataController().ringtoneDataStore;
                        TLRPC.Document document2 = lk0Var.e;
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
                    if (lk0Var.g != null && (dVar = nk0Var.getMediaDataController().ringtoneUploaderHashMap.get(lk0Var.g)) != null) {
                        dVar.c = true;
                        dVar.a();
                        int i16 = dVar.a;
                        FileLoader fileLoader = FileLoader.getInstance(i16);
                        String str = dVar.b;
                        fileLoader.cancelFileUpload(str, false);
                        MediaDataController.getInstance(i16).onRingtoneUploaded(str, null, true);
                    }
                    if (lk0Var == nk0Var.H) {
                        nk0Var.N = null;
                        nk0Var.H = (lk0) nk0Var.b.get(0);
                        nk0Var.I = true;
                    }
                    nk0Var.a.remove(lk0Var);
                    nk0Var.c.remove(lk0Var);
                }
                nk0Var.getMediaDataController().ringtoneDataStore.h();
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
                    nk0Var.getConnectionsManager().sendRequest(saveringtone, new ci.d6(8));
                }
                nk0.W(nk0Var);
                nk0Var.d0();
                nk0Var.f.l();
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
                        if (childAt instanceof org.telegram.ui.Cells.ca) {
                            org.telegram.ui.ActionBar.r6.W(((org.telegram.ui.Cells.ca) childAt).getTextView(), org.telegram.ui.ActionBar.k6.E6, null);
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

    @Override // org.telegram.ui.Components.ne0
    public void h(org.telegram.ui.Components.pe0 pe0Var) {
        ExternalActionActivity externalActionActivity = (ExternalActionActivity) this.b;
        ArrayList arrayList = ExternalActionActivity.x;
        SharedConfig.isWaitingForPasscodeEnter = false;
        Intent intent = externalActionActivity.h;
        if (intent != null) {
            externalActionActivity.d(intent, externalActionActivity.n, externalActionActivity.v, true, externalActionActivity.r, externalActionActivity.s);
            externalActionActivity.h = null;
        }
        externalActionActivity.c.d0();
        if (AndroidUtilities.isTablet()) {
            externalActionActivity.d.d0();
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.passcodeDismissed, pe0Var);
    }

    @Override // org.telegram.ui.Components.rw0
    public void i(int i10) {
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
        } else if (preset == dataAutoDownloadActivity.E) {
            dataAutoDownloadActivity.e = 1;
        } else if (preset == dataAutoDownloadActivity.F) {
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
        edit.putInt(dataAutoDownloadActivity.K, dataAutoDownloadActivity.e);
        edit.commit();
        i14 = ((org.telegram.ui.ActionBar.o2) dataAutoDownloadActivity).currentAccount;
        DownloadController.getInstance(i14).checkAutodownloadSettings();
        for (int i19 = 0; i19 < 4; i19++) {
            org.telegram.ui.Components.mm0 mm0Var = dataAutoDownloadActivity.b;
            i15 = dataAutoDownloadActivity.photosRow;
            s4.b1 K = mm0Var.K(i15 + i19);
            if (K != null) {
                yt ytVar = dataAutoDownloadActivity.a;
                i16 = dataAutoDownloadActivity.photosRow;
                ytVar.v(K, i16 + i19);
            }
        }
        dataAutoDownloadActivity.I = true;
    }

    @Override // org.telegram.ui.ActionBar.k1
    public void j(KeyEvent keyEvent) {
        mz mzVar = (mz) this.b;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && mzVar.x.isShowing()) {
            mzVar.x.d(true);
        }
    }

    @Override // ne.d
    public void o(int i10, float f7, float f10, ne.e eVar) {
        tg0 tg0Var = (tg0) this.b;
        tg0Var.getClass();
        tg0Var.setScaleX(AndroidUtilities.lerp(1.0f, 1.019f, f7));
        tg0Var.setScaleY(AndroidUtilities.lerp(1.0f, 1.019f, f7));
    }

    @Override // org.telegram.ui.Components.xl0
    public int run() {
        return ((FiltersSetupActivity) this.b).w;
    }

    @Override // hg.z1
    public /* synthetic */ a0.h x() {
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
                if (((org.telegram.ui.Components.m61) obj).d == 1 && wyVar.b != null) {
                    boolean z10 = !wyVar.c;
                    wyVar.c = z10;
                    ai.r5 r5Var = wyVar.f;
                    if (r5Var != null) {
                        r5Var.run(Boolean.valueOf(z10), Boolean.valueOf(wyVar.d));
                    }
                    ((org.telegram.ui.Cells.w8) view).setChecked(wyVar.c);
                    wyVar.e.Z2.N(true);
                    break;
                }
                break;
            case 10:
                org.telegram.ui.Components.mm0.P0((Canvas) obj, (RectF) obj2, ((Float) obj3).floatValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue(), ((org.telegram.ui.Components.mm0) this.b).n2);
                break;
            default:
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                PasskeysActivity.W((PasskeysActivity) this.b, (org.telegram.ui.Components.m61) obj, (View) obj2);
                break;
        }
    }

    @Override // org.telegram.messenger.MessagesController.ErrorDelegate
    public boolean run(TLRPC.TL_error tL_error) {
        ((a3.h0) this.b).run();
        return true;
    }

    private final /* synthetic */ void b(ArrayList arrayList) {
    }

    private final /* synthetic */ void e(ArrayList arrayList) {
    }

    @Override // org.telegram.ui.Components.rw0
    public /* synthetic */ void m() {
    }

    @Override // ne.d
    public /* synthetic */ void H(float f7, int i10) {
    }

    @Override // org.telegram.ui.Components.bm0
    public /* synthetic */ void a0(View view, float f7, float f10) {
    }
}
