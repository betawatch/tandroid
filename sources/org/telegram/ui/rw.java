package org.telegram.ui;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.io.File;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CacheByChatsController;
import org.telegram.messenger.ContactsLoadingObserver;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rw implements org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.fm0, ny, ContactsLoadingObserver.Callback, org.telegram.ui.Components.ew0, org.telegram.ui.Components.gm0, ImageReceiver.ImageReceiverDelegate, OnCompleteListener, yt, FileLoader.FileResolver {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rw(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.ui.ny
    public /* synthetic */ boolean C() {
        return false;
    }

    @Override // org.telegram.ui.ny
    public /* synthetic */ boolean K(ty tyVar) {
        return false;
    }

    @Override // org.telegram.ui.yt
    public void U0(ut utVar) {
        nn0 nn0Var = (nn0) this.b;
        int intValue = ((Integer) ((View) this.c).getTag()).intValue();
        EditTextBoldCursor editTextBoldCursor = nn0Var.Y[intValue];
        if (intValue == 5) {
            nn0Var.s = utVar.d;
        } else {
            nn0Var.v = utVar.d;
        }
        editTextBoldCursor.setText(utVar.a);
    }

    @Override // org.telegram.ui.Components.fm0
    public /* synthetic */ boolean Y0(View view) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Components.ew0
    public void b(LocationController.SharingLocationInfo sharingLocationInfo) {
        LaunchActivity launchActivity = (LaunchActivity) this.b;
        int[] iArr = (int[]) this.c;
        Pattern pattern = LaunchActivity.B1;
        int i10 = sharingLocationInfo.messageObject.currentAccount;
        iArr[0] = i10;
        launchActivity.K0(i10);
        hd0 hd0Var = new hd0(2);
        hd0Var.t0(sharingLocationInfo.messageObject);
        hd0Var.F0 = new ai.z1(iArr, sharingLocationInfo.messageObject.getDialogId(), 10);
        launchActivity.p0(hd0Var);
    }

    @Override // org.telegram.ui.Components.fm0
    public void c(float f7, float f10, int i10, View view) {
        switch (this.a) {
            case 1:
                FiltersSetupActivity.U((FiltersSetupActivity) this.b, (Context) this.c, view, i10);
                break;
            default:
                NotificationsCustomSettingsActivity.U((NotificationsCustomSettingsActivity) this.b, (Context) this.c, view, i10, f7, f10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.gm0
    public boolean d(int i10, View view) {
        hd0 hd0Var = (hd0) this.b;
        Context context = (Context) this.c;
        if (hd0Var.G0 == 2) {
            Object J = hd0Var.T.J(i10);
            if (J instanceof bd0) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(context, null);
                org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(0, hd0Var.getParentActivity(), hd0Var.getResourceProvider(), true, true);
                f1Var.setMinimumWidth(AndroidUtilities.dp(200.0f));
                f1Var.g(LocaleController.getString(R.string.GetDirections), R.drawable.filled_directions, null);
                f1Var.setOnClickListener(new rv(16, hd0Var, (bd0) J));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(f1Var);
                zc0 zc0Var = new zc0(hd0Var, actionBarPopupWindow$ActionBarPopupWindowLayout);
                hd0Var.I0 = zc0Var;
                zc0Var.setOutsideTouchable(true);
                hd0Var.I0.setClippingEnabled(true);
                hd0Var.I0.setInputMethodMode(2);
                hd0Var.I0.setSoftInputMode(0);
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                hd0Var.I0.showAtLocation(view, 48, 0, iArr[1] - AndroidUtilities.dp(52.0f));
                hd0Var.I0.b();
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        Bitmap f02;
        hd0 hd0Var = (hd0) this.b;
        bd0 bd0Var = (bd0) this.c;
        hd0Var.getClass();
        if (!z10 || z11 || bd0Var.e == null || (f02 = hd0Var.f0(bd0Var)) == null) {
            return;
        }
        bd0Var.e.setIcon(f02);
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.i5.a(this, i10, str, drawable);
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        ConferenceCall conferenceCall;
        int i11 = this.a;
        org.telegram.ui.ActionBar.b2 b2Var2 = null;
        int i12 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i11) {
            case 0:
                sw swVar = (sw) obj2;
                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) obj;
                swVar.getClass();
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.id = dialogFilter.id;
                ty tyVar = swVar.b;
                tyVar.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, null);
                tyVar.getMessagesController().removeFilter(dialogFilter);
                tyVar.getMessagesStorage().deleteDialogFilter(dialogFilter);
                break;
            case 1:
            case 6:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 19:
            case 21:
            case 24:
            default:
                PhotoViewer.D(((ss0) obj2).b, (ArrayList) obj);
                break;
            case 2:
                c20 c20Var = (c20) obj2;
                MessagesController.DialogFilter dialogFilter2 = (MessagesController.DialogFilter) obj;
                FiltersSetupActivity filtersSetupActivity = c20Var.e;
                if (filtersSetupActivity.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.b2 b2Var3 = new org.telegram.ui.ActionBar.b2(filtersSetupActivity.getParentActivity(), 3, null);
                    b2Var3.g0 = false;
                    b2Var3.show();
                    b2Var2 = b2Var3;
                }
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter2 = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter2.id = dialogFilter2.id;
                filtersSetupActivity.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter2, new ba(c20Var, b2Var2, dialogFilter2, 10));
                break;
            case 3:
                g60 g60Var = (g60) obj2;
                TLObject tLObject = (TLObject) obj;
                AccountInstance accountInstance = g60Var.d;
                if (!g60Var.p1()) {
                    if (!(tLObject instanceof TLRPC.User)) {
                        TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                        accountInstance.getMessagesController().deleteParticipantFromChat(g60Var.j1(), (TLRPC.User) null, chat, false, false);
                        g60Var.l1().k(0L, 32, chat, null, null, null);
                        break;
                    } else {
                        TLRPC.User user = (TLRPC.User) tLObject;
                        accountInstance.getMessagesController().deleteParticipantFromChat(g60Var.j1(), user);
                        g60Var.l1().k(0L, 32, user, null, null, null);
                        break;
                    }
                } else {
                    VoIPService sharedInstance = VoIPService.getSharedInstance();
                    if (sharedInstance != null && (conferenceCall = sharedInstance.conference) != null && (tLObject instanceof TLRPC.User)) {
                        TLRPC.User user2 = (TLRPC.User) tLObject;
                        conferenceCall.kick(user2.id);
                        g60Var.a1.addKickedUser(user2.id);
                        g60Var.l1().k(0L, 102, user2, null, null, null);
                        break;
                    }
                }
                break;
            case 4:
                c70 c70Var = (c70) obj2;
                c70Var.x.i((TLRPC.User) obj);
                if (c70Var.f.r.length() > 0) {
                    c70Var.f.r.setText((CharSequence) null);
                    break;
                }
                break;
            case 5:
                c70 c70Var2 = (c70) obj2;
                c70Var2.getClass();
                org.telegram.ui.Cells.a2 a2Var = ((org.telegram.ui.Cells.a2[]) obj)[0];
                if (a2Var != null && a2Var.b()) {
                    i12 = 100;
                }
                c70Var2.m0(i12);
                break;
            case 7:
                LanguageSelectActivity.X((LanguageSelectActivity) obj2, (LocaleController.LocaleInfo) obj);
                break;
            case 8:
                Pattern pattern = LaunchActivity.B1;
                ((LaunchActivity) obj2).p0((wg0) obj);
                break;
            case 9:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                Pattern pattern2 = LaunchActivity.B1;
                launchActivity.getClass();
                LocaleController.getInstance().applyLanguage(((LocaleController.LocaleInfo[]) obj)[0], true, false, launchActivity.O);
                launchActivity.u0(true);
                break;
            case 17:
                ((le0) obj2).E.o1((TLRPC.TL_auth_authorization) ((TLObject) obj), false);
                break;
            case 18:
                oe0 oe0Var = (oe0) obj2;
                oe0Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putString("email_unconfirmed_pattern", ((TLRPC.TL_auth_passwordRecovery) obj).email_pattern);
                bundle.putString("password", oe0Var.r);
                bundle.putString("requestPhone", oe0Var.s);
                bundle.putString("phoneHash", oe0Var.v);
                bundle.putString("phoneCode", oe0Var.w);
                oe0Var.y.u1(7, true, bundle, false);
                break;
            case 20:
                zf0.o((zf0) obj2, (Context) obj);
                break;
            case 22:
                nn0 nn0Var = (nn0) obj2;
                boolean[] zArr = (boolean[]) obj;
                if (!nn0Var.v0) {
                    nn0Var.s1.clear();
                }
                nn0Var.t1.clear();
                qm0 qm0Var = (qm0) nn0Var.B1;
                qm0Var.d.i1(nn0Var.E, nn0Var.F, nn0Var.G, zArr[0], null, null, qm0Var.b);
                nn0Var.finishFragment();
                break;
            case 23:
                int[] iArr = ((nn0) obj2).x;
                iArr[2] = 0;
                iArr[1] = 0;
                iArr[0] = 0;
                ((EditTextBoldCursor) obj).setText(LocaleController.getString(R.string.PassportNoExpireDate));
                break;
            case 25:
                nn0.U((nn0) obj2, (TLRPC.TL_auth_passwordRecovery) obj);
                break;
            case 26:
                vo0 vo0Var = (vo0) obj2;
                vo0Var.b0 = true;
                vo0Var.a0.email_unconfirmed_pattern = (String) obj;
                vo0Var.J0();
                break;
        }
    }

    @Override // org.telegram.messenger.FileLoader.FileResolver
    public File getFile() {
        switch (this.a) {
            case 27:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                return FileLoader.getInstance(photoViewer.T).getPathToAttach((TLObject) this.c, true);
            default:
                PhotoViewer photoViewer2 = (PhotoViewer) this.b;
                return FileLoader.getInstance(photoViewer2.T).getPathToMessage((TLRPC.Message) this.c);
        }
    }

    @Override // org.telegram.ui.Components.fm0
    public /* synthetic */ void n0(View view, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.i5.b(this, imageReceiver);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        switch (this.a) {
            case 16:
                fe0 fe0Var = (fe0) this.b;
                com.google.android.gms.internal.clearcut.u0 u0Var = (com.google.android.gms.internal.clearcut.u0) this.c;
                wg0 wg0Var = fe0Var.W;
                if (wg0Var.getParentActivity() != null) {
                    wg0Var.getParentActivity().startActivityForResult(u0Var.f(), 200);
                    break;
                }
                break;
            default:
                kf0 kf0Var = (kf0) this.b;
                com.google.android.gms.internal.clearcut.u0 u0Var2 = (com.google.android.gms.internal.clearcut.u0) this.c;
                wg0 wg0Var2 = kf0Var.E;
                if (wg0Var2.getParentActivity() != null && !wg0Var2.getParentActivity().isFinishing()) {
                    wg0Var2.getParentActivity().startActivityForResult(u0Var2.f(), 200);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.messenger.ContactsLoadingObserver.Callback
    public void onResult(boolean z10) {
        LaunchActivity launchActivity = (LaunchActivity) this.b;
        Intent intent = (Intent) this.c;
        Pattern pattern = LaunchActivity.B1;
        launchActivity.X(intent, true, false, false, null, true, false);
    }

    @Override // org.telegram.ui.ny
    public boolean w(ty tyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, fg1 fg1Var) {
        p80 p80Var = (p80) this.b;
        ty tyVar2 = (ty) this.c;
        CacheByChatsController.KeepMediaException keepMediaException = null;
        int i12 = 0;
        while (i12 < arrayList.size()) {
            ArrayList arrayList2 = p80Var.f0;
            CacheByChatsController.KeepMediaException keepMediaException2 = new CacheByChatsController.KeepMediaException(((MessagesStorage.TopicKey) arrayList.get(i12)).dialogId, CacheByChatsController.KEEP_MEDIA_ONE_DAY);
            arrayList2.add(keepMediaException2);
            i12++;
            keepMediaException = keepMediaException2;
        }
        p80Var.d0.saveKeepMediaExceptions(p80Var.c0, p80Var.f0);
        Bundle bundle = new Bundle();
        bundle.putInt(TeXSymbolParser.TYPE_ATTR, p80Var.c0);
        m80 m80Var = new m80(bundle, tyVar2);
        m80Var.d = p80Var.f0;
        m80Var.U();
        p80Var.g0.presentFragment(m80Var);
        AndroidUtilities.runOnUIThread(new m70(4, m80Var, keepMediaException), 150L);
        return true;
    }

    private final /* synthetic */ void a(View view, float f7, float f10) {
    }

    private final /* synthetic */ void e(View view, float f7, float f10) {
    }
}
