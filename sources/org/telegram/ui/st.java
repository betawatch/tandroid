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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class st implements org.telegram.ui.Components.bm0, org.telegram.ui.Components.zw0, org.telegram.ui.ActionBar.b2, MessagesController.ErrorDelegate, org.telegram.ui.Components.rh0, Utilities.Callback5, org.telegram.ui.Components.ke0, org.telegram.ui.ActionBar.m1, org.telegram.ui.Components.xl0, ig.z1, org.telegram.ui.Components.cm0, r0.n, pt, oe.d, gj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ st(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // oe.d
    public void E(int i10, float f7, float f10, oe.e eVar) {
        tg0 tg0Var = (tg0) this.b;
        tg0Var.getClass();
        tg0Var.setScaleX(AndroidUtilities.lerp(1.0f, 1.019f, f7));
        tg0Var.setScaleY(AndroidUtilities.lerp(1.0f, 1.019f, f7));
    }

    @Override // r0.n
    public r0.k1 P0(View view, r0.k1 k1Var) {
        switch (this.a) {
            case 16:
                ha0 ha0Var = (ha0) this.b;
                i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
                if (!ha0Var.a.equals(defaultWindowInsets)) {
                    ha0Var.a = defaultWindowInsets;
                    ha0Var.requestLayout();
                }
                int childCount = ha0Var.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    r0.i0.b(ha0Var.getChildAt(i10), k1Var);
                }
                return k1Var;
            default:
                zj0 zj0Var = (zj0) this.b;
                i0.b defaultWindowInsets2 = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
                zj0Var.x = defaultWindowInsets2.d;
                zj0Var.K = k1Var.a.f(8).d;
                view.setPadding(defaultWindowInsets2.a, view.getPaddingTop(), defaultWindowInsets2.c, 0);
                zj0Var.p0(false);
                view.post(new sj0(zj0Var, 0));
                return r0.k1.b;
        }
    }

    @Override // ig.z1
    public /* synthetic */ a0.h U() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.pt
    public void Y0(lt ltVar) {
        hg0 hg0Var = (hg0) this.b;
        hg0Var.K = true;
        String str = ltVar.c;
        hg0Var.a.setText(str);
        hg0Var.s(str, ltVar);
        hg0Var.F = ltVar;
        hg0Var.E = 0;
        hg0Var.K = false;
        MessagesController.getGlobalMainSettings().edit().putString("phone_code_last_matched_" + ltVar.c, ltVar.d).apply();
        AndroidUtilities.runOnUIThread(new wf0(hg0Var, 4), 300L);
        eg0 eg0Var = hg0Var.b;
        eg0Var.requestFocus();
        eg0Var.setSelection(eg0Var.length());
    }

    @Override // org.telegram.ui.gj0
    public void a(Canvas canvas) {
        ((Layout) this.b).draw(canvas);
    }

    @Override // org.telegram.ui.Components.cm0
    public boolean c(int i10, View view) {
        switch (this.a) {
            case 14:
                break;
            case 23:
                final xi0 xi0Var = (xi0) this.b;
                if (i10 >= xi0Var.I && i10 < xi0Var.J) {
                    try {
                        view.performHapticFeedback(0, 2);
                    } catch (Exception unused) {
                    }
                    final MessageObject messageObject = (MessageObject) xi0Var.x.get(i10 - xi0Var.I);
                    final long dialogId = MessageObject.getDialogId(messageObject.messageOwner);
                    final boolean isUserDialog = DialogObject.isUserDialog(dialogId);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xi0Var.getParentActivity(), 0, xi0Var.getResourceProvider());
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
                    DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.si0
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i11) {
                            org.telegram.ui.ActionBar.r2 r2Var = xi0.this;
                            r2Var.getClass();
                            MessageObject messageObject2 = messageObject;
                            boolean isStory = messageObject2.isStory();
                            boolean z10 = isUserDialog;
                            long j10 = dialogId;
                            if (isStory) {
                                r2Var.presentFragment(z10 ? ProfileActivity.t4(j10) : wn.ea(j10));
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
                                r2Var.presentFragment(new wn(bundle));
                            }
                        }
                    };
                    org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
                    e2Var.P = charSequenceArr;
                    e2Var.Q = intArray;
                    e2Var.M = onClickListener;
                    xi0Var.showDialog(e2Var);
                    break;
                }
                break;
            default:
                vk0 vk0Var = (vk0) this.b;
                vk0Var.getClass();
                if (view instanceof uk0) {
                    uk0 uk0Var = (uk0) view;
                    vk0Var.a0(uk0Var.e);
                    uk0Var.performHapticFeedback(0);
                    break;
                }
                break;
        }
        return false;
    }

    @Override // org.telegram.ui.Components.bm0
    public /* synthetic */ boolean c1(View view) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Components.bm0
    public void e(float f7, float f10, int i10, View view) {
        org.telegram.ui.Components.u61 G;
        Object obj;
        long j10;
        int V;
        switch (this.a) {
            case 0:
                tt ttVar = (tt) this.b;
                HashSet hashSet = ttVar.b0;
                if (!ttVar.c0 && (G = ttVar.d0.G(i10 - 1)) != null && (obj = G.G) != null) {
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
                wb0 wb0Var = (wb0) this.b;
                ArrayList arrayList = wb0Var.s;
                if (view != null && i10 >= 0 && i10 < arrayList.size()) {
                    qb0 qb0Var = (qb0) arrayList.get(i10);
                    int i11 = qb0Var.a;
                    int i12 = qb0Var.e;
                    if (i11 == 3 || i11 == 4) {
                        if (!LiteMode.isPowerSaverApplied()) {
                            if (qb0Var.a == 3 && Integer.bitCount(i12) > 1 && (!LocaleController.isRTL ? f7 >= view.getMeasuredWidth() - AndroidUtilities.dp(75.0f) : f7 <= AndroidUtilities.dp(75.0f)) && (V = wb0Var.V(i12)) != -1) {
                                wb0Var.n[V] = !r8[V];
                                wb0Var.Z();
                                wb0Var.Y();
                                break;
                            } else {
                                LiteMode.toggleFlag(i12, !LiteMode.isEnabledSetting(i12));
                                wb0Var.Z();
                            }
                        } else {
                            wb0Var.e = org.telegram.ui.Components.wc.b0(wb0Var).L(new org.telegram.ui.Components.ba(0.1f, org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Y5, false)), LocaleController.getString(R.string.LiteBatteryRestricted)).j();
                            break;
                        }
                    } else if (i11 == 5 && qb0Var.f == 1) {
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
                r60 r60Var = (r60) this.b;
                t60 t60Var = r60Var.I;
                t60Var.r0(r60Var.H);
                if (r60Var.h == null && !r60Var.f.e() && r60Var.h() == 0) {
                    t60Var.s.e(false, true);
                }
                r60Var.l();
                break;
            default:
                nk0 nk0Var = (nk0) this.b;
                if (nk0Var.f == null && !nk0Var.h.e()) {
                    nk0Var.n.c.c();
                }
                nk0Var.l();
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
                ((b70) obj).V(true);
                break;
            case 15:
                Pattern pattern = LaunchActivity.D1;
                AndroidUtilities.addToClipboard((StringBuilder) obj);
                break;
            case 18:
                qd0 qd0Var = (qd0) obj;
                Bundle bundle = new Bundle();
                bundle.putString("phone", qd0Var.I);
                bundle.putString("ephone", qd0Var.J);
                bundle.putString("phoneFormated", qd0Var.L);
                TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail = new TLRPC.TL_auth_resetLoginEmail();
                tL_auth_resetLoginEmail.phone_number = qd0Var.L;
                tL_auth_resetLoginEmail.phone_code_hash = qd0Var.M;
                qd0Var.W.getConnectionsManager().sendRequest(tL_auth_resetLoginEmail, new hd0(qd0Var, bundle, tL_auth_resetLoginEmail, i13), 10);
                break;
            case 19:
                ae0 ae0Var = (ae0) obj;
                ig0.o0(ae0Var.y, ae0Var.s, ae0Var.v, ae0Var.w);
                break;
            case 20:
                ue0 ue0Var = (ue0) obj;
                ig0 ig0Var = ue0Var.G;
                ig0Var.s1(0, true);
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Forgot password";
                i11 = ((org.telegram.ui.ActionBar.r2) ig0Var).currentAccount;
                ConnectionsManager.getInstance(i11).sendRequest(deleteaccount, new l(ue0Var, 13), 10);
                break;
            case 27:
                ((org.telegram.messenger.cj) obj).run();
                break;
            default:
                vk0 vk0Var = ((rk0) obj).b;
                SparseArray sparseArray = vk0Var.I;
                ArrayList arrayList = new ArrayList();
                for (int i14 = 0; i14 < sparseArray.size(); i14++) {
                    tk0 tk0Var = (tk0) sparseArray.valueAt(i14);
                    TLRPC.Document document = tk0Var.e;
                    if (document != null) {
                        arrayList.add(document);
                        xf.c cVar = vk0Var.getMediaDataController().ringtoneDataStore;
                        TLRPC.Document document2 = tk0Var.e;
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
                    if (tk0Var.g != null && (dVar = vk0Var.getMediaDataController().ringtoneUploaderHashMap.get(tk0Var.g)) != null) {
                        dVar.c = true;
                        dVar.a();
                        int i16 = dVar.a;
                        FileLoader fileLoader = FileLoader.getInstance(i16);
                        String str = dVar.b;
                        fileLoader.cancelFileUpload(str, false);
                        MediaDataController.getInstance(i16).onRingtoneUploaded(str, null, true);
                    }
                    if (tk0Var == vk0Var.G) {
                        vk0Var.M = null;
                        vk0Var.G = (tk0) vk0Var.b.get(0);
                        vk0Var.H = true;
                    }
                    vk0Var.a.remove(tk0Var);
                    vk0Var.c.remove(tk0Var);
                }
                vk0Var.getMediaDataController().ringtoneDataStore.h();
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
                    vk0Var.getConnectionsManager().sendRequest(saveringtone, new di.d6(8));
                }
                vk0.X(vk0Var);
                vk0Var.e0();
                vk0Var.e.l();
                e2Var.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.Components.zw0
    public void j(int i10) {
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
            org.telegram.ui.Components.nm0 nm0Var = dataAutoDownloadActivity.b;
            i15 = dataAutoDownloadActivity.photosRow;
            s4.e1 K = nm0Var.K(i15 + i19);
            if (K != null) {
                xt xtVar = dataAutoDownloadActivity.a;
                i16 = dataAutoDownloadActivity.photosRow;
                xtVar.v(K, i16 + i19);
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

    @Override // org.telegram.ui.Components.ke0
    public void l(org.telegram.ui.Components.me0 me0Var) {
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
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.passcodeDismissed, me0Var);
    }

    @Override // org.telegram.ui.Components.bm0
    public /* synthetic */ void l0(View view, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.ActionBar.m1
    public void n(KeyEvent keyEvent) {
        mz mzVar = (mz) this.b;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && mzVar.x.isShowing()) {
            mzVar.x.d(true);
        }
    }

    @Override // ig.z1
    public /* synthetic */ void p0(ArrayList arrayList) {
        int i10 = this.a;
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        wy wyVar = (wy) this.b;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        if (((org.telegram.ui.Components.u61) obj).d != 1 || wyVar.b == null) {
            return;
        }
        boolean z10 = !wyVar.c;
        wyVar.c = z10;
        bi.m5 m5Var = wyVar.f;
        if (m5Var != null) {
            m5Var.run(Boolean.valueOf(z10), Boolean.valueOf(wyVar.d));
        }
        ((org.telegram.ui.Cells.a9) view).setChecked(wyVar.c);
        wyVar.e.g3.O(true);
    }

    @Override // ig.z1
    public /* synthetic */ a0.h y() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Components.xl0
    public int run() {
        return ((FiltersSetupActivity) this.b).w;
    }

    @Override // org.telegram.messenger.MessagesController.ErrorDelegate
    public boolean run(TLRPC.TL_error tL_error) {
        ((a3.h0) this.b).run();
        return true;
    }

    @Override // org.telegram.ui.Components.zw0
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
