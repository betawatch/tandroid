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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class zs implements org.telegram.ui.Components.rj0, org.telegram.ui.ActionBar.q1, vw, org.telegram.ui.Components.kt0, org.telegram.ui.Components.sj0, org.telegram.messenger.jc, OnCompleteListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zs(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.ui.vw
    public /* synthetic */ boolean F() {
        return false;
    }

    @Override // org.telegram.ui.vw
    public /* synthetic */ boolean O(bx bxVar) {
        return false;
    }

    @Override // org.telegram.ui.Components.rj0
    public /* synthetic */ boolean U0(View view) {
        switch (this.a) {
            case 0:
                break;
            case 4:
                break;
            case 6:
                break;
        }
        return false;
    }

    @Override // org.telegram.ui.Components.sj0
    public boolean b(int i7, View view) {
        pa0 pa0Var = (pa0) this.b;
        Context context = (Context) this.c;
        if (pa0Var.N0 == 2) {
            Object I = pa0Var.Q.I(i7);
            if (I instanceof la0) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(context, null);
                org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(0, pa0Var.getParentActivity(), pa0Var.getResourceProvider(), true, true);
                y0Var.setMinimumWidth(org.telegram.messenger.g0.L(200.0f));
                y0Var.j(org.telegram.messenger.gd.N0(2131750456, null), R.drawable.filled_directions, null);
                y0Var.setOnClickListener(new org.telegram.ui.Components.p31(25, pa0Var, (la0) I));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(y0Var);
                ka0 ka0Var = new ka0(pa0Var, actionBarPopupWindow$ActionBarPopupWindowLayout);
                pa0Var.P0 = ka0Var;
                ka0Var.setOutsideTouchable(true);
                pa0Var.P0.setClippingEnabled(true);
                pa0Var.P0.setInputMethodMode(2);
                pa0Var.P0.setSoftInputMode(0);
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                pa0Var.P0.showAtLocation(view, 48, 0, iArr[1] - org.telegram.messenger.g0.L(52.0f));
                pa0Var.P0.b();
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.kt0
    public void c(org.telegram.messenger.pd pdVar) {
        LaunchActivity launchActivity = (LaunchActivity) this.b;
        int[] iArr = (int[]) this.c;
        String str = LaunchActivity.C1;
        int i7 = pdVar.h.K1;
        iArr[0] = i7;
        launchActivity.O0(i7);
        pa0 pa0Var = new pa0(2);
        pa0Var.G0(pdVar.h);
        pa0Var.M0 = new ai.z(iArr, org.telegram.messenger.fj.B0(pdVar.h.k), 10);
        launchActivity.t0(pa0Var);
    }

    @Override // org.telegram.ui.Components.rj0
    public /* synthetic */ void f0(View view, float f10, float f11) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Components.rj0
    public void g(float f10, float f11, int i7, View view) {
        switch (this.a) {
            case 0:
                DataSettingsActivity.Z((DataSettingsActivity) this.b, (Context) this.c, view, i7, f10);
                break;
            case 4:
                bx.d0((bx) this.b, (ax) this.c, view, i7);
                break;
            case 6:
                FiltersSetupActivity.Z((FiltersSetupActivity) this.b, (Context) this.c, view, i7);
                break;
            default:
                NotificationsCustomSettingsActivity.Z((NotificationsCustomSettingsActivity) this.b, (Context) this.c, view, i7, f10, f11);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        ConferenceCall conferenceCall;
        int i10;
        int i11 = this.a;
        org.telegram.ui.ActionBar.t1 t1Var2 = null;
        int i12 = 3;
        int i13 = 1;
        int i14 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i11) {
            case 1:
                du.Z((du) obj2, (TLRPC.User) obj);
                break;
            case 2:
            case 4:
            case 6:
            case 11:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 24:
            default:
                fk0 fk0Var = (fk0) obj2;
                boolean[] zArr = (boolean[]) obj;
                if (!fk0Var.w0) {
                    fk0Var.t1.clear();
                }
                fk0Var.u1.clear();
                kj0 kj0Var = (kj0) fk0Var.C1;
                kj0Var.d.n1(fk0Var.F, fk0Var.G, fk0Var.H, zArr[0], null, null, kj0Var.b);
                fk0Var.finishFragment();
                break;
            case 3:
                org.telegram.messenger.ri mediaDataController = ((bx) obj2).getMediaDataController();
                long j3 = ((TLRPC.User) obj).id;
                for (int i15 = 0; i15 < mediaDataController.m1.size(); i15++) {
                    if (((TLRPC.TL_topPeer) mediaDataController.m1.get(i15)).peer.user_id == j3) {
                        mediaDataController.m1.remove(i15);
                        TLRPC.TL_contacts_resetTopPeerRating tL_contacts_resetTopPeerRating = new TLRPC.TL_contacts_resetTopPeerRating();
                        tL_contacts_resetTopPeerRating.category = new TLRPC.TL_topPeerCategoryBotsApp();
                        tL_contacts_resetTopPeerRating.peer = mediaDataController.getMessagesController().l1(j3);
                        mediaDataController.getConnectionsManager().sendRequest(tL_contacts_resetTopPeerRating, new fi.l5(11));
                        mediaDataController.getMessagesStorage().a.c(new di.c9(mediaDataController, j3, 2, 4));
                        mediaDataController.getNotificationCenter().k(84, new Object[0]);
                        break;
                    }
                }
                break;
            case 5:
                org.telegram.messenger.ro roVar = (org.telegram.messenger.ro) obj;
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.id = roVar.a;
                bx bxVar = ((sw) obj2).b;
                bxVar.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, null);
                bxVar.getMessagesController().p4(roVar);
                org.telegram.messenger.tr messagesStorage = bxVar.getMessagesStorage();
                messagesStorage.a.c(new org.telegram.messenger.rq(i12, messagesStorage, roVar));
                break;
            case 7:
                i00 i00Var = (i00) obj2;
                org.telegram.messenger.ro roVar2 = (org.telegram.messenger.ro) obj;
                FiltersSetupActivity filtersSetupActivity = i00Var.e;
                if (filtersSetupActivity.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.t1 t1Var3 = new org.telegram.ui.ActionBar.t1(3, filtersSetupActivity.getParentActivity(), null);
                    t1Var3.j0 = false;
                    t1Var3.show();
                    t1Var2 = t1Var3;
                }
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter2 = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter2.id = roVar2.a;
                filtersSetupActivity.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter2, new z9(i00Var, t1Var2, roVar2, 10));
                break;
            case 8:
                e40 e40Var = (e40) obj2;
                TLObject tLObject = (TLObject) obj;
                org.telegram.messenger.c cVar = e40Var.o1;
                if (e40Var.s1()) {
                    VoIPService sharedInstance = VoIPService.getSharedInstance();
                    if (sharedInstance != null && (conferenceCall = sharedInstance.conference) != null && (tLObject instanceof TLRPC.User)) {
                        TLRPC.User user = (TLRPC.User) tLObject;
                        conferenceCall.kick(user.id);
                        org.telegram.messenger.t3 t3Var = e40Var.V2;
                        long j10 = user.id;
                        ArrayList arrayList = t3Var.o;
                        if (!arrayList.contains(Long.valueOf(j10))) {
                            arrayList.add(Long.valueOf(j10));
                            t3Var.z();
                            org.telegram.messenger.ks.f(t3Var.C.a).k(org.telegram.messenger.ks.w2, Long.valueOf(t3Var.c), Long.valueOf(t3Var.b.id), Boolean.FALSE);
                        }
                        e40Var.o1().k(0L, org.telegram.messenger.ks.n1, user, null, null, null);
                        break;
                    }
                } else if (tLObject instanceof TLRPC.User) {
                    TLRPC.User user2 = (TLRPC.User) tLObject;
                    org.telegram.messenger.mp.u1(cVar.a).f0(e40Var.m1(), user2);
                    e40Var.o1().k(0L, 32, user2, null, null, null);
                    break;
                } else {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    org.telegram.messenger.mp.u1(cVar.a).g0(e40Var.m1(), null, chat, false, false);
                    e40Var.o1().k(0L, 32, chat, null, null, null);
                    break;
                }
                break;
            case 9:
                y40 y40Var = (y40) obj2;
                y40Var.y.f((TLRPC.User) obj);
                if (y40Var.f.r.length() > 0) {
                    y40Var.f.r.setText((CharSequence) null);
                    break;
                }
                break;
            case 10:
                y40 y40Var2 = (y40) obj2;
                y40Var2.getClass();
                org.telegram.ui.Cells.d2 d2Var = ((org.telegram.ui.Cells.d2[]) obj)[0];
                if (d2Var != null && d2Var.b()) {
                    i14 = 100;
                }
                y40Var2.r0(i14);
                break;
            case 12:
                LanguageSelectActivity.c0((LanguageSelectActivity) obj2, (org.telegram.messenger.cd) obj);
                break;
            case 13:
                String str = LaunchActivity.C1;
                ((LaunchActivity) obj2).t0((de0) obj);
                break;
            case 14:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                String str2 = LaunchActivity.C1;
                org.telegram.messenger.gd.E0().d(((org.telegram.messenger.cd[]) obj)[0], true, false, launchActivity.P);
                launchActivity.y0(true);
                break;
            case 22:
                ((tb0) obj2).H.G1((TLRPC.TL_auth_authorization) ((TLObject) obj), false);
                break;
            case 23:
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
            case 25:
                gd0.n((gd0) obj2, (Context) obj);
                break;
            case 26:
                ce0 ce0Var = (ce0) obj2;
                ((boolean[]) obj)[0] = true;
                if (ce0Var.o()) {
                    d3.b bVar = new d3.b(i13);
                    CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
                    ce0Var.b0 = cancellationTokenSource;
                    Context context = ce0Var.getContext();
                    i10 = ((org.telegram.ui.ActionBar.g2) ce0Var.h0).currentAccount;
                    CancellationToken token = cancellationTokenSource.getToken();
                    bd0 bd0Var = new bd0(i12, ce0Var, cancellationTokenSource);
                    TaskCompletionSource taskCompletionSource = new TaskCompletionSource(token);
                    kotlin.jvm.internal.j.e(context, "context");
                    androidx.emoji2.text.n nVar = new androidx.emoji2.text.n(context, 2);
                    Runnable[] runnableArr = new Runnable[1];
                    int i16 = 4;
                    token.onCanceledRequested(new org.telegram.messenger.j1(runnableArr, i16));
                    TLRPC.TL_auth_initFirebasePnvLogin tL_auth_initFirebasePnvLogin = new TLRPC.TL_auth_initFirebasePnvLogin();
                    tL_auth_initFirebasePnvLogin.api_id = org.telegram.messenger.s2.d;
                    tL_auth_initFirebasePnvLogin.api_hash = org.telegram.messenger.s2.e;
                    ArrayList<Long> arrayList2 = new ArrayList<>();
                    int i17 = 0;
                    while (i17 < i16) {
                        org.telegram.messenger.i10 i18 = org.telegram.messenger.i10.i(i17);
                        if (i18.p()) {
                            arrayList2.add(Long.valueOf(i18.e()));
                        }
                        i17++;
                        i16 = 4;
                    }
                    tL_auth_initFirebasePnvLogin.except_ids = arrayList2;
                    runnableArr[0] = new org.telegram.messenger.e9(i10, ConnectionsManager.getInstance(i10).sendRequestTyped(tL_auth_initFirebasePnvLogin, new d3.b(i13), new bi.p4(token, taskCompletionSource, runnableArr, nVar, context, bd0Var, i10), 8), i14);
                    if (token.isCancellationRequested()) {
                        runnableArr[0].run();
                    }
                    taskCompletionSource.getTask().addOnCompleteListener(bVar, new zs(27, ce0Var, cancellationTokenSource)).addOnSuccessListener(bVar, new wd0(ce0Var)).addOnFailureListener(bVar, new wd0(ce0Var));
                    break;
                }
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        switch (this.a) {
            case 21:
                ob0 ob0Var = (ob0) this.b;
                b9.j0 j0Var = (b9.j0) this.c;
                de0 de0Var = ob0Var.a0;
                if (de0Var.getParentActivity() != null) {
                    de0Var.getParentActivity().startActivityForResult(j0Var.f(), org.telegram.messenger.ks.e3);
                    break;
                }
                break;
            case 24:
                rc0 rc0Var = (rc0) this.b;
                b9.j0 j0Var2 = (b9.j0) this.c;
                de0 de0Var2 = rc0Var.F;
                if (de0Var2.getParentActivity() != null && !de0Var2.getParentActivity().isFinishing()) {
                    de0Var2.getParentActivity().startActivityForResult(j0Var2.f(), org.telegram.messenger.ks.e3);
                    break;
                }
                break;
            default:
                ce0 ce0Var = (ce0) this.b;
                CancellationTokenSource cancellationTokenSource = (CancellationTokenSource) this.c;
                org.telegram.ui.ActionBar.t1 t1Var = ce0Var.c0;
                if (t1Var != null) {
                    t1Var.dismiss();
                    ce0Var.c0 = null;
                }
                if (ce0Var.b0 == cancellationTokenSource) {
                    ce0Var.b0 = null;
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.messenger.jc
    public void y(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        Bitmap n02;
        pa0 pa0Var = (pa0) this.b;
        la0 la0Var = (la0) this.c;
        if (!z10 || z11 || la0Var.e == null || (n02 = pa0Var.n0(la0Var)) == null) {
            return;
        }
        la0Var.e.a.a(c8.s9.a(n02));
    }

    @Override // org.telegram.ui.vw
    public boolean z(bx bxVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i7, int i10, w91 w91Var) {
        f60 f60Var = (f60) this.b;
        bx bxVar2 = (bx) this.c;
        org.telegram.messenger.t2 t2Var = null;
        int i11 = 0;
        while (i11 < arrayList.size()) {
            ArrayList arrayList2 = f60Var.g0;
            org.telegram.messenger.t2 t2Var2 = new org.telegram.messenger.t2(((org.telegram.messenger.sr) arrayList.get(i11)).a, 3);
            arrayList2.add(t2Var2);
            i11++;
            t2Var = t2Var2;
        }
        f60Var.e0.h(f60Var.d0, f60Var.g0);
        Bundle bundle = new Bundle();
        bundle.putInt(TeXSymbolParser.TYPE_ATTR, f60Var.d0);
        b60 b60Var = new b60(bundle, bxVar2);
        b60Var.d = f60Var.g0;
        b60Var.Z();
        f60Var.h0.presentFragment(b60Var);
        org.telegram.messenger.g0.h3(new i50(3, b60Var, t2Var), 150L);
        return true;
    }

    @Override // org.telegram.messenger.jc
    public /* synthetic */ void r(ImageReceiver imageReceiver) {
    }

    @Override // org.telegram.messenger.jc
    public /* synthetic */ void J(int i7, Drawable drawable) {
    }

    private final /* synthetic */ void a(View view, float f10, float f11) {
    }

    private final /* synthetic */ void d(View view, float f10, float f11) {
    }

    private final /* synthetic */ void e(View view, float f10, float f11) {
    }

    private final /* synthetic */ void f(View view, float f10, float f11) {
    }
}
