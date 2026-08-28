package org.telegram.ui;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CacheByChatsController;
import org.telegram.messenger.ContactsLoadingObserver;
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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yr implements org.telegram.ui.ActionBar.b2, org.telegram.ui.Components.nk0, wx, ContactsLoadingObserver.Callback, org.telegram.ui.Components.hu0, org.telegram.ui.Components.ok0, ImageReceiver.ImageReceiverDelegate, OnCompleteListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ yr(int i9, Object obj, Object obj2) {
        this.a = i9;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.ui.wx
    public /* synthetic */ boolean C() {
        return false;
    }

    @Override // org.telegram.ui.wx
    public /* synthetic */ boolean I(dy dyVar) {
        return false;
    }

    @Override // org.telegram.ui.Components.ok0
    public boolean a(int i9, View view) {
        pc0 pc0Var = (pc0) this.b;
        Context context = (Context) this.c;
        if (pc0Var.C0 == 2) {
            Object J = pc0Var.P.J(i9);
            if (J instanceof jc0) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(context, null);
                org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, pc0Var.getParentActivity(), pc0Var.getResourceProvider(), true, true);
                g1Var.setMinimumWidth(AndroidUtilities.dp(200.0f));
                g1Var.g(LocaleController.getString(R.string.GetDirections), R.drawable.filled_directions, null);
                g1Var.setOnClickListener(new v80(3, pc0Var, (jc0) J));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var);
                hc0 hc0Var = new hc0(pc0Var, actionBarPopupWindow$ActionBarPopupWindowLayout);
                pc0Var.E0 = hc0Var;
                hc0Var.setOutsideTouchable(true);
                pc0Var.E0.setClippingEnabled(true);
                pc0Var.E0.setInputMethodMode(2);
                pc0Var.E0.setSoftInputMode(0);
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                pc0Var.E0.showAtLocation(view, 48, 0, iArr[1] - AndroidUtilities.dp(52.0f));
                pc0Var.E0.b();
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.nk0
    public void c(float f10, float f11, int i9, View view) {
        switch (this.a) {
            case 3:
                DataSettingsActivity.T((DataSettingsActivity) this.b, (Context) this.c, view, i9, f10);
                break;
            case 6:
                dy.d0((dy) this.b, (cy) this.c, view, i9);
                break;
            case 9:
                FiltersSetupActivity.T((FiltersSetupActivity) this.b, (Context) this.c, view, i9);
                break;
            default:
                NotificationsCustomSettingsActivity.T((NotificationsCustomSettingsActivity) this.b, (Context) this.c, view, i9, f10, f11);
                break;
        }
    }

    @Override // org.telegram.ui.Components.hu0
    public void d(LocationController.SharingLocationInfo sharingLocationInfo) {
        LaunchActivity launchActivity = (LaunchActivity) this.b;
        int[] iArr = (int[]) this.c;
        Pattern pattern = LaunchActivity.x1;
        int i9 = sharingLocationInfo.messageObject.currentAccount;
        iArr[0] = i9;
        launchActivity.K0(i9);
        pc0 pc0Var = new pc0(2);
        pc0Var.t0(sharingLocationInfo.messageObject);
        pc0Var.B0 = new d3.e(iArr, sharingLocationInfo.messageObject.getDialogId(), 10);
        launchActivity.p0(pc0Var);
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        Bitmap f02;
        pc0 pc0Var = (pc0) this.b;
        jc0 jc0Var = (jc0) this.c;
        pc0Var.getClass();
        if (!z10 || z11 || jc0Var.e == null || (f02 = pc0Var.f0(jc0Var)) == null) {
            return;
        }
        jc0Var.e.setIcon(f02);
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void didSetImageBitmap(int i9, String str, Drawable drawable) {
        org.telegram.messenger.g5.a(this, i9, str, drawable);
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        ConferenceCall conferenceCall;
        int i10 = this.a;
        org.telegram.ui.ActionBar.c2 c2Var2 = null;
        int i11 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                is isVar = (is) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                isVar.getClass();
                ArrayList<TLRPC.User> arrayList = new ArrayList<>();
                arrayList.add(user);
                isVar.getContactsController().deleteContact(arrayList, true);
                if (user != null) {
                    user.contact = false;
                }
                isVar.finishFragment();
                break;
            case 1:
                ContactsActivity.W((ContactsActivity) obj2, (String) obj);
                break;
            case 2:
                ContactsActivity contactsActivity = (ContactsActivity) obj2;
                TLRPC.User user2 = (TLRPC.User) obj;
                ts tsVar = contactsActivity.S;
                if (tsVar != null) {
                    tsVar.b(user2);
                    contactsActivity.S = null;
                    break;
                }
                break;
            case 3:
            case 6:
            case 7:
            case 9:
            case 14:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            default:
                jf0.o((jf0) obj2, (Context) obj);
                break;
            case 4:
                bv.T((bv) obj2, (TLRPC.User) obj);
                break;
            case 5:
                ((dy) obj2).getMediaDataController().removeWebapp(((TLRPC.User) obj).id);
                break;
            case 8:
                dw dwVar = (dw) obj2;
                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) obj;
                dwVar.getClass();
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.id = dialogFilter.id;
                dy dyVar = dwVar.b;
                dyVar.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, null);
                dyVar.getMessagesController().removeFilter(dialogFilter);
                dyVar.getMessagesStorage().deleteDialogFilter(dialogFilter);
                break;
            case 10:
                l10 l10Var = (l10) obj2;
                MessagesController.DialogFilter dialogFilter2 = (MessagesController.DialogFilter) obj;
                FiltersSetupActivity filtersSetupActivity = l10Var.e;
                if (filtersSetupActivity.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.c2 c2Var3 = new org.telegram.ui.ActionBar.c2(filtersSetupActivity.getParentActivity(), 3, null);
                    c2Var3.c0 = false;
                    c2Var3.show();
                    c2Var2 = c2Var3;
                }
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter2 = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter2.id = dialogFilter2.id;
                filtersSetupActivity.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter2, new y9(l10Var, c2Var2, dialogFilter2, 10));
                break;
            case 11:
                o50 o50Var = (o50) obj2;
                TLObject tLObject = (TLObject) obj;
                AccountInstance accountInstance = o50Var.d;
                if (!o50Var.o1()) {
                    if (!(tLObject instanceof TLRPC.User)) {
                        TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                        accountInstance.getMessagesController().deleteParticipantFromChat(o50Var.i1(), (TLRPC.User) null, chat, false, false);
                        o50Var.k1().k(0L, 32, chat, null, null, null);
                        break;
                    } else {
                        TLRPC.User user3 = (TLRPC.User) tLObject;
                        accountInstance.getMessagesController().deleteParticipantFromChat(o50Var.i1(), user3);
                        o50Var.k1().k(0L, 32, user3, null, null, null);
                        break;
                    }
                } else {
                    VoIPService sharedInstance = VoIPService.getSharedInstance();
                    if (sharedInstance != null && (conferenceCall = sharedInstance.conference) != null && (tLObject instanceof TLRPC.User)) {
                        TLRPC.User user4 = (TLRPC.User) tLObject;
                        conferenceCall.kick(user4.id);
                        o50Var.W0.addKickedUser(user4.id);
                        o50Var.k1().k(0L, 102, user4, null, null, null);
                        break;
                    }
                }
                break;
            case 12:
                k60 k60Var = (k60) obj2;
                k60Var.x.i((TLRPC.User) obj);
                if (k60Var.f.r.length() > 0) {
                    k60Var.f.r.setText((CharSequence) null);
                    break;
                }
                break;
            case 13:
                k60 k60Var2 = (k60) obj2;
                k60Var2.getClass();
                org.telegram.ui.Cells.z1 z1Var = ((org.telegram.ui.Cells.z1[]) obj)[0];
                if (z1Var != null && z1Var.b()) {
                    i11 = 100;
                }
                k60Var2.l0(i11);
                break;
            case 15:
                LanguageSelectActivity.W((LanguageSelectActivity) obj2, (LocaleController.LocaleInfo) obj);
                break;
            case 16:
                Pattern pattern = LaunchActivity.x1;
                ((LaunchActivity) obj2).p0((fg0) obj);
                break;
            case 17:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                Pattern pattern2 = LaunchActivity.x1;
                launchActivity.getClass();
                LocaleController.getInstance().applyLanguage(((LocaleController.LocaleInfo[]) obj)[0], true, false, launchActivity.K);
                launchActivity.u0(true);
                break;
            case 25:
                ((vd0) obj2).A.o1((TLRPC.TL_auth_authorization) ((TLObject) obj), false);
                break;
            case 26:
                yd0 yd0Var = (yd0) obj2;
                yd0Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putString("email_unconfirmed_pattern", ((TLRPC.TL_auth_passwordRecovery) obj).email_pattern);
                bundle.putString("password", yd0Var.r);
                bundle.putString("requestPhone", yd0Var.s);
                bundle.putString("phoneHash", yd0Var.v);
                bundle.putString("phoneCode", yd0Var.w);
                yd0Var.y.u1(7, true, bundle, false);
                break;
        }
    }

    @Override // org.telegram.ui.Components.nk0
    public /* synthetic */ boolean f1(View view) {
        switch (this.a) {
            case 3:
                break;
            case 6:
                break;
            case 9:
                break;
        }
        return false;
    }

    @Override // org.telegram.ui.Components.nk0
    public /* synthetic */ void g0(View view, float f10, float f11) {
        int i9 = this.a;
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.g5.b(this, imageReceiver);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        switch (this.a) {
            case 24:
                pd0 pd0Var = (pd0) this.b;
                com.google.android.gms.internal.clearcut.v0 v0Var = (com.google.android.gms.internal.clearcut.v0) this.c;
                fg0 fg0Var = pd0Var.S;
                if (fg0Var.getParentActivity() != null) {
                    fg0Var.getParentActivity().startActivityForResult(v0Var.f(), 200);
                    break;
                }
                break;
            default:
                ue0 ue0Var = (ue0) this.b;
                com.google.android.gms.internal.clearcut.v0 v0Var2 = (com.google.android.gms.internal.clearcut.v0) this.c;
                fg0 fg0Var2 = ue0Var.A;
                if (fg0Var2.getParentActivity() != null && !fg0Var2.getParentActivity().isFinishing()) {
                    fg0Var2.getParentActivity().startActivityForResult(v0Var2.f(), 200);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.messenger.ContactsLoadingObserver.Callback
    public void onResult(boolean z10) {
        LaunchActivity launchActivity = (LaunchActivity) this.b;
        Intent intent = (Intent) this.c;
        Pattern pattern = LaunchActivity.x1;
        launchActivity.X(intent, true, false, false, null, true, false);
    }

    @Override // org.telegram.ui.wx
    public boolean v(dy dyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i9, int i10, we1 we1Var) {
        u70 u70Var = (u70) this.b;
        dy dyVar2 = (dy) this.c;
        CacheByChatsController.KeepMediaException keepMediaException = null;
        int i11 = 0;
        while (i11 < arrayList.size()) {
            ArrayList arrayList2 = u70Var.b0;
            CacheByChatsController.KeepMediaException keepMediaException2 = new CacheByChatsController.KeepMediaException(((MessagesStorage.TopicKey) arrayList.get(i11)).dialogId, CacheByChatsController.KEEP_MEDIA_ONE_DAY);
            arrayList2.add(keepMediaException2);
            i11++;
            keepMediaException = keepMediaException2;
        }
        u70Var.W.saveKeepMediaExceptions(u70Var.V, u70Var.b0);
        Bundle bundle = new Bundle();
        bundle.putInt(TeXSymbolParser.TYPE_ATTR, u70Var.V);
        r70 r70Var = new r70(bundle, dyVar2);
        r70Var.d = u70Var.b0;
        r70Var.T();
        u70Var.c0.presentFragment(r70Var);
        AndroidUtilities.runOnUIThread(new x20(5, r70Var, keepMediaException), 150L);
        return true;
    }

    public /* synthetic */ yr(ContactsActivity contactsActivity, TLRPC.User user, String str) {
        this.a = 2;
        this.b = contactsActivity;
        this.c = user;
    }

    private final /* synthetic */ void b(View view, float f10, float f11) {
    }

    private final /* synthetic */ void e(View view, float f10, float f11) {
    }

    private final /* synthetic */ void g(View view, float f10, float f11) {
    }

    private final /* synthetic */ void h(View view, float f10, float f11) {
    }
}
