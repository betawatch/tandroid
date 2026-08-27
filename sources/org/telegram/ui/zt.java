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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zt implements org.telegram.ui.Components.cv0, org.telegram.ui.ActionBar.a2, MessagesController.ErrorDelegate, org.telegram.ui.Components.fg0, Utilities.Callback5, org.telegram.ui.Components.cd0, org.telegram.ui.ActionBar.l1, org.telegram.ui.Components.mk0, pf.i1, org.telegram.ui.Components.rk0, r0.o, org.telegram.ui.Components.qk0, st, ud.b, fj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zt(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // pf.i1
    public /* synthetic */ boolean D0(int i10) {
        switch (this.a) {
        }
        return true;
    }

    @Override // r0.o
    public r0.m1 I0(View view, r0.m1 m1Var) {
        fa0 fa0Var = (fa0) this.b;
        i0.c defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        if (!fa0Var.a.equals(defaultWindowInsets)) {
            fa0Var.a = defaultWindowInsets;
            fa0Var.requestLayout();
        }
        int childCount = fa0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            r0.j0.b(fa0Var.getChildAt(i10), m1Var);
        }
        return m1Var;
    }

    @Override // pf.i1
    public /* synthetic */ a0.h J() {
        switch (this.a) {
        }
        return null;
    }

    @Override // pf.i1
    public /* synthetic */ void V0(ArrayList arrayList) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.st
    public void Z0(nt ntVar) {
        hg0 hg0Var = (hg0) this.b;
        hg0Var.E = true;
        String str = ntVar.c;
        hg0Var.a.setText(str);
        hg0Var.u(str, ntVar);
        hg0Var.y = ntVar;
        hg0Var.x = 0;
        hg0Var.E = false;
        MessagesController.getGlobalMainSettings().edit().putString("phone_code_last_matched_" + ntVar.c, ntVar.d).apply();
        AndroidUtilities.runOnUIThread(new xf0(hg0Var, 4), 300L);
        eg0 eg0Var = hg0Var.b;
        eg0Var.requestFocus();
        eg0Var.setSelection(eg0Var.length());
    }

    @Override // org.telegram.ui.Components.rk0
    public boolean a(int i10, View view) {
        switch (this.a) {
            case 13:
                break;
            case 23:
                final vi0 vi0Var = (vi0) this.b;
                if (i10 >= vi0Var.E && i10 < vi0Var.F) {
                    try {
                        view.performHapticFeedback(0, 2);
                    } catch (Exception unused) {
                    }
                    final MessageObject messageObject = (MessageObject) vi0Var.x.get(i10 - vi0Var.E);
                    final long dialogId = MessageObject.getDialogId(messageObject.messageOwner);
                    final boolean isUserDialog = DialogObject.isUserDialog(dialogId);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(vi0Var.getParentActivity(), 0, vi0Var.getResourceProvider());
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
                    DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.qi0
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i11) {
                            org.telegram.ui.ActionBar.n2 n2Var = vi0.this;
                            n2Var.getClass();
                            MessageObject messageObject2 = messageObject;
                            boolean isStory = messageObject2.isStory();
                            boolean z10 = isUserDialog;
                            long j10 = dialogId;
                            if (isStory) {
                                n2Var.presentFragment(z10 ? ProfileActivity.m4(j10) : rn.R9(j10));
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
                                n2Var.presentFragment(new rn(bundle));
                            }
                        }
                    };
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                    b2Var.L = charSequenceArr;
                    b2Var.M = intArray;
                    b2Var.I = onClickListener;
                    vi0Var.showDialog(b2Var);
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

    @Override // org.telegram.ui.fj0
    public void b(Canvas canvas) {
        ((Layout) this.b).draw(canvas);
    }

    @Override // org.telegram.ui.Components.qk0
    public void c(float f10, float f11, int i10, View view) {
        int U;
        switch (this.a) {
            case 16:
                xb0 xb0Var = (xb0) this.b;
                ArrayList arrayList = xb0Var.s;
                if (view != null && i10 >= 0 && i10 < arrayList.size()) {
                    rb0 rb0Var = (rb0) arrayList.get(i10);
                    int i11 = rb0Var.a;
                    int i12 = rb0Var.e;
                    if (i11 != 3 && i11 != 4) {
                        if (i11 == 5 && rb0Var.f == 1) {
                            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                            boolean z10 = globalMainSettings.getBoolean("view_animations", true);
                            SharedPreferences.Editor edit = globalMainSettings.edit();
                            boolean z11 = !z10;
                            edit.putBoolean("view_animations", z11);
                            SharedConfig.setAnimationsEnabled(z11);
                            edit.commit();
                            ((org.telegram.ui.Cells.l8) view).setChecked(z11);
                            break;
                        }
                    } else if (!LiteMode.isPowerSaverApplied()) {
                        if (rb0Var.a == 3 && Integer.bitCount(i12) > 1 && (!LocaleController.isRTL ? f10 >= view.getMeasuredWidth() - AndroidUtilities.dp(75.0f) : f10 <= AndroidUtilities.dp(75.0f)) && (U = xb0Var.U(i12)) != -1) {
                            xb0Var.n[U] = !r8[U];
                            xb0Var.Y();
                            xb0Var.X();
                            break;
                        } else {
                            LiteMode.toggleFlag(i12, !LiteMode.isEnabledSetting(i12));
                            xb0Var.Y();
                            break;
                        }
                    } else {
                        xb0Var.e = org.telegram.ui.Components.mc.a0(xb0Var).L(new org.telegram.ui.Components.p9(0.1f, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Y5, false)), LocaleController.getString(R.string.LiteBatteryRestricted)).j();
                        break;
                    }
                }
                break;
            default:
                kg0.U((kg0) this.b, i10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.qk0
    public /* synthetic */ void c0(View view, float f10, float f11) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11;
        cf.e eVar;
        int i12 = this.a;
        int i13 = 1;
        Object obj = this.b;
        switch (i12) {
            case 1:
                ((e5.u) obj).run();
                break;
            case 12:
                ((w60) obj).U(true);
                break;
            case 14:
                Pattern pattern = LaunchActivity.x1;
                AndroidUtilities.addToClipboard((StringBuilder) obj);
                break;
            case 17:
                sd0 sd0Var = (sd0) obj;
                Bundle bundle = new Bundle();
                bundle.putString("phone", sd0Var.E);
                bundle.putString("ephone", sd0Var.F);
                bundle.putString("phoneFormated", sd0Var.H);
                TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail = new TLRPC.TL_auth_resetLoginEmail();
                tL_auth_resetLoginEmail.phone_number = sd0Var.H;
                tL_auth_resetLoginEmail.phone_code_hash = sd0Var.I;
                sd0Var.S.getConnectionsManager().sendRequest(tL_auth_resetLoginEmail, new id0(sd0Var, bundle, tL_auth_resetLoginEmail, i13), 10);
                break;
            case 18:
                be0 be0Var = (be0) obj;
                ig0.n0(be0Var.y, be0Var.s, be0Var.v, be0Var.w);
                break;
            case 19:
                ue0 ue0Var = (ue0) obj;
                ig0 ig0Var = ue0Var.A;
                ig0Var.n1(0, true);
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Forgot password";
                i11 = ((org.telegram.ui.ActionBar.n2) ig0Var).currentAccount;
                ConnectionsManager.getInstance(i11).sendRequest(deleteaccount, new n(ue0Var, 12), 10);
                break;
            case 26:
                ((org.telegram.messenger.nj) obj).run();
                break;
            case 28:
                kk0 kk0Var = ((gk0) obj).b;
                SparseArray sparseArray = kk0Var.F;
                ArrayList arrayList = new ArrayList();
                for (int i14 = 0; i14 < sparseArray.size(); i14++) {
                    ik0 ik0Var = (ik0) sparseArray.valueAt(i14);
                    TLRPC.Document document = ik0Var.e;
                    if (document != null) {
                        arrayList.add(document);
                        cf.d dVar = kk0Var.getMediaDataController().ringtoneDataStore;
                        TLRPC.Document document2 = ik0Var.e;
                        ArrayList arrayList2 = dVar.e;
                        if (document2 != null) {
                            if (!dVar.f) {
                                dVar.f(true);
                                dVar.f = true;
                            }
                            int i15 = 0;
                            while (true) {
                                if (i15 < arrayList2.size()) {
                                    if (((cf.c) arrayList2.get(i15)).a == null || ((cf.c) arrayList2.get(i15)).a.id != document2.id) {
                                        i15++;
                                    } else {
                                        arrayList2.remove(i15);
                                    }
                                }
                            }
                        }
                    }
                    if (ik0Var.g != null && (eVar = kk0Var.getMediaDataController().ringtoneUploaderHashMap.get(ik0Var.g)) != null) {
                        eVar.c = true;
                        eVar.a();
                        int i16 = eVar.a;
                        FileLoader fileLoader = FileLoader.getInstance(i16);
                        String str = eVar.b;
                        fileLoader.cancelFileUpload(str, false);
                        MediaDataController.getInstance(i16).onRingtoneUploaded(str, null, true);
                    }
                    if (ik0Var == kk0Var.D) {
                        kk0Var.J = null;
                        kk0Var.D = (ik0) kk0Var.b.get(0);
                        kk0Var.E = true;
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
                    kk0Var.getConnectionsManager().sendRequest(saveringtone, new jh.m5(5));
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
                        if (childAt instanceof org.telegram.ui.Cells.x9) {
                            ((org.telegram.ui.Cells.x9) childAt).setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.E6, false));
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

    @Override // org.telegram.ui.Components.qk0
    public /* synthetic */ boolean f1(View view) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Components.cd0
    public void h(org.telegram.ui.Components.dd0 dd0Var) {
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
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.passcodeDismissed, dd0Var);
    }

    @Override // pf.i1
    public /* synthetic */ a0.h h0() {
        switch (this.a) {
        }
        return null;
    }

    @Override // pf.i1
    public void i(int i10) {
        switch (this.a) {
            case 11:
                m60 m60Var = (m60) this.b;
                o60 o60Var = m60Var.E;
                o60Var.q0(m60Var.D);
                if (m60Var.h == null && !m60Var.f.e() && m60Var.h() == 0) {
                    o60Var.s.e(false, true);
                }
                m60Var.l();
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

    @Override // org.telegram.ui.Components.cv0
    public void j(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        DataAutoDownloadActivity dataAutoDownloadActivity = ((au) this.b).d;
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
        edit.putInt(dataAutoDownloadActivity.G, dataAutoDownloadActivity.e);
        edit.commit();
        i14 = ((org.telegram.ui.ActionBar.n2) dataAutoDownloadActivity).currentAccount;
        DownloadController.getInstance(i14).checkAutodownloadSettings();
        for (int i19 = 0; i19 < 4; i19++) {
            org.telegram.ui.Components.zk0 zk0Var = dataAutoDownloadActivity.b;
            i15 = dataAutoDownloadActivity.photosRow;
            f2.o1 K = zk0Var.K(i15 + i19);
            if (K != null) {
                au auVar = dataAutoDownloadActivity.a;
                i16 = dataAutoDownloadActivity.photosRow;
                auVar.v(K, i16 + i19);
            }
        }
        dataAutoDownloadActivity.E = true;
    }

    @Override // org.telegram.ui.ActionBar.l1
    public void k(KeyEvent keyEvent) {
        mz mzVar = (mz) this.b;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && mzVar.x.isShowing()) {
            mzVar.x.d(true);
        }
    }

    @Override // ud.b
    public void o(int i10, float f10, float f11, ud.c cVar) {
        sg0 sg0Var = (sg0) this.b;
        sg0Var.getClass();
        sg0Var.setScaleX(AndroidUtilities.lerp(1.0f, 1.019f, f10));
        sg0Var.setScaleY(AndroidUtilities.lerp(1.0f, 1.019f, f10));
    }

    @Override // org.telegram.ui.Components.mk0
    public int run() {
        return ((FiltersSetupActivity) this.b).w;
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.a) {
            case 6:
                yy yyVar = (yy) this.b;
                View view = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                if (((org.telegram.ui.Components.n41) obj).d == 1 && yyVar.b != null) {
                    boolean z10 = !yyVar.c;
                    yyVar.c = z10;
                    cg.u0 u0Var = yyVar.f;
                    if (u0Var != null) {
                        u0Var.run(Boolean.valueOf(z10), Boolean.valueOf(yyVar.d));
                    }
                    ((org.telegram.ui.Cells.p8) view).setChecked(yyVar.c);
                    yyVar.e.U2.N(true);
                    break;
                }
                break;
            default:
                org.telegram.ui.Components.zk0.N0((Canvas) obj, (RectF) obj2, ((Float) obj3).floatValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue(), ((org.telegram.ui.Components.zk0) this.b).l2);
                break;
        }
    }

    @Override // org.telegram.messenger.MessagesController.ErrorDelegate
    public boolean run(TLRPC.TL_error tL_error) {
        ((e5.w) this.b).run();
        return true;
    }

    private final /* synthetic */ void g(ArrayList arrayList) {
    }

    private final /* synthetic */ void l(ArrayList arrayList) {
    }

    @Override // org.telegram.ui.Components.cv0
    public /* synthetic */ void m() {
    }

    @Override // ud.b
    public /* synthetic */ void A(float f10, int i10) {
    }

    private final /* synthetic */ void d(View view, float f10, float f11) {
    }

    private final /* synthetic */ void e(View view, float f10, float f11) {
    }
}
