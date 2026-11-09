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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ru implements org.telegram.ui.ActionBar.r1, org.telegram.ui.Components.dj0, sw, org.telegram.ui.Components.bt0, org.telegram.ui.Components.ej0, org.telegram.messenger.lc, OnCompleteListener, rs {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ru(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.ui.sw
    public /* synthetic */ boolean G() {
        return false;
    }

    @Override // org.telegram.ui.sw
    public /* synthetic */ boolean N(yw ywVar) {
        return false;
    }

    @Override // org.telegram.ui.rs
    public void b(os osVar) {
        dk0 dk0Var = (dk0) this.b;
        int intValue = ((Integer) ((View) this.c).getTag()).intValue();
        EditTextBoldCursor editTextBoldCursor = dk0Var.Y[intValue];
        if (intValue == 5) {
            dk0Var.s = osVar.d;
        } else {
            dk0Var.w = osVar.d;
        }
        editTextBoldCursor.setText(osVar.a);
    }

    @Override // org.telegram.ui.Components.ej0
    public boolean c(int i7, View view) {
        ra0 ra0Var = (ra0) this.b;
        Context context = (Context) this.c;
        if (ra0Var.H0 == 2) {
            Object I = ra0Var.P.I(i7);
            if (I instanceof na0) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(context, null);
                org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(0, ra0Var.getParentActivity(), ra0Var.getResourceProvider(), true, true);
                z0Var.setMinimumWidth(org.telegram.messenger.g0.L(200.0f));
                z0Var.j(org.telegram.messenger.id.M0(2131750473, null), R.drawable.filled_directions, null);
                z0Var.setOnClickListener(new org.telegram.ui.Components.u41(23, ra0Var, (na0) I));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(z0Var);
                ma0 ma0Var = new ma0(ra0Var, actionBarPopupWindow$ActionBarPopupWindowLayout);
                ra0Var.J0 = ma0Var;
                ma0Var.setOutsideTouchable(true);
                ra0Var.J0.setClippingEnabled(true);
                ra0Var.J0.setInputMethodMode(2);
                ra0Var.J0.setSoftInputMode(0);
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                ra0Var.J0.showAtLocation(view, 48, 0, iArr[1] - org.telegram.messenger.g0.L(52.0f));
                ra0Var.J0.b();
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.bt0
    public void d(org.telegram.messenger.rd rdVar) {
        LaunchActivity launchActivity = (LaunchActivity) this.b;
        int[] iArr = (int[]) this.c;
        String str = LaunchActivity.B1;
        int i7 = rdVar.h.I1;
        iArr[0] = i7;
        launchActivity.O0(i7);
        ra0 ra0Var = new ra0(2);
        ra0Var.G0(rdVar.h);
        ra0Var.G0 = new di.c1(iArr, org.telegram.messenger.ij.B0(rdVar.h.k), 9);
        launchActivity.t0(ra0Var);
    }

    @Override // org.telegram.ui.Components.dj0
    public void f(float f10, float f11, int i7, View view) {
        switch (this.a) {
            case 1:
                yw.g0((yw) this.b, (xw) this.c, view, i7);
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
        ra0 ra0Var = (ra0) this.b;
        na0 na0Var = (na0) this.c;
        if (!z9 || z10 || na0Var.e == null || (n02 = ra0Var.n0(na0Var)) == null) {
            return;
        }
        na0Var.e.a.a(c8.q9.a(n02));
    }

    @Override // org.telegram.ui.Components.dj0
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
        org.telegram.ui.ActionBar.u1 u1Var2 = null;
        int i12 = 1;
        int i13 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i11) {
            case 0:
                org.telegram.messenger.ui mediaDataController = ((yw) obj2).getMediaDataController();
                long j3 = ((TLRPC.User) obj).id;
                for (int i14 = 0; i14 < mediaDataController.l1.size(); i14++) {
                    if (((TLRPC.TL_topPeer) mediaDataController.l1.get(i14)).peer.user_id == j3) {
                        mediaDataController.l1.remove(i14);
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
                dk0.Z((dk0) obj2, (TLRPC.TL_auth_passwordRecovery) obj);
                break;
            case 2:
                org.telegram.messenger.vo voVar = (org.telegram.messenger.vo) obj;
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.id = voVar.a;
                yw ywVar = ((pw) obj2).b;
                ywVar.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, null);
                ywVar.getMessagesController().h4(voVar);
                org.telegram.messenger.yr messagesStorage = ywVar.getMessagesStorage();
                messagesStorage.a.c(new org.telegram.messenger.zq(i13, messagesStorage, voVar));
                break;
            case 4:
                g00 g00Var = (g00) obj2;
                org.telegram.messenger.vo voVar2 = (org.telegram.messenger.vo) obj;
                FiltersSetupActivity filtersSetupActivity = g00Var.e;
                if (filtersSetupActivity.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.u1 u1Var3 = new org.telegram.ui.ActionBar.u1(3, filtersSetupActivity.getParentActivity(), null);
                    u1Var3.i0 = false;
                    u1Var3.show();
                    u1Var2 = u1Var3;
                }
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter2 = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter2.id = voVar2.a;
                filtersSetupActivity.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter2, new z9(g00Var, u1Var2, voVar2, 10));
                break;
            case 5:
                e40 e40Var = (e40) obj2;
                TLObject tLObject = (TLObject) obj;
                org.telegram.messenger.c cVar = e40Var.k1;
                if (e40Var.r1()) {
                    VoIPService sharedInstance = VoIPService.getSharedInstance();
                    if (sharedInstance != null && (conferenceCall = sharedInstance.conference) != null && (tLObject instanceof TLRPC.User)) {
                        TLRPC.User user = (TLRPC.User) tLObject;
                        conferenceCall.kick(user.id);
                        org.telegram.messenger.r3 r3Var = e40Var.R2;
                        long j10 = user.id;
                        ArrayList arrayList = r3Var.o;
                        if (!arrayList.contains(Long.valueOf(j10))) {
                            arrayList.add(Long.valueOf(j10));
                            r3Var.z();
                            org.telegram.messenger.qs.f(r3Var.C.a).k(org.telegram.messenger.qs.w2, Long.valueOf(r3Var.c), Long.valueOf(r3Var.b.id), Boolean.FALSE);
                        }
                        e40Var.n1().k(0L, org.telegram.messenger.qs.n1, user, null, null, null);
                        break;
                    }
                } else if (tLObject instanceof TLRPC.User) {
                    TLRPC.User user2 = (TLRPC.User) tLObject;
                    org.telegram.messenger.qp.s1(cVar.a).f0(e40Var.l1(), user2);
                    e40Var.n1().k(0L, 32, user2, null, null, null);
                    break;
                } else {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    org.telegram.messenger.qp.s1(cVar.a).g0(e40Var.l1(), null, chat, false, false);
                    e40Var.n1().k(0L, 32, chat, null, null, null);
                    break;
                }
                break;
            case 6:
                y40 y40Var = (y40) obj2;
                y40Var.y.e((TLRPC.User) obj);
                if (y40Var.f.r.length() > 0) {
                    y40Var.f.r.setText((CharSequence) null);
                    break;
                }
                break;
            case 7:
                y40 y40Var2 = (y40) obj2;
                y40Var2.getClass();
                org.telegram.ui.Cells.c2 c2Var = ((org.telegram.ui.Cells.c2[]) obj)[0];
                if (c2Var != null && c2Var.b()) {
                    i13 = 100;
                }
                y40Var2.r0(i13);
                break;
            case 9:
                LanguageSelectActivity.c0((LanguageSelectActivity) obj2, (org.telegram.messenger.fd) obj);
                break;
            case 10:
                String str = LaunchActivity.B1;
                ((LaunchActivity) obj2).t0((ee0) obj);
                break;
            case 11:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                String str2 = LaunchActivity.B1;
                org.telegram.messenger.id.E0().d(((org.telegram.messenger.fd[]) obj)[0], true, false, launchActivity.O);
                launchActivity.y0(true);
                break;
            case 19:
                ((wb0) obj2).G.G1((TLRPC.TL_auth_authorization) ((TLObject) obj), false);
                break;
            case 20:
                zb0 zb0Var = (zb0) obj2;
                zb0Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putString("email_unconfirmed_pattern", ((TLRPC.TL_auth_passwordRecovery) obj).email_pattern);
                bundle.putString("password", zb0Var.r);
                bundle.putString("requestPhone", zb0Var.s);
                bundle.putString("phoneHash", zb0Var.w);
                bundle.putString("phoneCode", zb0Var.x);
                zb0Var.D.M1(7, true, bundle, false);
                break;
            case 22:
                id0.n((id0) obj2, (Context) obj);
                break;
            case 23:
                de0 de0Var = (de0) obj2;
                ((boolean[]) obj)[0] = true;
                if (de0Var.o()) {
                    d3.b bVar = new d3.b(i12);
                    CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
                    de0Var.a0 = cancellationTokenSource;
                    Context context = de0Var.getContext();
                    i10 = ((org.telegram.ui.ActionBar.f2) de0Var.g0).currentAccount;
                    CancellationToken token = cancellationTokenSource.getToken();
                    bd0 bd0Var = new bd0(6, de0Var, cancellationTokenSource);
                    TaskCompletionSource taskCompletionSource = new TaskCompletionSource(token);
                    kotlin.jvm.internal.j.e(context, "context");
                    k0.b bVar2 = new k0.b(context);
                    Runnable[] runnableArr = new Runnable[1];
                    int i15 = 4;
                    token.onCanceledRequested(new org.telegram.messenger.j1(runnableArr, i15));
                    TLRPC.TL_auth_initFirebasePnvLogin tL_auth_initFirebasePnvLogin = new TLRPC.TL_auth_initFirebasePnvLogin();
                    tL_auth_initFirebasePnvLogin.api_id = org.telegram.messenger.r2.d;
                    tL_auth_initFirebasePnvLogin.api_hash = org.telegram.messenger.r2.e;
                    ArrayList<Long> arrayList2 = new ArrayList<>();
                    int i16 = 0;
                    while (i16 < i15) {
                        org.telegram.messenger.p10 i17 = org.telegram.messenger.p10.i(i16);
                        if (i17.p()) {
                            arrayList2.add(Long.valueOf(i17.e()));
                        }
                        i16++;
                        i15 = 4;
                    }
                    tL_auth_initFirebasePnvLogin.except_ids = arrayList2;
                    runnableArr[0] = new org.telegram.messenger.g9(i10, ConnectionsManager.getInstance(i10).sendRequestTyped(tL_auth_initFirebasePnvLogin, new d3.b(i12), new org.telegram.messenger.f9(token, taskCompletionSource, runnableArr, bVar2, context, bd0Var, i10), 8), i13);
                    if (token.isCancellationRequested()) {
                        runnableArr[0].run();
                    }
                    taskCompletionSource.getTask().addOnCompleteListener(bVar, new ru(24, de0Var, cancellationTokenSource)).addOnSuccessListener(bVar, new yd0(de0Var)).addOnFailureListener(bVar, new yd0(de0Var));
                    break;
                }
                break;
            case 26:
                dk0 dk0Var = (dk0) obj2;
                boolean[] zArr = (boolean[]) obj;
                if (!dk0Var.v0) {
                    dk0Var.s1.clear();
                }
                dk0Var.t1.clear();
                ij0 ij0Var = (ij0) dk0Var.B1;
                ij0Var.d.n1(dk0Var.E, dk0Var.F, dk0Var.G, zArr[0], null, null, ij0Var.b);
                dk0Var.finishFragment();
                break;
            case 27:
                int[] iArr = ((dk0) obj2).y;
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
                qb0 qb0Var = (qb0) this.b;
                b9.j0 j0Var = (b9.j0) this.c;
                ee0 ee0Var = qb0Var.W;
                if (ee0Var.getParentActivity() != null) {
                    ee0Var.getParentActivity().startActivityForResult(j0Var.f(), org.telegram.messenger.qs.e3);
                    break;
                }
                break;
            case 21:
                uc0 uc0Var = (uc0) this.b;
                b9.j0 j0Var2 = (b9.j0) this.c;
                ee0 ee0Var2 = uc0Var.E;
                if (ee0Var2.getParentActivity() != null && !ee0Var2.getParentActivity().isFinishing()) {
                    ee0Var2.getParentActivity().startActivityForResult(j0Var2.f(), org.telegram.messenger.qs.e3);
                    break;
                }
                break;
            default:
                de0 de0Var = (de0) this.b;
                CancellationTokenSource cancellationTokenSource = (CancellationTokenSource) this.c;
                org.telegram.ui.ActionBar.u1 u1Var = de0Var.b0;
                if (u1Var != null) {
                    u1Var.dismiss();
                    de0Var.b0 = null;
                }
                if (de0Var.a0 == cancellationTokenSource) {
                    de0Var.a0 = null;
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.dj0
    public /* synthetic */ void r0(View view, float f10, float f11) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.sw
    public boolean y(yw ywVar, ArrayList arrayList, CharSequence charSequence, boolean z9, boolean z10, int i7, int i10, y91 y91Var) {
        g60 g60Var = (g60) this.c;
        yw ywVar2 = (yw) this.b;
        org.telegram.messenger.s2 s2Var = null;
        int i11 = 0;
        while (i11 < arrayList.size()) {
            ArrayList arrayList2 = g60Var.f0;
            org.telegram.messenger.s2 s2Var2 = new org.telegram.messenger.s2(((org.telegram.messenger.xr) arrayList.get(i11)).a, 3);
            arrayList2.add(s2Var2);
            i11++;
            s2Var = s2Var2;
        }
        g60Var.d0.h(g60Var.c0, g60Var.f0);
        Bundle bundle = new Bundle();
        bundle.putInt(TeXSymbolParser.TYPE_ATTR, g60Var.c0);
        c60 c60Var = new c60(bundle, ywVar2);
        c60Var.d = g60Var.f0;
        c60Var.Z();
        g60Var.g0.presentFragment(c60Var);
        org.telegram.messenger.g0.i3(new s10(6, c60Var, s2Var), 150L);
        return true;
    }

    public /* synthetic */ ru(g60 g60Var, yw ywVar) {
        this.a = 8;
        this.c = g60Var;
        this.b = ywVar;
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
