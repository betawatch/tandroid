package org.telegram.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class tr implements org.telegram.ui.ActionBar.q1, org.telegram.ui.Components.hj0, sw, org.telegram.ui.Components.at0, org.telegram.ui.Components.ij0, org.telegram.messenger.kc, OnCompleteListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ tr(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.ui.sw
    public /* synthetic */ boolean H() {
        return false;
    }

    @Override // org.telegram.messenger.kc
    public void I(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        Bitmap n02;
        pa0 pa0Var = (pa0) this.b;
        la0 la0Var = (la0) this.c;
        if (!z10 || z11 || la0Var.e == null || (n02 = pa0Var.n0(la0Var)) == null) {
            return;
        }
        la0Var.e.a.a(c8.p9.a(n02));
    }

    @Override // org.telegram.ui.sw
    public /* synthetic */ boolean P(yw ywVar) {
        return false;
    }

    @Override // org.telegram.ui.Components.ij0
    public boolean b(int i7, View view) {
        pa0 pa0Var = (pa0) this.b;
        Context context = (Context) this.c;
        if (pa0Var.I0 == 2) {
            Object I = pa0Var.Q.I(i7);
            if (I instanceof la0) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(context, null);
                org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(0, pa0Var.getParentActivity(), pa0Var.getResourceProvider(), true, true);
                z0Var.setMinimumWidth(org.telegram.messenger.g0.L(200.0f));
                z0Var.j(org.telegram.messenger.hd.M0(2131750473, null), R.drawable.filled_directions, null);
                z0Var.setOnClickListener(new a90(1, pa0Var, (la0) I));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(z0Var);
                ka0 ka0Var = new ka0(pa0Var, actionBarPopupWindow$ActionBarPopupWindowLayout);
                pa0Var.K0 = ka0Var;
                ka0Var.setOutsideTouchable(true);
                pa0Var.K0.setClippingEnabled(true);
                pa0Var.K0.setInputMethodMode(2);
                pa0Var.K0.setSoftInputMode(0);
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                pa0Var.K0.showAtLocation(view, 48, 0, iArr[1] - org.telegram.messenger.g0.L(52.0f));
                pa0Var.K0.b();
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.at0
    public void c(org.telegram.messenger.qd qdVar) {
        LaunchActivity launchActivity = (LaunchActivity) this.b;
        int[] iArr = (int[]) this.c;
        String str = LaunchActivity.C1;
        int i7 = qdVar.h.K1;
        iArr[0] = i7;
        launchActivity.O0(i7);
        pa0 pa0Var = new pa0(2);
        pa0Var.G0(qdVar.h);
        pa0Var.H0 = new ai.d0(iArr, org.telegram.messenger.gj.B0(qdVar.h.k), 10);
        launchActivity.t0(pa0Var);
    }

    @Override // org.telegram.ui.Components.hj0
    public /* synthetic */ boolean c1(View view) {
        switch (this.a) {
            case 1:
                break;
            case 5:
                break;
            case 7:
                break;
        }
        return false;
    }

    @Override // org.telegram.ui.Components.hj0
    public void f(float f10, float f11, int i7, View view) {
        switch (this.a) {
            case 1:
                DataSettingsActivity.Z((DataSettingsActivity) this.b, (Context) this.c, view, i7, f10);
                break;
            case 5:
                yw.g0((yw) this.b, (xw) this.c, view, i7);
                break;
            case 7:
                FiltersSetupActivity.Z((FiltersSetupActivity) this.b, (Context) this.c, view, i7);
                break;
            default:
                NotificationsCustomSettingsActivity.Z((NotificationsCustomSettingsActivity) this.b, (Context) this.c, view, i7, f10, f11);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        ConferenceCall conferenceCall;
        int i10;
        int i11 = this.a;
        org.telegram.ui.ActionBar.t1 t1Var2 = null;
        int i12 = 2;
        int i13 = 1;
        int i14 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i11) {
            case 0:
                ContactsActivity.Z((ContactsActivity) obj2, (String) obj);
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 12:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 25:
            default:
                be0 be0Var = (be0) obj2;
                ((boolean[]) obj)[0] = true;
                if (be0Var.o()) {
                    d3.b bVar = new d3.b(i13);
                    CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
                    be0Var.b0 = cancellationTokenSource;
                    Context context = be0Var.getContext();
                    i10 = ((org.telegram.ui.ActionBar.e2) be0Var.h0).currentAccount;
                    CancellationToken token = cancellationTokenSource.getToken();
                    jd0 jd0Var = new jd0(i12, be0Var, cancellationTokenSource);
                    TaskCompletionSource taskCompletionSource = new TaskCompletionSource(token);
                    kotlin.jvm.internal.j.e(context, "context");
                    androidx.emoji2.text.n nVar = new androidx.emoji2.text.n(context, 3);
                    Runnable[] runnableArr = new Runnable[1];
                    int i15 = 4;
                    token.onCanceledRequested(new org.telegram.messenger.j1(runnableArr, i15));
                    TLRPC.TL_auth_initFirebasePnvLogin tL_auth_initFirebasePnvLogin = new TLRPC.TL_auth_initFirebasePnvLogin();
                    tL_auth_initFirebasePnvLogin.api_id = org.telegram.messenger.r2.d;
                    tL_auth_initFirebasePnvLogin.api_hash = org.telegram.messenger.r2.e;
                    ArrayList<Long> arrayList = new ArrayList<>();
                    int i16 = 0;
                    while (i16 < i15) {
                        org.telegram.messenger.m10 i17 = org.telegram.messenger.m10.i(i16);
                        if (i17.p()) {
                            arrayList.add(Long.valueOf(i17.e()));
                        }
                        i16++;
                        i15 = 4;
                    }
                    tL_auth_initFirebasePnvLogin.except_ids = arrayList;
                    runnableArr[0] = new org.telegram.messenger.f9(i10, ConnectionsManager.getInstance(i10).sendRequestTyped(tL_auth_initFirebasePnvLogin, new d3.b(i13), new org.telegram.messenger.e9(token, taskCompletionSource, runnableArr, nVar, context, jd0Var, i10), 8), i14);
                    if (token.isCancellationRequested()) {
                        runnableArr[0].run();
                    }
                    taskCompletionSource.getTask().addOnCompleteListener(bVar, new tr(28, be0Var, cancellationTokenSource)).addOnSuccessListener(bVar, new wd0(be0Var)).addOnFailureListener(bVar, new wd0(be0Var));
                    break;
                }
                break;
            case 2:
                cu.Z((cu) obj2, (TLRPC.User) obj);
                break;
            case 4:
                org.telegram.messenger.si mediaDataController = ((yw) obj2).getMediaDataController();
                long j3 = ((TLRPC.User) obj).id;
                for (int i18 = 0; i18 < mediaDataController.m1.size(); i18++) {
                    if (((TLRPC.TL_topPeer) mediaDataController.m1.get(i18)).peer.user_id == j3) {
                        mediaDataController.m1.remove(i18);
                        TLRPC.TL_contacts_resetTopPeerRating tL_contacts_resetTopPeerRating = new TLRPC.TL_contacts_resetTopPeerRating();
                        tL_contacts_resetTopPeerRating.category = new TLRPC.TL_topPeerCategoryBotsApp();
                        tL_contacts_resetTopPeerRating.peer = mediaDataController.getMessagesController().j1(j3);
                        mediaDataController.getConnectionsManager().sendRequest(tL_contacts_resetTopPeerRating, new fi.m5(11));
                        mediaDataController.getMessagesStorage().a.c(new di.y8(mediaDataController, j3, 2, 4));
                        mediaDataController.getNotificationCenter().k(84, new Object[0]);
                        break;
                    }
                }
                break;
            case 6:
                org.telegram.messenger.so soVar = (org.telegram.messenger.so) obj;
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.id = soVar.a;
                yw ywVar = ((pw) obj2).b;
                ywVar.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, null);
                ywVar.getMessagesController().h4(soVar);
                org.telegram.messenger.vr messagesStorage = ywVar.getMessagesStorage();
                messagesStorage.a.c(new org.telegram.messenger.pq(i12, messagesStorage, soVar));
                break;
            case 8:
                g00 g00Var = (g00) obj2;
                org.telegram.messenger.so soVar2 = (org.telegram.messenger.so) obj;
                FiltersSetupActivity filtersSetupActivity = g00Var.e;
                if (filtersSetupActivity.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.t1 t1Var3 = new org.telegram.ui.ActionBar.t1(3, filtersSetupActivity.getParentActivity(), null);
                    t1Var3.j0 = false;
                    t1Var3.show();
                    t1Var2 = t1Var3;
                }
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter2 = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter2.id = soVar2.a;
                filtersSetupActivity.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter2, new z9(g00Var, t1Var2, soVar2, 10));
                break;
            case 9:
                c40 c40Var = (c40) obj2;
                TLObject tLObject = (TLObject) obj;
                org.telegram.messenger.c cVar = c40Var.o1;
                if (c40Var.r1()) {
                    VoIPService sharedInstance = VoIPService.getSharedInstance();
                    if (sharedInstance != null && (conferenceCall = sharedInstance.conference) != null && (tLObject instanceof TLRPC.User)) {
                        TLRPC.User user = (TLRPC.User) tLObject;
                        conferenceCall.kick(user.id);
                        org.telegram.messenger.r3 r3Var = c40Var.V2;
                        long j10 = user.id;
                        ArrayList arrayList2 = r3Var.o;
                        if (!arrayList2.contains(Long.valueOf(j10))) {
                            arrayList2.add(Long.valueOf(j10));
                            r3Var.z();
                            org.telegram.messenger.ns.f(r3Var.C.a).k(org.telegram.messenger.ns.w2, Long.valueOf(r3Var.c), Long.valueOf(r3Var.b.id), Boolean.FALSE);
                        }
                        c40Var.n1().k(0L, org.telegram.messenger.ns.n1, user, null, null, null);
                        break;
                    }
                } else if (tLObject instanceof TLRPC.User) {
                    TLRPC.User user2 = (TLRPC.User) tLObject;
                    org.telegram.messenger.np.s1(cVar.a).f0(c40Var.l1(), user2);
                    c40Var.n1().k(0L, 32, user2, null, null, null);
                    break;
                } else {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    org.telegram.messenger.np.s1(cVar.a).g0(c40Var.l1(), null, chat, false, false);
                    c40Var.n1().k(0L, 32, chat, null, null, null);
                    break;
                }
                break;
            case 10:
                w40 w40Var = (w40) obj2;
                w40Var.y.f((TLRPC.User) obj);
                if (w40Var.f.r.length() > 0) {
                    w40Var.f.r.setText((CharSequence) null);
                    break;
                }
                break;
            case 11:
                w40 w40Var2 = (w40) obj2;
                w40Var2.getClass();
                org.telegram.ui.Cells.c2 c2Var = ((org.telegram.ui.Cells.c2[]) obj)[0];
                if (c2Var != null && c2Var.b()) {
                    i14 = 100;
                }
                w40Var2.r0(i14);
                break;
            case 13:
                LanguageSelectActivity.c0((LanguageSelectActivity) obj2, (org.telegram.messenger.dd) obj);
                break;
            case 14:
                String str = LaunchActivity.C1;
                ((LaunchActivity) obj2).t0((ce0) obj);
                break;
            case 15:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                String str2 = LaunchActivity.C1;
                org.telegram.messenger.hd.E0().d(((org.telegram.messenger.dd[]) obj)[0], true, false, launchActivity.P);
                launchActivity.y0(true);
                break;
            case 23:
                ((tb0) obj2).H.G1((TLRPC.TL_auth_authorization) ((TLObject) obj), false);
                break;
            case 24:
                wb0 wb0Var = (wb0) obj2;
                wb0Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putString("email_unconfirmed_pattern", ((TLRPC.TL_auth_passwordRecovery) obj).email_pattern);
                bundle.putString("password", wb0Var.r);
                bundle.putString("requestPhone", wb0Var.s);
                bundle.putString("phoneHash", wb0Var.w);
                bundle.putString("phoneCode", wb0Var.x);
                wb0Var.E.M1(7, true, bundle, false);
                break;
            case 26:
                ed0.n((ed0) obj2, (Context) obj);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        switch (this.a) {
            case 22:
                ob0 ob0Var = (ob0) this.b;
                b9.k0 k0Var = (b9.k0) this.c;
                ce0 ce0Var = ob0Var.a0;
                if (ce0Var.getParentActivity() != null) {
                    ce0Var.getParentActivity().startActivityForResult(k0Var.f(), org.telegram.messenger.ns.e3);
                    break;
                }
                break;
            case 25:
                rc0 rc0Var = (rc0) this.b;
                b9.k0 k0Var2 = (b9.k0) this.c;
                ce0 ce0Var2 = rc0Var.F;
                if (ce0Var2.getParentActivity() != null && !ce0Var2.getParentActivity().isFinishing()) {
                    ce0Var2.getParentActivity().startActivityForResult(k0Var2.f(), org.telegram.messenger.ns.e3);
                    break;
                }
                break;
            default:
                be0 be0Var = (be0) this.b;
                CancellationTokenSource cancellationTokenSource = (CancellationTokenSource) this.c;
                org.telegram.ui.ActionBar.t1 t1Var = be0Var.c0;
                if (t1Var != null) {
                    t1Var.dismiss();
                    be0Var.c0 = null;
                }
                if (be0Var.b0 == cancellationTokenSource) {
                    be0Var.b0 = null;
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.hj0
    public /* synthetic */ void r0(View view, float f10, float f11) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.sw
    public boolean y(yw ywVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i7, int i10, u91 u91Var) {
        d60 d60Var = (d60) this.b;
        yw ywVar2 = (yw) this.c;
        org.telegram.messenger.s2 s2Var = null;
        int i11 = 0;
        while (i11 < arrayList.size()) {
            ArrayList arrayList2 = d60Var.g0;
            org.telegram.messenger.s2 s2Var2 = new org.telegram.messenger.s2(((org.telegram.messenger.ur) arrayList.get(i11)).a, 3);
            arrayList2.add(s2Var2);
            i11++;
            s2Var = s2Var2;
        }
        d60Var.e0.h(d60Var.d0, d60Var.g0);
        Bundle bundle = new Bundle();
        bundle.putInt(TeXSymbolParser.TYPE_ATTR, d60Var.d0);
        z50 z50Var = new z50(bundle, ywVar2);
        z50Var.d = d60Var.g0;
        z50Var.Z();
        d60Var.h0.presentFragment(z50Var);
        org.telegram.messenger.g0.i3(new g50(2, z50Var, s2Var), 150L);
        return true;
    }

    @Override // org.telegram.messenger.kc
    public /* synthetic */ void A(ImageReceiver imageReceiver) {
    }

    @Override // org.telegram.messenger.kc
    public /* synthetic */ void O(int i7, Drawable drawable) {
    }

    private final /* synthetic */ void a(View view, float f10, float f11) {
    }

    private final /* synthetic */ void d(View view, float f10, float f11) {
    }

    private final /* synthetic */ void e(View view, float f10, float f11) {
    }

    private final /* synthetic */ void g(View view, float f10, float f11) {
    }
}
