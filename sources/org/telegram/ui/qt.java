package org.telegram.ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.os.Bundle;
import android.text.Layout;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qt implements org.telegram.ui.Components.am0, org.telegram.ui.Components.yw0, org.telegram.ui.ActionBar.b2, MessagesController.ErrorDelegate, org.telegram.ui.Components.qh0, Utilities.Callback5, org.telegram.ui.Components.je0, org.telegram.ui.ActionBar.m1, org.telegram.ui.Components.wl0, ig.z1, org.telegram.ui.Components.bm0, r0.n, nt, oe.d, ej0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qt(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // oe.d
    public void E(int i10, float f7, float f10, oe.e eVar) {
        rg0 rg0Var = (rg0) this.b;
        rg0Var.getClass();
        rg0Var.setScaleX(AndroidUtilities.lerp(1.0f, 1.019f, f7));
        rg0Var.setScaleY(AndroidUtilities.lerp(1.0f, 1.019f, f7));
    }

    @Override // r0.n
    public r0.k1 P0(View view, r0.k1 k1Var) {
        switch (this.a) {
            case 16:
                fa0 fa0Var = (fa0) this.b;
                i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
                if (!fa0Var.a.equals(defaultWindowInsets)) {
                    fa0Var.a = defaultWindowInsets;
                    fa0Var.requestLayout();
                }
                int childCount = fa0Var.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    r0.i0.b(fa0Var.getChildAt(i10), k1Var);
                }
                return k1Var;
            default:
                xj0 xj0Var = (xj0) this.b;
                i0.b defaultWindowInsets2 = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
                xj0Var.x = defaultWindowInsets2.d;
                xj0Var.K = k1Var.a.f(8).d;
                view.setPadding(defaultWindowInsets2.a, view.getPaddingTop(), defaultWindowInsets2.c, 0);
                xj0Var.p0(false);
                view.post(new qj0(xj0Var, 0));
                return r0.k1.b;
        }
    }

    @Override // ig.z1
    public /* synthetic */ a0.h U() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.nt
    public void Y0(jt jtVar) {
        fg0 fg0Var = (fg0) this.b;
        fg0Var.K = true;
        String str = jtVar.c;
        fg0Var.a.setText(str);
        fg0Var.s(str, jtVar);
        fg0Var.F = jtVar;
        fg0Var.E = 0;
        fg0Var.K = false;
        MessagesController.getGlobalMainSettings().edit().putString("phone_code_last_matched_" + jtVar.c, jtVar.d).apply();
        AndroidUtilities.runOnUIThread(new uf0(fg0Var, 4), 300L);
        cg0 cg0Var = fg0Var.b;
        cg0Var.requestFocus();
        cg0Var.setSelection(cg0Var.length());
    }

    @Override // org.telegram.ui.ej0
    public void a(Canvas canvas) {
        ((Layout) this.b).draw(canvas);
    }

    @Override // org.telegram.ui.Components.bm0
    public boolean c(int i10, View view) {
        switch (this.a) {
            case 14:
                break;
            case 23:
                final vi0 vi0Var = (vi0) this.b;
                if (i10 >= vi0Var.I && i10 < vi0Var.J) {
                    try {
                        view.performHapticFeedback(0, 2);
                    } catch (Exception unused) {
                    }
                    final MessageObject messageObject = (MessageObject) vi0Var.x.get(i10 - vi0Var.I);
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
                            org.telegram.ui.ActionBar.r2 r2Var = vi0.this;
                            r2Var.getClass();
                            MessageObject messageObject2 = messageObject;
                            boolean isStory = messageObject2.isStory();
                            boolean z10 = isUserDialog;
                            long j10 = dialogId;
                            if (isStory) {
                                r2Var.presentFragment(z10 ? ProfileActivity.t4(j10) : un.ba(j10));
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
                            if (r2Var.getMessagesController().checkCanOpenChat(bundle, r2Var)) {
                                r2Var.presentFragment(new un(bundle));
                            }
                        }
                    };
                    org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
                    e2Var.P = charSequenceArr;
                    e2Var.Q = intArray;
                    e2Var.M = onClickListener;
                    vi0Var.showDialog(e2Var);
                    break;
                }
                break;
            default:
                tk0 tk0Var = (tk0) this.b;
                tk0Var.getClass();
                if (view instanceof sk0) {
                    sk0 sk0Var = (sk0) view;
                    tk0Var.a0(sk0Var.e);
                    sk0Var.performHapticFeedback(0);
                    break;
                }
                break;
        }
        return false;
    }

    @Override // org.telegram.ui.Components.am0
    public /* synthetic */ boolean c1(View view) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Components.am0
    public void e(float f7, float f10, int i10, View view) {
        org.telegram.ui.Components.t61 G;
        Object obj;
        long j10;
        int V;
        switch (this.a) {
            case 0:
                rt rtVar = (rt) this.b;
                HashSet hashSet = rtVar.b0;
                if (!rtVar.c0 && (G = rtVar.d0.G(i10 - 1)) != null && (obj = G.G) != null) {
                    if (obj instanceof TLRPC.User) {
                        j10 = ((TLRPC.User) obj).id;
                    } else if (obj instanceof TLRPC.Chat) {
                        j10 = ((TLRPC.Chat) obj).id;
                    }
                    if (hashSet.contains(Long.valueOf(j10))) {
                        hashSet.remove(Long.valueOf(j10));
                    } else {
                        hashSet.add(Long.valueOf(j10));
                    }
                    if (view instanceof zg.l) {
                        ((zg.l) view).c(hashSet.contains(Long.valueOf(j10)), true);
                        break;
                    }
                }
                break;
            case 1:
                DataAutoDownloadActivity.X((DataAutoDownloadActivity) this.b, view, i10, f7);
                break;
            default:
                tb0 tb0Var = (tb0) this.b;
                ArrayList arrayList = tb0Var.s;
                if (view != null && i10 >= 0 && i10 < arrayList.size()) {
                    nb0 nb0Var = (nb0) arrayList.get(i10);
                    int i11 = nb0Var.a;
                    int i12 = nb0Var.e;
                    if (i11 == 3 || i11 == 4) {
                        if (!LiteMode.isPowerSaverApplied()) {
                            if (nb0Var.a == 3 && Integer.bitCount(i12) > 1 && (!LocaleController.isRTL ? f7 >= view.getMeasuredWidth() - AndroidUtilities.dp(75.0f) : f7 <= AndroidUtilities.dp(75.0f)) && (V = tb0Var.V(i12)) != -1) {
                                tb0Var.n[V] = !r8[V];
                                tb0Var.Z();
                                tb0Var.Y();
                                break;
                            } else {
                                LiteMode.toggleFlag(i12, !LiteMode.isEnabledSetting(i12));
                                tb0Var.Z();
                            }
                        } else {
                            tb0Var.e = org.telegram.ui.Components.wc.b0(tb0Var).L(new org.telegram.ui.Components.ba(0.1f, org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Y5, false)), LocaleController.getString(R.string.LiteBatteryRestricted)).j();
                            break;
                        }
                    } else if (i11 == 5 && nb0Var.f == 1) {
                        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                        boolean z10 = globalMainSettings.getBoolean("view_animations", true);
                        SharedPreferences.Editor edit = globalMainSettings.edit();
                        boolean z11 = !z10;
                        edit.putBoolean("view_animations", z11);
                        SharedConfig.setAnimationsEnabled(z11);
                        edit.commit();
                        ((org.telegram.ui.Cells.v8) view).setChecked(z11);
                    }
                    oi.q.f();
                    break;
                }
                break;
        }
    }

    @Override // ig.z1
    public void f(int i10) {
        switch (this.a) {
            case 12:
                p60 p60Var = (p60) this.b;
                r60 r60Var = p60Var.I;
                r60Var.r0(p60Var.H);
                if (p60Var.h == null && !p60Var.f.e() && p60Var.h() == 0) {
                    r60Var.s.e(false, true);
                }
                p60Var.l();
                break;
            default:
                lk0 lk0Var = (lk0) this.b;
                if (lk0Var.f == null && !lk0Var.h.e()) {
                    lk0Var.n.c.c();
                }
                lk0Var.l();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        int i11;
        xf.d dVar;
        int i12 = this.a;
        int i13 = 1;
        Object obj = this.b;
        switch (i12) {
            case 3:
                ((a3.i0) obj).run();
                break;
            case 13:
                ((z60) obj).V(true);
                break;
            case 15:
                Pattern pattern = LaunchActivity.D1;
                AndroidUtilities.addToClipboard((StringBuilder) obj);
                break;
            case 18:
                od0 od0Var = (od0) obj;
                Bundle bundle = new Bundle();
                bundle.putString("phone", od0Var.I);
                bundle.putString("ephone", od0Var.J);
                bundle.putString("phoneFormated", od0Var.L);
                TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail = new TLRPC.TL_auth_resetLoginEmail();
                tL_auth_resetLoginEmail.phone_number = od0Var.L;
                tL_auth_resetLoginEmail.phone_code_hash = od0Var.M;
                od0Var.W.getConnectionsManager().sendRequest(tL_auth_resetLoginEmail, new fd0(od0Var, bundle, tL_auth_resetLoginEmail, i13), 10);
                break;
            case 19:
                yd0 yd0Var = (yd0) obj;
                gg0.o0(yd0Var.y, yd0Var.s, yd0Var.v, yd0Var.w);
                break;
            case 20:
                se0 se0Var = (se0) obj;
                gg0 gg0Var = se0Var.G;
                gg0Var.s1(0, true);
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Forgot password";
                i11 = ((org.telegram.ui.ActionBar.r2) gg0Var).currentAccount;
                ConnectionsManager.getInstance(i11).sendRequest(deleteaccount, new l(se0Var, 13), 10);
                break;
            case 27:
                ((org.telegram.messenger.bj) obj).run();
                break;
            default:
                tk0 tk0Var = ((pk0) obj).b;
                SparseArray sparseArray = tk0Var.I;
                ArrayList arrayList = new ArrayList();
                for (int i14 = 0; i14 < sparseArray.size(); i14++) {
                    rk0 rk0Var = (rk0) sparseArray.valueAt(i14);
                    TLRPC.Document document = rk0Var.e;
                    if (document != null) {
                        arrayList.add(document);
                        xf.c cVar = tk0Var.getMediaDataController().ringtoneDataStore;
                        TLRPC.Document document2 = rk0Var.e;
                        ArrayList arrayList2 = cVar.e;
                        if (document2 != null) {
                            if (!cVar.f) {
                                cVar.f(true);
                                cVar.f = true;
                            }
                            int i15 = 0;
                            while (true) {
                                if (i15 < arrayList2.size()) {
                                    if (((xf.b) arrayList2.get(i15)).a == null || ((xf.b) arrayList2.get(i15)).a.id != document2.id) {
                                        i15++;
                                    } else {
                                        arrayList2.remove(i15);
                                    }
                                }
                            }
                        }
                    }
                    if (rk0Var.g != null && (dVar = tk0Var.getMediaDataController().ringtoneUploaderHashMap.get(rk0Var.g)) != null) {
                        dVar.c = true;
                        dVar.a();
                        int i16 = dVar.a;
                        FileLoader fileLoader = FileLoader.getInstance(i16);
                        String str = dVar.b;
                        fileLoader.cancelFileUpload(str, false);
                        MediaDataController.getInstance(i16).onRingtoneUploaded(str, null, true);
                    }
                    if (rk0Var == tk0Var.G) {
                        tk0Var.M = null;
                        tk0Var.G = (rk0) tk0Var.b.get(0);
                        tk0Var.H = true;
                    }
                    tk0Var.a.remove(rk0Var);
                    tk0Var.c.remove(rk0Var);
                }
                tk0Var.getMediaDataController().ringtoneDataStore.h();
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
                    tk0Var.getConnectionsManager().sendRequest(saveringtone, new di.d6(8));
                }
                tk0.X(tk0Var);
                tk0Var.e0();
                tk0Var.e.l();
                e2Var.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.Components.yw0
    public void j(int i10) {
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
            i17 = ((org.telegram.ui.ActionBar.r2) dataAutoDownloadActivity).currentAccount;
            DownloadController.getInstance(i17).currentMobilePreset = dataAutoDownloadActivity.e;
        } else if (i18 == 1) {
            i12 = ((org.telegram.ui.ActionBar.r2) dataAutoDownloadActivity).currentAccount;
            DownloadController.getInstance(i12).currentWifiPreset = dataAutoDownloadActivity.e;
        } else {
            i11 = ((org.telegram.ui.ActionBar.r2) dataAutoDownloadActivity).currentAccount;
            DownloadController.getInstance(i11).currentRoamingPreset = dataAutoDownloadActivity.e;
        }
        i13 = ((org.telegram.ui.ActionBar.r2) dataAutoDownloadActivity).currentAccount;
        SharedPreferences.Editor edit = MessagesController.getMainSettings(i13).edit();
        edit.putInt(dataAutoDownloadActivity.K, dataAutoDownloadActivity.e);
        edit.commit();
        i14 = ((org.telegram.ui.ActionBar.r2) dataAutoDownloadActivity).currentAccount;
        DownloadController.getInstance(i14).checkAutodownloadSettings();
        for (int i19 = 0; i19 < 4; i19++) {
            org.telegram.ui.Components.mm0 mm0Var = dataAutoDownloadActivity.b;
            i15 = dataAutoDownloadActivity.photosRow;
            s4.e1 K = mm0Var.K(i15 + i19);
            if (K != null) {
                vt vtVar = dataAutoDownloadActivity.a;
                i16 = dataAutoDownloadActivity.photosRow;
                vtVar.v(K, i16 + i19);
            }
        }
        dataAutoDownloadActivity.I = true;
    }

    @Override // ig.z1
    public /* synthetic */ boolean k0(int i10) {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Components.je0
    public void l(org.telegram.ui.Components.le0 le0Var) {
        ExternalActionActivity externalActionActivity = (ExternalActionActivity) this.b;
        ArrayList arrayList = ExternalActionActivity.x;
        SharedConfig.isWaitingForPasscodeEnter = false;
        Intent intent = externalActionActivity.h;
        if (intent != null) {
            externalActionActivity.d(intent, externalActionActivity.n, externalActionActivity.v, true, externalActionActivity.r, externalActionActivity.s);
            externalActionActivity.h = null;
        }
        externalActionActivity.c.e0();
        if (AndroidUtilities.isTablet()) {
            externalActionActivity.d.e0();
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.passcodeDismissed, le0Var);
    }

    @Override // org.telegram.ui.Components.am0
    public /* synthetic */ void l0(View view, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.ActionBar.m1
    public void n(KeyEvent keyEvent) {
        jz jzVar = (jz) this.b;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && jzVar.x.isShowing()) {
            jzVar.x.d(true);
        }
    }

    @Override // ig.z1
    public /* synthetic */ void p0(ArrayList arrayList) {
        int i10 = this.a;
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        uy uyVar = (uy) this.b;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        if (((org.telegram.ui.Components.t61) obj).d != 1 || uyVar.b == null) {
            return;
        }
        boolean z10 = !uyVar.c;
        uyVar.c = z10;
        bi.m5 m5Var = uyVar.f;
        if (m5Var != null) {
            m5Var.run(Boolean.valueOf(z10), Boolean.valueOf(uyVar.d));
        }
        ((org.telegram.ui.Cells.a9) view).setChecked(uyVar.c);
        uyVar.e.g3.O(true);
    }

    @Override // ig.z1
    public /* synthetic */ a0.h y() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Components.wl0
    public int run() {
        return ((FiltersSetupActivity) this.b).w;
    }

    @Override // org.telegram.messenger.MessagesController.ErrorDelegate
    public boolean run(TLRPC.TL_error tL_error) {
        ((a3.h0) this.b).run();
        return true;
    }

    @Override // org.telegram.ui.Components.yw0
    public /* synthetic */ void m() {
    }

    private final /* synthetic */ void i(ArrayList arrayList) {
    }

    private final /* synthetic */ void k(ArrayList arrayList) {
    }

    @Override // oe.d
    public /* synthetic */ void z(float f7, int i10) {
    }

    private final /* synthetic */ void b(View view, float f7, float f10) {
    }

    private final /* synthetic */ void d(View view, float f7, float f10) {
    }

    private final /* synthetic */ void g(View view, float f7, float f10) {
    }
}
