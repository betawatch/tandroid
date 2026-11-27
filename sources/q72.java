// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Trace;
import android.text.SpannableString;
import android.view.View;
import android.widget.LinearLayout;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import com.google.android.gms.tasks.OnFailureListener;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.Executor;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.DataSettingsActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.webrtc.DataChannel;
import org.webrtc.NativeLifecycleLock;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class q72 implements lf9, ef7, fd, b7c, m8, tm8, tq2, OnFailureListener, n0a, NativeLifecycleLock.NativeRunnable, NativeLifecycleLock.NativeCallable, s69, c86, b86, h84, t69 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ q72(uj ujVar, Object obj, long j) {
        this.a = (byte) 21;
        this.b = ujVar;
        this.c = obj;
    }

    @Override // s69
    public final boolean C(View view) {
        byte b = this.a;
        return false;
    }

    @Override // c86
    public final void a(Object obj, lk4 lk4Var) {
        vj vjVar = (vj) obj;
        vjVar.k((s64) this.c, new qx6(lk4Var, ((ea3) this.b).e));
    }

    @Override // h84
    public final e84[] b(Uri uri, Map map) {
        jc3 jc3Var = (jc3) this.b;
        ko4 ko4Var = (ko4) this.c;
        return new e84[]{jc3Var.c.j(ko4Var) ? new meb(jc3Var.c.s(ko4Var), null) : new ic3(ko4Var)};
    }

    @Override // tq2
    public final Object b0(am2 am2Var) {
        String str = (String) this.b;
        fq2 fq2Var = (fq2) this.c;
        try {
            Trace.beginSection(str);
            return fq2Var.f.b0(am2Var);
        } finally {
            Trace.endSection();
        }
    }

    @Override // m8
    public final void c() {
        rd2 rd2Var = (rd2) this.b;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.c;
        if (rd2Var.c != null) {
            rd2Var.h = actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
            rd2Var.a();
        }
    }

    @Override // org.webrtc.NativeLifecycleLock.NativeCallable
    public final Object call() {
        Boolean lambda$send$7;
        lambda$send$7 = ((DataChannel) this.b).lambda$send$7((DataChannel.Buffer) this.c);
        return lambda$send$7;
    }

    @Override // s69
    public final void d(float f, float f2, int i, View view) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 18:
                ((DataSettingsActivity) obj2).q0((Context) obj, view, i, f);
                break;
            default:
                ((uj3) obj2).O3((tj3) obj, view, i);
                break;
        }
    }

    @Override // t69
    public final boolean e(int i, View view) {
        hm hmVar;
        ly3 ly3Var = (ly3) this.b;
        Context context = (Context) this.c;
        if (!(view instanceof ey3) || (hmVar = ((ey3) view).c) == null) {
            return false;
        }
        b8 b8Var = new b8(ly3Var.getContext(), true, true);
        b8Var.setItemHeight(48);
        b8Var.setPadding(hl.L(26.0f), 0, hl.L(26.0f), 0);
        b8Var.setText(ob6.M0(2131751732, null));
        b8Var.getTextView().setTextSize(1, 14.4f);
        b8Var.getTextView().setTypeface(hl.o());
        b8Var.setOnClickListener(new je3(ly3Var, hmVar, (byte) 9));
        LinearLayout linearLayout = new LinearLayout(context);
        Drawable mutate = ly3Var.getContext().getDrawable(R.drawable.popup_fixed_alert).mutate();
        yob.x(linearLayout, mutate, aob.G8, ly3Var.J0, PorterDuff.Mode.MULTIPLY);
        linearLayout.setBackground(mutate);
        linearLayout.addView(b8Var);
        n8 n8Var = new n8(linearLayout, -2, -2);
        ly3Var.A1 = n8Var;
        n8Var.setClippingEnabled(true);
        ly3Var.A1.g();
        ly3Var.A1.setInputMethodMode(2);
        ly3Var.A1.setSoftInputMode(0);
        ly3Var.A1.setOutsideTouchable(true);
        ly3Var.A1.setAnimationStyle(R.style.PopupAnimation);
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        ly3Var.A1.showAtLocation(view, 51, (view.getMeasuredWidth() / 2) + (iArr[0] - hl.L(49.0f)), iArr[1] - hl.L(52.0f));
        try {
            view.performHapticFeedback(0, 1);
        } catch (Exception unused) {
        }
        return true;
    }

    @Override // tm8
    public final void f(um4 um4Var) {
        byte b = this.a;
        Object obj = this.c;
        SpannableString spannableString = (SpannableString) this.b;
        switch (b) {
            case 7:
                hl.c3(new on1(spannableString, um4Var, (ve2) obj, (byte) 25));
                break;
            default:
                hl.c3(new on1(spannableString, um4Var, (zo2) obj, (byte) 26));
                break;
        }
    }

    @Override // b7c
    public final void h(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((pd2) this.b).e0(tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.c);
    }

    @Override // lf9
    public final fu5 i(dg9 dg9Var) {
        lh2 lh2Var = (lh2) this.b;
        vnb vnbVar = (vnb) this.c;
        v72 v72Var = (v72) lh2Var.c;
        fu5 fu5Var = new fu5(v72Var, vnbVar, dg9Var, false, false, true);
        v72Var.I = fu5Var;
        return fu5Var;
    }

    @Override // b86
    public final void invoke(Object obj) {
        byte b = this.a;
        uj ujVar = (uj) this.b;
        switch (b) {
            case 20:
                ((vj) obj).w(ujVar, (jt6) this.c);
                break;
            default:
                ((vj) obj).onRenderedFirstFrame(ujVar);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        yu4 vu4Var;
        byte b = this.a;
        byte b2 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 13:
                o23 o23Var = (o23) obj2;
                CancellationSignal cancellationSignal = (CancellationSignal) obj;
                exc.getClass();
                String str = ((exc instanceof ao) && q23.b.contains(Integer.valueOf(((ao) exc).getStatusCode()))) ? "GET_INTERRUPTED" : "GET_NO_CREDENTIALS";
                String str2 = "During begin sign in, failure response from one tap: " + exc.getMessage();
                int hashCode = str.hashCode();
                if (hashCode == -1567968963) {
                    if (str.equals("GET_CANCELED_TAG")) {
                        vu4Var = new vu4(str2);
                    }
                    vu4Var = new xu4(str2, (byte) 2);
                } else if (hashCode != -154594663) {
                    if (hashCode == 1996705159 && str.equals("GET_NO_CREDENTIALS")) {
                        vu4Var = new om7(str2);
                    }
                    vu4Var = new xu4(str2, (byte) 2);
                } else {
                    if (str.equals("GET_INTERRUPTED")) {
                        vu4Var = new zu4(str2);
                    }
                    vu4Var = new xu4(str2, (byte) 2);
                }
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (d33.a(cancellationSignal)) {
                    return;
                }
                o23Var.f().execute(new n23(o23Var, vu4Var, b2));
                return;
            default:
                v23 v23Var = (v23) obj2;
                CancellationSignal cancellationSignal2 = (CancellationSignal) obj;
                exc.getClass();
                String str3 = ((exc instanceof ao) && q23.b.contains(Integer.valueOf(((ao) exc).getStatusCode()))) ? "CREATE_INTERRUPTED" : "CREATE_UNKNOWN";
                String str4 = "During create public key credential, fido registration failure: " + exc.getMessage();
                w03 u03Var = str3.equals("CREATE_CANCELED") ? new u03(str4) : str3.equals("CREATE_INTERRUPTED") ? new y03(str4) : new v03(str4, (byte) 2);
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (d33.a(cancellationSignal2)) {
                    return;
                }
                Executor executor = v23Var.g;
                if (executor != null) {
                    executor.execute(new u23(v23Var, u03Var, b2));
                    return;
                } else {
                    ur5.e("executor");
                    throw null;
                }
        }
    }

    @Override // ef7
    public final void run(long j) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 1:
                g92 g92Var = (g92) obj2;
                g92Var.getClass();
                ((id) obj).dismiss();
                g92Var.O0 = false;
                if (j != 0) {
                    g92Var.w0 = j;
                    TLRPC.Chat M0 = g92Var.getMessagesController().M0(Long.valueOf(j));
                    g92Var.x0 = M0;
                    TLRPC.ChatFull chatFull = g92Var.y0;
                    if (chatFull != null) {
                        chatFull.hidden_prehistory = true;
                    }
                    boolean z = M0.forum_tabs != g92Var.H0;
                    boolean z2 = M0.forum_sidebar != g92Var.I0;
                    g92Var.getMessagesController().o5(g92Var.w0, g92Var.F0, g92Var.H0, g92Var.I0);
                    TLRPC.Chat chat = g92Var.x0;
                    chat.forum = g92Var.F0;
                    chat.forum_tabs = g92Var.H0;
                    chat.forum_sidebar = g92Var.I0;
                    if (z || z2) {
                        g92Var.u0(z);
                        break;
                    }
                }
                break;
            case 2:
            default:
                ja2 ja2Var = (ja2) obj2;
                Runnable runnable = (Runnable) obj;
                if (j != 0) {
                    na2 na2Var = ja2Var.y.d;
                    if (na2Var.s) {
                        na2Var.w.set(0, na2Var.getMessagesController().M0(Long.valueOf(j)));
                    } else {
                        na2Var.F = j;
                        na2Var.f = na2Var.getMessagesController().M0(Long.valueOf(j));
                    }
                    runnable.run();
                    break;
                }
                break;
            case 3:
                na2 na2Var2 = (na2) obj2;
                xc5 xc5Var = (xc5) obj;
                if (j != 0) {
                    na2Var2.getMessagesController().p5(j, false);
                    na2Var2.c0(na2Var2.getMessagesController().M0(Long.valueOf(j)), xc5Var);
                    break;
                }
                break;
        }
    }

    @Override // s69
    public final void u(View view, float f, float f2) {
        byte b = this.a;
    }

    @Override // fd
    public final void w(id idVar, int i) {
        byte b = this.a;
        byte b2 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 2:
                v92 v92Var = (v92) obj2;
                TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
                tL_channels_updateUsername.channel = uc7.i1((TLRPC.Chat) obj);
                tL_channels_updateUsername.username = "";
                v92Var.getConnectionsManager().sendRequest(tL_channels_updateUsername, new h92(v92Var, b2), 64);
                break;
            case 10:
                cu2 cu2Var = (cu2) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                ArrayList arrayList = new ArrayList();
                arrayList.add(user);
                cu2Var.getContactsController().i(arrayList, true);
                user.contact = false;
                cu2Var.finishFragment();
                break;
            case 11:
                ((ContactsActivity) obj2).j0((String) obj);
                break;
            case 12:
                ContactsActivity contactsActivity = (ContactsActivity) obj2;
                TLRPC.User user2 = (TLRPC.User) obj;
                lu2 lu2Var = contactsActivity.V;
                if (lu2Var != null) {
                    lu2Var.b(user2);
                    contactsActivity.V = null;
                    break;
                }
                break;
            case 23:
                ((bg3) obj2).n0((TLRPC.User) obj);
                break;
            case 24:
                ls6 mediaDataController = ((uj3) obj2).getMediaDataController();
                long j = ((TLRPC.User) obj).id;
                for (int i2 = 0; i2 < mediaDataController.m1.size(); i2++) {
                    if (((TLRPC.TL_topPeer) mediaDataController.m1.get(i2)).peer.user_id == j) {
                        mediaDataController.m1.remove(i2);
                        TLRPC.TL_contacts_resetTopPeerRating tL_contacts_resetTopPeerRating = new TLRPC.TL_contacts_resetTopPeerRating();
                        tL_contacts_resetTopPeerRating.category = new TLRPC.TL_topPeerCategoryBotsApp();
                        tL_contacts_resetTopPeerRating.peer = mediaDataController.getMessagesController().j1(j);
                        mediaDataController.getConnectionsManager().sendRequest(tL_contacts_resetTopPeerRating, new xe2(b2));
                        mediaDataController.getMessagesStorage().a.c(new gr6(mediaDataController, j, 2));
                        mediaDataController.getNotificationCenter().k(85, new Object[0]);
                        break;
                    }
                }
                break;
            case 27:
                ac7 ac7Var = (ac7) obj;
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.id = ac7Var.a;
                uj3 uj3Var = ((lj3) obj2).b;
                uj3Var.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, null);
                uj3Var.getMessagesController().s4(ac7Var);
                jf7 messagesStorage = uj3Var.getMessagesStorage();
                messagesStorage.a.c(new t87(messagesStorage, ac7Var, (byte) 20));
                break;
            default:
                ((wt3) obj2).a(((xs0) obj).getText().toString().trim());
                break;
        }
    }

    public /* synthetic */ q72(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ q72(ContactsActivity contactsActivity, TLRPC.User user, String str) {
        this.a = (byte) 12;
        this.b = contactsActivity;
        this.c = user;
    }

    private final void g(View view, float f, float f2) {
    }

    private final void j(View view, float f, float f2) {
    }

    @Override // org.webrtc.NativeLifecycleLock.NativeRunnable
    public final void run() {
        ((DataChannel) this.b).lambda$registerObserver$0((DataChannel.Observer) this.c);
    }
}
