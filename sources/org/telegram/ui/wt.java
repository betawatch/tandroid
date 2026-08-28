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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wt implements org.telegram.ui.Components.av0, org.telegram.ui.ActionBar.b2, MessagesController.ErrorDelegate, org.telegram.ui.Components.dg0, Utilities.Callback5, org.telegram.ui.Components.xc0, org.telegram.ui.ActionBar.m1, org.telegram.ui.Components.jk0, of.u1, org.telegram.ui.Components.ok0, r0.o, org.telegram.ui.Components.nk0, pt, td.b, dj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wt(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // of.u1
    public /* synthetic */ void H0(ArrayList arrayList) {
        int i9 = this.a;
    }

    @Override // td.b
    public void J0(int i9, float f10, float f11, td.c cVar) {
        pg0 pg0Var = (pg0) this.b;
        pg0Var.getClass();
        pg0Var.setScaleX(AndroidUtilities.lerp(1.0f, 1.019f, f10));
        pg0Var.setScaleY(AndroidUtilities.lerp(1.0f, 1.019f, f10));
    }

    @Override // r0.o
    public r0.m1 L0(View view, r0.m1 m1Var) {
        ba0 ba0Var = (ba0) this.b;
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        if (!ba0Var.a.equals(defaultWindowInsets)) {
            ba0Var.a = defaultWindowInsets;
            ba0Var.requestLayout();
        }
        int childCount = ba0Var.getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            r0.j0.b(ba0Var.getChildAt(i9), m1Var);
        }
        return m1Var;
    }

    @Override // of.u1
    public /* synthetic */ a0.h O() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Components.ok0
    public boolean a(int i9, View view) {
        switch (this.a) {
            case 13:
                break;
            case 23:
                final ti0 ti0Var = (ti0) this.b;
                if (i9 >= ti0Var.E && i9 < ti0Var.F) {
                    try {
                        view.performHapticFeedback(0, 2);
                    } catch (Exception unused) {
                    }
                    final MessageObject messageObject = (MessageObject) ti0Var.x.get(i9 - ti0Var.E);
                    final long dialogId = MessageObject.getDialogId(messageObject.messageOwner);
                    final boolean isUserDialog = DialogObject.isUserDialog(dialogId);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ti0Var.getParentActivity(), 0, ti0Var.getResourceProvider());
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
                    DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.oi0
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i10) {
                            org.telegram.ui.ActionBar.o2 o2Var = ti0.this;
                            o2Var.getClass();
                            MessageObject messageObject2 = messageObject;
                            boolean isStory = messageObject2.isStory();
                            boolean z10 = isUserDialog;
                            long j10 = dialogId;
                            if (isStory) {
                                o2Var.presentFragment(z10 ? ProfileActivity.m4(j10) : qn.R9(j10));
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
                                o2Var.presentFragment(new qn(bundle));
                            }
                        }
                    };
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                    c2Var.L = charSequenceArr;
                    c2Var.M = intArray;
                    c2Var.I = onClickListener;
                    ti0Var.showDialog(c2Var);
                    break;
                }
                break;
            default:
                kk0 kk0Var = (kk0) this.b;
                kk0Var.getClass();
                if (view instanceof jk0) {
                    jk0 jk0Var = (jk0) view;
                    kk0Var.Y(jk0Var.e);
                    jk0Var.performHapticFeedback(0);
                    break;
                }
                break;
        }
        return false;
    }

    @Override // org.telegram.ui.pt
    public void a1(lt ltVar) {
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

    @Override // org.telegram.ui.dj0
    public void b(Canvas canvas) {
        ((Layout) this.b).draw(canvas);
    }

    @Override // org.telegram.ui.Components.nk0
    public void c(float f10, float f11, int i9, View view) {
        int T;
        switch (this.a) {
            case 16:
                sb0 sb0Var = (sb0) this.b;
                ArrayList arrayList = sb0Var.s;
                if (view != null && i9 >= 0 && i9 < arrayList.size()) {
                    mb0 mb0Var = (mb0) arrayList.get(i9);
                    int i10 = mb0Var.a;
                    int i11 = mb0Var.e;
                    if (i10 != 3 && i10 != 4) {
                        if (i10 == 5 && mb0Var.f == 1) {
                            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                            boolean z10 = globalMainSettings.getBoolean("view_animations", true);
                            SharedPreferences.Editor edit = globalMainSettings.edit();
                            boolean z11 = !z10;
                            edit.putBoolean("view_animations", z11);
                            SharedConfig.setAnimationsEnabled(z11);
                            edit.commit();
                            ((org.telegram.ui.Cells.p8) view).setChecked(z11);
                            break;
                        }
                    } else if (!LiteMode.isPowerSaverApplied()) {
                        if (mb0Var.a == 3 && Integer.bitCount(i11) > 1 && (!LocaleController.isRTL ? f10 >= view.getMeasuredWidth() - AndroidUtilities.dp(75.0f) : f10 <= AndroidUtilities.dp(75.0f)) && (T = sb0Var.T(i11)) != -1) {
                            sb0Var.n[T] = !r8[T];
                            sb0Var.X();
                            sb0Var.W();
                            break;
                        } else {
                            LiteMode.toggleFlag(i11, !LiteMode.isEnabledSetting(i11));
                            sb0Var.X();
                            break;
                        }
                    } else {
                        sb0Var.e = org.telegram.ui.Components.oc.a0(sb0Var).L(new org.telegram.ui.Components.q9(0.1f, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Y5, false)), LocaleController.getString(R.string.LiteBatteryRestricted)).j();
                        break;
                    }
                }
                break;
            default:
                hg0.T((hg0) this.b, i9);
                break;
        }
    }

    @Override // of.u1
    public void e(int i9) {
        switch (this.a) {
            case 11:
                i60 i60Var = (i60) this.b;
                k60 k60Var = i60Var.E;
                k60Var.p0(i60Var.D);
                if (i60Var.h == null && !i60Var.f.e() && i60Var.h() == 0) {
                    k60Var.s.e(false, true);
                }
                i60Var.l();
                break;
            default:
                bk0 bk0Var = (bk0) this.b;
                if (bk0Var.f == null && !bk0Var.h.e()) {
                    bk0Var.n.c.c();
                }
                bk0Var.l();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        int i10;
        bf.e eVar;
        int i11 = this.a;
        int i12 = 1;
        Object obj = this.b;
        switch (i11) {
            case 1:
                ((e5.w) obj).run();
                break;
            case 12:
                ((t60) obj).T(true);
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
                pd0Var.S.getConnectionsManager().sendRequest(tL_auth_resetLoginEmail, new fd0(pd0Var, bundle, tL_auth_resetLoginEmail, i12), 10);
                break;
            case 18:
                yd0 yd0Var = (yd0) obj;
                fg0.m0(yd0Var.y, yd0Var.s, yd0Var.v, yd0Var.w);
                break;
            case 19:
                re0 re0Var = (re0) obj;
                fg0 fg0Var = re0Var.A;
                fg0Var.n1(0, true);
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Forgot password";
                i10 = ((org.telegram.ui.ActionBar.o2) fg0Var).currentAccount;
                ConnectionsManager.getInstance(i10).sendRequest(deleteaccount, new m(re0Var, 12), 10);
                break;
            case 26:
                ((org.telegram.messenger.jj) obj).run();
                break;
            case 28:
                kk0 kk0Var = ((gk0) obj).b;
                SparseArray sparseArray = kk0Var.F;
                ArrayList arrayList = new ArrayList();
                for (int i13 = 0; i13 < sparseArray.size(); i13++) {
                    ik0 ik0Var = (ik0) sparseArray.valueAt(i13);
                    TLRPC.Document document = ik0Var.e;
                    if (document != null) {
                        arrayList.add(document);
                        bf.d dVar = kk0Var.getMediaDataController().ringtoneDataStore;
                        TLRPC.Document document2 = ik0Var.e;
                        ArrayList arrayList2 = dVar.e;
                        if (document2 != null) {
                            if (!dVar.f) {
                                dVar.f(true);
                                dVar.f = true;
                            }
                            int i14 = 0;
                            while (true) {
                                if (i14 < arrayList2.size()) {
                                    if (((bf.c) arrayList2.get(i14)).a == null || ((bf.c) arrayList2.get(i14)).a.id != document2.id) {
                                        i14++;
                                    } else {
                                        arrayList2.remove(i14);
                                    }
                                }
                            }
                        }
                    }
                    if (ik0Var.g != null && (eVar = kk0Var.getMediaDataController().ringtoneUploaderHashMap.get(ik0Var.g)) != null) {
                        eVar.c = true;
                        eVar.a();
                        int i15 = eVar.a;
                        FileLoader fileLoader = FileLoader.getInstance(i15);
                        String str = eVar.b;
                        fileLoader.cancelFileUpload(str, false);
                        MediaDataController.getInstance(i15).onRingtoneUploaded(str, null, true);
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
                for (int i16 = 0; i16 < arrayList.size(); i16++) {
                    TLRPC.Document document3 = (TLRPC.Document) arrayList.get(i16);
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
                    kk0Var.getConnectionsManager().sendRequest(saveringtone, new ih.q5(5));
                }
                kk0.V(kk0Var);
                kk0Var.b0();
                kk0Var.f.l();
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
                int i17 = 0;
                while (true) {
                    if (i17 < childCount) {
                        View childAt = passcodeActivity.c.getChildAt(i17);
                        if (childAt instanceof org.telegram.ui.Cells.ba) {
                            ((org.telegram.ui.Cells.ba) childAt).setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.E6, false));
                        } else {
                            i17++;
                        }
                    }
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetPasscode, new Object[0]);
                passcodeActivity.finishFragment();
                break;
        }
    }

    @Override // org.telegram.ui.Components.nk0
    public /* synthetic */ boolean f1(View view) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Components.nk0
    public /* synthetic */ void g0(View view, float f10, float f11) {
        int i9 = this.a;
    }

    @Override // org.telegram.ui.Components.av0
    public void h(int i9) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        DataAutoDownloadActivity dataAutoDownloadActivity = ((xt) this.b).d;
        DownloadController.Preset preset = (DownloadController.Preset) dataAutoDownloadActivity.c.get(i9);
        if (preset == dataAutoDownloadActivity.y) {
            dataAutoDownloadActivity.e = 0;
        } else if (preset == dataAutoDownloadActivity.A) {
            dataAutoDownloadActivity.e = 1;
        } else if (preset == dataAutoDownloadActivity.B) {
            dataAutoDownloadActivity.e = 2;
        } else {
            dataAutoDownloadActivity.e = 3;
        }
        int i17 = dataAutoDownloadActivity.f;
        if (i17 == 0) {
            i16 = ((org.telegram.ui.ActionBar.o2) dataAutoDownloadActivity).currentAccount;
            DownloadController.getInstance(i16).currentMobilePreset = dataAutoDownloadActivity.e;
        } else if (i17 == 1) {
            i11 = ((org.telegram.ui.ActionBar.o2) dataAutoDownloadActivity).currentAccount;
            DownloadController.getInstance(i11).currentWifiPreset = dataAutoDownloadActivity.e;
        } else {
            i10 = ((org.telegram.ui.ActionBar.o2) dataAutoDownloadActivity).currentAccount;
            DownloadController.getInstance(i10).currentRoamingPreset = dataAutoDownloadActivity.e;
        }
        i12 = ((org.telegram.ui.ActionBar.o2) dataAutoDownloadActivity).currentAccount;
        SharedPreferences.Editor edit = MessagesController.getMainSettings(i12).edit();
        edit.putInt(dataAutoDownloadActivity.G, dataAutoDownloadActivity.e);
        edit.commit();
        i13 = ((org.telegram.ui.ActionBar.o2) dataAutoDownloadActivity).currentAccount;
        DownloadController.getInstance(i13).checkAutodownloadSettings();
        for (int i18 = 0; i18 < 4; i18++) {
            org.telegram.ui.Components.wk0 wk0Var = dataAutoDownloadActivity.b;
            i14 = dataAutoDownloadActivity.photosRow;
            f2.q1 K = wk0Var.K(i14 + i18);
            if (K != null) {
                xt xtVar = dataAutoDownloadActivity.a;
                i15 = dataAutoDownloadActivity.photosRow;
                xtVar.v(K, i15 + i18);
            }
        }
        dataAutoDownloadActivity.E = true;
    }

    @Override // org.telegram.ui.Components.xc0
    public void i(org.telegram.ui.Components.yc0 yc0Var) {
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
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.passcodeDismissed, yc0Var);
    }

    @Override // org.telegram.ui.ActionBar.m1
    public void k(KeyEvent keyEvent) {
        jz jzVar = (jz) this.b;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && jzVar.x.isShowing()) {
            jzVar.x.d(true);
        }
    }

    @Override // of.u1
    public /* synthetic */ boolean p0(int i9) {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Components.jk0
    public int run() {
        return ((FiltersSetupActivity) this.b).w;
    }

    @Override // of.u1
    public /* synthetic */ a0.h y() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.a) {
            case 6:
                vy vyVar = (vy) this.b;
                View view = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                if (((org.telegram.ui.Components.l41) obj).d == 1 && vyVar.b != null) {
                    boolean z10 = !vyVar.c;
                    vyVar.c = z10;
                    bg.y0 y0Var = vyVar.f;
                    if (y0Var != null) {
                        y0Var.run(Boolean.valueOf(z10), Boolean.valueOf(vyVar.d));
                    }
                    ((org.telegram.ui.Cells.t8) view).setChecked(vyVar.c);
                    vyVar.e.U2.N(true);
                    break;
                }
                break;
            default:
                org.telegram.ui.Components.wk0.N0((Canvas) obj, (RectF) obj2, ((Float) obj3).floatValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue(), ((org.telegram.ui.Components.wk0) this.b).l2);
                break;
        }
    }

    @Override // org.telegram.messenger.MessagesController.ErrorDelegate
    public boolean run(TLRPC.TL_error tL_error) {
        ((e5.y) this.b).run();
        return true;
    }

    private final /* synthetic */ void j(ArrayList arrayList) {
    }

    private final /* synthetic */ void l(ArrayList arrayList) {
    }

    @Override // org.telegram.ui.Components.av0
    public /* synthetic */ void m() {
    }

    @Override // td.b
    public /* synthetic */ void B(float f10, int i9) {
    }

    private final /* synthetic */ void d(View view, float f10, float f11) {
    }

    private final /* synthetic */ void g(View view, float f10, float f11) {
    }
}
