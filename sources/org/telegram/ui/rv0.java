package org.telegram.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.View;
import android.webkit.JsPromptResult;
import android.widget.TextView;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rv0 implements org.telegram.ui.Components.b5, GenericProvider, org.telegram.ui.ActionBar.a2, MediaDataController.KeywordResultCallback, org.telegram.ui.Components.al0, org.telegram.ui.Components.bl0, zv0, MessagesStorage.BooleanCallback, w11, OnSuccessListener, pa.a, OnFailureListener, t5.b, s5.e {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rv0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.ui.Components.b5
    public void J(int i10, int i11, boolean z10) {
        sv0 sv0Var = (sv0) this.b;
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) this.c;
        aw0 aw0Var = sv0Var.a;
        aw0Var.e0.a(tL_messageMediaPoll);
        aw0Var.finishFragment();
    }

    @Override // org.telegram.ui.zv0
    public void a(TLRPC.MessageMedia messageMedia) {
        le1 le1Var = (le1) this.b;
        bo boVar = (bo) this.c;
        if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
            TLRPC.MessageMedia messageMedia2 = le1Var.G.messageOwner.media;
            if (messageMedia2 instanceof TLRPC.TL_messageMediaToDo) {
                ((TLRPC.TL_messageMediaToDo) messageMedia).completions = ((TLRPC.TL_messageMediaToDo) messageMedia2).completions;
            }
        }
        le1Var.G.messageOwner.media = messageMedia;
        boVar.getSendMessagesHelper().editMessage(le1Var.G, null, null, null, null, null, null, false, false, null);
    }

    @Override // s5.e
    public Object apply(Object obj) {
        s5.g gVar = (s5.g) this.b;
        l5.i iVar = (l5.i) this.c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        s5.a aVar = gVar.d;
        ArrayList d = gVar.d(sQLiteDatabase, iVar, aVar.b);
        for (i5.d dVar : i5.d.values()) {
            if (dVar != iVar.c) {
                int size = aVar.b - d.size();
                if (size <= 0) {
                    break;
                }
                d.addAll(gVar.d(sQLiteDatabase, iVar.b(dVar), size));
            }
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb2 = new StringBuilder("event_id IN (");
        for (int i10 = 0; i10 < d.size(); i10++) {
            sb2.append(((s5.b) d.get(i10)).a);
            if (i10 < d.size() - 1) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        Cursor query = sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb2.toString(), null, null, null, null);
        while (query.moveToNext()) {
            try {
                long j3 = query.getLong(0);
                Set set = (Set) hashMap.get(Long.valueOf(j3));
                if (set == null) {
                    set = new HashSet();
                    hashMap.put(Long.valueOf(j3), set);
                }
                set.add(new s5.f(query.getString(1), query.getString(2)));
            } catch (Throwable th2) {
                query.close();
                throw th2;
            }
        }
        query.close();
        ListIterator listIterator = d.listIterator();
        while (listIterator.hasNext()) {
            s5.b bVar = (s5.b) listIterator.next();
            long j10 = bVar.a;
            if (hashMap.containsKey(Long.valueOf(j10))) {
                com.google.firebase.messaging.n c10 = bVar.c.c();
                for (s5.f fVar : (Set) hashMap.get(Long.valueOf(j10))) {
                    c10.c(fVar.a, fVar.b);
                }
                listIterator.set(new s5.b(j10, bVar.b, c10.g()));
            }
        }
        return d;
    }

    @Override // org.telegram.ui.Components.al0
    public void c(float f7, float f10, int i10, View view) {
        ThemeActivity.W((ThemeActivity) this.b, (Context) this.c, view, i10, f7);
    }

    @Override // org.telegram.ui.Components.bl0
    public boolean d(int i10, View view) {
        final gc1 gc1Var = (gc1) this.b;
        final ic1 ic1Var = (ic1) this.c;
        ThemeActivity themeActivity = gc1Var.e;
        if (i10 >= 0 && i10 < ic1Var.e.size()) {
            final org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) ic1Var.e.get(i10);
            if (g6Var.a >= 100 && !g6Var.z) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                String string = LocaleController.getString("OpenInEditor", R.string.OpenInEditor);
                String string2 = LocaleController.getString("ShareTheme", R.string.ShareTheme);
                TLRPC.TL_theme tL_theme = g6Var.r;
                CharSequence[] charSequenceArr = {string, string2, (tL_theme == null || !tL_theme.creator) ? null : LocaleController.getString("ThemeSetUrl", R.string.ThemeSetUrl), LocaleController.getString("DeleteTheme", R.string.DeleteTheme)};
                int[] iArr = {R.drawable.msg_edit, R.drawable.msg_share, R.drawable.msg_link, R.drawable.msg_delete};
                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.ac1
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i11) {
                        gc1 gc1Var2 = gc1.this;
                        ThemeActivity themeActivity2 = gc1Var2.e;
                        if (themeActivity2.getParentActivity() == null) {
                            return;
                        }
                        org.telegram.ui.ActionBar.g6 g6Var2 = g6Var;
                        if (i11 == 0) {
                            org.telegram.ui.Components.c5.W(themeActivity2, i11 != 1 ? 1 : 2, g6Var2.b, g6Var2);
                            return;
                        }
                        if (i11 == 1) {
                            if (g6Var2.r == null) {
                                themeActivity2.getMessagesController().saveThemeToServer(g6Var2.b, g6Var2);
                                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShareTheme, g6Var2.b, g6Var2);
                                return;
                            }
                            String str = "https://" + themeActivity2.getMessagesController().linkPrefix + "/addtheme/" + g6Var2.r.slug;
                            themeActivity2.showDialog(new org.telegram.ui.Components.hq0(themeActivity2.getParentActivity(), null, str, false, str, false, null));
                            return;
                        }
                        if (i11 == 2) {
                            themeActivity2.presentFragment(new be1(g6Var2.b, g6Var2, false));
                            return;
                        }
                        if (i11 != 3 || themeActivity2.getParentActivity() == null) {
                            return;
                        }
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(themeActivity2.getParentActivity());
                        String string3 = LocaleController.getString("DeleteThemeTitle", R.string.DeleteThemeTitle);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder2.a;
                        b2Var.R = string3;
                        b2Var.T = LocaleController.getString("DeleteThemeAlert", R.string.DeleteThemeAlert);
                        alertDialog$Builder2.k(LocaleController.getString("Delete", R.string.Delete), new b7(gc1Var2, ic1Var, g6Var2, 22));
                        alertDialog$Builder2.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                        themeActivity2.showDialog(b2Var);
                        TextView textView = (TextView) b2Var.d(-1);
                        if (textView != null) {
                            textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.q7, false));
                        }
                    }
                };
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                b2Var.P = charSequenceArr;
                b2Var.Q = iArr;
                b2Var.M = onClickListener;
                themeActivity.showDialog(b2Var);
                b2Var.l(b2Var.N0.size() - 1, org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.q7, false), org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.p7, false));
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.al0
    public /* synthetic */ boolean d1(View view) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        boolean z10;
        org.telegram.ui.ActionBar.d5 d5Var;
        switch (this.a) {
            case 2:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) this.b;
                SharedPreferences sharedPreferences = (SharedPreferences) this.c;
                privacyControlActivity.t0();
                sharedPreferences.edit().putBoolean("privacyAlertShowed", true).commit();
                break;
            case 3:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.b;
                org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) this.c;
                TLRPC.TL_payments_clearSavedInfo tL_payments_clearSavedInfo = new TLRPC.TL_payments_clearSavedInfo();
                boolean[] zArr = privacySettingsActivity.Z;
                tL_payments_clearSavedInfo.credentials = zArr[1];
                tL_payments_clearSavedInfo.info = zArr[0];
                privacySettingsActivity.getUserConfig().tmpPassword = null;
                privacySettingsActivity.getUserConfig().saveConfig(false);
                privacySettingsActivity.getConnectionsManager().sendRequest(tL_payments_clearSavedInfo, new bc0(14, privacySettingsActivity, w8Var));
                break;
            case 4:
                ProfileActivity.c0((ProfileActivity) this.b, (org.telegram.ui.Cells.z1[]) this.c);
                break;
            case 5:
                i01 i01Var = (i01) this.b;
                TLRPC.User user = (TLRPC.User) this.c;
                i01Var.getClass();
                ArrayList<TLRPC.User> arrayList = new ArrayList<>();
                arrayList.add(user);
                ProfileActivity profileActivity = i01Var.b;
                profileActivity.getContactsController().deleteContact(arrayList, true);
                if (user != null) {
                    user.contact = false;
                    profileActivity.e5(false, false);
                    break;
                }
                break;
            case 6:
            case 7:
            case 11:
            case 12:
            case 14:
            case 15:
            case 16:
            case 19:
            default:
                rg.j0.Q((rg.j0) this.b, (ArrayList) this.c);
                break;
            case 8:
                r71 r71Var = (r71) this.b;
                TLRPC.User user2 = (TLRPC.User) this.c;
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    r71Var.dismiss();
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    b7 b7Var = new b7(r71Var, user2, twoStepVerificationActivity, 20);
                    twoStepVerificationActivity.Z = 0;
                    twoStepVerificationActivity.b0 = b7Var;
                    U.presentFragment(twoStepVerificationActivity);
                    break;
                }
                break;
            case 9:
                hb1.m((hb1) this.b, (uy) this.c);
                break;
            case 10:
                ThemeActivity.X((ThemeActivity) this.b, (iy0) this.c);
                break;
            case 13:
                gc1 gc1Var = (gc1) this.b;
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) this.c;
                gc1Var.getClass();
                MessagesController.getInstance(h6Var.E).saveTheme(h6Var, null, h6Var == org.telegram.ui.ActionBar.i6.J, true);
                HashMap hashMap = org.telegram.ui.ActionBar.i6.H;
                if (h6Var.b == null) {
                    z10 = false;
                } else {
                    if (org.telegram.ui.ActionBar.i6.I == h6Var) {
                        org.telegram.ui.ActionBar.i6.t(org.telegram.ui.ActionBar.i6.L, true, false);
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (h6Var == org.telegram.ui.ActionBar.i6.J) {
                        org.telegram.ui.ActionBar.i6.J = (org.telegram.ui.ActionBar.h6) hashMap.get("Dark Blue");
                    }
                    h6Var.t();
                    org.telegram.ui.ActionBar.i6.G.remove(h6Var);
                    hashMap.remove(h6Var.a);
                    org.telegram.ui.ActionBar.b6 b6Var = h6Var.i0;
                    if (b6Var != null) {
                        org.telegram.ui.ActionBar.b6.a(b6Var);
                    }
                    org.telegram.ui.ActionBar.i6.F.remove(h6Var);
                    new File(h6Var.b).delete();
                    org.telegram.ui.ActionBar.i6.s1(true, false);
                }
                if (z10) {
                    d5Var = ((org.telegram.ui.ActionBar.n2) gc1Var.e).parentLayout;
                    ((ActionBarLayout) d5Var).U(true, true);
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeListUpdated, new Object[0]);
                break;
            case 17:
                hh1.W((hh1) this.b, (byte[]) this.c);
                break;
            case 18:
                ui1 ui1Var = (ui1) this.b;
                boolean[] zArr2 = (boolean[]) this.c;
                ui1Var.getClass();
                zArr2[0] = true;
                ui1Var.p0 = 17;
                Intent intent = new Intent(ui1Var.b, (Class<?>) VoIPService.class);
                intent.putExtra("user_id", ui1Var.d.id);
                intent.putExtra("is_outgoing", true);
                intent.putExtra("start_incall_activity", false);
                intent.putExtra("video_call", false);
                intent.putExtra("can_video_call", false);
                intent.putExtra("account", ui1Var.a);
                try {
                    ui1Var.b.startService(intent);
                    break;
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    return;
                }
            case 20:
                e2.h hVar = (e2.h) this.b;
                boolean[] zArr3 = (boolean[]) this.c;
                hVar.accept(Boolean.TRUE);
                zArr3[0] = true;
                b2Var.dismiss();
                break;
            case 21:
                org.telegram.ui.web.p.Y((org.telegram.ui.web.p) this.b, (HashSet) this.c);
                break;
            case 22:
                org.telegram.ui.web.d1 d1Var = (org.telegram.ui.web.d1) this.b;
                String[] strArr = (String[]) this.c;
                TL_bots.allowSendMessage allowsendmessage = new TL_bots.allowSendMessage();
                allowsendmessage.bot = MessagesController.getInstance(d1Var.M).getInputUser(d1Var.U);
                ConnectionsManager.getInstance(d1Var.M).sendRequest(allowsendmessage, new ai.t5(d1Var, strArr, b2Var, 15));
                break;
            case 23:
                boolean[] zArr4 = (boolean[]) this.b;
                JsPromptResult jsPromptResult = (JsPromptResult) this.c;
                if (!zArr4[0]) {
                    zArr4[0] = true;
                    jsPromptResult.cancel();
                    break;
                }
                break;
        }
    }

    @Override // t5.b
    public Object i() {
        switch (this.a) {
            case 26:
                da.b bVar = (da.b) this.b;
                Iterable iterable = (Iterable) this.c;
                s5.g gVar = (s5.g) ((s5.d) bVar.c);
                gVar.getClass();
                if (iterable.iterator().hasNext()) {
                    gVar.a().compileStatement("DELETE FROM events WHERE _id in " + s5.g.g(iterable)).execute();
                    break;
                }
                break;
            default:
                da.b bVar2 = (da.b) this.b;
                for (Map.Entry entry : ((HashMap) this.c).entrySet()) {
                    ((s5.g) ((s5.c) bVar2.i)).e(((Integer) entry.getValue()).intValue(), o5.c.h, (String) entry.getKey());
                }
                break;
        }
        return null;
    }

    @Override // pa.a
    public void j(pa.b bVar) {
        pa.a aVar = (pa.a) this.b;
        pa.a aVar2 = (pa.a) this.c;
        aVar.j(bVar);
        aVar2.j(bVar);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        qg.a2 a2Var = (qg.a2) this.b;
        Bitmap bitmap = (Bitmap) this.c;
        a2Var.B0 = false;
        FileLog.e(exc);
        if (Build.VERSION.SDK_INT >= 24 && (exc instanceof mb.a) && exc.getMessage() != null && exc.getMessage().contains("segmentation optional module to be downloaded") && a2Var.isAttachedToWindow()) {
            AndroidUtilities.runOnUIThread(new p2.b(6, a2Var, bitmap), 2000L);
        } else {
            a2Var.C0 = true;
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        cf.c cVar = (cf.c) this.b;
        ci.d dVar = (ci.d) this.c;
        FileLog.d("wear-auth: /token delivered to " + ((String) cVar.d));
        dVar.setLoading(false);
        lj1.d = null;
        org.telegram.ui.ActionBar.f3 f3Var = lj1.c;
        if (f3Var != null) {
            f3Var.dismiss();
            lj1.c = null;
        }
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        ix0 ix0Var = (ix0) this.b;
        hx0 hx0Var = (hx0) this.c;
        PremiumPreviewFragment premiumPreviewFragment = ix0Var.d.n;
        premiumPreviewFragment.n0.d(0, 0.0f, 0, hx0Var.getMeasuredWidth(), -hx0Var.getTier().h, premiumPreviewFragment.O);
        return premiumPreviewFragment.n0.f;
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public void run(boolean z10) {
        of1 of1Var = (of1) this.b;
        TLRPC.Chat chat = (TLRPC.Chat) this.c;
        eg1 eg1Var = of1Var.b;
        NotificationCenter notificationCenter = eg1Var.getNotificationCenter();
        int i10 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(eg1Var, i10);
        eg1Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i10, new Object[0]);
        eg1Var.finishFragment();
        eg1Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(-chat.id), null, chat, Boolean.valueOf(z10));
    }

    @Override // org.telegram.ui.w11
    public void v(tk0 tk0Var) {
        hg1 hg1Var = (hg1) this.b;
        TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) this.c;
        kg1 kg1Var = hg1Var.a;
        kg1Var.e.add(Integer.valueOf(tL_forumTopic.id));
        kg1Var.V();
    }

    public /* synthetic */ rv0(sv0 sv0Var, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, ArrayList arrayList) {
        this.a = 0;
        this.b = sv0Var;
        this.c = tL_messageMediaPoll;
    }

    @Override // org.telegram.messenger.MediaDataController.KeywordResultCallback
    public void run(ArrayList arrayList, String str) {
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.b;
        Runnable runnable = (Runnable) this.c;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            try {
                if (!((MediaDataController.KeywordResult) arrayList.get(i10)).emoji.startsWith("animated_")) {
                    String fixEmoji = Emoji.fixEmoji(((MediaDataController.KeywordResult) arrayList.get(i10)).emoji);
                    if (Emoji.getEmojiDrawable(fixEmoji) != null) {
                        linkedHashSet.add(fixEmoji);
                    }
                }
            } catch (Exception unused) {
            }
        }
        runnable.run();
    }

    @Override // org.telegram.ui.w11
    public /* synthetic */ void c0() {
    }

    @Override // org.telegram.ui.Components.al0
    public /* synthetic */ void r0(View view, float f7, float f10) {
    }
}
