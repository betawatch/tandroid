package org.telegram.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class rv implements org.telegram.ui.ActionBar.u1, org.telegram.ui.Components.hk0, ux, org.telegram.ui.Components.cu0, org.telegram.ui.Components.ik0, org.telegram.messenger.mc, OnCompleteListener, qt {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rv(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.ui.ux
    public /* synthetic */ boolean G() {
        return false;
    }

    @Override // org.telegram.ui.ux
    public /* synthetic */ boolean N(ay ayVar) {
        return false;
    }

    @Override // org.telegram.ui.Components.hk0
    public void b(float f7, float f10, int i10, View view) {
        switch (this.a) {
            case 2:
                ay.f0((ay) this.b, (zx) this.c, view, i10);
                break;
            case 3:
            default:
                NotificationsCustomSettingsActivity.Y((NotificationsCustomSettingsActivity) this.b, (Context) this.c, view, i10, f7, f10);
                break;
            case 4:
                FiltersSetupActivity.Y((FiltersSetupActivity) this.b, (Context) this.c, view, i10);
                break;
        }
    }

    @Override // org.telegram.ui.qt
    public void c(nt ntVar) {
        ll0 ll0Var = (ll0) this.b;
        int intValue = ((Integer) ((View) this.c).getTag()).intValue();
        EditTextBoldCursor editTextBoldCursor = ll0Var.Y[intValue];
        if (intValue == 5) {
            ll0Var.s = ntVar.d;
        } else {
            ll0Var.w = ntVar.d;
        }
        editTextBoldCursor.setText(ntVar.a);
    }

    @Override // org.telegram.ui.Components.cu0
    public void d(org.telegram.messenger.md mdVar) {
        LaunchActivity launchActivity = (LaunchActivity) this.b;
        int[] iArr = (int[]) this.c;
        Pattern pattern = LaunchActivity.D1;
        int i10 = mdVar.h.I1;
        iArr[0] = i10;
        launchActivity.O0(i10);
        yb0 yb0Var = new yb0(2);
        yb0Var.H0(mdVar.h);
        yb0Var.N0 = new m4.x0(iArr, org.telegram.messenger.jj.B0(mdVar.h.k), 8);
        launchActivity.t0(yb0Var);
    }

    @Override // org.telegram.ui.Components.ik0
    public boolean f(int i10, View view) {
        yb0 yb0Var = (yb0) this.b;
        Context context = (Context) this.c;
        if (yb0Var.O0 == 2) {
            Object J = yb0Var.R.J(i10);
            if (J instanceof sb0) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(context, null);
                org.telegram.ui.ActionBar.b1 b1Var = new org.telegram.ui.ActionBar.b1(0, yb0Var.getParentActivity(), yb0Var.getResourceProvider(), true, true);
                b1Var.setMinimumWidth(org.telegram.messenger.i0.L(200.0f));
                b1Var.j(org.telegram.messenger.cd.L0(2131750482, null), R.drawable.filled_directions, null);
                b1Var.setOnClickListener(new wu(16, yb0Var, (sb0) J));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(b1Var);
                rb0 rb0Var = new rb0(yb0Var, actionBarPopupWindow$ActionBarPopupWindowLayout);
                yb0Var.Q0 = rb0Var;
                rb0Var.setOutsideTouchable(true);
                yb0Var.Q0.setClippingEnabled(true);
                yb0Var.Q0.setInputMethodMode(2);
                yb0Var.Q0.setSoftInputMode(0);
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                yb0Var.Q0.showAtLocation(view, 48, 0, iArr[1] - org.telegram.messenger.i0.L(52.0f));
                yb0Var.Q0.b();
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        ConferenceCall conferenceCall;
        int i11 = this.a;
        org.telegram.ui.ActionBar.x1 x1Var2 = null;
        int i12 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i11) {
            case 1:
                org.telegram.messenger.ui mediaDataController = ((ay) obj2).getMediaDataController();
                long j10 = ((TLRPC.User) obj).id;
                for (int i13 = 0; i13 < mediaDataController.l1.size(); i13++) {
                    if (((TLRPC.TL_topPeer) mediaDataController.l1.get(i13)).peer.user_id == j10) {
                        mediaDataController.l1.remove(i13);
                        TLRPC.TL_contacts_resetTopPeerRating tL_contacts_resetTopPeerRating = new TLRPC.TL_contacts_resetTopPeerRating();
                        tL_contacts_resetTopPeerRating.category = new TLRPC.TL_topPeerCategoryBotsApp();
                        tL_contacts_resetTopPeerRating.peer = mediaDataController.getMessagesController().i1(j10);
                        mediaDataController.getConnectionsManager().sendRequest(tL_contacts_resetTopPeerRating, new ag.c3(6));
                        mediaDataController.getMessagesStorage().a.c(new org.telegram.messenger.dd(mediaDataController, j10, 2, 2));
                        mediaDataController.getNotificationCenter().k(84, new Object[0]);
                        break;
                    }
                }
                break;
            case 2:
            case 4:
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 22:
            case 24:
            case 27:
            default:
                sm0 sm0Var = (sm0) obj2;
                sm0Var.b0 = true;
                sm0Var.a0.email_unconfirmed_pattern = (String) obj;
                sm0Var.O0();
                break;
            case 3:
                org.telegram.messenger.ap apVar = (org.telegram.messenger.ap) obj;
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.id = apVar.a;
                ay ayVar = ((rx) obj2).b;
                ayVar.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, null);
                ayVar.getMessagesController().e4(apVar);
                org.telegram.messenger.hs messagesStorage = ayVar.getMessagesStorage();
                messagesStorage.a.c(new org.telegram.messenger.oi(29, messagesStorage, apVar));
                break;
            case 5:
                f10 f10Var = (f10) obj2;
                org.telegram.messenger.ap apVar2 = (org.telegram.messenger.ap) obj;
                FiltersSetupActivity filtersSetupActivity = f10Var.e;
                if (filtersSetupActivity.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.x1 x1Var3 = new org.telegram.ui.ActionBar.x1(3, filtersSetupActivity.getParentActivity(), null);
                    x1Var3.i0 = false;
                    x1Var3.show();
                    x1Var2 = x1Var3;
                }
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter2 = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter2.id = apVar2.a;
                filtersSetupActivity.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter2, new aa(f10Var, x1Var2, apVar2, 10));
                break;
            case 6:
                b50 b50Var = (b50) obj2;
                TLObject tLObject = (TLObject) obj;
                org.telegram.messenger.c cVar = b50Var.k1;
                if (b50Var.q1()) {
                    VoIPService sharedInstance = VoIPService.getSharedInstance();
                    if (sharedInstance != null && (conferenceCall = sharedInstance.conference) != null && (tLObject instanceof TLRPC.User)) {
                        TLRPC.User user = (TLRPC.User) tLObject;
                        conferenceCall.kick(user.id);
                        org.telegram.messenger.u3 u3Var = b50Var.R2;
                        long j11 = user.id;
                        ArrayList arrayList = u3Var.o;
                        if (!arrayList.contains(Long.valueOf(j11))) {
                            arrayList.add(Long.valueOf(j11));
                            u3Var.z();
                            org.telegram.messenger.zs.f(u3Var.C.a).k(org.telegram.messenger.zs.w2, Long.valueOf(u3Var.c), Long.valueOf(u3Var.b.id), Boolean.FALSE);
                        }
                        b50Var.m1().k(0L, org.telegram.messenger.zs.n1, user, null, null, null);
                        break;
                    }
                } else if (tLObject instanceof TLRPC.User) {
                    TLRPC.User user2 = (TLRPC.User) tLObject;
                    org.telegram.messenger.vp.r1(cVar.a).f0(b50Var.k1(), user2);
                    b50Var.m1().k(0L, 32, user2, null, null, null);
                    break;
                } else {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    org.telegram.messenger.vp.r1(cVar.a).g0(b50Var.k1(), null, chat, false, false);
                    b50Var.m1().k(0L, 32, chat, null, null, null);
                    break;
                }
                break;
            case 7:
                v50 v50Var = (v50) obj2;
                v50Var.y.e((TLRPC.User) obj);
                if (v50Var.f.r.length() > 0) {
                    v50Var.f.r.setText((CharSequence) null);
                    break;
                }
                break;
            case 8:
                v50 v50Var2 = (v50) obj2;
                v50Var2.getClass();
                org.telegram.ui.Cells.c2 c2Var = ((org.telegram.ui.Cells.c2[]) obj)[0];
                if (c2Var != null && c2Var.b()) {
                    i12 = 100;
                }
                v50Var2.q0(i12);
                break;
            case 10:
                LanguageSelectActivity.b0((LanguageSelectActivity) obj2, (org.telegram.messenger.zc) obj);
                break;
            case 11:
                Pattern pattern = LaunchActivity.D1;
                ((LaunchActivity) obj2).t0((hf0) obj);
                break;
            case 12:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                Pattern pattern2 = LaunchActivity.D1;
                org.telegram.messenger.cd.D0().d(((org.telegram.messenger.zc[]) obj)[0], true, false, launchActivity.O);
                launchActivity.y0(true);
                break;
            case 20:
                ((bd0) obj2).G.w1((TLRPC.TL_auth_authorization) ((TLObject) obj), false);
                break;
            case 21:
                ed0 ed0Var = (ed0) obj2;
                ed0Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putString("email_unconfirmed_pattern", ((TLRPC.TL_auth_passwordRecovery) obj).email_pattern);
                bundle.putString("password", ed0Var.r);
                bundle.putString("requestPhone", ed0Var.s);
                bundle.putString("phoneHash", ed0Var.w);
                bundle.putString("phoneCode", ed0Var.x);
                ed0Var.D.C1(7, true, bundle, false);
                break;
            case 23:
                me0.n((me0) obj2, (Context) obj);
                break;
            case 25:
                ll0 ll0Var = (ll0) obj2;
                boolean[] zArr = (boolean[]) obj;
                if (!ll0Var.v0) {
                    ll0Var.s1.clear();
                }
                ll0Var.t1.clear();
                pk0 pk0Var = (pk0) ll0Var.B1;
                pk0Var.d.m1(ll0Var.E, ll0Var.F, ll0Var.G, zArr[0], null, null, pk0Var.b);
                ll0Var.finishFragment();
                break;
            case 26:
                int[] iArr = ((ll0) obj2).y;
                iArr[2] = 0;
                iArr[1] = 0;
                iArr[0] = 0;
                ((EditTextBoldCursor) obj).setText(org.telegram.messenger.cd.L0(2131747510, null));
                break;
            case 28:
                ll0.Y((ll0) obj2, (TLRPC.TL_auth_passwordRecovery) obj);
                break;
        }
    }

    @Override // org.telegram.ui.Components.hk0
    public /* synthetic */ boolean h1(View view) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.messenger.mc
    public void o(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        Bitmap n02;
        yb0 yb0Var = (yb0) this.b;
        sb0 sb0Var = (sb0) this.c;
        if (!z10 || z11 || sb0Var.e == null || (n02 = yb0Var.n0(sb0Var)) == null) {
            return;
        }
        sb0Var.e.a.a(v7.n8.a(n02));
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        switch (this.a) {
            case 19:
                wc0 wc0Var = (wc0) this.b;
                com.google.android.gms.internal.clearcut.v0 v0Var = (com.google.android.gms.internal.clearcut.v0) this.c;
                hf0 hf0Var = wc0Var.W;
                if (hf0Var.getParentActivity() != null) {
                    hf0Var.getParentActivity().startActivityForResult(v0Var.f(), org.telegram.messenger.zs.e3);
                    break;
                }
                break;
            default:
                zd0 zd0Var = (zd0) this.b;
                com.google.android.gms.internal.clearcut.v0 v0Var2 = (com.google.android.gms.internal.clearcut.v0) this.c;
                hf0 hf0Var2 = zd0Var.E;
                if (hf0Var2.getParentActivity() != null && !hf0Var2.getParentActivity().isFinishing()) {
                    hf0Var2.getParentActivity().startActivityForResult(v0Var2.f(), org.telegram.messenger.zs.e3);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.hk0
    public /* synthetic */ void q0(View view, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.ux
    public boolean y(ay ayVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, pb1 pb1Var) {
        d70 d70Var = (d70) this.c;
        ay ayVar2 = (ay) this.b;
        org.telegram.messenger.w2 w2Var = null;
        int i12 = 0;
        while (i12 < arrayList.size()) {
            ArrayList arrayList2 = d70Var.f0;
            org.telegram.messenger.w2 w2Var2 = new org.telegram.messenger.w2(((org.telegram.messenger.gs) arrayList.get(i12)).a, 3);
            arrayList2.add(w2Var2);
            i12++;
            w2Var = w2Var2;
        }
        d70Var.d0.h(d70Var.c0, d70Var.f0);
        Bundle bundle = new Bundle();
        bundle.putInt(TeXSymbolParser.TYPE_ATTR, d70Var.c0);
        z60 z60Var = new z60(bundle, ayVar2);
        z60Var.d = d70Var.f0;
        z60Var.Y();
        d70Var.g0.presentFragment(z60Var);
        org.telegram.messenger.i0.h3(new xs(29, z60Var, w2Var), 150L);
        return true;
    }

    public /* synthetic */ rv(d70 d70Var, ay ayVar) {
        this.a = 9;
        this.c = d70Var;
        this.b = ayVar;
    }

    @Override // org.telegram.messenger.mc
    public /* synthetic */ void j(ImageReceiver imageReceiver) {
    }

    @Override // org.telegram.messenger.mc
    public /* synthetic */ void q(int i10, Drawable drawable) {
    }

    private final /* synthetic */ void a(View view, float f7, float f10) {
    }

    private final /* synthetic */ void e(View view, float f7, float f10) {
    }

    private final /* synthetic */ void g(View view, float f7, float f10) {
    }
}
