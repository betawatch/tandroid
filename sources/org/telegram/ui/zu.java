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
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zu implements org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.xl0, xx, ContactsLoadingObserver.Callback, org.telegram.ui.Components.vv0, org.telegram.ui.Components.yl0, ImageReceiver.ImageReceiverDelegate, OnCompleteListener, pt {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zu(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    @Override // org.telegram.ui.xx
    public /* synthetic */ boolean D() {
        return false;
    }

    @Override // org.telegram.ui.xx
    public /* synthetic */ boolean K(ey eyVar) {
        return false;
    }

    @Override // org.telegram.ui.pt
    public void L0(kt ktVar) {
        xm0 xm0Var = (xm0) this.c;
        int intValue = ((Integer) ((View) this.b).getTag()).intValue();
        EditTextBoldCursor editTextBoldCursor = xm0Var.Y[intValue];
        if (intValue == 5) {
            xm0Var.s = ktVar.d;
        } else {
            xm0Var.v = ktVar.d;
        }
        editTextBoldCursor.setText(ktVar.a);
    }

    @Override // org.telegram.ui.Components.xl0
    public /* synthetic */ boolean P0(View view) {
        switch (this.a) {
            case 2:
                break;
            case 5:
                break;
        }
        return false;
    }

    @Override // org.telegram.ui.Components.yl0
    public boolean a(int i10, View view) {
        pc0 pc0Var = (pc0) this.c;
        Context context = (Context) this.b;
        if (pc0Var.G0 == 2) {
            Object J = pc0Var.T.J(i10);
            if (J instanceof jc0) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(context, null);
                org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(0, pc0Var.getParentActivity(), pc0Var.getResourceProvider(), true, true);
                e1Var.setMinimumWidth(AndroidUtilities.dp(200.0f));
                e1Var.g(LocaleController.getString(R.string.GetDirections), R.drawable.filled_directions, null);
                e1Var.setOnClickListener(new org.telegram.ui.Components.g51(26, pc0Var, (jc0) J));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(e1Var);
                hc0 hc0Var = new hc0(pc0Var, actionBarPopupWindow$ActionBarPopupWindowLayout);
                pc0Var.I0 = hc0Var;
                hc0Var.setOutsideTouchable(true);
                pc0Var.I0.setClippingEnabled(true);
                pc0Var.I0.setInputMethodMode(2);
                pc0Var.I0.setSoftInputMode(0);
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                pc0Var.I0.showAtLocation(view, 48, 0, iArr[1] - AndroidUtilities.dp(52.0f));
                pc0Var.I0.b();
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.xl0
    public /* synthetic */ void a0(View view, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.vv0
    public void b(LocationController.SharingLocationInfo sharingLocationInfo) {
        LaunchActivity launchActivity = (LaunchActivity) this.c;
        int[] iArr = (int[]) this.b;
        Pattern pattern = LaunchActivity.C1;
        int i10 = sharingLocationInfo.messageObject.currentAccount;
        iArr[0] = i10;
        launchActivity.O0(i10);
        pc0 pc0Var = new pc0(2);
        pc0Var.t0(sharingLocationInfo.messageObject);
        pc0Var.F0 = new ci.d1(iArr, sharingLocationInfo.messageObject.getDialogId(), 10);
        launchActivity.t0(pc0Var);
    }

    @Override // org.telegram.ui.Components.xl0
    public void d(float f7, float f10, int i10, View view) {
        switch (this.a) {
            case 2:
                ey.f0((ey) this.c, (dy) this.b, view, i10);
                break;
            case 5:
                FiltersSetupActivity.U((FiltersSetupActivity) this.c, (Context) this.b, view, i10);
                break;
            default:
                NotificationsCustomSettingsActivity.U((NotificationsCustomSettingsActivity) this.c, (Context) this.b, view, i10, f7, f10);
                break;
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        Bitmap f02;
        pc0 pc0Var = (pc0) this.c;
        jc0 jc0Var = (jc0) this.b;
        pc0Var.getClass();
        if (!z10 || z11 || jc0Var.e == null || (f02 = pc0Var.f0(jc0Var)) == null) {
            return;
        }
        jc0Var.e.setIcon(f02);
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.l5.a(this, i10, str, drawable);
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        ConferenceCall conferenceCall;
        int i11 = this.a;
        org.telegram.ui.ActionBar.b2 b2Var2 = null;
        int i12 = 0;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i11) {
            case 0:
                cv.U((cv) obj2, (TLRPC.User) obj);
                break;
            case 1:
                ((ey) obj2).getMediaDataController().removeWebapp(((TLRPC.User) obj).id);
                break;
            case 2:
            case 3:
            case 5:
            case 10:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 23:
            case 25:
            default:
                xm0.U((xm0) obj2, (TLRPC.TL_auth_passwordRecovery) obj);
                break;
            case 4:
                dw dwVar = (dw) obj2;
                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) obj;
                dwVar.getClass();
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.id = dialogFilter.id;
                ey eyVar = dwVar.b;
                eyVar.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, null);
                eyVar.getMessagesController().removeFilter(dialogFilter);
                eyVar.getMessagesStorage().deleteDialogFilter(dialogFilter);
                break;
            case 6:
                n10 n10Var = (n10) obj2;
                MessagesController.DialogFilter dialogFilter2 = (MessagesController.DialogFilter) obj;
                FiltersSetupActivity filtersSetupActivity = n10Var.e;
                if (filtersSetupActivity.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.b2 b2Var3 = new org.telegram.ui.ActionBar.b2(filtersSetupActivity.getParentActivity(), 3, null);
                    b2Var3.g0 = false;
                    b2Var3.show();
                    b2Var2 = b2Var3;
                }
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter2 = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter2.id = dialogFilter2.id;
                filtersSetupActivity.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter2, new ea(n10Var, b2Var2, dialogFilter2, 10));
                break;
            case 7:
                s50 s50Var = (s50) obj2;
                TLObject tLObject = (TLObject) obj;
                AccountInstance accountInstance = s50Var.d;
                if (!s50Var.p1()) {
                    if (!(tLObject instanceof TLRPC.User)) {
                        TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                        accountInstance.getMessagesController().deleteParticipantFromChat(s50Var.j1(), (TLRPC.User) null, chat, false, false);
                        s50Var.l1().k(0L, 32, chat, null, null, null);
                        break;
                    } else {
                        TLRPC.User user = (TLRPC.User) tLObject;
                        accountInstance.getMessagesController().deleteParticipantFromChat(s50Var.j1(), user);
                        s50Var.l1().k(0L, 32, user, null, null, null);
                        break;
                    }
                } else {
                    VoIPService sharedInstance = VoIPService.getSharedInstance();
                    if (sharedInstance != null && (conferenceCall = sharedInstance.conference) != null && (tLObject instanceof TLRPC.User)) {
                        TLRPC.User user2 = (TLRPC.User) tLObject;
                        conferenceCall.kick(user2.id);
                        s50Var.a1.addKickedUser(user2.id);
                        s50Var.l1().k(0L, 102, user2, null, null, null);
                        break;
                    }
                }
                break;
            case 8:
                n60 n60Var = (n60) obj2;
                n60Var.x.h((TLRPC.User) obj);
                if (n60Var.f.r.length() > 0) {
                    n60Var.f.r.setText((CharSequence) null);
                    break;
                }
                break;
            case 9:
                n60 n60Var2 = (n60) obj2;
                n60Var2.getClass();
                org.telegram.ui.Cells.a2 a2Var = ((org.telegram.ui.Cells.a2[]) obj)[0];
                if (a2Var != null && a2Var.b()) {
                    i12 = 100;
                }
                n60Var2.m0(i12);
                break;
            case 11:
                LanguageSelectActivity.X((LanguageSelectActivity) obj2, (LocaleController.LocaleInfo) obj);
                break;
            case 12:
                Pattern pattern = LaunchActivity.C1;
                ((LaunchActivity) obj2).t0((eg0) obj);
                break;
            case 13:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                Pattern pattern2 = LaunchActivity.C1;
                launchActivity.getClass();
                LocaleController.getInstance().applyLanguage(((LocaleController.LocaleInfo[]) obj)[0], true, false, launchActivity.O);
                launchActivity.y0(true);
                break;
            case 21:
                ((ud0) obj2).E.o1((TLRPC.TL_auth_authorization) ((TLObject) obj), false);
                break;
            case 22:
                xd0 xd0Var = (xd0) obj2;
                xd0Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putString("email_unconfirmed_pattern", ((TLRPC.TL_auth_passwordRecovery) obj).email_pattern);
                bundle.putString("password", xd0Var.r);
                bundle.putString("requestPhone", xd0Var.s);
                bundle.putString("phoneHash", xd0Var.v);
                bundle.putString("phoneCode", xd0Var.w);
                xd0Var.y.u1(7, true, bundle, false);
                break;
            case 24:
                if0.o((if0) obj2, (Context) obj);
                break;
            case 26:
                xm0 xm0Var = (xm0) obj2;
                boolean[] zArr = (boolean[]) obj;
                if (!xm0Var.v0) {
                    xm0Var.s1.clear();
                }
                xm0Var.t1.clear();
                bm0 bm0Var = (bm0) xm0Var.B1;
                bm0Var.d.i1(xm0Var.E, xm0Var.F, xm0Var.G, zArr[0], null, null, bm0Var.b);
                xm0Var.finishFragment();
                break;
            case 27:
                int[] iArr = ((xm0) obj2).x;
                iArr[2] = 0;
                iArr[1] = 0;
                iArr[0] = 0;
                ((EditTextBoldCursor) obj).setText(LocaleController.getString(R.string.PassportNoExpireDate));
                break;
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.l5.b(this, imageReceiver);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        switch (this.a) {
            case 20:
                od0 od0Var = (od0) this.c;
                com.google.android.gms.internal.clearcut.v0 v0Var = (com.google.android.gms.internal.clearcut.v0) this.b;
                eg0 eg0Var = od0Var.W;
                if (eg0Var.getParentActivity() != null) {
                    eg0Var.getParentActivity().startActivityForResult(v0Var.f(), 200);
                    break;
                }
                break;
            default:
                te0 te0Var = (te0) this.c;
                com.google.android.gms.internal.clearcut.v0 v0Var2 = (com.google.android.gms.internal.clearcut.v0) this.b;
                eg0 eg0Var2 = te0Var.E;
                if (eg0Var2.getParentActivity() != null && !eg0Var2.getParentActivity().isFinishing()) {
                    eg0Var2.getParentActivity().startActivityForResult(v0Var2.f(), 200);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.messenger.ContactsLoadingObserver.Callback
    public void onResult(boolean z10) {
        LaunchActivity launchActivity = (LaunchActivity) this.c;
        Intent intent = (Intent) this.b;
        Pattern pattern = LaunchActivity.C1;
        launchActivity.X(intent, true, false, false, null, true, false);
    }

    @Override // org.telegram.ui.xx
    public boolean w(ey eyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, te1 te1Var) {
        x70 x70Var = (x70) this.c;
        ey eyVar2 = (ey) this.b;
        CacheByChatsController.KeepMediaException keepMediaException = null;
        int i12 = 0;
        while (i12 < arrayList.size()) {
            ArrayList arrayList2 = x70Var.f0;
            CacheByChatsController.KeepMediaException keepMediaException2 = new CacheByChatsController.KeepMediaException(((MessagesStorage.TopicKey) arrayList.get(i12)).dialogId, CacheByChatsController.KEEP_MEDIA_ONE_DAY);
            arrayList2.add(keepMediaException2);
            i12++;
            keepMediaException = keepMediaException2;
        }
        x70Var.d0.saveKeepMediaExceptions(x70Var.c0, x70Var.f0);
        Bundle bundle = new Bundle();
        bundle.putInt(TeXSymbolParser.TYPE_ATTR, x70Var.c0);
        u70 u70Var = new u70(bundle, eyVar2);
        u70Var.d = x70Var.f0;
        u70Var.U();
        x70Var.g0.presentFragment(u70Var);
        AndroidUtilities.runOnUIThread(new nt(28, u70Var, keepMediaException), 150L);
        return true;
    }

    private final /* synthetic */ void c(View view, float f7, float f10) {
    }

    private final /* synthetic */ void e(View view, float f7, float f10) {
    }

    private final /* synthetic */ void f(View view, float f7, float f10) {
    }
}
