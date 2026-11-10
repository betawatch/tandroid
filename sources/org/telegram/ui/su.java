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
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class su implements org.telegram.ui.ActionBar.r1, org.telegram.ui.Components.cj0, tw, org.telegram.ui.Components.at0, org.telegram.ui.Components.dj0, org.telegram.messenger.lc, OnCompleteListener, ss {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ su(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.ui.tw
    public /* synthetic */ boolean G() {
        return false;
    }

    @Override // org.telegram.ui.tw
    public /* synthetic */ boolean N(zw zwVar) {
        return false;
    }

    @Override // org.telegram.ui.ss
    public void b(ps psVar) {
        ek0 ek0Var = (ek0) this.b;
        int intValue = ((Integer) ((View) this.c).getTag()).intValue();
        EditTextBoldCursor editTextBoldCursor = ek0Var.Y[intValue];
        if (intValue == 5) {
            ek0Var.s = psVar.d;
        } else {
            ek0Var.w = psVar.d;
        }
        editTextBoldCursor.setText(psVar.a);
    }

    @Override // org.telegram.ui.Components.dj0
    public boolean c(int i7, View view) {
        sa0 sa0Var = (sa0) this.b;
        Context context = (Context) this.c;
        if (sa0Var.H0 == 2) {
            Object I = sa0Var.P.I(i7);
            if (I instanceof oa0) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(context, null);
                org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(0, sa0Var.getParentActivity(), sa0Var.getResourceProvider(), true, true);
                z0Var.setMinimumWidth(org.telegram.messenger.g0.L(200.0f));
                z0Var.j(org.telegram.messenger.id.M0(2131750473, null), R.drawable.filled_directions, null);
                z0Var.setOnClickListener(new org.telegram.ui.Components.u41(23, sa0Var, (oa0) I));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(z0Var);
                na0 na0Var = new na0(sa0Var, actionBarPopupWindow$ActionBarPopupWindowLayout);
                sa0Var.J0 = na0Var;
                na0Var.setOutsideTouchable(true);
                sa0Var.J0.setClippingEnabled(true);
                sa0Var.J0.setInputMethodMode(2);
                sa0Var.J0.setSoftInputMode(0);
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                sa0Var.J0.showAtLocation(view, 48, 0, iArr[1] - org.telegram.messenger.g0.L(52.0f));
                sa0Var.J0.b();
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.at0
    public void d(org.telegram.messenger.rd rdVar) {
        LaunchActivity launchActivity = (LaunchActivity) this.b;
        int[] iArr = (int[]) this.c;
        String str = LaunchActivity.B1;
        int i7 = rdVar.h.I1;
        iArr[0] = i7;
        launchActivity.O0(i7);
        sa0 sa0Var = new sa0(2);
        sa0Var.G0(rdVar.h);
        sa0Var.G0 = new di.c1(iArr, org.telegram.messenger.ij.B0(rdVar.h.k), 9);
        launchActivity.t0(sa0Var);
    }

    @Override // org.telegram.ui.Components.cj0
    public void f(float f10, float f11, int i7, View view) {
        switch (this.a) {
            case 1:
                zw.g0((zw) this.b, (yw) this.c, view, i7);
                break;
            case 2:
            default:
                NotificationsCustomSettingsActivity.Z((NotificationsCustomSettingsActivity) this.b, (Context) this.c, view, i7, f10, f11);
                break;
            case 3:
                FiltersSetupActivity.Z((FiltersSetupActivity) this.b, (Context) this.c, view, i7);
                break;
        }
    }

    @Override // org.telegram.messenger.lc
    public void f0(ImageReceiver imageReceiver, boolean z9, boolean z10, boolean z11) {
        Bitmap n02;
        sa0 sa0Var = (sa0) this.b;
        oa0 oa0Var = (oa0) this.c;
        if (!z9 || z10 || oa0Var.e == null || (n02 = sa0Var.n0(oa0Var)) == null) {
            return;
        }
        oa0Var.e.a.a(c8.q9.a(n02));
    }

    @Override // org.telegram.ui.Components.cj0
    public /* synthetic */ boolean f1(View view) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        ConferenceCall conferenceCall;
        int i10;
        int i11 = this.a;
        int i12 = 7;
        org.telegram.ui.ActionBar.u1 u1Var2 = null;
        int i13 = 1;
        int i14 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i11) {
            case 0:
                org.telegram.messenger.ui mediaDataController = ((zw) obj2).getMediaDataController();
                long j3 = ((TLRPC.User) obj).id;
                for (int i15 = 0; i15 < mediaDataController.l1.size(); i15++) {
                    if (((TLRPC.TL_topPeer) mediaDataController.l1.get(i15)).peer.user_id == j3) {
                        mediaDataController.l1.remove(i15);
                        TLRPC.TL_contacts_resetTopPeerRating tL_contacts_resetTopPeerRating = new TLRPC.TL_contacts_resetTopPeerRating();
                        tL_contacts_resetTopPeerRating.category = new TLRPC.TL_topPeerCategoryBotsApp();
                        tL_contacts_resetTopPeerRating.peer = mediaDataController.getMessagesController().j1(j3);
                        mediaDataController.getConnectionsManager().sendRequest(tL_contacts_resetTopPeerRating, new di.v5(11));
                        mediaDataController.getMessagesStorage().a.c(new bi.ia(mediaDataController, j3, 2, 4));
                        mediaDataController.getNotificationCenter().k(84, new Object[0]);
                        break;
                    }
                }
                break;
            case 1:
            case 3:
            case 8:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 21:
            case 24:
            case 25:
            default:
                ek0.Z((ek0) obj2, (TLRPC.TL_auth_passwordRecovery) obj);
                break;
            case 2:
                org.telegram.messenger.vo voVar = (org.telegram.messenger.vo) obj;
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.id = voVar.a;
                zw zwVar = ((qw) obj2).b;
                zwVar.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, null);
                zwVar.getMessagesController().h4(voVar);
                org.telegram.messenger.yr messagesStorage = zwVar.getMessagesStorage();
                messagesStorage.a.c(new org.telegram.messenger.zq(i14, messagesStorage, voVar));
                break;
            case 4:
                h00 h00Var = (h00) obj2;
                org.telegram.messenger.vo voVar2 = (org.telegram.messenger.vo) obj;
                FiltersSetupActivity filtersSetupActivity = h00Var.e;
                if (filtersSetupActivity.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.u1 u1Var3 = new org.telegram.ui.ActionBar.u1(3, filtersSetupActivity.getParentActivity(), null);
                    u1Var3.i0 = false;
                    u1Var3.show();
                    u1Var2 = u1Var3;
                }
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter2 = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter2.id = voVar2.a;
                filtersSetupActivity.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter2, new z9(h00Var, u1Var2, voVar2, 10));
                break;
            case 5:
                f40 f40Var = (f40) obj2;
                TLObject tLObject = (TLObject) obj;
                org.telegram.messenger.c cVar = f40Var.n1;
                if (f40Var.r1()) {
                    VoIPService sharedInstance = VoIPService.getSharedInstance();
                    if (sharedInstance != null && (conferenceCall = sharedInstance.conference) != null && (tLObject instanceof TLRPC.User)) {
                        TLRPC.User user = (TLRPC.User) tLObject;
                        conferenceCall.kick(user.id);
                        org.telegram.messenger.r3 r3Var = f40Var.U2;
                        long j10 = user.id;
                        ArrayList arrayList = r3Var.o;
                        if (!arrayList.contains(Long.valueOf(j10))) {
                            arrayList.add(Long.valueOf(j10));
                            r3Var.z();
                            org.telegram.messenger.qs.f(r3Var.C.a).k(org.telegram.messenger.qs.w2, Long.valueOf(r3Var.c), Long.valueOf(r3Var.b.id), Boolean.FALSE);
                        }
                        f40Var.n1().k(0L, org.telegram.messenger.qs.n1, user, null, null, null);
                        break;
                    }
                } else if (tLObject instanceof TLRPC.User) {
                    TLRPC.User user2 = (TLRPC.User) tLObject;
                    org.telegram.messenger.qp.s1(cVar.a).f0(f40Var.l1(), user2);
                    f40Var.n1().k(0L, 32, user2, null, null, null);
                    break;
                } else {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    org.telegram.messenger.qp.s1(cVar.a).g0(f40Var.l1(), null, chat, false, false);
                    f40Var.n1().k(0L, 32, chat, null, null, null);
                    break;
                }
                break;
            case 6:
                z40 z40Var = (z40) obj2;
                z40Var.y.e((TLRPC.User) obj);
                if (z40Var.f.r.length() > 0) {
                    z40Var.f.r.setText((CharSequence) null);
                    break;
                }
                break;
            case 7:
                z40 z40Var2 = (z40) obj2;
                z40Var2.getClass();
                org.telegram.ui.Cells.c2 c2Var = ((org.telegram.ui.Cells.c2[]) obj)[0];
                if (c2Var != null && c2Var.b()) {
                    i14 = 100;
                }
                z40Var2.r0(i14);
                break;
            case 9:
                LanguageSelectActivity.c0((LanguageSelectActivity) obj2, (org.telegram.messenger.fd) obj);
                break;
            case 10:
                String str = LaunchActivity.B1;
                ((LaunchActivity) obj2).t0((fe0) obj);
                break;
            case 11:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                String str2 = LaunchActivity.B1;
                org.telegram.messenger.id.E0().d(((org.telegram.messenger.fd[]) obj)[0], true, false, launchActivity.O);
                launchActivity.y0(true);
                break;
            case 19:
                ((xb0) obj2).G.G1((TLRPC.TL_auth_authorization) ((TLObject) obj), false);
                break;
            case 20:
                ac0 ac0Var = (ac0) obj2;
                ac0Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putString("email_unconfirmed_pattern", ((TLRPC.TL_auth_passwordRecovery) obj).email_pattern);
                bundle.putString("password", ac0Var.r);
                bundle.putString("requestPhone", ac0Var.s);
                bundle.putString("phoneHash", ac0Var.w);
                bundle.putString("phoneCode", ac0Var.x);
                ac0Var.D.M1(7, true, bundle, false);
                break;
            case 22:
                jd0.n((jd0) obj2, (Context) obj);
                break;
            case 23:
                ee0 ee0Var = (ee0) obj2;
                ((boolean[]) obj)[0] = true;
                if (ee0Var.o()) {
                    d3.b bVar = new d3.b(i13);
                    CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
                    ee0Var.a0 = cancellationTokenSource;
                    Context context = ee0Var.getContext();
                    i10 = ((org.telegram.ui.ActionBar.f2) ee0Var.g0).currentAccount;
                    CancellationToken token = cancellationTokenSource.getToken();
                    tc0 tc0Var = new tc0(i12, ee0Var, cancellationTokenSource);
                    TaskCompletionSource taskCompletionSource = new TaskCompletionSource(token);
                    kotlin.jvm.internal.j.e(context, "context");
                    k0.b bVar2 = new k0.b(context);
                    Runnable[] runnableArr = new Runnable[1];
                    int i16 = 4;
                    token.onCanceledRequested(new org.telegram.messenger.j1(runnableArr, i16));
                    TLRPC.TL_auth_initFirebasePnvLogin tL_auth_initFirebasePnvLogin = new TLRPC.TL_auth_initFirebasePnvLogin();
                    tL_auth_initFirebasePnvLogin.api_id = org.telegram.messenger.r2.d;
                    tL_auth_initFirebasePnvLogin.api_hash = org.telegram.messenger.r2.e;
                    ArrayList<Long> arrayList2 = new ArrayList<>();
                    int i17 = 0;
                    while (i17 < i16) {
                        org.telegram.messenger.p10 i18 = org.telegram.messenger.p10.i(i17);
                        if (i18.p()) {
                            arrayList2.add(Long.valueOf(i18.e()));
                        }
                        i17++;
                        i16 = 4;
                    }
                    tL_auth_initFirebasePnvLogin.except_ids = arrayList2;
                    runnableArr[0] = new org.telegram.messenger.g9(i10, ConnectionsManager.getInstance(i10).sendRequestTyped(tL_auth_initFirebasePnvLogin, new d3.b(i13), new org.telegram.messenger.f9(token, taskCompletionSource, runnableArr, bVar2, context, tc0Var, i10), 8), i14);
                    if (token.isCancellationRequested()) {
                        runnableArr[0].run();
                    }
                    taskCompletionSource.getTask().addOnCompleteListener(bVar, new su(24, ee0Var, cancellationTokenSource)).addOnSuccessListener(bVar, new zd0(ee0Var)).addOnFailureListener(bVar, new zd0(ee0Var));
                    break;
                }
                break;
            case 26:
                ek0 ek0Var = (ek0) obj2;
                boolean[] zArr = (boolean[]) obj;
                if (!ek0Var.v0) {
                    ek0Var.s1.clear();
                }
                ek0Var.t1.clear();
                jj0 jj0Var = (jj0) ek0Var.B1;
                jj0Var.d.n1(ek0Var.E, ek0Var.F, ek0Var.G, zArr[0], null, null, jj0Var.b);
                ek0Var.finishFragment();
                break;
            case 27:
                int[] iArr = ((ek0) obj2).y;
                iArr[2] = 0;
                iArr[1] = 0;
                iArr[0] = 0;
                ((EditTextBoldCursor) obj).setText(org.telegram.messenger.id.M0(2131747494, null));
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        switch (this.a) {
            case 18:
                rb0 rb0Var = (rb0) this.b;
                b9.j0 j0Var = (b9.j0) this.c;
                fe0 fe0Var = rb0Var.W;
                if (fe0Var.getParentActivity() != null) {
                    fe0Var.getParentActivity().startActivityForResult(j0Var.f(), org.telegram.messenger.qs.e3);
                    break;
                }
                break;
            case 21:
                wc0 wc0Var = (wc0) this.b;
                b9.j0 j0Var2 = (b9.j0) this.c;
                fe0 fe0Var2 = wc0Var.E;
                if (fe0Var2.getParentActivity() != null && !fe0Var2.getParentActivity().isFinishing()) {
                    fe0Var2.getParentActivity().startActivityForResult(j0Var2.f(), org.telegram.messenger.qs.e3);
                    break;
                }
                break;
            default:
                ee0 ee0Var = (ee0) this.b;
                CancellationTokenSource cancellationTokenSource = (CancellationTokenSource) this.c;
                org.telegram.ui.ActionBar.u1 u1Var = ee0Var.b0;
                if (u1Var != null) {
                    u1Var.dismiss();
                    ee0Var.b0 = null;
                }
                if (ee0Var.a0 == cancellationTokenSource) {
                    ee0Var.a0 = null;
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.cj0
    public /* synthetic */ void r0(View view, float f10, float f11) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.tw
    public boolean y(zw zwVar, ArrayList arrayList, CharSequence charSequence, boolean z9, boolean z10, int i7, int i10, z91 z91Var) {
        h60 h60Var = (h60) this.c;
        zw zwVar2 = (zw) this.b;
        org.telegram.messenger.s2 s2Var = null;
        int i11 = 0;
        while (i11 < arrayList.size()) {
            ArrayList arrayList2 = h60Var.f0;
            org.telegram.messenger.s2 s2Var2 = new org.telegram.messenger.s2(((org.telegram.messenger.xr) arrayList.get(i11)).a, 3);
            arrayList2.add(s2Var2);
            i11++;
            s2Var = s2Var2;
        }
        h60Var.d0.h(h60Var.c0, h60Var.f0);
        Bundle bundle = new Bundle();
        bundle.putInt(TeXSymbolParser.TYPE_ATTR, h60Var.c0);
        d60 d60Var = new d60(bundle, zwVar2);
        d60Var.d = h60Var.f0;
        d60Var.Z();
        h60Var.g0.presentFragment(d60Var);
        org.telegram.messenger.g0.i3(new f10(7, d60Var, s2Var), 150L);
        return true;
    }

    public /* synthetic */ su(h60 h60Var, zw zwVar) {
        this.a = 8;
        this.c = h60Var;
        this.b = zwVar;
    }

    @Override // org.telegram.messenger.lc
    public /* synthetic */ void O(ImageReceiver imageReceiver) {
    }

    @Override // org.telegram.messenger.lc
    public /* synthetic */ void t0(int i7, Drawable drawable) {
    }

    private final /* synthetic */ void a(View view, float f10, float f11) {
    }

    private final /* synthetic */ void e(View view, float f10, float f11) {
    }

    private final /* synthetic */ void h(View view, float f10, float f11) {
    }
}
